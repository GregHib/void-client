/**
 * Microbot static locator — Guice-free port of Microbot's singleton.
 * <p>
 * Scripts reach client state via here. {@link #doInvoke} queues a menu entry for
 * {@link ColoredTextBuilder#method2599} on the next {@link MicrobotRuntime#tick()} — same
 * packet path as a real tip click, without depending on canvas hit-testing.
 */
final class Microbot {

    /** Master kill-switch (Loader / debug). */
    static boolean enabled = true;

    /** When true, {@link MicrobotScript#run()} returns false. */
    static volatile boolean pauseAllScripts = false;

    /**
     * Intended menu action (tip force while pending). Cleared after
     * {@link ColoredTextBuilder#method2599}.
     */
    static volatile NewMenuEntry targetMenu;

    /** Request {@link MicrobotMenu#injectPending()} on the next client tick. */
    static volatile boolean pendingMenuInject;

    /** Entry to run through {@link ColoredTextBuilder#method2599} on the client thread. */
    static volatile NewMenuEntry pendingDispatch;

    static volatile int pendingClickX;
    static volatile int pendingClickY;

    static final VirtualMouse mouse = new VirtualMouse();

    private static volatile Thread clientThread;
    private static ExampleCombatScript exampleCombat;
    private static boolean started;

    private Microbot() {
    }

    static void markClientThread() {
        clientThread = Thread.currentThread();
    }

    static boolean isClientThread() {
        return clientThread != null && Thread.currentThread() == clientThread;
    }

    /** In-world gate: local player present (FSM state varies; 7 is lobby/game UI). */
    static boolean isLoggedIn() {
        return Component72.localPlayer != null;
    }

    /**
     * Queue {@code entry} for client-thread menu dispatch.
     * Optional {@code x,y} become the click coords passed to method2599
     * (cursor feedback); negative → canvas centre.
     */
    static void doInvoke(NewMenuEntry entry, int x, int y) {
        if (!enabled || entry == null) {
            return;
        }
        targetMenu = entry;
        pendingMenuInject = true;
        pendingDispatch = entry;
        if (x >= 0 && y >= 0) {
            pendingClickX = x;
            pendingClickY = y;
        } else {
            try {
                mouse.ensureBackend();
                pendingClickX = Math.max(10, mouse.getBackend().canvasWidth() / 2);
                pendingClickY = Math.max(10, mouse.getBackend().canvasHeight() / 2);
            } catch (Throwable t) {
                pendingClickX = 400;
                pendingClickY = 300;
            }
        }
    }

    static void doInvoke(NewMenuEntry entry) {
        doInvoke(entry, -1, -1);
    }

    /** Console-only debug — never writes to in-game chat. */
    static void log(String msg) {
        System.out.println("microbot: " + msg);
    }

    static ExampleCombatScript getExampleCombat() {
        if (exampleCombat == null) {
            exampleCombat = new ExampleCombatScript();
        }
        return exampleCombat;
    }

    static boolean isStarted() {
        return started;
    }

    static void setStarted(boolean v) {
        started = v;
    }
}
