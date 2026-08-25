package awt

actual typealias EventQueue = java.awt.EventQueue

actual fun invokeLater(block: Runnable): Unit = java.awt.EventQueue.invokeLater(block)

actual fun invokeAndWait(block: Runnable): Unit = java.awt.EventQueue.invokeAndWait(block)

actual fun isEventDispatchThread(): Boolean = java.awt.EventQueue.isDispatchThread()
