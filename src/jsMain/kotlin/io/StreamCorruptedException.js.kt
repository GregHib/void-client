package io

actual open class StreamCorruptedException : ObjectStreamException {
    actual constructor() : super()
    actual constructor(reason: String?) : super(reason)
}