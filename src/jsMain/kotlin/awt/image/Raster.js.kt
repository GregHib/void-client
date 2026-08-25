package awt.image

private val DEFAULT_BAND_MASKS = intArrayOf(0x00FF0000, 0x0000FF00, 0x000000FF, -0x1000000)

actual open class Raster {

    internal var buffer: IntArray = IntArray(0)
    internal var rasterWidth: Int = 0
    internal var rasterHeight: Int = 0
    internal var scanlineStride: Int = 0
    internal var bandMasks: IntArray = DEFAULT_BAND_MASKS

    internal fun offsetOf(x: Int, y: Int): Int = y * scanlineStride + x

    actual fun getNumBands(): Int = bandMasks.size

    actual fun getSample(x: Int, y: Int, b: Int): Int {
        val mask = bandMasks[b]
        return extractComponent(buffer[offsetOf(x, y)], mask, 0)
    }

    actual fun getPixel(x: Int, y: Int, iArray: IntArray?): IntArray {
        val out = iArray ?: IntArray(bandMasks.size)
        for (b in bandMasks.indices) out[b] = getSample(x, y, b)
        return out
    }
}

actual val Raster.pxWidth: Int get() = rasterWidth
actual val Raster.pxHeight: Int get() = rasterHeight
actual val Raster.intData: IntArray get() = buffer

actual fun createWritableRaster(sm: SampleModel, db: DataBufferInt, location: awt.Point?): WritableRaster {
    val masks = (sm as? PackedSampleModel)?.bandMasks ?: DEFAULT_BAND_MASKS
    return createPackedRaster(db, sm.getWidth(), sm.getHeight(), sm.getWidth(), masks)
}

actual fun createPackedRaster(
    dataBuffer: DataBufferInt,
    w: Int,
    h: Int,
    scanlineStride: Int,
    bandMasks: IntArray,
): WritableRaster = WritableRaster().apply {
    attach(dataBuffer, w, h, scanlineStride, bandMasks)
}
