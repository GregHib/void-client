import java.util.concurrent.Callable;

/**
 * Sleep / wait helpers for Microbot scripts (off the client thread).
 * <p>
 * Never call from {@link client#processGameTick} — sleeping on the game thread freezes
 * rendering and packet IO. Scripts run on a daemon executor (~600 ms).
 * <p>
 * Uses a local {@link Condition} instead of {@code java.util.function.BooleanSupplier}
 * so RoboVM AOT does not hit a phantom {@code java.util.function} class.
 */
class MicrobotGlobal {

    /** Predicate for {@link #sleepUntil} — keep off {@code java.util.function} for RoboVM. */
    interface Condition {
        boolean getAsBoolean();
    }

    MicrobotGlobal() {
    }

    static void sleep(long ms) {
        if (ms <= 0) {
            return;
        }
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Sleeps until {@code condition} is true or {@code timeoutMs} elapses.
     *
     * @return true if condition became true
     */
    static boolean sleepUntil(Condition condition, long timeoutMs) {
        return sleepUntil(condition, timeoutMs, 100);
    }

    static boolean sleepUntil(Condition condition, long timeoutMs, long pollMs) {
        long deadline = System.currentTimeMillis() + timeoutMs;
        while (System.currentTimeMillis() < deadline) {
            try {
                if (condition != null && condition.getAsBoolean()) {
                    return true;
                }
            } catch (Throwable ignored) {
            }
            sleep(pollMs);
        }
        try {
            return condition != null && condition.getAsBoolean();
        } catch (Throwable t) {
            return false;
        }
    }

    static boolean sleepUntilTrue(Callable condition, long timeoutMs) {
        return sleepUntil(new Condition() {
            public boolean getAsBoolean() {
                try {
                    Object v = condition.call();
                    return v instanceof Boolean && ((Boolean) v).booleanValue();
                } catch (Throwable t) {
                    return false;
                }
            }
        }, timeoutMs);
    }
}
