import Class33.Companion.method340
import jaclib.memory.Stream
import jaclib.memory.Stream.Companion.c
import kotlin.math.sqrt

class Class348_Sub38 internal constructor(var_ha_Sub3: ha_Sub3?, var_s_Sub3: s_Sub3?, class348_sub1: Class348_Sub1?, `is`: IntArray?) : Class348() {
    private var aFloatArrayArray7001: Array<FloatArray?>?
    private val anInterface5_Impl2_7002: Interface5_Impl2?
    private val aClass348_Sub1_7004: Class348_Sub1?
    private var aFloatArrayArray7005: Array<FloatArray?>?
    private val aHa_Sub3_7007: ha_Sub3?
    private val anInt7010: Int
    private var aClass356_7011: Class356? = null
    private var anInt7013 = 0
    private val anInt7014: Int
    private var aFloatArrayArray7016: Array<FloatArray?>?
    private val anInt7017: Int
    private var anInt7018 = 0
    private val aS_Sub3_7019: s_Sub3?
    private val anInterface5_Impl1_7020: Interface5_Impl1?
    private var aStream7021: Stream? = null
    private var aStream7022: Stream? = null
    private val anInt7023: Int

    fun method3032(i: Int, i_0_: Int, bools: Array<BooleanArray?>, bool: Boolean, i_1_: Int) {
        anInt7012++
        if (anInterface5_Impl2_7002 != null) {
            if (anInt7023 <= i_0_ + i_1_ && -i_0_ + i_1_ <= anInt7017 && anInt7014 <= i - -i_0_ && -i_0_ + i <= anInt7010) {
                var i_2_ = anInt7014
                while (anInt7010 >= i_2_) {
                    var i_3_ = anInt7023
                    while (anInt7017 >= i_3_) {
                        val i_4_ = -i_1_ + i_3_
                        val i_5_ = -i + i_2_
                        if (-i_0_ < i_4_ && i_4_ < i_0_ && i_5_ > -i_0_ && i_0_ > i_5_ && bools[i_4_ - -i_0_]!![i_0_ + i_5_]) {
                            aHa_Sub3_7007!!.method3909((255.0f * aClass348_Sub1_7004!!.method2721(-37)).toInt().toByte(), -112)
                            aHa_Sub3_7007.method3925(-123, anInterface5_Impl1_7020, 0)
                            aHa_Sub3_7007.method3862(0, (aHa_Sub3_7007.aClass130_8202))
                            aHa_Sub3_7007.method3938(Class247.aClass21_3181, anInt7018 / 3, anInterface5_Impl2_7002, 0, 0, anInt7013, 116)
                            return
                        }
                        i_3_++
                    }
                    i_2_++
                }
            }
        }
    }

