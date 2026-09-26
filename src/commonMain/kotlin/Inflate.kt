/**
 * Pure-Kotlin raw DEFLATE (RFC 1951) decompressor — a multiplatform replacement
 * for the nowrap mode of java.util.zip.Inflater used by the cache container codec.
 *
 * Mirrors the small slice of the Inflater API the client relies on:
 *   setInput(buf, off, len) ; inflate(out) ; reset()
 * Construct with nowrap = true for raw deflate (the only mode the client uses).
 *
 * The output buffer passed to inflate() is expected to be pre-sized to the exact
 * uncompressed length (as the client does), and decompression fills it fully.
 */
class Inflate(@Suppress("UNUSED_PARAMETER") nowrap: Boolean = true) {
    private var input: ByteArray = EMPTY
    private var inPos = 0
    private var inEnd = 0
    private var bitBuf = 0
    private var bitCnt = 0

    fun reset() {
        input = EMPTY
        inPos = 0
        inEnd = 0
        bitBuf = 0
        bitCnt = 0
    }

    fun setInput(buf: ByteArray, offset: Int, length: Int) {
        input = buf
        inPos = offset
        inEnd = offset + length
        bitBuf = 0
        bitCnt = 0
    }

    /** Decompresses into [out], returning the number of bytes written. */
    fun inflate(out: ByteArray): Int {
        var outPos = 0
        var finalBlock = false
        while (!finalBlock) {
            finalBlock = readBits(1) == 1
            when (readBits(2)) {
                0 -> { // stored
                    // Align to a byte boundary. decodeSymbol can buffer whole bytes ahead, so hand
                    // those back first; only the partial byte's leftover bits are discarded.
                    inPos -= bitCnt ushr 3
                    bitBuf = 0; bitCnt = 0
                    val len = (input[inPos].toInt() and 0xFF) or ((input[inPos + 1].toInt() and 0xFF) shl 8)
                    inPos += 4 // skip LEN and NLEN
                    input.copyInto(out, outPos, inPos, inPos + len)
                    inPos += len
                    outPos += len
                }
                1 -> outPos = inflateBlock(out, outPos, FIXED_LIT, FIXED_DIST)
                2 -> {
                    val (lit, dist) = readDynamicTables()
                    outPos = inflateBlock(out, outPos, lit, dist)
                }
                else -> throw IllegalStateException("Invalid DEFLATE block type")
            }
        }
        return outPos
    }

    private fun readBits(count: Int): Int {
        while (bitCnt < count) {
            bitBuf = bitBuf or ((input[inPos++].toInt() and 0xFF) shl bitCnt)
            bitCnt += 8
        }
        val v = bitBuf and ((1 shl count) - 1)
        bitBuf = bitBuf ushr count
        bitCnt -= count
        return v
    }

    /**
     * Table-driven decode: peeks [FAST_BITS] bits and resolves any code up to that length with one
     * lookup, instead of walking the canonical code one bit (and one [readBits] call) at a time.
     * Longer codes fall back to [decodeSymbolSlow]. Bits past the end of the input peek as zero; a
     * valid stream never consumes them.
     */
    private fun decodeSymbol(h: Huffman): Int {
        while (bitCnt < FAST_BITS) {
            val b = if (inPos < inEnd) input[inPos].toInt() and 0xFF else 0
            inPos++
            bitBuf = bitBuf or (b shl bitCnt)
            bitCnt += 8
        }
        val entry = h.fast[bitBuf and FAST_MASK]
        if (entry != 0) {
            val len = entry ushr 16
            bitBuf = bitBuf ushr len
            bitCnt -= len
            return entry and 0xFFFF
        }
        return decodeSymbolSlow(h)
    }

    private fun decodeSymbolSlow(h: Huffman): Int {
        var code = 0
        var first = 0
        var index = 0
        var len = 1
        while (true) {
            code = code or readBits(1)
            val count = h.counts[len]
            if (code - first < count) return h.symbols[index + (code - first)]
            index += count
            first = (first + count) shl 1
            code = code shl 1
            len++
        }
    }

