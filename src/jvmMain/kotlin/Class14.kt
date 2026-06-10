import jaggl.OpenGL.Companion.glBindTexture
import jaggl.OpenGL.Companion.glDisable
import jaggl.OpenGL.Companion.glEnable
import jaggl.OpenGL.Companion.glGenTextures
import jaggl.OpenGL.Companion.glTexImage2Df
import jaggl.OpenGL.Companion.glTexImage2Di
import jaggl.OpenGL.Companion.glTexImage2Dub
import jaggl.OpenGL.Companion.glTexParameteri
import kotlin.math.min

abstract class Class14(class377: Class377?, i: Int, class304: Class304?, class68: Class68?, i_66_: Int, bool: Boolean) : Interface18 {
    @JvmField
    var aClass377_5082: Class377? = null
    @JvmField
    var aClass304_5084: Class304? = null
    @JvmField
    var aClass68_5088: Class68? = null
    private val anInt5090: Int
    @JvmField
    var anInt5093: Int = 0
    private var anInt5096 = 0
    private var aBoolean5099 = false
    private var aClass209_5101: Class209? = Class71.aClass209_1212
    override fun method63(i: Byte) {
        anInt5104++
        val i_0_ = this.aClass377_5082!!.method3877((-126).toByte())
        if (i > -21) this.aClass377_5082 = null
        val i_1_ = (this.aClass377_5082!!.anIntArray9927!![i_0_])
        if (this.anInt5093 != i_1_) {
            if (i_1_ != 0) {
                glBindTexture(i_1_, 0)
                glDisable(i_1_)
            }
            glEnable(this.anInt5093)
            this.aClass377_5082!!.anIntArray9927!![i_0_] = this.anInt5093
        }
        glBindTexture(this.anInt5093, anInt5096)
    }

    fun method228(i: Int): Int {
        anInt5085++
        if (Class68.aClass68_1183 != this.aClass68_5088) {
            if (Class68.aClass68_1186 == this.aClass68_5088) {
                if (this.aClass304_5084 == Class348_Sub45.aClass304_7103) return 34843
                if (Class108.aClass304_1662 == this.aClass304_5084) return 34842
                if (this.aClass304_5084 != Class348_Sub40_Sub38.aClass304_9471) {
                    if (this.aClass304_5084 != Class348_Sub40_Sub22.aClass304_9303) {
                        if (Class191.aClass304_2571 != this.aClass304_5084) {
                            if (this.aClass304_5084 == Class318.aClass304_3977) return 6145
                        } else return 34847
                    } else return 34846
                } else return 34844
            } else if (this.aClass68_5088 == Class68.aClass68_1187) {
                if (Class348_Sub45.aClass304_7103 != this.aClass304_5084) {
                    if (this.aClass304_5084 == Class108.aClass304_1662) return 34836
                    if (this.aClass304_5084 != Class348_Sub40_Sub38.aClass304_9471) {
                        if (Class348_Sub40_Sub22.aClass304_9303 == this.aClass304_5084) return 34840
                        if (Class191.aClass304_2571 != this.aClass304_5084) {
                            if (Class318.aClass304_3977 == this.aClass304_5084) return 6145
                        } else return 34841
                    } else return 34838
                } else return 34837
            }
        } else if (this.aClass304_5084 != Class348_Sub45.aClass304_7103) {
            if (this.aClass304_5084 != Class108.aClass304_1662) {
                if (this.aClass304_5084 != Class348_Sub40_Sub38.aClass304_9471) {
                    if (Class348_Sub40_Sub22.aClass304_9303 == this.aClass304_5084) return 6409
                    if (this.aClass304_5084 == Class191.aClass304_2571) return 6410
                    if (this.aClass304_5084 == Class318.aClass304_3977) return 6145
                } else return 6406
            } else return 6408
        } else return 6407
        if (i <= 104) method238(-54, 105, 2, null, 120)
        throw IllegalStateException()
    }

