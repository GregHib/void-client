package awt.event

actual object WindowEventId {
    actual val WINDOW_OPENED: Int = java.awt.event.WindowEvent.WINDOW_OPENED
    actual val WINDOW_CLOSING: Int = java.awt.event.WindowEvent.WINDOW_CLOSING
    actual val WINDOW_CLOSED: Int = java.awt.event.WindowEvent.WINDOW_CLOSED
    actual val WINDOW_ICONIFIED: Int = java.awt.event.WindowEvent.WINDOW_ICONIFIED
    actual val WINDOW_DEICONIFIED: Int = java.awt.event.WindowEvent.WINDOW_DEICONIFIED
    actual val WINDOW_ACTIVATED: Int = java.awt.event.WindowEvent.WINDOW_ACTIVATED
    actual val WINDOW_DEACTIVATED: Int = java.awt.event.WindowEvent.WINDOW_DEACTIVATED
}
