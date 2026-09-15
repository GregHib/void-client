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

/**
 * `available()` on the JS socket is a snapshot that cannot grow until this macrotask returns, so
 * draining it fully is bounded and the JVM's per-call cap only lowers throughput here.
 */
actual val js5ReadsPerPump: Int = Int.MAX_VALUE

private var js5Pump: (() -> Unit)? = null

actual fun registerJs5Pump(pump: () -> Unit) {
    js5Pump = pump
}

/**
 * Called by net.Socket from a WebSocket `onmessage` after the chunk has been queued. Fires for
 * every socket (game and JS5 alike) - the pump is cheap when the JS5 stream has nothing waiting,
 * and this avoids the socket layer having to know which connection it is carrying.
 *
 * Errors are reported and swallowed: the game tick still calls the same pump and will hit the
 * same failure on its own error path (method102 -> method101), so nothing is lost by not
 * re-throwing out of a network callback.
 */
internal fun notifyInboundData() {
    val pump = js5Pump ?: return
    try {
        pump()
    } catch (throwable: Throwable) {
        console.error("JS5 pump failed", throwable)
    }
}
