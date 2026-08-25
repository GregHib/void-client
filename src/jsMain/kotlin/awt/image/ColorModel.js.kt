package awt.image

actual abstract class ColorModel actual constructor(bits: Int) {

    internal val numBits: Int = bits

    /** Backs the `hasAlphaChannel` extension. */
    internal open val supportsAlpha: Boolean get() = true

    /** Backs the `alphaPremultiplied` extension. */
    internal open val isAlphaPre: Boolean get() = false

    actual abstract fun getRed(pixel: Int): Int
    actual abstract fun getGreen(pixel: Int): Int
    actual abstract fun getBlue(pixel: Int): Int
    actual abstract fun getAlpha(pixel: Int): Int

    actual open fun createCompatibleSampleModel(w: Int, h: Int): SampleModel =
        throw UnsupportedOperationException("createCompatibleSampleModel not implemented for $this")

    actual open fun getRGB(pixel: Int): Int =
        (getAlpha(pixel) shl 24) or
                (getRed(pixel) shl 16) or
                (getGreen(pixel) shl 8) or
                getBlue(pixel)
}

actual val ColorModel.pixelSize: Int get() = numBits
actual val ColorModel.hasAlphaChannel: Boolean get() = supportsAlpha
actual val ColorModel.alphaPremultiplied: Boolean get() = isAlphaPre

actual val rgbDefaultColorModel: ColorModel =
    DirectColorModel(32, 0x00FF0000, 0x0000FF00, 0x000000FF, -0x1000000 /* 0xFF000000 */)