import kotlin.jvm.JvmStatic
import io.IOException

class IOException_Sub1(string: String?) : IOException(string) {
    companion object {

        var aBoolean86: Boolean = false

        var anInt87: Int = 0

        var anInt88: Int = 0

        var anInt89: Int = 0


        var anIntArray91: IntArray? = IntArray(8)

        @JvmStatic
        fun method129(i: Int, i_0_: Int, ls: LongArray?, i_1_: Int, `is`: IntArray?) {
            do {
                try {
                    anInt89++
                    if (i_1_ > i) {
                        val i_2_ = (i_1_ + i) / 2
                        var i_3_ = i
                        val l = ls!![i_2_]
                        ls[i_2_] = ls[i_1_]
                        ls[i_1_] = l
                        val i_4_ = `is`!![i_2_]
                        `is`[i_2_] = `is`[i_1_]
                        `is`[i_1_] = i_4_
                        val i_5_ = if (l == 9223372036854775807L) 0 else 1
                        var i_6_ = i
                        while (i_1_ > i_6_) {
                            if (l - -(i_5_ and i_6_).toLong() > ls[i_6_]) {
                                val l_7_ = ls[i_6_]
                                ls[i_6_] = ls[i_3_]
                                ls[i_3_] = l_7_
                                val i_8_ = `is`[i_6_]
                                `is`[i_6_] = `is`[i_3_]
                                `is`[i_3_++] = i_8_
                            }
                            i_6_++
                        }
                        ls[i_1_] = ls[i_3_]
                        ls[i_3_] = l
                        `is`[i_1_] = `is`[i_3_]
                        `is`[i_3_] = i_4_
                        method129(i, -126, ls, -1 + i_3_, `is`)
                        method129(1 + i_3_, -81, ls, i_1_, `is`)
                    }
                    if (i_0_ < -72) break
                    method130(99)
                } catch (runtimeexception: RuntimeException) {
                    throw TextureLoadException.method2929(runtimeexception, ("gv.A(" + i + ',' + i_0_ + ',' + (if (ls != null) "{...}" else "null") + ',' + i_1_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
                }
                break
            } while (false)
        }

        /**
         * [method129] over keys held as `hi * 2^32 + (lo as unsigned)` in two IntArrays instead of a LongArray.
         * Kotlin/JS emulates Long with heap objects, so the original's per-comparison Long subtract made
         * sorting every model's faces a large share of a region load. The partitioning, including the
         * original's alternating `>`/`>=` tie-break and its Long.MAX_VALUE special case, is reproduced
         * exactly, so the resulting order is identical.
         */
        fun sortIntPairKeys(hi: IntArray, lo: IntArray, idx: IntArray, from: Int, to: Int) {
            if (to <= from) return
            val mid = (to + from) / 2
            var store = from
            val ph = hi[mid]
            val pl = lo[mid]
            val pi = idx[mid]
            hi[mid] = hi[to]; hi[to] = ph
            lo[mid] = lo[to]; lo[to] = pl
            idx[mid] = idx[to]; idx[to] = pi
            val tieBreak = if (ph == Int.MAX_VALUE && pl == -1) 0 else 1
            val plU = pl xor Int.MIN_VALUE
            for (j in from until to) {
                val h = hi[j]
                val cmp = if (ph != h) (if (ph > h) 1 else -1) else plU.compareTo(lo[j] xor Int.MIN_VALUE)
                // Original: pivot + (tieBreak and j) > key[j]
                if (cmp > 0 || (cmp == 0 && (tieBreak and j) != 0)) {
                    val th = hi[j]; hi[j] = hi[store]; hi[store] = th
                    val tl = lo[j]; lo[j] = lo[store]; lo[store] = tl
                    val ti = idx[j]; idx[j] = idx[store]; idx[store] = ti
                    store++
                }
            }
            hi[to] = hi[store]; hi[store] = ph
            lo[to] = lo[store]; lo[store] = pl
            idx[to] = idx[store]; idx[store] = pi
            sortIntPairKeys(hi, lo, idx, from, store - 1)
            sortIntPairKeys(hi, lo, idx, store + 1, to)
        }

        @JvmStatic
        fun method130(i: Int) {
            if (i == 8) {
                anIntArray91 = null
                InboundPacketHeader.aInboundPacketHeader_90 = null
            }
        }

        @JvmStatic
        fun method131(bool: Boolean, i: Int, bool_9_: Boolean, i_10_: Int) {
            anInt87++
            require(!(i_10_ < 8000 || i_10_ > 48000))
            LightType.anInt3248 = i
            FloorUnderlayType.anInt339 = i_10_
            NpcEntityUpdater.aBoolean3652 = bool
            if (bool_9_ != true) method130(-125)
        }
    }
}
