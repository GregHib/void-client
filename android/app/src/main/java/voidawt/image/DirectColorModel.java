package voidawt.image;

public class DirectColorModel extends ColorModel {
    private final int rmask;
    private final int gmask;
    private final int bmask;
    private final int amask;
    private final int rshift;
    private final int gshift;
    private final int bshift;
    private final int ashift;

    public DirectColorModel(int bits, int rmask, int gmask, int bmask) {
        this(bits, rmask, gmask, bmask, 0);
    }

    public DirectColorModel(int bits, int rmask, int gmask, int bmask, int amask) {
        super(bits);
        this.rmask = rmask;
        this.gmask = gmask;
        this.bmask = bmask;
        this.amask = amask;
        this.rshift = shift(rmask);
        this.gshift = shift(gmask);
        this.bshift = shift(bmask);
        this.ashift = shift(amask);
    }

    private static int shift(int mask) {
        if (mask == 0) {
            return 0;
        }
        int s = 0;
        while ((mask & 1) == 0) {
            mask >>>= 1;
            s++;
        }
        return s;
    }

    private static int scale(int value, int mask, int shift) {
        if (mask == 0) {
            return 0;
        }
        int bits = Integer.bitCount(mask);
        int v = (value & mask) >>> shift;
        if (bits == 8) {
            return v;
        }
        return bits == 0 ? 0 : (v * 255) / ((1 << bits) - 1);
    }

    public int getRGB(int pixel) {
        int r = scale(pixel, rmask, rshift);
        int g = scale(pixel, gmask, gshift);
        int b = scale(pixel, bmask, bshift);
        int a = amask == 0 ? 255 : scale(pixel, amask, ashift);
        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    public SampleModel createCompatibleSampleModel(int w, int h) {
        return new SampleModel(w, h);
    }
}
