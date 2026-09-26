import kotlin.math.floor
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

/**
 * The web client replaced some Long arithmetic with Int/Double equivalents (Long is emulated on
 * JS). These check the rewrites against the original Long expressions.
 */
class LongFreeArithmeticTest {

    @Test
    fun `projectile step matches the Long formula`() {
        val random = Random(1)
        repeat(200_000) {
            val short = random.nextInt(-32768, 32768).toShort()
            val scaleShift = random.nextInt()
            val i = random.nextInt(-100_000, 100_000)
            val expected = ((short.toLong() * (scaleShift shl 2).toLong() shr 23) * i.toLong()).toInt()
            val scale = (scaleShift shl 2).toDouble()
            val actual = floor(short * scale / 8388608.0).toInt() * i
            assertEquals(expected, actual, "short=$short scaleShift=$scaleShift i=$i")
        }
    }

    @Test
    fun `packed tile ids unpack the same from Int halves`() {
        val random = Random(2)
        repeat(100_000) {
            val l = random.nextLong()
            val expected = IntArray(4) { (0xffffL and (l shr (it * 16))).toInt() }
            val lo = l.toInt()
            val hi = (l ushr 32).toInt()
            val actual = IntArray(4) { slot -> ((if (slot < 2) lo else hi) ushr ((slot and 1) shl 4)) and 0xffff }
            assertContentEquals(expected, actual)
        }
    }

    @Test
    fun `int writers match byte-by-byte stores`() {
        val random = Random(3)
        repeat(10_000) {
            val v = random.nextInt()
            val le = ByteArray(8).also { it.putIntLE(2, v) }
            assertContentEquals(byteArrayOf(0, 0, v.toByte(), (v shr 8).toByte(), (v shr 16).toByte(), (v shr 24).toByte(), 0, 0), le)
            val be = ByteArray(8).also { it.putIntBE(2, v) }
            assertContentEquals(byteArrayOf(0, 0, (v shr 24).toByte(), (v shr 16).toByte(), (v shr 8).toByte(), v.toByte(), 0, 0), be)
            val f = Float.fromBits(v)
            val fl = ByteArray(4).also { it.putFloatLE(0, f) }
            val bits = f.toRawBits()
            assertContentEquals(byteArrayOf(bits.toByte(), (bits shr 8).toByte(), (bits shr 16).toByte(), (bits shr 24).toByte()), fl)
        }
    }
}
