import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.events.Event

/**
 * JS [WindowShell]: creates and owns a `<canvas>` element, serves as [DisplayTarget],
 * and bridges DOM focus/resize events to [AppletWindowCallbacks].
 *
 * Lifecycle:
 *  1. Constructed at boot; appends a `<canvas>` to `document.body`.
 *  2. [provideDisplayTarget] sizes the canvas and wires focus/resize DOM listeners.
 *  3. [repositionCanvas] updates canvas size to match the current layout.
 *  4. [releaseDisplayTarget] removes DOM listeners and hides the canvas.
 *  5. [shutdown] removes the canvas from the DOM entirely.
 *
 * JS has no concept of an AWT Frame, so [isFullscreen], [createFrame], [forceToolkitInit],
 * and [tryAdoptHostCanvas] are all no-ops / constant returns.
 */
class JsWindowShell : WindowShell, DisplayTarget {

    // ── <canvas> element ──────────────────────────────────────────────────────

    private val canvas: HTMLCanvasElement =
        (document.createElement("canvas") as HTMLCanvasElement).also { c ->
            c.id = "game-canvas"
            // Basic styling: block element so it sits flush in the page flow.
            c.style.display = "block"
            c.style.background = "#000000"
            // Make it focusable for keyboard input.
            c.setAttribute("tabindex", "0")
            document.body?.appendChild(c)
                ?: error("JsWindowShell: document.body is null — ensure JS runs after DOMContentLoaded")
        }

    // ── DisplayTarget (self) ──────────────────────────────────────────────────

    override val width: Int  get() = canvas.width
    override val height: Int get() = canvas.height

    override fun requestRepaint() {
        // In a rAF-driven loop there is nothing to do; the next animation frame will redraw.
    }

    // ── WindowShell ───────────────────────────────────────────────────────────

    override val isFullscreen: Boolean get() = false

    override val clientWidth: Int  get() = canvas.clientWidth.takeIf { it > 0 } ?: canvas.width
    override val clientHeight: Int get() = canvas.clientHeight.takeIf { it > 0 } ?: canvas.height

    private var _currentDisplayTarget: DisplayTarget? = null
    override val currentDisplayTarget: DisplayTarget? get() = _currentDisplayTarget

    // Active DOM listeners — retained so they can be removed on release.
    private var focusListener: ((Event) -> Unit)? = null
    private var blurListener:  ((Event) -> Unit)? = null
    private var resizeListener: ((Event) -> Unit)? = null
    private var activeCallbacks: AppletWindowCallbacks? = null

    override fun provideDisplayTarget(
        x: Int, y: Int, width: Int, height: Int,
        callbacks: AppletWindowCallbacks,
    ): DisplayTarget {
        // Remove previous listeners if any.
        releaseListeners()

        canvas.width  = width
        canvas.height = height
        canvas.style.width  = "${width}px"
        canvas.style.height = "${height}px"
        canvas.style.display = "block"

        // Focus/blur → AppletWindowCallbacks.
        val onFocus: (Event) -> Unit = { callbacks.onFocusGained() }
        val onBlur:  (Event) -> Unit = { callbacks.onFocusLost() }
        canvas.addEventListener("focus", onFocus)
        canvas.addEventListener("blur",  onBlur)
        focusListener = onFocus
        blurListener  = onBlur

        // Window resize → resize canvas to match and notify callbacks.
        val onResize: (Event) -> Unit = { _ ->
            val newW = window.innerWidth
            val newH = window.innerHeight
            canvas.width  = newW
            canvas.height = newH
            canvas.style.width  = "${newW}px"
            canvas.style.height = "${newH}px"
            // Repaint request lets the game loop know it should redraw.
            callbacks.onRepaintRequested(fullSurface = true)
        }
        window.addEventListener("resize", onResize)
        resizeListener = onResize

        activeCallbacks = callbacks

        // Focus the canvas so keyboard events arrive immediately.
        canvas.focus()

        _currentDisplayTarget = this
        return this
    }

    override fun repositionCanvas(x: Int, y: Int, width: Int, height: Int) {
        canvas.width  = width
        canvas.height = height
        canvas.style.width  = "${width}px"
        canvas.style.height = "${height}px"
        // x/y positioning — use CSS left/top with position:absolute if the host page
        // uses an absolute-positioned container; otherwise ignore (flow layout).
        canvas.style.position = "absolute"
        canvas.style.left = "${x}px"
        canvas.style.top  = "${y}px"
    }

    override fun releaseDisplayTarget(callbacks: AppletWindowCallbacks) {
        releaseListeners()
        canvas.style.display = "none"
        _currentDisplayTarget = null
    }

    override fun shutdown() {
        releaseListeners()
        canvas.parentNode?.removeChild(canvas)
        _currentDisplayTarget = null
    }

    /** No-op: browser toolkits do not need a warm-up dance. */
    override fun forceToolkitInit() {}

    /** No-op: host-canvas reflection is a JVM-only concept. */
    override fun tryAdoptHostCanvas(): Boolean = false

    // ── helpers ───────────────────────────────────────────────────────────────

    private fun releaseListeners() {
        focusListener?.let  { canvas.removeEventListener("focus",  it) }
        blurListener?.let   { canvas.removeEventListener("blur",   it) }
        resizeListener?.let { window.removeEventListener("resize", it) }
        focusListener  = null
        blurListener   = null
        resizeListener = null
        activeCallbacks = null
    }
}
