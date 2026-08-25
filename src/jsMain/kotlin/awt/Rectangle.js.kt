package awt

// jsMain (repeat per leaf target)
actual class Rectangle actual constructor(
    var x: Int, var y: Int, var width: Int, var height: Int
) : Shape {
    actual constructor(): this(0, 0, 0, 0)
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

    override fun getBounds(): Rectangle = Rectangle(x, y, width, height)

    override fun contains(x: Double, y: Double): Boolean {
        if (width < 0 || height < 0) return false
        val rx = this.x.toDouble(); val ry = this.y.toDouble()
        val rw = this.width.toDouble(); val rh = this.height.toDouble()
        if (x < rx || y < ry) return false
        return x < rx + rw && y < ry + rh
    }

    override fun contains(x: Double, y: Double, w: Double, h: Double): Boolean {
        if (w < 0 || h < 0) return false
        val rx = this.x.toDouble(); val ry = this.y.toDouble()
        val rw = this.width.toDouble(); val rh = this.height.toDouble()
        if (x < rx || y < ry) return false
        if (w + h > rw + rh) return false
        return x + w <= rx + rw && y + h <= ry + rh
    }

    override fun intersects(x: Double, y: Double, w: Double, h: Double): Boolean {
        if (w < 0 || h < 0) return false
        val rx = this.x.toDouble(); val ry = this.y.toDouble()
        val rw = this.width.toDouble(); val rh = this.height.toDouble()
        if (x + w < rx || y + h < ry) return false
        if (x > rx + rw || y > ry + rh) return false
        return true
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