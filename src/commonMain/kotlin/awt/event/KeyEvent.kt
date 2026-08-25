package awt.event

expect class KeyEvent {
    fun getKeyCode(): Int
    fun getKeyChar(): Char
    fun getID(): Int
    fun isShiftDown(): Boolean
    fun isControlDown(): Boolean
    fun isAltDown(): Boolean
    fun isMetaDown(): Boolean
    fun consume()
}