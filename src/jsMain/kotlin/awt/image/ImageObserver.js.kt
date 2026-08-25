package awt.image

import awt.Image

actual interface ImageObserver {
    actual fun imageUpdate(img: Image, infoflags: Int, x: Int, y: Int, width: Int, height: Int): Boolean
}

actual val WIDTH: Int
    get() = 1
actual val HEIGHT: Int
    get() = 2
actual val PROPERTIES: Int
    get() = 4
actual val SOMEBITS: Int
    get() = 8
actual val FRAMEBITS: Int
    get() = 16
actual val ALLBITS: Int
    get() = 32
actual val ERROR: Int
    get() = 64
actual val ABORT: Int
    get() = 128