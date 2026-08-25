package awt.event

expect class MouseWheelEvent {
    fun getX(): Int
    fun getY(): Int
    fun getWheelRotation(): Int
    fun consume()
}