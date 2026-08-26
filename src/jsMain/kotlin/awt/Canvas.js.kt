package awt

import awt.image.ImageProducer
import kotlinx.browser.document
import org.w3c.dom.HTMLCanvasElement

actual open class Canvas actual constructor() : Component() {
    override val element: HTMLCanvasElement =
        document.createElement("canvas") as HTMLCanvasElement

    actual fun createImage(width: Int, height: Int): Image {
        val offscreen = document.createElement("canvas") as HTMLCanvasElement
        offscreen.width = width
        offscreen.height = height
        return CanvasImage(offscreen)
    }

    // Not wired up yet. Deliberately an Exception rather than TODO(): NotImplementedError is an
    // Error and would escape the client's `catch (Exception)` fallbacks instead of triggering them.
    actual fun createImage(producer: ImageProducer): Image =
        throw IllegalArgumentException("ImageProducer-backed images are not supported yet")
}

actual var Canvas.ignoreRepaint: Boolean
    get() = ignoreRepaintFlag
    set(value) { ignoreRepaintFlag = value }

actual val Canvas.pxWidth: Int get() = getWidth()
actual val Canvas.pxHeight: Int get() = getHeight()
