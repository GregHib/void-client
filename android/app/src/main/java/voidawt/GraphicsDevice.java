package voidawt;

/**
 * Fake screen device. Reports {@link AwtHost} logical size as the current
 * {@link DisplayMode}; exclusive fullscreen is supported in name only so the
 * client can construct its FS frame without crashing.
 */
public class GraphicsDevice {
    private boolean valid = true;
    private DisplayMode mode = new DisplayMode(AwtHost.GAME_WIDTH, AwtHost.GAME_HEIGHT, 32, 60);

    public boolean isFullScreenSupported() {
        // Keep DisplayModeManager constructable; exclusive FS is faked/no-op on Android.
        return true;
    }

    public DisplayMode getDisplayMode() {
        DisplayMode current = mode;
        if (current.getWidth() != AwtHost.GAME_WIDTH || current.getHeight() != AwtHost.GAME_HEIGHT) {
            mode = new DisplayMode(AwtHost.GAME_WIDTH, AwtHost.GAME_HEIGHT, 32, 60);
        }
        return mode;
    }

    public void setDisplayMode(DisplayMode dm) {
        if (dm != null) {
            mode = dm;
        }
    }

    public DisplayMode[] getDisplayModes() {
        int w = Math.max(800, AwtHost.GAME_WIDTH);
        int h = Math.max(600, AwtHost.GAME_HEIGHT);
        int[][] sizes = {
                {800, 600}, {1024, 768}, {1280, 720}, {1280, 1024},
                {1366, 768}, {1600, 900}, {1920, 1080},
                {AwtHost.GAME_WIDTH, AwtHost.GAME_HEIGHT}, {w, h}
        };
        DisplayMode[] modes = new DisplayMode[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            modes[i] = new DisplayMode(sizes[i][0], sizes[i][1], 32, 60);
        }
        return modes;
    }

    public void setFullScreenWindow(Window w) {
    }

    public Window getFullScreenWindow() {
        return null;
    }
}
