package voidawt;

/** AWT {@code Window} stub — pack/toFront/dispose are no-ops on mobile. */
public class Window extends Container {
    public void pack() {
    }

    public void toFront() {
    }

    public void dispose() {
    }

    public void addWindowListener(voidawt.event.WindowListener l) {
    }

    public void removeWindowListener(voidawt.event.WindowListener l) {
    }

    public Insets getInsets() {
        return new Insets(0, 0, 0, 0);
    }
}
