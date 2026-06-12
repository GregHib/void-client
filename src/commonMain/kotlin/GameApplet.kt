/**
 * Common applet / bootstrap contract.
 *
 * Originally `jvmMain` with `getPulseComponent(): java.awt.Component?` — that return type was
 * the last AWT reference preventing this interface from moving to `commonMain`. It is replaced
 * by `getPulseComponent(): DisplayTarget?` as part of the Phase 4 [WindowShell] seam
 * (docs/PHASE4_LOGIN_SCREEN_ANALYSIS.md §4.1).
 *
 * JVM implementors ([Client]) return the [AwtDisplayTarget] that wraps the current canvas,
 * which serves the same "give me the focus/repaint handle" role the old `Component?` did.
 * Web/native implementors return their own [DisplayTarget] impl.
 */
interface GameApplet {
    fun getParameter(name: String?): String?
    fun getCodeBase(): String?
    fun getDocumentBase(): String?
    fun destroy()

    /**
     * Returns the [DisplayTarget] that should receive focus / repaint notifications from the
     * platform. Returns `null` if no surface has been created yet.
     *
     * Replaces `getPulseComponent(): java.awt.Component?` from the original JVM interface.
     */
    fun getPulseComponent(): DisplayTarget?

    fun showDocument(url: String?, target: String?)
}
