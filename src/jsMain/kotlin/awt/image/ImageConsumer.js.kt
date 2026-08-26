package awt.image

actual interface ImageConsumer {
    actual fun setDimensions(width: Int, height: Int)
    actual fun setColorModel(model: ColorModel?)
    actual fun setHints(hintflags: Int)
    actual fun setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel, pixels: ByteArray, off: Int, scansize: Int)
    actual fun setPixels(x: Int, y: Int, w: Int, h: Int, model: ColorModel?, pixels: IntArray?, off: Int, scansize: Int)
    actual fun imageComplete(status: Int)
}

actual val IMAGE_CONSUMER_RANDOMPIXELORDER: Int = 1
actual val IMAGE_CONSUMER_TOPDOWNLEFTRIGHT: Int = 2
actual val IMAGE_CONSUMER_COMPLETESCANLINES: Int = 4
actual val IMAGE_CONSUMER_SINGLEPASS: Int = 8
actual val IMAGE_CONSUMER_SINGLEFRAME: Int = 16
actual val IMAGE_CONSUMER_IMAGEERROR: Int = 1
actual val IMAGE_CONSUMER_SINGLEFRAMEDONE: Int = 2
actual val IMAGE_CONSUMER_STATICIMAGEDONE: Int = 3
actual val IMAGE_CONSUMER_IMAGEABORTED: Int = 4

/** Equivalent of java.awt.image.MemoryImageSource for an ARGB IntArray. */
internal class ArrayImageProducer(
    private val pixels: IntArray,
    private val width: Int,
    private val height: Int,
    private val model: ColorModel,
) : ImageProducer {

    private val consumers = mutableListOf<ImageConsumer>()

    override fun addConsumer(ic: ImageConsumer) {
        if (!consumers.contains(ic)) consumers.add(ic)
    }

    override fun isConsumer(ic: ImageConsumer): Boolean = consumers.contains(ic)

    override fun removeConsumer(ic: ImageConsumer) {
        consumers.remove(ic)
    }

    override fun startProduction(ic: ImageConsumer) {
        addConsumer(ic)
        ic.setDimensions(width, height)
        ic.setColorModel(model)
        ic.setHints(
            IMAGE_CONSUMER_TOPDOWNLEFTRIGHT or
                    IMAGE_CONSUMER_COMPLETESCANLINES or
                    IMAGE_CONSUMER_SINGLEPASS or
                    IMAGE_CONSUMER_SINGLEFRAME,
        )
        ic.setPixels(0, 0, width, height, model, pixels, 0, width)
        ic.imageComplete(IMAGE_CONSUMER_STATICIMAGEDONE)
    }

    override fun requestTopDownLeftRightResend(ic: ImageConsumer) = startProduction(ic)
}

actual fun ImageConsumer.setProperties(something: Any?) {
}