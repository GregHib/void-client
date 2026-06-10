import Class348_Sub10.Companion.method2788
import Class348_Sub10.Companion.method2789

/* Class343 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class343 internal constructor() {
    private val anInt4255: Int
    private val anInt4256: Int
    private val anInt4257 = method2789(16)
    private val anInt4258 = method2789(24)
    private val anInt4259 = method2789(24)
    private val anIntArray4260: IntArray
    private val anInt4261: Int

    fun method2688(fs: FloatArray, i: Int, bool: Boolean) {
        for (i_0_ in 0..<i) fs[i_0_] = 0.0f
        if (!bool) {
            val i_1_ = (Class348_Sub10.aClass370Array6718!![anInt4261]!!.anInt4514)
            val i_2_ = anInt4259 - anInt4258
            val i_3_ = i_2_ / anInt4256
            val `is` = IntArray(i_3_)
            for (i_4_ in 0..7) {
                var i_5_ = 0
                while (i_5_ < i_3_) {
                    if (i_4_ == 0) {
                        var i_6_ = Class348_Sub10.aClass370Array6718!![anInt4261]!!.method3581()
                        for (i_7_ in i_1_ - 1 downTo 0) {
                            if (i_5_ + i_7_ < i_3_) `is`[i_5_ + i_7_] = i_6_ % anInt4255
                            i_6_ /= anInt4255
                        }
                    }
                    for (i_8_ in 0..<i_1_) {
                        val i_9_ = `is`[i_5_]
                        val i_10_ = anIntArray4260[i_9_ * 8 + i_4_]
                        if (i_10_ >= 0) {
                            val i_11_ = anInt4258 + i_5_ * anInt4256
                            val class370 = Class348_Sub10.aClass370Array6718!![i_10_]
                            if (anInt4257 == 0) {
                                val i_12_ = (anInt4256 / class370!!.anInt4514)
                                for (i_13_ in 0..<i_12_) {
                                    val fs_14_ = class370.method3582()
                                    var i_15_ = 0
                                    while ((i_15_ < class370.anInt4514)) {
                                        fs[i_11_ + i_13_ + i_15_ * i_12_] += fs_14_!![i_15_]
                                        i_15_++
                                    }
                                }
                            } else {
                                var i_16_ = 0
                                while (i_16_ < anInt4256) {
                                    val fs_17_ = class370!!.method3582()
                                    var i_18_ = 0
                                    while ((i_18_ < class370.anInt4514)) {
                                        fs[i_11_ + i_16_] += fs_17_!![i_18_]
                                        i_16_++
                                        i_18_++
                                    }
                                }
                            }
                        }
                        if (++i_5_ >= i_3_) break
                    }
                }
            }
        }
    }

    init {
        anInt4256 = method2789(24) + 1
        anInt4255 = method2789(6) + 1
        anInt4261 = method2789(8)
        val `is` = IntArray(anInt4255)
        for (i in 0..<anInt4255) {
            var i_19_ = 0
            val i_20_ = method2789(3)
            val bool = method2788() != 0
            if (bool) i_19_ = method2789(5)
            `is`[i] = i_19_ shl 3 or i_20_
        }
        anIntArray4260 = IntArray(anInt4255 * 8)
        for (i in 0..<anInt4255 * 8) anIntArray4260[i] = (if ((`is`[i shr 3] and (1 shl (i and 0x7))) != 0) method2789(8) else -1)
    }
}
