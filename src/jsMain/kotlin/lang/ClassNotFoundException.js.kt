package lang

actual open class ClassNotFoundException : Exception {
    actual constructor() : super()
    actual constructor(message: String?) : super(message)
}
