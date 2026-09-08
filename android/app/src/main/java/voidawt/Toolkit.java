package voidawt;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import voidawt.datatransfer.Clipboard;
import voidawt.image.BufferedImage;
import voidawt.image.ImageProducer;

/**
 * AWT {@code Toolkit} singleton: screen size from {@link AwtHost}, PNG decode,
 * clipboard, and a stub event queue. Enough for the client to boot without a
 * real desktop toolkit.
 */
public class Toolkit {
    private static final Toolkit INSTANCE = new Toolkit();
    private final Clipboard clipboard = new Clipboard();
    private final EventQueue eventQueue = new EventQueue();

    public static Toolkit getDefaultToolkit() {
        return INSTANCE;
    }

    public EventQueue getSystemEventQueue() {
        return eventQueue;
    }

    public Clipboard getSystemClipboard() {
        return clipboard;
    }

    public Dimension getScreenSize() {
        return new Dimension(AwtHost.GAME_WIDTH, AwtHost.GAME_HEIGHT);
    }

    public void sync() {
    }

    public Image createImage(byte[] data) {
        if (data == null) {
            throw new IllegalArgumentException("image data");
        }
        BitmapFactory.Options opts = new BitmapFactory.Options();
        opts.inPreferredConfig = Bitmap.Config.ARGB_8888;
        opts.inDither = false;
        Bitmap bitmap = BitmapFactory.decodeByteArray(data, 0, data.length, opts);
        if (bitmap == null) {
            throw new IllegalArgumentException("decode failed");
        }
        if (bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
            Bitmap converted = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            bitmap.recycle();
            bitmap = converted;
        }
        int w = bitmap.getWidth();
        int h = bitmap.getHeight();
        BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        int[] pixels = image.peekArgb();
        bitmap.getPixels(pixels, 0, w, 0, 0, w, h);
        bitmap.recycle();
        // Game sprite code treats only alpha==255 as opaque.
        for (int i = 0; i < pixels.length; i++) {
            pixels[i] |= 0xff000000;
        }
        return image;
    }

    public Image createImage(ImageProducer producer) {
        if (producer == null) {
            return new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        }
        ProducerImage image = new ProducerImage();
        producer.startProduction(image);
        return image.image != null ? image.image : new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
    }

    public Cursor createCustomCursor(Image cursor, Point hotSpot, String name) {
        return new Cursor();
    }

    public void beep() {
    }

    private static final class ProducerImage implements voidawt.image.ImageConsumer {
        BufferedImage image;

        public void setDimensions(int width, int height) {
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        }

        public void setProperties(java.util.Hashtable<?, ?> props) {
        }

        public void setColorModel(voidawt.image.ColorModel model) {
        }

        public void setHints(int hintflags) {
        }

        public void setPixels(int x, int y, int w, int h, voidawt.image.ColorModel model, byte[] pixels, int off, int scansize) {
        }

        public void setPixels(int x, int y, int w, int h, voidawt.image.ColorModel model, int[] pixels, int off, int scansize) {
            if (image == null) {
                setDimensions(x + w, y + h);
            }
            if (model == null) {
                image.setRGB(x, y, w, h, pixels, off, scansize);
                return;
            }
            int[] argb = new int[w * h];
            for (int row = 0; row < h; row++) {
                int src = off + row * scansize;
                int dst = row * w;
                for (int col = 0; col < w; col++) {
                    argb[dst + col] = model.getRGB(pixels[src + col]);
                }
            }
            image.setRGB(x, y, w, h, argb, 0, w);
        }

        public void imageComplete(int status) {
        }
    }
}
