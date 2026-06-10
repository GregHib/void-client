import jaclib.memory.Stream
import jaclib.memory.Stream.Companion.c
import kotlin.math.sqrt

class s_Sub3(var_ha_Sub3: ha_Sub3?, i: Int, i_139_: Int, i_140_: Int, i_141_: Int, `is`: Array<IntArray?>, is_142_: Array<IntArray?>?, i_143_: Int) : s(i_140_, i_141_, i_143_, `is`) {
    private val aClass262_8286: Class262
    private var anIntArrayArrayArray8291: Array<Array<IntArray?>?>?
    @JvmField
    var anInt8294: Int = 0
    @JvmField
    var anIntArrayArrayArray8296: Array<Array<IntArray?>?>?
    @JvmField
    var aShortArrayArray8299: Array<ShortArray?>
    private var anInt8301 = 0
    private val anInt8302: Int
    private var anInt8303 = 0
    private var aFloat8305 = -3.4028235E38f
    private var aFloat8306 = 3.4028235E38f
    private var aClass330_8307: Class330? = null
    private var anIntArrayArrayArray8308: Array<Array<IntArray?>?>?
    private val anInt8311: Int
    private var aClass348_Sub3ArrayArrayArray8312: Array<Array<Array<Class348_Sub3?>?>?>?
    @JvmField
    var anIntArrayArrayArray8313: Array<Array<IntArray?>?>?
    private var anIntArrayArrayArray8314: Array<Array<IntArray?>?>? = null
    private val aByteArrayArray8317: Array<ByteArray?>
    @JvmField
    var anIntArrayArrayArray8321: Array<Array<IntArray?>?>?
    @JvmField
    var aHa_Sub3_8322: ha_Sub3? = null
    private var aFloatArrayArray8323: Array<FloatArray?>?
    @JvmField
    var aClass130_8324: Class130? = null
    private var aClass356_8325: Class356? = null
    private var anInterface5_Impl1_8326: Interface5_Impl1? = null
    private var anInterface5_Impl1_8327: Interface5_Impl1? = null
    private var aClass348_Sub3Array8328: Array<Class348_Sub3?>? = null
    private var anInt8329 = 0
    private var aByteArrayArray8330: Array<ByteArray?>?
    private var anInt8331 = 0
    private var aFloatArrayArray8332: Array<FloatArray?>?
    private var aFloatArrayArray8333: Array<FloatArray?>?

    override fun fa(i: Int, i_0_: Int, var_r: r?): r? {
        anInt8290++
        if ((aByteArrayArray8317[i]!![i_0_].toInt() and 0x1) == 0) return null
        val i_1_ = (this.anInt4592 shr this.aHa_Sub3_8322!!.anInt8107)
        val var_r_Sub1 = var_r as r_Sub1?
        val var_r_Sub1_2_: r_Sub1?
        if (var_r_Sub1 != null && var_r_Sub1.method3291(i_1_, i_1_, (-59).toByte())) {
            var_r_Sub1_2_ = var_r_Sub1
            var_r_Sub1_2_.method3289(11)
        } else var_r_Sub1_2_ = r_Sub1(this.aHa_Sub3_8322, i_1_, i_1_)
        var_r_Sub1_2_.method3286(i_1_, -97, i_1_, 0, 0)
        method4005(var_r_Sub1_2_, i_0_, i, 21722)
        return var_r_Sub1_2_
    }

    private fun method4005(var_r_Sub1: r_Sub1, i: Int, i_21_: Int, i_22_: Int) {
        anInt8310++
        if (i_22_ != 21722) fa(16, 8, null)
        val `is` = this.anIntArrayArrayArray8321!![i_21_]!![i]!!
        val is_23_ = this.anIntArrayArrayArray8313!![i_21_]!![i]!!
        val i_24_ = `is`.size
        if (Class30.anIntArray407!!.size < i_24_) {
            Class30.anIntArray407 = IntArray(i_24_)
            Class232.anIntArray3014 = IntArray(i_24_)
        }
        for (i_25_ in 0..<i_24_) {
            Class30.anIntArray407!![i_25_] = (`is`[i_25_] shr this.aHa_Sub3_8322!!.anInt8107)
            Class232.anIntArray3014!![i_25_] = (is_23_[i_25_] shr this.aHa_Sub3_8322!!.anInt8107)
        }
        var i_26_ = 0
        while (i_24_ > i_26_) {
            val i_27_ = Class30.anIntArray407!![i_26_]
            val i_28_ = Class232.anIntArray3014!![i_26_++]
            val i_29_ = Class30.anIntArray407!![i_26_]
            val i_30_ = Class232.anIntArray3014!![i_26_++]
            val i_31_ = Class30.anIntArray407!![i_26_]
            val i_32_ = Class232.anIntArray3014!![i_26_++]
            if ((-((-i_29_ + i_31_) * (i_30_ - i_28_)) + (i_27_ - i_29_) * (i_30_ - i_32_)) > 0) var_r_Sub1.method3287(i_28_, i_22_ + -21622, i_27_, i_29_, i_30_, i_32_, i_31_)
        }
    }

    override fun wa(var_r: r?, i: Int, i_33_: Int, i_34_: Int, i_35_: Int, bool: Boolean) {
        anInt8315++
        if (aClass330_8307 != null && var_r != null) {
            val i_36_ = (i + -(i_33_ * (this.aHa_Sub3_8322!!.anInt8133) shr 8) shr this.aHa_Sub3_8322!!.anInt8107)
            val i_37_ = (i_34_ - ((this.aHa_Sub3_8322!!.anInt8114) * i_33_ shr 8) shr this.aHa_Sub3_8322!!.anInt8107)
            aClass330_8307!!.method2629(i_37_, var_r, 1, i_36_)
        }
    }

    override fun method3979(i: Int, i_38_: Int) {
        anInt8293++
    }

    override fun CA(var_r: r?, i: Int, i_39_: Int, i_40_: Int, i_41_: Int, bool: Boolean) {
        anInt8319++
        if (aClass330_8307 != null && var_r != null) {
            val i_42_ = (i + -((this.aHa_Sub3_8322!!.anInt8133 * i_39_) shr 8) shr this.aHa_Sub3_8322!!.anInt8107)
            val i_43_ = (-((this.aHa_Sub3_8322!!.anInt8114 * i_39_) shr 8) + i_40_ shr this.aHa_Sub3_8322!!.anInt8107)
            aClass330_8307!!.method2633(287, i_42_, var_r, i_43_)
        }
    }

