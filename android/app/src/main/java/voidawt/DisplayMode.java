package voidawt;

public class DisplayMode {
    public static final int BIT_DEPTH_MULTI = -1;
    public static final int REFRESH_RATE_UNKNOWN = 0;

    private final int width;
    private final int height;
    private final int bitDepth;
    private final int refreshRate;

    public DisplayMode(int width, int height, int bitDepth, int refreshRate) {
        this.width = width;
        this.height = height;
        this.bitDepth = bitDepth;
        this.refreshRate = refreshRate;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getBitDepth() {
        return bitDepth;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DisplayMode)) {
            return false;
        }
        DisplayMode other = (DisplayMode) obj;
        return width == other.width && height == other.height && bitDepth == other.bitDepth && refreshRate == other.refreshRate;
    }
}
