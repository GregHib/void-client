package awt

expect class Point(x: Int, y: Int) {
    constructor()
    fun translate(dx: Int, dy: Int)
    fun move(x: Int, y: Int)
    fun setLocation(x: Int, y: Int)
    fun getLocation(): Point
}

expect var Point.px: Int
expect var Point.py: Int