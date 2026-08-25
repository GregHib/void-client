package io

expect abstract class ObjectStreamException : IOException {
    constructor()
    constructor(classname: String?)
}