package awt

import awt.image.ImageProducer
import kotlinx.browser.document
import org.w3c.dom.HTMLCanvasElement

actual open class Canvas actual constructor() : Component() {
    override val element: HTMLCanvasElement =
        document.createElement("canvas") as HTMLCanvasElement

    actual fun createImage(width: Int, height: Int): Image = TODO("Not yet implemented")
    actual fun createImage(producer: ImageProducer): Image = TODO("Not yet implemented")
}

actual var Canvas.ignoreRepaint: Boolean
    get() = ignoreRepaintFlag
    set(value) { ignoreRepaintFlag = value }

actual val Canvas.pxWidth: Int get() = getWidth()
actual val Canvas.pxHeight: Int get() = getHeight()
