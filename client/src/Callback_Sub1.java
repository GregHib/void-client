/* Callback_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;

final class Callback_Sub1 extends Callback
{
    private volatile boolean aBoolean7460 = true;
    private volatile int anInt7461;
    private int anInt7462;
    private volatile int anInt7463;
    private boolean aBoolean7464;
    
    final void method3621(int i, byte i_0_, int i_1_) {
	if (i_0_ >= 65)
	    User32.SetCursorPos(i, i_1_);
    }
    
    final void method3622(boolean bool, int i, Component component) {
	WComponentPeer wcomponentpeer = (WComponentPeer) component.getPeer();
	int i_2_ = wcomponentpeer.getTopHwnd();
	if ((anInt7461 ^ 0xffffffff) != (i_2_ ^ 0xffffffff)
	    || !bool == aBoolean7460) {
	    if (i != 13259)
		method3622(true, -90, null);
	    if (!aBoolean7464) {
		anInt7462 = User32.LoadCursor(0, 32512);
		Root.alloc(this);
		aBoolean7464 = true;
	    }
	    if ((i_2_ ^ 0xffffffff) != (anInt7461 ^ 0xffffffff)) {
		if (anInt7461 != 0) {
		    aBoolean7460 = true;
		    User32.SendMessage(i_2_, 101024, 0, 0);
		    synchronized (this) {
			User32.SetWindowLong(anInt7461, -4, anInt7463);
		    }
		}
		synchronized (this) {
		    anInt7461 = i_2_;
		    anInt7463
			= User32.SetWindowLong(anInt7461, -4, (Object) this);
		}
	    }
	    aBoolean7460 = bool;
	    User32.SendMessage(i_2_, 101024, 0, 0);
	}
    }
    
    final synchronized int method3623(int i, int i_3_, int i_4_, int i_5_) {
	if (i != anInt7461) {
	    int i_6_ = User32.GetWindowLong(i, -4);
	    return User32.CallWindowProc(i_6_, i, i_3_, i_4_, i_5_);
	}
	if (i_3_ == 32) {
	    int i_7_ = 0xffff & i_5_;
	    if (i_7_ == 1) {
		User32.SetCursor(aBoolean7460 ? anInt7462 : 0);
		return 0;
	    }
	}
	if (i_3_ == 101024) {
	    User32.SetCursor(!aBoolean7460 ? 0 : anInt7462);
	    return 0;
	}
	if ((i_3_ ^ 0xffffffff) == -2) {
	    anInt7461 = 0;
	    aBoolean7460 = true;
	}
	return User32.CallWindowProc(anInt7463, i, i_3_, i_4_, i_5_);
    }
}
