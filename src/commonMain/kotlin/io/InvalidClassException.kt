package io

expect open class InvalidClassException : IOException {
    constructor(reason: String?)
    constructor(cname: String?, reason: String?)
}

expect val InvalidClassException.classname: String?