package world.gregs.voidosrs.ios;

import org.robovm.apple.coregraphics.CGBitmapContext;
import org.robovm.apple.coregraphics.CGColorSpace;
import org.robovm.apple.coregraphics.CGImage;
import org.robovm.apple.coregraphics.CGImageAlphaInfo;
import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.uikit.UIImage;

/**
 * Pixel bridge between the Java software framebuffer ({@code int[]} ARGB) and UIKit.
 * <p>
 * {@link #toImage} is the present path ({@code AwtHost} → {@code GameView}).
 * {@link #copy} decodes PNGs for {@code voidawt.Toolkit} into the same ARGB layout
 * the 634 client expects.
 * <p>
 * Prefer {@link CGBitmapContext} over {@code NSData}+{@code CGDataProvider}: the
 * provider path races RoboVM GC on device (black frames) while Simulator still looks fine.
 */
public final class ArgbBridge {
    private ArgbBridge() {
    }

    /**
     * ARGB ints → {@link UIImage}. Zero alpha is forced opaque so the software
     * renderer’s “clear” blacks don’t punch holes through the UIImageView.
     */
    public static UIImage toImage(int[] argb, int w, int h) {
        if (argb == null || w <= 0 || h <= 0) {
            return null;
        }
        byte[] rgba = new byte[w * h * 4];
        int n = Math.min(argb.length, w * h);
        for (int i = 0; i < n; i++) {
            int p = argb[i];
            int a = (p >>> 24) & 0xff;
            if (a == 0) {
                a = 0xff;
            }
            int r = (p >> 16) & 0xff;
            int g = (p >> 8) & 0xff;
            int b = p & 0xff;
            // PremultipliedLast — same layout as {@link #copy}.
            int o = i * 4;
            rgba[o] = (byte) ((r * a) / 255);
            rgba[o + 1] = (byte) ((g * a) / 255);
            rgba[o + 2] = (byte) ((b * a) / 255);
            rgba[o + 3] = (byte) a;
        }
        CGColorSpace space = CGColorSpace.createDeviceRGB();
        CGBitmapContext ctx = CGBitmapContext.create(
                rgba, w, h, 8, w * 4L, space, CGImageAlphaInfo.PremultipliedLast);
        if (ctx == null) {
            return null;
        }
        CGImage cg = ctx.toImage();
        return cg == null ? null : new UIImage(cg);
    }

    /** {@link UIImage} / PNG decode → opaque ARGB ints for {@code Toolkit.createImage}. */
    public static void copy(UIImage image, int[] dest, int w, int h) {
        CGImage cg = image.getCGImage();
        if (cg == null || dest == null) {
            return;
        }
        byte[] rgba = new byte[w * h * 4];
        CGColorSpace space = CGColorSpace.createDeviceRGB();
        CGBitmapContext ctx = CGBitmapContext.create(rgba, w, h, 8, w * 4L, space, CGImageAlphaInfo.PremultipliedLast);
        ctx.clearRect(new CGRect(0, 0, w, h));
        ctx.drawImage(new CGRect(0, 0, w, h), cg);
        int n = Math.min(dest.length, w * h);
        for (int i = 0; i < n; i++) {
            int o = i * 4;
            int r = rgba[o] & 0xff;
            int g = rgba[o + 1] & 0xff;
            int b = rgba[o + 2] & 0xff;
            dest[i] = 0xff000000 | (r << 16) | (g << 8) | b;
        }
    }
}
