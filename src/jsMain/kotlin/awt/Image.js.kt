package awt

import kotlinx.browser.document
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLImageElement

actual abstract class Image {
    internal abstract val source: dynamic   // HTMLImageElement or HTMLCanvasElement
    internal abstract val naturalWidth: Int
    internal abstract val naturalHeight: Int

    private var priority: Float = 0.5f

    actual fun flush() { }

    actual fun getScaledInstance(width: Int, height: Int, hints: Int): Image {
        val canvas = document.createElement("canvas") as HTMLCanvasElement
        canvas.width = width
        canvas.height = height
        val ctx = canvas.getContext("2d").asDynamic()
        ctx.imageSmoothingEnabled = hints == IMAGE_SCALE_SMOOTH
        ctx.drawImage(source, 0, 0, width, height)
        return CanvasImage(canvas)
    }

    actual fun setAccelerationPriority(priority: Float) { this.priority = priority }
    actual fun getAccelerationPriority(): Float = priority
}

internal class CanvasImage(private val canvas: HTMLCanvasElement) : Image() {
    override val source: dynamic get() = canvas
    override val naturalWidth: Int get() = canvas.width
    override val naturalHeight: Int get() = canvas.height
}

internal class ElementImage(private val img: HTMLImageElement) : Image() {
    override val source: dynamic get() = img
    override val naturalWidth: Int get() = img.naturalWidth
    override val naturalHeight: Int get() = img.naturalHeight
}

actual val Image.pxWidth: Int get() = naturalWidth
actual val Image.pxHeight: Int get() = naturalHeight

actual val IMAGE_SCALE_DEFAULT: Int = 1
actual val IMAGE_SCALE_SMOOTH: Int = 4