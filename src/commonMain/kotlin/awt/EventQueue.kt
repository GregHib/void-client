package awt

import kotlinx.coroutines.Runnable

expect class EventQueue()

expect fun EventQueue.peekEvent(): Event?
expect fun EventQueue.postEvent(event: Event)

expect fun invokeLater(block: Runnable)
expect fun invokeAndWait(block: Runnable)
expect fun isEventDispatchThread(): Boolean
