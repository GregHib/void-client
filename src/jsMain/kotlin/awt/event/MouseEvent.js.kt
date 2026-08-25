package awt.event

actual class MouseEvent(private val event: org.w3c.dom.events.MouseEvent) {
    actual fun getX(): Int = event.clientX
    actual fun getY(): Int = event.clientY
    // DOM click events carry the click count in `detail`
    actual fun getClickCount(): Int = event.detail
    actual fun consume() { event.preventDefault() }
    // Right-click / context-menu button === 2 is the closest DOM analogue
    actual fun isPopupTrigger(): Boolean = event.button.toInt() == 2
}