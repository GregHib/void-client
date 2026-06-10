import Class203.method1478

/* Class281 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class281 {
    var aClass351_3644: Class351? = Class351(42, 8)
    var anInt3645: Int = 0
    var anInt3646: Int = 0
    @JvmField
    var anInt3647: Int = 0
    @JvmField
    var aClass351_3648: Class351? = Class351(55, 4)
    @JvmField
    var aClass143_3649: Class143? = null
    @JvmField
    var anInt3650: Int = 0

    fun method2106(string: String?, i: Int) {
        anInt3645++
        val class348_sub47 = method1478(true)
        class348_sub47!!.aClass348_Sub49_Sub2_7116!!.writeByte(false, Class178.aClass29_2353!!.anInt400)
        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), 0)
        val i_0_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), 634)
        val `is` = Class50_Sub1.method463(class348_sub47, false)
        val i_1_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string!!)
        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, Class348_Sub33.anInt6967)
        class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197 += 7
        class348_sub47.aClass348_Sub49_Sub2_7116!!.method3350(i_1_, true, `is`, class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
        class348_sub47.aClass348_Sub49_Sub2_7116!!.method3383(1809639944, -i_0_ + (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197))
        Class348_Sub42_Sub14.method3243(118, class348_sub47)
        Class367_Sub2.anInt7297 = 1
        Class352.anInt4337 = -3
        Class169.anInt2264 = 0
        Class105_Sub1.anInt8398 = 0
    }

    @JvmStatic
    fun method2107(i: Byte) {
        aClass351_3648 = null
        aClass143_3649 = null
        aClass351_3644 = null
        if (i.toInt() != 77) Class281.method2107((-107).toByte())
    }

    fun method2108(string: String, i: Int): Int {
        anInt3646++
        val i_2_ = string.length
        var i_3_ = 0
        var i_4_ = 0
        while (i_2_ > i_4_) {
            i_3_ = (Class354.method3464(string.get(i_4_), false) + ((i_3_ shl 5) - i_3_))
            i_4_++
        }
        if (i != -29286) return 0
        return i_3_
    }
}
