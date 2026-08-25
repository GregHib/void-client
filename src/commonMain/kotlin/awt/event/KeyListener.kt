package awt.event

expect interface KeyListener {
    fun keyTyped(e: KeyEvent)
    fun keyPressed(e: KeyEvent)
    fun keyReleased(e: KeyEvent)
}
