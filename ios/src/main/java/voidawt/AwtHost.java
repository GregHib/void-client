package voidawt;

import org.robovm.apple.dispatch.DispatchQueue;
// DISABLED 2026-08-30 with DialogueTts — OS TTS froze the client (see DialogueTts.ENABLED).
// import org.robovm.apple.avfoundation.AVSpeechSynthesizer;
// import org.robovm.apple.avfoundation.AVSpeechUtterance;
// import org.robovm.apple.avfoundation.AVSpeechSynthesisVoice;
// import org.robovm.apple.avfoundation.AVSpeechBoundary;

import voidawt.event.FocusEvent;
import voidawt.event.KeyEvent;
import voidawt.event.MouseEvent;
import voidawt.event.MouseWheelEvent;

public final class AwtHost {
    // private static final AVSpeechSynthesizer SPEECH = new AVSpeechSynthesizer();

    /**
     * DISABLED 2026-08-30 with {@code DialogueTts.ENABLED=false}: OS TTS was freezing
     * the client (main-queue AVSpeech + per-tick chatbox scan). No-op until re-enabled.
     */
    public static void speak(final String text, final boolean female) {
        // no-op — see DialogueTts.ENABLED
        /*
        DispatchQueue.getMainQueue().async(new Runnable() {
            public void run() {
                AVSpeechUtterance utterance = new AVSpeechUtterance(text);
                AVSpeechSynthesisVoice voice = new AVSpeechSynthesisVoice("en-US");
                utterance.setVoice(voice);
                utterance.setPitchMultiplier(female ? 1.15f : 0.85f);
                SPEECH.enqueueSpeakUtterance(utterance);
            }
        });
        */
    }

    public static void stopSpeech() {
        // no-op — see DialogueTts.ENABLED
        /*
        DispatchQueue.getMainQueue().async(new Runnable() {
            public void run() {
                SPEECH.stopSpeaking(AVSpeechBoundary.Immediate);
            }
        });
        */
    }

    /** Default matches fullscreen 800x600 (client boot / display prefs). */
    public static volatile int GAME_WIDTH = 800;
    public static volatile int GAME_HEIGHT = 600;

    /**
     * Cap longest logical edge, or {@code 0} to use the native view size.
     * Native size fills the phone; a lower cap makes HUD sprites larger when stretched.
     * Ignored while the client holds an exclusive FS frame ({@code Component225.aFrame476}).
     */
    public static volatile int LOGICAL_MAX_EDGE = 0;

    public static volatile Presenter presenter;
    public static volatile Component root;
    public static volatile Canvas gameCanvas;

    public interface Presenter {
        void present(int[] argb, int width, int height);
    }

    public static void setDisplaySize(int width, int height) {
        int[] locked = fullscreenLogicalSize();
        if (locked != null) {
            width = locked[0];
            height = locked[1];
        } else {
            width = Math.max(1, width);
            height = Math.max(1, height);
            int[] logical = logicalSize(width, height);
            width = logical[0];
            height = logical[1];
        }
        GAME_WIDTH = width;
        GAME_HEIGHT = height;
        Component r = root;
        if (r != null) {
            r.setSize(width, height);
        }
        Canvas c = gameCanvas;
        if (c != null) {
            c.setSize(width, height);
        }
        GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getDefaultScreenDevice()
                .setDisplayMode(new DisplayMode(width, height, 32, 60));
        syncClientViewport(width, height);
    }

    /** Keep surface resize from expanding past exclusive FS (e.g. 800x600). */
    private static int[] fullscreenLogicalSize() {
        try {
            Object frame = Class.forName("Component225").getDeclaredField("aFrame476").get(null);
            if (frame == null) {
                return null;
            }
            int fw = Class.forName("InputHandler").getDeclaredField("canvasWidth").getInt(null);
            int fh = Class.forName("DisplayModeManagerContainer295").getDeclaredField("canvasWidth").getInt(null);
            if (fw <= 0 || fh <= 0) {
                return null;
            }
            return new int[]{fw, fh};
        } catch (Throwable ignored) {
            return null;
        }
    }

