package util

import kotlin.math.ln
import kotlin.math.min
import kotlin.math.sqrt

private val MULTIPLIER: Long = 0x5DEECE66DL
private val ADDEND: Long = 0xBL
private val MASK: Long = (1L shl 48) - 1L
private val DOUBLE_UNIT: Double = 1.0 / 9007199254740992.0 // 2^-53

private var seedUniquifier: Long = 8682522807148012L

private fun nextSeedUniquifier(): Long {
    seedUniquifier *= 1181783497276652981L
    return seedUniquifier
}

/**
 * Faithful port of `java.util.Random`'s 48-bit linear congruential generator.
 *
 * Seeded identically, this produces bit-for-bit the same stream as the JVM
 * class, which is the whole reason to prefer it over `kotlin.random.Random`.
 * It is not cryptographically secure — same as the JDK.
 */
actual class Random {

    private var seed: Long = 0L
    private var nextNextGaussian: Double = 0.0
    private var haveNextNextGaussian: Boolean = false

    actual constructor(seed: Long) {
        setSeed(seed)
    }

    actual constructor() : this(nextSeedUniquifier() xor kotlin.random.Random.nextLong())

    actual fun setSeed(seed: Long) {
        this.seed = (seed xor MULTIPLIER) and MASK
        haveNextNextGaussian = false
    }

    private fun next(bits: Int): Int {
        seed = (seed * MULTIPLIER + ADDEND) and MASK
        return (seed ushr (48 - bits)).toInt()
    }

    actual fun nextInt(): Int = next(32)

    actual fun nextInt(bound: Int): Int {
        require(bound > 0) { "bound must be positive" }

        var r = next(31)
        val m = bound - 1
        if (bound and m == 0) { // bound is a power of two
            return ((bound.toLong() * r.toLong()) shr 31).toInt()
        }
        var u = r
        r = u % bound
        while (u - r + m < 0) { // retry on the rare biased draw
            u = next(31)
            r = u % bound
        }
        return r
    }

    actual fun nextLong(): Long = (next(32).toLong() shl 32) + next(32).toLong()

    actual fun nextBoolean(): Boolean = next(1) != 0

    actual fun nextFloat(): Float = next(24) / (1 shl 24).toFloat()

    actual fun nextDouble(): Double =
        ((next(26).toLong() shl 27) + next(27).toLong()).toDouble() * DOUBLE_UNIT

    actual fun nextGaussian(): Double {
        if (haveNextNextGaussian) {
            haveNextNextGaussian = false
            return nextNextGaussian
        }
        var v1: Double
        var v2: Double
        var s: Double
        do {
            v1 = 2 * nextDouble() - 1
            v2 = 2 * nextDouble() - 1
            s = v1 * v1 + v2 * v2
        } while (s >= 1 || s == 0.0)
        val multiplier = sqrt(-2 * ln(s) / s)
        nextNextGaussian = v2 * multiplier
        haveNextNextGaussian = true
        return v1 * multiplier
    }

    actual fun nextBytes(bytes: ByteArray) {
        var i = 0
        while (i < bytes.size) {
            var rnd = nextInt()
            var n = min(bytes.size - i, 4)
            while (n-- > 0) {
                bytes[i++] = rnd.toByte()
                rnd = rnd shr 8
            }
        }
    }
}

private val sharedRandom: Random = Random()

/** Returns a pseudorandom `Double` uniformly in `[0.0, 1.0)`. */
actual fun random(): Double = sharedRandom.nextDouble()