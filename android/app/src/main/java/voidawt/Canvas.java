package voidawt;

import voidawt.image.BufferedImage;
import voidawt.image.ImageObserver;

/**
 * AWT {@code Canvas} shim: owns the software back-buffer and pushes pixels to
 * {@link AwtHost#present} after each blit ({@link #drawBackbuffer}).
 */
public class Canvas extends Component {
    private BufferedImage buffer;

    public Graphics getGraphics() {
        ensureBuffer();
        return new Graphics(buffer, true);
    }

    public Image createImage(int w, int h) {
        return new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    }

    private void ensureBuffer() {
        if (buffer == null || buffer.getWidth() != width || buffer.getHeight() != height) {
            buffer = new BufferedImage(Math.max(1, width), Math.max(1, height), BufferedImage.TYPE_INT_ARGB);
        }
    }

    public boolean drawBackbuffer(Image img, int x, int y, ImageObserver observer) {
        ensureBuffer();
        boolean ok = buffer.getGraphics().drawImage(img, x, y, observer);
        AwtHost.present(buffer.peekArgb(), buffer.getWidth(), buffer.getHeight());
        return ok;
    }
}
