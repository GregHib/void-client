package io

private const val TC_NULL = 0x70
private const val TC_REFERENCE = 0x71
private const val TC_CLASSDESC = 0x72
private const val TC_OBJECT = 0x73
private const val TC_STRING = 0x74
private const val TC_ARRAY = 0x75
private const val TC_CLASS = 0x76
private const val TC_BLOCKDATA = 0x77
private const val TC_ENDBLOCKDATA = 0x78
private const val TC_RESET = 0x79
private const val TC_BLOCKDATALONG = 0x7A
private const val TC_EXCEPTION = 0x7B
private const val TC_LONGSTRING = 0x7C
private const val TC_PROXYCLASSDESC = 0x7D
private const val TC_ENUM = 0x7E
private const val BASE_WIRE_HANDLE = 0x7E0000

private const val STREAM_MAGIC = 0xACED
private const val STREAM_VERSION = 5

actual open class ObjectInputStream actual constructor(input: InputStream) : InputStream() {

    private val data = DataInputStream(if (input is BufferedInputStream) input else BufferedInputStream(input))

    /** One byte of pushback, so a type tag can be put back for the next readObject. */
    private var peeked = -1

    /** Bytes left in the current block-data record. */
    private var blockRemaining = 0

    private val handles = ArrayList<Any?>()
    private var closed = false

    init {
        val magic = data.readUnsignedShort()
        val version = data.readUnsignedShort()
        if (magic != STREAM_MAGIC) {
            throw StreamCorruptedException("invalid stream header magic: 0x${magic.toString(16)}")
        }
        if (version != STREAM_VERSION) {
            throw StreamCorruptedException("invalid stream header version: $version")
        }
    }

    // -- raw stream access ---------------------------------------------------

    private fun rawRead(): Int {
        if (peeked >= 0) {
            val v = peeked
            peeked = -1
            return v
        }
        return data.read()
    }

    private fun rawReadOrEof(): Int = rawRead().also { if (it < 0) throw EOFException("Unexpected end of stream") }

    private fun rawReadInt(): Int =
        (rawReadOrEof() shl 24) or (rawReadOrEof() shl 16) or (rawReadOrEof() shl 8) or rawReadOrEof()

    // -- block data ----------------------------------------------------------

    /** Reads one byte of block data, entering the next block-data record if needed. */
    private fun readBlockByte(): Int {
        while (blockRemaining == 0) {
            when (val tag = rawReadOrEof()) {
                TC_BLOCKDATA -> blockRemaining = rawReadOrEof()
                TC_BLOCKDATALONG -> {
                    blockRemaining = rawReadInt()
                    if (blockRemaining < 0) throw StreamCorruptedException("illegal block data header length")
                }
                TC_RESET -> handles.clear()
                else -> {
                    peeked = tag // object data starts here, not primitive data
                    throw OptionalDataException(0, false)
                }
            }
        }
        blockRemaining--
        return rawReadOrEof()
    }

    private fun readBlockFully(b: ByteArray, off: Int, len: Int) {
        for (i in 0 until len) b[off + i] = readBlockByte().toByte()
    }

    // -- object reading ------------------------------------------------------

    actual fun readObject(): Any? {
        checkOpen()
        if (blockRemaining > 0) throw OptionalDataException(blockRemaining, false)
        return when (val tag = rawRead()) {
            -1 -> throw EOFException("Unexpected end of stream")
            TC_NULL -> null
            TC_STRING -> readNewString(long = false)
            TC_LONGSTRING -> readNewString(long = true)
            TC_REFERENCE -> {
                val handle = rawReadInt() - BASE_WIRE_HANDLE
                if (handle < 0 || handle >= handles.size) {
                    throw StreamCorruptedException("invalid handle value: $handle")
                }
                handles[handle]
            }
            TC_BLOCKDATA, TC_BLOCKDATALONG -> {
                peeked = tag
                throw OptionalDataException(0, false)
            }
            TC_ENDBLOCKDATA -> {
                peeked = tag
                throw OptionalDataException(0, true)
            }
            TC_RESET -> {
                handles.clear()
                readObject()
            }
            TC_OBJECT, TC_CLASSDESC, TC_PROXYCLASSDESC, TC_ARRAY, TC_CLASS, TC_ENUM, TC_EXCEPTION ->
                throw InvalidClassException(
                    "Java object deserialization (type code 0x${tag.toString(16)}) is not supported on " +
                            "Kotlin/JS: there is no class loader to resolve the serialized class. Only null, " +
                            "strings and back references can be read. Use kotlinx.serialization instead.",
                )
            else -> throw StreamCorruptedException("invalid type code: 0x${tag.toString(16)}")
        }
    }

    private fun readNewString(long: Boolean): String {
        val len = if (long) {
            val high = rawReadInt().toLong() and 0xFFFFFFFFL
            val low = rawReadInt().toLong() and 0xFFFFFFFFL
            val value = (high shl 32) or low
            if (value > Int.MAX_VALUE) throw IOException("String too long for Kotlin/JS: $value bytes")
            value.toInt()
        } else {
            (rawReadOrEof() shl 8) or rawReadOrEof()
        }
        val bytes = ByteArray(len)
        for (i in 0 until len) bytes[i] = rawReadOrEof().toByte()
        val s = decodeModifiedUtf8(bytes)
        handles.add(s)
        return s
    }

    // -- primitive reads (block data) ---------------------------------------

    actual open fun readFully(b: ByteArray) {
        checkOpen()
        readBlockFully(b, 0, b.size)
    }

    actual open fun skipBytes(n: Int): Int {
        checkOpen()
        var i = 0
        while (i < n) {
            readBlockByte()
            i++
        }
        return i
    }

    actual open fun readBoolean(): Boolean = readBlockByte() != 0

    actual open fun readByte(): Byte = readBlockByte().toByte()

    actual open fun readUnsignedByte(): Int = readBlockByte()

    actual open fun readShort(): Short = readUnsignedShort().toShort()

    actual open fun readUnsignedShort(): Int = (readBlockByte() shl 8) or readBlockByte()

    actual open fun readChar(): Char = Char(readUnsignedShort())

    actual open fun readInt(): Int =
        (readBlockByte() shl 24) or (readBlockByte() shl 16) or (readBlockByte() shl 8) or readBlockByte()

    actual open fun readLong(): Long {
        val high = readInt().toLong() and 0xFFFFFFFFL
        val low = readInt().toLong() and 0xFFFFFFFFL
        return (high shl 32) or low
    }

    actual open fun readFloat(): Float = Float.fromBits(readInt())

    actual open fun readDouble(): Double = Double.fromBits(readLong())

    actual open fun readUTF(): String {
        val bytes = ByteArray(readUnsignedShort())
        readBlockFully(bytes, 0, bytes.size)
        return decodeModifiedUtf8(bytes)
    }

    /** Returns -1 at the end of the current block data, as on the JVM. */
    actual override fun read(): Int {
        checkOpen()
        return try {
            readBlockByte()
        } catch (e: OptionalDataException) {
            -1
        } catch (e: EOFException) {
            -1
        }
    }

    actual override fun close() {
        if (closed) return
        closed = true
        data.close()
    }

    private fun checkOpen() {
        if (closed) throw IOException("Stream closed")
    }
}