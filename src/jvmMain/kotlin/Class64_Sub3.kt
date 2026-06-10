import Class239_Sub28.Companion.method1846
import Class246.Companion.method1885
import Class286_Sub9.Companion.method2174
import Class299_Sub1.Companion.method2259
import Class314_Sub1.Companion.method2352
import Class348.Companion.method2709
import Class348_Sub16_Sub2.Companion.method2832
import Class348_Sub40_Sub19.Companion.method3100
import Class40.Companion.method371
import Class59_Sub2_Sub1.Companion.method565
import aa_Sub3.Companion.method166
import jaclib.memory.Stream.Companion.floatToRawIntBits
import jaggl.OpenGL.Companion.glColor4ub
import s_Sub2.Companion.method3999
import kotlin.math.sqrt

class Class64_Sub3 : Class64 {
    private var aBoolean5527: Boolean
    private var anIntArray5528: IntArray? = null
    private var anInt5529: Int
    private var anInt5536 = 0
    private var anInt5537 = 0
    private var anIntArrayArray5539: Array<IntArray?>? = null
    private var aShort5540: Short = 0
    private var aClass342Array5541: Array<Class342?>? = null
    private var aByteArray5542: ByteArray? = null
    private var anIntArray5543: IntArray? = null
    private var aShort5544: Short = 0
    private var aFloatArray5552: FloatArray? = null
    private var anIntArrayArray5553: Array<IntArray?>? = null
    private var anInterface2_5554: Interface2? = null
    private var aBoolean5555 = true
    private var anInt5556 = 0
    private var anInt5557: Int
    private var aShort5559: Short = 0
    private var aClass123_5563: Class123? = null
    private var aShortArray5564: ShortArray? = null
    private var aShortArray5566: ShortArray? = null
    private var aFloatArray5571: FloatArray? = null
    private var aClass139_5572: Class139? = null
    private var aShortArray5573: ShortArray? = null
    private var aClass270_5575: Class270? = null
    private var aShortArray5576: ShortArray? = null
    private var aShortArray5579: ShortArray? = null
    private var aShortArray5580: ShortArray? = null
    private var aByte5581: Byte = 0
    private var aShortArray5583: ShortArray? = null
    private var aShort5586: Short = 0
    private var aShort5591: Short = 0
    private var aShortArray5592: ShortArray? = null
    private var anIntArray5593: IntArray? = null
    private var aByteArray5594: ByteArray? = null
    private var aBoolean5595 = false
    private var aClass48Array5596: Array<Class48?>? = null
    private val aHa_Sub2_5598: ha_Sub2?
    private var aShortArray5601: ShortArray? = null
    private var aClass123_5605: Class123? = null
    private var aShortArray5608: ShortArray? = null
    private var aClass123_5610: Class123? = null
    private var aShort5617: Short = 0
    private var aClass123_5620: Class123? = null
    private var aClass118Array5621: Array<Class118?>? = null
    private var anIntArray5626: IntArray? = null
    private var anIntArrayArray5627: Array<IntArray?>? = null
    private var aShort5629: Short = 0
    private var anInt5632: Int
    private var aShort5634: Short = 0
    private var aBoolean5638: Boolean
    private var aClass129Array5640: Array<Class129?>? = null
    private var anInt5642: Int
    private var anIntArray5644: IntArray? = null
    private var aShort5645: Short = 0
    private var aShort5646: Short = 0
    private var anInterface8_5647: Interface8? = null
    private var anInt5648 = 0
    private var aShortArray5649: ShortArray? = null
    public override fun FA(i: Int) {
        anInt5650++
        val i_0_ = Class70.anIntArray1207!![i]
        val i_1_ = Class70.anIntArray1204!![i]
        for (i_2_ in 0..<anInt5557) {
            val i_3_ = (-(i_0_ * anIntArray5644!![i_2_]) + anIntArray5593!![i_2_] * i_1_ shr 14)
            anIntArray5644!![i_2_] = (anIntArray5593!![i_2_] * i_0_ - -(anIntArray5644!![i_2_] * i_1_) shr 14)
            anIntArray5593!![i_2_] = i_3_
        }
        if (aClass123_5605 != null) aClass123_5605!!.anInterface2_1811 = null
        aBoolean5527 = false
    }

    public override fun method614(i: Byte, i_4_: Int, bool: Boolean): Class64 {
        anInt5615++
        val class64_sub3_5_: Class64_Sub3?
        val class64_sub3_6_: Class64_Sub3?
        if (i.toInt() == 1) {
            class64_sub3_6_ = aHa_Sub2_5598!!.aClass64_Sub3_7864
            class64_sub3_5_ = aHa_Sub2_5598.aClass64_Sub3_7780
        } else if (i.toInt() == 2) {
            class64_sub3_5_ = aHa_Sub2_5598!!.aClass64_Sub3_7802
            class64_sub3_6_ = aHa_Sub2_5598.aClass64_Sub3_7838
        } else if (i.toInt() == 3) {
            class64_sub3_6_ = aHa_Sub2_5598!!.aClass64_Sub3_7803
            class64_sub3_5_ = aHa_Sub2_5598.aClass64_Sub3_7821
        } else if (i.toInt() == 4) {
            class64_sub3_6_ = aHa_Sub2_5598!!.aClass64_Sub3_7834
            class64_sub3_5_ = aHa_Sub2_5598.aClass64_Sub3_7844
        } else if (i.toInt() == 5) {
            class64_sub3_6_ = aHa_Sub2_5598!!.aClass64_Sub3_7840
            class64_sub3_5_ = aHa_Sub2_5598.aClass64_Sub3_7785
        } else {
            class64_sub3_5_ = Class64_Sub3(aHa_Sub2_5598)
            class64_sub3_6_ = class64_sub3_5_
        }
        return method686(class64_sub3_6_, i_4_, 0, bool, class64_sub3_5_, i.toInt() != 0)
    }

    private fun method677(i: Byte) {
        anInt5619++
        if (anInt5537 != 0 && i > 125) {
            if (aByte5581.toInt() != 0) method688(5, true)
            method688(5, false)
            if (aClass270_5575 != null) {
                if (aClass270_5575!!.anInterface8_3463 == null) method678((aByte5581.toInt() and 0x10) != 0, 27.toByte())
                if (aClass270_5575!!.anInterface8_3463 != null) {
                    aHa_Sub2_5598!!.method3728(aClass123_5563 != null, 118)
                    aHa_Sub2_5598.method3794(aClass123_5605, aClass123_5610, -26411, aClass123_5620, aClass123_5563)
                    val i_7_ = -1 + anIntArray5626!!.size
                    var i_8_ = 0
                    while (i_7_ > i_8_) {
                        val i_9_ = anIntArray5626!![i_8_]
                        val i_10_ = anIntArray5626!![i_8_ + 1]
                        var i_11_ = aShortArray5601!![i_9_].toInt() and 0xffff
                        if (i_11_ == 65535) i_11_ = -1
                        aHa_Sub2_5598.method3801(aClass123_5563 != null, i_11_, 125)
                        aHa_Sub2_5598.method3759((-i_9_ + i_10_) * 3, -128, 4, (aClass270_5575!!.anInterface8_3463), i_9_ * 3)
                        i_8_++
                    }
                }
            }
            method691(110.toByte())
        }
    }

    private fun method678(bool: Boolean, i: Byte) {
        if (6 * anInt5537 > (aHa_Sub2_5598!!.aClass348_Sub49_Sub1_7798!!.aByteArray7154)!!.size) aHa_Sub2_5598.aClass348_Sub49_Sub1_7798 = Class348_Sub49_Sub1(6 * (anInt5537 - -100))
        else aHa_Sub2_5598.aClass348_Sub49_Sub1_7798!!.anInt7197 = 0
        anInt5630++
        if (i.toInt() != 27) WA()
        val class348_sub49_sub1: Class348_Sub49_Sub1 = aHa_Sub2_5598.aClass348_Sub49_Sub1_7798!!
        if (aHa_Sub2_5598.aBoolean7775) {
            for (i_12_ in 0..<anInt5537) {
                class348_sub49_sub1.writeShort(107.toByte(), aShortArray5592!![i_12_].toInt())
                class348_sub49_sub1.writeShort(107.toByte(), aShortArray5579!![i_12_].toInt())
                class348_sub49_sub1.writeShort(107.toByte(), aShortArray5566!![i_12_].toInt())
            }
        } else {
            for (i_13_ in 0..<anInt5537) {
                class348_sub49_sub1.method3397(122, aShortArray5592!![i_13_].toInt())
                class348_sub49_sub1.method3397(67, aShortArray5579!![i_13_].toInt())
                class348_sub49_sub1.method3397(31, aShortArray5566!![i_13_].toInt())
            }
        }
        if (class348_sub49_sub1.anInt7197 != 0) {
            if (bool) {
                if (anInterface8_5647 == null) anInterface8_5647 = aHa_Sub2_5598.method3733(5123, -39, (class348_sub49_sub1.anInt7197), (class348_sub49_sub1.aByteArray7154), true)
                else anInterface8_5647!!.method35(class348_sub49_sub1.aByteArray7154, 5123, i.toInt() xor 0x23, class348_sub49_sub1.anInt7197)
                aClass270_5575!!.anInterface8_3463 = anInterface8_5647
            } else aClass270_5575!!.anInterface8_3463 = (aHa_Sub2_5598.method3733(5123, i + -65, class348_sub49_sub1.anInt7197, class348_sub49_sub1.aByteArray7154, false))
            if (!bool) aBoolean5555 = true
        }
    }

