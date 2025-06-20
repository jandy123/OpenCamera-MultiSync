### Synchronized OpenCamera-based multiple-remote photo shooting

**OpenCamera MultiSync is an Android application for shooting time-synchronized photos with multiple (identical) mobile phones based on OpenCamera.** The app has been tested on two stereo rigs based on 2x Huawei P20 pro and 2x Huawei Note 8 devices. 

OpenCamera MultiSync is an extended [Open Camera](https://play.google.com/store/apps/details?id=net.sourceforge.opencamera) which allows time-synchronized photo shooting. It supports a number of synchronization approaches based on both BLE and WiFi, see below. Although the app can be run on different phones, the best synchronization results are achieved with identical phone models, settings, firmwares, CPU loads, etc. The app implements a simple client-server model, in which a server phone passes various messages to (potentially multiple) client phone(s). The app is mainly intended to be used with two identical phones in a stereo rig configuration, in which the main user interaction is performed via the server-side UI. That is, things like focus location, exposure settings, zoom value, shutter request, etc., are then forwarded via Bluetooth LE to the client phones, so that user interaction is minimized.

Since the quality of mobile phone cameras has improved dramatically, I mainly use my "mobile" Huawei P20 pro stereo rig and seldomly my Canon M10 [SDM](http://sdm.camera/)-based one. Since I'm quite happy with the results of my "mobile" rig, I decided to share this project and make it available to others to experiment, improve the current app and discover other successful setups.

The current app was developed on top of Multi Remote Camera, an extended version of an older version (1.46.9) of OpenCamera. The current app uses the following projects:
* [Open Camera](https://play.google.com/store/apps/details?id=net.sourceforge.opencamera) by Mark Harman.
* [Multi Remote Camera](https://sourceforge.net/projects/multi-remote-camera/) by Andy Modla.
* [Libsoftwaresync](https://github.com/google-research/libsoftwaresync) by Ansari et al.
* [NanoHTTPD](https://github.com/NanoHttpd/nanohttpd)
* Google Zxing.
* See additional packages on the Open Camera](https://play.google.com/store/apps/details?id=net.sourceforge.opencamera) website.

##### Here you can download the [APK](https://drive.google.com/file/d/1y5k26VtvZo0iWgPKFRRUJqh9WQc-T4dJ/view?usp=drive_link)

#### Setup
In what follows, I assume that two (identical) phones are used.

##### General steps:
1. Install the app on both master and client phones.
2. Pair phones via Bluetooth; both on the server and client. 
3. In the app settings, enable "Use Camera2 API".
4. Disable auto flash and select the focus locked (lock icon) option in the shooting settings.
3. In the app settings, set standard photo settings such as camera resolution, image quality, etc.
4. Also, in the app settings, in the "Camera Preview" section, consider option "Show a crop guide" to 9:16 if using both phones in portrait mode and if you want to crop the images to a 16:9 format for, e.g., playing on a 16:9 TV in SBS format. This will help with photo composition, although cropping has to be manually performed.
5. Only on the client, set exposure to manual, since exposure settings, zoom, focus region, etc. will be forwarded by the server to the client, so as to minimize interaction with the client phone. 

The settings affecting synchronization can be found under "More camera controls... -> Bluetooth LE remote control..." in the app settings.

##### Settings on the server phone under "Bluetooth LE remote control...":

1. Enable "Enable Bluetooth LE server" to designate this phone as the server.
2. Enable "Send Exposure values to client" to pass exposure settings, zoom, etc. to the client.
3. Click "Select sync type" and select for now "Simple sync". This is the simplest (but also the worst) synchronization setting.
4. Exit the app.

Leave all other settings to their defaults.

##### Settings on the client phone under "Bluetooth LE remote control...":

1. Enable "Enable Bluetooth LE remote control".
2. Click "Select sync type" and select for now "Simple sync". 
3. Click "Select remote device" then "SCAN" and select the server phone from the list of discovered Bluetooth devices.
4. Exit the app.

Leave all other settings to their defaults.

Make sure Bluetooth is enabled on both phones. Start the Open Camera MultiSync app first on the master device and immediately on the client device. When the phones establish connection via Bluetooth, a new icon ![My-intro](remote.png?raw=true) will be shown in the top-left region of the OSD menu, assuming the phones are in portrait orientation. Verify that exposure values, focus and zoom are forwarded from the server to the client, by e.g., moving the phones around. The exposure values should change on the client so as to match those on the server.

"Simple sync" as a synchronization method may be only used for static objects. Better sync options are: BLE, NTP and Phase sync which are accessible under the  "Bluetooth LE remote control... -> Select sync type", see below.

#### Synchronization methods
Unfortunately, the Android camera system was not developed to allow synchronized photo shooting across devices; even synchronized shooting with multiple cameras on the same device is problematic. In particular the system works in asynchronous mode, and there is no way to either i) predict the precise time when the sensor readout happens, or ii) block/delay it. The only functionality provided, to support this, is notifications regarding the exact time when the actual capture started, finished, etc. 

Anyhow, the following sync options are available, listed from the worst to the best. 

#### Simple sync
In this mode, the server sends the client a shutter request over BLE and delays taking the capture for x milliseconds; x can be set on the server under "Estimated BLE latency option". Then, the server continues and takes the shot. The client waits at most 2 seconds to receive the shutter request from the server. When it receives it, it proceeds to take the shot. Obviously, since this approach relies on a one-sided latency estimate, the sync quality is quite poor.  

#### BLE sync
This is an improvement to the above, in that an actual estimate of the BLE transfer time is performed on the client, so as to match the server.

#### NTP sync
This approach synchronizes both server and client to a reference time provided by an "NTP server". The "NTP server" can be conveniently implemented by an esp8266 serving over Wi-Fi a time reference to both server and client phones. Thus, both phones should be connected over Wi-Fi to the esp8266 access point. Option "NTP server" should be set to the IP address of the esp8266 access point/NTP server. Then, both phones estimate the communication latency with the esp8266 and time offset between their local time and the reference time. Finally, they both translate their local time in the reference time base and delay taking the photo for a set time interval, after which the photo is taken by both server and client phones.

With this approach, under-millisecond shooting time differences (accuracy) are consistently obtained. Unfortunately, even if the shooting time is the same (e.g., within one millisecond), the shutter lag (time since the shooting request is performed to when the capture started) still varies on both phones. To minimize shutter lag, best is to freeze unnecessary apps, overclock, enable high-performance mode, etc. On my Huawei P20 pro rig, in normal shooting conditions, with the phones in "high-performance mode", 8 out 10 photos are synchronized within 3ms accuracy. Finally, it is also possible to get feedback on the sync quality of the shots. To update the NTP offset on each phone, press the icon ![My-intro](remote.png?raw=true) on the server phone. This will automatically trigger a renewal on both server and remote phones. Latencies of 1 ms should be within reach using the esp8266 as access point/NTP server. 

TODO: upload esp8266 firmware and/or sources. 

#### Phase sync
This approach should consistently result in under-millisecond accuracy, provided proper settings can be found and maintained for each device of the stereo rig. This is based on [Libsoftwaresync](https://github.com/google-research/libsoftwaresync) by Ansari et al.

To use this approach perform the following settings on the phones:
* Start a Wi-Fi access point on the server phone and connect to it on the client phone.
* Start the app on the server and select "Phase sync" as the sync method. This will cause the app to restart. Do the same on the client phone. When connection is established, a message that a new client is connected should be visible on the server OSD.
* Press the new icon visible on the server in the lower part of the OSD to initialize the phase sync method. Pay attention to the "Phase Error" visible on the OSD on both phones. When the phase error is smaller than, e.g., 1 ms, you can start shooting on the server phone.

If the phase error is never smaller than 1 ms, you need to find proper settings for your phones. Once good settings have been identified, create new settings files under "OpenCamera-MultiSync/app/src/main/res/raw" in the source code tree, make sure that the app uses those and recompile and reinstall the app. Please see [Libsoftwaresync](https://github.com/google-research/libsoftwaresync) for additional info regarding the method description.

Although this approach may perform quite good, stability seems to be an issue, i.e., the phones start in good sync, but the error gradually increases. The only way to combat this is to reinitialize the phase sync approach by tapping the corresponding icon on the OSD of the server phone. 

#### Final thoughts
It would be great if people try the app and report their findings, to help identifying working stereo rigs, non-working ones, etc. I expect that many older premium phones to perform quite well, but I'm curious about your findings.

Regarding improvements, I do not think it is possible to do much better qua sync accuracy, given the current limitations of the Android Camera2 API. It would be great if the code would be ported to the latest version of OpenCamera, but since its code base dramatically changed starting with version 2.x.x, this will be a lot of work, which I cannot currently afford. Hopefully, some of you could be of help here!
