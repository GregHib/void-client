/** JS is single-threaded — monitor operations are no-ops. */
actual fun monitorWait(lock: Any) { /* no-op */ }
actual fun monitorNotifyAll(lock: Any) { /* no-op */ }
