import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertContentEquals

/**
 * [Whirlpool] replaced the Long-based [WhirlpoolHash] for cache group verification (Long is
 * emulated on JS). These check it against the original and the reference test vector.
 */
class WhirlpoolTest {

    private fun original(data: ByteArray, length: Int): ByteArray {
        val hash = WhirlpoolHash()
        hash.method829(0)
        hash.method832((length * 8).toLong(), data, -69)
        val out = ByteArray(64)
        hash.method833(true, 0, out)
        return out
    }

    @Test
    fun `empty input matches the reference vector`() {
        val expected = ("19FA61D75522A4669B44E39C1D2E1726C530232130D407F89AFEE0964997F7A7" +
            "3E83BE698B288FEBCF88E3E03C4F0757EA8964E59B63D93708B138CC42A66EB3")
            .chunked(2).map { it.toInt(16).toByte() }.toByteArray()
        assertContentEquals(expected, Whirlpool.digest(ByteArray(0), 0, 0))
    }

    @Test
    fun `matches the Long implementation across block boundaries`() {
        val random = Random(3)
        for (length in (0..300) + listOf(1000, 4096, 65_537, 1_000_003)) {
            val data = random.nextBytes(length)
            assertContentEquals(original(data, length), Whirlpool.digest(data, 0, length), "length=$length")
        }
    }

    @Test
    fun `honours offset and length`() {
        val random = Random(4)
        val data = random.nextBytes(500)
        val slice = data.copyOfRange(7, 7 + 321)
        assertContentEquals(original(slice, slice.size), Whirlpool.digest(data, 7, 321))
    }
}
