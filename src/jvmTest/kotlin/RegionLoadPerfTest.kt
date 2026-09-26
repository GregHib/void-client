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
}
