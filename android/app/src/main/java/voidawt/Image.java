package voidawt;

import voidawt.image.ImageObserver;
import voidawt.image.ImageProducer;

public abstract class Image {
    public abstract int getWidth(ImageObserver observer);

    public abstract int getHeight(ImageObserver observer);

    public Graphics getGraphics() {
        return null;
    }

    public void flush() {
    }

    public ImageProducer getSource() {
        return null;
    }

    public abstract int[] peekArgb();
}
