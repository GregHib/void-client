package awt.image

actual open class DirectColorModel : ColorModel {

    internal val rMask: Int
    internal val gMask: Int
    internal val bMask: Int
    internal val aMask: Int

    actual constructor(bits: Int, rmask: Int, gmask: Int, bmask: Int) :
            this(bits, rmask, gmask, bmask, 0)

    actual constructor(bits: Int, rmask: Int, gmask: Int, bmask: Int, amask: Int) : super(bits) {
        rMask = rmask
        gMask = gmask
        bMask = bmask
        aMask = amask
    }

    override val supportsAlpha: Boolean get() = aMask != 0

    actual final override fun getRed(pixel: Int): Int = extractComponent(pixel, rMask, 0)
    actual final override fun getGreen(pixel: Int): Int = extractComponent(pixel, gMask, 0)
    actual final override fun getBlue(pixel: Int): Int = extractComponent(pixel, bMask, 0)
    actual final override fun getAlpha(pixel: Int): Int = extractComponent(pixel, aMask, 255)

    actual final override fun getRGB(pixel: Int): Int =
        (getAlpha(pixel) shl 24) or (getRed(pixel) shl 16) or (getGreen(pixel) shl 8) or getBlue(pixel)

    actual final override fun createCompatibleSampleModel(w: Int, h: Int): SampleModel {
        val masks = if (aMask != 0) intArrayOf(rMask, gMask, bMask, aMask) else intArrayOf(rMask, gMask, bMask)
        return PackedSampleModel(w, h, masks)
    }
}

actual val DirectColorModel.redMask: Int get() = rMask
actual val DirectColorModel.greenMask: Int get() = gMask
actual val DirectColorModel.blueMask: Int get() = bMask
actual val DirectColorModel.alphaMask: Int get() = aMask

internal  fun extractComponent(pixel: Int, mask: Int, absentValue: Int): Int {
    if (mask == 0) return absentValue
    val shift = shiftOf(mask)
    val value = (pixel and mask) ushr shift
    val max = mask ushr shift
    return if (max == 0xFF) value else if (max == 0) 0 else (value * 255) / max
}

internal fun shiftOf(mask: Int): Int = if (mask == 0) 0 else mask.countTrailingZeroBits()
