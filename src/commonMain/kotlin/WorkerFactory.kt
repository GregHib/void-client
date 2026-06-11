/**
 * Platform seam for spawning background workers.
 *
 * The client spawns a small, fixed set of daemon workers (DNS ping loop, socket
 * reader/writer pumps, the game decode thread) plus a generic worker-launch path
 * in the signlink (Class297, request type 2). On JVM these are java.lang.Thread;
 * on web they must become cooperative coroutines driven by the frame loop, and on
 * native they map to real threads again.
 *
 * Callers hold a [WorkerHandle] (never a raw Thread) so the join/teardown surface
 * is platform-neutral. Install the platform factory once at startup via
 * [Workers.install]; the default is a JVM Thread-backed factory.
 *
 * [WorkerBody] is the portable stand-in for java.lang.Runnable (which only exists
 * as a typealias on JVM).
 */
fun interface WorkerBody {
    fun run()
}

interface WorkerHandle {
    /** Block until the worker's run loop returns. */
    fun join()
}

interface WorkerFactory {
    /**
     * Start a worker running [body].
     *
     * @param daemon   whether the worker should not keep the process alive (JVM daemon flag).
     * @param priority JVM thread priority, or null to leave at default. Ignored off-JVM.
     * @param name     optional worker name for diagnostics.
     */
    fun start(body: WorkerBody, daemon: Boolean = true, priority: Int? = null, name: String? = null): WorkerHandle
}

object Workers {
    /** Set by the platform at startup; JVM defaults to ThreadWorkerFactory. */
    lateinit var factory: WorkerFactory

    fun install(f: WorkerFactory) {
        factory = f
    }

    fun start(body: WorkerBody, daemon: Boolean = true, priority: Int? = null, name: String? = null): WorkerHandle =
        factory.start(body, daemon, priority, name)
}
