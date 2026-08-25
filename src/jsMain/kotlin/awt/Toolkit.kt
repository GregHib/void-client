package awt

import awt.datatransfer.Clipboard
import kotlinx.browser.window


actual abstract class Toolkit {
    actual abstract fun getScreenSize(): Dimension
    actual abstract fun getScreenResolution(): Int
    actual abstract fun getSystemClipboard(): Clipboard
    actual fun createCustomCursor(cursor: Image?, hotSpot: Point?, name: String?): Cursor {
        TODO("Not yet implemented")
    }

    actual fun createImage(array: ByteArray): Image {
        TODO("Not yet implemented")
    }

    actual fun getSystemEventQueue(): EventQueue = systemEventQueue
}

private val systemEventQueue = EventQueue()

class DefaultToolkit : Toolkit() {

    override fun getScreenSize(): Dimension =
        Dimension(window.screen.width, window.screen.height)

    // Browsers don't reliably expose true display DPI; 96 is the standard
    // CSS-pixel baseline used as a stand-in for getScreenResolution().
    override fun getScreenResolution(): Int = 96

    override fun getSystemClipboard(): Clipboard = Clipboard("System")
}

actual fun getDefaultToolkit(): Toolkit = DefaultToolkit()
