import jaclib.memory.Stream.Companion.c

class Class324_Sub2 internal constructor(private val aHa_Sub3_6494: ha_Sub3, class143: Class143?, class207s: Array<Class207>, bool: Boolean) : Class324(aHa_Sub3_6494, class143) {
    private val anInterface18_Impl3_6492: Interface18_Impl3?
    private val aBoolean6493: Boolean
    private val anInterface5_Impl1_6495: Interface5_Impl1

    override fun method2578(c: Char, i: Int, i_0_: Int, i_1_: Int, bool: Boolean, var_aa: aa?, i_2_: Int, i_3_: Int) {
        /* empty */
    }

    init {
        var i = 0
        for (i_4_ in 0..255) {
            val class207 = class207s[i_4_]
            if (class207.anInt2696 > i) i = class207.anInt2696
            if (class207.anInt2702 > i) i = class207.anInt2702
        }
        val i_5_ = i * 16
        if (bool) {
            val `is` = ByteArray(i_5_ * i_5_)
            for (i_6_ in 0..255) {
                val class207 = class207s[i_6_]
                val i_7_ = class207.anInt2696
                val i_8_ = class207.anInt2702
                val i_9_ = i_6_ % 16 * i
                val i_10_ = i_6_ / 16 * i
                var i_11_ = i_10_ * i_5_ + i_9_
                var i_12_ = 0
                if (class207.aByteArray2695 == null) {
                    val is_13_ = class207.aByteArray2699
                    for (i_14_ in 0..<i_7_) {
                        for (i_15_ in 0..<i_8_) `is`[i_11_++] = (if (is_13_[i_12_++].toInt() == 0) 0 else -1).toByte()
                        i_11_ += i_5_ - i_8_
                    }
                } else {
                    val is_16_ = class207.aByteArray2695!!
                    for (i_17_ in 0..<i_7_) {
                        for (i_18_ in 0..<i_8_) `is`[i_11_++] = is_16_[i_12_++]
                        i_11_ += i_5_ - i_8_
                    }
                }
            }
            if (!aHa_Sub3_6494.method3880(Class68.aClass68_1183, Class348_Sub40_Sub38.aClass304_9471, 126.toByte())) {
                val is_19_ = IntArray(`is`.size)
                for (i_20_ in `is`.indices) is_19_[i_20_] = `is`[i_20_].toInt() shl 24
                anInterface18_Impl3_6492 = aHa_Sub3_6494.method3839(i_5_, i_5_, -15137, false, is_19_)
            } else anInterface18_Impl3_6492 = aHa_Sub3_6494.method3944(`is`, i_5_, (Class348_Sub40_Sub38.aClass304_9471), 2, false, i_5_)
            aBoolean6493 = true
        } else {
            val `is` = IntArray(i_5_ * i_5_)
            for (i_21_ in 0..255) {
                val class207 = class207s[i_21_]
                val is_22_ = class207.anIntArray2697
                val is_23_ = class207.aByteArray2695
                val is_24_ = class207.aByteArray2699
                val i_25_ = class207.anInt2696
                val i_26_ = class207.anInt2702
                val i_27_ = i_21_ % 16 * i
                val i_28_ = i_21_ / 16 * i
                var i_29_ = i_28_ * i_5_ + i_27_
                var i_30_ = 0
                if (is_23_ == null) {
                    for (i_33_ in 0..<i_25_) {
                        for (i_34_ in 0..<i_26_) {
                            val i_35_: Int
                            if ((is_24_[i_30_++].also { i_35_ = it.toInt() }).toInt() != 0) `is`[i_29_++] = 0xffffff.inv() or is_22_[i_35_ and 0xff]
                            else i_29_++
                        }
                        i_29_ += i_5_ - i_26_
                    }
                } else {
                    for (i_31_ in 0..<i_25_) {
                        for (i_32_ in 0..<i_26_) {
                            `is`[i_29_++] = (is_23_[i_30_].toInt() shl 24 or is_22_[is_24_[i_30_].toInt() and 0xff])
                            i_30_++
                        }
                        i_29_ += i_5_ - i_26_
                    }
                }
            }
            anInterface18_Impl3_6492 = aHa_Sub3_6494.method3839(i_5_, i_5_, -15137, false, `is`)
            aBoolean6493 = false
        }
        anInterface18_Impl3_6492!!.method64(Class206.aClass209_4874, -22095)
        anInterface5_Impl1_6495 = aHa_Sub3_6494.method3889(false, 16711680)
        anInterface5_Impl1_6495.method20(20480, 126.toByte(), 20)
        for (i_36_ in 0..3) {
            val buffer = anInterface5_Impl1_6495.method19(true, 26775)
            if (buffer != null) {
                val stream = aHa_Sub3_6494.method3893(buffer, 9179)
                val f = (anInterface18_Impl3_6492.method67(i_5_.toFloat(), 96) / i_5_.toFloat())
                val f_37_ = (anInterface18_Impl3_6492.method71((-45).toByte(), i_5_.toFloat()) / i_5_.toFloat())
                for (i_38_ in 0..255) {
                    val class207 = class207s[i_38_]
                    val i_39_ = class207.anInt2696
                    val i_40_ = class207.anInt2702
                    val i_41_ = class207.anInt2700
                    val i_42_ = class207.anInt2703
                    val f_43_ = (i_38_ % 16 * i).toFloat()
                    val f_44_ = (i_38_ / 16 * i).toFloat()
                    val f_45_ = f_43_ * f
                    val f_46_ = f_44_ * f_37_
                    val f_47_ = (f_43_ + i_40_.toFloat()) * f
                    val f_48_ = (f_44_ + i_39_.toFloat()) * f_37_
                    if (c()) {
                        stream.a(i_42_.toFloat())
                        stream.a(i_41_.toFloat())
                        stream.a(0.0f)
                        stream.a(f_45_)
                        stream.a(f_46_)
                        stream.a(i_42_.toFloat())
                        stream.a((i_41_ + i_39_).toFloat())
                        stream.a(0.0f)
                        stream.a(f_45_)
                        stream.a(f_48_)
                        stream.a((i_42_ + i_40_).toFloat())
                        stream.a((i_41_ + i_39_).toFloat())
                        stream.a(0.0f)
                        stream.a(f_47_)
                        stream.a(f_48_)
                        stream.a((i_42_ + i_40_).toFloat())
                        stream.a(i_41_.toFloat())
                        stream.a(0.0f)
                        stream.a(f_47_)
                        stream.a(f_46_)
                    } else {
                        stream.b(i_42_.toFloat())
                        stream.b(i_41_.toFloat())
                        stream.b(0.0f)
                        stream.b(f_45_)
                        stream.b(f_46_)
                        stream.b(i_42_.toFloat())
                        stream.b((i_41_ + i_39_).toFloat())
                        stream.b(0.0f)
                        stream.b(f_45_)
                        stream.b(f_48_)
                        stream.b((i_42_ + i_40_).toFloat())
                        stream.b((i_41_ + i_39_).toFloat())
                        stream.b(0.0f)
                        stream.b(f_47_)
                        stream.b(f_48_)
                        stream.b((i_42_ + i_40_).toFloat())
                        stream.b(i_41_.toFloat())
                        stream.b(0.0f)
                        stream.b(f_47_)
                        stream.b(f_46_)
                    }
                }
                stream.a()
                if (anInterface5_Impl1_6495.method18(6331)) break
            }
        }
    }

