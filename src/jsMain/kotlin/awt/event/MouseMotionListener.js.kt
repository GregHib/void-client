package awt.event

actual interface MouseMotionListener {
    actual fun mouseDragged(e: MouseEvent)
    actual fun mouseMoved(e: MouseEvent)
}