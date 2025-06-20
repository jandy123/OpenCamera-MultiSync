package net.sourceforge.opencamera.multisync.remotecontrol;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattServerCallback;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

import java.util.Arrays;
import java.util.HashSet;

import static net.sourceforge.opencamera.multisync.remotecontrol.Constants.BODY_SENSOR_LOCATION_CHARACTERISTIC_UUID;
import static net.sourceforge.opencamera.multisync.remotecontrol.Constants.HEART_RATE_SERVICE_UUID;
import static net.sourceforge.opencamera.multisync.remotecontrol.Constants.KRAKEN_SENSORS_CHARACTERISTIC_UUID;
import static net.sourceforge.opencamera.multisync.remotecontrol.Constants.SERVER_MSG_FIRST_STATE;
import static net.sourceforge.opencamera.multisync.remotecontrol.Constants.SERVER_MSG_SECOND_STATE;

import net.sourceforge.opencamera.multisync.MyDebug;


/**
 This activity represents the Peripheral/Server role.
 Bluetooth communication flow:
    1. advertise [peripheral]
    2. scan [central]
    3. connect [central]
    4. notify [peripheral]
    5. receive [central]
 */
public class PeripheralRoleService extends Service {

    private final static String TAG = "PeripheralRole service";
    private BluetoothGattService mSampleService;
    private BluetoothGattCharacteristic mSampleCharacteristic;
    private BluetoothGattCharacteristic mKrakenCharacteristic;

    private BluetoothManager mBluetoothManager;
    private BluetoothGattServer mGattServer;
    private HashSet<BluetoothDevice> mBluetoothDevices;

    public class LocalBinder extends Binder {
        public PeripheralRoleService getService() {
            return PeripheralRoleService.this;
        }
    }

    private final IBinder mBinder = new LocalBinder();

    @Override
    public IBinder onBind(Intent intent) {
        if( MyDebug.LOG )
            Log.d(TAG, "Starting PeripheralRoleActivity service");
        return mBinder;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        //close(); //LUK:???
        return super.onUnbind(intent);
    }

    private void close() {
        //LUK: enough???
        stopAdvertising();
    }

    public boolean initialize() {
        setGattServer();
        setBluetoothService();

        return true;
    }

    public void sendValue(int val)
    {
        if(!mBluetoothDevices.isEmpty()) {
            setCharacteristic(val);
            notifyCharacteristicChanged();
        }
    }

    public void sendFloat(float value) {
        if(!mBluetoothDevices.isEmpty()) {
            setKrakenCharacteristic(value);
            notifyCharacteristicChanged();
        }
     }

    public void sendIsoTime(int iso, long time) {
        if(!mBluetoothDevices.isEmpty()) {
            setIsoTimeCharacteristic(iso, time);
            notifyCharacteristicChanged();
        }
    }

    public void sendFocusRegion(float x, float y) {
         if(!mBluetoothDevices.isEmpty()) {
             setFocusRegion(x, y);
             notifyCharacteristicChanged();
         }
    }

    public void sendServerTime(long time) {
        if(!mBluetoothDevices.isEmpty()) {
            setServerTimeCharacteristic(time);
            notifyCharacteristicChanged();
        }
    }

    public void sendShutdown() {
        if(!mBluetoothDevices.isEmpty()) {
            setCharacteristic(22);
            notifyCharacteristicChanged();
        }
    }

    public void sendZoom(int value) {
        if(!mBluetoothDevices.isEmpty()) {
            setZoomCharacteristicValue(value);
            notifyCharacteristicChanged();
        }
    }

    public boolean isBleServerConnected() {
        return !mBluetoothDevices.isEmpty();
    }


    /**
     * Starts BLE Advertising by starting {@code PeripheralAdvertiseService}.
     */
    public void startAdvertising() {
        // TODO bluetooth - maybe bindService? what happens when closing app?
        startService(getServiceIntent(this));
    }


    /**
     * Stops BLE Advertising by stopping {@code PeripheralAdvertiseService}.
     */
    private void stopAdvertising() {
        stopService(getServiceIntent(this));
    }

