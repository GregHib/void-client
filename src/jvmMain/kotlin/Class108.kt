import Class348_Sub23_Sub4.Companion.method2988
import Class89.Companion.method850

/* Class108 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class108 {
    @JvmField
    var anInt1656: Int = 0
    @JvmField
    var aClass364_1657: Class364? = Class364("WTWIP", 3)
    @JvmField
    var anInt1658: Int = 0
    @JvmField
    var anInt1659: Int = 0
    @JvmField
    var anInt1660: Int = 0
    var aBoolean1661: Boolean = true
    @JvmField
    var aClass304_1662: Class304? = Class304(4)
    @JvmField
    var anInt1663: Int = 0
    @JvmField
    var aClass105_1664: Class105? = null

    fun method1012(f: Float, f_0_: Float, f_1_: Float, f_2_: Float, i: Int, f_3_: Float, i_4_: Byte, f_5_: Float): Float {
        anInt1659++
        var f_6_ = 0.0f
        val f_7_ = -f_3_ + f_0_
        val f_8_ = -f + f_5_
        val f_9_ = -f_1_ + f_2_
        if (i_4_ < 99) method1015(-13, -42, false)
        var f_10_ = 0.0f
        var f_11_ = 0.0f
        var f_12_ = 0.0f
        while (f_6_ < 1.1f) {
            val f_13_ = f_7_ * f_6_ + f_3_
            val f_14_ = f + f_6_ * f_8_
            val f_15_ = f_1_ + f_9_ * f_6_
            val i_16_ = f_13_.toInt() shr 9
            val i_17_ = f_15_.toInt() shr 9
            if (i_16_ > 0 && i_17_ > 0 && Class367_Sub4.anInt7319 > i_16_ && (i_17_ < Class348_Sub40_Sub3.anInt9109)) {
                var i_18_ = (Class132.aPlayer_1907!!.plane).toInt()
                if (i_18_ < 3 && ((Class348_Sub33.aByteArrayArrayArray6962!![1]!![i_16_]!![i_17_]).toInt() and 0x2) != 0) i_18_++
                val i_19_ = Class348_Sub1_Sub1.aSArray8801!![i_18_]!!.method3986(f_13_.toInt(), f_15_.toInt(), 109.toByte())
                if (f_14_ > i_19_.toFloat()) {
                    if (i < 2) return f_6_
                    return (f_6_ - 0.1f + method1012(f_11_, f_13_, f_12_, f_15_, i - 1, f_10_, 122.toByte(), f_14_) * 0.1f)
                }
            }
            f_10_ = f_13_
            f_11_ = f_14_
            f_6_ += 0.1f
            f_12_ = f_15_
        }
        return -1.0f
    }

    @JvmStatic
    fun method1013(i: Byte) {
        aClass364_1657 = null
        if (i < 111) method1013(17.toByte())
        aClass304_1662 = null
        aClass105_1664 = null
    }

    fun method1014(i: Int) {
        anInt1660++
        var class348_sub42_sub6 = r_Sub2.aClass262_10492!!.method1995(4) as? Class348_Sub42_Sub6
        while (class348_sub42_sub6 != null) {
            val class318_sub1_sub3_sub4 = (class348_sub42_sub6.aClass318_Sub1_Sub3_Sub4_9538)!!
            if (class318_sub1_sub3_sub4.aBoolean10345) {
                class348_sub42_sub6.method2715(76.toByte())
                class318_sub1_sub3_sub4.method2466(false)
            } else if (Class367_Sub11.anInt7396 >= (class318_sub1_sub3_sub4.anInt10349)) {
                class318_sub1_sub3_sub4.method2470(Class348_Sub51.anInt7267, ((-16).toByte()).toByte())
                if (class318_sub1_sub3_sub4.aBoolean10345) class348_sub42_sub6.method2715(42.toByte())
                else method850(class318_sub1_sub3_sub4, true)
            }
            class348_sub42_sub6 = (r_Sub2.aClass262_10492!!.method1990(55.toByte()) as? Class348_Sub42_Sub6)
        }
        if (i != -4) aBoolean1661 = false
    }

    fun method1015(i: Int, i_20_: Int, bool: Boolean) {
        anInt1658++
        val class190 = Class262.aClass190ArrayArray3335!![i]!![i_20_]
        if (class190 != null) {
            Class196.anInt2601 = class190.anInt2535
            Class21.anInt325 = class190.anInt2538
            Class318_Sub1_Sub3_Sub1.anInt10023 = class190.anInt2548
        }
        method2988(bool)
    }
}
