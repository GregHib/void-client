/* Class299 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class299 {
    companion object {
        @JvmField
        var anInt3812: Int = 0
        @JvmField
        var aClass348_Sub49_Sub2_3813: Class348_Sub49_Sub2? = Class348_Sub49_Sub2(7500)
        @JvmField
        var anInt3814: Int = 0

        @JvmStatic
        fun method2253(i: Int, i_0_: Int): Int {
            var i = i
            anInt3814++
            val i_1_ = -124 % ((i_0_ - 55) / 63)
            var i_2_ = 0
            if (i < 0 || i >= 65536) {
                i_2_ += 16
                i = i ushr 16
            }
            if (i >= 256) {
                i = i ushr 8
                i_2_ += 8
            }
            if (i >= 16) {
                i_2_ += 4
                i = i ushr 4
            }
            if (i >= 4) {
                i_2_ += 2
                i = i ushr 2
            }
            if (i >= 1) {
                i = i ushr 1
                i_2_++
            }
            return i_2_ - -i
        }

        @JvmStatic
        fun method2254(i: Int) {
            aClass348_Sub49_Sub2_3813 = null
            if (i != -14804) aClass348_Sub49_Sub2_3813 = null
        }

        @JvmStatic
        fun method2255(i: Int, i_3_: Int, i_4_: Byte, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) {
            Class117.method1070(117.toByte(), i)
            anInt3812++
            if (i_4_ >= -65) Companion.method2255(-118, -20, (-121).toByte(), 100, -62, 77, -119)
            var i_9_ = 0
            var i_10_ = -i_5_ + i
            if (i_10_ < 0) i_10_ = 0
            var i_11_ = i
            var i_12_ = -i
            var i_13_ = i_10_
            var i_14_ = -i_10_
            var i_15_ = -1
            var i_16_ = -1
            val `is` = Class17.anIntArrayArray255!![i_6_]!!
            val i_17_ = i_3_ + -i_10_
            val i_18_ = i_10_ + i_3_
            Class135_Sub2.method1156(-27, i_17_, `is`, -i + i_3_, i_8_)
            Class135_Sub2.method1156(-27, i_18_, `is`, i_17_, i_7_)
            Class135_Sub2.method1156(-27, i + i_3_, `is`, i_18_, i_8_)
            while (i_11_ > i_9_) {
                i_16_ += 2
                i_15_ += 2
                i_14_ += i_16_
                i_12_ += i_15_
                if (i_14_ >= 0 && i_13_ >= 1) {
                    Class348_Sub49_Sub2.anIntArray9757!![i_13_] = i_9_
                    i_13_--
                    i_14_ -= i_13_ shl 1
                }
                i_9_++
                if (i_12_ >= 0) {
                    i_11_--
                    i_12_ -= i_11_ shl 1
                    if (i_10_ <= i_11_) {
                        val is_19_ = Class17.anIntArrayArray255!![i_11_ + i_6_]!!
                        val is_20_ = Class17.anIntArrayArray255!![i_6_ + -i_11_]!!
                        val i_21_ = i_3_ - -i_9_
                        val i_22_ = -i_9_ + i_3_
                        Class135_Sub2.method1156(-27, i_21_, is_19_, i_22_, i_8_)
                        Class135_Sub2.method1156(-27, i_21_, is_20_, i_22_, i_8_)
                    } else {
                        val is_23_ = Class17.anIntArrayArray255!![i_6_ - -i_11_]!!
                        val is_24_ = Class17.anIntArrayArray255!![-i_11_ + i_6_]!!
                        val i_25_ = Class348_Sub49_Sub2.anIntArray9757!![i_11_]
                        val i_26_ = i_9_ + i_3_
                        val i_27_ = i_3_ - i_9_
                        val i_28_ = i_3_ - -i_25_
                        val i_29_ = -i_25_ + i_3_
                        Class135_Sub2.method1156(-27, i_29_, is_23_, i_27_, i_8_)
                        Class135_Sub2.method1156(-27, i_28_, is_23_, i_29_, i_7_)
                        Class135_Sub2.method1156(-27, i_26_, is_23_, i_28_, i_8_)
                        Class135_Sub2.method1156(-27, i_29_, is_24_, i_27_, i_8_)
                        Class135_Sub2.method1156(-27, i_28_, is_24_, i_29_, i_7_)
                        Class135_Sub2.method1156(-27, i_26_, is_24_, i_28_, i_8_)
                    }
                }
                val is_30_ = Class17.anIntArrayArray255!![i_6_ + i_9_]!!
                val is_31_ = Class17.anIntArrayArray255!![-i_9_ + i_6_]!!
                val i_32_ = i_3_ - -i_11_
                val i_33_ = i_3_ - i_11_
                if (i_10_ > i_9_) {
                    val i_34_ = (if (i_9_ <= i_13_) i_13_ else Class348_Sub49_Sub2.anIntArray9757!![i_9_])
                    val i_35_ = i_34_ + i_3_
                    val i_36_ = i_3_ + -i_34_
                    Class135_Sub2.method1156(-27, i_36_, is_30_, i_33_, i_8_)
                    Class135_Sub2.method1156(-27, i_35_, is_30_, i_36_, i_7_)
                    Class135_Sub2.method1156(-27, i_32_, is_30_, i_35_, i_8_)
                    Class135_Sub2.method1156(-27, i_36_, is_31_, i_33_, i_8_)
                    Class135_Sub2.method1156(-27, i_35_, is_31_, i_36_, i_7_)
                    Class135_Sub2.method1156(-27, i_32_, is_31_, i_35_, i_8_)
                } else {
                    Class135_Sub2.method1156(-27, i_32_, is_30_, i_33_, i_8_)
                    Class135_Sub2.method1156(-27, i_32_, is_31_, i_33_, i_8_)
                }
            }
        }
    }
}
