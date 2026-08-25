package awt.image

import awt.Image
import util.Hashtable

expect open class BufferedImage : Image {
    constructor(width: Int, height: Int, imageType: Int)
    constructor(
        cm: ColorModel,
        raster: WritableRaster,
        isRasterPremultiplied: Boolean,
        properties: Hashtable<*, *>?,
    )

    fun getType(): Int
    fun getColorModel(): ColorModel
    fun getRaster(): WritableRaster
    fun getSource(): ImageProducer

    fun getRGB(x: Int, y: Int): Int
    fun setRGB(x: Int, y: Int, rgb: Int)
    fun getRGB(
        startX: Int, startY: Int, w: Int, h: Int,
        rgbArray: IntArray?, offset: Int, scansize: Int,
    ): IntArray
    fun setRGB(
        startX: Int, startY: Int, w: Int, h: Int,
        rgbArray: IntArray, offset: Int, scansize: Int,
    )
}

expect val BUFFERED_IMAGE_TYPE_INT_RGB: Int
expect val BUFFERED_IMAGE_TYPE_INT_ARGB: Int
expect val BUFFERED_IMAGE_TYPE_INT_ARGB_PRE: Int
