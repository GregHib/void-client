package awt

import awt.event.FocusEvent
import awt.event.FocusEventId
import awt.event.FocusListener
import awt.event.Key
import awt.event.KeyEvent
import awt.event.KeyListener
import awt.event.MouseEvent
import awt.event.MouseListener
import awt.event.MouseMotionListener
import awt.event.MouseWheelEvent
import awt.event.MouseWheelListener
import awt.image.ImageObserver
import org.w3c.dom.CanvasRenderingContext2D
import kotlinx.browser.window
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLElement

/**
 * Not part of Kotlin/JS's org.w3c.dom bindings. Used to keep [Component.getWidth]/[Component.getHeight]
 * cheap: reading `clientWidth`/`clientHeight` directly forces a synchronous browser layout flush, which
 * is expensive when polled every game tick (as Client.method116 does). Observing the element instead
 * lets us cache the size and only refresh it when the browser reports an actual change.
 */
external class ResizeObserver(callback: (Array<dynamic>, ResizeObserver) -> Unit) {
    fun observe(target: org.w3c.dom.Element)
    fun disconnect()
}

actual abstract class Component : ImageObserver {
    abstract val element: HTMLElement

    private var visible: Boolean = true
    private var background: Color = Color(255, 255, 255)
    private var repaintScheduled: Boolean = false
    internal var ignoreRepaintFlag: Boolean = false
    internal var parent: Container? = null

    private var cachedClientWidth: Int = -1
    private var cachedClientHeight: Int = -1
    private var sizeObserver: ResizeObserver? = null

    var onPaint: ((Graphics) -> Unit)? = null

    private val keyListeners = mutableListOf<KeyListener>()
    private val focusListeners = mutableListOf<FocusListener>()
    private val mouseListeners = mutableListOf<MouseListener>()
    private val mouseMotionListeners = mutableListOf<MouseMotionListener>()
    private val mouseWheelListeners = mutableListOf<MouseWheelListener>()
    private var domListenersAttached = false

    actual fun setSize(width: Int, height: Int) {
        val canvas = element as? HTMLCanvasElement
        if (canvas != null && canvas.width == width && canvas.height == height) return
        canvas?.let { it.width = width; it.height = height }
        element.style.width = "${width}px"
        element.style.height = "${height}px"
    }

    actual fun getWidth(): Int {
        (element as? HTMLCanvasElement)?.let { return it.width }
        ensureSizeObserved()
        return cachedClientWidth
    }

    actual fun getHeight(): Int {
        (element as? HTMLCanvasElement)?.let { return it.height }
        ensureSizeObserved()
        return cachedClientHeight
    }

    /** Lazily starts observing [element]'s box size so [getWidth]/[getHeight] can return a cached value
     * instead of forcing a synchronous layout read on every call. Only relevant for non-canvas elements
     * (canvas width/height are plain field reads already). */
    private fun ensureSizeObserved() {
        if (sizeObserver != null) return
        cachedClientWidth = element.clientWidth
        cachedClientHeight = element.clientHeight
        sizeObserver = ResizeObserver { _, _ ->
            cachedClientWidth = element.clientWidth
            cachedClientHeight = element.clientHeight
        }.also { it.observe(element) }
    }

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

    actual fun requestFocus() {
        // Canvas/div elements aren't focusable without a tabindex.
        if (element.getAttribute("tabindex") == null) element.setAttribute("tabindex", "0")
        element.focus()
    }

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

    actual override fun imageUpdate(img: Image, infoflags: Int, x: Int, y: Int, width: Int, height: Int): Boolean = false

    actual fun getParent(): Container = parent ?: rootContainer

    actual fun setCursor(cursor: Cursor?) {
        element.style.cursor = cursor?.toCssCursor() ?: "auto"
    }

    actual fun getToolkit(): Toolkit = DefaultToolkit()

    internal fun resetDomListeners() {
        domListenersAttached = false
        ensureDomListeners()
    }

    private fun ensureDomListeners() {
        if (domListenersAttached) return
        domListenersAttached = true
        if (element.getAttribute("tabindex") == null) element.setAttribute("tabindex", "0")

        element.addEventListener("keydown", { event ->
            val keyboardEvent = event as org.w3c.dom.events.KeyboardEvent
            val pressed = KeyEvent.from(keyboardEvent, Key.KEY_PRESSED)
            keyListeners.toList().forEach { it.keyPressed(pressed) }
            if (keyboardEvent.key.length == 1) {
                val typed = KeyEvent.from(keyboardEvent, Key.KEY_TYPED)
                keyListeners.toList().forEach { it.keyTyped(typed) }
            }
        })
        element.addEventListener("keyup", { event ->
            val keyboardEvent = event as org.w3c.dom.events.KeyboardEvent
            val released = KeyEvent.from(keyboardEvent, Key.KEY_RELEASED)
            keyListeners.toList().forEach { it.keyReleased(released) }
        })

        element.addEventListener("focus", {
            val focusEvent = FocusEvent.of(FocusEventId.FOCUS_GAINED)
            focusListeners.toList().forEach { it.focusGained(focusEvent) }
        })
        element.addEventListener("blur", {
            val focusEvent = FocusEvent.of(FocusEventId.FOCUS_LOST)
            focusListeners.toList().forEach { it.focusLost(focusEvent) }
        })

        element.addEventListener("mousedown", { event ->
            event.preventDefault()
            element.focus()
            val mouseEvent = MouseEvent(event as org.w3c.dom.events.MouseEvent)
            mouseListeners.toList().forEach { it.mousePressed(mouseEvent) }
        })
        element.addEventListener("mouseup", { event ->
            val mouseEvent = MouseEvent(event as org.w3c.dom.events.MouseEvent)
            mouseListeners.toList().forEach { it.mouseReleased(mouseEvent) }
        })
        element.addEventListener("click", { event ->
            val mouseEvent = MouseEvent(event as org.w3c.dom.events.MouseEvent)
            mouseListeners.toList().forEach { it.mouseClicked(mouseEvent) }
        })
        element.addEventListener("mouseenter", { event ->
            val mouseEvent = MouseEvent(event as org.w3c.dom.events.MouseEvent)
            mouseListeners.toList().forEach { it.mouseEntered(mouseEvent) }
        })
        element.addEventListener("mouseleave", { event ->
            val mouseEvent = MouseEvent(event as org.w3c.dom.events.MouseEvent)
            mouseListeners.toList().forEach { it.mouseExited(mouseEvent) }
        })
        element.addEventListener("mousemove", { event ->
            val domMouseEvent = event as org.w3c.dom.events.MouseEvent
            val mouseEvent = MouseEvent(domMouseEvent)
            if (domMouseEvent.buttons.toInt() != 0) {
                mouseMotionListeners.toList().forEach { it.mouseDragged(mouseEvent) }
            } else {
                mouseMotionListeners.toList().forEach { it.mouseMoved(mouseEvent) }
            }
        })
        element.addEventListener("wheel", { event ->
            event.preventDefault()
            val mouseWheelEvent = MouseWheelEvent(event as org.w3c.dom.events.WheelEvent)
            mouseWheelListeners.toList().forEach { it.mouseWheelMoved(mouseWheelEvent) }
        })
        // The game handles right-click itself via isPopupTrigger(); the browser's own
        // context menu would otherwise pop up over the canvas on every right-click.
        element.addEventListener("contextmenu", { event -> event.preventDefault() })
    }

    actual fun addKeyListener(keyListener: KeyListener) {
        ensureDomListeners()
        keyListeners += keyListener
    }

    actual fun addFocusListener(focusListener: FocusListener) {
        ensureDomListeners()
        focusListeners += focusListener
    }

    actual fun removeKeyListener(keyListener: KeyListener) {
        keyListeners -= keyListener
    }

    actual fun removeFocusListener(focusListener: FocusListener) {
        focusListeners -= focusListener
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
        ensureDomListeners()
        mouseListeners += mouseListener
    }

    actual fun addMouseMotionListener(mouseMotionListener: MouseMotionListener) {
        ensureDomListeners()
        mouseMotionListeners += mouseMotionListener
    }

    actual fun addMouseWheelListener(mouseWheelListener: MouseWheelListener) {
        ensureDomListeners()
        mouseWheelListeners += mouseWheelListener
    }

    actual fun removeMouseListener(mouseListener: MouseListener) {
        mouseListeners -= mouseListener
    }

    actual fun removeMouseMotionListener(mouseMotionListener: MouseMotionListener) {
        mouseMotionListeners -= mouseMotionListener
    }

    actual fun removeMouseWheelListener(mouseWheelListener: MouseWheelListener) {
        mouseWheelListeners -= mouseWheelListener
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
