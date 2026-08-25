package awt.image

import java.awt.image.ImageObserver
import java.awt.image.PixelGrabber

actual typealias PixelGrabber = PixelGrabber

actual val IMAGE_OBSERVER_FRAMEBITS: Int = ImageObserver.FRAMEBITS
actual val IMAGE_OBSERVER_ALLBITS: Int = ImageObserver.ALLBITS
actual val IMAGE_OBSERVER_ERROR: Int = ImageObserver.ERROR
actual val IMAGE_OBSERVER_ABORT: Int = ImageObserver.ABORT