    private void setGattServer() {

        mBluetoothDevices = new HashSet<>();
        mBluetoothManager = (BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE);

        if (mBluetoothManager != null) {
            mGattServer = mBluetoothManager.openGattServer(this, mGattServerCallback);
        } else {
            Log.e(TAG, "Unknown error");
        }
    }

    private void setBluetoothService() {

        // create the Service
        mSampleService = new BluetoothGattService(HEART_RATE_SERVICE_UUID, BluetoothGattService.SERVICE_TYPE_PRIMARY);

        /*
        create the Characteristic.
        we need to grant to the Client permission to read (for when the user clicks the "Request Characteristic" button).
        no need for notify permission as this is an action the Server initiate.
         */
        mSampleCharacteristic = new BluetoothGattCharacteristic(BODY_SENSOR_LOCATION_CHARACTERISTIC_UUID, BluetoothGattCharacteristic.PROPERTY_NOTIFY | BluetoothGattCharacteristic.PROPERTY_READ, BluetoothGattCharacteristic.PERMISSION_READ);
        mKrakenCharacteristic = new BluetoothGattCharacteristic(KRAKEN_SENSORS_CHARACTERISTIC_UUID, BluetoothGattCharacteristic.PROPERTY_NOTIFY | BluetoothGattCharacteristic.PROPERTY_READ, BluetoothGattCharacteristic.PERMISSION_READ);

        setCharacteristic(-1); // set initial state
        setKrakenCharacteristic(-1.0f);

        // add the Characteristic to the Service
        mSampleService.addCharacteristic(mSampleCharacteristic);
        mSampleService.addCharacteristic(mKrakenCharacteristic);

        // add the Service to the Server/Peripheral
        if (mGattServer != null) {
            mGattServer.addService(mSampleService);
        }
    }

    /*
    update the value of Characteristic.
    the client will receive the Characteristic value when:
        1. the Client user clicks the "Request Characteristic" button
        2. teh Server user clicks the "Notify Client" button

    value - can be between 0-255 according to:
    https://www.bluetooth.com/specifications/gatt/viewer?attributeXmlFile=org.bluetooth.characteristic.body_sensor_location.xml
     */
    private void setCharacteristic(int value) {
        /*
        done each time the user changes a value of a Characteristic
         */
        mSampleCharacteristic.setValue(getValue(value));
    }

    private void setZoomCharacteristicValue(int value) {
        int intBits =  value;
        byte[] fbytes = new byte[] { BluetoothLeService.COMMAND_ZOOM, (byte) (intBits >> 24), (byte) (intBits >> 16), (byte) (intBits >> 8), (byte) (intBits) };
        mSampleCharacteristic.setValue(fbytes);
    }

    private void setKrakenCharacteristic(float value) {
        /*
        done each time the user changes a value of a Characteristic
         */

        int intBits =  Float.floatToIntBits(value);
        byte[] fbytes = new byte[] { 4, (byte) (intBits >> 24), (byte) (intBits >> 16), (byte) (intBits >> 8), (byte) (intBits) };
        mSampleCharacteristic.setValue(fbytes);
    }

    private void setFocusRegion(float x, float y) {
        int intBitsx =  Float.floatToIntBits(x);
        int intBitsy =  Float.floatToIntBits(y);

        byte[] fbytes = new byte[] { BluetoothLeService.COMMAND_FOCUS, (byte) (intBitsx >> 24), (byte) (intBitsx >> 16), (byte) (intBitsx >> 8), (byte) (intBitsx),
                (byte) (intBitsy >> 24), (byte) (intBitsy >> 16), (byte) (intBitsy >> 8), (byte) (intBitsy)
        };
        mSampleCharacteristic.setValue(fbytes);
    }

    private void setIsoTimeCharacteristic(int iso, long time) {
        /*
        done each time the user changes a value of a Characteristic
         */

        int intBits =  iso;
        long intBits1 =  time;

        byte[] fbytes = new byte[] { 2, (byte) (intBits >> 24), (byte) (intBits >> 16), (byte) (intBits >> 8), (byte) (intBits),
                                         (byte) (intBits1 >> 56), (byte) (intBits1 >> 48), (byte) (intBits1 >> 40), (byte) (intBits1 >> 32),
                                         (byte) (intBits1 >> 24), (byte) (intBits1 >> 16), (byte) (intBits1 >> 8), (byte) (intBits1) };
        mSampleCharacteristic.setValue(fbytes);
    }

