import Class299.Companion.method2253
import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glGetFloatv
import jaggl.OpenGL.Companion.glNormal3f
import kotlin.math.min

class Class233 internal constructor() {
    private val aClass348_Sub49_Sub1_3020: Class348_Sub49_Sub1
    private val aFloatArray3024 = FloatArray(16)
    private var aClass123_3025: Class123? = null
    private val anInt3026: Int
    private var anInterface2_3027: Interface2? = null
    private var aClass123_3028: Class123? = null
    private var aClass123_3029: Class123? = null
    private val aClass318_Sub9_Sub2ArrayArray3030: Array<Array<Class318_Sub9_Sub2?>?>
    private val aClass318_Sub9_Sub2ArrayArray3031: Array<Array<Class318_Sub9_Sub2?>?>
    private val anIntArray3032: IntArray
    private val anIntArray3033: IntArray
    private var anInt3034: Int
    private val anIntArray3035: IntArray

    private fun method1649(var_ha_Sub2: ha_Sub2, i: Int, i_0_: Int) {
        anInt3019++
        Class86.aFloat1478 = var_ha_Sub2.aFloat7768
        var_ha_Sub2.method3789((-119).toByte(), i.toFloat())
        var_ha_Sub2.method3760(i_0_ + -24483)
        glDisable(16384)
        glDisable(16385)
        var_ha_Sub2.method3748(0, false)
        glNormal3f(0.0f, -1.0f, 0.0f)
    }

    private fun method1650(var_ha_Sub2: ha_Sub2, i: Byte) {
        var_ha_Sub2.method3748(0, true)
        anInt3016++
        glEnable(16384)
        glEnable(16385)
        if (i.toInt() != -5) aFloatArray3015 = null
        if (Class86.aFloat1478 != var_ha_Sub2.aFloat7768) var_ha_Sub2.xa(Class86.aFloat1478)
    }

