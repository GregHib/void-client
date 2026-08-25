package awt

import awt.image.ImageObserver

expect abstract class Image {
    fun flush()
    fun getScaledInstance(width: Int, height: Int, hints: Int): Image
    fun setAccelerationPriority(priority: Float)
    fun getAccelerationPriority(): Float
}

expect fun Image.getGraphics(): Graphics
expect fun Image.getWidth(observer: ImageObserver?): Int
expect fun Image.getHeight(observer: ImageObserver?): Int

expect val Image.pxWidth: Int
expect val Image.pxHeight: Int

expect val IMAGE_SCALE_DEFAULT: Int
expect val IMAGE_SCALE_SMOOTH: Int