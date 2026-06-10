import Class318_Sub4.Companion.method2503
import Class99.method880
import jaclib.memory.Stream.Companion.c

class Class330 internal constructor(var_ha_Sub3: ha_Sub3?, var_s_Sub3: s_Sub3?) {
    private val aHa_Sub3_4111: ha_Sub3?
    var aByteArray4112: ByteArray
    var anInt4113: Int = 0
    private val aS_Sub3_4116: s_Sub3?
    private val anInt4118: Int
    private val anInt4121: Int
    private var aClass97ArrayArray4122: Array<Array<Class97?>?>? = null
    private val anInt4123: Int
    private val anInt4124: Int
    fun method2628(i: Int, i_0_: Byte, var_r: r?, i_1_: Int): Boolean {
        var i = i
        var i_1_ = i_1_
        anInt4119++
        val var_r_Sub1 = var_r as r_Sub1
        val i_2_ = 13 % ((i_0_ - -21) / 45)
        i_1_ += var_r_Sub1.anInt10474 + 1
        i += var_r_Sub1.anInt10468 - -1
        var i_3_ = i_1_ * this.anInt4113 + i
        var i_4_ = var_r_Sub1.anInt10467
        var i_5_ = var_r_Sub1.anInt10466
        var i_6_ = -i_5_ + this.anInt4113
        if (i_1_ <= 0) {
            val i_7_ = 1 + -i_1_
            i_4_ -= i_7_
            i_3_ += this.anInt4113 * i_7_
            i_1_ = 1
        }
        if (anInt4123 <= i_4_ + i_1_) {
            val i_8_ = -anInt4123 + (i_4_ + i_1_) - -1
            i_4_ -= i_8_
        }
        if (i <= 0) {
            val i_9_ = -i + 1
            i = 1
            i_6_ += i_9_
            i_5_ -= i_9_
            i_3_ += i_9_
        }
        if (i_5_ + i >= this.anInt4113) {
            val i_10_ = 1 + i + (i_5_ + -this.anInt4113)
            i_5_ -= i_10_
            i_6_ += i_10_
        }
        if (i_5_ <= 0 || i_4_ <= 0) return false
        val i_11_ = 8
        i_6_ += (i_11_ + -1) * this.anInt4113
        return method2503(i_6_, i_3_, i_11_, this.aByteArray4112, i_5_, -16259, i_4_)
    }

    fun method2629(i: Int, var_r: r?, i_12_: Int, i_13_: Int) {
        var i = i
        var i_13_ = i_13_
        anInt4114++
        val var_r_Sub1 = var_r as r_Sub1
        i_13_ += 1 + var_r_Sub1.anInt10468
        i += i_12_ + var_r_Sub1.anInt10474
        var i_14_ = i * this.anInt4113 + i_13_
        var i_15_ = 0
        var i_16_ = var_r_Sub1.anInt10467
        var i_17_ = var_r_Sub1.anInt10466
        var i_18_ = this.anInt4113 + -i_17_
        if (i <= 0) {
            val i_19_ = -i + 1
            i_14_ += this.anInt4113 * i_19_
            i_16_ -= i_19_
            i = 1
            i_15_ += i_19_ * i_17_
        }
        var i_20_ = 0
        if (anInt4123 <= i_16_ + i) {
            val i_21_ = -anInt4123 + i - -i_16_ + 1
            i_16_ -= i_21_
        }
        if (i_13_ <= 0) {
            val i_22_ = 1 + -i_13_
            i_20_ += i_22_
            i_18_ += i_22_
            i_13_ = 1
            i_14_ += i_22_
            i_15_ += i_22_
            i_17_ -= i_22_
        }
        if (i_13_ + i_17_ >= this.anInt4113) {
            val i_23_ = 1 + i_17_ + (i_13_ - this.anInt4113)
            i_18_ += i_23_
            i_17_ -= i_23_
            i_20_ += i_23_
        }
        if (i_17_ > 0 && i_16_ > 0) {
            Class348_Sub40_Sub37.method3146(i_18_, i_17_, (-116).toByte(), i_20_, i_16_, i_14_, this.aByteArray4112, (var_r_Sub1.aByteArray10471), i_15_)
            method2634(i, -1, i_13_, i_16_, i_17_)
        }
    }

