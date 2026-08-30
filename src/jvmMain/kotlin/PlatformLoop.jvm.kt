/** Reproduces the original try/while/catch/finally exactly - the JVM owns a real thread here. */
actual fun runLoop(
    prelude: () -> Boolean,
    step: () -> Boolean,
    onError: (Throwable) -> Unit,
    onFinally: () -> Unit,
) {
    try {
        if (prelude()) {
            while (step()) {
                // body is entirely in step()
            }
        }
    } catch (throwable: Throwable) {
        onError(throwable)
    } finally {
        onFinally()
    }
}

actual val executeWorkerTasksInline: Boolean = false
