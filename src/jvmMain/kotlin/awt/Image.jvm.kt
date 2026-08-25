package awt

actual typealias Image = java.awt.Image

actual val Image.pxWidth: Int get() = getWidth(null)
actual val Image.pxHeight: Int get() = getHeight(null)

actual val IMAGE_SCALE_DEFAULT: Int = java.awt.Image.SCALE_DEFAULT
actual val IMAGE_SCALE_SMOOTH: Int = java.awt.Image.SCALE_SMOOTH