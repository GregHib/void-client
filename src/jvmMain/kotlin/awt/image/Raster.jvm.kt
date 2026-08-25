package awt.image

import awt.Point

actual typealias Raster = java.awt.image.Raster

actual val Raster.pxWidth: Int get() = getWidth()
actual val Raster.pxHeight: Int get() = getHeight()

actual val Raster.intData: IntArray
    get() = (getDataBuffer() as java.awt.image.DataBufferInt).getData()

actual fun createPackedRaster(
    dataBuffer: DataBufferInt,
    w: Int,
    h: Int,
    scanlineStride: Int,
    bandMasks: IntArray,
): WritableRaster =
    java.awt.image.Raster.createPackedRaster(dataBuffer, w, h, scanlineStride, bandMasks, null)

actual fun createWritableRaster(sm: SampleModel, db: DataBufferInt, location: Point?): WritableRaster =
    java.awt.image.Raster.createWritableRaster(sm, db, location)
