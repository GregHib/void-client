package lang

actual open class NoSuchFieldException : Exception {
    actual constructor(reason: String?) : super(reason)
}