    private fun method229(bool: Boolean) {
        this.aClass377_5082!!.method3850(107.toByte(), this)
        anInt5083++
        if (aClass209_5101 == Class71.aClass209_1212) {
            glTexParameteri(this.anInt5093, 10241, if (!aBoolean5099) 9729 else 9987)
            glTexParameteri(this.anInt5093, 10240, 9729)
        } else {
            glTexParameteri(this.anInt5093, 10241, if (!aBoolean5099) 9728 else 9984)
            glTexParameteri(this.anInt5093, 10240, 9728)
        }
        if (bool != true) method232(null, 106.toByte(), true, 70)
    }

    fun method230(i: Int, i_2_: Int, `is`: ByteArray, i_3_: Int, i_4_: Int) {
        var i_2_ = i_2_
        var i_3_ = i_3_
        anInt5100++
        require(!(i_2_ > 0 && !Class192.method1436(66, i_2_))) { "" }
        require(!(i_3_ > 0 && !Class192.method1436(i xor 0x1cb6, i_3_))) { "" }
        val i_5_ = this.aClass304_5084!!.anInt3850
        var i_6_ = 0
        var i_7_ = min(i_2_, i_3_)
        var i_8_ = i_2_ shr 1
        if (i != 7365) method236(0, (-113).toByte())
        var i_9_ = i_3_ shr 1
        var is_10_ = `is`
        var is_11_ = ByteArray(i_9_ * (i_8_ * i_5_))
        while (true) {
            glTexImage2Dub(i_4_, i_6_, method228(108), i_2_, i_3_, 0, Class348_Sub40_Sub3.method3055(i + -7265, this.aClass304_5084), 5121, is_10_, 0)
            if (i_7_ <= 1) break
            val i_12_ = i_2_ * i_5_
            var i_13_ = 0
            while (i_5_ > i_13_) {
                var i_14_ = i_13_
                var i_15_ = i_13_
                var i_16_ = i_15_ - -i_12_
                for (i_17_ in 0..<i_9_) {
                    var i_18_ = 0
                    while (i_8_ > i_18_) {
                        var i_19_ = is_10_[i_15_].toInt()
                        i_15_ += i_5_
                        i_19_ += is_10_[i_15_].toInt()
                        i_19_ += is_10_[i_16_].toInt()
                        i_15_ += i_5_
                        i_16_ += i_5_
                        i_19_ += is_10_[i_16_].toInt()
                        is_11_[i_14_] = (i_19_ shr 2).toByte()
                        i_16_ += i_5_
                        i_14_ += i_5_
                        i_18_++
                    }
                    i_15_ += i_12_
                    i_16_ += i_12_
                }
                i_13_++
            }
            val is_20_ = is_11_
            is_11_ = is_10_
            i_2_ = i_8_
            i_3_ = i_9_
            is_10_ = is_20_
            i_8_ = i_8_ shr 1
            i_9_ = i_9_ shr 1
            i_6_++
            i_7_ = i_7_ shr 1
        }
    }

    private fun method231(i: Int): Int {
        anInt5095++
        val i_21_ = (anInt5090 * (this.aClass68_5088!!.anInt1178 * this.aClass304_5084!!.anInt3850))
        if (i >= -105) method232(null, 118.toByte(), true, 16)
        if (aBoolean5099) return 4 * i_21_ / 3
        return i_21_
    }

