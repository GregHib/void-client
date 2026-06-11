/**
 * JVM implementation of the [WorkerFactory] seam, backed by java.lang.Thread.
 *
 * Reproduces the original spawn sequence exactly: construct, setDaemon, start,
 * then (optionally) setPriority -- matching Class297 request type 2 and the
 * Class169/Class208/Class376 init blocks.
 */
object ThreadWorkerFactory : WorkerFactory {
    override fun start(body: WorkerBody, daemon: Boolean, priority: Int?, name: String?): WorkerHandle {
        val thread = if (name != null) Thread({ body.run() }, name) else Thread { body.run() }
        thread.isDaemon = daemon
        thread.start()
        if (priority != null) thread.priority = priority
        return ThreadWorkerHandle(thread)
    }
}

class ThreadWorkerHandle(private val thread: Thread) : WorkerHandle {
    override fun join() {
        try {
            thread.join()
        } catch (interruptedexception: InterruptedException) {
            /* empty */
        }
    }
}
