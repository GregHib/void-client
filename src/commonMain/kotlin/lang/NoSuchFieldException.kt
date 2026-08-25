package lang

expect open class NoSuchFieldException : Exception {
    constructor(reason: String?)
}