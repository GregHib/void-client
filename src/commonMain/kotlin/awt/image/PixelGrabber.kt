package awt.image

import awt.Image

expect open class PixelGrabber {
    constructor(img: Image, x: Int, y: Int, w: Int, h: Int, pix: IntArray, off: Int, scansize: Int)
    constructor(ip: ImageProducer, x: Int, y: Int, w: Int, h: Int, pix: IntArray, off: Int, scansize: Int)
    constructor(img: Image, x: Int, y: Int, w: Int, h: Int, forceRGB: Boolean)

    fun startGrabbing()
    fun abortGrabbing()
    fun grabPixels(): Boolean
    fun grabPixels(ms: Long): Boolean
    fun getStatus(): Int
    fun getWidth(): Int
    fun getHeight(): Int
    fun getPixels(): Any?
    fun getColorModel(): ColorModel
}

expect val IMAGE_OBSERVER_FRAMEBITS: Int
expect val IMAGE_OBSERVER_ALLBITS: Int
expect val IMAGE_OBSERVER_ERROR: Int
expect val IMAGE_OBSERVER_ABORT: Int