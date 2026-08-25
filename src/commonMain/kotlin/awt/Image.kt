package awt

expect abstract class Image {
    fun flush()
    fun getScaledInstance(width: Int, height: Int, hints: Int): Image
    fun setAccelerationPriority(priority: Float)
    fun getAccelerationPriority(): Float
}

// Every abstract member of java.awt.Image takes an ImageObserver — keep them out
expect val Image.pxWidth: Int
expect val Image.pxHeight: Int

expect val IMAGE_SCALE_DEFAULT: Int
expect val IMAGE_SCALE_SMOOTH: Int