    private fun method3033(i: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int) {
        anInt7003++
        var l = -1L
        val i_12_ = i_10_ + (i_6_ shl aS_Sub3_7019!!.anInt4588)
        val i_13_ = i_8_ - -(i_9_ shl aS_Sub3_7019.anInt4588)
        val i_14_ = aS_Sub3_7019.method3986(i_12_, i_13_, (-127).toByte())
        if ((i_10_ and 0x7f) == 0 || (i_8_ and 0x7f) == 0) {
            l = (i_13_.toLong() and 0xffffL) shl 16 or (i_12_.toLong() and 0xffffL)
            val class348 = aClass356_7011!!.method3480(l, i_7_ + 23335)
            if (class348 != null) {
                method3034(((class348 as Class348_Sub29).aShort6911), 49.toByte())
                return
            }
        }
        val i_15_ = (anInt7013++).toShort()
        if (l != -1L) aClass356_7011!!.method3483(101.toByte(), l, Class348_Sub29(i_15_))
        val f: Float
        val f_16_: Float
        val f_17_: Float
        if (i_10_ == 0 && i_8_ == 0) {
            f_16_ = aFloatArrayArray7016!![i_11_]!![i]
            f_17_ = aFloatArrayArray7005!![i_11_]!![i]
            f = aFloatArrayArray7001!![i_11_]!![i]
        } else if (aS_Sub3_7019.anInt4592 != i_10_ || i_8_ != 0) {
            if (aS_Sub3_7019.anInt4592 != i_10_ || (i_8_ != aS_Sub3_7019.anInt4592)) {
                if (i_10_ == 0 && i_8_ == aS_Sub3_7019.anInt4592) {
                    f = aFloatArrayArray7001!![i_11_]!![i + 1]
                    f_16_ = aFloatArrayArray7016!![i_11_]!![1 + i]
                    f_17_ = aFloatArrayArray7005!![i_11_]!![i - -1]
                } else {
                    val f_18_ = i_10_.toFloat() / aS_Sub3_7019.anInt4592.toFloat()
                    val f_19_ = i_8_.toFloat() / aS_Sub3_7019.anInt4592.toFloat()
                    var f_20_ = aFloatArrayArray7005!![i_11_]!![i]
                    var f_21_ = aFloatArrayArray7016!![i_11_]!![i]
                    var f_22_ = aFloatArrayArray7001!![i_11_]!![i]
                    var f_23_ = aFloatArrayArray7005!![1 + i_11_]!![i]
                    var f_24_ = aFloatArrayArray7016!![i_11_ - -1]!![i]
                    f_22_ += f_18_ * (aFloatArrayArray7001!![i_11_]!![i - -1] - f_22_)
                    f_21_ += ((aFloatArrayArray7016!![i_11_]!![1 + i] - f_21_) * f_18_)
                    f_24_ += f_18_ * (-f_24_ + aFloatArrayArray7016!![i_11_ - -1]!![1 + i])
                    var f_25_ = aFloatArrayArray7001!![i_11_ + 1]!![i]
                    f_20_ += ((aFloatArrayArray7005!![i_11_]!![1 + i] - f_20_) * f_18_)
                    f_23_ += f_18_ * (aFloatArrayArray7005!![i_11_ - -1]!![i - -1] - f_23_)
                    f_17_ = f_20_ + (f_23_ - f_20_) * f_19_
                    f_16_ = (f_24_ - f_21_) * f_19_ + f_21_
                    f_25_ += f_18_ * (aFloatArrayArray7001!![1 + i_11_]!![i - -1] - f_25_)
                    f = f_22_ + (-f_22_ + f_25_) * f_19_
                }
            } else {
                f_17_ = aFloatArrayArray7005!![1 + i_11_]!![i + 1]
                f = aFloatArrayArray7001!![i_11_ - -1]!![1 + i]
                f_16_ = aFloatArrayArray7016!![i_11_ + 1]!![1 + i]
            }
        } else {
            f_16_ = aFloatArrayArray7016!![i_11_ + 1]!![i]
            f = aFloatArrayArray7001!![1 + i_11_]!![i]
            f_17_ = aFloatArrayArray7005!![i_11_ + 1]!![i]
        }
        var f_26_ = (-i_12_ + aClass348_Sub1_7004!!.method2724(-1)).toFloat()
        var f_27_ = (aClass348_Sub1_7004.method2722(126) - i_14_).toFloat()
        var f_28_ = (-i_13_ + aClass348_Sub1_7004.method2717(102.toByte())).toFloat()
        val f_29_ = sqrt((f_28_ * f_28_ + (f_26_ * f_26_ + f_27_ * f_27_)).toDouble()).toFloat()
        val f_30_ = 1.0f / f_29_
        f_26_ *= f_30_
        f_27_ *= f_30_
        f_28_ *= f_30_
        val f_31_ = f_29_ / aClass348_Sub1_7004.method2723(-1).toFloat()
        if (i_7_ == -29343) {
            var f_32_ = -(f_31_ * f_31_) + 1.0f
            if (f_32_ < 0.0f) f_32_ = 0.0f
            var f_33_ = f_28_ * f + (f_26_ * f_17_ + f_16_ * f_27_)
            if (f_33_ < 0.0f) f_33_ = 0.0f
            var f_34_ = f_32_ * f_33_ * 2.0f
            if (f_34_ > 1.0f) f_34_ = 1.0f
            val i_35_ = aClass348_Sub1_7004.method2720(-1)
            var i_36_ = (f_34_ * (0xff and (i_35_ shr 16)).toFloat()).toInt()
            if (i_36_ > 255) i_36_ = 255
            var i_37_ = (f_34_ * ((0xff76 and i_35_) shr 8).toFloat()).toInt()
            if (i_37_ > 255) i_37_ = 255
            var i_38_ = ((i_35_ and 0xff).toFloat() * f_34_).toInt()
            if (i_38_ > 255) i_38_ = 255
            if (c()) {
                aStream7022!!.a(i_12_.toFloat())
                aStream7022!!.a(i_14_.toFloat())
                aStream7022!!.a(i_13_.toFloat())
            } else {
                aStream7022!!.b(i_12_.toFloat())
                aStream7022!!.b(i_14_.toFloat())
                aStream7022!!.b(i_13_.toFloat())
            }
            if (aHa_Sub3_7007!!.anInt8178 == 0) {
                aStream7022!!.f(i_38_)
                aStream7022!!.f(i_37_)
                aStream7022!!.f(i_36_)
            } else {
                aStream7022!!.f(i_36_)
                aStream7022!!.f(i_37_)
                aStream7022!!.f(i_38_)
            }
            aStream7022!!.f(255)
            method3034(i_15_, 49.toByte())
        }
    }

    private fun method3034(i: Short, i_39_: Byte) {
        if (c()) aStream7021!!.d(i.toInt())
        else aStream7021!!.a(i.toInt())
        if (i_39_.toInt() == 49) anInt7000++
    }

