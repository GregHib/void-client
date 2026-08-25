package awt

import awt.image.ImageObserver

expect open class Window : Container, ImageObserver {
    fun pack()
    fun dispose()
    fun toFront()
    fun toBack()
    fun setLocationRelativeTo(c: Component)
    override fun imageUpdate(img: Image, infoflags: Int, x: Int, y: Int, width: Int, height: Int): Boolean
}
