import java.util.*
import kotlin.math.atan2
import kotlin.math.min

/* Class64 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
public abstract class Class64 {
    @JvmField
    var aBoolean1124: Boolean = false
    abstract fun FA(i: Int)

    abstract fun p(i: Int, i_0_: Int, var_s: s?, var_s_1_: s?, i_2_: Int, i_3_: Int, i_4_: Int)

    private fun method602(i: Int, class348_sub33: Class348_Sub33?, i_5_: Int, bool: Boolean, i_6_: Int, class4: Class4?, i_7_: Int, `is`: IntArray?, bools: BooleanArray?, class4_8_: Class4?, i_9_: Int, bool_10_: Boolean) {
        try {
            anInt1130++
            if (class4 == null || i_7_ == 0) {
                var i_11_ = 0
                while (class4_8_!!.anInt126 > i_11_) {
                    val i_12_ = class4_8_.aShortArray130!![i_11_]
                    if (bools == null || bools[i_12_.toInt()] != !bool || (class348_sub33!!.anIntArray6957!![i_12_.toInt()]) == 0) {
                        val i_13_ = class4_8_.aShortArray128!![i_11_]
                        if (i_13_.toInt() != -1) method627((class348_sub33!!.anIntArrayArray6959!![i_13_.toInt()]!!), bool_10_, i, 0, 0, i_9_ and (class348_sub33.anIntArray6960!![i_13_.toInt()]), (-93).toByte(), 0, `is`, 0)
                        method627((class348_sub33!!.anIntArrayArray6959!![i_12_.toInt()]!!), bool_10_, i, class4_8_.aShortArray137!![i_11_].toInt(), (class348_sub33.anIntArray6957!![i_12_.toInt()]), (class348_sub33.anIntArray6960!![i_12_.toInt()]) and i_9_, (-93).toByte(), class4_8_.aShortArray140!![i_11_].toInt(), `is`, class4_8_.aShortArray135!![i_11_].toInt())
                    }
                    i_11_++
                }
            } else {
                var i_14_ = 0
                var i_15_ = 0
                var i_16_ = 0
                val i_17_ = -53 % ((i_5_ - 76) / 41)
                while ( /**/class348_sub33!!.anInt6965 > i_16_) {
                    var bool_18_ = false
                    if (class4_8_!!.anInt126 > i_14_ && class4_8_.aShortArray130!![i_14_].toInt() == i_16_) bool_18_ = true
                    var bool_19_ = false
                    if (class4.anInt126 > i_15_ && i_16_ == class4.aShortArray130!![i_15_].toInt()) bool_19_ = true
                    if (bool_18_ || bool_19_) {
                        if (bools != null && bool == !bools[i_16_] && (class348_sub33.anIntArray6957!![i_16_]) != 0) {
                            if (bool_19_) i_15_++
                            if (bool_18_) i_14_++
                        } else {
                            var i_20_ = 0
                            val i_21_ = (class348_sub33.anIntArray6957!![i_16_])
                            if (i_21_ == 3 || i_21_ == 10) i_20_ = 128
                            val i_22_: Int
                            val i_23_: Short
                            val i_24_: Int
                            val i_25_: Byte
                            val i_26_: Int
                            if (bool_18_) {
                                i_22_ = (class4_8_.aShortArray135!![i_14_]).toInt()
                                i_23_ = (class4_8_.aShortArray128!![i_14_])
                                i_24_ = (class4_8_.aShortArray137!![i_14_]).toInt()
                                i_25_ = (class4_8_.aByteArray132!![i_14_])
                                i_26_ = (class4_8_.aShortArray140!![i_14_]).toInt()
                                i_14_++
                            } else {
                                i_24_ = i_20_
                                i_23_ = (-1).toShort()
                                i_22_ = i_20_
                                i_26_ = i_20_
                                i_25_ = 0.toByte()
                            }
                            val i_27_: Int
                            val i_28_: Int
                            val i_29_: Byte
                            val i_30_: Int
                            val i_31_: Short
                            if (bool_19_) {
                                i_27_ = class4.aShortArray137!![i_15_].toInt()
                                i_28_ = class4.aShortArray135!![i_15_].toInt()
                                i_29_ = class4.aByteArray132!![i_15_]
                                i_30_ = class4.aShortArray140!![i_15_].toInt()
                                i_31_ = class4.aShortArray128!![i_15_]
                                i_15_++
                            } else {
                                i_28_ = i_20_
                                i_31_ = (-1).toShort()
                                i_30_ = i_20_
                                i_27_ = i_20_
                                i_29_ = 0.toByte()
                            }
                            if (i_23_.toInt() != -1) method627((class348_sub33.anIntArrayArray6959!![i_23_.toInt()]!!), bool_10_, i, 0, 0, (i_9_ and (class348_sub33.anIntArray6960!![i_23_.toInt()])), (-93).toByte(), 0, `is`, 0)
                            else if (i_31_.toInt() != -1) method627((class348_sub33.anIntArrayArray6959!![i_31_.toInt()]!!), bool_10_, i, 0, 0, (i_9_ and (class348_sub33.anIntArray6960!![i_31_.toInt()])), (-93).toByte(), 0, `is`, 0)
                            val i_32_: Int
                            val i_33_: Int
                            val i_34_: Int
                            if ((0x2 and i_25_.toInt()) != 0 || (i_29_.toInt() and 0x1) != 0) {
                                i_32_ = i_26_
                                i_34_ = i_22_
                                i_33_ = i_24_
                            } else if (i_21_ == 2) {
                                var i_37_ = 0x3fff and i_30_ - i_26_
                                var i_38_ = i_27_ + -i_24_ and 0x3fff
                                var i_39_ = 0x3fff and i_28_ - i_22_
                                if (i_37_ >= 8192) i_37_ -= 16384
                                if (i_38_ >= 8192) i_38_ -= 16384
                                if (i_39_ >= 8192) i_39_ -= 16384
                                i_32_ = i_26_ - -(i_37_ * i_7_ / i_6_) and 0x3fff
                                i_33_ = i_38_ * i_7_ / i_6_ + i_24_ and 0x3fff
                                i_34_ = 0x3fff and i_22_ - -(i_7_ * i_39_ / i_6_)
                            } else if (i_21_ == 9) {
                                var i_35_ = i_30_ + -i_26_ and 0x3fff
                                if (i_35_ >= 8192) i_35_ -= 16384
                                i_32_ = i_35_ * i_7_ / i_6_ + i_26_ and 0x3fff
                                i_34_ = 0
                                i_33_ = i_34_
                            } else if (i_21_ == 7) {
                                var i_36_ = 0x3f and i_30_ + -i_26_
                                if (i_36_ >= 32) i_36_ -= 64
                                i_32_ = (i_26_ - -(i_36_ * i_7_ / i_6_) and 0x3f)
                                i_33_ = (i_7_ * (i_27_ + -i_24_) / i_6_ + i_24_)
                                i_34_ = ((-i_22_ + i_28_) * i_7_ / i_6_ + i_22_)
                            } else {
                                i_32_ = (i_26_ + i_7_ * (i_30_ - i_26_) / i_6_)
                                i_34_ = i_22_ - -((i_28_ + -i_22_) * i_7_ / i_6_)
                                i_33_ = (i_7_ * (-i_24_ + i_27_) / i_6_ + i_24_)
                            }
                            method627((class348_sub33.anIntArrayArray6959!![i_16_]!!), bool_10_, i, i_33_, i_21_, i_9_ and (class348_sub33.anIntArray6960!![i_16_]), (-93).toByte(), i_32_, `is`, i_34_)
                        }
                    }
                    i_16_++
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ka.AC(" + i + ',' + (if (class348_sub33 != null) "{...}" else "null") + ',' + i_5_ + ',' + bool + ',' + i_6_ + ',' + (if (class4 != null) "{...}" else "null") + ',' + i_7_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (bools != null) "{...}" else "null") + ',' + (if (class4_8_ != null) "{...}" else "null") + ',' + i_9_ + ',' + bool_10_ + ')'))
        }
    }

    fun method603(i: Byte, i_40_: Int, `is`: IntArray?, i_41_: Int, i_42_: Int, i_43_: Int, class348_sub42_sub17: Class348_Sub42_Sub17?, i_44_: Int, class348_sub42_sub17_45_: Class348_Sub42_Sub17?, bool: Boolean, i_46_: Int) {
        try {
            anInt1133++
            if (i_42_ != -1) {
                method622()
                if (NA()) {
                    val class4 = (class348_sub42_sub17_45_!!.aClass4Array9673!![i_42_])!!
                    if (i.toInt() != -55) this.aBoolean1124 = false
                    val class348_sub33 = class4.aClass348_Sub33_134
                    var class4_47_: Class4? = null
                    if (class348_sub42_sub17 != null) {
                        class4_47_ = (class348_sub42_sub17.aClass4Array9673!![i_43_])
                        if (class4_47_!!.aClass348_Sub33_134 != class348_sub33) class4_47_ = null
                    }
                    method602(i_44_, class348_sub33, -18, false, i_46_, class4_47_, i_40_, `is`, null, class4, i_41_, bool)
                    wa()
                    method621()
                } else method621()
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ka.QB(" + i + ',' + i_40_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_41_ + ',' + i_42_ + ',' + i_43_ + ',' + (if (class348_sub42_sub17 != null) "{...}" else "null") + ',' + i_44_ + ',' + (if (class348_sub42_sub17_45_ != null) "{...}" else "null") + ',' + bool + ',' + i_46_ + ')'))
        }
    }

    abstract fun method604(): Array<Class342?>?

    abstract fun C(i: Int)

    abstract fun method605(i: Int, `is`: IntArray, i_48_: Int, i_49_: Int, i_50_: Int, i_51_: Int, bool: Boolean)

    abstract fun wa()

    abstract fun I(i: Int, `is`: IntArray, i_59_: Int, i_60_: Int, i_61_: Int, bool: Boolean, i_62_: Int, is_63_: IntArray?)

    abstract fun G(): Int

    abstract fun NA(): Boolean

    abstract fun LA(i: Int)

    abstract fun method608(class101: Class101?, class318_sub3: Class318_Sub3?, i: Int, i_71_: Int)

    abstract fun ua(): Int

    abstract fun HA(): Int

    abstract fun ma(): Int

    abstract fun F(): Boolean

    abstract fun O(i: Int, i_72_: Int, i_73_: Int)

    abstract fun method610(class101: Class101, i: Int, bool: Boolean)

    abstract fun EA(): Int

    fun method611(i: Int, i_74_: Int, class348_sub42_sub17: Class348_Sub42_Sub17) {
        anInt1126++
        if (i != -1) {
            method622()
            if (NA()) {
                val class4 = (class348_sub42_sub17.aClass4Array9673!![i]!!)
                val class348_sub33 = class4.aClass348_Sub33_134!!
                var i_75_ = 0
                while ((i_75_ < class4.anInt126)) {
                    val i_76_ = class4.aShortArray130!![i_75_]
                    if (class348_sub33.aBooleanArray6954!![i_76_.toInt()]) {
                        if (class4.aShortArray128!![i_75_].toInt() != -1) P(0, 0, 0, 0)
                        P((class348_sub33.anIntArray6957!![i_76_.toInt()]), class4.aShortArray140!![i_75_].toInt(), class4.aShortArray137!![i_75_].toInt(), class4.aShortArray135!![i_75_].toInt())
                    }
                    i_75_++
                }
                if (i_74_ != -8700) anIntArray1127 = null
                wa()
                method621()
            } else method621()
        }
    }

    abstract fun method612()

    abstract fun da(): Int

    abstract fun s(i: Int)

    abstract fun RA(): Int

    abstract fun method613(class64_77_: Class64?, i: Int, i_78_: Int, i_79_: Int, bool: Boolean)

    abstract fun v()

    abstract fun method614(i: Byte, i_80_: Int, bool: Boolean): Class64?

    abstract fun method615(class101: Class101?, class318_sub3: Class318_Sub3?, i: Int)

    fun method617(i: Int, i_83_: Int, class348_sub42_sub17: Class348_Sub42_Sub17?, i_84_: Int, class348_sub42_sub17_85_: Class348_Sub42_Sub17?, bool: Boolean, bool_86_: Boolean, i_87_: Int, i_88_: Int) {
        try {
            anInt1125++
            if (i != -1) {
                method622()
                if (NA()) {
                    val class4 = (class348_sub42_sub17_85_!!.aClass4Array9673!![i]!!)
                    val class348_sub33 = class4.aClass348_Sub33_134
                    var class4_89_: Class4? = null
                    if (class348_sub42_sub17 != null) {
                        class4_89_ = (class348_sub42_sub17.aClass4Array9673!![i_87_]!!)
                        if (class348_sub33 != class4_89_.aClass348_Sub33_134) class4_89_ = null
                    }
                    method602(i_84_, class348_sub33, 121, bool, i_83_, class4_89_, i_88_, null, null, class4, 65535, bool_86_)
                    wa()
                    method621()
                } else method621()
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ka.BC(" + i + ',' + i_83_ + ',' + (if (class348_sub42_sub17 != null) "{...}" else "null") + ',' + i_84_ + ',' + (if (class348_sub42_sub17_85_ != null) "{...}" else "null") + ',' + bool + ',' + bool_86_ + ',' + i_87_ + ',' + i_88_ + ')'))
        }
    }

    abstract fun r(): Boolean

    abstract fun method618(): Boolean

    abstract fun fa(): Int

    abstract fun a(i: Int)

    abstract fun method619(): Array<Class129?>?

    abstract fun V(): Int

    abstract fun H(i: Int, i_90_: Int, i_91_: Int)

    abstract fun method620(class101: Class101?)

    abstract fun method621()

    abstract fun method622()

    abstract fun k(i: Int)

    abstract fun method623(i: Int, i_92_: Int, class101: Class101?, bool: Boolean, i_93_: Int, i_94_: Int): Boolean

    abstract fun P(i: Int, i_95_: Int, i_96_: Int, i_97_: Int)

    abstract fun WA(): Int

    abstract fun VA(i: Int)

    abstract fun method624(i: Int, i_98_: Int, i_99_: Int, i_100_: Int)

    abstract fun na(): Int

    fun method625(class348_sub42_sub17: Class348_Sub42_Sub17?, i: Int, i_101_: Byte, i_102_: Int, class348_sub42_sub17_103_: Class348_Sub42_Sub17?, i_104_: Int, i_105_: Int, i_106_: Int, class348_sub42_sub17_107_: Class348_Sub42_Sub17?, bool: Boolean, i_108_: Int, class348_sub42_sub17_109_: Class348_Sub42_Sub17?, i_110_: Int, bools: BooleanArray?, i_111_: Int) {
        try {
            anInt1135++
            if (i_104_ != -1) {
                if (i_101_ <= 103) aFloat1136 = 0.38855714f
                if (bools == null || i_105_ == -1) method617(i_104_, i, class348_sub42_sub17, 0, class348_sub42_sub17_107_, false, bool, i_108_, i_106_)
                else {
                    method622()
                    if (NA()) {
                        val class4 = (class348_sub42_sub17_107_!!.aClass4Array9673!![i_104_])
                        val class348_sub33 = class4!!.aClass348_Sub33_134
                        var class4_112_: Class4? = null
                        if (class348_sub42_sub17 != null) {
                            class4_112_ = (class348_sub42_sub17.aClass4Array9673!![i_108_])
                            if (class348_sub33 != class4_112_!!.aClass348_Sub33_134) class4_112_ = null
                        }
                        method602(0, class348_sub33, -70, false, i, class4_112_, i_106_, null, bools, class4, 65535, bool)
                        val class4_113_ = (class348_sub42_sub17_103_!!.aClass4Array9673!![i_105_]!!)
                        var class4_114_: Class4? = null
                        if (class348_sub42_sub17_109_ != null) {
                            class4_114_ = (class348_sub42_sub17_109_.aClass4Array9673!![i_111_])
                            if (class4_114_!!.aClass348_Sub33_134 != class348_sub33) class4_114_ = null
                        }
                        method605(0, IntArray(0), 0, 0, 0, 0, bool)
                        method602(0, class4_113_.aClass348_Sub33_134, 122, true, i_102_, class4_114_, i_110_, null, bools, class4_113_, 65535, bool)
                        wa()
                        method621()
                    } else method621()
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(
                runtimeexception,
                ("ka.VB(" + (if (class348_sub42_sub17 != null) "{...}" else "null") + ',' + i + ',' + i_101_ + ',' + i_102_ + ',' + (if (class348_sub42_sub17_103_ != null) "{...}" else "null") + ',' + i_104_ + ',' + i_105_ + ',' + i_106_ + ',' + (if (class348_sub42_sub17_107_ != null) "{...}" else "null") + ',' + bool + ',' + i_108_ + ',' + (if (class348_sub42_sub17_109_ != null) "{...}" else "null") + ',' + i_110_ + ',' + (if (bools != null) "{...}" else "null") + ',' + i_111_ + ')')
            )
        }
    }

    abstract fun ia(i: Short, i_115_: Short)

    fun method626(i: Int, i_116_: Int, i_117_: Int, i_118_: Int, i_119_: Int, i_120_: Int, i_121_: Int, var_s: s, i_122_: Int) {
        anInt1137++
        val bool = false
        val bool_123_ = false
        val bool_124_ = false
        val i_125_ = -i / 2
        val i_126_ = -i_119_ / 2
        val i_127_ = var_s.method3986(i_118_ + i_125_, i_126_ + i_122_, 10.toByte())
        val i_128_ = i / 2
        val i_129_ = -i_119_ / 2
        val i_130_ = var_s.method3986(i_128_ + i_118_, i_122_ - -i_129_, (-116).toByte())
        val i_131_ = -i / 2
        val i_132_ = i_119_ / 2
        val i_133_ = var_s.method3986(i_118_ + i_131_, i_122_ - -i_132_, (-111).toByte())
        val i_134_ = i / 2
        if (i_116_ != 10947) EA()
        val i_135_ = i_119_ / 2
        val i_136_ = var_s.method3986(i_118_ + i_134_, i_135_ + i_122_, 50.toByte())
        val i_137_ = min(i_130_, i_127_)
        val i_138_ = min(i_136_, i_133_)
        val i_139_ = min(i_136_, i_130_)
        if (i_119_ != 0) {
            var i_140_ = 0x3fff and (atan2((i_137_ - i_138_).toDouble(), i_119_.toDouble()) * 2607.5945876176133).toInt()
            if (i_140_ != 0) {
                if (i_121_ != 0) {
                    if (i_140_ > 8192) {
                        val i_141_ = -i_121_ + 16384
                        if (i_141_ > i_140_) i_140_ = i_141_
                    } else if (i_140_ > i_121_) i_140_ = i_121_
                }
                FA(i_140_)
            }
        }
        val i_142_ = min(i_133_, i_127_)
        if (i != 0) {
            var i_143_ = (0x3fff and (atan2((-i_139_ + i_142_).toDouble(), i.toDouble()) * 2607.5945876176133).toInt())
            if (i_143_ != 0) {
                if (i_117_ != 0) {
                    if (i_143_ > 8192) {
                        val i_144_ = 16384 - i_117_
                        if (i_144_ > i_143_) i_143_ = i_144_
                    } else if (i_117_ < i_143_) i_143_ = i_117_
                }
                VA(i_143_)
            }
        }
        var i_145_ = i_136_ + i_127_
        if (i_133_ + i_130_ < i_145_) i_145_ = i_133_ + i_130_
        i_145_ = (i_145_ shr 1) - i_120_
        if (i_145_ != 0) H(0, i_145_, 0)
    }

    private fun method627(`is`: IntArray, bool: Boolean, i: Int, i_146_: Int, i_147_: Int, i_148_: Int, i_149_: Byte, i_150_: Int, is_151_: IntArray?, i_152_: Int) {
        var i_150_ = i_150_
        var i_152_ = i_152_
        try {
            anInt1132++
            if (i_149_.toInt() == -93) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            if (i_147_ == 0 || i_147_ == 1) {
                                val i_155_ = i_150_
                                i_150_ = -i_152_
                                i_152_ = i_155_
                            } else if (i_147_ == 3) {
                                val i_154_ = i_150_
                                i_150_ = i_152_
                                i_152_ = i_154_
                            } else if (i_147_ == 2) {
                                val i_153_ = i_150_
                                i_150_ = i_152_ and 0x3fff
                                i_152_ = -i_153_ and 0x3fff
                            }
                        }
                    } else if (i_147_ == 0 || i_147_ == 1) {
                        i_150_ = -i_150_
                        i_152_ = -i_152_
                    } else if (i_147_ == 2) {
                        i_152_ = 0x3fff and -i_152_
                        i_150_ = 0x3fff and -i_150_
                    }
                } else if (i_147_ == 0 || i_147_ == 1) {
                    val i_156_ = -i_150_
                    i_150_ = i_152_
                    i_152_ = i_156_
                } else if (i_147_ == 3) {
                    val i_158_ = i_150_
                    i_150_ = i_152_
                    i_152_ = i_158_
                } else if (i_147_ == 2) {
                    val i_157_ = i_150_
                    i_150_ = -i_152_ and 0x3fff
                    i_152_ = i_157_ and 0x3fff
                }
                if (i_148_ == 65535) method605(i_147_, `is`, i_150_, i_146_, i_152_, i, bool)
                else I(i_147_, `is`, i_150_, i_146_, i_152_, bool, i_148_, is_151_)
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ka.PB(" + (if (`is` != null) "{...}" else "null") + ',' + bool + ',' + i + ',' + i_146_ + ',' + i_147_ + ',' + i_148_ + ',' + i_149_ + ',' + i_150_ + ',' + (if (is_151_ != null) "{...}" else "null") + ',' + i_152_ + ')'))
        }
    }

    abstract fun method628(i: Int, i_159_: Int, class101: Class101?, bool: Boolean, i_160_: Int): Boolean

    abstract fun aa(i: Short, i_161_: Short)

    abstract fun ba(var_r: r?): r?

    companion object {
        @JvmField
        var anInt1125: Int = 0
        @JvmField
        var anInt1126: Int = 0
        @JvmField
        var anIntArray1127: IntArray? = IntArray(2)
        @JvmField
        var anInt1128: Int = 0
        @JvmField
        var anInt1129: Int = 0
        @JvmField
        var anInt1130: Int = 0
        @JvmField
        var aClass296_1131: Class296? = null
        @JvmField
        var anInt1132: Int = 0
        @JvmField
        var anInt1133: Int = 0
        @JvmField
        var anInt1134: Int = 0
        @JvmField
        var anInt1135: Int = 0
        @JvmField
        var aFloat1136: Float = 0f
        @JvmField
        var anInt1137: Int = 0

        @JvmStatic
        fun method606(i: Int, bool: Boolean, string: String) {
            var string = string
            anInt1128++
            string = string.lowercase(Locale.getDefault())
            var `is` = ShortArray(16)
            var i_52_ = i
            val i_53_ = if (bool) 32768 else 0
            val i_54_ = ((if (!bool) Class239_Sub6.aClass355_5900!!.anInt4365 else Class239_Sub6.aClass355_5900!!.anInt4364) + i_53_)
            for (i_55_ in i_53_..<i_54_) {
                val class348_sub42_sub10 = Class239_Sub6.aClass355_5900!!.method3471(i_55_, (-102).toByte())
                if (class348_sub42_sub10.aBoolean9562 && class348_sub42_sub10.method3219(98).lowercase(Locale.getDefault()).indexOf(string) != -1) {
                    if (i_52_ >= 50) {
                        Class192.aShortArray2579 = null
                        Class76.anInt1285 = -1
                        return
                    }
                    if (`is`.size <= i_52_) {
                        val is_56_ = ShortArray(`is`.size * 2)
                        var i_57_ = 0
                        while (i_52_ > i_57_) {
                            is_56_[i_57_] = `is`[i_57_]
                            i_57_++
                        }
                        `is` = is_56_
                    }
                    `is`[i_52_++] = i_55_.toShort()
                }
            }
            Class76.anInt1285 = i_52_
            Class148.anInt2037 = 0
            Class192.aShortArray2579 = `is`
            val strings = arrayOfNulls<String>(Class76.anInt1285)
            var i_58_ = 0
            while (Class76.anInt1285 > i_58_) {
                strings[i_58_] = Class239_Sub6.aClass355_5900!!.method3471(`is`[i_58_].toInt(), (-91).toByte()).method3219(Class348_Sub21.method2955(i, 81))
                i_58_++
            }
            Class174.method1333(Class192.aShortArray2579, i + 26073, strings)
        }

        @JvmStatic
        fun method607(i: Int, strings: Array<String?>?, `is`: ShortArray?, i_64_: Int, bool: Boolean) {
            try {
                if (bool != false) aFloat1136 = 0.5791872f
                if (i > i_64_) {
                    val i_65_ = (i_64_ - -i) / 2
                    var i_66_ = i_64_
                    val string = strings!![i_65_]
                    strings[i_65_] = strings[i]
                    strings[i] = string
                    val i_67_ = `is`!![i_65_]
                    `is`[i_65_] = `is`[i]
                    `is`[i] = i_67_
                    for (i_68_ in i_64_..<i) {
                        if (string == null || (strings[i_68_] != null && (strings[i_68_]!!.compareTo(string) < (i_68_ and 0x1)))) {
                            val string_69_ = strings[i_68_]
                            strings[i_68_] = strings[i_66_]
                            strings[i_66_] = string_69_
                            val i_70_ = `is`[i_68_]
                            `is`[i_68_] = `is`[i_66_]
                            `is`[i_66_++] = i_70_
                        }
                    }
                    strings[i] = strings[i_66_]
                    strings[i_66_] = string
                    `is`[i] = `is`[i_66_]
                    `is`[i_66_] = i_67_
                    method607(i_66_ + -1, strings, `is`, i_64_, false)
                    method607(i, strings, `is`, 1 + i_66_, bool)
                }
                anInt1134++
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("ka.UB(" + i + ',' + (if (strings != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_64_ + ',' + bool + ')'))
            }
        }

        @JvmStatic
        fun method609(i: Byte) {
            if (i <= -7) {
                aClass296_1131 = null
                anIntArray1127 = null
            }
        }

        @JvmStatic
        fun method616(i: Int, i_81_: Int, i_82_: Int): Boolean {
            anInt1129++
            if (i != 2) return false
            return (i_81_ and 0x800) != 0
        }
    }
}
