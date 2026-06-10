/* Class119_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class119_Sub2 internal constructor(var_ha_Sub2: ha_Sub2?, i: Int, `is`: ByteArray?, i_7_: Int) : Class119(var_ha_Sub2, `is`, i_7_), Interface8 {
    private var anInt4827 = 0
    override fun method33(i: Int): Int {
        if (i != -23923) return 92
        anInt4830++
        return 0
    }

    override fun method36(i: Byte): Long {
        if (i <= 76) anInt4827 = 68
        anInt4832++
        return this.aBuffer1792!!.getAddress()
    }

    override fun method34(i: Int): Int {
        anInt4831++
        if (i != -5711) method35(null, -107, -123, -39)
        return anInt4827
    }

    override fun method35(`is`: ByteArray?, i: Int, i_5_: Int, i_6_: Int) {
        this.method1076(`is`, i_6_)
        anInt4828++
        anInt4827 = i
        if (i_5_ < 18) anInt4827 = -41
    }

    init {
        try {
            anInt4827 = i
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("wv.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_7_ + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt4826: Int = 0
        @JvmField
        var anInt4828: Int = 0
        @JvmField
        var anInt4829: Int = 0
        @JvmField
        var anInt4830: Int = 0
        @JvmField
        var anInt4831: Int = 0
        @JvmField
        var anInt4832: Int = 0

        fun method1078(`is`: ShortArray?, i: Int, i_0_: Int): ShortArray {
            anInt4829++
            if (i_0_ < 87) method1078(null, 22, -24)
            val is_1_ = ShortArray(i)
            Class214.method1576(`is`!!, 0, is_1_, 0, i)
            return is_1_
        }

        @JvmStatic
        fun method1079(i: Int, i_2_: Int, i_3_: Int, i_4_: Int): Int {
            var i_2_ = i_2_
            anInt4826++
            if (i != 4095) return 14
            i_2_ = i_2_ and 0x3
            if (i_2_ == 0) return i_3_
            if (i_2_ == 1) return 4095 - i_4_
            if (i_2_ == 2) return 4095 + -i_3_
            return i_4_
        }
    }
}
