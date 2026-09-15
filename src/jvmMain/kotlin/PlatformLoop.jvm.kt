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

/** The original 634 read budget; the socket can refill mid-loop on a real thread, so keep the cap. */
actual val js5ReadsPerPump: Int = 100

/** The tick owns a real thread at a steady rate, so the pump needs no second driver. */
actual fun registerJs5Pump(pump: () -> Unit) {
}
