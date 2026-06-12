/**
 * JS actual for [IOException]: plain Kotlin exception; no java.io dependency.
 */
actual open class IOException : Exception {
    actual constructor() : super()
    actual constructor(message: String?) : super(message)
}
