package awt

import awt.datatransfer.Clipboard
import kotlinx.browser.window


actual abstract class Toolkit {
    actual abstract fun getScreenSize(): Dimension
    actual abstract fun getScreenResolution(): Int
    actual abstract fun getSystemClipboard(): Clipboard
    // Both unimplemented, but as Exceptions rather than TODO(): NotImplementedError is an Error
    // and would escape the client's `catch (Exception)` fallbacks instead of triggering them.
    actual fun createCustomCursor(cursor: Image?, hotSpot: Point?, name: String?): Cursor =
        throw UnsupportedOperationException("Custom cursors are not supported yet")

    actual fun createImage(array: ByteArray): Image =
        throw UnsupportedOperationException("Decoding images from bytes is not supported yet")

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
