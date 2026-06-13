/**
 * Common callback interface that replaces [java.awt.event.FocusListener] and
 * [java.awt.event.WindowListener] on [Applet_Sub1].
 *
 * [AwtWindowShell] wires real AWT listeners to the canvas/frame and forwards the
 * meaningful events here. Common code only sees this interface — no AWT types leak
 * into [Applet_Sub1].
 *
 * Also used as the repaint-notification sink: when the platform needs the game to
 * redraw (AWT calls [java.awt.Component.paint] / [java.awt.Component.update]),
 * [AwtWindowShell] calls [onRepaintRequested] instead of routing through
 * [DisplayTarget.requestRepaint] (which is the renderer's blit-failure path).
 */
interface AppletWindowCallbacks {
    /** Canvas gained keyboard focus. */
    fun onFocusGained()

    /** Canvas lost keyboard focus. */
    fun onFocusLost()

    /**
     * The platform window was asked to close (e.g. user clicked the ✕ button).
     * Implementations should call [Applet_Sub1.destroy].
     */
    fun onWindowClosing()

    /**
     * The platform requested a repaint of the game surface (AWT paint/update callback,
     * or equivalent on other platforms). Implementations set the dirty flag so the game
     * loop re-renders on the next tick.
     *
     * @param fullSurface  true when the repaint covers the entire canvas (clip == bounds),
     *                     false when only a partial region was invalidated. Common code may
     *                     use this to decide between a full re-render vs. a partial blit.
     */
    fun onRepaintRequested(fullSurface: Boolean)
}
