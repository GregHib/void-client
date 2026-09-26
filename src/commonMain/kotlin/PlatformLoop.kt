/**
 * The client's two long-lived "threads" (GameAppletFrame.run and ResourceLoaderThread.run) are
 * infinite non-suspending `while` loops. That is fine on the JVM, where they own a real thread,
 * but on JS's single event loop such a loop never yields and the tab freezes before anything can
 * paint. [runLoop] moves the loop construct itself behind expect/actual: the JVM actual is the
 * original blocking loop, the JS actual is a setTimeout chain.
 *
 * The prelude/onError/onFinally parameters exist because both call sites wrap their loop in
 * try/catch/finally, and on JS the finally must NOT run when the first tick is merely *scheduled*
 * - GameAppletFrame's finally is its shutdown path.
 *
 * @param prelude one-time setup; returning false skips the loop entirely (but still runs onFinally)
 * @param step one iteration; returning false ends the loop
 */
expect fun runLoop(
    prelude: () -> Boolean,
    step: () -> Boolean,
    onError: (Throwable) -> Unit,
    onFinally: () -> Unit,
)

/**
 * Whether PrivilegedOperationWorker should execute submitted tasks synchronously on the caller
 * rather than handing them to its worker coroutine.
 *
 * Roughly six call sites submit a task and then busy-wait on `while (node.anInt1997 == 0) sleep()`.
 * On JS that sleep cannot yield, so the worker coroutine never gets to run and the wait deadlocks.
 * Running the task inline means anInt1997 is already set by the time the caller looks at it, and
 * every one of those loops becomes a zero-iteration no-op with no edits at the call sites.
 */
expect val executeWorkerTasksInline: Boolean

/**
 * Upper bound on the number of 512-byte JS5 reads MediaStreamClient.method1893 performs per call.
 *
 * The original client hardcodes 100, which caps JS5 throughput at ~51 KB per game tick. On the
 * JVM the socket can keep refilling while the loop runs, so the cap is what stops one pump from
 * starving the tick. On JS the WebSocket only delivers between macrotasks, so `available()` is a
 * fixed snapshot and draining it completely is already bounded - the cap just throws throughput away.
 */
expect val js5ReadsPerPump: Int

/**
 * Registers the JS5 pump (MediaStreamClient.method1893) to be driven by inbound socket data as
 * well as by the game tick.
 *
 * On the JVM this is a no-op: the tick runs at a steady 50/s on its own thread and the cap above
 * already gives ~2.5 MB/s. On JS the tick is a setTimeout chain whose rate collapses with a slow
 * software-rendered frame or a hidden tab, and with it every JS5 response that a swapped-in scene
 * object is waiting on. Servicing the pump from the socket's `onmessage` keeps streaming
 * independent of the frame rate. The pump is idempotent and single-threaded on JS, so running it
 * outside the tick is safe.
 */
expect fun registerJs5Pump(pump: () -> Unit)

/**
 * Entry count of ObjectTypeList's decoded-definition cache outside the world map (which raises it
 * to 4096 itself). The original's 64 thrashes on a region load: the minimap rebuild visits every
 * object in the region, and outside the loading state the config archives drop each unpacked group
 * after a single read (Js5Archive discard mode 2), so every miss inflates a whole 256-entry group
 * again. That is cheap with native zlib on the JVM and expensive with pure-Kotlin inflate on JS.
 */
expect val objectTypeCacheSize: Int

/**
 * Called when the client draws a frame it expects to be visible *immediately*, e.g. the
 * "Loading - please wait." box, which the original presents with a real buffer swap right before
 * blocking on a long synchronous scene build.
 *
 * On the JVM that swap is on screen at once, so this is a no-op. On JS a swap does nothing: the
 * browser only composites the canvas after the current task returns and a rendering opportunity
 * comes round, so a build started in the same task overwrites the box before it is ever shown.
 * The JS actual marks a present as pending until the browser's next animation frame.
 */
expect fun requestImmediatePresent()

/** True while a frame passed to [requestImmediatePresent] has not yet reached the screen. */
expect val immediatePresentPending: Boolean
