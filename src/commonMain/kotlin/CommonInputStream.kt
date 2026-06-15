/**
 * Platform seam for a readable byte stream (replaces java.io.InputStream in commonMain).
 *
 * Only the surface Class376 (buffered async reader) actually calls: read(buf, off, len).
 * JVM impl: any subclass of java.io.InputStream can also implement this interface.
 * The no-op stubs (InputStream_Sub1, InputStream_Sub2) are the JVM-side seam impls.
 */
interface CommonInputStream {
    /**
     * Read up to [len] bytes into [buf] starting at [off].
     * Returns the number of bytes read, or -1 at end of stream.
     */
    @Throws(IOException::class)
    fun read(buf: ByteArray, off: Int, len: Int): Int
}

/**
 * Factory for no-op [CommonInputStream] stubs (used by Class376.method3618 to reset the stream).
 * JVM: install `{ InputStream_Sub1() }` at bootstrap.
 */
object CommonInputStreams {
    private var ctor: () -> CommonInputStream = {
        // No-op default: always returns -1 (EOF), safe for JS/native where no real InputStream exists.
        object : CommonInputStream {
            override fun read(buf: ByteArray, off: Int, len: Int): Int = -1
        }
    }
    fun install(factory: () -> CommonInputStream) { ctor = factory }
    fun createNoop(): CommonInputStream = ctor()
}
