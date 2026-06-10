import kotlin.math.pow

/* Class370 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class370 {
    @JvmField
    var anInt4514: Int
    private lateinit var aFloatArrayArray4515: Array<FloatArray?>
    private val anIntArray4516: IntArray
    private lateinit var anIntArray4517: IntArray
    private val anInt4518: Int
    private lateinit var anIntArray4519: IntArray

    private fun method3579() {
        val `is` = IntArray(anInt4518)
        val is_0_ = IntArray(33)
        for (i in 0..<anInt4518) {
            val i_1_ = anIntArray4516[i]
            if (i_1_ != 0) {
                val i_2_ = 1 shl 32 - i_1_
                val i_3_ = is_0_[i_1_]
                `is`[i] = i_3_
                val i_4_: Int
                if ((i_3_ and i_2_) == 0) {
                    i_4_ = i_3_ or i_2_
                    for (i_5_ in i_1_ - 1 downTo 1) {
                        val i_6_ = is_0_[i_5_]
                        if (i_6_ != i_3_) break
                        val i_7_ = 1 shl 32 - i_5_
                        if ((i_6_ and i_7_) != 0) {
                            is_0_[i_5_] = is_0_[i_5_ - 1]
                            break
                        }
                        is_0_[i_5_] = i_6_ or i_7_
                    }
                } else i_4_ = is_0_[i_1_ - 1]
                is_0_[i_1_] = i_4_
                for (i_8_ in i_1_ + 1..32) {
                    val i_9_ = is_0_[i_8_]
                    if (i_9_ == i_3_) is_0_[i_8_] = i_4_
                }
            }
        }
        anIntArray4519 = IntArray(8)
        var i = 0
        for (i_10_ in 0..<anInt4518) {
            val i_11_ = anIntArray4516[i_10_]
            if (i_11_ != 0) {
                val i_12_ = `is`[i_10_]
                var i_13_ = 0
                for (i_14_ in 0..<i_11_) {
                    var i_15_ = -2147483648 ushr i_14_
                    if ((i_12_ and i_15_) != 0) {
                        if (anIntArray4519[i_13_] == 0) anIntArray4519[i_13_] = i
                        i_13_ = anIntArray4519[i_13_]
                    } else i_13_++
                    if (i_13_ >= anIntArray4519.size) {
                        val is_16_ = IntArray(anIntArray4519.size * 2)
                        for (i_17_ in anIntArray4519.indices) is_16_[i_17_] = anIntArray4519[i_17_]
                        anIntArray4519 = is_16_
                    }
                    i_15_ = i_15_ ushr 1
                }
                anIntArray4519[i_13_] = i_10_.inv()
                if (i_13_ >= i) i = i_13_ + 1
            }
        }
    }

    fun method3581(): Int {
        var i: Int
        i = 0
        while (anIntArray4519[i] >= 0) {
            i = (if (Class348_Sub10.method2788() != 0) anIntArray4519[i] else i + 1)
        }
        return anIntArray4519[i].inv()
    }

    fun method3582(): FloatArray? {
        return aFloatArrayArray4515[method3581()]
    }

    init {
        Class348_Sub10.method2789(24)
        this.anInt4514 = Class348_Sub10.method2789(16)
        anInt4518 = Class348_Sub10.method2789(24)
        anIntArray4516 = IntArray(anInt4518)
        val bool = Class348_Sub10.method2788() != 0
        if (bool) {
            var i = 0
            var i_20_ = Class348_Sub10.method2789(5) + 1
            while (i < anInt4518) {
                val i_21_ = Class348_Sub10.method2789(Class299.method2253(anInt4518 - i, 126))
                for (i_22_ in 0..<i_21_) anIntArray4516[i++] = i_20_
                i_20_++
            }
        } else {
            val bool_23_ = Class348_Sub10.method2788() != 0
            for (i in 0..<anInt4518) {
                if (bool_23_ && Class348_Sub10.method2788() == 0) anIntArray4516[i] = 0
                else anIntArray4516[i] = Class348_Sub10.method2789(5) + 1
            }
        }
        method3579()
        val i = Class348_Sub10.method2789(4)
        if (i > 0) {
            val f = Class348_Sub10.method2786(Class348_Sub10.method2789(32))
            val f_24_ = Class348_Sub10.method2786(Class348_Sub10.method2789(32))
            val i_25_ = Class348_Sub10.method2789(4) + 1
            val bool_26_ = Class348_Sub10.method2788() != 0
            val i_27_: Int
            if (i == 1) i_27_ = method3580(anInt4518, this.anInt4514)
            else i_27_ = anInt4518 * this.anInt4514
            anIntArray4517 = IntArray(i_27_)
            for (i_28_ in 0..<i_27_) anIntArray4517[i_28_] = Class348_Sub10.method2789(i_25_)
            aFloatArrayArray4515 = Array<FloatArray?>(anInt4518) { FloatArray(this.anInt4514) }
            if (i == 1) {
                for (i_29_ in 0..<anInt4518) {
                    var f_30_ = 0.0f
                    var i_31_ = 1
                    for (i_32_ in 0..<this.anInt4514) {
                        val i_33_ = i_29_ / i_31_ % i_27_
                        val f_34_ = (anIntArray4517[i_33_].toFloat() * f_24_ + f + f_30_)
                        aFloatArrayArray4515[i_29_]!![i_32_] = f_34_
                        if (bool_26_) f_30_ = f_34_
                        i_31_ *= i_27_
                    }
                }
            } else {
                for (i_35_ in 0..<anInt4518) {
                    var f_36_ = 0.0f
                    var i_37_ = i_35_ * this.anInt4514
                    for (i_38_ in 0..<this.anInt4514) {
                        val f_39_ = (anIntArray4517[i_37_].toFloat() * f_24_ + f + f_36_)
                        aFloatArrayArray4515[i_35_]!![i_38_] = f_39_
                        if (bool_26_) f_36_ = f_39_
                        i_37_++
                    }
                }
            }
        }
    }

    companion object {
        private fun method3580(i: Int, i_18_: Int): Int {
            var i_19_: Int
            i_19_ = i.toDouble().pow(1.0 / i_18_.toDouble()).toInt() + 1
            while (Class348_Sub49.method3331(i_18_, 64.toByte(), i_19_) > i) {
                i_19_--
            }
            return i_19_
        }
    }
}
