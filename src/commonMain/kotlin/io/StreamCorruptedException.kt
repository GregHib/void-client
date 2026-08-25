package io

expect open class StreamCorruptedException : ObjectStreamException {
    constructor()
    constructor(reason: String?)
}
