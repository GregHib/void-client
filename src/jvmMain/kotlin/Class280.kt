import Class299.Companion.method2253
import jaclib.memory.Stream.Companion.c
import kotlin.math.min

class Class280 internal constructor(var_ha_Sub3: ha_Sub3) {
    private var anInt3626 = 0
    private val anIntArray3627 = IntArray(64)
    private val anInterface5_Impl1_3630: Interface5_Impl1
    private var anIntArray3631: IntArray?
    private val aClass318_Sub9_Sub2ArrayArray3632: Array<Array<Class318_Sub9_Sub2?>?>
    private val anInterface5_Impl2_3635: Interface5_Impl2?
    private val anIntArray3636: IntArray
    private val aClass130_3637: Class130
    private val anInterface5_Impl1_3638: Interface5_Impl1
    private var aClass318_Sub9_Sub2ArrayArray3642: Array<Array<Class318_Sub9_Sub2?>?>?
    private fun method2098(var_ha_Sub3: ha_Sub3, i: Int, i_0_: Int) {
        anInt3629++
        Class59_Sub1.aFloat5299 = var_ha_Sub3.aFloat8093
        val i_1_ = 75 % ((2 - i) / 34)
        var_ha_Sub3.method3867(i_0_.toFloat(), -86)
        var_ha_Sub3.method3857(92.toByte())
        var_ha_Sub3.method3865(false, 36)
        var_ha_Sub3.method3946(-32, false)
        var_ha_Sub3.method3942(5)
    }

    private fun method2099(i: Int, var_ha_Sub3: ha_Sub3) {
        anInt3628++
        var_ha_Sub3.method3946(i + -26358, true)
        var_ha_Sub3.method3865(true, 54)
        if (i != 26326) anIntArray3631 = null
        if (Class59_Sub1.aFloat5299 != var_ha_Sub3.aFloat8093) var_ha_Sub3.xa(Class59_Sub1.aFloat5299)
    }

    fun method2100(i: Byte, var_ha_Sub3: ha_Sub3?) {
        anInterface5_Impl1_3638.method20(786336, 123.toByte(), 24)
        val i_2_ = -125 / ((i - 65) / 49)
        anInt3625++
    }

