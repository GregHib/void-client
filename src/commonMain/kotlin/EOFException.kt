/**
 * Multiplatform end-of-file exception seam.
 *
 * On JVM this is a typealias to java.io.EOFException (see jvmMain), so existing
 * throw/catch sites keep the byte-identical behaviour of the real platform
 * exception. It extends the [IOException] seam, mirroring java.io's hierarchy
 * (java.io.EOFException extends java.io.IOException), so any `catch (e: IOException)`
 * still catches it.
 *
 * Declared `open` for parity with [IOException]; only the no-arg constructor is
 * used by current call sites.
 */
expect open class EOFException : IOException {
    constructor()
    constructor(message: String?)
}
