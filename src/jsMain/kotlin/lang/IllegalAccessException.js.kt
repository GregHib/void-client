package lang

actual open class IllegalAccessException : Exception {
    actual constructor(reason: String?) : super(reason)
}
