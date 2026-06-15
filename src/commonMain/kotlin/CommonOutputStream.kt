/**
 * Platform seam for a writable byte stream (replaces java.io.OutputStream in commonMain).
 *
 * Only the surface Class208 (buffered async writer) actually calls: write(buf, off, len).
 * JVM impl: any subclass of java.io.OutputStream can also implement this interface.
 * The no-op stubs (OutputStream_Sub1, OutputStream_Sub2) are the JVM-side seam impls.
 */
interface CommonOutputStream {
    /**
     * Write [len] bytes from [buf] starting at [off].
     */
    @Throws(IOException::class)
    fun write(buf: ByteArray, off: Int, len: Int)
}

/**
 * Factory for no-op [CommonOutputStream] stubs (used by Class208.method1527 to reset the stream).
 * JVM: install `{ OutputStream_Sub1() }` at bootstrap.
 */
object CommonOutputStreams {
    private var ctor: () -> CommonOutputStream = {
        // No-op default: discards all writes, safe for JS/native where no real OutputStream exists.
        object : CommonOutputStream {
            override fun write(buf: ByteArray, off: Int, len: Int) { /* discard */ }
        }
    }
    fun install(factory: () -> CommonOutputStream) { ctor = factory }
    fun createNoop(): CommonOutputStream = ctor()
}
