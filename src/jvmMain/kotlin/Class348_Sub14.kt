import Class14_Sub2.Companion.method245
import Class177.Companion.method1353
import Class258_Sub3.Companion.method1969
import Class286_Sub3.Companion.method2148
import Class299_Sub1_Sub2.Companion.method2264
import Class348_Sub16_Sub3.Companion.method2878
import Class348_Sub40_Sub32.Companion.method3135
import Class58.Companion.method536
import Class79.Companion.method802
import r_Sub2.Companion.method3297

/* Class348_Sub14 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub14 : Class348 {
    var aLong6762: Long = 0

    constructor()

    internal constructor(l: Long) {
        try {
            this.aLong6762 = l
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.Companion.method2929(runtimeexception, "ij.<init>(" + l + ')')
        }
    }

    companion object {
        var anInt6760: Int = 0
        var anInt6761: Int = 0
        var anInt6763: Int = 0
        var aClass351_6764: Class351? = Class351(32, 4)
        var anInt6765: Int = 0
        var aClass351_6766: Class351? = Class351(75, 3)

        /*synthetic*/
        var aClass6767: Class<*>? = null

        fun method2804(i: Byte): Boolean {
            anInt6765++
            try {
                val class152 = Class152()
                val `is` = class152.method1214(9, Class348_Sub42_Sub14.aByteArray9622!!)
                val i_0_ = 19 % ((19 - i) / 43)
                method1969(`is`, -5901)
                return true
            } catch (exception: Exception) {
                return false
            }
        }

        @JvmStatic
        fun method2805(i: Byte) {
            aClass351_6766 = null
            val i_1_ = -14 % ((i - 72) / 32)
            aClass351_6764 = null
        }

        fun method2806(bool: Boolean, i: Int): Int {
            anInt6760++
            if (bool != false) Companion.method2807(-36, 35, (-71).toByte(), -71)
            return 0x3ff and i
        }

        fun method2807(i: Int, i_2_: Int, i_3_: Byte, i_4_: Int): Class348_Sub47? {
            anInt6761++
            var class348_sub47: Class348_Sub47? = null
            if (i_4_ == 0) {
                class348_sub47 = method2148(Class186.aClass351_2495, Class348_Sub23_Sub2.aClass77_9029, -100)
                Class348_Sub46.anInt7112++
            }
            if (i_4_ == 1) {
                class348_sub47 = method2148(Class301.aClass351_3825, Class348_Sub23_Sub2.aClass77_9029, -93)
                Class177.anInt4665++
            }
            class348_sub47!!.aClass348_Sub49_Sub2_7116!!.writeShortLittle(i + Class90.regionTileY, 3.toByte())
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteAdd(78.toByte(), if (!Class182.aClass346_2449!!.method2696(82, -124)) 0 else 1)
            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-124, za_Sub2.regionTileX + i_2_)
            Class248.anInt3203 = i_2_
            if (i_3_ >= -88) aClass351_6764 = null
            Class97.anInt1548 = i
            Class348_Sub13.Companion.aBoolean6759 = false
            method2264(false)
            return class348_sub47
        }

        @JvmStatic
        fun method2808(i: Int, var_ha: ha?, bool: Boolean): Boolean {
            try {
                anInt6763++
                val i_5_ = (-104 + Class367_Sub4.anInt7319) / 2
                val i_6_ = (Class348_Sub40_Sub3.anInt9109 - 104) / 2
                var bool_7_ = bool
                for (i_8_ in i_5_..<104 + i_5_) {
                    var i_9_ = i_6_
                    while (i_6_ + 104 > i_9_) {
                        for (i_10_ in i..3) {
                            if (method536(i_9_, false, i_8_, i, i_10_)) {
                                var i_11_ = i_10_
                                if (method802(i_9_, i_8_, true)) i_11_--
                                if (i_11_ >= 0) bool_7_ = bool_7_ and method245(i_11_, i_8_, i_9_, 75.toByte())
                            }
                        }
                        i_9_++
                    }
                }
                if (!bool_7_) return false
                val `is` = IntArray(262144)
                var i_12_ = 0
                while (`is`.size > i_12_) {
                    `is`[i_12_] = -16777216
                    i_12_++
                }
                Class108.aClass105_1664 = var_ha!!.method3662(512, `is`, 94.toByte(), 0, 512, 512)
                Class358.method3489(-3)
                val i_13_ = (((-10 + (238 + (20.0 * Math.random()).toInt()) shl 8) + (-10 + (Math.random() * 20.0).toInt() + 238 shl 16) - (-(Math.random() * 20.0).toInt() + -228)) or 0xffffff.inv())
                val i_14_ = (228 - -(20.0 * Math.random()).toInt() shl 16 or 0xffffff.inv())
                val i_15_ = ((8.0 * Math.random()).toInt() or ((8.0 * Math.random()).toInt() shl 16 or ((8.0 * Math.random()).toInt() shl 8)))
                val bools = (Array<BooleanArray?>(3 + RuntimeException_Sub1.anInt4600) { BooleanArray(RuntimeException_Sub1.anInt4600 - -1 + 2) })
                var i_16_ = i_5_
                while (i_16_ < i_5_ - -104) {
                    var i_17_ = i_6_
                    while (i_17_ < i_6_ - -104) {
                        var i_18_ = 0
                        var i_19_ = 0
                        var i_20_ = i_16_
                        if (i_20_ > 0) {
                            i_20_--
                            i_18_ += 4
                        }
                        var i_21_ = i_17_
                        if (i_21_ > 0) i_21_--
                        var i_22_ = RuntimeException_Sub1.anInt4600 + i_16_
                        if (i_22_ < 104) i_22_++
                        var i_23_ = i_17_ - -RuntimeException_Sub1.anInt4600
                        if (i_23_ < 104) {
                            i_23_++
                            i_19_ += 4
                        }
                        var_ha.KA(0, 0, RuntimeException_Sub1.anInt4600 * 4 + i_18_, RuntimeException_Sub1.anInt4600 * 4 + i_19_)
                        var_ha.GA(-16777216)
                        for (i_24_ in i..3) {
                            for (i_25_ in 0..RuntimeException_Sub1.anInt4600) {
                                var i_26_ = 0
                                while ((i_26_ <= RuntimeException_Sub1.anInt4600)) {
                                    bools[i_25_]!![i_26_] = method536(i_21_ + i_26_, false, i_20_ + i_25_, i, i_24_)
                                    i_26_++
                                }
                            }
                            Class348_Sub1_Sub1.aSArray8801!![i_24_]!!.method3987(0, 0, 1024, i_20_, i_21_, i_22_, i_23_, bools)
                            if (!Class375.aBoolean4542) {
                                for (i_27_ in -4..<RuntimeException_Sub1.anInt4600) {
                                    for (i_28_ in -4..<RuntimeException_Sub1.anInt4600) {
                                        val i_29_ = i_16_ + i_27_
                                        val i_30_ = i_28_ + i_17_
                                        if (i_5_ <= i_29_ && i_6_ <= i_30_ && method536(i_30_, false, i_29_, i, i_24_)) {
                                            var i_31_ = i_24_
                                            if (method802(i_30_, i_29_, true)) i_31_--
                                            if (i_31_ >= 0) Class348_Sub41.Companion.method3159(i_14_, ((-i_28_ + (RuntimeException_Sub1.anInt4600)) * 4 + i_19_ + -4), false, i_31_, i_30_, i_29_, var_ha, 4 * i_27_ + i_18_, i_13_)
                                        }
                                    }
                                }
                            }
                        }
                        if (Class375.aBoolean4542) {
                            val class361 = Class348_Sub45.aClass361Array7108!![i]
                            for (i_32_ in 0..<RuntimeException_Sub1.anInt4600) {
                                var i_33_ = 0
                                while ((RuntimeException_Sub1.anInt4600 > i_33_)) {
                                    val i_34_ = i_16_ + i_32_
                                    val i_35_ = i_33_ + i_17_
                                    val i_36_ = (class361!!.anIntArrayArray4438!![(-class361.anInt4453 + i_34_)]!![(-class361.anInt4441 + i_35_)])
                                    if ((0x40240000 and i_36_) != 0) var_ha.method3675(4, (-125).toByte(), i_32_ * 4 + i_18_, -4 + (RuntimeException_Sub1.anInt4600 + -i_33_) * 4 + i_19_, 4, -1713569622)
                                    else if ((0x800000 and i_36_) == 0) {
                                        if ((i_36_ and 0x2000000) != 0) var_ha.method3660(3 + (i_18_ - -(i_32_ * 4)), -1713569622, 4, (-4 + (4 * (-i_33_ + (RuntimeException_Sub1.anInt4600)) + i_19_)), true)
                                        else if ((i_36_ and 0x8000000) != 0) var_ha.method3649((-126).toByte(), 4, 3 + (i_19_ + ((RuntimeException_Sub1.anInt4600) - i_33_) * 4) + -4, -1713569622, i_18_ + 4 * i_32_)
                                        else if ((0x20000000 and i_36_) != 0) var_ha.method3660(i_18_ + 4 * i_32_, -1713569622, 4, (4 * (-i_33_ + (RuntimeException_Sub1.anInt4600)) + (i_19_ - 4)), bool)
                                    } else var_ha.method3649((-113).toByte(), 4, (-4 + i_19_ + 4 * (-i_33_ + (RuntimeException_Sub1.anInt4600))), -1713569622, i_32_ * 4 + i_18_)
                                    i_33_++
                                }
                            }
                        }
                        var_ha.aa(i_18_, i_19_, 4 * RuntimeException_Sub1.anInt4600, RuntimeException_Sub1.anInt4600 * 4, i_15_, 2)
                        Class108.aClass105_1664!!.method979((-i_5_ + i_16_) * 4 + 48, (-(4 * (i_17_ - i_6_)) + 464 + -(RuntimeException_Sub1.anInt4600 * 4)), RuntimeException_Sub1.anInt4600 * 4, 4 * RuntimeException_Sub1.anInt4600, i_18_, i_19_)
                        i_17_ += RuntimeException_Sub1.anInt4600
                    }
                    i_16_ += RuntimeException_Sub1.anInt4600
                }
                var_ha.la()
                var_ha.GA(-16777215)
                Class354.method3466(-86)
                Class348_Sub40_Sub38.anInt9479 = 0
                Class318_Sub1_Sub5_Sub1.aClass262_10125!!.method1996(116)
                if (!Class375.aBoolean4542) {
                    var i_37_ = i_5_
                    while (104 + i_5_ > i_37_) {
                        var i_38_ = i_6_
                        while (104 + i_6_ > i_38_) {
                            var i_39_ = i
                            while (i_39_ <= 1 + i && i_39_ <= 3) {
                                if (method536(i_38_, !bool, i_37_, i, i_39_)) {
                                    var interface10 = (method2878(i_39_, i_37_, i_38_) as Interface10?)
                                    if (interface10 == null) interface10 = ((method1353(i_39_, i_37_, i_38_, (if (aClass6767 != null) aClass6767 else (Interface10::class.java.also { aClass6767 = it })))) as Interface10?)
                                    if (interface10 == null) interface10 = (method3297(i_39_, i_37_, i_38_) as Interface10?)
                                    if (interface10 == null) interface10 = ((method3135(i_39_, i_37_, i_38_)) as Interface10?)
                                    if (interface10 != null) {
                                        val class51 = (Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, interface10.method42(-99)))
                                        if (!class51.aBoolean942 || Class130.aBoolean1900) {
                                            var i_40_ = class51.anInt921
                                            if (class51.anIntArray945 != null) {
                                                var i_41_ = 0
                                                while (((class51.anIntArray945!!).size > i_41_)) {
                                                    if ((class51.anIntArray945!![i_41_]) != -1) {
                                                        val class51_42_ = (Class348_Sub40_Sub12.aClass263_9195!!.method2005(0, (class51.anIntArray945!![i_41_])))
                                                        if (class51_42_.anInt921 >= 0) i_40_ = (class51_42_.anInt921)
                                                    }
                                                    i_41_++
                                                }
                                            }
                                            if (i_40_ >= 0) {
                                                var bool_43_ = false
                                                if (i_40_ >= 0) {
                                                    val class42 = (Class348_Sub23_Sub2.aClass153_9031!!.method1225(i_40_, 126.toByte()))
                                                    if (class42 != null && (class42.aBoolean599)) bool_43_ = true
                                                }
                                                var i_44_ = i_37_
                                                var i_45_ = i_38_
                                                if (bool_43_) {
                                                    val is_46_ = (Class348_Sub45.aClass361Array7108!![i_39_]!!.anIntArrayArray4438)!!
                                                    val i_47_ = (Class348_Sub45.aClass361Array7108!![i_39_]!!.anInt4453)
                                                    val i_48_ = (Class348_Sub45.aClass361Array7108!![i_39_]!!.anInt4441)
                                                    for (i_49_ in 0..9) {
                                                        val i_50_ = (Math.random() * 4.0).toInt()
                                                        if ((i_50_ == 0) && (i_44_ > i_5_) && i_37_ + -3 < i_44_ && ((0x2c0108 and (is_46_[(-i_47_ + (i_44_ - 1))]!![(-i_48_ + i_45_)])) == 0)) i_44_--
                                                        if (i_50_ == 1 && (i_44_ < 104 + (i_5_ - 1)) && 3 + i_37_ > i_44_ && ((is_46_[(-i_47_ + 1 + i_44_)]!![i_45_ + -i_48_]) and 0x2c0180) == 0) i_44_++
                                                        if ((i_50_ == 2) && (i_6_ < i_45_) && i_45_ > -3 + i_38_ && ((0x2c0102 and (is_46_[(-i_47_ + i_44_)]!![(i_45_ - 1 - i_48_)])) == 0)) i_45_--
                                                        if (i_50_ == 3 && (104 + i_6_ - 1 > i_45_) && 3 + i_38_ > i_45_ && ((0x2c0120 and (is_46_[i_44_ - i_47_]!![(-i_48_ + 1 + i_45_)])) == 0)) i_45_++
                                                    }
                                                }
                                                Class263.anIntArray3347!![(Class348_Sub40_Sub38.anInt9479)] = class51.anInt941
                                                Class348_Sub15.Companion.anIntArray6770!![(Class348_Sub40_Sub38.anInt9479)] = i_44_
                                                Class348_Sub40_Sub37.anIntArray9458!![(Class348_Sub40_Sub38.anInt9479)] = i_45_
                                                Class348_Sub40_Sub38.anInt9479++
                                            }
                                        }
                                    }
                                }
                                i_39_++
                            }
                            i_38_++
                        }
                        i_37_++
                    }
                    if (r_Sub2.aClass252_10488 != null) {
                        Class95.aClass45_1541!!.anInt634 = 1
                        Class348_Sub23_Sub2.aClass153_9031!!.method1220(116.toByte(), 64, 1024)
                        for (i_51_ in 0..<r_Sub2.aClass252_10488!!.anInt3241) {
                            val i_52_ = (r_Sub2.aClass252_10488!!.anIntArray3238!![i_51_])
                            if ((Class132.aPlayer_1907!!.plane).toInt() == i_52_ shr 28) {
                                val i_53_ = ((i_52_ shr 14 and 0x3fff) - za_Sub2.regionTileX)
                                val i_54_ = (i_52_ and 0x3fff) + -Class90.regionTileY
                                if (i_53_ >= 0 && i_53_ < Class367_Sub4.anInt7319 && i_54_ >= 0 && (Class348_Sub40_Sub3.anInt9109 > i_54_)) Class318_Sub1_Sub5_Sub1.aClass262_10125!!.method1999(Class348_Sub35(i_51_), -20180)
                                else {
                                    val class42 = (Class348_Sub23_Sub2.aClass153_9031!!.method1225((r_Sub2.aClass252_10488!!.anIntArray3239!![i_51_]), 120.toByte()))
                                    if (class42!!.anIntArray591 != null && (i_53_ + class42.anInt595 >= 0) && (Class367_Sub4.anInt7319 > class42.anInt603 + i_53_) && i_54_ + class42.anInt570 >= 0 && (Class348_Sub40_Sub3.anInt9109 > (i_54_ - -class42.anInt607))) Class318_Sub1_Sub5_Sub1.aClass262_10125!!.method1999(Class348_Sub35(i_51_), -20180)
                                }
                            }
                        }
                        Class348_Sub23_Sub2.aClass153_9031!!.method1220(13.toByte(), 64, 128)
                        Class95.aClass45_1541!!.anInt634 = 2
                        Class95.aClass45_1541!!.method412((-126).toByte())
                    }
                }
                return true
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.Companion.method2929(runtimeexception, ("ij.E(" + i + ',' + (if (var_ha != null) "{...}" else "null") + ',' + bool + ')'))
            }
        }
    }
}
