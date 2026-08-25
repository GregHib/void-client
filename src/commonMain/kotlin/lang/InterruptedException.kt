package lang

expect open class InterruptedException : Exception {
    constructor(reason: String?)
}