import Class258_Sub4.Companion.method1974

/* Class240 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class240 internal constructor(class339: Class339?, class125: Class125?) : Interface1 {
    private val aClass339_4682: Class339?
    private val aClass125_4685: Class125?
    override fun method8(i: Byte): Boolean {
        anInt4678++
        val i_0_ = -50 / ((25 - i) / 52)
        return aClass339_4682!!.method2668(-21913)
    }

    override fun method7(i: Int) {
        if (i == 10286) anInt4675++
    }

    override fun method9(i: Byte, bool: Boolean) {
        anInt4676++
        val class295 = aClass339_4682!!.method2667(false, aClass125_4685!!.anInt4918)
        if (class295 != null) {
            val i_7_ = ((aClass125_4685.aClass221_4922!!.method1607(Class92.anInt1524, aClass125_4685.anInt4929, (-118).toByte())) - -aClass125_4685.anInt4924)
            var i_8_ = ((aClass125_4685.aClass341_4925!!.method2679(ha_Sub2.anInt7666, aClass125_4685.anInt4923, i.toInt() xor 0x60b.inv())) - -aClass125_4685.anInt4920)
            if (aClass125_4685.aBoolean4914) Class348_Sub8.aHa6654!!.method3628(i_7_, i_8_, aClass125_4685.anInt4929, aClass125_4685.anInt4923, aClass125_4685.anInt4917, 0)
            i_8_ += method1855(5, class295.aString3756, true, Class262.aClass324_3326, i_7_, i_8_) * 12
            i_8_ += 8
            if (aClass125_4685.aBoolean4914) Class348_Sub8.aHa6654!!.method3709(i_7_, i_8_, i_7_ + aClass125_4685.anInt4929 + -1, i_8_, aClass125_4685.anInt4917, 0)
            i_8_ = ++i_8_ + method1855(5, class295.aString3754, true, Class262.aClass324_3326, i_7_, i_8_) * 12
            i_8_ += 5
            i_8_ += method1855(5, class295.aString3758, true, Class262.aClass324_3326, i_7_, i_8_) * 12
        }
        if (i.toInt() != -49) method8(12.toByte())
    }

    private fun method1855(i: Int, string: String?, bool: Boolean, class324: Class324?, i_9_: Int, i_10_: Int): Int {
        try {
            if (bool != true) return -62
            anInt4677++
            return (class324!!.method2584(null, 0, aClass125_4685!!.anInt4928, null, aClass125_4685.anInt4913, 0, -(i * 2) + aClass125_4685.anInt4923, null, i + i_10_, 0, 0, -(i * 2) + aClass125_4685.anInt4929, i_9_ + i, false, 0, string))
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ta.A(" + i + ',' + (if (string != null) "{...}" else "null") + ',' + bool + ',' + (if (class324 != null) "{...}" else "null") + ',' + i_9_ + ',' + i_10_ + ')'))
        }
    }

    init {
        try {
            aClass125_4685 = class125
            aClass339_4682 = class339
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ta.<init>(" + (if (class339 != null) "{...}" else "null") + ',' + (if (class125 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var aClass323_4672: Class323? = null
        var aFloat4673: Float = 0f
        @JvmField
        var anInt4674: Int = 0
        var anInt4675: Int = 0
        var anInt4676: Int = 0
        var anInt4677: Int = 0
        var anInt4678: Int = 0
        @JvmField
        var aClass105Array4679: Array<Class105?>? = null
        var anInt4680: Int = 0
        var anInt4681: Int = 0
        var aLong4683: Long = 0
        var aClass324_4684: Class324? = null
        @JvmField
        var anInt4686: Int = 0

        fun method1852(i: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
            val class357 = Class147.aClass357ArrayArrayArray2029!![i]!![i_1_]!![i_2_]
            if (class357 != null) {
                val class318_sub1_sub5 = class357.aClass318_Sub1_Sub5_4395
                val class318_sub1_sub5_4_ = class357.aClass318_Sub1_Sub5_4407
                if (class318_sub1_sub5 != null) {
                    class318_sub1_sub5.aShort8781 = ((class318_sub1_sub5.aShort8781) * i_3_ / (16 shl Class362.anInt4459 - 7)).toShort()
                    class318_sub1_sub5.aShort8769 = ((class318_sub1_sub5.aShort8769) * i_3_ / (16 shl Class362.anInt4459 - 7)).toShort()
                }
                if (class318_sub1_sub5_4_ != null) {
                    class318_sub1_sub5_4_.aShort8781 = ((class318_sub1_sub5_4_.aShort8781) * i_3_ / (16 shl Class362.anInt4459 - 7)).toShort()
                    class318_sub1_sub5_4_.aShort8769 = ((class318_sub1_sub5_4_.aShort8769) * i_3_ / (16 shl Class362.anInt4459 - 7)).toShort()
                }
            }
        }

        @JvmStatic
        fun method1853(i: Byte) {
            aClass105Array4679 = null
            if (i.toInt() != 48) anInt4674 = -62
            aClass323_4672 = null
            aClass324_4684 = null
        }

        fun method1854(i: Int, i_5_: Int, bool: Boolean, i_6_: Int): Int {
            if (i < 45) method1852(83, 33, 101, -55)
            anInt4681++
            val class348_sub13 = method1974(37.toByte(), i_5_, bool)
            if (class348_sub13 == null) return 0
            if (i_6_ < 0 || i_6_ >= class348_sub13.anIntArray6758.size) return 0
            return class348_sub13.anIntArray6758[i_6_]
        }
    }
}
