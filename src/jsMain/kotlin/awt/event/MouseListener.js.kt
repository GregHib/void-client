package awt.event

actual interface MouseListener {
    actual fun mouseClicked(e: MouseEvent)
    actual fun mousePressed(e: MouseEvent)
    actual fun mouseReleased(e: MouseEvent)
    actual fun mouseEntered(e: MouseEvent)
    actual fun mouseExited(e: MouseEvent)
}
