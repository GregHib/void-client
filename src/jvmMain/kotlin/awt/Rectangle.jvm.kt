package awt

actual typealias Rectangle = java.awt.Rectangle

actual var Rectangle.left: Int
    get() = x
    set(value) { x = value }

actual var Rectangle.top: Int
    get() = y
    set(value) { y = value }

actual var Rectangle.w: Int
    get() = width
    set(value) { width = value }

actual var Rectangle.h: Int
    get() = height
    set(value) { height = value }