    private static void syncClientViewport(int width, int height) {
        try {
            setStaticInt("DisplayModeManagerContainer23", "canvasWidth", width);
            setStaticInt("GlToolkitSub2", "canvasHeight", height);
            setStaticInt("Component236", "canvasWidth", width);
            setStaticInt("PacketReader", "canvasHeight", height);
            setStaticInt("SocketConnector", "canvasWidth", width);
            setStaticInt("NpcNode", "canvasHeight", height);
            setStaticInt("NodeSub48", "perFrameReset", 0);
            setStaticInt("DisplayModeManagerContainer147", "perDrawReset", 0);
            // getWindowMode: true → mode 2 (resizable / FS available)
            setStaticBoolean("Cp1252Decoder", "fullscreenAvailable", true);
        } catch (Throwable ignored) {
        }
    }

    private static void setStaticInt(String className, String field, int value) throws Exception {
        java.lang.reflect.Field f = Class.forName(className).getDeclaredField(field);
        f.setAccessible(true);
        f.setInt(null, value);
    }

    private static void setStaticBoolean(String className, String field, boolean value) throws Exception {
        java.lang.reflect.Field f = Class.forName(className).getDeclaredField(field);
        f.setAccessible(true);
        f.setBoolean(null, value);
    }

    public static int[] logicalSize(int surfaceW, int surfaceH) {
        surfaceW = Math.max(1, surfaceW);
        surfaceH = Math.max(1, surfaceH);
        int maxEdge = LOGICAL_MAX_EDGE;
        if (maxEdge <= 0) {
            return new int[]{surfaceW, surfaceH};
        }
        int longEdge = Math.max(surfaceW, surfaceH);
        if (longEdge <= maxEdge) {
            return new int[]{surfaceW, surfaceH};
        }
        float s = maxEdge / (float) longEdge;
        return new int[]{
                Math.max(1, Math.round(surfaceW * s)),
                Math.max(1, Math.round(surfaceH * s))
        };
    }

    public static void setRoot(Component component) {
        root = component;
        if (component != null) {
            component.setSize(GAME_WIDTH, GAME_HEIGHT);
        }
    }

    public static void onGameCanvas(Canvas canvas) {
        gameCanvas = canvas;
        if (canvas != null) {
            canvas.setSize(GAME_WIDTH, GAME_HEIGHT);
        }
    }

    public static void present(int[] pixels, int width, int height) {
        Presenter p = presenter;
        if (p == null || pixels == null || width <= 0 || height <= 0) {
            return;
        }
        final int[] copy = java.util.Arrays.copyOf(pixels, width * height);
        final int fw = width;
        final int fh = height;
        DispatchQueue.getMainQueue().async(new Runnable() {
            public void run() {
                p.present(copy, fw, fh);
            }
        });
    }

    public static void injectRightClick(int x, int y) {
        injectMouse(MouseEvent.MOUSE_MOVED, x, y, 0, 0);
        injectMouse(MouseEvent.MOUSE_PRESSED, x, y, MouseEvent.BUTTON3, 1);
        injectMouse(MouseEvent.MOUSE_RELEASED, x, y, MouseEvent.BUTTON3, 1);
        injectMouse(MouseEvent.MOUSE_CLICKED, x, y, MouseEvent.BUTTON3, 1);
    }

    public static void injectLeftClick(int x, int y) {
        injectMouse(MouseEvent.MOUSE_MOVED, x, y, 0, 0);
        injectMouse(MouseEvent.MOUSE_PRESSED, x, y, MouseEvent.BUTTON1, 1);
        injectMouse(MouseEvent.MOUSE_RELEASED, x, y, MouseEvent.BUTTON1, 1);
        injectMouse(MouseEvent.MOUSE_CLICKED, x, y, MouseEvent.BUTTON1, 1);
    }

    public static void injectMouse(int id, int x, int y, int button, int clickCount) {
        Component target = gameCanvas != null ? gameCanvas : root;
        if (target == null) {
            return;
        }
        int modifiers = 0;
        if (button == 1) {
            modifiers = 16; // BUTTON1_MASK
        } else if (button == 2) {
            modifiers = 8; // BUTTON2_MASK
        } else if (button == 3) {
            modifiers = 4; // BUTTON3_MASK / META_MASK
        }
        MouseEvent e = new MouseEvent(target, id, System.currentTimeMillis(), modifiers, x, y, clickCount, button == 3, button);
        if (id == MouseEvent.MOUSE_WHEEL) {
            return;
        }
        target.dispatchMouse(e);
    }