    override fun fa(c: Char, i: Int, i_49_: Int, i_50_: Int, bool: Boolean) {
        aHa_Sub3_6494.method3927(true)
        aHa_Sub3_6494.method3850((-41).toByte(), anInterface18_Impl3_6492)
        if (aBoolean6493 || bool) {
            aHa_Sub3_6494.method3874(Class167.aClass229_2207, 112, Class328_Sub3.aClass229_6519)
            aHa_Sub3_6494.method3849(47.toByte(), 0, Class348_Sub40_Sub39.aClass70_9485)
            aHa_Sub3_6494.method3894(-28186, i_50_)
        } else aHa_Sub3_6494.method3874(Class328_Sub3.aClass229_6519, 126, Class328_Sub3.aClass229_6519)
        val class101_sub2 = aHa_Sub3_6494.method3934(-99)
        class101_sub2!!.method894(i, i_49_, 0)
        aHa_Sub3_6494.method3915(0)
        aHa_Sub3_6494.method3925(54, anInterface5_Impl1_6495, 0)
        aHa_Sub3_6494.method3862(0, aHa_Sub3_6494.aClass130_8204)
        aHa_Sub3_6494.method3899(2, c.code * '\u0004'.code, Class348_Sub42_Sub16.aClass21_9661, true)
        if (aBoolean6493 || bool) aHa_Sub3_6494.method3849(47.toByte(), 0, Class342.aClass70_4247)
    }
}
