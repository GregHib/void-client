package awt

import kotlinx.coroutines.Runnable

expect class EventQueue() {
    fun peekEvent(): Event
    fun postEvent(event: Event)
}

expect fun invokeLater(block: Runnable)
expect fun invokeAndWait(block: Runnable)
expect fun isEventDispatchThread(): Boolean
