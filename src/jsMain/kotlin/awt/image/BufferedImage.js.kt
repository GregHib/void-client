package awt.image

import awt.Image
import kotlinx.browser.document
import org.khronos.webgl.Int32Array
import org.khronos.webgl.Uint8Array
import org.khronos.webgl.get
import org.khronos.webgl.set
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.ImageData
import util.Hashtable

actual val BUFFERED_IMAGE_TYPE_INT_RGB: Int = 1
actual val BUFFERED_IMAGE_TYPE_INT_ARGB: Int = 2
actual val BUFFERED_IMAGE_TYPE_INT_ARGB_PRE: Int = 3

private val LITTLE_ENDIAN: Boolean = Uint8Array(Int32Array(arrayOf(1)).buffer)[0].toInt() == 1

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

    private val context: CanvasRenderingContext2D by lazy {
        canvas.getContext("2d") as CanvasRenderingContext2D
    }

    // Reused across frames: putImageData copies it, so a fresh one per present is pure garbage.
    private val imageData: ImageData by lazy {
        context.createImageData(width.toDouble(), height.toDouble())
    }
    private val imageWords: Int32Array by lazy { Int32Array(imageData.data.buffer) }

    override val source: dynamic
        get() {
            val m = model
            if (LITTLE_ENDIAN && m is DirectColorModel && m.rMask == 0x00FF0000 && m.gMask == 0x0000FF00 &&
                m.bMask == 0x000000FF && (m.aMask == 0 || m.aMask == -0x1000000)
            ) {
                // Fast path for the standard layouts: one word per pixel, swapping 0xAARRGGBB to the
                // little-endian RGBA byte order ImageData wants (0xAABBGGRR). This runs over the whole
                // framebuffer every frame of the software renderer, so it must stay branch- and call-free.
                val keep = if (m.aMask == 0) 0x0000FF00 else -0xff0100 // 0xFF00FF00
                val opaque = if (m.aMask == 0) -0x1000000 else 0
                val out = imageWords
                val px = pixels
                for (i in 0 until width * height) {
                    val p = px[i]
                    out[i] = (p and keep) or opaque or ((p ushr 16) and 0xFF) or ((p and 0xFF) shl 16)
                }
            } else {
                // Uint8ClampedArray.set clamps *negative* numbers to 0 per spec. Component values are
                // 0-255, but Kotlin's Int.toByte() wraps anything >= 128 into a negative Byte (e.g. 255
                // -> -1), which then gets clamped to 0 instead of 255 - silently zeroing every bright
                // channel and, critically, opaque alpha. Write through a dynamic Int index instead so
                // the value reaches the typed array unsigned.
                val bytes = imageData.data.asDynamic()
                for (i in pixels.indices) {
                    val p = pixels[i]
                    val o = i * 4
                    // Must go through the color model rather than assuming the top byte is alpha:
                    // a model with no alpha mask (e.g. the RGB-only DirectColorModel that
                    // BufferedImageSurface uses for the game's framebuffer) treats every pixel as
                    // fully opaque regardless of what happens to be in bits 24-31 - and for plain
                    // 0xRRGGBB fills, which is most of them, that byte is just 0.
                    bytes[o] = m.getRed(p)
                    bytes[o + 1] = m.getGreen(p)
                    bytes[o + 2] = m.getBlue(p)
                    bytes[o + 3] = m.getAlpha(p)
                }
            }
            context.putImageData(imageData, 0.0, 0.0)
            return canvas
        }

    val width: Int = width
    val height: Int = height

    private val type: Int = imageType
    private var pixels: IntArray = IntArray(width * height)
    private val dataBuffer = DataBufferInt(pixels, pixels.size)

    private var model: ColorModel = when (imageType) {
        BUFFERED_IMAGE_TYPE_INT_RGB ->
            DirectColorModel(24, 0x00FF0000, 0x0000FF00, 0x000000FF)
        else ->
            DirectColorModel(32, 0x00FF0000, 0x0000FF00, 0x000000FF, -0x1000000)
    }

    private var raster: WritableRaster = createPackedRaster(
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

    actual constructor(
        cm: ColorModel,
        raster: WritableRaster,
        isRasterPremultiplied: Boolean,
        properties: Hashtable<*, *>?,
    ) : this(raster.pxWidth, raster.pxHeight, BUFFERED_IMAGE_TYPE_INT_ARGB) {
        this.model = cm
        this.raster = raster
        this.pixels = raster.intData
    }

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

    override fun graphicsImpl(): awt.Graphics {
        TODO("Not yet implemented")
    }

    override fun widthImpl(observer: ImageObserver?): Int = width
    override fun heightImpl(observer: ImageObserver?): Int = height
}