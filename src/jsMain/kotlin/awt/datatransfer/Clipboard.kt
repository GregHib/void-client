package awt.datatransfer

import kotlinx.browser.window

actual class Clipboard actual constructor(private val name: String) {
    private var cached: Transferable? = null

    actual fun getName(): String = name

    actual fun setContents(contents: Transferable, owner: ClipboardOwner?) {
        val previous = cached
        cached = contents
        if (contents.isDataFlavorSupported(STRING_FLAVOR)) {
            val text = contents.getTransferData(STRING_FLAVOR) as? String
            if (text != null) {
                // Best-effort, fire-and-forget - the Clipboard API is async
                // and requires a user gesture / permission in most browsers.
                runCatching { window.navigator.asDynamic().clipboard?.writeText(text) }
            }
        }
        if (owner != null && previous != null && previous !== contents) {
            owner.lostOwnership(this, previous)
        }
    }

    actual fun getContents(requestor: Any?): Transferable? = cached
}
