package io

expect open class FileNotFoundException : IOException {
    constructor()
    constructor(message: String?)
}