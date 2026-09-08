package voidawt;

/**
 * AWT {@code Frame} stub. Exclusive fullscreen in the client sets
 * {@code Component225.aFrame476} to an instance of this; {@link AwtHost} reads that
 * field to pin logical size at 800×600 (or the chosen FS dims).
 */
public class Frame extends Window {
    private String title = "";

    public Frame() {
    }

    public Frame(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setResizable(boolean resizable) {
    }

    public void setUndecorated(boolean undecorated) {
    }

    public void setIconImages(java.util.List<? extends Image> icons) {
    }
}
