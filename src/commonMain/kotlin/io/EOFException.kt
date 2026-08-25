package io

expect open class EOFException : IOException {
    constructor()
    constructor(message: String?)
}