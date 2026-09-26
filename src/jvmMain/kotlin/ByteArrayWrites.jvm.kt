actual fun ByteArray.putIntLE(pos: Int, value: Int) {
    this[pos] = value.toByte()
    this[pos + 1] = (value shr 8).toByte()
    this[pos + 2] = (value shr 16).toByte()
    this[pos + 3] = (value shr 24).toByte()
}

actual fun ByteArray.putIntBE(pos: Int, value: Int) {
    this[pos] = (value shr 24).toByte()
    this[pos + 1] = (value shr 16).toByte()
    this[pos + 2] = (value shr 8).toByte()
    this[pos + 3] = value.toByte()
}

actual fun ByteArray.putFloatLE(pos: Int, value: Float) = putIntLE(pos, java.lang.Float.floatToRawIntBits(value))
