package awt

import awt.event.FocusListener
import awt.event.KeyListener
import awt.image.ImageObserver

expect abstract class Component : ImageObserver {
    fun setSize(width: Int, height: Int)
    fun getWidth(): Int
    fun getHeight(): Int
    fun getParent(): Container
    fun getX(): Int
    fun getY(): Int
    fun isShowing(): Boolean
    fun setIgnoreRepaint(ignore: Boolean)
    fun setLocation(x: Int, y: Int)
    fun setBounds(x: Int, y: Int, width: Int, height: Int)
    fun getBounds(): Rectangle
    fun repaint()
    fun setVisible(visible: Boolean)
    fun isVisible(): Boolean
    fun requestFocus()
    fun setBackground(c: Color)
    fun getBackground(): Color
    fun getGraphics(): Graphics
    fun setCursor(cursor: Cursor?)
    fun getToolkit(): Toolkit
    fun getInsets(): Insets
    fun prepareImage(image: Image, observer: ImageObserver)
    open fun update(graphics: Graphics?)
    open fun paint(graphics: Graphics?)
    fun addKeyListener(keyListener: KeyListener)
    fun addFocusListener(focusListener: FocusListener)
    fun removeKeyListener(keyListener: KeyListener)
    fun removeFocusListener(focusListener: FocusListener)
    fun getFontMetrics(font: Font): FontMetrics
    override fun imageUpdate(img: Image, infoflags: Int, x: Int, y: Int, width: Int, height: Int): Boolean
}

expect val Component.pxWidth: Int
expect val Component.pxHeight: Int
expect var Component.ignoreRepaint: Boolean