    public static void injectWheel(int x, int y, int rotation) {
        Component target = gameCanvas != null ? gameCanvas : root;
        if (target == null) {
            return;
        }
        MouseWheelEvent e = new MouseWheelEvent(target, MouseEvent.MOUSE_WHEEL, System.currentTimeMillis(), 0, x, y, 0, false, rotation);
        target.dispatchWheel(e);
    }

    /**
     * Tell the client a DualShock / Xbox / MFi pad is connected so menus show
     * {@code Learn alias} rows ({@code JoystickAlias.padConnected}).
     */
    public static void setPadConnected(boolean connected) {
        try {
            setStaticBoolean("JoystickAlias", "padConnected", connected);
        } catch (Throwable ignored) {
        }
    }

    /**
     * Forward a pad button press into {@code JoystickAlias.onPadButton} for
     * learn-mode binding or firing a saved Eat/Drink/Prayer/Summon alias.
     * <p>
     * D-pad Learn uses Android {@code KEYCODE_DPAD_*} ids (19–22). iOS
     * {@code GCExtendedGamepad.getDpad()} already delivers discrete presses —
     * no hat-axis translation (Android DualShock needs {@code AXIS_HAT_*} →
     * {@code MainActivity.updateHatDpad}).
     *
     * @param buttonId Android {@code KeyEvent.KEYCODE_*} (BUTTON_* or DPAD_*; shared ids)
     * @param label    chat-friendly ASCII name (Up, L1, Square, …)
     * @return true when the client consumed the press
     */
    public static boolean notifyPadButton(int buttonId, String label) {
        try {
            java.lang.reflect.Method m = Class.forName("JoystickAlias")
                    .getDeclaredMethod("onPadButton", int.class, String.class);
            m.setAccessible(true);
            Object hit = m.invoke(null, Integer.valueOf(buttonId), label);
            return hit instanceof Boolean && ((Boolean) hit).booleanValue();
        } catch (Throwable t) {
            System.out.println("void-osrs notifyPadButton failed: " + t);
            return false;
        }
    }

    /**
     * Orbit camera by view-pixel deltas (two-finger pan / gamepad right stick).
     * Writes {@code Component112.cameraYaw} / {@code DisplayModeManagerContainer154.cameraPitch}
     * then clamps via {@code DisplayModeManagerContainer199.clampCameraAngles}.
     * Positive dx = look right; positive dy = look down.
     */
    public static void injectCameraOrbit(float dx, float dy) {
        if (dx == 0f && dy == 0f) {
            return;
        }
        try {
            float yawScale = 8f;
            float pitchScale = 4f;
            Class<?> yawCl = Class.forName("Component112");
            java.lang.reflect.Field yawF = yawCl.getDeclaredField("cameraYaw");
            yawF.setAccessible(true);
            yawF.setFloat(null, yawF.getFloat(null) + dx * yawScale);

            Class<?> pitchCl = Class.forName("DisplayModeManagerContainer154");
            java.lang.reflect.Field pitchF = pitchCl.getDeclaredField("cameraPitch");
            pitchF.setAccessible(true);
            pitchF.setFloat(null, pitchF.getFloat(null) + dy * pitchScale);

            Class.forName("DisplayModeManagerContainer199")
                    .getDeclaredMethod("clampCameraAngles", int.class)
                    .invoke(null, 262144);
        } catch (Throwable ignored) {
        }
    }

    public static void injectKey(int id, int keyCode, char keyChar) {
        Component target = gameCanvas != null ? gameCanvas : root;
        if (target == null) {
            return;
        }
        KeyEvent e = new KeyEvent(target, id, System.currentTimeMillis(), 0, keyCode, keyChar);
        target.dispatchKey(e);
    }

    /** Toggle developer console (same as desktop ` key). Used by 4-finger tap on mobile. */
    public static void injectDevConsoleToggle() {
        injectKey(KeyEvent.KEY_PRESSED, '`', '`');
        injectKey(KeyEvent.KEY_TYPED, 0, '`');
        injectKey(KeyEvent.KEY_RELEASED, '`', '`');
    }

