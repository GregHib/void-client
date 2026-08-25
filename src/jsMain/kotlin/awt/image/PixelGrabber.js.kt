package awt.image

import awt.Image
import kotlinx.browser.document
import org.khronos.webgl.get
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement

actual val IMAGE_OBSERVER_FRAMEBITS: Int = 16
actual val IMAGE_OBSERVER_ALLBITS: Int = 32
actual val IMAGE_OBSERVER_ERROR: Int = 64
actual val IMAGE_OBSERVER_ABORT: Int = 128

actual open class PixelGrabber private constructor(
    private val image: Image?,
    private val producer: ImageProducer?,
    private val srcX: Int,
    private val srcY: Int,
    private var grabWidth: Int,
    private var grabHeight: Int,
    private var buffer: IntArray?,
    private var bufferOffset: Int,
    private var bufferScansize: Int,
) {
    private var status: Int = 0
    private var model: ColorModel = rgbDefaultColorModel

    actual constructor(img: Image, x: Int, y: Int, w: Int, h: Int, pix: IntArray, off: Int, scansize: Int) :
            this(img, null, x, y, w, h, pix, off, scansize)

    actual constructor(ip: ImageProducer, x: Int, y: Int, w: Int, h: Int, pix: IntArray, off: Int, scansize: Int) :
            this(null, ip, x, y, w, h, pix, off, scansize)

    actual constructor(img: Image, x: Int, y: Int, w: Int, h: Int, forceRGB: Boolean) :
            this(img, null, x, y, w, h, null, 0, w)

    actual fun getStatus(): Int = status
    actual fun getWidth(): Int = grabWidth
    actual fun getHeight(): Int = grabHeight
    actual fun getPixels(): Any? = buffer
    actual fun getColorModel(): ColorModel = model

    actual fun startGrabbing() { grabPixels() }
    actual fun grabPixels(ms: Long): Boolean = grabPixels()

    actual fun abortGrabbing() {
        status = status or IMAGE_OBSERVER_ABORT
    }

    actual fun grabPixels(): Boolean {
        if (status and IMAGE_OBSERVER_ALLBITS != 0) return true
        if (status and (IMAGE_OBSERVER_ERROR or IMAGE_OBSERVER_ABORT) != 0) return false

        producer?.let { it.startProduction(consumer); return status and IMAGE_OBSERVER_ALLBITS != 0 }

        val img = image
        val src = if (img == null) null else readArgb(img)
        if (src == null) {
            status = status or IMAGE_OBSERVER_ERROR
            return false
        }
        val (argb, srcW, srcH) = src
        if (grabWidth < 0) grabWidth = srcW - srcX
        if (grabHeight < 0) grabHeight = srcH - srcY

        val out = buffer ?: IntArray(grabWidth * grabHeight).also {
            buffer = it; bufferOffset = 0; bufferScansize = grabWidth
        }
        for (row in 0 until grabHeight) {
            val from = (srcY + row) * srcW + srcX
            val to = bufferOffset + row * bufferScansize
            for (col in 0 until grabWidth) out[to + col] = argb[from + col]
        }
        status = status or (IMAGE_OBSERVER_FRAMEBITS or IMAGE_OBSERVER_ALLBITS)
        return true
    }

    /** Feeds the producer path; mirrors PixelGrabber's own ImageConsumer role. */
    private val consumer = object : ImageConsumer {
        override fun setDimensions(width: Int, height: Int) {
            if (grabWidth < 0) grabWidth = width - srcX
            if (grabHeight < 0) grabHeight = height - srcY
            if (buffer == null) {
                buffer = IntArray(grabWidth * grabHeight)
                bufferOffset = 0
                bufferScansize = grabWidth
            }
        }

        override fun setColorModel(model: ColorModel) { this@PixelGrabber.model = model }
        override fun setHints(hintflags: Int) {}

        override fun setPixels(
            x: Int, y: Int, w: Int, h: Int,
            model: ColorModel, pixels: IntArray, off: Int, scansize: Int,
        ) = store(x, y, w, h) { row, col -> model.getRGB(pixels[off + row * scansize + col]) }

        override fun setPixels(
            x: Int, y: Int, w: Int, h: Int,
            model: ColorModel, pixels: ByteArray, off: Int, scansize: Int,
        ) = store(x, y, w, h) { row, col ->
            model.getRGB(pixels[off + row * scansize + col].toInt() and 0xFF)
        }

        override fun imageComplete(status: Int) {
            this@PixelGrabber.status = this@PixelGrabber.status or when (status) {
                IMAGE_CONSUMER_IMAGEERROR -> IMAGE_OBSERVER_ERROR
                IMAGE_CONSUMER_IMAGEABORTED -> IMAGE_OBSERVER_ABORT
                else -> IMAGE_OBSERVER_FRAMEBITS or IMAGE_OBSERVER_ALLBITS
            }
        }

        private fun store(x: Int, y: Int, w: Int, h: Int, argbAt: (Int, Int) -> Int) {
            val out = buffer ?: return
            for (row in 0 until h) {
                val dstRow = (y + row) - srcY
                if (dstRow < 0 || dstRow >= grabHeight) continue
                for (col in 0 until w) {
                    val dstCol = (x + col) - srcX
                    if (dstCol < 0 || dstCol >= grabWidth) continue
                    out[bufferOffset + dstRow * bufferScansize + dstCol] = argbAt(row, col)
                }
            }
        }
    }

    private fun readArgb(img: Image): Triple<IntArray, Int, Int>? {
        if (img is BufferedImage) return Triple(img.argb, img.width, img.height)

        val w = img.naturalWidth
        val h = img.naturalHeight
        if (w <= 0 || h <= 0) return null

        val canvas = document.createElement("canvas") as HTMLCanvasElement
        canvas.width = w
        canvas.height = h
        val ctx = canvas.getContext("2d") as CanvasRenderingContext2D
        ctx.asDynamic().drawImage(img.source, 0, 0)

        val data = ctx.getImageData(0.0, 0.0, w.toDouble(), h.toDouble()).data
        val argb = IntArray(w * h)
        for (i in argb.indices) {
            val o = i * 4
            argb[i] = ((data[o + 3].toInt() and 0xFF) shl 24) or
                    ((data[o].toInt() and 0xFF) shl 16) or
                    ((data[o + 1].toInt() and 0xFF) shl 8) or
                    (data[o + 2].toInt() and 0xFF)
        }
        return Triple(argb, w, h)
    }
}