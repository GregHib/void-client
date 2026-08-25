package awt.image

expect open class Raster {
    fun getNumBands(): Int
    fun getSample(x: Int, y: Int, b: Int): Int
    fun getPixel(x: Int, y: Int, iArray: IntArray?): IntArray
}

expect val Raster.pxWidth: Int
expect val Raster.pxHeight: Int

expect val Raster.intData: IntArray

expect fun createPackedRaster(
    dataBuffer: DataBufferInt,
    w: Int,
    h: Int,
    scanlineStride: Int,
    bandMasks: IntArray,
): WritableRaster