package io

actual open class IOException actual constructor(message: String) : Exception() {
    actual constructor() : this("") {
        TODO("Not yet implemented")
    }
}