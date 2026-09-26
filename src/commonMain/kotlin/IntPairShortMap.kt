/**
 * Open-addressing map from a 64-bit key, held as `(hi, lo)` Ints, to an unsigned 16-bit value.
 *
 * Stands in for a [Hashtable] of [ShortKeyNode]s where only the first node inserted for a key is
 * ever found (Hashtable appends to the bucket and searches from its head), so [putIfAbsent] gives
 * identical lookups. Kotlin/JS emulates Long with heap objects; Int keys avoid that per vertex.
 */
class IntPairShortMap(expected: Int) {
    private var mask: Int
    private var keysHi: IntArray
    private var keysLo: IntArray
    private var values: IntArray
    private var size = 0

    init {
        var capacity = 16
        while (capacity < expected * 2) capacity = capacity shl 1
        mask = capacity - 1
        keysHi = IntArray(capacity)
        keysLo = IntArray(capacity)
        values = IntArray(capacity) { EMPTY }
    }

    private fun slot(hi: Int, lo: Int): Int {
        var h = lo * -0x61c88647 xor hi * -0x7a143595
        h = h xor (h ushr 16)
        return h and mask
    }

    /** The value stored for the key, or -1 if there is none. */
    fun get(hi: Int, lo: Int): Int {
        var i = slot(hi, lo)
        while (true) {
            val v = values[i]
            if (v == EMPTY || (keysLo[i] == lo && keysHi[i] == hi)) return v
            i = (i + 1) and mask
        }
    }

    fun putIfAbsent(hi: Int, lo: Int, value: Short) {
        var i = slot(hi, lo)
        while (true) {
            val v = values[i]
            if (v == EMPTY) break
            if (keysLo[i] == lo && keysHi[i] == hi) return
            i = (i + 1) and mask
        }
        keysHi[i] = hi
        keysLo[i] = lo
        values[i] = value.toInt() and 0xffff
        if (++size * 2 > mask) grow()
    }

    private fun grow() {
        val oldHi = keysHi
        val oldLo = keysLo
        val oldValues = values
        mask = mask * 2 + 1
        keysHi = IntArray(mask + 1)
        keysLo = IntArray(mask + 1)
        values = IntArray(mask + 1) { EMPTY }
        for (j in oldValues.indices) {
            val v = oldValues[j]
            if (v == EMPTY) continue
            var i = slot(oldHi[j], oldLo[j])
            while (values[i] != EMPTY) i = (i + 1) and mask
            keysHi[i] = oldHi[j]
            keysLo[i] = oldLo[j]
            values[i] = v
        }
    }

    private companion object {
        const val EMPTY = -1
    }
}
