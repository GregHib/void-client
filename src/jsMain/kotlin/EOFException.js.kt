/**
 * JS actual for [EOFException]: extends the JS [IOException] actual.
 */
actual open class EOFException : IOException {
    actual constructor() : super()
    actual constructor(message: String?) : super(message)
}