    /** {@code StringCache.devConsoleOpen} — developer console visible. */
    public static boolean isDevConsoleOpen() {
        try {
            java.lang.reflect.Field f = Class.forName("StringCache").getDeclaredField("devConsoleOpen");
            f.setAccessible(true);
            return f.getBoolean(null);
        } catch (Throwable ignored) {
            return false;
        }
    }

    /**
     * {@code BuildInfo.isConsolePromptTap} — tap on the {@code -->} strip (not history).
     * History taps must not dismiss the IME or the inset→0 race lets the click fall through.
     */
    public static boolean isConsolePromptTap(int canvasX, int canvasY) {
        try {
            java.lang.reflect.Method m = Class.forName("BuildInfo")
                    .getDeclaredMethod("isConsolePromptTap", int.class, int.class);
            m.setAccessible(true);
            Object r = m.invoke(null, Integer.valueOf(canvasX), Integer.valueOf(canvasY));
            return Boolean.TRUE.equals(r);
        } catch (Throwable ignored) {
            return false;
        }
    }

    /**
     * Open/close developer console without injecting {@code `} (avoids console text / IME races).
     * Mirrors {@code Component192.openDevConsole} / {@code AbstractShaderSub4.closeDevConsole}.
     */
    public static void setDevConsoleOpen(boolean open) {
        try {
            if (open) {
                Class.forName("Component192")
                        .getDeclaredMethod("openDevConsole", int.class)
                        .invoke(null, -84);
            } else {
                Class.forName("AbstractShaderSub4")
                        .getDeclaredMethod("closeDevConsole", byte.class)
                        .invoke(null, (byte) -89);
            }
        } catch (Throwable t) {
            injectDevConsoleToggle();
        }
    }

    public static void toggleDevConsole() {
        setDevConsoleOpen(!isDevConsoleOpen());
    }

    public interface SoftKeyboardListener {
        void showSoftKeyboard(String reason);
        void hideSoftKeyboard(String reason);
        void toggleSoftKeyboard(String reason);
        void syncSoftKeyboardToDevConsole();
    }

    public static volatile SoftKeyboardListener softKeyboardListener;
    /** Soft-keyboard overlap in view pixels (0 = hidden). Does not resize the canvas. */
    public static volatile int KEYBOARD_INSET_PX;
    public static volatile int VIEW_HEIGHT_PX = 1;
    /** True while the host soft keyboard is up (for tap-outside dismiss). */
    public static volatile boolean SOFT_KEYBOARD_OPEN;

    public static void setKeyboardInset(int insetPx, int viewHeightPx) {
        KEYBOARD_INSET_PX = Math.max(0, insetPx);
        VIEW_HEIGHT_PX = Math.max(1, viewHeightPx);
        try {
            Class.forName("MobileKeyboard")
                    .getDeclaredMethod("setInset", int.class, int.class)
                    .invoke(null, Integer.valueOf(KEYBOARD_INSET_PX), Integer.valueOf(VIEW_HEIGHT_PX));
        } catch (Throwable ignored) {
        }
    }

    public static void requestSoftKeyboard(String reason) {
        SoftKeyboardListener l = softKeyboardListener;
        if (l != null) {
            l.showSoftKeyboard(reason);
        }
    }

    public static void requestHideSoftKeyboard(String reason) {
        SoftKeyboardListener l = softKeyboardListener;
        if (l != null) {
            l.hideSoftKeyboard(reason);
        }
    }

    public static void requestToggleSoftKeyboard(String reason) {
        SoftKeyboardListener l = softKeyboardListener;
        if (l != null) {
            l.toggleSoftKeyboard(reason);
        }
    }

    public static void requestSyncSoftKeyboardToDevConsole() {
        SoftKeyboardListener l = softKeyboardListener;
        if (l != null) {
            l.syncSoftKeyboardToDevConsole();
        }
    }

    public static void injectFocus(boolean gained) {
        Component target = gameCanvas != null ? gameCanvas : root;
        if (target == null) {
            return;
        }
        FocusEvent e = new FocusEvent(target, gained ? FocusEvent.FOCUS_GAINED : FocusEvent.FOCUS_LOST);
        target.dispatchFocus(e);
    }
}