    init {
        try {
            aHa_Sub3_7007 = var_ha_Sub3
            aS_Sub3_7019 = var_s_Sub3
            aClass348_Sub1_7004 = class348_sub1
            val i = (aClass348_Sub1_7004!!.method2723(-1) + -(var_s_Sub3!!.anInt4592 shr 1))
            anInt7023 = (-i + aClass348_Sub1_7004.method2724(-1) shr var_s_Sub3.anInt4588)
            anInt7017 = (aClass348_Sub1_7004.method2724(-1) + i shr var_s_Sub3.anInt4588)
            anInt7014 = (-i + aClass348_Sub1_7004.method2717(124.toByte()) shr var_s_Sub3.anInt4588)
            anInt7010 = (aClass348_Sub1_7004.method2717(72.toByte()) + i shr var_s_Sub3.anInt4588)
            val i_40_ = anInt7017 - anInt7023 - -1
            val i_41_ = 1 + -anInt7014 + anInt7010
            aFloatArrayArray7005 = Array<FloatArray?>(1 + i_40_) { FloatArray(i_41_ - -1) }
            aFloatArrayArray7016 = Array<FloatArray?>(i_40_ + 1) { FloatArray(i_41_ + 1) }
            aFloatArrayArray7001 = Array<FloatArray?>(1 + i_40_) { FloatArray(i_41_ - -1) }
            for (i_42_ in 0..i_41_) {
                val i_43_ = anInt7014 + i_42_
                if (i_43_ > 0 && (-1 + aS_Sub3_7019.anInt4590 > i_43_)) {
                    for (i_44_ in 0..i_40_) {
                        val i_45_ = anInt7023 + i_44_
                        if (i_45_ > 0 && i_45_ < aS_Sub3_7019.anInt4587 + -1) {
                            val i_46_ = (var_s_Sub3.method3982((-86).toByte(), i_43_, i_45_ + 1) - var_s_Sub3.method3982((-86).toByte(), i_43_, i_45_ + -1))
                            val i_47_ = (var_s_Sub3.method3982((-86).toByte(), 1 + i_43_, i_45_) + -var_s_Sub3.method3982((-86).toByte(), i_43_ + -1, i_45_))
                            val f = (1.0 / (sqrt((i_47_ * i_47_ + (i_46_ * i_46_ - -65536)).toDouble()))).toFloat()
                            aFloatArrayArray7005!![i_44_]!![i_42_] = i_46_.toFloat() * f
                            aFloatArrayArray7016!![i_44_]!![i_42_] = -256.0f * f
                            aFloatArrayArray7001!![i_44_]!![i_42_] = i_47_.toFloat() * f
                        }
                    }
                }
            }
            var i_48_ = 0
            var i_49_ = anInt7014
            while (anInt7010 >= i_49_) {
                if (i_49_ >= 0 && var_s_Sub3.anInt4590 > i_49_) {
                    var i_50_ = anInt7023
                    while (anInt7017 >= i_50_) {
                        if (i_50_ >= 0 && var_s_Sub3.anInt4587 > i_50_) {
                            val i_51_ = `is`!![i_48_]
                            val is_52_ = (var_s_Sub3.anIntArrayArrayArray8296!![i_50_]!![i_49_])
                            if (is_52_ != null && i_51_ != 0) {
                                if (i_51_ == 1) {
                                    var i_53_ = 0
                                    while (is_52_.size > i_53_) {
                                        if (is_52_[i_53_++] != -1 && (is_52_[i_53_++] != -1) && is_52_[i_53_++] != -1) anInt7018 += 3
                                    }
                                } else anInt7018 += 3
                            }
                        }
                        i_48_++
                        i_50_++
                    }
                } else i_48_ += -anInt7023 + anInt7017
                i_49_++
            }
            if (anInt7018 > 0) {
                aClass356_7011 = Class356(method340(anInt7018, 108.toByte()))
                anInterface5_Impl2_7002 = aHa_Sub3_7007!!.method3840(-28633, false)
                anInterface5_Impl2_7002!!.method23(15959, anInt7018)
                val nativeheapbuffer = aHa_Sub3_7007.method3869(86.toByte(), false, 16 * anInt7018)
                aStream7022 = Stream(nativeheapbuffer)
                while (true) {
                    val buffer = anInterface5_Impl2_7002.method24(true, false)
                    if (buffer != null) {
                        aStream7021 = Stream(buffer)
                        i_48_ = 0
                        var i_54_ = 0
                        var i_55_ = anInt7014
                        while (anInt7010 >= i_55_) {
                            if (i_55_ >= 0 && (i_55_ < var_s_Sub3.anInt4590)) {
                                var i_56_ = 0
                                var i_57_ = anInt7023
                                while (anInt7017 >= i_57_) {
                                    if (i_57_ >= 0 && (i_57_ < var_s_Sub3.anInt4587)) {
                                        val i_58_ = `is`!![i_48_]
                                        val is_59_ = (var_s_Sub3.anIntArrayArrayArray8296!![i_57_]!![i_55_])
                                        if (is_59_ != null && i_58_ != 0) {
                                            if (i_58_ == 1) {
                                                val is_60_: IntArray = (var_s_Sub3.anIntArrayArrayArray8321!![i_57_]!![i_55_])!!
                                                val is_61_: IntArray = (var_s_Sub3.anIntArrayArrayArray8313!![i_57_]!![i_55_])!!
                                                var i_62_ = 0
                                                while (is_59_.size > i_62_) {
                                                    if (is_59_[i_62_] == -1 || is_59_[1 + i_62_] == -1 || is_59_[i_62_ + 2] == -1) i_62_ += 3
                                                    else {
                                                        method3033(i_54_, i_57_, -29343, (is_61_[i_62_]), i_55_, (is_60_[i_62_]), i_56_)
                                                        i_62_++
                                                        method3033(i_54_, i_57_, -29343, (is_61_[i_62_]), i_55_, (is_60_[i_62_]), i_56_)
                                                        i_62_++
                                                        method3033(i_54_, i_57_, -29343, (is_61_[i_62_]), i_55_, (is_60_[i_62_]), i_56_)
                                                        i_62_++
                                                    }
                                                }
                                            } else if (i_58_ == 3) {
                                                method3033(i_54_, i_57_, -29343, 0, i_55_, 0, i_56_)
                                                method3033(i_54_, i_57_, -29343, 0, i_55_, (var_s_Sub3.anInt4592), i_56_)
                                                method3033(i_54_, i_57_, -29343, (var_s_Sub3.anInt4592), i_55_, 0, i_56_)
                                            } else if (i_58_ == 2) {
                                                method3033(i_54_, i_57_, -29343, 0, i_55_, (var_s_Sub3.anInt4592), i_56_)
                                                method3033(i_54_, i_57_, -29343, (var_s_Sub3.anInt4592), i_55_, (var_s_Sub3.anInt4592), i_56_)
                                                method3033(i_54_, i_57_, -29343, 0, i_55_, 0, i_56_)
                                            } else if (i_58_ == 5) {
                                                method3033(i_54_, i_57_, -29343, (var_s_Sub3.anInt4592), i_55_, (var_s_Sub3.anInt4592), i_56_)
                                                method3033(i_54_, i_57_, -29343, (var_s_Sub3.anInt4592), i_55_, 0, i_56_)
                                                method3033(i_54_, i_57_, -29343, 0, i_55_, (var_s_Sub3.anInt4592), i_56_)
                                            } else if (i_58_ == 4) {
                                                method3033(i_54_, i_57_, -29343, (var_s_Sub3.anInt4592), i_55_, 0, i_56_)
                                                method3033(i_54_, i_57_, -29343, 0, i_55_, 0, i_56_)
                                                method3033(i_54_, i_57_, -29343, (var_s_Sub3.anInt4592), i_55_, (var_s_Sub3.anInt4592), i_56_)
                                            }
                                        }
                                    }
                                    i_48_++
                                    i_56_++
                                    i_57_++
                                }
                            } else i_48_ += anInt7017 + -anInt7023
                            i_54_++
                            i_55_++
                        }
                        aStream7021!!.a()
                        if (anInterface5_Impl2_7002.method22(-23)) break
                        aStream7022!!.e(0)
                        aClass356_7011!!.method3481(0)
                    }
                }
                aStream7022!!.a()
                anInterface5_Impl1_7020 = aHa_Sub3_7007.method3889(false, 16711680)
                anInterface5_Impl1_7020.method17(nativeheapbuffer, 16, 16 * anInt7013, (-108).toByte())
            } else {
                anInterface5_Impl1_7020 = null
                anInterface5_Impl2_7002 = null
            }
            aFloatArrayArray7001 = null
            aFloatArrayArray7016 = aFloatArrayArray7001
            aFloatArrayArray7005 = aFloatArrayArray7016
            aStream7022 = null
            aStream7021 = null
            aClass356_7011 = null
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.Companion.method2929(runtimeexception, ("sea.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + (if (var_s_Sub3 != null) "{...}" else "null") + ',' + (if (class348_sub1 != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt7000: Int = 0
        var anInt7003: Int = 0
        @JvmField
        var anInt7006: Int = 0
        @JvmField
        var anInt7008: Int = 0
        var anInt7009: Int = 0
        var anInt7012: Int = 0
        var aClass114_7015: Class114? = Class114(33, 3)
        @JvmStatic
        fun method3035(i: Int) {
            aClass114_7015 = null
            if (i != 1) method3035(-34)
        }
    }
}
