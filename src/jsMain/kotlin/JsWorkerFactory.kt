/**
 * JS implementation of the [WorkerFactory] seam.
 *
 * ## Why synchronous execution is correct for the login path
 *
 * The browser is single-threaded; there is no way to park a background coroutine
 * and let the event loop make progress while it waits.  The workers spawned during
 * the JS login path are:
 *
 *  - **Class202.run()** — a deliberate no-op.  The JS5 writer pump lives inside
 *    [WebSocketConnection] (message delivery is asynchronous by the WS protocol),
 *    so the Runnable body has nothing to do.
 *
 *  - **Class202.method1473 / method1474** spin-polls — these are called from the
 *    Client.kt JS5 state machine inside [GameFrame.runFrame], which itself runs on
 *    the rAF loop.  The state machine only calls method1473/1474 *after* confirming
 *    that bytes are available via method1467 (available-byte count).  Because
 *    WebSocket delivers a complete binary frame atomically, the bytes are already
 *    buffered by the time the poll runs, so the spin exits on the first iteration
 *    with zero extra sleeps.
 *
 *  - **Class169 / Class208 / Class376** — DNS-ping and JVM socket reader/writer
 *    pumps; these classes live in jvmMain and are never instantiated on JS.
 *
 * The body is therefore run synchronously on the calling "thread" (rAF tick).
 * [WorkerHandle.join] is a no-op because the body has already finished by the time
 * start() returns.
 *
 * If a future worker body genuinely needs to yield across rAF frames (e.g. a
 * long-running decode pass), replace this with a coroutine-backed implementation
 * that launches on [kotlinx.coroutines.Dispatchers.Main] and suspends via
 * [kotlinx.coroutines.delay].
 */
object JsWorkerFactory : WorkerFactory {
    override fun start(body: WorkerBody, daemon: Boolean, priority: Int?, name: String?): WorkerHandle {
        body.run()
        return NoOpWorkerHandle
    }
}

private object NoOpWorkerHandle : WorkerHandle {
    override fun join() { /* body already finished synchronously */ }
}
