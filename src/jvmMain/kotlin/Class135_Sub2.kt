import Class27.method313
import Class98.Companion.method878

/* Class135_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class135_Sub2 internal constructor(var_ha_Sub2: ha_Sub2?, i: Int, `is`: ByteArray?, i_8_: Int, bool: Boolean) : Class135(var_ha_Sub2, 34963, `is`, i_8_, bool), Interface8 {
    private var anInt4837 = 0
    public override fun method1152(i: Int) {
        anInt4840++
        this.aHa_Sub2_1927!!.method3793(1, this)
        if (i >= -78) aClass161_4839 = null
    }

    override fun method34(i: Int): Int {
        anInt4838++
        if (i != -5711) method35(null, -82, 99, -89)
        return anInt4837
    }

    override fun method35(`is`: ByteArray?, i: Int, i_0_: Int, i_1_: Int) {
        if (i_0_ > 18) {
            this.method1150(`is`, 0, i_1_)
            anInt4833++
            anInt4837 = i
        }
    }

    override fun method33(i: Int): Int {
        if (i != -23923) method35(null, -47, -115, -72)
        anInt4836++
        return this.anInt1929
    }

    override fun method36(i: Byte): Long {
        if (i < 76) aClass251_4835 = null
        anInt4842++
        return 0L
    }

    init {
        try {
            anInt4837 = i
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("kaa.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_8_ + ',' + bool + ')'))
        }
    }

    companion object {
        var anInt4833: Int = 0
        var anInt4834: Int = 0
        var aClass251_4835: Class251? = Class251()
        var anInt4836: Int = 0
        var anInt4838: Int = 0
        @JvmField
        var aClass161_4839: Class161? = null
        var anInt4840: Int = 0
        var anInt4841: Int = 0
        var anInt4842: Int = 0
        @JvmField
        var aClass45_4843: Class45? = null
        var anInt4844: Int = 0
        private var aCharArray4845: CharArray? = CharArray(64)
        @JvmField
        var aClass348_Sub42_Sub12_4846: Class348_Sub42_Sub12? = null

        @JvmStatic
        fun method1155(i: Byte) {
            aClass251_4835 = null
            aClass161_4839 = null
            val i_2_ = -29 / ((i - -49) / 43)
            aClass45_4843 = null
            aCharArray4845 = null
            aClass348_Sub42_Sub12_4846 = null
        }

        @JvmStatic
        fun method1156(i: Int, i_3_: Int, `is`: IntArray, i_4_: Int, i_5_: Int) {
            var i_3_ = i_3_
            var i_4_ = i_4_
            i_4_--
            anInt4841++
            val i_6_ = --i_3_ - 7
            if (i == -27) {
                while (i_6_ > i_4_) {
                    `is`[++i_4_] = i_5_
                    `is`[++i_4_] = i_5_
                    `is`[++i_4_] = i_5_
                    `is`[++i_4_] = i_5_
                    `is`[++i_4_] = i_5_
                    `is`[++i_4_] = i_5_
                    `is`[++i_4_] = i_5_
                    `is`[++i_4_] = i_5_
                }
                while (i_3_ > i_4_) `is`[++i_4_] = i_5_
            }
        }

        @JvmStatic
        fun method1157(i: Int, i_7_: Byte) {
            if (i_7_ < -77) {
                Class239_Sub12.anInt5969 = 2
                anInt4834++
                RuntimeException_Sub1.anInt4596 = i
                var l = 0L
                if (Class348_Sub23_Sub3.aString9043 == null) {
                    Class14_Sub4.method254(35, (-87).toByte())
                    return
                } else {
                    val class348_sub49 = (Class348_Sub49(method878((Class110_Sub1.method1039(Class348_Sub23_Sub3.aString9043!!, true)), -126)))
                    l = class348_sub49.readLong(-456577760)
                    Class348_Sub33.aLong6966 = class348_sub49.readLong(-456577760)
                }
                Class132.method1138(method313(l, -95), true, "", 79.toByte())
            }
        }

        fun method1158(i: Int, i_9_: Int, i_10_: Int): Boolean {
            if (i_9_ != -1) aClass161_4839 = null
            anInt4844++
            return (i_10_ and 0x180) != 0
        }

        init {
            for (i in 0..25) aCharArray4845!![i] = (65 + i).toChar()
            for (i in 26..51) aCharArray4845!![i] = (i + 71).toChar()
            for (i in 52..61) aCharArray4845!![i] = (-4 + i).toChar()
            aCharArray4845!![63] = '-'
            aCharArray4845!![62] = '*'
        }
    }
}
