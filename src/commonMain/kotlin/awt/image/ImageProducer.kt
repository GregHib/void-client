package awt.image

expect interface ImageProducer {
    fun addConsumer(ic: ImageConsumer)
    fun isConsumer(ic: ImageConsumer): Boolean
    fun removeConsumer(ic: ImageConsumer)
    fun startProduction(ic: ImageConsumer)
    fun requestTopDownLeftRightResend(ic: ImageConsumer)
}