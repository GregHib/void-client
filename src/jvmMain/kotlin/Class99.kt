import OutputStream_Sub2.Companion.method138

/* Class99 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class99 {
    @JvmField
    var aBooleanArrayArray1572: Array<BooleanArray?>? = null
    @JvmField
    var anInt1573: Int = 0
    @JvmField
    var anIntArray1574: IntArray? = IntArray(3)
    @JvmField
    var anInt1575: Int = 0
    @JvmField
    var anInt1576: Int = 0

    @JvmStatic
    fun method880(i: Int, `is`: ByteArray?, is_0_: ByteArray?, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
        var i = i
        var i_1_ = i_1_
        var i_4_ = i_4_
        try {
            anInt1575++
            val i_7_ = -(i shr 2)
            i = -(i and 0x3)
            if (i_2_ != 13880) method880(9, null, null, -128, 85, -75, 62, 85, -51)
            for (i_8_ in -i_3_..-1) {
                for (i_9_ in i_7_..-1) {
                    `is`!![i_4_] = (`is`[i_4_++] + is_0_!![i_1_++]).toByte()
                    `is`[i_4_] = (`is`[i_4_++] + is_0_[i_1_++]).toByte()
                    `is`[i_4_] = (`is`[i_4_++] + is_0_[i_1_++]).toByte()
                    `is`[i_4_] = (`is`[i_4_++] + is_0_[i_1_++]).toByte()
                }
                for (i_10_ in i..-1) `is`!![i_4_] = (`is`[i_4_++] + is_0_!![i_1_++]).toByte()
                i_4_ += i_5_
                i_1_ += i_6_
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("me.D(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_0_ != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'))
        }
    }

    @JvmStatic
    fun method881(class348_sub42_sub13: Class348_Sub42_Sub13, i: Int, bool: Boolean, i_11_: Int) {
        anInt1576++
        if (Class5_Sub1.aBoolean8335) {
            var i_12_ = 0
            var class348_sub42_sub12 = (class348_sub42_sub13.aClass107_9621.method1011(-59) as? Class348_Sub42_Sub12)
            while (class348_sub42_sub12 != null) {
                val i_13_ = method138(class348_sub42_sub12, false)
                if (i_13_ > i_12_) i_12_ = i_13_
                class348_sub42_sub12 = (class348_sub42_sub13.aClass107_9621.method1003(108.toByte()) as? Class348_Sub42_Sub12)
            }
            i_12_ += 8
            if (bool == true) {
                Class177.anInt4669 = 16 * (class348_sub42_sub13.anInt9615) + (if (!Class71.aBoolean1211) 22 else 26)
                val i_14_ = 21 + (class348_sub42_sub13.anInt9615) * 16
                var i_15_ = Class63.anInt1117 + Class135_Sub1.anInt4717
                if (i_12_ + i_15_ > Class321.anInt4017) i_15_ = -i_12_ + Class135_Sub1.anInt4717
                if (i_15_ < 0) i_15_ = 0
                val i_16_ = if (!Class71.aBoolean1211) 31 else 33
                var i_17_ = 13 + i_11_ + -i_16_
                if (i_17_ + i_14_ > Class348_Sub42_Sub8_Sub2.anInt10432) i_17_ = Class348_Sub42_Sub8_Sub2.anInt10432 - i_14_
                Class50_Sub3.anInt5252 = i_15_
                if (i_17_ < 0) i_17_ = 0
                Class242.aClass348_Sub42_Sub13_3152 = class348_sub42_sub13
                Class348_Sub1_Sub1.anInt8806 = i_12_
                Class373.anInt4534 = i_17_
            }
        }
    }

    @JvmStatic
    fun method882(i: Byte) {
        if (i.toInt() != 11) method882(((-62).toByte()).toByte())
        Class348_Sub40_Sub33.aClass46ArrayArray9427 = arrayOfNulls(Class229.aClass45_2978!!.method414(-1))
        anInt1573++
        Class369_Sub2.aClass46ArrayArray8584 = arrayOfNulls(Class229.aClass45_2978!!.method414(-1))
        Class163.aBooleanArray2162 = BooleanArray(Class229.aClass45_2978!!.method414(-1))
    }

    @JvmStatic
    fun method883(i: Byte) {
        aBooleanArrayArray1572 = null
        anIntArray1574 = null
        val i_18_ = -74 / ((i - 17) / 46)
    }
}
