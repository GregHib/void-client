package awt

import kotlinx.coroutines.Runnable

actual class EventQueue actual constructor() {
    internal var pending: Event? = null
}

/**
 * Takes the pending event rather than only looking at it.
 *
 * Nothing on JS ever dispatched what postEvent stored, so the field stayed set forever once
 * anything had been posted. WorldMapPolygonIconLabel.method3578 drains the queue with
 * `while (i < 50 && peekEvent() != null) { sleep(1); i++ }` at the end of every game tick and
 * every audio-mixer tick, so a permanently non-null peek meant 50 dead iterations per tick,
 * forever, each one going through sleep(). Consuming here is what a real dispatch would have done.
 */
actual fun EventQueue.peekEvent(): Event? {
    val event = pending
    pending = null
    return event
}

actual fun EventQueue.postEvent(event: Event) {
    pending = event
}

private external fun setTimeout(handler: () -> Unit, timeout: Int): Int

actual fun invokeLater(block: Runnable) {
    setTimeout({ block.run() }, 0)
}

actual fun invokeAndWait(block: Runnable) {
    // JS is single-threaded: there's no separate dispatch thread to hand
    // work off to and block on, so this just runs synchronously.
    block.run()
}

actual fun isEventDispatchThread(): Boolean = true
