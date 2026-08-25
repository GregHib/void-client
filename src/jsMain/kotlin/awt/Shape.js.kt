package awt

actual interface Shape {
    actual fun getBounds(): Rectangle
    actual fun contains(x: Double, y: Double): Boolean
    actual fun contains(x: Double, y: Double, w: Double, h: Double): Boolean
    actual fun intersects(x: Double, y: Double, w: Double, h: Double): Boolean
}