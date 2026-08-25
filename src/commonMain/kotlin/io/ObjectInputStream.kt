package io

expect open class ObjectInputStream(input: InputStream) : InputStream {

    /** `final` on the JVM. */
    fun readObject(): Any?

    open fun readFully(b: ByteArray)
    open fun skipBytes(n: Int): Int
    open fun readBoolean(): Boolean
    open fun readByte(): Byte
    open fun readUnsignedByte(): Int
    open fun readShort(): Short
    open fun readUnsignedShort(): Int
    open fun readChar(): Char
    open fun readInt(): Int
    open fun readLong(): Long
    open fun readFloat(): Float
    open fun readDouble(): Double
    open fun readUTF(): String

    override fun read(): Int
    override fun close()
}