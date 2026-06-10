import Class14_Sub3.Companion.method249
import Class275.method2066

/* Class316 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class316 internal constructor(`is`: IntArray) {
    private val anIntArray3961: IntArray

    init {
        var i: Int
        i = 1
        while (`is`.size - -(`is`.size shr 1) >= i) {
            i = i shl 1
        }
        anIntArray3961 = IntArray(i + i)
        for (i_34_ in 0..<i + i) anIntArray3961[i_34_] = -1
        var i_35_ = 0
        while (`is`.size > i_35_) {
            var i_36_: Int
            i_36_ = `is`[i_35_] and -1 + i
            while (anIntArray3961[i_36_ - -i_36_ - -1] != -1) {
                i_36_ = -1 + i and 1 + i_36_
            }
            anIntArray3961[i_36_ + i_36_] = `is`[i_35_]
            anIntArray3961[i_36_ - (-i_36_ + -1)] = i_35_
            i_35_++
        }
    }

    fun method2365(i: Int, i_37_: Int): Int {
        anInt3960++
        if (i != 1) method2365(-74, 111)
        val i_38_ = -1 + (anIntArray3961.size shr 1)
        var i_39_ = i_38_ and i_37_
        while (true) {
            val i_40_ = anIntArray3961[i_39_ + i_39_ - -1]
            if (i_40_ == -1) return -1
            if (i_37_ == anIntArray3961[i_39_ + i_39_]) return i_40_
            i_39_ = i_38_ and 1 + i_39_
        }
    }

    companion object {
        var anInt3958: Int = 0
        @JvmField
        var aClass348_Sub51_3959: Class348_Sub51? = null
        var anInt3960: Int = 0
        var anInt3962: Int = 0
        @JvmField
        var aClass348_Sub42_Sub12_3963: Class348_Sub42_Sub12? = null
        var anInt3964: Int = 0
        var anInt3965: Int = 0
        @JvmField
        var anInt3966: Int = 0

        @JvmStatic
        fun method2363(i: Int) {
            if (i <= -39) {
                anInt3958++
                if (method2066(106.toByte())) {
                    if (Class286_Sub1.aStringArray6200 == null) method249(2)
                    Class168.anInt2254 = 0
                    Class351.aBoolean4328 = true
                }
            }
        }

        fun method2364(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) {
            if (i_7_ == 3) {
                if (i_3_ != i_1_ || i_2_ != i_6_ || i_5_ != i_0_ || i_8_ != i_4_) {
                    var i_9_ = i_1_
                    var i_10_ = i_6_
                    val i_11_ = i_1_ * 3
                    val i_12_ = 3 * i_6_
                    val i_13_ = i_3_ * 3
                    val i_14_ = 3 * i_2_
                    val i_15_ = 3 * i_0_
                    val i_16_ = i_4_ * 3
                    val i_17_ = -i_1_ + (i_13_ + i_5_) + -i_15_
                    val i_18_ = -i_6_ + (i_8_ + (-i_16_ - -i_14_))
                    val i_19_ = -i_13_ + -i_13_ + (i_15_ + i_11_)
                    val i_20_ = i_12_ + -i_14_ + (i_16_ - i_14_)
                    val i_21_ = -i_11_ + i_13_
                    val i_22_ = -i_12_ + i_14_
                    var i_23_ = 128
                    while (i_23_ <= 4096) {
                        val i_24_ = i_23_ * i_23_ shr 12
                        val i_25_ = i_24_ * i_23_ shr 12
                        val i_26_ = i_17_ * i_25_
                        val i_27_ = i_18_ * i_25_
                        val i_28_ = i_19_ * i_24_
                        val i_29_ = i_24_ * i_20_
                        val i_30_ = i_23_ * i_21_
                        val i_31_ = i_22_ * i_23_
                        val i_32_ = i_1_ - -(i_26_ - (-i_28_ + -i_30_) shr 12)
                        val i_33_ = i_6_ - -(i_29_ + (i_27_ - -i_31_) shr 12)
                        Class339.method2665(i_9_, 109.toByte(), i, i_10_, i_33_, i_32_)
                        i_9_ = i_32_
                        i_10_ = i_33_
                        i_23_ += 128
                    }
                } else Class339.method2665(i_1_, 73.toByte(), i, i_6_, i_8_, i_5_)
                anInt3964++
            }
        }

        @JvmStatic
        fun method2366(bool: Boolean) {
            aClass348_Sub42_Sub12_3963 = null
            aClass348_Sub51_3959 = null
            if (bool != true) method2368(46)
        }

        @JvmStatic
        fun method2367(i: Byte, class348_sub42_sub12: Class348_Sub42_Sub12): String? {
            anInt3962++
            val i_41_ = 9 / ((79 - i) / 46)
            if (class348_sub42_sub12.aString9595 == null || class348_sub42_sub12.aString9595!!.length == 0) {
                if ((class348_sub42_sub12.aString9601 == null) || class348_sub42_sub12.aString9601!!.length <= 0) return (class348_sub42_sub12.aString9593)
                return (class348_sub42_sub12.aString9593 + Class274.aClass274_3515!!.method2063(Class348_Sub33.anInt6967, 544) + (class348_sub42_sub12.aString9601))
            }
            if (class348_sub42_sub12.aString9601 == null || class348_sub42_sub12.aString9601!!.length <= 0) return (class348_sub42_sub12.aString9593 + Class274.aClass274_3515!!.method2063(Class348_Sub33.anInt6967, 544) + (class348_sub42_sub12.aString9595))
            return (class348_sub42_sub12.aString9593 + Class274.aClass274_3515!!.method2063(Class348_Sub33.anInt6967, 544) + class348_sub42_sub12.aString9601 + Class274.aClass274_3515!!.method2063(Class348_Sub33.anInt6967, 544) + class348_sub42_sub12.aString9595)
        }

        @JvmStatic
        fun method2368(i: Int) {
            Class15.aClass60_225!!.method590(0)
            anInt3965++
            if (i != -1) aClass348_Sub51_3959 = null
        }
    }
}
