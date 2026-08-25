package io

actual open class FileNotFoundException : IOException {
    actual constructor() : super()
    actual constructor(message: String?) : super(message)
}