    private fun inflateBlock(out: ByteArray, startPos: Int, lit: Huffman, dist: Huffman): Int {
        var outPos = startPos
        while (true) {
            val sym = decodeSymbol(lit)
            when {
                sym == 256 -> return outPos
                sym < 256 -> out[outPos++] = sym.toByte()
                else -> {
                    val s = sym - 257
                    val length = LEN_BASE[s] + readBits(LEN_EXTRA[s])
                    val d = decodeSymbol(dist)
                    val distance = DIST_BASE[d] + readBits(DIST_EXTRA[d])
                    var src = outPos - distance
                    repeat(length) { out[outPos++] = out[src++] }
                }
            }
        }
    }

    private fun readDynamicTables(): Pair<Huffman, Huffman> {
        val hlit = readBits(5) + 257
        val hdist = readBits(5) + 1
        val hclen = readBits(4) + 4
        val clLengths = IntArray(19)
        for (i in 0 until hclen) clLengths[CL_ORDER[i]] = readBits(3)
        val clTree = Huffman(clLengths)

        val lengths = IntArray(hlit + hdist)
        var i = 0
        while (i < lengths.size) {
            when (val sym = decodeSymbol(clTree)) {
                in 0..15 -> lengths[i++] = sym
                16 -> {
                    val prev = lengths[i - 1]
                    repeat(readBits(2) + 3) { lengths[i++] = prev }
                }
                17 -> repeat(readBits(3) + 3) { lengths[i++] = 0 }
                18 -> repeat(readBits(7) + 11) { lengths[i++] = 0 }
                else -> throw IllegalStateException("Invalid code-length symbol $sym")
            }
        }
        val litTree = Huffman(lengths.copyOfRange(0, hlit))
        val distTree = Huffman(lengths.copyOfRange(hlit, hlit + hdist))
        return litTree to distTree
    }

    /** Canonical Huffman decode table built from a list of code lengths. */
    private class Huffman(codeLengths: IntArray) {
        val counts = IntArray(MAX_BITS + 1)
        val symbols: IntArray

        /** Indexed by the next [FAST_BITS] input bits: `(length shl 16) or symbol`, or 0 if longer. */
        val fast = IntArray(1 shl FAST_BITS)

        init {
            for (len in codeLengths) counts[len]++
            counts[0] = 0
            val offsets = IntArray(MAX_BITS + 1)
            for (len in 1 until MAX_BITS) offsets[len + 1] = offsets[len] + counts[len]
            val syms = IntArray(codeLengths.size)
            for (sym in codeLengths.indices) {
                if (codeLengths[sym] != 0) syms[offsets[codeLengths[sym]]++] = sym
            }
            symbols = syms

            // Canonical codes in (length, symbol) order, which is the order of [symbols]. DEFLATE
            // sends codes MSB-first but the bit reader is LSB-first, so each code is bit-reversed
            // and replicated across every value of the bits that follow it.
            var code = 0
            var k = 0
            for (len in 1..MAX_BITS) {
                for (c in 0 until counts[len]) {
                    if (len <= FAST_BITS) {
                        var rev = 0
                        for (b in 0 until len) rev = rev or (((code ushr b) and 1) shl (len - 1 - b))
                        val entry = (len shl 16) or syms[k]
                        var f = rev
                        while (f < fast.size) {
                            fast[f] = entry
                            f += 1 shl len
                        }
                    }
                    code++
                    k++
                }
                code = code shl 1
            }
        }
    }

    companion object {
        private val EMPTY = ByteArray(0)
        private const val MAX_BITS = 15
        private const val FAST_BITS = 10
        private const val FAST_MASK = (1 shl FAST_BITS) - 1

        private val LEN_BASE = intArrayOf(
            3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31,
            35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258
        )
        private val LEN_EXTRA = intArrayOf(
            0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2,
            3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0
        )
        private val DIST_BASE = intArrayOf(
            1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193,
            257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577
        )
        private val DIST_EXTRA = intArrayOf(
            0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6,
            7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13
        )
        private val CL_ORDER = intArrayOf(16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15)

        private val FIXED_LIT: Huffman = Huffman(IntArray(288) { when {
            it < 144 -> 8
            it < 256 -> 9
            it < 280 -> 7
            else -> 8
        } })
        private val FIXED_DIST: Huffman = Huffman(IntArray(30) { 5 })
    }
}
