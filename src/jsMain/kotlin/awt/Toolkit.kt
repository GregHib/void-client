package awt

import awt.datatransfer.Clipboard
import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement


actual abstract class Toolkit {
    actual abstract fun getScreenSize(): Dimension
    actual abstract fun getScreenResolution(): Int
    actual abstract fun getSystemClipboard(): Clipboard

    actual fun createCustomCursor(cursor: Image?, hotSpot: Point?, name: String?): Cursor {
        val result = Cursor(CursorType.CUSTOM_CURSOR)
        val width = cursor?.naturalWidth ?: 0
        val height = cursor?.naturalHeight ?: 0
        if (cursor == null || width <= 0 || height <= 0) return result
        val canvas = document.createElement("canvas") as HTMLCanvasElement
        canvas.width = width
        canvas.height = height
        val ctx = canvas.getContext("2d") as CanvasRenderingContext2D
        ctx.drawImage(cursor.source, 0.0, 0.0)
        val x = hotSpot?.x ?: 0
        val y = hotSpot?.y ?: 0
        result.customCss = "url(${canvas.toDataURL("image/png")}) $x $y, auto"
        return result
    }

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
