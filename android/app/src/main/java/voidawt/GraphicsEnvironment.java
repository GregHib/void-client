package voidawt;

/** Singleton graphics environment exposing the one {@link GraphicsDevice}. */
public class GraphicsEnvironment {
    private static final GraphicsEnvironment INSTANCE = new GraphicsEnvironment();
    private final GraphicsDevice device = new GraphicsDevice();

    public static GraphicsEnvironment getLocalGraphicsEnvironment() {
        return INSTANCE;
    }

    public GraphicsDevice getDefaultScreenDevice() {
        return device;
    }

    public GraphicsDevice[] getScreenDevices() {
        return new GraphicsDevice[]{device};
    }

    public boolean isHeadlessInstance() {
        return false;
    }

    public static boolean isHeadless() {
        return false;
    }
}
