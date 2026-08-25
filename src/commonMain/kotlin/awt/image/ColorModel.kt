package awt.image

expect abstract class ColorModel {
    constructor(bits: Int)

    abstract fun getRed(pixel: Int): Int
    abstract fun getGreen(pixel: Int): Int
    abstract fun getBlue(pixel: Int): Int
    abstract fun getAlpha(pixel: Int): Int

    open fun getRGB(pixel: Int): Int

    open fun createCompatibleSampleModel(w: Int, h: Int): SampleModel
}

expect val ColorModel.pixelSize: Int
expect val ColorModel.hasAlphaChannel: Boolean
expect val ColorModel.alphaPremultiplied: Boolean
expect val rgbDefaultColorModel: ColorModel