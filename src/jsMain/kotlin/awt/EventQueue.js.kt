package awt

import kotlinx.coroutines.Runnable

actual class EventQueue actual constructor() {
    internal var pending: Event? = null
}

actual fun EventQueue.peekEvent(): Event? = pending

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
