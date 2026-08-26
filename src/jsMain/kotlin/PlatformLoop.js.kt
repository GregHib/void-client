import kotlinx.browser.window
import lang.pendingSleepMillis

/**
 * A setTimeout chain rather than a `while` loop, so the browser gets the thread back between
 * iterations. The delay comes from whatever sleep the step asked for via lang.sleep (which records
 * the request instead of blocking), preserving the client's own ~20ms pacing.
 */
actual fun runLoop(
    prelude: () -> Boolean,
    step: () -> Boolean,
    onError: (Throwable) -> Unit,
    onFinally: () -> Unit,
) {
    try {
        if (!prelude()) {
            onFinally()
            return
        }
    } catch (throwable: Throwable) {
        onError(throwable)
        onFinally()
        return
    }

    fun tick() {
        pendingSleepMillis = 0L
        val more = try {
            step()
        } catch (throwable: Throwable) {
            onError(throwable)
            onFinally()
            return
        }
        if (!more) {
            onFinally()
            return
        }
        window.setTimeout({ tick() }, pendingSleepMillis.coerceIn(1L, 50L).toInt())
    }

    window.setTimeout({ tick() }, 0)
}

actual val executeWorkerTasksInline: Boolean = true
