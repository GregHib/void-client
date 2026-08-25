package awt.event

expect class MouseEvent {
    fun getX(): Int
    fun getY(): Int
    fun getClickCount(): Int
    fun consume()
    fun isPopupTrigger(): Boolean
    fun getModifiers(): Int
    fun getButton(): Int
    fun isMetaDown(): Boolean
}