package awt

import awt.event.FocusListener
import awt.event.KeyListener
import awt.event.MouseListener
import awt.event.MouseMotionListener
import awt.event.MouseWheelListener
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
    fun prepareImage(image: Image, observer: ImageObserver): Boolean
    open fun update(graphics: Graphics?)
    open fun paint(graphics: Graphics?)
    fun addKeyListener(keyListener: KeyListener)
    fun addFocusListener(focusListener: FocusListener)
    fun removeKeyListener(keyListener: KeyListener)
    fun removeFocusListener(focusListener: FocusListener)
    fun addMouseListener(mouseListener: MouseListener)
    fun addMouseMotionListener(mouseMotionListener: MouseMotionListener)
    fun addMouseWheelListener(mouseWheelListener: MouseWheelListener)
    fun removeMouseListener(mouseListener: MouseListener)
    fun removeMouseMotionListener(mouseMotionListener: MouseMotionListener)
    fun removeMouseWheelListener(mouseWheelListener: MouseWheelListener)
    fun getFontMetrics(font: Font): FontMetrics
    override fun imageUpdate(img: Image, infoflags: Int, x: Int, y: Int, width: Int, height: Int): Boolean
}

expect val Component.pxWidth: Int
expect val Component.pxHeight: Int
expect var Component.ignoreRepaint: Boolean