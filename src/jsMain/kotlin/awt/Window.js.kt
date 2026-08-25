package awt

import awt.image.ImageObserver

actual open class Window : Container(), ImageObserver {
    actual fun pack() {
    }

    actual fun dispose() {
    }

    actual fun toFront() {
    }

    actual fun toBack() {
    }

    actual fun setLocationRelativeTo(c: Component) {
    }

    actual override fun drawImage(img: Image?, x: Int, y: Int, observer: ImageObserver?): Boolean {
        TODO("Not yet implemented")
    }

    actual override fun imageUpdate(img: Image, infoflags: Int, x: Int, y: Int, width: Int, height: Int): Boolean {
        TODO("Not yet implemented")
    }
}