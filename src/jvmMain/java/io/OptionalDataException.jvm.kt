package io

actual typealias OptionalDataException = java.io.OptionalDataException

actual val OptionalDataException.eof: Boolean get() = this.eof
actual val OptionalDataException.length: Int get() = this.length