   private void setServerTimeCharacteristic(long time) {
        /*
        done each time the user changes a value of a Characteristic
         */

        long intBits1 =  time;

        byte[] fbytes = new byte[] { 10, (byte) (intBits1 >> 56), (byte) (intBits1 >> 48), (byte) (intBits1 >> 40), (byte) (intBits1 >> 32),
                                         (byte) (intBits1 >> 24), (byte) (intBits1 >> 16), (byte) (intBits1 >> 8), (byte) (intBits1) };
        mSampleCharacteristic.setValue(fbytes);
    }

    private byte[] getValue(int value) {
        return new byte[]{(byte) value};
    }

    /*
    send to the client the value of the Characteristic,
    as the user requested to notify.
     */
    private void notifyCharacteristicChanged() {
        /*
        done when the user clicks the notify button in the app.
        indicate - true for indication (acknowledge) and false for notification (un-acknowledge).
         */
        boolean indicate = (mSampleCharacteristic.getProperties() & BluetoothGattCharacteristic.PROPERTY_INDICATE) == BluetoothGattCharacteristic.PROPERTY_INDICATE;

        for (BluetoothDevice device : mBluetoothDevices) {
            if (mGattServer != null) {
                mGattServer.notifyCharacteristicChanged(device, mSampleCharacteristic, indicate);
            }
        }
    }

    /*
    send to the client the value of the Characteristic,
    as the user requested to notify.
     */
    private void notifyKrakenCharacteristicChanged() {
        /*
        done when the user clicks the notify button in the app.
        indicate - true for indication (acknowledge) and false for notification (un-acknowledge).
         */
        boolean indicate = (mKrakenCharacteristic.getProperties() & BluetoothGattCharacteristic.PROPERTY_INDICATE) == BluetoothGattCharacteristic.PROPERTY_INDICATE;

        for (BluetoothDevice device : mBluetoothDevices) {
            if (mGattServer != null) {
                mGattServer.notifyCharacteristicChanged(device, mKrakenCharacteristic, indicate);
            }
        }
    }

    /**
     * Returns Intent addressed to the {@code PeripheralAdvertiseService} class.
     */
    private Intent getServiceIntent(Context context) {
        return new Intent(context, PeripheralAdvertiseService.class);
    }


