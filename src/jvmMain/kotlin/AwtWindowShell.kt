import java.awt.Color
import java.awt.Container
import java.awt.Frame
import java.awt.event.FocusListener

/**
 * JVM [WindowShell]: wraps the AWT `Frame`/`Panel`/`Canvas` window shell.
 *
 * Captures the last cluster of AWT calls that was wired directly into `Applet_Sub1` and
 * `Client` (see docs/PHASE4_LOGIN_SCREEN_ANALYSIS.md §4.1):
 *
 *  - `Class52.aFrame4904`  — the standalone JFrame that hosts the canvas when launched via [Loader].
 *  - `Class34.aFrame476`   — set when in full-screen mode; non-null means fullscreen.
 *  - `Class348_Sub40_Sub9.anApplet_Sub1_9169` — the `Applet_Sub1` root panel, used as fallback
 *    container when no `Frame` is present (browser-applet legacy path).
 *  - `Canvas_Sub1` creation, sizing, focus wiring in `Applet_Sub1.method87`.
 *  - Inset-aware client-area size queries in `Client.method116` and `Applet_Sub1.method87`/`method88`.
 *  - Frame hide+dispose in `Applet_Sub1.method90`.
 *
 * This class is instantiated once by [Loader] (JVM entry point) and stored as a global so the
 * existing static sites in `Class52`/`Class34` can read back the same handle until those sites
 * are moved to common code and injected properly.
 */
class AwtWindowShell(
    /** The applet/panel root used as container when no Frame is present. */
    private val appletRoot: Container,
) : WindowShell {

    // ── frame handles (mirrors Class52.aFrame4904 / Class34.aFrame476) ──────────

    /** The standalone Frame that hosts the canvas (non-null when launched via Loader). */
    var frame: Frame? = null
        private set

    /** Non-null when the client is in a dedicated full-screen Frame. */
    var fullscreenFrame: Frame? = null
        private set

    // ── canvas / display-target ───────────────────────────────────────────────

    private var _canvas: Canvas_Sub1? = null
    private var _displayTarget: AwtDisplayTarget? = null

    override val currentDisplayTarget: DisplayTarget? get() = _displayTarget

    // ── WindowShell contract ─────────────────────────────────────────────────

    override val isFullscreen: Boolean get() = fullscreenFrame != null

    override val clientWidth: Int
        get() {
            if (fullscreenFrame != null) return fullscreenFrame!!.size.width
            return when {
                frame != null -> {
                    val insets = frame!!.insets
                    frame!!.size.width - insets.left - insets.right
                }
                else -> appletRoot.size.width
            }
        }

    override val clientHeight: Int
        get() {
            if (fullscreenFrame != null) return fullscreenFrame!!.size.height
            return when {
                frame != null -> {
                    val insets = frame!!.insets
                    frame!!.size.height - insets.top - insets.bottom
                }
                else -> appletRoot.size.height
            }
        }

    override fun provideDisplayTarget(x: Int, y: Int, width: Int, height: Int, focusListener: Any): DisplayTarget {
        val container = resolveContainer()

        // remove old canvas if present
        _canvas?.let { old ->
            (focusListener as? FocusListener)?.let { old.removeFocusListener(it) }
            old.parent?.let { p ->
                p.background = Color.black
                p.remove(old)
            }
        }

        container.layout = null
        val canvas = Canvas_Sub1(appletRoot)
        val target = AwtDisplayTarget(canvas)
        _canvas = canvas
        _displayTarget = target

        // mirror into Class305 for existing code that still reads the statics
        Class305.aCanvas3869 = canvas
        Class305.aDisplayTarget3869 = target

        container.add(canvas)
        canvas.setSize(width, height)
        canvas.isVisible = true
        canvas.setLocation(
            if (container === frame) frame!!.insets.left + x else x,
            if (container === frame) frame!!.insets.top + y else y,
        )
        (focusListener as? FocusListener)?.let { canvas.addFocusListener(it) }
        canvas.requestFocus()
        return target
    }

    override fun repositionCanvas(x: Int, y: Int, width: Int, height: Int) {
        val canvas = _canvas ?: return
        canvas.setSize(width, height)
        canvas.isVisible = true
        val f = frame
        if (f != null && fullscreenFrame == null) {
            val insets = f.insets
            canvas.setLocation(insets.left + x, insets.top + y)
        } else {
            canvas.setLocation(x, y)
        }
    }

    override fun releaseDisplayTarget(focusListener: Any) {
        val canvas = _canvas ?: return
        (focusListener as? FocusListener)?.let { canvas.removeFocusListener(it) }
        canvas.parent?.let { p ->
            p.background = Color.black
            p.remove(canvas)
        }
        _canvas = null
        _displayTarget = null
        Class305.aCanvas3869 = null
        Class305.aDisplayTarget3869 = null
    }

    override fun shutdown() {
        frame?.let {
            it.isVisible = false
            it.dispose()
            frame = null
        }
        Class52.aFrame4904 = null
    }

    // ── lifecycle helpers called by Loader / Applet_Sub1 ───────────────────────

    /**
     * Create and show the standalone [Frame] that hosts the canvas.
     * Mirrors the `Frame()` + size-from-insets block in `Applet_Sub1.method96`.
     *
     * @param windowListener  the `Applet_Sub1` instance (implements `WindowListener`); typed as
     *                        [Any] to avoid an AWT import at the call site.
     */
    fun createFrame(width: Int, height: Int, windowListener: Any) {
        val f = Frame()
        f.title = "Jagex"
        f.isResizable = true
        (windowListener as? java.awt.event.WindowListener)?.let { f.addWindowListener(it) }
        f.isVisible = true
        f.toFront()
        val insets = f.insets
        f.setSize(insets.left + insets.right + width, insets.top + insets.bottom + height)
        frame = f
        Class52.aFrame4904 = f
    }

    /** Set / clear the full-screen frame. Mirrors writes to `Class34.aFrame476`. */
    fun setFullscreenFrame(f: Frame?) {
        fullscreenFrame = f
        Class34.aFrame476 = f
    }

    // ── private helpers ──────────────────────────────────────────────────────

    /** The container the canvas lives in: fullscreen frame > standalone frame > applet panel. */
    private fun resolveContainer(): Container = when {
        fullscreenFrame != null -> fullscreenFrame as Container
        frame != null           -> frame as Container
        else                    -> appletRoot
    }

    companion object {
        /** Singleton set by [Loader] at boot; consumed by `Applet_Sub1` and `Client`. */
        var instance: AwtWindowShell? = null
    }
}
