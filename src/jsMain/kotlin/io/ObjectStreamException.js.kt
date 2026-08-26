package io

actual abstract class ObjectStreamException : IOException {
    actual constructor(classname: String?) : super(classname)
    actual constructor() : super()
}
