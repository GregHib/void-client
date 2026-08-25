package io

actual open class DataInputStream actual constructor(input: InputStream) : FilterInputStream(input) {

    actual final override fun read(b: ByteArray): Int = read(b, 0, b.size)

    actual final override fun read(b: ByteArray, off: Int, len: Int): Int = input.read(b, off, len)

    private fun readOrEof(): Int {
        val b = read()
        if (b < 0) throw EOFException("Unexpected end of stream")
        return b
    }

    actual fun readFully(b: ByteArray) {
        readFully(b, 0, b.size)
    }

    actual fun readFully(b: ByteArray?, off: Int, len: Int) {
        if (b == null) {
            return
        }
        var done = 0
        while (done < len) {
            val n = read(b, off + done, len - done)
            if (n < 0) throw EOFException("Unexpected end of stream")
            done += n
        }
    }

    actual fun skipBytes(n: Int): Int {
        var total = 0
        while (total < n) {
            val skipped = skip((n - total).toLong()).toInt()
            if (skipped <= 0) break
            total += skipped
        }
        return total
    }

    actual fun readBoolean(): Boolean = readOrEof() != 0

    actual fun readByte(): Byte = readOrEof().toByte()

    actual fun readUnsignedByte(): Int = readOrEof()

    actual fun readShort(): Short = readUnsignedShort().toShort()

    actual fun readUnsignedShort(): Int = (readOrEof() shl 8) or readOrEof()

    actual fun readChar(): Char = Char(readUnsignedShort())

    actual fun readInt(): Int =
        (readOrEof() shl 24) or (readOrEof() shl 16) or (readOrEof() shl 8) or readOrEof()

    actual fun readLong(): Long {
        val high = readInt().toLong() and 0xFFFFFFFFL
        val low = readInt().toLong() and 0xFFFFFFFFL
        return (high shl 32) or low
    }

    actual fun readFloat(): Float = Float.fromBits(readInt())

    actual fun readDouble(): Double = Double.fromBits(readLong())

    actual fun readUTF(): String {
        val bytes = ByteArray(readUnsignedShort())
        readFully(bytes)
        return decodeModifiedUtf8(bytes)
    }
}

internal fun decodeModifiedUtf8(bytes: ByteArray): String {
    val sb = StringBuilder(bytes.size)
    var i = 0
    while (i < bytes.size) {
        val c = bytes[i].toInt() and 0xFF
        when (c shr 4) {
            0, 1, 2, 3, 4, 5, 6, 7 -> {
                sb.append(Char(c))
                i++
            }
            12, 13 -> {
                if (i + 1 >= bytes.size) throw IOException("Malformed UTF-8: truncated 2-byte sequence")
                val c2 = bytes[i + 1].toInt() and 0xFF
                if (c2 and 0xC0 != 0x80) throw IOException("Malformed UTF-8 at byte ${i + 1}")
                sb.append(Char(((c and 0x1F) shl 6) or (c2 and 0x3F)))
                i += 2
            }
            14 -> {
                if (i + 2 >= bytes.size) throw IOException("Malformed UTF-8: truncated 3-byte sequence")
                val c2 = bytes[i + 1].toInt() and 0xFF
                val c3 = bytes[i + 2].toInt() and 0xFF
                if (c2 and 0xC0 != 0x80 || c3 and 0xC0 != 0x80) throw IOException("Malformed UTF-8 at byte ${i + 1}")
                sb.append(Char(((c and 0x0F) shl 12) or ((c2 and 0x3F) shl 6) or (c3 and 0x3F)))
                i += 3
            }
            else -> throw IOException("Malformed UTF-8: illegal leading byte 0x${c.toString(16)}")
        }
    }
    return sb.toString()
}