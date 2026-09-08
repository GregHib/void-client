/* DirectDrawDisplay - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import com.ms.awt.WComponentPeer;
import com.ms.com.IUnknown;
import com.ms.directX.DDSurfaceDesc;
import com.ms.directX.DirectDraw;
import com.ms.directX.IEnumModesCallback;
import com.ms.win32.User32;

import java.awt.*;

/**
 * RENAMED from {@code Class134} (JODE-obfuscated).
 * Microsoft DirectDraw display-mode / fullscreen helper ({@link IEnumModesCallback}).
 * Used when {@link ReflectionInvoker#useDirectDraw}.
 */
final class DirectDrawDisplay implements IEnumModesCallback {
    private static int[] modeBuffer;
    private final DirectDraw directDraw = new DirectDraw();
    private static int modeBufferPos;

    /** {@link IEnumModesCallback}: append one mode into {@link #modeBuffer}. */
    public final void onEnumDisplayMode(DDSurfaceDesc ddsurfacedesc, IUnknown iunknown) {
        if (modeBuffer == null) modeBufferPos += 4;
        else {
            modeBuffer[modeBufferPos++] = ddsurfacedesc.width;
            modeBuffer[modeBufferPos++] = ddsurfacedesc.height;
            modeBuffer[modeBufferPos++] = ddsurfacedesc.rgbBitCount;
            modeBuffer[modeBufferPos++] = ddsurfacedesc.refreshRate;
        }
    }

    /** Enumerate display modes as packed [w,h,bpp,hz, …]. */
    final int[] getDisplayModesPacked(boolean bool) {
        directDraw.enumDisplayModes(0, null, null, this);
        modeBuffer = new int[modeBufferPos];
        modeBufferPos = 0;
        directDraw.enumDisplayModes(0, null, null, this);
        if (bool != true) modeBufferPos = 52;
        int[] is = modeBuffer;
        modeBuffer = null;
        modeBufferPos = 0;
        return is;
    }

    /** Enter DirectDraw fullscreen: cooperative level + display mode on {@code frame}. */
    final void enterFullscreen(int i, int i_0_, int i_1_, int i_2_, int i_3_, Frame frame) {
        frame.setVisible(true);
        WComponentPeer wcomponentpeer = (WComponentPeer) frame.getPeer();
        int i_4_ = wcomponentpeer.getHwnd();
        User32.SetWindowLong(i_4_, -16, -2147483648);
        User32.SetWindowLong(i_4_, -20, 8);
        directDraw.setCooperativeLevel((java.awt.Component) frame, 17);
        directDraw.setDisplayMode(i_1_, i, i_0_, i_3_, 0);
        frame.setBounds(0, 0, i_1_, i);
        frame.toFront();
        frame.requestFocus();
        int i_5_ = -104 / ((32 - i_2_) / 39);
    }

    /** Leave exclusive mode and reset cooperative level on {@code frame}. */
    final void restoreDisplayMode(Frame frame, int i) {
        directDraw.restoreDisplayMode();
        directDraw.setCooperativeLevel((java.awt.Component) frame, i);
    }

    public DirectDrawDisplay() {
        directDraw.initialize(null);
    }
}
