package awt


actual typealias Canvas = java.awt.Canvas

actual var Canvas.ignoreRepaint: Boolean
    get() = ignoreRepaint
    set(value) { setIgnoreRepaint(value) }

actual val Canvas.pxWidth: Int get() = getWidth()
actual val Canvas.pxHeight: Int get() = getHeight()