import Class33.Companion.method340
import kotlin.math.sqrt

/* Class348_Sub32 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub32 internal constructor(var_ha_Sub2: ha_Sub2?, var_s_Sub2: s_Sub2?, class348_sub1: Class348_Sub1?, `is`: IntArray?) : Class348() {
    private val aClass123_6927: Class123?
    private var aFloatArrayArray6928: Array<FloatArray?>?
    private val aS_Sub2_6929: s_Sub2?
    private var aClass356_6932: Class356? = null
    private var anInt6934 = 0
    private val anInt6935: Int
    private var aClass348_Sub49_6936: Class348_Sub49? = null
    private val aClass348_Sub1_6937: Class348_Sub1?
    private var anInt6940 = 0
    private var anInt6942 = 0
    private val aClass123_6943: Class123?
    private val anInt6944: Int
    private val anInterface8_6945: Interface8?
    private var aFloatArrayArray6947: Array<FloatArray?>?
    private val anInt6948: Int
    private var aFloatArrayArray6949: Array<FloatArray?>?
    private val aHa_Sub2_6951: ha_Sub2?
    private val anInterface2_6952: Interface2?
    private var aClass348_Sub49_Sub1_6953: Class348_Sub49_Sub1? = null

    private fun method3019(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Byte, i_5_: Int) {
        anInt6933++
        var l = -1L
        val i_6_ = i_3_ - -(i_2_ shl aS_Sub2_6929!!.anInt4588)
        val i_7_ = i + (i_5_ shl aS_Sub2_6929.anInt4588)
        val i_8_ = aS_Sub2_6929.method3986(i_6_, i_7_, (-17).toByte())
        if ((i_3_ and 0x7f) == 0 || (i and 0x7f) == 0) {
            l = (i_7_.toLong() shl 16 and (65535L shl 16) or (0xffffL and i_6_.toLong()))
            val class348 = aClass356_6932!!.method3480(l, -6008)
            if (class348 != null) {
                method3022((-46).toByte(), ((class348 as Class348_Sub29).aShort6911))
                return
            }
        }
        val i_9_ = (anInt6940++).toShort()
        if (l != -1L) aClass356_6932!!.method3483(107.toByte(), l, Class348_Sub29(i_9_))
        val f: Float
        val f_10_: Float
        val f_11_: Float
        if (i_3_ != 0 || i != 0) {
            if (aS_Sub2_6929.anInt4592 == i_3_ && i == 0) {
                f_10_ = aFloatArrayArray6928!![1 + i_0_]!![i_1_]
                f_11_ = aFloatArrayArray6947!![1 + i_0_]!![i_1_]
                f = aFloatArrayArray6949!![1 + i_0_]!![i_1_]
            } else if (i_3_ != aS_Sub2_6929.anInt4592 || aS_Sub2_6929.anInt4592 != i) {
                if (i_3_ != 0 || aS_Sub2_6929.anInt4592 != i) {
                    val f_12_ = i_3_.toFloat() / aS_Sub2_6929.anInt4592.toFloat()
                    val f_13_ = i.toFloat() / aS_Sub2_6929.anInt4592.toFloat()
                    var f_14_ = aFloatArrayArray6949!![i_0_]!![i_1_]
                    var f_15_ = aFloatArrayArray6947!![i_0_]!![i_1_]
                    var f_16_ = aFloatArrayArray6928!![i_0_]!![i_1_]
                    var f_17_ = aFloatArrayArray6949!![1 + i_0_]!![i_1_]
                    var f_18_ = aFloatArrayArray6947!![i_0_ + 1]!![i_1_]
                    f_18_ += (aFloatArrayArray6947!![1 + i_0_]!![1 + i_1_] - f_18_) * f_12_
                    f_17_ += f_12_ * (aFloatArrayArray6949!![1 + i_0_]!![i_1_ - -1] - f_17_)
                    f_16_ += ((aFloatArrayArray6928!![i_0_]!![i_1_ - -1] - f_16_) * f_12_)
                    var f_19_ = aFloatArrayArray6928!![i_0_ + 1]!![i_1_]
                    f_15_ += f_12_ * (aFloatArrayArray6947!![i_0_]!![1 + i_1_] - f_15_)
                    f_14_ += f_12_ * (-f_14_ + aFloatArrayArray6949!![i_0_]!![i_1_ + 1])
                    f = f_14_ + (f_17_ - f_14_) * f_13_
                    f_11_ = f_15_ + f_13_ * (-f_15_ + f_18_)
                    f_19_ += f_12_ * (-f_19_ + (aFloatArrayArray6928!![i_0_ - -1]!![i_1_ + 1]))
                    f_10_ = f_16_ + f_13_ * (f_19_ - f_16_)
                } else {
                    f = aFloatArrayArray6949!![i_0_]!![1 + i_1_]
                    f_10_ = aFloatArrayArray6928!![i_0_]!![i_1_ - -1]
                    f_11_ = aFloatArrayArray6947!![i_0_]!![1 + i_1_]
                }
            } else {
                f = aFloatArrayArray6949!![1 + i_0_]!![1 + i_1_]
                f_10_ = aFloatArrayArray6928!![1 + i_0_]!![1 + i_1_]
                f_11_ = aFloatArrayArray6947!![i_0_ + 1]!![1 + i_1_]
            }
        } else {
            f = aFloatArrayArray6949!![i_0_]!![i_1_]
            f_10_ = aFloatArrayArray6928!![i_0_]!![i_1_]
            f_11_ = aFloatArrayArray6947!![i_0_]!![i_1_]
        }
        var f_20_ = (aClass348_Sub1_6937!!.method2724(-1) + -i_6_).toFloat()
        var f_21_ = (aClass348_Sub1_6937.method2722(120) + -i_8_).toFloat()
        var f_22_ = (aClass348_Sub1_6937.method2717(107.toByte()) + -i_7_).toFloat()
        val f_23_ = sqrt((f_21_ * f_21_ + f_20_ * f_20_ + f_22_ * f_22_).toDouble()).toFloat()
        val f_24_ = 1.0f / f_23_
        f_22_ *= f_24_
        f_20_ *= f_24_
        f_21_ *= f_24_
        val f_25_ = f_23_ / aClass348_Sub1_6937.method2723(-1).toFloat()
        var f_26_ = -(f_25_ * f_25_) + 1.0f
        if (f_26_ < 0.0f) f_26_ = 0.0f
        var f_27_ = f_22_ * f_10_ + (f_21_ * f_11_ + f * f_20_)
        if (f_27_ < 0.0f) f_27_ = 0.0f
        var f_28_ = 2.0f * (f_26_ * f_27_)
        if (f_28_ > 1.0f) f_28_ = 1.0f
        val i_29_ = -108 % ((42 - i_4_) / 50)
        val i_30_ = aClass348_Sub1_6937.method2720(-1)
        var i_31_ = (((i_30_ and 0xff081b) shr 16).toFloat() * f_28_).toInt()
        if (i_31_ > 255) i_31_ = 255
        var i_32_ = ((0xff and (i_30_ shr 8)).toFloat() * f_28_).toInt()
        if (i_32_ > 255) i_32_ = 255
        var i_33_ = (f_28_ * (0xff and i_30_).toFloat()).toInt()
        if (aHa_Sub2_6951!!.aBoolean7775) {
            aClass348_Sub49_Sub1_6953!!.method3400(i_6_.toFloat(), (-122).toByte())
            aClass348_Sub49_Sub1_6953!!.method3400(i_8_.toFloat(), (-115).toByte())
            aClass348_Sub49_Sub1_6953!!.method3400(i_7_.toFloat(), (-94).toByte())
        } else {
            aClass348_Sub49_Sub1_6953!!.method3399(18291, i_6_.toFloat())
            aClass348_Sub49_Sub1_6953!!.method3399(18291, i_8_.toFloat())
            aClass348_Sub49_Sub1_6953!!.method3399(18291, i_7_.toFloat())
        }
        if (i_33_ > 255) i_33_ = 255
        aClass348_Sub49_Sub1_6953!!.writeByte(false, i_31_)
        aClass348_Sub49_Sub1_6953!!.writeByte(false, i_32_)
        aClass348_Sub49_Sub1_6953!!.writeByte(false, i_33_)
        aClass348_Sub49_Sub1_6953!!.writeByte(false, 255)
        method3022((-46).toByte(), i_9_)
    }

    private fun method3022(i: Byte, i_34_: Short) {
        anInt6939++
        if (i.toInt() == -46) {
            if (!aHa_Sub2_6951!!.aBoolean7775) aClass348_Sub49_6936!!.method3397(i + 135, i_34_.toInt())
            else aClass348_Sub49_6936!!.writeShort(107.toByte(), i_34_.toInt())
        }
    }

    fun method3023(bools: Array<BooleanArray?>, i: Int, i_35_: Int, i_36_: Int, i_37_: Int) {
        anInt6941++
        if (anInterface8_6945 != null && i_37_ + i_35_ >= anInt6935 && anInt6942 >= i_35_ + -i_37_ && i_36_ + i_37_ >= anInt6948 && i_36_ + -i_37_ <= anInt6944) {
            for (i_38_ in anInt6948..anInt6944) {
                var i_39_ = anInt6935
                while (anInt6942 >= i_39_) {
                    val i_40_ = i_39_ - i_35_
                    val i_41_ = -i_36_ + i_38_
                    if (i_40_ > -i_37_ && i_37_ > i_40_ && i_41_ > -i_37_ && i_37_ > i_41_ && bools[i_40_ + i_37_]!![i_37_ + i_41_]) {
                        aHa_Sub2_6951!!.method3808(((255.0f * aClass348_Sub1_6937!!.method2721(-66)).toInt() shl 24), i + -136)
                        aHa_Sub2_6951.method3794(aClass123_6927, aClass123_6943, i + -26666, null, null)
                        aHa_Sub2_6951.method3759(anInt6934, -128, 4, anInterface8_6945, 0)
                        return
                    }
                    i_39_++
                }
            }
            if (i != 255) anInt6942 = 3
        }
    }

    init {
        try {
            aS_Sub2_6929 = var_s_Sub2
            aHa_Sub2_6951 = var_ha_Sub2
            aClass348_Sub1_6937 = class348_sub1
            val i = (aClass348_Sub1_6937!!.method2723(-1) + -(var_s_Sub2!!.anInt4592 shr 1))
            anInt6935 = (aClass348_Sub1_6937.method2724(-1) + -i shr var_s_Sub2.anInt4588)
            anInt6942 = (aClass348_Sub1_6937.method2724(-1) - -i shr var_s_Sub2.anInt4588)
            anInt6948 = (-i + aClass348_Sub1_6937.method2717(85.toByte()) shr var_s_Sub2.anInt4588)
            anInt6944 = (aClass348_Sub1_6937.method2717(99.toByte()) + i shr var_s_Sub2.anInt4588)
            val i_42_ = anInt6942 + -anInt6935 - -1
            val i_43_ = 1 + -anInt6948 + anInt6944
            aFloatArrayArray6928 = Array<FloatArray?>(i_42_ - -1) { FloatArray(i_43_ + 1) }
            aFloatArrayArray6949 = Array<FloatArray?>(i_42_ + 1) { FloatArray(1 + i_43_) }
            aFloatArrayArray6947 = Array<FloatArray?>(i_42_ - -1) { FloatArray(1 + i_43_) }
            var i_44_ = 0
            while (i_43_ >= i_44_) {
                val i_45_ = i_44_ - -anInt6948
                if (i_45_ > 0 && i_45_ < -1 + aS_Sub2_6929.anInt4590) {
                    var i_46_ = 0
                    while (i_42_ >= i_46_) {
                        val i_47_ = i_46_ - -anInt6935
                        if (i_47_ > 0 && i_47_ < aS_Sub2_6929.anInt4587 + -1) {
                            val i_48_ = (var_s_Sub2.method3982((-86).toByte(), i_45_, i_47_ + 1) - var_s_Sub2.method3982((-86).toByte(), i_45_, i_47_ + -1))
                            val i_49_ = (var_s_Sub2.method3982((-86).toByte(), 1 + i_45_, i_47_) - var_s_Sub2.method3982((-86).toByte(), -1 + i_45_, i_47_))
                            val f = (1.0 / (sqrt((i_48_ * i_48_ + (65536 - -(i_49_ * i_49_))).toDouble()))).toFloat()
                            aFloatArrayArray6949!![i_46_]!![i_44_] = i_48_.toFloat() * f
                            aFloatArrayArray6947!![i_46_]!![i_44_] = -256.0f * f
                            aFloatArrayArray6928!![i_46_]!![i_44_] = f * i_49_.toFloat()
                        }
                        i_46_++
                    }
                }
                i_44_++
            }
            var i_50_ = 0
            for (i_51_ in anInt6948..anInt6944) {
                if (i_51_ >= 0 && i_51_ < var_s_Sub2.anInt4590) {
                    for (i_52_ in anInt6935..anInt6942) {
                        if (i_52_ >= 0 && (i_52_ < var_s_Sub2.anInt4587)) {
                            val i_53_ = `is`!![i_50_]
                            val is_54_ = (var_s_Sub2.anIntArrayArrayArray8253!![i_52_]!![i_51_])
                            if (is_54_ != null && i_53_ != 0) {
                                if (i_53_ == 1) {
                                    var i_55_ = 0
                                    while (i_55_ < is_54_.size) {
                                        if (is_54_[i_55_++] != -1 && is_54_[i_55_++] != -1 && (is_54_[i_55_++] != -1)) anInt6934 += 3
                                    }
                                } else anInt6934 += 3
                            }
                        }
                        i_50_++
                    }
                } else i_50_ += anInt6942 - anInt6935
            }
            if (anInt6934 > 0) {
                aClass348_Sub49_6936 = Class348_Sub49(anInt6934 * 2)
                aClass348_Sub49_Sub1_6953 = Class348_Sub49_Sub1(anInt6934 * 16)
                aClass356_6932 = Class356(method340(anInt6934, 108.toByte()))
                var i_56_ = 0
                i_50_ = 0
                var i_57_ = anInt6948
                while (anInt6944 >= i_57_) {
                    if (i_57_ >= 0 && var_s_Sub2.anInt4590 > i_57_) {
                        var i_58_ = 0
                        for (i_59_ in anInt6935..anInt6942) {
                            if (i_59_ >= 0 && (i_59_ < var_s_Sub2.anInt4587)) {
                                val i_60_ = `is`!![i_50_]
                                val is_61_ = (var_s_Sub2.anIntArrayArrayArray8253!![i_59_]!![i_57_])
                                if (is_61_ != null && i_60_ != 0) {
                                    if (i_60_ == 1) {
                                        val is_62_: IntArray = (var_s_Sub2.anIntArrayArrayArray8268!![i_59_]!![i_57_])!!
                                        val is_63_: IntArray = (var_s_Sub2.anIntArrayArrayArray8234!![i_59_]!![i_57_])!!
                                        var i_64_ = 0
                                        while (i_64_ < is_61_.size) {
                                            if ((is_61_[i_64_] == -1) || is_61_[1 + i_64_] == -1 || is_61_[2 + i_64_] == -1) i_64_ += 3
                                            else {
                                                method3019(is_63_[i_64_], i_58_, i_56_, i_59_, is_62_[i_64_], (-94).toByte(), i_57_)
                                                i_64_++
                                                method3019(is_63_[i_64_], i_58_, i_56_, i_59_, is_62_[i_64_], 97.toByte(), i_57_)
                                                i_64_++
                                                method3019(is_63_[i_64_], i_58_, i_56_, i_59_, is_62_[i_64_], 104.toByte(), i_57_)
                                                i_64_++
                                            }
                                        }
                                    } else if (i_60_ == 3) {
                                        method3019(0, i_58_, i_56_, i_59_, 0, (-40).toByte(), i_57_)
                                        method3019(0, i_58_, i_56_, i_59_, (var_s_Sub2.anInt4592), 111.toByte(), i_57_)
                                        method3019((var_s_Sub2.anInt4592), i_58_, i_56_, i_59_, 0, (-29).toByte(), i_57_)
                                    } else if (i_60_ == 2) {
                                        method3019(0, i_58_, i_56_, i_59_, (var_s_Sub2.anInt4592), 119.toByte(), i_57_)
                                        method3019((var_s_Sub2.anInt4592), i_58_, i_56_, i_59_, (var_s_Sub2.anInt4592), (-90).toByte(), i_57_)
                                        method3019(0, i_58_, i_56_, i_59_, 0, (-119).toByte(), i_57_)
                                    } else if (i_60_ == 5) {
                                        method3019((var_s_Sub2.anInt4592), i_58_, i_56_, i_59_, (var_s_Sub2.anInt4592), 111.toByte(), i_57_)
                                        method3019((var_s_Sub2.anInt4592), i_58_, i_56_, i_59_, 0, (-83).toByte(), i_57_)
                                        method3019(0, i_58_, i_56_, i_59_, (var_s_Sub2.anInt4592), 125.toByte(), i_57_)
                                    } else if (i_60_ == 4) {
                                        method3019((var_s_Sub2.anInt4592), i_58_, i_56_, i_59_, 0, (-70).toByte(), i_57_)
                                        method3019(0, i_58_, i_56_, i_59_, 0, 96.toByte(), i_57_)
                                        method3019((var_s_Sub2.anInt4592), i_58_, i_56_, i_59_, (var_s_Sub2.anInt4592), 112.toByte(), i_57_)
                                    }
                                }
                            }
                            i_58_++
                            i_50_++
                        }
                    } else i_50_ += anInt6942 - anInt6935
                    i_56_++
                    i_57_++
                }
                anInterface8_6945 = (aHa_Sub2_6951!!.method3733(5123, -49, aClass348_Sub49_6936!!.anInt7197, aClass348_Sub49_6936!!.aByteArray7154, false))
                anInterface2_6952 = aHa_Sub2_6951.method3731(2, false, 16, (aClass348_Sub49_Sub1_6953!!.aByteArray7154), (aClass348_Sub49_Sub1_6953!!.anInt7197))
                aClass123_6927 = Class123(anInterface2_6952, 5126, 3, 0)
                aClass123_6943 = Class123(anInterface2_6952, 5121, 4, 12)
            } else {
                anInterface2_6952 = null
                anInterface8_6945 = null
                aClass123_6927 = null
                aClass123_6943 = null
            }
            aClass348_Sub49_Sub1_6953 = null
            aFloatArrayArray6928 = null
            aFloatArrayArray6947 = aFloatArrayArray6928
            aFloatArrayArray6949 = aFloatArrayArray6947
            aClass348_Sub49_6936 = null
            aClass356_6932 = null
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.Companion.method2929(runtimeexception, ("qw.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + (if (var_s_Sub2 != null) "{...}" else "null") + ',' + (if (class348_sub1 != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt6930: Int = 0
        var anInt6931: Int = 0
        var anInt6933: Int = 0
        @JvmField
        var anInt6938: Int = 0
        var anInt6939: Int = 0
        var anInt6941: Int = 0
        var aThread6946: Thread? = null
        var aClass45_6950: Class45? = null
        fun method3018(i: Int) {
            Class348_Sub18.Companion.anInt6818 = i
        }

        @JvmStatic
        fun method3020(i: Byte) {
            if (i.toInt() == -64) {
                aClass45_6950 = null
                aThread6946 = null
            }
        }

        fun method3021(i: Byte, class229: Class229?): Int {
            anInt6931++
            if (class229 != Class328_Sub3.aClass229_6519) {
                if (Class167.aClass229_2207 == class229) return 8448
                if (class229 == Class248.aClass229_3196) return 34165
                if (Class348_Sub23_Sub2.aClass229_9011 == class229) return 260
                if (class229 == Class348_Sub7.aClass229_6644) return 34023
            } else return 7681
            if (i.toInt() != 32) Companion.method3021((-21).toByte(), null)
            throw IllegalArgumentException()
        }
    }
}
