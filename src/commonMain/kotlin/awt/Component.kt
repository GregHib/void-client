package awt

expect abstract class Component {
    fun setSize(width: Int, height: Int)
    fun getWidth(): Int
    fun getHeight(): Int
    fun getX(): Int
    fun getY(): Int
    fun setBounds(x: Int, y: Int, width: Int, height: Int)
    fun getBounds(): Rectangle
    fun repaint()
    fun setVisible(visible: Boolean)
    fun isVisible(): Boolean
    fun requestFocus()
    fun setBackground(c: Color)
    fun getBackground(): Color
    fun getGraphics(): Graphics
}

expect val Component.pxWidth: Int
expect val Component.pxHeight: Int
expect var Component.ignoreRepaint: Boolean