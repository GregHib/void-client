package awt.event

actual class WindowEvent internal constructor(private val id: Int) {
    actual fun getID(): Int = id

    companion object {
        fun of(id: Int): WindowEvent = WindowEvent(id)
    }
}
