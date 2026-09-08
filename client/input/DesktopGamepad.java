import java.awt.Canvas;
import java.awt.Component;
import java.awt.Point;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Desktop DualShock / Xbox / Switch pad → same virtual-mouse + {@link JoystickAlias}
 * path as Android {@code MainActivity} / iOS {@code GameView}.
 * <p>
 * Polls SDL gamepads via Jamepad (reflection — keeps mobile compile free of the
 * dependency). Started from {@link Loader#main}; no-ops on mobile hosts that already
 * own the pad ({@code voidawt.AwtHost}).
 * <p>
 * Button ids are Android {@code KeyEvent.KEYCODE_*} (including {@code KEYCODE_DPAD_*}
 * 19–22) so aliases saved on phone work on desktop and vice versa. SDL/Jamepad
 * already surfaces hat D-pad as {@code dpad*JustPressed}; Android must map
 * {@code AXIS_HAT_*} itself (see {@code MainActivity.updateHatDpad}).
 * <p>
 * Unlike mobile (which blits a software cursor), desktop moves the real OS pointer
 * with {@link Robot} so Jagex custom AWT cursors stay visible at the pad position.
 */
final class DesktopGamepad {

    // Android KeyEvent.KEYCODE_* (shared with JoystickAlias / mobile hosts).
    private static final int KEYCODE_DPAD_UP = 19;
    private static final int KEYCODE_DPAD_DOWN = 20;
    private static final int KEYCODE_DPAD_LEFT = 21;
    private static final int KEYCODE_DPAD_RIGHT = 22;
    private static final int KEYCODE_BUTTON_A = 96; // ✕
    private static final int KEYCODE_BUTTON_B = 97; // ○
    private static final int KEYCODE_BUTTON_X = 99; // □
    private static final int KEYCODE_BUTTON_Y = 100; // △
    private static final int KEYCODE_BUTTON_L1 = 102;
    private static final int KEYCODE_BUTTON_R1 = 103;
    private static final int KEYCODE_BUTTON_THUMBL = 106;
    private static final int KEYCODE_BUTTON_THUMBR = 107;
    private static final int KEYCODE_BUTTON_START = 108; // Options
    private static final int KEYCODE_BUTTON_SELECT = 109; // Share

    private static final float PAD_DEADZONE = 0.15f;
    private static final float PAD_CURSOR_SPEED = 14f;
    private static final float PAD_ORBIT_SCALE = 10f;
    private static final float PAD_TRIGGER_THRESHOLD = 0.35f;
    private static final long PAD_ZOOM_INTERVAL_MS = 90L;
    private static final long TICK_MS = 16L;
    /** Force SDL reopen when a pad is already paired but missed at init/hotplug. */
    private static final long RECONNECT_INTERVAL_MS = 1000L;

    private static volatile boolean started;

    private final Object manager;
    private final Method getState;
    private final Method getNumControllers;
    private final Method getControllerIndex;
    private final Method reconnectController;
    private final DesktopAwtMouse mouse = new DesktopAwtMouse();
    /** Lazily created — macOS may deny Accessibility for {@link Robot}. */
    private Robot robot;
    private boolean robotFailed;
    private boolean robotLogged;

    private int padIndex = 0;
    private float cursorX = -1f;
    private float cursorY = -1f;
    private boolean padActive;
    private boolean leftDown;
    private boolean rightDown;
    private long lastZoomAt;
    private long lastReconnectAt;
    private long lastScanLogAt;

    private DesktopGamepad(Object manager, Method getState, Method getNumControllers,
            Method getControllerIndex, Method reconnectController) {
        this.manager = manager;
        this.getState = getState;
        this.getNumControllers = getNumControllers;
        this.getControllerIndex = getControllerIndex;
        this.reconnectController = reconnectController;
    }

    /**
     * Start the poller once on desktop JVM. Safe to call repeatedly; ignored on
     * Android/iOS (they already feed {@link JoystickAlias} via AwtHost).
     * <p>
     * Prefer calling after the Swing frame is visible — on macOS, SDL/GameController
     * enumeration is more reliable once NSApplication/AWT is up.
     */
    static synchronized void startIfDesktop() {
        if (started) {
            return;
        }
        if (isMobileHost()) {
            return;
        }
        try {
            // Touch AWT toolkit before SDL so macOS AppKit is alive for GCController.
            Toolkit.getDefaultToolkit();
            Class<?> mgrCl = Class.forName("com.studiohartman.jamepad.ControllerManager");
            Class<?> idxCl = Class.forName("com.studiohartman.jamepad.ControllerIndex");
            Constructor<?> ctor = mgrCl.getConstructor();
            Object mgr = ctor.newInstance();
            mgrCl.getMethod("initSDLGamepad").invoke(mgr);
            Method getState = mgrCl.getMethod("getState", int.class);
            Method getNum = mgrCl.getMethod("getNumControllers");
            Method getIdx = mgrCl.getMethod("getControllerIndex", int.class);
            Method reconnect = idxCl.getMethod("reconnectController");
            DesktopGamepad pad = new DesktopGamepad(mgr, getState, getNum, getIdx, reconnect);
            started = true;
            Thread t = new Thread(new Runnable() {
                public void run() {
                    pad.loop();
                }
            }, "void-desktop-gamepad");
            t.setDaemon(true);
            t.start();
            System.out.println("void-osrs: desktop gamepad poller started (jamepad)");
        } catch (ClassNotFoundException e) {
            System.out.println("void-osrs: jamepad missing — desktop gamepad disabled");
        } catch (Throwable t) {
            System.out.println("void-osrs: desktop gamepad init failed: " + t);
        }
    }

    /** Mobile ports ship {@code voidawt.AwtHost}; desktop uses real {@code java.awt}. */
    private static boolean isMobileHost() {
        try {
            Class.forName("voidawt.AwtHost");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    private void loop() {
        while (true) {
            try {
                tick();
            } catch (Throwable t) {
                System.out.println("void-osrs: desktop gamepad tick: " + t.getMessage());
            }
            try {
                Thread.sleep(TICK_MS);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

    private void tick() throws Exception {
        Object state = getState.invoke(manager, Integer.valueOf(padIndex));
        if (!bool(state, "isConnected")) {
            Object found = findConnectedState();
            if (found == null) {
                // Already-paired pads are often missed if SDL inits before the device
                // wakes, or if the connect event is dropped — force reopen periodically.
                forceReconnectIfDue();
                found = findConnectedState();
            }
            if (found == null) {
                if (padActive) {
                    deactivate();
                }
                logScanIfDue();
                return;
            }
            state = found;
        }
        if (!padActive) {
            activate(state);
        }
        ensureCursor();

        float lx = dead(flt(state, "leftStickX"));
        float ly = dead(flt(state, "leftStickY"));
        float rx = dead(flt(state, "rightStickX"));
        float ry = dead(flt(state, "rightStickY"));
        float l2 = flt(state, "leftTrigger");
        float r2 = flt(state, "rightTrigger");

        int w = Math.max(1, mouse.canvasWidth());
        int h = Math.max(1, mouse.canvasHeight());
        if (lx != 0f || ly != 0f) {
            cursorX = clamp(cursorX + lx * PAD_CURSOR_SPEED, 0f, w - 1f);
            cursorY = clamp(cursorY + ly * PAD_CURSOR_SPEED, 0f, h - 1f);
            int mx = (int) cursorX;
            int my = (int) cursorY;
            syncOsPointer();
            if (leftDown) {
                dispatchDrag(mx, my, MouseEvent.BUTTON1);
            } else if (rightDown) {
                dispatchDrag(mx, my, MouseEvent.BUTTON3);
            } else {
                mouse.mouseMoved(mx, my);
            }
        }
        if (rx != 0f || ry != 0f) {
            injectCameraOrbit(rx * PAD_ORBIT_SCALE, ry * PAD_ORBIT_SCALE);
        }

        long now = System.currentTimeMillis();
        // R2 zoom in, L2 zoom out (matches mobile hosts).
        boolean zoomIn = r2 > PAD_TRIGGER_THRESHOLD;
        boolean zoomOut = l2 > PAD_TRIGGER_THRESHOLD;
        if ((zoomIn || zoomOut) && now - lastZoomAt >= PAD_ZOOM_INTERVAL_MS) {
            int mx = (int) cursorX;
            int my = (int) cursorY;
            if (zoomIn) {
                injectWheel(mx, my, -1);
            }
            if (zoomOut) {
                injectWheel(mx, my, 1);
            }
            lastZoomAt = now;
        }

        int ix = (int) cursorX;
        int iy = (int) cursorY;

        // ✕ Cross → left click (SDL A)
        if (bool(state, "aJustPressed")) {
            leftDown = true;
            syncOsPointer();
            mouse.mousePressed(ix, iy, MouseEvent.BUTTON1);
        } else if (leftDown && !bool(state, "a")) {
            leftDown = false;
            mouse.mouseReleased(ix, iy, MouseEvent.BUTTON1);
            mouse.mouseClicked(ix, iy, MouseEvent.BUTTON1);
        }

        // ○ Circle → right click (SDL B)
        if (bool(state, "bJustPressed")) {
            rightDown = true;
            syncOsPointer();
            mouse.mouseMoved(ix, iy);
            mouse.mousePressed(ix, iy, MouseEvent.BUTTON3);
        } else if (rightDown && !bool(state, "b")) {
            rightDown = false;
            mouse.mouseReleased(ix, iy, MouseEvent.BUTTON3);
            mouse.mouseClicked(ix, iy, MouseEvent.BUTTON3);
        }

        fireAliasEdge(state, "xJustPressed", KEYCODE_BUTTON_X, "Square");
        fireAliasEdge(state, "yJustPressed", KEYCODE_BUTTON_Y, "Triangle");
        fireAliasEdge(state, "lbJustPressed", KEYCODE_BUTTON_L1, "L1");
        fireAliasEdge(state, "rbJustPressed", KEYCODE_BUTTON_R1, "R1");
        fireAliasEdge(state, "leftStickJustClicked", KEYCODE_BUTTON_THUMBL, "L3");
        fireAliasEdge(state, "rightStickJustClicked", KEYCODE_BUTTON_THUMBR, "R3");
        fireAliasEdge(state, "dpadUpJustPressed", KEYCODE_DPAD_UP, "Up");
        fireAliasEdge(state, "dpadDownJustPressed", KEYCODE_DPAD_DOWN, "Down");
        fireAliasEdge(state, "dpadLeftJustPressed", KEYCODE_DPAD_LEFT, "Left");
        fireAliasEdge(state, "dpadRightJustPressed", KEYCODE_DPAD_RIGHT, "Right");
        fireAliasEdge(state, "startJustPressed", KEYCODE_BUTTON_START, "Options");
        fireAliasEdge(state, "backJustPressed", KEYCODE_BUTTON_SELECT, "Share");
    }

    private Object findConnectedState() throws Exception {
        for (int i = 0; i < 4; i++) {
            Object s = getState.invoke(manager, Integer.valueOf(i));
            if (bool(s, "isConnected")) {
                padIndex = i;
                return s;
            }
        }
        return null;
    }

    private void forceReconnectIfDue() {
        long now = System.currentTimeMillis();
        if (now - lastReconnectAt < RECONNECT_INTERVAL_MS) {
            return;
        }
        lastReconnectAt = now;
        try {
            for (int i = 0; i < 4; i++) {
                Object idx = getControllerIndex.invoke(manager, Integer.valueOf(i));
                reconnectController.invoke(idx);
            }
        } catch (Throwable t) {
            System.out.println("void-osrs: desktop pad reconnect: " + t.getMessage());
        }
    }

    private void logScanIfDue() {
        long now = System.currentTimeMillis();
        if (now - lastScanLogAt < 5000L) {
            return;
        }
        lastScanLogAt = now;
        try {
            int n = ((Integer) getNumControllers.invoke(manager)).intValue();
            System.out.println("void-osrs: desktop pad scanning (sdl num=" + n + ")");
        } catch (Throwable ignored) {
        }
    }

    private void fireAliasEdge(Object state, String justField, int code, String label)
            throws Exception {
        if (bool(state, justField)) {
            JoystickAlias.onPadButton(code, label);
        }
    }

    private void activate(Object state) {
        padActive = true;
        JoystickAlias.padConnected = true;
        ensureCursor();
        syncOsPointer();
        String type = "?";
        try {
            Field f = state.getClass().getField("controllerType");
            Object v = f.get(state);
            if (v != null) {
                type = v.toString();
            }
        } catch (Throwable ignored) {
        }
        System.out.println("void-osrs: desktop pad connected (" + type + " idx=" + padIndex + ")");
    }

    private void deactivate() {
        if (leftDown || rightDown) {
            int ix = (int) cursorX;
            int iy = (int) cursorY;
            if (leftDown) {
                mouse.mouseReleased(ix, iy, MouseEvent.BUTTON1);
            }
            if (rightDown) {
                mouse.mouseReleased(ix, iy, MouseEvent.BUTTON3);
            }
        }
        leftDown = false;
        rightDown = false;
        padActive = false;
        // Keep Learn rows visible on desktop even with pad unplugged (same as default).
        JoystickAlias.padConnected = true;
        System.out.println("void-osrs: desktop pad disconnected");
    }

    private void ensureCursor() {
        int w = Math.max(1, mouse.canvasWidth());
        int h = Math.max(1, mouse.canvasHeight());
        if (cursorX < 0f || cursorY < 0f) {
            cursorX = w * 0.5f;
            cursorY = h * 0.5f;
        }
        cursorX = clamp(cursorX, 0f, w - 1f);
        cursorY = clamp(cursorY, 0f, h - 1f);
    }

    /**
     * Move the real OS pointer onto the canvas at {@link #cursorX}/{@link #cursorY}
     * so Jagex {@link CursorManager} custom cursors (and the default arrow) show up.
     * Synthetic AWT events alone do not move the visible pointer.
     */
    private void syncOsPointer() {
        if (robotFailed) {
            return;
        }
        try {
            Canvas canvas = DisplayModeManagerContainer50.gameCanvas;
            if (canvas == null || !canvas.isShowing()) {
                return;
            }
            if (robot == null) {
                robot = new Robot();
            }
            Point origin = canvas.getLocationOnScreen();
            robot.mouseMove(origin.x + (int) cursorX, origin.y + (int) cursorY);
        } catch (Throwable t) {
            robotFailed = true;
            if (!robotLogged) {
                robotLogged = true;
                System.out.println("void-osrs: desktop pad Robot pointer failed"
                        + " (macOS: grant Accessibility to Java/Terminal): " + t);
            }
        }
    }

    private void dispatchDrag(int x, int y, int button) {
        final Canvas canvas = DisplayModeManagerContainer50.gameCanvas;
        if (canvas == null) {
            return;
        }
        int modifiers = button == MouseEvent.BUTTON1
                ? MouseEvent.BUTTON1_DOWN_MASK
                : MouseEvent.BUTTON3_DOWN_MASK | MouseEvent.META_DOWN_MASK;
        final MouseEvent e = new MouseEvent(canvas, MouseEvent.MOUSE_DRAGGED,
                System.currentTimeMillis(), modifiers, x, y, 0, false, button);
        if (java.awt.EventQueue.isDispatchThread()) {
            canvas.dispatchEvent(e);
        } else {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    canvas.dispatchEvent(e);
                }
            });
        }
    }

    private static void injectWheel(int x, int y, int rotation) {
        final Component target = DisplayModeManagerContainer50.gameCanvas;
        if (target == null) {
            return;
        }
        final MouseWheelEvent e = new MouseWheelEvent(target, MouseEvent.MOUSE_WHEEL,
                System.currentTimeMillis(), 0, x, y, 0, false,
                MouseWheelEvent.WHEEL_UNIT_SCROLL, 1, rotation);
        if (java.awt.EventQueue.isDispatchThread()) {
            target.dispatchEvent(e);
        } else {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    target.dispatchEvent(e);
                }
            });
        }
    }

    /** Same orbit math as mobile {@code AwtHost.injectCameraOrbit}. */
    private static void injectCameraOrbit(float dx, float dy) {
        if (dx == 0f && dy == 0f) {
            return;
        }
        try {
            Component112.cameraYaw += dx * 8f;
            DisplayModeManagerContainer154.cameraPitch += dy * 4f;
            DisplayModeManagerContainer199.clampCameraAngles(262144);
        } catch (Throwable ignored) {
        }
    }

    private static float dead(float v) {
        return Math.abs(v) < PAD_DEADZONE ? 0f : v;
    }

    private static float clamp(float v, float lo, float hi) {
        return v < lo ? lo : (v > hi ? hi : v);
    }

    private static boolean bool(Object state, String name) throws Exception {
        Field f = state.getClass().getField(name);
        return f.getBoolean(state);
    }

    private static float flt(Object state, String name) throws Exception {
        Field f = state.getClass().getField(name);
        return f.getFloat(state);
    }
}