    private final BluetoothGattServerCallback mGattServerCallback = new BluetoothGattServerCallback() {

        @Override
        public void onConnectionStateChange(BluetoothDevice device, final int status, int newState) {

            super.onConnectionStateChange(device, status, newState);

            String msg;

            if (status == BluetoothGatt.GATT_SUCCESS) {

                if (newState == BluetoothGatt.STATE_CONNECTED) {

                    mBluetoothDevices.add(device);

                    msg = "Connected to device: " + device.getAddress();
                    Log.d(TAG, msg);

                    //LUK: added!
                    BluetoothDevice mDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(device.getAddress());
                    mGattServer.connect(mDevice, true);
                    //end LUK:

                } else if (newState == BluetoothGatt.STATE_DISCONNECTED) {

                    mBluetoothDevices.remove(device);

                    msg = "Disconnected from device";
                    Log.d(TAG, msg);
                }

            } else {
                mBluetoothDevices.remove(device);
                Log.e(TAG, "Error when connecting");
            }
        }


        @Override
        public void onNotificationSent(BluetoothDevice device, int status) {
            super.onNotificationSent(device, status);
            Log.d(TAG, "Notification sent. Status: " + status);
        }


        @Override
        public void onCharacteristicReadRequest(BluetoothDevice device, int requestId, int offset, BluetoothGattCharacteristic characteristic) {

            super.onCharacteristicReadRequest(device, requestId, offset, characteristic);

            if (mGattServer == null) {
                return;
            }

            Log.d(TAG, "Device tried to read characteristic: " + characteristic.getUuid());
            Log.d(TAG, "Value: " + Arrays.toString(characteristic.getValue()));

            mGattServer.sendResponse(device, requestId, BluetoothGatt.GATT_SUCCESS, offset, characteristic.getValue());
        }


        @Override
        public void onCharacteristicWriteRequest(BluetoothDevice device, int requestId, BluetoothGattCharacteristic characteristic, boolean preparedWrite, boolean responseNeeded, int offset, byte[] value) {

            super.onCharacteristicWriteRequest(device, requestId, characteristic, preparedWrite, responseNeeded, offset, value);

            Log.d(TAG, "Characteristic Write request: " + Arrays.toString(value));

            mSampleCharacteristic.setValue(value);

            if (responseNeeded) {
                mGattServer.sendResponse(device, requestId, BluetoothGatt.GATT_SUCCESS, 0, value);
            }

        }

        @Override
        public void onDescriptorReadRequest(BluetoothDevice device, int requestId, int offset, BluetoothGattDescriptor descriptor) {

            super.onDescriptorReadRequest(device, requestId, offset, descriptor);

            if (mGattServer == null) {
                return;
            }

            Log.d(TAG, "Device tried to read descriptor: " + descriptor.getUuid());
            Log.d(TAG, "Value: " + Arrays.toString(descriptor.getValue()));

            mGattServer.sendResponse(device, requestId, BluetoothGatt.GATT_SUCCESS, offset, descriptor.getValue());
        }

        @Override
        public void onDescriptorWriteRequest(BluetoothDevice device, int requestId,
                                             BluetoothGattDescriptor descriptor, boolean preparedWrite, boolean responseNeeded,
                                             int offset,
                                             byte[] value) {

            super.onDescriptorWriteRequest(device, requestId, descriptor, preparedWrite, responseNeeded, offset, value);

            Log.d(TAG, "Descriptor Write Request " + descriptor.getUuid() + " " + Arrays.toString(value));

//            int status = BluetoothGatt.GATT_SUCCESS;
//            if (descriptor.getUuid() == CLIENT_CHARACTERISTIC_CONFIGURATION_UUID) {
//                BluetoothGattCharacteristic characteristic = descriptor.getCharacteristic();
//                boolean supportsNotifications = (characteristic.getProperties() &
//                        BluetoothGattCharacteristic.PROPERTY_NOTIFY) != 0;
//                boolean supportsIndications = (characteristic.getProperties() &
//                        BluetoothGattCharacteristic.PROPERTY_INDICATE) != 0;
//
//                if (!(supportsNotifications || supportsIndications)) {
//                    status = BluetoothGatt.GATT_REQUEST_NOT_SUPPORTED;
//                } else if (value.length != 2) {
//                    status = BluetoothGatt.GATT_INVALID_ATTRIBUTE_LENGTH;
//                } else if (Arrays.equals(value, BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)) {
//                    status = BluetoothGatt.GATT_SUCCESS;
//                    mCurrentServiceFragment.notificationsDisabled(characteristic);
//                    descriptor.setValue(value);
//                } else if (supportsNotifications &&
//                        Arrays.equals(value, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE)) {
//                    status = BluetoothGatt.GATT_SUCCESS;
//                    mCurrentServiceFragment.notificationsEnabled(characteristic, false /* indicate */);
//                    descriptor.setValue(value);
//                } else if (supportsIndications &&
//                        Arrays.equals(value, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE)) {
//                    status = BluetoothGatt.GATT_SUCCESS;
//                    mCurrentServiceFragment.notificationsEnabled(characteristic, true /* indicate */);
//                    descriptor.setValue(value);
//                } else {
//                    status = BluetoothGatt.GATT_REQUEST_NOT_SUPPORTED;
//                }
//            } else {
//                status = BluetoothGatt.GATT_SUCCESS;
//                descriptor.setValue(value);
//            }
//            if (responseNeeded) {
//                mGattServer.sendResponse(device, requestId, status,
//            /* No need to respond with offset */ 0,
//            /* No need to respond with a value */ null);
//            }

        }
    };


}