    override fun YA() {
        if (anInt8329 <= 0) aClass330_8307 = null
        else {
            val `is` = Array<ByteArray?>(1 + this.anInt4587) { ByteArray(this.anInt4590 + 1) }
            run {
                var i = 1
                while (this.anInt4587 > i) {
                    for (i_44_ in 1..<this.anInt4590) `is`[i]!![i_44_] = ((aByteArrayArray8330!![i]!![-1 + i_44_].toInt() shr 2) + (aByteArrayArray8330!![1 + i]!![i_44_].toInt() shr 3) + ((aByteArrayArray8330!![i + -1]!![i_44_].toInt() shr 2) + (aByteArrayArray8330!![i]!![1 + i_44_].toInt() shr 3)) + (aByteArrayArray8330!![i]!![i_44_].toInt() shr 1)).toByte()
                    i++
                }
            }
            val class348_sub3s: Array<Class348_Sub3?> = arrayOfNulls<Class348_Sub3>(aClass356_8325!!.method3474(1))
            aClass356_8325!!.method3477(3, class348_sub3s as Array<Class348?>)
            for (i in class348_sub3s.indices) class348_sub3s[i]!!.method2736((-57).toByte(), anInt8329)
            var i = 20
            if (anIntArrayArrayArray8314 != null) i += 4
            if ((this.anInt8294 and 0x7) != 0) i += 12
            val nativeheapbuffer = this.aHa_Sub3_8322!!.aNativeHeap7891!!.a(anInt8329 * 4, false)
            val nativeheapbuffer_45_ = this.aHa_Sub3_8322!!.aNativeHeap7891!!.a(anInt8329 * i, false)
            val stream = Stream(nativeheapbuffer_45_)
            val stream_46_ = Stream(nativeheapbuffer)
            val class348_sub3s_47_ = arrayOfNulls<Class348_Sub3>(anInt8329)
            var i_48_ = Class348_Sub40_Sub1.method3051(anInt8329 / 4, 4096)
            if (i_48_ < 1) i_48_ = 1
            val class356 = Class356(i_48_)
            val class348_sub3s_49_ = arrayOfNulls<Class348_Sub3>(anInt8331)
            for (i_50_ in 0..<this.anInt4587) {
                var i_51_ = 0
                while ((i_51_ < this.anInt4590)) {
                    if (this.anIntArrayArrayArray8296!![i_50_]!![i_51_] != null) {
                        val class348_sub3s_52_ = aClass348_Sub3ArrayArrayArray8312!![i_50_]!![i_51_]!!
                        val is_53_ = (this.anIntArrayArrayArray8321!![i_50_]!![i_51_])!!
                        val is_54_ = (this.anIntArrayArrayArray8313!![i_50_]!![i_51_])!!
                        var is_55_ = anIntArrayArrayArray8291!![i_50_]!![i_51_]
                        val is_56_ = (this.anIntArrayArrayArray8296!![i_50_]!![i_51_])!!
                        val is_57_ = (if (anIntArrayArrayArray8308 == null) null else anIntArrayArrayArray8308!![i_50_]!![i_51_])
                        val is_58_ = (if (anIntArrayArrayArray8314 != null) anIntArrayArrayArray8314!![i_50_]!![i_51_] else null)
                        if (is_55_ == null) is_55_ = is_56_
                        val f = aFloatArrayArray8333!![i_50_]!![i_51_]
                        val f_59_ = aFloatArrayArray8332!![i_50_]!![i_51_]
                        val f_60_ = aFloatArrayArray8323!![i_50_]!![i_51_]
                        val f_61_ = aFloatArrayArray8333!![i_50_]!![1 + i_51_]
                        val f_62_ = aFloatArrayArray8332!![i_50_]!![i_51_ - -1]
                        val f_63_ = aFloatArrayArray8323!![i_50_]!![i_51_ - -1]
                        val f_64_ = aFloatArrayArray8333!![i_50_ - -1]!![1 + i_51_]
                        val f_65_ = aFloatArrayArray8332!![1 + i_50_]!![1 + i_51_]
                        val f_66_ = aFloatArrayArray8323!![i_50_ + 1]!![1 + i_51_]
                        val f_67_ = aFloatArrayArray8333!![1 + i_50_]!![i_51_]
                        val f_68_ = aFloatArrayArray8332!![i_50_ + 1]!![i_51_]
                        val f_69_ = aFloatArrayArray8323!![1 + i_50_]!![i_51_]
                        val i_70_ = `is`[i_50_]!![i_51_].toInt() and 0xff
                        val i_71_ = 0xff and `is`[i_50_]!![1 + i_51_].toInt()
                        val i_72_ = 0xff and `is`[i_50_ + 1]!![1 + i_51_].toInt()
                        val i_73_ = 0xff and `is`[1 + i_50_]!![i_51_].toInt()
                        var i_74_ = 0
                        while_241_@ for (i_75_ in is_56_.indices) {
                            val class348_sub3 = class348_sub3s_52_[i_75_]
                            for (i_76_ in 0..<i_74_) {
                                if (class348_sub3 == class348_sub3s_49_[i_76_]) continue@while_241_
                            }
                            class348_sub3s_49_[i_74_++] = class348_sub3
                        }
                        val is_77_ = (ShortArray(is_56_.size).also { this.aShortArrayArray8299[i_51_ * this.anInt4587 - -i_50_] = it })
                        for (i_78_ in is_56_.indices) {
                            val i_79_ = ((i_50_ shl this.anInt4588) + is_53_[i_78_])
                            val i_80_ = ((i_51_ shl this.anInt4588) - -is_54_[i_78_])
                            val i_81_ = i_79_ shr anInt8302
                            val i_82_ = i_80_ shr anInt8302
                            val i_83_ = is_56_[i_78_]
                            val i_84_ = is_55_[i_78_]
                            val i_85_ = if (is_57_ != null) is_57_[i_78_] else 0
                            val l = (i_82_.toLong() or (i_83_.toLong() shl 32 or (i_84_.toLong() shl 48) or (i_81_ shl 16).toLong()))
                            val i_86_ = is_53_[i_78_]
                            val i_87_ = is_54_[i_78_]
                            var i_88_ = 74
                            var i_89_ = 0
                            val f_90_: Float
                            val f_91_: Float
                            val f_92_: Float
                            if (i_86_ != 0 || i_87_ != 0) {
                                if (i_86_ != 0 || (this.anInt4592 != i_87_)) {
                                    if ((i_86_ == this.anInt4592) && this.anInt4592 == i_87_) {
                                        f_91_ = f_64_
                                        f_92_ = f_66_
                                        f_90_ = f_65_
                                        i_88_ -= i_72_
                                    } else if ((this.anInt4592 != i_86_) || i_87_ != 0) {
                                        val f_93_ = (i_86_.toFloat() / this.anInt4592.toFloat())
                                        val f_94_ = (i_87_.toFloat() / this.anInt4592.toFloat())
                                        val f_95_ = f + (f_67_ - f) * f_93_
                                        val f_96_ = f_59_ + (-f_59_ + f_68_) * f_93_
                                        val f_97_ = f_93_ * (f_69_ - f_60_) + f_60_
                                        val f_98_ = f_93_ * (-f_61_ + f_64_) + f_61_
                                        val f_99_ = f_62_ + (f_65_ - f_62_) * f_93_
                                        f_91_ = f_95_ + f_94_ * (-f_95_ + f_98_)
                                        f_90_ = f_96_ + f_94_ * (f_99_ - f_96_)
                                        val f_100_ = f_63_ + (-f_63_ + f_66_) * f_93_
                                        f_92_ = f_97_ + f_94_ * (f_100_ - f_97_)
                                        val i_101_ = (((-i_70_ + i_73_) * i_86_ shr this.anInt4588) + i_70_)
                                        val i_102_ = (i_71_ + (i_86_ * (-i_71_ + i_72_) shr this.anInt4588))
                                        i_88_ -= (i_101_ - -(i_87_ * (-i_101_ + i_102_) shr this.anInt4588))
                                    } else {
                                        f_92_ = f_69_
                                        f_91_ = f_67_
                                        f_90_ = f_68_
                                        i_88_ -= i_73_
                                    }
                                } else {
                                    i_88_ -= i_71_
                                    f_91_ = f_61_
                                    f_90_ = f_62_
                                    f_92_ = f_63_
                                }
                            } else {
                                i_88_ -= i_70_
                                f_90_ = f_59_
                                f_91_ = f
                                f_92_ = f_60_
                            }
                            var f_103_ = 1.0f
                            if (i_83_ != -1) {
                                var i_104_ = i_88_ * (i_83_ and 0x7f) shr 7
                                if (i_104_ < 2) i_104_ = 2
                                else if (i_104_ > 126) i_104_ = 126
                                i_89_ = (Class10.anIntArray179!![i_104_ or (i_83_ and 0xff80)])
                                if ((this.anInt8294 and 0x7) == 0) {
                                    f_103_ = ((f_91_ * (this.aHa_Sub3_8322!!.aFloatArray8170[0])) + f_90_ * (this.aHa_Sub3_8322!!.aFloatArray8170[1]) + (this.aHa_Sub3_8322!!.aFloatArray8170[2]) * f_92_)
                                    f_103_ = ((f_103_ * (if (!(f_103_ > 0.0f)) (this.aHa_Sub3_8322!!.aFloat8186) else (this.aHa_Sub3_8322!!.aFloat8174))) + (this.aHa_Sub3_8322!!.aFloat8093))
                                }
                            }
                            var class348: Class348? = null
                            if ((i_79_ and anInt8311 - 1) == 0 && (-1 + anInt8311 and i_80_) == 0) class348 = class356.method3480(l, -6008)
                            val i_105_: Int
                            if (class348 == null) {
                                var i_106_: Int
                                if (i_84_ != i_83_) {
                                    var i_107_ = (0x7f and i_84_) * i_88_ shr 7
                                    if (i_107_ >= 2) {
                                        if (i_107_ > 126) i_107_ = 126
                                    } else i_107_ = 2
                                    i_106_ = (Class10.anIntArray179!![i_107_ or (i_84_ and 0xff80)])
                                    if ((0x7 and this.anInt8294) == 0) {
                                        var f_108_ = ((this.aHa_Sub3_8322!!.aFloatArray8170[2]) * f_92_ + (f_90_ * (this.aHa_Sub3_8322!!.aFloatArray8170[1]) + ((this.aHa_Sub3_8322!!.aFloatArray8170[0]) * f_91_)))
                                        f_108_ = ((this.aHa_Sub3_8322!!.aFloat8093) + (if (f_103_ > 0.0f) (this.aHa_Sub3_8322!!.aFloat8174) else (this.aHa_Sub3_8322!!.aFloat8186)) * f_103_)
                                        var i_109_ = 0xff and (i_106_ shr 16)
                                        var i_110_ = (i_106_ and 0xff04) shr 8
                                        var i_111_ = 0xff and i_106_
                                        i_109_ = (i_109_ * f_108_).toInt()
                                        i_110_ = (i_110_ * f_108_).toInt()
                                        if (i_109_ < 0) i_109_ = 0
                                        else if (i_109_ > 255) i_109_ = 255
                                        i_111_ = (i_111_ * f_108_).toInt()
                                        if (i_110_ >= 0) {
                                            if (i_110_ > 255) i_110_ = 255
                                        } else i_110_ = 0
                                        if (i_111_ >= 0) {
                                            if (i_111_ > 255) i_111_ = 255
                                        } else i_111_ = 0
                                        i_106_ = (i_109_ shl 16 or (i_110_ shl 8) or i_111_)
                                    }
                                } else i_106_ = i_89_
                                if (c()) {
                                    stream.a(i_79_.toFloat())
                                    stream.a((i_85_ + (this.method3986(i_79_, i_80_, 126.toByte()))).toFloat())
                                    stream.a(i_80_.toFloat())
                                    stream.a(i_79_.toFloat())
                                    stream.a(i_80_.toFloat())
                                    if (anIntArrayArrayArray8314 != null) stream.a((if (is_58_ != null) is_58_[i_78_] - 1 else 0).toFloat())
                                    if ((0x7 and this.anInt8294) != 0) {
                                        stream.a(f_91_)
                                        stream.a(f_90_)
                                        stream.a(f_92_)
                                    }
                                } else {
                                    stream.b(i_79_.toFloat())
                                    stream.b((this.method3986(i_79_, i_80_, (-15).toByte()) + i_85_).toFloat())
                                    stream.b(i_80_.toFloat())
                                    stream.b(i_79_.toFloat())
                                    stream.b(i_80_.toFloat())
                                    if (anIntArrayArrayArray8314 != null) stream.b((if (is_58_ == null) 0 else -1 + (is_58_[i_78_])).toFloat())
                                    if ((this.anInt8294 and 0x7) != 0) {
                                        stream.b(f_91_)
                                        stream.b(f_90_)
                                        stream.b(f_92_)
                                    }
                                }
                                if ((this.aHa_Sub3_8322!!.anInt8178) == 0) stream_46_.b(0xffffff.inv() or i_106_)
                                else stream_46_.c(i_106_ or 0xffffff.inv())
                                i_105_ = anInt8303++
                                is_77_[i_78_] = i_105_.toShort()
                                if (i_83_ != -1) class348_sub3s_47_[i_105_] = class348_sub3s_52_[i_78_]
                                class356.method3483(108.toByte(), l, Class348_Sub29(is_77_[i_78_]))
                            } else {
                                is_77_[i_78_] = (class348 as Class348_Sub29).aShort6911
                                i_105_ = 0xffff and is_77_[i_78_].toInt()
                                if (i_83_ != -1 && (class348_sub3s_47_[i_105_]!!.aLong4291 > class348_sub3s_52_[i_78_]!!.aLong4291)) class348_sub3s_47_[i_105_] = class348_sub3s_52_[i_78_]
                            }
                            var i_112_ = 0
                            while (i_74_ > i_112_) {
                                class348_sub3s_49_[i_112_]!!.method2741(i_105_, f_103_, 1624, i_88_, i_89_)
                                i_112_++
                            }
                            anInt8301++
                        }
                    }
                    i_51_++
                }
            }
            for (i_113_ in 0..<anInt8303) {
                val class348_sub3 = class348_sub3s_47_[i_113_]
                if (class348_sub3 != null) class348_sub3.method2744((-125).toByte(), i_113_)
            }
            var i_114_ = 0
            while (this.anInt4587 > i_114_) {
                for (i_115_ in 0..<this.anInt4590) {
                    val is_116_ = (this.aShortArrayArray8299[i_115_ * this.anInt4587 - -i_114_])
                    if (is_116_ != null) {
                        var i_117_ = 0
                        var i_118_ = 0
                        while (is_116_.size > i_118_) {
                            val i_119_ = is_116_[i_118_++].toInt() and 0xffff
                            val i_120_ = 0xffff and is_116_[i_118_++].toInt()
                            val i_121_ = 0xffff and is_116_[i_118_++].toInt()
                            val class348_sub3 = class348_sub3s_47_[i_119_]
                            val class348_sub3_122_ = class348_sub3s_47_[i_120_]
                            val class348_sub3_123_ = class348_sub3s_47_[i_121_]
                            var class348_sub3_124_: Class348_Sub3? = null
                            if (class348_sub3 != null) {
                                class348_sub3_124_ = class348_sub3
                                class348_sub3.method2742(i_117_, i_115_, i_114_, (-80).toByte())
                            }
                            if (class348_sub3_122_ != null) {
                                class348_sub3_122_.method2742(i_117_, i_115_, i_114_, (-69).toByte())
                                if (class348_sub3_124_ == null || ((class348_sub3_124_.aLong4291) > (class348_sub3_122_.aLong4291))) class348_sub3_124_ = class348_sub3_122_
                            }
                            if (class348_sub3_123_ != null) {
                                class348_sub3_123_.method2742(i_117_, i_115_, i_114_, (-79).toByte())
                                if (class348_sub3_124_ == null || ((class348_sub3_124_.aLong4291) > (class348_sub3_123_.aLong4291))) class348_sub3_124_ = class348_sub3_123_
                            }
                            if (class348_sub3_124_ != null) {
                                if (class348_sub3 != null) class348_sub3_124_.method2744((-113).toByte(), i_119_)
                                if (class348_sub3_122_ != null) class348_sub3_124_.method2744((-111).toByte(), i_120_)
                                if (class348_sub3_123_ != null) class348_sub3_124_.method2744((-116).toByte(), i_121_)
                                class348_sub3_124_.method2742(i_117_, i_115_, i_114_, (-107).toByte())
                            }
                            i_117_++
                        }
                    }
                }
                i_114_++
            }
            stream.a()
            stream_46_.a()
            anInterface5_Impl1_8326 = this.aHa_Sub3_8322!!.method3889(false, 16711680)
            anInterface5_Impl1_8326!!.method17(nativeheapbuffer, 4, anInt8303 * 4, (-126).toByte())
            anInterface5_Impl1_8327 = this.aHa_Sub3_8322!!.method3889(false, 16711680)
            anInterface5_Impl1_8327!!.method17(nativeheapbuffer_45_, i, i * anInt8303, (-59).toByte())
            if ((0x7 and this.anInt8294) == 0) {
                if (anIntArrayArrayArray8314 == null) this.aClass130_8324 = (this.aHa_Sub3_8322!!.method3812(0, (arrayOf<Class58>(Class58(arrayOf<Class325?>(Class325.aClass325_4073, Class325.aClass325_4078)), Class58(Class325.aClass325_4076!!)))))
                else this.aClass130_8324 = (this.aHa_Sub3_8322!!.method3812(0, (arrayOf<Class58>(Class58(arrayOf<Class325?>(Class325.aClass325_4073, Class325.aClass325_4078, Class325.aClass325_4077)), Class58(Class325.aClass325_4076!!)))))
            } else if (anIntArrayArrayArray8314 != null) this.aClass130_8324 = (this.aHa_Sub3_8322!!.method3812(0, (arrayOf<Class58>(Class58(arrayOf<Class325?>(Class325.aClass325_4073, Class325.aClass325_4078, Class325.aClass325_4077, Class325.aClass325_4075)), Class58(Class325.aClass325_4076!!)))))
            else this.aClass130_8324 = (this.aHa_Sub3_8322!!.method3812(0, (arrayOf<Class58>(Class58(arrayOf<Class325?>(Class325.aClass325_4073, Class325.aClass325_4078, Class325.aClass325_4075)), Class58(Class325.aClass325_4076!!)))))
            var i_125_ = 0
            for (i_126_ in class348_sub3s.indices) {
                if (class348_sub3s[i_126_]!!.anInt6589 > 0) class348_sub3s[i_125_++] = class348_sub3s[i_126_]
            }
            aClass348_Sub3Array8328 = arrayOfNulls<Class348_Sub3>(i_125_)
            val ls = LongArray(i_125_)
            var i_127_ = 0
            while (i_125_ > i_127_) {
                val class348_sub3 = class348_sub3s[i_127_]!!
                ls[i_127_] = class348_sub3.aLong4291
                aClass348_Sub3Array8328!![i_127_] = class348_sub3
                class348_sub3.method2740(-84, anInt8303)
                i_127_++
            }
            Class339.method2669(aClass348_Sub3Array8328 as? Array<Any?>, ls, -101)
            if (aClass330_8307 != null) aClass330_8307!!.method2632(128)
        }
        anInt8298++
        anIntArrayArrayArray8308 = null
        aClass356_8325 = null
        anIntArrayArrayArray8291 = null
        aClass348_Sub3ArrayArrayArray8312 = null
        aFloatArrayArray8323 = null
        aFloatArrayArray8332 = aFloatArrayArray8323
        aFloatArrayArray8333 = aFloatArrayArray8332
        this.anIntArrayArrayArray8296 = null
        aByteArrayArray8330 = null
        anIntArrayArrayArray8314 = null
        this.anIntArrayArrayArray8313 = null
        this.anIntArrayArrayArray8321 = this.anIntArrayArrayArray8313
    }

