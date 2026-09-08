import java.awt.event.MouseEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * Synthetic mouse for Microbot — sets {@link Microbot#targetMenu} then dispatches
 * press/release/click through the active {@link MicrobotMouseBackend}.
 * <p>
 * If invoked from the client thread, the click is offloaded to a daemon scheduler
 * so we never nest AWT dispatch inside {@code processGameTick}.
 */
final class VirtualMouse {

    // Anonymous ThreadFactory — RoboVM/Soot cannot AOT lambdas (invokedynamic).
    private final ScheduledExecutorService scheduler =
            Executors.newSingleThreadScheduledExecutor(new ThreadFactory() {
                public Thread newThread(Runnable r) {
                    Thread t = new Thread(r, "microbot-mouse");
                    t.setDaemon(true);
                    return t;
                }
            });

    private MicrobotMouseBackend backend;
    private int lastX = 400;
    private int lastY = 300;

    VirtualMouse() {
    }

    void ensureBackend() {
        if (backend != null) {
            return;
        }
        VoidAwtHostMouse mobile = VoidAwtHostMouse.tryCreate();
        if (mobile != null) {
            backend = mobile;
            System.out.println("microbot: using VoidAwtHostMouse backend");
        } else {
            backend = new DesktopAwtMouse();
            System.out.println("microbot: using DesktopAwtMouse backend");
        }
    }

    MicrobotMouseBackend getBackend() {
        ensureBackend();
        return backend;
    }

    /**
     * Left-click at {@code (x,y)} intending {@code entry}. Sets
     * {@link Microbot#targetMenu} before press so menu rewrite / tip force can
     * plant the real opcode.
     */
    void click(int x, int y, NewMenuEntry entry) {
        ensureBackend();
        Runnable action = new Runnable() {
            public void run() {
                try {
                    Microbot.targetMenu = entry;
                    Microbot.pendingMenuInject = true;
                    backend.mouseMoved(x, y);
                    MicrobotGlobal.sleep(20 + (int) (Math.random() * 40));
                    backend.mousePressed(x, y, MouseEvent.BUTTON1);
                    MicrobotGlobal.sleep(30 + (int) (Math.random() * 40));
                    backend.mouseReleased(x, y, MouseEvent.BUTTON1);
                    backend.mouseClicked(x, y, MouseEvent.BUTTON1);
                    lastX = x;
                    lastY = y;
                } catch (Throwable t) {
                    System.out.println("microbot VirtualMouse.click failed: " + t.getMessage());
                }
            }
        };
        if (Microbot.isClientThread()) {
            scheduler.schedule(action, 0, TimeUnit.MILLISECONDS);
        } else {
            action.run();
        }
    }

    void clickCenter(NewMenuEntry entry) {
        ensureBackend();
        int x = Math.max(10, backend.canvasWidth() / 2);
        int y = Math.max(10, backend.canvasHeight() / 2);
        click(x, y, entry);
    }

    void move(int x, int y) {
        ensureBackend();
        backend.mouseMoved(x, y);
        lastX = x;
        lastY = y;
    }

    int getLastX() {
        return lastX;
    }

    int getLastY() {
        return lastY;
    }
}
