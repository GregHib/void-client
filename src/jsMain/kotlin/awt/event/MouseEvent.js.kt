package awt.event

actual class MouseEvent(private val event: org.w3c.dom.events.MouseEvent) {
    // offsetX/offsetY are relative to the padding edge of the target element (the canvas),
    // which is exactly what AWT callers expect - clientX/clientY would be page-relative.
    actual fun getX(): Int = event.offsetX.toInt()
    actual fun getY(): Int = event.offsetY.toInt()
    // DOM click events carry the click count in `detail`
    actual fun getClickCount(): Int = event.detail
    actual fun consume() { event.preventDefault() }
    // Right-click / context-menu button === 2 is the closest DOM analogue
    actual fun isPopupTrigger(): Boolean = event.button.toInt() == 2

    // DOM buttons are 0-indexed (0=left, 1=middle, 2=right); AWT's BUTTON1/2/3 are 1-indexed.
    actual fun getButton(): Int = event.button.toInt() + 1
    actual fun isMetaDown(): Boolean = event.metaKey

    actual fun getModifiers(): Int {
        var mods = 0
        if (event.shiftKey) mods = mods or 1
        if (event.ctrlKey) mods = mods or 2
        if (event.altKey) mods = mods or 8
        if (event.metaKey) mods = mods or 4
        // AWT also folds the pressed-button state into getModifiers() using the legacy
        // BUTTON1_MASK/BUTTON2_MASK/BUTTON3_MASK bits (16/8/4) - MouseInputTracker reads
        // those bits instead of getButton(). event.buttons is the live pressed-buttons bitmask.
        val buttons = event.buttons.toInt()
        if (buttons and 1 != 0) mods = mods or 16
        if (buttons and 4 != 0) mods = mods or 8
        if (buttons and 2 != 0) mods = mods or 4
        return mods
    }
}