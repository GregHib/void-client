import Class348_Sub16_Sub2.Companion.method2834

/* Class105_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class105_Sub1 : Class105 {
    private val aBoolean8391: Boolean
    private val aBoolean8396: Boolean
    private var anInt8397 = 0
    private var anInt8400: Int
    private val anInterface18_Impl3_8403: Interface18_Impl3?
    private val aHa_Sub3_8407: ha_Sub3?
    private val aBoolean8408: Boolean
    private val aBoolean8410: Boolean
    private val anInt8411: Int
    private var anInt8416 = 0
    private val anInt8417: Int
    private var aBoolean8418: Boolean
    private var anInt8419 = 0
    override fun method980(): Int {
        anInt8402++
        return anInt8417 + (anInt8419 + anInt8397)
    }

    override fun method985(i: Int, i_0_: Int, i_1_: Int, i_2_: Int) {
        anInt8413++
        anInt8419 = i_0_
        anInt8397 = i_2_
        anInt8400 = i
        anInt8416 = i_1_
        aBoolean8418 = (anInt8400 != 0 || anInt8419 != 0 || anInt8416 != 0 || anInt8397 != 0)
    }

    private fun method986(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, `is`: IntArray, i_6_: Int, i_7_: Int) {
        anInt8394++
        anInterface18_Impl3_8403!!.method68(i_7_, 22809, `is`, i, i_6_, i_4_, i_3_, i_5_)
    }

    override fun method966(): Int {
        anInt8399++
        return anInt8416 + anInt8400 + anInt8411
    }

    override fun method969(): Int {
        anInt8404++
        return anInt8417
    }

    override fun method962(f: Float, f_12_: Float, f_13_: Float, f_14_: Float, f_15_: Float, f_16_: Float, i: Int, i_17_: Int, i_18_: Int, i_19_: Int) {
        var f = f
        var f_12_ = f_12_
        var f_13_ = f_13_
        var f_14_ = f_14_
        var f_15_ = f_15_
        var f_16_ = f_16_
        anInt8393++
        val class101_sub2 = aHa_Sub3_8407!!.method3934(-114)
        val class101_sub2_20_ = aHa_Sub3_8407.method3820(false)
        anInterface18_Impl3_8403!!.method64((if (aBoolean8410 || aBoolean8408 || ((0x1 and i_19_) == 0)) Class206.aClass209_4874 else Class71.aClass209_1212), -22095)
        aHa_Sub3_8407.method3864(-5)
        aHa_Sub3_8407.method3850(78.toByte(), anInterface18_Impl3_8403)
        aHa_Sub3_8407.method3817(81, i_18_)
        aHa_Sub3_8407.method3923(true, i)
        aHa_Sub3_8407.method3849(47.toByte(), 1, Class348_Sub40_Sub39.aClass70_9485)
        aHa_Sub3_8407.method3885(1, true, Class348_Sub40_Sub39.aClass70_9485)
        aHa_Sub3_8407.method3894(-28186, i_17_)
        if (aBoolean8418) {
            val f_21_ = method966().toFloat()
            val f_22_ = method980().toFloat()
            val f_23_ = (-f + f_13_) / f_21_
            val f_24_ = (-f_12_ + f_14_) / f_21_
            val f_25_ = (f_15_ - f) / f_22_
            val f_26_ = (f_16_ - f_12_) / f_22_
            val f_27_ = anInt8419.toFloat() * f_25_
            val f_28_ = anInt8419.toFloat() * f_26_
            val f_29_ = f_23_ * anInt8400.toFloat()
            val f_30_ = f_24_ * anInt8400.toFloat()
            val f_31_ = -f_23_ * anInt8416.toFloat()
            val f_32_ = -f_24_ * anInt8416.toFloat()
            val f_33_ = -f_25_ * anInt8397.toFloat()
            val f_34_ = anInt8397.toFloat() * -f_26_
            f = f_27_ + (f + f_29_)
            f_15_ = f_29_ + f_15_ + f_33_
            f_14_ = f_14_ + f_32_ + f_28_
            f_13_ = f_27_ + (f_13_ + f_31_)
            f_12_ = f_28_ + (f_12_ + f_30_)
            f_16_ = f_16_ + f_30_ + f_34_
        }
        class101_sub2.method935(1.0f, f_14_ - f_12_, -f + f_15_, 0.0f, 0.0f, -f_12_ + f_16_, 0.0f, 0.0f, f_13_ - f, 0)
        class101_sub2.method920(f_12_, false, 0.0f, f)
        class101_sub2_20_.method932(1.0f, anInterface18_Impl3_8403.method71(((-47).toByte()).toByte(), anInt8417.toFloat()), anInterface18_Impl3_8403.method67(anInt8411.toFloat(), 123), ((-66).toByte()).toByte())
        aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030)
        aHa_Sub3_8407.method3915(0)
        aHa_Sub3_8407.method3933(-44)
        aHa_Sub3_8407.method3879(-8629)
        aHa_Sub3_8407.method3849(47.toByte(), 1, Class318_Sub1_Sub2.aClass70_8737)
        aHa_Sub3_8407.method3885(1, true, Class318_Sub1_Sub2.aClass70_8737)
    }

    override fun method965(i: Int, i_35_: Int, i_36_: Int, i_37_: Int, i_38_: Int, i_39_: Int, i_40_: Int) {
        anInt8423++
        val class101_sub2 = aHa_Sub3_8407!!.method3934(-80)
        val class101_sub2_41_ = aHa_Sub3_8407.method3820(false)
        anInterface18_Impl3_8403!!.method64(Class206.aClass209_4874, -22095)
        aHa_Sub3_8407.method3864(-20)
        aHa_Sub3_8407.method3850(((-46).toByte()).toByte(), anInterface18_Impl3_8403)
        aHa_Sub3_8407.method3817(98, i_40_)
        aHa_Sub3_8407.method3923(true, i_38_)
        aHa_Sub3_8407.method3849(47.toByte(), 1, Class348_Sub40_Sub39.aClass70_9485)
        aHa_Sub3_8407.method3885(1, true, Class348_Sub40_Sub39.aClass70_9485)
        aHa_Sub3_8407.method3894(-28186, i_39_)
        val bool = aBoolean8391 && anInt8419 == 0 && anInt8397 == 0
        val bool_42_ = (aBoolean8396 && anInt8400 == 0 && anInt8416 == 0)
        if (bool_42_ and bool) {
            class101_sub2_41_.method932(1.0f, anInterface18_Impl3_8403.method71(((-26).toByte()).toByte(), i_37_.toFloat()), anInterface18_Impl3_8403.method67(i_36_.toFloat(), 118), ((-75).toByte()).toByte())
            class101_sub2.method932(0.0f, i_37_.toFloat(), i_36_.toFloat(), ((-83).toByte()).toByte())
            class101_sub2.method891(i, i_35_, 0)
            aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030)
            aHa_Sub3_8407.method3915(0)
            aHa_Sub3_8407.method3933(-63)
        } else if (bool_42_) {
            val i_43_ = i_37_ + i_35_
            val i_44_ = method980()
            class101_sub2_41_.method932(1.0f, anInterface18_Impl3_8403.method71(((-99).toByte()).toByte(), anInt8417.toFloat()), anInterface18_Impl3_8403.method67(i_36_.toFloat(), 110), ((-120).toByte()).toByte())
            aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030)
            var i_45_ = anInt8419 + i_35_
            var i_46_ = i_45_ - -anInt8417
            while (i_46_ <= i_43_) {
                class101_sub2.method932(0.0f, anInt8417.toFloat(), i_36_.toFloat(), ((-32).toByte()).toByte())
                class101_sub2.method891(i, i_45_, 0)
                aHa_Sub3_8407.method3915(0)
                i_46_ += i_44_
                i_45_ += i_44_
                aHa_Sub3_8407.method3933(-57)
            }
            if (i_43_ > i_45_) {
                val i_47_ = i_43_ - i_45_
                class101_sub2_41_.method932(1.0f, anInterface18_Impl3_8403.method71(((-81).toByte()).toByte(), i_47_.toFloat()), anInterface18_Impl3_8403.method67(i_36_.toFloat(), 127), ((-16).toByte()).toByte())
                aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030)
                class101_sub2.method932(0.0f, i_47_.toFloat(), i_36_.toFloat(), ((-101).toByte()).toByte())
                class101_sub2.method891(i, i_45_, 0)
                aHa_Sub3_8407.method3915(0)
                aHa_Sub3_8407.method3933(-91)
            }
        } else if (bool) {
            val i_61_ = i - -i_36_
            val i_62_ = method966()
            class101_sub2_41_.method932(1.0f, anInterface18_Impl3_8403.method71(((-121).toByte()).toByte(), i_37_.toFloat()), anInterface18_Impl3_8403.method67(anInt8411.toFloat(), 77), ((-27).toByte()).toByte())
            aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030)
            var i_63_ = i - -anInt8400
            var i_64_ = anInt8411 + i_63_
            while (i_64_ <= i_61_) {
                class101_sub2.method932(0.0f, i_37_.toFloat(), anInt8411.toFloat(), ((-69).toByte()).toByte())
                class101_sub2.method891(i_63_, i_35_, 0)
                aHa_Sub3_8407.method3915(0)
                i_63_ += i_62_
                aHa_Sub3_8407.method3933(-40)
                i_64_ += i_62_
            }
            if (i_63_ < i_61_) {
                val i_65_ = -i_63_ + i_61_
                class101_sub2_41_.method932(1.0f, anInterface18_Impl3_8403.method71(((-62).toByte()).toByte(), i_37_.toFloat()), anInterface18_Impl3_8403.method67(i_65_.toFloat(), 119), ((-10).toByte()).toByte())
                aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030)
                class101_sub2.method932(0.0f, i_37_.toFloat(), i_65_.toFloat(), ((-120).toByte()).toByte())
                class101_sub2.method891(i_63_, i_35_, 0)
                aHa_Sub3_8407.method3915(0)
                aHa_Sub3_8407.method3933(-57)
            }
        } else {
            val i_48_ = i_37_ + i_35_
            val i_49_ = i + i_36_
            val i_50_ = method966()
            val i_51_ = method980()
            var i_52_ = anInt8419 + i_35_
            var i_53_ = i_52_ + anInt8417
            while (i_48_ >= i_53_) {
                class101_sub2_41_.method932(1.0f, anInterface18_Impl3_8403.method71(((-89).toByte()).toByte(), anInt8417.toFloat()), anInterface18_Impl3_8403.method67(anInt8411.toFloat(), 88), ((-16).toByte()).toByte())
                aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030)
                var i_54_ = anInt8400 + i
                var i_55_ = i_54_ - -anInt8411
                while (i_55_ <= i_49_) {
                    class101_sub2.method932(0.0f, anInt8417.toFloat(), anInt8411.toFloat(), ((-65).toByte()).toByte())
                    class101_sub2.method891(i_54_, i_52_, 0)
                    aHa_Sub3_8407.method3915(0)
                    i_54_ += i_50_
                    aHa_Sub3_8407.method3933(-113)
                    i_55_ += i_50_
                }
                if (i_49_ > i_54_) {
                    val i_56_ = -i_54_ + i_49_
                    class101_sub2_41_.method932(1.0f, anInterface18_Impl3_8403.method71(((-82).toByte()).toByte(), anInt8417.toFloat()), anInterface18_Impl3_8403.method67(i_56_.toFloat(), 86), ((-35).toByte()).toByte())
                    aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030)
                    class101_sub2.method932(0.0f, anInt8417.toFloat(), i_56_.toFloat(), ((-26).toByte()).toByte())
                    class101_sub2.method891(i_54_, i_52_, 0)
                    aHa_Sub3_8407.method3915(0)
                    aHa_Sub3_8407.method3933(-79)
                }
                i_53_ += i_51_
                i_52_ += i_51_
            }
            if (i_52_ < i_48_) {
                val i_57_ = i_48_ + -i_52_
                class101_sub2_41_.method932(1.0f, anInterface18_Impl3_8403.method71(((-121).toByte()).toByte(), i_57_.toFloat()), anInterface18_Impl3_8403.method67(anInt8411.toFloat(), 102), ((-59).toByte()).toByte())
                aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030)
                var i_58_ = anInt8400 + i
                var i_59_ = anInt8411 + i_58_
                while (i_49_ >= i_59_) {
                    class101_sub2.method932(0.0f, i_57_.toFloat(), anInt8411.toFloat(), ((-98).toByte()).toByte())
                    class101_sub2.method891(i_58_, i_52_, 0)
                    aHa_Sub3_8407.method3915(0)
                    i_58_ += i_50_
                    i_59_ += i_50_
                    aHa_Sub3_8407.method3933(-69)
                }
                if (i_49_ > i_58_) {
                    val i_60_ = i_49_ - i_58_
                    class101_sub2_41_.method932(1.0f, anInterface18_Impl3_8403.method71(((-102).toByte()).toByte(), i_57_.toFloat()), anInterface18_Impl3_8403.method67(i_60_.toFloat(), 115), ((-90).toByte()).toByte())
                    aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030)
                    class101_sub2.method932(0.0f, i_57_.toFloat(), i_60_.toFloat(), ((-95).toByte()).toByte())
                    class101_sub2.method891(i_58_, i_52_, 0)
                    aHa_Sub3_8407.method3915(0)
                    aHa_Sub3_8407.method3933(-54)
                }
            }
        }
        aHa_Sub3_8407.method3879(-8629)
        aHa_Sub3_8407.method3849(47.toByte(), 1, Class318_Sub1_Sub2.aClass70_8737)
        aHa_Sub3_8407.method3885(1, true, Class318_Sub1_Sub2.aClass70_8737)
    }

    override fun method983(f: Float, f_66_: Float, f_67_: Float, f_68_: Float, f_69_: Float, f_70_: Float, i: Int, var_aa: aa?, i_71_: Int, i_72_: Int) {
        anInt8390++
        val class101_sub2 = aHa_Sub3_8407!!.method3934(-121)
        val class101_sub2_73_ = aHa_Sub3_8407.method3820(false)
        val var_aa_Sub2 = var_aa as aa_Sub2?
        val interface18_impl3 = var_aa_Sub2!!.anInterface18_Impl3_5196
        anInterface18_Impl3_8403!!.method64((if (aBoolean8410 || aBoolean8408 || (0x1 and i) == 0) Class206.aClass209_4874 else Class71.aClass209_1212), -22095)
        aHa_Sub3_8407.method3864(101)
        aHa_Sub3_8407.method3850(((-102).toByte()).toByte(), anInterface18_Impl3_8403)
        aHa_Sub3_8407.method3817(86, 1)
        aHa_Sub3_8407.method3923(true, 1)
        if (aBoolean8418) {
            val f_74_ = anInt8411.toFloat() / method966().toFloat()
            val f_75_ = anInt8417.toFloat() / method980().toFloat()
            class101_sub2.method935(1.0f, f_74_ * (-f_66_ + f_68_), f_75_ * (-f + f_69_), 0.0f, 0.0f, f_75_ * (f_70_ - f_66_), 0.0f, 0.0f, (f_67_ - f) * f_74_, 0)
            class101_sub2.method920((anInt8419.toFloat() + f_66_) * f_75_, false, 0.0f, (anInt8400.toFloat() + f) * f_74_)
        } else {
            class101_sub2.method935(1.0f, -f_66_ + f_68_, f_69_ - f, 0.0f, 0.0f, -f_66_ + f_70_, 0.0f, 0.0f, f_67_ - f, 0)
            class101_sub2.method920(f_66_, false, 0.0f, f)
        }
        class101_sub2_73_.method932(1.0f, anInterface18_Impl3_8403.method71(((-87).toByte()).toByte(), anInt8417.toFloat()), anInterface18_Impl3_8403.method67(anInt8411.toFloat(), 75), ((-60).toByte()).toByte())
        aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030)
        aHa_Sub3_8407.method3897(1, -4382)
        aHa_Sub3_8407.method3850(((-31).toByte()).toByte(), interface18_impl3)
        aHa_Sub3_8407.method3874(Class167.aClass229_2207, 127, Class328_Sub3.aClass229_6519)
        aHa_Sub3_8407.method3849(47.toByte(), 0, Class318_Sub1_Sub2.aClass70_8737)
        val class101_sub2_76_ = aHa_Sub3_8407.method3820(false)
        class101_sub2_76_.method898(class101_sub2)
        class101_sub2_76_.method891(-i_71_, -i_72_, 0)
        class101_sub2_76_.method914(interface18_impl3!!.method71(((-32).toByte()).toByte(), 1.0f), 1.0f, 0, interface18_impl3.method67(1.0f, 71))
        aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030)
        aHa_Sub3_8407.method3915(0)
        aHa_Sub3_8407.method3933(-109)
        aHa_Sub3_8407.method3879(-8629)
        aHa_Sub3_8407.method3849(47.toByte(), 0, Class342.aClass70_4247)
        aHa_Sub3_8407.method3874(Class167.aClass229_2207, 118, Class167.aClass229_2207)
        aHa_Sub3_8407.method3850(98.toByte(), null)
        aHa_Sub3_8407.method3897(0, -4382)
        aHa_Sub3_8407.method3879(-8629)
    }

    override fun method968(i: Int, i_77_: Int, i_78_: Int) {
        anInt8406++
        val `is` = aHa_Sub3_8407!!.na(i, i_77_, anInt8411, anInt8417)
        val is_79_ = IntArray(anInt8417 * anInt8411)
        anInterface18_Impl3_8403!!.method65(0, is_79_, anInt8411, 0, anInt8417, 112.toByte(), 0)
        if (i_78_ == 0) {
            var i_80_ = 0
            while (anInt8417 > i_80_) {
                val i_81_ = i_80_ * anInt8411
                for (i_82_ in 0..<anInt8411) is_79_[i_81_ + i_82_] = (Class273.method2057((Class139.method1166(1828651008, `is`!![i_81_ - -i_82_]) shl 8), Class139.method1166(is_79_[i_81_ - -i_82_], 16777215)))
                i_80_++
            }
        } else if (i_78_ == 1) {
            var i_83_ = 0
            while (anInt8417 > i_83_) {
                val i_84_ = i_83_ * anInt8411
                var i_85_ = 0
                while (anInt8411 > i_85_) {
                    is_79_[i_85_ + i_84_] = (Class273.method2057(Class139.method1166(is_79_[i_85_ + i_84_], 16777215), (Class139.method1166(`is`!![i_84_ - -i_85_], 743571200) shl 16)))
                    i_85_++
                }
                i_83_++
            }
        } else if (i_78_ == 2) {
            var i_89_ = 0
            while (anInt8417 > i_89_) {
                val i_90_ = i_89_ * anInt8411
                for (i_91_ in 0..<anInt8411) is_79_[i_90_ + i_91_] = (Class273.method2057(Class139.method1166(is_79_[i_90_ + i_91_], 16777215), Class139.method1166(-3725444, (`is`!![i_91_ + i_90_] shl 24))))
                i_89_++
            }
        } else if (i_78_ == 3) {
            var i_86_ = 0
            while (anInt8417 > i_86_) {
                val i_87_ = i_86_ * anInt8411
                for (i_88_ in 0..<anInt8411) is_79_[i_88_ + i_87_] = (Class273.method2057(if (`is`!![i_88_ + i_87_] != 0) -16777216 else 0, Class139.method1166(16777215, is_79_[i_88_ + i_87_])))
                i_86_++
            }
        }
        method986(0, 0, anInt8411, anInt8417, is_79_, 0, anInt8411)
    }

    override fun method982(i: Int, i_94_: Int, i_95_: Int, i_96_: Int, i_97_: Int, i_98_: Int, i_99_: Int, i_100_: Int) {
        var i = i
        var i_94_ = i_94_
        var i_95_ = i_95_
        var i_96_ = i_96_
        anInt8395++
        val class101_sub2 = aHa_Sub3_8407!!.method3934(-95)
        val class101_sub2_101_ = aHa_Sub3_8407.method3820(false)
        anInterface18_Impl3_8403!!.method64((if (aBoolean8410 || aBoolean8408 || ((i_100_ and 0x1) == 0)) Class206.aClass209_4874 else Class71.aClass209_1212), -22095)
        aHa_Sub3_8407.method3864(81)
        aHa_Sub3_8407.method3850(65.toByte(), anInterface18_Impl3_8403)
        aHa_Sub3_8407.method3817(58, i_99_)
        aHa_Sub3_8407.method3923(true, i_97_)
        aHa_Sub3_8407.method3849(47.toByte(), 1, Class348_Sub40_Sub39.aClass70_9485)
        aHa_Sub3_8407.method3885(1, true, Class348_Sub40_Sub39.aClass70_9485)
        aHa_Sub3_8407.method3894(-28186, i_98_)
        class101_sub2_101_.method932(1.0f, anInterface18_Impl3_8403.method71(((-44).toByte()).toByte(), anInt8417.toFloat()), anInterface18_Impl3_8403.method67(anInt8411.toFloat(), 101), ((-30).toByte()).toByte())
        if (aBoolean8418) {
            i_95_ = i_95_ * anInt8411 / method966()
            i_96_ = anInt8417 * i_96_ / method980()
            i += anInt8400 * i_95_ / anInt8411
            i_94_ += anInt8419 * i_96_ / anInt8417
        }
        class101_sub2.method932(0.0f, i_96_.toFloat(), i_95_.toFloat(), ((-100).toByte()).toByte())
        class101_sub2.method891(i, i_94_, 0)
        aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030)
        aHa_Sub3_8407.method3915(0)
        aHa_Sub3_8407.method3933(-118)
        aHa_Sub3_8407.method3879(-8629)
        aHa_Sub3_8407.method3849(47.toByte(), 1, Class318_Sub1_Sub2.aClass70_8737)
        aHa_Sub3_8407.method3885(1, true, Class318_Sub1_Sub2.aClass70_8737)
    }

    override fun method984(`is`: IntArray?) {
        `is`!![0] = anInt8400
        `is`[1] = anInt8419
        anInt8421++
        `is`[3] = anInt8397
        `is`[2] = anInt8416
    }

    override fun method964(i: Int, i_102_: Int, i_103_: Int, i_104_: Int, i_105_: Int) {
        var i = i
        var i_102_ = i_102_
        anInt8409++
        val class101_sub2 = aHa_Sub3_8407!!.method3934(-92)
        val class101_sub2_106_ = aHa_Sub3_8407.method3820(false)
        i += anInt8400
        i_102_ += anInt8419
        anInterface18_Impl3_8403!!.method64(Class206.aClass209_4874, -22095)
        aHa_Sub3_8407.method3864(-82)
        aHa_Sub3_8407.method3850(((-67).toByte()).toByte(), anInterface18_Impl3_8403)
        aHa_Sub3_8407.method3817(96, i_105_)
        aHa_Sub3_8407.method3923(true, i_103_)
        aHa_Sub3_8407.method3849(47.toByte(), 1, Class348_Sub40_Sub39.aClass70_9485)
        aHa_Sub3_8407.method3885(1, true, Class348_Sub40_Sub39.aClass70_9485)
        aHa_Sub3_8407.method3894(-28186, i_104_)
        class101_sub2.method932(0.0f, anInt8417.toFloat(), anInt8411.toFloat(), ((-44).toByte()).toByte())
        class101_sub2.method891(i, i_102_, 0)
        class101_sub2_106_.method932(1.0f, anInterface18_Impl3_8403.method71(((-125).toByte()).toByte(), anInt8417.toFloat()), anInterface18_Impl3_8403.method67(anInt8411.toFloat(), 111), ((-19).toByte()).toByte())
        aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030)
        aHa_Sub3_8407.method3915(0)
        aHa_Sub3_8407.method3933(-41)
        aHa_Sub3_8407.method3879(-8629)
        aHa_Sub3_8407.method3849(47.toByte(), 1, Class318_Sub1_Sub2.aClass70_8737)
        aHa_Sub3_8407.method3885(1, true, Class318_Sub1_Sub2.aClass70_8737)
    }

    override fun method971(): Int {
        anInt8420++
        return anInt8411
    }

    override fun method979(i: Int, i_107_: Int, i_108_: Int, i_109_: Int, i_110_: Int, i_111_: Int) {
        anInt8392++
        val `is` = aHa_Sub3_8407!!.na(i_110_, i_111_, i_108_, i_109_)
        if (`is` != null) {
            for (i_112_ in `is`.indices) `is`[i_112_] = Class273.method2057(`is`[i_112_], -16777216)
            method986(i, i_107_, i_108_, i_109_, `is`, 0, i_108_)
        }
    }

    override fun method963(i: Int, i_113_: Int, var_aa: aa?, i_114_: Int, i_115_: Int) {
        var i = i
        var i_113_ = i_113_
        anInt8414++
        val var_aa_Sub2 = var_aa as aa_Sub2?
        i_113_ += anInt8419
        i += anInt8400
        val interface18_impl3 = var_aa_Sub2!!.anInterface18_Impl3_5196
        anInterface18_Impl3_8403!!.method64(Class206.aClass209_4874, -22095)
        aHa_Sub3_8407!!.method3864(-81)
        aHa_Sub3_8407.method3850(((-35).toByte()).toByte(), anInterface18_Impl3_8403)
        aHa_Sub3_8407.method3817(110, 1)
        aHa_Sub3_8407.method3923(true, 1)
        val class101_sub2 = aHa_Sub3_8407.method3934(-120)
        class101_sub2.method932(0.0f, anInt8417.toFloat(), anInt8411.toFloat(), ((-55).toByte()).toByte())
        class101_sub2.method891(i, i_113_, 0)
        aHa_Sub3_8407.method3915(0)
        val class101_sub2_116_ = aHa_Sub3_8407.method3820(false)
        class101_sub2_116_.method932(1.0f, anInterface18_Impl3_8403.method71(((-102).toByte()).toByte(), anInt8417.toFloat()), anInterface18_Impl3_8403.method67(anInt8411.toFloat(), 106), ((-33).toByte()).toByte())
        aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030)
        aHa_Sub3_8407.method3897(1, -4382)
        aHa_Sub3_8407.method3850(101.toByte(), interface18_impl3)
        aHa_Sub3_8407.method3874(Class167.aClass229_2207, 110, Class328_Sub3.aClass229_6519)
        aHa_Sub3_8407.method3849(47.toByte(), 0, Class318_Sub1_Sub2.aClass70_8737)
        val class101_sub2_117_ = aHa_Sub3_8407.method3820(false)
        class101_sub2_117_.method932(1.0f, interface18_impl3!!.method71(((-108).toByte()).toByte(), anInt8417.toFloat()), interface18_impl3.method67(anInt8411.toFloat(), 95), ((-81).toByte()).toByte())
        class101_sub2_117_.method920(interface18_impl3.method71(((-27).toByte()).toByte(), (i_113_ + -i_115_).toFloat()), false, 0.0f, interface18_impl3.method67((i - i_114_).toFloat(), 122))
        aHa_Sub3_8407.method3853(-32, Class239_Sub18.aClass251_6030)
        aHa_Sub3_8407.method3933(-81)
        aHa_Sub3_8407.method3879(-8629)
        aHa_Sub3_8407.method3849(47.toByte(), 0, Class342.aClass70_4247)
        aHa_Sub3_8407.method3874(Class167.aClass229_2207, 127, Class167.aClass229_2207)
        aHa_Sub3_8407.method3850(((-84).toByte()).toByte(), null)
        aHa_Sub3_8407.method3897(0, -4382)
        aHa_Sub3_8407.method3879(-8629)
    }

    internal constructor(var_ha_Sub3: ha_Sub3, i: Int, i_118_: Int, bool: Boolean) {
        aBoolean8418 = false
        anInt8400 = 0
        anInt8417 = i_118_
        anInt8411 = i
        aHa_Sub3_8407 = var_ha_Sub3
        anInterface18_Impl3_8403 = var_ha_Sub3.method3861(i_118_, ((-84).toByte()).toByte(), i, Class68.aClass68_1183, (if (bool) Class108.aClass304_1662 else Class348_Sub45.aClass304_7103))
        anInterface18_Impl3_8403!!.method66(true, true, 25688)
        aBoolean8410 = (i != anInterface18_Impl3_8403.method69(false))
        aBoolean8408 = (i_118_ != anInterface18_Impl3_8403.method72(-39))
        aBoolean8396 = !aBoolean8410 && anInterface18_Impl3_8403.method73(97)
        aBoolean8391 = !aBoolean8408 && anInterface18_Impl3_8403.method73(119)
    }

    internal constructor(var_ha_Sub3: ha_Sub3?, i: Int, i_119_: Int, `is`: IntArray?, i_120_: Int, i_121_: Int) {
        aBoolean8418 = false
        anInt8400 = 0
        try {
            aHa_Sub3_8407 = var_ha_Sub3
            anInt8411 = i
            anInt8417 = i_119_
            anInterface18_Impl3_8403 = var_ha_Sub3!!.method3830(i, `is`, false, ((-116).toByte()).toByte(), i_120_, i_121_, i_119_)
            anInterface18_Impl3_8403!!.method66(true, true, 25688)
            aBoolean8410 = i != anInterface18_Impl3_8403.method69(false)
            aBoolean8408 = anInterface18_Impl3_8403.method72(-74) != i_119_
            aBoolean8396 = !aBoolean8410 && anInterface18_Impl3_8403.method73(91)
            aBoolean8391 = !aBoolean8408 && anInterface18_Impl3_8403.method73(101)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("jd.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + i + ',' + i_119_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_120_ + ',' + i_121_ + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt8390: Int = 0
        @JvmField
        var anInt8392: Int = 0
        @JvmField
        var anInt8393: Int = 0
        @JvmField
        var anInt8394: Int = 0
        @JvmField
        var anInt8395: Int = 0
        @JvmField
        var anInt8398: Int = 0
        @JvmField
        var anInt8399: Int = 0
        @JvmField
        var anInt8401: Int = 0
        @JvmField
        var anInt8402: Int = 0
        @JvmField
        var anInt8404: Int = 0
        @JvmField
        var anInt8405: Int = 0
        @JvmField
        var anInt8406: Int = 0
        @JvmField
        var anInt8409: Int = 0
        @JvmField
        var anInt8412: Int = 0
        @JvmField
        var anInt8413: Int = 0
        @JvmField
        var anInt8414: Int = 0
        @JvmField
        var anInt8415: Int = 0
        @JvmField
        var anInt8420: Int = 0
        @JvmField
        var anInt8421: Int = 0
        @JvmField
        var anInt8422: Int = 0
        @JvmField
        var anInt8423: Int = 0

        @JvmStatic
        fun method987(i: Int, class348_sub49: Class348_Sub49): Class369_Sub2 {
            anInt8405++
            val class369 = method2834(((-118).toByte()).toByte(), class348_sub49)
            if (i != 743571200) method989(-21, 36, 81)
            val i_8_ = class348_sub49.readInt(((-126).toByte()).toByte())
            val i_9_ = class348_sub49.readInt(((-126).toByte()).toByte())
            return Class369_Sub2(class369.aClass221_4968, class369.aClass341_4973, class369.anInt4970, class369.anInt4959, class369.anInt4971, class369.anInt4963, class369.anInt4966, class369.anInt4965, class369.anInt4961, i_8_, i_9_)
        }

        @JvmStatic
        fun method988(i: Int, i_10_: Int, i_11_: Int): Class361? {
            anInt8415++
            val class361 = Class361()
            class361.anInt4437 = 6 + i_11_
            class361.anInt4453 = -1
            class361.anInt4443 = 5 + (i - -1)
            if (i_10_ != 1) return null
            class361.anInt4441 = -1
            class361.anIntArrayArray4438 = (Array(class361.anInt4437) { IntArray(class361.anInt4443) })
            class361.method3500(700)
            return class361
        }

        fun method989(i: Int, i_92_: Int, i_93_: Int): Boolean {
            anInt8401++
            if (Class156.method1241(i_93_, i, i_92_ xor 0x1fe) or ((0x10000 and i) != 0) || Class348_Sub47.method3325(i, i_93_, true)) return true
            if (i_92_ != -385) return false
            return (i_93_ and 0x37) == 0 && Class273.method2056(i, 120, i_93_)
        }
    }
}
