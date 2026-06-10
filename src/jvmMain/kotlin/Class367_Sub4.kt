import kotlin.math.pow
import kotlin.math.sqrt

/* Class367_Sub4 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class367_Sub4 internal constructor(var_ha_Sub3: ha_Sub3) : Class367(var_ha_Sub3) {
    private var aBoolean7311 = false
    private var anInterface18_Impl2Array7315: Array<Interface18_Impl2?>? = null
    private var aBoolean7317 = false

    init {
        if (var_ha_Sub3.aBoolean8101) {
            aBoolean7311 = var_ha_Sub3.anInt8090 < 3
            val i = if (aBoolean7311) 48 else 127
            val `is` = Array<IntArray?>(6) { IntArray(4096) }
            val is_0_ = Array<IntArray?>(6) { IntArray(4096) }
            val is_1_ = Array<IntArray?>(6) { IntArray(4096) }
            var i_2_ = 0
            for (i_3_ in 0..63) {
                for (i_4_ in 0..63) {
                    var f = -1.0f + i_3_.toFloat() * 2.0f / 64.0f
                    var f_5_ = 2.0f * i_4_.toFloat() / 64.0f - 1.0f
                    val f_6_ = (1.0 / sqrt((f * f + (1.0f + f_5_ * f_5_)).toDouble())).toFloat()
                    f *= f_6_
                    f_5_ *= f_6_
                    for (i_7_ in 0..5) {
                        val f_8_: Float
                        if (i_7_ != 0) {
                            if (i_7_ != 1) {
                                if (i_7_ == 2) f_8_ = f
                                else if (i_7_ == 3) f_8_ = -f
                                else if (i_7_ != 4) f_8_ = -f_6_
                                else f_8_ = f_6_
                            } else f_8_ = f_5_
                        } else f_8_ = -f_5_
                        val i_9_: Int
                        val i_10_: Int
                        val i_11_: Int
                        if (f_8_ > 0.0f) {
                            i_9_ = (i.toDouble() * f_8_.toDouble().pow(96.0)).toInt()
                            i_10_ = (i.toDouble() * f_8_.toDouble().pow(36.0)).toInt()
                            i_11_ = (f_8_.toDouble().pow(12.0) * i.toDouble()).toInt()
                        } else {
                            i_11_ = 0
                            i_10_ = i_11_
                            i_9_ = i_10_
                        }
                        is_0_[i_7_]!![i_2_] = i_9_ shl 24
                        is_1_[i_7_]!![i_2_] = i_10_ shl 24
                        `is`[i_7_]!![i_2_] = i_11_ shl 24
                    }
                    i_2_++
                }
            }
            anInterface18_Impl2Array7315 = arrayOfNulls<Interface18_Impl2>(3)
            anInterface18_Impl2Array7315!![0] = this.aHa_Sub3_4479.method3900(is_0_, false, 52, 64)
            anInterface18_Impl2Array7315!![1] = this.aHa_Sub3_4479.method3900(is_1_, false, 3, 64)
            anInterface18_Impl2Array7315!![2] = this.aHa_Sub3_4479.method3900(`is`, false, 17, 64)
        }
    }

    override fun method3530(i: Int): Boolean {
        anInt7314++
        if (i > -57) method3525(91, false)
        return true
    }

    override fun method3525(i: Int, bool: Boolean) {
        if (i != 15192) method3527(-85, null, -72)
        if (anInterface18_Impl2Array7315 != null && bool) {
            this.aHa_Sub3_4479.method3897(1, -4382)
            this.aHa_Sub3_4479.method3871(Class31.aClass113_430, 0)
            val class101_sub2 = this.aHa_Sub3_4479.method3820(false)
            class101_sub2.method899(1024)
            this.aHa_Sub3_4479.method3853(-32, Class348_Sub40_Sub38.aClass251_9477)
            if (aBoolean7311) {
                this.aHa_Sub3_4479.method3874((Class328_Sub3.aClass229_6519), 113, (Class348_Sub23_Sub2.aClass229_9011))
                this.aHa_Sub3_4479.method3924(true, false, 0, Class342.aClass70_4247, false)
                this.aHa_Sub3_4479.method3885(0, true, Class285_Sub2.aClass70_8503)
            } else {
                this.aHa_Sub3_4479.method3874((Class167.aClass229_2207), 117, (Class328_Sub3.aClass229_6519))
                this.aHa_Sub3_4479.method3849(47.toByte(), 0, (Class318_Sub1_Sub2.aClass70_8737))
                this.aHa_Sub3_4479.method3897(2, -4382)
                this.aHa_Sub3_4479.method3874((Class328_Sub3.aClass229_6519), 122, (Class348_Sub23_Sub2.aClass229_9011))
                this.aHa_Sub3_4479.method3849(47.toByte(), 0, (Class318_Sub1_Sub2.aClass70_8737))
                this.aHa_Sub3_4479.method3924(true, false, 1, (Class318_Sub1_Sub2.aClass70_8737), false)
                this.aHa_Sub3_4479.method3885(0, true, Class285_Sub2.aClass70_8503)
                this.aHa_Sub3_4479.method3850((-61).toByte(), (this.aHa_Sub3_4479.anInterface18_8147))
            }
            this.aHa_Sub3_4479.method3897(0, i + -19574)
            aBoolean7317 = true
        } else this.aHa_Sub3_4479.method3885(0, true, Class285_Sub2.aClass70_8503)
        anInt7313++
    }

    override fun method3527(i: Int, interface18: Interface18?, i_12_: Int) {
        anInt7316++
        this.aHa_Sub3_4479.method3850(91.toByte(), interface18)
        this.aHa_Sub3_4479.method3923(true, i)
        if (i_12_ != -16776) method3525(61, true)
    }

    override fun method3520(i: Byte) {
        if (aBoolean7317) {
            this.aHa_Sub3_4479.method3897(1, i.toInt() xor 0x114a.inv())
            this.aHa_Sub3_4479.method3850((-121).toByte(), null)
            this.aHa_Sub3_4479.method3871(Class150.aClass113_2047, 0)
            this.aHa_Sub3_4479.method3879(-8629)
            if (aBoolean7311) {
                this.aHa_Sub3_4479.method3874(Class167.aClass229_2207, 120, Class167.aClass229_2207)
                this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class342.aClass70_4247)
                this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247)
            } else {
                this.aHa_Sub3_4479.method3874(Class167.aClass229_2207, 115, Class167.aClass229_2207)
                this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class342.aClass70_4247)
                this.aHa_Sub3_4479.method3897(2, i + -4469)
                this.aHa_Sub3_4479.method3874((Class167.aClass229_2207), i.toInt() xor 0x21, (Class167.aClass229_2207))
                this.aHa_Sub3_4479.method3849(47.toByte(), 0, Class342.aClass70_4247)
                this.aHa_Sub3_4479.method3849(47.toByte(), 1, (Class318_Sub1_Sub2.aClass70_8737))
                this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247)
                this.aHa_Sub3_4479.method3850(64.toByte(), null)
            }
            this.aHa_Sub3_4479.method3897(0, i.toInt() xor 0x114a.inv())
            aBoolean7317 = false
        } else this.aHa_Sub3_4479.method3885(0, true, Class342.aClass70_4247)
        anInt7312++
        if (i.toInt() != 87) aBoolean7311 = true
        this.aHa_Sub3_4479.method3874(Class167.aClass229_2207, i + 13, Class167.aClass229_2207)
    }

    override fun method3521(bool: Boolean, i: Byte) {
        this.aHa_Sub3_4479.method3874((Class328_Sub3.aClass229_6519), 126, Class167.aClass229_2207)
        if (i.toInt() != -103) method3542(74, null, 65, 65, -77, true)
        anInt7308++
    }

    override fun method3526(i: Int, i_40_: Int, i_41_: Int) {
        if (i != 10756) method3520((-127).toByte())
        if (aBoolean7317) {
            this.aHa_Sub3_4479.method3897(1, i + -15138)
            this.aHa_Sub3_4479.method3850((-67).toByte(), anInterface18_Impl2Array7315!![-1 + i_40_])
            this.aHa_Sub3_4479.method3897(0, i xor 0x3b19.inv())
        }
        anInt7322++
    }

    companion object {
        @JvmField
        var anInt7308: Int = 0
        @JvmField
        var anInt7309: Int = 0
        @JvmField
        var anInt7310: Int = 0
        @JvmField
        var anInt7312: Int = 0
        @JvmField
        var anInt7313: Int = 0
        @JvmField
        var anInt7314: Int = 0
        @JvmField
        var anInt7316: Int = 0
        @JvmField
        var aClass351_7318: Class351? = Class351(21, 2)
        @JvmField
        var anInt7319: Int = 104
        var aBoolean7320: Boolean = false
        @JvmField
        var anInt7321: Int = 0
        @JvmField
        var anInt7322: Int = 0
        @JvmField
        var aClass114_7323: Class114? = Class114(105, -2)
        @JvmField
        var aClass114_7324: Class114? = Class114(96, 8)
        @JvmField
        var aClass107_7325: Class107? = Class107()

        @JvmStatic
        fun method3541(i: Byte) {
            aClass114_7323 = null
            aClass114_7324 = null
            aClass107_7325 = null
            if (i.toInt() == 23) aClass351_7318 = null
        }

        @JvmStatic
        fun method3542(i: Int, class357s: Array<Array<Array<Class357?>?>?>?, i_13_: Int, i_14_: Int, i_15_: Int, bool: Boolean): Boolean {
            anInt7310++
            val i_16_ = if (bool) 1.toByte() else (Class239_Sub15.anInt6006 and 0xff).toByte()
            if (i_16_ == Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![i_13_]!![i]) return false
            if (((Class348_Sub33.aByteArrayArrayArray6962!![Class355.anInt4372]!![i_13_]!![i]).toInt() and 0x4) == 0) return false
            var i_17_ = i_14_
            var i_18_ = 0
            Class348_Sub16_Sub2.anIntArray8862!![i_17_] = i_13_
            Exception_Sub1.anIntArray110!![i_17_++] = i
            Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![i_13_]!![i] = i_16_
            while (i_17_ != i_18_) {
                val i_19_ = 0xffff and Class348_Sub16_Sub2.anIntArray8862!![i_18_]
                val i_20_ = ((Class348_Sub16_Sub2.anIntArray8862!![i_18_] and 0xff3677) shr 16)
                val i_21_ = (0xff and (Class348_Sub16_Sub2.anIntArray8862!![i_18_] shr 24))
                var i_22_ = 0xffff and Exception_Sub1.anIntArray110!![i_18_]
                val i_23_ = ((0xff5347 and Exception_Sub1.anIntArray110!![i_18_]) shr 16)
                i_18_ = i_18_ + 1 and 0xfff
                var bool_24_ = false
                if ((0x4 and (Class348_Sub33.aByteArrayArrayArray6962!![Class355.anInt4372]!![i_19_]!![i_22_]).toInt()) == 0) bool_24_ = true
                var bool_25_ = false
                if (class357s != null) {
                    var i_26_ = Class355.anInt4372 + 1
                    while_223_@ while ( /**/i_26_ <= 3) {
                        if (class357s[i_26_] != null && (0x8 and (Class348_Sub33.aByteArrayArrayArray6962!![i_26_]!![i_19_]!![i_22_]).toInt()) == 0) {
                            if (bool_24_ && class357s[i_26_]!![i_19_]!![i_22_] != null) {
                                if ((class357s[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4406) != null) {
                                    val i_27_ = Class359.method3492(i_20_, 226)
                                    if (((class357s[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4406!!.aShort8759).toInt() == i_27_) || ((class357s[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4403) != null && (i_27_ == (class357s[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4403!!.aShort8759).toInt()))) {
                                        i_26_++
                                        continue
                                    }
                                    if (i_21_ != 0) {
                                        val i_28_ = Class359.method3492(i_21_, 226)
                                        if (((class357s[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4406!!.aShort8759).toInt() == i_28_) || ((class357s[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4403) != null && ((class357s[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4403!!.aShort8759).toInt() == i_28_))) {
                                            i_26_++
                                            continue
                                        }
                                    }
                                    if (i_23_ != 0) {
                                        val i_29_ = Class359.method3492(i_23_, 226)
                                        if ((class357s[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4406!!.aShort8759).toInt() == i_29_ || ((class357s[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4403) != null && (i_29_ == (class357s[i_26_]!![i_19_]!![i_22_]!!.aClass318_Sub1_Sub4_4403!!.aShort8759).toInt()))) {
                                            i_26_++
                                            continue
                                        }
                                    }
                                }
                                val class357 = class357s[i_26_]!![i_19_]!![i_22_]!!
                                if (class357.aClass148_4396 != null) {
                                    var class148 = (class357.aClass148_4396)
                                    while (class148 != null) {
                                        val class318_sub1_sub3 = (class148.aClass318_Sub1_Sub3_2040)
                                        if (class318_sub1_sub3 is Interface10) {
                                            val interface10 = class318_sub1_sub3 as Interface10
                                            var i_30_ = interface10.method39(59)
                                            val i_31_ = interface10.method41(-32228)
                                            if (i_30_ == 21) i_30_ = 19
                                            val i_32_ = i_31_ shl 6 or i_30_
                                            if (i_32_ == i_20_ || i_21_ != 0 && i_21_ == i_32_ || i_23_ != 0 && i_23_ == i_32_) {
                                                i_26_++
                                                continue@while_223_
                                            }
                                        }
                                        class148 = (class148.aClass148_2038)
                                    }
                                }
                            }
                            val class357: Class357? = class357s[i_26_]!![i_19_]!![i_22_]
                            if (class357 != null && class357.aClass148_4396 != null) {
                                var class148 = class357.aClass148_4396
                                while (class148 != null) {
                                    val class318_sub1_sub3 = (class148.aClass318_Sub1_Sub3_2040)!!
                                    if (((class318_sub1_sub3.aShort8743) != class318_sub1_sub3.aShort8751) || (class318_sub1_sub3.aShort8750 != class318_sub1_sub3.aShort8747)) {
                                        var i_33_ = (class318_sub1_sub3.aShort8743).toInt()
                                        while ((i_33_ <= class318_sub1_sub3.aShort8751)) {
                                            var i_34_ = (class318_sub1_sub3.aShort8750).toInt()
                                            while ((i_34_ <= class318_sub1_sub3.aShort8747)) {
                                                Class289.aByteArrayArrayArray3700!![i_26_]!![i_33_]!![i_34_] = i_16_
                                                i_34_++
                                            }
                                            i_33_++
                                        }
                                    }
                                    class148 = class148.aClass148_2038
                                }
                            }
                            Class289.aByteArrayArrayArray3700!![i_26_]!![i_19_]!![i_22_] = i_16_
                            bool_25_ = true
                        }
                        i_26_++
                    }
                }
                if (bool_25_) {
                    val i_35_ = aa_Sub1.aSArray5191!![1 + Class355.anInt4372]!!.method3982((-86).toByte(), i_22_, i_19_)
                    if (i_35_ > Class327.anIntArray4097!![i_15_]) Class327.anIntArray4097!![i_15_] = i_35_
                    val i_36_ = i_19_ shl 9
                    if (i_36_ < Class156.anIntArray2117!![i_15_]) Class156.anIntArray2117!![i_15_] = i_36_
                    else if (i_36_ > Class348_Sub40_Sub19.anIntArray9259!![i_15_]) Class348_Sub40_Sub19.anIntArray9259!![i_15_] = i_36_
                    val i_37_ = i_22_ shl 9
                    if (i_37_ >= Class64.anIntArray1127!![i_15_]) {
                        if (Class56.anIntArray1045!![i_15_] < i_37_) Class56.anIntArray1045!![i_15_] = i_37_
                    } else Class64.anIntArray1127!![i_15_] = i_37_
                }
                if (!bool_24_) {
                    if (i_19_ >= 1 && (Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![i_19_ - 1]!![i_22_]) != i_16_) {
                        Class348_Sub16_Sub2.anIntArray8862!![i_17_] = Class273.method2057(Class273.method2057(1179648, i_19_ + -1), -754974720)
                        Exception_Sub1.anIntArray110!![i_17_] = Class273.method2057(i_22_, 1245184)
                        i_17_ = 0xfff and 1 + i_17_
                        Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![i_19_ - 1]!![i_22_] = i_16_
                    }
                    if (++i_22_ < Class348_Sub40_Sub3.anInt9109) {
                        if (i_19_ - 1 >= 0 && i_16_ != (Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![-1 + i_19_]!![i_22_]) && ((Class348_Sub33.aByteArrayArrayArray6962!![Class355.anInt4372]!![i_19_]!![i_22_]).toInt() and 0x4) == 0 && (0x4 and (Class348_Sub33.aByteArrayArrayArray6962!![Class355.anInt4372]!![-1 + i_19_]!![-1 + i_22_]).toInt()) == 0) {
                            Class348_Sub16_Sub2.anIntArray8862!![i_17_] = (Class273.method2057(1375731712, Class273.method2057(i_19_ + -1, 1179648)))
                            Exception_Sub1.anIntArray110!![i_17_] = Class273.method2057(i_22_, 1245184)
                            Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![-1 + i_19_]!![i_22_] = i_16_
                            i_17_ = 0xfff and 1 + i_17_
                        }
                        if ((Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![i_19_]!![i_22_]) != i_16_) {
                            Class348_Sub16_Sub2.anIntArray8862!![i_17_] = (Class273.method2057(318767104, Class273.method2057(i_19_, 5373952)))
                            Exception_Sub1.anIntArray110!![i_17_] = Class273.method2057(i_22_, 5439488)
                            Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![i_19_]!![i_22_] = i_16_
                            i_17_ = i_17_ + 1 and 0xfff
                        }
                        if (1 + i_19_ < anInt7319 && ((Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![i_19_ + 1]!![i_22_]) != i_16_) && (0x4 and (Class348_Sub33.aByteArrayArrayArray6962!![Class355.anInt4372]!![i_19_]!![i_22_]).toInt()) == 0 && (0x4 and (Class348_Sub33.aByteArrayArrayArray6962!![Class355.anInt4372]!![1 + i_19_]!![i_22_ + -1]).toInt()) == 0) {
                            Class348_Sub16_Sub2.anIntArray8862!![i_17_] = (Class273.method2057(-1845493760, Class273.method2057(1 + i_19_, 5373952)))
                            Exception_Sub1.anIntArray110!![i_17_] = Class273.method2057(5439488, i_22_)
                            i_17_ = 1 + i_17_ and 0xfff
                            Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![i_19_ - -1]!![i_22_] = i_16_
                        }
                    }
                    i_22_--
                    if (i_19_ - -1 < anInt7319 && (Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![i_19_ - -1]!![i_22_]) != i_16_) {
                        Class348_Sub16_Sub2.anIntArray8862!![i_17_] = Class273.method2057(1392508928, Class273.method2057(9568256, 1 + i_19_))
                        Exception_Sub1.anIntArray110!![i_17_] = Class273.method2057(i_22_, 9633792)
                        i_17_ = 1 + i_17_ and 0xfff
                        Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![i_19_ - -1]!![i_22_] = i_16_
                    }
                    if (--i_22_ >= 0) {
                        if (i_19_ + -1 >= 0 && i_16_ != (Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![i_19_ - 1]!![i_22_]) && (0x4 and (Class348_Sub33.aByteArrayArrayArray6962!![Class355.anInt4372]!![i_19_]!![i_22_]).toInt()) == 0 && (0x4 and (Class348_Sub33.aByteArrayArrayArray6962!![Class355.anInt4372]!![-1 + i_19_]!![1 + i_22_]).toInt()) == 0) {
                            Class348_Sub16_Sub2.anIntArray8862!![i_17_] = (Class273.method2057(301989888, Class273.method2057(13762560, -1 + i_19_)))
                            Exception_Sub1.anIntArray110!![i_17_] = Class273.method2057(i_22_, 13828096)
                            Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![i_19_ - 1]!![i_22_] = i_16_
                            i_17_ = i_17_ - -1 and 0xfff
                        }
                        if ((Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![i_19_]!![i_22_]) != i_16_) {
                            Class348_Sub16_Sub2.anIntArray8862!![i_17_] = Class273.method2057(Class273.method2057(13762560, i_19_), -1828716544)
                            Exception_Sub1.anIntArray110!![i_17_] = Class273.method2057(13828096, i_22_)
                            Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![i_19_]!![i_22_] = i_16_
                            i_17_ = 0xfff and i_17_ - -1
                        }
                        if (anInt7319 > 1 + i_19_ && (Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![1 + i_19_]!![i_22_]) != i_16_ && ((Class348_Sub33.aByteArrayArrayArray6962!![Class355.anInt4372]!![i_19_]!![i_22_]).toInt() and 0x4) == 0 && ((Class348_Sub33.aByteArrayArrayArray6962!![Class355.anInt4372]!![i_19_ + 1]!![i_22_ + 1]).toInt() and 0x4) == 0) {
                            Class348_Sub16_Sub2.anIntArray8862!![i_17_] = (Class273.method2057(-771751936, Class273.method2057(i_19_ - -1, 9568256)))
                            Exception_Sub1.anIntArray110!![i_17_] = Class273.method2057(i_22_, 9633792)
                            Class289.aByteArrayArrayArray3700!![Class355.anInt4372]!![i_19_ - -1]!![i_22_] = i_16_
                            i_17_ = 0xfff and i_17_ - -1
                        }
                    }
                }
            }
            if (Class327.anIntArray4097!![i_15_] != -1000000) {
                Class327.anIntArray4097!![i_15_] += 40
                Class156.anIntArray2117!![i_15_] -= 512
                Class348_Sub40_Sub19.anIntArray9259!![i_15_] += 512
                Class56.anIntArray1045!![i_15_] += 512
                Class64.anIntArray1127!![i_15_] -= 512
            }
            return true
        }

        @JvmStatic
        fun method3543(i: Byte) {
            anInt7309++
            if (i.toInt() == -89) {
                Class351.aBoolean4328 = false
                Class354.method3466(i + 6)
            }
        }

        @JvmStatic
        fun method3544(class348_sub49: Class348_Sub49?, i: Int, string: String?): Int {
            try {
                anInt7321++
                val i_38_ = class348_sub49!!.anInt7197
                val `is` = Class348_Sub24.method2992(string, (-20).toByte())
                val i_39_ = 1 % ((-6 - i) / 63)
                class348_sub49.method3381(5537, `is`.size)
                class348_sub49.anInt7197 += (Class64.aClass296_1131!!.method2227(`is`.size, 0, class348_sub49.anInt7197, `is`, 103, class348_sub49.aByteArray7154))
                return class348_sub49.anInt7197 + -i_38_
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("bk.O(" + (if (class348_sub49 != null) "{...}" else "null") + ',' + i + ',' + (if (string != null) "{...}" else "null") + ')'))
            }
        }
    }
}
