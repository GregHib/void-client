/* Class65 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class65 internal constructor(class230: Class230?, i: Int, class45: Class45?) {
    private val aClass45_1141: Class45?
    private val aClass60_1145 = Class60(256)
    fun method694(i: Int) {
        anInt1140++
        if (i != -1007) method700(14, 98)
        synchronized(aClass60_1145) {
            aClass60_1145.method587(i + 883)
        }
    }

    fun method695(bool: Boolean) {
        if (bool != true) aClass351_1144 = null
        synchronized(aClass60_1145) {
            aClass60_1145.method590(0)
        }
        anInt1139++
    }

    fun method697(i: Int, i_3_: Int) {
        if (i_3_ == 26) {
            anInt1142++
            synchronized(aClass60_1145) {
                aClass60_1145.method578(i_3_ xor 0x18, i)
            }
        }
    }

    fun method700(i: Int, i_8_: Int): Class348_Sub42_Sub1 {
        anInt1143++
        val i_9_ = -128 / ((-3 - i_8_) / 49)
        var class348_sub42_sub1: Class348_Sub42_Sub1?
        synchronized(aClass60_1145) {
            class348_sub42_sub1 = aClass60_1145.method583(i.toLong(), -101) as Class348_Sub42_Sub1?
        }
        if (class348_sub42_sub1 != null) return class348_sub42_sub1
        val `is`: ByteArray?
        synchronized(aClass45_1141!!) {
            `is` = aClass45_1141.method410(-1860, 26, i)
        }
        class348_sub42_sub1 = Class348_Sub42_Sub1()
        if (`is` != null) class348_sub42_sub1.method3168(Class348_Sub49(`is`), (-101).toByte())
        synchronized(aClass60_1145) {
            aClass60_1145.method582(class348_sub42_sub1, i.toLong(), (-114).toByte())
        }
        return class348_sub42_sub1
    }

    init {
        try {
            aClass45_1141 = class45
            aClass45_1141!!.method407(0, 26)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("kb.<init>(" + (if (class230 != null) "{...}" else "null") + ',' + i + ',' + (if (class45 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt1138: Int = 0
        @JvmField
        var anInt1139: Int = 0
        @JvmField
        var anInt1140: Int = 0
        @JvmField
        var anInt1142: Int = 0
        @JvmField
        var anInt1143: Int = 0
        @JvmField
        var aClass351_1144: Class351?
        @JvmField
        var aClass110_Sub1Array1146: Array<Class110_Sub1?>? = arrayOfNulls<Class110_Sub1>(0)
        @JvmField
        var anInt1147: Int = 0
        @JvmField
        var aClass357ArrayArrayArray1148: Array<Array<Array<Class357?>?>?>? = null

        @JvmStatic
        fun method696(i: Int, i_0_: Int, i_1_: Int, i_2_: Int) {
            if (i_2_ == -1007) {
                if (i == 1009) Class66.method701(Class327.aClass273_4091!!, i_1_, i_0_)
                else if (i != 1012) {
                    if (i == 1002) Class66.method701(Class348_Sub40_Sub32.aClass273_9415!!, i_1_, i_0_)
                    else if (i == 1003) Class66.method701(Class348_Sub12.aClass273_6743!!, i_1_, i_0_)
                    else if (i == 1006) Class66.method701(Class239_Sub17.aClass273_6018!!, i_1_, i_0_)
                } else Class66.method701(Class5_Sub2.aClass273_8356!!, i_1_, i_0_)
                anInt1138++
            }
        }

        @JvmStatic
        fun method698(i: Int) {
            aClass351_1144 = null
            if (i != 2) aClass357ArrayArrayArray1148 = null
            aClass357ArrayArrayArray1148 = null
            aClass110_Sub1Array1146 = null
        }

        @JvmStatic
        fun method699(class45: Class45?, i: Byte, class45_4_: Class45?, class45_5_: Class45?, class45_6_: Class45?) {
            try {
                Class348_Sub40_Sub28.aClass45_9365 = class45_6_
                anInt1147++
                Class318_Sub1_Sub3.aClass45_8755 = class45_5_
                Class229.aClass45_2978 = class45_4_
                Class348_Sub40_Sub33.aClass46ArrayArray9427 = arrayOfNulls<Array<Class46?>>(Class229.aClass45_2978!!.method414(-1))
                Class163.aBooleanArray2162 = BooleanArray(Class229.aClass45_2978!!.method414(-1))
                val i_7_ = -72 % ((35 - i) / 41)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("kb.F(" + (if (class45 != null) "{...}" else "null") + ',' + i + ',' + (if (class45_4_ != null) "{...}" else "null") + ',' + (if (class45_5_ != null) "{...}" else "null") + ',' + (if (class45_6_ != null) "{...}" else "null") + ')'))
            }
        }

        init {
            aClass351_1144 = Class351(37, 2)
        }
    }
}
