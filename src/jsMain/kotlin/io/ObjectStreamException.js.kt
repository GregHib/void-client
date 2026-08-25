package io

actual abstract class ObjectStreamException : IOException {
    protected actual constructor() : super()
    protected actual constructor(classname: String?) : super(classname)
}