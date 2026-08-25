package awt.image

actual interface ImageProducer {
    actual fun addConsumer(ic: ImageConsumer)
    actual fun isConsumer(ic: ImageConsumer): Boolean
    actual fun removeConsumer(ic: ImageConsumer)
    actual fun startProduction(ic: ImageConsumer)
    actual fun requestTopDownLeftRightResend(ic: ImageConsumer)
}