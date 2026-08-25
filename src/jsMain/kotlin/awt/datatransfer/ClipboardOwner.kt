package awt.datatransfer

actual interface ClipboardOwner {
    actual fun lostOwnership(clipboard: Clipboard, contents: Transferable)
}
