package awt.event

actual interface KeyListener {
    actual fun keyTyped(e: KeyEvent)
    actual fun keyPressed(e: KeyEvent)
    actual fun keyReleased(e: KeyEvent)
}