    override fun method3989(var_r: r?, i: Int, i_128_: Int, i_129_: Int, i_130_: Int, bool: Boolean): Boolean {
        anInt8316++
        if (aClass330_8307 == null || var_r == null) return false
        val i_131_ = (-(this.aHa_Sub3_8322!!.anInt8133 * i_128_ shr 8) + i shr this.aHa_Sub3_8322!!.anInt8107)
        val i_132_ = (i_129_ + -((this.aHa_Sub3_8322!!.anInt8114 * i_128_) shr 8) shr this.aHa_Sub3_8322!!.anInt8107)
        return aClass330_8307!!.method2628(i_131_, 69.toByte(), var_r, i_132_)
    }

    override fun ka(i: Int, i_133_: Int, i_134_: Int) {
        if ((aByteArrayArray8330!![i]!![i_133_].toInt() and 0xff) < i_134_) aByteArrayArray8330!![i]!![i_133_] = i_134_.toByte()
        anInt8309++
    }

    override fun method3984(i: Int, i_135_: Int, i_136_: Int, bools: Array<BooleanArray?>?, bool: Boolean, i_137_: Int, i_138_: Int) {
        method4007(i, i_135_, i_137_, bool, bools!!, -1, i_138_, i_136_)
        anInt8318++
    }

