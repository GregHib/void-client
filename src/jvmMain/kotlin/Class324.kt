import jaggl.OpenGL.Companion.glAttachObjectARB
import jaggl.OpenGL.Companion.glCreateProgramObjectARB
import jaggl.OpenGL.Companion.glDeleteObjectARB
import jaggl.OpenGL.Companion.glDetachObjectARB
import jaggl.OpenGL.Companion.glGetInfoLogARB
import jaggl.OpenGL.Companion.glGetObjectParameterivARB
import jaggl.OpenGL.Companion.glLinkProgramARB
import java.util.*
import kotlin.math.sin

abstract class Class324 internal constructor(var_ha: ha?, class143: Class143?) {
    private var aHa4048: ha? = null
    private var aClass143_4063: Class143? = null
    private fun method2566(class105s: Array<Class105?>?, `is`: IntArray?, i: Int, is_0_: IntArray?, is_1_: IntArray?, i_2_: Int, string: String?, i_3_: Int) {
        var i = i
        var i_2_ = i_2_
        try {
            i_2_ -= aClass143_4063!!.anInt1992
            anInt4058++
            var i_4_ = -1
            var i_5_ = -1
            var i_6_ = 0
            if (i_3_ == 174) {
                val i_7_ = string!!.length
                var i_8_ = 0
                while ( /**/i_7_ > i_8_) {
                    var c = (Class354.method3464(string.get(i_8_), false).toInt() and 0xff).toChar()
                    if (c.code == 60) i_4_ = i_8_
                    else {
                        if (c.code == 62 && i_4_ != -1) {
                            val string_9_ = string.substring(1 + i_4_, i_8_)
                            i_4_ = -1
                            if (string_9_ == "lt") c = '<'
                            else if (string_9_ != "gt") {
                                if (string_9_ == "nbsp") c = '\u00a0'
                                else if (string_9_ != "shy") {
                                    if (string_9_ == "times") c = '\u00d7'
                                    else if (string_9_ != "euro") {
                                        if (string_9_ == "copy") c = '\u00a9'
                                        else if (string_9_ == "reg") c = '\u00ae'
                                        else {
                                            if (string_9_.startsWith("img=")) {
                                                try {
                                                    val i_10_: Int
                                                    if (is_1_ != null) i_10_ = is_1_[i_6_]
                                                    else i_10_ = 0
                                                    val i_11_: Int
                                                    if (`is` != null) i_11_ = `is`[i_6_]
                                                    else i_11_ = 0
                                                    i_6_++
                                                    val i_12_ = (Class348_Sub41.method3156(true, (string_9_.substring(4))))
                                                    val class105 = class105s!![i_12_]!!
                                                    val i_13_ = (if (is_0_ == null) class105.method980() else is_0_[i_12_])
                                                    class105.method964(i + i_10_, (-i_13_ + (aClass143_4063!!.anInt1992) + (i_2_ - -i_11_)), 1, 0, 1)
                                                    i += class105s[i_12_]!!.method966()
                                                    i_5_ = -1
                                                } catch (exception: Exception) {
                                                    /* empty */
                                                }
                                            } else method2573((-92).toByte(), string_9_)
                                            i_8_++
                                            continue
                                        }
                                    } else c = '\u20ac'
                                } else c = '\u00ad'
                            } else c = '>'
                        }
                        if (i_4_ == -1) {
                            if (i_5_ != -1) i += aClass143_4063!!.method1182(i_5_, (-104).toByte(), c)
                            val i_14_: Int
                            if (is_1_ == null) i_14_ = 0
                            else i_14_ = is_1_[i_6_]
                            val i_15_: Int
                            if (`is` == null) i_15_ = 0
                            else i_15_ = `is`[i_6_]
                            if (c.code != 32) {
                                if ((Class20.anInt320 and 0xffffff.inv()) != 0) fa(c, 1 + i - -i_14_, i_2_ - -1 + i_15_, Class20.anInt320, true)
                                fa(c, i + i_14_, i_2_ + i_15_, Class348_Sub42_Sub1.anInt9492, false)
                            } else if (Class131.anInt1902 > 0) {
                                Class258.anInt4848 += Class131.anInt1902
                                i += Class258.anInt4848 shr 8
                                Class258.anInt4848 = Class258.anInt4848 and 0xff
                            }
                            i_6_++
                            val i_16_ = aClass143_4063!!.method1184((-48).toByte(), c.code)
                            if (Player.anInt10567 != -1) aHa4048!!.method3649((-103).toByte(), i_16_, i_2_ - -((aClass143_4063!!.anInt1992).toDouble() * 0.7).toInt(), Player.anInt10567, i)
                            if (Class348_Sub40_Sub2.anInt9101 != -1) aHa4048!!.method3649((-96).toByte(), i_16_, (aClass143_4063!!.anInt1992) + i_2_, (Class348_Sub40_Sub2.anInt9101), i)
                            i_5_ = c.code
                            i += i_16_
                        }
                    }
                    i_8_++
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("da.V(" + (if (class105s != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (is_0_ != null) "{...}" else "null") + ',' + (if (is_1_ != null) "{...}" else "null") + ',' + i_2_ + ',' + (if (string != null) "{...}" else "null") + ',' + i_3_ + ')'))
        }
    }

    fun method2567(i: Int, string: String?, i_17_: Byte, i_18_: Int, i_19_: Int, i_20_: Int, class105s: Array<Class105?>?, `is`: IntArray?) {
        try {
            anInt4056++
            if (i_17_ > 114 && string != null) {
                method2579(i_19_, -78, i_18_)
                method2583(0, i, 0, class105s, null, string, `is`, 25625, i_20_)
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("da.R(" + i + ',' + (if (string != null) "{...}" else "null") + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + (if (class105s != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    fun method2568(`is`: IntArray?, i: Int, i_21_: Byte, var_aa: aa?, i_22_: Int, class105s: Array<Class105?>?, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int, string: String?, i_27_: Int, i_28_: Int, i_29_: Int, i_30_: Int, i_31_: Int, i_32_: Int): Int {
        var i_26_ = i_26_
        var i_31_ = i_31_
        var i_32_ = i_32_
        try {
            anInt4054++
            if (string == null) return 0
            method2579(i_30_, -76, i_23_)
            if (i_32_ == 0) i_32_ = aClass143_4063!!.anInt1992
            val is_33_: IntArray?
            if ((aClass143_4063!!.anInt1993 + aClass143_4063!!.anInt1988 - -i_32_) <= i || i_32_ + i_32_ <= i) is_33_ = intArrayOf(i_25_)
            else is_33_ = null
            var i_34_ = aClass143_4063!!.method1188(string, is_33_, Class156.aStringArray2113, 87.toByte(), class105s)
            if (i_31_ == -1) {
                i_31_ = i / i_32_
                if (i_31_ <= 0) i_31_ = 1
            }
            if (i_31_ > 0 && i_31_ <= i_34_) {
                Class156.aStringArray2113!![i_31_ - 1] = aClass143_4063!!.method1181(class105s, i_25_, (Class156.aStringArray2113!![i_31_ - 1]), 55.toByte())
                i_34_ = i_31_
            }
            if (i_26_ == 3 && i_34_ == 1) i_26_ = 1
            val i_35_ = -116 % ((i_21_ - -28) / 43)
            var i_36_: Int
            if (i_26_ == 0) i_36_ = aClass143_4063!!.anInt1988 + i_24_
            else if (i_26_ != 1) {
                if (i_26_ != 2) {
                    var i_37_ = ((-(i_32_ * (i_34_ + -1)) + (i + (-aClass143_4063!!.anInt1988 + -aClass143_4063!!.anInt1993))) / (1 + i_34_))
                    if (i_37_ < 0) i_37_ = 0
                    i_32_ += i_37_
                    i_36_ = aClass143_4063!!.anInt1988 + (i_24_ - -i_37_)
                } else i_36_ = (-aClass143_4063!!.anInt1993 + i + (i_24_ - (i_34_ + -1) * i_32_))
            } else i_36_ = ((-aClass143_4063!!.anInt1993 + (-aClass143_4063!!.anInt1988 + i + -(i_32_ * (-1 + i_34_)))) / 2 + (aClass143_4063!!.anInt1988 + i_24_))
            for (i_38_ in 0..<i_34_) {
                if (i_29_ == 0) method2583(i_27_, i_36_, i_22_, class105s, var_aa, Class156.aStringArray2113!![i_38_], `is`, 25625, i_28_)
                else if (i_29_ == 1) method2583(i_27_, i_36_, i_22_, class105s, var_aa, Class156.aStringArray2113!![i_38_], `is`, 25625, (-aClass143_4063!!.method1183(true, (Class156.aStringArray2113!![i_38_])) + i_25_) / 2 + i_28_)
                else if (i_29_ == 2) method2583(i_27_, i_36_, i_22_, class105s, var_aa, Class156.aStringArray2113!![i_38_], `is`, 25625, (-aClass143_4063!!.method1183(true, (Class156.aStringArray2113!![i_38_])) + (i_25_ + i_28_)))
                else if (i_38_ != i_34_ - 1) {
                    method2580(Class156.aStringArray2113!![i_38_]!!, 0, i_25_)
                    method2583(i_27_, i_36_, i_22_, class105s, var_aa, Class156.aStringArray2113!![i_38_], `is`, 25625, i_28_)
                    Class131.anInt1902 = 0
                } else method2583(i_27_, i_36_, i_22_, class105s, var_aa, Class156.aStringArray2113!![i_38_], `is`, 25625, i_28_)
                i_36_ += i_32_
            }
            return i_34_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(
                runtimeexception,
                ("da.W(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + i_21_ + ',' + (if (var_aa != null) "{...}" else "null") + ',' + i_22_ + ',' + (if (class105s != null) "{...}" else "null") + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ',' + i_26_ + ',' + (if (string != null) "{...}" else "null") + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ')')
            )
        }
    }

    abstract fun fa(c: Char, i: Int, i_39_: Int, i_40_: Int, bool: Boolean)

    fun method2569(string: String?, i: Int, i_41_: Int, i_42_: Int, i_43_: Int, i_44_: Int) {
        anInt4052++
        if (i_43_ >= -119) method2571(-128, -30, null, null, -107, -80, null, -6, -122, null)
        if (string != null) {
            method2579(i_44_, 122, i_41_)
            method2583(0, i, 0, null, null, string, null, 25625, -aClass143_4063!!.method1183(true, string) + i_42_)
        }
    }

    fun method2571(i: Int, i_48_: Int, `is`: IntArray?, string: String?, i_49_: Int, i_50_: Int, class105s: Array<Class105?>?, i_51_: Int, i_52_: Int, random: Random?): Int {
        try {
            anInt4047++
            if (string == null) return 0
            random!!.setSeed(i_48_.toLong())
            val i_53_ = (random.nextInt() and 0x1f) + 192
            method2579(i_53_ shl 24 or (0xffffff and i_50_), i xor 0x79.inv(), i_53_ shl 24 or (i_49_ and 0xffffff))
            val i_54_ = string.length
            if (i != -1) aClass138_4062 = null
            val is_55_ = IntArray(i_54_)
            var i_56_ = 0
            var i_57_ = 0
            while (i_54_ > i_57_) {
                is_55_[i_57_] = i_56_
                if ((0x3 and random.nextInt()) == 0) i_56_++
                i_57_++
            }
            method2566(class105s, null, i_52_, `is`, is_55_, i_51_, string, 174)
            return i_56_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("da.BA(" + i + ',' + i_48_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + i_49_ + ',' + i_50_ + ',' + (if (class105s != null) "{...}" else "null") + ',' + i_51_ + ',' + i_52_ + ',' + (if (random != null) "{...}" else "null") + ')'))
        }
    }

    private fun method2573(i: Byte, string: String) {
        anInt4046++
        try {
            if (i <= -78) {
                if (string.startsWith("col=")) Class348_Sub42_Sub1.anInt9492 = (Class348_Sub42_Sub1.anInt9492 and 0xffffff.inv() or (Class48.method450(-20188, string.substring(4), 16) and 0xffffff))
                else if (string == "/col") Class348_Sub42_Sub1.anInt9492 = (Class348_Sub42_Sub1.anInt9492 and 0xffffff.inv() or (0xffffff and Class186_Sub1.anInt5807))
                if (string.startsWith("argb=")) Class348_Sub42_Sub1.anInt9492 = Class48.method450(-20188, string.substring(5), 16)
                else if (string != "/argb") {
                    if (!string.startsWith("str=")) {
                        if (string == "str") Player.anInt10567 = (Class348_Sub42_Sub1.anInt9492 and 0xffffff.inv() or 0x800000)
                        else if (string != "/str") {
                            if (!string.startsWith("u=")) {
                                if (string != "u") {
                                    if (string != "/u") {
                                        if (!string.equals("shad=-1", ignoreCase = true)) {
                                            if (string.startsWith("shad=")) Class20.anInt320 = ((0xffffff.inv() and (Class348_Sub42_Sub1.anInt9492)) or (Class48.method450(-20188, string.substring(5), 16)))
                                            else if (string == "shad") Class20.anInt320 = (0xffffff.inv() and (Class348_Sub42_Sub1.anInt9492))
                                            else if (string != "/shad") {
                                                if (string == "br") method2579((Class151.anInt2061), 117, (Class186_Sub1.anInt5807))
                                            } else Class20.anInt320 = Class151.anInt2061
                                        } else Class20.anInt320 = 0
                                    } else Class348_Sub40_Sub2.anInt9101 = -1
                                } else Class348_Sub40_Sub2.anInt9101 = (Class348_Sub42_Sub1.anInt9492 and 0xffffff.inv())
                            } else Class348_Sub40_Sub2.anInt9101 = ((Class348_Sub42_Sub1.anInt9492 and 0xffffff.inv()) or Class48.method450(-20188, string.substring(2), 16))
                        } else Player.anInt10567 = -1
                    } else Player.anInt10567 = (Class348_Sub42_Sub1.anInt9492 and 0xffffff.inv() or Class48.method450(-20188, string.substring(4), 16))
                } else Class348_Sub42_Sub1.anInt9492 = Class186_Sub1.anInt5807
            }
        } catch (exception: Exception) {
            /* empty */
        }
    }

    fun method2574(i: Int, i_58_: Int, string: String?, i_59_: Int, i_60_: Int, i_61_: Int, bool: Boolean) {
        anInt4059++
        if (string != null) {
            method2579(i_60_, 108, i)
            val i_62_ = string.length
            val `is` = IntArray(i_62_)
            if (bool != false) aHa4048 = null
            for (i_63_ in 0..<i_62_) `is`[i_63_] = (5.0 * sin(i_63_.toDouble() / 2.0 + i_61_.toDouble() / 5.0)).toInt()
            method2566(null, `is`, -(aClass143_4063!!.method1183(!bool, string) / 2) + i_59_, null, null, i_58_, string, 174)
        }
    }

    fun method2575(i: Byte, i_64_: Int, i_65_: Int, string: String?, i_66_: Int, i_67_: Int) {
        anInt4060++
        if (string != null) {
            method2579(i_66_, 115, i_65_)
            method2583(0, i_67_, 0, null, null, string, null, 25625, -(aClass143_4063!!.method1183(true, string) / 2) + i_64_)
            val i_68_ = 7 % ((66 - i) / 44)
        }
    }

    fun method2576(string: String?, i: Int, i_69_: Int, i_70_: Int, i_71_: Int, i_72_: Int) {
        if (i_72_ <= -108) {
            anInt4045++
            if (string != null) {
                method2579(i_71_, 110, i)
                method2583(0, i_69_, 0, null, null, string, null, 25625, i_70_)
            }
        }
    }

    fun method2577(i: Int, i_73_: Int, string: String?, i_74_: Int, i_75_: Int, i_76_: Int, i_77_: Int, i_78_: Int) {
        anInt4051++
        if (string != null) {
            method2579(i_75_, -104, i_74_)
            var d = 7.0 - i_76_.toDouble() / 8.0
            if (d < 0.0) d = 0.0
            val i_79_ = string.length
            if (i_78_ != -20509) fa('\ufff3', -40, -44, -36, true)
            val `is` = IntArray(i_79_)
            var i_80_ = 0
            while (i_79_ > i_80_) {
                `is`[i_80_] = (sin(i.toDouble() + i_80_.toDouble() / 1.5) * d).toInt()
                i_80_++
            }
            method2566(null, `is`, i_77_ + -(aClass143_4063!!.method1183(true, string) / 2), null, null, i_73_, string, 174)
        }
    }

    abstract fun method2578(c: Char, i: Int, i_81_: Int, i_82_: Int, bool: Boolean, var_aa: aa?, i_83_: Int, i_84_: Int)

    private fun method2579(i: Int, i_85_: Int, i_86_: Int) {
        var i = i
        Class348_Sub40_Sub2.anInt9101 = -1
        if (i == -1) i = 0
        Class186_Sub1.anInt5807 = i_86_
        Class348_Sub42_Sub1.anInt9492 = Class186_Sub1.anInt5807
        Class258.anInt4848 = 0
        Class131.anInt1902 = 0
        val i_87_ = -28 / ((56 - i_85_) / 49)
        anInt4053++
        Player.anInt10567 = -1
        Class151.anInt2061 = i
        Class20.anInt320 = Class151.anInt2061
    }

    private fun method2580(string: String, i: Int, i_88_: Int) {
        anInt4064++
        var i_89_ = 0
        var bool = false
        for (i_90_ in i..<string.length) {
            val i_91_ = string.get(i_90_).code
            if (i_91_ != 60) {
                if (i_91_ == 62) bool = false
                else if (!bool && i_91_ == 32) i_89_++
            } else bool = true
        }
        if (i_89_ > 0) Class131.anInt1902 = (-aClass143_4063!!.method1183(true, string) + i_88_ shl 8) / i_89_
    }

    fun method2581(string: String?, i: Int, i_92_: Int, i_93_: Int, i_94_: Byte, i_95_: Int, i_96_: Int) {
        anInt4049++
        if (string != null) {
            method2579(i_95_, 117, i)
            if (i_94_ > -12) aClass143_4063 = null
            val i_97_ = string.length
            val `is` = IntArray(i_97_)
            val is_98_ = IntArray(i_97_)
            var i_99_ = 0
            while (i_97_ > i_99_) {
                `is`[i_99_] = (5.0 * sin(i_92_.toDouble() / 5.0 + i_99_.toDouble() / 5.0)).toInt()
                is_98_[i_99_] = (5.0 * sin(i_99_.toDouble() / 3.0 + i_92_.toDouble() / 5.0)).toInt()
                i_99_++
            }
            method2566(null, is_98_, -(aClass143_4063!!.method1183(true, string) / 2) + i_96_, null, `is`, i_93_, string, 174)
        }
    }

    private fun method2583(i: Int, i_103_: Int, i_104_: Int, class105s: Array<Class105?>?, var_aa: aa?, string: String?, `is`: IntArray?, i_105_: Int, i_106_: Int) {
        var i_103_ = i_103_
        var i_106_ = i_106_
        try {
            i_103_ -= aClass143_4063!!.anInt1992
            anInt4061++
            var i_107_ = -1
            var i_108_ = -1
            val i_109_ = string!!.length
            if (i_105_ == 25625) {
                var i_110_ = 0
                while ( /**/i_110_ < i_109_) {
                    var c = (Class354.method3464(string.get(i_110_), false).toInt() and 0xff).toChar()
                    if (c.code == 60) i_107_ = i_110_
                    else {
                        if (c.code == 62 && i_107_ != -1) {
                            val string_111_ = string.substring(i_107_ - -1, i_110_)
                            i_107_ = -1
                            if (string_111_ == "lt") c = '<'
                            else if (string_111_ == "gt") c = '>'
                            else if (string_111_ != "nbsp") {
                                if (string_111_ == "shy") c = '\u00ad'
                                else if (string_111_ != "times") {
                                    if (string_111_ != "euro") {
                                        if (string_111_ == "copy") c = '\u00a9'
                                        else if (string_111_ == "reg") c = '\u00ae'
                                        else {
                                            if (string_111_.startsWith("img=")) {
                                                try {
                                                    val i_112_ = (Class348_Sub41.method3156(true, (string_111_.substring(4))))
                                                    val class105 = class105s!![i_112_]!!
                                                    val i_113_ = (if (`is` == null) class105.method980() else `is`[i_112_])
                                                    if (((Class348_Sub42_Sub1.anInt9492) and 0xffffff.inv()) != -16777216) class105.method964(i_106_, (-i_113_ + (aClass143_4063!!.anInt1992) + i_103_), 0, (0xffffff or (0xffffff.inv() and (Class348_Sub42_Sub1.anInt9492))), 1)
                                                    else class105.method964(i_106_, ((aClass143_4063!!.anInt1992) + (i_103_ - i_113_)), 1, 0, 1)
                                                    i_108_ = -1
                                                    i_106_ += class105s[i_112_]!!.method966()
                                                } catch (exception: Exception) {
                                                    /* empty */
                                                }
                                            } else method2573((-118).toByte(), string_111_)
                                            i_110_++
                                            continue
                                        }
                                    } else c = '\u20ac'
                                } else c = '\u00d7'
                            } else c = '\u00a0'
                        }
                        if (i_107_ == -1) {
                            if (i_108_ != -1) i_106_ += aClass143_4063!!.method1182(i_108_, (-90).toByte(), c)
                            if (c.code != 32) {
                                if (var_aa == null) {
                                    if ((Class20.anInt320 and 0xffffff.inv()) != 0) fa(c, i_106_ + 1, 1 + i_103_, Class20.anInt320, true)
                                    fa(c, i_106_, i_103_, Class348_Sub42_Sub1.anInt9492, false)
                                } else {
                                    if ((0xffffff.inv() and Class20.anInt320) != 0) method2578(c, 1 + i_106_, i_103_ + 1, Class20.anInt320, true, var_aa, i_104_, i)
                                    method2578(c, i_106_, i_103_, Class348_Sub42_Sub1.anInt9492, false, var_aa, i_104_, i)
                                }
                            } else if (Class131.anInt1902 > 0) {
                                Class258.anInt4848 += Class131.anInt1902
                                i_106_ += Class258.anInt4848 shr 8
                                Class258.anInt4848 = Class258.anInt4848 and 0xff
                            }
                            val i_114_ = aClass143_4063!!.method1184((-48).toByte(), c.code)
                            if (Player.anInt10567 != -1) aHa4048!!.method3649((-119).toByte(), i_114_, (aClass143_4063!!.anInt1992.toDouble() * 0.7).toInt() + i_103_, Player.anInt10567, i_106_)
                            if (Class348_Sub40_Sub2.anInt9101 != -1) aHa4048!!.method3649((-114).toByte(), i_114_, (aClass143_4063!!.anInt1992) + (i_103_ + 1), (Class348_Sub40_Sub2.anInt9101), i_106_)
                            i_106_ += i_114_
                            i_108_ = c.code
                        }
                    }
                    i_110_++
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("da.AA(" + i + ',' + i_103_ + ',' + i_104_ + ',' + (if (class105s != null) "{...}" else "null") + ',' + (if (var_aa != null) "{...}" else "null") + ',' + (if (string != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_105_ + ',' + i_106_ + ')'))
        }
    }

    init {
        try {
            aClass143_4063 = class143
            aHa4048 = var_ha
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("da.<init>(" + (if (var_ha != null) "{...}" else "null") + ',' + (if (class143 != null) "{...}" else "null") + ')'))
        }
    }

    fun method2584(`is`: IntArray?, i: Int, i_115_: Int, class105s: Array<Class105?>?, i_116_: Int, i_117_: Int, i_118_: Int, var_aa: aa?, i_119_: Int, i_120_: Int, i_121_: Int, i_122_: Int, i_123_: Int, bool: Boolean, i_124_: Int, string: String?): Int {
        try {
            if (bool != false) method2570(-23, 41)
            anInt4057++
            return method2568(`is`, i_118_, 97.toByte(), var_aa, i_120_, class105s, i_116_, i_119_, i_122_, i_117_, string, i_121_, i_123_, i_124_, i_115_, 0, i)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("da.J(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + i_115_ + ',' + (if (class105s != null) "{...}" else "null") + ',' + i_116_ + ',' + i_117_ + ',' + i_118_ + ',' + (if (var_aa != null) "{...}" else "null") + ',' + i_119_ + ',' + i_120_ + ',' + i_121_ + ',' + i_122_ + ',' + i_123_ + ',' + bool + ',' + i_124_ + ',' + (if (string != null) "{...}" else "null") + ')'))
        }
    }

    fun method2585(`is`: IntArray?, i: Int, class105s: Array<Class105?>?, i_125_: Int, i_126_: Int, i_127_: Int, i_128_: Int, random: Random?, i_129_: Int, i_130_: Int, i_131_: Int, i_132_: Int, i_133_: Int, string: String?, is_134_: IntArray?): Int {
        try {
            anInt4050++
            if (string == null) return 0
            random!!.setSeed(i_131_.toLong())
            val i_135_ = (0x1f and random.nextInt()) + 192
            method2579(i_135_ shl 24 or (i_128_ and 0xffffff), -45, 0xffffff and i_126_ or (i_135_ shl 24))
            val i_136_ = string.length
            val is_137_ = IntArray(i_136_)
            var i_138_ = 0
            var i_139_ = 0
            while (i_136_ > i_139_) {
                is_137_[i_139_] = i_138_
                if ((0x3 and random.nextInt()) == 0) i_138_++
                i_139_++
            }
            var i_140_ = i_133_
            var i_141_ = aClass143_4063!!.anInt1988 + i_130_
            var i_142_ = -1
            if (i_125_ == 1) i_141_ += (-aClass143_4063!!.anInt1988 + i_127_ + -aClass143_4063!!.anInt1993) / 2
            else if (i_125_ == 2) i_141_ = -aClass143_4063!!.anInt1993 + (i_127_ + i_130_)
            if (i_132_ != -33) method2578('\ufffe', 83, -110, 26, true, null, 113, 97)
            if (i_129_ == 1) {
                i_142_ = aClass143_4063!!.method1183(true, string) + i_138_
                i_140_ += (i + -i_142_) / 2
            } else if (i_129_ == 2) {
                i_142_ = aClass143_4063!!.method1183(true, string) - -i_138_
                i_140_ += -i_142_ + i
            }
            method2566(class105s, null, i_140_, `is`, is_137_, i_141_, string, 174)
            if (is_134_ != null) {
                if (i_142_ == -1) i_142_ = aClass143_4063!!.method1183(true, string) - -i_138_
                is_134_[2] = i_142_
                is_134_[3] = (aClass143_4063!!.anInt1993 + aClass143_4063!!.anInt1988)
                is_134_[0] = i_140_
                is_134_[1] = -aClass143_4063!!.anInt1988 + i_141_
            }
            return i_138_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(
                runtimeexception,
                ("da.P(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (class105s != null) "{...}" else "null") + ',' + i_125_ + ',' + i_126_ + ',' + i_127_ + ',' + i_128_ + ',' + (if (random != null) "{...}" else "null") + ',' + i_129_ + ',' + i_130_ + ',' + i_131_ + ',' + i_132_ + ',' + i_133_ + ',' + (if (string != null) "{...}" else "null") + ',' + (if (is_134_ != null) "{...}" else "null") + ')')
            )
        }
    }

    companion object {
        @JvmField
        var anInt4045: Int = 0
        @JvmField
        var anInt4046: Int = 0
        @JvmField
        var anInt4047: Int = 0
        @JvmField
        var anInt4049: Int = 0
        @JvmField
        var anInt4050: Int = 0
        @JvmField
        var anInt4051: Int = 0
        @JvmField
        var anInt4052: Int = 0
        @JvmField
        var anInt4053: Int = 0
        @JvmField
        var anInt4054: Int = 0
        @JvmField
        var anInt4055: Int = 0
        @JvmField
        var anInt4056: Int = 0
        @JvmField
        var anInt4057: Int = 0
        @JvmField
        var anInt4058: Int = 0
        @JvmField
        var anInt4059: Int = 0
        @JvmField
        var anInt4060: Int = 0
        @JvmField
        var anInt4061: Int = 0
        @JvmField
        var aClass138_4062: Class138? = Class138(2, 4, 4, 0)
        @JvmField
        var anInt4064: Int = 0
        @JvmField
        var anInt4065: Int = 0

        @JvmStatic
        fun method2570(i: Int, i_45_: Int): Class46? {
            anInt4055++
            if (i != 1512932720) return null
            val i_46_ = i_45_ shr 16
            val i_47_ = i_45_ and 0xffff
            if (Class348_Sub40_Sub33.aClass46ArrayArray9427!![i_46_] == null || (Class348_Sub40_Sub33.aClass46ArrayArray9427!![i_46_]!![i_47_] == null)) {
                val bool = Class320.method2547(i_46_, 84.toByte())
                if (!bool) return null
            }
            return Class348_Sub40_Sub33.aClass46ArrayArray9427!![i_46_]!![i_47_]
        }

        @JvmStatic
        fun method2572(i: Byte) {
            aClass138_4062 = null
            if (i.toInt() != 23) aClass138_4062 = null
        }

        @JvmStatic
        fun method2582(class377: Class377?, class39s: Array<Class39?>?, i: Int): Class89? {
            try {
                anInt4065++
                if (i != -2113) aClass138_4062 = null
                var i_100_ = 0
                while (class39s!!.size > i_100_) {
                    if (class39s[i_100_] == null || class39s[i_100_]!!.aLong517 <= 0) return null
                    i_100_++
                }
                val l = glCreateProgramObjectARB()
                var i_101_ = 0
                while (class39s.size > i_101_) {
                    glAttachObjectARB(l, (class39s[i_101_]!!.aLong517))
                    i_101_++
                }
                glLinkProgramARB(l)
                glGetObjectParameterivARB(l, 35714, Class211.anIntArray2744, 0)
                if (Class211.anIntArray2744!![0] == 0) {
                    if (Class211.anIntArray2744!![0] == 0) println("Shader linking failed:")
                    glGetObjectParameterivARB(l, 35716, Class211.anIntArray2744, 1)
                    if (Class211.anIntArray2744!![1] > 1) {
                        val `is` = ByteArray(Class211.anIntArray2744!![1])
                        glGetInfoLogARB(l, Class211.anIntArray2744!![1], Class211.anIntArray2744, 0, `is`, 0)
                        println(String(`is`))
                    }
                    if (Class211.anIntArray2744!![0] == 0) {
                        var i_102_ = 0
                        while (class39s.size > i_102_) {
                            glDetachObjectARB(l, (class39s[i_102_]!!.aLong517))
                            i_102_++
                        }
                        glDeleteObjectARB(l)
                        return null
                    }
                }
                return Class89(class377, l, class39s)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("da.M(" + (if (class377 != null) "{...}" else "null") + ',' + (if (class39s != null) "{...}" else "null") + ',' + i + ')'))
            }
        }
    }
}
