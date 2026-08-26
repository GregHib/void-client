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
