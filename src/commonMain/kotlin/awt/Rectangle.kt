package awt

expect class Rectangle(x: Int, y: Int, width: Int, height: Int) : Shape {
    constructor()
    fun translate(dx: Int, dy: Int)
    fun grow(h: Int, v: Int)
    fun contains(x: Int, y: Int): Boolean
    fun intersects(r: Rectangle): Boolean
    fun isEmpty(): Boolean
    fun setBounds(x: Int, y: Int, width: Int, height: Int)
    override fun getBounds(): Rectangle
    override fun contains(x: Double, y: Double): Boolean
    override fun contains(x: Double, y: Double, w: Double, h: Double): Boolean
    override fun intersects(x: Double, y: Double, w: Double, h: Double): Boolean
}

expect var Rectangle.left: Int
expect var Rectangle.top: Int
expect var Rectangle.w: Int
expect var Rectangle.h: Int