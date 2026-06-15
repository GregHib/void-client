/**
 * Platform seams for Java object-monitor operations (wait/notifyAll).
 *
 * On JVM these map to Object.wait() / Object.notifyAll().
 * The InterruptedException from wait() is swallowed internally (the callers all have empty catch blocks).
 * On JS (single-threaded) these are no-ops — wait() never blocks, notifyAll() has nothing to wake.
 */
expect fun monitorWait(lock: Any)
expect fun monitorNotifyAll(lock: Any)
