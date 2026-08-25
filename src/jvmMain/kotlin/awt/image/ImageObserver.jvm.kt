package awt.image

actual typealias ImageObserver = java.awt.image.ImageObserver

actual val WIDTH: Int
    get() = ImageObserver.WIDTH
actual val HEIGHT: Int
    get() = ImageObserver.HEIGHT
actual val PROPERTIES: Int
    get() = ImageObserver.PROPERTIES
actual val SOMEBITS: Int
    get() = ImageObserver.SOMEBITS
actual val FRAMEBITS: Int
    get() = ImageObserver.FRAMEBITS
actual val ALLBITS: Int
    get() = ImageObserver.ALLBITS
actual val ERROR: Int
    get() = ImageObserver.ERROR
actual val ABORT: Int
    get() = ImageObserver.ABORT