    fun method2630(i: Int, i_24_: Int, i_25_: Int, bool: Boolean, bools: Array<BooleanArray?>, i_26_: Int) {
        anInt4115++
        aHa_Sub3_4111!!.method3866(false, true)
        aHa_Sub3_4111.method3946(-32, false)
        aHa_Sub3_4111.method3817(79, 1)
        aHa_Sub3_4111.method3923(true, 1)
        aHa_Sub3_4111.method3814(false, false, -2, 82.toByte())
        val f = 1.0f / (aHa_Sub3_4111.anInt8125 * i).toFloat()
        if (bool) {
            var i_27_ = 0
            while (anInt4118 > i_27_) {
                val i_28_ = i_27_ shl anInt4124
                val i_29_ = 1 + i_27_ shl anInt4124
                var i_30_ = 0
                while (anInt4121 > i_30_) {
                    if (aClass97ArrayArray4122!![i_30_]!![i_27_] != null) {
                        val i_31_ = i_30_ shl anInt4124
                        val i_32_ = i_30_ + 1 shl anInt4124
                        while_119_@ for (i_33_ in i_31_..<i_32_) {
                            if (-i_25_ + i_33_ >= -i_24_ && i_24_ >= -i_25_ + i_33_) {
                                var i_34_ = i_28_
                                while ((i_29_ > i_34_)) {
                                    if (-i_24_ <= i_34_ + -i_26_ && i_24_ >= -i_26_ + i_34_ && (bools[i_24_ + (-i_25_ + i_33_)]!![-i_26_ + i_34_ + i_24_])) {
                                        val class101_sub2 = aHa_Sub3_4111.method3820(false)
                                        class101_sub2.method932(1.0f, f, f, (-65).toByte())
                                        class101_sub2.method891(-i_30_, -i_27_, 0)
                                        aHa_Sub3_4111.method3853(i xor 0x9f.inv(), Class239_Sub18.aClass251_6030)
                                        aClass97ArrayArray4122!![i_30_]!![i_27_]!!.method871(116.toByte())
                                        break@while_119_
                                    }
                                    i_34_++
                                }
                            }
                        }
                    }
                    i_30_++
                }
                i_27_++
            }
        } else {
            var i_35_ = 0
            while (anInt4118 > i_35_) {
                val i_36_ = i_35_ shl anInt4124
                val i_37_ = 1 + i_35_ shl anInt4124
                for (i_38_ in 0..<anInt4121) {
                    val class97 = aClass97ArrayArray4122!![i_38_]!![i_35_]
                    if (class97 != null) {
                        val interface5_impl2 = aHa_Sub3_4111.method3822(118, (class97.anInt1563) * 3)
                        val buffer = interface5_impl2.method24(true, false)
                        if (buffer != null) {
                            val stream = aHa_Sub3_4111.method3893(buffer, 9179)
                            var i_39_ = 0
                            val i_40_ = i_38_ shl anInt4124
                            val i_41_ = i_38_ + 1 shl anInt4124
                            for (i_42_ in i_36_..<i_37_) {
                                if (-i_26_ + i_42_ >= -i_24_ && (i_42_ - i_26_ <= i_24_)) {
                                    var i_43_ = (i_42_ * aS_Sub3_4116!!.anInt4587 - -i_40_)
                                    var i_44_ = i_40_
                                    while ((i_44_ < i_41_)) {
                                        if ((-i_25_ + i_44_ >= -i_24_) && i_24_ >= i_44_ - i_25_ && (bools[i_24_ + (i_44_ + -i_25_)]!![i_24_ + -i_26_ + i_42_])) {
                                            val `is` = (aS_Sub3_4116.aShortArrayArray8299[i_43_])
                                            if (`is` != null) {
                                                if (c()) {
                                                    var i_46_ = 0
                                                    while ((`is`.size > i_46_)) {
                                                        stream.d(`is`[i_46_].toInt() and 0xffff)
                                                        i_39_++
                                                        i_46_++
                                                    }
                                                } else {
                                                    var i_45_ = 0
                                                    while (`is`.size > i_45_) {
                                                        i_39_++
                                                        stream.a(`is`[i_45_].toInt() and 0xffff)
                                                        i_45_++
                                                    }
                                                }
                                            }
                                        }
                                        i_43_++
                                        i_44_++
                                    }
                                }
                            }
                            stream.a()
                            if (interface5_impl2.method22(-23) && i_39_ > 0) {
                                val class101_sub2 = aHa_Sub3_4111.method3820(false)
                                class101_sub2.method932(1.0f, f, f, (-62).toByte())
                                class101_sub2.method891(-i_38_, -i_35_, 0)
                                aHa_Sub3_4111.method3853(i xor 0x9f.inv(), (Class239_Sub18.aClass251_6030))
                                class97.method875(-82, interface5_impl2, i_39_ / 3)
                            }
                        }
                    }
                }
                i_35_++
            }
        }
        aHa_Sub3_4111.method3879(-8629)
    }

