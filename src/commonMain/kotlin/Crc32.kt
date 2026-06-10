/**
 * Pure-Kotlin CRC-32 (ISO 3309 / ITU-T V.42, polynomial 0xEDB88320),
 * matching the contract of java.util.zip.CRC32 used by the client.
 *
 * Multiplatform replacement so cache-integrity code can live in commonMain.
 */
class Crc32 {
    private var crc = 0xFFFFFFFFL.toInt()

    fun reset() {
        crc = 0xFFFFFFFFL.toInt()
    }

    fun update(bytes: ByteArray, offset: Int, length: Int) {
        var c = crc
        var i = offset
        val end = offset + length
        while (i < end) {
            c = (c ushr 8) xor TABLE[(c xor bytes[i].toInt()) and 0xFF]
            i++
        }
        crc = c
    }

    fun update(bytes: ByteArray) = update(bytes, 0, bytes.size)

    fun getValue(): Long = (crc.inv().toLong()) and 0xFFFFFFFFL

    companion object {
        private val TABLE = IntArray(256) {
            var c = it
            repeat(8) {
                c = if (c and 1 != 0) 0xEDB88320.toInt() xor (c ushr 1) else c ushr 1
            }
            c
        }
    }
}
