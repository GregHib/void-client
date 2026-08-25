package io

expect open class OptionalDataException : IOException
expect val OptionalDataException.eof: Boolean
expect val OptionalDataException.length: Int