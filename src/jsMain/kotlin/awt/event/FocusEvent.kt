package awt.event

actual class FocusEvent internal constructor(private val id: Int, private val temporary: Boolean) {
    actual fun getID(): Int = id
    actual fun isTemporary(): Boolean = temporary

    companion object {
        fun of(id: Int, temporary: Boolean = false): FocusEvent = FocusEvent(id, temporary)
    }
}
