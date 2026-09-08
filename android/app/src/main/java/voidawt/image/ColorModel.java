package voidawt.image;

public abstract class ColorModel {
    protected int pixel_bits;

    public ColorModel(int bits) {
        this.pixel_bits = bits;
    }

    public abstract SampleModel createCompatibleSampleModel(int w, int h);

    public int getRGB(int pixel) {
        return pixel;
    }
}
