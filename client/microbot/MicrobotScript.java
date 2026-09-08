import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Base Microbot script: daemon scheduled loop (~1 game tick).
 * <p>
 * Subclasses schedule work via {@link #schedule(Runnable, long)}; {@link #run()}
 * is the pre-loop gate (login / pause / blocking events). Call {@link #shutdown()}
 * from plugin/script stop paths.
 */
abstract class MicrobotScript extends MicrobotGlobal {

    /** Default script cadence — ~1 RS tick. */
    static final long DEFAULT_DELAY_MS = 600L;

    // Anonymous ThreadFactory — RoboVM/Soot cannot AOT lambdas (invokedynamic).
    private final ScheduledExecutorService executor =
            Executors.newSingleThreadScheduledExecutor(new ThreadFactory() {
                public Thread newThread(Runnable r) {
                    Thread t = new Thread(r, "microbot-script");
                    t.setDaemon(true);
                    return t;
                }
            });

    private final AtomicBoolean running = new AtomicBoolean(false);
    private ScheduledFuture mainFuture;

    /**
     * Pre-loop guard used inside scheduled tasks.
     *
     * @return false when the script should skip this iteration
     */
    protected boolean run() {
        if (!Microbot.isLoggedIn()) {
            return false;
        }
        if (Microbot.pauseAllScripts) {
            return false;
        }
        if (MicrobotBlockingEvents.isBlocking()) {
            return false;
        }
        return true;
    }

    /**
     * Schedules {@code task} at a fixed delay. Cancels any previous schedule.
     */
    protected void schedule(Runnable task, long delayMs) {
        shutdownScheduleOnly();
        running.set(true);
        long delay = delayMs > 0 ? delayMs : DEFAULT_DELAY_MS;
        mainFuture = executor.scheduleWithFixedDelay(new Runnable() {
            public void run() {
                if (!running.get()) {
                    return;
                }
                try {
                    if (!MicrobotScript.this.run()) {
                        return;
                    }
                    task.run();
                } catch (Throwable t) {
                    System.out.println("microbot script error: " + t.getMessage());
                    t.printStackTrace();
                }
            }
        }, 0, delay, TimeUnit.MILLISECONDS);
    }

    /** Stops the loop; executor stays alive so {@link #schedule} can restart. */
    public void shutdown() {
        running.set(false);
        shutdownScheduleOnly();
    }

    /** Stops the loop and shuts down the executor (final dispose). */
    public void dispose() {
        shutdown();
        executor.shutdownNow();
    }

    private void shutdownScheduleOnly() {
        if (mainFuture != null) {
            mainFuture.cancel(false);
            mainFuture = null;
        }
    }

    boolean isRunning() {
        return running.get();
    }
}