    init {
        aClass262_8286 = Class262()
        do {
            try {
                anInt8302 = this.anInt4588 - 2
                this.aHa_Sub3_8322 = var_ha_Sub3
                anIntArrayArrayArray8308 = Array<Array<IntArray?>?>(i_140_) { arrayOfNulls<IntArray>(i_141_) }
                anIntArrayArrayArray8291 = Array<Array<IntArray?>?>(i_140_) { arrayOfNulls<IntArray>(i_141_) }
                this.anIntArrayArrayArray8296 = Array<Array<IntArray?>?>(i_140_) { arrayOfNulls<IntArray>(i_141_) }
                aFloatArrayArray8333 = (Array<FloatArray?>(this.anInt4587 - -1) { FloatArray(this.anInt4590 - -1) })
                aClass348_Sub3ArrayArrayArray8312 = Array<Array<Array<Class348_Sub3?>?>?>(i_140_) { arrayOfNulls<Array<Class348_Sub3?>>(i_141_) }
                aByteArrayArray8317 = Array<ByteArray?>(i_140_) { ByteArray(i_141_) }
                anInt8311 = 1 shl anInt8302
                this.aShortArrayArray8299 = arrayOfNulls<ShortArray>(i_140_ * i_141_)
                aByteArrayArray8330 = Array<ByteArray?>(1 + i_140_) { ByteArray(1 + i_141_) }
                this.anIntArrayArrayArray8313 = Array<Array<IntArray?>?>(i_140_) { arrayOfNulls<IntArray>(i_141_) }
                aFloatArrayArray8332 = (Array<FloatArray?>(this.anInt4587 + 1) { FloatArray(this.anInt4590 + 1) })
                this.anIntArrayArrayArray8321 = Array<Array<IntArray?>?>(i_140_) { arrayOfNulls<IntArray>(i_141_) }
                this.anInt8294 = i_139_
                aFloatArrayArray8323 = (Array<FloatArray?>(1 + this.anInt4587) { FloatArray(1 + this.anInt4590) })
                var i_144_ = 0
                while ((this.anInt4590 >= i_144_)) {
                    var i_145_ = 0
                    while (this.anInt4587 >= i_145_) {
                        val i_146_ = this.anIntArrayArray4584[i_145_]!![i_144_]
                        if (i_146_.toFloat() > aFloat8305) aFloat8305 = i_146_.toFloat()
                        if (i_146_.toFloat() < aFloat8306) aFloat8306 = i_146_.toFloat()
                        if (i_145_ > 0 && i_144_ > 0 && (i_145_ < this.anInt4587) && this.anInt4590 > i_144_) {
                            val i_147_ = (-is_142_!![-1 + i_145_]!![i_144_] + is_142_[1 + i_145_]!![i_144_])
                            val i_148_ = (-is_142_[i_145_]!![-1 + i_144_] + is_142_[i_145_]!![1 + i_144_])
                            val f = (1.0 / (sqrt((4 * (i_143_ * i_143_) + (i_147_ * i_147_ - -(i_148_ * i_148_))).toDouble()))).toFloat()
                            aFloatArrayArray8333!![i_145_]!![i_144_] = i_147_.toFloat() * f
                            aFloatArrayArray8332!![i_145_]!![i_144_] = (-i_143_ * 2).toFloat() * f
                            aFloatArrayArray8323!![i_145_]!![i_144_] = f * i_148_.toFloat()
                        }
                        i_145_++
                    }
                    i_144_++
                }
                aFloat8306--
                aFloat8305++
                aClass356_8325 = Class356(128)
                if ((this.anInt8294 and 0x10) == 0) break
                aClass330_8307 = Class330(this.aHa_Sub3_8322, this)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("qm.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + i + ',' + i_139_ + ',' + i_140_ + ',' + i_141_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_142_ != null) "{...}" else "null") + ',' + i_143_ + ')'))
            }
            break
        } while (false)
    }

    private fun method4007(i: Int, i_149_: Int, i_150_: Int, bool: Boolean, bools: Array<BooleanArray?>, i_151_: Int, i_152_: Int, i_153_: Int) {
        if (i_151_ == -1) {
            if (aClass348_Sub3Array8328 != null) {
                var i_154_ = i_153_ - -i_153_ + 1
                i_154_ *= i_154_
                if (i_154_ > Class286_Sub1.anIntArray6189!!.size) Class286_Sub1.anIntArray6189 = IntArray(i_154_)
                var i_155_ = -i_153_ + i
                val i_156_ = i_155_
                if (i_155_ < 0) i_155_ = 0
                var i_157_ = i_149_ + -i_153_
                val i_158_ = i_157_
                if (i_157_ < 0) i_157_ = 0
                var i_159_ = i_153_ + i
                if (this.anInt4587 - 1 < i_159_) i_159_ = this.anInt4587 - 1
                var i_160_ = i_149_ + i_153_
                if (i_160_ > this.anInt4590 - 1) i_160_ = this.anInt4590 - 1
                Class348_Sub48.anInt7133 = 0
                for (i_161_ in i_155_..i_159_) {
                    val bools_162_ = bools[i_161_ - i_156_]!!
                    var i_163_ = i_157_
                    while (i_160_ >= i_163_) {
                        if (bools_162_[i_163_ - i_158_]) Class286_Sub1.anIntArray6189!![Class348_Sub48.anInt7133++] = i_161_ + this.anInt4587 * i_163_
                        i_163_++
                    }
                }
                if (i_150_ == -1) this.aHa_Sub3_8322!!.method3825(8)
                else {
                    this.aHa_Sub3_8322!!.method3867(i_150_.toFloat(), 101)
                    this.aHa_Sub3_8322!!.method3857((-71).toByte())
                }
                this.aHa_Sub3_8322!!.method3942(5)
                this.aHa_Sub3_8322!!.method3866(((this.anInt8294) and 0x7) != 0, true)
                this.aHa_Sub3_8322!!.method3814(false, false, -1, 101.toByte())
                this.aHa_Sub3_8322!!.method3925(112, anInterface5_Impl1_8327, 0)
                for (i_164_ in aClass348_Sub3Array8328!!.indices) aClass348_Sub3Array8328!![i_164_]!!.method2737((-30).toByte(), Class286_Sub1.anIntArray6189!!, Class348_Sub48.anInt7133)
                val class101_sub2 = this.aHa_Sub3_8322!!.method3934(-97)
                class101_sub2!!.method894(0, -1, 0)
                this.aHa_Sub3_8322!!.method3915(0)
                if (!aClass262_8286.method2002(18.toByte())) {
                    val i_165_ = this.aHa_Sub3_8322!!.anInt8144
                    val i_166_ = this.aHa_Sub3_8322!!.anInt8091
                    this.aHa_Sub3_8322!!.L(0, i_166_, this.aHa_Sub3_8322!!.anInt8105)
                    this.aHa_Sub3_8322!!.method3866(false, true)
                    this.aHa_Sub3_8322!!.method3946(-32, false)
                    this.aHa_Sub3_8322!!.method3817(60, 128)
                    this.aHa_Sub3_8322!!.method3814(false, false, -2, 100.toByte())
                    this.aHa_Sub3_8322!!.method3850(63.toByte(), (this.aHa_Sub3_8322!!.anInterface18_8147))
                    this.aHa_Sub3_8322!!.method3874(Class328_Sub3.aClass229_6519, 116, Class167.aClass229_2207)
                    this.aHa_Sub3_8322!!.method3849(47.toByte(), 0, Class348_Sub40_Sub39.aClass70_9485)
                    this.aHa_Sub3_8322!!.method3885(0, true, Class285_Sub2.aClass70_8503)
                    var class348 = aClass262_8286.method1995(i_151_ + 5)
                    while (class348 != null) {
                        val class348_sub38 = class348 as Class348_Sub38
                        class348_sub38.method3032(i_149_, i_153_, bools, false, i)
                        class348 = aClass262_8286.method1990(106.toByte())
                    }
                    this.aHa_Sub3_8322!!.method3849(47.toByte(), 0, Class342.aClass70_4247)
                    this.aHa_Sub3_8322!!.method3885(0, true, Class342.aClass70_4247)
                    this.aHa_Sub3_8322!!.method3850(90.toByte(), null)
                    this.aHa_Sub3_8322!!.L(i_165_, i_166_, this.aHa_Sub3_8322!!.anInt8105)
                }
                if (aClass330_8307 != null) {
                    this.aHa_Sub3_8322!!.method3925(-91, anInterface5_Impl1_8327, 0)
                    this.aHa_Sub3_8322!!.method3925(-71, anInterface5_Impl1_8326, 1)
                    this.aHa_Sub3_8322!!.method3862(0, this.aClass130_8324)
                    aClass330_8307!!.method2630(128, i_153_, i, bool, bools, i_149_)
                }
            }
            anInt8297++
        }
    }

    override fun method3981(class348_sub1: Class348_Sub1, `is`: IntArray) {
        try {
            aClass262_8286.method1999(Class348_Sub38((this.aHa_Sub3_8322), this, class348_sub1, `is`), -20180)
            anInt8287++
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("qm.L(" + (if (class348_sub1 != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    override fun U(i: Int, i_167_: Int, `is`: IntArray?, is_168_: IntArray?, is_169_: IntArray, is_170_: IntArray?, is_171_: IntArray, is_172_: IntArray?, is_173_: IntArray, is_174_: IntArray, i_175_: Int, i_176_: Int, i_177_: Int, bool: Boolean) {
        try {
            anInt8295++
            val var_d = this.aHa_Sub3_8322!!.aD4579!!
            if (is_170_ != null && anIntArrayArrayArray8314 == null) anIntArrayArrayArray8314 = Array<Array<IntArray?>?>(this.anInt4587) { arrayOfNulls<IntArray>(this.anInt4590) }
            if (is_168_ != null && anIntArrayArrayArray8308 == null) anIntArrayArrayArray8308 = Array<Array<IntArray?>?>(this.anInt4587) { arrayOfNulls<IntArray>(this.anInt4590) }
            this.anIntArrayArrayArray8321!![i]!![i_167_] = `is`!!
            this.anIntArrayArrayArray8313!![i]!![i_167_] = is_169_!!
            this.anIntArrayArrayArray8296!![i]!![i_167_] = is_171_!!
            anIntArrayArrayArray8291!![i]!![i_167_] = is_172_
            if (anIntArrayArrayArray8314 != null) anIntArrayArrayArray8314!![i]!![i_167_] = is_170_
            if (anIntArrayArrayArray8308 != null) anIntArrayArrayArray8308!![i]!![i_167_] = is_168_
            val class348_sub3s = (arrayOfNulls<Class348_Sub3>(is_171_.size).also { aClass348_Sub3ArrayArrayArray8312!![i]!![i_167_] = it })
            for (i_178_ in is_171_.indices) {
                var i_179_ = is_173_!![i_178_]
                var i_180_ = is_174_!![i_178_]
                if ((this.anInt8294 and 0x20) != 0 && i_179_ != -1 && var_d.method3(i_179_, -6662)!!.aBoolean209) {
                    i_180_ = 128
                    i_179_ = -1
                }
                val l = i_179_.toLong() or ((i_180_ shl 14).toLong() or (i_176_.toLong() shl 42 or (i_177_.toLong() shl 48) or (i_175_.toLong() shl 28)))
                var class348: Class348?
                class348 = aClass356_8325!!.method3480(l, -6008)
                while (class348 != null) {
                    val class348_sub3 = class348 as Class348_Sub3
                    if (i_179_ == class348_sub3.anInt6567 && (class348_sub3.aFloat6582 == i_180_.toFloat()) && i_175_ == class348_sub3.anInt6571 && class348_sub3.anInt6575 == i_176_ && class348_sub3.anInt6569 == i_177_) break
                    class348 = aClass356_8325!!.method3476(true)
                }
                if (class348 == null) {
                    class348_sub3s[i_178_] = Class348_Sub3(this, i_179_, i_180_, i_175_, i_176_, i_177_)
                    aClass356_8325!!.method3483(27.toByte(), l, class348_sub3s[i_178_])
                } else class348_sub3s[i_178_] = class348 as Class348_Sub3
            }
            if (bool) aByteArrayArray8317[i]!![i_167_] = Class273.method2057((aByteArrayArray8317[i]!![i_167_]).toInt(), 1).toByte()
            if (is_171_.size > anInt8331) anInt8331 = is_171_.size
            anInt8329 += is_171_.size
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(
                runtimeexception,
                ("qm.U(" + i + ',' + i_167_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_168_ != null) "{...}" else "null") + ',' + (if (is_169_ != null) "{...}" else "null") + ',' + (if (is_170_ != null) "{...}" else "null") + ',' + (if (is_171_ != null) "{...}" else "null") + ',' + (if (is_172_ != null) "{...}" else "null") + ',' + (if (is_173_ != null) "{...}" else "null") + ',' + (if (is_174_ != null) "{...}" else "null") + ',' + i_175_ + ',' + i_176_ + ',' + i_177_ + ',' + bool + ')')
            )
        }
    }

    override fun method3983(i: Int, i_181_: Int, i_182_: Int, bools: Array<BooleanArray?>?, bool: Boolean, i_183_: Int) {
        method4007(i, i_181_, -1, bool, bools!!, -1, i_183_, i_182_)
        anInt8288++
    }

    override fun method3978(i: Int, i_184_: Int, `is`: IntArray, is_185_: IntArray, is_186_: IntArray, is_187_: IntArray, is_188_: IntArray, is_189_: IntArray, is_190_: IntArray, is_191_: IntArray, is_192_: IntArray, is_193_: IntArray, is_194_: IntArray, i_195_: Int, i_196_: Int, i_197_: Int, bool: Boolean) {
        try {
            anInt8300++
            val i_198_ = is_191_!!.size
            val is_199_ = IntArray(i_198_ * 3)
            val is_200_ = IntArray(i_198_ * 3)
            val is_201_ = IntArray(i_198_ * 3)
            val is_202_ = IntArray(3 * i_198_)
            val is_203_ = IntArray(3 * i_198_)
            val is_204_ = IntArray(3 * i_198_)
            val is_205_ = if (is_185_ == null) null else IntArray(i_198_ * 3)
            val is_206_ = if (is_187_ == null) null else IntArray(3 * i_198_)
            var i_207_ = 0
            for (i_208_ in 0..<i_198_) {
                val i_209_ = is_188_!![i_208_]
                val i_210_ = is_189_!![i_208_]
                val i_211_ = is_190_!![i_208_]
                is_199_[i_207_] = `is`!![i_209_]
                is_200_[i_207_] = is_186_!![i_209_]
                is_201_[i_207_] = is_191_[i_208_]
                is_203_[i_207_] = is_193_!![i_208_]
                is_204_[i_207_] = is_194_!![i_208_]
                is_202_[i_207_] = if (is_192_ == null) is_191_[i_208_] else is_192_[i_208_]
                if (is_185_ != null) is_205_!![i_207_] = is_185_[i_209_]
                if (is_187_ != null) is_206_!![i_207_] = is_187_[i_209_]
                i_207_++
                is_199_[i_207_] = `is`[i_210_]
                is_200_[i_207_] = is_186_[i_210_]
                is_201_[i_207_] = is_191_[i_208_]
                is_203_[i_207_] = is_193_[i_208_]
                is_204_[i_207_] = is_194_[i_208_]
                is_202_[i_207_] = if (is_192_ == null) is_191_[i_208_] else is_192_[i_208_]
                if (is_185_ != null) is_205_!![i_207_] = is_185_[i_210_]
                if (is_187_ != null) is_206_!![i_207_] = is_187_[i_210_]
                i_207_++
                is_199_[i_207_] = `is`[i_211_]
                is_200_[i_207_] = is_186_[i_211_]
                is_201_[i_207_] = is_191_[i_208_]
                is_203_[i_207_] = is_193_[i_208_]
                is_204_[i_207_] = is_194_[i_208_]
                is_202_[i_207_] = if (is_192_ == null) is_191_[i_208_] else is_192_[i_208_]
                if (is_185_ != null) is_205_!![i_207_] = is_185_[i_211_]
                if (is_187_ != null) is_206_!![i_207_] = is_187_[i_211_]
                i_207_++
            }
            U(i, i_184_, is_199_, is_205_!!, is_200_, is_206_!!, is_201_, is_202_, is_203_, is_204_, i_195_, i_196_, i_197_, bool)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(
                runtimeexception,
                ("qm.E(" + i + ',' + i_184_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_185_ != null) "{...}" else "null") + ',' + (if (is_186_ != null) "{...}" else "null") + ',' + (if (is_187_ != null) "{...}" else "null") + ',' + (if (is_188_ != null) "{...}" else "null") + ',' + (if (is_189_ != null) "{...}" else "null") + ',' + (if (is_190_ != null) "{...}" else "null") + ',' + (if (is_191_ != null) "{...}" else "null") + ',' + (if (is_192_ != null) "{...}" else "null") + ',' + (if (is_193_ != null) "{...}" else "null") + ',' + (if (is_194_ != null) "{...}" else "null") + ',' + i_195_ + ',' + i_196_ + ',' + i_197_ + ',' + bool + ')')
            )
        }
    }

    override fun method3987(i: Int, i_212_: Int, i_213_: Int, i_214_: Int, i_215_: Int, i_216_: Int, i_217_: Int, bools: Array<BooleanArray?>) {
        anInt8304++
        if (anInt8329 > 0) {
            val interface5_impl2 = this.aHa_Sub3_8322!!.method3822(28, anInt8301)
            var i_218_ = 0
            var i_219_ = 32767
            var i_220_ = -32768
            for (i_221_ in 0..3) {
                i_218_ = 0
                val buffer = interface5_impl2!!.method24(true, false)
                if (buffer != null) {
                    val stream = this.aHa_Sub3_8322!!.method3893(buffer, 9179)
                    if (c()) {
                        var i_227_ = i_215_
                        while (i_217_ > i_227_) {
                            var i_228_ = i_227_ * this.anInt4587 - -i_214_
                            for (i_229_ in i_214_..<i_216_) {
                                if (bools[i_229_ + -i_214_]!![i_227_ - i_215_]) {
                                    val `is` = (this.aShortArrayArray8299[i_228_])
                                    if (`is` != null) {
                                        var i_230_ = 0
                                        while (`is`.size > i_230_) {
                                            val i_231_ = `is`[i_230_].toInt() and 0xffff
                                            stream.d(i_231_)
                                            if (i_231_ > i_220_) i_220_ = i_231_
                                            i_218_++
                                            if (i_231_ < i_219_) i_219_ = i_231_
                                            i_230_++
                                        }
                                    }
                                }
                                i_228_++
                            }
                            i_227_++
                        }
                    } else {
                        var i_222_ = i_215_
                        while (i_217_ > i_222_) {
                            var i_223_ = i_214_ + i_222_ * this.anInt4587
                            for (i_224_ in i_214_..<i_216_) {
                                if (bools[i_224_ - i_214_]!![-i_215_ + i_222_]) {
                                    val `is` = (this.aShortArrayArray8299[i_223_])
                                    if (`is` != null) {
                                        var i_225_ = 0
                                        while ((i_225_ < `is`.size)) {
                                            val i_226_ = 0xffff and `is`[i_225_].toInt()
                                            stream.a(i_226_)
                                            if (i_220_ < i_226_) i_220_ = i_226_
                                            i_218_++
                                            if (i_219_ > i_226_) i_219_ = i_226_
                                            i_225_++
                                        }
                                    }
                                }
                                i_223_++
                            }
                            i_222_++
                        }
                    }
                    stream.a()
                    if (interface5_impl2.method22(-23)) break
                }
            }
            if (i_218_ > 0) {
                this.aHa_Sub3_8322!!.method3932((-127).toByte())
                this.aHa_Sub3_8322!!.method3838(true, false)
                this.aHa_Sub3_8322!!.method3866(false, true)
                this.aHa_Sub3_8322!!.method3890(false, 113.toByte())
                this.aHa_Sub3_8322!!.method3946(-32, false)
                this.aHa_Sub3_8322!!.method3817(61, 0)
                this.aHa_Sub3_8322!!.method3814(false, false, -2, 98.toByte())
                this.aHa_Sub3_8322!!.method3850((-22).toByte(), null)
                val class101_sub2 = this.aHa_Sub3_8322!!.method3934(-71)
                val fs = this.aHa_Sub3_8322!!.method3837(true)
                fs[6] = 0.0f
                fs[13] = -(((2 * i_212_).toFloat() + (i_213_ * i_217_).toFloat() / 128.0f) / (this.aHa_Sub3_8322!!.anInt7962).toFloat()) + 1.0f
                fs[11] = 0.0f
                fs[0] = (i_213_.toFloat() / ((this.aHa_Sub3_8322!!.anInt7931).toFloat() * (this.anInt4592.toFloat() * 128.0f)))
                fs[14] = -aFloat8306 / (aFloat8305 - aFloat8306)
                fs[2] = 0.0f
                fs[15] = 1.0f
                fs[5] = (i_213_.toFloat() / (this.anInt4592.toFloat() * 128.0f * (this.aHa_Sub3_8322!!.anInt7962).toFloat()))
                fs[4] = 0.0f
                fs[3] = 0.0f
                fs[8] = 0.0f
                fs[7] = 0.0f
                fs[10] = 1.0f / (aFloat8305 - aFloat8306)
                fs[9] = 0.0f
                fs[12] = -1.0f - (((i_213_ * i_214_).toFloat() / 128.0f - (2 * i).toFloat()) / (this.aHa_Sub3_8322!!.anInt7931).toFloat())
                fs[1] = 0.0f
                class101_sub2!!.method935(0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0)
                this.aHa_Sub3_8322!!.method3821(-4845)
                this.aHa_Sub3_8322!!.method3915(0)
                if ((0x7 and this.anInt8294) != 0) {
                    this.aHa_Sub3_8322!!.method3866(true, true)
                    this.aHa_Sub3_8322!!.method3892(0)
                } else this.aHa_Sub3_8322!!.method3866(false, true)
                this.aHa_Sub3_8322!!.method3926(59.toByte(), false)
                this.aHa_Sub3_8322!!.method3925(63, anInterface5_Impl1_8327, 0)
                this.aHa_Sub3_8322!!.method3925(-90, anInterface5_Impl1_8326, 1)
                this.aHa_Sub3_8322!!.method3862(0, this.aClass130_8324)
                this.aHa_Sub3_8322!!.method3938(Class247.aClass21_3181, i_218_ / 3, interface5_impl2, i_219_, 0, -i_219_ + i_220_ - -1, 114)
                this.aHa_Sub3_8322!!.method3926(82.toByte(), true)
            }
        }
    }

    companion object {
        @JvmField
        var anInt8287: Int = 0
        @JvmField
        var anInt8288: Int = 0
        @JvmField
        var anInt8289: Int = 0
        @JvmField
        var anInt8290: Int = 0
        @JvmField
        var anInt8292: Int = 0
        @JvmField
        var anInt8293: Int = 0
        @JvmField
        var anInt8295: Int = 0
        @JvmField
        var anInt8297: Int = 0
        @JvmField
        var anInt8298: Int = 0
        @JvmField
        var anInt8300: Int = 0
        @JvmField
        var anInt8304: Int = 0
        @JvmField
        var anInt8309: Int = 0
        @JvmField
        var anInt8310: Int = 0
        @JvmField
        var anInt8315: Int = 0
        @JvmField
        var anInt8316: Int = 0
        @JvmField
        var anInt8318: Int = 0
        @JvmField
        var anInt8319: Int = 0
        @JvmField
        var aClass21_8320: Class21? = Class21()
        @JvmStatic
        fun method4004(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int) {
            anInt8292++
            val i_10_ = Class85.method831(Class38.anInt513, i_4_, Class132.anInt1910, -118)
            val i_11_ = Class85.method831(Class38.anInt513, i, Class132.anInt1910, 72)
            val i_12_ = Class85.method831(Class113.anInt1745, i_8_, Class369.anInt4960, -80)
            val i_13_ = Class85.method831(Class113.anInt1745, i_3_, Class369.anInt4960, -101)
            val i_14_ = Class85.method831(Class38.anInt513, i_4_ + i_6_, Class132.anInt1910, -110)
            val i_15_ = Class85.method831(Class38.anInt513, i + -i_6_, Class132.anInt1910, 28)
            if (i_7_ < -33) {
                for (i_16_ in i_10_..<i_14_) Class135_Sub2.method1156(-27, i_13_, Class17.anIntArrayArray255!![i_16_]!!, i_12_, i_9_)
                for (i_17_ in i_11_ downTo i_15_ + 1) Class135_Sub2.method1156(-27, i_13_, Class17.anIntArrayArray255!![i_17_]!!, i_12_, i_9_)
                val i_18_ = Class85.method831(Class113.anInt1745, i_8_ + i_6_, Class369.anInt4960, 114)
                val i_19_ = Class85.method831(Class113.anInt1745, -i_6_ + i_3_, Class369.anInt4960, 34)
                for (i_20_ in i_14_..i_15_) {
                    val `is` = Class17.anIntArrayArray255!![i_20_]!!
                    Class135_Sub2.method1156(-27, i_18_, `is`, i_12_, i_9_)
                    Class135_Sub2.method1156(-27, i_19_, `is`, i_18_, i_5_)
                    Class135_Sub2.method1156(-27, i_13_, `is`, i_19_, i_9_)
                }
            }
        }

        @JvmStatic
        fun method4006(i: Int) {
            aClass21_8320 = null
            if (i > -42) aClass21_8320 = null
        }

        @JvmStatic
        fun method4008(i: Byte): Int {
            anInt8289++
            if (i >= -121) aClass21_8320 = null
            if (Class348_Sub49.anInt7207 == 1) return Class339.anInt4211
            return 0
        }
    }
}
