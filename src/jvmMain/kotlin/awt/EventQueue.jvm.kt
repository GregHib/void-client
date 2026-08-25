package awt

import awt.event.ActionEvent

actual typealias EventQueue = java.awt.EventQueue

actual fun invokeLater(block: Runnable): Unit = java.awt.EventQueue.invokeLater(block)

actual fun invokeAndWait(block: Runnable): Unit = java.awt.EventQueue.invokeAndWait(block)

actual fun isEventDispatchThread(): Boolean = java.awt.EventQueue.isDispatchThread()

private object PendingEventMarker : Event()

actual fun EventQueue.peekEvent(): Event? =
    if ((this as java.awt.EventQueue).peekEvent() != null) PendingEventMarker else null

actual fun EventQueue.postEvent(event: Event) {
    val actionEvent = event as? ActionEvent
    val source = actionEvent?.obj ?: this
    val id = actionEvent?.int ?: java.awt.event.ActionEvent.ACTION_PERFORMED
    val command = actionEvent?.str ?: ""
    (this as java.awt.EventQueue).postEvent(java.awt.event.ActionEvent(source, id, command))
}
