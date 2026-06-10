/* aa_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class aa_Sub2 : aa {
    @JvmField
    var anInterface18_Impl3_5196: Interface18_Impl3? = null

    constructor(var_ha_Sub3: ha_Sub3?, i: Int, i_16_: Int, `is`: ByteArray?) {
        try {
            this.anInterface18_Impl3_5196 = var_ha_Sub3!!.method3944(`is`, i, Class348_Sub40_Sub38.aClass304_9471, 2, false, i_16_)
            this.anInterface18_Impl3_5196!!.method66(false, false, 25688)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("lp.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + i + ',' + i_16_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    constructor(var_ha_Sub3: ha_Sub3?, i: Int, i_17_: Int, `is`: IntArray?) {
        try {
            this.anInterface18_Impl3_5196 = var_ha_Sub3!!.method3839(i_17_, i, -15137, false, `is`)
            this.anInterface18_Impl3_5196!!.method66(false, false, 25688)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("lp.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + i + ',' + i_17_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt5194: Int = 0
        @JvmField
        var anInt5195: Int = 0
        @JvmField
        var aStringArray5197: Array<String?>? = arrayOfNulls<String>(100)
        @JvmField
        var anInt5198: Int = 0
        @JvmField
        var aClass161_5199: Class161? = null

        @JvmStatic
        fun method162(i: Byte) {
            aStringArray5197 = null
            if (i >= -67) aClass161_5199 = null
            aClass161_5199 = null
        }

        @JvmStatic
        fun method163(i: Int): Int {
            anInt5198++
            if (i != 512) method165(122, 62, -125, 72, -74, 116, 43, 104.toByte(), 62, -115)
            return Class51.aClass311_897!!.method2325((-98).toByte())
        }

        @JvmStatic
        fun method164(i: Int, i_0_: Int, i_1_: Byte, i_2_: Int): Boolean {
            anInt5195++
            if (!Class348_Sub40_Sub23.aBoolean9307 || !Class23.aBoolean351) return false
            if (Class225.anInt2946 < 100) return false
            val i_3_ = Class354.anIntArrayArrayArray4356!![i]!![i_0_]!![i_2_]
            if (i_3_ == -Class234.anInt3049) return false
            if (Class234.anInt3049 == i_3_) return true
            if (Class332.aSArray4142 == aa_Sub1.Companion.aSArray5191) return false
            val i_4_ = i_0_ shl Class362.anInt4459
            val i_5_ = i_2_ shl Class362.anInt4459
            if (i_1_.toInt() != -97) method163(-4)
            if ((Class286_Sub7.method2169(i_4_ - -1, i_4_ - (-Class270.anInt3465 - -1), 1 + i_5_, 1 + i_4_, -1 + (i_5_ - -Class270.anInt3465), aa_Sub1.Companion.aSArray5191!![i]!!.method3982((-86).toByte(), 1 + i_2_, i_0_), aa_Sub1.Companion.aSArray5191!![i]!!.method3982((-86).toByte(), 1 + i_2_, 1 + i_0_), aa_Sub1.Companion.aSArray5191!![i]!!.method3982((-86).toByte(), i_2_, i_0_), -1 + Class270.anInt3465 + i_5_, false)) && (Class286_Sub7.method2169(
                    1 + i_4_,
                    Class270.anInt3465 + (i_4_ + -1),
                    i_5_ + 1,
                    Class270.anInt3465 + (i_4_ - 1),
                    i_5_ + Class270.anInt3465 - 1,
                    aa_Sub1.Companion.aSArray5191!![i]!!.method3982((-86).toByte(), i_2_ - -1, 1 + i_0_),
                    aa_Sub1.Companion.aSArray5191!![i]!!.method3982((-86).toByte(), i_2_, i_0_ + 1),
                    aa_Sub1.Companion.aSArray5191!![i]!!.method3982((-86).toByte(), i_2_, i_0_),
                    1 + i_5_,
                    false
                ))
            ) {
                Class348_Sub23_Sub2.anInt9039++
                Class354.anIntArrayArrayArray4356!![i]!![i_0_]!![i_2_] = Class234.anInt3049
                return true
            }
            Class354.anIntArrayArrayArray4356!![i]!![i_0_]!![i_2_] = -Class234.anInt3049
            return false
        }

        @JvmStatic
        fun method165(i: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Byte, i_13_: Int, i_14_: Int) {
            anInt5194++
            if (i_9_ < 512 || i_11_ < 512 || (-2 + Class367_Sub4.anInt7319) * 512 < i_9_ || (-2 + Class348_Sub40_Sub3.anInt9109) * 512 < i_11_) {
                Class239_Sub21.anIntArray6062!![1] = -1
                Class239_Sub21.anIntArray6062!![0] = Class239_Sub21.anIntArray6062!![1]
            } else if (i_12_ >= 22) {
                val i_15_ = Class275.method2064(i_9_, i, 11219, i_11_) - i_7_
                if (Class59_Sub1.aBoolean5300) Class107.method1010(false, true)
                else {
                    Class157.aClass101_2123!!.method891(i_10_, 0, 0)
                    Class348_Sub8.aHa6654!!.method3638(Class157.aClass101_2123)
                }
                if (!Class305.aBoolean3870) Class348_Sub8.aHa6654!!.da(i_9_, i_15_, i_11_, Class239_Sub21.anIntArray6062)
                else Class348_Sub8.aHa6654!!.HA(i_9_, i_15_, i_11_, Class132.anInt1906, Class239_Sub21.anIntArray6062)
                if (Class59_Sub1.aBoolean5300) Class285_Sub1.method2129(60.toByte())
                else {
                    Class157.aClass101_2123!!.method891(-i_10_, 0, 0)
                    Class348_Sub8.aHa6654!!.method3638(Class157.aClass101_2123)
                }
            }
        }
    }
}
