package awt.image

import awt.Image

expect interface ImageObserver {
    fun imageUpdate(img: Image, infoflags: Int, x: Int, y: Int, width: Int, height: Int): Boolean
}

expect val WIDTH: Int
expect val HEIGHT: Int
expect val PROPERTIES: Int
expect val SOMEBITS: Int
expect val FRAMEBITS: Int
expect val ALLBITS: Int
expect val ERROR: Int
expect val ABORT: Int