package voidawt;

import voidawt.event.FocusEvent;
import voidawt.event.FocusListener;
import voidawt.event.KeyEvent;
import voidawt.event.KeyListener;
import voidawt.event.MouseEvent;
import voidawt.event.MouseListener;
import voidawt.event.MouseMotionListener;
import voidawt.event.AWTEvent;
import voidawt.event.MouseWheelEvent;
import voidawt.event.MouseWheelListener;
import voidawt.image.BufferedImage;
import voidawt.image.ImageObserver;
import voidawt.image.ImageProducer;

import java.util.ArrayList;
import java.util.List;

/**
 * Minimal AWT {@code Component}: bounds, listeners, and dispatch helpers used by
 * the client for mouse/key/focus. Not a real native widget — events are injected
 * by {@link AwtHost} from the mobile touch/IME layer.
 */
public class Component implements ImageObserver {
    Container parent;
    int x;
    int y;
    int width = AwtHost.GAME_WIDTH;
    int height = AwtHost.GAME_HEIGHT;
    boolean visible = true;
    Color background = Color.black;
    Font font = new Font("Helvetica", Font.PLAIN, 12);
    Cursor cursor;
    private final List<MouseListener> mouseListeners = new ArrayList<MouseListener>();
    private final List<MouseMotionListener> mouseMotionListeners = new ArrayList<MouseMotionListener>();
    private final List<MouseWheelListener> mouseWheelListeners = new ArrayList<MouseWheelListener>();
    private final List<KeyListener> keyListeners = new ArrayList<KeyListener>();
    private final List<FocusListener> focusListeners = new ArrayList<FocusListener>();

    public void setSize(int width, int height) {
        this.width = Math.max(1, width);
        this.height = Math.max(1, height);
    }

    public void setSize(Dimension d) {
        if (d != null) {
            setSize(d.width, d.height);
        }
    }

    public Dimension getSize() {
        return new Dimension(width, height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public void setPreferredSize(Dimension d) {
        if (d != null) {
            setSize(d);
        }
    }

    public Dimension getPreferredSize() {
        return getSize();
    }

    public boolean isVisible() {
        return visible;
    }

    public void setBackground(Color color) {
        if (color != null) {
            this.background = color;
        }
    }

    public Color getBackground() {
        return background;
    }

    public void setFont(Font font) {
        if (font != null) {
            this.font = font;
        }
    }

    public Font getFont() {
        return font;
    }

    public FontMetrics getFontMetrics(Font font) {
        return new FontMetrics(font == null ? this.font : font);
    }

    public Container getParent() {
        return parent;
    }

    public Toolkit getToolkit() {
        return Toolkit.getDefaultToolkit();
    }

    public void setCursor(Cursor cursor) {
        this.cursor = cursor;
    }

    public Cursor getCursor() {
        return cursor;
    }

    public void setIgnoreRepaint(boolean ignore) {
    }

    public void setBounds(int x, int y, int width, int height) {
        setLocation(x, y);
        setSize(width, height);
    }

    public boolean isShowing() {
        return visible;
    }

    public void repaint() {
    }

    public Object getTreeLock() {
        return this;
    }

    public Object getPeer() {
        return null;
    }

    public boolean prepareImage(Image image, ImageObserver observer) {
        return true;
    }

    public boolean prepareImage(Image image, Component component) {
        return true;
    }

    public void setFocusTraversalKeysEnabled(boolean enabled) {
    }

    public void enableInputMethods(boolean enable) {
    }

    public void requestFocus() {
        AwtHost.injectFocus(true);
    }

    /** Shim no-op: focus is owned by the native AwtHost view, not the canvas. */
    public boolean isFocusOwner() {
        return false;
    }

    public boolean isFocusable() {
        return false;
    }

    public void setFocusable(boolean focusable) {
    }

    /** Shim no-op: events are injected by AwtHost; DesktopAwtMouse is dead code on mobile. */
    public void dispatchEvent(voidawt.event.AWTEvent e) {
    }

    public Graphics getGraphics() {
        return null;
    }

    public Image createImage(int w, int h) {
        return new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    }

    public Image createImage(ImageProducer producer) {
        return Toolkit.getDefaultToolkit().createImage(producer);
    }

    public void addMouseListener(MouseListener l) {
        if (l != null) {
            mouseListeners.add(l);
        }
    }

    public void removeMouseListener(MouseListener l) {
        mouseListeners.remove(l);
    }

    public void addMouseMotionListener(MouseMotionListener l) {
        if (l != null) {
            mouseMotionListeners.add(l);
        }
    }

    public void removeMouseMotionListener(MouseMotionListener l) {
        mouseMotionListeners.remove(l);
    }

    public void addMouseWheelListener(MouseWheelListener l) {
        if (l != null) {
            mouseWheelListeners.add(l);
        }
    }

    public void removeMouseWheelListener(MouseWheelListener l) {
        mouseWheelListeners.remove(l);
    }

    public void addKeyListener(KeyListener l) {
        if (l != null) {
            keyListeners.add(l);
        }
    }

    public void removeKeyListener(KeyListener l) {
        keyListeners.remove(l);
    }

    public void addFocusListener(FocusListener l) {
        if (l != null) {
            focusListeners.add(l);
        }
    }

    public void removeFocusListener(FocusListener l) {
        focusListeners.remove(l);
    }

    public void paint(Graphics g) {
    }

    public void update(Graphics g) {
        paint(g);
    }

    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        return false;
    }

    void dispatchMouse(MouseEvent e) {
        int id = e.getID();
        if (id == MouseEvent.MOUSE_MOVED || id == MouseEvent.MOUSE_DRAGGED) {
            for (MouseMotionListener l : mouseMotionListeners) {
                if (id == MouseEvent.MOUSE_DRAGGED) {
                    l.mouseDragged(e);
                } else {
                    l.mouseMoved(e);
                }
            }
            return;
        }
        for (MouseListener l : mouseListeners) {
            switch (id) {
                case MouseEvent.MOUSE_PRESSED:
                    l.mousePressed(e);
                    break;
                case MouseEvent.MOUSE_RELEASED:
                    l.mouseReleased(e);
                    break;
                case MouseEvent.MOUSE_CLICKED:
                    l.mouseClicked(e);
                    break;
                case MouseEvent.MOUSE_ENTERED:
                    l.mouseEntered(e);
                    break;
                case MouseEvent.MOUSE_EXITED:
                    l.mouseExited(e);
                    break;
                default:
                    break;
            }
        }
    }

    void dispatchWheel(MouseWheelEvent e) {
        for (MouseWheelListener l : mouseWheelListeners) {
            l.mouseWheelMoved(e);
        }
    }

    void dispatchKey(KeyEvent e) {
        for (KeyListener l : keyListeners) {
            switch (e.getID()) {
                case KeyEvent.KEY_PRESSED:
                    l.keyPressed(e);
                    break;
                case KeyEvent.KEY_RELEASED:
                    l.keyReleased(e);
                    break;
                case KeyEvent.KEY_TYPED:
                    l.keyTyped(e);
                    break;
                default:
                    break;
            }
        }
    }

    void dispatchFocus(FocusEvent e) {
        for (FocusListener l : focusListeners) {
            if (e.getID() == FocusEvent.FOCUS_GAINED) {
                l.focusGained(e);
            } else {
                l.focusLost(e);
            }
        }
    }
}
