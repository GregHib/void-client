/**
 * Whirlpool digest computed on 32-bit halves instead of Long. Output matches [WhirlpoolHash].
 *
 * Long is emulated with heap objects on JS, so the original made verifying a large cache group
 * against its reference table digest stall the main thread for seconds.
 */
object Whirlpool {
    /** The eight circulant tables as [table * 256 + byte], split into high and low words. */
    private val tableHi = IntArray(8 * 256)
    private val tableLo = IntArray(8 * 256)
    private val roundHi = IntArray(11)
    private val roundLo = IntArray(11)

    init {
        val tables = WhirlpoolHash.aLongArrayArray75!!
        for (t in 0..7) {
            for (b in 0..255) {
                val l = tables[t]!![b]
                tableHi[t * 256 + b] = (l ushr 32).toInt()
                tableLo[t * 256 + b] = l.toInt()
            }
        }
        val constants = WhirlpoolHash.aLongArray76!!
        for (r in 0..10) {
            roundHi[r] = (constants[r] ushr 32).toInt()
            roundLo[r] = constants[r].toInt()
        }
    }

    fun digest(data: ByteArray, offset: Int, length: Int): ByteArray {
        val state = State()
        val end = offset + length
        var pos = offset
        while (end - pos >= 64) {
            state.process(data, pos)
            pos += 64
        }
        // Padding: a single 1 bit, zeros, then the 256-bit big-endian bit length.
        val remaining = end - pos
        val tailLength = if (remaining + 1 > 32) 128 else 64
        val tail = ByteArray(tailLength)
        data.copyInto(tail, 0, pos, end)
        tail[remaining] = 0x80.toByte()
        writeInt(tail, tailLength - 8, length ushr 29)
        writeInt(tail, tailLength - 4, length shl 3)
        state.process(tail, 0)
        if (tailLength == 128) state.process(tail, 64)
        val out = ByteArray(64)
        for (i in 0..7) {
            writeInt(out, i * 8, state.hashHi[i])
            writeInt(out, i * 8 + 4, state.hashLo[i])
        }
        return out
    }

    private class State {
        val hashHi = IntArray(8)
        val hashLo = IntArray(8)
        private val blockHi = IntArray(8)
        private val blockLo = IntArray(8)
        private val stateHi = IntArray(8)
        private val stateLo = IntArray(8)
        private val keyHi = IntArray(8)
        private val keyLo = IntArray(8)
        private val tmpHi = IntArray(8)
        private val tmpLo = IntArray(8)

        fun process(buf: ByteArray, off: Int) {
            for (i in 0..7) {
                val hi = readInt(buf, off + i * 8)
                val lo = readInt(buf, off + i * 8 + 4)
                blockHi[i] = hi
                blockLo[i] = lo
                keyHi[i] = hashHi[i]
                keyLo[i] = hashLo[i]
                stateHi[i] = hi xor hashHi[i]
                stateLo[i] = lo xor hashLo[i]
            }
            for (r in 1..10) {
                round(keyHi, keyLo)
                tmpHi.copyInto(keyHi)
                tmpLo.copyInto(keyLo)
                keyHi[0] = keyHi[0] xor roundHi[r]
                keyLo[0] = keyLo[0] xor roundLo[r]
                round(stateHi, stateLo)
                for (i in 0..7) {
                    stateHi[i] = tmpHi[i] xor keyHi[i]
                    stateLo[i] = tmpLo[i] xor keyLo[i]
                }
            }
            for (i in 0..7) {
                hashHi[i] = hashHi[i] xor stateHi[i] xor blockHi[i]
                hashLo[i] = hashLo[i] xor stateLo[i] xor blockLo[i]
            }
        }

        /** tmp[i] = XOR over t of table t indexed by byte t (from the top) of src[(i - t) & 7]. */
        private fun round(srcHi: IntArray, srcLo: IntArray) {
            for (i in 0..7) {
                var hi = 0
                var lo = 0
                for (t in 0..3) {
                    val index = (t shl 8) or ((srcHi[(i - t) and 7] ushr (24 - 8 * t)) and 0xff)
                    hi = hi xor tableHi[index]
                    lo = lo xor tableLo[index]
                }
                for (t in 4..7) {
                    val index = (t shl 8) or ((srcLo[(i - t) and 7] ushr (56 - 8 * t)) and 0xff)
                    hi = hi xor tableHi[index]
                    lo = lo xor tableLo[index]
                }
                tmpHi[i] = hi
                tmpLo[i] = lo
            }
        }
    }

    private fun readInt(buf: ByteArray, off: Int): Int =
        (buf[off].toInt() shl 24) or ((buf[off + 1].toInt() and 0xff) shl 16) or
            ((buf[off + 2].toInt() and 0xff) shl 8) or (buf[off + 3].toInt() and 0xff)

    private fun writeInt(buf: ByteArray, off: Int, value: Int) {
        buf[off] = (value ushr 24).toByte()
        buf[off + 1] = (value ushr 16).toByte()
        buf[off + 2] = (value ushr 8).toByte()
        buf[off + 3] = value.toByte()
    }
}