    fun method2101(var_ha_Sub3: ha_Sub3?, class98: Class98?, i: Int, i_3_: Int) {
        try {
            anInt3633++
            if (var_ha_Sub3!!.aClass101_Sub2_8080 != null) {
                if (i >= 0) method2098(var_ha_Sub3, -121, i)
                else method2103((-33).toByte(), var_ha_Sub3)
                val f = (var_ha_Sub3.aClass101_Sub2_8080.aFloat5736)
                val f_4_ = (var_ha_Sub3.aClass101_Sub2_8080.aFloat5691)
                val f_5_ = (var_ha_Sub3.aClass101_Sub2_8080.aFloat5716)
                val f_6_ = (var_ha_Sub3.aClass101_Sub2_8080.aFloat5724)
                try {
                    var i_7_ = 0
                    var i_8_ = 2147483647
                    var i_9_ = i_3_
                    val class318_sub9 = (class98!!.aClass88_1569.aClass318_Sub9_1503)
                    var class318_sub9_10_ = (class318_sub9!!.aClass318_Sub9_6469)
                    while (class318_sub9 !== class318_sub9_10_) {
                        val class318_sub9_sub2 = class318_sub9_10_ as Class318_Sub9_Sub2
                        val i_11_ = ((class318_sub9_sub2.anInt8791 shr 12).toFloat() * f + f_4_ * ((class318_sub9_sub2.anInt8796) shr 12).toFloat() + (class318_sub9_sub2.anInt8789 shr 12).toFloat() * f_5_ + f_6_).toInt()
                        if (i_9_ < i_11_) i_9_ = i_11_
                        anIntArray3631!![i_7_++] = i_11_
                        if (i_8_ > i_11_) i_8_ = i_11_
                        class318_sub9_10_ = (class318_sub9_10_.aClass318_Sub9_6469)
                    }
                    var i_12_ = -i_8_ + i_9_
                    val i_13_: Int
                    if (2 + i_12_ > 1600) {
                        i_13_ = (method2253(i_12_, i_3_ + 119) + 1 + -Class169.anInt2265)
                        i_12_ = 2 + (i_12_ shr i_13_)
                    } else {
                        i_13_ = 0
                        i_12_ += 2
                    }
                    var class318_sub9_14_ = class318_sub9.aClass318_Sub9_6469
                    i_7_ = 0
                    var i_15_ = -2
                    var bool = true
                    var bool_16_ = true
                    while (class318_sub9_14_ !== class318_sub9) {
                        anInt3626 = 0
                        var i_17_ = 0
                        while (i_12_ > i_17_) {
                            anIntArray3636[i_17_] = 0
                            i_17_++
                        }
                        for (i_18_ in 0..63) anIntArray3627[i_18_] = 0
                        while ( /**/class318_sub9_14_ !== class318_sub9) {
                            val class318_sub9_sub2 = class318_sub9_14_ as Class318_Sub9_Sub2
                            if (bool_16_) {
                                bool = class318_sub9_sub2.aBoolean8794
                                i_15_ = class318_sub9_sub2.anInt8792
                                bool_16_ = false
                            }
                            if (i_7_ > 0 && (i_15_ != class318_sub9_sub2.anInt8792 || !bool != !(class318_sub9_sub2.aBoolean8794))) {
                                bool_16_ = true
                                break
                            }
                            val i_19_ = -i_8_ + anIntArray3631!![i_7_++] shr i_13_
                            if (i_19_ < 1600) {
                                if (anIntArray3636[i_19_] < 64) aClass318_Sub9_Sub2ArrayArray3632[i_19_]!![anIntArray3636[i_19_]++] = class318_sub9_sub2
                                else {
                                    if (anIntArray3636[i_19_] == 64) {
                                        if (anInt3626 == 64) {
                                            class318_sub9_14_ = (class318_sub9_14_.aClass318_Sub9_6469)
                                            continue
                                        }
                                        anIntArray3636[i_19_] += anInt3626++ + 1
                                    }
                                    aClass318_Sub9_Sub2ArrayArray3642!![-65 + anIntArray3636[i_19_]]!![anIntArray3627[(anIntArray3636[i_19_] + -65)]++] = class318_sub9_sub2
                                }
                            }
                            class318_sub9_14_ = (class318_sub9_14_.aClass318_Sub9_6469)
                        }
                        var_ha_Sub3.method3814(false, false, if (i_15_ >= 0) i_15_ else -1, 117.toByte())
                        if (bool && (Class59_Sub1.aFloat5299 != var_ha_Sub3.aFloat8093)) var_ha_Sub3.xa(Class59_Sub1.aFloat5299)
                        else if (var_ha_Sub3.aFloat8093 != 1.0f) var_ha_Sub3.xa(1.0f)
                        method2102(false, var_ha_Sub3, i_12_)
                    }
                } catch (exception: Exception) {
                    /* empty */
                }
                method2099(i_3_ xor 0x66d6, var_ha_Sub3)
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("ve.G(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + (if (class98 != null) "{...}" else "null") + ',' + i + ',' + i_3_ + ')'))
        }
    }

    private fun method2102(bool: Boolean, var_ha_Sub3: ha_Sub3, i: Int) {
        anInt3640++
        var i_20_ = 0
        val class101_sub2 = var_ha_Sub3.method3948(-22036)
        val f = class101_sub2.aFloat5711
        val f_21_ = class101_sub2.aFloat5700
        val f_22_ = class101_sub2.aFloat5704
        val f_23_ = class101_sub2.aFloat5708
        val f_24_ = class101_sub2.aFloat5722
        val f_25_ = class101_sub2.aFloat5732
        val f_26_ = f_23_ + f
        val f_27_ = f_21_ + f_24_
        val f_28_ = f_22_ + f_25_
        val f_29_ = f - f_23_
        val f_30_ = f_21_ - f_24_
        val f_31_ = -f_25_ + f_22_
        val f_32_ = f_23_ - f
        val f_33_ = -f_21_ + f_24_
        val f_34_ = -f_22_ + f_25_
        val buffer = anInterface5_Impl1_3638.method19(true, 26775)
        if (buffer != null) {
            val stream = var_ha_Sub3.method3893(buffer, 9179)
            if (c()) {
                for (i_58_ in i + -1 downTo 0) {
                    val i_59_ = (min(anIntArray3636[i_58_], 64))
                    if (i_59_ > 0) {
                        for (i_60_ in i_59_ + -1 downTo 0) {
                            val class318_sub9_sub2 = (aClass318_Sub9_Sub2ArrayArray3632[i_58_]!![i_60_])!!
                            val i_61_ = (class318_sub9_sub2.anInt8790)
                            val i_62_ = (i_61_ shr 16).toByte()
                            val i_63_ = (i_61_ shr 8).toByte()
                            val i_64_ = i_61_.toByte()
                            val i_65_ = (i_61_ ushr 24).toByte()
                            val f_66_ = (class318_sub9_sub2.anInt8791 shr 12).toFloat()
                            val f_67_ = (class318_sub9_sub2.anInt8796 shr 12).toFloat()
                            val f_68_ = (class318_sub9_sub2.anInt8789 shr 12).toFloat()
                            val i_69_ = ((class318_sub9_sub2.anInt8793) shr 12)
                            stream.a(f_26_ * -i_69_.toFloat() + f_66_)
                            stream.a(f_67_ + f_27_ * -i_69_.toFloat())
                            stream.a(f_68_ + -i_69_.toFloat() * f_28_)
                            if (var_ha_Sub3.anInt8178 != 0) stream.a(i_62_.toInt(), i_63_.toInt(), i_64_.toInt(), i_65_.toInt())
                            else stream.b(i_62_.toInt(), i_63_.toInt(), i_64_.toInt(), i_65_.toInt())
                            stream.a(0.0f)
                            stream.a(0.0f)
                            stream.a(f_29_ * i_69_.toFloat() + f_66_)
                            stream.a(i_69_.toFloat() * f_30_ + f_67_)
                            stream.a(f_68_ + f_31_ * i_69_.toFloat())
                            if (var_ha_Sub3.anInt8178 != 0) stream.a(i_62_.toInt(), i_63_.toInt(), i_64_.toInt(), i_65_.toInt())
                            else stream.b(i_62_.toInt(), i_63_.toInt(), i_64_.toInt(), i_65_.toInt())
                            stream.a(1.0f)
                            stream.a(0.0f)
                            stream.a(f_66_ + f_26_ * i_69_.toFloat())
                            stream.a(f_67_ + f_27_ * i_69_.toFloat())
                            stream.a(f_28_ * i_69_.toFloat() + f_68_)
                            if (var_ha_Sub3.anInt8178 != 0) stream.a(i_62_.toInt(), i_63_.toInt(), i_64_.toInt(), i_65_.toInt())
                            else stream.b(i_62_.toInt(), i_63_.toInt(), i_64_.toInt(), i_65_.toInt())
                            stream.a(1.0f)
                            stream.a(1.0f)
                            stream.a(f_66_ + f_32_ * i_69_.toFloat())
                            stream.a(f_67_ + f_33_ * i_69_.toFloat())
                            stream.a(f_68_ + f_34_ * i_69_.toFloat())
                            if (var_ha_Sub3.anInt8178 != 0) stream.a(i_62_.toInt(), i_63_.toInt(), i_64_.toInt(), i_65_.toInt())
                            else stream.b(i_62_.toInt(), i_63_.toInt(), i_64_.toInt(), i_65_.toInt())
                            stream.a(0.0f)
                            i_20_++
                            stream.a(1.0f)
                        }
                        if (anIntArray3636[i_58_] > 64) {
                            val i_70_ = anIntArray3636[i_58_] - 65
                            for (i_71_ in -1 + anIntArray3627[i_70_] downTo 0) {
                                val class318_sub9_sub2 = (aClass318_Sub9_Sub2ArrayArray3642!![i_70_]!![i_71_])!!
                                val i_72_ = (class318_sub9_sub2.anInt8790)
                                val i_73_ = (i_72_ shr 16).toByte()
                                val i_74_ = (i_72_ shr 8).toByte()
                                val i_75_ = i_72_.toByte()
                                val i_76_ = (i_72_ ushr 24).toByte()
                                val f_77_ = (class318_sub9_sub2.anInt8791 shr 12).toFloat()
                                val f_78_ = (class318_sub9_sub2.anInt8796 shr 12).toFloat()
                                val f_79_ = (class318_sub9_sub2.anInt8789 shr 12).toFloat()
                                val i_80_ = (class318_sub9_sub2.anInt8793 shr 12)
                                stream.a(f_26_ * -i_80_.toFloat() + f_77_)
                                stream.a(-i_80_.toFloat() * f_27_ + f_78_)
                                stream.a(f_79_ + f_28_ * -i_80_.toFloat())
                                if (var_ha_Sub3.anInt8178 == 0) stream.b(i_73_.toInt(), i_74_.toInt(), i_75_.toInt(), i_76_.toInt())
                                else stream.a(i_73_.toInt(), i_74_.toInt(), i_75_.toInt(), i_76_.toInt())
                                stream.a(0.0f)
                                stream.a(0.0f)
                                stream.a(f_29_ * i_80_.toFloat() + f_77_)
                                stream.a(i_80_.toFloat() * f_30_ + f_78_)
                                stream.a(i_80_.toFloat() * f_31_ + f_79_)
                                if (var_ha_Sub3.anInt8178 == 0) stream.b(i_73_.toInt(), i_74_.toInt(), i_75_.toInt(), i_76_.toInt())
                                else stream.a(i_73_.toInt(), i_74_.toInt(), i_75_.toInt(), i_76_.toInt())
                                stream.a(1.0f)
                                stream.a(0.0f)
                                stream.a(f_77_ + i_80_.toFloat() * f_26_)
                                stream.a(i_80_.toFloat() * f_27_ + f_78_)
                                stream.a(i_80_.toFloat() * f_28_ + f_79_)
                                if (var_ha_Sub3.anInt8178 != 0) stream.a(i_73_.toInt(), i_74_.toInt(), i_75_.toInt(), i_76_.toInt())
                                else stream.b(i_73_.toInt(), i_74_.toInt(), i_75_.toInt(), i_76_.toInt())
                                stream.a(1.0f)
                                stream.a(1.0f)
                                stream.a(i_80_.toFloat() * f_32_ + f_77_)
                                stream.a(i_80_.toFloat() * f_33_ + f_78_)
                                stream.a(f_79_ + i_80_.toFloat() * f_34_)
                                if (var_ha_Sub3.anInt8178 != 0) stream.a(i_73_.toInt(), i_74_.toInt(), i_75_.toInt(), i_76_.toInt())
                                else stream.b(i_73_.toInt(), i_74_.toInt(), i_75_.toInt(), i_76_.toInt())
                                stream.a(0.0f)
                                i_20_++
                                stream.a(1.0f)
                            }
                        }
                    }
                }
            } else {
                for (i_35_ in -1 + i downTo 0) {
                    val i_36_ = (min(anIntArray3636[i_35_], 64))
                    if (i_36_ > 0) {
                        for (i_37_ in i_36_ + -1 downTo 0) {
                            val class318_sub9_sub2 = (aClass318_Sub9_Sub2ArrayArray3632[i_35_]!![i_37_])!!
                            val i_38_ = (class318_sub9_sub2.anInt8790)
                            val i_39_ = (i_38_ shr 16).toByte()
                            val i_40_ = (i_38_ shr 8).toByte()
                            val i_41_ = i_38_.toByte()
                            val i_42_ = (i_38_ ushr 24).toByte()
                            val f_43_ = (class318_sub9_sub2.anInt8791 shr 12).toFloat()
                            val f_44_ = (class318_sub9_sub2.anInt8796 shr 12).toFloat()
                            val f_45_ = (class318_sub9_sub2.anInt8789 shr 12).toFloat()
                            val i_46_ = ((class318_sub9_sub2.anInt8793) shr 12)
                            stream.b(-i_46_.toFloat() * f_26_ + f_43_)
                            stream.b(f_44_ + -i_46_.toFloat() * f_27_)
                            stream.b(-i_46_.toFloat() * f_28_ + f_45_)
                            if (var_ha_Sub3.anInt8178 == 0) stream.b(i_39_.toInt(), i_40_.toInt(), i_41_.toInt(), i_42_.toInt())
                            else stream.a(i_39_.toInt(), i_40_.toInt(), i_41_.toInt(), i_42_.toInt())
                            stream.b(0.0f)
                            stream.b(0.0f)
                            stream.b(f_43_ + i_46_.toFloat() * f_29_)
                            stream.b(f_44_ + i_46_.toFloat() * f_30_)
                            stream.b(f_45_ + i_46_.toFloat() * f_31_)
                            if (var_ha_Sub3.anInt8178 != 0) stream.a(i_39_.toInt(), i_40_.toInt(), i_41_.toInt(), i_42_.toInt())
                            else stream.b(i_39_.toInt(), i_40_.toInt(), i_41_.toInt(), i_42_.toInt())
                            stream.b(1.0f)
                            stream.b(0.0f)
                            stream.b(f_43_ + f_26_ * i_46_.toFloat())
                            stream.b(f_27_ * i_46_.toFloat() + f_44_)
                            stream.b(f_28_ * i_46_.toFloat() + f_45_)
                            if (var_ha_Sub3.anInt8178 == 0) stream.b(i_39_.toInt(), i_40_.toInt(), i_41_.toInt(), i_42_.toInt())
                            else stream.a(i_39_.toInt(), i_40_.toInt(), i_41_.toInt(), i_42_.toInt())
                            stream.b(1.0f)
                            stream.b(1.0f)
                            stream.b(f_32_ * i_46_.toFloat() + f_43_)
                            stream.b(i_46_.toFloat() * f_33_ + f_44_)
                            stream.b(f_45_ + f_34_ * i_46_.toFloat())
                            if (var_ha_Sub3.anInt8178 == 0) stream.b(i_39_.toInt(), i_40_.toInt(), i_41_.toInt(), i_42_.toInt())
                            else stream.a(i_39_.toInt(), i_40_.toInt(), i_41_.toInt(), i_42_.toInt())
                            stream.b(0.0f)
                            i_20_++
                            stream.b(1.0f)
                        }
                        if (anIntArray3636[i_35_] > 64) {
                            val i_47_ = -64 + anIntArray3636[i_35_] + -1
                            for (i_48_ in anIntArray3627[i_47_] + -1 downTo 0) {
                                val class318_sub9_sub2 = (aClass318_Sub9_Sub2ArrayArray3642!![i_47_]!![i_48_])!!
                                val i_49_ = (class318_sub9_sub2.anInt8790)
                                val i_50_ = (i_49_ shr 16).toByte()
                                val i_51_ = (i_49_ shr 8).toByte()
                                val i_52_ = i_49_.toByte()
                                val i_53_ = (i_49_ ushr 24).toByte()
                                val f_54_ = (class318_sub9_sub2.anInt8791 shr 12).toFloat()
                                val f_55_ = (class318_sub9_sub2.anInt8796 shr 12).toFloat()
                                val f_56_ = (class318_sub9_sub2.anInt8789 shr 12).toFloat()
                                val i_57_ = (class318_sub9_sub2.anInt8793 shr 12)
                                stream.b(f_54_ + -i_57_.toFloat() * f_26_)
                                stream.b(-i_57_.toFloat() * f_27_ + f_55_)
                                stream.b(f_56_ + f_28_ * -i_57_.toFloat())
                                if (var_ha_Sub3.anInt8178 == 0) stream.b(i_50_.toInt(), i_51_.toInt(), i_52_.toInt(), i_53_.toInt())
                                else stream.a(i_50_.toInt(), i_51_.toInt(), i_52_.toInt(), i_53_.toInt())
                                stream.b(0.0f)
                                stream.b(0.0f)
                                stream.b(f_54_ + i_57_.toFloat() * f_29_)
                                stream.b(f_30_ * i_57_.toFloat() + f_55_)
                                stream.b(f_31_ * i_57_.toFloat() + f_56_)
                                if (var_ha_Sub3.anInt8178 != 0) stream.a(i_50_.toInt(), i_51_.toInt(), i_52_.toInt(), i_53_.toInt())
                                else stream.b(i_50_.toInt(), i_51_.toInt(), i_52_.toInt(), i_53_.toInt())
                                stream.b(1.0f)
                                stream.b(0.0f)
                                stream.b(f_54_ + i_57_.toFloat() * f_26_)
                                stream.b(i_57_.toFloat() * f_27_ + f_55_)
                                stream.b(f_28_ * i_57_.toFloat() + f_56_)
                                if (var_ha_Sub3.anInt8178 == 0) stream.b(i_50_.toInt(), i_51_.toInt(), i_52_.toInt(), i_53_.toInt())
                                else stream.a(i_50_.toInt(), i_51_.toInt(), i_52_.toInt(), i_53_.toInt())
                                stream.b(1.0f)
                                stream.b(1.0f)
                                stream.b(f_54_ + f_32_ * i_57_.toFloat())
                                stream.b(f_55_ + i_57_.toFloat() * f_33_)
                                stream.b(i_57_.toFloat() * f_34_ + f_56_)
                                if (var_ha_Sub3.anInt8178 != 0) stream.a(i_50_.toInt(), i_51_.toInt(), i_52_.toInt(), i_53_.toInt())
                                else stream.b(i_50_.toInt(), i_51_.toInt(), i_52_.toInt(), i_53_.toInt())
                                stream.b(0.0f)
                                stream.b(1.0f)
                                i_20_++
                            }
                        }
                    }
                }
            }
            stream.a()
            if (anInterface5_Impl1_3638.method18(6331)) {
                var_ha_Sub3.method3925(66, anInterface5_Impl1_3638, 0)
                var_ha_Sub3.method3925(68, anInterface5_Impl1_3630, 1)
                var_ha_Sub3.method3862(0, aClass130_3637)
                var_ha_Sub3.method3938(Class247.aClass21_3181, 2 * i_20_, anInterface5_Impl2_3635, 0, 0, i_20_ * 4, 118)
            }
        }
    }

    private fun method2103(i: Byte, var_ha_Sub3: ha_Sub3) {
        if (i.toInt() != -33) aClass318_Sub9_Sub2ArrayArray3642 = null
        anInt3639++
        Class59_Sub1.aFloat5299 = var_ha_Sub3.aFloat8093
        var_ha_Sub3.method3825(8)
        var_ha_Sub3.method3865(false, i + 89)
        var_ha_Sub3.method3946(-32, false)
        var_ha_Sub3.method3942(5)
    }

    fun method2105(i: Int) {
        if (i > -118) aClass114_3641 = null
        anInt3634++
        anInterface5_Impl1_3638.method21(23315)
    }

    init {
        aClass318_Sub9_Sub2ArrayArray3632 = Array<Array<Class318_Sub9_Sub2?>?>(1600) { arrayOfNulls<Class318_Sub9_Sub2>(64) }
        anIntArray3631 = IntArray(8191)
        aClass318_Sub9_Sub2ArrayArray3642 = Array<Array<Class318_Sub9_Sub2?>?>(64) { arrayOfNulls<Class318_Sub9_Sub2>(768) }
        anIntArray3636 = IntArray(1600)
        aClass130_3637 = (var_ha_Sub3.method3812(0, (arrayOf<Class58>(Class58(arrayOf<Class325?>(Class325.aClass325_4073, Class325.aClass325_4076, Class325.aClass325_4078)), Class58(Class325.aClass325_4075!!)))))
        anInterface5_Impl1_3638 = var_ha_Sub3.method3889(true, 16711680)
        anInterface5_Impl1_3630 = var_ha_Sub3.method3889(false, 16711680)
        anInterface5_Impl1_3630.method20(393168, 124.toByte(), 12)
        anInterface5_Impl2_3635 = var_ha_Sub3.method3840(-28633, false)
        anInterface5_Impl2_3635!!.method23(15959, 49146)
        val buffer = anInterface5_Impl2_3635.method24(true, false)
        if (buffer != null) {
            val stream = var_ha_Sub3.method3893(buffer, 9179)
            if (c()) {
                for (i in 0..8190) {
                    val i_82_ = i * 4
                    stream.d(i_82_)
                    stream.d(i_82_ + 1)
                    stream.d(i_82_ + 2)
                    stream.d(2 + i_82_)
                    stream.d(3 + i_82_)
                    stream.d(i_82_)
                }
            } else {
                for (i in 0..8190) {
                    val i_81_ = 4 * i
                    stream.a(i_81_)
                    stream.a(1 + i_81_)
                    stream.a(2 + i_81_)
                    stream.a(2 + i_81_)
                    stream.a(3 + i_81_)
                    stream.a(i_81_)
                }
            }
            stream.a()
            anInterface5_Impl2_3635.method22(-23)
        }
        val buffer_83_ = anInterface5_Impl1_3630.method19(true, 26775)
        if (buffer_83_ != null) {
            val stream = var_ha_Sub3.method3893(buffer_83_, 9179)
            if (c()) {
                for (i in 0..8190) {
                    stream.a(0.0f)
                    stream.a(-1.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(-1.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(-1.0f)
                    stream.a(0.0f)
                    stream.a(0.0f)
                    stream.a(-1.0f)
                    stream.a(0.0f)
                }
            } else {
                for (i in 0..8190) {
                    stream.b(0.0f)
                    stream.b(-1.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(-1.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(-1.0f)
                    stream.b(0.0f)
                    stream.b(0.0f)
                    stream.b(-1.0f)
                    stream.b(0.0f)
                }
            }
            stream.a()
            anInterface5_Impl1_3630.method18(6331)
        }
    }

    companion object {
        var anInt3625: Int = 0
        var anInt3628: Int = 0
        var anInt3629: Int = 0
        var anInt3633: Int = 0
        var anInt3634: Int = 0
        var anInt3639: Int = 0
        var anInt3640: Int = 0
        var aClass114_3641: Class114? = Class114(79, 3)
        @JvmField
        var anInt3643: Int = 0

        @JvmStatic
        fun method2104(i: Int) {
            aClass114_3641 = null
            if (i < 66) method2104(127)
        }
    }
}
