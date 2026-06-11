/**
 * System text clipboard (part of the plan's "SystemServices" seam, replacing
 * java.awt.datatransfer.Clipboard).
 *
 * The client only ever reads/writes plain text. A null reference at the use sites means "no
 * clipboard available" (the old code guarded `aClipboard9357 != null` for headless/applet-denied
 * cases) — that convention is preserved by leaving the holding field nullable.
 *
 * JVM impl: AwtClipboard. Web: navigator.clipboard. Native: platform clipboard or a no-op.
 */
interface SystemClipboard {
    /** Current clipboard text, or null if empty/unreadable. */
    fun getText(): String?

    /** Replace the clipboard contents with [text]. */
    fun setText(text: String)
}
