package awt.event

actual class KeyEvent internal constructor(
    private val keyCode: Int,
    private val keyChar: Char,
    private val id: Int,
    private val shiftDown: Boolean,
    private val controlDown: Boolean,
    private val altDown: Boolean,
    private val metaDown: Boolean,
    private val domEvent: org.w3c.dom.events.KeyboardEvent? = null
) {
    actual fun getKeyCode(): Int = keyCode
    actual fun getKeyChar(): Char = keyChar
    actual fun getID(): Int = id
    actual fun isShiftDown(): Boolean = shiftDown
    actual fun isControlDown(): Boolean = controlDown
    actual fun isAltDown(): Boolean = altDown
    actual fun isMetaDown(): Boolean = metaDown

    actual fun consume() {
        domEvent?.preventDefault()
    }

    companion object {
        /** Bridges a browser `org.w3c.dom.events.KeyboardEvent` into a [KeyEvent]. */
        fun from(event: org.w3c.dom.events.KeyboardEvent, id: Int): KeyEvent = KeyEvent(
            keyCode = toAwtKeyCode(event.keyCode),
            keyChar = event.key.singleOrNull() ?: ' ',
            id = id,
            shiftDown = event.shiftKey,
            controlDown = event.ctrlKey,
            altDown = event.altKey,
            metaDown = event.metaKey,
            domEvent = event
        )

        // Most browser KeyboardEvent.keyCode values happen to match the AWT VK_* constants
        // in [Key] (letters, digits, arrows, space, escape, etc.), but a few historically
        // diverge - notably Enter (browser 13 vs AWT VK_ENTER=10) and Delete (browser 46 vs
        // AWT VK_DELETE=127). Without this translation those keys are silently dropped by
        // client code that switches on the AWT constant.
        private fun toAwtKeyCode(browserKeyCode: Int): Int = when (browserKeyCode) {
            13 -> Key.VK_ENTER
            46 -> Key.VK_DELETE
            else -> browserKeyCode
        }
    }
}
