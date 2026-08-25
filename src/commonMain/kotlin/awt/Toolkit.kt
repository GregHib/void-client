package awt

import awt.datatransfer.Clipboard

expect abstract class Toolkit {
    abstract fun getScreenSize(): Dimension
    abstract fun getScreenResolution(): Int
    abstract fun getSystemClipboard(): Clipboard
    fun createCustomCursor(cursor: Image?, hotSpot: Point?, name: String?): Cursor
    fun createImage(array: ByteArray): Image
}

expect fun getDefaultToolkit(): Toolkit
