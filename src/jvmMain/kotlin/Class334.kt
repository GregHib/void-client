import kotlin.math.max

/* Class334 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class334 {
    var anInt4151: Int = 0
    var anInt4154: Int = 0
    var anInt4156: Int
    var anInt4158: Int = 0
    var anInt4162: Int = 128
    var anInt4165: Int = 128

    fun method2648(class334_0_: Class334, i: Byte) {
        this.anInt4158 = class334_0_.anInt4158
        this.anInt4151 = class334_0_.anInt4151
        if (i.toInt() != 118) method2647(true, '\uffe5')
        anInt4159++
        this.anInt4156 = class334_0_.anInt4156
        this.anInt4165 = class334_0_.anInt4165
        this.anInt4154 = class334_0_.anInt4154
        this.anInt4162 = class334_0_.anInt4162
    }

    fun method2649(i: Int): Class334 {
        anInt4163++
        return Class334(this.anInt4156, this.anInt4165, this.anInt4162, this.anInt4158, this.anInt4154, this.anInt4151)
    }

    internal constructor(i: Int) {
        this.anInt4156 = i
    }

    private constructor(i: Int, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int, i_27_: Int) {
        this.anInt4156 = i
        this.anInt4165 = i_23_
        this.anInt4154 = i_26_
        this.anInt4158 = i_25_
        this.anInt4162 = i_24_
        this.anInt4151 = i_27_
    }

    companion object {
        var anIntArray4152: IntArray? = intArrayOf(4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0)
        var anInt4153: Int = 0
        @JvmField
        var anInt4155: Int = -1
        var anInt4157: Int = 0
        var anInt4159: Int = 0
        var anInt4160: Int = 0
        var anInt4161: Int = 0
        var anInt4163: Int = 0
        var anInt4164: Int = 0
        fun method2647(bool: Boolean, c: Char): Boolean {
            anInt4161++
            if (bool != true) method2653(true, 83)
            return c >= '0' && c <= '9'
        }

        fun method2650(class143: Class143?, i: Int, var_aa: aa?, i_1_: Int, i_2_: Int, string: String?, i_3_: Int, class324: Class324?, i_4_: Int, class46: Class46?, i_5_: Int, i_6_: Int) {
            try {
                anInt4153++
                val i_7_: Int
                if (Class348_Sub40_Sub21.anInt9282 == 4) i_7_ = Class314.aFloat3938.toInt() and 0x3fff
                else i_7_ = 0x3fff and r_Sub2.anInt10483 + Class314.aFloat3938.toInt()
                val i_8_ = (max(class46!!.anInt709 / 2, class46.anInt789 / 2) + 10)
                val i_9_ = i_5_ * i_5_ - -(i_1_ * i_1_)
                if (i_9_ <= i_8_ * i_8_) {
                    var i_10_ = Class70.anIntArray1207!![i_7_]
                    var i_11_ = Class70.anIntArray1204!![i_7_]
                    if (Class348_Sub40_Sub21.anInt9282 != 4) {
                        i_11_ = 256 * i_11_ / (Class348_Sub49_Sub1.anInt9750 + 256)
                        i_10_ = 256 * i_10_ / (256 + Class348_Sub49_Sub1.anInt9750)
                    }
                    var i_12_ = i_10_ * i_1_ + i_5_ * i_11_ shr 14
                    val i_13_ = -(i_5_ * i_10_) + i_11_ * i_1_ shr 14
                    val i_14_ = class143!!.method1187(string, false, 100, null)
                    val i_15_ = class143.method1185(null, 0, 0, i_6_, string)
                    i_12_ -= i_14_ / 2
                    if (-class46.anInt709 <= i_12_ && class46.anInt709 >= i_12_ && (i_13_ >= -class46.anInt789) && class46.anInt789 >= i_13_) class324!!.method2584(null, 0, 0, null, i, 0, 50, var_aa, (-i_4_ + (i_3_ + (class46.anInt789 / 2 + (-i_13_ - i_15_)))), i_2_, i_3_, i_14_, (class46.anInt709 / 2 + (i_2_ + i_12_)), false, 1, string)
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("dk.H(" + (if (class143 != null) "{...}" else "null") + ',' + i + ',' + (if (var_aa != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ',' + (if (string != null) "{...}" else "null") + ',' + i_3_ + ',' + (if (class324 != null) "{...}" else "null") + ',' + i_4_ + ',' + (if (class46 != null) "{...}" else "null") + ',' + i_5_ + ',' + i_6_ + ')'))
            }
        }

        fun method2651(string: String?, i: Int): String? {
            if (i != 3) method2650(null, -94, null, 2, -110, null, -7, null, -71, null, -47, 104)
            anInt4160++
            if (!Class348_Sub24.aString6877!!.startsWith("win")) {
                if (Class348_Sub24.aString6877!!.startsWith("linux")) return "lib" + string + ".so"
                if (Class348_Sub24.aString6877!!.startsWith("mac")) return "lib" + string + ".dylib"
            } else return string + ".dll"
            return null
        }

        fun method2652(i: Int, i_16_: Int, i_17_: Int, i_18_: Int): Int {
            anInt4157++
            if (i == i_16_) return i
            val i_19_ = 128 + -i_18_
            if (i_17_ != 1) return -53
            val i_20_ = (0x7f and i_16_) * i_18_ + i_19_ * (i and 0x7f) shr 7
            val i_21_ = (0x380 and i_16_) * i_18_ + (i and 0x380) * i_19_ shr 7
            val i_22_ = (0xfc00 and i_16_) * i_18_ + i_19_ * (i and 0xfc00) shr 7
            return i_22_ and 0xfc00 or (0x380 and i_21_) or (i_20_ and 0x7f)
        }

        @JvmStatic
        fun method2653(bool: Boolean, i: Int): Boolean {
            if (bool != true) anIntArray4152 = null
            anInt4164++
            return i == 10 || i == 11 || i == 12
        }

        @JvmStatic
        fun method2654(i: Int) {
            if (i != -6896) anInt4155 = -7
            anIntArray4152 = null
        }
    }
}
