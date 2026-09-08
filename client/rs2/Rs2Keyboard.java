import java.awt.Canvas;
import java.awt.event.KeyEvent;
import java.lang.reflect.Method;

/**
 * Synthetic keyboard — desktop dispatches {@link KeyEvent} on the canvas;
 * mobile reflects {@code voidawt.AwtHost.injectKey}.
 */
final class Rs2Keyboard {

    private Rs2Keyboard() {
    }

    static void typeString(String text) {
        if (text == null) {
            return;
        }
        for (int i = 0; i < text.length(); i++) {
            keyType(text.charAt(i));
            MicrobotGlobal.sleep(30 + (int) (Math.random() * 40));
        }
    }

    static void keyPress(int keyCode) {
        dispatch(KeyEvent.KEY_PRESSED, keyCode, (char) KeyEvent.CHAR_UNDEFINED);
        dispatch(KeyEvent.KEY_RELEASED, keyCode, (char) KeyEvent.CHAR_UNDEFINED);
    }

    static void keyType(char ch) {
        int code = Character.toUpperCase(ch);
        dispatch(KeyEvent.KEY_PRESSED, code, ch);
        dispatch(KeyEvent.KEY_TYPED, code, ch);
        dispatch(KeyEvent.KEY_RELEASED, code, ch);
    }

    private static void dispatch(int id, int keyCode, char ch) {
        if (tryMobileInject(id, keyCode, ch)) {
            return;
        }
        Canvas canvas = DisplayModeManagerContainer50.gameCanvas;
        if (canvas == null) {
            return;
        }
        KeyEvent e = new KeyEvent(canvas, id, System.currentTimeMillis(), 0, keyCode, ch);
        canvas.dispatchEvent(e);
    }

    private static boolean tryMobileInject(int id, int keyCode, char ch) {
        try {
            Class c = Class.forName("voidawt.AwtHost");
            Method m = c.getMethod("injectKey", int.class, int.class, char.class);
            m.invoke(null, Integer.valueOf(id), Integer.valueOf(keyCode), Character.valueOf(ch));
            return true;
        } catch (Throwable t) {
            return false;
        }
    }
}
