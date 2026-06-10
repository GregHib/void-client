import Class50_Sub4.Companion.method473
import Class59_Sub1_Sub1.Companion.method558

/* Class103 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class103 {
    @JvmField
    var aClass345_1607: Class345? = method558(96)
    @JvmField
    var anInt1608: Int = 0
    @JvmField
    var anInt1609: Int = 0

    @JvmStatic
    fun method948(bool: Boolean) {
        aClass345_1607 = null
        if (bool != false) aClass345_1607 = null
    }

    @JvmStatic
    fun method949(i: Int, i_0_: Int, i_1_: Int, i_2_: Byte, i_3_: Int, i_4_: Int): Boolean {
        if (i_2_ < 117) aClass345_1607 = null
        anInt1609++
        var i_5_ = i_3_
        while (i_0_ >= i_5_) {
            var i_6_ = i
            while (i_4_ >= i_6_) {
                if ((Class348_Sub42_Sub17.anIntArrayArray9678!![i_5_]!![i_6_] == i_1_) && Class239_Sub8.anIntArrayArray5921!![i_5_]!![i_6_] <= 1) return true
                i_6_++
            }
            i_5_++
        }
        return false
    }

    @JvmStatic
    fun method950(i: Int, i_7_: Int, i_8_: Int, bool: Boolean, i_9_: Byte, i_10_: Int, bool_11_: Boolean) {
        val i_12_ = 73 % ((i_9_ - -31) / 40)
        if (i_8_ > i_7_) {
            val i_13_ = (i_8_ + i_7_) / 2
            var i_14_ = i_7_
            val class110_sub1 = Class65.aClass110_Sub1Array1146!![i_13_]!!
            Class65.aClass110_Sub1Array1146!![i_13_] = Class65.aClass110_Sub1Array1146!![i_8_]
            Class65.aClass110_Sub1Array1146!![i_8_] = class110_sub1
            for (i_15_ in i_7_..<i_8_) {
                if (method473(((-122).toByte()).toByte(), i_10_, class110_sub1, i, bool_11_, bool, (Class65.aClass110_Sub1Array1146!![i_15_])) <= 0) {
                    val class110_sub1_16_ = Class65.aClass110_Sub1Array1146!![i_15_]!!
                    Class65.aClass110_Sub1Array1146!![i_15_] = Class65.aClass110_Sub1Array1146!![i_14_]
                    Class65.aClass110_Sub1Array1146!![i_14_++] = class110_sub1_16_
                }
            }
            Class65.aClass110_Sub1Array1146!![i_8_] = Class65.aClass110_Sub1Array1146!![i_14_]
            Class65.aClass110_Sub1Array1146!![i_14_] = class110_sub1
            method950(i, i_7_, i_14_ + -1, bool, 114.toByte(), i_10_, bool_11_)
            method950(i, i_14_ - -1, i_8_, bool, 50.toByte(), i_10_, bool_11_)
        }
        anInt1608++
    }
}
