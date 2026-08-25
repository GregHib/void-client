package awt

actual typealias Component = java.awt.Component

actual val Component.pxWidth: Int get() = getWidth()
actual val Component.pxHeight: Int get() = getHeight()

actual var Component.ignoreRepaint: Boolean
    get() = ignoreRepaint
    set(value) { setIgnoreRepaint(value) }