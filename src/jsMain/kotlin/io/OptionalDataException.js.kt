package io

actual open class OptionalDataException internal constructor(
    internal val lengthValue: Int,
    internal val eofValue: Boolean,
) : IOException()

actual val OptionalDataException.eof: Boolean get() = eofValue
actual val OptionalDataException.length: Int get() = lengthValue