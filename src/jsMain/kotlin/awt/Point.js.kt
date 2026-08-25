package awt

actual class Point actual constructor(var x: Int, var y: Int) {
    actual fun translate(dx: Int, dy: Int) { x += dx; y += dy }
    actual fun move(x: Int, y: Int) { this.x = x; this.y = y }
    actual fun setLocation(x: Int, y: Int) = move(x, y)
    actual fun getLocation(): Point = Point(x, y)

    actual constructor() : this(0, 0)
}

actual var Point.px: Int
    get() = x
    set(value) { x = value }

actual var Point.py: Int
    get() = y
    set(value) { y = value }