package io

actual typealias InvalidClassException = java.io.InvalidClassException

actual val InvalidClassException.classname: String? get() = this.classname