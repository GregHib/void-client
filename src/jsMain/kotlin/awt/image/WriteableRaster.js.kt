package awt.image

actual open class WritableRaster : Raster() {

    actual fun setPixel(x: Int, y: Int, iArray: IntArray) {
        var packed = 0
        for (b in bandMasks.indices) packed = packed or packComponent(iArray[b], bandMasks[b])
        buffer[offsetOf(x, y)] = packed
    }

    actual fun setDataElements(x: Int, y: Int, w: Int, h: Int, inData: Any) {
        val src = inData as IntArray
        for (row in 0 until h) {
            val srcRow = row * w
            val dstRow = offsetOf(x, y + row)
            for (col in 0 until w) buffer[dstRow + col] = src[srcRow + col]
        }
    }

    internal fun attach(
        dataBuffer: DataBufferInt,
        w: Int,
        h: Int,
        stride: Int,
        masks: IntArray,
    ) {
        buffer = dataBuffer.getData()
        rasterWidth = w
        rasterHeight = h
        scanlineStride = stride
        bandMasks = masks
    }

    private fun packComponent(component: Int, mask: Int): Int {
        if (mask == 0) return 0
        val shift = shiftOf(mask)
        val max = mask ushr shift
        val scaled = if (max == 0xFF) component else (component * max) / 255
        return (scaled shl shift) and mask
    }
}