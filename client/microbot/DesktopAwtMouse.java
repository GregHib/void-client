import java.awt.Canvas;
import java.awt.EventQueue;
import java.awt.event.MouseEvent;

/**
 * Desktop VirtualMouse backend — synthesizes AWT mouse events on the game canvas.
 * Temporarily clears focusable when the canvas is not the focus owner so Jagex
 * MOUSE_PRESSED handlers do not steal OS keyboard focus (Microbot upstream trick).
 * Events are posted to the EDT so pad/bot threads stay thread-safe with AWT.
 */
final class DesktopAwtMouse implements MicrobotMouseBackend {

    DesktopAwtMouse() {
    }

    private Canvas canvas() {
        return DisplayModeManagerContainer50.gameCanvas;
    }

    public void mouseMoved(int x, int y) {
        dispatch(MouseEvent.MOUSE_MOVED, x, y, 0, 0);
    }

    public void mousePressed(int x, int y, int button) {
        dispatch(MouseEvent.MOUSE_PRESSED, x, y, button, 1);
    }

    public void mouseReleased(int x, int y, int button) {
        dispatch(MouseEvent.MOUSE_RELEASED, x, y, button, 1);
    }

    public void mouseClicked(int x, int y, int button) {
        dispatch(MouseEvent.MOUSE_CLICKED, x, y, button, 1);
    }

    public int canvasWidth() {
        Canvas c = canvas();
        return c != null ? c.getWidth() : 765;
    }

    public int canvasHeight() {
        Canvas c = canvas();
        return c != null ? c.getHeight() : 503;
    }

    private void dispatch(int id, int x, int y, int button, int clickCount) {
        Canvas canvas = canvas();
        if (canvas == null) {
            return;
        }
        int modifiers = 0;
        if (button == MouseEvent.BUTTON1) {
            modifiers = MouseEvent.BUTTON1_DOWN_MASK;
        } else if (button == MouseEvent.BUTTON3) {
            modifiers = MouseEvent.BUTTON3_DOWN_MASK | MouseEvent.META_DOWN_MASK;
        }
        final MouseEvent event = new MouseEvent(canvas, id, System.currentTimeMillis(), modifiers, x, y, clickCount,
                button == MouseEvent.BUTTON3, button);
        if (EventQueue.isDispatchThread()) {
            dispatchWithoutFocusGrab(canvas, event);
        } else {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    dispatchWithoutFocusGrab(canvas, event);
                }
            });
        }
    }

    private static void dispatchWithoutFocusGrab(Canvas canvas, MouseEvent event) {
        boolean canvasIsFocused = canvas.isFocusOwner();
        boolean wasFocusable = canvas.isFocusable();
        try {
            if (!canvasIsFocused && wasFocusable) {
                canvas.setFocusable(false);
            }
            canvas.dispatchEvent(event);
        } finally {
            if (!canvasIsFocused && wasFocusable) {
                canvas.setFocusable(true);
            }
        }
    }
}
