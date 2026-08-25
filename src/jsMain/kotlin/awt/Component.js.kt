package awt

import org.w3c.dom.CanvasRenderingContext2D
import kotlinx.browser.window
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLElement

actual abstract class Component {
    // plain members, no `actual` — platform storage only
    abstract val element: HTMLElement

    private var visible: Boolean = true
    private var background: Color = Color(255, 255, 255)
    private var repaintScheduled: Boolean = false
    internal var ignoreRepaintFlag: Boolean = false

    var onPaint: ((Graphics) -> Unit)? = null

    actual fun setSize(width: Int, height: Int) {
        (element as? HTMLCanvasElement)?.let { it.width = width; it.height = height }
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

    actual fun getGraphics(): Graphics {
        val canvas = element as? HTMLCanvasElement
            ?: error("getGraphics() requires a canvas-backed component")
        return CanvasGraphics(canvas.getContext("2d") as CanvasRenderingContext2D)
    }
}

actual val Component.pxWidth: Int get() = getWidth()
actual val Component.pxHeight: Int get() = getHeight()

actual var Component.ignoreRepaint: Boolean
    get() = ignoreRepaintFlag
    set(value) { ignoreRepaintFlag = value }