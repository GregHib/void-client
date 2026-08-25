package awt.image

import awt.Image
import kotlinx.browser.document
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import org.khronos.webgl.set

actual val BUFFERED_IMAGE_TYPE_INT_RGB: Int = 1
actual val BUFFERED_IMAGE_TYPE_INT_ARGB: Int = 2
actual val BUFFERED_IMAGE_TYPE_INT_ARGB_PRE: Int = 3

actual open class BufferedImage actual constructor(
    width: Int,
    height: Int,
    imageType: Int,
) : Image() {

    private val canvas: HTMLCanvasElement by lazy {
        (document.createElement("canvas") as HTMLCanvasElement).also {
            it.width = width
            it.height = height
        }
    }

    override val naturalWidth: Int get() = width
    override val naturalHeight: Int get() = height

    override val source: dynamic
        get() {
            val ctx = canvas.getContext("2d") as CanvasRenderingContext2D
            val img = ctx.createImageData(width.toDouble(), height.toDouble())
            val bytes = img.data
            for (i in pixels.indices) {
                val p = pixels[i]
                val o = i * 4
                bytes[o] = ((p shr 16) and 0xFF).toByte()      // R
                bytes[o + 1] = ((p shr 8) and 0xFF).toByte()   // G
                bytes[o + 2] = (p and 0xFF).toByte()           // B
                bytes[o + 3] = ((p ushr 24) and 0xFF).toByte() // A
            }
            ctx.putImageData(img, 0.0, 0.0)
            return canvas
        }

    val width: Int = width
    val height: Int = height

    private val type: Int = imageType
    private val pixels: IntArray = IntArray(width * height)
    private val dataBuffer = DataBufferInt(pixels, pixels.size)

    private val model: ColorModel = when (imageType) {
        BUFFERED_IMAGE_TYPE_INT_RGB ->
            DirectColorModel(24, 0x00FF0000, 0x0000FF00, 0x000000FF)
        else ->
            DirectColorModel(32, 0x00FF0000, 0x0000FF00, 0x000000FF, -0x1000000)
    }

    private val raster: WritableRaster = createPackedRaster(
        dataBuffer,
        width,
        height,
        width,
        if (imageType == BUFFERED_IMAGE_TYPE_INT_RGB) {
            intArrayOf(0x00FF0000, 0x0000FF00, 0x000000FF)
        } else {
            intArrayOf(0x00FF0000, 0x0000FF00, 0x000000FF, -0x1000000)
        },
    )

    actual fun getType(): Int = type
    actual fun getColorModel(): ColorModel = model
    actual fun getRaster(): WritableRaster = raster
    actual fun getSource(): ImageProducer = ArrayImageProducer(pixels, width, height, model)

    actual fun getRGB(x: Int, y: Int): Int = pixels[y * width + x]

    actual fun setRGB(x: Int, y: Int, rgb: Int) {
        pixels[y * width + x] = rgb
    }

    actual fun getRGB(
        startX: Int, startY: Int, w: Int, h: Int,
        rgbArray: IntArray?, offset: Int, scansize: Int,
    ): IntArray {
        val out = rgbArray ?: IntArray(offset + h * scansize)
        for (row in 0 until h) {
            val src = (startY + row) * width + startX
            val dst = offset + row * scansize
            for (col in 0 until w) out[dst + col] = pixels[src + col]
        }
        return out
    }

    actual fun setRGB(
        startX: Int, startY: Int, w: Int, h: Int,
        rgbArray: IntArray, offset: Int, scansize: Int,
    ) {
        for (row in 0 until h) {
            val dst = (startY + row) * width + startX
            val src = offset + row * scansize
            for (col in 0 until w) pixels[dst + col] = rgbArray[src + col]
        }
    }

    /** Raw ARGB backing store — hand this to ImageData for canvas rendering. */
    val argb: IntArray get() = pixels
}