import jaclib.memory.Stream
import jaggl.OpenGL.Companion.glLoadMatrixf
import jaggl.OpenGL.Companion.glMatrixMode
import jaggl.OpenGL.Companion.glPopMatrix
import jaggl.OpenGL.Companion.glPushMatrix
import jaggl.OpenGL.Companion.glTranslatef
import java.io.IOException
import kotlin.math.sqrt

class s_Sub2(var_ha_Sub2: ha_Sub2?, i: Int, i_133_: Int, i_134_: Int, i_135_: Int, `is`: Array<IntArray?>, is_136_: Array<IntArray?>?, i_137_: Int) : s(i_134_, i_135_, i_137_, `is`) {
    @JvmField
    var anIntArrayArrayArray8234: Array<Array<IntArray?>?>?
    @JvmField
    var anInt8235: Int = 0
    private val aByteArrayArray8240: Array<ByteArray?>
    private var aClass348_Sub20ArrayArrayArray8243: Array<Array<Array<Class348_Sub20?>?>?>?
    private var anIntArrayArrayArray8245: Array<Array<IntArray?>?>?
    private var anInt8246 = 0
    private var anIntArrayArrayArray8252: Array<Array<IntArray?>?>? = null
    @JvmField
    var anIntArrayArrayArray8253: Array<Array<IntArray?>?>?
    private val aClass262_8256 = Class262()
    private var anInt8257 = 0
    private var anIntArrayArrayArray8258: Array<Array<IntArray?>?>?
    private val anInt8260: Int
    private val anInt8264: Int
    private var aClass104_8266: Class104? = null
    @JvmField
    var aShortArrayArray8267: Array<ShortArray?>
    @JvmField
    var anIntArrayArrayArray8268: Array<Array<IntArray?>?>?
    @JvmField
    var aHa_Sub2_8272: ha_Sub2? = null
    private var aByteArrayArray8273: Array<ByteArray?>?
    private var aClass123_8274: Class123? = null
    @JvmField
    var aClass123_8275: Class123? = null
    @JvmField
    var aClass123_8276: Class123? = null
    @JvmField
    var aClass123_8277: Class123? = null
    private var aClass356_8278: Class356? = null
    private var anInterface2_8279: Interface2? = null
    private var anInt8280 = 0
    private var aFloatArrayArray8281: Array<FloatArray?>?
    private var aClass348_Sub20Array8282: Array<Class348_Sub20?>? = null
    private var aFloatArrayArray8283: Array<FloatArray?>?
    private var anInt8284 = 0
    private var aFloatArrayArray8285: Array<FloatArray?>?

    override fun wa(var_r: r?, i: Int, i_0_: Int, i_1_: Int, i_2_: Int, bool: Boolean) {
        anInt8251++
        if (aClass104_8266 != null && var_r != null) {
            val i_3_ = (i - ((this.aHa_Sub2_8272!!.anInt7772 * i_0_) shr 8) shr this.aHa_Sub2_8272!!.anInt7731)
            val i_4_ = (-(i_0_ * this.aHa_Sub2_8272!!.anInt7777 shr 8) + i_1_ shr this.aHa_Sub2_8272!!.anInt7731)
            aClass104_8266!!.method951(var_r, i_3_, i_4_, 70)
        }
    }

