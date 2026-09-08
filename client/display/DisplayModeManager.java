/* DisplayModeManager - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/**
 * RENAMED from `Class7` (JODE-obfuscated).
 * Fullscreen/display-mode manager. Holds a GraphicsDevice; setDisplayMode(Frame,int,int,int,int) enumerates and applies DisplayMode/setDisplayMode for resolution switching.
 */

import java.awt.*;
import java.lang.reflect.Field;

public final class DisplayModeManager {
    private GraphicsDevice graphicsDevice;
    private DisplayMode previousDisplayMode;

    public final void setDisplayMode(Frame frame, int i, int i_0_, int i_1_, int i_2_) {
        previousDisplayMode = graphicsDevice.getDisplayMode();
        if (previousDisplayMode == null) throw new NullPointerException();
        frame.setUndecorated(true);
        frame.enableInputMethods(false);
        setFullscreenFrame(frame, (byte) 51);
        if (0 == i_2_) {
            int i_3_ = previousDisplayMode.getRefreshRate();
            DisplayMode[] displaymodes = graphicsDevice.getDisplayModes();
            boolean bool = false;
            for (int i_4_ = 0; i_4_ < displaymodes.length; i_4_++) {
                if (i == displaymodes[i_4_].getWidth() && i_0_ == displaymodes[i_4_].getHeight() && displaymodes[i_4_].getBitDepth() == i_1_) {
                    int i_5_ = displaymodes[i_4_].getRefreshRate();
                    if (!bool || Math.abs(-i_3_ + i_5_) < Math.abs(i_2_ + -i_3_)) {
                        bool = true;
                        i_2_ = i_5_;
                    }
                }
            }
            if (!bool) i_2_ = i_3_;
        }
        graphicsDevice.setDisplayMode(new DisplayMode(i, i_0_, i_1_, i_2_));
    }

    public final int[] getDisplayModesPacked() {
        DisplayMode[] displaymodes = graphicsDevice.getDisplayModes();
        int[] is = new int[displaymodes.length << 2];
        for (int i = 0; i < displaymodes.length; i++) {
            is[i << 2] = displaymodes[i].getWidth();
            is[1 + (i << 2)] = displaymodes[i].getHeight();
            is[(i << 2) + 2] = displaymodes[i].getBitDepth();
            is[(i << 2) + 3] = displaymodes[i].getRefreshRate();
        }
        return is;
    }

    public final void restoreDisplayMode() {
        if (previousDisplayMode != null) {
            graphicsDevice.setDisplayMode(previousDisplayMode);
            if (!graphicsDevice.getDisplayMode().equals(previousDisplayMode)) throw new RuntimeException("Did not return to correct resolution!");
            previousDisplayMode = null;
        }
        setFullscreenFrame(null, (byte) 104);
    }

    public DisplayModeManager() throws Exception {
        GraphicsEnvironment graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        graphicsDevice = graphicsenvironment.getDefaultScreenDevice();
        if (!graphicsDevice.isFullScreenSupported()) {
            GraphicsDevice[] graphicsdevices = graphicsenvironment.getScreenDevices();
            GraphicsDevice[] graphicsdevices_6_ = graphicsdevices;
            for (int i = 0; graphicsdevices_6_.length > i; i++) {
                GraphicsDevice graphicsdevice = graphicsdevices_6_[i];
                if (null != graphicsdevice && graphicsdevice.isFullScreenSupported()) {
                    graphicsDevice = graphicsdevice;
                    return;
                }
            }
            throw new Exception();
        }
    }

    private final void setFullscreenFrame(Frame frame, byte i) {
        boolean bool = false;
        if (i <= 47) setFullscreenFrame(null, (byte) -25);
        try {
            Field field = GraphicsDevice.class.getDeclaredField("valid");
            field.setAccessible(true);
            boolean bool_7_ = ((Boolean) field.get(graphicsDevice)).booleanValue();
            if (bool_7_) {
                field.set(graphicsDevice, Boolean.FALSE);
                bool = true;
            }
        } catch (Throwable throwable) {
            if (Loader.trace) {
                throwable.printStackTrace();
            }
            /* empty */
        }
        try {
            graphicsDevice.setFullScreenWindow(frame);
        } catch (Throwable object) {
            if (bool) {
                try {
                    Field field = GraphicsDevice.class.getDeclaredField("valid");
                    field.set(graphicsDevice, Boolean.TRUE);
                } catch (Exception e) {
                    if (Loader.trace) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (bool) {
            try {
                Field field = GraphicsDevice.class.getDeclaredField("valid");
                field.set(graphicsDevice, Boolean.TRUE);
            } catch (Throwable throwable) {
                if (Loader.trace) {
                    throwable.printStackTrace();
                }
                /* empty */
            }
        }
    }
}
