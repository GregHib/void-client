import Class163.Companion.method1274
import Class202.Companion.method1469
import Class258_Sub1.Companion.method1960
import Class43.Companion.method383
import Class59_Sub1_Sub1.Companion.method560
import r.Companion.method3284
import kotlin.math.max
import kotlin.math.min

/* Class230 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class230 internal constructor(string: String?, i: Int) {
    @JvmField
    var aString2985: String? = null
    @JvmField
    var anInt2987: Int = 0
    override fun toString(): String {
        anInt2989++
        throw IllegalStateException()
    }

    init {
        try {
            this.aString2985 = string
            this.anInt2987 = i
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("sj.<init>(" + (if (string != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    companion object {
        var anInt2982: Int = 0
        var anInt2983: Int = 0
        var anInt2984: Int = 0
        @JvmField
        var anInt2986: Int = 0
        var anInt2988: Int = 0
        var anInt2989: Int = 0

        fun method1634(`is`: IntArray?, i: Int, is_0_: Array<Array<ByteArray?>?>?, i_1_: Int, i_2_: Int, is_3_: IntArray?, i_4_: Int, i_5_: Int, bool: Boolean, i_6_: Int, i_7_: Int, is_8_: IntArray?, is_9_: IntArray?, i_10_: Byte, is_11_: IntArray?, i_12_: Int, bool_13_: Boolean, i_14_: Int) {
            do {
                try {
                    anInt2982++
                    if (Class348_Sub49.anInt7207 != -1) {
                        val is_15_ = Class21.aHa326!!.Y()
                        val i_16_ = is_15_[0]
                        val i_17_ = is_15_[1]
                        val i_18_ = is_15_[2]
                        val i_19_ = is_15_[3]
                        var i_20_ = i_18_
                        var i_21_ = i_19_
                        if (Class348_Sub49.anInt7207 == 1) {
                            i_20_ = (i_18_.toDouble() * Class107.anInt1651.toDouble() / Class239_Sub16.anInt6008.toDouble()).toInt()
                            i_21_ = (Class107.anInt1651.toDouble() * i_19_.toDouble() / Class239_Sub16.anInt6008.toDouble()).toInt()
                        }
                        if (!Class348_Sub16_Sub2.aBoolean8870) {
                            if (Class348_Sub49.anInt7207 == 1) method383(0)
                            val i_22_ = -Class105_Sub1.anInt8422 + i_4_
                            val i_23_ = i_6_ + -Class29.anInt403
                            val i_24_ = -Class348_Sub21.anInt6849 + i_5_
                            val i_25_ = ((Class247.aDouble3182 * i_22_.toDouble() + i_23_.toDouble() * Class319.aDouble3980 + i_24_.toDouble() * Class357.aDouble4404) * i_20_.toDouble() / i_14_.toDouble()).toInt()
                            val i_26_ = (((i_24_.toDouble() * Class348_Sub42_Sub5.aDouble9531) + ((i_22_.toDouble() * Class348_Sub23_Sub2.aDouble9023) + (i_23_.toDouble() * Class295.aDouble3761))) * i_21_.toDouble() / i_14_.toDouble()).toInt()
                            val d = (i_24_.toDouble() * Class348_Sub16_Sub2.aDouble8869 + (Class348_Sub15.aDouble6774 * i_23_.toDouble() + i_22_.toDouble() * Class59.aDouble1083))
                            val i_27_ = i_25_ + Class211.anInt2747 - Class328.anInt4100
                            val i_28_ = (Class348_Sub42_Sub9_Sub1.anInt10444 + i_26_ + -Class348_Sub3.anInt6568)
                            val i_29_ = Class59_Sub1.anInt5283 + i_27_
                            val i_30_ = Class107.anInt1651 + i_28_
                            if ((i_27_ < 0 || i_28_ < 0 || i_29_ > Class348_Sub16_Sub1.anInt8854 || (i_30_ > Class239_Sub16.anInt6008)) && Class348_Sub49.anInt7207 != 2) {
                                if (i_29_ <= 0 || i_30_ <= 0 || (Class348_Sub16_Sub1.anInt8854 <= i_27_) || (i_28_ >= Class239_Sub16.anInt6008)) Class348_Sub16_Sub2.aBoolean8870 = true
                                else {
                                    val i_31_ = i_27_ - Class211.anInt2747
                                    val i_32_ = (i_28_ - Class348_Sub42_Sub9_Sub1.anInt10444)
                                    var i_33_ = 0
                                    var i_34_ = 0
                                    var i_35_ = 0
                                    var i_36_ = 0
                                    var d_37_ = 0.0
                                    if (Class348_Sub49.anInt7207 == 0) {
                                        d_37_ = d + Class348_Sub42_Sub4.aDouble9517
                                        i_33_ = i_31_
                                        i_34_ = i_32_
                                    } else if (Class348_Sub49.anInt7207 == 1) {
                                        i_35_ = i_31_ / Class58.anInt1067
                                        i_36_ = i_32_ / Class344.anInt4267
                                        i_33_ = i_35_ * Class58.anInt1067
                                        i_34_ = i_36_ * Class344.anInt4267
                                        d_37_ = ((d + Class348_Sub42_Sub4.aDouble9517) * (i_32_ * i_34_ + i_33_ * i_31_).toDouble() / (i_32_ * i_32_ + i_31_ * i_31_).toDouble())
                                    }
                                    d_37_ = -d_37_
                                    var i_38_ = 0
                                    var i_39_ = 0
                                    var i_40_ = 0
                                    var i_41_ = 0
                                    var i_42_ = 0
                                    val i_43_: Int
                                    val i_44_: Int
                                    val i_45_: Int
                                    val i_46_: Int
                                    if (i_33_ >= 0) {
                                        i_45_ = 0
                                        i_43_ = (-i_33_ + Class348_Sub16_Sub1.anInt8854)
                                        if (Class348_Sub49.anInt7207 == 1) {
                                            i_42_ = i_35_
                                            i_40_ = -i_35_ + Class31.anInt425
                                        }
                                        i_46_ = i_33_
                                        i_44_ = i_43_
                                    } else {
                                        i_43_ = (Class348_Sub16_Sub1.anInt8854 + i_33_)
                                        i_44_ = 0
                                        i_45_ = -i_33_
                                        i_46_ = i_45_
                                        if (Class348_Sub49.anInt7207 == 1) {
                                            i_42_ = -i_35_
                                            i_40_ = 0
                                        }
                                    }
                                    var i_47_ = 0
                                    val i_48_: Int
                                    val i_49_: Int
                                    val i_50_: Int
                                    val i_51_: Int
                                    val i_52_: Int
                                    val i_53_: Int
                                    if (i_34_ >= 0) {
                                        i_50_ = Class239_Sub16.anInt6008 + -i_34_
                                        i_48_ = 0
                                        i_49_ = i_50_
                                        i_51_ = i_34_
                                        i_53_ = 0
                                        if (Class348_Sub49.anInt7207 == 1) {
                                            i_41_ = 0
                                            i_39_ = i_36_
                                            i_38_ = -i_36_ + Class250.anInt3225
                                            i_47_ = i_38_
                                        }
                                        i_52_ = i_50_
                                    } else {
                                        i_48_ = -i_34_
                                        i_49_ = 0
                                        i_50_ = Class239_Sub16.anInt6008 + i_34_
                                        i_51_ = i_48_
                                        i_52_ = i_50_
                                        i_53_ = i_51_
                                        if (Class348_Sub49.anInt7207 == 1) {
                                            i_39_ = -i_36_
                                            i_38_ = 0
                                            i_47_ = i_36_ + Class250.anInt3225
                                            i_41_ = i_39_
                                        }
                                    }
                                    val class243 = (Class348_Sub42_Sub8_Sub2.aClass76_10436!!.aClass243_1282)
                                    var class318_sub4 = (class243.method1872(8) as Class318_Sub4?)
                                    while (class318_sub4 != null) {
                                        val class318_sub3s = (class318_sub4.aClass318_Sub3Array6414)!!
                                        var bool_54_ = true
                                        var i_55_ = 0
                                        while (class318_sub3s.size > i_55_) {
                                            val class318_sub3 = class318_sub3s[i_55_]!!
                                            var i_56_ = (class318_sub3.anInt6405)
                                            var i_57_ = (class318_sub3.anInt6402)
                                            var i_58_ = (class318_sub3.anInt6406)
                                            var i_59_ = (class318_sub3.anInt6404)
                                            val i_60_ = (class318_sub3.anInt6403)
                                            i_59_ = -i_34_ + i_59_
                                            class318_sub3.anInt6404 = i_59_
                                            i_56_ = -i_33_ + i_56_
                                            class318_sub3.anInt6405 = i_56_
                                            i_58_ += -i_33_
                                            class318_sub3.anInt6406 = i_58_
                                            i_57_ = -i_34_ + i_57_
                                            class318_sub3.anInt6402 = i_57_
                                            if (bool_54_) {
                                                val i_61_ = -i_60_ + (min(i_58_, i_56_))
                                                if (i_61_ <= Class348_Sub16_Sub1.anInt8854) {
                                                    val i_62_ = (-i_60_ + (min(i_59_, i_57_)))
                                                    if (Class239_Sub16.anInt6008 >= i_62_) {
                                                        val i_63_ = ((max(i_58_, i_56_)) - -i_60_)
                                                        if (i_63_ >= 0) {
                                                            val i_64_ = ((max(i_59_, i_57_)) + i_60_)
                                                            if (i_64_ >= 0) bool_54_ = false
                                                        }
                                                    }
                                                }
                                            }
                                            i_55_++
                                        }
                                        if (bool_54_) {
                                            class318_sub4.method2373(false)
                                            method560(class318_sub4, i xor 0x4b)
                                        }
                                        class318_sub4 = (class243.method1878(122.toByte()) as Class318_Sub4?)
                                    }
                                    if (Class348_Sub49.anInt7207 == 0) Class21.aHa326!!.method3687(Class17.anInterface4_252)
                                    Class21.aHa326!!.F(-i_33_, -i_34_)
                                    Class21.aHa326!!.b(i_45_, i_48_, i_43_, i_50_, d_37_)
                                    method3284(true, (Class348_Sub42_Sub4.aDouble9517 + d_37_))
                                    Class14_Sub2.aDouble8621 = d_37_ + Class348_Sub42_Sub4.aDouble9517
                                    if (Class348_Sub49.anInt7207 == 1) {
                                        Class328_Sub1_Sub1.anInt8799 = (i_17_ + -Class348_Sub3.anInt6568 - i_34_)
                                        OutputStream_Sub1.anInt95 = i_21_
                                        Class120.anInt4910 = -Class328.anInt4100 + (i_16_ - i_33_)
                                        Class286_Sub5.anInt6255 = i_20_
                                        Class21.aHa326!!.DA(Class120.anInt4910, (Class328_Sub1_Sub1.anInt8799), Class286_Sub5.anInt6255, (OutputStream_Sub1.anInt95))
                                    } else {
                                        Class286_Sub5.anInt6255 = i_20_
                                        Class328_Sub1_Sub1.anInt8799 = (-Class348_Sub3.anInt6568 + i_17_ - (-(Class348_Sub42_Sub9_Sub1.anInt10444) - -i_34_))
                                        Class120.anInt4910 = (-Class328.anInt4100 + i_16_ + (Class211.anInt2747 + -i_33_))
                                        OutputStream_Sub1.anInt95 = i_21_
                                        Class21.aHa326!!.DA(Class120.anInt4910, (Class328_Sub1_Sub1.anInt8799), Class286_Sub5.anInt6255, (OutputStream_Sub1.anInt95))
                                    }
                                    method1274(Class348_Sub42_Sub8_Sub2.aClass76_10436)
                                    if (i_51_ > 0) {
                                        Class21.aHa326!!.KA(0, i_49_, (Class348_Sub16_Sub1.anInt8854), i_51_ + i_49_)
                                        Class21.aHa326!!.ya()
                                        Class21.aHa326!!.GA(Class77.anInt1290)
                                        method1960(i_12_, i_4_, i_6_, i_5_, is_0_, is_3_, is_8_, is_9_, is_11_, `is`, i_2_, i_10_, i_7_, i_1_, bool, bool_13_, i_14_, 1, false)
                                    }
                                    if (i_46_ > 0) {
                                        Class21.aHa326!!.KA(i_44_, i_53_, i_44_ - -i_46_, i_53_ + i_52_)
                                        Class21.aHa326!!.ya()
                                        Class21.aHa326!!.GA(Class77.anInt1290)
                                        method1960(i_12_, i_4_, i_6_, i_5_, is_0_, is_3_, is_8_, is_9_, is_11_, `is`, i_2_, i_10_, i_7_, i_1_, bool, bool_13_, i_14_, 1, false)
                                    }
                                    Class21.aHa326!!.la()
                                    Class271.method2046()
                                    if (Class348_Sub49.anInt7207 == 0) Class21.aHa326!!.method3672()
                                    Class348_Sub3.anInt6568 += i_34_
                                    Class328.anInt4100 += i_33_
                                    Class348_Sub42_Sub4.aDouble9517 += d_37_
                                    Class348_Sub40_Sub8.anInt9157 = (-Class348_Sub3.anInt6568 + i_26_ + Class348_Sub42_Sub9_Sub1.anInt10444)
                                    Class339.anInt4211 = (-Class328.anInt4100 + Class211.anInt2747 + i_25_)
                                    if (Class348_Sub49.anInt7207 == 1) {
                                        Class239_Sub24.anInt6095 += i_35_
                                        Class286.anInt3682 += i_36_
                                        for (i_65_ in 0..<Class250.anInt3225) {
                                            val i_66_ = ((Class350.method3452(i_65_ - -Class286.anInt3682, (-15).toByte(), Class250.anInt3225)) * Class31.anInt425)
                                            var i_67_ = 0
                                            while ((Class31.anInt425 > i_67_)) {
                                                val i_68_ = ((Class350.method3452(i_67_ + (Class239_Sub24.anInt6095), (-15).toByte(), Class31.anInt425)) + i_66_)
                                                val bool_69_ = (((i_38_ <= i_65_) && i_39_ + i_38_ > i_65_) || (i_65_ >= i_41_ && (i_65_ < i_41_ - -i_47_) && i_67_ >= i_40_ && (i_40_ - -i_42_ > i_67_)))
                                                Class92.anInterface4Array1525!![i_68_]!!.method15(Class58.anInt1067 * i_67_, i_65_ * Class344.anInt4267, Class58.anInt1067, Class344.anInt4267, 0, 0, bool_69_, true)
                                                i_67_++
                                            }
                                        }
                                    }
                                }
                            } else {
                                Class339.anInt4211 = i_27_
                                Class348_Sub40_Sub8.anInt9157 = i_28_
                                if (Class348_Sub49.anInt7207 == 2) Class348_Sub42_Sub4.aDouble9517 = -d
                            }
                        }
                        if (Class348_Sub16_Sub2.aBoolean8870) {
                            Class348_Sub21.anInt6849 = i_5_
                            Class29.anInt403 = i_6_
                            Class348_Sub40_Sub8.anInt9157 = Class348_Sub42_Sub9_Sub1.anInt10444
                            Class328.anInt4100 = 0
                            Class339.anInt4211 = Class211.anInt2747
                            Class105_Sub1.anInt8422 = i_4_
                            Class348_Sub3.anInt6568 = 0
                            Class348_Sub42_Sub4.aDouble9517 = 0.0
                            if (Class348_Sub49.anInt7207 == 0) Class21.aHa326!!.method3687(Class17.anInterface4_252)
                            Class21.aHa326!!.la()
                            Class21.aHa326!!.ya()
                            Class21.aHa326!!.GA(Class77.anInt1290)
                            Class51.aClass101_905!!.method903(Class105_Sub1.anInt8422, Class29.anInt403, Class348_Sub21.anInt6849, Class369_Sub1.anInt8583, Class295.anInt3760, Class27.anInt396)
                            Class21.aHa326!!.method3638(Class51.aClass101_905)
                            if (Class348_Sub49.anInt7207 == 1) {
                                Class328_Sub1_Sub1.anInt8799 = i_17_
                                Class120.anInt4910 = i_16_
                                OutputStream_Sub1.anInt95 = i_21_
                                Class286_Sub5.anInt6255 = i_20_
                                Class21.aHa326!!.DA(Class120.anInt4910, Class328_Sub1_Sub1.anInt8799, Class286_Sub5.anInt6255, OutputStream_Sub1.anInt95)
                            } else {
                                Class120.anInt4910 = i_16_ - -Class211.anInt2747
                                Class328_Sub1_Sub1.anInt8799 = Class348_Sub42_Sub9_Sub1.anInt10444 + i_17_
                                Class286_Sub5.anInt6255 = i_20_
                                OutputStream_Sub1.anInt95 = i_21_
                                Class21.aHa326!!.DA(Class120.anInt4910, Class328_Sub1_Sub1.anInt8799, Class286_Sub5.anInt6255, OutputStream_Sub1.anInt95)
                            }
                            Class14_Sub2.aDouble8621 = 0.0
                            Class348_Sub42_Sub8_Sub2.aClass76_10436!!.method775(69.toByte())
                            method1274(Class348_Sub42_Sub8_Sub2.aClass76_10436)
                            method1960(i_12_, i_4_, i_6_, i_5_, is_0_, is_3_, is_8_, is_9_, is_11_, `is`, i_2_, i_10_, i_7_, i_1_, bool, bool_13_, i_14_, 1, false)
                            Class271.method2046()
                            Class348_Sub16_Sub2.aBoolean8870 = false
                            if (Class348_Sub49.anInt7207 == 0) Class21.aHa326!!.method3672()
                            if (Class348_Sub49.anInt7207 == 1) method1469(-117)
                        }
                        if (Class348_Sub49.anInt7207 == 0) Class17.anInterface4_252!!.method14(Class339.anInt4211, Class348_Sub40_Sub8.anInt9157, Class59_Sub1.anInt5283, Class107.anInt1651, 0, 0, true, true)
                        Class318_Sub1_Sub1_Sub2.anInt9997++
                        method3284(true, Class348_Sub42_Sub4.aDouble9517)
                        Class318_Sub1_Sub5_Sub1.aDouble10120 = Class348_Sub42_Sub4.aDouble9517
                        if (Class348_Sub49.anInt7207 == 0 || Class348_Sub49.anInt7207 == 2) {
                            if (Class348_Sub49.anInt7207 == 2) {
                                Class21.aHa326!!.GA(Class77.anInt1290)
                                Class21.aHa326!!.ya()
                            }
                            Class193.anInt2590 = i_20_
                            Class129.anInt1879 = i_21_
                            Class94.anInt1537 = (-Class339.anInt4211 + -Class328.anInt4100 + (i_16_ + Class211.anInt2747))
                            Class318_Sub5.anInt6417 = (-Class348_Sub40_Sub8.anInt9157 + (i_17_ + Class348_Sub42_Sub9_Sub1.anInt10444 + -Class348_Sub3.anInt6568))
                            Class21.aHa326!!.DA(Class94.anInt1537, Class318_Sub5.anInt6417, Class193.anInt2590, Class129.anInt1879)
                        } else if (Class348_Sub49.anInt7207 == 1) {
                            Class193.anInt2590 = i_20_
                            Class94.anInt1537 = i_16_ + -Class328.anInt4100
                            Class318_Sub5.anInt6417 = -Class348_Sub3.anInt6568 + i_17_
                            Class129.anInt1879 = i_21_
                            Class21.aHa326!!.DA(Class94.anInt1537, Class318_Sub5.anInt6417, Class193.anInt2590, Class129.anInt1879)
                            Class21.aHa326!!.KA(Class339.anInt4211, Class348_Sub40_Sub8.anInt9157, (Class339.anInt4211 - -Class59_Sub1.anInt5283), (Class107.anInt1651 + Class348_Sub40_Sub8.anInt9157))
                        }
                        method1960(i_12_, i_4_, i_6_, i_5_, is_0_, is_3_, is_8_, is_9_, is_11_, `is`, i_2_, i_10_, i_7_, i_1_, bool, bool_13_, i_14_, if (Class348_Sub49.anInt7207 != 2) 2 else 0, Class348_Sub49.anInt7207 == 1)
                        Class21.aHa326!!.la()
                        Class21.aHa326!!.DA(i_16_, i_17_, i_18_, i_19_)
                        if (i == -2) break
                        anInt2986 = -82
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(
                        runtimeexception,
                        ("sj.D(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (is_0_ != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ',' + (if (is_3_ != null) "{...}" else "null") + ',' + i_4_ + ',' + i_5_ + ',' + bool + ',' + i_6_ + ',' + i_7_ + ',' + (if (is_8_ != null) "{...}" else "null") + ',' + (if (is_9_ != null) "{...}" else "null") + ',' + i_10_ + ',' + (if (is_11_ != null) "{...}" else "null") + ',' + i_12_ + ',' + bool_13_ + ',' + i_14_ + ')')
                    )
                }
                break
            } while (false)
        }

        @JvmStatic
        fun method1635(i: Int, class318_sub1_sub3_sub3: Class318_Sub1_Sub3_Sub3?) {
            try {
                anInt2983++
                do {
                    if ((class318_sub1_sub3_sub3!!.anInt10268) != -1) {
                        var class17 = (Class10.aClass87_191!!.method835(class318_sub1_sub3_sub3.anInt10268, 7))
                        if (class17 == null || class17.anIntArray237 == null) {
                            class318_sub1_sub3_sub3.aBoolean10213 = false
                            class318_sub1_sub3_sub3.anInt10268 = -1
                        } else {
                            class318_sub1_sub3_sub3.anInt10203++
                            if ((class318_sub1_sub3_sub3.anInt10245 < class17.anIntArray237.size) && ((class17.anIntArray267!![class318_sub1_sub3_sub3.anInt10245]) < class318_sub1_sub3_sub3.anInt10203)) {
                                class318_sub1_sub3_sub3.anInt10312++
                                class318_sub1_sub3_sub3.anInt10245++
                                class318_sub1_sub3_sub3.anInt10203 = 1
                                if (!class318_sub1_sub3_sub3.aBoolean10309) Class287.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10245), class17, -58)
                            }
                            if (class318_sub1_sub3_sub3.anInt10245 >= class17.anIntArray237.size) {
                                class318_sub1_sub3_sub3.anInt10245 = 0
                                class318_sub1_sub3_sub3.anInt10203 = 0
                                if (class318_sub1_sub3_sub3.aBoolean10213) {
                                    class318_sub1_sub3_sub3.anInt10268 = class318_sub1_sub3_sub3.method2422(72.toByte()).method1621((-16).toByte())
                                    if (class318_sub1_sub3_sub3.anInt10268 == -1) {
                                        class318_sub1_sub3_sub3.aBoolean10213 = false
                                        break
                                    }
                                    class17 = (Class10.aClass87_191!!.method835(class318_sub1_sub3_sub3.anInt10268, 7))
                                }
                                if (!class318_sub1_sub3_sub3.aBoolean10309) Class287.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10245), class17, -23)
                            }
                            class318_sub1_sub3_sub3.anInt10312 = class318_sub1_sub3_sub3.anInt10245 + 1
                            if (class17.anIntArray237 == null) {
                                class318_sub1_sub3_sub3.anInt10268 = -1
                                class318_sub1_sub3_sub3.aBoolean10213 = false
                            } else if (class318_sub1_sub3_sub3.anInt10312 >= class17.anIntArray237.size) class318_sub1_sub3_sub3.anInt10312 = 0
                        }
                    }
                } while (false)
                do {
                    if ((class318_sub1_sub3_sub3.anInt10269) != -1 && (Class367_Sub11.anInt7396 >= (class318_sub1_sub3_sub3.anInt10225))) {
                        val class368 = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(90.toByte(), class318_sub1_sub3_sub3.anInt10269))
                        val i_70_ = class368.anInt4503
                        if (i_70_ != -1) {
                            val class17 = Class10.aClass87_191!!.method835(i_70_, 7)
                            if (class368.aBoolean4487) {
                                if (class17.anInt262 == 3) {
                                    if (class318_sub1_sub3_sub3.anInt10322 > 0 && (class318_sub1_sub3_sub3.anInt10239 <= Class367_Sub11.anInt7396) && (Class367_Sub11.anInt7396 > (class318_sub1_sub3_sub3.anInt10300))) {
                                        class318_sub1_sub3_sub3.anInt10269 = -1
                                        break
                                    }
                                } else if (class17.anInt262 == 1 && class318_sub1_sub3_sub3.anInt10322 > 0 && (Class367_Sub11.anInt7396 >= (class318_sub1_sub3_sub3.anInt10239)) && (Class367_Sub11.anInt7396 > (class318_sub1_sub3_sub3.anInt10300))) {
                                    class318_sub1_sub3_sub3.anInt10225 = 1 + Class367_Sub11.anInt7396
                                    break
                                }
                            }
                            if (class17 != null && class17.anIntArray237 != null) {
                                if (class318_sub1_sub3_sub3.anInt10240 < 0) {
                                    class318_sub1_sub3_sub3.anInt10240 = 0
                                    if (!class318_sub1_sub3_sub3.aBoolean10309) Class287.method2178(class318_sub1_sub3_sub3, 0, class17, -89)
                                }
                                class318_sub1_sub3_sub3.anInt10243++
                                if ((class17.anIntArray237.size > class318_sub1_sub3_sub3.anInt10240) && ((class17.anIntArray267!![class318_sub1_sub3_sub3.anInt10240]) < class318_sub1_sub3_sub3.anInt10243)) {
                                    class318_sub1_sub3_sub3.anInt10240++
                                    class318_sub1_sub3_sub3.anInt10243 = 1
                                    if (!class318_sub1_sub3_sub3.aBoolean10309) Class287.method2178(class318_sub1_sub3_sub3, class318_sub1_sub3_sub3.anInt10240, class17, -17)
                                }
                                if (class318_sub1_sub3_sub3.anInt10240 >= class17.anIntArray237.size) {
                                    if (class368.aBoolean4487) {
                                        class318_sub1_sub3_sub3.anInt10305++
                                        class318_sub1_sub3_sub3.anInt10240 -= class17.anInt238
                                        if (class17.anInt244 <= (class318_sub1_sub3_sub3.anInt10305)) class318_sub1_sub3_sub3.anInt10269 = -1
                                        else if ((class318_sub1_sub3_sub3.anInt10240) >= 0 && ((class17.anIntArray237).size > (class318_sub1_sub3_sub3.anInt10240))) {
                                            if (!class318_sub1_sub3_sub3.aBoolean10309) Class287.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10240), class17, -70)
                                        } else class318_sub1_sub3_sub3.anInt10269 = -1
                                    } else class318_sub1_sub3_sub3.anInt10269 = -1
                                }
                                class318_sub1_sub3_sub3.anInt10283 = class318_sub1_sub3_sub3.anInt10240 - -1
                                if (class318_sub1_sub3_sub3.anInt10283 >= class17.anIntArray237.size) {
                                    if (class368.aBoolean4487) {
                                        class318_sub1_sub3_sub3.anInt10283 -= class17.anInt238
                                        if ((class318_sub1_sub3_sub3.anInt10305 - -1) >= class17.anInt244) class318_sub1_sub3_sub3.anInt10283 = -1
                                        else if ((class318_sub1_sub3_sub3.anInt10283) < 0 || ((class17.anIntArray237).size <= (class318_sub1_sub3_sub3.anInt10283))) class318_sub1_sub3_sub3.anInt10283 = -1
                                    } else class318_sub1_sub3_sub3.anInt10283 = -1
                                }
                            } else class318_sub1_sub3_sub3.anInt10269 = -1
                        } else class318_sub1_sub3_sub3.anInt10269 = -1
                    }
                } while (false)
                do {
                    if ((class318_sub1_sub3_sub3.anInt10291) != -1 && (class318_sub1_sub3_sub3.anInt10211 <= Class367_Sub11.anInt7396)) {
                        val class368 = (Class348_Sub40_Sub18.aClass319_9245!!.method2543(93.toByte(), class318_sub1_sub3_sub3.anInt10291))
                        val i_71_ = class368.anInt4503
                        if (i_71_ != -1) {
                            val class17 = Class10.aClass87_191!!.method835(i_71_, 7)
                            if (class368.aBoolean4487) {
                                if (class17.anInt262 != 3) {
                                    if (class17.anInt262 == 1 && class318_sub1_sub3_sub3.anInt10322 > 0 && (Class367_Sub11.anInt7396 >= (class318_sub1_sub3_sub3.anInt10239)) && (class318_sub1_sub3_sub3.anInt10300 < Class367_Sub11.anInt7396)) {
                                        class318_sub1_sub3_sub3.anInt10211 = Class367_Sub11.anInt7396 - -1
                                        break
                                    }
                                } else if (class318_sub1_sub3_sub3.anInt10322 > 0 && ((class318_sub1_sub3_sub3.anInt10239) <= Class367_Sub11.anInt7396) && ((class318_sub1_sub3_sub3.anInt10300) < Class367_Sub11.anInt7396)) {
                                    class318_sub1_sub3_sub3.anInt10291 = -1
                                    break
                                }
                            }
                            if (class17 == null || class17.anIntArray237 == null) class318_sub1_sub3_sub3.anInt10291 = -1
                            else {
                                if (class318_sub1_sub3_sub3.anInt10224 < 0) {
                                    class318_sub1_sub3_sub3.anInt10224 = 0
                                    if (!class318_sub1_sub3_sub3.aBoolean10309) Class287.method2178(class318_sub1_sub3_sub3, 0, class17, -70)
                                }
                                class318_sub1_sub3_sub3.anInt10273++
                                if ((class17.anIntArray237.size > class318_sub1_sub3_sub3.anInt10224) && ((class17.anIntArray267!![class318_sub1_sub3_sub3.anInt10224]) < class318_sub1_sub3_sub3.anInt10273)) {
                                    class318_sub1_sub3_sub3.anInt10224++
                                    class318_sub1_sub3_sub3.anInt10273 = 1
                                    if (!class318_sub1_sub3_sub3.aBoolean10309) Class287.method2178(class318_sub1_sub3_sub3, class318_sub1_sub3_sub3.anInt10224, class17, -114)
                                }
                                if (class17.anIntArray237.size <= class318_sub1_sub3_sub3.anInt10224) {
                                    if (class368.aBoolean4487) {
                                        class318_sub1_sub3_sub3.anInt10265++
                                        class318_sub1_sub3_sub3.anInt10224 -= class17.anInt238
                                        if (class17.anInt244 <= (class318_sub1_sub3_sub3.anInt10265)) class318_sub1_sub3_sub3.anInt10291 = -1
                                        else if ((class318_sub1_sub3_sub3.anInt10224) >= 0 && ((class318_sub1_sub3_sub3.anInt10224) < (class17.anIntArray237).size)) {
                                            if (!class318_sub1_sub3_sub3.aBoolean10309) Class287.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10224), class17, -92)
                                        } else class318_sub1_sub3_sub3.anInt10291 = -1
                                    } else class318_sub1_sub3_sub3.anInt10291 = -1
                                }
                                class318_sub1_sub3_sub3.anInt10276 = class318_sub1_sub3_sub3.anInt10224 - -1
                                if (class318_sub1_sub3_sub3.anInt10276 >= class17.anIntArray237.size) {
                                    if (class368.aBoolean4487) {
                                        class318_sub1_sub3_sub3.anInt10276 -= class17.anInt238
                                        if (1 + (class318_sub1_sub3_sub3.anInt10265) < class17.anInt244) {
                                            if ((class318_sub1_sub3_sub3.anInt10276) < 0 || ((class318_sub1_sub3_sub3.anInt10276) >= (class17.anIntArray237).size)) class318_sub1_sub3_sub3.anInt10276 = -1
                                        } else class318_sub1_sub3_sub3.anInt10276 = -1
                                    } else class318_sub1_sub3_sub3.anInt10276 = -1
                                }
                            }
                        } else class318_sub1_sub3_sub3.anInt10291 = -1
                    }
                } while (false)
                if ((class318_sub1_sub3_sub3.anInt10286 != -1) && (class318_sub1_sub3_sub3.anInt10218) <= 1) {
                    val class17 = (Class10.aClass87_191!!.method835((class318_sub1_sub3_sub3.anInt10286), 7))
                    if (class17.anInt262 != 3) {
                        if (class17.anInt262 == 1 && class318_sub1_sub3_sub3.anInt10322 > 0 && (class318_sub1_sub3_sub3.anInt10239) <= Class367_Sub11.anInt7396 && (class318_sub1_sub3_sub3.anInt10300) < Class367_Sub11.anInt7396) class318_sub1_sub3_sub3.anInt10218 = 2
                    } else if ((class318_sub1_sub3_sub3.anInt10322) > 0 && (class318_sub1_sub3_sub3.anInt10239 <= Class367_Sub11.anInt7396) && (Class367_Sub11.anInt7396 > class318_sub1_sub3_sub3.anInt10300)) {
                        class318_sub1_sub3_sub3.anInt10286 = -1
                        class318_sub1_sub3_sub3.anIntArray10236 = null
                    }
                }
                if ((class318_sub1_sub3_sub3.anInt10286 != -1) && (class318_sub1_sub3_sub3.anInt10218) == 0) {
                    val class17 = (Class10.aClass87_191!!.method835((class318_sub1_sub3_sub3.anInt10286), 7))
                    if (class17 == null || class17.anIntArray237 == null) {
                        class318_sub1_sub3_sub3.anInt10286 = -1
                        class318_sub1_sub3_sub3.anIntArray10236 = null
                    } else {
                        class318_sub1_sub3_sub3.anInt10232++
                        if ((class17.anIntArray237.size > (class318_sub1_sub3_sub3.anInt10267)) && (class318_sub1_sub3_sub3.anInt10232 > (class17.anIntArray267!![class318_sub1_sub3_sub3.anInt10267]))) {
                            class318_sub1_sub3_sub3.anInt10267++
                            class318_sub1_sub3_sub3.anInt10232 = 1
                            if (!class318_sub1_sub3_sub3.aBoolean10309) Class287.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10267), class17, -34)
                        }
                        if (class17.anIntArray237.size <= (class318_sub1_sub3_sub3.anInt10267)) {
                            class318_sub1_sub3_sub3.anInt10267 -= class17.anInt238
                            class318_sub1_sub3_sub3.anInt10294++
                            if (class17.anInt244 <= class318_sub1_sub3_sub3.anInt10294) {
                                class318_sub1_sub3_sub3.anIntArray10236 = null
                                class318_sub1_sub3_sub3.anInt10286 = -1
                            } else if (class318_sub1_sub3_sub3.anInt10267 < 0 || (class318_sub1_sub3_sub3.anInt10267 >= (class17.anIntArray237).size)) {
                                class318_sub1_sub3_sub3.anIntArray10236 = null
                                class318_sub1_sub3_sub3.anInt10286 = -1
                            } else if (!class318_sub1_sub3_sub3.aBoolean10309) Class287.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10267), class17, -88)
                        }
                        class318_sub1_sub3_sub3.anInt10244 = (class318_sub1_sub3_sub3.anInt10267) + 1
                        if (class17.anIntArray237.size <= (class318_sub1_sub3_sub3.anInt10244)) {
                            class318_sub1_sub3_sub3.anInt10244 -= class17.anInt238
                            if (class17.anInt244 <= 1 + class318_sub1_sub3_sub3.anInt10294) class318_sub1_sub3_sub3.anInt10244 = -1
                            else if (class318_sub1_sub3_sub3.anInt10244 < 0 || (class318_sub1_sub3_sub3.anInt10244 >= class17.anIntArray237.size)) class318_sub1_sub3_sub3.anInt10244 = -1
                        }
                    }
                }
                val i_72_ = -86 / ((-18 - i) / 51)
                if (class318_sub1_sub3_sub3.anInt10218 > 0) class318_sub1_sub3_sub3.anInt10218--
                var i_73_ = 0
                while (((class318_sub1_sub3_sub3.aClass182Array10308)!!.size > i_73_)) {
                    val class182 = (class318_sub1_sub3_sub3.aClass182Array10308!![i_73_])
                    if (class182 != null) {
                        if (class182.anInt2448 > 0) class182.anInt2448--
                        else {
                            val class17 = Class10.aClass87_191!!.method835((class182.anInt2454), 7)
                            if (class17 == null || class17.anIntArray237 == null) class318_sub1_sub3_sub3.aClass182Array10308!![i_73_] = null
                            else {
                                class182.anInt2456++
                                if ((class17.anIntArray237.size > class182.anInt2451) && (class182.anInt2456 > (class17.anIntArray267!![class182.anInt2451]))) {
                                    class182.anInt2451++
                                    class182.anInt2456 = 1
                                    if (!class318_sub1_sub3_sub3.aBoolean10309) Class287.method2178(class318_sub1_sub3_sub3, class182.anInt2451, class17, -108)
                                }
                                if (class182.anInt2451 >= class17.anIntArray237.size) {
                                    class182.anInt2451 -= class17.anInt238
                                    class182.anInt2445++
                                    if (class17.anInt244 > class182.anInt2445) {
                                        if (class182.anInt2451 < 0 || ((class17.anIntArray237).size <= (class182.anInt2451))) class318_sub1_sub3_sub3.aClass182Array10308!![i_73_] = null
                                        else if (!class318_sub1_sub3_sub3.aBoolean10309) Class287.method2178(class318_sub1_sub3_sub3, class182.anInt2451, class17, -46)
                                    } else class318_sub1_sub3_sub3.aClass182Array10308!![i_73_] = null
                                }
                                class182.anInt2455 = 1 + class182.anInt2451
                                if (class182.anInt2455 >= class17.anIntArray237.size) {
                                    class182.anInt2455 -= class17.anInt238
                                    if (class17.anInt244 > class182.anInt2445 - -1) {
                                        if (class182.anInt2455 < 0 || ((class17.anIntArray237).size <= (class182.anInt2455))) class182.anInt2455 = -1
                                    } else class182.anInt2455 = -1
                                }
                            }
                        }
                    }
                    i_73_++
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("sj.A(" + i + ',' + (if (class318_sub1_sub3_sub3 != null) "{...}" else "null") + ')'))
            }
        }

        fun method1636(i: Int, i_74_: Int, i_75_: Int, i_76_: Int, i_77_: Int, i_78_: Int, i_79_: Int): Class299? {
            anInt2988++
            val l = (i_76_.toLong() * 76724863L xor (i.toLong() * 32147369L xor (i_74_.toLong() * 986053L xor (i_75_.toLong() * 67481L xor i_77_.toLong() * 97549L xor i_79_.toLong() * 475427L))))
            var class299 = Class375.aClass60_4543!!.method583(l, 90) as Class299?
            if (class299 != null) return class299
            class299 = Class60.aHa1098!!.method3697(i_75_, i_77_, i_79_, i_74_, i, i_76_)
            if (i_78_ != -1) method1636(58, 63, -99, -89, -7, 18, 71)
            Class375.aClass60_4543!!.method582(class299, l, (-106).toByte())
            return class299
        }

        fun method1637(i: Int, i_80_: Int, i_81_: Int): Boolean {
            anInt2984++
            if (i_80_ != 32768) return true
            return (0x8000 and i_81_) != 0
        }
    }
}
