package awt.datatransfer

expect interface ClipboardOwner {
    fun lostOwnership(clipboard: Clipboard, contents: Transferable)
}
