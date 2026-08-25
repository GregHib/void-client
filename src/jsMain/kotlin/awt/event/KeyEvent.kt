package awt.event

actual class KeyEvent internal constructor(
    private val keyCode: Int,
    private val keyChar: Char,
    private val id: Int,
    private val shiftDown: Boolean,
    private val controlDown: Boolean,
    private val altDown: Boolean,
    private val metaDown: Boolean
) {
    actual fun getKeyCode(): Int = keyCode
    actual fun getKeyChar(): Char = keyChar
    actual fun getID(): Int = id
    actual fun isShiftDown(): Boolean = shiftDown
    actual fun isControlDown(): Boolean = controlDown
    actual fun isAltDown(): Boolean = altDown
    actual fun isMetaDown(): Boolean = metaDown

    companion object {
        /** Bridges a browser `org.w3c.dom.events.KeyboardEvent` into a [KeyEvent]. */
        fun from(event: org.w3c.dom.events.KeyboardEvent, id: Int): KeyEvent = KeyEvent(
            keyCode = event.keyCode,
            keyChar = event.key.singleOrNull() ?: '\u0000',
            id = id,
            shiftDown = event.shiftKey,
            controlDown = event.ctrlKey,
            altDown = event.altKey,
            metaDown = event.metaKey
        )
    }
}