package awt.event

actual class MouseEvent(private val event: org.w3c.dom.events.MouseEvent) {
    actual fun getX(): Int = event.clientX
    actual fun getY(): Int = event.clientY
    // DOM click events carry the click count in `detail`
    actual fun getClickCount(): Int = event.detail
    actual fun consume() { event.preventDefault() }
    // Right-click / context-menu button === 2 is the closest DOM analogue
    actual fun isPopupTrigger(): Boolean = event.button.toInt() == 2

    actual fun getButton(): Int = event.button.toInt()
    actual fun isMetaDown(): Boolean = event.metaKey

    actual fun getModifiers(): Int {
        var mods = 0
        if (event.shiftKey) mods = mods or 1
        if (event.ctrlKey) mods = mods or 2
        if (event.altKey) mods = mods or 8
        if (event.metaKey) mods = mods or 4
        return mods
    }
}