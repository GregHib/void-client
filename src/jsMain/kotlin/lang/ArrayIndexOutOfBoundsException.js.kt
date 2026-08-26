package lang

actual open class ArrayIndexOutOfBoundsException : Exception {
    actual constructor() : super()
    actual constructor(message: String?) : super(message)
}
