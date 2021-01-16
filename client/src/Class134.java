/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

import com.ms.awt.WComponentPeer;
import com.ms.com.IUnknown;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;

final class Class134 implements IEnumModesCallback
{
    private static int[] anIntArray4606;
    private DirectDraw aDirectDraw4607 = new DirectDraw();
    private static int anInt4608;
    
    public final void method1144(DDSurfaceDesc ddsurfacedesc,
				 IUnknown iunknown) {
	if (anIntArray4606 == null)
	    anInt4608 += 4;
	else {
	    anIntArray4606[anInt4608++] = ddsurfacedesc.width;
	    anIntArray4606[anInt4608++] = ddsurfacedesc.height;
	    anIntArray4606[anInt4608++] = ddsurfacedesc.rgbBitCount;
	    anIntArray4606[anInt4608++] = ddsurfacedesc.refreshRate;
	}
    }
    
    final int[] method1145(boolean bool) {
	aDirectDraw4607.enumDisplayModes(0, null, null, this);
	anIntArray4606 = new int[anInt4608];
	anInt4608 = 0;
	aDirectDraw4607.enumDisplayModes(0, null, null, this);
	if (bool != true)
	    anInt4608 = 52;
	int[] is = anIntArray4606;
	anIntArray4606 = null;
	anInt4608 = 0;
	return is;
    }
    
    final void method1146(int i, int i_0_, int i_1_, int i_2_, int i_3_,
			  Frame frame) {
	frame.setVisible(true);
	WComponentPeer wcomponentpeer = (WComponentPeer) frame.getPeer();
	int i_4_ = wcomponentpeer.getHwnd();
	User32.SetWindowLong(i_4_, -16, -2147483648);
	User32.SetWindowLong(i_4_, -20, 8);
	aDirectDraw4607.setCooperativeLevel((java.awt.Component) frame, 17);
	aDirectDraw4607.setDisplayMode(i_1_, i, i_0_, i_3_, 0);
	frame.setBounds(0, 0, i_1_, i);
	frame.toFront();
	frame.requestFocus();
	int i_5_ = -104 / ((32 - i_2_) / 39);
    }
    
    final void method1147(Frame frame, int i) {
	aDirectDraw4607.restoreDisplayMode();
	aDirectDraw4607.setCooperativeLevel((java.awt.Component) frame, i);
    }
    
    public Class134() {
	aDirectDraw4607.initialize(null);
    }
}
