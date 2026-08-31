package awt

actual class DisplayMode actual constructor(
    private val width: Int,
    private val height: Int,
    private val bitDepth: Int,
    private val refreshRate: Int
) {
    actual fun getWidth(): Int = width
    actual fun getHeight(): Int = height
    actual fun getBitDepth(): Int = bitDepth
    actual fun getRefreshRate(): Int = refreshRate

    override fun equals(other: Any?): Boolean =
        other is DisplayMode && width == other.width && height == other.height &&
            bitDepth == other.bitDepth && refreshRate == other.refreshRate

    override fun hashCode(): Int =
        ((width * 31 + height) * 31 + bitDepth) * 31 + refreshRate
}
