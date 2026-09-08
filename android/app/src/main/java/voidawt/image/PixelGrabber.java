package voidawt.image;

import voidawt.Image;

public class PixelGrabber {
    private final Image image;
    private final int x;
    private final int y;
    private final int w;
    private final int h;
    private final int[] pix;
    private final int off;
    private final int scansize;

    public PixelGrabber(Image image, int x, int y, int w, int h, int[] pix, int off, int scansize) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.pix = pix;
        this.off = off;
        this.scansize = scansize;
    }

    public boolean grabPixels() throws InterruptedException {
        int[] src = image.peekArgb();
        int iw = image.getWidth(null);
        int ih = image.getHeight(null);
        if (src == null || iw <= 0) {
            return false;
        }
        for (int row = 0; row < h; row++) {
            int sy = y + row;
            if (sy < 0 || sy >= ih) {
                continue;
            }
            for (int col = 0; col < w; col++) {
                int sx = x + col;
                if (sx < 0 || sx >= iw) {
                    continue;
                }
                pix[off + row * scansize + col] = src[sy * iw + sx];
            }
        }
        return true;
    }
}
