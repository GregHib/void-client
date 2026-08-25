package awt.event

actual class MouseWheelEvent(private val event: org.w3c.dom.events.WheelEvent) {
    actual fun getX(): Int = event.clientX
    actual fun getY(): Int = event.clientY
    // Normalize deltaY into AWT-style "notches"; sign preserved, magnitude scaled
    actual fun getWheelRotation(): Int {
        val notches = event.deltaY / 100.0
        return when {
            notches > 0 -> kotlin.math.ceil(notches).toInt()
            notches < 0 -> kotlin.math.floor(notches).toInt()
            else -> 0
        }
    }
    actual fun consume() { event.preventDefault() }
}