    fun method2632(i: Int) {
        aClass97ArrayArray4122 = Array<Array<Class97?>?>(anInt4121) { arrayOfNulls<Class97>(anInt4118) }
        anInt4125++
        var i_48_ = 0
        while (anInt4118 > i_48_) {
            for (i_49_ in 0..<anInt4121) {
                aClass97ArrayArray4122!![i_49_]!![i_48_] = Class97(aHa_Sub3_4111, this, aS_Sub3_4116, i_49_, i_48_, anInt4124, 128 * i_49_ - -1, 128 * i_48_ + 1)
                if (aClass97ArrayArray4122!![i_49_]!![i_48_]!!.anInt1563 == 0) aClass97ArrayArray4122!![i_49_]!![i_48_] = null
            }
            i_48_++
        }
    }

    fun method2633(i: Int, i_50_: Int, var_r: r?, i_51_: Int) {
        var i_50_ = i_50_
        var i_51_ = i_51_
        anInt4120++
        val var_r_Sub1 = var_r as r_Sub1
        i_51_ += var_r_Sub1.anInt10474 + 1
        i_50_ += 1 + var_r_Sub1.anInt10468
        if (i != 287) method2634(-49, -3, 16, -9, -115)
        var i_52_ = i_50_ + this.anInt4113 * i_51_
        var i_53_ = 0
        var i_54_ = var_r_Sub1.anInt10467
        var i_55_ = var_r_Sub1.anInt10466
        var i_56_ = -i_55_ + this.anInt4113
        if (i_51_ <= 0) {
            val i_57_ = -i_51_ + 1
            i_52_ += this.anInt4113 * i_57_
            i_54_ -= i_57_
            i_53_ += i_57_ * i_55_
            i_51_ = 1
        }
        var i_58_ = 0
        if (anInt4123 <= i_54_ + i_51_) {
            val i_59_ = -anInt4123 + (i_51_ - -i_54_) + 1
            i_54_ -= i_59_
        }
        if (i_50_ <= 0) {
            val i_60_ = 1 + -i_50_
            i_53_ += i_60_
            i_56_ += i_60_
            i_58_ += i_60_
            i_52_ += i_60_
            i_50_ = 1
            i_55_ -= i_60_
        }
        if (i_55_ + i_50_ >= this.anInt4113) {
            val i_61_ = 1 + (i_55_ + (i_50_ + -this.anInt4113))
            i_58_ += i_61_
            i_55_ -= i_61_
            i_56_ += i_61_
        }
        if (i_55_ > 0 && i_54_ > 0) {
            method880(i_55_, this.aByteArray4112, var_r_Sub1.aByteArray10471, i_53_, i + 13593, i_54_, i_52_, i_56_, i_58_)
            method2634(i_51_, -1, i_50_, i_54_, i_55_)
        }
    }

    private fun method2634(i: Int, i_62_: Int, i_63_: Int, i_64_: Int, i_65_: Int) {
        anInt4110++
        if (aClass97ArrayArray4122 != null) {
            val i_66_ = -1 + i_63_ shr 7
            val i_67_ = -1 + (i_65_ + i_63_ - 1) shr 7
            val i_68_ = i + -1 shr 7
            val i_69_ = i_62_ + (-1 + (i - -i_64_)) shr 7
            var i_70_ = i_66_
            while (i_67_ >= i_70_) {
                val class97s = aClass97ArrayArray4122!![i_70_]!!
                var i_71_ = i_68_
                while (i_69_ >= i_71_) {
                    if (class97s[i_71_] != null) class97s[i_71_]!!.aBoolean1562 = true
                    i_71_++
                }
                i_70_++
            }
        }
    }

    init {
        try {
            aHa_Sub3_4111 = var_ha_Sub3
            aS_Sub3_4116 = var_s_Sub3
            this.anInt4113 = 2 + ((aS_Sub3_4116!!.anInt4587 * aS_Sub3_4116.anInt4592) shr aHa_Sub3_4111!!.anInt8107)
            anInt4123 = (aS_Sub3_4116.anInt4592 * aS_Sub3_4116.anInt4590 shr aHa_Sub3_4111.anInt8107) + 2
            this.aByteArray4112 = ByteArray(this.anInt4113 * anInt4123)
            anInt4124 = (-aS_Sub3_4116.anInt4588 + (7 + aHa_Sub3_4111.anInt8107))
            anInt4121 = aS_Sub3_4116.anInt4587 shr anInt4124
            anInt4118 = aS_Sub3_4116.anInt4590 shr anInt4124
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("dg.<init>(" + (if (var_ha_Sub3 != null) "{...}" else "null") + ',' + (if (var_s_Sub3 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt4110: Int = 0
        var anInt4114: Int = 0
        var anInt4115: Int = 0
        var aBoolean4117: Boolean = false
        var anInt4119: Int = 0
        var anInt4120: Int = 0
        var anInt4125: Int = 0
        var aClass114_4126: Class114? = Class114(5, 8)
        @JvmField
        var aBoolean4127: Boolean = false

        @JvmStatic
        fun method2631(i: Int) {
            val i_47_ = -46 / ((65 - i) / 61)
            aClass114_4126 = null
        }
    }
}
