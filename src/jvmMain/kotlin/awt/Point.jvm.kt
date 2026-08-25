package awt

actual typealias Point = java.awt.Point

actual var Point.px: Int
    get() = x
    set(value) { x = value }

actual var Point.py: Int
    get() = y
    set(value) { y = value }