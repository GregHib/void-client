package io

expect open class DataInputStream(input: InputStream) : FilterInputStream {
    final override fun read(b: ByteArray): Int
    final override fun read(b: ByteArray, off: Int, len: Int): Int
    fun readFully(b: ByteArray)
    fun readFully(b: ByteArray?, off: Int, len: Int)
    fun skipBytes(n: Int): Int
    fun readBoolean(): Boolean
    fun readByte(): Byte
    fun readUnsignedByte(): Int
    fun readShort(): Short
    fun readUnsignedShort(): Int
    fun readChar(): Char
    fun readInt(): Int
    fun readLong(): Long
    fun readFloat(): Float
    fun readDouble(): Double

    /** Modified UTF-8, as written by `DataOutput.writeUTF`. */
    fun readUTF(): String
}