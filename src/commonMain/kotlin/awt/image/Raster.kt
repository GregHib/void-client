package awt.image

import awt.Point

expect open class Raster {
    fun getNumBands(): Int
    fun getSample(x: Int, y: Int, b: Int): Int
    fun getPixel(x: Int, y: Int, iArray: IntArray?): IntArray
}

expect fun createWritableRaster(sm: SampleModel, db: DataBufferInt, location: Point?): WritableRaster

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