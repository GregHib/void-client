/* DirectDrawCursor - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.ms.awt.WComponentPeer;
import com.ms.dll.Callback;
import com.ms.dll.Root;
import com.ms.win32.User32;

import java.awt.*;

/**
 * Microsoft Win32 cursor callback for the DirectDraw path.
 * Mirrors {@link CursorManager} setCursorPos / setBlankCursor.
 */
final class DirectDrawCursor extends Callback {
    /** When false, force a null cursor (blank). */
    private volatile boolean cursorVisible = true;
    private volatile int trackedHwnd;
    private int arrowCursor;
    private volatile int anInt7463;
    private boolean callbackAllocated;

    /** {@link User32#SetCursorPos}. */
    final void setCursorPos(int i, byte i_0_, int i_1_) {
        if (i_0_ >= 65) User32.SetCursorPos(i, i_1_);
    }

    /** Install/remove blank cursor for {@code component}'s top HWND. */
    final void setBlankCursor(boolean bool, int i, Component component) {
        WComponentPeer wcomponentpeer = (WComponentPeer) component.getPeer();
        int i_2_ = wcomponentpeer.getTopHwnd();
        if (i_2_ != trackedHwnd || !bool == cursorVisible) {
            if (i != 13259) setBlankCursor(true, -90, null);
            if (!callbackAllocated) {
                arrowCursor = User32.LoadCursor(0, 32512);
                Root.alloc(this);
                callbackAllocated = true;
            }
            if (trackedHwnd != i_2_) {
                if (trackedHwnd != 0) {
                    cursorVisible = true;
                    User32.SendMessage(i_2_, 101024, 0, 0);
                    synchronized (this) {
                        User32.SetWindowLong(trackedHwnd, -4, anInt7463);
                    }
                }
                synchronized (this) {
                    trackedHwnd = i_2_;
                    anInt7463 = User32.SetWindowLong(trackedHwnd, -4, (Object) this);
                }
            }
            cursorVisible = bool;
            User32.SendMessage(i_2_, 101024, 0, 0);
        }
    }

    /** Win32 window proc: handle SETCURSOR / custom blank-cursor messages. */
    final synchronized int windowProc(int i, int i_3_, int i_4_, int i_5_) {
        if (i != trackedHwnd) {
            int i_6_ = User32.GetWindowLong(i, -4);
            return User32.CallWindowProc(i_6_, i, i_3_, i_4_, i_5_);
        }
        if (i_3_ == 32) {
            int i_7_ = 0xffff & i_5_;
            if (i_7_ == 1) {
                User32.SetCursor(cursorVisible ? arrowCursor : 0);
                return 0;
            }
        }
        if (i_3_ == 101024) {
            User32.SetCursor(!cursorVisible ? 0 : arrowCursor);
            return 0;
        }
        if (i_3_ == 1) {
            trackedHwnd = 0;
            cursorVisible = true;
        }
        return User32.CallWindowProc(anInt7463, i, i_3_, i_4_, i_5_);
    }
}
