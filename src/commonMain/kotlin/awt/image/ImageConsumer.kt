package awt.image

expect interface ImageConsumer {
    fun setDimensions(width: Int, height: Int)
    fun setColorModel(model: ColorModel?)
    fun setHints(hintflags: Int)
    fun setPixels(
        x: Int, y: Int, w: Int, h: Int,
        model: ColorModel, pixels: ByteArray, off: Int, scansize: Int,
    )
    fun setPixels(
        x: Int, y: Int, w: Int, h: Int,
        model: ColorModel?, pixels: IntArray?, off: Int, scansize: Int,
    )
    fun imageComplete(status: Int)
    fun setProperties(something: Any?)
}

// ImageConsumer's static flags.
expect val IMAGE_CONSUMER_RANDOMPIXELORDER: Int
expect val IMAGE_CONSUMER_TOPDOWNLEFTRIGHT: Int
expect val IMAGE_CONSUMER_COMPLETESCANLINES: Int
expect val IMAGE_CONSUMER_SINGLEPASS: Int
expect val IMAGE_CONSUMER_SINGLEFRAME: Int
expect val IMAGE_CONSUMER_IMAGEERROR: Int
expect val IMAGE_CONSUMER_SINGLEFRAMEDONE: Int
expect val IMAGE_CONSUMER_STATICIMAGEDONE: Int
expect val IMAGE_CONSUMER_IMAGEABORTED: Int