    override fun method3978(i: Int, i_5_: Int, `is`: IntArray, is_6_: IntArray, is_7_: IntArray, is_8_: IntArray, is_9_: IntArray, is_10_: IntArray, is_11_: IntArray, is_12_: IntArray, is_13_: IntArray, is_14_: IntArray, is_15_: IntArray, i_16_: Int, i_17_: Int, i_18_: Int, bool: Boolean) {
        try {
            anInt8249++
            val i_19_ = is_12_!!.size
            val is_20_ = IntArray(3 * i_19_)
            val is_21_ = IntArray(3 * i_19_)
            val is_22_ = IntArray(i_19_ * 3)
            val is_23_ = IntArray(3 * i_19_)
            val is_24_ = IntArray(i_19_ * 3)
            val is_25_ = IntArray(3 * i_19_)
            val is_26_ = if (is_6_ != null) IntArray(i_19_ * 3) else null
            val is_27_ = if (is_8_ != null) IntArray(3 * i_19_) else null
            var i_28_ = 0
            for (i_29_ in 0..<i_19_) {
                val i_30_ = is_9_!![i_29_]
                val i_31_ = is_10_!![i_29_]
                val i_32_ = is_11_!![i_29_]
                is_20_[i_28_] = `is`!![i_30_]
                is_21_[i_28_] = is_7_!![i_30_]
                is_22_[i_28_] = is_12_[i_29_]
                is_24_[i_28_] = is_14_!![i_29_]
                is_25_[i_28_] = is_15_!![i_29_]
                is_23_[i_28_] = if (is_13_ != null) is_13_[i_29_] else is_12_[i_29_]
                if (is_6_ != null) is_26_!![i_28_] = is_6_[i_30_]
                if (is_8_ != null) is_27_!![i_28_] = is_8_[i_30_]
                i_28_++
                is_20_[i_28_] = `is`[i_31_]
                is_21_[i_28_] = is_7_[i_31_]
                is_22_[i_28_] = is_12_[i_29_]
                is_24_[i_28_] = is_14_[i_29_]
                is_25_[i_28_] = is_15_[i_29_]
                is_23_[i_28_] = if (is_13_ == null) is_12_[i_29_] else is_13_[i_29_]
                if (is_6_ != null) is_26_!![i_28_] = is_6_[i_31_]
                if (is_8_ != null) is_27_!![i_28_] = is_8_[i_31_]
                i_28_++
                is_20_[i_28_] = `is`[i_32_]
                is_21_[i_28_] = is_7_[i_32_]
                is_22_[i_28_] = is_12_[i_29_]
                is_24_[i_28_] = is_14_[i_29_]
                is_25_[i_28_] = is_15_[i_29_]
                is_23_[i_28_] = if (is_13_ != null) is_13_[i_29_] else is_12_[i_29_]
                if (is_6_ != null) is_26_!![i_28_] = is_6_[i_32_]
                if (is_8_ != null) is_27_!![i_28_] = is_8_[i_32_]
                i_28_++
            }
            U(i, i_5_, is_20_, is_26_, is_21_, is_27_, is_22_, is_23_, is_24_, is_25_, i_16_, i_17_, i_18_, bool)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(
                runtimeexception,
                ("ed.E(" + i + ',' + i_5_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_6_ != null) "{...}" else "null") + ',' + (if (is_7_ != null) "{...}" else "null") + ',' + (if (is_8_ != null) "{...}" else "null") + ',' + (if (is_9_ != null) "{...}" else "null") + ',' + (if (is_10_ != null) "{...}" else "null") + ',' + (if (is_11_ != null) "{...}" else "null") + ',' + (if (is_12_ != null) "{...}" else "null") + ',' + (if (is_13_ != null) "{...}" else "null") + ',' + (if (is_14_ != null) "{...}" else "null") + ',' + (if (is_15_ != null) "{...}" else "null") + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + bool + ')')
            )
        }
    }

    override fun YA() {
        if (anInt8284 <= 0) aClass104_8266 = null
        else {
            val `is` = Array<ByteArray?>(1 + this.anInt4587) { ByteArray(this.anInt4590 + 1) }
            for (i in 1..<this.anInt4587) {
                for (i_33_ in 1..<this.anInt4590) `is`[i]!![i_33_] = ((aByteArrayArray8273!![i]!![1 + i_33_].toInt() shr 3) + (aByteArrayArray8273!![i]!![-1 + i_33_].toInt() shr 2) + ((aByteArrayArray8273!![i + 1]!![i_33_].toInt() shr 3) + ((aByteArrayArray8273!![i - 1]!![i_33_].toInt() shr 2) + (aByteArrayArray8273!![i]!![i_33_].toInt() shr 1)))).toByte()
            }
            aClass348_Sub20Array8282 = arrayOfNulls<Class348_Sub20>(aClass356_8278!!.method3474(1))
            aClass356_8278!!.method3477(3, aClass348_Sub20Array8282 as Array<Class348?>)
            run {
                var i = 0
                while (aClass348_Sub20Array8282!!.size > i) {
                    aClass348_Sub20Array8282!![i]!!.method2946(2147483647, anInt8284)
                    i++
                }
            }
            var i = 24
            if (anIntArrayArrayArray8252 != null) i += 4
            if ((0x7 and this.anInt8235) != 0) i += 12
            val nativeheapbuffer = this.aHa_Sub2_8272!!.aNativeHeap7730!!.a(anInt8284 * i, false)
            val stream = Stream(nativeheapbuffer)
            val class348_sub20s = arrayOfNulls<Class348_Sub20>(anInt8284)
            var i_34_ = Class348_Sub40_Sub1.method3051(anInt8284 / 4, 4096)
            if (i_34_ < 1) i_34_ = 1
            val class356 = Class356(i_34_)
            val class348_sub20s_35_ = arrayOfNulls<Class348_Sub20>(anInt8280)
            var i_36_ = 0
            while (this.anInt4587 > i_36_) {
                var i_37_ = 0
                while ((this.anInt4590 > i_37_)) {
                    if (this.anIntArrayArrayArray8253!![i_36_]!![i_37_] != null) {
                        val class348_sub20s_38_ = aClass348_Sub20ArrayArrayArray8243!![i_36_]!![i_37_]!!
                        val is_39_ = (this.anIntArrayArrayArray8268!![i_36_]!![i_37_])!!
                        val is_40_ = (this.anIntArrayArrayArray8234!![i_36_]!![i_37_])!!
                        var is_41_ = anIntArrayArrayArray8245!![i_36_]!![i_37_]
                        val is_42_ = (this.anIntArrayArrayArray8253!![i_36_]!![i_37_])!!
                        val is_43_ = (if (anIntArrayArrayArray8258 != null) anIntArrayArrayArray8258!![i_36_]!![i_37_] else null)
                        if (is_41_ == null) is_41_ = is_42_
                        val is_44_ = (if (anIntArrayArrayArray8252 != null) anIntArrayArrayArray8252!![i_36_]!![i_37_] else null)
                        val f = aFloatArrayArray8285!![i_36_]!![i_37_]
                        val f_45_ = aFloatArrayArray8281!![i_36_]!![i_37_]
                        val f_46_ = aFloatArrayArray8283!![i_36_]!![i_37_]
                        val f_47_ = aFloatArrayArray8285!![i_36_]!![i_37_ - -1]
                        val f_48_ = aFloatArrayArray8281!![i_36_]!![1 + i_37_]
                        val f_49_ = aFloatArrayArray8283!![i_36_]!![1 + i_37_]
                        val f_50_ = aFloatArrayArray8285!![i_36_ - -1]!![1 + i_37_]
                        val f_51_ = aFloatArrayArray8281!![1 + i_36_]!![1 + i_37_]
                        val f_52_ = aFloatArrayArray8283!![i_36_ + 1]!![i_37_ - -1]
                        val f_53_ = aFloatArrayArray8285!![1 + i_36_]!![i_37_]
                        val f_54_ = aFloatArrayArray8281!![1 + i_36_]!![i_37_]
                        val f_55_ = aFloatArrayArray8283!![i_36_ + 1]!![i_37_]
                        val i_56_ = 0xff and `is`[i_36_]!![i_37_].toInt()
                        val i_57_ = 0xff and `is`[i_36_]!![1 + i_37_].toInt()
                        val i_58_ = `is`[1 + i_36_]!![i_37_ - -1].toInt() and 0xff
                        val i_59_ = 0xff and `is`[1 + i_36_]!![i_37_].toInt()
                        var i_60_ = 0
                        while_239_@ for (i_61_ in is_42_.indices) {
                            val class348_sub20 = class348_sub20s_38_[i_61_]
                            var i_62_ = 0
                            while (i_60_ > i_62_) {
                                if (class348_sub20s_35_[i_62_] == class348_sub20) continue@while_239_
                                i_62_++
                            }
                            class348_sub20s_35_[i_60_++] = class348_sub20
                        }
                        val is_63_ = (ShortArray(is_42_.size).also { this.aShortArrayArray8267[this.anInt4587 * i_37_ + i_36_] = it })
                        var i_64_ = 0
                        while ((is_42_.size > i_64_)) {
                            val i_65_ = ((i_36_ shl this.anInt4588) + is_39_[i_64_])
                            val i_66_ = ((i_37_ shl this.anInt4588) - -is_40_[i_64_])
                            val i_67_ = i_65_ shr anInt8264
                            val i_68_ = i_66_ shr anInt8264
                            val i_69_ = is_42_[i_64_]
                            val i_70_ = is_41_[i_64_]
                            val i_71_ = if (is_43_ != null) is_43_[i_64_] else 0
                            val l = ((i_67_ shl 16).toLong() or (i_69_.toLong() shl 32 or (i_70_.toLong() shl 48)) or i_68_.toLong())
                            val i_72_ = is_39_[i_64_]
                            val i_73_ = is_40_[i_64_]
                            var i_74_ = 74
                            var i_75_ = 0
                            val f_76_: Float
                            val f_77_: Float
                            val f_78_: Float
                            if (i_72_ != 0 || i_73_ != 0) {
                                if (i_72_ != 0 || i_73_ != this.anInt4592) {
                                    if ((i_72_ != this.anInt4592) || i_73_ != this.anInt4592) {
                                        if ((i_72_ == this.anInt4592) && i_73_ == 0) {
                                            f_76_ = f_54_
                                            f_78_ = f_55_
                                            f_77_ = f_53_
                                            i_74_ -= i_59_
                                        } else {
                                            val f_79_ = (i_72_.toFloat() / (this.anInt4592).toFloat())
                                            val f_80_ = (i_73_.toFloat() / (this.anInt4592).toFloat())
                                            val f_81_ = (-f + f_53_) * f_79_ + f
                                            val f_82_ = ((f_54_ - f_45_) * f_79_ + f_45_)
                                            val f_83_ = (f_79_ * (-f_46_ + f_55_) + f_46_)
                                            val f_84_ = (f_79_ * (f_50_ - f_47_) + f_47_)
                                            val f_85_ = (f_48_ + (-f_48_ + f_51_) * f_79_)
                                            val f_86_ = ((f_52_ - f_49_) * f_79_ + f_49_)
                                            f_76_ = f_82_ + ((f_85_ - f_82_) * f_80_)
                                            f_77_ = (f_80_ * (-f_81_ + f_84_) + f_81_)
                                            f_78_ = f_83_ + ((-f_83_ + f_86_) * f_80_)
                                            val i_87_ = (((i_59_ + -i_56_) * i_72_ shr this.anInt4588) + i_56_)
                                            val i_88_ = ((i_72_ * (-i_57_ + i_58_) shr this.anInt4588) + i_57_)
                                            i_74_ -= i_87_ - -(((-i_87_ + i_88_) * i_73_) shr (this.anInt4588))
                                        }
                                    } else {
                                        f_77_ = f_50_
                                        f_76_ = f_51_
                                        f_78_ = f_52_
                                        i_74_ -= i_58_
                                    }
                                } else {
                                    f_78_ = f_49_
                                    f_76_ = f_48_
                                    i_74_ -= i_57_
                                    f_77_ = f_47_
                                }
                            } else {
                                f_76_ = f_45_
                                f_77_ = f
                                i_74_ -= i_56_
                                f_78_ = f_46_
                            }
                            var f_89_ = 1.0f
                            if (i_69_ != -1) {
                                var i_90_ = (0x7f and i_69_) * i_74_ shr 7
                                if (i_90_ >= 2) {
                                    if (i_90_ > 126) i_90_ = 126
                                } else i_90_ = 2
                                if ((0x7 and this.anInt8235) == 0) {
                                    f_89_ = ((this.aHa_Sub2_8272!!.aFloatArray7825[2]) * f_78_ + (f_77_ * (this.aHa_Sub2_8272!!.aFloatArray7825[0]) + f_76_ * (this.aHa_Sub2_8272!!.aFloatArray7825[1])))
                                    f_89_ = ((this.aHa_Sub2_8272!!.aFloat7768) + (if (f_89_ > 0.0f) (this.aHa_Sub2_8272!!.aFloat7832) else (this.aHa_Sub2_8272!!.aFloat7871)) * f_89_)
                                }
                                i_75_ = (Class10.anIntArray179!![0xff80 and i_69_ or i_90_])
                            }
                            var class348: Class348? = null
                            if ((i_65_ and -1 + anInt8260) == 0 && (anInt8260 + -1 and i_66_) == 0) class348 = class356.method3480(l, -6008)
                            val i_91_: Int
                            if (class348 == null) {
                                var i_92_: Int
                                if (i_69_ != i_70_) {
                                    var i_93_ = (i_70_ and 0x7f) * i_74_ shr 7
                                    if (i_93_ < 2) i_93_ = 2
                                    else if (i_93_ > 126) i_93_ = 126
                                    i_92_ = (Class10.anIntArray179!![0xff80 and i_70_ or i_93_])
                                    if ((0x7 and this.anInt8235) == 0) {
                                        var f_94_ = ((this.aHa_Sub2_8272!!.aFloatArray7825[0]) * f_77_ + f_76_ * (this.aHa_Sub2_8272!!.aFloatArray7825[1]) + f_78_ * (this.aHa_Sub2_8272!!.aFloatArray7825[2]))
                                        f_94_ = ((if (f_89_ > 0.0f) (this.aHa_Sub2_8272!!.aFloat7832) else (this.aHa_Sub2_8272!!.aFloat7871)) * f_89_ + (this.aHa_Sub2_8272!!.aFloat7768))
                                        var i_95_ = (i_92_ and 0xffcb9e) shr 16
                                        var i_96_ = (0xff29 and i_92_) shr 8
                                        var i_97_ = 0xff and i_92_
                                        i_95_ = (i_95_ * f_94_).toInt()
                                        i_96_ = (i_96_ * f_94_).toInt()
                                        if (i_95_ < 0) i_95_ = 0
                                        else if (i_95_ > 255) i_95_ = 255
                                        if (i_96_ >= 0) {
                                            if (i_96_ > 255) i_96_ = 255
                                        } else i_96_ = 0
                                        i_97_ = (i_97_ * f_94_).toInt()
                                        if (i_97_ < 0) i_97_ = 0
                                        else if (i_97_ > 255) i_97_ = 255
                                        i_92_ = (i_95_ shl 16 or (i_96_ shl 8) or i_97_)
                                    }
                                } else i_92_ = i_75_
                                if (this.aHa_Sub2_8272!!.aBoolean7775) {
                                    stream.a(i_65_.toFloat())
                                    stream.a((this.method3986(i_65_, i_66_, (-121).toByte()) + i_71_).toFloat())
                                    stream.a(i_66_.toFloat())
                                    stream.f((i_92_ shr 16).toByte().toInt())
                                    stream.f((i_92_ shr 8).toByte().toInt())
                                    stream.f(i_92_.toByte().toInt())
                                    stream.f(-1)
                                    stream.a(i_65_.toFloat())
                                    stream.a(i_66_.toFloat())
                                    if (anIntArrayArrayArray8252 != null) stream.a((if (is_44_ == null) 0 else -1 + (is_44_[i_64_])).toFloat())
                                    if ((0x7 and this.anInt8235) != 0) {
                                        stream.a(f_77_)
                                        stream.a(f_76_)
                                        stream.a(f_78_)
                                    }
                                } else {
                                    stream.b(i_65_.toFloat())
                                    stream.b((this.method3986(i_65_, i_66_, (-101).toByte()) - -i_71_).toFloat())
                                    stream.b(i_66_.toFloat())
                                    stream.f((i_92_ shr 16).toByte().toInt())
                                    stream.f((i_92_ shr 8).toByte().toInt())
                                    stream.f(i_92_.toByte().toInt())
                                    stream.f(-1)
                                    stream.b(i_65_.toFloat())
                                    stream.b(i_66_.toFloat())
                                    if (anIntArrayArrayArray8252 != null) stream.b((if (is_44_ != null) is_44_[i_64_] + -1 else 0).toFloat())
                                    if ((0x7 and this.anInt8235) != 0) {
                                        stream.b(f_77_)
                                        stream.b(f_76_)
                                        stream.b(f_78_)
                                    }
                                }
                                i_91_ = anInt8246++
                                is_63_[i_64_] = i_91_.toShort()
                                if (i_69_ != -1) class348_sub20s[i_91_] = class348_sub20s_38_[i_64_]
                                class356.method3483(114.toByte(), l, Class348_Sub29(is_63_[i_64_]))
                            } else {
                                is_63_[i_64_] = (class348 as Class348_Sub29).aShort6911
                                i_91_ = 0xffff and is_63_[i_64_].toInt()
                                if (i_69_ != -1 && ((class348_sub20s[i_91_]!!.aLong4291) > class348_sub20s_38_[i_64_]!!.aLong4291)) class348_sub20s[i_91_] = class348_sub20s_38_[i_64_]
                            }
                            for (i_98_ in 0..<i_60_) class348_sub20s_35_[i_98_]!!.method2949(97.toByte(), i_91_, i_74_, i_75_, f_89_)
                            anInt8257++
                            i_64_++
                        }
                    }
                    i_37_++
                }
                i_36_++
            }
            var i_99_ = 0
            while (anInt8246 > i_99_) {
                val class348_sub20 = class348_sub20s[i_99_]
                if (class348_sub20 != null) class348_sub20.method2951(3, i_99_)
                i_99_++
            }
            var i_100_ = 0
            while (this.anInt4587 > i_100_) {
                for (i_101_ in 0..<this.anInt4590) {
                    val is_102_ = (this.aShortArrayArray8267[i_101_ * this.anInt4587 + i_100_])
                    if (is_102_ != null) {
                        var i_103_ = 0
                        var i_104_ = 0
                        while (is_102_.size > i_104_) {
                            val i_105_ = is_102_[i_104_++].toInt() and 0xffff
                            val i_106_ = is_102_[i_104_++].toInt() and 0xffff
                            val i_107_ = 0xffff and is_102_[i_104_++].toInt()
                            val class348_sub20 = class348_sub20s[i_105_]
                            val class348_sub20_108_ = class348_sub20s[i_106_]
                            val class348_sub20_109_ = class348_sub20s[i_107_]
                            var class348_sub20_110_: Class348_Sub20? = null
                            if (class348_sub20 != null) {
                                class348_sub20.method2945(i_100_, 18.toByte(), i_101_, i_103_)
                                class348_sub20_110_ = class348_sub20
                            }
                            if (class348_sub20_108_ != null) {
                                class348_sub20_108_.method2945(i_100_, 18.toByte(), i_101_, i_103_)
                                if (class348_sub20_110_ == null || ((class348_sub20_110_.aLong4291) > (class348_sub20_108_.aLong4291))) class348_sub20_110_ = class348_sub20_108_
                            }
                            if (class348_sub20_109_ != null) {
                                class348_sub20_109_.method2945(i_100_, 18.toByte(), i_101_, i_103_)
                                if (class348_sub20_110_ == null || ((class348_sub20_109_.aLong4291) < (class348_sub20_110_.aLong4291))) class348_sub20_110_ = class348_sub20_109_
                            }
                            if (class348_sub20_110_ != null) {
                                if (class348_sub20 != null) class348_sub20_110_.method2951(3, i_105_)
                                if (class348_sub20_108_ != null) class348_sub20_110_.method2951(3, i_106_)
                                if (class348_sub20_109_ != null) class348_sub20_110_.method2951(3, i_107_)
                                class348_sub20_110_.method2945(i_100_, 18.toByte(), i_101_, i_103_)
                            }
                            i_103_++
                        }
                    }
                }
                i_100_++
            }
            stream.a()
            anInterface2_8279 = this.aHa_Sub2_8272!!.method3739(8448, nativeheapbuffer, false, i, stream.b())
            this.aClass123_8276 = Class123(anInterface2_8279, 5126, 3, 0)
            aClass123_8274 = Class123(anInterface2_8279, 5121, 4, 12)
            val i_111_: Int
            if (anIntArrayArrayArray8252 == null) {
                i_111_ = 24
                this.aClass123_8277 = Class123(anInterface2_8279, 5126, 2, 16)
            } else {
                i_111_ = 28
                this.aClass123_8277 = Class123(anInterface2_8279, 5126, 3, 16)
            }
            if ((0x7 and this.anInt8235) != 0) this.aClass123_8275 = Class123(anInterface2_8279, 5126, 3, i_111_)
            val ls = LongArray(aClass348_Sub20Array8282!!.size)
            for (i_112_ in aClass348_Sub20Array8282!!.indices) {
                val class348_sub20 = aClass348_Sub20Array8282!![i_112_]!!
                ls[i_112_] = class348_sub20.aLong4291
                class348_sub20.method2952(17795, anInt8246)
            }
            Class339.method2669(aClass348_Sub20Array8282 as? Array<Any?>, ls, -21)
            if (aClass104_8266 != null) aClass104_8266!!.method957(0)
        }
        anInt8247++
        anIntArrayArrayArray8258 = null
        aFloatArrayArray8283 = null
        aFloatArrayArray8281 = aFloatArrayArray8283
        aFloatArrayArray8285 = aFloatArrayArray8281
        anIntArrayArrayArray8252 = null
        aClass348_Sub20ArrayArrayArray8243 = null
        this.anIntArrayArrayArray8253 = null
        aByteArrayArray8273 = null
        aClass356_8278 = null
        anIntArrayArrayArray8245 = null
        this.anIntArrayArrayArray8234 = null
        this.anIntArrayArrayArray8268 = this.anIntArrayArrayArray8234
    }

    private fun method3998(i: Byte, i_113_: Int, i_114_: Int, var_r_Sub2: r_Sub2) {
        anInt8254++
        val `is` = this.anIntArrayArrayArray8268!![i_113_]!![i_114_]!!
        val is_115_ = this.anIntArrayArrayArray8234!![i_113_]!![i_114_]!!
        val i_116_ = `is`.size
        if (this.aHa_Sub2_8272!!.anIntArray7880!!.size < i_116_) {
            this.aHa_Sub2_8272!!.anIntArray7883 = IntArray(i_116_)
            this.aHa_Sub2_8272!!.anIntArray7880 = IntArray(i_116_)
        }
        val is_117_ = this.aHa_Sub2_8272!!.anIntArray7880!!
        val is_118_ = this.aHa_Sub2_8272!!.anIntArray7883!!
        for (i_119_ in 0..<i_116_) {
            is_117_[i_119_] = (`is`[i_119_] shr this.aHa_Sub2_8272!!.anInt7731)
            is_118_[i_119_] = (is_115_[i_119_] shr this.aHa_Sub2_8272!!.anInt7731)
        }
        var i_120_ = 0
        while (i_120_ < i_116_) {
            val i_121_ = is_117_[i_120_]
            val i_122_ = is_118_[i_120_++]
            val i_123_ = is_117_[i_120_]
            val i_124_ = is_118_[i_120_++]
            val i_125_ = is_117_[i_120_]
            val i_126_ = is_118_[i_120_++]
            if (((-i_123_ + i_121_) * (i_124_ + -i_126_) - (i_125_ - i_123_) * (i_124_ - i_122_)) > 0) var_r_Sub2.method3294(i_125_, i_121_, i_122_, 63, i_123_, i_126_, i_124_)
        }
    }

    override fun method3979(i: Int, i_127_: Int) {
        anInt8239++
    }

    override fun CA(var_r: r?, i: Int, i_128_: Int, i_129_: Int, i_130_: Int, bool: Boolean) {
        anInt8236++
        if (aClass104_8266 != null && var_r != null) {
            val i_131_ = (i - ((i_128_ * this.aHa_Sub2_8272!!.anInt7772) shr 8) shr this.aHa_Sub2_8272!!.anInt7731)
            val i_132_ = (-((this.aHa_Sub2_8272!!.anInt7777 * i_128_) shr 8) + i_129_ shr this.aHa_Sub2_8272!!.anInt7731)
            aClass104_8266!!.method959(i_131_, i_132_, 107.toByte(), var_r)
        }
    }

    override fun method3989(var_r: r?, i: Int, i_142_: Int, i_143_: Int, i_144_: Int, bool: Boolean): Boolean {
        anInt8244++
        if (aClass104_8266 == null || var_r == null) return false
        val i_145_ = (-(i_142_ * this.aHa_Sub2_8272!!.anInt7772 shr 8) + i shr this.aHa_Sub2_8272!!.anInt7731)
        val i_146_ = (i_143_ + -((this.aHa_Sub2_8272!!.anInt7777 * i_142_) shr 8) shr this.aHa_Sub2_8272!!.anInt7731)
        return aClass104_8266!!.method954(i_145_, 88.toByte(), i_146_, var_r)
    }

    override fun method3983(i: Int, i_149_: Int, i_150_: Int, bools: Array<BooleanArray?>?, bool: Boolean, i_151_: Int) {
        method4003(-1, i_150_, bool, -49, i, i_151_, bools!!, i_149_)
        anInt8255++
    }

    override fun method3987(i: Int, i_152_: Int, i_153_: Int, i_154_: Int, i_155_: Int, i_156_: Int, i_157_: Int, bools: Array<BooleanArray?>) {
        anInt8262++
        if (anInt8284 > 0) {
            this.aHa_Sub2_8272!!.method3755(-32)
            this.aHa_Sub2_8272!!.method3807(false, 2)
            this.aHa_Sub2_8272!!.method3728(false, 92)
            this.aHa_Sub2_8272!!.method3752(117, false)
            this.aHa_Sub2_8272!!.method3748(0, false)
            this.aHa_Sub2_8272!!.method3753(0, 1)
            this.aHa_Sub2_8272!!.method3757(-2, -100)
            this.aHa_Sub2_8272!!.method3771((-86).toByte(), null)
            Class73.aFloatArray4772!![0] = (i_153_.toFloat() / ((this.aHa_Sub2_8272!!.anInt7688).toFloat() * (this.anInt4592.toFloat() * 128.0f)))
            Class73.aFloatArray4772!![8] = 0.0f
            Class73.aFloatArray4772!![13] = 1.0f - (((i_157_ * i_153_).toFloat() / 128.0f + (i_152_ * 2).toFloat()) / (this.aHa_Sub2_8272!!.anInt7641).toFloat())
            Class73.aFloatArray4772!![7] = 0.0f
            Class73.aFloatArray4772!![6] = 0.0f
            Class73.aFloatArray4772!![5] = (i_153_.toFloat() / ((this.aHa_Sub2_8272!!.anInt7641).toFloat() * (this.anInt4592.toFloat() * 128.0f)))
            Class73.aFloatArray4772!![1] = 0.0f
            Class73.aFloatArray4772!![4] = 0.0f
            Class73.aFloatArray4772!![14] = 0.0f
            Class73.aFloatArray4772!![12] = -(((i_153_ * i_154_).toFloat() / 128.0f - (2 * i).toFloat()) / (this.aHa_Sub2_8272!!.anInt7688).toFloat()) + -1.0f
            Class73.aFloatArray4772!![10] = 0.0f
            Class73.aFloatArray4772!![15] = 1.0f
            Class73.aFloatArray4772!![3] = 0.0f
            Class73.aFloatArray4772!![2] = 0.0f
            Class73.aFloatArray4772!![9] = 0.0f
            Class73.aFloatArray4772!![11] = 0.0f
            glMatrixMode(5889)
            glLoadMatrixf(Class73.aFloatArray4772, 0)
            Class73.aFloatArray4772!![12] = 0.0f
            Class73.aFloatArray4772!![4] = 0.0f
            Class73.aFloatArray4772!![0] = 1.0f
            Class73.aFloatArray4772!![14] = 0.0f
            Class73.aFloatArray4772!![6] = 1.0f
            Class73.aFloatArray4772!![8] = 0.0f
            Class73.aFloatArray4772!![11] = 0.0f
            Class73.aFloatArray4772!![13] = 0.0f
            Class73.aFloatArray4772!![7] = 0.0f
            Class73.aFloatArray4772!![5] = 0.0f
            Class73.aFloatArray4772!![15] = 1.0f
            Class73.aFloatArray4772!![2] = 0.0f
            Class73.aFloatArray4772!![3] = 0.0f
            Class73.aFloatArray4772!![9] = 1.0f
            Class73.aFloatArray4772!![10] = 0.0f
            Class73.aFloatArray4772!![1] = 0.0f
            glMatrixMode(5888)
            glLoadMatrixf(Class73.aFloatArray4772, 0)
            if ((0x7 and this.anInt8235) == 0) this.aHa_Sub2_8272!!.method3728(false, 56)
            else {
                this.aHa_Sub2_8272!!.method3728(true, 91)
                this.aHa_Sub2_8272!!.method3796(16384)
            }
            this.aHa_Sub2_8272!!.method3794(this.aClass123_8276, aClass123_8274, -26411, this.aClass123_8277, this.aClass123_8275)
            if (this.aHa_Sub2_8272!!.aClass348_Sub49_Sub1_7798!!.aByteArray7154!!.size < anInt8257 * 2) this.aHa_Sub2_8272!!.aClass348_Sub49_Sub1_7798 = Class348_Sub49_Sub1(anInt8257 * 2)
            else this.aHa_Sub2_8272!!.aClass348_Sub49_Sub1_7798!!.anInt7197 = 0
            var i_158_ = 0
            val class348_sub49_sub1 = (this.aHa_Sub2_8272!!.aClass348_Sub49_Sub1_7798)!!
            if (this.aHa_Sub2_8272!!.aBoolean7775) {
                for (i_159_ in i_155_..<i_157_) {
                    var i_160_ = i_159_ * this.anInt4587 + i_154_
                    var i_161_ = i_154_
                    while (i_156_ > i_161_) {
                        if (bools[-i_154_ + i_161_]!![-i_155_ + i_159_]) {
                            val `is` = this.aShortArrayArray8267[i_160_]
                            if (`is` != null) {
                                for (i_162_ in `is`.indices) {
                                    class348_sub49_sub1.writeShort(107.toByte(), (`is`[i_162_].toInt() and 0xffff))
                                    i_158_++
                                }
                            }
                        }
                        i_160_++
                        i_161_++
                    }
                }
            } else {
                for (i_163_ in i_155_..<i_157_) {
                    var i_164_ = i_154_ + i_163_ * this.anInt4587
                    var i_165_ = i_154_
                    while (i_156_ > i_165_) {
                        if (bools[i_165_ + -i_154_]!![i_163_ + -i_155_]) {
                            val `is` = this.aShortArrayArray8267[i_164_]
                            if (`is` != null) {
                                for (i_166_ in `is`.indices) {
                                    class348_sub49_sub1.method3397(84, 0xffff and `is`[i_166_].toInt())
                                    i_158_++
                                }
                            }
                        }
                        i_164_++
                        i_165_++
                    }
                }
            }
            if (i_158_ > 0) {
                val class119_sub2 = Class119_Sub2(this.aHa_Sub2_8272, 5123, (class348_sub49_sub1.aByteArray7154), (class348_sub49_sub1.anInt7197))
                this.aHa_Sub2_8272!!.method3759(i_158_, -128, 4, class119_sub2, 0)
            }
        }
    }

    override fun fa(i: Int, i_167_: Int, var_r: r?): r? {
        anInt8259++
        if ((0x1 and aByteArrayArray8240[i]!![i_167_].toInt()) == 0) return null
        val i_168_ = (this.anInt4592 shr this.aHa_Sub2_8272!!.anInt7731)
        val var_r_Sub2 = var_r as r_Sub2?
        val var_r_Sub2_169_: r_Sub2?
        if (var_r_Sub2 == null || !var_r_Sub2.method3296(104.toByte(), i_168_, i_168_)) var_r_Sub2_169_ = r_Sub2(this.aHa_Sub2_8272, i_168_, i_168_)
        else {
            var_r_Sub2_169_ = var_r_Sub2
            var_r_Sub2_169_.method3293(0.toByte())
        }
        var_r_Sub2_169_.method3292(i_168_, i_168_, 0, 25053, 0)
        method3998((-82).toByte(), i, i_167_, var_r_Sub2_169_)
        return var_r_Sub2_169_
    }

    override fun method3984(i: Int, i_172_: Int, i_173_: Int, bools: Array<BooleanArray?>?, bool: Boolean, i_174_: Int, i_175_: Int) {
        anInt8263++
        method4003(i_174_, i_173_, bool, -62, i, i_175_, bools!!, i_172_)
    }

    override fun method3981(class348_sub1: Class348_Sub1, `is`: IntArray) {
        try {
            anInt8271++
            aClass262_8256.method1999(Class348_Sub32((this.aHa_Sub2_8272), this, class348_sub1, `is`), -20180)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ed.L(" + (if (class348_sub1 != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    override fun U(i: Int, i_176_: Int, `is`: IntArray?, is_177_: IntArray?, is_178_: IntArray, is_179_: IntArray?, is_180_: IntArray, is_181_: IntArray?, is_182_: IntArray, is_183_: IntArray, i_184_: Int, i_185_: Int, i_186_: Int, bool: Boolean) {
        try {
            anInt8261++
            if (is_177_ != null && anIntArrayArrayArray8258 == null) anIntArrayArrayArray8258 = Array<Array<IntArray?>?>(this.anInt4587) { arrayOfNulls<IntArray>(this.anInt4590) }
            val var_d = this.aHa_Sub2_8272!!.aD4579!!
            if (is_179_ != null && anIntArrayArrayArray8252 == null) anIntArrayArrayArray8252 = Array<Array<IntArray?>?>(this.anInt4587) { arrayOfNulls<IntArray>(this.anInt4590) }
            this.anIntArrayArrayArray8268!![i]!![i_176_] = `is`!!
            this.anIntArrayArrayArray8234!![i]!![i_176_] = is_178_!!
            this.anIntArrayArrayArray8253!![i]!![i_176_] = is_180_!!
            anIntArrayArrayArray8245!![i]!![i_176_] = is_181_
            if (anIntArrayArrayArray8252 != null) anIntArrayArrayArray8252!![i]!![i_176_] = is_179_
            if (anIntArrayArrayArray8258 != null) anIntArrayArrayArray8258!![i]!![i_176_] = is_177_
            val class348_sub20s = (arrayOfNulls<Class348_Sub20>(is_180_.size).also { aClass348_Sub20ArrayArrayArray8243!![i]!![i_176_] = it })
            for (i_187_ in is_180_.indices) {
                var i_188_ = is_182_!![i_187_]
                var i_189_ = is_183_!![i_187_]
                if ((0x20 and this.anInt8235) != 0 && i_188_ != -1 && var_d.method3(i_188_, -6662)!!.aBoolean209) {
                    i_188_ = -1
                    i_189_ = 128
                }
                val l = (i_184_.toLong() shl 28 or (i_185_.toLong() shl 42 or (i_186_.toLong() shl 48)) or (i_189_ shl 14).toLong() or i_188_.toLong())
                var class348: Class348?
                class348 = aClass356_8278!!.method3480(l, -6008)
                while (class348 != null) {
                    val class348_sub20 = class348 as Class348_Sub20
                    if (i_188_ == class348_sub20.anInt6841 && (class348_sub20.aFloat6832 == i_189_.toFloat()) && (class348_sub20.anInt6825 == i_184_) && (i_185_ == class348_sub20.anInt6833) && (class348_sub20.anInt6826 == i_186_)) break
                    class348 = aClass356_8278!!.method3476(true)
                }
                if (class348 == null) {
                    class348_sub20s[i_187_] = Class348_Sub20(this, i_188_, i_189_, i_184_, i_185_, i_186_)
                    aClass356_8278!!.method3483(99.toByte(), l, class348_sub20s[i_187_])
                } else class348_sub20s[i_187_] = class348 as Class348_Sub20
            }
            if (bool) aByteArrayArray8240[i]!![i_176_] = Class273.method2057((aByteArrayArray8240[i]!![i_176_]).toInt(), 1).toByte()
            if (is_180_.size > anInt8280) anInt8280 = is_180_.size
            anInt8284 += is_180_.size
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(
                runtimeexception,
                ("ed.U(" + i + ',' + i_176_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_177_ != null) "{...}" else "null") + ',' + (if (is_178_ != null) "{...}" else "null") + ',' + (if (is_179_ != null) "{...}" else "null") + ',' + (if (is_180_ != null) "{...}" else "null") + ',' + (if (is_181_ != null) "{...}" else "null") + ',' + (if (is_182_ != null) "{...}" else "null") + ',' + (if (is_183_ != null) "{...}" else "null") + ',' + i_184_ + ',' + i_185_ + ',' + i_186_ + ',' + bool + ')')
            )
        }
    }

    override fun ka(i: Int, i_190_: Int, i_191_: Int) {
        if (i_191_ > (0xff and aByteArrayArray8273!![i]!![i_190_].toInt())) aByteArrayArray8273!![i]!![i_190_] = i_191_.toByte()
        anInt8242++
    }

    private fun method4003(i: Int, i_192_: Int, bool: Boolean, i_193_: Int, i_194_: Int, i_195_: Int, bools: Array<BooleanArray?>, i_196_: Int) {
        anInt8250++
        if (i_193_ >= -39) anInt8280 = -20
        if (aClass348_Sub20Array8282 != null) {
            var i_197_ = i_192_ + i_192_ - -1
            i_197_ *= i_197_
            if (this.aHa_Sub2_8272!!.anIntArray7882!!.size < i_197_) this.aHa_Sub2_8272!!.anIntArray7882 = IntArray(i_197_)
            if (anInt8257 * 2 > (this.aHa_Sub2_8272!!.aClass348_Sub49_Sub1_7798!!.aByteArray7154)!!.size) this.aHa_Sub2_8272!!.aClass348_Sub49_Sub1_7798 = Class348_Sub49_Sub1(2 * anInt8257)
            var i_198_ = -i_192_ + i_194_
            val i_199_ = i_198_
            if (i_198_ < 0) i_198_ = 0
            var i_200_ = i_196_ - i_192_
            val i_201_ = i_200_
            if (i_200_ < 0) i_200_ = 0
            var i_202_ = i_192_ + i_194_
            if (i_202_ > this.anInt4587 - 1) i_202_ = -1 + this.anInt4587
            var i_203_ = i_196_ + i_192_
            if (-1 + this.anInt4590 < i_203_) i_203_ = this.anInt4590 + -1
            var i_204_ = 0
            val `is` = this.aHa_Sub2_8272!!.anIntArray7882!!
            var i_205_ = i_198_
            while (i_202_ >= i_205_) {
                val bools_206_ = bools[-i_199_ + i_205_]!!
                var i_207_ = i_200_
                while (i_203_ >= i_207_) {
                    if (bools_206_[-i_201_ + i_207_]) `is`[i_204_++] = i_205_ + i_207_ * this.anInt4587
                    i_207_++
                }
                i_205_++
            }
            if (i != -1) {
                this.aHa_Sub2_8272!!.method3789((-120).toByte(), i.toFloat())
                this.aHa_Sub2_8272!!.method3760(1)
            } else this.aHa_Sub2_8272!!.method3784((-62).toByte())
            this.aHa_Sub2_8272!!.method3728((0x7 and (this.anInt8235)) != 0, 120)
            var i_208_ = 0
            while (aClass348_Sub20Array8282!!.size > i_208_) {
                aClass348_Sub20Array8282!![i_208_]!!.method2948(5123, i_204_, `is`)
                i_208_++
            }
            if (!aClass262_8256.method2002(18.toByte())) {
                val i_209_ = this.aHa_Sub2_8272!!.anInt7856
                val i_210_ = this.aHa_Sub2_8272!!.anInt7782
                this.aHa_Sub2_8272!!.L(0, i_210_, (this.aHa_Sub2_8272!!.anInt7813))
                this.aHa_Sub2_8272!!.method3728(false, 97)
                this.aHa_Sub2_8272!!.method3748(0, false)
                this.aHa_Sub2_8272!!.method3753(128, 1)
                this.aHa_Sub2_8272!!.method3757(-2, -88)
                this.aHa_Sub2_8272!!.method3771((-124).toByte(), (this.aHa_Sub2_8272!!.aClass258_Sub3_7827))
                this.aHa_Sub2_8272!!.method3729(8448, 98.toByte(), 7681)
                this.aHa_Sub2_8272!!.method3762(34166, 770, (-87).toByte(), 0)
                this.aHa_Sub2_8272!!.method3775(false, 0, 770, 34167)
                var class348 = aClass262_8256.method1995(4)
                while (class348 != null) {
                    val class348_sub32 = class348 as Class348_Sub32
                    class348_sub32.method3023(bools, 255, i_194_, i_196_, i_192_)
                    class348 = aClass262_8256.method1990(92.toByte())
                }
                this.aHa_Sub2_8272!!.method3762(5890, 768, (-87).toByte(), 0)
                this.aHa_Sub2_8272!!.method3775(false, 0, 770, 5890)
                this.aHa_Sub2_8272!!.method3771((-96).toByte(), null)
                this.aHa_Sub2_8272!!.L(i_209_, i_210_, (this.aHa_Sub2_8272!!.anInt7813))
            }
            if (aClass104_8266 != null) {
                glPushMatrix()
                glTranslatef(0.0f, -1.0f, 0.0f)
                this.aHa_Sub2_8272!!.method3794(this.aClass123_8276, null, -26411, this.aClass123_8277, null)
                aClass104_8266!!.method956(bool, 112, bools, i_192_, i_196_, i_194_)
                glPopMatrix()
            }
        }
    }

    init {
        do {
            try {
                this.aHa_Sub2_8272 = var_ha_Sub2
                anInt8264 = this.anInt4588 + -2
                anIntArrayArrayArray8245 = Array<Array<IntArray?>?>(i_134_) { arrayOfNulls<IntArray>(i_135_) }
                aByteArrayArray8240 = Array<ByteArray?>(i_134_) { ByteArray(i_135_) }
                this.anIntArrayArrayArray8268 = Array<Array<IntArray?>?>(i_134_) { arrayOfNulls<IntArray>(i_135_) }
                this.anIntArrayArrayArray8253 = Array<Array<IntArray?>?>(i_134_) { arrayOfNulls<IntArray>(i_135_) }
                aFloatArrayArray8285 = (Array<FloatArray?>(1 + this.anInt4587) { FloatArray(this.anInt4590 + 1) })
                aClass348_Sub20ArrayArrayArray8243 = Array<Array<Array<Class348_Sub20?>?>?>(i_134_) { arrayOfNulls<Array<Class348_Sub20?>>(i_135_) }
                anIntArrayArrayArray8258 = Array<Array<IntArray?>?>(i_134_) { arrayOfNulls<IntArray>(i_135_) }
                aFloatArrayArray8281 = (Array<FloatArray?>(1 + this.anInt4587) { FloatArray(1 + this.anInt4590) })
                aByteArrayArray8273 = Array<ByteArray?>(1 + i_134_) { ByteArray(i_135_ - -1) }
                this.aShortArrayArray8267 = arrayOfNulls<ShortArray>(i_135_ * i_134_)
                anInt8260 = 1 shl anInt8264
                this.anIntArrayArrayArray8234 = Array<Array<IntArray?>?>(i_134_) { arrayOfNulls<IntArray>(i_135_) }
                aFloatArrayArray8283 = (Array<FloatArray?>(1 + this.anInt4587) { FloatArray(1 + this.anInt4590) })
                this.anInt8235 = i_133_
                var i_138_ = 1
                while (this.anInt4590 > i_138_) {
                    var i_139_ = 1
                    while (this.anInt4587 > i_139_) {
                        val i_140_ = (is_136_!![1 + i_139_]!![i_138_] + -is_136_[-1 + i_139_]!![i_138_])
                        val i_141_ = (is_136_[i_139_]!![1 + i_138_] + -is_136_[i_139_]!![i_138_ - 1])
                        val f = (1.0 / sqrt((i_141_ * i_141_ + (i_137_ * i_137_ * 4) + (i_140_ * i_140_)).toDouble())).toFloat()
                        aFloatArrayArray8285!![i_139_]!![i_138_] = f * i_140_.toFloat()
                        aFloatArrayArray8281!![i_139_]!![i_138_] = f * (-i_137_ * 2).toFloat()
                        aFloatArrayArray8283!![i_139_]!![i_138_] = i_141_.toFloat() * f
                        i_139_++
                    }
                    i_138_++
                }
                aClass356_8278 = Class356(128)
                if ((0x10 and this.anInt8235) == 0) break
                aClass104_8266 = Class104(this.aHa_Sub2_8272, this)
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("ed.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_133_ + ',' + i_134_ + ',' + i_135_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_136_ != null) "{...}" else "null") + ',' + i_137_ + ')'))
            }
            break
        } while (false)
    }

    companion object {
        @JvmField
        var anInt8236: Int = 0
        @JvmField
        var anInt8237: Int = 0
        @JvmField
        var anInt8238: Int = 0
        @JvmField
        var anInt8239: Int = 0
        @JvmField
        var aClass107_8241: Class107? = Class107()
        @JvmField
        var anInt8242: Int = 0
        @JvmField
        var anInt8244: Int = 0
        @JvmField
        var anInt8247: Int = 0
        @JvmField
        var anInt8248: Int = 0
        @JvmField
        var anInt8249: Int = 0
        @JvmField
        var anInt8250: Int = 0
        @JvmField
        var anInt8251: Int = 0
        @JvmField
        var anInt8254: Int = 0
        @JvmField
        var anInt8255: Int = 0
        @JvmField
        var anInt8259: Int = 0
        @JvmField
        var anInt8261: Int = 0
        @JvmField
        var anInt8262: Int = 0
        @JvmField
        var anInt8263: Int = 0
        @JvmField
        var aString8265: String? = null
        @JvmField
        var anIntArray8269: IntArray?
        @JvmField
        var anInt8270: Int = -1
        @JvmField
        var anInt8271: Int = 0
        @JvmStatic
        fun method3999(i: Int, i_147_: Int, i_148_: Int): Boolean {
            if (i_148_ != 458752) anInt8237 = -28
            anInt8238++
            return ((0x70000 and i_147_) != 0) or Class223.method1613(false, i, i_147_) || Class288.method2187(i_147_, -121, i)
        }

        @JvmStatic
        fun method4000(i: Int) {
            if (i != 8448) aString8265 = null
            anIntArray8269 = null
            aString8265 = null
            aClass107_8241 = null
        }

        @JvmStatic
        fun method4001(class318_sub1: Class318_Sub1) {
            Class9.aHa171!!.H(class318_sub1.x, (class318_sub1.anInt6382 + (class318_sub1.method2394(true) shr 1)), class318_sub1.y, Class348_Sub42_Sub3.anIntArray9505)
            class318_sub1.anInt6386 = Class348_Sub42_Sub3.anIntArray9505!![0]
            class318_sub1.anInt6380 = Class348_Sub42_Sub3.anIntArray9505!![1]
            class318_sub1.anInt6389 = Class348_Sub42_Sub3.anIntArray9505!![2]
        }

        @JvmStatic
        fun method4002(class348_sub49: Class348_Sub49, i: Byte) {
            anInt8248++
            val `is` = ByteArray(24)
            if (i.toInt() == 55) {
                if (Class374.aClass78_4538 != null) {
                    try {
                        Class374.aClass78_4538!!.method789(0L, (-120).toByte())
                        Class374.aClass78_4538!!.method784(-89, `is`)
                        var i_170_: Int
                        i_170_ = 0
                        while (i_170_ < 24) {
                            if (`is`[i_170_].toInt() != 0) break
                            i_170_++
                        }
                        if (i_170_ >= 24) throw IOException()
                    } catch (exception: Exception) {
                        var i_171_ = 0
                        while (i_171_ < 24) {
                            `is`[i_171_] = (-1).toByte()
                            i_171_++
                        }
                    }
                }
                class348_sub49.writeBytes(24, 0, `is`, i.toInt() xor 0x8)
            }
        }

        init {
            anIntArray8269 = IntArray(8)
        }
    }
}
