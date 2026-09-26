import java.util.zip.Deflater
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class RegionLoadPerfTest {

    private fun deflateRaw(data: ByteArray, level: Int, strategy: Int = Deflater.DEFAULT_STRATEGY): ByteArray {
        val deflater = Deflater(level, true)
        deflater.setStrategy(strategy)
        deflater.setInput(data)
        deflater.finish()
        val out = java.io.ByteArrayOutputStream()
        val buf = ByteArray(4096)
        while (!deflater.finished()) out.write(buf, 0, deflater.deflate(buf))
        deflater.end()
        return out.toByteArray()
    }

    private fun sample(random: Random, size: Int): ByteArray {
        // Mix of repetitive (long matches, dynamic trees) and random (literals, stored blocks) runs.
        val out = ByteArray(size)
        var i = 0
        while (i < size) {
            val run = minOf(size - i, 1 + random.nextInt(2000))
            if (random.nextBoolean()) {
                val period = 1 + random.nextInt(40)
                for (j in 0 until run) out[i + j] = ((j % period) * 7 + period).toByte()
            } else {
                for (j in 0 until run) out[i + j] = random.nextInt(256).toByte()
            }
            i += run
        }
        return out
    }

    private fun roundTrip(data: ByteArray, compressed: ByteArray) {
        val inflate = Inflate(true)
        // Surrounding bytes check that setInput's offset/length are honoured.
        val padded = ByteArray(compressed.size + 8)
        compressed.copyInto(padded, 3)
        inflate.setInput(padded, 3, compressed.size)
        val out = ByteArray(data.size)
        assertEquals(data.size, inflate.inflate(out))
        assertContentEquals(data, out)
    }

    @Test
    fun `inflate matches java zip across block types`() {
        val random = Random(1234)
        val sizes = listOf(0, 1, 2, 17, 255, 256, 1000, 65535, 70000, 250_000)
        for (size in sizes) {
            val data = sample(random, size)
            for (level in listOf(0, 1, 6, 9)) roundTrip(data, deflateRaw(data, level))
            roundTrip(data, deflateRaw(data, 6, Deflater.HUFFMAN_ONLY))
            roundTrip(data, deflateRaw(data, 6, Deflater.FILTERED))
        }
    }

    @Test
    fun `inflate handles stored blocks after huffman blocks`() {
        // Deflater switches between compressed and stored blocks as the input's entropy changes;
        // a stored block after a Huffman block exercises the byte-realignment rewind.
        val random = Random(99)
        repeat(20) {
            val data = sample(random, 20_000 + random.nextInt(200_000))
            roundTrip(data, deflateRaw(data, 1 + random.nextInt(9)))
        }
    }

    @Test
    fun `hashtable int bucket index matches original long mask`() {
        val random = Random(7)
        for (size in listOf(0, 1, 2, 8, 64, 1024, 1 shl 20, Int.MAX_VALUE, 3, 1000)) {
            repeat(2000) {
                val l = when (it % 4) {
                    0 -> random.nextLong()
                    1 -> random.nextInt().toLong()
                    2 -> -random.nextLong(0, Long.MAX_VALUE)
                    else -> random.nextLong(0, 1L shl 40)
                }
                assertEquals((l and (size - 1).toLong()).toInt(), l.toInt() and (size - 1))
            }
        }
        val table = Hashtable(256)
        val keys = LongArray(3000) { if (it % 2 == 0) random.nextLong() else -random.nextInt(0, 100000).toLong() }.distinct()
        val nodes = keys.map { k -> LinkedListNode().also { table.method3483(99, k, it) } }
        keys.forEachIndexed { i, k -> assertEquals(nodes[i], table.method3480(k, -6008)) }
    }

    @Test
    fun `int pair sort matches original long sort`() {
        val random = Random(42)
        repeat(500) {
            val n = random.nextInt(0, 300)
            val his = IntArray(n)
            val los = IntArray(n)
            val longs = LongArray(n)
            for (i in 0 until n) {
                if (random.nextInt(10) == 0) {
                    his[i] = Int.MAX_VALUE; los[i] = -1; longs[i] = Long.MAX_VALUE
                    continue
                }
                // Small ranges so duplicate keys (tie-break paths) are common.
                val a = random.nextInt(-3, 4) shl random.nextInt(0, 24)
                val b = if (random.nextBoolean()) random.nextInt(-4, 4) else random.nextInt()
                longs[i] = (a.toLong() shl 32) - -b.toLong()
                his[i] = if (b < 0) a - 1 else a
                los[i] = b
            }
            val idxA = IntArray(n) { it }
            val idxB = IntArray(n) { it }
            IOException_Sub1.method129(0, -107, longs, n - 1, idxA)
            IOException_Sub1.sortIntPairKeys(his, los, idxB, 0, n - 1)
            assertContentEquals(idxA, idxB)
        }
    }

    @Test
    fun `int pair vertex keys match original long keys`() {
        val random = Random(9)
        val edges = intArrayOf(0, 1, 2, -1, -2, Int.MAX_VALUE, Int.MIN_VALUE, Int.MAX_VALUE - 1, Int.MIN_VALUE + 1)
        fun pick(): Int = when (random.nextInt(4)) {
            0 -> edges[random.nextInt(edges.size)]
            1 -> random.nextInt(-3, 3)
            else -> random.nextInt()
        }
        repeat(200_000) {
            // Both OpenGlModel call-site shapes: a = sum of shifted Ints, b = Int, c = the 0..2 offset.
            val i736 = pick(); val i747 = pick(); val i738 = pick()
            val b = pick()
            val c = if (random.nextBoolean()) random.nextInt(0, 3) else pick()
            val original = (((i736 shl 8).toLong() + ((i747 shl 24).toLong() + i738.toLong())) shl 32) + b.toLong() + c.toLong()
            val a = (i736 shl 8) + (i747 shl 24) + i738
            assertEquals((original ushr 32).toInt(), OpenGlModel.vertexKeyHi(a, b, c))
            assertEquals(original.toInt(), b + c)
        }
    }

    @Test
    fun `int pair terrain keys match original long keys`() {
        val random = Random(11)
        fun pick(): Int = when (random.nextInt(4)) {
            0 -> random.nextInt(-2, 2)
            1 -> random.nextInt(0, 1 shl 16)
            else -> random.nextInt()
        }
        repeat(200_000) {
            val a = pick(); val b = pick(); val c = pick(); val d = pick()
            val original = ((a shl 16).toLong() or (c.toLong() shl 32 or (d.toLong() shl 48)) or b.toLong())
            assertEquals((original ushr 32).toInt(), OpenGlTerrainTile.terrainKeyHi(a, b, c, d))
            assertEquals(original.toInt(), (a shl 16) or b)
        }
    }

    @Test
    fun `int pair short map matches hashtable of short key nodes`() {
        val random = Random(13)
        repeat(200) {
            val n = random.nextInt(0, 5000)
            val table = Hashtable(maxOf(1, Integer.highestOneBit(maxOf(1, n / 4))))
            val map = IntPairShortMap(random.nextInt(0, 64))
            var next = 0
            repeat(n) {
                // Narrow key space so repeats are common; sometimes skip the lookup, as the terrain code does.
                val hi = random.nextInt(-2, 3)
                val lo = random.nextInt(-40, 40)
                val key = (hi.toLong() shl 32) or (lo.toLong() and 0xffffffffL)
                val lookup = random.nextInt(4) != 0
                val node = if (lookup) table.method3480(key, -6008) as ShortKeyNode? else null
                val found = if (lookup) map.get(hi, lo) else -1
                assertEquals(node?.aShort6911?.toInt()?.and(0xffff) ?: -1, found)
                if (node == null) {
                    val value = (next++ * 7919).toShort()
                    table.method3483(114.toByte(), key, ShortKeyNode(value))
                    map.putIfAbsent(hi, lo, value)
                }
            }
        }
    }
}