    fun method1651(var_ha_Sub2: ha_Sub2?, i: Byte, i_1_: Int, class98: Class98?) {
        try {
            anInt3017++
            if (var_ha_Sub2!!.aClass101_Sub3_7760 != null) {
                if (i_1_ >= 0) method1649(var_ha_Sub2, i_1_, 24484)
                else method1652(false, var_ha_Sub2)
                val f = (var_ha_Sub2.aClass101_Sub3_7760.aFloat5756)
                val f_2_ = (var_ha_Sub2.aClass101_Sub3_7760.aFloat5754)
                val f_3_ = (var_ha_Sub2.aClass101_Sub3_7760.aFloat5784)
                val f_4_ = (var_ha_Sub2.aClass101_Sub3_7760.aFloat5751)
                try {
                    var i_5_ = 0
                    var i_6_ = 2147483647
                    var i_7_ = 0
                    val class318_sub9 = (class98!!.aClass88_1569.aClass318_Sub9_1503)
                    var class318_sub9_8_ = (class318_sub9!!.aClass318_Sub9_6469)
                    while (class318_sub9_8_ !== class318_sub9) {
                        val class318_sub9_sub2 = class318_sub9_8_ as Class318_Sub9_Sub2
                        val i_9_ = (f_4_ + ((class318_sub9_sub2.anInt8796 shr 12).toFloat() * f_2_ + ((class318_sub9_sub2.anInt8791) shr 12).toFloat() * f + ((class318_sub9_sub2.anInt8789) shr 12).toFloat() * f_3_)).toInt()
                        if (i_7_ < i_9_) i_7_ = i_9_
                        if (i_6_ > i_9_) i_6_ = i_9_
                        anIntArray3032[i_5_++] = i_9_
                        class318_sub9_8_ = (class318_sub9_8_.aClass318_Sub9_6469)
                    }
                    var i_10_ = i_7_ - i_6_
                    val i_11_: Int
                    if (2 + i_10_ > 1600) {
                        i_11_ = 1 - -method2253(i_10_, -86) - anInt3026
                        i_10_ = (i_10_ shr i_11_) + 2
                    } else {
                        i_10_ += 2
                        i_11_ = 0
                    }
                    i_5_ = 0
                    var class318_sub9_12_ = class318_sub9.aClass318_Sub9_6469
                    var i_13_ = -2
                    if (i > -23) aClass107_3022 = null
                    var bool = true
                    var bool_14_ = true
                    while (class318_sub9 !== class318_sub9_12_) {
                        anInt3034 = 0
                        var i_15_ = 0
                        while (i_10_ > i_15_) {
                            anIntArray3033[i_15_] = 0
                            i_15_++
                        }
                        for (i_16_ in 0..63) anIntArray3035[i_16_] = 0
                        while ( /**/class318_sub9 !== class318_sub9_12_) {
                            val class318_sub9_sub2 = class318_sub9_12_ as Class318_Sub9_Sub2
                            if (bool_14_) {
                                bool = class318_sub9_sub2.aBoolean8794
                                i_13_ = class318_sub9_sub2.anInt8792
                                bool_14_ = false
                            }
                            if (i_5_ > 0 && ((class318_sub9_sub2.anInt8792) != i_13_ || (class318_sub9_sub2.aBoolean8794 == !bool))) {
                                bool_14_ = true
                                break
                            }
                            val i_17_ = anIntArray3032[i_5_++] + -i_6_ shr i_11_
                            if (i_17_ < 1600) {
                                if (anIntArray3033[i_17_] < 64) aClass318_Sub9_Sub2ArrayArray3031[i_17_]!![anIntArray3033[i_17_]++] = class318_sub9_sub2
                                else {
                                    if (anIntArray3033[i_17_] == 64) {
                                        if (anInt3034 == 64) {
                                            class318_sub9_12_ = (class318_sub9_12_.aClass318_Sub9_6469)
                                            continue
                                        }
                                        anIntArray3033[i_17_] += anInt3034++ + 1
                                    }
                                    aClass318_Sub9_Sub2ArrayArray3030[-1 + (-64 + anIntArray3033[i_17_])]!![anIntArray3035[(anIntArray3033[i_17_] - 64 + -1)]++] = class318_sub9_sub2
                                }
                            }
                            class318_sub9_12_ = (class318_sub9_12_.aClass318_Sub9_6469)
                        }
                        if (i_13_ < 0) var_ha_Sub2.method3757(-1, -124)
                        else var_ha_Sub2.method3757(i_13_, -100)
                        if (!bool || (Class86.aFloat1478 == var_ha_Sub2.aFloat7768)) {
                            if (var_ha_Sub2.aFloat7768 != 1.0f) var_ha_Sub2.xa(1.0f)
                        } else var_ha_Sub2.xa(Class86.aFloat1478)
                        method1655(var_ha_Sub2, i_10_, 785980556)
                    }
                } catch (exception: Exception) {
                    /* empty */
                }
                method1650(var_ha_Sub2, (-5).toByte())
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("sn.G(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_1_ + ',' + (if (class98 != null) "{...}" else "null") + ')'))
        }
    }

    private fun method1652(bool: Boolean, var_ha_Sub2: ha_Sub2) {
        Class86.aFloat1478 = var_ha_Sub2.aFloat7768
        anInt3021++
        var_ha_Sub2.method3784((-62).toByte())
        glDisable(16384)
        glDisable(16385)
        var_ha_Sub2.method3748(0, bool)
        glNormal3f(0.0f, -1.0f, 0.0f)
    }

    fun method1654(i: Int, var_ha_Sub2: ha_Sub2) {
        if (i == 643267468) {
            anInt3023++
            anInterface2_3027 = var_ha_Sub2.method3731(2, true, 24, null, 196584)
            aClass123_3025 = Class123(anInterface2_3027, 5126, 2, 0)
            aClass123_3029 = Class123(anInterface2_3027, 5126, 3, 8)
            aClass123_3028 = Class123(anInterface2_3027, 5121, 4, 20)
        }
    }

    private fun method1655(var_ha_Sub2: ha_Sub2, i: Int, i_18_: Int) {
        anInt3018++
        if (i_18_ == 785980556) {
            glGetFloatv(2982, aFloatArray3024, 0)
            val f = aFloatArray3024[0]
            val f_19_ = aFloatArray3024[4]
            val f_20_ = aFloatArray3024[8]
            val f_21_ = aFloatArray3024[1]
            val f_22_ = aFloatArray3024[5]
            val f_23_ = aFloatArray3024[9]
            val f_24_ = f_21_ + f
            val f_25_ = f_22_ + f_19_
            val f_26_ = f_23_ + f_20_
            val f_27_ = f - f_21_
            val f_28_ = -f_22_ + f_19_
            val f_29_ = -f_23_ + f_20_
            val f_30_ = -f + f_21_
            val f_31_ = -f_19_ + f_22_
            aClass348_Sub49_Sub1_3020.anInt7197 = 0
            val f_32_ = -f_20_ + f_23_
            if (var_ha_Sub2.aBoolean7775) {
                for (i_56_ in i - 1 downTo 0) {
                    val i_57_ = (min(anIntArray3033[i_56_], 64))
                    if (i_57_ > 0) {
                        for (i_58_ in -1 + i_57_ downTo 0) {
                            val class318_sub9_sub2 = (aClass318_Sub9_Sub2ArrayArray3031[i_56_]!![i_58_])!!
                            val i_59_ = (class318_sub9_sub2.anInt8790)
                            val i_60_ = (i_59_ shr 16).toByte()
                            val i_61_ = (i_59_ shr 8).toByte()
                            val i_62_ = i_59_.toByte()
                            val i_63_ = (i_59_ ushr 24).toByte()
                            val f_64_ = (class318_sub9_sub2.anInt8791 shr 12).toFloat()
                            val f_65_ = (class318_sub9_sub2.anInt8796 shr 12).toFloat()
                            val f_66_ = (class318_sub9_sub2.anInt8789 shr 12).toFloat()
                            val i_67_ = ((class318_sub9_sub2.anInt8793) shr 12)
                            aClass348_Sub49_Sub1_3020.method3400(0.0f, (-88).toByte())
                            aClass348_Sub49_Sub1_3020.method3400(0.0f, (-96).toByte())
                            aClass348_Sub49_Sub1_3020.method3400(-i_67_.toFloat() * f_24_ + f_64_, (-96).toByte())
                            aClass348_Sub49_Sub1_3020.method3400(f_65_ + f_25_ * -i_67_.toFloat(), (-84).toByte())
                            aClass348_Sub49_Sub1_3020.method3400(f_66_ + f_26_ * -i_67_.toFloat(), (-119).toByte())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_60_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_61_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_62_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_63_.toInt())
                            aClass348_Sub49_Sub1_3020.method3400(1.0f, (-114).toByte())
                            aClass348_Sub49_Sub1_3020.method3400(0.0f, (-116).toByte())
                            aClass348_Sub49_Sub1_3020.method3400(i_67_.toFloat() * f_27_ + f_64_, (-121).toByte())
                            aClass348_Sub49_Sub1_3020.method3400(i_67_.toFloat() * f_28_ + f_65_, (-95).toByte())
                            aClass348_Sub49_Sub1_3020.method3400(f_66_ + i_67_.toFloat() * f_29_, (-78).toByte())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_60_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_61_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_62_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_63_.toInt())
                            aClass348_Sub49_Sub1_3020.method3400(1.0f, (-128).toByte())
                            aClass348_Sub49_Sub1_3020.method3400(1.0f, (-91).toByte())
                            aClass348_Sub49_Sub1_3020.method3400(f_64_ + f_24_ * i_67_.toFloat(), (-101).toByte())
                            aClass348_Sub49_Sub1_3020.method3400(f_25_ * i_67_.toFloat() + f_65_, (-128).toByte())
                            aClass348_Sub49_Sub1_3020.method3400(f_66_ + i_67_.toFloat() * f_26_, (-123).toByte())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_60_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_61_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_62_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_63_.toInt())
                            aClass348_Sub49_Sub1_3020.method3400(0.0f, (-94).toByte())
                            aClass348_Sub49_Sub1_3020.method3400(1.0f, (-101).toByte())
                            aClass348_Sub49_Sub1_3020.method3400(f_30_ * i_67_.toFloat() + f_64_, (-84).toByte())
                            aClass348_Sub49_Sub1_3020.method3400(f_65_ + f_31_ * i_67_.toFloat(), (-87).toByte())
                            aClass348_Sub49_Sub1_3020.method3400(f_32_ * i_67_.toFloat() + f_66_, (-120).toByte())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_60_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_61_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_62_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_63_.toInt())
                        }
                        if (anIntArray3033[i_56_] > 64) {
                            val i_68_ = -64 + anIntArray3033[i_56_] - 1
                            for (i_69_ in anIntArray3035[i_68_] - 1 downTo 0) {
                                val class318_sub9_sub2 = (aClass318_Sub9_Sub2ArrayArray3030[i_68_]!![i_69_])!!
                                val i_70_ = (class318_sub9_sub2.anInt8790)
                                val i_71_ = (i_70_ shr 16).toByte()
                                val i_72_ = (i_70_ shr 8).toByte()
                                val i_73_ = i_70_.toByte()
                                val i_74_ = (i_70_ ushr 24).toByte()
                                val f_75_ = (class318_sub9_sub2.anInt8791 shr 12).toFloat()
                                val f_76_ = (class318_sub9_sub2.anInt8796 shr 12).toFloat()
                                val f_77_ = (class318_sub9_sub2.anInt8789 shr 12).toFloat()
                                val i_78_ = (class318_sub9_sub2.anInt8793 shr 12)
                                aClass348_Sub49_Sub1_3020.method3400(0.0f, (-77).toByte())
                                aClass348_Sub49_Sub1_3020.method3400(0.0f, (-103).toByte())
                                aClass348_Sub49_Sub1_3020.method3400(-i_78_.toFloat() * f_24_ + f_75_, (-79).toByte())
                                aClass348_Sub49_Sub1_3020.method3400(f_76_ + f_25_ * -i_78_.toFloat(), (-102).toByte())
                                aClass348_Sub49_Sub1_3020.method3400(f_77_ + f_26_ * -i_78_.toFloat(), (-79).toByte())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_71_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_72_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_73_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_74_.toInt())
                                aClass348_Sub49_Sub1_3020.method3400(1.0f, (-119).toByte())
                                aClass348_Sub49_Sub1_3020.method3400(0.0f, (-118).toByte())
                                aClass348_Sub49_Sub1_3020.method3400(i_78_.toFloat() * f_27_ + f_75_, (-126).toByte())
                                aClass348_Sub49_Sub1_3020.method3400(f_76_ + f_28_ * i_78_.toFloat(), (-103).toByte())
                                aClass348_Sub49_Sub1_3020.method3400(f_77_ + i_78_.toFloat() * f_29_, (-94).toByte())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_71_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_72_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_73_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_74_.toInt())
                                aClass348_Sub49_Sub1_3020.method3400(1.0f, (-128).toByte())
                                aClass348_Sub49_Sub1_3020.method3400(1.0f, (-127).toByte())
                                aClass348_Sub49_Sub1_3020.method3400(f_24_ * i_78_.toFloat() + f_75_, (-125).toByte())
                                aClass348_Sub49_Sub1_3020.method3400(f_25_ * i_78_.toFloat() + f_76_, (-98).toByte())
                                aClass348_Sub49_Sub1_3020.method3400(f_77_ + i_78_.toFloat() * f_26_, (-119).toByte())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_71_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_72_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_73_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_74_.toInt())
                                aClass348_Sub49_Sub1_3020.method3400(0.0f, (-116).toByte())
                                aClass348_Sub49_Sub1_3020.method3400(1.0f, (-116).toByte())
                                aClass348_Sub49_Sub1_3020.method3400(i_78_.toFloat() * f_30_ + f_75_, (-124).toByte())
                                aClass348_Sub49_Sub1_3020.method3400(i_78_.toFloat() * f_31_ + f_76_, (-83).toByte())
                                aClass348_Sub49_Sub1_3020.method3400(i_78_.toFloat() * f_32_ + f_77_, (-80).toByte())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_71_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_72_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_73_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_74_.toInt())
                            }
                        }
                    }
                }
            } else {
                for (i_33_ in -1 + i downTo 0) {
                    val i_34_ = (min(anIntArray3033[i_33_], 64))
                    if (i_34_ > 0) {
                        for (i_35_ in -1 + i_34_ downTo 0) {
                            val class318_sub9_sub2 = (aClass318_Sub9_Sub2ArrayArray3031[i_33_]!![i_35_])!!
                            val i_36_ = (class318_sub9_sub2.anInt8790)
                            val i_37_ = (i_36_ shr 16).toByte()
                            val i_38_ = (i_36_ shr 8).toByte()
                            val i_39_ = i_36_.toByte()
                            val i_40_ = (i_36_ ushr 24).toByte()
                            val f_41_ = (class318_sub9_sub2.anInt8791 shr 12).toFloat()
                            val f_42_ = (class318_sub9_sub2.anInt8796 shr 12).toFloat()
                            val f_43_ = (class318_sub9_sub2.anInt8789 shr 12).toFloat()
                            val i_44_ = ((class318_sub9_sub2.anInt8793) shr 12)
                            aClass348_Sub49_Sub1_3020.method3399(18291, 0.0f)
                            aClass348_Sub49_Sub1_3020.method3399(18291, 0.0f)
                            aClass348_Sub49_Sub1_3020.method3399(18291, -i_44_.toFloat() * f_24_ + f_41_)
                            aClass348_Sub49_Sub1_3020.method3399(18291, -i_44_.toFloat() * f_25_ + f_42_)
                            aClass348_Sub49_Sub1_3020.method3399(18291, f_26_ * -i_44_.toFloat() + f_43_)
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_37_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_38_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_39_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_40_.toInt())
                            aClass348_Sub49_Sub1_3020.method3399(18291, 1.0f)
                            aClass348_Sub49_Sub1_3020.method3399(18291, 0.0f)
                            aClass348_Sub49_Sub1_3020.method3399(18291, f_41_ + f_27_ * i_44_.toFloat())
                            aClass348_Sub49_Sub1_3020.method3399(18291, f_42_ + f_28_ * i_44_.toFloat())
                            aClass348_Sub49_Sub1_3020.method3399(18291, f_43_ + f_29_ * i_44_.toFloat())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_37_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_38_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_39_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_40_.toInt())
                            aClass348_Sub49_Sub1_3020.method3399(18291, 1.0f)
                            aClass348_Sub49_Sub1_3020.method3399(i_18_ + -785962265, 1.0f)
                            aClass348_Sub49_Sub1_3020.method3399(18291, i_44_.toFloat() * f_24_ + f_41_)
                            aClass348_Sub49_Sub1_3020.method3399(18291, f_42_ + i_44_.toFloat() * f_25_)
                            aClass348_Sub49_Sub1_3020.method3399(i_18_ xor 0x2ed95bff, f_43_ + f_26_ * i_44_.toFloat())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_37_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_38_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_39_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_40_.toInt())
                            aClass348_Sub49_Sub1_3020.method3399(18291, 0.0f)
                            aClass348_Sub49_Sub1_3020.method3399(i_18_ + -785962265, 1.0f)
                            aClass348_Sub49_Sub1_3020.method3399(18291, f_41_ + f_30_ * i_44_.toFloat())
                            aClass348_Sub49_Sub1_3020.method3399(18291, i_44_.toFloat() * f_31_ + f_42_)
                            aClass348_Sub49_Sub1_3020.method3399(i_18_ xor 0x2ed95bff, i_44_.toFloat() * f_32_ + f_43_)
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_37_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_38_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_39_.toInt())
                            aClass348_Sub49_Sub1_3020.writeByte(false, i_40_.toInt())
                        }
                        if (anIntArray3033[i_33_] > 64) {
                            val i_45_ = -65 + anIntArray3033[i_33_]
                            for (i_46_ in -1 + anIntArray3035[i_45_] downTo 0) {
                                val class318_sub9_sub2 = (aClass318_Sub9_Sub2ArrayArray3030[i_45_]!![i_46_])!!
                                val i_47_ = (class318_sub9_sub2.anInt8790)
                                val i_48_ = (i_47_ shr 16).toByte()
                                val i_49_ = (i_47_ shr 8).toByte()
                                val i_50_ = i_47_.toByte()
                                val i_51_ = (i_47_ ushr 24).toByte()
                                val f_52_ = (class318_sub9_sub2.anInt8791 shr 12).toFloat()
                                val f_53_ = (class318_sub9_sub2.anInt8796 shr 12).toFloat()
                                val f_54_ = (class318_sub9_sub2.anInt8789 shr 12).toFloat()
                                val i_55_ = (class318_sub9_sub2.anInt8793 shr 12)
                                aClass348_Sub49_Sub1_3020.method3399(i_18_ + -785962265, 0.0f)
                                aClass348_Sub49_Sub1_3020.method3399(18291, 0.0f)
                                aClass348_Sub49_Sub1_3020.method3399(i_18_ xor 0x2ed95bff, f_52_ + -i_55_.toFloat() * f_24_)
                                aClass348_Sub49_Sub1_3020.method3399(18291, f_53_ + f_25_ * -i_55_.toFloat())
                                aClass348_Sub49_Sub1_3020.method3399(18291, f_54_ + f_26_ * -i_55_.toFloat())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_48_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_49_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_50_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_51_.toInt())
                                aClass348_Sub49_Sub1_3020.method3399(18291, 1.0f)
                                aClass348_Sub49_Sub1_3020.method3399(18291, 0.0f)
                                aClass348_Sub49_Sub1_3020.method3399(i_18_ xor 0x2ed95bff, f_27_ * i_55_.toFloat() + f_52_)
                                aClass348_Sub49_Sub1_3020.method3399(18291, i_55_.toFloat() * f_28_ + f_53_)
                                aClass348_Sub49_Sub1_3020.method3399(18291, f_29_ * i_55_.toFloat() + f_54_)
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_48_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_49_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_50_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_51_.toInt())
                                aClass348_Sub49_Sub1_3020.method3399(18291, 1.0f)
                                aClass348_Sub49_Sub1_3020.method3399(i_18_ xor 0x2ed95bff, 1.0f)
                                aClass348_Sub49_Sub1_3020.method3399(i_18_ xor 0x2ed95bff, i_55_.toFloat() * f_24_ + f_52_)
                                aClass348_Sub49_Sub1_3020.method3399(18291, i_55_.toFloat() * f_25_ + f_53_)
                                aClass348_Sub49_Sub1_3020.method3399(18291, i_55_.toFloat() * f_26_ + f_54_)
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_48_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_49_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_50_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_51_.toInt())
                                aClass348_Sub49_Sub1_3020.method3399(i_18_ xor 0x2ed95bff, 0.0f)
                                aClass348_Sub49_Sub1_3020.method3399(18291, 1.0f)
                                aClass348_Sub49_Sub1_3020.method3399(i_18_ + -785962265, i_55_.toFloat() * f_30_ + f_52_)
                                aClass348_Sub49_Sub1_3020.method3399(18291, i_55_.toFloat() * f_31_ + f_53_)
                                aClass348_Sub49_Sub1_3020.method3399(18291, i_55_.toFloat() * f_32_ + f_54_)
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_48_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_49_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_50_.toInt())
                                aClass348_Sub49_Sub1_3020.writeByte(false, i_51_.toInt())
                            }
                        }
                    }
                }
            }
            if (aClass348_Sub49_Sub1_3020.anInt7197 != 0) {
                anInterface2_3027!!.method11(24, aClass348_Sub49_Sub1_3020.anInt7197, (aClass348_Sub49_Sub1_3020.aByteArray7154), -9894)
                var_ha_Sub2.method3794(aClass123_3029, aClass123_3028, i_18_ + -786006967, aClass123_3025, null)
                var_ha_Sub2.method3756((aClass348_Sub49_Sub1_3020.anInt7197 / 24), 7, 0, 120)
            }
        }
    }

    init {
        aClass348_Sub49_Sub1_3020 = Class348_Sub49_Sub1(786336)
        anInt3026 = method2253(1600, 124)
        anIntArray3032 = IntArray(8191)
        aClass318_Sub9_Sub2ArrayArray3031 = Array<Array<Class318_Sub9_Sub2?>?>(1600) { arrayOfNulls<Class318_Sub9_Sub2>(64) }
        anIntArray3033 = IntArray(1600)
        anInt3034 = 0
        aClass318_Sub9_Sub2ArrayArray3030 = Array<Array<Class318_Sub9_Sub2?>?>(64) { arrayOfNulls<Class318_Sub9_Sub2>(768) }
        anIntArray3035 = IntArray(64)
    }

    companion object {
        var aFloatArray3015: FloatArray? = FloatArray(16)
        var anInt3016: Int = 0
        var anInt3017: Int = 0
        var anInt3018: Int = 0
        var anInt3019: Int = 0
        var anInt3021: Int = 0
        @JvmField
        var aClass107_3022: Class107? = Class107()
        var anInt3023: Int = 0
        @JvmStatic
        fun method1653(i: Int) {
            aClass107_3022 = null
            aFloatArray3015 = null
            if (i != 1489574736) aClass107_3022 = null
        }
    }
}
