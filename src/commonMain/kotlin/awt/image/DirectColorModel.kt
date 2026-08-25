package awt.image


expect open class DirectColorModel : ColorModel {
    constructor(bits: Int, rmask: Int, gmask: Int, bmask: Int)
    constructor(bits: Int, rmask: Int, gmask: Int, bmask: Int, amask: Int)

    final override fun getRed(pixel: Int): Int
    final override fun getGreen(pixel: Int): Int
    final override fun getBlue(pixel: Int): Int
    final override fun getAlpha(pixel: Int): Int
    final override fun getRGB(pixel: Int): Int
}

expect val DirectColorModel.redMask: Int
expect val DirectColorModel.greenMask: Int
expect val DirectColorModel.blueMask: Int
expect val DirectColorModel.alphaMask: Int