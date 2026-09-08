package jagtheora.theora;

import jagtheora.misc.SimplePeer;

public final class TheoraInfo extends SimplePeer {

    public int frameWidth;

    public int picX;

    public int pixelFormat;

    public int picHeight;

    public int frameHeight;

    public int fpsDenominator;

    public int picY;

    public byte versionSubMinor;

    public int fpsNumerator;

    public int aspectDenominator;

    public int colourSpace;

    public byte versionMinor;

    public byte versionMajor;

    public int picWidth;

    public int aspectNumerator;

    static {
        initFields();
    }

    public static void initFields() {}

    public TheoraInfo() {
        this.init();
        if (this.b()) {
            throw new IllegalStateException();
        }
    }

    protected void init() {}

    protected void clear() {}
}
