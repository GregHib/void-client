import Class104.Companion.method960
import Class348_Sub40_Sub17_Sub1.Companion.method3093
import Class40.Companion.method368
import kotlin.math.max

/* Class151 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class151 {
    var aShortArray2058: ShortArray? = null
    var aShortArray2060: ShortArray? = null
    var aShortArray2067: ShortArray? = null
    var aByteArray2069: ByteArray? = null

    companion object {
        var anInt2059: Int = 0
        var anInt2061: Int = 0
        var anIntArray2062: IntArray? = IntArray(4)
        var anInt2063: Int = 0
        var anInt2064: Int = 0
        @JvmField
        var anInt2065: Int = 0
        var anInt2066: Int = 0
        var aClass114_2068: Class114? = Class114(68, 6)
        @JvmStatic
        fun method1209(i: Int) {
            val i_0_ = 95 / ((-21 - i) / 45)
            anIntArray2062 = null
            aClass114_2068 = null
        }

        fun method1210(i: Byte, i_1_: Int): Boolean {
            anInt2066++
            if (i > -93) anInt2061 = -39
            return i_1_ == 0 || i_1_ == 2
        }

        @JvmStatic
        fun method1211(i: Int, class105: Class105?, i_2_: Int, class46: Class46?, var_aa: aa?, i_3_: Int, i_4_: Int, i_5_: Int) {
            try {
                anInt2064++
                if (class105 != null) {
                    val i_6_: Int
                    if (Class348_Sub40_Sub21.anInt9282 != 4) i_6_ = (0x3fff and Class314.aFloat3938.toInt() - -r_Sub2.anInt10483)
                    else i_6_ = 0x3fff and Class314.aFloat3938.toInt()
                    val i_7_ = 10 + max(class46!!.anInt709 / 2, class46.anInt789 / i_4_)
                    val i_8_ = i_5_ * i_5_ - -(i_3_ * i_3_)
                    if (i_7_ * i_7_ >= i_8_) {
                        var i_9_ = Class70.anIntArray1207!![i_6_]
                        var i_10_ = Class70.anIntArray1204!![i_6_]
                        if (Class348_Sub40_Sub21.anInt9282 != 4) {
                            i_10_ = 256 * i_10_ / (Class348_Sub49_Sub1.anInt9750 - -256)
                            i_9_ = i_9_ * 256 / (Class348_Sub49_Sub1.anInt9750 - -256)
                        }
                        val i_11_ = i_5_ * i_10_ + i_3_ * i_9_ shr 14
                        val i_12_ = i_3_ * i_10_ + -(i_9_ * i_5_) shr 14
                        class105.method963((i_11_ + (class46.anInt709 / 2 + (i_2_ + -(class105.method966() / 2)))), (i - -(class46.anInt789 / 2) + (-i_12_ + -(class105.method980() / 2))), var_aa, i_2_, i)
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("ok.C(" + i + ',' + (if (class105 != null) "{...}" else "null") + ',' + i_2_ + ',' + (if (class46 != null) "{...}" else "null") + ',' + (if (var_aa != null) "{...}" else "null") + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ')'))
            }
        }

        fun method1212(i: Int, i_13_: Int, i_14_: Int, i_15_: Int) {
            var i = i
            anInt2059++
            i = Class316.aClass348_Sub51_3959!!.aClass239_Sub26_7260!!.method1838(-32350) * i shr 8
            if (i_14_ == i_13_ && !Class74.aBoolean1236) method960(1)
            else if (i_13_ != -1 && (i_13_ != Class267.anInt3428 || !Class167.method1296(true)) && i != 0 && !Class74.aBoolean1236) {
                method368(i, 18002, false, i_13_, Class59_Sub2_Sub1.aClass45_8667, 0, i_15_)
                method3093(93)
            }
            if (Class267.anInt3428 != i_13_) Class209.aClass348_Sub16_Sub3_2718 = null
            Class267.anInt3428 = i_13_
        }

        @JvmStatic
        fun method1213(string: String?, string_16_: String?, i: Int) {
            try {
                if (i > -48) aClass114_2068 = null
                anInt2063++
                RuntimeException_Sub1.anInt4596 = -1
                Class239_Sub12.anInt5969 = if (Loader.skipLobby) 2 else 1
                Class132.method1138(string, false, string_16_, (-95).toByte())
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("ok.E(" + (if (string != null) "{...}" else "null") + ',' + (if (string_16_ != null) "{...}" else "null") + ',' + i + ')'))
            }
        }
    }
}
