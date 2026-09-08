package voidswing;

import voidawt.Image;
import voidawt.Toolkit;

import java.net.URL;

public class ImageIcon {
    private Image image;

    public ImageIcon(URL url) {
        if (url != null) {
            try {
                java.io.InputStream in = url.openStream();
                byte[] data = readAll(in);
                image = Toolkit.getDefaultToolkit().createImage(data);
            } catch (Exception ignored) {
            }
        }
    }

    public Image getImage() {
        return image;
    }

    private static byte[] readAll(java.io.InputStream in) throws java.io.IOException {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        byte[] buf = new byte[4096];
        int n;
        while ((n = in.read(buf)) >= 0) {
            out.write(buf, 0, n);
        }
        in.close();
        return out.toByteArray();
    }
}
