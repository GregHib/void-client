package awt

actual typealias Image = java.awt.Image

actual fun Image.getGraphics(): Graphics = (this as java.awt.Image).graphics
actual fun Image.getWidth(observer: awt.image.ImageObserver?): Int = (this as java.awt.Image).getWidth(observer)
actual fun Image.getHeight(observer: awt.image.ImageObserver?): Int = (this as java.awt.Image).getHeight(observer)

actual val Image.pxWidth: Int get() = getWidth(null)
actual val Image.pxHeight: Int get() = getHeight(null)

actual val IMAGE_SCALE_DEFAULT: Int = java.awt.Image.SCALE_DEFAULT
actual val IMAGE_SCALE_SMOOTH: Int = java.awt.Image.SCALE_SMOOTH