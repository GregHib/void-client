package awt

import awt.image.ImageObserver

expect abstract class Image {
    fun flush()
    abstract fun getGraphics(): Graphics
    fun getScaledInstance(width: Int, height: Int, hints: Int): Image
    fun setAccelerationPriority(priority: Float)
    fun getAccelerationPriority(): Float
    abstract fun getWidth(observer: ImageObserver?): Int
    abstract fun getHeight(observer: ImageObserver?): Int
}

expect val Image.pxWidth: Int
expect val Image.pxHeight: Int

expect val IMAGE_SCALE_DEFAULT: Int
expect val IMAGE_SCALE_SMOOTH: Int