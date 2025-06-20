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

import java.net.DatagramPacket;
import java.util.Vector;

public class UdpServer1 extends AbstractUdpServer1 implements UdpPacketListener {
    protected Object _myParent;
    protected NetPlug _myNetPlug;

    public UdpServer1(Object var1, int var2, int var3) {
        super((UdpPacketListener)null, var2, var3);
        this._myParent = var1;
        this._myListener = this;
        this._myNetPlug = new NetPlug(this._myParent);
        this.start();
    }

    public UdpServer1(Object var1, int var2) {
        super((UdpPacketListener)null, var2, 1536);
        this._myParent = var1;
        this._myListener = this;
        this._myNetPlug = new NetPlug(this._myParent);
        this.start();
    }

    public UdpServer1(UdpPacketListener var1, int var2, int var3) {
        super(var1, var2, var3);
    }

    protected UdpServer1(UdpPacketListener var1, String var2, int var3, int var4) {
        super(var1, var2, var3, var4);
    }

    public void process(DatagramPacket var1, int var2) {
        this._myNetPlug.process(var1, var2);
    }

    public void addListener(NetListener var1) {
        this._myNetPlug.addListener(var1);
    }

    public void removeListener(NetListener var1) {
        this._myNetPlug.removeListener(var1);
    }

    public NetListener getListener(int var1) {
        return this._myNetPlug.getListener(var1);
    }

    public Vector getListeners() {
        return this._myNetPlug.getListeners();
    }
}
