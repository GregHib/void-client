package lang

actual open class InterruptedException : Exception {
    actual constructor(reason: String?) : super(reason)
}