/**
 * Minimal arbitrary-precision integer, byte-compatible with java.math.BigInteger
 * for the slice of the API the RSA login/JS5 crypto uses:
 *
 *   BigInt(hex, 16)         construct positive value from a hex string
 *   BigInt(ByteArray)       construct from big-endian TWO'S-COMPLEMENT signed bytes
 *   modPow(exp, mod)        modular exponentiation
 *   toByteArray()           big-endian two's-complement, minimal length (Java semantics)
 *
 * Magnitude is stored sign-magnitude as a big-endian array of 32-bit limbs
 * (most-significant first), no leading-zero limbs. sign is -1, 0, or 1.
 *
 * This is intentionally simple (schoolbook multiply, binary long division).
 * RSA blocks here are 64–128 bytes, exponent 0x10001, so performance is fine.
 */
class BigInt private constructor(val sign: Int, val mag: IntArray) {

    constructor(value: ByteArray) : this(fromSignedBytes(value).first, fromSignedBytes(value).second)

    constructor(hex: String, radix: Int) : this(1, parseHexMag(hex)) {
        require(radix == 16) { "only radix 16 supported" }
    }

    fun toByteArray(): ByteArray = toSignedBytes(sign, mag)

    private fun isZero() = mag.isEmpty()

    /** this^exp mod m, for this >= 0 conceptually (Java computes on the signed value). */
    fun modPow(exp: BigInt, m: BigInt): BigInt {
        require(m.sign > 0) { "modulus must be positive" }
        // Reduce base into [0, m): Java semantics use the signed value of `this`.
        var base = this.mod(m)
        var result = ONE.mod(m) // 1 mod m
        var e = exp
        if (e.sign == 0) return result
        require(e.sign > 0) { "negative exponent unsupported" }
        // square-and-multiply over exponent bits, LSB first
        while (e.sign != 0) {
            if (e.testBit0()) result = result.mulMod(base, m)
            e = e.shiftRight1()
            if (e.sign != 0) base = base.mulMod(base, m)
        }
        return result
    }

    private fun mulMod(o: BigInt, m: BigInt): BigInt = this.multiply(o).mod(m)

    // ---- sign-magnitude arithmetic on non-negative magnitudes ----

    private fun testBit0(): Boolean = mag.isNotEmpty() && (mag[mag.size - 1] and 1) == 1

    private fun shiftRight1(): BigInt {
        if (isZero()) return ZERO
        val out = IntArray(mag.size)
        var carry = 0
        for (i in mag.indices) {
            val cur = mag[i].toLong() and 0xFFFFFFFFL
            out[i] = ((carry.toLong() shl 32 or cur) ushr 1).toInt()
            carry = (cur and 1L).toInt()
        }
        return of(1, out)
    }

    fun multiply(o: BigInt): BigInt {
        if (isZero() || o.isZero()) return ZERO
        val a = mag; val b = o.mag
        val res = IntArray(a.size + b.size)
        for (i in a.indices.reversed()) {
            var carry = 0L
            val ai = a[i].toLong() and 0xFFFFFFFFL
            var k = i + b.size
            for (j in b.indices.reversed()) {
                val bj = b[j].toLong() and 0xFFFFFFFFL
                val cur = (res[k].toLong() and 0xFFFFFFFFL) + ai * bj + carry
                res[k] = cur.toInt()
                carry = cur ushr 32
                k--
            }
            res[k] = (res[k].toLong() and 0xFFFFFFFFL).plus(carry).toInt()
        }
        return of(sign * o.sign, res)
    }

    /** Non-negative remainder this mod m (m > 0), matching Java's BigInteger.mod. */
    fun mod(m: BigInt): BigInt {
        val r = remainder(m)            // sign follows dividend
        return if (r.sign < 0) r.add(m) else r
    }

    /** Truncated remainder (sign of dividend), like BigInteger.remainder. */
    private fun remainder(m: BigInt): BigInt {
        val cmp = compareMag(this.mag, m.mag)
        if (cmp < 0) return this
        if (cmp == 0) return ZERO
        val rem = divRemMag(this.mag, m.mag).second
        return of(if (rem.isEmpty()) 0 else this.sign, rem)
    }

