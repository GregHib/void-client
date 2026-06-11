/**
 * Multiplatform I/O exception seam.
 *
 * On JVM this is a typealias to java.io.IOException (see jvmMain), so existing
 * catch blocks keep catching the real platform I/O exceptions from sockets and
 * files with byte-identical behaviour. Common code (and the IOException_Sub1
 * subclass) only needs the constructors below.
 *
 * Declared `open` so IOException_Sub1 can extend it.
 */
expect open class IOException : Exception {
    constructor()
    constructor(message: String?)
}
