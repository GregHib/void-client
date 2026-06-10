import Class139.Companion.method1166
import Class14_Sub1.Companion.method241
import Class175.Companion.method1343
import Class186.Companion.method1397
import Class206.Companion.method1501
import Class239_Sub11.Companion.method1767
import Class239_Sub18.Companion.method1802
import Class251.Companion.method1916
import Class261.Companion.method1987
import Class264.Companion.method2017
import Class272.Companion.method2049
import Class286.Companion.method2138
import Class286_Sub3.Companion.method2148
import Class313.method2334
import Class318_Sub1_Sub2.Companion.method2405
import Class324.Companion.method2570
import Class34.Companion.method349
import Class347.Companion.method2708
import Class348_Sub40_Sub30.Companion.method3127
import Class348_Sub40_Sub38.Companion.method3150
import Class38.Companion.method362
import Class5_Sub2.Companion.method198
import Class62.method599
import Class64_Sub2.Companion.method661
import Class66.method705
import java.io.File
import java.io.IOException
import java.util.*

class Class348_Sub24 internal constructor(var anInt6872: Int, var anInt6875: Int) : Class348() {
    companion object {
        var anInt6871: Int = 0
        var anInt6873: Int = 0
        var anInt6874: Int = 0
        var aString6876: String?
        var aString6877: String?
        @JvmField
        var anIntArray6878: IntArray? = null

        @JvmStatic
        fun method2991(i: Int) {
            if (Class289.anInt3699 > 1) {
                Class348_Sub40_Sub23.anInt9313 = Class311.anInt3918
                Class289.anInt3699--
            }
            anInt6874++
            if (Class110.aBoolean1712) {
                Class110.aBoolean1712 = false
                method2049(67)
            } else {
                if (!Class5_Sub1.aBoolean8335) method661(95.toByte())
                for (i_0_ in 0..99) {
                    if (!Class292.method2203((-52).toByte())) break
                }
                if (Class240.anInt4674 == 10) {
                    while (method2138(i xor 0x2ca2)) {
                        val class348_sub47 = method2148(Class140.aClass351_1961, (Class348_Sub23_Sub2.aClass77_9029), -92)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                        val i_1_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                        Class348_Sub33.Companion.method3025(121.toByte(), (class348_sub47.aClass348_Sub49_Sub2_7116!!))
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(113, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197) + -i_1_)
                        Class348_Sub42_Sub14.method3243(119, class348_sub47)
                    }
                    if (Class239_Sub4.aClass348_Sub26_5881 != null) {
                        if ((Class239_Sub4.aClass348_Sub26_5881!!.anInt6887) != -1) {
                            val class348_sub47 = method2148((Class367_Sub4.aClass351_7318), (Class348_Sub23_Sub2.aClass77_9029), -81)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), Class239_Sub4.aClass348_Sub26_5881!!.anInt6887)
                            Class348_Sub42_Sub14.method3243(122, class348_sub47)
                            Class239_Sub4.aClass348_Sub26_5881 = null
                            Class101_Sub2.aLong5745 = method599(-106) + 30000L
                        }
                    } else if (Class101_Sub2.aLong5745 <= method599(-121)) Class239_Sub4.aClass348_Sub26_5881 = Class76.aClass169_1286!!.method1302(-5255, (Class3.aClass161_125!!.aString2147!!))
                    val class348_sub45 = (Class318_Sub1_Sub3.aClass262_8744!!.method1995(4) as Class348_Sub45?)
                    if (class348_sub45 != null || (Class355.aLong4367 < -2000L + method599(-97))) {
                        var class348_sub47: Class348_Sub47? = null
                        var i_2_ = 0
                        var class348_sub45_3_ = (r_Sub1.aClass262_10479!!.method1995(4) as Class348_Sub45?)
                        while (class348_sub45_3_ != null) {
                            if (class348_sub47 != null && (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197 - i_2_ >= 240)) break
                            class348_sub45_3_.method2715(107.toByte())
                            var i_4_ = class348_sub45_3_.method3311(-15)
                            if (i_4_ >= -1) {
                                if (i_4_ > 65534) i_4_ = 65534
                            } else i_4_ = -1
                            var i_5_ = class348_sub45_3_.method3308((-127).toByte())
                            if (i_5_ >= -1) {
                                if (i_5_ > 65534) i_5_ = 65534
                            } else i_5_ = -1
                            if (s_Sub2.anInt8270 != i_5_ || i_4_ != Class322.anInt4032) {
                                if (class348_sub47 == null) {
                                    Class361.anInt4450++
                                    class348_sub47 = (method2148(Class348_Sub42_Sub11.aClass351_9590, Class348_Sub23_Sub2.aClass77_9029, -94))
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                                    i_2_ = class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197
                                }
                                var i_6_ = -s_Sub2.anInt8270 + i_5_
                                s_Sub2.anInt8270 = i_5_
                                var i_7_ = i_4_ - Class322.anInt4032
                                Class322.anInt4032 = i_4_
                                val i_8_ = ((class348_sub45_3_.method3312((-107).toByte()) + -Class355.aLong4367) / 20L).toInt()
                                if (i_8_ >= 8 || i_6_ < -32 || i_6_ > 31 || i_7_ < -32 || i_7_ > 31) {
                                    if (i_8_ < 32 && i_6_ >= -128 && i_6_ <= 127 && i_7_ >= -128 && i_7_ <= 127) {
                                        i_6_ += 128
                                        i_7_ += 128
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 128 + i_8_)
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_7_ + (i_6_ shl 8))
                                    } else if (i_8_ >= 32) {
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), 57344 + i_8_)
                                        if (i_5_ == 1 || i_4_ == -1) class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(99.toByte(), -2147483648)
                                        else class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(101.toByte(), i_4_ shl 16 or i_5_)
                                    } else {
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 192 + i_8_)
                                        if (i_5_ != 1 && i_4_ != -1) class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(100.toByte(), i_5_ or (i_4_ shl 16))
                                        else class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(114.toByte(), -2147483648)
                                    }
                                } else {
                                    i_6_ += 32
                                    i_7_ += 32
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), (i_7_ + (i_6_ shl 6) + (i_8_ shl 12)))
                                }
                                Class355.aLong4367 = class348_sub45_3_.method3312((-109).toByte())
                            }
                            class348_sub45_3_ = r_Sub1.aClass262_10479!!.method1990(79.toByte()) as Class348_Sub45?
                        }
                        if (class348_sub47 != null) {
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(105, class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197 + -i_2_)
                            Class348_Sub42_Sub14.method3243(23, class348_sub47)
                        }
                    }
                    if (class348_sub45 != null) {
                        var l = ((class348_sub45.method3312((-110).toByte()) + -Class14.aLong5089) / 50L)
                        Class14.aLong5089 = class348_sub45.method3312((-87).toByte())
                        if (l > 32767) l = 32767L
                        var i_9_ = class348_sub45.method3311(20)
                        if (i_9_ >= 0) {
                            if (i_9_ > 65535) i_9_ = 65535
                        } else i_9_ = 0
                        var i_10_ = class348_sub45.method3308((-128).toByte())
                        if (i_10_ < 0) i_10_ = 0
                        else if (i_10_ > 65535) i_10_ = 65535
                        var i_11_ = 0
                        if (class348_sub45.method3310(i xor 0x2cee) == 2) i_11_ = 1
                        val i_12_ = l.toInt()
                        Class10.anInt182++
                        val class348_sub47 = method2148(Class27.aClass351_395, (Class348_Sub23_Sub2.aClass77_9029), i + -11525)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_12_ or (i_11_ shl 15))
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(121.toByte(), i_9_ shl 16 or i_10_)
                        Class348_Sub42_Sub14.method3243(25, class348_sub47)
                    }
                    if (Class253.anInt3246 > 0) {
                        Class348_Sub40_Sub26.anInt9348++
                        val class348_sub47 = method2148((Class328_Sub1_Sub1.aClass351_8798), (Class348_Sub23_Sub2.aClass77_9029), -111)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 3 * Class253.anInt3246)
                        var i_13_ = 0
                        while ((i_13_ < Class253.anInt3246)) {
                            val interface6 = Class308.anInterface6Array3884!![i_13_]
                            var l = ((interface6!!.method29((-29).toByte()) + -Class348_Sub7.aLong6651) / 50L)
                            Class348_Sub7.aLong6651 = interface6.method29(106.toByte())
                            if (l > 65535L) l = 65535L
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, interface6.method30(false))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), l.toInt())
                            i_13_++
                        }
                        Class348_Sub42_Sub14.method3243(-49, class348_sub47)
                    }
                    if (Class147.anInt2035 > 0) Class147.anInt2035--
                    if (Class369_Sub3_Sub1.aBoolean10174 && Class147.anInt2035 <= 0) {
                        Class239_Sub18.anInt6033++
                        Class369_Sub3_Sub1.aBoolean10174 = false
                        Class147.anInt2035 = 20
                        val class348_sub47 = method2148(Class281.aClass351_3648, (Class348_Sub23_Sub2.aClass77_9029), i + -11549)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(i xor 0x3c4d, Class314.aFloat3938.toInt() shr 3)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), Class76.aFloat1287.toInt() shr 3)
                        Class348_Sub42_Sub14.method3243(-31, class348_sub47)
                    }
                    if (Class347.aBoolean4278 != Class175.aBoolean2329) {
                        Class269.anInt3460++
                        Class347.aBoolean4278 = Class175.aBoolean2329
                        val class348_sub47 = method2148((InputStream_Sub1.aClass351_77), (Class348_Sub23_Sub2.aClass77_9029), i xor 0x2cc8.inv())
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, if (!Class175.aBoolean2329) 0 else 1)
                        Class348_Sub42_Sub14.method3243(i + -11501, class348_sub47)
                    }
                    if (!r.aBoolean9719) {
                        Class62.anInt1110++
                        val class348_sub47 = method2148((Class348_Sub49_Sub1.aClass351_9743), (Class348_Sub23_Sub2.aClass77_9029), -113)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                        val i_14_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                        val class348_sub49 = Class316.aClass348_Sub51_3959!!.method3427(i xor 0x2cb0)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeBytes(class348_sub49.anInt7197, 0, class348_sub49.aByteArray7154!!, 82)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(96, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197) + -i_14_)
                        Class348_Sub42_Sub14.method3243(i + -11473, class348_sub47)
                        r.aBoolean9719 = true
                    }
                    if (Class147.aClass357ArrayArrayArray2029 != null) {
                        if (Class348_Sub40_Sub21.anInt9282 == 2) method241(127.toByte())
                        else if (Class348_Sub40_Sub21.anInt9282 == 3) Class348_Sub21.Companion.method2954((-4).toByte())
                    }
                    if (!Class160.aBoolean2130) Class205.aFloat2687 /= 2.0f
                    else Class160.aBoolean2130 = false
                    if (!Class50_Sub1.aBoolean5224) Class348_Sub27.Companion.aFloat6898 /= 2.0f
                    else Class50_Sub1.aBoolean5224 = false
                    Class348_Sub35.Companion.method3027(33.toByte())
                    if (Class240.anInt4674 == 10) {
                        Class348_Sub42_Sub3.method3175(55.toByte())
                        method362(i + -11335)
                        method1501(-123)
                        Class348_Sub50.anInt7213++
                        if (Class348_Sub50.anInt7213 > 750) method2049(83)
                        else {
                            method349(i + -6692)
                            method3150(true)
                            method1397(0)
                            var i_15_ = Class318_Sub1_Sub3_Sub3.aClass170_10209!!.method1305((-126).toByte(), true)
                            while (i_15_ != -1) {
                                method1767(true, i_15_)
                                Class327.anIntArray4096!![method1166(31, Class287.anInt3695++)] = i_15_
                                i_15_ = Class318_Sub1_Sub3_Sub3.aClass170_10209!!.method1305((-128).toByte(), false)
                            }
                            var class348_sub42_sub15 = method3127(2681)
                            while (class348_sub42_sub15 != null) {
                                val i_16_ = class348_sub42_sub15.method3245(true)
                                val i_17_ = class348_sub42_sub15.method3248(1)
                                if (i_16_ == 1) {
                                    Class77.anIntArray1303!![i_17_] = class348_sub42_sub15.anInt9652
                                    Class184.aBoolean2469 = Class184.aBoolean2469 or Class286_Sub6.aBooleanArray6270!![i_17_]
                                    Class348_Sub26.Companion.anIntArray6890!![method1166(31, Class5_Sub1.anInt8352++)] = i_17_
                                } else if (i_16_ == 2) {
                                    Class258_Sub2.aStringArray8532!![i_17_] = class348_sub42_sub15.aString9654
                                    Class239_Sub21.anIntArray6061!![method1166(Class348_Sub40_Sub30.anInt9385++, 31)] = i_17_
                                } else if (i_16_ == 3) {
                                    val class46 = method2570(1512932720, i_17_)
                                    if (class348_sub42_sub15.aString9654 != class46!!.aString792) {
                                        class46.aString792 = class348_sub42_sub15.aString9654
                                        Class251.method1916(-9343, class46)
                                    }
                                } else if (i_16_ == 4) {
                                    val class46 = method2570(1512932720, i_17_)
                                    val i_18_ = (class348_sub42_sub15.anInt9652)
                                    val i_19_ = (class348_sub42_sub15.anInt9651)
                                    val i_20_ = (class348_sub42_sub15.anInt9650)
                                    if (i_18_ != class46!!.anInt770 || (class46.anInt753 != i_19_) || (i_20_ != class46.anInt779)) {
                                        class46.anInt753 = i_19_
                                        class46.anInt770 = i_18_
                                        class46.anInt779 = i_20_
                                        Class251.method1916(-9343, class46)
                                    }
                                } else if (i_16_ == 5) {
                                    val class46 = method2570(i xor 0x5a2da9d8, i_17_)
                                    if ((class46!!.anInt699 != class348_sub42_sub15.anInt9652) || (class348_sub42_sub15.anInt9652 == -1)) {
                                        class46.anInt699 = class348_sub42_sub15.anInt9652
                                        class46.anInt795 = 0
                                        class46.anInt841 = 0
                                        class46.anInt730 = 1
                                        val class17 = (if (class46.anInt699 == -1) null else (Class10.aClass87_191!!.method835((class46.anInt699), 7)))
                                        if (class17 != null) method2017((class46.anInt795), class17, 30)
                                        Class251.method1916(-9343, class46)
                                    }
                                } else if (i_16_ == 6) {
                                    val i_21_ = (class348_sub42_sub15.anInt9652)
                                    val i_22_ = (0x7ff9 and i_21_) shr 10
                                    val i_23_ = 0x1f and (i_21_ shr 5)
                                    val i_24_ = 0x1f and i_21_
                                    val i_25_ = ((i_24_ shl 3) + ((i_22_ shl 19) - -(i_23_ shl 11)))
                                    val class46 = method2570(1512932720, i_17_)
                                    if (class46!!.anInt749 != i_25_) {
                                        class46.anInt749 = i_25_
                                        Class251.method1916(-9343, class46)
                                    }
                                } else if (i_16_ == 7) {
                                    val class46 = method2570(1512932720, i_17_)
                                    val bool = (class348_sub42_sub15.anInt9652 == 1)
                                    if (!class46!!.aBoolean813 == bool) {
                                        class46.aBoolean813 = bool
                                        Class251.method1916(-9343, class46)
                                    }
                                } else if (i_16_ == 8) {
                                    val class46 = method2570(1512932720, i_17_)
                                    if ((class46!!.anInt757 != class348_sub42_sub15.anInt9652) || (class46.anInt675 != class348_sub42_sub15.anInt9651) || (class46.anInt716 != class348_sub42_sub15.anInt9650)) {
                                        class46.anInt716 = class348_sub42_sub15.anInt9650
                                        class46.anInt675 = class348_sub42_sub15.anInt9651
                                        class46.anInt757 = class348_sub42_sub15.anInt9652
                                        if (class46.anInt812 != -1) {
                                            if (class46.anInt796 <= 0) {
                                                if ((class46.anInt842) > 0) class46.anInt716 = (32 * class46.anInt716 / (class46.anInt842))
                                            } else class46.anInt716 = ((class46.anInt716) * 32 / (class46.anInt796))
                                        }
                                        Class251.method1916(-9343, class46)
                                    }
                                } else if (i_16_ == 9) {
                                    val class46 = method2570(1512932720, i_17_)
                                    if ((class348_sub42_sub15.anInt9652 != class46!!.anInt812) || (class348_sub42_sub15.anInt9651 != class46.anInt781)) {
                                        class46.anInt781 = class348_sub42_sub15.anInt9651
                                        class46.anInt812 = class348_sub42_sub15.anInt9652
                                        Class251.method1916(-9343, class46)
                                    }
                                } else if (i_16_ == 10) {
                                    val class46 = method2570(1512932720, i_17_)
                                    if ((class46!!.anInt808 != (class348_sub42_sub15.anInt9652)) || ((class46.anInt786) != (class348_sub42_sub15.anInt9651)) || ((class348_sub42_sub15.anInt9650) != class46.anInt717)) {
                                        class46.anInt786 = (class348_sub42_sub15.anInt9651)
                                        class46.anInt808 = (class348_sub42_sub15.anInt9652)
                                        class46.anInt717 = (class348_sub42_sub15.anInt9650)
                                        Class251.method1916(-9343, class46)
                                    }
                                } else if (i_16_ == 11) {
                                    val class46 = (method2570(1512932720, i_17_))
                                    class46!!.aByte817 = 0.toByte()
                                    class46.anInt739 = (class348_sub42_sub15.anInt9651)
                                    class46.anInt750 = class46.anInt739
                                    class46.aByte681 = 0.toByte()
                                    class46.anInt788 = (class348_sub42_sub15.anInt9652)
                                    class46.anInt800 = class46.anInt788
                                    Class251.method1916(-9343, class46)
                                } else if (i_16_ == 12) {
                                    val class46 = (method2570(1512932720, i_17_))
                                    var i_26_ = (class348_sub42_sub15.anInt9652)
                                    if (class46 != null && (class46.anInt774) == 0) {
                                        if ((-(class46.anInt789) + (class46.anInt791)) < i_26_) i_26_ = ((class46.anInt791) - (class46.anInt789))
                                        if (i_26_ < 0) i_26_ = 0
                                        if (i_26_ != (class46.anInt755)) {
                                            class46.anInt755 = i_26_
                                            method1916(-9343, class46)
                                        }
                                    }
                                } else if (i_16_ == 14) {
                                    val class46 = (method2570(1512932720, i_17_))
                                    class46!!.anInt756 = (class348_sub42_sub15.anInt9652)
                                } else if (i_16_ == 15) {
                                    Class97.anInt1548 = (class348_sub42_sub15.anInt9651)
                                    Class248.anInt3203 = (class348_sub42_sub15.anInt9652)
                                    Class348_Sub13.Companion.aBoolean6759 = true
                                } else if (i_16_ == 16) {
                                    val class46 = (method2570(1512932720, i_17_))
                                    class46!!.anInt702 = (class348_sub42_sub15.anInt9652)
                                } else if (i_16_ == 17) {
                                    val class46 = (method2570(1512932720, i_17_))
                                    class46!!.anInt806 = (class348_sub42_sub15.anInt9652)
                                }
                                class348_sub42_sub15 = method3127(2681)
                            }
                            Class348_Sub51.anInt7267++
                            if (Class239_Sub20.anInt6048 != 0) {
                                anInt4292 += 20
                                if (anInt4292 >= 400) Class239_Sub20.anInt6048 = 0
                            }
                            if (Class311.aClass46_3913 != null) {
                                Class108.anInt1656++
                                if (Class108.anInt1656 >= 15) {
                                    Class251.method1916(-9343, Class311.aClass46_3913!!)
                                    Class311.aClass46_3913 = null
                                }
                            }
                            Class318_Sub1_Sub3_Sub4.aClass46_10336 = null
                            Class50_Sub1.aBoolean5221 = false
                            Class168.aClass46_2249 = null
                            Class127_Sub1.aBoolean8386 = false
                            method198(null, false, -1, -1)
                            method1343(-1, null, 1, -1)
                            if (!r.aBoolean9722) Class362.anInt4458 = -1
                            Class216.method1583((-73).toByte())
                            Class311.anInt3918++
                            if (Class237.aBoolean3103) {
                                Class98.anInt1568++
                                val class348_sub47 = method2148((ha_Sub2.aClass351_7715), (Class348_Sub23_Sub2.aClass77_9029), i + -11525)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(117.toByte(), (InputStream_Sub2.anInt85 shl 14 or (Class348_Sub40_Sub26.anInt9349 shl 28) or Class79.anInt1404))
                                Class348_Sub42_Sub14.method3243(30, class348_sub47)
                                Class237.aBoolean3103 = false
                            }
                            while (true) {
                                val class348_sub36 = (Class208.aClass262_2707!!.method1997(8) as? Class348_Sub36?)
                                if (class348_sub36 == null) break
                                val class46 = (class348_sub36.aClass46_6989)!!
                                if (class46.anInt704 >= 0) {
                                    val class46_27_ = method2570(1512932720, (class46.anInt834))
                                    if (class46_27_ == null || (class46_27_.aClass46Array798) == null || ((class46_27_.aClass46Array798!!).size <= class46.anInt704) || (class46 != (class46_27_.aClass46Array798!![class46.anInt704]))) {
                                        continue
                                    }
                                }
                                method705(class348_sub36)
                            }
                            while (true) {
                                val class348_sub36 = (Class365.aClass262_4473!!.method1997(8) as? Class348_Sub36?)
                                if (class348_sub36 == null) break
                                val class46 = (class348_sub36.aClass46_6989)!!
                                if (class46.anInt704 >= 0) {
                                    val class46_28_ = method2570(1512932720, (class46.anInt834))
                                    if (class46_28_ == null || (class46_28_.aClass46Array798) == null || (class46.anInt704 >= (class46_28_.aClass46Array798!!).size) || ((class46_28_.aClass46Array798!![class46.anInt704]) != class46)) {
                                        continue
                                    }
                                }
                                method705(class348_sub36)
                            }
                            while (true) {
                                val class348_sub36 = (Class348_Sub1_Sub2.aClass262_8810!!.method1997(i + -11424) as? Class348_Sub36?)
                                if (class348_sub36 == null) break
                                val class46 = (class348_sub36.aClass46_6989)!!
                                if (class46.anInt704 >= 0) {
                                    val class46_29_ = method2570(1512932720, (class46.anInt834))
                                    if (class46_29_ == null || (class46_29_.aClass46Array798) == null || (class46.anInt704 >= (class46_29_.aClass46Array798!!).size) || ((class46_29_.aClass46Array798!![class46.anInt704]) != class46)) {
                                        continue
                                    }
                                }
                                method705(class348_sub36)
                            }
                            if (Class168.aClass46_2249 == null) Class348_Sub42.anInt7059 = 0
                            if (Class289.aClass46_3701 != null) method2708(-30206)
                            if (Class192.anInt2581 > 0 && Class182.aClass346_2449!!.method2696(82, i xor 0x2cd5.inv()) && Class182.aClass346_2449!!.method2696(81, -121) && Class98.anInt1565 != 0) {
                                var i_30_ = ((Class132.aPlayer_1907!!.plane) - Class98.anInt1565)
                                if (i_30_ >= 0) {
                                    if (i_30_ > 3) i_30_ = 3
                                } else i_30_ = 0
                                Class361.method3502((Class132.aPlayer_1907!!.anIntArray10317!![0]) + Class90.regionTileY, i xor 0x2caa, i_30_, (Class132.aPlayer_1907!!.anIntArray10320!![0]) + za_Sub2.regionTileX)
                            }
                            method1987(-120)
                            var i_31_ = 0
                            if (i == 11432) {
                                while ( /**/i_31_ < 5) {
                                    Class318_Sub1_Sub1_Sub2.anIntArray9981!![i_31_] = Class318_Sub1_Sub1_Sub2.anIntArray9981!![i_31_] + 1
                                    i_31_++
                                }
                                if (Class184.aBoolean2469 && (-60000L + method599(-84) > Class34.aLong482)) method2405(i + -11313)
                                var class318_sub9_sub1 = (Class348_Sub42_Sub14.aClass243_9642!!.method1872(i + -11424) as? Class318_Sub9_Sub1?)
                                while (class318_sub9_sub1 != null) {
                                    if ((method599(i xor 0x2ce9.inv()) / 1000L + -5L) > class318_sub9_sub1.anInt8787.toLong()) {
                                        if (class318_sub9_sub1.aShort8786 > 0) Class286_Sub2.method2144("", 5, (-128).toByte(), 0, (class318_sub9_sub1.aString8783 + (Class274.aClass274_3502!!.method2063(Class348_Sub33.Companion.anInt6967, 544))), "", "")
                                        if (class318_sub9_sub1.aShort8786.toInt() == 0) Class286_Sub2.method2144("", 5, (-105).toByte(), 0, (class318_sub9_sub1.aString8783 + (Class274.aClass274_3503!!.method2063(Class348_Sub33.Companion.anInt6967, 544))), "", "")
                                        class318_sub9_sub1.method2373(false)
                                    }
                                    class318_sub9_sub1 = (Class348_Sub42_Sub14.aClass243_9642!!.method1878((-105).toByte()) as? Class318_Sub9_Sub1?)
                                }
                                Class28.anInt4999++
                                if (Class28.anInt4999 > 500) {
                                    Class28.anInt4999 = 0
                                    val i_32_ = (8.0 * Math.random()).toInt()
                                    if ((0x4 and i_32_) == 4) Class195.anInt5016 += Class303.anInt3844
                                    if ((i_32_ and 0x1) == 1) Class20.anInt319 += Class318_Sub1_Sub5.anInt8775
                                    if ((0x2 and i_32_) == 2) Class260.anInt3310 += Class344.anInt4263
                                }
                                if (Class20.anInt319 < -50) Class318_Sub1_Sub5.anInt8775 = 2
                                if (Class20.anInt319 > 50) Class318_Sub1_Sub5.anInt8775 = -2
                                if (Class260.anInt3310 < -55) Class344.anInt4263 = 2
                                if (Class195.anInt5016 < -40) Class303.anInt3844 = 1
                                if (Class260.anInt3310 > 55) Class344.anInt4263 = -2
                                Class285.anInt4753++
                                if (Class195.anInt5016 > 40) Class303.anInt3844 = -1
                                if (Class285.anInt4753 > 500) {
                                    Class285.anInt4753 = 0
                                    val i_33_ = (Math.random() * 8.0).toInt()
                                    if ((i_33_ and 0x2) == 2) Class348_Sub49_Sub1.anInt9750 += Class348_Sub42_Sub14.anInt9645
                                    if ((i_33_ and 0x1) == 1) r_Sub2.anInt10483 += Class348_Sub42_Sub9_Sub1.anInt10443
                                }
                                if (r_Sub2.anInt10483 < -60) Class348_Sub42_Sub9_Sub1.anInt10443 = 2
                                if (Class348_Sub49_Sub1.anInt9750 < -20) Class348_Sub42_Sub14.anInt9645 = 1
                                if (r_Sub2.anInt10483 > 60) Class348_Sub42_Sub9_Sub1.anInt10443 = -2
                                if (Class348_Sub49_Sub1.anInt9750 > 10) Class348_Sub42_Sub14.anInt9645 = -1
                                Class11.anInt193++
                                if (Class11.anInt193 > 50) {
                                    IOException_Sub1.anInt88++
                                    val class348_sub47 = (method2148(Class239_Sub10.aClass351_5938, Class348_Sub23_Sub2.aClass77_9029, -125))
                                    Class348_Sub42_Sub14.method3243(i xor 0x2cc0.inv(), class348_sub47)
                                }
                                if (Class239_Sub29.aBoolean6147) {
                                    method2334(0)
                                    Class239_Sub29.aBoolean6147 = false
                                }
                                try {
                                    method1802(0)
                                } catch (ioexception: IOException) {
                                    method2049(93)
                                }
                            }
                        }
                    }
                }
            }
        }

        fun method2992(string: String?, i: Byte): ByteArray {
            try {
                anInt6873++
                val i_34_ = string!!.length
                val `is` = ByteArray(i_34_)
                if (i.toInt() != -20) method2991(-54)
                for (i_35_ in 0..<i_34_) {
                    val i_36_ = string.get(i_35_).code
                    if (i_36_ > 0 && i_36_ < 128 || i_36_ >= 160 && i_36_ <= 255) `is`[i_35_] = i_36_.toByte()
                    else if (i_36_ != 8364) {
                        if (i_36_ != 8218) {
                            if (i_36_ != 402) {
                                if (i_36_ == 8222) `is`[i_35_] = (-124).toByte()
                                else if (i_36_ == 8230) `is`[i_35_] = (-123).toByte()
                                else if (i_36_ != 8224) {
                                    if (i_36_ != 8225) {
                                        if (i_36_ == 710) `is`[i_35_] = (-120).toByte()
                                        else if (i_36_ == 8240) `is`[i_35_] = (-119).toByte()
                                        else if (i_36_ == 352) `is`[i_35_] = (-118).toByte()
                                        else if (i_36_ != 8249) {
                                            if (i_36_ != 338) {
                                                if (i_36_ != 381) {
                                                    if (i_36_ == 8216) `is`[i_35_] = (-111).toByte()
                                                    else if (i_36_ == 8217) `is`[i_35_] = (-110).toByte()
                                                    else if (i_36_ != 8220) {
                                                        if (i_36_ != 8221) {
                                                            if (i_36_ == 8226) `is`[i_35_] = (-107).toByte()
                                                            else if (i_36_ == 8211) `is`[i_35_] = (-106).toByte()
                                                            else if (i_36_ != 8212) {
                                                                if (i_36_ != 732) {
                                                                    if (i_36_ != 8482) {
                                                                        if (i_36_ == 353) `is`[i_35_] = (-102).toByte()
                                                                        else if (i_36_ == 8250) `is`[i_35_] = (-101).toByte()
                                                                        else if (i_36_ != 339) {
                                                                            if (i_36_ == 382) `is`[i_35_] = (-98).toByte()
                                                                            else if (i_36_ != 376) `is`[i_35_] = 63.toByte()
                                                                            else `is`[i_35_] = (-97).toByte()
                                                                        } else `is`[i_35_] = (-100).toByte()
                                                                    } else `is`[i_35_] = (-103).toByte()
                                                                } else `is`[i_35_] = (-104).toByte()
                                                            } else `is`[i_35_] = (-105).toByte()
                                                        } else `is`[i_35_] = (-108).toByte()
                                                    } else `is`[i_35_] = (-109).toByte()
                                                } else `is`[i_35_] = (-114).toByte()
                                            } else `is`[i_35_] = (-116).toByte()
                                        } else `is`[i_35_] = (-117).toByte()
                                    } else `is`[i_35_] = (-121).toByte()
                                } else `is`[i_35_] = (-122).toByte()
                            } else `is`[i_35_] = (-125).toByte()
                        } else `is`[i_35_] = (-126).toByte()
                    } else `is`[i_35_] = (-128).toByte()
                }
                return `is`
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.Companion.method2929(runtimeexception, ("ls.B(" + (if (string != null) "{...}" else "null") + ',' + i + ')'))
            }
        }

        @JvmStatic
        fun method2993(i: Byte) {
            anIntArray6878 = null
            aString6876 = null
            aString6877 = null
            val i_37_ = 31 % ((3 - i) / 37)
        }

        fun method2994(i: Int) {
            anInt6871++
            if (i == 2) Class199.aClass352Array2636 = null
        }

        init {
            var string = "Unknown"
            try {
                string = System.getProperty("java.vendor").lowercase(Locale.getDefault())
            } catch (exception: Exception) {
                /* empty */
            }
            string.lowercase(Locale.getDefault())
            string = "Unknown"
            try {
                string = System.getProperty("java.version").lowercase(Locale.getDefault())
            } catch (exception: Exception) {
                /* empty */
            }
            string.lowercase(Locale.getDefault())
            string = "Unknown"
            try {
                string = System.getProperty("os.name").lowercase(Locale.getDefault())
            } catch (exception: Exception) {
                /* empty */
            }
            aString6877 = string.lowercase(Locale.getDefault())
            string = "Unknown"
            try {
                string = System.getProperty("os.arch").lowercase(Locale.getDefault())
            } catch (exception: Exception) {
                /* empty */
            }
            aString6876 = string.lowercase(Locale.getDefault())
            string = "Unknown"
            try {
                string = System.getProperty("os.version").lowercase(Locale.getDefault())
            } catch (exception: Exception) {
                /* empty */
            }
            string.lowercase(Locale.getDefault())
            string = "~/"
            try {
                string = System.getProperty("user.home").lowercase(Locale.getDefault())
            } catch (exception: Exception) {
                /* empty */
            }
            File(string)
        }
    }
}
