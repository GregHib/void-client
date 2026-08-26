package awt

import awt.event.FocusListener
import awt.event.KeyListener
import awt.event.MouseListener
import awt.event.MouseMotionListener
import awt.event.MouseWheelListener
import awt.image.ImageObserver
import org.w3c.dom.CanvasRenderingContext2D
import kotlinx.browser.window
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLElement

actual abstract class Component : ImageObserver {
    // plain members, no `actual` — platform storage only
    abstract val element: HTMLElement

    private var visible: Boolean = true
    private var background: Color = Color(255, 255, 255)
    private var repaintScheduled: Boolean = false
    internal var ignoreRepaintFlag: Boolean = false
    internal var parent: Container? = null

    var onPaint: ((Graphics) -> Unit)? = null

    actual fun setSize(width: Int, height: Int) {
        val canvas = element as? HTMLCanvasElement
        // Assigning canvas.width/height clears the surface AND resets the 2D context state,
        // including the ctx.save() CanvasGraphics anchors its clip stack on. GameAppletFrame
        // .method88 re-sizes the render canvas every 50 draws, so without this guard the screen
        // would blank periodically and the cached Graphics would be left with a stale stack.
        if (canvas != null && canvas.width == width && canvas.height == height) return
        canvas?.let { it.width = width; it.height = height }
        element.style.width = "${width}px"
        element.style.height = "${height}px"
    }

    actual fun getWidth(): Int =
        (element as? HTMLCanvasElement)?.width ?: element.clientWidth

    actual fun getHeight(): Int =
        (element as? HTMLCanvasElement)?.height ?: element.clientHeight

    actual fun getX(): Int = element.offsetLeft
    actual fun getY(): Int = element.offsetTop

    actual fun setBounds(x: Int, y: Int, width: Int, height: Int) {
        element.style.position = "absolute"
        element.style.left = "${x}px"
        element.style.top = "${y}px"
        setSize(width, height)
    }

    actual fun getBounds(): Rectangle = Rectangle(getX(), getY(), getWidth(), getHeight())

    actual fun repaint() {
        if (ignoreRepaintFlag || repaintScheduled) return
        repaintScheduled = true
        window.requestAnimationFrame {
            repaintScheduled = false
            onPaint?.invoke(getGraphics())
        }
    }

    actual fun setVisible(visible: Boolean) {
        this.visible = visible
        element.style.display = if (visible) "block" else "none"
    }

    actual fun isVisible(): Boolean = visible
    actual fun requestFocus() { element.focus() }

    actual fun setBackground(c: Color) {
        background = c
        element.style.backgroundColor = c.css()
    }

    actual fun getBackground(): Color = background

    // AWT hands out a *fresh* Graphics with identity transform and no clip on every call, and
    // callers rely on that - caching one instance would let an earlier caller's translate() and
    // clip leak into every later draw. CanvasGraphics' init resets the surface state for us.
    actual fun getGraphics(): Graphics {
        val canvas = element as? HTMLCanvasElement
            ?: error("getGraphics() requires a canvas-backed component")
        return CanvasGraphics(canvas.getContext("2d") as CanvasRenderingContext2D)
    }

    actual override fun imageUpdate(img: Image, infoflags: Int, x: Int, y: Int, width: Int, height: Int): Boolean = false

    actual fun getParent(): Container = parent ?: rootContainer

    actual fun setCursor(cursor: Cursor?) {
    }

    actual fun getToolkit(): Toolkit = DefaultToolkit()

    actual fun addKeyListener(keyListener: KeyListener) {
    }

    actual fun addFocusListener(focusListener: FocusListener) {
    }

    actual fun removeKeyListener(keyListener: KeyListener) {
    }

    actual fun removeFocusListener(focusListener: FocusListener) {
    }

    actual fun isShowing(): Boolean = visible

    actual fun setIgnoreRepaint(ignore: Boolean) {
        ignoreRepaintFlag = ignore
    }

    actual fun setLocation(x: Int, y: Int) {
        element.style.position = "absolute"
        element.style.left = "${x}px"
        element.style.top = "${y}px"
    }

    actual fun prepareImage(image: Image, observer: ImageObserver): Boolean = true

    actual open fun update(graphics: Graphics?) {
        paint(graphics)
    }

    actual open fun paint(graphics: Graphics?) {
    }

    actual fun addMouseListener(mouseListener: MouseListener) {
    }

    actual fun addMouseMotionListener(mouseMotionListener: MouseMotionListener) {
    }

    actual fun addMouseWheelListener(mouseWheelListener: MouseWheelListener) {
    }

    actual fun removeMouseListener(mouseListener: MouseListener) {
    }

    actual fun removeMouseMotionListener(mouseMotionListener: MouseMotionListener) {
    }

    actual fun removeMouseWheelListener(mouseWheelListener: MouseWheelListener) {
    }

    actual fun getFontMetrics(font: Font): FontMetrics {
        val canvas = element as? HTMLCanvasElement
            ?: error("getFontMetrics() requires a canvas-backed component")
        return CanvasFontMetrics(canvas.getContext("2d") as CanvasRenderingContext2D, font)
    }
}

actual val Component.pxWidth: Int get() = getWidth()
actual val Component.pxHeight: Int get() = getHeight()

actual var Component.ignoreRepaint: Boolean
    get() = ignoreRepaintFlag
    set(value) { ignoreRepaintFlag = value }