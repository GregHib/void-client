/**
 * A seekable random-access handle to one on-disk cache store (the plan's "CacheStorage" handle,
 * replacing the java.io.RandomAccessFile surface of Class234).
 *
 * Method names mirror the existing Class234 surface so the cache layer (Class78 and the readers)
 * needs no renaming — only its declared handle type changes from Class234 to this interface. The
 * jvm impl is Class234 (RandomAccessFile); web/native impls back it with OPFS / kotlinx-io.
 *
 * The capacity cap and EOF-on-overflow semantics live in the impl (Class234 throws EOFException when
 * a write would exceed the store's max length), so they're unchanged by this seam.
 */
interface CacheStore {
    /** Read up to [i_1_] bytes into [is] at offset [i]; returns bytes read (or -1 at EOF). */
    @Throws(IOException::class)
    fun method1656(`is`: ByteArray?, i: Int, i_0_: Byte, i_1_: Int): Int

    /** Close the handle. */
    @Throws(IOException::class)
    fun method1657(bool: Boolean)

    /** Write [i_5_] bytes from [is] at offset [i_4_]; throws if it would exceed the store cap. */
    @Throws(IOException::class)
    fun method1658(i: Byte, i_4_: Int, i_5_: Int, `is`: ByteArray?)

    /** Opaque store identity (the backing file on JVM); used only for diagnostics. */
    fun method1660(i: Int): Any?

    /** Seek to absolute position [l]. */
    @Throws(IOException::class)
    fun method1661(i: Int, l: Long)

    /** Total length of the store in bytes. */
    @Throws(IOException::class)
    fun method1662(i: Byte): Long
}
