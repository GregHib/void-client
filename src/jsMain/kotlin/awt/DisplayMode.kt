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
}
