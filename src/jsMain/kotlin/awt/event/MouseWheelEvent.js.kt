package awt.event

import awt.UiScale

actual class MouseWheelEvent(private val event: org.w3c.dom.events.WheelEvent) {
    actual fun getX(): Int = event.offsetX.toInt() / UiScale.factor
    actual fun getY(): Int = event.offsetY.toInt() / UiScale.factor
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