    fun method233(i: Int, i_23_: Int, `is`: IntArray, i_24_: Int, i_25_: Int) {
        var i = i
        var i_23_ = i_23_
        anInt5092++
        require(!(i > 0 && !Class192.method1436(-43, i))) { "" }
        require(!(i_23_ > 0 && !Class192.method1436(i_25_ xor 0xd2.inv(), i_23_))) { "" }
        require(Class108.aClass304_1662 == this.aClass304_5084) { "" }
        var i_26_ = 0
        var i_27_ = min(i, i_23_)
        var i_28_ = i shr 1
        var i_29_ = i_23_ shr 1
        var is_30_ = `is`
        var is_31_ = IntArray(i_29_ * i_28_)
        if (i_25_ != 255) aBoolean5099 = true
        while (true) {
            glTexImage2Di(i_24_, i_26_, method228(112), i, i_23_, 0, 32993, (this.aClass377_5082!!.anInt9918), is_30_, 0)
            if (i_27_ <= 1) break
            var i_32_ = 0
            var i_33_ = 0
            var i_34_ = i_33_ + i
            var i_35_ = 0
            while (i_29_ > i_35_) {
                var i_36_ = 0
                while (i_28_ > i_36_) {
                    val i_37_ = is_30_[i_33_++]
                    val i_38_ = is_30_[i_33_++]
                    val i_39_ = is_30_[i_34_++]
                    var i_40_ = i_37_ shr 16 and 0xff
                    var i_41_ = 0xff and (i_37_ shr 24)
                    var i_42_ = 0xff and i_37_
                    var i_43_ = (i_37_ and 0xff58) shr 8
                    val i_44_ = is_30_[i_34_++]
                    i_42_ += i_38_ and 0xff
                    i_40_ += (0xffba54 and i_38_) shr 16
                    i_41_ += 0xff and (i_38_ shr 24)
                    i_43_ += 0xff and (i_38_ shr 8)
                    i_41_ += i_39_ shr 24 and 0xff
                    i_42_ += i_39_ and 0xff
                    i_43_ += (0xff9c and i_39_) shr 8
                    i_40_ += i_39_ shr 16 and 0xff
                    i_41_ += i_44_ shr 24 and 0xff
                    i_40_ += 0xff and (i_44_ shr 16)
                    i_43_ += 0xff and (i_44_ shr 8)
                    i_42_ += i_44_ and 0xff
                    is_31_[i_32_++] = (Class273.method2057((Class273.method2057(Class139.method1166(i_43_ shl 6, 65280), Class273.method2057((Class139.method1166(i_41_, 1020) shl 22), (Class139.method1166(1020, i_40_) shl 14)))), Class139.method1166(255, i_42_ shr 2)))
                    i_36_++
                }
                i_33_ += i
                i_34_ += i
                i_35_++
            }
            val is_45_ = is_31_
            is_31_ = is_30_
            i_23_ = i_29_
            is_30_ = is_45_
            i = i_28_
            i_28_ = i_28_ shr 1
            i_26_++
            i_27_ = i_27_ shr 1
            i_29_ = i_29_ shr 1
        }
    }

    private fun method234(i: Int) {
        if (i == 1617553025) {
            if (anInt5096 > 0) {
                this.aClass377_5082!!.method3967(method231(-109), 59.toByte(), anInt5096)
                anInt5096 = 0
            }
            anInt5097++
        }
    }

    private fun method236(i: Int, i_47_: Byte) {
        anInt5098++
        this.aClass377_5082!!.anInt8062 -= i
        this.aClass377_5082!!.anInt8062 += method231(-119)
        if (i_47_ >= -124) aBoolean5099 = false
    }

    override fun method64(class209: Class209?, i: Int) {
        anInt5086++
        if (i != -22095) this.aClass304_5084 = null
        if (class209 != aClass209_5101) {
            aClass209_5101 = class209
            method229(true)
        }
    }

