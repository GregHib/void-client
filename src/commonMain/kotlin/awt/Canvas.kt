package awt

expect open class Canvas() {
    fun setSize(width: Int, height: Int)
    fun getWidth(): Int
    fun getHeight(): Int
    fun setBounds(x: Int, y: Int, width: Int, height: Int)
    fun repaint()
    fun setVisible(visible: Boolean)
    fun isVisible(): Boolean
    fun requestFocus()
    fun getGraphics(): Graphics
    fun createImage(width: Int, height: Int): Image
}

// Property-style API, same shape as your Rectangle extensions
expect var Canvas.ignoreRepaint: Boolean
expect val Canvas.pxWidth: Int
expect val Canvas.pxHeight: Int