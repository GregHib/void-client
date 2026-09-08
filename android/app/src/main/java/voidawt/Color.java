package voidawt;

public class Color {
    public static final Color black = new Color(0, 0, 0);
    public static final Color white = new Color(255, 255, 255);
    public static final Color red = new Color(255, 0, 0);

    private final int value;

    public Color(int r, int g, int b) {
        this(r, g, b, 255);
    }

    public Color(int r, int g, int b, int a) {
        this.value = ((a & 255) << 24) | ((r & 255) << 16) | ((g & 255) << 8) | (b & 255);
    }

    public Color(int rgb) {
        this.value = 0xff000000 | rgb;
    }

    public int getRGB() {
        return value;
    }

    public int getRed() {
        return (value >> 16) & 255;
    }

    public int getGreen() {
        return (value >> 8) & 255;
    }

    public int getBlue() {
        return value & 255;
    }
}
