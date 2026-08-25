package awt

expect open class Window : Container {
    fun pack()
    fun dispose()
    fun toFront()
    fun toBack()
    fun setLocationRelativeTo(c: Component)
}
