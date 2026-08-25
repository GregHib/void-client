package util.zip

private val CRC_TABLE = IntArray(256) { n ->
    var c = n
    repeat(8) {
        c = if (c and 1 != 0) 0xEDB88320.toInt() xor (c ushr 1) else c ushr 1
    }
    c
}

/** Standard CRC-32 (IEEE 802.3), matching `java.util.zip.CRC32` byte for byte. */
actual class CRC32 actual constructor() {

    /** The running checksum, held pre-inverted as the JDK does internally. */
    private var state: Int = -1

    actual fun update(b: Int) {
        state = CRC_TABLE[(state xor b) and 0xFF] xor (state ushr 8)
    }

    actual fun update(b: ByteArray) {
        update(b, 0, b.size)
    }

    actual fun update(b: ByteArray, off: Int, len: Int) {
        if (off < 0 || len < 0 || off > b.size - len) {
            throw IndexOutOfBoundsException("off=$off len=$len size=${b.size}")
        }
        var s = state
        for (i in off until off + len) {
            s = CRC_TABLE[(s xor b[i].toInt()) and 0xFF] xor (s ushr 8)
        }
        state = s
    }

    actual fun getValue(): Long = state.inv().toLong() and 0xFFFFFFFFL

    actual fun reset() {
        state = -1
    }
}