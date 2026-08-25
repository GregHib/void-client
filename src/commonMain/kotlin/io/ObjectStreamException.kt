package io

expect abstract class ObjectStreamException : IOException {
    protected constructor()
    protected constructor(classname: String?)
}