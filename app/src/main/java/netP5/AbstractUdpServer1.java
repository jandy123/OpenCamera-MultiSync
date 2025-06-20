/**
 * A network library for processing which supports UDP, TCP and Multicast.
 *
 * (c) 2004-2011
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 *
 * @author		Andreas Schlegel http://www.sojamo.de/libraries/oscP5
 * @modified	12/19/2011
 * @version		0.9.8
 */

// Modified by Andy Modla
// see original source at http://www.sojamo.de/libraries/oscP5/ for code comments

package netP5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public abstract class AbstractUdpServer1 implements Runnable {
    private volatile DatagramSocket _myDatagramSocket = null;  // Andy Modla add volatile to override library class
    protected UdpPacketListener _myListener;
    private Thread _myThread = null;
    private int _myPort;
    private String _myAddress;
    private InetAddress _myInetAddress;
    protected int _myDatagramSize = 1536;
    private boolean isRunning = true;
    private boolean isSocket = false;

    public AbstractUdpServer1(UdpPacketListener var1, int var2, int var3) {
        this._myDatagramSize = var3;
        this._myPort = var2;
        this._myListener = var1;
        if (this._myListener != null) {
            this.start();
        }

    }

    protected AbstractUdpServer1(UdpPacketListener var1, String var2, int var3, int var4) {
        this._myDatagramSize = var4;
        this._myAddress = var2;
        this._myPort = var3;
        this._myListener = var1;
        if (this._myListener != null) {
            this.start();
        }

    }

    public DatagramSocket socket() {
        return this._myDatagramSocket;
    }

    public void start() {
        this._myThread = null;
        this._myDatagramSocket = null;
        this._myThread = new Thread(this);

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException var3) {
            Logger.printError("UdpServer.start()", "oscServer sleep interruption " + var3);
        }

        try {
            this._myDatagramSocket = new DatagramSocket(this._myPort);
            this._myInetAddress = InetAddress.getByName(this._myAddress);
            Logger.printProcess("UdpServer.start()", "new Unicast DatagramSocket created @ port " + this._myPort);
        } catch (IOException var2) {
            Logger.printError("UdpServer.start()", " IOException, couldnt create new DatagramSocket @ port " + this._myPort + " " + var2);
        }

        if (this._myDatagramSocket != null) {
            this._myThread.start();
            this.isRunning = this._myThread.isAlive();
            this.isSocket = true;
        } else {
            this.isRunning = false;
        }

    }

    public void run() {
        if (this._myDatagramSocket == null) {
            Logger.printError("UdpServer.run()", "Socket is null. closing UdpServer.");
        } else {
            if (this.isRunning) {
                Logger.printProcess("UdpServer.run()", "UdpServer is running @ " + this._myPort);
            }

            while(this.isRunning) {
                try {
                    byte[] var1 = new byte[this._myDatagramSize];
                    DatagramPacket var2 = new DatagramPacket(var1, this._myDatagramSize);
                    this._myDatagramSocket.receive(var2);
                    this._myListener.process(var2, this._myPort);
                } catch (IOException var3) {
                    Logger.printProcess("UdpServer.run()", " socket closed.");
                    break;
                } catch (ArrayIndexOutOfBoundsException var4) {
                    Logger.printError("UdpServer.run()", "ArrayIndexOutOfBoundsException:  " + var4);
                }
            }

            this.dispose();
        }
    }

    public void dispose() {
        this._myThread = null;
        if (this._myDatagramSocket != null) {
            if (this._myDatagramSocket.isConnected()) {
                Logger.printDebug("UdpServer.dispose()", "disconnect()");
                this._myDatagramSocket.disconnect();
            }

            Logger.printDebug("UdpServer.dispose()", "close()");
            this._myDatagramSocket.close();
            this._myDatagramSocket = null;
            Logger.printDebug("UdpServer.dispose()", "Closing unicast datagram socket.");
        }

    }

    public void stop() {
        this.isRunning = false;
    }

    public void send(byte[] var1) {
        if (this.isSocket) {
            this.send(var1, this._myInetAddress, this._myPort);
        } else {
            Logger.printWarning("UdpClient.send", "no InetAddress and port has been set. Packet has not been sent.");
        }

    }

    public void send(byte[] var1, String var2, int var3) {
        try {
            InetAddress var4 = InetAddress.getByName(var2);
            this.send(var1, var4, var3);
        } catch (UnknownHostException var5) {
            Logger.printError("UdpClient.send", "while sending to " + var2 + " " + var5);
        }

    }

    public void send(DatagramPacket var1) {
        if (this.isSocket) {
            try {
                this._myDatagramSocket.send(var1);
            } catch (IOException var3) {
                Logger.printError("UdpClient.send", "ioexception while sending packet.");
            }
        }

    }

    public void send(byte[] var1, InetAddress var2, int var3) {
        if (this.isSocket) {
            try {
                DatagramPacket var4 = new DatagramPacket(var1, var1.length, var2, var3);
                this.send(var4);
            } catch (NullPointerException var5) {
                Logger.printError("UdpServer.send", "a nullpointer exception occured." + var5);
            }
        } else {
            Logger.printWarning("UdpServer.send", "DatagramSocket is not running. Packet has not been sent.");
        }

    }
}
