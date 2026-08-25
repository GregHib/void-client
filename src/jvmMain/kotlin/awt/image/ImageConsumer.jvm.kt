package awt.image

import java.awt.image.ImageConsumer

actual typealias ImageConsumer = ImageConsumer

actual val IMAGE_CONSUMER_RANDOMPIXELORDER: Int = ImageConsumer.RANDOMPIXELORDER
actual val IMAGE_CONSUMER_TOPDOWNLEFTRIGHT: Int = ImageConsumer.TOPDOWNLEFTRIGHT
actual val IMAGE_CONSUMER_COMPLETESCANLINES: Int = ImageConsumer.COMPLETESCANLINES
actual val IMAGE_CONSUMER_SINGLEPASS: Int = ImageConsumer.SINGLEPASS
actual val IMAGE_CONSUMER_SINGLEFRAME: Int = ImageConsumer.SINGLEFRAME
actual val IMAGE_CONSUMER_IMAGEERROR: Int = ImageConsumer.IMAGEERROR
actual val IMAGE_CONSUMER_SINGLEFRAMEDONE: Int = ImageConsumer.SINGLEFRAMEDONE
actual val IMAGE_CONSUMER_STATICIMAGEDONE: Int = ImageConsumer.STATICIMAGEDONE
actual val IMAGE_CONSUMER_IMAGEABORTED: Int = ImageConsumer.IMAGEABORTED