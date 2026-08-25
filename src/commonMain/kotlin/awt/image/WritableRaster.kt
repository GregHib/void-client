package awt.image

expect open class WritableRaster : Raster {
    fun setPixel(x: Int, y: Int, iArray: IntArray)
    fun setDataElements(x: Int, y: Int, w: Int, h: Int, inData: Any)
}