    fun method238(i: Int, i_48_: Int, i_49_: Int, fs: FloatArray?, i_50_: Int) {
        var i_49_ = i_49_
        var i_50_ = i_50_
        anInt5102++
        require(!(i_49_ > 0 && !Class192.method1436(100, i_49_))) { "" }
        require(!(i_50_ > 0 && !Class192.method1436(i_48_ + 109, i_50_))) { "" }
        val i_51_ = this.aClass304_5084!!.anInt3850
        var i_52_ = 0
        if (i_48_ != 1) method228(107)
        var i_53_ = min(i_50_, i_49_)
        var i_54_ = i_49_ shr 1
        var i_55_ = i_50_ shr 1
        var fs_56_ = fs!!
        var fs_57_ = FloatArray(i_54_ * (i_55_ * i_51_))
        while (true) {
            glTexImage2Df(i, i_52_, method228(123), i_49_, i_50_, 0, (Class348_Sub40_Sub3.method3055(124, this.aClass304_5084)), 5126, fs_56_, 0)
            if (i_53_ <= 1) break
            val i_58_ = i_49_ * i_51_
            var i_59_ = 0
            while (i_51_ > i_59_) {
                var i_60_ = i_59_
                var i_61_ = i_59_
                var i_62_ = i_61_ + i_58_
                for (i_63_ in 0..<i_55_) {
                    var i_64_ = 0
                    while (i_54_ > i_64_) {
                        var f = fs_56_[i_61_]
                        i_61_ += i_51_
                        f += fs_56_[i_61_]
                        f += fs_56_[i_62_]
                        i_61_ += i_51_
                        i_62_ += i_51_
                        f += fs_56_[i_62_]
                        i_62_ += i_51_
                        fs_57_[i_60_] = 0.25f * f
                        i_60_ += i_51_
                        i_64_++
                    }
                    i_62_ += i_58_
                    i_61_ += i_58_
                }
                i_59_++
            }
            val fs_65_ = fs_57_
            fs_57_ = fs_56_
            i_49_ = i_54_
            i_50_ = i_55_
            fs_56_ = fs_65_
            i_54_ = i_54_ shr 1
            i_55_ = i_55_ shr 1
            i_53_ = i_53_ shr 1
            i_52_++
        }
    }

    @Throws(Throwable::class)
    protected fun finalize() {
        anInt5103++
        method234(1617553025)
//        super.finalize()
    }

    init {
        try {
            anInt5090 = i_66_
            this.aClass377_5082 = class377
            this.aClass304_5084 = class304
            this.aClass68_5088 = class68
            aBoolean5099 = bool
            this.anInt5093 = i
            glGenTextures(1, Class141.anIntArray1975, 0)
            anInt5096 = Class141.anIntArray1975!![0]
            method229(true)
            method236(0, (-126).toByte())
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("hda.<init>(" + (if (class377 != null) "{...}" else "null") + ',' + i + ',' + (if (class304 != null) "{...}" else "null") + ',' + (if (class68 != null) "{...}" else "null") + ',' + i_66_ + ',' + bool + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt5083: Int = 0
        @JvmField
        var anInt5085: Int = 0
        @JvmField
        var anInt5086: Int = 0
        @JvmField
        var anInt5087: Int = 0
        @JvmField
        var aLong5089: Long = -1L
        @JvmField
        var anIntArray5091: IntArray? = null
        @JvmField
        var anInt5092: Int = 0
        @JvmField
        var anInt5094: Int = 0
        @JvmField
        var anInt5095: Int = 0
        @JvmField
        var anInt5097: Int = 0
        @JvmField
        var anInt5098: Int = 0
        @JvmField
        var anInt5100: Int = 0
        @JvmField
        var anInt5102: Int = 0
        @JvmField
        var anInt5103: Int = 0
        @JvmField
        var anInt5104: Int = 0

        @JvmStatic
        fun method232(var_ha: ha?, i: Byte, bool: Boolean, i_22_: Int): Class324? {
            if (i.toInt() != -53) method237(true)
            anInt5094++
            val class352 = Class239_Sub3.method1734(i_22_, var_ha, 55.toByte(), bool)
            if (class352 == null) return null
            return class352.aClass324_4332
        }

        @JvmStatic
        fun method235(i: Int, i_46_: Byte) {
            anInt5087++
            if (i != -1 && Class163.aBooleanArray2162!![i]) {
                Class229.aClass45_2978!!.method411(i, -120)
                Class348_Sub40_Sub33.aClass46ArrayArray9427!![i] = null
                Class369_Sub2.aClass46ArrayArray8584!![i] = null
                if (i_46_ <= -94) Class163.aBooleanArray2162!![i] = false
            }
        }

        @JvmStatic
        fun method237(bool: Boolean) {
            if (bool != false) aLong5089 = -54L
            anIntArray5091 = null
        }
    }
}
