package awt.datatransfer

expect class Clipboard(name: String) {
    fun getName(): String
    fun setContents(contents: Transferable, owner: ClipboardOwner?)
    fun getContents(requestor: Any?): Transferable?
}
