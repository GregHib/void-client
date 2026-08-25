package awt

expect interface Shape {
    fun getBounds(): Rectangle
    fun contains(x: Double, y: Double): Boolean
    fun contains(x: Double, y: Double, w: Double, h: Double): Boolean
    fun intersects(x: Double, y: Double, w: Double, h: Double): Boolean
}