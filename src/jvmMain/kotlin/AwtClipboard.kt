import java.awt.datatransfer.Clipboard
import java.awt.datatransfer.DataFlavor
import java.awt.datatransfer.StringSelection

/**
 * JVM [SystemClipboard] over java.awt.datatransfer.Clipboard. Read/write semantics are byte-identical
 * to the former inline code in Class38/Class66: a read that throws (e.g. flavor unavailable) yields
 * null, and writes use a StringSelection with no owner.
 */
class AwtClipboard(private val clipboard: Clipboard) : SystemClipboard {
    override fun getText(): String? {
        val transferable = clipboard.getContents(null) ?: return null
        return try {
            transferable.getTransferData(DataFlavor.stringFlavor) as String?
        } catch (exception: Exception) {
            null
        }
    }

    override fun setText(text: String) {
        clipboard.setContents(StringSelection(text), null)
    }
}
