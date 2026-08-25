package awt.image

actual abstract class SampleModel internal constructor(
    private val w: Int,
    private val h: Int,
) {
    actual fun getWidth(): Int = w
    actual fun getHeight(): Int = h
}

internal class PackedSampleModel(
    width: Int,
    height: Int,
    internal val bandMasks: IntArray,
) : SampleModel(width, height)
