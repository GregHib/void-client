import Class121.method1084
import Class139.Companion.method1166
import Class148.Companion.method1197
import Class163.Companion.method1273
import Class186_Sub1.Companion.method1399
import Class239_Sub21.Companion.method1813
import Class273.Companion.method2057
import Class309.Companion.method2308

/* Class318_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class318_Sub2 internal constructor(var anInt6394: Int) : Class318() {
    companion object {
        var anIntArray6393: IntArray? = IntArray(8)
        var anInt6395: Int = 0
        var anInt6396: Int = 0
        var anInt6397: Int = 0
        var anInt6398: Int = 0
        var anInt6399: Int = 0
        var aClass147Array6400: Array<Class147?>? = arrayOfNulls<Class147>(100)

        fun method2494(i: Int, i_0_: Int, i_1_: Int, var_ha: ha?, class348_sub42_sub12: Class348_Sub42_Sub12?, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Byte, i_6_: Int, i_7_: Int, i_8_: Int) {
            var i_4_ = i_4_
            do {
                try {
                    anInt6397++
                    if (i_5_ < 123) method2499(27, -8, -96, 71, 72, 72.toByte(), -82)
                    if (i_8_ > i_7_ && i_7_ + i_2_ > i_8_ && i_3_ > -13 + i_1_ && i_1_ + 3 > i_3_ && (class348_sub42_sub12!!.aBoolean9610)) i_4_ = i_0_
                    var `is`: IntArray? = null
                    if (!method1197(-12081, class348_sub42_sub12!!.anInt9608)) {
                        if ((class348_sub42_sub12.anInt9599) == -1) {
                            if (Class367_Sub8.method3549((class348_sub42_sub12.anInt9608), (-119).toByte())) {
                                val class348_sub22 = ((Class282.aClass356_3654!!.method3480((class348_sub42_sub12.aLong9605).toInt().toLong(), -6008)) as Class348_Sub22?)
                                if (class348_sub22 != null) {
                                    val npc = (class348_sub22.aNpc_6859)!!
                                    var class79 = (npc.aClass79_10505)
                                    if (class79!!.anIntArray1377 != null) class79 = (class79.method794((Class318_Sub1_Sub3_Sub3.aClass170_10209!!), -1))
                                    if (class79 != null) `is` = class79.anIntArray1342
                                }
                            } else if (method1813(8806, (class348_sub42_sub12.anInt9608))) {
                                val `object`: Any? = null
                                var class51: Class51?
                                if (class348_sub42_sub12.anInt9608 != 1001) class51 = (Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, (0x7fffffffL and ((class348_sub42_sub12.aLong9605) ushr 32)).toInt()))
                                else class51 = (Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, (class348_sub42_sub12.aLong9605).toInt()))
                                if (class51.anIntArray945 != null) class51 = (class51.method480((Class318_Sub1_Sub3_Sub3.aClass170_10209!!), 47.toByte()))
                                if (class51 != null) `is` = class51.anIntArray917
                            }
                        } else `is` = Exception_Sub1.aClass255_112!!.method1940(113, (class348_sub42_sub12.anInt9599)).anIntArray2772
                    } else `is` = (Exception_Sub1.aClass255_112!!.method1940(-67, (class348_sub42_sub12.aLong9605).toInt()).anIntArray2772)
                    var string = Class316.method2367(125.toByte(), class348_sub42_sub12)
                    if (`is` != null) string += method1273(`is`, true)
                    Class262.aClass324_3326!!.method2567(i_1_, string, 116.toByte(), i_4_, 0, i_7_ - -3, Class341.aClass105Array4234, Class175.anIntArray2330)
                    if (!class348_sub42_sub12.aBoolean9597) break
                    Class239_Sub24.aClass105_6097!!.method974(Class369.aClass143_4962!!.method1183(true, string) + (i_7_ - -5), -12 + i_1_)
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("vo.C(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + (if (class348_sub42_sub12 != null) "{...}" else "null") + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'))
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method2495(i: Byte) {
            if (i <= 110) anIntArray6393 = null
            anIntArray6393 = null
            aClass147Array6400 = null
        }

        @JvmStatic
        fun method2496(i: Int, i_9_: Int, bool: Boolean): Boolean {
            if (bool != true) Companion.method2497(null, (-29).toByte(), null, 73)
            anInt6396++
            if (i >= 1000 && i_9_ < 1000) return true
            if (i < 1000 && i_9_ < 1000) {
                if (method2308(26.toByte(), i_9_)) return true
                return !method2308(26.toByte(), i)
            }
            return i >= 1000 && i_9_ >= 1000
        }

        fun method2497(`is`: ByteArray?, i: Byte, string: String?, i_10_: Int): Int {
            var i_10_ = i_10_
            try {
                anInt6399++
                val i_11_ = i_10_
                val i_12_ = string!!.length
                var i_13_ = 0
                if (i.toInt() != 0) method2496(21, -5, true)
                while ( /**/i_12_ > i_13_) {
                    val i_14_ = method1399(7, string.get(i_13_))
                    val i_15_ = (if (i_12_ > i_13_ - -1) method1399(7, string.get(1 + i_13_)) else -1)
                    val i_16_ = (if (2 + i_13_ < i_12_) method1399(7, string.get(i_13_ + 2)) else -1)
                    val i_17_ = (if (i_12_ <= 3 + i_13_) -1 else method1399(7, string.get(i_13_ + 3)))
                    `is`!![i_10_++] = method2057(i_14_ shl 2, i_15_ ushr 4).toByte()
                    if (i_16_ == -1) break
                    `is`[i_10_++] = method2057((method1166(15, i_15_) shl 4), i_16_ ushr 2).toByte()
                    if (i_17_ == -1) break
                    `is`[i_10_++] = method2057((method1166(3, i_16_) shl 6), i_17_).toByte()
                    i_13_ += 4
                }
                return -i_11_ + i_10_
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("vo.B(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (string != null) "{...}" else "null") + ',' + i_10_ + ')'))
            }
        }

        @JvmStatic
        fun method2498(class338: Class338?, var_ha: ha?, i: Byte, i_18_: Int) {
            try {
                anInt6395++
                if (i > -101) anIntArray6393 = null
                if (Player.anIntArray10566 != null && class338!!.aByte4181 >= i_18_) {
                    var i_19_ = 0
                    while ((i_19_ < Player.anIntArray10566!!.size)) {
                        if ((Player.anIntArray10566!![i_19_] != -1000000) && (((Player.anIntArray10566!![i_19_]) >= class338.anIntArray4191[0]) || (class338.anIntArray4191[1] <= (Player.anIntArray10566!![i_19_])) || (class338.anIntArray4191[2] <= (Player.anIntArray10566!![i_19_])) || ((Player.anIntArray10566!![i_19_]) >= class338.anIntArray4191[3])) && ((class338.anIntArray4187!![0] <= Class59_Sub1_Sub2.anIntArray8666!![i_19_]) || (class338.anIntArray4187!![1] <= Class59_Sub1_Sub2.anIntArray8666!![i_19_]) || (class338.anIntArray4187!![2] <= Class59_Sub1_Sub2.anIntArray8666!![i_19_]) || (Class59_Sub1_Sub2.anIntArray8666!![i_19_] >= class338.anIntArray4187!![3])) && ((class338.anIntArray4187!![0] >= Class250.anIntArray3220!![i_19_]) || (Class250.anIntArray3220!![i_19_] <= class338.anIntArray4187!![1]) || (class338.anIntArray4187!![2] >= Class250.anIntArray3220!![i_19_]) || (Class250.anIntArray3220!![i_19_] <= class338.anIntArray4187!![3])) && ((Class299_Sub2_Sub1.anIntArray8712!![i_19_] >= class338.anIntArray4184[0]) || (Class299_Sub2_Sub1.anIntArray8712!![i_19_] >= class338.anIntArray4184[1]) || (class338.anIntArray4184[2] <= Class299_Sub2_Sub1.anIntArray8712!![i_19_]) || (Class299_Sub2_Sub1.anIntArray8712!![i_19_] >= class338.anIntArray4184[3])) && ((class338.anIntArray4184[0] >= Client.anIntArray5176!![i_19_]) || (class338.anIntArray4184[1] >= Client.anIntArray5176!![i_19_]) || (class338.anIntArray4184[2] >= Client.anIntArray5176!![i_19_]) || (class338.anIntArray4184[3] >= Client.anIntArray5176!![i_19_]))
                        ) return
                        i_19_++
                    }
                }
                if (class338!!.aByte4192.toInt() == 1) {
                    val i_20_: Int = (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + (-Class239_Sub25.anInt6111 + class338.aShort4185))
                    if (i_20_ >= 0 && i_20_ <= (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + Class318_Sub1_Sub4_Sub1.Companion.anInt10084)) {
                        var i_21_: Int = (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + class338.aShort4193 - Class285_Sub2.anInt8502)
                        if (i_21_ < 0) i_21_ = 0
                        else if ((Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + Class318_Sub1_Sub4_Sub1.Companion.anInt10084) < i_21_) return
                        var i_22_: Int = (-Class285_Sub2.anInt8502 + (class338.aShort4190 - -Class318_Sub1_Sub4_Sub1.Companion.anInt10084))
                        if ((Class318_Sub1_Sub4_Sub1.Companion.anInt10084 - -Class318_Sub1_Sub4_Sub1.Companion.anInt10084) < i_22_) i_22_ = (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 - -Class318_Sub1_Sub4_Sub1.Companion.anInt10084)
                        else if (i_22_ < 0) return
                        var bool = false
                        while (i_22_ >= i_21_) {
                            if (Class99.aBooleanArrayArray1572!![i_20_]!![i_21_++]) {
                                bool = true
                                break
                            }
                        }
                        if (bool) {
                            var f = (Class141.anInt1974 - (class338.anIntArray4187!![0])).toFloat()
                            if (f < 0.0f) f *= -1.0f
                            if (!(f < Class11.anInt194.toFloat()) && Class354.method3465(0, 1, class338) && Class354.method3465(1, 1, class338) && Class354.method3465(2, 1, class338) && Class354.method3465(3, 1, class338)) Class348_Sub42_Sub19.aClass338Array9700!![Class348_Sub42_Sub10.anInt9577++] = class338
                        }
                    }
                } else if (class338.aByte4192.toInt() == 2) {
                    val i_23_: Int = (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + (class338.aShort4193 - Class285_Sub2.anInt8502))
                    if (i_23_ >= 0 && i_23_ <= (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + Class318_Sub1_Sub4_Sub1.Companion.anInt10084)) {
                        var i_24_: Int = (class338.aShort4185 + (-Class239_Sub25.anInt6111 + Class318_Sub1_Sub4_Sub1.Companion.anInt10084))
                        if (i_24_ >= 0) {
                            if (i_24_ > (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + Class318_Sub1_Sub4_Sub1.Companion.anInt10084)) return
                        } else i_24_ = 0
                        var i_25_: Int = (-Class239_Sub25.anInt6111 + (class338.aShort4182 - -Class318_Sub1_Sub4_Sub1.Companion.anInt10084))
                        if ((Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + Class318_Sub1_Sub4_Sub1.Companion.anInt10084) >= i_25_) {
                            if (i_25_ < 0) return
                        } else i_25_ = (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + Class318_Sub1_Sub4_Sub1.Companion.anInt10084)
                        var bool = false
                        while (i_24_ <= i_25_) {
                            if (Class99.aBooleanArrayArray1572!![i_24_++]!![i_23_]) {
                                bool = true
                                break
                            }
                        }
                        if (bool) {
                            var f = (Class348_Sub40_Sub27.anInt9360 - (class338.anIntArray4184[0])).toFloat()
                            if (f < 0.0f) f *= -1.0f
                            if (!(f < Class11.anInt194.toFloat()) && Class354.method3465(0, 1, class338) && Class354.method3465(1, 1, class338) && Class354.method3465(2, 1, class338) && Class354.method3465(3, 1, class338)) Class348_Sub42_Sub19.aClass338Array9700!![Class348_Sub42_Sub10.anInt9577++] = class338
                        }
                    }
                } else if (class338.aByte4192.toInt() == 16 || class338.aByte4192.toInt() == 8) {
                    val i_26_: Int = (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + (-Class239_Sub25.anInt6111 + class338.aShort4185))
                    if (i_26_ >= 0 && i_26_ <= (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 - -Class318_Sub1_Sub4_Sub1.Companion.anInt10084)) {
                        val i_27_: Int = (class338.aShort4193 + (-Class285_Sub2.anInt8502 - -Class318_Sub1_Sub4_Sub1.Companion.anInt10084))
                        if (i_27_ >= 0 && ((Class318_Sub1_Sub4_Sub1.Companion.anInt10084 - -Class318_Sub1_Sub4_Sub1.Companion.anInt10084) >= i_27_) && Class99.aBooleanArrayArray1572!![i_26_]!![i_27_]) {
                            var f = (Class141.anInt1974 - (class338.anIntArray4187!![0])).toFloat()
                            if (f < 0.0f) f *= -1.0f
                            var f_28_ = (Class348_Sub40_Sub27.anInt9360 + -(class338.anIntArray4184[0])).toFloat()
                            if (f_28_ < 0.0f) f_28_ *= -1.0f
                            if ((!(f < Class11.anInt194.toFloat()) || !(Class11.anInt194.toFloat() > f_28_)) && Class354.method3465(0, 1, class338) && Class354.method3465(1, 1, class338) && Class354.method3465(2, 1, class338) && Class354.method3465(3, 1, class338)) Class348_Sub42_Sub19.aClass338Array9700!![Class348_Sub42_Sub10.anInt9577++] = class338
                        }
                    }
                } else if (class338.aByte4192.toInt() == 4) {
                    val f = (-Class232.anInt3006 + class338.anIntArray4191[0]).toFloat()
                    if (!(f <= ha_Sub2.anInt7714.toFloat())) {
                        var i_29_: Int = (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + -Class285_Sub2.anInt8502 + class338.aShort4193)
                        if (i_29_ >= 0) {
                            if ((Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + Class318_Sub1_Sub4_Sub1.Companion.anInt10084) < i_29_) return
                        } else i_29_ = 0
                        var i_30_: Int = (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + -Class285_Sub2.anInt8502 + class338.aShort4190)
                        if (i_30_ <= (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + Class318_Sub1_Sub4_Sub1.Companion.anInt10084)) {
                            if (i_30_ < 0) return
                        } else i_30_ = (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 - -Class318_Sub1_Sub4_Sub1.Companion.anInt10084)
                        var i_31_: Int = (-Class239_Sub25.anInt6111 + (class338.aShort4185 + Class318_Sub1_Sub4_Sub1.Companion.anInt10084))
                        if (i_31_ < 0) i_31_ = 0
                        else if (i_31_ > (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + Class318_Sub1_Sub4_Sub1.Companion.anInt10084)) return
                        var i_32_: Int = (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + class338.aShort4182 - Class239_Sub25.anInt6111)
                        if ((Class318_Sub1_Sub4_Sub1.Companion.anInt10084 - -Class318_Sub1_Sub4_Sub1.Companion.anInt10084) < i_32_) i_32_ = (Class318_Sub1_Sub4_Sub1.Companion.anInt10084 + Class318_Sub1_Sub4_Sub1.Companion.anInt10084)
                        else if (i_32_ < 0) return
                        var bool = false
                        while_102_@ for (i_33_ in i_31_..i_32_) {
                            var i_34_ = i_29_
                            while (i_30_ >= i_34_) {
                                if (Class99.aBooleanArrayArray1572!![i_33_]!![i_34_]) {
                                    bool = true
                                    break@while_102_
                                }
                                i_34_++
                            }
                        }
                        if (bool && Class354.method3465(0, 1, class338) && Class354.method3465(1, 1, class338) && Class354.method3465(2, 1, class338) && Class354.method3465(3, 1, class338)) Class348_Sub42_Sub19.aClass338Array9700!![Class348_Sub42_Sub10.anInt9577++] = class338
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("vo.A(" + (if (class338 != null) "{...}" else "null") + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i + ',' + i_18_ + ')'))
            }
        }

        fun method2499(i: Int, i_35_: Int, i_36_: Int, i_37_: Int, i_38_: Int, i_39_: Byte, i_40_: Int): Boolean {
            anInt6398++
            if (!Class348_Sub40_Sub23.aBoolean9307 || !Class23.aBoolean351) return false
            if (Class225.anInt2946 < 100) return false
            if (i_38_ == i_40_ && i_36_ == i_35_) {
                if (!aa_Sub2.method164(i, i_38_, (-97).toByte(), i_36_)) return false
                val i_41_ = i_38_ shl Class362.anInt4459
                val i_42_ = i_36_ shl Class362.anInt4459
                if (method1084(i_37_, Class270.anInt3465, i_42_, i_41_, aa_Sub1.aSArray5191!![i]!!.method3982((-86).toByte(), i_36_, i_38_), Class270.anInt3465, 18507)) {
                    Class348_Sub40_Sub4.anInt9112++
                    return true
                }
                return false
            }
            if (i_39_ <= 101) method2499(66, -39, -55, 105, 96, 114.toByte(), -44)
            for (i_43_ in i_38_..i_40_) {
                for (i_44_ in i_36_..i_35_) {
                    if (Class354.anIntArrayArrayArray4356!![i]!![i_43_]!![i_44_] == -Class234.anInt3049) return false
                }
            }
            val i_45_ = (i_38_ shl Class362.anInt4459) + 1
            val i_46_ = (i_36_ shl Class362.anInt4459) + 2
            if (!method1084(i_37_, (1 + -i_38_ + i_40_) * Class270.anInt3465, i_46_, i_45_, aa_Sub1.aSArray5191!![i]!!.method3982((-86).toByte(), i_36_, i_38_), Class270.anInt3465 * (i_35_ + -i_36_ + 1), 18507)) return false
            Class348_Sub40_Sub4.anInt9112++
            return true
        }
    }
}