    public override fun method628(i: Int, i_14_: Int, class101: Class101?, bool: Boolean, i_15_: Int): Boolean {
        try {
            anInt5533++
            return method684(bool, 1566382404, -1, i_14_, i_15_, i, class101)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("paa.MA(" + i + ',' + i_14_ + ',' + (if (class101 != null) "{...}" else "null") + ',' + bool + ',' + i_15_ + ')'))
        }
    }

    private fun method679(i: Int, i_16_: Int, i_17_: Int, i_18_: Int, i_19_: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Int): Boolean {
        anInt5651++
        if (i_20_ > i && i < i_18_ && i_23_ > i) return false
        if (i > i_20_ && i_18_ < i && i > i_23_) return false
        if (i_22_ < i_19_ && i_16_ > i_22_ && i_17_ > i_22_) return false
        val i_24_ = -65 / ((i_21_ - 57) / 62)
        return i_19_ >= i_22_ || i_22_ <= i_16_ || i_17_ >= i_22_
    }

    public override fun VA(i: Int) {
        anInt5561++
        val i_25_ = Class70.anIntArray1207!![i]
        val i_26_ = Class70.anIntArray1204!![i]
        var i_27_ = 0
        while (anInt5557 > i_27_) {
            val i_28_ = ((anIntArray5543!![i_27_] * i_26_ + i_25_ * anIntArray5593!![i_27_]) shr 14)
            anIntArray5593!![i_27_] = (-(i_25_ * anIntArray5543!![i_27_]) + anIntArray5593!![i_27_] * i_26_) shr 14
            anIntArray5543!![i_27_] = i_28_
            i_27_++
        }
        if (aClass123_5605 != null) aClass123_5605!!.anInterface2_1811 = null
        aBoolean5527 = false
    }

    private fun method680(i: Int, i_29_: Int, i_30_: Byte, i_31_: Short, i_32_: Int): Int {
        if (i != 19995) return -13
        anInt5582++
        var i_33_ = (Class10.anIntArray179!![Class184.method1384(i_32_, i xor 0x54b313bc, i_29_)])
        if (i_31_.toInt() != -1) {
            val class12 = aHa_Sub2_5598!!.aD4579!!.method3(i_31_.toInt() and 0xffff, -6662)
            val i_34_ = 0xff and class12!!.aByte201.toInt()
            if (i_34_ != 0) {
                val i_35_: Int
                if (i_29_ >= 0) {
                    if (i_29_ > 127) i_35_ = 16777215
                    else i_35_ = 131586 * i_29_
                } else i_35_ = 0
                if (i_34_ != 256) {
                    val i_36_ = i_34_
                    val i_37_ = -i_34_ + 256
                    i_33_ = ((((i_35_ and 0xff00ff) * i_36_ - -(i_37_ * (0xff00ff and i_33_)) and 0xff00ff.inv()) - -(0xff0000 and ((0xff00 and i_35_) * i_36_ + (i_33_ and 0xff00) * i_37_))) shr 8)
                } else i_33_ = i_35_
            }
            var i_38_ = 0xff and class12.aByte216.toInt()
            if (i_38_ != 0) {
                i_38_ += 256
                var i_39_ = ((0xff0000 and i_33_) shr 16) * i_38_
                if (i_39_ > 65535) i_39_ = 65535
                var i_40_ = i_38_ * (i_33_ shr 8 and 0xff)
                if (i_40_ > 65535) i_40_ = 65535
                var i_41_ = (0xff and i_33_) * i_38_
                if (i_41_ > 65535) i_41_ = 65535
                i_33_ = (i_41_ shr 8) + (((0x5bff00ff.inv() and i_39_) shl 8) - -(0xff00 and i_40_))
            }
        }
        return (i_33_ shl 8) - (i_30_.toInt() and 0xff) - -255
    }

    public override fun method618(): Boolean {
        anInt5551++
        if (aShortArray5601 == null) return true
        for (i in aShortArray5601!!.indices) {
            if (aShortArray5601!![i].toInt() != -1 && !aHa_Sub2_5598!!.aD4579!!.method4(-7953, aShortArray5601!![i].toInt())) return false
        }
        return true
    }

    public override fun method613(class64: Class64?, i: Int, i_42_: Int, i_43_: Int, bool: Boolean) {
        try {
            anInt5589++
            val class64_sub3_44_ = class64 as Class64_Sub3
            if (anInt5632 != 0 && class64_sub3_44_.anInt5632 != 0) {
                val i_45_ = class64_sub3_44_.anInt5557
                val `is` = class64_sub3_44_.anIntArray5543
                val is_46_ = class64_sub3_44_.anIntArray5593
                val is_47_ = class64_sub3_44_.anIntArray5644
                val is_48_ = class64_sub3_44_.aShortArray5564
                val is_49_ = class64_sub3_44_.aShortArray5583
                val is_50_ = class64_sub3_44_.aShortArray5576
                val is_51_ = class64_sub3_44_.aByteArray5594
                var is_52_: ShortArray?
                var is_53_: ShortArray?
                var is_54_: ByteArray?
                var is_55_: ShortArray?
                if (aClass139_5572 == null) {
                    is_52_ = null
                    is_53_ = null
                    is_54_ = null
                    is_55_ = null
                } else {
                    is_55_ = aClass139_5572!!.aShortArray1954
                    is_54_ = aClass139_5572!!.aByteArray1948
                    is_53_ = aClass139_5572!!.aShortArray1951
                    is_52_ = aClass139_5572!!.aShortArray1953
                }
                var is_56_: ByteArray?
                var is_57_: ShortArray?
                var is_58_: ShortArray?
                var is_59_: ShortArray?
                if (class64_sub3_44_.aClass139_5572 == null) {
                    is_56_ = null
                    is_57_ = null
                    is_58_ = null
                    is_59_ = null
                } else {
                    is_59_ = (class64_sub3_44_.aClass139_5572!!.aShortArray1953)
                    is_56_ = (class64_sub3_44_.aClass139_5572!!.aByteArray1948)
                    is_58_ = (class64_sub3_44_.aClass139_5572!!.aShortArray1954)
                    is_57_ = (class64_sub3_44_.aClass139_5572!!.aShortArray1951)
                }
                val is_60_ = class64_sub3_44_.anIntArray5528
                val is_61_ = class64_sub3_44_.aShortArray5649
                if (!class64_sub3_44_.aBoolean5527) class64_sub3_44_.method692((-123).toByte())
                val i_62_ = class64_sub3_44_.aShort5591.toInt()
                val i_63_ = class64_sub3_44_.aShort5629.toInt()
                val i_64_ = class64_sub3_44_.aShort5540.toInt()
                val i_65_ = class64_sub3_44_.aShort5586.toInt()
                val i_66_ = class64_sub3_44_.aShort5617.toInt()
                val i_67_ = class64_sub3_44_.aShort5646.toInt()
                for (i_68_ in 0..<anInt5557) {
                    val i_69_ = -i_42_ + anIntArray5593!![i_68_]
                    if (i_62_ <= i_69_ && i_69_ <= i_63_) {
                        val i_70_ = -i + anIntArray5543!![i_68_]
                        if (i_70_ >= i_64_ && i_70_ <= i_65_) {
                            val i_71_ = anIntArray5644!![i_68_] + -i_43_
                            if (i_66_ <= i_71_ && i_71_ <= i_67_) {
                                var i_72_ = -1
                                var i_73_ = anIntArray5528!![i_68_]
                                var i_74_ = anIntArray5528!![i_68_ + 1]
                                var i_75_ = i_73_
                                while ((i_74_ > i_75_)) {
                                    i_72_ = aShortArray5649!![i_75_] - 1
                                    if (i_72_ == -1 || aByteArray5594!![i_72_].toInt() != 0) break
                                    i_75_++
                                }
                                if (i_72_ != -1) {
                                    var i_76_ = 0
                                    while ((i_76_ < i_45_)) {
                                        if (`is`!![i_76_] == i_70_ && i_71_ == is_47_!![i_76_] && is_46_!![i_76_] == i_69_) {
                                            i_74_ = is_60_!![i_76_ - -1]
                                            var i_77_ = -1
                                            i_73_ = is_60_[i_76_]
                                            var i_78_ = i_73_
                                            while (i_74_ > i_78_) {
                                                i_77_ = -1 + is_61_!![i_78_]
                                                if (i_77_ == -1 || is_51_!![i_77_].toInt() != 0) break
                                                i_78_++
                                            }
                                            if (i_77_ != -1) {
                                                if (is_55_ == null) {
                                                    aClass139_5572 = Class139()
                                                    aClass139_5572!!.aShortArray1954 = (Class50_Sub3.method470(aShortArray5564, (-120).toByte()))
                                                    is_55_ = aClass139_5572!!.aShortArray1954
                                                    aClass139_5572!!.aShortArray1951 = (Class50_Sub3.method470(aShortArray5583, (-109).toByte()))
                                                    is_53_ = aClass139_5572!!.aShortArray1951
                                                    aClass139_5572!!.aShortArray1953 = (Class50_Sub3.method470(aShortArray5576, (-107).toByte()))
                                                    is_52_ = aClass139_5572!!.aShortArray1953
                                                    aClass139_5572!!.aByteArray1948 = (Class309.method2309(-37, aByteArray5594))
                                                    is_54_ = aClass139_5572!!.aByteArray1948
                                                }
                                                if (is_58_ == null) {
                                                    val class139 = (Class139().also { class64_sub3_44_.aClass139_5572 = it })
                                                    class139.aShortArray1954 = (Class50_Sub3.method470(is_48_, (-127).toByte()))
                                                    is_58_ = class139.aShortArray1954
                                                    class139.aShortArray1951 = (Class50_Sub3.method470(is_49_, (-111).toByte()))
                                                    is_57_ = class139.aShortArray1951
                                                    class139.aShortArray1953 = (Class50_Sub3.method470(is_50_, (-120).toByte()))
                                                    is_59_ = class139.aShortArray1953
                                                    class139.aByteArray1948 = (Class309.method2309(-91, is_51_))
                                                    is_56_ = class139.aByteArray1948
                                                }
                                                var i_79_ = aShortArray5564!![i_72_]
                                                var i_80_ = aShortArray5583!![i_72_]
                                                var i_81_ = aShortArray5576!![i_72_]
                                                var i_82_ = aByteArray5594!![i_72_]
                                                i_73_ = is_60_[i_76_]
                                                i_74_ = is_60_[i_76_ - -1]
                                                var i_83_ = i_73_
                                                while ((i_74_ > i_83_)) {
                                                    val i_84_ = -1 + is_61_!![i_83_]
                                                    if (i_84_ == -1) break
                                                    if (is_56_!![i_84_].toInt() != 0) {
                                                        is_58_!![i_84_] = (is_58_!![i_84_] + i_79_).toShort()
                                                        is_57_!![i_84_] = (is_57_[i_84_] + i_80_).toShort()
                                                        is_59_!![i_84_] = (is_59_[i_84_] + i_81_).toShort()
                                                        is_56_[i_84_] = (is_56_[i_84_] + i_82_).toByte()
                                                    }
                                                    i_83_++
                                                }
                                                i_80_ = is_49_!![i_77_]
                                                i_81_ = is_50_!![i_77_]
                                                i_82_ = is_51_!![i_77_]
                                                i_73_ = anIntArray5528!![i_68_]
                                                i_74_ = (anIntArray5528!![1 + i_68_])
                                                i_79_ = is_48_!![i_77_]
                                                var i_85_ = i_73_
                                                while ((i_85_ < i_74_)) {
                                                    val i_86_ = ((aShortArray5649!![i_85_]) + -1)
                                                    if (i_86_ == -1) break
                                                    if (is_54_!![i_86_].toInt() != 0) {
                                                        is_55_!![i_86_] = (is_55_!![i_86_] + i_79_).toShort()
                                                        is_53_!![i_86_] = (is_53_[i_86_] + i_80_).toShort()
                                                        is_52_!![i_86_] = (is_52_[i_86_] + i_81_).toShort()
                                                        is_54_[i_86_] = (is_54_[i_86_] + i_82_).toByte()
                                                    }
                                                    i_85_++
                                                }
                                                if (aClass123_5563 == null && aClass123_5610 != null) aClass123_5610!!.anInterface2_1811 = null
                                                if (aClass123_5563 != null) aClass123_5563!!.anInterface2_1811 = null
                                                if ((class64_sub3_44_.aClass123_5563) == null && ((class64_sub3_44_.aClass123_5610) != null)) class64_sub3_44_.aClass123_5610!!.anInterface2_1811 = null
                                                if ((class64_sub3_44_.aClass123_5563) != null) class64_sub3_44_.aClass123_5563!!.anInterface2_1811 = null
                                            }
                                        }
                                        i_76_++
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("paa.PA(" + (if (class64 != null) "{...}" else "null") + ',' + i + ',' + i_42_ + ',' + i_43_ + ',' + bool + ')'))
        }
    }

    public override fun method623(i: Int, i_87_: Int, class101: Class101?, bool: Boolean, i_88_: Int, i_89_: Int): Boolean {
        try {
            anInt5633++
            return method684(bool, 1566382404, i_89_, i_87_, i_88_, i, class101)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("paa.OA(" + i + ',' + i_87_ + ',' + (if (class101 != null) "{...}" else "null") + ',' + bool + ',' + i_88_ + ',' + i_89_ + ')'))
        }
    }

    private fun method682(bool: Boolean) {
        if (aClass118Array5621 != null) {
            val class101_sub3 = aHa_Sub2_5598!!.aClass101_Sub3_7729
            aHa_Sub2_5598.method3788(-18516)
            aHa_Sub2_5598.C(!aBoolean5595)
            aHa_Sub2_5598.method3728(false, 35)
            aHa_Sub2_5598.method3794(aHa_Sub2_5598.aClass123_7849, null, -26411, aHa_Sub2_5598.aClass123_7833, null)
            for (i in 0..<anInt5536) {
                val class118 = aClass118Array5621!![i]!!
                val class48 = aClass48Array5596!![i]!!
                if (!class118.aBoolean1791 || !aHa_Sub2_5598.method3666()) {
                    val f = (((anIntArray5543!![class118.anInt1782]) + ((anIntArray5543!![class118.anInt1788]) + (anIntArray5543!![class118.anInt1781]))).toFloat() * 0.3333333f)
                    val f_90_ = (((anIntArray5593!![class118.anInt1788]) + ((anIntArray5593!![class118.anInt1781]) + (anIntArray5593!![class118.anInt1782]))).toFloat() * 0.3333333f)
                    val f_91_ = (((anIntArray5644!![class118.anInt1788]) + (anIntArray5644!![class118.anInt1781]) + (anIntArray5644!![class118.anInt1782])).toFloat() * 0.3333333f)
                    val f_92_ = (Class190.aFloat2555 + (f_91_ * Class313.aFloat3935 + (f_90_ * Class299_Sub1_Sub1.aFloat8696 + Class167.aFloat2203 * f)))
                    val f_93_ = (Class156.aFloat2111 + (Class215.aFloat2836 * f_91_ + (f_90_ * Class252.aFloat3242 + Class314.aFloat3943 * f)))
                    val f_94_ = (f * Class318_Sub9_Sub1.aFloat8784 + f_90_ * Class320.aFloat3994 + f_91_ * Class286_Sub8.aFloat6304 + Class49.aFloat4720)
                    val f_95_ = ((1.0 / sqrt((f_94_ * f_94_ + (f_93_ * f_93_ + (f_92_ * f_92_))).toDouble())).toFloat() * class118.anInt1784.toFloat())
                    class101_sub3!!.method939(-f_94_ + f_94_ * f_95_, (class118.aShort1785 * class48.anInt856) shr 7, (-(f_92_ * f_95_) + (f_92_ + class48.anInt854.toFloat())), (class118.aShort1790 * class48.anInt857) shr 7, class48.anInt853, 90, (f_95_ * f_93_ + (-f_93_ + class48.anInt847.toFloat())))
                    aHa_Sub2_5598.method3766(55.toByte(), class101_sub3)
                    val i_96_ = class48.anInt858
                    glColor4ub((i_96_ shr 16).toByte(), (i_96_ shr 8).toByte(), i_96_.toByte(), (i_96_ shr 24).toByte())
                    aHa_Sub2_5598.method3757(class118.aShort1787.toInt(), -77)
                    aHa_Sub2_5598.method3753(class118.aByte1789.toInt(), 1)
                    aHa_Sub2_5598.method3756(4, 7, 0, 93)
                }
            }
            aHa_Sub2_5598.C(true)
            aHa_Sub2_5598.method3734(true)
        }
        if (bool != true) aShort5540 = 69.toShort()
        anInt5549++
    }

    private fun method683(i: Int, i_97_: Int, l: Long, i_98_: Int, class124: Class124?, i_99_: Int, f: Float, i_100_: Int, i_101_: Int, f_102_: Float): Short {
        try {
            anInt5599++
            val i_103_ = anIntArray5528!![i_101_]
            val i_104_ = anIntArray5528!![1 + i_101_]
            var i_105_ = i_100_
            var i_106_ = i_103_
            while (i_104_ > i_106_) {
                val i_107_ = aShortArray5649!![i_106_]
                if (i_107_.toInt() == 0) {
                    i_105_ = i_106_
                    break
                }
                if (l == Class258_Sub2.aLongArray8530!![i_106_]) return (i_107_ - 1).toShort()
                i_106_++
            }
            aShortArray5649!![i_105_] = (anInt5529 + 1).toShort()
            Class258_Sub2.aLongArray8530!![i_105_] = l
            aShortArray5564!![anInt5529] = i_98_.toShort()
            aShortArray5583!![anInt5529] = i.toShort()
            aShortArray5576!![anInt5529] = i_97_.toShort()
            aByteArray5594!![anInt5529] = i_99_.toByte()
            aFloatArray5552!![anInt5529] = f
            aFloatArray5571!![anInt5529] = f_102_
            return (anInt5529++).toShort()
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("paa.R(" + i + ',' + i_97_ + ',' + l + ',' + i_98_ + ',' + (if (class124 != null) "{...}" else "null") + ',' + i_99_ + ',' + f + ',' + i_100_ + ',' + i_101_ + ',' + f_102_ + ')'))
        }
    }

    public override fun EA(): Int {
        anInt5637++
        if (!aBoolean5527) method692((-123).toByte())
        return aShort5629.toInt()
    }

    private fun method684(bool: Boolean, i: Int, i_108_: Int, i_109_: Int, i_110_: Int, i_111_: Int, class101: Class101?): Boolean {
        try {
            anInt5641++
            val class101_sub3 = class101 as Class101_Sub3
            val class101_sub3_112_ = aHa_Sub2_5598!!.aClass101_Sub3_7760
            val f = (class101_sub3_112_.aFloat5747 + ((class101_sub3.aFloat5751 * class101_sub3_112_.aFloat5781) + ((class101_sub3_112_.aFloat5770 * class101_sub3.aFloat5747) + (class101_sub3.aFloat5772 * (class101_sub3_112_.aFloat5750)))))
            val f_113_ = (class101_sub3_112_.aFloat5772 + ((class101_sub3.aFloat5751 * class101_sub3_112_.aFloat5762) + ((class101_sub3.aFloat5747 * class101_sub3_112_.aFloat5761) + (class101_sub3.aFloat5772 * (class101_sub3_112_.aFloat5769)))))
            Class299_Sub1_Sub1.aFloat8696 = ((class101_sub3_112_.aFloat5781 * class101_sub3.aFloat5754) + ((class101_sub3.aFloat5769 * class101_sub3_112_.aFloat5750) + (class101_sub3_112_.aFloat5770 * class101_sub3.aFloat5750)))
            Class215.aFloat2836 = ((class101_sub3.aFloat5781 * class101_sub3_112_.aFloat5761) + (class101_sub3_112_.aFloat5769 * class101_sub3.aFloat5762) + (class101_sub3_112_.aFloat5762 * class101_sub3.aFloat5784))
            Class318_Sub9_Sub1.aFloat8784 = ((class101_sub3_112_.aFloat5754 * class101_sub3.aFloat5761) + (class101_sub3.aFloat5770 * class101_sub3_112_.aFloat5756) + (class101_sub3.aFloat5756 * class101_sub3_112_.aFloat5784))
            Class286_Sub8.aFloat6304 = ((class101_sub3.aFloat5781 * class101_sub3_112_.aFloat5756) + (class101_sub3.aFloat5762 * class101_sub3_112_.aFloat5754) + (class101_sub3_112_.aFloat5784 * class101_sub3.aFloat5784))
            val f_114_ = ((class101_sub3_112_.aFloat5756 * class101_sub3.aFloat5747) + (class101_sub3_112_.aFloat5754 * class101_sub3.aFloat5772) + (class101_sub3.aFloat5751 * class101_sub3_112_.aFloat5784) + class101_sub3_112_.aFloat5751)
            Class252.aFloat3242 = ((class101_sub3_112_.aFloat5761 * class101_sub3.aFloat5750) + (class101_sub3_112_.aFloat5769 * class101_sub3.aFloat5769) + (class101_sub3_112_.aFloat5762 * class101_sub3.aFloat5754))
            Class314.aFloat3943 = ((class101_sub3.aFloat5756 * class101_sub3_112_.aFloat5762) + ((class101_sub3.aFloat5761 * class101_sub3_112_.aFloat5769) + (class101_sub3_112_.aFloat5761 * class101_sub3.aFloat5770)))
            Class313.aFloat3935 = ((class101_sub3_112_.aFloat5750 * class101_sub3.aFloat5762) + (class101_sub3_112_.aFloat5770 * class101_sub3.aFloat5781) + (class101_sub3.aFloat5784 * class101_sub3_112_.aFloat5781))
            Class167.aFloat2203 = ((class101_sub3.aFloat5756 * class101_sub3_112_.aFloat5781) + ((class101_sub3.aFloat5770 * class101_sub3_112_.aFloat5770) + (class101_sub3.aFloat5761 * class101_sub3_112_.aFloat5750)))
            Class320.aFloat3994 = ((class101_sub3_112_.aFloat5784 * class101_sub3.aFloat5754) + ((class101_sub3.aFloat5769 * class101_sub3_112_.aFloat5754) + (class101_sub3.aFloat5750 * class101_sub3_112_.aFloat5756)))
            var bool_115_ = false
            var f_116_ = 3.4028235E38f
            var f_117_ = -3.4028235E38f
            var f_118_ = 3.4028235E38f
            var f_119_ = -3.4028235E38f
            val i_120_ = aHa_Sub2_5598.anInt7771
            val i_121_ = aHa_Sub2_5598.anInt7794
            if (!aBoolean5527) method692((-123).toByte())
            val i_122_ = -aShort5540 + aShort5586 shr 1
            val i_123_ = aShort5629 + -aShort5591 shr 1
            val i_124_ = aShort5646 + -aShort5617 shr 1
            val i_125_ = aShort5540 + i_122_
            val i_126_ = aShort5591 - -i_123_
            val i_127_ = i_124_ + aShort5617
            val i_128_ = -(i_122_ shl i_110_) + i_125_
            val i_129_ = i_126_ + -(i_123_ shl i_110_)
            val i_130_ = i_127_ - (i_124_ shl i_110_)
            val i_131_ = i_125_ + (i_122_ shl i_110_)
            val i_132_ = (i_123_ shl i_110_) + i_126_
            val i_133_ = (i_124_ shl i_110_) + i_127_
            Class318_Sub2.anIntArray6393!![0] = i_128_
            IOException_Sub1.anIntArray91!![0] = i_129_
            Class318_Sub2.anIntArray6393!![1] = i_131_
            Class244.anIntArray4623!![0] = i_130_
            IOException_Sub1.anIntArray91!![1] = i_129_
            Class318_Sub2.anIntArray6393!![2] = i_128_
            if (i != 1566382404) method621()
            Class244.anIntArray4623!![1] = i_130_
            IOException_Sub1.anIntArray91!![2] = i_132_
            Class244.anIntArray4623!![2] = i_130_
            Class318_Sub2.anIntArray6393!![3] = i_131_
            IOException_Sub1.anIntArray91!![3] = i_132_
            Class318_Sub2.anIntArray6393!![4] = i_128_
            Class244.anIntArray4623!![3] = i_130_
            IOException_Sub1.anIntArray91!![4] = i_129_
            Class244.anIntArray4623!![4] = i_133_
            Class318_Sub2.anIntArray6393!![5] = i_131_
            IOException_Sub1.anIntArray91!![5] = i_129_
            Class244.anIntArray4623!![5] = i_133_
            Class318_Sub2.anIntArray6393!![6] = i_128_
            IOException_Sub1.anIntArray91!![6] = i_132_
            Class318_Sub2.anIntArray6393!![7] = i_131_
            Class244.anIntArray4623!![6] = i_133_
            IOException_Sub1.anIntArray91!![7] = i_132_
            Class244.anIntArray4623!![7] = i_133_
            for (i_134_ in 0..7) {
                val f_135_ = Class244.anIntArray4623!![i_134_].toFloat()
                val f_136_ = IOException_Sub1.anIntArray91!![i_134_].toFloat()
                val f_137_ = Class318_Sub2.anIntArray6393!![i_134_].toFloat()
                var f_138_ = (Class286_Sub8.aFloat6304 * f_135_ + (f_137_ * Class318_Sub9_Sub1.aFloat8784 + Class320.aFloat3994 * f_136_) + f_114_)
                val f_139_ = f_113_ + (Class314.aFloat3943 * f_137_ + Class252.aFloat3242 * f_136_ + Class215.aFloat2836 * f_135_)
                val f_140_ = f + (Class299_Sub1_Sub1.aFloat8696 * f_136_ + f_137_ * Class167.aFloat2203 + Class313.aFloat3935 * f_135_)
                if (aHa_Sub2_5598.anInt7826.toFloat() <= f_138_) {
                    if (i_108_ > 0) f_138_ = i_108_.toFloat()
                    val f_141_ = (f_140_ * i_120_.toFloat() / f_138_ + aHa_Sub2_5598.anInt7853.toFloat())
                    if (f_141_ < f_116_) f_116_ = f_141_
                    if (f_141_ > f_117_) f_117_ = f_141_
                    val f_142_ = (f_139_ * i_121_.toFloat() / f_138_ + aHa_Sub2_5598.anInt7810.toFloat())
                    if (f_142_ > f_119_) f_119_ = f_142_
                    bool_115_ = true
                    if (f_142_ < f_118_) f_118_ = f_142_
                }
            }
            if (bool_115_ && i_111_.toFloat() > f_116_ && i_111_.toFloat() < f_117_ && i_109_.toFloat() > f_118_ && i_109_.toFloat() < f_119_) {
                if (bool) return true
                if (anInt5529 > aHa_Sub2_5598.anIntArray7880!!.size) {
                    aHa_Sub2_5598.anIntArray7883 = IntArray(anInt5529)
                    aHa_Sub2_5598.anIntArray7880 = IntArray(anInt5529)
                }
                val `is`: IntArray = aHa_Sub2_5598.anIntArray7880!!
                val is_143_ = aHa_Sub2_5598.anIntArray7883
                for (i_144_ in 0..<anInt5557) {
                    val f_145_ = anIntArray5543!![i_144_].toFloat()
                    val f_146_ = anIntArray5644!![i_144_].toFloat()
                    val f_147_ = anIntArray5593!![i_144_].toFloat()
                    var f_148_ = f_114_ + (f_146_ * Class286_Sub8.aFloat6304 + (Class318_Sub9_Sub1.aFloat8784 * f_145_ + f_147_ * Class320.aFloat3994))
                    val f_149_ = f + (f_147_ * Class299_Sub1_Sub1.aFloat8696 + f_145_ * Class167.aFloat2203 + Class313.aFloat3935 * f_146_)
                    val f_150_ = f_113_ + (Class252.aFloat3242 * f_147_ + f_145_ * Class314.aFloat3943 + f_146_ * Class215.aFloat2836)
                    if (f_148_ >= aHa_Sub2_5598.anInt7826.toFloat()) {
                        if (i_108_ > 0) f_148_ = i_108_.toFloat()
                        val i_155_ = ((aHa_Sub2_5598.anInt7853).toFloat() + f_149_ * i_120_.toFloat() / f_148_).toInt()
                        val i_156_ = ((aHa_Sub2_5598.anInt7810).toFloat() + i_121_.toFloat() * f_150_ / f_148_).toInt()
                        val i_157_ = anIntArray5528!![i_144_]
                        val i_158_ = anIntArray5528!![1 + i_144_]
                        for (i_159_ in i_157_..<i_158_) {
                            val i_160_ = -1 + aShortArray5649!![i_159_]
                            if (i_160_ == -1) break
                            `is`[i_160_] = i_155_
                            is_143_!![i_160_] = i_156_
                        }
                    } else {
                        val i_151_ = anIntArray5528!![i_144_]
                        val i_152_ = anIntArray5528!![1 + i_144_]
                        var i_153_ = i_151_
                        while (i_152_ > i_153_) {
                            val i_154_ = aShortArray5649!![i_153_] - 1
                            if (i_154_ == -1) break
                            `is`[aShortArray5649!![i_153_] - 1] = -999999
                            i_153_++
                        }
                    }
                }
                for (i_161_ in 0..<anInt5632) {
                    if (`is`[aShortArray5592!![i_161_].toInt()] != -999999 && `is`[aShortArray5579!![i_161_].toInt()] != -999999 && `is`[aShortArray5566!![i_161_].toInt()] != -999999 && method679(
                            i_109_,
                            `is`[aShortArray5579!![i_161_].toInt()],
                            `is`[aShortArray5566!![i_161_].toInt()],
                            is_143_!![aShortArray5579!![i_161_].toInt()],
                            `is`[aShortArray5592!![i_161_].toInt()],
                            is_143_[aShortArray5592!![i_161_].toInt()],
                            125,
                            i_111_,
                            is_143_[aShortArray5566!![i_161_].toInt()]
                        )
                    ) return true
                }
            }
            return false
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("paa.SA(" + bool + ',' + i + ',' + i_108_ + ',' + i_109_ + ',' + i_110_ + ',' + i_111_ + ',' + (if (class101 != null) "{...}" else "null") + ')'))
        }
    }

    public override fun O(i: Int, i_162_: Int, i_163_: Int) {
        anInt5618++
        var i_164_ = 0
        while (anInt5557 > i_164_) {
            if (i != 128) anIntArray5543!![i_164_] = i * anIntArray5543!![i_164_] shr 7
            if (i_162_ != 128) anIntArray5593!![i_164_] = anIntArray5593!![i_164_] * i_162_ shr 7
            if (i_163_ != 128) anIntArray5644!![i_164_] = anIntArray5644!![i_164_] * i_163_ shr 7
            i_164_++
        }
        if (aClass123_5605 != null) aClass123_5605!!.anInterface2_1811 = null
        aBoolean5527 = false
    }

    public override fun ba(var_r: r?): r? {
        try {
            anInt5562++
            if (anInt5529 == 0) return null
            if (!aBoolean5527) method692((-123).toByte())
            val i: Int
            val i_165_: Int
            if (aHa_Sub2_5598!!.anInt7772 > 0) {
                i = (-(aShort5629 * aHa_Sub2_5598.anInt7772 shr 8) + aShort5540 shr aHa_Sub2_5598.anInt7731)
                i_165_ = ((aShort5586 + -(aShort5591 * aHa_Sub2_5598.anInt7772 shr 8)) shr aHa_Sub2_5598.anInt7731)
            } else {
                i = (-(aShort5591 * aHa_Sub2_5598.anInt7772 shr 8) + aShort5540 shr aHa_Sub2_5598.anInt7731)
                i_165_ = ((aShort5586 + -(aHa_Sub2_5598.anInt7772 * aShort5629 shr 8)) shr aHa_Sub2_5598.anInt7731)
            }
            val i_166_: Int
            val i_167_: Int
            if (aHa_Sub2_5598.anInt7777 > 0) {
                i_166_ = (-(aHa_Sub2_5598.anInt7777 * aShort5629 shr 8) + aShort5617 shr aHa_Sub2_5598.anInt7731)
                i_167_ = ((aShort5646 - (aShort5591 * aHa_Sub2_5598.anInt7777 shr 8)) shr aHa_Sub2_5598.anInt7731)
            } else {
                i_166_ = (-(aHa_Sub2_5598.anInt7777 * aShort5591 shr 8) + aShort5617 shr aHa_Sub2_5598.anInt7731)
                i_167_ = (-(aHa_Sub2_5598.anInt7777 * aShort5629 shr 8) + aShort5646 shr aHa_Sub2_5598.anInt7731)
            }
            val i_168_ = i_165_ - i - -1
            val i_169_ = -i_166_ + i_167_ - -1
            val var_r_Sub2 = var_r as r_Sub2?
            val var_r_Sub2_170_: r_Sub2?
            if (var_r_Sub2 == null || !var_r_Sub2.method3296((-47).toByte(), i_169_, i_168_)) var_r_Sub2_170_ = r_Sub2(aHa_Sub2_5598, i_168_, i_169_)
            else {
                var_r_Sub2_170_ = var_r_Sub2
                var_r_Sub2_170_.method3293(0.toByte())
            }
            var_r_Sub2_170_.method3292(i_167_, i_165_, i_166_, 25053, i)
            method685(118.toByte(), var_r_Sub2_170_)
            return var_r_Sub2_170_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "paa.ba(" + (if (var_r != null) "{...}" else "null") + ')')
        }
    }

    public override fun method612() {
        anInt5560++
        if (anInt5529 > 0 && anInt5537 > 0) {
            method688(5, false)
            if ((aByte5581.toInt() and 0x10) == 0 && aClass270_5575!!.anInterface8_3463 == null) method678(false, 27.toByte())
            method691(124.toByte())
        }
    }

    public override fun na(): Int {
        if (!aBoolean5527) method692((-123).toByte())
        anInt5578++
        return aShort5634.toInt()
    }

    public override fun k(i: Int) {
        anInt5622++
        val i_171_ = Class70.anIntArray1207!![i]
        val i_172_ = Class70.anIntArray1204!![i]
        for (i_173_ in 0..<anInt5557) {
            val i_174_ = ((anIntArray5543!![i_173_] * i_172_ + anIntArray5644!![i_173_] * i_171_) shr 14)
            anIntArray5644!![i_173_] = anIntArray5644!![i_173_] * i_172_ + -(anIntArray5543!![i_173_] * i_171_) shr 14
            anIntArray5543!![i_173_] = i_174_
        }
        for (i_175_ in 0..<anInt5529) {
            val i_176_ = ((aShortArray5564!![i_175_] * i_172_ + aShortArray5576!![i_175_] * i_171_) shr 14)
            aShortArray5576!![i_175_] = ((i_172_ * aShortArray5576!![i_175_] + -(i_171_ * aShortArray5564!![i_175_])) shr 14).toShort()
            aShortArray5564!![i_175_] = i_176_.toShort()
        }
        if (aClass123_5563 == null && aClass123_5610 != null) aClass123_5610!!.anInterface2_1811 = null
        if (aClass123_5563 != null) aClass123_5563!!.anInterface2_1811 = null
        if (aClass123_5605 != null) aClass123_5605!!.anInterface2_1811 = null
        aBoolean5527 = false
    }

    private fun method685(i: Byte, var_r_Sub2: r_Sub2?) {
        try {
            if (aHa_Sub2_5598!!.anIntArray7880!!.size < anInt5529) {
                aHa_Sub2_5598.anIntArray7883 = IntArray(anInt5529)
                aHa_Sub2_5598.anIntArray7880 = IntArray(anInt5529)
            }
            anInt5530++
            val `is`: IntArray = aHa_Sub2_5598.anIntArray7880!!
            if (i < 91) method619()
            val is_177_ = aHa_Sub2_5598.anIntArray7883
            var i_178_ = 0
            while (anInt5557 > i_178_) {
                val i_179_ = ((-((aHa_Sub2_5598.anInt7772 * anIntArray5593!![i_178_]) shr 8) + anIntArray5543!![i_178_] shr aHa_Sub2_5598.anInt7731) - var_r_Sub2!!.anInt10489)
                val i_180_ = (((anIntArray5644!![i_178_] + -((aHa_Sub2_5598.anInt7777 * anIntArray5593!![i_178_]) shr 8)) shr aHa_Sub2_5598.anInt7731) + -var_r_Sub2.anInt10484)
                val i_181_ = anIntArray5528!![i_178_]
                val i_182_ = anIntArray5528!![1 + i_178_]
                var i_183_ = i_181_
                while (i_182_ > i_183_) {
                    val i_184_ = aShortArray5649!![i_183_] + -1
                    if (i_184_ == -1) break
                    `is`[i_184_] = i_179_
                    is_177_!![i_184_] = i_180_
                    i_183_++
                }
                i_178_++
            }
            for (i_185_ in 0..<anInt5537) {
                if (aByteArray5542 == null || aByteArray5542!![i_185_] <= 128) {
                    val i_186_ = aShortArray5592!![i_185_]
                    val i_187_ = aShortArray5579!![i_185_]
                    val i_188_ = aShortArray5566!![i_185_]
                    val i_189_ = `is`[i_186_.toInt()]
                    val i_190_ = `is`[i_187_.toInt()]
                    val i_191_ = `is`[i_188_.toInt()]
                    val i_192_ = is_177_!![i_186_.toInt()]
                    val i_193_ = is_177_[i_187_.toInt()]
                    val i_194_ = is_177_[i_188_.toInt()]
                    if (((i_189_ + -i_190_) * (-i_194_ + i_193_) - (-i_190_ + i_191_) * (-i_192_ + i_193_)) > 0) var_r_Sub2!!.method3294(i_191_, i_189_, i_192_, 28, i_190_, i_194_, i_193_)
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("paa.U(" + i + ',' + (if (var_r_Sub2 != null) "{...}" else "null") + ')'))
        }
    }

    public override fun method624(i: Int, i_195_: Int, i_196_: Int, i_197_: Int) {
        anInt5534++
        var i_198_ = 0
        while (anInt5632 > i_198_) {
            val i_199_ = 0xffff and aShortArray5580!![i_198_].toInt()
            var i_200_ = (i_199_ and 0xfd9e) shr 10
            var i_201_ = i_199_ shr 7 and 0x7
            if (i != -1) i_200_ = (i_197_ * (-i_200_ + i) shr 7) + i_200_
            var i_202_ = i_199_ and 0x7f
            if (i_195_ != -1) i_201_ = (i_197_ * (i_195_ - i_201_) shr 7) + i_201_
            if (i_196_ != -1) i_202_ += (i_196_ + -i_202_) * i_197_ shr 7
            aShortArray5580!![i_198_] = (Class273.method2057(Class273.method2057(i_201_ shl 7, i_200_ shl 10), i_202_)).toShort()
            i_198_++
        }
        if (aClass118Array5621 != null) {
            for (i_203_ in 0..<anInt5536) {
                val class118 = aClass118Array5621!![i_203_]!!
                val class48 = aClass48Array5596!![i_203_]!!
                class48.anInt858 = ((0xffffff and (Class10.anIntArray179!![0xffff and (aShortArray5580!![class118.anInt1783]).toInt()])) or (class48.anInt858 and 0xffffff.inv()))
            }
        }
        if (aClass123_5610 != null) aClass123_5610!!.anInterface2_1811 = null
    }

    public override fun H(i: Int, i_204_: Int, i_205_: Int) {
        anInt5547++
        var i_206_ = 0
        while (anInt5557 > i_206_) {
            if (i != 0) anIntArray5543!![i_206_] += i
            if (i_204_ != 0) anIntArray5593!![i_206_] += i_204_
            if (i_205_ != 0) anIntArray5644!![i_206_] += i_205_
            i_206_++
        }
        aBoolean5527 = false
        if (aClass123_5605 != null) aClass123_5605!!.anInterface2_1811 = null
    }

    public override fun a(i: Int) {
        anInt5538++
        val i_207_ = Class70.anIntArray1207!![i]
        val i_208_ = Class70.anIntArray1204!![i]
        var i_209_ = 0
        while (anInt5557 > i_209_) {
            val i_210_ = ((i_208_ * anIntArray5543!![i_209_] + i_207_ * anIntArray5644!![i_209_]) shr 14)
            anIntArray5644!![i_209_] = anIntArray5644!![i_209_] * i_208_ + -(anIntArray5543!![i_209_] * i_207_) shr 14
            anIntArray5543!![i_209_] = i_210_
            i_209_++
        }
        aBoolean5527 = false
        if (aClass123_5605 != null) aClass123_5605!!.anInterface2_1811 = null
    }

    public override fun F(): Boolean {
        anInt5612++
        return aBoolean5595
    }

    public override fun method622() {
        anInt5613++
    }

    private fun method686(class64_sub3_211_: Class64_Sub3?, i: Int, i_212_: Int, bool: Boolean, class64_sub3_213_: Class64_Sub3?, bool_214_: Boolean): Class64 {
        try {
            anInt5628++
            class64_sub3_211_!!.anInt5642 = anInt5642
            class64_sub3_211_.anInt5556 = anInt5556
            class64_sub3_211_.anInt5536 = anInt5536
            class64_sub3_211_.aByte5581 = 0.toByte()
            class64_sub3_211_.aShort5544 = aShort5544
            class64_sub3_211_.anInt5529 = anInt5529
            class64_sub3_211_.aBoolean5638 = aBoolean5638
            class64_sub3_211_.anInt5648 = i
            class64_sub3_211_.aShort5645 = aShort5645
            class64_sub3_211_.anInt5632 = anInt5632
            class64_sub3_211_.anInt5537 = anInt5537
            class64_sub3_211_.anInt5557 = anInt5557
            if ((i and 0x100) == 0) class64_sub3_211_.aBoolean5595 = aBoolean5595
            else class64_sub3_211_.aBoolean5595 = true
            val bool_215_ = method2709(anInt5556, i, -1)
            val bool_216_ = Class223.method1613(false, anInt5556, i)
            val bool_217_ = method2259(i_212_, anInt5556, i)
            val bool_218_ = bool_217_ or (bool_216_ or bool_215_)
            if (bool_218_) {
                if (!bool_215_) class64_sub3_211_.anIntArray5543 = anIntArray5543
                else if (class64_sub3_213_!!.anIntArray5543 != null && (class64_sub3_213_.anIntArray5543!!.size >= anInt5642)) class64_sub3_211_.anIntArray5543 = class64_sub3_213_.anIntArray5543
                else {
                    class64_sub3_213_.anIntArray5543 = IntArray(anInt5642)
                    class64_sub3_211_.anIntArray5543 = class64_sub3_213_.anIntArray5543
                }
                if (bool_216_) {
                    if (class64_sub3_213_!!.anIntArray5593 != null && (anInt5642 <= class64_sub3_213_.anIntArray5593!!.size)) class64_sub3_211_.anIntArray5593 = class64_sub3_213_.anIntArray5593
                    else {
                        class64_sub3_213_.anIntArray5593 = IntArray(anInt5642)
                        class64_sub3_211_.anIntArray5593 = class64_sub3_213_.anIntArray5593
                    }
                } else class64_sub3_211_.anIntArray5593 = anIntArray5593
                if (bool_217_) {
                    if (class64_sub3_213_!!.anIntArray5644 == null || (class64_sub3_213_.anIntArray5644!!.size < anInt5642)) {
                        class64_sub3_213_.anIntArray5644 = IntArray(anInt5642)
                        class64_sub3_211_.anIntArray5644 = class64_sub3_213_.anIntArray5644
                    } else class64_sub3_211_.anIntArray5644 = class64_sub3_213_.anIntArray5644
                } else class64_sub3_211_.anIntArray5644 = anIntArray5644
                var i_219_ = 0
                while (anInt5642 > i_219_) {
                    if (bool_215_) class64_sub3_211_.anIntArray5543!![i_219_] = anIntArray5543!![i_219_]
                    if (bool_216_) class64_sub3_211_.anIntArray5593!![i_219_] = anIntArray5593!![i_219_]
                    if (bool_217_) class64_sub3_211_.anIntArray5644!![i_219_] = anIntArray5644!![i_219_]
                    i_219_++
                }
            } else {
                class64_sub3_211_.anIntArray5644 = anIntArray5644
                class64_sub3_211_.anIntArray5593 = anIntArray5593
                class64_sub3_211_.anIntArray5543 = anIntArray5543
            }
            if (Class288.method2187(i, -79, anInt5556)) {
                class64_sub3_211_.aClass123_5605 = class64_sub3_213_!!.aClass123_5605
                if (bool_214_) class64_sub3_211_.aByte5581 = (class64_sub3_211_.aByte5581.toInt() or 0x1).toByte()
                class64_sub3_211_.aClass123_5605!!.anInterface2_1811 = aClass123_5605!!.anInterface2_1811
                class64_sub3_211_.aClass123_5605!!.aByte1812 = aClass123_5605!!.aByte1812
            } else if (!method616(i_212_ + 2, i, anInt5556)) class64_sub3_211_.aClass123_5605 = null
            else class64_sub3_211_.aClass123_5605 = aClass123_5605
            if (Class122.method1087(12644, anInt5556, i)) {
                if (class64_sub3_213_!!.aShortArray5580 != null && (class64_sub3_213_.aShortArray5580!!.size >= anInt5632)) class64_sub3_211_.aShortArray5580 = class64_sub3_213_.aShortArray5580
                else {
                    class64_sub3_213_.aShortArray5580 = ShortArray(anInt5632)
                    class64_sub3_211_.aShortArray5580 = class64_sub3_213_.aShortArray5580
                }
                for (i_220_ in 0..<anInt5632) class64_sub3_211_.aShortArray5580!![i_220_] = aShortArray5580!![i_220_]
            } else class64_sub3_211_.aShortArray5580 = aShortArray5580
            if (Class278.method2075(i, -128, anInt5556)) {
                if (class64_sub3_213_!!.aByteArray5542 == null || (class64_sub3_213_.aByteArray5542!!.size < anInt5632)) {
                    class64_sub3_213_.aByteArray5542 = ByteArray(anInt5632)
                    class64_sub3_211_.aByteArray5542 = class64_sub3_213_.aByteArray5542
                } else class64_sub3_211_.aByteArray5542 = class64_sub3_213_.aByteArray5542
                var i_221_ = 0
                while (anInt5632 > i_221_) {
                    class64_sub3_211_.aByteArray5542!![i_221_] = aByteArray5542!![i_221_]
                    i_221_++
                }
            } else class64_sub3_211_.aByteArray5542 = aByteArray5542
            if (Class273.method2056(i, 108, anInt5556)) {
                class64_sub3_211_.aClass123_5610 = class64_sub3_213_!!.aClass123_5610
                if (bool_214_) class64_sub3_211_.aByte5581 = (class64_sub3_211_.aByte5581.toInt() or 0x2).toByte()
                class64_sub3_211_.aClass123_5610!!.anInterface2_1811 = aClass123_5610!!.anInterface2_1811
                class64_sub3_211_.aClass123_5610!!.aByte1812 = aClass123_5610!!.aByte1812
            } else if (Class146.method1193(anInt5556, i, true)) class64_sub3_211_.aClass123_5610 = aClass123_5610
            else class64_sub3_211_.aClass123_5610 = null
            if (Class156.method1241(anInt5556, i, -119)) {
                if (class64_sub3_213_!!.aShortArray5564 != null && class64_sub3_213_.aShortArray5564!!.size >= anInt5529) {
                    class64_sub3_211_.aShortArray5564 = class64_sub3_213_.aShortArray5564
                    class64_sub3_211_.aShortArray5583 = class64_sub3_213_.aShortArray5583
                    class64_sub3_211_.aShortArray5576 = class64_sub3_213_.aShortArray5576
                } else {
                    val i_222_ = anInt5529
                    class64_sub3_213_.aShortArray5583 = ShortArray(i_222_)
                    class64_sub3_211_.aShortArray5583 = class64_sub3_213_.aShortArray5583
                    class64_sub3_213_.aShortArray5564 = ShortArray(i_222_)
                    class64_sub3_211_.aShortArray5564 = class64_sub3_213_.aShortArray5564
                    class64_sub3_213_.aShortArray5576 = ShortArray(i_222_)
                    class64_sub3_211_.aShortArray5576 = class64_sub3_213_.aShortArray5576
                }
                if (aClass139_5572 == null) {
                    for (i_223_ in 0..<anInt5529) {
                        class64_sub3_211_.aShortArray5564!![i_223_] = aShortArray5564!![i_223_]
                        class64_sub3_211_.aShortArray5583!![i_223_] = aShortArray5583!![i_223_]
                        class64_sub3_211_.aShortArray5576!![i_223_] = aShortArray5576!![i_223_]
                    }
                } else {
                    if (class64_sub3_213_.aClass139_5572 == null) class64_sub3_213_.aClass139_5572 = Class139()
                    val class139 = (class64_sub3_213_.aClass139_5572.also { class64_sub3_211_.aClass139_5572 = it })!!
                    if (class139.aShortArray1954 == null || (anInt5529 > class139.aShortArray1954!!.size)) {
                        val i_224_ = anInt5529
                        class139.aShortArray1951 = ShortArray(i_224_)
                        class139.aShortArray1953 = ShortArray(i_224_)
                        class139.aShortArray1954 = ShortArray(i_224_)
                        class139.aByteArray1948 = ByteArray(i_224_)
                    }
                    var i_225_ = 0
                    while (anInt5529 > i_225_) {
                        class64_sub3_211_.aShortArray5564!![i_225_] = aShortArray5564!![i_225_]
                        class64_sub3_211_.aShortArray5583!![i_225_] = aShortArray5583!![i_225_]
                        class64_sub3_211_.aShortArray5576!![i_225_] = aShortArray5576!![i_225_]
                        class139.aShortArray1954!![i_225_] = (aClass139_5572!!.aShortArray1954!![i_225_])
                        class139.aShortArray1951!![i_225_] = (aClass139_5572!!.aShortArray1951!![i_225_])
                        class139.aShortArray1953!![i_225_] = (aClass139_5572!!.aShortArray1953!![i_225_])
                        class139.aByteArray1948!![i_225_] = (aClass139_5572!!.aByteArray1948!![i_225_])
                        i_225_++
                    }
                }
                class64_sub3_211_.aByteArray5594 = aByteArray5594
            } else {
                class64_sub3_211_.aShortArray5564 = aShortArray5564
                class64_sub3_211_.aShortArray5583 = aShortArray5583
                class64_sub3_211_.aClass139_5572 = aClass139_5572
                class64_sub3_211_.aByteArray5594 = aByteArray5594
                class64_sub3_211_.aShortArray5576 = aShortArray5576
            }
            if (Class348_Sub47.method3325(i, anInt5556, true)) {
                if (bool_214_) class64_sub3_211_.aByte5581 = (class64_sub3_211_.aByte5581.toInt() or 0x4).toByte()
                class64_sub3_211_.aClass123_5563 = class64_sub3_213_!!.aClass123_5563
                class64_sub3_211_.aClass123_5563!!.anInterface2_1811 = aClass123_5563!!.anInterface2_1811
                class64_sub3_211_.aClass123_5563!!.aByte1812 = aClass123_5563!!.aByte1812
            } else if (!method166(108.toByte(), anInt5556, i)) class64_sub3_211_.aClass123_5563 = null
            else class64_sub3_211_.aClass123_5563 = aClass123_5563
            if (method2174(121.toByte(), i, anInt5556)) {
                if (class64_sub3_213_!!.aFloatArray5552 != null && (class64_sub3_213_.aFloatArray5552!!.size >= anInt5632)) {
                    class64_sub3_211_.aFloatArray5571 = class64_sub3_213_.aFloatArray5571
                    class64_sub3_211_.aFloatArray5552 = class64_sub3_213_.aFloatArray5552
                } else {
                    val i_226_ = anInt5529
                    class64_sub3_213_.aFloatArray5571 = FloatArray(i_226_)
                    class64_sub3_211_.aFloatArray5571 = class64_sub3_213_.aFloatArray5571
                    class64_sub3_213_.aFloatArray5552 = FloatArray(i_226_)
                    class64_sub3_211_.aFloatArray5552 = class64_sub3_213_.aFloatArray5552
                }
                for (i_227_ in 0..<anInt5529) {
                    class64_sub3_211_.aFloatArray5552!![i_227_] = aFloatArray5552!![i_227_]
                    class64_sub3_211_.aFloatArray5571!![i_227_] = aFloatArray5571!![i_227_]
                }
            } else {
                class64_sub3_211_.aFloatArray5571 = aFloatArray5571
                class64_sub3_211_.aFloatArray5552 = aFloatArray5552
            }
            if (Class202.method1475((-96).toByte(), anInt5556, i)) {
                class64_sub3_211_.aClass123_5620 = class64_sub3_213_!!.aClass123_5620
                if (bool_214_) class64_sub3_211_.aByte5581 = (class64_sub3_211_.aByte5581.toInt() or 0x8).toByte()
                class64_sub3_211_.aClass123_5620!!.anInterface2_1811 = aClass123_5620!!.anInterface2_1811
                class64_sub3_211_.aClass123_5620!!.aByte1812 = aClass123_5620!!.aByte1812
            } else if (Class137.method1163(anInt5556, (-60).toByte(), i)) class64_sub3_211_.aClass123_5620 = aClass123_5620
            else class64_sub3_211_.aClass123_5620 = null
            if (method2352(-19, anInt5556, i)) {
                if (class64_sub3_213_!!.aShortArray5592 != null && (anInt5632 <= class64_sub3_213_.aShortArray5592!!.size)) {
                    class64_sub3_211_.aShortArray5579 = class64_sub3_213_.aShortArray5579
                    class64_sub3_211_.aShortArray5592 = class64_sub3_213_.aShortArray5592
                    class64_sub3_211_.aShortArray5566 = class64_sub3_213_.aShortArray5566
                } else {
                    val i_228_ = anInt5632
                    class64_sub3_213_.aShortArray5566 = ShortArray(i_228_)
                    class64_sub3_211_.aShortArray5566 = class64_sub3_213_.aShortArray5566
                    class64_sub3_213_.aShortArray5592 = ShortArray(i_228_)
                    class64_sub3_211_.aShortArray5592 = class64_sub3_213_.aShortArray5592
                    class64_sub3_213_.aShortArray5579 = ShortArray(i_228_)
                    class64_sub3_211_.aShortArray5579 = class64_sub3_213_.aShortArray5579
                }
                var i_229_ = 0
                while (anInt5632 > i_229_) {
                    class64_sub3_211_.aShortArray5592!![i_229_] = aShortArray5592!![i_229_]
                    class64_sub3_211_.aShortArray5579!![i_229_] = aShortArray5579!![i_229_]
                    class64_sub3_211_.aShortArray5566!![i_229_] = aShortArray5566!![i_229_]
                    i_229_++
                }
            } else {
                class64_sub3_211_.aShortArray5566 = aShortArray5566
                class64_sub3_211_.aShortArray5579 = aShortArray5579
                class64_sub3_211_.aShortArray5592 = aShortArray5592
            }
            if (Class69.method723(i, anInt5556, (-70).toByte())) {
                if (bool_214_) class64_sub3_211_.aByte5581 = (class64_sub3_211_.aByte5581.toInt() or 0x10).toByte()
                class64_sub3_211_.aClass270_5575 = class64_sub3_213_!!.aClass270_5575
                class64_sub3_211_.aClass270_5575!!.anInterface8_3463 = aClass270_5575!!.anInterface8_3463
            } else if (!Class156.method1238(i, anInt5556, -93)) class64_sub3_211_.aClass270_5575 = null
            else class64_sub3_211_.aClass270_5575 = aClass270_5575
            if (Class230.method1637(anInt5556, 32768, i)) {
                if (class64_sub3_213_!!.aShortArray5601 == null || class64_sub3_213_.aShortArray5601!!.size < anInt5632) {
                    val i_230_ = anInt5632
                    class64_sub3_213_.aShortArray5601 = ShortArray(i_230_)
                    class64_sub3_211_.aShortArray5601 = class64_sub3_213_.aShortArray5601
                } else class64_sub3_211_.aShortArray5601 = class64_sub3_213_.aShortArray5601
                var i_231_ = 0
                while (anInt5632 > i_231_) {
                    class64_sub3_211_.aShortArray5601!![i_231_] = aShortArray5601!![i_231_]
                    i_231_++
                }
            } else class64_sub3_211_.aShortArray5601 = aShortArray5601
            if (Class219.method1599((-113).toByte(), i, anInt5556)) {
                if (class64_sub3_213_!!.aClass48Array5596 != null && (class64_sub3_213_.aClass48Array5596!!.size >= anInt5536)) {
                    class64_sub3_211_.aClass48Array5596 = class64_sub3_213_.aClass48Array5596
                    for (i_232_ in 0..<anInt5536) class64_sub3_211_.aClass48Array5596!![i_232_]!!.method451(aClass48Array5596!![i_232_]!!, (-110).toByte())
                } else {
                    val i_233_ = anInt5536
                    class64_sub3_213_.aClass48Array5596 = arrayOfNulls<Class48>(i_233_)
                    class64_sub3_211_.aClass48Array5596 = class64_sub3_213_.aClass48Array5596
                    var i_234_ = 0
                    while (anInt5536 > i_234_) {
                        class64_sub3_211_.aClass48Array5596!![i_234_] = aClass48Array5596!![i_234_]!!.method452(true)
                        i_234_++
                    }
                }
            } else class64_sub3_211_.aClass48Array5596 = aClass48Array5596
            class64_sub3_211_.anIntArray5528 = anIntArray5528
            class64_sub3_211_.aClass342Array5541 = aClass342Array5541
            class64_sub3_211_.anIntArray5626 = anIntArray5626
            if (aBoolean5527) {
                class64_sub3_211_.aShort5540 = aShort5540
                class64_sub3_211_.aShort5559 = aShort5559
                class64_sub3_211_.aShort5617 = aShort5617
                class64_sub3_211_.aShort5586 = aShort5586
                class64_sub3_211_.aShort5629 = aShort5629
                class64_sub3_211_.aShort5591 = aShort5591
                class64_sub3_211_.aBoolean5527 = true
                class64_sub3_211_.aShort5634 = aShort5634
                class64_sub3_211_.aShort5646 = aShort5646
            } else class64_sub3_211_.aBoolean5527 = false
            class64_sub3_211_.aClass118Array5621 = aClass118Array5621
            class64_sub3_211_.aShortArray5608 = aShortArray5608
            class64_sub3_211_.anIntArrayArray5539 = anIntArrayArray5539
            class64_sub3_211_.aShortArray5649 = aShortArray5649
            class64_sub3_211_.anIntArrayArray5553 = anIntArrayArray5553
            class64_sub3_211_.aShortArray5573 = aShortArray5573
            class64_sub3_211_.anIntArrayArray5627 = anIntArrayArray5627
            class64_sub3_211_.aClass129Array5640 = aClass129Array5640
            return class64_sub3_211_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("paa.K(" + (if (class64_sub3_211_ != null) "{...}" else "null") + ',' + i + ',' + i_212_ + ',' + bool + ',' + (if (class64_sub3_213_ != null) "{...}" else "null") + ',' + bool_214_ + ')'))
        }
    }

    public override fun LA(i: Int) {
        if (aClass123_5610 != null) aClass123_5610!!.anInterface2_1811 = null
        anInt5623++
        aShort5645 = i.toShort()
        if (aClass123_5563 != null) aClass123_5563!!.anInterface2_1811 = null
    }

    public override fun wa() {
        for (i in 0..<anInt5642) {
            anIntArray5543!![i] = 7 + anIntArray5543!![i] shr 4
            anIntArray5593!![i] = 7 + anIntArray5593!![i] shr 4
            anIntArray5644!![i] = anIntArray5644!![i] - -7 shr 4
        }
        anInt5585++
        if (aClass123_5605 != null) aClass123_5605!!.anInterface2_1811 = null
        aBoolean5527 = false
    }

    public override fun method608(class101: Class101?, class318_sub3: Class318_Sub3?, i: Int, i_235_: Int) {
        try {
            anInt5639++
            if (anInt5529 != 0) {
                val class101_sub3 = aHa_Sub2_5598!!.aClass101_Sub3_7760
                val class101_sub3_236_ = class101 as Class101_Sub3
                if (!aBoolean5527) method692((-123).toByte())
                Class320.aFloat3994 = ((class101_sub3_236_.aFloat5750 * class101_sub3.aFloat5756) + (class101_sub3.aFloat5754 * class101_sub3_236_.aFloat5769) + (class101_sub3.aFloat5784 * class101_sub3_236_.aFloat5754))
                Class49.aFloat4720 = ((class101_sub3_236_.aFloat5751 * class101_sub3.aFloat5784) + ((class101_sub3.aFloat5756 * class101_sub3_236_.aFloat5747) + (class101_sub3_236_.aFloat5772 * class101_sub3.aFloat5754)) + class101_sub3.aFloat5751)
                val f = (Class49.aFloat4720 + Class320.aFloat3994 * aShort5591.toFloat())
                val f_237_ = (Class320.aFloat3994 * aShort5629.toFloat() + Class49.aFloat4720)
                val f_238_: Float
                val f_239_: Float
                if (f > f_237_) {
                    f_238_ = f + aShort5634.toFloat()
                    f_239_ = -aShort5634.toFloat() + f_237_
                } else {
                    f_238_ = aShort5634.toFloat() + f_237_
                    f_239_ = f - aShort5634.toFloat()
                }
                if (!(f_239_ >= aHa_Sub2_5598.aFloat7875) && !(aHa_Sub2_5598.anInt7826.toFloat() >= f_238_)) {
                    Class299_Sub1_Sub1.aFloat8696 = ((class101_sub3.aFloat5781 * class101_sub3_236_.aFloat5754) + ((class101_sub3_236_.aFloat5769 * class101_sub3.aFloat5750) + ((class101_sub3_236_.aFloat5750) * (class101_sub3.aFloat5770))))
                    Class190.aFloat2555 = ((class101_sub3.aFloat5781 * class101_sub3_236_.aFloat5751) + ((class101_sub3_236_.aFloat5772 * class101_sub3.aFloat5750) + (class101_sub3.aFloat5770 * (class101_sub3_236_.aFloat5747))) + class101_sub3.aFloat5747)
                    val f_240_ = (Class190.aFloat2555 + (aShort5591.toFloat() * Class299_Sub1_Sub1.aFloat8696))
                    val f_241_ = (Class190.aFloat2555 + (aShort5629.toFloat() * Class299_Sub1_Sub1.aFloat8696))
                    val f_242_: Float
                    val f_243_: Float
                    if (f_240_ > f_241_) {
                        f_242_ = (aHa_Sub2_5598.anInt7771.toFloat() * (f_240_ + aShort5634.toFloat()))
                        f_243_ = (aHa_Sub2_5598.anInt7771.toFloat() * (f_241_ - aShort5634.toFloat()))
                    } else {
                        f_243_ = (aHa_Sub2_5598.anInt7771.toFloat() * (-aShort5634.toFloat() + f_240_))
                        f_242_ = (aHa_Sub2_5598.anInt7771.toFloat() * (f_241_ + aShort5634.toFloat()))
                    }
                    if (!(aHa_Sub2_5598.aFloat7835 <= f_243_ / i.toFloat()) && !(f_242_ / i.toFloat() <= aHa_Sub2_5598.aFloat7872)) {
                        Class252.aFloat3242 = ((class101_sub3.aFloat5769 * (class101_sub3_236_.aFloat5769)) + ((class101_sub3_236_.aFloat5750) * class101_sub3.aFloat5761) + ((class101_sub3_236_.aFloat5754) * (class101_sub3.aFloat5762)))
                        Class156.aFloat2111 = (class101_sub3.aFloat5772 + ((class101_sub3.aFloat5762 * (class101_sub3_236_.aFloat5751)) + (((class101_sub3.aFloat5769) * (class101_sub3_236_.aFloat5772)) + ((class101_sub3.aFloat5761) * (class101_sub3_236_.aFloat5747)))))
                        val f_244_ = (Class252.aFloat3242 * aShort5591.toFloat() + Class156.aFloat2111)
                        val f_245_ = (Class156.aFloat2111 + aShort5629.toFloat() * Class252.aFloat3242)
                        val f_246_: Float
                        val f_247_: Float
                        if (f_245_ < f_244_) {
                            f_247_ = ((-aShort5634.toFloat() + f_245_) * (aHa_Sub2_5598.anInt7794).toFloat())
                            f_246_ = (aHa_Sub2_5598.anInt7794.toFloat() * (aShort5634.toFloat() + f_244_))
                        } else {
                            f_246_ = (aHa_Sub2_5598.anInt7794.toFloat() * (f_245_ + aShort5634.toFloat()))
                            f_247_ = (aHa_Sub2_5598.anInt7794.toFloat() * (f_244_ - aShort5634.toFloat()))
                        }
                        if (!(f_247_ / i.toFloat() >= aHa_Sub2_5598.aFloat7830) && !(aHa_Sub2_5598.aFloat7836 >= f_246_ / i.toFloat())) {
                            if (class318_sub3 != null || aClass118Array5621 != null) {
                                Class314.aFloat3943 = (((class101_sub3_236_.aFloat5770) * (class101_sub3.aFloat5761)) + ((class101_sub3.aFloat5769) * class101_sub3_236_.aFloat5761) + ((class101_sub3_236_.aFloat5756) * (class101_sub3.aFloat5762)))
                                Class313.aFloat3935 = (((class101_sub3.aFloat5781) * (class101_sub3_236_.aFloat5784)) + ((class101_sub3_236_.aFloat5781 * (class101_sub3.aFloat5770)) + ((class101_sub3.aFloat5750) * (class101_sub3_236_.aFloat5762))))
                                Class318_Sub9_Sub1.aFloat8784 = (((class101_sub3.aFloat5784) * (class101_sub3_236_.aFloat5756)) + ((class101_sub3_236_.aFloat5770 * (class101_sub3.aFloat5756)) + ((class101_sub3.aFloat5754) * (class101_sub3_236_.aFloat5761))))
                                Class215.aFloat2836 = (((class101_sub3_236_.aFloat5762) * (class101_sub3.aFloat5769)) + ((class101_sub3_236_.aFloat5781) * (class101_sub3.aFloat5761)) + ((class101_sub3.aFloat5762) * class101_sub3_236_.aFloat5784))
                                Class286_Sub8.aFloat6304 = (((class101_sub3.aFloat5784) * (class101_sub3_236_.aFloat5784)) + ((class101_sub3_236_.aFloat5762 * (class101_sub3.aFloat5754)) + (class101_sub3_236_.aFloat5781 * (class101_sub3.aFloat5756))))
                                Class167.aFloat2203 = (((class101_sub3_236_.aFloat5756) * (class101_sub3.aFloat5781)) + ((class101_sub3_236_.aFloat5761 * (class101_sub3.aFloat5750)) + (class101_sub3_236_.aFloat5770 * (class101_sub3.aFloat5770))))
                            }
                            if (class318_sub3 != null) {
                                val i_248_ = aShort5586 + aShort5540 shr 1
                                val i_249_ = aShort5617 + aShort5646 shr 1
                                val i_250_ = ((aShort5591.toFloat() * Class299_Sub1_Sub1.aFloat8696) + ((i_248_.toFloat() * Class167.aFloat2203) + Class190.aFloat2555) + (Class313.aFloat3935 * i_249_.toFloat())).toInt()
                                val i_251_ = (Class156.aFloat2111 + (i_248_.toFloat() * Class314.aFloat3943) + (Class252.aFloat3242 * aShort5591.toFloat()) + (Class215.aFloat2836 * i_249_.toFloat())).toInt()
                                val i_252_ = (Class49.aFloat4720 + (i_248_.toFloat() * (Class318_Sub9_Sub1.aFloat8784)) + (Class320.aFloat3994 * aShort5591.toFloat()) + (Class286_Sub8.aFloat6304 * i_249_.toFloat())).toInt()
                                val i_253_ = ((Class313.aFloat3935 * i_249_.toFloat()) + ((Class299_Sub1_Sub1.aFloat8696 * aShort5629.toFloat()) + (Class190.aFloat2555 + (Class167.aFloat2203 * i_248_.toFloat())))).toInt()
                                val i_254_ = (Class156.aFloat2111 + (Class314.aFloat3943 * i_248_.toFloat()) + (Class252.aFloat3242 * aShort5629.toFloat()) + (i_249_.toFloat() * Class215.aFloat2836)).toInt()
                                class318_sub3.anInt6405 = (aHa_Sub2_5598.anInt7853 - -(i_250_ * (aHa_Sub2_5598.anInt7771) / i))
                                class318_sub3.anInt6402 = ((i_251_ * aHa_Sub2_5598.anInt7794 / i) + aHa_Sub2_5598.anInt7810)
                                class318_sub3.anInt6404 = (aHa_Sub2_5598.anInt7810 + (i_254_ * aHa_Sub2_5598.anInt7794 / i))
                                val i_255_ = ((i_249_.toFloat() * Class286_Sub8.aFloat6304) + ((Class320.aFloat3994 * aShort5629.toFloat()) + (((Class318_Sub9_Sub1.aFloat8784) * i_248_.toFloat()) + Class49.aFloat4720))).toInt()
                                class318_sub3.anInt6406 = (aHa_Sub2_5598.anInt7853 + (i_253_ * aHa_Sub2_5598.anInt7771 / i))
                                if (i_252_ >= aHa_Sub2_5598.anInt7826 || i_255_ >= (aHa_Sub2_5598.anInt7826)) {
                                    class318_sub3.aBoolean6401 = true
                                    class318_sub3.anInt6403 = (-(class318_sub3.anInt6405) + ((aHa_Sub2_5598.anInt7853) + ((aHa_Sub2_5598.anInt7771) * (aShort5634 + i_250_) / i)))
                                }
                            }
                            aHa_Sub2_5598.method3789((-122).toByte(), i.toFloat())
                            aHa_Sub2_5598.method3760(1)
                            aHa_Sub2_5598.method3758(false, class101_sub3_236_)
                            method677(127.toByte())
                            aHa_Sub2_5598.method3734(true)
                            method682(true)
                        }
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("paa.Q(" + (if (class101 != null) "{...}" else "null") + ',' + (if (class318_sub3 != null) "{...}" else "null") + ',' + i + ',' + i_235_ + ')'))
        }
    }

    public override fun da(): Int {
        anInt5636++
        return aShort5645.toInt()
    }

    public override fun NA(): Boolean {
        anInt5643++
        if (anIntArrayArray5539 == null) return false
        for (i in 0..<anInt5642) {
            anIntArray5543!![i] = anIntArray5543!![i] shl 4
            anIntArray5593!![i] = anIntArray5593!![i] shl 4
            anIntArray5644!![i] = anIntArray5644!![i] shl 4
        }
        Class221.anInt2880 = 0
        za.anInt7275 = 0
        Class181.anInt2398 = 0
        return true
    }

    public override fun RA(): Int {
        if (!aBoolean5527) method692((-123).toByte())
        anInt5587++
        return aShort5586.toInt()
    }

    public override fun G(): Int {
        anInt5631++
        if (!aBoolean5527) method692((-123).toByte())
        return aShort5646.toInt()
    }

    public override fun p(i: Int, i_256_: Int, var_s: s?, var_s_257_: s?, i_258_: Int, i_259_: Int, i_260_: Int) {
        do {
            try {
                anInt5532++
                if (!aBoolean5527) method692((-123).toByte())
                var i_261_ = aShort5540 + i_258_
                var i_262_ = i_258_ - -aShort5586
                var i_263_ = i_260_ - -aShort5617
                var i_264_ = aShort5646 + i_260_
                if ((i != 1 && i != 2 && i != 3 && i != 5) || (i_261_ >= 0 && (var_s!!.anInt4587 > (var_s.anInt4592 + i_262_ shr var_s.anInt4588)) && i_263_ >= 0 && (var_s.anInt4590 > (i_264_ - -var_s.anInt4592 shr var_s.anInt4588)))) {
                    if (i != 4 && i != 5) {
                        i_261_ = i_261_ shr var_s!!.anInt4588
                        i_262_ = (i_262_ - -var_s.anInt4592 - 1 shr var_s.anInt4588)
                        i_263_ = i_263_ shr var_s.anInt4588
                        i_264_ = (i_264_ + var_s.anInt4592 + -1 shr var_s.anInt4588)
                        if (i_259_ == var_s.method3982((-86).toByte(), i_263_, i_261_) && i_259_ == var_s.method3982((-86).toByte(), i_263_, i_262_) && i_259_ == var_s.method3982((-86).toByte(), i_264_, i_261_) && (var_s.method3982((-86).toByte(), i_264_, i_262_) == i_259_)) break
                    } else if (var_s_257_ == null || (i_261_ < 0 || (((i_262_ - -var_s_257_.anInt4592) shr var_s_257_.anInt4588) >= var_s_257_.anInt4587) || i_263_ < 0 || (var_s_257_.anInt4590 <= (var_s_257_.anInt4592 + i_264_ shr var_s_257_.anInt4588)))) break
                    if (i == 1) {
                        for (i_265_ in 0..<anInt5557) anIntArray5593!![i_265_] = (-i_259_ + anIntArray5593!![i_265_] + var_s!!.method3986((anIntArray5543!![i_265_] + i_258_), i_260_ + (anIntArray5644!![i_265_]), (-93).toByte()))
                    } else if (i == 2) {
                        val i_279_ = aShort5591.toInt()
                        if (i_279_ == 0) break
                        var i_280_ = 0
                        while (anInt5557 > i_280_) {
                            val i_281_ = ((anIntArray5593!![i_280_] shl 16) / i_279_)
                            if (i_281_ < i_256_) anIntArray5593!![i_280_] = (anIntArray5593!![i_280_] - -((-i_259_ + (var_s!!.method3986((anIntArray5543!![i_280_] - -i_258_), (i_260_ + anIntArray5644!![i_280_]), (-94).toByte()))) * (-i_281_ + i_256_) / i_256_))
                            i_280_++
                        }
                    } else if (i == 3) {
                        val i_266_ = (0xff and i_256_) * 4
                        val i_267_ = 4 * ((0xff0e and i_256_) shr 8)
                        val i_268_ = 0x3fc0 and (i_256_ shr 16 shl 6)
                        val i_269_ = (0xff and (i_256_ shr 24)) shl 6
                        if (i_258_ + -(i_266_ shr 1) < 0 || (((i_266_ shr 1) + (i_258_ - -var_s!!.anInt4592)) >= (var_s.anInt4587 shl var_s.anInt4588)) || -(i_267_ shr 1) + i_260_ < 0 || ((var_s.anInt4590 shl var_s.anInt4588) <= ((i_267_ shr 1) + i_260_ + var_s.anInt4592))) break
                        this.method626(i_266_, 10947, i_269_, i_258_, i_267_, i_259_, i_268_, var_s, i_260_)
                    } else if (i == 4) {
                        val i_277_ = aShort5629 - aShort5591
                        var i_278_ = 0
                        while (anInt5557 > i_278_) {
                            anIntArray5593!![i_278_] = (anIntArray5593!![i_278_] - (-(var_s_257_!!.method3986(anIntArray5543!![i_278_] + i_258_, anIntArray5644!![i_278_] + i_260_, 71.toByte())) - -i_259_ - i_277_))
                            i_278_++
                        }
                    } else if (i == 5) {
                        val i_270_ = -aShort5591 + aShort5629
                        var i_271_ = 0
                        while (anInt5557 > i_271_) {
                            val i_272_ = anIntArray5543!![i_271_] + i_258_
                            val i_273_ = anIntArray5644!![i_271_] + i_260_
                            val i_274_ = var_s!!.method3986(i_272_, i_273_, (-100).toByte())
                            val i_275_ = var_s_257_!!.method3986(i_272_, i_273_, 93.toByte())
                            val i_276_ = -i_256_ + i_274_ + -i_275_
                            anIntArray5593!![i_271_] = i_274_ + (-i_259_ + (((anIntArray5593!![i_271_] shl 8) / i_270_ * i_276_) shr 8))
                            i_271_++
                        }
                    }
                    aBoolean5527 = false
                    if (aClass123_5605 == null) break
                    aClass123_5605!!.anInterface2_1811 = null
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("paa.p(" + i + ',' + i_256_ + ',' + (if (var_s != null) "{...}" else "null") + ',' + (if (var_s_257_ != null) "{...}" else "null") + ',' + i_258_ + ',' + i_259_ + ',' + i_260_ + ')'))
            }
            break
        } while (false)
    }

    public override fun aa(i: Short, i_284_: Short) {
        anInt5590++
        val var_d = aHa_Sub2_5598!!.aD4579
        for (i_285_ in 0..<anInt5632) {
            if (aShortArray5601!![i_285_] == i) aShortArray5601!![i_285_] = i_284_
        }
        var i_286_: Byte = 0
        var i_287_: Byte = 0
        if (i.toInt() != -1) {
            val class12 = var_d!!.method3(0xffff and i.toInt(), -6662)
            i_287_ = class12!!.aByte216
            i_286_ = class12.aByte201
        }
        var i_288_: Byte = 0
        var i_289_: Byte = 0
        if (i_284_.toInt() != -1) {
            val class12 = var_d!!.method3(i_284_.toInt() and 0xffff, -6662)
            if (class12!!.aByte198.toInt() != 0 || class12.aByte211.toInt() != 0) aBoolean5638 = true
            i_288_ = class12.aByte201
            i_289_ = class12.aByte216
        }
        if ((i_287_ != i_289_) or (i_286_ != i_288_)) {
            if (aClass118Array5621 != null) {
                for (i_290_ in 0..<anInt5536) {
                    val class118 = aClass118Array5621!![i_290_]!!
                    val class48 = aClass48Array5596!![i_290_]!!
                    class48.anInt858 = ((0xffffff and (Class10.anIntArray179!![0xffff and (aShortArray5580!![class118.anInt1783]).toInt()])) or (class48.anInt858 and 0xffffff.inv()))
                }
            }
            if (aClass123_5610 != null) aClass123_5610!!.anInterface2_1811 = null
        }
    }

    private fun method688(i: Int, bool: Boolean) {
        anInt5588++
        var bool_291_ = (aClass123_5610 != null && aClass123_5610!!.anInterface2_1811 == null)
        var bool_292_ = (aClass123_5563 != null && aClass123_5563!!.anInterface2_1811 == null)
        var bool_293_ = (aClass123_5605 != null && aClass123_5605!!.anInterface2_1811 == null)
        var bool_294_ = (aClass123_5620 != null && aClass123_5620!!.anInterface2_1811 == null)
        if (bool) {
            bool_294_ = bool_294_ and ((aByte5581.toInt() and 0x8) != 0)
            bool_292_ = bool_292_ and ((aByte5581.toInt() and 0x4) != 0)
            bool_291_ = bool_291_ and ((0x2 and aByte5581.toInt()) != 0)
            bool_293_ = bool_293_ and ((0x1 and aByte5581.toInt()) != 0)
        }
        var i_295_: Byte = 0
        if (i == 5) {
            var i_296_: Byte = 0
            var i_297_: Byte = 0
            var i_298_: Byte = 0
            if (bool_293_) {
                i_296_ = i_295_
                i_295_ = (i_295_ + 12).toByte()
            }
            var i_299_: Byte = 0
            if (bool_291_) {
                i_297_ = i_295_
                i_295_ = (i_295_ + 4).toByte()
            }
            if (bool_292_) {
                i_298_ = i_295_
                i_295_ = (i_295_ + 12).toByte()
            }
            if (bool_294_) {
                i_299_ = i_295_
                i_295_ = (i_295_ + 8).toByte()
            }
            if (i_295_.toInt() != 0) {
                if (anInt5529 * i_295_ > (aHa_Sub2_5598!!.aClass348_Sub49_Sub1_7798!!.aByteArray7154)!!.size) aHa_Sub2_5598.aClass348_Sub49_Sub1_7798 = Class348_Sub49_Sub1(i_295_ * (100 + anInt5529))
                else aHa_Sub2_5598.aClass348_Sub49_Sub1_7798!!.anInt7197 = 0
                val class348_sub49_sub1: Class348_Sub49_Sub1 = aHa_Sub2_5598.aClass348_Sub49_Sub1_7798!!
                if (bool_293_) {
                    if (aHa_Sub2_5598.aBoolean7775) {
                        var i_300_ = 0
                        while (anInt5557 > i_300_) {
                            val i_301_ = (floatToRawIntBits(anIntArray5543!![i_300_].toFloat()))
                            val i_302_ = (floatToRawIntBits(anIntArray5593!![i_300_].toFloat()))
                            val i_303_ = (floatToRawIntBits(anIntArray5644!![i_300_].toFloat()))
                            val i_304_ = anIntArray5528!![i_300_]
                            val i_305_ = anIntArray5528!![i_300_ - -1]
                            for (i_306_ in i_304_..<i_305_) {
                                val i_307_ = -1 + aShortArray5649!![i_306_]
                                if (i_307_ == -1) break
                                class348_sub49_sub1.anInt7197 = i_295_ * i_307_
                                class348_sub49_sub1.writeInt(111.toByte(), i_301_)
                                class348_sub49_sub1.writeInt(109.toByte(), i_302_)
                                class348_sub49_sub1.writeInt(116.toByte(), i_303_)
                            }
                            i_300_++
                        }
                    } else {
                        var i_308_ = 0
                        while (anInt5557 > i_308_) {
                            val i_309_ = (floatToRawIntBits(anIntArray5543!![i_308_].toFloat()))
                            val i_310_ = (floatToRawIntBits(anIntArray5593!![i_308_].toFloat()))
                            val i_311_ = (floatToRawIntBits(anIntArray5644!![i_308_].toFloat()))
                            val i_312_ = anIntArray5528!![i_308_]
                            val i_313_ = anIntArray5528!![1 + i_308_]
                            for (i_314_ in i_312_..<i_313_) {
                                val i_315_ = -1 + aShortArray5649!![i_314_]
                                if (i_315_ == -1) break
                                class348_sub49_sub1.anInt7197 = i_295_ * i_315_
                                class348_sub49_sub1.method3394(-23892, i_309_)
                                class348_sub49_sub1.method3394(i + -23897, i_310_)
                                class348_sub49_sub1.method3394(-23892, i_311_)
                            }
                            i_308_++
                        }
                    }
                }
                if (bool_291_) {
                    if (aClass123_5563 == null) {
                        val `is`: ShortArray?
                        val is_316_: ByteArray?
                        val is_317_: ShortArray?
                        val is_318_: ShortArray?
                        if (aClass139_5572 == null) {
                            `is` = aShortArray5576
                            is_316_ = aByteArray5594
                            is_317_ = aShortArray5583
                            is_318_ = aShortArray5564
                        } else {
                            is_318_ = aClass139_5572!!.aShortArray1954
                            `is` = aClass139_5572!!.aShortArray1953
                            is_317_ = aClass139_5572!!.aShortArray1951
                            is_316_ = aClass139_5572!!.aByteArray1948
                        }
                        val f = aHa_Sub2_5598.aFloatArray7825[0]
                        val f_319_ = aHa_Sub2_5598.aFloatArray7825[1]
                        val f_320_ = aHa_Sub2_5598.aFloatArray7825[2]
                        val f_321_ = aHa_Sub2_5598.aFloat7768
                        val f_322_ = (aHa_Sub2_5598.aFloat7832 * 768.0f / aShort5645.toFloat())
                        val f_323_ = (aHa_Sub2_5598.aFloat7871 * 768.0f / aShort5645.toFloat())
                        var i_324_ = 0
                        while (anInt5632 > i_324_) {
                            val i_325_ = method680(19995, aShort5544.toInt(), aByteArray5542!![i_324_], aShortArray5601!![i_324_], aShortArray5580!![i_324_].toInt())
                            val f_326_ = (aHa_Sub2_5598.aFloat7781 * (i_325_ ushr 24).toFloat())
                            val f_327_ = ((0xff and (i_325_ shr 8)).toFloat() * aHa_Sub2_5598.aFloat7823)
                            val f_328_ = (((0xff88e4 and i_325_) shr 16).toFloat() * aHa_Sub2_5598.aFloat7816)
                            var i_329_ = aShortArray5592!![i_324_].toInt()
                            var i_330_ = is_316_!![i_329_].toShort()
                            var f_331_: Float
                            if (i_330_.toInt() != 0) f_331_ = ((f_319_ * is_317_!![i_329_].toFloat() + f * is_318_!![i_329_].toFloat() + f_320_ * `is`!![i_329_].toFloat()) / (256 * i_330_).toFloat())
                            else f_331_ = (0.0026041667f * (`is`!![i_329_].toFloat() * f_320_ + (f * is_318_!![i_329_].toFloat() + (is_317_!![i_329_].toFloat() * f_319_))))
                            var f_332_ = f_321_ + f_331_ * (if (!(f_331_ < 0.0f)) f_322_ else f_323_)
                            var i_333_ = (f_332_ * f_326_).toInt()
                            var i_334_ = (f_332_ * f_328_).toInt()
                            if (i_333_ >= 0) {
                                if (i_333_ > 255) i_333_ = 255
                            } else i_333_ = 0
                            var i_335_ = (f_332_ * f_327_).toInt()
                            if (i_334_ >= 0) {
                                if (i_334_ > 255) i_334_ = 255
                            } else i_334_ = 0
                            class348_sub49_sub1.anInt7197 = i_329_ * i_295_ + i_297_
                            if (i_335_ < 0) i_335_ = 0
                            else if (i_335_ > 255) i_335_ = 255
                            class348_sub49_sub1.writeByte(false, i_333_)
                            class348_sub49_sub1.writeByte(false, i_334_)
                            class348_sub49_sub1.writeByte(false, i_335_)
                            class348_sub49_sub1.writeByte(false, (255 + -((aByteArray5542!![i_324_]).toInt() and 0xff)))
                            i_329_ = aShortArray5579!![i_324_].toInt()
                            i_330_ = is_316_[i_329_].toShort()
                            if (i_330_.toInt() != 0) f_331_ = ((`is`[i_329_].toFloat() * f_320_ + (f * is_318_[i_329_].toFloat() + is_317_[i_329_].toFloat() * f_319_)) / (i_330_ * 256).toFloat())
                            else f_331_ = ((f * is_318_[i_329_].toFloat() + is_317_[i_329_].toFloat() * f_319_ + f_320_ * `is`[i_329_].toFloat()) * 0.0026041667f)
                            f_332_ = f_321_ + f_331_ * (if (f_331_ < 0.0f) f_323_ else f_322_)
                            i_333_ = (f_326_ * f_332_).toInt()
                            i_334_ = (f_332_ * f_328_).toInt()
                            if (i_333_ < 0) i_333_ = 0
                            else if (i_333_ > 255) i_333_ = 255
                            if (i_334_ < 0) i_334_ = 0
                            else if (i_334_ > 255) i_334_ = 255
                            i_335_ = (f_332_ * f_327_).toInt()
                            class348_sub49_sub1.anInt7197 = i_297_ - -(i_329_ * i_295_)
                            if (i_335_ < 0) i_335_ = 0
                            else if (i_335_ > 255) i_335_ = 255
                            class348_sub49_sub1.writeByte(false, i_333_)
                            class348_sub49_sub1.writeByte(false, i_334_)
                            class348_sub49_sub1.writeByte(false, i_335_)
                            class348_sub49_sub1.writeByte(false, 255 - (aByteArray5542!![i_324_].toInt() and 0xff))
                            i_329_ = aShortArray5566!![i_324_].toInt()
                            i_330_ = is_316_[i_329_].toShort()
                            if (i_330_.toInt() != 0) f_331_ = ((`is`[i_329_].toFloat() * f_320_ + (is_317_[i_329_].toFloat() * f_319_ + is_318_[i_329_].toFloat() * f)) / (256 * i_330_).toFloat())
                            else f_331_ = (0.0026041667f * (`is`[i_329_].toFloat() * f_320_ + (is_317_[i_329_].toFloat() * f_319_ + f * is_318_[i_329_].toFloat())))
                            f_332_ = f_321_ + (if (!(f_331_ < 0.0f)) f_322_ else f_323_) * f_331_
                            i_333_ = (f_332_ * f_326_).toInt()
                            i_334_ = (f_332_ * f_328_).toInt()
                            if (i_333_ >= 0) {
                                if (i_333_ > 255) i_333_ = 255
                            } else i_333_ = 0
                            if (i_334_ >= 0) {
                                if (i_334_ > 255) i_334_ = 255
                            } else i_334_ = 0
                            i_335_ = (f_327_ * f_332_).toInt()
                            if (i_335_ >= 0) {
                                if (i_335_ > 255) i_335_ = 255
                            } else i_335_ = 0
                            class348_sub49_sub1.anInt7197 = i_295_ * i_329_ + i_297_
                            class348_sub49_sub1.writeByte(false, i_333_)
                            class348_sub49_sub1.writeByte(false, i_334_)
                            class348_sub49_sub1.writeByte(false, i_335_)
                            class348_sub49_sub1.writeByte(false, (-(0xff and (aByteArray5542!![i_324_]).toInt()) + 255))
                            i_324_++
                        }
                    } else {
                        for (i_336_ in 0..<anInt5632) {
                            val i_337_ = method680(i + 19990, aShort5544.toInt(), aByteArray5542!![i_336_], aShortArray5601!![i_336_], aShortArray5580!![i_336_].toInt())
                            class348_sub49_sub1.anInt7197 = i_297_ + aShortArray5592!![i_336_] * i_295_
                            class348_sub49_sub1.writeInt(105.toByte(), i_337_)
                            class348_sub49_sub1.anInt7197 = i_297_ - -(aShortArray5579!![i_336_] * i_295_)
                            class348_sub49_sub1.writeInt(87.toByte(), i_337_)
                            class348_sub49_sub1.anInt7197 = i_297_ - -(i_295_ * aShortArray5566!![i_336_])
                            class348_sub49_sub1.writeInt(120.toByte(), i_337_)
                        }
                    }
                }
                if (bool_292_) {
                    val `is`: ByteArray?
                    val is_338_: ShortArray?
                    val is_339_: ShortArray?
                    val is_340_: ShortArray?
                    if (aClass139_5572 == null) {
                        is_340_ = aShortArray5564
                        is_338_ = aShortArray5583
                        `is` = aByteArray5594
                        is_339_ = aShortArray5576
                    } else {
                        `is` = aClass139_5572!!.aByteArray1948
                        is_338_ = aClass139_5572!!.aShortArray1951
                        is_339_ = aClass139_5572!!.aShortArray1953
                        is_340_ = aClass139_5572!!.aShortArray1954
                    }
                    val f = 3.0f / aShort5645.toFloat()
                    class348_sub49_sub1.anInt7197 = i_298_.toInt()
                    val f_341_ = 3.0f / (aShort5645 / 2 + aShort5645).toFloat()
                    if (aHa_Sub2_5598.aBoolean7775) {
                        var i_345_ = 0
                        while (anInt5529 > i_345_) {
                            val i_346_ = `is`!![i_345_].toInt() and 0xff
                            if (i_346_ == 0) {
                                class348_sub49_sub1.method3400(f_341_ * is_340_!![i_345_].toFloat(), (-96).toByte())
                                class348_sub49_sub1.method3400(is_338_!![i_345_].toFloat() * f_341_, (-101).toByte())
                                class348_sub49_sub1.method3400(f_341_ * is_339_!![i_345_].toFloat(), (-95).toByte())
                            } else {
                                val f_347_ = f / i_346_.toFloat()
                                class348_sub49_sub1.method3400(is_340_!![i_345_].toFloat() * f_347_, (-102).toByte())
                                class348_sub49_sub1.method3400(f_347_ * is_338_!![i_345_].toFloat(), (-127).toByte())
                                class348_sub49_sub1.method3400(is_339_!![i_345_].toFloat() * f_347_, (-84).toByte())
                            }
                            class348_sub49_sub1.anInt7197 += -12 + i_295_
                            i_345_++
                        }
                    } else {
                        for (i_342_ in 0..<anInt5529) {
                            val i_343_ = 0xff and `is`!![i_342_].toInt()
                            if (i_343_ == 0) {
                                class348_sub49_sub1.method3399(18291, is_340_!![i_342_].toFloat() * f_341_)
                                class348_sub49_sub1.method3399(18291, is_338_!![i_342_].toFloat() * f_341_)
                                class348_sub49_sub1.method3399(i + 18286, f_341_ * is_339_!![i_342_].toFloat())
                            } else {
                                val f_344_ = f / i_343_.toFloat()
                                class348_sub49_sub1.method3399(i xor 0x4776, is_340_!![i_342_].toFloat() * f_344_)
                                class348_sub49_sub1.method3399(18291, f_344_ * is_338_!![i_342_].toFloat())
                                class348_sub49_sub1.method3399(18291, f_344_ * is_339_!![i_342_].toFloat())
                            }
                            class348_sub49_sub1.anInt7197 += -12 + i_295_
                        }
                    }
                }
                if (bool_294_) {
                    class348_sub49_sub1.anInt7197 = i_299_.toInt()
                    if (aHa_Sub2_5598.aBoolean7775) {
                        for (i_348_ in 0..<anInt5529) {
                            class348_sub49_sub1.method3400((aFloatArray5552!![i_348_]), (-127).toByte())
                            class348_sub49_sub1.method3400((aFloatArray5571!![i_348_]), (-126).toByte())
                            class348_sub49_sub1.anInt7197 += i_295_ + -8
                        }
                    } else {
                        for (i_349_ in 0..<anInt5529) {
                            class348_sub49_sub1.method3399(i xor 0x4776, (aFloatArray5552!![i_349_]))
                            class348_sub49_sub1.method3399(18291, aFloatArray5571!![i_349_])
                            class348_sub49_sub1.anInt7197 += -8 + i_295_
                        }
                    }
                }
                class348_sub49_sub1.anInt7197 = anInt5529 * i_295_
                val interface2: Interface2?
                if (bool) {
                    if (anInterface2_5554 != null) anInterface2_5554!!.method11(i_295_.toInt(), class348_sub49_sub1.anInt7197, (class348_sub49_sub1.aByteArray7154), -9894)
                    else anInterface2_5554 = aHa_Sub2_5598.method3731(2, true, i_295_.toInt(), (class348_sub49_sub1.aByteArray7154), (class348_sub49_sub1.anInt7197))
                    interface2 = anInterface2_5554
                    aByte5581 = 0.toByte()
                } else {
                    interface2 = aHa_Sub2_5598.method3731(2, false, i_295_.toInt(), (class348_sub49_sub1.aByteArray7154), (class348_sub49_sub1.anInt7197))
                    aBoolean5555 = true
                }
                if (bool_293_) {
                    aClass123_5605!!.aByte1812 = i_296_
                    aClass123_5605!!.anInterface2_1811 = interface2
                }
                if (bool_294_) {
                    aClass123_5620!!.aByte1812 = i_299_
                    aClass123_5620!!.anInterface2_1811 = interface2
                }
                if (bool_291_) {
                    aClass123_5610!!.aByte1812 = i_297_
                    aClass123_5610!!.anInterface2_1811 = interface2
                }
                if (bool_292_) {
                    aClass123_5563!!.aByte1812 = i_298_
                    aClass123_5563!!.anInterface2_1811 = interface2
                }
            }
        }
    }

    public override fun method615(class101: Class101?, class318_sub3: Class318_Sub3?, i: Int) {
        try {
            anInt5611++
            if (anInt5529 != 0) {
                val class101_sub3 = aHa_Sub2_5598!!.aClass101_Sub3_7760
                if (!aBoolean5527) method692((-123).toByte())
                val class101_sub3_350_ = class101 as Class101_Sub3
                Class320.aFloat3994 = ((class101_sub3_350_.aFloat5754 * class101_sub3.aFloat5784) + ((class101_sub3_350_.aFloat5750 * class101_sub3.aFloat5756) + (class101_sub3_350_.aFloat5769 * class101_sub3.aFloat5754)))
                Class49.aFloat4720 = (class101_sub3.aFloat5751 + ((class101_sub3.aFloat5756 * class101_sub3_350_.aFloat5747) + (class101_sub3_350_.aFloat5772 * class101_sub3.aFloat5754) + (class101_sub3_350_.aFloat5751 * class101_sub3.aFloat5784)))
                val f = (Class49.aFloat4720 + Class320.aFloat3994 * aShort5591.toFloat())
                val f_351_ = (Class320.aFloat3994 * aShort5629.toFloat() + Class49.aFloat4720)
                val f_352_: Float
                val f_353_: Float
                if (f > f_351_) {
                    f_352_ = f_351_ - aShort5634.toFloat()
                    f_353_ = f + aShort5634.toFloat()
                } else {
                    f_352_ = -aShort5634.toFloat() + f
                    f_353_ = f_351_ + aShort5634.toFloat()
                }
                if (!(aHa_Sub2_5598.aFloat7874 <= f_352_) && !(aHa_Sub2_5598.anInt7826.toFloat() >= f_353_)) {
                    Class299_Sub1_Sub1.aFloat8696 = ((class101_sub3.aFloat5750 * class101_sub3_350_.aFloat5769) + (class101_sub3_350_.aFloat5750 * class101_sub3.aFloat5770) + (class101_sub3.aFloat5781 * (class101_sub3_350_.aFloat5754)))
                    Class190.aFloat2555 = (class101_sub3.aFloat5747 + ((class101_sub3.aFloat5781 * (class101_sub3_350_.aFloat5751)) + ((class101_sub3.aFloat5770 * (class101_sub3_350_.aFloat5747)) + ((class101_sub3_350_.aFloat5772) * (class101_sub3.aFloat5750)))))
                    val f_354_ = (aShort5591.toFloat() * Class299_Sub1_Sub1.aFloat8696 + Class190.aFloat2555)
                    val f_355_ = (aShort5629.toFloat() * Class299_Sub1_Sub1.aFloat8696 + Class190.aFloat2555)
                    val f_356_: Float
                    val f_357_: Float
                    if (f_354_ > f_355_) {
                        f_356_ = (aHa_Sub2_5598.anInt7771.toFloat() * (-aShort5634.toFloat() + f_355_))
                        f_357_ = (aHa_Sub2_5598.anInt7771.toFloat() * (aShort5634.toFloat() + f_354_))
                    } else {
                        f_357_ = (aHa_Sub2_5598.anInt7771.toFloat() * (f_355_ + aShort5634.toFloat()))
                        f_356_ = ((-aShort5634.toFloat() + f_354_) * aHa_Sub2_5598.anInt7771.toFloat())
                    }
                    if (!(aHa_Sub2_5598.aFloat7835 <= f_356_ / f_353_) && !(f_357_ / f_353_ <= aHa_Sub2_5598.aFloat7872)) {
                        Class156.aFloat2111 = ((class101_sub3_350_.aFloat5772 * class101_sub3.aFloat5769) + ((class101_sub3_350_.aFloat5747) * class101_sub3.aFloat5761) + (class101_sub3.aFloat5762 * (class101_sub3_350_.aFloat5751)) + class101_sub3.aFloat5772)
                        Class252.aFloat3242 = ((class101_sub3.aFloat5761 * (class101_sub3_350_.aFloat5750)) + (class101_sub3.aFloat5769 * (class101_sub3_350_.aFloat5769)) + (class101_sub3.aFloat5762 * (class101_sub3_350_.aFloat5754)))
                        val f_358_ = (Class156.aFloat2111 + Class252.aFloat3242 * aShort5591.toFloat())
                        val f_359_ = (Class156.aFloat2111 + aShort5629.toFloat() * Class252.aFloat3242)
                        val f_360_: Float
                        val f_361_: Float
                        if (f_358_ > f_359_) {
                            f_360_ = ((aShort5634.toFloat() + f_358_) * (aHa_Sub2_5598.anInt7794).toFloat())
                            f_361_ = (aHa_Sub2_5598.anInt7794.toFloat() * (f_359_ - aShort5634.toFloat()))
                        } else {
                            f_360_ = ((aShort5634.toFloat() + f_359_) * (aHa_Sub2_5598.anInt7794).toFloat())
                            f_361_ = (aHa_Sub2_5598.anInt7794.toFloat() * (f_358_ - aShort5634.toFloat()))
                        }
                        if (!(f_361_ / f_353_ >= aHa_Sub2_5598.aFloat7830) && !(aHa_Sub2_5598.aFloat7836 >= f_360_ / f_353_)) {
                            if (class318_sub3 != null || aClass118Array5621 != null) {
                                Class286_Sub8.aFloat6304 = (((class101_sub3_350_.aFloat5762) * (class101_sub3.aFloat5754)) + ((class101_sub3_350_.aFloat5781) * (class101_sub3.aFloat5756)) + ((class101_sub3_350_.aFloat5784) * (class101_sub3.aFloat5784)))
                                Class318_Sub9_Sub1.aFloat8784 = (((class101_sub3.aFloat5784) * (class101_sub3_350_.aFloat5756)) + ((class101_sub3_350_.aFloat5770 * (class101_sub3.aFloat5756)) + ((class101_sub3.aFloat5754) * (class101_sub3_350_.aFloat5761))))
                                Class313.aFloat3935 = (((class101_sub3.aFloat5781) * (class101_sub3_350_.aFloat5784)) + ((class101_sub3_350_.aFloat5762 * (class101_sub3.aFloat5750)) + (class101_sub3_350_.aFloat5781 * (class101_sub3.aFloat5770))))
                                Class314.aFloat3943 = (((class101_sub3.aFloat5761) * (class101_sub3_350_.aFloat5770)) + ((class101_sub3_350_.aFloat5761) * (class101_sub3.aFloat5769)) + ((class101_sub3_350_.aFloat5756) * (class101_sub3.aFloat5762)))
                                Class167.aFloat2203 = (((class101_sub3_350_.aFloat5761) * (class101_sub3.aFloat5750)) + ((class101_sub3.aFloat5770) * class101_sub3_350_.aFloat5770) + ((class101_sub3.aFloat5781) * class101_sub3_350_.aFloat5756))
                                Class215.aFloat2836 = (((class101_sub3_350_.aFloat5784) * (class101_sub3.aFloat5762)) + (((class101_sub3.aFloat5769) * class101_sub3_350_.aFloat5762) + ((class101_sub3.aFloat5761) * (class101_sub3_350_.aFloat5781))))
                            }
                            if (class318_sub3 != null) {
                                var bool = false
                                var bool_362_ = true
                                val i_363_ = aShort5540 - -aShort5586 shr 1
                                val i_364_ = aShort5617 - -aShort5646 shr 1
                                val i_365_ = ((i_364_.toFloat() * Class313.aFloat3935) + ((Class167.aFloat2203 * i_363_.toFloat()) + Class190.aFloat2555 + (aShort5591.toFloat() * (Class299_Sub1_Sub1.aFloat8696)))).toInt()
                                val i_366_ = (Class156.aFloat2111 + (i_363_.toFloat() * Class314.aFloat3943) + (aShort5591.toFloat() * Class252.aFloat3242) + (i_364_.toFloat() * Class215.aFloat2836)).toInt()
                                val i_367_ = ((Class318_Sub9_Sub1.aFloat8784 * i_363_.toFloat()) + Class49.aFloat4720 + (Class320.aFloat3994 * aShort5591.toFloat()) + (Class286_Sub8.aFloat6304 * i_364_.toFloat())).toInt()
                                if (aHa_Sub2_5598.anInt7826 <= i_367_) {
                                    class318_sub3.anInt6405 = (i_365_ * (aHa_Sub2_5598.anInt7771) / i_367_ + (aHa_Sub2_5598.anInt7853))
                                    class318_sub3.anInt6402 = (i_366_ * (aHa_Sub2_5598.anInt7794) / i_367_ + (aHa_Sub2_5598.anInt7810))
                                } else bool = true
                                val i_368_ = (Class190.aFloat2555 + (Class167.aFloat2203 * i_363_.toFloat()) + (Class299_Sub1_Sub1.aFloat8696 * aShort5629.toFloat()) + (Class313.aFloat3935 * i_364_.toFloat())).toInt()
                                val i_369_ = ((i_364_.toFloat() * Class215.aFloat2836) + ((Class252.aFloat3242 * aShort5629.toFloat()) + (Class156.aFloat2111 + (Class314.aFloat3943 * i_363_.toFloat())))).toInt()
                                val i_370_ = ((Class286_Sub8.aFloat6304 * i_364_.toFloat()) + ((i_363_.toFloat() * (Class318_Sub9_Sub1.aFloat8784)) + Class49.aFloat4720 + (aShort5629.toFloat() * Class320.aFloat3994))).toInt()
                                if (i_370_ >= aHa_Sub2_5598.anInt7826) {
                                    class318_sub3.anInt6406 = (i_368_ * (aHa_Sub2_5598.anInt7771) / i_370_ + (aHa_Sub2_5598.anInt7853))
                                    class318_sub3.anInt6404 = (i_369_ * (aHa_Sub2_5598.anInt7794) / i_370_ + (aHa_Sub2_5598.anInt7810))
                                } else bool = true
                                if (bool) {
                                    if ((aHa_Sub2_5598.anInt7826 <= i_367_) || ((aHa_Sub2_5598.anInt7826) <= i_370_)) {
                                        if (i_367_ < (aHa_Sub2_5598.anInt7826)) {
                                            val i_371_ = ((-(aHa_Sub2_5598.anInt7826) + i_370_ shl 16) / (i_370_ + -i_367_))
                                            val i_372_ = (((-i_365_ + i_368_) * i_371_ shr 16) + i_368_)
                                            class318_sub3.anInt6405 = ((aHa_Sub2_5598.anInt7853) - -(i_372_ * (aHa_Sub2_5598.anInt7771) / (aHa_Sub2_5598.anInt7826)))
                                            val i_373_ = ((i_371_ * (i_369_ - i_366_) shr 16) + i_369_)
                                            class318_sub3.anInt6402 = ((i_373_ * aHa_Sub2_5598.anInt7794 / (aHa_Sub2_5598.anInt7826)) + (aHa_Sub2_5598.anInt7810))
                                        } else if (i_370_ < (aHa_Sub2_5598.anInt7826)) {
                                            val i_374_ = ((-(aHa_Sub2_5598.anInt7826) + i_367_ shl 16) / (i_367_ - i_370_))
                                            val i_375_ = (i_365_ - -(i_374_ * (-i_368_ + i_365_) shr 16))
                                            val i_376_ = (((i_366_ - i_369_) * i_374_ shr 16) + i_366_)
                                            class318_sub3.anInt6405 = ((i_375_ * aHa_Sub2_5598.anInt7771 / (aHa_Sub2_5598.anInt7826)) + (aHa_Sub2_5598.anInt7853))
                                            class318_sub3.anInt6402 = ((aHa_Sub2_5598.anInt7810) + (aHa_Sub2_5598.anInt7794 * i_376_ / (aHa_Sub2_5598.anInt7826)))
                                        }
                                    } else bool_362_ = false
                                }
                                if (bool_362_) {
                                    if (i_370_ < i_367_) class318_sub3.anInt6403 = ((aHa_Sub2_5598.anInt7853) + ((aHa_Sub2_5598.anInt7771) * (i_365_ - -aShort5634) / i_367_) - class318_sub3.anInt6405)
                                    else class318_sub3.anInt6403 = ((aHa_Sub2_5598.anInt7853) - -((aHa_Sub2_5598.anInt7771) * (aShort5634 + i_368_) / i_370_) + -class318_sub3.anInt6406)
                                    class318_sub3.aBoolean6401 = true
                                }
                            }
                            aHa_Sub2_5598.method3784((-62).toByte())
                            aHa_Sub2_5598.method3758(false, class101_sub3_350_)
                            method677(127.toByte())
                            aHa_Sub2_5598.method3734(true)
                            method682(true)
                        }
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("paa.KA(" + (if (class101 != null) "{...}" else "null") + ',' + (if (class318_sub3 != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    public override fun WA(): Int {
        anInt5545++
        return aShort5544.toInt()
    }

    private fun method691(i: Byte) {
        anInt5531++
        if (aBoolean5555) {
            aBoolean5555 = false
            if (aClass129Array5640 == null && aClass342Array5541 == null && aClass118Array5621 == null) {
                if (anIntArray5543 != null && !Class337.method2659(123.toByte(), anInt5648, anInt5556)) {
                    if (aClass123_5605 == null || (aClass123_5605!!.anInterface2_1811 != null)) {
                        if (!aBoolean5527) method692((-123).toByte())
                        anIntArray5543 = null
                    } else aBoolean5555 = true
                }
                if (anIntArray5593 != null && !method3999(anInt5556, anInt5648, 458752)) {
                    if (aClass123_5605 != null && (aClass123_5605!!.anInterface2_1811 == null)) aBoolean5555 = true
                    else {
                        if (!aBoolean5527) method692((-123).toByte())
                        anIntArray5593 = null
                    }
                }
                if (anIntArray5644 != null && !Class153.method1221(-3157, anInt5648, anInt5556)) {
                    if (aClass123_5605 == null || (aClass123_5605!!.anInterface2_1811 != null)) {
                        if (!aBoolean5527) method692((-123).toByte())
                        anIntArray5644 = null
                    } else aBoolean5555 = true
                }
            }
            if (aShortArray5649 != null && anIntArray5543 == null && anIntArray5593 == null && anIntArray5644 == null) {
                aShortArray5649 = null
                anIntArray5528 = null
            }
            if (aByteArray5594 != null && !Class105_Sub1.method989(anInt5648, -385, anInt5556)) {
                if (aClass123_5563 == null) {
                    if (aClass123_5610 == null || (aClass123_5610!!.anInterface2_1811 != null)) {
                        aByteArray5594 = null
                        aShortArray5576 = null
                        aShortArray5583 = aShortArray5576
                        aShortArray5564 = aShortArray5583
                    } else aBoolean5555 = true
                } else if (aClass123_5563!!.anInterface2_1811 == null) aBoolean5555 = true
                else {
                    aByteArray5594 = null
                    aShortArray5576 = null
                    aShortArray5583 = aShortArray5576
                    aShortArray5564 = aShortArray5583
                }
            }
            if (aShortArray5580 != null && !Class315.method2358(-116, anInt5648, anInt5556)) {
                if (aClass123_5610 == null || aClass123_5610!!.anInterface2_1811 != null) aShortArray5580 = null
                else aBoolean5555 = true
            }
            if (aByteArray5542 != null && !method1846(anInt5556, anInt5648, 74)) {
                if (aClass123_5610 == null || aClass123_5610!!.anInterface2_1811 != null) aByteArray5542 = null
                else aBoolean5555 = true
            }
            if (aFloatArray5552 != null && !Class98.method877(anInt5648, anInt5556, (-127).toByte())) {
                if (aClass123_5620 != null && aClass123_5620!!.anInterface2_1811 == null) aBoolean5555 = true
                else {
                    aFloatArray5571 = null
                    aFloatArray5552 = aFloatArray5571
                }
            }
            val i_380_ = -117 / ((69 - i) / 41)
            if (aShortArray5601 != null && !method3100(anInt5556, false, anInt5648)) {
                if (aClass123_5610 != null && aClass123_5610!!.anInterface2_1811 == null) aBoolean5555 = true
                else aShortArray5601 = null
            }
            if (aShortArray5592 != null && !Class69.method724(anInt5648, anInt5556, 393216)) {
                if ((aClass270_5575 != null && aClass270_5575!!.anInterface8_3463 == null) || aClass123_5610 != null && (aClass123_5610!!.anInterface2_1811) == null) aBoolean5555 = true
                else {
                    aShortArray5566 = null
                    aShortArray5579 = aShortArray5566
                    aShortArray5592 = aShortArray5579
                }
            }
            if (anIntArrayArray5553 != null && !method371(anInt5648, 256, anInt5556)) {
                aShortArray5573 = null
                anIntArrayArray5553 = null
            }
            if (anIntArrayArray5539 != null && !Class312.method2332(anInt5556, 124.toByte(), anInt5648)) {
                anIntArrayArray5539 = null
                aShortArray5608 = null
            }
            if (anIntArrayArray5627 != null && !Class229.method1633(false, anInt5648, anInt5556)) anIntArrayArray5627 = null
            if (anIntArray5626 != null && (anInt5648 and 0x800) == 0 && (anInt5648 and 0x40000) == 0) anIntArray5626 = null
        }
    }

    public override fun method621() {
        anInt5606++
    }

    public override fun ia(i: Short, i_381_: Short) {
        anInt5603++
        var i_382_ = 0
        while (anInt5632 > i_382_) {
            if (i == aShortArray5580!![i_382_]) aShortArray5580!![i_382_] = i_381_
            i_382_++
        }
        if (aClass118Array5621 != null) {
            for (i_383_ in 0..<anInt5536) {
                val class118 = aClass118Array5621!![i_383_]!!
                val class48 = aClass48Array5596!![i_383_]!!
                class48.anInt858 = ((Class10.anIntArray179!![(aShortArray5580!![class118.anInt1783].toInt() and 0xffff)]) and 0xffffff or (0xffffff.inv() and class48.anInt858))
            }
        }
        if (aClass123_5610 != null) aClass123_5610!!.anInterface2_1811 = null
    }

    public override fun method619(): Array<Class129?>? {
        anInt5625++
        return aClass129Array5640
    }

    public override fun method604(): Array<Class342?>? {
        anInt5569++
        return aClass342Array5541
    }

    public override fun V(): Int {
        anInt5607++
        if (!aBoolean5527) method692((-123).toByte())
        return aShort5540.toInt()
    }

    public override fun r(): Boolean {
        anInt5624++
        return aBoolean5638
    }

    public override fun method620(class101: Class101?) {
        do {
            try {
                anInt5548++
                val class101_sub3 = class101 as Class101_Sub3
                if (aClass129Array5640 != null) {
                    for (i in aClass129Array5640!!.indices) {
                        val class129 = aClass129Array5640!![i]!!
                        var class129_384_: Class129? = class129
                        if (class129.aClass129_1888 != null) class129_384_ = class129.aClass129_1888
                        class129_384_!!.anInt1882 = (class101_sub3.aFloat5747 + (((anIntArray5593!![(class129.anInt1881)]).toFloat() * (class101_sub3.aFloat5750)) + ((class101_sub3.aFloat5770) * (anIntArray5543!![(class129.anInt1881)]).toFloat()) + ((anIntArray5644!![(class129.anInt1881)]).toFloat() * (class101_sub3.aFloat5781)))).toInt()
                        class129_384_.anInt1891 = (class101_sub3.aFloat5772 + (((anIntArray5593!![(class129.anInt1881)]).toFloat() * (class101_sub3.aFloat5769)) + ((class101_sub3.aFloat5761) * (anIntArray5543!![(class129.anInt1881)]).toFloat()) + ((anIntArray5644!![(class129.anInt1881)]).toFloat() * (class101_sub3.aFloat5762)))).toInt()
                        class129_384_.anInt1889 = (class101_sub3.aFloat5751 + (((anIntArray5543!![(class129.anInt1881)]).toFloat() * (class101_sub3.aFloat5756)) + ((class101_sub3.aFloat5754) * (anIntArray5593!![(class129.anInt1881)]).toFloat()) + ((anIntArray5644!![(class129.anInt1881)]).toFloat() * (class101_sub3.aFloat5784)))).toInt()
                        class129_384_.anInt1883 = (class101_sub3.aFloat5747 + (((class101_sub3.aFloat5770) * (anIntArray5543!![(class129.anInt1877)]).toFloat()) + ((anIntArray5593!![(class129.anInt1877)]).toFloat() * (class101_sub3.aFloat5750)) + ((anIntArray5644!![(class129.anInt1877)]).toFloat() * (class101_sub3.aFloat5781)))).toInt()
                        class129_384_.anInt1890 = (class101_sub3.aFloat5772 + (((class101_sub3.aFloat5762) * (anIntArray5644!![(class129.anInt1877)]).toFloat()) + (((anIntArray5543!![(class129.anInt1877)]).toFloat() * (class101_sub3.aFloat5761)) + ((anIntArray5593!![(class129.anInt1877)]).toFloat() * class101_sub3.aFloat5769)))).toInt()
                        class129_384_.anInt1880 = (class101_sub3.aFloat5751 + (((class101_sub3.aFloat5784) * (anIntArray5644!![(class129.anInt1877)]).toFloat()) + (((class101_sub3.aFloat5754) * (anIntArray5593!![(class129.anInt1877)]).toFloat()) + ((anIntArray5543!![(class129.anInt1877)]).toFloat() * class101_sub3.aFloat5756)))).toInt()
                        class129_384_.anInt1876 = (class101_sub3.aFloat5747 + (((anIntArray5593!![(class129.anInt1892)]).toFloat() * (class101_sub3.aFloat5750)) + ((anIntArray5543!![(class129.anInt1892)]).toFloat() * (class101_sub3.aFloat5770)) + ((class101_sub3.aFloat5781) * (anIntArray5644!![(class129.anInt1892)]).toFloat()))).toInt()
                        class129_384_.anInt1874 = (class101_sub3.aFloat5772 + (((anIntArray5644!![(class129.anInt1892)]).toFloat() * (class101_sub3.aFloat5762)) + (((class101_sub3.aFloat5761) * (anIntArray5543!![(class129.anInt1892)]).toFloat()) + ((class101_sub3.aFloat5769) * (anIntArray5593!![(class129.anInt1892)]).toFloat())))).toInt()
                        class129_384_.anInt1884 = (((class101_sub3.aFloat5754) * (anIntArray5593!![(class129.anInt1892)]).toFloat()) + ((class101_sub3.aFloat5756) * (anIntArray5543!![(class129.anInt1892)]).toFloat()) + ((anIntArray5644!![(class129.anInt1892)]).toFloat() * (class101_sub3.aFloat5784)) + (class101_sub3.aFloat5751)).toInt()
                    }
                }
                if (aClass342Array5541 == null) break
                var i = 0
                while (aClass342Array5541!!.size > i) {
                    val class342 = aClass342Array5541!![i]!!
                    var class342_385_: Class342? = class342
                    if (class342.aClass342_4248 != null) class342_385_ = class342.aClass342_4248
                    if (class342.aClass101_4252 == null) class342.aClass101_4252 = class101_sub3.method907()
                    else class342.aClass101_4252!!.method898(class101_sub3)
                    class342_385_!!.anInt4238 = (class101_sub3.aFloat5747 + (((anIntArray5644!![(class342.anInt4244)]).toFloat() * (class101_sub3.aFloat5781)) + (((anIntArray5543!![(class342.anInt4244)]).toFloat() * (class101_sub3.aFloat5770)) + ((class101_sub3.aFloat5750) * (anIntArray5593!![(class342.anInt4244)]).toFloat())))).toInt()
                    class342_385_.anInt4239 = (class101_sub3.aFloat5772 + (((anIntArray5593!![(class342.anInt4244)]).toFloat() * (class101_sub3.aFloat5769)) + ((class101_sub3.aFloat5761) * (anIntArray5543!![(class342.anInt4244)]).toFloat()) + ((anIntArray5644!![(class342.anInt4244)]).toFloat() * (class101_sub3.aFloat5762)))).toInt()
                    class342_385_.anInt4240 = (class101_sub3.aFloat5751 + (((anIntArray5644!![(class342.anInt4244)]).toFloat() * (class101_sub3.aFloat5784)) + (((anIntArray5543!![(class342.anInt4244)]).toFloat() * (class101_sub3.aFloat5756)) + ((anIntArray5593!![(class342.anInt4244)]).toFloat() * (class101_sub3.aFloat5754))))).toInt()
                    i++
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, "paa.J(" + (if (class101 != null) "{...}" else "null") + ')')
            }
            break
        } while (false)
    }

    public override fun ma(): Int {
        if (!aBoolean5527) method692((-123).toByte())
        anInt5546++
        return aShort5559.toInt()
    }

    public override fun method605(i: Int, `is`: IntArray, i_386_: Int, i_387_: Int, i_388_: Int, i_389_: Int, bool: Boolean) {
        var i_386_ = i_386_
        var i_387_ = i_387_
        var i_388_ = i_388_
        try {
            anInt5614++
            val i_390_ = `is`!!.size
            if (i == 0) {
                i_388_ = i_388_ shl 4
                i_387_ = i_387_ shl 4
                i_386_ = i_386_ shl 4
                Class181.anInt2398 = 0
                var i_391_ = 0
                Class221.anInt2880 = 0
                za.anInt7275 = 0
                for (i_392_ in 0..<i_390_) {
                    val i_393_ = `is`[i_392_]
                    if (i_393_ < anIntArrayArray5539!!.size) {
                        val is_394_ = anIntArrayArray5539!![i_393_]!!
                        var i_395_ = 0
                        while ((i_395_ < is_394_.size)) {
                            val i_396_ = is_394_[i_395_]
                            za.anInt7275 += anIntArray5543!![i_396_]
                            Class221.anInt2880 += anIntArray5593!![i_396_]
                            i_391_++
                            Class181.anInt2398 += anIntArray5644!![i_396_]
                            i_395_++
                        }
                    }
                }
                if (i_391_ <= 0) {
                    Class221.anInt2880 = i_387_
                    Class181.anInt2398 = i_388_
                    za.anInt7275 = i_386_
                } else {
                    Class221.anInt2880 = i_387_ + Class221.anInt2880 / i_391_
                    za.anInt7275 = za.anInt7275 / i_391_ + i_386_
                    Class181.anInt2398 = i_388_ + Class181.anInt2398 / i_391_
                }
            } else if (i == 1) {
                i_386_ = i_386_ shl 4
                i_387_ = i_387_ shl 4
                i_388_ = i_388_ shl 4
                var i_397_ = 0
                while (i_390_ > i_397_) {
                    val i_398_ = `is`[i_397_]
                    if (i_398_ < anIntArrayArray5539!!.size) {
                        val is_399_ = anIntArrayArray5539!![i_398_]!!
                        for (i_400_ in is_399_.indices) {
                            val i_401_ = is_399_[i_400_]
                            anIntArray5543!![i_401_] += i_386_
                            anIntArray5593!![i_401_] += i_387_
                            anIntArray5644!![i_401_] += i_388_
                        }
                    }
                    i_397_++
                }
            } else if (i == 2) {
                var i_402_ = 0
                while (i_390_ > i_402_) {
                    val i_403_ = `is`[i_402_]
                    if (anIntArrayArray5539!!.size > i_403_) {
                        val is_404_ = anIntArrayArray5539!![i_403_]!!
                        if ((0x1 and i_389_) == 0) {
                            var i_416_ = 0
                            while ((is_404_.size > i_416_)) {
                                val i_417_ = is_404_[i_416_]
                                anIntArray5543!![i_417_] -= za.anInt7275
                                anIntArray5593!![i_417_] -= Class221.anInt2880
                                anIntArray5644!![i_417_] -= Class181.anInt2398
                                if (i_388_ != 0) {
                                    val i_418_ = Class70.anIntArray1207!![i_388_]
                                    val i_419_ = Class70.anIntArray1204!![i_388_]
                                    val i_420_ = ((anIntArray5543!![i_417_] * i_419_ + i_418_ * anIntArray5593!![i_417_] - -16383) shr 14)
                                    anIntArray5593!![i_417_] = (anIntArray5593!![i_417_] * i_419_ + -(i_418_ * anIntArray5543!![i_417_]) - -16383) shr 14
                                    anIntArray5543!![i_417_] = i_420_
                                }
                                if (i_386_ != 0) {
                                    val i_421_ = Class70.anIntArray1207!![i_386_]
                                    val i_422_ = Class70.anIntArray1204!![i_386_]
                                    val i_423_ = ((-(anIntArray5644!![i_417_] * i_421_) + (i_422_ * anIntArray5593!![i_417_] + 16383)) shr 14)
                                    anIntArray5644!![i_417_] = ((16383 + i_422_ * anIntArray5644!![i_417_] + i_421_ * anIntArray5593!![i_417_]) shr 14)
                                    anIntArray5593!![i_417_] = i_423_
                                }
                                if (i_387_ != 0) {
                                    val i_424_ = Class70.anIntArray1207!![i_387_]
                                    val i_425_ = Class70.anIntArray1204!![i_387_]
                                    val i_426_ = (i_424_ * anIntArray5644!![i_417_] - -(i_425_ * anIntArray5543!![i_417_]) + 16383) shr 14
                                    anIntArray5644!![i_417_] = (16383 + (anIntArray5644!![i_417_] * i_425_ - (anIntArray5543!![i_417_] * i_424_))) shr 14
                                    anIntArray5543!![i_417_] = i_426_
                                }
                                anIntArray5543!![i_417_] += za.anInt7275
                                anIntArray5593!![i_417_] += Class221.anInt2880
                                anIntArray5644!![i_417_] += Class181.anInt2398
                                i_416_++
                            }
                        } else {
                            var i_405_ = 0
                            while (is_404_.size > i_405_) {
                                val i_406_ = is_404_[i_405_]
                                anIntArray5543!![i_406_] -= za.anInt7275
                                anIntArray5593!![i_406_] -= Class221.anInt2880
                                anIntArray5644!![i_406_] -= Class181.anInt2398
                                if (i_386_ != 0) {
                                    val i_407_ = Class70.anIntArray1207!![i_386_]
                                    val i_408_ = Class70.anIntArray1204!![i_386_]
                                    val i_409_ = ((16383 + (i_408_ * anIntArray5593!![i_406_] + -(anIntArray5644!![i_406_] * i_407_))) shr 14)
                                    anIntArray5644!![i_406_] = ((16383 + (anIntArray5593!![i_406_] * i_407_ - -(i_408_ * anIntArray5644!![i_406_]))) shr 14)
                                    anIntArray5593!![i_406_] = i_409_
                                }
                                if (i_388_ != 0) {
                                    val i_410_ = Class70.anIntArray1207!![i_388_]
                                    val i_411_ = Class70.anIntArray1204!![i_388_]
                                    val i_412_ = ((16383 + (anIntArray5543!![i_406_] * i_411_ + (i_410_ * anIntArray5593!![i_406_]))) shr 14)
                                    anIntArray5593!![i_406_] = (-(i_410_ * anIntArray5543!![i_406_]) + (anIntArray5593!![i_406_] * i_411_ - -16383)) shr 14
                                    anIntArray5543!![i_406_] = i_412_
                                }
                                if (i_387_ != 0) {
                                    val i_413_ = Class70.anIntArray1207!![i_387_]
                                    val i_414_ = Class70.anIntArray1204!![i_387_]
                                    val i_415_ = ((i_413_ * anIntArray5644!![i_406_] - (-(anIntArray5543!![i_406_] * i_414_) - 16383)) shr 14)
                                    anIntArray5644!![i_406_] = (anIntArray5644!![i_406_] * i_414_ + (-(i_413_ * anIntArray5543!![i_406_]) - -16383)) shr 14
                                    anIntArray5543!![i_406_] = i_415_
                                }
                                anIntArray5543!![i_406_] += za.anInt7275
                                anIntArray5593!![i_406_] += Class221.anInt2880
                                anIntArray5644!![i_406_] += Class181.anInt2398
                                i_405_++
                            }
                        }
                    }
                    i_402_++
                }
                if (bool) {
                    for (i_427_ in 0..<i_390_) {
                        val i_428_ = `is`[i_427_]
                        if (i_428_ < anIntArrayArray5539!!.size) {
                            val is_429_ = anIntArrayArray5539!![i_428_]!!
                            for (i_430_ in is_429_.indices) {
                                val i_431_ = is_429_[i_430_]
                                val i_432_ = anIntArray5528!![i_431_]
                                val i_433_ = anIntArray5528!![i_431_ - -1]
                                var i_434_ = i_432_
                                while (i_433_ > i_434_) {
                                    val i_435_ = aShortArray5649!![i_434_] - 1
                                    if (i_435_ == -1) break
                                    if (i_388_ != 0) {
                                        val i_436_ = Class70.anIntArray1207!![i_388_]
                                        val i_437_ = Class70.anIntArray1204!![i_388_]
                                        val i_438_ = ((16383 + (i_437_ * aShortArray5564!![i_435_]) + (aShortArray5583!![i_435_] * i_436_)) shr 14)
                                        aShortArray5583!![i_435_] = ((16383 + (i_437_ * (aShortArray5583!![i_435_])) + -((aShortArray5564!![i_435_]) * i_436_)) shr 14).toShort()
                                        aShortArray5564!![i_435_] = i_438_.toShort()
                                    }
                                    if (i_386_ != 0) {
                                        val i_439_ = Class70.anIntArray1207!![i_386_]
                                        val i_440_ = Class70.anIntArray1204!![i_386_]
                                        val i_441_ = (i_440_ * aShortArray5583!![i_435_] - ((aShortArray5576!![i_435_] * i_439_) + -16383)) shr 14
                                        aShortArray5576!![i_435_] = ((16383 + ((i_440_ * (aShortArray5576!![i_435_])) + (i_439_ * (aShortArray5583!![i_435_])))) shr 14).toShort()
                                        aShortArray5583!![i_435_] = i_441_.toShort()
                                    }
                                    if (i_387_ != 0) {
                                        val i_442_ = Class70.anIntArray1207!![i_387_]
                                        val i_443_ = Class70.anIntArray1204!![i_387_]
                                        val i_444_ = ((16383 + (i_442_ * aShortArray5576!![i_435_]) + (aShortArray5564!![i_435_] * i_443_)) shr 14)
                                        aShortArray5576!![i_435_] = ((16383 + (-((aShortArray5564!![i_435_]) * i_442_) + ((aShortArray5576!![i_435_]) * i_443_))) shr 14).toShort()
                                        aShortArray5564!![i_435_] = i_444_.toShort()
                                    }
                                    i_434_++
                                }
                            }
                        }
                    }
                    if (aClass123_5563 == null && aClass123_5610 != null) aClass123_5610!!.anInterface2_1811 = null
                    if (aClass123_5563 != null) aClass123_5563!!.anInterface2_1811 = null
                }
            } else if (i == 3) {
                for (i_445_ in 0..<i_390_) {
                    val i_446_ = `is`[i_445_]
                    if (i_446_ < anIntArrayArray5539!!.size) {
                        val is_447_ = anIntArrayArray5539!![i_446_]!!
                        for (i_448_ in is_447_.indices) {
                            val i_449_ = is_447_[i_448_]
                            anIntArray5543!![i_449_] -= za.anInt7275
                            anIntArray5593!![i_449_] -= Class221.anInt2880
                            anIntArray5644!![i_449_] -= Class181.anInt2398
                            anIntArray5543!![i_449_] = i_386_ * anIntArray5543!![i_449_] shr 7
                            anIntArray5593!![i_449_] = anIntArray5593!![i_449_] * i_387_ shr 7
                            anIntArray5644!![i_449_] = anIntArray5644!![i_449_] * i_388_ shr 7
                            anIntArray5543!![i_449_] += za.anInt7275
                            anIntArray5593!![i_449_] += Class221.anInt2880
                            anIntArray5644!![i_449_] += Class181.anInt2398
                        }
                    }
                }
            } else if (i == 5) {
                if (anIntArrayArray5553 != null) {
                    var i_450_ = 0
                    while (i_390_ > i_450_) {
                        val i_451_ = `is`[i_450_]
                        if (anIntArrayArray5553!!.size > i_451_) {
                            val is_452_ = anIntArrayArray5553!![i_451_]!!
                            for (i_453_ in is_452_.indices) {
                                val i_454_ = is_452_[i_453_]
                                var i_455_ = ((0xff and aByteArray5542!![i_454_].toInt()) + 8 * i_386_)
                                if (i_455_ < 0) i_455_ = 0
                                else if (i_455_ > 255) i_455_ = 255
                                aByteArray5542!![i_454_] = i_455_.toByte()
                            }
                            if (is_452_.size > 0 && aClass123_5610 != null) aClass123_5610!!.anInterface2_1811 = null
                        }
                        i_450_++
                    }
                    if (aClass118Array5621 != null) {
                        for (i_456_ in 0..<anInt5536) {
                            val class118 = aClass118Array5621!![i_456_]!!
                            val class48 = aClass48Array5596!![i_456_]!!
                            class48.anInt858 = (255 + -((aByteArray5542!![class118.anInt1783]).toInt() and 0xff) shl 24 or (0xffffff and class48.anInt858))
                        }
                    }
                }
            } else if (i == 7) {
                if (anIntArrayArray5553 != null) {
                    var i_457_ = 0
                    while (i_390_ > i_457_) {
                        val i_458_ = `is`[i_457_]
                        if (i_458_ < anIntArrayArray5553!!.size) {
                            val is_459_ = anIntArrayArray5553!![i_458_]!!
                            for (i_460_ in is_459_.indices) {
                                val i_461_ = is_459_[i_460_]
                                val i_462_ = aShortArray5580!![i_461_].toInt() and 0xffff
                                var i_463_ = (i_462_ and 0xfc8a) shr 10
                                var i_464_ = 0x7 and (i_462_ shr 7)
                                i_464_ += i_387_ / 4
                                i_463_ = 0x3f and i_463_ + i_386_
                                var i_465_ = i_462_ and 0x7f
                                i_465_ += i_388_
                                if (i_464_ >= 0) {
                                    if (i_464_ > 7) i_464_ = 7
                                } else i_464_ = 0
                                if (i_465_ < 0) i_465_ = 0
                                else if (i_465_ > 127) i_465_ = 127
                                aShortArray5580!![i_461_] = (Class273.method2057((Class273.method2057(i_464_ shl 7, i_463_ shl 10)), i_465_)).toShort()
                            }
                            if (is_459_.size > 0 && aClass123_5610 != null) aClass123_5610!!.anInterface2_1811 = null
                        }
                        i_457_++
                    }
                    if (aClass118Array5621 != null) {
                        var i_466_ = 0
                        while (anInt5536 > i_466_) {
                            val class118 = aClass118Array5621!![i_466_]!!
                            val class48 = aClass48Array5596!![i_466_]!!
                            class48.anInt858 = (0xffffff and (Class10.anIntArray179!![(aShortArray5580!![(class118.anInt1783)]).toInt() and 0xffff]) or (0xffffff.inv() and class48.anInt858))
                            i_466_++
                        }
                    }
                }
            } else if (i == 8) {
                if (anIntArrayArray5627 != null) {
                    for (i_467_ in 0..<i_390_) {
                        val i_468_ = `is`[i_467_]
                        if (i_468_ < anIntArrayArray5627!!.size) {
                            val is_469_ = anIntArrayArray5627!![i_468_]!!
                            for (i_470_ in is_469_.indices) {
                                val class48 = aClass48Array5596!![is_469_[i_470_]]!!
                                class48.anInt854 += i_386_
                                class48.anInt847 += i_387_
                            }
                        }
                    }
                }
            } else if (i == 10) {
                if (anIntArrayArray5627 != null) {
                    for (i_471_ in 0..<i_390_) {
                        val i_472_ = `is`[i_471_]
                        if (i_472_ < anIntArrayArray5627!!.size) {
                            val is_473_ = anIntArrayArray5627!![i_472_]!!
                            var i_474_ = 0
                            while ((i_474_ < is_473_.size)) {
                                val class48 = aClass48Array5596!![is_473_[i_474_]]!!
                                class48.anInt856 = (i_386_ * class48.anInt856 shr 7)
                                class48.anInt857 = (class48.anInt857 * i_387_ shr 7)
                                i_474_++
                            }
                        }
                    }
                }
            } else if (i == 9) {
                if (anIntArrayArray5627 != null) {
                    for (i_475_ in 0..<i_390_) {
                        val i_476_ = `is`[i_475_]
                        if (anIntArrayArray5627!!.size > i_476_) {
                            val is_477_ = anIntArrayArray5627!![i_476_]!!
                            var i_478_ = 0
                            while (is_477_.size > i_478_) {
                                val class48 = aClass48Array5596!![is_477_[i_478_]]!!
                                class48.anInt853 = (class48.anInt853 + i_386_ and 0x3fff)
                                i_478_++
                            }
                        }
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("paa.BB(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_386_ + ',' + i_387_ + ',' + i_388_ + ',' + i_389_ + ',' + bool + ')'))
        }
    }

    public override fun HA(): Int {
        anInt5574++
        if (!aBoolean5527) method692((-123).toByte())
        return aShort5617.toInt()
    }

    public override fun ua(): Int {
        anInt5616++
        return anInt5648
    }

    public override fun P(i: Int, i_479_: Int, i_480_: Int, i_481_: Int) {
        anInt5567++
        if (i == 0) {
            za.anInt7275 = 0
            Class181.anInt2398 = 0
            Class221.anInt2880 = 0
            var i_482_ = 0
            for (i_483_ in 0..<anInt5557) {
                za.anInt7275 += anIntArray5543!![i_483_]
                Class221.anInt2880 += anIntArray5593!![i_483_]
                i_482_++
                Class181.anInt2398 += anIntArray5644!![i_483_]
            }
            if (i_482_ <= 0) {
                Class221.anInt2880 = i_480_
                Class181.anInt2398 = i_481_
                za.anInt7275 = i_479_
            } else {
                Class221.anInt2880 = Class221.anInt2880 / i_482_ - -i_480_
                za.anInt7275 = i_479_ + za.anInt7275 / i_482_
                Class181.anInt2398 = Class181.anInt2398 / i_482_ + i_481_
            }
        } else if (i == 1) {
            for (i_484_ in 0..<anInt5557) {
                anIntArray5543!![i_484_] += i_479_
                anIntArray5593!![i_484_] += i_480_
                anIntArray5644!![i_484_] += i_481_
            }
        } else if (i == 2) {
            for (i_485_ in 0..<anInt5557) {
                anIntArray5543!![i_485_] -= za.anInt7275
                anIntArray5593!![i_485_] -= Class221.anInt2880
                anIntArray5644!![i_485_] -= Class181.anInt2398
                if (i_481_ != 0) {
                    val i_486_ = Class70.anIntArray1207!![i_481_]
                    val i_487_ = Class70.anIntArray1204!![i_481_]
                    val i_488_ = (16383 + (i_487_ * anIntArray5543!![i_485_] + anIntArray5593!![i_485_] * i_486_) shr 14)
                    anIntArray5593!![i_485_] = ((-(anIntArray5543!![i_485_] * i_486_) + anIntArray5593!![i_485_] * i_487_ + 16383) shr 14)
                    anIntArray5543!![i_485_] = i_488_
                }
                if (i_479_ != 0) {
                    val i_489_ = Class70.anIntArray1207!![i_479_]
                    val i_490_ = Class70.anIntArray1204!![i_479_]
                    val i_491_ = ((-(anIntArray5644!![i_485_] * i_489_) + i_490_ * anIntArray5593!![i_485_] + 16383) shr 14)
                    anIntArray5644!![i_485_] = ((i_489_ * anIntArray5593!![i_485_] - (-(i_490_ * anIntArray5644!![i_485_]) + -16383)) shr 14)
                    anIntArray5593!![i_485_] = i_491_
                }
                if (i_480_ != 0) {
                    val i_492_ = Class70.anIntArray1207!![i_480_]
                    val i_493_ = Class70.anIntArray1204!![i_480_]
                    val i_494_ = (16383 + (anIntArray5644!![i_485_] * i_492_ - -(i_493_ * anIntArray5543!![i_485_])) shr 14)
                    anIntArray5644!![i_485_] = (16383 + (-(anIntArray5543!![i_485_] * i_492_) + i_493_ * anIntArray5644!![i_485_]) shr 14)
                    anIntArray5543!![i_485_] = i_494_
                }
                anIntArray5543!![i_485_] += za.anInt7275
                anIntArray5593!![i_485_] += Class221.anInt2880
                anIntArray5644!![i_485_] += Class181.anInt2398
            }
        } else if (i == 3) {
            for (i_495_ in 0..<anInt5557) {
                anIntArray5543!![i_495_] -= za.anInt7275
                anIntArray5593!![i_495_] -= Class221.anInt2880
                anIntArray5644!![i_495_] -= Class181.anInt2398
                anIntArray5543!![i_495_] = i_479_ * anIntArray5543!![i_495_] / 128
                anIntArray5593!![i_495_] = i_480_ * anIntArray5593!![i_495_] / 128
                anIntArray5644!![i_495_] = anIntArray5644!![i_495_] * i_481_ / 128
                anIntArray5543!![i_495_] += za.anInt7275
                anIntArray5593!![i_495_] += Class221.anInt2880
                anIntArray5644!![i_495_] += Class181.anInt2398
            }
        } else if (i == 5) {
            for (i_496_ in 0..<anInt5632) {
                var i_497_ = (aByteArray5542!![i_496_].toInt() and 0xff) + i_479_ * 8
                if (i_497_ >= 0) {
                    if (i_497_ > 255) i_497_ = 255
                } else i_497_ = 0
                aByteArray5542!![i_496_] = i_497_.toByte()
            }
            if (aClass123_5610 != null) aClass123_5610!!.anInterface2_1811 = null
            if (aClass118Array5621 != null) {
                for (i_498_ in 0..<anInt5536) {
                    val class118 = aClass118Array5621!![i_498_]!!
                    val class48 = aClass48Array5596!![i_498_]!!
                    class48.anInt858 = (0xffffff and class48.anInt858 or (-(0xff and aByteArray5542!![(class118.anInt1783)].toInt()) + 255 shl 24))
                }
            }
        } else if (i == 7) {
            var i_499_ = 0
            while (anInt5632 > i_499_) {
                val i_500_ = aShortArray5580!![i_499_].toInt() and 0xffff
                var i_501_ = 0x3f and (i_500_ shr 10)
                var i_502_ = (i_500_ and 0x3ba) shr 7
                i_501_ = i_501_ + i_479_ and 0x3f
                var i_503_ = i_500_ and 0x7f
                i_502_ += i_480_ / 4
                i_503_ += i_481_
                if (i_502_ >= 0) {
                    if (i_502_ > 7) i_502_ = 7
                } else i_502_ = 0
                if (i_503_ >= 0) {
                    if (i_503_ > 127) i_503_ = 127
                } else i_503_ = 0
                aShortArray5580!![i_499_] = (Class273.method2057(i_503_, Class273.method2057(i_502_ shl 7, i_501_ shl 10))).toShort()
                i_499_++
            }
            if (aClass123_5610 != null) aClass123_5610!!.anInterface2_1811 = null
            if (aClass118Array5621 != null) {
                for (i_504_ in 0..<anInt5536) {
                    val class118 = aClass118Array5621!![i_504_]!!
                    val class48 = aClass48Array5596!![i_504_]!!
                    class48.anInt858 = (((Class10.anIntArray179!![0xffff and (aShortArray5580!![class118.anInt1783]).toInt()]) and 0xffffff) or (class48.anInt858 and 0xffffff.inv()))
                }
            }
        } else if (i == 8) {
            for (i_505_ in 0..<anInt5536) {
                val class48 = aClass48Array5596!![i_505_]!!
                class48.anInt847 += i_480_
                class48.anInt854 += i_479_
            }
        } else if (i == 10) {
            var i_506_ = 0
            while (anInt5536 > i_506_) {
                val class48 = aClass48Array5596!![i_506_]!!
                class48.anInt856 = class48.anInt856 * i_479_ shr 7
                class48.anInt857 = i_480_ * class48.anInt857 shr 7
                i_506_++
            }
        } else if (i == 9) {
            for (i_507_ in 0..<anInt5536) {
                val class48 = aClass48Array5596!![i_507_]!!
                class48.anInt853 = class48.anInt853 + i_479_ and 0x3fff
            }
        }
    }

    public override fun s(i: Int) {
        anInt5648 = i
        anInt5597++
        if (aClass139_5572 != null && (0x10000 and anInt5648) == 0) {
            aShortArray5576 = aClass139_5572!!.aShortArray1953
            aByteArray5594 = aClass139_5572!!.aByteArray1948
            aShortArray5564 = aClass139_5572!!.aShortArray1954
            aShortArray5583 = aClass139_5572!!.aShortArray1951
            aClass139_5572 = null
        }
        aBoolean5555 = true
        method691((-62).toByte())
    }

    public override fun C(i: Int) {
        anInt5602++
        aShort5544 = i.toShort()
        if (aClass123_5610 != null) aClass123_5610!!.anInterface2_1811 = null
    }

    public override fun v() {
        anInt5535++
        run {
            var i = 0
            while (anInt5557 > i) {
                anIntArray5644!![i] = -anIntArray5644!![i]
                i++
            }
        }
        run {
            var i = 0
            while (anInt5529 > i) {
                aShortArray5576!![i] = (-aShortArray5576!![i]).toShort()
                i++
            }
        }
        var i = 0
        while (anInt5632 > i) {
            val i_508_ = aShortArray5592!![i]
            aShortArray5592!![i] = aShortArray5566!![i]
            aShortArray5566!![i] = i_508_
            i++
        }
        if (aClass123_5563 == null && aClass123_5610 != null) aClass123_5610!!.anInterface2_1811 = null
        if (aClass123_5563 != null) aClass123_5563!!.anInterface2_1811 = null
        aBoolean5527 = false
        if (aClass270_5575 != null) aClass270_5575!!.anInterface8_3463 = null
        if (aClass123_5605 != null) aClass123_5605!!.anInterface2_1811 = null
    }

    public override fun method610(class101: Class101, i: Int, bool: Boolean) {
        try {
            anInt5550++
            if (aShortArray5608 != null) {
                val `is` = IntArray(3)
                for (i_509_ in 0..<anInt5557) {
                    if ((i and aShortArray5608!![i_509_].toInt()) != 0) {
                        if (!bool) class101!!.method897(anIntArray5543!![i_509_], anIntArray5593!![i_509_], anIntArray5644!![i_509_], `is`)
                        else class101!!.method892(anIntArray5543!![i_509_], anIntArray5593!![i_509_], anIntArray5644!![i_509_], `is`)
                        anIntArray5543!![i_509_] = `is`[0]
                        anIntArray5593!![i_509_] = `is`[1]
                        anIntArray5644!![i_509_] = `is`[2]
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("paa.za(" + (if (class101 != null) "{...}" else "null") + ',' + i + ',' + bool + ')'))
        }
    }

    public override fun I(i: Int, `is`: IntArray, i_510_: Int, i_511_: Int, i_512_: Int, bool: Boolean, i_513_: Int, is_514_: IntArray?) {
        var i_510_ = i_510_
        var i_511_ = i_511_
        var i_512_ = i_512_
        try {
            anInt5604++
            val i_515_ = `is`!!.size
            if (i == 0) {
                i_511_ = i_511_ shl 4
                i_512_ = i_512_ shl 4
                i_510_ = i_510_ shl 4
                var i_516_ = 0
                za.anInt7275 = 0
                Class221.anInt2880 = 0
                Class181.anInt2398 = 0
                var i_517_ = 0
                while (i_515_ > i_517_) {
                    val i_518_ = `is`[i_517_]
                    if (anIntArrayArray5539!!.size > i_518_) {
                        val is_519_ = anIntArrayArray5539!![i_518_]!!
                        for (i_520_ in is_519_.indices) {
                            val i_521_ = is_519_[i_520_]
                            if (aShortArray5608 == null || (i_513_ and aShortArray5608!![i_521_].toInt()) != 0) {
                                za.anInt7275 += anIntArray5543!![i_521_]
                                Class221.anInt2880 += anIntArray5593!![i_521_]
                                i_516_++
                                Class181.anInt2398 += anIntArray5644!![i_521_]
                            }
                        }
                    }
                    i_517_++
                }
                if (i_516_ <= 0) {
                    za.anInt7275 = i_510_
                    Class181.anInt2398 = i_512_
                    Class221.anInt2880 = i_511_
                } else {
                    za.anInt7275 = i_510_ + za.anInt7275 / i_516_
                    Class221.anInt2880 = Class221.anInt2880 / i_516_ - -i_511_
                    Class181.anInt2398 = i_512_ + Class181.anInt2398 / i_516_
                    Class348_Sub42_Sub16_Sub1.aBoolean10450 = true
                }
            } else if (i == 1) {
                if (is_514_ != null) {
                    val i_522_ = ((is_514_[2] * i_512_ + is_514_[0] * i_510_ + (i_511_ * is_514_[1] + 8192)) shr 14)
                    val i_523_ = ((8192 + i_511_ * is_514_[4] + (i_510_ * is_514_[3] - -(is_514_[5] * i_512_))) shr 14)
                    val i_524_ = ((i_512_ * is_514_[8] + i_510_ * is_514_[6] + (i_511_ * is_514_[7] + 8192)) shr 14)
                    i_510_ = i_522_
                    i_512_ = i_524_
                    i_511_ = i_523_
                }
                i_510_ = i_510_ shl 4
                i_512_ = i_512_ shl 4
                i_511_ = i_511_ shl 4
                for (i_525_ in 0..<i_515_) {
                    val i_526_ = `is`[i_525_]
                    if (i_526_ < anIntArrayArray5539!!.size) {
                        val is_527_ = anIntArrayArray5539!![i_526_]!!
                        var i_528_ = 0
                        while (is_527_.size > i_528_) {
                            val i_529_ = is_527_[i_528_]
                            if (aShortArray5608 == null || (aShortArray5608!![i_529_].toInt() and i_513_) != 0) {
                                anIntArray5543!![i_529_] += i_510_
                                anIntArray5593!![i_529_] += i_511_
                                anIntArray5644!![i_529_] += i_512_
                            }
                            i_528_++
                        }
                    }
                }
            } else if (i == 2) {
                if (is_514_ == null) {
                    var i_530_ = 0
                    while (i_515_ > i_530_) {
                        val i_531_ = `is`[i_530_]
                        if (i_531_ < anIntArrayArray5539!!.size) {
                            val is_532_ = anIntArrayArray5539!![i_531_]!!
                            var i_533_ = 0
                            while (is_532_.size > i_533_) {
                                val i_534_ = is_532_[i_533_]
                                if (aShortArray5608 == null || ((i_513_ and aShortArray5608!![i_534_].toInt()) != 0)) {
                                    anIntArray5543!![i_534_] -= za.anInt7275
                                    anIntArray5593!![i_534_] -= Class221.anInt2880
                                    anIntArray5644!![i_534_] -= Class181.anInt2398
                                    if (i_512_ != 0) {
                                        val i_535_ = Class70.anIntArray1207!![i_512_]
                                        val i_536_ = Class70.anIntArray1204!![i_512_]
                                        val i_537_ = ((i_535_ * anIntArray5593!![i_534_] - (-(anIntArray5543!![i_534_] * i_536_) - 16383)) shr 14)
                                        anIntArray5593!![i_534_] = (-(anIntArray5543!![i_534_] * i_535_) + (anIntArray5593!![i_534_] * i_536_) + 16383) shr 14
                                        anIntArray5543!![i_534_] = i_537_
                                    }
                                    if (i_510_ != 0) {
                                        val i_538_ = Class70.anIntArray1207!![i_510_]
                                        val i_539_ = Class70.anIntArray1204!![i_510_]
                                        val i_540_ = ((-(anIntArray5644!![i_534_] * i_538_) + (i_539_ * anIntArray5593!![i_534_]) + 16383) shr 14)
                                        anIntArray5644!![i_534_] = (16383 + ((i_538_ * anIntArray5593!![i_534_]) + (anIntArray5644!![i_534_] * i_539_))) shr 14
                                        anIntArray5593!![i_534_] = i_540_
                                    }
                                    if (i_511_ != 0) {
                                        val i_541_ = Class70.anIntArray1207!![i_511_]
                                        val i_542_ = Class70.anIntArray1204!![i_511_]
                                        val i_543_ = ((i_541_ * anIntArray5644!![i_534_] + ((i_542_ * anIntArray5543!![i_534_]) - -16383)) shr 14)
                                        anIntArray5644!![i_534_] = ((16383 + ((anIntArray5644!![i_534_] * i_542_) + -(anIntArray5543!![i_534_] * i_541_))) shr 14)
                                        anIntArray5543!![i_534_] = i_543_
                                    }
                                    anIntArray5543!![i_534_] += za.anInt7275
                                    anIntArray5593!![i_534_] += Class221.anInt2880
                                    anIntArray5644!![i_534_] += Class181.anInt2398
                                }
                                i_533_++
                            }
                        }
                        i_530_++
                    }
                    if (bool) {
                        for (i_544_ in 0..<i_515_) {
                            val i_545_ = `is`[i_544_]
                            if (i_545_ < anIntArrayArray5539!!.size) {
                                val is_546_ = anIntArrayArray5539!![i_545_]!!
                                var i_547_ = 0
                                while (is_546_.size > i_547_) {
                                    val i_548_ = is_546_[i_547_]
                                    if (aShortArray5608 == null || ((aShortArray5608!![i_548_].toInt() and i_513_) != 0)) {
                                        val i_549_ = anIntArray5528!![i_548_]
                                        val i_550_ = anIntArray5528!![i_548_ + 1]
                                        var i_551_ = i_549_
                                        while (i_550_ > i_551_) {
                                            val i_552_ = aShortArray5649!![i_551_] + -1
                                            if (i_552_ == -1) break
                                            if (i_512_ != 0) {
                                                val i_553_ = (Class70.anIntArray1207!![i_512_])
                                                val i_554_ = (Class70.anIntArray1204!![i_512_])
                                                val i_555_ = ((16383 + (aShortArray5564!![i_552_]) * i_554_ + (aShortArray5583!![i_552_]) * i_553_) shr 14)
                                                aShortArray5583!![i_552_] = ((16383 + ((i_554_ * (aShortArray5583!![i_552_])) + -(i_553_ * (aShortArray5564!![i_552_])))) shr 14).toShort()
                                                aShortArray5564!![i_552_] = i_555_.toShort()
                                            }
                                            if (i_510_ != 0) {
                                                val i_556_ = (Class70.anIntArray1207!![i_510_])
                                                val i_557_ = (Class70.anIntArray1204!![i_510_])
                                                val i_558_ = ((16383 + (-(i_556_ * (aShortArray5576!![i_552_])) + ((aShortArray5583!![i_552_]) * i_557_))) shr 14)
                                                aShortArray5576!![i_552_] = (((i_556_ * (aShortArray5583!![i_552_])) + (i_557_ * (aShortArray5576!![i_552_])) + 16383) shr 14).toShort()
                                                aShortArray5583!![i_552_] = i_558_.toShort()
                                            }
                                            if (i_511_ != 0) {
                                                val i_559_ = (Class70.anIntArray1207!![i_511_])
                                                val i_560_ = (Class70.anIntArray1204!![i_511_])
                                                val i_561_ = ((16383 + (i_560_ * (aShortArray5564!![i_552_])) + (i_559_ * (aShortArray5576!![i_552_]))) shr 14)
                                                aShortArray5576!![i_552_] = ((((aShortArray5576!![i_552_]) * i_560_) + -(i_559_ * (aShortArray5564!![i_552_])) + 16383) shr 14).toShort()
                                                aShortArray5564!![i_552_] = i_561_.toShort()
                                            }
                                            i_551_++
                                        }
                                    }
                                    i_547_++
                                }
                            }
                        }
                        if (aClass123_5563 == null && aClass123_5610 != null) aClass123_5610!!.anInterface2_1811 = null
                        if (aClass123_5563 != null) aClass123_5563!!.anInterface2_1811 = null
                    }
                } else {
                    val i_562_ = is_514_[9] shl 4
                    val i_563_ = is_514_[10] shl 4
                    val i_564_ = is_514_[11] shl 4
                    val i_565_ = is_514_[12] shl 4
                    val i_566_ = is_514_[13] shl 4
                    val i_567_ = is_514_[14] shl 4
                    if (Class348_Sub42_Sub16_Sub1.aBoolean10450) {
                        var i_568_ = ((za.anInt7275 * is_514_[0] - -(is_514_[3] * Class221.anInt2880) - -(is_514_[6] * Class181.anInt2398) - -8192) shr 14)
                        var i_569_ = ((is_514_[1] * za.anInt7275 - -(Class221.anInt2880 * is_514_[4]) - (-(is_514_[7] * Class181.anInt2398) - 8192)) shr 14)
                        i_568_ += i_565_
                        i_569_ += i_566_
                        var i_570_ = (8192 + (Class181.anInt2398 * is_514_[8] + is_514_[2] * za.anInt7275 + is_514_[5] * Class221.anInt2880) shr 14)
                        i_570_ += i_567_
                        za.anInt7275 = i_568_
                        Class221.anInt2880 = i_569_
                        Class181.anInt2398 = i_570_
                        Class348_Sub42_Sub16_Sub1.aBoolean10450 = false
                    }
                    val is_571_ = IntArray(9)
                    val i_572_ = Class70.anIntArray1204!![i_510_]
                    val i_573_ = Class70.anIntArray1207!![i_510_]
                    val i_574_ = Class70.anIntArray1204!![i_511_]
                    val i_575_ = Class70.anIntArray1207!![i_511_]
                    val i_576_ = Class70.anIntArray1204!![i_512_]
                    val i_577_ = Class70.anIntArray1207!![i_512_]
                    val i_578_ = 8192 + i_576_ * i_573_ shr 14
                    val i_579_ = 8192 + i_573_ * i_577_ shr 14
                    is_571_[6] = (8192 + (i_579_ * i_574_ + i_576_ * -i_575_) shr 14)
                    is_571_[8] = 8192 + i_572_ * i_574_ shr 14
                    is_571_[4] = 8192 + i_572_ * i_576_ shr 14
                    is_571_[1] = (8192 + i_577_ * -i_574_ - -(i_578_ * i_575_) shr 14)
                    is_571_[3] = i_572_ * i_577_ + 8192 shr 14
                    is_571_[5] = -i_573_
                    is_571_[0] = (8192 + (i_575_ * i_579_ + i_576_ * i_574_) shr 14)
                    is_571_[7] = (8192 + i_574_ * i_578_ + i_577_ * i_575_ shr 14)
                    is_571_[2] = i_575_ * i_572_ - -8192 shr 14
                    val i_580_ = ((is_571_[1] * -Class221.anInt2880 + -za.anInt7275 * is_571_[0] - (-(-Class181.anInt2398 * is_571_[2]) + -8192)) shr 14)
                    val i_581_ = ((-za.anInt7275 * is_571_[3] + is_571_[4] * -Class221.anInt2880 - -(is_571_[5] * -Class181.anInt2398) + 8192) shr 14)
                    val i_582_ = ((-Class181.anInt2398 * is_571_[8] + (is_571_[6] * -za.anInt7275 - -(is_571_[7] * -Class221.anInt2880)) - -8192) shr 14)
                    val i_583_ = i_580_ - -za.anInt7275
                    val i_584_ = i_581_ - -Class221.anInt2880
                    val i_585_ = Class181.anInt2398 + i_582_
                    val is_586_ = IntArray(9)
                    for (i_587_ in 0..2) {
                        for (i_588_ in 0..2) {
                            var i_589_ = 0
                            for (i_590_ in 0..2) i_589_ += (is_514_[3 * i_588_ - -i_590_] * is_571_[i_587_ * 3 - -i_590_])
                            is_586_[i_588_ + 3 * i_587_] = i_589_ - -8192 shr 14
                        }
                    }
                    var i_591_ = (is_571_[2] * i_567_ + (i_565_ * is_571_[0] + i_566_ * is_571_[1] + 8192) shr 14)
                    var i_592_ = (8192 + (i_566_ * is_571_[4] + is_571_[3] * i_565_ + is_571_[5] * i_567_) shr 14)
                    var i_593_ = ((is_571_[8] * i_567_ + is_571_[7] * i_566_ + (is_571_[6] * i_565_ - -8192)) shr 14)
                    i_592_ += i_584_
                    i_591_ += i_583_
                    i_593_ += i_585_
                    val is_594_ = IntArray(9)
                    for (i_595_ in 0..2) {
                        for (i_596_ in 0..2) {
                            var i_597_ = 0
                            for (i_598_ in 0..2) i_597_ += (is_514_[3 * i_595_ + i_598_] * is_586_[3 * i_598_ + i_596_])
                            is_594_[3 * i_595_ - -i_596_] = 8192 + i_597_ shr 14
                        }
                    }
                    var i_599_ = (8192 + is_514_[2] * i_593_ + (i_592_ * is_514_[1] + i_591_ * is_514_[0]) shr 14)
                    var i_600_ = (8192 + (is_514_[3] * i_591_ - -(is_514_[4] * i_592_) - -(is_514_[5] * i_593_)) shr 14)
                    i_600_ += i_563_
                    var i_601_ = (8192 + i_593_ * is_514_[8] + (is_514_[7] * i_592_ + i_591_ * is_514_[6]) shr 14)
                    i_599_ += i_562_
                    i_601_ += i_564_
                    for (i_602_ in 0..<i_515_) {
                        val i_603_ = `is`[i_602_]
                        if (i_603_ < anIntArrayArray5539!!.size) {
                            val is_604_ = anIntArrayArray5539!![i_603_]!!
                            var i_605_ = 0
                            while ((i_605_ < is_604_.size)) {
                                val i_606_ = is_604_[i_605_]
                                if (aShortArray5608 == null || (aShortArray5608!![i_606_].toInt() and i_513_) != 0) {
                                    var i_607_ = ((8192 + (is_594_[2] * anIntArray5644!![i_606_]) + ((is_594_[1] * anIntArray5593!![i_606_]) + (is_594_[0] * anIntArray5543!![i_606_]))) shr 14)
                                    var i_608_ = ((is_594_[5] * anIntArray5644!![i_606_] + ((anIntArray5543!![i_606_] * is_594_[3]) + (is_594_[4] * anIntArray5593!![i_606_])) + 8192) shr 14)
                                    i_607_ += i_599_
                                    i_608_ += i_600_
                                    var i_609_ = ((8192 + (is_594_[8] * anIntArray5644!![i_606_]) + ((anIntArray5543!![i_606_] * is_594_[6]) + (is_594_[7] * anIntArray5593!![i_606_]))) shr 14)
                                    i_609_ += i_601_
                                    anIntArray5543!![i_606_] = i_607_
                                    anIntArray5593!![i_606_] = i_608_
                                    anIntArray5644!![i_606_] = i_609_
                                }
                                i_605_++
                            }
                        }
                    }
                }
            } else if (i == 3) {
                if (is_514_ == null) {
                    var i_648_ = 0
                    while (i_515_ > i_648_) {
                        val i_649_ = `is`[i_648_]
                        if (i_649_ < anIntArrayArray5539!!.size) {
                            val is_650_ = anIntArrayArray5539!![i_649_]!!
                            var i_651_ = 0
                            while ((i_651_ < is_650_.size)) {
                                val i_652_ = is_650_[i_651_]
                                if (aShortArray5608 == null || ((i_513_ and aShortArray5608!![i_652_].toInt()) != 0)) {
                                    anIntArray5543!![i_652_] -= za.anInt7275
                                    anIntArray5593!![i_652_] -= Class221.anInt2880
                                    anIntArray5644!![i_652_] -= Class181.anInt2398
                                    anIntArray5543!![i_652_] = (anIntArray5543!![i_652_] * i_510_ shr 7)
                                    anIntArray5593!![i_652_] = (anIntArray5593!![i_652_] * i_511_ shr 7)
                                    anIntArray5644!![i_652_] = (i_512_ * anIntArray5644!![i_652_] shr 7)
                                    anIntArray5543!![i_652_] += za.anInt7275
                                    anIntArray5593!![i_652_] += Class221.anInt2880
                                    anIntArray5644!![i_652_] += Class181.anInt2398
                                }
                                i_651_++
                            }
                        }
                        i_648_++
                    }
                } else {
                    val i_610_ = is_514_[9] shl 4
                    val i_611_ = is_514_[10] shl 4
                    val i_612_ = is_514_[11] shl 4
                    val i_613_ = is_514_[12] shl 4
                    val i_614_ = is_514_[13] shl 4
                    val i_615_ = is_514_[14] shl 4
                    if (Class348_Sub42_Sub16_Sub1.aBoolean10450) {
                        var i_616_ = (8192 + (za.anInt7275 * is_514_[0] - -(Class221.anInt2880 * is_514_[3]) - -(is_514_[6] * Class181.anInt2398)) shr 14)
                        var i_617_ = (8192 + (is_514_[7] * Class181.anInt2398 + (Class221.anInt2880 * is_514_[4] + is_514_[1] * za.anInt7275)) shr 14)
                        i_617_ += i_614_
                        var i_618_ = ((is_514_[5] * Class221.anInt2880 + za.anInt7275 * is_514_[2] + is_514_[8] * Class181.anInt2398 - -8192) shr 14)
                        i_616_ += i_613_
                        Class221.anInt2880 = i_617_
                        i_618_ += i_615_
                        za.anInt7275 = i_616_
                        Class348_Sub42_Sub16_Sub1.aBoolean10450 = false
                        Class181.anInt2398 = i_618_
                    }
                    val i_619_ = i_510_ shl 15 shr 7
                    val i_620_ = i_511_ shl 15 shr 7
                    val i_621_ = i_512_ shl 15 shr 7
                    val i_622_ = -za.anInt7275 * i_619_ + 8192 shr 14
                    val i_623_ = i_620_ * -Class221.anInt2880 + 8192 shr 14
                    val i_624_ = -Class181.anInt2398 * i_621_ - -8192 shr 14
                    val i_625_ = i_622_ + za.anInt7275
                    val i_626_ = i_623_ - -Class221.anInt2880
                    val i_627_ = Class181.anInt2398 + i_624_
                    val is_628_ = IntArray(9)
                    is_628_[1] = 8192 + is_514_[3] * i_619_ shr 14
                    is_628_[0] = is_514_[0] * i_619_ - -8192 shr 14
                    is_628_[2] = i_619_ * is_514_[6] + 8192 shr 14
                    is_628_[6] = i_621_ * is_514_[2] - -8192 shr 14
                    is_628_[5] = i_620_ * is_514_[7] - -8192 shr 14
                    is_628_[4] = i_620_ * is_514_[4] - -8192 shr 14
                    is_628_[3] = 8192 + i_620_ * is_514_[1] shr 14
                    is_628_[7] = i_621_ * is_514_[5] + 8192 shr 14
                    is_628_[8] = 8192 + i_621_ * is_514_[8] shr 14
                    var i_629_ = 8192 + i_619_ * i_613_ shr 14
                    var i_630_ = i_620_ * i_614_ - -8192 shr 14
                    i_630_ += i_626_
                    var i_631_ = 8192 + i_615_ * i_621_ shr 14
                    i_629_ += i_625_
                    i_631_ += i_627_
                    val is_632_ = IntArray(9)
                    for (i_633_ in 0..2) {
                        for (i_634_ in 0..2) {
                            var i_635_ = 0
                            for (i_636_ in 0..2) i_635_ += (is_514_[3 * i_633_ - -i_636_] * is_628_[3 * i_636_ + i_634_])
                            is_632_[i_633_ * 3 + i_634_] = 8192 + i_635_ shr 14
                        }
                    }
                    var i_637_ = ((is_514_[1] * i_630_ + is_514_[0] * i_629_ + i_631_ * is_514_[2] + 8192) shr 14)
                    var i_638_ = ((8192 + (i_631_ * is_514_[5] + is_514_[3] * i_629_) - -(is_514_[4] * i_630_)) shr 14)
                    var i_639_ = (i_629_ * is_514_[6] + (i_630_ * is_514_[7] - (-(is_514_[8] * i_631_) - 8192)) shr 14)
                    i_637_ += i_610_
                    i_638_ += i_611_
                    i_639_ += i_612_
                    for (i_640_ in 0..<i_515_) {
                        val i_641_ = `is`[i_640_]
                        if (anIntArrayArray5539!!.size > i_641_) {
                            val is_642_ = anIntArrayArray5539!![i_641_]!!
                            var i_643_ = 0
                            while (is_642_.size > i_643_) {
                                val i_644_ = is_642_[i_643_]
                                if (aShortArray5608 == null || (aShortArray5608!![i_644_].toInt() and i_513_) != 0) {
                                    var i_645_ = ((8192 + (is_632_[1] * anIntArray5593!![i_644_]) + ((is_632_[0] * anIntArray5543!![i_644_]) + (is_632_[2] * anIntArray5644!![i_644_]))) shr 14)
                                    var i_646_ = ((is_632_[4] * anIntArray5593!![i_644_] + (anIntArray5543!![i_644_] * is_632_[3]) - (-(is_632_[5] * anIntArray5644!![i_644_]) - 8192)) shr 14)
                                    i_645_ += i_637_
                                    i_646_ += i_638_
                                    var i_647_ = ((is_632_[7] * anIntArray5593!![i_644_] + (is_632_[6] * anIntArray5543!![i_644_]) - -(is_632_[8] * anIntArray5644!![i_644_]) - -8192) shr 14)
                                    anIntArray5543!![i_644_] = i_645_
                                    i_647_ += i_639_
                                    anIntArray5593!![i_644_] = i_646_
                                    anIntArray5644!![i_644_] = i_647_
                                }
                                i_643_++
                            }
                        }
                    }
                }
            } else if (i == 5) {
                if (anIntArrayArray5553 != null) {
                    for (i_653_ in 0..<i_515_) {
                        val i_654_ = `is`[i_653_]
                        if (i_654_ < anIntArrayArray5553!!.size) {
                            val is_655_ = anIntArrayArray5553!![i_654_]!!
                            var i_656_ = 0
                            while (is_655_.size > i_656_) {
                                val i_657_ = is_655_[i_656_]
                                if (aShortArray5573 == null || (aShortArray5573!![i_657_].toInt() and i_513_) != 0) {
                                    var i_658_ = ((aByteArray5542!![i_657_].toInt() and 0xff) - -(8 * i_510_))
                                    if (i_658_ < 0) i_658_ = 0
                                    else if (i_658_ > 255) i_658_ = 255
                                    aByteArray5542!![i_657_] = i_658_.toByte()
                                    if (aClass123_5610 != null) aClass123_5610!!.anInterface2_1811 = null
                                }
                                i_656_++
                            }
                        }
                    }
                    if (aClass118Array5621 != null) {
                        for (i_659_ in 0..<anInt5536) {
                            val class118 = aClass118Array5621!![i_659_]!!
                            val class48 = aClass48Array5596!![i_659_]!!
                            class48.anInt858 = ((255 + -(0xff and (aByteArray5542!![(class118.anInt1783)]).toInt()) shl 24) or (class48.anInt858 and 0xffffff))
                        }
                    }
                }
            } else if (i == 7) {
                if (anIntArrayArray5553 != null) {
                    var i_660_ = 0
                    while (i_515_ > i_660_) {
                        val i_661_ = `is`[i_660_]
                        if (anIntArrayArray5553!!.size > i_661_) {
                            val is_662_ = anIntArrayArray5553!![i_661_]!!
                            var i_663_ = 0
                            while ((is_662_.size > i_663_)) {
                                val i_664_ = is_662_[i_663_]
                                if (aShortArray5573 == null || (aShortArray5573!![i_664_].toInt() and i_513_) != 0) {
                                    val i_665_ = aShortArray5580!![i_664_].toInt() and 0xffff
                                    var i_666_ = (0xfc7e and i_665_) shr 10
                                    var i_667_ = (i_665_ and 0x3ed) shr 7
                                    i_667_ += i_511_ / 4
                                    var i_668_ = 0x7f and i_665_
                                    i_666_ = i_666_ + i_510_ and 0x3f
                                    if (i_667_ < 0) i_667_ = 0
                                    else if (i_667_ > 7) i_667_ = 7
                                    i_668_ += i_512_
                                    if (i_668_ < 0) i_668_ = 0
                                    else if (i_668_ > 127) i_668_ = 127
                                    aShortArray5580!![i_664_] = (Class273.method2057(i_668_, (Class273.method2057(i_666_ shl 10, i_667_ shl 7)))).toShort()
                                    if (aClass123_5610 != null) aClass123_5610!!.anInterface2_1811 = null
                                }
                                i_663_++
                            }
                        }
                        i_660_++
                    }
                    if (aClass118Array5621 != null) {
                        var i_669_ = 0
                        while (anInt5536 > i_669_) {
                            val class118 = aClass118Array5621!![i_669_]!!
                            val class48 = aClass48Array5596!![i_669_]!!
                            class48.anInt858 = (0xffffff and (Class10.anIntArray179!![(aShortArray5580!![(class118.anInt1783)]).toInt() and 0xffff]) or (class48.anInt858 and 0xffffff.inv()))
                            i_669_++
                        }
                    }
                }
            } else if (i == 8) {
                if (anIntArrayArray5627 != null) {
                    var i_670_ = 0
                    while (i_515_ > i_670_) {
                        val i_671_ = `is`[i_670_]
                        if (i_671_ < anIntArrayArray5627!!.size) {
                            val is_672_ = anIntArrayArray5627!![i_671_]!!
                            var i_673_ = 0
                            while (is_672_.size > i_673_) {
                                val class48 = aClass48Array5596!![is_672_[i_673_]]!!
                                class48.anInt847 += i_511_
                                class48.anInt854 += i_510_
                                i_673_++
                            }
                        }
                        i_670_++
                    }
                }
            } else if (i == 10) {
                if (anIntArrayArray5627 != null) {
                    for (i_674_ in 0..<i_515_) {
                        val i_675_ = `is`[i_674_]
                        if (i_675_ < anIntArrayArray5627!!.size) {
                            val is_676_ = anIntArrayArray5627!![i_675_]!!
                            for (i_677_ in is_676_.indices) {
                                val class48 = aClass48Array5596!![is_676_[i_677_]]!!
                                class48.anInt857 = (i_511_ * class48.anInt857 shr 7)
                                class48.anInt856 = (i_510_ * class48.anInt856 shr 7)
                            }
                        }
                    }
                }
            } else if (i == 9) {
                if (anIntArrayArray5627 != null) {
                    for (i_678_ in 0..<i_515_) {
                        val i_679_ = `is`[i_678_]
                        if (i_679_ < anIntArrayArray5627!!.size) {
                            val is_680_ = anIntArrayArray5627!![i_679_]!!
                            var i_681_ = 0
                            while (is_680_.size > i_681_) {
                                val class48 = aClass48Array5596!![is_680_[i_681_]]!!
                                class48.anInt853 = 0x3fff and (class48.anInt853 + i_510_)
                                i_681_++
                            }
                        }
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("paa.I(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_510_ + ',' + i_511_ + ',' + i_512_ + ',' + bool + ',' + i_513_ + ',' + (if (is_514_ != null) "{...}" else "null") + ')'))
        }
    }

    private fun method692(i: Byte) {
        anInt5568++
        var i_682_ = 32767
        var i_683_ = 32767
        var i_684_ = 32767
        var i_685_ = -32768
        var i_686_ = -32768
        var i_687_ = -32768
        var i_688_ = 0
        var i_689_ = 0
        for (i_690_ in 0..<anInt5557) {
            val i_691_ = anIntArray5543!![i_690_]
            val i_692_ = anIntArray5593!![i_690_]
            if (i_692_ > i_686_) i_686_ = i_692_
            if (i_692_ < i_683_) i_683_ = i_692_
            val i_693_ = anIntArray5644!![i_690_]
            if (i_685_ < i_691_) i_685_ = i_691_
            if (i_682_ > i_691_) i_682_ = i_691_
            if (i_693_ > i_687_) i_687_ = i_693_
            if (i_684_ > i_693_) i_684_ = i_693_
            var i_694_ = i_691_ * i_691_ + i_693_ * i_693_
            if (i_694_ > i_688_) i_688_ = i_694_
            i_694_ = i_693_ * i_693_ + (i_691_ * i_691_ + i_692_ * i_692_)
            if (i_694_ > i_689_) i_689_ = i_694_
        }
        aShort5591 = i_683_.toShort()
        aShort5617 = i_684_.toShort()
        if (i.toInt() != -123) method618()
        aShort5646 = i_687_.toShort()
        aShort5540 = i_682_.toShort()
        aShort5629 = i_686_.toShort()
        aShort5586 = i_685_.toShort()
        aShort5634 = (0.99 + sqrt(i_688_.toDouble())).toInt().toShort()
        aShort5559 = (0.99 + sqrt(i_689_.toDouble())).toInt().toShort()
        aBoolean5527 = true
    }

    public override fun fa(): Int {
        anInt5635++
        if (!aBoolean5527) method692((-123).toByte())
        return aShort5591.toInt()
    }

    internal constructor(var_ha_Sub2: ha_Sub2?) {
        aBoolean5527 = false
        anInt5529 = 0
        anInt5632 = 0
        anInt5557 = 0
        anInt5642 = 0
        aBoolean5638 = false
        try {
            aHa_Sub2_5598 = var_ha_Sub2
            aClass123_5605 = Class123(null, 5126, 3, 0)
            aClass123_5620 = Class123(null, 5126, 2, 0)
            aClass123_5563 = Class123(null, 5126, 3, 0)
            aClass123_5610 = Class123(null, 5121, 4, 0)
            aClass270_5575 = Class270()
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("paa.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ')'))
        }
    }

    internal constructor(var_ha_Sub2: ha_Sub2?, class124: Class124?, i: Int, i_695_: Int, i_696_: Int, i_697_: Int) {
        aBoolean5527 = false
        anInt5529 = 0
        anInt5632 = 0
        anInt5557 = 0
        anInt5642 = 0
        aBoolean5638 = false
        do {
            try {
                anInt5556 = i_697_
                anInt5648 = i
                aHa_Sub2_5598 = var_ha_Sub2
                if (method616(2, i, i_697_)) aClass123_5605 = Class123(null, 5126, 3, 0)
                if (Class137.method1163(i_697_, 78.toByte(), i)) aClass123_5620 = Class123(null, 5126, 2, 0)
                if (method166(69.toByte(), i_697_, i)) aClass123_5563 = Class123(null, 5126, 3, 0)
                if (Class146.method1193(i_697_, i, true)) aClass123_5610 = Class123(null, 5121, 4, 0)
                if (Class156.method1238(i, i_697_, -31)) aClass270_5575 = Class270()
                val var_d: d = var_ha_Sub2!!.aD4579!!
                anIntArray5528 = IntArray(class124!!.anInt1821 + 1)
                val `is` = IntArray(class124.anInt1817)
                var i_698_ = 0
                while ((i_698_ < class124.anInt1817)) {
                    if (class124.aByteArray1843 == null || class124.aByteArray1843!![i_698_].toInt() != 2) {
                        if (class124.aShortArray1822 != null && (class124.aShortArray1822!![i_698_].toInt() != -1)) {
                            val class12 = var_d.method3(((class124.aShortArray1822!![i_698_]).toInt() and 0xffff), -6662)
                            if (((anInt5556 and 0x40) == 0 || !class12!!.aBoolean209) && class12!!.aBoolean204) {
                                i_698_++
                                continue
                            }
                        }
                        `is`[anInt5632++] = i_698_
                        anIntArray5528!![(class124.aShortArray1863[i_698_]).toInt()] = anIntArray5528!![(class124.aShortArray1863[i_698_]).toInt()] + 1
                        anIntArray5528!![(class124.aShortArray1835!![i_698_]).toInt()] = anIntArray5528!![(class124.aShortArray1835!![i_698_]).toInt()] + 1
                        anIntArray5528!![(class124.aShortArray1855[i_698_]).toInt()] = anIntArray5528!![(class124.aShortArray1855[i_698_]).toInt()] + 1
                    }
                    i_698_++
                }
                anInt5537 = anInt5632
                val ls = LongArray(anInt5632)
                val bool = (0x100 and anInt5648) != 0
                var i_699_ = 0
                while (anInt5632 > i_699_) {
                    val i_700_ = `is`[i_699_]
                    var class12: Class12? = null
                    var i_701_ = 0
                    var i_702_ = 0
                    var i_703_ = 0
                    var i_704_ = 0
                    if (class124.aClass162Array1832 != null) {
                        var bool_705_ = false
                        var i_706_ = 0
                        while ((class124.aClass162Array1832!!.size > i_706_)) {
                            val class162 = (class124.aClass162Array1832!![i_706_])!!
                            if (i_700_ == class162.anInt2155) {
                                val class189 = Class73.method742(104, (class162.anInt2153))
                                if (class189.aBoolean2531) bool_705_ = true
                                if (class189.anInt2525 != -1) {
                                    val class12_707_ = var_d.method3((class189.anInt2525), -6662)
                                    if (class12_707_!!.anInt200 == 2) aBoolean5595 = true
                                }
                            }
                            i_706_++
                        }
                        if (bool_705_) {
                            ls[i_699_] = 9223372036854775807L
                            anInt5537--
                            i_699_++
                            continue
                        }
                    }
                    var i_708_ = -1
                    if (class124.aShortArray1822 != null) {
                        i_708_ = class124.aShortArray1822!![i_700_].toInt()
                        if (i_708_ != -1) {
                            class12 = var_d.method3(i_708_ and 0xffff, -6662)
                            if ((anInt5556 and 0x40) != 0 && class12!!.aBoolean209) {
                                i_708_ = -1
                                class12 = null
                            } else {
                                i_704_ = class12!!.aByte202.toInt()
                                if (class12.aByte198.toInt() != 0 || class12.aByte211.toInt() != 0) aBoolean5638 = true
                                i_703_ = class12.aByte213.toInt()
                            }
                        }
                    }
                    val bool_709_ = ((class124.aByteArray1834 != null && (class124.aByteArray1834!![i_700_].toInt() != 0)) || (class12 != null && class12.anInt200 != 0))
                    if ((bool || bool_709_) && class124.aByteArray1839 != null) i_701_ += (class124.aByteArray1839!![i_700_].toInt() shl 17)
                    if (bool_709_) i_701_ += 65536
                    i_701_ += (0xff and i_703_) shl 8
                    i_701_ += i_704_ and 0xff
                    i_702_ += (i_708_ and 0xffff) shl 16
                    i_702_ += i_699_ and 0xffff
                    ls[i_699_] = (i_701_.toLong() shl 32) - -i_702_.toLong()
                    val class64_sub3_710_ = this
                    class64_sub3_710_.aBoolean5638 = (class64_sub3_710_.aBoolean5638 or (class12 != null && (class12.aByte198.toInt() != 0 || class12.aByte211.toInt() != 0)))
                    aBoolean5595 = aBoolean5595 or bool_709_
                    i_699_++
                }
                method2832(`is`, ls, 0)
                anIntArray5644 = class124.anIntArray1852
                anIntArray5593 = class124.anIntArray1847
                anInt5642 = class124.anInt1836
                anIntArray5543 = class124.anIntArray1841
                aShortArray5608 = class124.aShortArray1842
                anInt5557 = class124.anInt1821
                aClass342Array5541 = class124.aClass342Array1866
                val class8s: Array<Class8?> = arrayOfNulls<Class8>(anInt5557)
                aClass129Array5640 = class124.aClass129Array1846
                if (class124.aClass162Array1832 != null) {
                    anInt5536 = class124.aClass162Array1832!!.size
                    aClass48Array5596 = arrayOfNulls<Class48>(anInt5536)
                    aClass118Array5621 = arrayOfNulls<Class118>(anInt5536)
                    var i_711_ = 0
                    while (anInt5536 > i_711_) {
                        val class162 = class124.aClass162Array1832!![i_711_]!!
                        val class189 = Class73.method742(104, (class162.anInt2153))
                        var i_712_ = -1
                        for (i_713_ in 0..<anInt5632) {
                            if (class162.anInt2155 == `is`[i_713_]) {
                                i_712_ = i_713_
                                break
                            }
                        }
                        if (i_712_ == -1) throw RuntimeException()
                        var i_714_ = ((Class10.anIntArray179!![0xffff and (class124.aShortArray1862[class162.anInt2155]).toInt()]) and 0xffffff)
                        i_714_ = i_714_ or (255 + -(if ((class124.aByteArray1834) == null) 0 else (class124.aByteArray1834!![(class162.anInt2155)])) shl 24)
                        aClass118Array5621!![i_711_] = Class118(i_712_, (class124.aShortArray1863[class162.anInt2155]).toInt(), (class124.aShortArray1835!![class162.anInt2155]).toInt(), (class124.aShortArray1855[class162.anInt2155]).toInt(), class189.anInt2526, class189.anInt2530, class189.anInt2525, class189.anInt2533, class189.anInt2534, class189.aBoolean2531, class189.aBoolean2522, class162.anInt2158)
                        aClass48Array5596!![i_711_] = Class48(i_714_)
                        i_711_++
                    }
                }
                val i_715_ = anInt5632 * 3
                aShortArray5649 = ShortArray(i_715_)
                Class258_Sub2.aLongArray8530 = LongArray(i_715_)
                aShortArray5601 = ShortArray(anInt5632)
                aFloatArray5571 = FloatArray(i_715_)
                aShortArray5564 = ShortArray(i_715_)
                aShortArray5576 = ShortArray(i_715_)
                aByteArray5594 = ByteArray(i_715_)
                aShortArray5583 = ShortArray(i_715_)
                if (class124.aShortArray1856 != null) aShortArray5573 = ShortArray(anInt5632)
                aShort5544 = i_695_.toShort()
                aShortArray5580 = ShortArray(anInt5632)
                aShortArray5579 = ShortArray(anInt5632)
                aShortArray5592 = ShortArray(anInt5632)
                aShort5645 = i_696_.toShort()
                aByteArray5542 = ByteArray(anInt5632)
                aFloatArray5552 = FloatArray(i_715_)
                aShortArray5566 = ShortArray(anInt5632)
                var i_716_ = 0
                for (i_717_ in 0..<class124.anInt1821) {
                    val i_718_ = anIntArray5528!![i_717_]
                    anIntArray5528!![i_717_] = i_716_
                    class8s[i_717_] = Class8()
                    i_716_ += i_718_
                }
                anIntArray5528!![class124.anInt1821] = i_716_
                val class358 = method565(255, anInt5632, class124, `is`)!!
                val class347s: Array<Class347?> = arrayOfNulls<Class347>(class124.anInt1817)
                var i_719_ = 0
                while (class124.anInt1817 > i_719_) {
                    val i_720_ = class124.aShortArray1863[i_719_]
                    val i_721_ = class124.aShortArray1835!![i_719_]
                    val i_722_ = class124.aShortArray1855[i_719_]
                    val i_723_ = anIntArray5543!![i_721_.toInt()] + -anIntArray5543!![i_720_.toInt()]
                    val i_724_ = anIntArray5593!![i_721_.toInt()] - anIntArray5593!![i_720_.toInt()]
                    val i_725_ = -anIntArray5644!![i_720_.toInt()] + anIntArray5644!![i_721_.toInt()]
                    val i_726_ = -anIntArray5543!![i_720_.toInt()] + anIntArray5543!![i_722_.toInt()]
                    val i_727_ = anIntArray5593!![i_722_.toInt()] + -anIntArray5593!![i_720_.toInt()]
                    val i_728_ = -anIntArray5644!![i_720_.toInt()] + anIntArray5644!![i_722_.toInt()]
                    var i_729_ = i_724_ * i_728_ + -(i_727_ * i_725_)
                    var i_730_ = -(i_728_ * i_723_) + i_726_ * i_725_
                    var i_731_: Int
                    i_731_ = -(i_724_ * i_726_) + i_727_ * i_723_
                    while ((i_729_ > 8192 || i_730_ > 8192 || i_731_ > 8192 || i_729_ < -8192 || i_730_ < -8192 || i_731_ < -8192)) {
                        i_729_ = i_729_ shr 1
                        i_731_ = i_731_ shr 1
                        i_730_ = i_730_ shr 1
                    }
                    var i_732_ = sqrt((i_731_ * i_731_ + i_730_ * i_730_ + i_729_ * i_729_).toDouble()).toInt()
                    if (i_732_ <= 0) i_732_ = 1
                    i_731_ = i_731_ * 256 / i_732_
                    i_729_ = i_729_ * 256 / i_732_
                    i_730_ = 256 * i_730_ / i_732_
                    val i_733_ = (if (class124.aByteArray1843 == null) 0.toByte() else class124.aByteArray1843!![i_719_])
                    if (i_733_.toInt() == 0) {
                        var class8 = class8s[i_720_.toInt()]!!
                        class8.anInt162 += i_730_
                        class8.anInt159 += i_731_
                        class8.anInt160++
                        class8.anInt161 += i_729_
                        class8 = class8s[i_721_.toInt()]!!
                        class8.anInt161 += i_729_
                        class8.anInt162 += i_730_
                        class8.anInt160++
                        class8.anInt159 += i_731_
                        class8 = class8s[i_722_.toInt()]!!
                        class8.anInt160++
                        class8.anInt159 += i_731_
                        class8.anInt162 += i_730_
                        class8.anInt161 += i_729_
                    } else if (i_733_.toInt() == 1) {
                        class347s[i_719_] = Class347()
                        val class347 = class347s[i_719_]!!
                        class347.anInt4283 = i_731_
                        class347.anInt4279 = i_730_
                        class347.anInt4282 = i_729_
                    }
                    i_719_++
                }
                var i_734_ = 0
                while (anInt5632 > i_734_) {
                    val i_735_ = `is`[i_734_]
                    val i_736_ = (class124.aShortArray1862[i_735_].toInt() and 0xffff)
                    var i_737_: Int
                    if (class124.aByteArray1820 != null) i_737_ = class124.aByteArray1820!![i_735_].toInt()
                    else i_737_ = -1
                    val i_738_: Int
                    if (class124.aByteArray1834 != null) i_738_ = 0xff and (class124.aByteArray1834!![i_735_]).toInt()
                    else i_738_ = 0
                    var i_739_: Short = (if (class124.aShortArray1822 == null) (-1).toShort() else class124.aShortArray1822!![i_735_])
                    if (i_739_.toInt() != -1 && (0x40 and anInt5556) != 0) {
                        val class12 = var_d.method3(i_739_.toInt() and 0xffff, -6662)
                        if (class12!!.aBoolean209) i_739_ = (-1).toShort()
                    }
                    var f = 0.0f
                    var f_740_ = 0.0f
                    var f_741_ = 0.0f
                    var f_742_ = 0.0f
                    var f_743_ = 0.0f
                    var f_744_ = 0.0f
                    var i_745_ = 0
                    var i_746_ = 0
                    var i_747_ = 0
                    if (i_739_.toInt() != -1) {
                        if (i_737_ == -1) {
                            f_742_ = 1.0f
                            i_746_ = 2
                            f_744_ = 0.0f
                            i_745_ = 1
                            f_740_ = 1.0f
                            f = 0.0f
                            f_743_ = 0.0f
                            f_741_ = 1.0f
                        } else {
                            i_737_ = i_737_ and 0xff
                            val i_748_ = class124.aByteArray1823[i_737_]
                            if (i_748_.toInt() == 0) {
                                val i_749_ = (class124.aShortArray1863[i_735_])
                                val i_750_ = (class124.aShortArray1835!![i_735_])
                                val i_751_ = (class124.aShortArray1855[i_735_])
                                val i_752_ = (class124.aShortArray1829[i_737_])
                                val i_753_ = (class124.aShortArray1849[i_737_])
                                val i_754_ = (class124.aShortArray1825[i_737_])
                                val f_755_ = (class124.anIntArray1841[i_752_.toInt()]).toFloat()
                                val f_756_ = (class124.anIntArray1847[i_752_.toInt()]).toFloat()
                                val f_757_ = (class124.anIntArray1852[i_752_.toInt()]).toFloat()
                                val f_758_ = ((class124.anIntArray1841[i_753_.toInt()]).toFloat() - f_755_)
                                val f_759_ = ((class124.anIntArray1847[i_753_.toInt()]).toFloat() - f_756_)
                                val f_760_ = (-f_757_ + (class124.anIntArray1852[i_753_.toInt()]).toFloat())
                                val f_761_ = ((class124.anIntArray1841[i_754_.toInt()]).toFloat() - f_755_)
                                val f_762_ = (-f_756_ + (class124.anIntArray1847[i_754_.toInt()]).toFloat())
                                val f_763_ = (-f_757_ + (class124.anIntArray1852[i_754_.toInt()]).toFloat())
                                val f_764_ = (-f_755_ + (class124.anIntArray1841[i_749_.toInt()]).toFloat())
                                val f_765_ = ((class124.anIntArray1847[i_749_.toInt()]).toFloat() - f_756_)
                                val f_766_ = ((class124.anIntArray1852[i_749_.toInt()]).toFloat() - f_757_)
                                val f_767_ = (-f_755_ + (class124.anIntArray1841[i_750_.toInt()]).toFloat())
                                val f_768_ = (-f_756_ + (class124.anIntArray1847[i_750_.toInt()]).toFloat())
                                val f_769_ = (-f_757_ + (class124.anIntArray1852[i_750_.toInt()]).toFloat())
                                val f_770_ = (-f_755_ + (class124.anIntArray1841[i_751_.toInt()]).toFloat())
                                val f_771_ = (-f_756_ + (class124.anIntArray1847[i_751_.toInt()]).toFloat())
                                val f_772_ = (-f_757_ + (class124.anIntArray1852[i_751_.toInt()]).toFloat())
                                val f_773_ = -(f_760_ * f_762_) + f_759_ * f_763_
                                val f_774_ = -(f_763_ * f_758_) + f_761_ * f_760_
                                val f_775_ = f_762_ * f_758_ - f_761_ * f_759_
                                var f_776_ = -(f_763_ * f_774_) + f_775_ * f_762_
                                var f_777_ = -(f_761_ * f_775_) + f_763_ * f_773_
                                var f_778_ = f_774_ * f_761_ - f_762_ * f_773_
                                var f_779_ = 1.0f / (f_760_ * f_778_ + (f_759_ * f_777_ + f_776_ * f_758_))
                                f_743_ = f_779_ * (f_770_ * f_776_ + f_777_ * f_771_ + f_772_ * f_778_)
                                f = f_779_ * (f_776_ * f_764_ + f_777_ * f_765_ + f_778_ * f_766_)
                                f_741_ = f_779_ * (f_769_ * f_778_ + (f_767_ * f_776_ + f_777_ * f_768_))
                                f_778_ = -(f_773_ * f_759_) + f_758_ * f_774_
                                f_776_ = f_759_ * f_775_ - f_774_ * f_760_
                                f_777_ = f_760_ * f_773_ - f_775_ * f_758_
                                f_779_ = 1.0f / (f_763_ * f_778_ + (f_761_ * f_776_ + f_777_ * f_762_))
                                f_742_ = (f_767_ * f_776_ + f_777_ * f_768_ + f_778_ * f_769_) * f_779_
                                f_740_ = (f_778_ * f_766_ + (f_777_ * f_765_ + f_764_ * f_776_)) * f_779_
                                f_744_ = (f_777_ * f_771_ + f_776_ * f_770_ + f_772_ * f_778_) * f_779_
                            } else {
                                val i_780_ = (class124.aShortArray1863[i_735_])
                                val i_781_ = (class124.aShortArray1835!![i_735_])
                                val i_782_ = (class124.aShortArray1855[i_735_])
                                val i_783_ = (class358.anIntArray4416!![i_737_])
                                val i_784_ = (class358.anIntArray4415!![i_737_])
                                val i_785_ = (class358.anIntArray4414!![i_737_])
                                val fs = (class358.aFloatArrayArray4412!![i_737_])!!
                                val i_786_ = (class124.aByteArray1853[i_737_])
                                val f_787_ = ((class124.anIntArray1867[i_737_]).toFloat() / 256.0f)
                                if (i_748_.toInt() == 1) {
                                    val f_805_ = ((class124.anIntArray1844[i_737_]).toFloat() / 1024.0f)
                                    method1885(i_785_, (class124.anIntArray1852[i_780_.toInt()]), i_786_.toInt(), 8, (class124.anIntArray1841[i_780_.toInt()]), Class152.aFloatArray2075, (class124.anIntArray1847[i_780_.toInt()]), f_787_, i_784_, i_783_, f_805_, fs)
                                    f = Class152.aFloatArray2075!![0]
                                    f_740_ = Class152.aFloatArray2075!![1]
                                    method1885(i_785_, (class124.anIntArray1852[i_781_.toInt()]), i_786_.toInt(), 8, (class124.anIntArray1841[i_781_.toInt()]), Class152.aFloatArray2075, (class124.anIntArray1847[i_781_.toInt()]), f_787_, i_784_, i_783_, f_805_, fs)
                                    f_741_ = Class152.aFloatArray2075!![0]
                                    f_742_ = Class152.aFloatArray2075!![1]
                                    method1885(i_785_, (class124.anIntArray1852[i_782_.toInt()]), i_786_.toInt(), 8, (class124.anIntArray1841[i_782_.toInt()]), Class152.aFloatArray2075, (class124.anIntArray1847[i_782_.toInt()]), f_787_, i_784_, i_783_, f_805_, fs)
                                    f_743_ = Class152.aFloatArray2075!![0]
                                    f_744_ = Class152.aFloatArray2075!![1]
                                    val f_806_ = f_805_ / 2.0f
                                    if ((0x1 and i_786_.toInt()) == 0) {
                                        if (f_806_ < -f + f_743_) {
                                            f_743_ -= f_805_
                                            i_746_ = 1
                                        } else if (f_806_ < f - f_743_) {
                                            f_743_ += f_805_
                                            i_746_ = 2
                                        }
                                        if (f_741_ - f > f_806_) {
                                            i_745_ = 1
                                            f_741_ -= f_805_
                                        } else if (-f_741_ + f > f_806_) {
                                            i_745_ = 2
                                            f_741_ += f_805_
                                        }
                                    } else {
                                        if (f_742_ - f_740_ > f_806_) {
                                            f_742_ -= f_805_
                                            i_745_ = 1
                                        } else if (f_740_ - f_742_ > f_806_) {
                                            i_745_ = 2
                                            f_742_ += f_805_
                                        }
                                        if (f_806_ < -f_740_ + f_744_) {
                                            i_746_ = 1
                                            f_744_ -= f_805_
                                        } else if (-f_744_ + f_740_ > f_806_) {
                                            i_746_ = 2
                                            f_744_ += f_805_
                                        }
                                    }
                                } else if (i_748_.toInt() == 2) {
                                    val f_788_ = ((class124.anIntArray1857[i_737_]).toFloat() / 256.0f)
                                    val f_789_ = ((class124.anIntArray1865[i_737_]).toFloat() / 256.0f)
                                    val i_790_ = (-(class124.anIntArray1841[i_780_.toInt()]) + (class124.anIntArray1841[i_781_.toInt()]))
                                    val i_791_ = ((class124.anIntArray1847[i_781_.toInt()]) + -(class124.anIntArray1847[i_780_.toInt()]))
                                    val i_792_ = (-(class124.anIntArray1852[i_780_.toInt()]) + (class124.anIntArray1852[i_781_.toInt()]))
                                    val i_793_ = ((class124.anIntArray1841[i_782_.toInt()]) - (class124.anIntArray1841[i_780_.toInt()]))
                                    val i_794_ = ((class124.anIntArray1847[i_782_.toInt()]) + -(class124.anIntArray1847[i_780_.toInt()]))
                                    val i_795_ = (-(class124.anIntArray1852[i_780_.toInt()]) + (class124.anIntArray1852[i_782_.toInt()]))
                                    val i_796_ = (-(i_792_ * i_794_) + i_791_ * i_795_)
                                    val i_797_ = (i_793_ * i_792_ + -(i_795_ * i_790_))
                                    val i_798_ = (i_794_ * i_790_ + -(i_793_ * i_791_))
                                    val f_799_ = (64.0f / (class124.anIntArray1859!![i_737_]).toFloat())
                                    val f_800_ = (64.0f / (class124.anIntArray1816[i_737_]).toFloat())
                                    val f_801_ = (64.0f / (class124.anIntArray1844[i_737_]).toFloat())
                                    val f_802_ = ((fs[2] * i_798_.toFloat() + (i_797_.toFloat() * fs[1] + i_796_.toFloat() * fs[0])) / f_799_)
                                    val f_803_ = ((fs[5] * i_798_.toFloat() + (i_797_.toFloat() * fs[4] + fs[3] * i_796_.toFloat())) / f_800_)
                                    val f_804_ = ((i_798_.toFloat() * fs[8] + (fs[7] * i_797_.toFloat() + i_796_.toFloat() * fs[6])) / f_801_)
                                    i_747_ = Class331.method2635(f_803_, false, f_804_, f_802_)
                                    Class262.method1991(f_789_, f_787_, fs, (class124.anIntArray1852[i_780_.toInt()]), i_785_, false, i_786_.toInt(), i_783_, (class124.anIntArray1841[i_780_.toInt()]), (class124.anIntArray1847[i_780_.toInt()]), f_788_, Class152.aFloatArray2075, i_784_, i_747_)
                                    f_740_ = Class152.aFloatArray2075!![1]
                                    f = Class152.aFloatArray2075!![0]
                                    Class262.method1991(f_789_, f_787_, fs, (class124.anIntArray1852[i_781_.toInt()]), i_785_, false, i_786_.toInt(), i_783_, (class124.anIntArray1841[i_781_.toInt()]), (class124.anIntArray1847[i_781_.toInt()]), f_788_, Class152.aFloatArray2075!!, i_784_, i_747_)
                                    f_742_ = Class152.aFloatArray2075!![1]
                                    f_741_ = Class152.aFloatArray2075!![0]
                                    Class262.method1991(f_789_, f_787_, fs, (class124.anIntArray1852[i_782_.toInt()]), i_785_, false, i_786_.toInt(), i_783_, (class124.anIntArray1841[i_782_.toInt()]), (class124.anIntArray1847[i_782_.toInt()]), f_788_, Class152.aFloatArray2075, i_784_, i_747_)
                                    f_743_ = Class152.aFloatArray2075!![0]
                                    f_744_ = Class152.aFloatArray2075!![1]
                                } else if (i_748_.toInt() == 3) {
                                    Class181.method1367(i_785_, i_786_.toInt(), f_787_, (class124.anIntArray1841[i_780_.toInt()]), Class152.aFloatArray2075, (class124.anIntArray1852[i_780_.toInt()]), i_783_, (class124.anIntArray1847[i_780_.toInt()]), i_784_, -4, fs)
                                    f_740_ = Class152.aFloatArray2075!![1]
                                    f = Class152.aFloatArray2075!![0]
                                    Class181.method1367(i_785_, i_786_.toInt(), f_787_, (class124.anIntArray1841[i_781_.toInt()]), Class152.aFloatArray2075, (class124.anIntArray1852[i_781_.toInt()]), i_783_, (class124.anIntArray1847[i_781_.toInt()]), i_784_, -4, fs)
                                    f_741_ = Class152.aFloatArray2075!![0]
                                    f_742_ = Class152.aFloatArray2075!![1]
                                    Class181.method1367(i_785_, i_786_.toInt(), f_787_, (class124.anIntArray1841[i_782_.toInt()]), Class152.aFloatArray2075, (class124.anIntArray1852[i_782_.toInt()]), i_783_, (class124.anIntArray1847[i_782_.toInt()]), i_784_, -4, fs)
                                    f_744_ = Class152.aFloatArray2075!![1]
                                    f_743_ = Class152.aFloatArray2075!![0]
                                    if ((0x1 and i_786_.toInt()) == 0) {
                                        if (-f + f_743_ > 0.5f) {
                                            i_746_ = 1
                                            f_743_--
                                        } else if (f - f_743_ > 0.5f) {
                                            i_746_ = 2
                                            f_743_++
                                        }
                                        if (f_741_ - f > 0.5f) {
                                            i_745_ = 1
                                            f_741_--
                                        } else if (-f_741_ + f > 0.5f) {
                                            i_745_ = 2
                                            f_741_++
                                        }
                                    } else {
                                        if (-f_740_ + f_742_ > 0.5f) {
                                            i_745_ = 1
                                            f_742_--
                                        } else if (f_740_ - f_742_ > 0.5f) {
                                            f_742_++
                                            i_745_ = 2
                                        }
                                        if (f_744_ - f_740_ > 0.5f) {
                                            f_744_--
                                            i_746_ = 1
                                        } else if (f_740_ - f_744_ > 0.5f) {
                                            i_746_ = 2
                                            f_744_++
                                        }
                                    }
                                }
                            }
                        }
                    }
                    val i_807_: Byte
                    if (class124.aByteArray1843 != null) i_807_ = class124.aByteArray1843!![i_735_]
                    else i_807_ = 0.toByte()
                    if (i_807_.toInt() == 0) {
                        val l = ((((i_736_ shl 8).toLong() + ((i_747_ shl 24).toLong() + i_738_.toLong())) shl 32) + (i_737_ shl 2).toLong())
                        val i_808_ = class124.aShortArray1863[i_735_]
                        val i_809_ = class124.aShortArray1835!![i_735_]
                        val i_810_ = class124.aShortArray1855[i_735_]
                        var class8 = class8s[i_808_.toInt()]!!
                        aShortArray5592!![i_734_] = method683(class8.anInt162, class8.anInt159, l, class8.anInt161, class124, class8.anInt160, f, 0, i_808_.toInt(), f_740_)
                        class8 = class8s[i_809_.toInt()]!!
                        aShortArray5579!![i_734_] = method683(class8.anInt162, class8.anInt159, i_745_.toLong() + l, class8.anInt161, class124, class8.anInt160, f_741_, 0, i_809_.toInt(), f_742_)
                        class8 = class8s[i_810_.toInt()]!!
                        aShortArray5566!![i_734_] = method683(class8.anInt162, class8.anInt159, l + i_746_.toLong(), class8.anInt161, class124, class8.anInt160, f_743_, 0, i_810_.toInt(), f_744_)
                    } else if (i_807_.toInt() == 1) {
                        val class347 = class347s[i_735_]!!
                        val l = ((((i_736_ shl 8).toLong() + (i_747_ shl 24).toLong() + i_738_.toLong()) shl 32) + ((if (class347.anInt4282 > 0) 1024 else 2048) + (i_737_ shl 2) + ((class347.anInt4279) + 256 shl 12) - -(256 + (class347.anInt4283) shl 22)).toLong())
                        aShortArray5592!![i_734_] = method683(class347.anInt4279, class347.anInt4283, l, class347.anInt4282, class124, 0, f, 0, (class124.aShortArray1863[i_735_]).toInt(), f_740_)
                        aShortArray5579!![i_734_] = method683(class347.anInt4279, class347.anInt4283, l + i_745_.toLong(), class347.anInt4282, class124, 0, f_741_, 0, (class124.aShortArray1835!![i_735_]).toInt(), f_742_)
                        aShortArray5566!![i_734_] = method683(class347.anInt4279, class347.anInt4283, l + i_746_.toLong(), class347.anInt4282, class124, 0, f_743_, 0, (class124.aShortArray1855[i_735_]).toInt(), f_744_)
                    }
                    if (class124.aByteArray1834 != null) aByteArray5542!![i_734_] = class124.aByteArray1834!![i_735_]
                    if (class124.aShortArray1856 != null) aShortArray5573!![i_734_] = class124.aShortArray1856!![i_735_]
                    aShortArray5580!![i_734_] = class124.aShortArray1862[i_735_]
                    aShortArray5601!![i_734_] = i_739_
                    i_734_++
                }
                var i_811_ = 0
                var i_812_: Short = -10000
                for (i_813_ in 0..<anInt5537) {
                    val i_814_ = aShortArray5601!![i_813_]
                    if (i_812_ != i_814_) {
                        i_811_++
                        i_812_ = i_814_
                    }
                }
                anIntArray5626 = IntArray(1 + i_811_)
                i_811_ = 0
                i_812_ = (-10000).toShort()
                var i_815_ = 0
                while (anInt5537 > i_815_) {
                    val i_816_ = aShortArray5601!![i_815_]
                    if (i_816_ != i_812_) {
                        anIntArray5626!![i_811_++] = i_815_
                        i_812_ = i_816_
                    }
                    i_815_++
                }
                anIntArray5626!![i_811_] = anInt5537
                Class258_Sub2.aLongArray8530 = null
                aShortArray5564 = Class119_Sub2.method1078(aShortArray5564, anInt5529, 114)
                aShortArray5583 = Class119_Sub2.method1078(aShortArray5583, anInt5529, 126)
                aShortArray5576 = Class119_Sub2.method1078(aShortArray5576, anInt5529, 100)
                aByteArray5594 = Class93.method863(anInt5529, 113.toByte(), aByteArray5594)
                aFloatArray5552 = Class231.method1638(anInt5529, aFloatArray5552!!, -1)
                aFloatArray5571 = Class231.method1638(anInt5529, aFloatArray5571!!, -1)
                if (class124.anIntArray1868 != null && Class312.method2332(anInt5556, 125.toByte(), i)) anIntArrayArray5539 = class124.method1100(false, -42)
                if (class124.aClass162Array1832 != null && Class229.method1633(false, i, anInt5556)) anIntArrayArray5627 = class124.method1093((-69).toByte())
                if (class124.anIntArray1824 == null || !method371(i, 256, anInt5556)) break
                var i_817_ = 0
                val is_818_ = IntArray(256)
                var i_819_ = 0
                while (anInt5632 > i_819_) {
                    val i_820_ = class124.anIntArray1824!![`is`[i_819_]]
                    if (i_820_ >= 0) {
                        if (i_817_ < i_820_) i_817_ = i_820_
                        is_818_[i_820_]++
                    }
                    i_819_++
                }
                anIntArrayArray5553 = arrayOfNulls<IntArray>(i_817_ + 1)
                for (i_821_ in 0..i_817_) {
                    anIntArrayArray5553!![i_821_] = IntArray(is_818_[i_821_])
                    is_818_[i_821_] = 0
                }
                for (i_822_ in 0..<anInt5632) {
                    val i_823_ = class124.anIntArray1824!![`is`[i_822_]]
                    if (i_823_ >= 0) anIntArrayArray5553!![i_823_]!![is_818_[i_823_]++] = i_822_
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("paa.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (class124 != null) "{...}" else "null") + ',' + i + ',' + i_695_ + ',' + i_696_ + ',' + i_697_ + ')'))
            }
            break
        } while (false)
    }

    companion object {
        @JvmField
        var anInt5530: Int = 0
        @JvmField
        var anInt5531: Int = 0
        @JvmField
        var anInt5532: Int = 0
        @JvmField
        var anInt5533: Int = 0
        @JvmField
        var anInt5534: Int = 0
        @JvmField
        var anInt5535: Int = 0
        @JvmField
        var anInt5538: Int = 0
        @JvmField
        var anInt5545: Int = 0
        @JvmField
        var anInt5546: Int = 0
        @JvmField
        var anInt5547: Int = 0
        @JvmField
        var anInt5548: Int = 0
        @JvmField
        var anInt5549: Int = 0
        @JvmField
        var anInt5550: Int = 0
        @JvmField
        var anInt5551: Int = 0
        @JvmField
        var aClass261_5558: Class261? = null
        @JvmField
        var anInt5560: Int = 0
        @JvmField
        var anInt5561: Int = 0
        @JvmField
        var anInt5562: Int = 0
        @JvmField
        var anInt5565: Int = 0
        @JvmField
        var anInt5567: Int = 0
        @JvmField
        var anInt5568: Int = 0
        @JvmField
        var anInt5569: Int = 0
        @JvmField
        var anInt5570: Int = 0
        @JvmField
        var anInt5574: Int = 0
        @JvmField
        var anInt5577: Int = 0
        @JvmField
        var anInt5578: Int = 0
        @JvmField
        var anInt5582: Int = 0
        @JvmField
        var anInt5584: Int = 0
        @JvmField
        var anInt5585: Int = 0
        @JvmField
        var anInt5587: Int = 0
        @JvmField
        var anInt5588: Int = 0
        @JvmField
        var anInt5589: Int = 0
        @JvmField
        var anInt5590: Int = 0
        @JvmField
        var anInt5597: Int = 0
        @JvmField
        var anInt5599: Int = 0
        @JvmField
        var aString5600: String? = ""
        @JvmField
        var anInt5602: Int = 0
        @JvmField
        var anInt5603: Int = 0
        @JvmField
        var anInt5604: Int = 0
        @JvmField
        var anInt5606: Int = 0
        @JvmField
        var anInt5607: Int = 0
        var aBoolean5609: Boolean = false
        @JvmField
        var anInt5611: Int = 0
        @JvmField
        var anInt5612: Int = 0
        @JvmField
        var anInt5613: Int = 0
        @JvmField
        var anInt5614: Int = 0
        @JvmField
        var anInt5615: Int = 0
        @JvmField
        var anInt5616: Int = 0
        @JvmField
        var anInt5618: Int = 0
        @JvmField
        var anInt5619: Int = 0
        @JvmField
        var anInt5622: Int = 0
        @JvmField
        var anInt5623: Int = 0
        @JvmField
        var anInt5624: Int = 0
        @JvmField
        var anInt5625: Int = 0
        @JvmField
        var anInt5628: Int = 0
        @JvmField
        var anInt5630: Int = 0
        @JvmField
        var anInt5631: Int = 0
        @JvmField
        var anInt5633: Int = 0
        @JvmField
        var anInt5635: Int = 0
        @JvmField
        var anInt5636: Int = 0
        @JvmField
        var anInt5637: Int = 0
        @JvmField
        var anInt5639: Int = 0
        @JvmField
        var anInt5641: Int = 0
        @JvmField
        var anInt5643: Int = 0
        @JvmField
        var anInt5650: Int = 0
        @JvmField
        var anInt5651: Int = 0

        @JvmStatic
        fun method681(i: Int) {
            aClass261_5558 = null
            if (i <= 75) aString5600 = null
            aString5600 = null
        }

        @JvmStatic
        fun method687(i: Byte, i_282_: Int) {
            val i_283_ = 113 / ((-63 - i) / 53)
            anInt5570++
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_282_, 105.toByte(), 5)
            class348_sub42_sub15.method3251(-16058)
        }

        @JvmStatic
        fun method689(i: Byte, i_377_: Int) {
            Class48.anInt859 = -1
            Class244.anInt4609 = -1
            if (i.toInt() != -59) anInt5584 = 77
            anInt5577++
            Class348_Sub36.anInt6992 = i_377_
            Class348_Sub15.method2811(false)
        }

        @JvmStatic
        fun method690(i: Byte, i_378_: Int) {
            anInt5565++
            val class348_sub15 = (Class27.aClass356_389!!.method3480(i_378_.toLong(), -6008) as Class348_Sub15?)
            val i_379_ = -8 % ((i - -49) / 44)
            if (class348_sub15 != null) {
                class348_sub15.aClass55_Sub1_6768!!.method508(1)
                Class303.method2285(class348_sub15.aBoolean6776, (-114).toByte(), class348_sub15.anInt6773)
                class348_sub15.method2715(52.toByte())
            }
        }
    }
}
