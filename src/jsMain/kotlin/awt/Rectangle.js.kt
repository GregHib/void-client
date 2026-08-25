package awt

// jsMain (repeat per leaf target)
actual class Rectangle actual constructor(
    var x: Int, var y: Int, var width: Int, var height: Int
) {
    actual fun translate(dx: Int, dy: Int) { x += dx; y += dy }
    actual fun grow(h: Int, v: Int) { x -= h; y -= v; width += h * 2; height += v * 2 }
    actual fun contains(x: Int, y: Int) =
        x >= this.x && x < this.x + width && y >= this.y && y < this.y + height
    actual fun intersects(r: Rectangle) =
        x < r.x + r.width && x + width > r.x && y < r.y + r.height && y + height > r.y
    actual fun isEmpty() = width <= 0 || height <= 0
    actual fun setBounds(x: Int, y: Int, width: Int, height: Int) {
        this.x = x; this.y = y; this.width = width; this.height = height
    }
}

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