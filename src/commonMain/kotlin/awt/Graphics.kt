package awt

import awt.image.ImageObserver

expect abstract class Graphics {
    abstract fun dispose()
    abstract fun translate(x: Int, y: Int)
    abstract fun setColor(c: Color?)
    abstract fun getColor(): Color
    abstract fun setFont(font: Font?)
    abstract fun getFont(): Font
    abstract fun clearRect(x: Int, y: Int, width: Int, height: Int)
    abstract fun drawLine(x1: Int, y1: Int, x2: Int, y2: Int)
    abstract fun fillRect(x: Int, y: Int, width: Int, height: Int)
    abstract fun drawOval(x: Int, y: Int, width: Int, height: Int)
    abstract fun fillOval(x: Int, y: Int, width: Int, height: Int)
    abstract fun drawString(str: String?, x: Int, y: Int)
    abstract fun setClip(x: Int, y: Int, width: Int, height: Int)
    abstract fun setClip(shape: Shape?)
    abstract fun clipRect(x: Int, y: Int, width: Int, height: Int)
    abstract fun getClipBounds(): Rectangle
    abstract fun getClip(): Shape
    abstract fun drawImage(img: Image?, x: Int, y: Int, observer: ImageObserver?): Boolean
    fun drawRect(x: Int, y: Int, width: Int, height: Int)
}
