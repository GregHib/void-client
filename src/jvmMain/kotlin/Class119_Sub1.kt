import Class13.method226
import Class239_Sub21.Companion.method1813
import Class367_Sub8.Companion.method3549
import jaclib.memory.Buffer

class Class119_Sub1 : Class119, Interface2 {
    private var anInt4697 = 0

    internal constructor(var_ha_Sub2: ha_Sub2?, i: Int, `is`: ByteArray?, i_0_: Int) : super(var_ha_Sub2, `is`, i_0_) {
        try {
            anInt4697 = i
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("cw.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_0_ + ')'))
        }
    }

    internal constructor(var_ha_Sub2: ha_Sub2?, i: Int, buffer: Buffer?) : super(var_ha_Sub2, buffer) {
        try {
            anInt4697 = i
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("cw.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + (if (buffer != null) "{...}" else "null") + ')'))
        }
    }

    override fun method12(i: Byte): Long {
        if (i.toInt() != 42) Companion.method1077(null, (-124).toByte())
        anInt4704++
        return this.aBuffer1792!!.getAddress()
    }

    override fun method13(i: Byte): Int {
        anInt4699++
        if (i.toInt() != -97) return -87
        return anInt4697
    }

    override fun method11(i: Int, i_2_: Int, `is`: ByteArray?, i_3_: Int) {
        anInt4705++
        this.method1076(`is`, i_2_)
        anInt4697 = i
        if (i_3_ != -9894) method10(false)
    }

    override fun method10(bool: Boolean): Int {
        anInt4701++
        if (bool != true) method11(126, 120, null, -73)
        return 0
    }

    companion object {
        @JvmField
        var anInt4698: Int = 0
        @JvmField
        var anInt4699: Int = 0
        @JvmField
        var anInt4700: Int = 0
        @JvmField
        var anInt4701: Int = 0
        var aByte4702: Byte = 0
        @JvmField
        var anInt4703: Int = 0
        @JvmField
        var anInt4704: Int = 0
        @JvmField
        var anInt4705: Int = 0

        @JvmStatic
        fun method1077(var_ha: ha?, i: Byte) {
            anInt4700++
            if ((Class73.anInt4776 >= 2 || r.aBoolean9722) && Class289.aClass46_3701 == null) {
                if (i >= -71) Companion.method1077(null, (-41).toByte())
                var string: String?
                if (r.aBoolean9722 && Class73.anInt4776 < 2) string = (Class28.aString5001 + Class274.aClass274_3515!!.method2063(Class348_Sub33.anInt6967, 544) + Class28.aString5000 + " ->")
                else if (!Class116.shiftClick || !Class182.aClass346_2449!!.method2696(81, -121) || Class73.anInt4776 <= 2) {
                    val class348_sub42_sub12 = Class316.aClass348_Sub42_Sub12_3963
                    if (class348_sub42_sub12 == null) return
                    string = Class316.method2367((-52).toByte(), class348_sub42_sub12)
                    var `is`: IntArray? = null
                    if (!Class148.method1197(-12081, class348_sub42_sub12.anInt9608)) {
                        if (class348_sub42_sub12.anInt9599 != -1) `is` = Exception_Sub1.aClass255_112!!.method1940(98, (class348_sub42_sub12.anInt9599)).anIntArray2772
                        else if (method3549((class348_sub42_sub12.anInt9608), 107.toByte())) {
                            val class348_sub22 = ((Class282.aClass356_3654!!.method3480(class348_sub42_sub12.aLong9605.toInt().toLong(), -6008)) as? Class348_Sub22?)
                            if (class348_sub22 != null) {
                                val npc = (class348_sub22.aNpc_6859)!!
                                var class79 = (npc.aClass79_10505)
                                if (class79!!.anIntArray1377 != null) class79 = (class79.method794((Class318_Sub1_Sub3_Sub3.aClass170_10209!!), -1))
                                if (class79 != null) `is` = class79.anIntArray1342
                            }
                        } else if (method1813(8806, (class348_sub42_sub12.anInt9608))) {
                            val `object`: Any? = null
                            var class51: Class51?
                            if ((class348_sub42_sub12.anInt9608) != 1001) class51 = (Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, ((class348_sub42_sub12.aLong9605) ushr 32 and 0x7fffffffL).toInt()))
                            else class51 = (Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, (class348_sub42_sub12.aLong9605).toInt()))
                            if (class51.anIntArray945 != null) class51 = class51.method480((Class318_Sub1_Sub3_Sub3.aClass170_10209!!), 47.toByte())
                            if (class51 != null) `is` = class51.anIntArray917
                        }
                    } else `is` = (Exception_Sub1.aClass255_112!!.method1940(-73, (class348_sub42_sub12.aLong9605).toInt()).anIntArray2772)
                    if (`is` != null) string += Class163.method1273(`is`, true)
                } else string = Class316.method2367(125.toByte(), Class316.aClass348_Sub42_Sub12_3963!!)
                if (Class73.anInt4776 > 2) string += ("<col=ffffff> / " + (Class73.anInt4776 - 2) + Class274.aClass274_3508!!.method2063(Class348_Sub33.anInt6967, 544))
                if (Class348_Sub36.aClass46_6990 != null) {
                    var class324 = Class348_Sub36.aClass46_6990!!.method426(var_ha, 68.toByte())
                    if (class324 == null) class324 = Class262.aClass324_3326!!
                    class324.method2585(
                        Class175.anIntArray2330,
                        Class348_Sub36.aClass46_6990!!.anInt709,
                        Class341.aClass105Array4234!!,
                        Class348_Sub36.aClass46_6990!!.anInt700,
                        Class348_Sub36.aClass46_6990!!.anInt749,
                        Class348_Sub36.aClass46_6990!!.anInt789,
                        Class348_Sub36.aClass46_6990!!.anInt809,
                        OutputStream_Sub1.aRandom93,
                        Class348_Sub36.aClass46_6990!!.anInt762,
                        Class32.anInt451,
                        Class356.anInt4383,
                        -33,
                        Class332.anInt4141,
                        string,
                        Class195.anIntArray5007
                    )
                    method226(Class195.anIntArray5007!![0], Class195.anIntArray5007!![2], Class195.anIntArray5007!![1], 0, Class195.anIntArray5007!![3])
                } else if (Class21.aClass46_323 != null && (Class348_Sub42_Sub8_Sub2.aClass230_10434 == Class10.aClass230_186)) {
                    val i_1_ = (Class262.aClass324_3326!!.method2571(-1, Class356.anInt4383, Class175.anIntArray2330, string, 16777215, 0, Class341.aClass105Array4234, 16 + Class238_Sub1.anInt5832, 4 + Class120.Companion.anInt4911, OutputStream_Sub1.aRandom93))
                    method226(Class120.Companion.anInt4911 - -4, (Class369.aClass143_4962!!.method1183(true, string) + i_1_), Class238_Sub1.anInt5832, 0, 16)
                }
            }
        }
    }
}
