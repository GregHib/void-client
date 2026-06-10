import Class111.Companion.method1045
import Class119_Sub2.Companion.method1079
import Class139.Companion.method1166
import Class149.method1201
import Class16.method258
import Class177.Companion.method1353
import Class223.Companion.method1614
import Class231.Companion.method1639
import Class239_Sub21.Companion.method1810
import Class258_Sub3.Companion.method1966
import Class286_Sub7.Companion.method2168
import Class314.Companion.method2336
import Class348_Sub16_Sub3.Companion.method2878
import Class348_Sub16_Sub3.Companion.method2879
import Class348_Sub23_Sub4.Companion.method2987
import Class348_Sub40_Sub32.Companion.method3135
import Class348_Sub40_Sub4.Companion.method3058
import Class348_Sub42_Sub16.Companion.method3254
import Class44.method388
import Class58.Companion.method536
import Class5_Sub2.Companion.method192
import Class75_Sub1.method770
import Class87.Companion.method837
import Class89.Companion.method850
import r_Sub2.Companion.method3297

/* Class237_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class237_Sub1 internal constructor(i: Int, i_114_: Int, i_115_: Int, bool: Boolean) : Class237(i, i_114_, i_115_, bool, Class229.aClass268_2979, Class362.aClass183_4460) {
    var anInt5824: Int = 99
    fun method1689(i: Int, i_0_: Int, i_1_: Int, var_ha: ha?, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, class361: Class361?) {
        try {
            anInt5823++
            if (Class316.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(i_3_ xor 0x7e6f.inv()) != 0 || method536(i_5_, false, i, Class167.anInt2204, i_2_)) {
                if (this.anInt5824 > i_0_) this.anInt5824 = i_0_
                val class51 = Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, i_1_)
                if (Class316.aClass348_Sub51_3959!!.aClass239_Sub24_7235!!.method1820(i_3_ + -32400) != 0 || !class51.aBoolean931) {
                    val i_8_: Int
                    val i_9_: Int
                    if (i_7_ == 1 || i_7_ == 3) {
                        i_8_ = class51.anInt961
                        i_9_ = class51.anInt926
                    } else {
                        i_8_ = class51.anInt926
                        i_9_ = class51.anInt961
                    }
                    if (i_3_ != 50) method1695(null, null, -32, null, -51, 80)
                    val i_10_: Int
                    val i_11_: Int
                    if (i - -i_9_ <= this.anInt3117) {
                        i_10_ = (i_9_ shr 1) + i
                        i_11_ = i + (1 + i_9_ shr 1)
                    } else {
                        i_10_ = i
                        i_11_ = 1 + i
                    }
                    val i_12_: Int
                    val i_13_: Int
                    if (this.anInt3114 < i_8_ + i_5_) {
                        i_12_ = i_5_ + 1
                        i_13_ = i_5_
                    } else {
                        i_12_ = (1 + i_8_ shr 1) + i_5_
                        i_13_ = (i_8_ shr 1) + i_5_
                    }
                    val var_s = aa_Sub1.aSArray5191!![i_2_]
                    val i_14_ = ((var_s!!.method3982((-86).toByte(), i_13_, i_10_) + var_s.method3982((-86).toByte(), i_13_, i_11_) - (-var_s.method3982((-86).toByte(), i_12_, i_10_) - var_s.method3982((-86).toByte(), i_12_, i_11_))) shr 2)
                    val i_15_ = (i shl 9) - -(i_9_ shl 8)
                    val i_16_ = (i_8_ shl 8) + (i_5_ shl 9)
                    val bool = (Class348_Sub42_Sub3.aBoolean9498 && !this.aBoolean3109 && class51.aBoolean906)
                    if (class51.method474(82.toByte())) method1614(979190089, null, i_0_, i_5_, i, null, class51, i_7_)
                    val bool_17_ = (i_6_ == -1 && class51.anInt868 == -1 && class51.anIntArray943 == null && class51.anIntArray945 == null && !class51.aBoolean929)
                    if (!Class49.aBoolean4728 || ((!Class140.method1172((-85).toByte(), i_4_) || class51.anInt955 == 1) && (!method1639(i_4_, i_3_ xor 0x3918) || class51.anInt955 != 0))) {
                        if (i_4_ == 22) {
                            if ((Class316.aClass348_Sub51_3959!!.aClass239_Sub4_7220!!.method1737(-32350) != 0) || (class51.anInt874 != 0) || (class51.anInt920 == 1) || class51.aBoolean947) {
                                val class318_sub1_sub1: Class318_Sub1_Sub1?
                                if (bool_17_) {
                                    val class318_sub1_sub1_sub2 = (Class318_Sub1_Sub1_Sub2(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i_7_, bool))
                                    class318_sub1_sub1 = class318_sub1_sub1_sub2
                                    if (class318_sub1_sub1_sub2.method38(-18443)) class318_sub1_sub1_sub2.method44(836, var_ha)
                                } else class318_sub1_sub1 = (Class318_Sub1_Sub1_Sub1(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i_7_, i_6_))
                                method770(i_0_, i, i_5_, class318_sub1_sub1)
                                if (class51.anInt920 == 1 && class361 != null) class361.method3496(i_5_, i, 1)
                            }
                        } else if (i_4_ == 10 || i_4_ == 11) {
                            var class318_sub1_sub3_sub1: Class318_Sub1_Sub3_Sub1? = null
                            val class318_sub1_sub3: Class318_Sub1_Sub3?
                            var i_18_: Int
                            if (bool_17_) {
                                val class318_sub1_sub3_sub1_19_ = (Class318_Sub1_Sub3_Sub1(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i, i_9_ + (i + -1), i_5_, -1 + (i_8_ + i_5_), i_4_, i_7_, bool))
                                class318_sub1_sub3 = class318_sub1_sub3_sub1_19_
                                class318_sub1_sub3_sub1 = class318_sub1_sub3_sub1_19_
                                i_18_ = class318_sub1_sub3_sub1_19_.method2416(15)
                            } else {
                                i_18_ = 15
                                class318_sub1_sub3 = (Class318_Sub1_Sub3_Sub2(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i, i_9_ + (i + -1), i_5_, -1 + (i_5_ + i_8_), i_4_, i_7_, i_6_))
                            }
                            if (method850(class318_sub1_sub3, false)) {
                                if (class318_sub1_sub3_sub1 != null && class318_sub1_sub3_sub1.method38(-18443)) class318_sub1_sub3_sub1.method44(836, var_ha)
                                if (class51.aBoolean918 && Class348_Sub42_Sub3.aBoolean9498) {
                                    if (i_18_ > 30) i_18_ = 30
                                    var i_20_ = 0
                                    while ((i_20_ <= i_9_)) {
                                        var i_21_ = 0
                                        while (i_8_ >= i_21_) {
                                            var_s.ka(i_20_ + i, i_5_ + i_21_, i_18_)
                                            i_21_++
                                        }
                                        i_20_++
                                    }
                                }
                            }
                            if ((class51.anInt920 != 0) && class361 != null) class361.method3505(!(class51.aBoolean876), i_9_, i_5_, true, i, (class51.aBoolean896), i_8_)
                        } else if (i_4_ >= 12 && i_4_ <= 17 || (i_4_ >= 18 && i_4_ <= 21)) {
                            val class318_sub1_sub3: Class318_Sub1_Sub3?
                            if (bool_17_) {
                                val class318_sub1_sub3_sub1 = (Class318_Sub1_Sub3_Sub1(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i, -1 + (i_9_ + i), i_5_, -1 + i_5_ + i_8_, i_4_, i_7_, bool))
                                class318_sub1_sub3 = class318_sub1_sub3_sub1
                                if (class318_sub1_sub3_sub1.method38(-18443)) class318_sub1_sub3_sub1.method44(i_3_ + 786, var_ha)
                            } else class318_sub1_sub3 = (Class318_Sub1_Sub3_Sub2(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i, i + (i_9_ - 1), i_5_, i_5_ - (-i_8_ - -1), i_4_, i_7_, i_6_))
                            method850(class318_sub1_sub3, false)
                            if (Class348_Sub42_Sub3.aBoolean9498 && !this.aBoolean3109 && i_4_ >= 12 && i_4_ <= 17 && i_4_ != 13 && i_0_ > 0 && (class51.anInt955 != 0)) this.aByteArrayArrayArray3108!![i_0_]!![i]!![i_5_] = (Class273.method2057((this.aByteArrayArrayArray3108!![i_0_]!![i]!![i_5_]).toInt(), 4)).toByte()
                            if ((class51.anInt920 != 0) && class361 != null) class361.method3505(!(class51.aBoolean876), i_9_, i_5_, true, i, (class51.aBoolean896), i_8_)
                        } else if (i_4_ == 0) {
                            var i_22_ = class51.anInt955
                            if (Class348_Sub40_Sub10.aBoolean9184 && (class51.anInt955 == -1)) i_22_ = 1
                            val class318_sub1_sub4: Class318_Sub1_Sub4?
                            if (bool_17_) {
                                val class318_sub1_sub4_sub1 = (Class318_Sub1_Sub4_Sub1(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i_4_, i_7_, bool))
                                if (class318_sub1_sub4_sub1.method38(-18443)) class318_sub1_sub4_sub1.method44(836, var_ha)
                                class318_sub1_sub4 = class318_sub1_sub4_sub1
                            } else class318_sub1_sub4 = (Class318_Sub1_Sub4_Sub2(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i_4_, i_7_, i_6_))
                            method3254(i_0_, i, i_5_, class318_sub1_sub4, null)
                            if (i_7_ == 0) {
                                if (Class348_Sub42_Sub3.aBoolean9498 && class51.aBoolean918) {
                                    var_s.ka(i, i_5_, 50)
                                    var_s.ka(i, i_5_ - -1, 50)
                                }
                                if (i_22_ == 1 && !this.aBoolean3109) method1810(i, class51.anInt953, class51.anInt909, i_5_, i_3_ + -51, i_0_, 1)
                            } else if (i_7_ == 1) {
                                if (Class348_Sub42_Sub3.aBoolean9498 && class51.aBoolean918) {
                                    var_s.ka(i, 1 + i_5_, 50)
                                    var_s.ka(1 + i, 1 + i_5_, 50)
                                }
                                if (i_22_ == 1 && !this.aBoolean3109) method1810(i, -class51.anInt953, class51.anInt909, 1 + i_5_, -1, i_0_, 2)
                            } else if (i_7_ == 2) {
                                if (Class348_Sub42_Sub3.aBoolean9498 && class51.aBoolean918) {
                                    var_s.ka(i - -1, i_5_, 50)
                                    var_s.ka(1 + i, 1 + i_5_, 50)
                                }
                                if (i_22_ == 1 && !this.aBoolean3109) method1810(1 + i, -class51.anInt953, class51.anInt909, i_5_, i_3_ + -51, i_0_, 1)
                            } else if (i_7_ == 3) {
                                if (Class348_Sub42_Sub3.aBoolean9498 && class51.aBoolean918) {
                                    var_s.ka(i, i_5_, 50)
                                    var_s.ka(1 + i, i_5_, 50)
                                }
                                if (i_22_ == 1 && !this.aBoolean3109) method1810(i, class51.anInt953, class51.anInt909, i_5_, -1, i_0_, 2)
                            }
                            if (class51.anInt920 != 0 && class361 != null) class361.method3510(i_5_, i, i_3_ xor 0x1b.inv(), i_4_, i_7_, !(class51.aBoolean876), (class51.aBoolean896))
                            if (class51.anInt883 != 64) Class240.method1852(i_0_, i, i_5_, (class51.anInt883))
                        } else if (i_4_ == 1) {
                            val class318_sub1_sub4: Class318_Sub1_Sub4?
                            if (bool_17_) {
                                val class318_sub1_sub4_sub1 = (Class318_Sub1_Sub4_Sub1(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i_4_, i_7_, bool))
                                if (class318_sub1_sub4_sub1.method38(-18443)) class318_sub1_sub4_sub1.method44(836, var_ha)
                                class318_sub1_sub4 = class318_sub1_sub4_sub1
                            } else class318_sub1_sub4 = (Class318_Sub1_Sub4_Sub2(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i_4_, i_7_, i_6_))
                            method3254(i_0_, i, i_5_, class318_sub1_sub4, null)
                            if (class51.aBoolean918 && Class348_Sub42_Sub3.aBoolean9498) {
                                if (i_7_ == 0) var_s.ka(i, i_5_ + 1, 50)
                                else if (i_7_ != 1) {
                                    if (i_7_ != 2) {
                                        if (i_7_ == 3) var_s.ka(i, i_5_, 50)
                                    } else var_s.ka(1 + i, i_5_, 50)
                                } else var_s.ka(1 + i, 1 + i_5_, 50)
                            }
                            if ((class51.anInt920 != 0) && class361 != null) class361.method3510(i_5_, i, -63, i_4_, i_7_, !(class51.aBoolean876), (class51.aBoolean896))
                        } else if (i_4_ == 2) {
                            val i_23_ = i_7_ - -1 and 0x3
                            val class318_sub1_sub4: Class318_Sub1_Sub4?
                            val class318_sub1_sub4_24_: Class318_Sub1_Sub4?
                            if (bool_17_) {
                                val class318_sub1_sub4_sub1 = (Class318_Sub1_Sub4_Sub1(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i_4_, 4 + i_7_, bool))
                                val class318_sub1_sub4_sub1_25_ = (Class318_Sub1_Sub4_Sub1(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i_4_, i_23_, bool))
                                if (class318_sub1_sub4_sub1.method38(-18443)) class318_sub1_sub4_sub1.method44(836, var_ha)
                                class318_sub1_sub4_24_ = class318_sub1_sub4_sub1_25_
                                class318_sub1_sub4 = class318_sub1_sub4_sub1
                                if (class318_sub1_sub4_sub1_25_.method38(i_3_ xor 0x4838.inv())) class318_sub1_sub4_sub1_25_.method44(836, var_ha)
                            } else {
                                class318_sub1_sub4 = (Class318_Sub1_Sub4_Sub2(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i_4_, i_7_ + 4, i_6_))
                                class318_sub1_sub4_24_ = (Class318_Sub1_Sub4_Sub2(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i_4_, i_23_, i_6_))
                            }
                            method3254(i_0_, i, i_5_, class318_sub1_sub4, class318_sub1_sub4_24_)
                            if (((class51.anInt955 == 1) || (Class348_Sub40_Sub10.aBoolean9184 && class51.anInt955 == -1)) && !this.aBoolean3109) {
                                if (i_7_ == 0) {
                                    method1810(i, class51.anInt953, class51.anInt909, i_5_, -1, i_0_, 1)
                                    method1810(i, class51.anInt953, class51.anInt909, 1 + i_5_, -1, i_0_, 2)
                                } else if (i_7_ == 1) {
                                    method1810(1 + i, class51.anInt953, class51.anInt909, i_5_, -1, i_0_, 1)
                                    method1810(i, class51.anInt953, class51.anInt909, i_5_ + 1, -1, i_0_, 2)
                                } else if (i_7_ == 2) {
                                    method1810(1 + i, class51.anInt953, class51.anInt909, i_5_, -1, i_0_, 1)
                                    method1810(i, class51.anInt953, class51.anInt909, i_5_, -1, i_0_, 2)
                                } else if (i_7_ == 3) {
                                    method1810(i, (class51.anInt953), (class51.anInt909), i_5_, -1, i_0_, 1)
                                    method1810(i, (class51.anInt953), (class51.anInt909), i_5_, -1, i_0_, 2)
                                }
                            }
                            if ((class51.anInt920 != 0) && class361 != null) class361.method3510(i_5_, i, -102, i_4_, i_7_, !(class51.aBoolean876), (class51.aBoolean896))
                            if (class51.anInt883 != 64) Class240.method1852(i_0_, i, i_5_, (class51.anInt883))
                        } else if (i_4_ == 3) {
                            val class318_sub1_sub4: Class318_Sub1_Sub4?
                            if (bool_17_) {
                                val class318_sub1_sub4_sub1 = (Class318_Sub1_Sub4_Sub1(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i_4_, i_7_, bool))
                                if (class318_sub1_sub4_sub1.method38(i_3_ + -18493)) class318_sub1_sub4_sub1.method44(836, var_ha)
                                class318_sub1_sub4 = class318_sub1_sub4_sub1
                            } else class318_sub1_sub4 = (Class318_Sub1_Sub4_Sub2(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i_4_, i_7_, i_6_))
                            method3254(i_0_, i, i_5_, class318_sub1_sub4, null)
                            if (class51.aBoolean918 && Class348_Sub42_Sub3.aBoolean9498) {
                                if (i_7_ == 0) var_s.ka(i, 1 + i_5_, 50)
                                else if (i_7_ == 1) var_s.ka(1 + i, 1 + i_5_, 50)
                                else if (i_7_ != 2) {
                                    if (i_7_ == 3) var_s.ka(i, i_5_, 50)
                                } else var_s.ka(i + 1, i_5_, 50)
                            }
                            if ((class51.anInt920 != 0) && class361 != null) class361.method3510(i_5_, i, i_3_ xor 0x46.inv(), i_4_, i_7_, !(class51.aBoolean876), (class51.aBoolean896))
                        } else if (i_4_ == 9) {
                            val class318_sub1_sub3: Class318_Sub1_Sub3?
                            if (bool_17_) {
                                val class318_sub1_sub3_sub1 = (Class318_Sub1_Sub3_Sub1(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i, i, i_5_, i_5_, i_4_, i_7_, bool))
                                if (class318_sub1_sub3_sub1.method38(i_3_ + -18493)) class318_sub1_sub3_sub1.method44(836, var_ha)
                                class318_sub1_sub3 = class318_sub1_sub3_sub1
                            } else class318_sub1_sub3 = (Class318_Sub1_Sub3_Sub2(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i, -1 + i + i_9_, i_5_, i_5_ + (i_8_ - 1), i_4_, i_7_, i_6_))
                            method850(class318_sub1_sub3, false)
                            if ((class51.anInt955 == 1) && !this.aBoolean3109) {
                                val i_26_: Int
                                if ((i_7_ and 0x1) == 0) i_26_ = 8
                                else i_26_ = 16
                                method1810(i, 0, (class51.anInt909), i_5_, -1, i_0_, i_26_)
                            }
                            if (class51.anInt920 != 0 && class361 != null) class361.method3505(!(class51.aBoolean876), i_9_, i_5_, true, i, (class51.aBoolean896), i_8_)
                            if (class51.anInt883 != 64) Class240.method1852(i_0_, i, i_5_, (class51.anInt883))
                        } else if (i_4_ == 4) {
                            val class318_sub1_sub5: Class318_Sub1_Sub5?
                            if (bool_17_) {
                                val class318_sub1_sub5_sub1 = (Class318_Sub1_Sub5_Sub1(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, 0, 0, i_4_, i_7_))
                                if (class318_sub1_sub5_sub1.method38(-18443)) class318_sub1_sub5_sub1.method44(i_3_ + 786, var_ha)
                                class318_sub1_sub5 = class318_sub1_sub5_sub1
                            } else class318_sub1_sub5 = (Class318_Sub1_Sub5_Sub2(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, 0, 0, i_4_, i_7_, i_6_))
                            method388(i_0_, i, i_5_, class318_sub1_sub5, null)
                        } else if (i_4_ == 5) {
                            var i_27_ = 65
                            val interface10 = (method3297(i_0_, i, i_5_) as Interface10?)
                            if (interface10 != null) i_27_ = 1 + (Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, interface10.method42(-93)).anInt883)
                            val class318_sub1_sub5: Class318_Sub1_Sub5?
                            if (bool_17_) {
                                val class318_sub1_sub5_sub1 = (Class318_Sub1_Sub5_Sub1(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i_27_ * Class148.anIntArray2039!![i_7_], (Class348_Sub40_Sub16.anIntArray9230!![i_7_]) * i_27_, i_4_, i_7_))
                                if (class318_sub1_sub5_sub1.method38(-18443)) class318_sub1_sub5_sub1.method44(836, var_ha)
                                class318_sub1_sub5 = class318_sub1_sub5_sub1
                            } else class318_sub1_sub5 = (Class318_Sub1_Sub5_Sub2(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, Class148.anIntArray2039!![i_7_] * i_27_, i_27_ * (Class348_Sub40_Sub16.anIntArray9230!![i_7_]), i_4_, i_7_, i_6_))
                            method388(i_0_, i, i_5_, class318_sub1_sub5, null)
                        } else if (i_4_ == 6) {
                            var i_28_ = 33
                            val interface10 = (method3297(i_0_, i, i_5_) as Interface10?)
                            if (interface10 != null) i_28_ = 1 + (Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, interface10.method42(-117)).anInt883) / 2
                            val class318_sub1_sub5: Class318_Sub1_Sub5?
                            if (bool_17_) {
                                val class318_sub1_sub5_sub1 = (Class318_Sub1_Sub5_Sub1(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i_28_ * Class148.anIntArray2039!![i_7_], (Class348_Sub40_Sub16.anIntArray9230!![i_7_]) * i_28_, i_4_, 4 + i_7_))
                                if (class318_sub1_sub5_sub1.method38(-18443)) class318_sub1_sub5_sub1.method44(836, var_ha)
                                class318_sub1_sub5 = class318_sub1_sub5_sub1
                            } else class318_sub1_sub5 = (Class318_Sub1_Sub5_Sub2(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, (OutputStream_Sub1.anIntArray99!![i_7_] * i_28_), i_28_ * Class273.anIntArray5165!![i_7_], i_4_, 4 + i_7_, i_6_))
                            method388(i_0_, i, i_5_, class318_sub1_sub5, null)
                        } else if (i_4_ == 7) {
                            val i_29_ = 0x3 and 2 + i_7_
                            val class318_sub1_sub5: Class318_Sub1_Sub5?
                            if (bool_17_) {
                                val class318_sub1_sub5_sub1 = (Class318_Sub1_Sub5_Sub1(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, 0, 0, i_4_, 4 + i_29_))
                                if (class318_sub1_sub5_sub1.method38(i_3_ xor 0x4838.inv())) class318_sub1_sub5_sub1.method44(836, var_ha)
                                class318_sub1_sub5 = class318_sub1_sub5_sub1
                            } else class318_sub1_sub5 = (Class318_Sub1_Sub5_Sub2(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, 0, 0, i_4_, 4 + i_29_, i_6_))
                            method388(i_0_, i, i_5_, class318_sub1_sub5, null)
                        } else if (i_4_ == 8) {
                            val i_30_ = 2 + i_7_ and 0x3
                            var i_31_ = 33
                            val interface10 = (method3297(i_0_, i, i_5_) as Interface10?)
                            if (interface10 != null) i_31_ = (Class348_Sub40_Sub12.aClass263_9195!!.method2005(i_3_ + -50, interface10.method42(-122)).anInt883) / 2 + 1
                            val class318_sub1_sub5: Class318_Sub1_Sub5?
                            val class318_sub1_sub5_32_: Class318_Sub1_Sub5?
                            if (bool_17_) {
                                val class318_sub1_sub5_sub1 = (Class318_Sub1_Sub5_Sub1(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i_31_ * (OutputStream_Sub1.anIntArray99!![i_7_]), Class273.anIntArray5165!![i_7_] * i_31_, i_4_, 4 + i_7_))
                                val class318_sub1_sub5_sub1_34_ = (Class318_Sub1_Sub5_Sub1(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, 0, 0, i_4_, 4 + i_30_))
                                if (class318_sub1_sub5_sub1.method38(-18443)) class318_sub1_sub5_sub1.method44(836, var_ha)
                                if (class318_sub1_sub5_sub1_34_.method38(i_3_ xor 0x4838.inv())) class318_sub1_sub5_sub1_34_.method44(836, var_ha)
                                class318_sub1_sub5 = class318_sub1_sub5_sub1_34_
                                class318_sub1_sub5_32_ = class318_sub1_sub5_sub1
                            } else {
                                val class318_sub1_sub5_sub2 = (Class318_Sub1_Sub5_Sub2(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, i_31_ * (OutputStream_Sub1.anIntArray99!![i_7_]), i_31_ * Class273.anIntArray5165!![i_7_], i_4_, i_7_ - -4, i_6_))
                                val class318_sub1_sub5_sub2_33_ = (Class318_Sub1_Sub5_Sub2(var_ha, class51, i_0_, i_2_, i_15_, i_14_, i_16_, this.aBoolean3109, 0, 0, i_4_, i_30_ + 4, i_6_))
                                class318_sub1_sub5_32_ = class318_sub1_sub5_sub2
                                class318_sub1_sub5 = class318_sub1_sub5_sub2_33_
                            }
                            method388(i_0_, i, i_5_, class318_sub1_sub5_32_, class318_sub1_sub5)
                        }
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("vaa.W(" + i + ',' + i_0_ + ',' + i_1_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + (if (class361 != null) "{...}" else "null") + ')'))
        }
    }

    private fun method1690(i: Int, i_35_: Int, i_36_: Int, i_37_: Int, i_38_: Int): Interface10? {
        anInt5822++
        var interface10: Interface10? = null
        if (i == 0) interface10 = method3297(i_37_, i_36_, i_35_) as Interface10?
        if (i == 1) interface10 = method3135(i_37_, i_36_, i_35_) as Interface10?
        if (i == 2) interface10 = (method1353(i_37_, i_36_, i_35_, (if (aClass5827 != null) aClass5827 else (Interface10::class.java.also { aClass5827 = it }))) as Interface10?)
        if (i_38_ != 30987) method1698(-120)
        if (i == 3) interface10 = method2878(i_37_, i_36_, i_35_) as Interface10?
        return interface10
    }

    fun method1691(i: Int, var_ha: ha?, class348_sub49: Class348_Sub49?, `is`: IntArray?, i_39_: Int, i_40_: Byte) {
        do {
            try {
                anInt5818++
                if (!this.aBoolean3109) {
                    var bool = false
                    var class190: Class190? = null
                    val i_41_ = -112 / ((-71 - i_40_) / 38)
                    if (`is` != null) `is`[0] = -1
                    while (class348_sub49!!.anInt7197 < (class348_sub49.aByteArray7154)!!.size) {
                        val i_42_ = class348_sub49.readUnsignedByte(255)
                        if (i_42_ == 0) class190 = Class190(class348_sub49)
                        else if (i_42_ == 1) {
                            val i_58_ = class348_sub49.readUnsignedByte(255)
                            if (i_58_ > 0) {
                                var i_59_ = 0
                                while (i_58_ > i_59_) {
                                    val class211 = Class211(var_ha, class348_sub49, 2)
                                    if (class211.anInt2734 == 31) {
                                        val class253 = (Class348_Sub1.aClass185_6559!!.method1391((-1).toByte(), class348_sub49.readUnsignedShort(842397944)))
                                        class211.method1539(class253.anInt3251, 115.toByte(), class253.anInt3249, class253.anInt3245, class253.anInt3244)
                                    }
                                    if (var_ha!!.method3704() > 0) {
                                        val class348_sub1 = (class211.aClass348_Sub1_2745)
                                        val i_60_ = ((i_39_ shl 9) + class348_sub1!!.method2724(-1))
                                        val i_61_ = (class348_sub1.method2717(93.toByte()) + (i shl 9))
                                        val i_62_ = i_60_ shr 9
                                        val i_63_ = i_61_ shr 9
                                        if (i_62_ >= 0 && i_63_ >= 0 && (this.anInt3117 > i_62_) && (this.anInt3114 > i_63_)) {
                                            class348_sub1.method2725(i_60_, 70.toByte(), i_61_, ((this.anIntArrayArrayArray3122!![(class211.anInt2731)]!![i_62_]!![i_63_]) + -class348_sub1.method2722(120)))
                                            Class348_Sub42_Sub19.method3276(class211)
                                        }
                                    }
                                    i_59_++
                                }
                            }
                        } else if (i_42_ == 2) {
                            if (class190 == null) class190 = Class190()
                            class190.method1423(8, class348_sub49)
                        } else if (i_42_ != 128) {
                            if (i_42_ == 129) {
                                if ((this.aByteArrayArrayArray3104) == null) this.aByteArrayArrayArray3104 = arrayOfNulls<Array<ByteArray?>>(4)
                                for (i_43_ in 0..3) {
                                    val i_44_ = class348_sub49.readByte(-102)
                                    if (i_44_.toInt() != 0 || (this.aByteArrayArrayArray3104!![i_43_]) == null) {
                                        if (i_44_.toInt() == 1) {
                                            if ((this.aByteArrayArrayArray3104!![i_43_]) == null) this.aByteArrayArrayArray3104!![i_43_] = (Array<ByteArray?>(1 + (this.anInt3117)) { ByteArray(1 + (this.anInt3114)) })
                                            var i_49_ = 0
                                            while ((i_49_ < 64)) {
                                                var i_50_ = 0
                                                while ((i_50_ < 64)) {
                                                    val i_51_ = (class348_sub49.readByte(-103))
                                                    var i_52_ = (i_49_ + i_39_)
                                                    while ((i_52_ < (4 + i_49_ + i_39_))) {
                                                        var i_53_ = i + i_50_
                                                        while (((4 + i + i_50_) > i_53_)) {
                                                            if (i_52_ >= 0 && (this.anInt3117 > i_52_) && (i_53_ >= 0) && (i_53_ < (this.anInt3114))) this.aByteArrayArrayArray3104!![i_43_]!![i_52_]!![i_53_] = i_51_
                                                            i_53_++
                                                        }
                                                        i_52_++
                                                    }
                                                    i_50_ += 4
                                                }
                                                i_49_ += 4
                                            }
                                        } else if (i_44_.toInt() == 2) {
                                            if ((this.aByteArrayArrayArray3104!![i_43_]) == null) this.aByteArrayArrayArray3104!![i_43_] = (Array<ByteArray?>(((this.anInt3117) - -1)) { ByteArray(((this.anInt3114) + 1)) })
                                            if (i_43_ > 0) {
                                                var i_45_ = i_39_
                                                var i_46_ = 64 + i_39_
                                                var i_47_ = i
                                                if (i_46_ >= 0) {
                                                    if ((this.anInt3117) <= i_46_) i_46_ = (this.anInt3117)
                                                } else i_46_ = 0
                                                if (i_47_ < 0) i_47_ = 0
                                                else if ((this.anInt3114) <= i_47_) i_47_ = (this.anInt3114)
                                                var i_48_ = 64 + i
                                                if (i_45_ >= 0) {
                                                    if ((this.anInt3117) <= i_45_) i_45_ = (this.anInt3117)
                                                } else i_45_ = 0
                                                if (i_48_ >= 0) {
                                                    if (i_48_ >= (this.anInt3114)) i_48_ = (this.anInt3114)
                                                } else i_48_ = 0
                                                while ( /**/(i_46_ > i_45_)) {
                                                    while ( /**/(i_48_ > i_47_)) {
                                                        this.aByteArrayArrayArray3104!![i_43_]!![i_45_]!![i_47_] = (this.aByteArrayArrayArray3104!![(-1 + i_43_)]!![i_45_]!![i_47_])
                                                        i_47_++
                                                    }
                                                    i_45_++
                                                }
                                            }
                                        }
                                    } else {
                                        var i_54_ = i_39_
                                        var i_55_ = i_39_ - -64
                                        var i_56_ = i
                                        if (i_56_ < 0) i_56_ = 0
                                        else if ((this.anInt3114) <= i_56_) i_56_ = (this.anInt3114)
                                        if (i_54_ >= 0) {
                                            if ((this.anInt3117) <= i_54_) i_54_ = (this.anInt3117)
                                        } else i_54_ = 0
                                        var i_57_ = i - -64
                                        if (i_55_ < 0) i_55_ = 0
                                        else if (i_55_ >= (this.anInt3117)) i_55_ = (this.anInt3117)
                                        if (i_57_ < 0) i_57_ = 0
                                        else if ((this.anInt3114) <= i_57_) i_57_ = (this.anInt3114)
                                        while ( /**/i_54_ < i_55_) {
                                            while ( /**/i_57_ > i_56_) {
                                                this.aByteArrayArrayArray3104!![i_43_]!![i_54_]!![i_56_] = 0.toByte()
                                                i_56_++
                                            }
                                            i_54_++
                                        }
                                    }
                                }
                                bool = true
                            } else throw IllegalStateException("")
                        } else if (`is` != null) {
                            `is`[0] = class348_sub49.readUnsignedShort(842397944)
                            `is`[1] = class348_sub49.readShort(13638)
                            `is`[2] = class348_sub49.readShort(13638)
                            `is`[3] = class348_sub49.readShort(13638)
                            `is`[4] = class348_sub49.readUnsignedShort(842397944)
                        } else class348_sub49.anInt7197 += 10
                    }
                    if (class190 != null) {
                        for (i_64_ in 0..7) {
                            for (i_65_ in 0..7) {
                                val i_66_ = i_64_ + (i_39_ shr 3)
                                val i_67_ = (i shr 3) - -i_65_
                                if (i_66_ >= 0 && ((this.anInt3117 shr 3) > i_66_) && i_67_ >= 0 && i_67_ < (this.anInt3114 shr 3)) method192(class190, 10000, i_66_, i_67_)
                            }
                        }
                    }
                    if (bool || this.aByteArrayArrayArray3104 == null) break
                    for (i_68_ in 0..3) {
                        if (this.aByteArrayArrayArray3104!![i_68_] != null) {
                            for (i_69_ in 0..15) {
                                for (i_70_ in 0..15) {
                                    val i_71_ = (i_39_ shr 2) + i_69_
                                    val i_72_ = i_70_ + (i shr 2)
                                    if (i_71_ >= 0 && i_71_ < 26 && i_72_ >= 0 && i_72_ < 26) this.aByteArrayArrayArray3104!![i_68_]!![i_71_]!![i_72_] = 0.toByte()
                                }
                            }
                        }
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("vaa.AA(" + i + ',' + (if (var_ha != null) "{...}" else "null") + ',' + (if (class348_sub49 != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_39_ + ',' + i_40_ + ')'))
            }
            break
        } while (false)
    }

    fun method1692(i: Int, i_73_: Int, `is`: ByteArray?, i_74_: Int, i_75_: Int, var_ha: ha?, i_76_: Int, i_77_: Int, i_78_: Int, class361s: Array<Class361?>?, i_79_: Int) {
        try {
            anInt5826++
            if (i_78_ != 7) method1693('\uffb8', -54)
            val class348_sub49 = Class348_Sub49(`is`)
            var i_80_ = -1
            while (true) {
                val i_81_ = class348_sub49.method3334(-85)
                if (i_81_ == 0) break
                i_80_ += i_81_
                var i_82_ = 0
                while (true) {
                    val i_83_ = class348_sub49.readSmart(-117)
                    if (i_83_ == 0) break
                    i_82_ += -1 + i_83_
                    val i_84_ = i_82_ and 0x3f
                    val i_85_ = i_82_ shr 6 and 0x3f
                    val i_86_ = i_82_ shr 12
                    val i_87_ = class348_sub49.readUnsignedByte(255)
                    val i_88_ = i_87_ shr 2
                    val i_89_ = i_87_ and 0x3
                    if (i_74_ == i_86_ && i <= i_85_ && i - -8 > i_85_ && i_75_ <= i_84_ && i_75_ - -8 > i_84_) {
                        val class51 = Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, i_80_)
                        val i_90_ = Class249.method1908(0x7 and i_84_, i_85_ and 0x7, i_73_, true, class51.anInt926, class51.anInt961, i_89_) + i_77_
                        val i_91_ = i_76_ + method1045(0x7 and i_85_, (class51.anInt926), i_89_, (class51.anInt961), i_84_ and 0x7, i_73_, 16.toByte())
                        if (i_90_ > 0 && i_91_ > 0 && i_90_ < -1 + this.anInt3117 && -1 + this.anInt3114 > i_91_) {
                            var class361: Class361? = null
                            if (!this.aBoolean3109) {
                                var i_92_ = i_79_
                                if ((0x2 and (Class348_Sub33.aByteArrayArrayArray6962!![1]!![i_90_]!![i_91_]).toInt()) == 2) i_92_--
                                if (i_92_ >= 0) class361 = class361s!![i_92_]
                            }
                            method1689(i_90_, i_79_, i_80_, var_ha, i_79_, 50, i_88_, i_91_, -1, i_89_ - -i_73_ and 0x3, class361)
                        }
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("vaa.S(" + i + ',' + i_73_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_74_ + ',' + i_75_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_76_ + ',' + i_77_ + ',' + i_78_ + ',' + (if (class361s != null) "{...}" else "null") + ',' + i_79_ + ')'))
        }
    }

    fun method1694(class361: Class361?, i: Int, i_93_: Int, var_ha: ha?, i_94_: Int, i_95_: Int, i_96_: Byte) {
        while_77_@ do {
            do {
                try {
                    anInt5817++
                    val interface10 = method1690(i, i_95_, i_94_, i_93_, 30987)
                    if (i_96_ <= 66) anInt5819 = -107
                    if (interface10 == null) break@while_77_
                    val class51 = Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, interface10.method42(-89))
                    val i_97_ = interface10.method39(-128)
                    val i_98_ = interface10.method41(-32228)
                    if (class51.method474((-50).toByte())) method2336(class51, i_94_, i_95_, i_93_, -128)
                    if (interface10.method38(-18443)) interface10.method43(var_ha, -14218)
                    if (i == 0) {
                        method3058(i_93_, i_94_, i_95_)
                        if (class51.anInt920 != 0) class361!!.method3506((class51.aBoolean896), i_98_, i_94_, i_97_, i_95_, !(class51.aBoolean876), 29216)
                        if (class51.anInt955 == 1) {
                            if (i_98_ == 0) {
                                method2987(i_93_, 1, i_95_, -3951, i_94_)
                                break
                            } else if (i_98_ != 1) {
                                if (i_98_ != 2) {
                                    if (i_98_ == 3) method2987(i_93_, 2, i_95_, -3951, i_94_)
                                } else method2987(i_93_, 1, i_95_, -3951, 1 + i_94_)
                            } else method2987(i_93_, 2, 1 + i_95_, -3951, i_94_)
                            break
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                Class348_Sub42_Sub16.method3253(i_93_, i_94_, i_95_, ((if (Class237_Sub1.Companion.aClass5827 != null) Class237_Sub1.Companion.aClass5827 else (Interface10::class.java.also { Class237_Sub1.Companion.aClass5827 = it }))!!))
                                if (class51.anInt920 != 0 && (class51.anInt961 + i_94_ < this.anInt3117) && (i_95_ - -class51.anInt961 < this.anInt3114) && (class51.anInt926 + i_94_ < this.anInt3117) && (this.anInt3114 > (i_95_ + class51.anInt926))) class361!!.method3509(i_98_, !class51.aBoolean876, class51.aBoolean896, i_94_, i_95_, class51.anInt926, 84, class51.anInt961)
                                if (i_97_ != 9) break
                                if ((0x1 and i_98_) != 0) method2987(i_93_, 16, i_95_, -3951, i_94_)
                                else method2987(i_93_, 8, i_95_, -3951, i_94_)
                            } else if (i == 3) {
                                method2879(i_93_, i_94_, i_95_)
                                if (class51.anInt920 == 1) class361!!.method3499((-52).toByte(), i_94_, i_95_)
                            }
                            break
                        }
                        method2168(i_93_, i_94_, i_95_)
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw Class348_Sub17.method2929(runtimeexception, ("vaa.U(" + (if (class361 != null) "{...}" else "null") + ',' + i + ',' + i_93_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_94_ + ',' + i_95_ + ',' + i_96_ + ')'))
                }
            } while (false)
            break
        } while (false)
    }

    fun method1695(`is`: ByteArray?, class361s: Array<Class361?>?, i: Int, var_ha: ha?, i_99_: Int, i_100_: Int) {
        try {
            anInt5820++
            if (i_100_ == 1359) {
                val class348_sub49 = Class348_Sub49(`is`)
                var i_101_ = -1
                while (true) {
                    val i_102_ = class348_sub49.method3334(-57)
                    if (i_102_ == 0) break
                    i_101_ += i_102_
                    var i_103_ = 0
                    while (true) {
                        val i_104_ = class348_sub49.readSmart(-122)
                        if (i_104_ == 0) break
                        i_103_ += i_104_ + -1
                        val i_105_ = 0x3f and i_103_
                        val i_106_ = i_103_ shr 6 and 0x3f
                        val i_107_ = i_103_ shr 12
                        val i_108_ = class348_sub49.readUnsignedByte(255)
                        val i_109_ = i_108_ shr 2
                        val i_110_ = 0x3 and i_108_
                        val i_111_ = i_99_ + i_106_
                        val i_112_ = i + i_105_
                        if (i_111_ > 0 && i_112_ > 0 && (i_111_ < this.anInt3117 - 1) && i_112_ < this.anInt3114 - 1) {
                            var class361: Class361? = null
                            if (!this.aBoolean3109) {
                                var i_113_ = i_107_
                                if ((0x2 and (Class348_Sub33.aByteArrayArrayArray6962!![1]!![i_111_]!![i_112_]).toInt()) == 2) i_113_--
                                if (i_113_ >= 0) class361 = class361s!![i_113_]
                            }
                            method1689(i_111_, i_107_, i_101_, var_ha, i_107_, i_100_ xor 0x57d, i_109_, i_112_, -1, i_110_, class361)
                        }
                    }
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("vaa.R(" + (if (`is` != null) "{...}" else "null") + ',' + (if (class361s != null) "{...}" else "null") + ',' + i + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_99_ + ',' + i_100_ + ')'))
        }
    }

    fun method1696(class348_sub49: Class348_Sub49?, bool: Boolean, i: Int, i_116_: Int, i_117_: Int, i_118_: Int, i_119_: Int, i_120_: Int, var_ha: ha?, `is`: IntArray?, i_121_: Int) {
        do {
            try {
                anInt5825++
                if (!this.aBoolean3109) {
                    val bool_122_ = bool
                    var class190: Class190? = null
                    if (`is` != null) `is`[0] = -1
                    val i_123_ = 8 * (0x7 and i_116_)
                    val i_124_ = (i and 0x7) * 8
                    while ((class348_sub49!!.aByteArray7154)!!.size > class348_sub49.anInt7197) {
                        val i_125_ = class348_sub49.readUnsignedByte(255)
                        if (i_125_ != 0) {
                            if (i_125_ == 1) {
                                val i_126_ = class348_sub49.readUnsignedByte(255)
                                if (i_126_ > 0) {
                                    var i_127_ = 0
                                    while ((i_126_ > i_127_)) {
                                        val class211 = Class211(var_ha, class348_sub49, 2)
                                        if (class211.anInt2734 == 31) {
                                            val class253 = (Class348_Sub1.aClass185_6559!!.method1391(111.toByte(), (class348_sub49.readUnsignedShort(842397944))))
                                            class211.method1539((class253.anInt3251), 124.toByte(), (class253.anInt3249), (class253.anInt3245), (class253.anInt3244))
                                        }
                                        if (var_ha!!.method3704() > 0) {
                                            val class348_sub1 = (class211.aClass348_Sub1_2745)
                                            var i_128_ = (class348_sub1!!.method2724(-1) shr 9)
                                            var i_129_ = (class348_sub1.method2717(79.toByte()) shr 9)
                                            if ((i_121_ == (class211.anInt2731)) && (i_123_ <= i_128_) && (i_123_ + 8 > i_128_) && i_124_ <= i_129_ && (i_124_ - -8 > i_129_)) {
                                                val i_130_ = ((i_117_ shl 9) + (method1201((0xfff and (class348_sub1.method2717(95.toByte()))), (0xfff and (class348_sub1.method2724(-1))), -2, i_119_)))
                                                val i_131_ = ((i_120_ shl 9) + (method1079(4095, i_119_, (0xfff and (class348_sub1.method2717(119.toByte()))), (0xfff and (class348_sub1.method2724(-1))))))
                                                i_128_ = i_130_ shr 9
                                                i_129_ = i_131_ shr 9
                                                if (i_128_ >= 0 && (i_129_ >= 0) && (i_128_ < (this.anInt3117)) && ((this.anInt3114) > i_129_)) {
                                                    class348_sub1.method2725(i_130_, 70.toByte(), i_131_, ((this.anIntArrayArrayArray3122!![i_121_]!![i_128_]!![i_129_]) - (class348_sub1.method2722(124))))
                                                    Class348_Sub42_Sub19.method3276(class211)
                                                }
                                            }
                                        }
                                        i_127_++
                                    }
                                }
                            } else if (i_125_ == 2) {
                                if (class190 == null) class190 = Class190()
                                class190.method1423(8, class348_sub49)
                            } else if (i_125_ == 128) {
                                if (`is` != null) {
                                    `is`[0] = class348_sub49.readUnsignedShort(842397944)
                                    `is`[1] = class348_sub49.readShort(13638)
                                    `is`[2] = class348_sub49.readShort(13638)
                                    `is`[3] = class348_sub49.readShort(13638)
                                    `is`[4] = class348_sub49.readUnsignedShort(842397944)
                                } else class348_sub49.anInt7197 += 10
                            } else if (i_125_ == 129) {
                                if (this.aByteArrayArrayArray3104 == null) this.aByteArrayArrayArray3104 = arrayOfNulls<Array<ByteArray?>>(4)
                                for (i_132_ in 0..3) {
                                    val i_133_ = class348_sub49.readByte(-112)
                                    if (i_133_.toInt() == 0 && ((this.aByteArrayArrayArray3104!![i_118_]) != null)) {
                                        if (i_121_ >= i_132_) {
                                            var i_134_ = i_117_
                                            var i_135_ = i_117_ - -7
                                            var i_136_ = i_120_
                                            if (i_135_ >= 0) {
                                                if (this.anInt3117 <= i_135_) i_135_ = (this.anInt3117)
                                            } else i_135_ = 0
                                            if (i_134_ < 0) i_134_ = 0
                                            else if (i_134_ >= (this.anInt3117)) i_134_ = (this.anInt3117)
                                            var i_137_ = i_120_ - -7
                                            if (i_136_ < 0) i_136_ = 0
                                            else if ((this.anInt3114) <= i_136_) i_136_ = (this.anInt3114)
                                            if (i_137_ >= 0) {
                                                if (i_137_ >= (this.anInt3114)) i_137_ = (this.anInt3114)
                                            } else i_137_ = 0
                                            while ( /**/(i_134_ < i_135_)) {
                                                while ( /**/i_136_ < i_137_) {
                                                    this.aByteArrayArrayArray3104!![i_118_]!![i_134_]!![i_136_] = 0.toByte()
                                                    i_136_++
                                                }
                                                i_134_++
                                            }
                                        }
                                    } else if (i_133_.toInt() == 1) {
                                        if ((this.aByteArrayArrayArray3104!![i_118_]) == null) this.aByteArrayArrayArray3104!![i_118_] = (Array<ByteArray?>((this.anInt3117) + 1) { ByteArray(1 + (this.anInt3114)) })
                                        var i_138_ = 0
                                        while (i_138_ < 64) {
                                            var i_139_ = 0
                                            while (i_139_ < 64) {
                                                val i_140_ = class348_sub49.readByte(-113)
                                                if (i_132_ <= i_121_) {
                                                    var i_141_ = i_138_
                                                    while ((i_141_ < i_138_ - -4)) {
                                                        var i_142_ = i_139_
                                                        while ((i_142_ < i_139_ - -4)) {
                                                            if ((i_141_ >= i_123_) && (i_141_ < 8 + i_123_) && (i_124_ <= i_142_) && (8 + i_124_ > i_124_)) {
                                                                val i_143_ = (i_117_ - -(Class295.method2220((0x7 and i_142_), i_119_, (i_141_ and 0x7), 71.toByte())))
                                                                val i_144_ = (i_120_ + (method837((i_141_ and 0x7), true, (0x7 and i_142_), i_119_)))
                                                                if (i_143_ >= 0 && (this.anInt3117 > i_143_) && (i_144_ >= 0) && ((this.anInt3114) > i_144_)) this.aByteArrayArrayArray3104!![i_118_]!![i_143_]!![i_144_] = i_140_
                                                            }
                                                            i_142_++
                                                        }
                                                        i_141_++
                                                    }
                                                }
                                                i_139_ += 4
                                            }
                                            i_138_ += 4
                                        }
                                    }
                                }
                            } else throw IllegalStateException("")
                        } else class190 = Class190(class348_sub49)
                    }
                    if (class190 != null) method192(class190, 10000, i_117_ shr 3, i_120_ shr 3)
                    if (bool_122_ || this.aByteArrayArrayArray3104 == null || (this.aByteArrayArrayArray3104!![i_118_] == null)) break
                    val i_145_ = 7 + i_117_
                    val i_146_ = 7 + i_120_
                    var i_147_ = i_117_
                    while (i_145_ > i_147_) {
                        for (i_148_ in i_120_..<i_146_) this.aByteArrayArrayArray3104!![i_118_]!![i_147_]!![i_148_] = 0.toByte()
                        i_147_++
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("vaa.O(" + (if (class348_sub49 != null) "{...}" else "null") + ',' + bool + ',' + i + ',' + i_116_ + ',' + i_117_ + ',' + i_118_ + ',' + i_119_ + ',' + i_120_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_121_ + ')'))
            }
            break
        } while (false)
    }

    fun method1697(bool: Boolean, var_ha: ha?, i: Int) {
        try {
            Class342.method2686()
            anInt5816++
            if (!bool) {
                if (this.anInt3130 > 1) {
                    var i_149_ = 0
                    while (this.anInt3117 > i_149_) {
                        var i_150_ = 0
                        while (this.anInt3114 > i_150_) {
                            if ((0x2 and (Class348_Sub33.aByteArrayArrayArray6962!![1]!![i_149_]!![i_150_]).toInt()) == 2) method258(i_149_, i_150_)
                            i_150_++
                        }
                        i_149_++
                    }
                }
                var i_151_ = 0
                while ((this.anInt3130 > i_151_)) {
                    var i_152_ = 0
                    while (this.anInt3114 >= i_152_) {
                        var i_153_ = 0
                        while ((this.anInt3117 >= i_153_)) {
                            if ((0x4 and (this.aByteArrayArrayArray3108!![i_151_]!![i_153_]!![i_152_]).toInt()) != 0) {
                                var i_154_ = i_153_
                                var i_155_ = i_153_
                                var i_156_ = i_152_
                                var i_157_ = i_152_
                                while ( /**/(i_156_ > 0 && ((this.aByteArrayArrayArray3108!![i_151_]!![i_153_]!![-1 + i_156_]).toInt() and 0x4) != 0)) {
                                    if (i_157_ - i_156_ >= 10) break
                                    i_156_--
                                }
                                while ( /**/(this.anInt3114 > i_157_ && (0x4 and (this.aByteArrayArrayArray3108!![i_151_]!![i_153_]!![i_157_ + 1]).toInt()) != 0)) {
                                    if (-i_156_ + i_157_ >= 10) break
                                    i_157_++
                                }
                                while_78_@ while ( /**/i_154_ > 0) {
                                    if (i_155_ + -i_154_ >= 10) break
                                    var i_158_ = i_156_
                                    while ((i_158_ <= i_157_)) {
                                        if (((this.aByteArrayArrayArray3108!![i_151_]!![-1 + i_154_]!![i_158_]).toInt() and 0x4) == 0) break@while_78_
                                        i_158_++
                                    }
                                    i_154_--
                                }
                                while_79_@ while ( /**/(i_155_ < this.anInt3117 && -i_154_ + i_155_ < 10)) {
                                    var i_159_ = i_156_
                                    while ((i_157_ >= i_159_)) {
                                        if (((this.aByteArrayArrayArray3108!![i_151_]!![i_155_ + 1]!![i_159_]).toInt() and 0x4) == 0) break@while_79_
                                        i_159_++
                                    }
                                    i_155_++
                                }
                                if (((1 + (-i_156_ + i_157_)) * (i_155_ + (-i_154_ + 1))) >= 4) {
                                    val i_160_ = (this.anIntArrayArrayArray3122!![i_151_]!![i_154_]!![i_156_])
                                    method1966(512 + (i_155_ shl 9), i_160_, i_156_ shl 9, i_160_, 0.toByte(), 4, (i_157_ shl 9) + 512, i_151_, i_154_ shl 9)
                                    var i_161_ = i_154_
                                    while ((i_161_ <= i_155_)) {
                                        var i_162_ = i_156_
                                        while ((i_157_ >= i_162_)) {
                                            this.aByteArrayArrayArray3108!![i_151_]!![i_161_]!![i_162_] = (method1166((this.aByteArrayArrayArray3108!![i_151_]!![i_161_]!![i_162_]).toInt(), -5)).toByte()
                                            i_162_++
                                        }
                                        i_161_++
                                    }
                                }
                            }
                            i_153_++
                        }
                        i_152_++
                    }
                    i_151_++
                }
                Class328_Sub3.method2616(12)
            }
            if (i < -6) this.aByteArrayArrayArray3108 = null
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("vaa.T(" + bool + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i + ')'))
        }
    }

    companion object {
        var anInt5815: Int = 0
        var anInt5816: Int = 0
        var anInt5817: Int = 0
        var anInt5818: Int = 0
        @JvmField
        var anInt5819: Int = 0
        var anInt5820: Int = 0
        @JvmField
        var aClass341_5821: Class341? = Class341()
        var anInt5822: Int = 0
        var anInt5823: Int = 0
        var anInt5825: Int = 0
        var anInt5826: Int = 0

        /*synthetic*/
        var aClass5827: Class<*>? = null

        fun method1693(c: Char, i: Int): Boolean {
            anInt5815++
            if (i > -100) method1693('\uffa3', 97)
            if (c.code >= 32 && c.code <= 126) return true
            if (c.code >= 160 && c.code <= 255) return true
            return c.code == 8364 || c.code == 338 || c.code == 8212 || c.code == 339 || c.code == 376
        }

        @JvmStatic
        fun method1698(i: Int) {
            aClass341_5821 = null
            if (i != 1) method1698(-10)
        }
    }
}