    /** Addition for same/opposite signs (only the cases mod() needs: r(<0) + m(>0)). */
    fun add(o: BigInt): BigInt {
        if (isZero()) return o
        if (o.isZero()) return this
        if (sign == o.sign) return of(sign, addMag(mag, o.mag))
        // opposite signs: subtract smaller magnitude from larger
        val c = compareMag(mag, o.mag)
        if (c == 0) return ZERO
        return if (c > 0) of(sign, subMag(mag, o.mag)) else of(o.sign, subMag(o.mag, mag))
    }

    companion object {
        val ZERO = BigInt(0, IntArray(0))
        val ONE = BigInt(1, intArrayOf(1))

        private fun of(sign: Int, mag: IntArray): BigInt {
            val m = stripLeadingZeros(mag)
            return if (m.isEmpty()) ZERO else BigInt(if (sign == 0) 1 else sign, m)
        }

        private fun stripLeadingZeros(a: IntArray): IntArray {
            var i = 0
            while (i < a.size && a[i] == 0) i++
            return if (i == 0) a else a.copyOfRange(i, a.size)
        }

        private fun compareMag(a: IntArray, b: IntArray): Int {
            if (a.size != b.size) return if (a.size < b.size) -1 else 1
            for (i in a.indices) {
                val x = a[i].toLong() and 0xFFFFFFFFL
                val y = b[i].toLong() and 0xFFFFFFFFL
                if (x != y) return if (x < y) -1 else 1
            }
            return 0
        }

        private fun addMag(a: IntArray, b: IntArray): IntArray {
            val (big, small) = if (a.size >= b.size) a to b else b to a
            val out = IntArray(big.size + 1)
            var carry = 0L
            var ib = big.size - 1; var is_ = small.size - 1; var io = out.size - 1
            while (ib >= 0) {
                var sum = (big[ib].toLong() and 0xFFFFFFFFL) + carry
                if (is_ >= 0) { sum += small[is_].toLong() and 0xFFFFFFFFL; is_-- }
                out[io] = sum.toInt()
                carry = sum ushr 32
                ib--; io--
            }
            out[io] = carry.toInt()
            return stripLeadingZeros(out)
        }

        /** a - b, requires a >= b. */
        private fun subMag(a: IntArray, b: IntArray): IntArray {
            val out = IntArray(a.size)
            var borrow = 0L
            var ia = a.size - 1; var ib = b.size - 1; var io = out.size - 1
            while (ia >= 0) {
                var diff = (a[ia].toLong() and 0xFFFFFFFFL) - borrow
                if (ib >= 0) { diff -= b[ib].toLong() and 0xFFFFFFFFL; ib-- }
                if (diff < 0) { diff += 0x100000000L; borrow = 1 } else borrow = 0
                out[io] = diff.toInt()
                ia--; io--
            }
            return stripLeadingZeros(out)
        }

        /** Binary long division of magnitudes: returns (quotient, remainder). a >= b, b != 0. */
        private fun divRemMag(a: IntArray, b: IntArray): Pair<IntArray, IntArray> {
            val totalBits = a.size * 32
            val quo = IntArray(a.size)
            var rem = IntArray(0)
            for (bit in 0 until totalBits) {
                rem = shiftLeft1Or(rem, magBit(a, totalBits - 1 - bit))
                if (compareMag(rem, b) >= 0) {
                    rem = subMag(rem, b)
                    setMagBit(quo, totalBits - 1 - bit)
                }
            }
            return stripLeadingZeros(quo) to stripLeadingZeros(rem)
        }

        private fun magBit(a: IntArray, bitFromLsb: Int): Int {
            val limb = a.size - 1 - (bitFromLsb ushr 5)
            if (limb < 0) return 0
            return (a[limb] ushr (bitFromLsb and 31)) and 1
        }

        private fun setMagBit(a: IntArray, bitFromLsb: Int) {
            val limb = a.size - 1 - (bitFromLsb ushr 5)
            a[limb] = a[limb] or (1 shl (bitFromLsb and 31))
        }

        private fun shiftLeft1Or(a: IntArray, lowBit: Int): IntArray {
            val out = IntArray(a.size + 1)
            var carry = lowBit
            for (i in a.indices.reversed()) {
                val cur = a[i].toLong() and 0xFFFFFFFFL
                out[i + 1] = ((cur shl 1) or carry.toLong()).toInt()
                carry = (cur ushr 31).toInt()
            }
            out[0] = carry
            return stripLeadingZeros(out)
        }

        private fun parseHexMag(hexIn: String): IntArray {
            var hex = hexIn.trim()
            require(hex.isNotEmpty()) { "empty hex" }
            // pad to a multiple of 8 hex digits (32-bit limbs)
            val pad = (8 - hex.length % 8) % 8
            if (pad != 0) hex = "0".repeat(pad) + hex
            val limbs = IntArray(hex.length / 8)
            for (i in limbs.indices) {
                limbs[i] = hex.substring(i * 8, i * 8 + 8).toLong(16).toInt()
            }
            return stripLeadingZeros(limbs)
        }

        // ---- byte <-> value, matching java.math.BigInteger (big-endian two's complement) ----

        private fun fromSignedBytes(bytes: ByteArray): Pair<Int, IntArray> {
            if (bytes.isEmpty()) return 0 to IntArray(0)
            val negative = (bytes[0].toInt() and 0x80) != 0
            if (!negative) {
                val mag = bytesToMag(bytes)
                return (if (mag.isEmpty()) 0 else 1) to mag
            }
            // negative: value = magBytes interpreted, magnitude = 2^(8n) - value
            // compute magnitude of two's complement: invert + 1 over the byte array
            val inv = ByteArray(bytes.size)
            for (i in bytes.indices) inv[i] = bytes[i].toInt().inv().toByte()
            // +1
            var carry = 1
            for (i in inv.indices.reversed()) {
                val v = (inv[i].toInt() and 0xFF) + carry
                inv[i] = v.toByte()
                carry = v ushr 8
                if (carry == 0) break
            }
            val mag = bytesToMag(inv)
            return (if (mag.isEmpty()) 0 else -1) to mag
        }

        private fun bytesToMag(bytes: ByteArray): IntArray {
            // big-endian bytes -> big-endian 32-bit limbs
            var start = 0
            while (start < bytes.size && bytes[start].toInt() == 0) start++
            val len = bytes.size - start
            if (len == 0) return IntArray(0)
            val nLimbs = (len + 3) / 4
            val mag = IntArray(nLimbs)
            var b = bytes.size - 1
            for (limb in nLimbs - 1 downTo 0) {
                var word = 0
                var shift = 0
                var k = 0
                while (k < 4 && b >= start) {
                    word = word or ((bytes[b].toInt() and 0xFF) shl shift)
                    shift += 8; b--; k++
                }
                mag[limb] = word
            }
            return mag
        }

        private fun toSignedBytes(sign: Int, mag: IntArray): ByteArray {
            if (mag.isEmpty()) return byteArrayOf(0)
            // magnitude as big-endian bytes, trimmed of leading zero bytes
            val raw = ByteArray(mag.size * 4)
            for (i in mag.indices) {
                val v = mag[i]
                raw[i * 4] = (v ushr 24).toByte()
                raw[i * 4 + 1] = (v ushr 16).toByte()
                raw[i * 4 + 2] = (v ushr 8).toByte()
                raw[i * 4 + 3] = v.toByte()
            }
            var start = 0
            while (start < raw.size - 1 && raw[start].toInt() == 0) start++
            val magBytes = raw.copyOfRange(start, raw.size)
            if (sign >= 0) {
                // prepend 0x00 if high bit set, so it reads as positive
                return if ((magBytes[0].toInt() and 0x80) != 0) byteArrayOf(0) + magBytes else magBytes
            }
            // negative: two's complement
            val needExtra = (magBytes[0].toInt() and 0x80) != 0
            val out = if (needExtra) ByteArray(magBytes.size + 1) else ByteArray(magBytes.size)
            val off = out.size - magBytes.size
            for (i in magBytes.indices) out[off + i] = magBytes[i]
            // invert all
            for (i in out.indices) out[i] = out[i].toInt().inv().toByte()
            // +1
            var carry = 1
            for (i in out.indices.reversed()) {
                val v = (out[i].toInt() and 0xFF) + carry
                out[i] = v.toByte()
                carry = v ushr 8
                if (carry == 0) break
            }
            return out
        }
    }
}
