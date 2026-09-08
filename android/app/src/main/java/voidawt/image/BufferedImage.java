package voidawt.image;

import voidawt.Graphics;
import voidawt.Image;

import java.util.Hashtable;

public class BufferedImage extends Image {
    public static final int TYPE_INT_RGB = 1;
    public static final int TYPE_INT_ARGB = 2;

    private final int width;
    private final int height;
    private final int[] data;
    private Graphics graphics;

    public BufferedImage(int width, int height, int type) {
        this.width = width;
        this.height = height;
        this.data = new int[Math.max(1, width * height)];
    }

    public BufferedImage(ColorModel cm, WritableRaster raster, boolean isRasterPremultiplied, Hashtable<?, ?> properties) {
        this.width = raster.getWidth();
        this.height = raster.getHeight();
        DataBuffer buffer = raster.getDataBuffer();
        if (buffer instanceof DataBufferInt) {
            this.data = ((DataBufferInt) buffer).getData();
        } else {
            this.data = new int[width * height];
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth(ImageObserver observer) {
        return width;
    }

    public int getHeight(ImageObserver observer) {
        return height;
    }

    public Graphics getGraphics() {
        if (graphics == null) {
            graphics = new Graphics(this);
        }
        return graphics;
    }

    public void setRGB(int startX, int startY, int w, int h, int[] rgbArray, int offset, int scansize) {
        for (int row = 0; row < h; row++) {
            int dy = startY + row;
            if (dy < 0 || dy >= height) {
                continue;
            }
            System.arraycopy(rgbArray, offset + row * scansize, data, dy * width + startX, Math.min(w, width - startX));
        }
    }

    public int[] peekArgb() {
        return data;
    }
}
