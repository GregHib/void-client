package awt

import kotlinx.browser.document
import org.w3c.dom.HTMLCanvasElement

actual open class Canvas actual constructor() {
    val element: HTMLCanvasElement =
        document.createElement("canvas") as HTMLCanvasElement

    // plain members — no `actual`, this is just platform storage
    internal var ignoreRepaintFlag: Boolean = false
    private var visible: Boolean = true
    private var repaintScheduled: Boolean = false

    var onRender: ((Canvas) -> Unit)? = null

    actual fun setSize(width: Int, height: Int) {
        element.width = width
        element.height = height
    }

    actual fun getWidth(): Int = element.width
    actual fun getHeight(): Int = element.height

    actual fun setBounds(x: Int, y: Int, width: Int, height: Int) {
        element.style.position = "absolute"
        element.style.left = "${x}px"
        element.style.top = "${y}px"
        setSize(width, height)
    }

    actual fun repaint() {
        if (ignoreRepaintFlag || repaintScheduled) return
        repaintScheduled = true
        kotlinx.browser.window.requestAnimationFrame {
            repaintScheduled = false
            onRender?.invoke(this)
        }
    }

    actual fun setVisible(visible: Boolean) {
        this.visible = visible
        element.style.display = if (visible) "block" else "none"
    }

    actual fun isVisible(): Boolean = visible
    actual fun requestFocus() { element.focus() }
    actual fun getGraphics(): Graphics = TODO()

}

actual var Canvas.ignoreRepaint: Boolean
    get() = ignoreRepaintFlag
    set(value) { ignoreRepaintFlag = value }

actual val Canvas.pxWidth: Int get() = getWidth()
actual val Canvas.pxHeight: Int get() = getHeight()