package awt.event

expect class FocusEvent {
    fun getID(): Int
    fun isTemporary(): Boolean
}