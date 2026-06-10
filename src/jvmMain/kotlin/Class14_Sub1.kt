import Class130.Companion.method1128
import Class348_Sub40_Sub3.Companion.method3055
import jaggl.OpenGL.Companion.glGetTexImagei
import jaggl.OpenGL.Companion.glPixelStorei
import jaggl.OpenGL.Companion.glTexImage2Df
import jaggl.OpenGL.Companion.glTexImage2Di
import jaggl.OpenGL.Companion.glTexImage2Dub
import jaggl.OpenGL.Companion.glTexParameteri
import jaggl.OpenGL.Companion.glTexSubImage2Df
import jaggl.OpenGL.Companion.glTexSubImage2Di
import jaggl.OpenGL.Companion.glTexSubImage2Dub
import kotlin.math.atan2
import kotlin.math.sqrt

class Class14_Sub1 : Class14, Interface18_Impl3 {
    private var anInt8604 = 0
    private var anInt8612 = 0
    override fun method71(i: Byte, f: Float): Float {
        anInt8606++
        if (i >= -24) method242(false)
        return f / anInt8604.toFloat()
    }

    internal constructor(class377: Class377?, i: Int, i_0_: Int, bool: Boolean, `is`: IntArray?, i_1_: Int, i_2_: Int) : super(class377, 3553, Class108.aClass304_1662, Class68.aClass68_1183, i * i_0_, bool) {
        try {
            anInt8612 = i
            anInt8604 = i_0_
            this.aClass377_5082!!.method3850(79.toByte(), this)
            if (bool && i_2_ == 0 && i_1_ == 0) this.method233(i, i_0_, `is`!!, this.anInt5093, 255)
            else {
                glPixelStorei(3314, i_2_)
                glTexImage2Di(this.anInt5093, 0, 6408, anInt8612, anInt8604, 0, 32993, this.aClass377_5082!!.anInt9918, `is`, 4 * i_1_)
                glPixelStorei(3314, 0)
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bm.<init>(" + (if (class377 != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + bool + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ')'))
        }
    }

    internal constructor(class377: Class377?, class304: Class304?, i: Int, i_6_: Int, bool: Boolean, `is`: ByteArray?, i_7_: Int, i_8_: Int) : super(class377, 3553, class304, Class68.aClass68_1183, i_6_ * i, bool) {
        try {
            anInt8612 = i
            anInt8604 = i_6_
            this.aClass377_5082!!.method3850((-102).toByte(), this)
            glPixelStorei(3317, 1)
            if (!bool || i_8_ != 0 || i_7_ != 0) {
                glPixelStorei(3314, i_8_)
                glTexImage2Dub(this.anInt5093, 0, this.method228(109), i, i_6_, 0, (method3055(121, this.aClass304_5084)), 5121, `is`, i_7_)
                glPixelStorei(3314, 0)
            } else this.method230(7365, i, `is`!!, i_6_, this.anInt5093)
            glPixelStorei(3317, 4)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bm.<init>(" + (if (class377 != null) "{...}" else "null") + ',' + (if (class304 != null) "{...}" else "null") + ',' + i + ',' + i_6_ + ',' + bool + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_7_ + ',' + i_8_ + ')'))
        }
    }

    override fun method67(f: Float, i: Int): Float {
        anInt8611++
        if (i <= 69) method72(84)
        return f / anInt8612.toFloat()
    }

    fun method240(i: Int, i_9_: Byte, fs: FloatArray?, class304: Class304?, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int) {
        try {
            val i_15_ = 108 / ((-45 - i_9_) / 49)
            anInt8614++
            this.aClass377_5082!!.method3850((-106).toByte(), this)
            glPixelStorei(3314, i)
            glTexSubImage2Df(this.anInt5093, 0, i_12_, i_10_, i_13_, i_14_, method3055(106, class304), 5121, fs, i_11_)
            glPixelStorei(3314, 0)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bm.CA(" + i + ',' + i_9_ + ',' + (if (fs != null) "{...}" else "null") + ',' + (if (class304 != null) "{...}" else "null") + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'))
        }
    }

    override fun method70(i: Int, i_27_: Int, i_28_: Byte, i_29_: Int, i_30_: Int, i_31_: Int, i_32_: Int, `is`: ByteArray?, class304: Class304?) {
        try {
            anInt8608++
            this.aClass377_5082!!.method3850((-24).toByte(), this)
            glPixelStorei(3317, 1)
            glPixelStorei(3314, i_29_)
            glTexSubImage2Dub(this.anInt5093, 0, i_32_, i, i_31_, i_30_, method3055(103, class304), 5121, `is`, i_27_)
            if (i_28_ >= -4) anInt8612 = 33
            glPixelStorei(3314, 0)
            glPixelStorei(3317, 4)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bm.T(" + i + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (class304 != null) "{...}" else "null") + ')'))
        }
    }

    override fun method65(i: Int, `is`: IntArray, i_33_: Int, i_34_: Int, i_35_: Int, i_36_: Byte, i_37_: Int) {
        anInt8613++
        val is_38_ = IntArray(anInt8612 * anInt8604)
        this.aClass377_5082!!.method3850((-32).toByte(), this)
        glGetTexImagei(this.anInt5093, 0, 32993, 5121, is_38_, 0)
        if (i_36_.toInt() == 112) {
            var i_39_ = 0
            while (i_35_ > i_39_) {
                Class214.method1578(is_38_, ((-i_39_ + i_35_ + (-1 + i_34_)) * anInt8612), `is`, i_33_ * i_39_ + i_37_, i_33_)
                i_39_++
            }
        }
    }

    override fun method69(bool: Boolean): Int {
        anInt8607++
        if (bool != false) return -121
        return anInt8612
    }

    override fun method72(i: Int): Int {
        anInt8609++
        val i_40_ = -48 / ((55 - i) / 63)
        return anInt8604
    }

    override fun method73(i: Int): Boolean {
        anInt8618++
        return i >= 84
    }

    override fun method68(i: Int, i_41_: Int, `is`: IntArray?, i_42_: Int, i_43_: Int, i_44_: Int, i_45_: Int, i_46_: Int) {
        this.aClass377_5082!!.method3850((-116).toByte(), this)
        if (i_41_ != 22809) aString8605 = null
        anInt8616++
        glPixelStorei(3314, i)
        glTexSubImage2Di(this.anInt5093, 0, i_42_, i_45_, i_44_, i_46_, 32993, (this.aClass377_5082!!.anInt9918), `is`, i_43_)
        glPixelStorei(3314, 0)
    }

    internal constructor(class377: Class377?, class304: Class304?, class68: Class68?, i: Int, i_47_: Int) : super(class377, 3553, class304, class68, i_47_ * i, false) {
        try {
            anInt8612 = i
            anInt8604 = i_47_
            this.aClass377_5082!!.method3850(110.toByte(), this)
            glTexImage2Dub(this.anInt5093, 0, this.method228(113), i, i_47_, 0, method3055(113, this.aClass304_5084), method1128(-112, this.aClass68_5088), null, 0)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bm.<init>(" + (if (class377 != null) "{...}" else "null") + ',' + (if (class304 != null) "{...}" else "null") + ',' + (if (class68 != null) "{...}" else "null") + ',' + i + ',' + i_47_ + ')'))
        }
    }

    override fun method66(bool: Boolean, bool_48_: Boolean, i: Int) {
        this.aClass377_5082!!.method3850((-29).toByte(), this)
        anInt8615++
        glTexParameteri(this.anInt5093, 10242, if (!bool) 33071 else 10497)
        glTexParameteri(this.anInt5093, 10243, if (!bool_48_) 33071 else 10497)
        if (i != 25688) anInt8604 = -90
    }

    internal constructor(class377: Class377?, class304: Class304?, i: Int, i_49_: Int, bool: Boolean, fs: FloatArray?, i_50_: Int, i_51_: Int) : super(class377, 3553, class304, Class68.aClass68_1187, i * i_49_, bool) {
        try {
            anInt8612 = i
            anInt8604 = i_49_
            this.aClass377_5082!!.method3850((-67).toByte(), this)
            if (bool || i_51_ != 0 || i_50_ != 0) {
                glPixelStorei(3314, i_51_)
                glTexImage2Df(this.anInt5093, 0, this.method228(111), i, i_49_, 0, (method3055(106, this.aClass304_5084)), 5126, fs, 4 * i_50_)
                glPixelStorei(3314, 0)
            } else this.method238(this.anInt5093, 1, i, fs, i_49_)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("bm.<init>(" + (if (class377 != null) "{...}" else "null") + ',' + (if (class304 != null) "{...}" else "null") + ',' + i + ',' + i_49_ + ',' + bool + ',' + (if (fs != null) "{...}" else "null") + ',' + i_50_ + ',' + i_51_ + ')'))
        }
    }

    companion object {
        @JvmField
        var aString8605: String? = null
        @JvmField
        var anInt8606: Int = 0
        @JvmField
        var anInt8607: Int = 0
        @JvmField
        var anInt8608: Int = 0
        @JvmField
        var anInt8609: Int = 0
        @JvmField
        var anInt8610: Int = 0
        @JvmField
        var anInt8611: Int = 0
        @JvmField
        var anInt8613: Int = 0
        @JvmField
        var anInt8614: Int = 0
        @JvmField
        var anInt8615: Int = 0
        @JvmField
        var anInt8616: Int = 0
        @JvmField
        var anInt8617: Int = 0
        @JvmField
        var anInt8618: Int = 0

        @JvmStatic
        fun method239(i: Byte, i_3_: Int, i_4_: Int, class46: Class46) {
            anInt8610++
            if (class46.aByte817.toInt() != 0) {
                if (class46.aByte817.toInt() == 1) class46.anInt800 = ((-class46.anInt709 + i_3_) / 2 + class46.anInt788)
                else if (class46.aByte817.toInt() != 2) {
                    if (class46.aByte817.toInt() != 3) {
                        if (class46.aByte817.toInt() != 4) class46.anInt800 = (-class46.anInt709 + i_3_ + -(i_3_ * class46.anInt788 shr 14))
                        else class46.anInt800 = ((-class46.anInt709 + i_3_) / 2 - -(i_3_ * class46.anInt788 shr 14))
                    } else class46.anInt800 = i_3_ * class46.anInt788 shr 14
                } else class46.anInt800 = (-class46.anInt788 + (-class46.anInt709 + i_3_))
            } else class46.anInt800 = class46.anInt788
            val i_5_ = 83 % ((i - 50) / 50)
            if (class46.aByte681.toInt() != 0) {
                if (class46.aByte681.toInt() == 1) class46.anInt750 = ((i_4_ + -class46.anInt789) / 2 - -class46.anInt739)
                else if (class46.aByte681.toInt() == 2) class46.anInt750 = (i_4_ - class46.anInt789 - class46.anInt739)
                else if (class46.aByte681.toInt() != 3) {
                    if (class46.aByte681.toInt() != 4) class46.anInt750 = (-(i_4_ * class46.anInt739 shr 14) + (i_4_ + -class46.anInt789))
                    else class46.anInt750 = ((i_4_ * class46.anInt739 shr 14) + (-class46.anInt789 + i_4_) / 2)
                } else class46.anInt750 = class46.anInt739 * i_4_ shr 14
            } else class46.anInt750 = class46.anInt739
            if (Class299_Sub2.aBoolean6327 && (Client.method105(class46)!!.anInt7098 != 0 || class46.anInt774 == 0)) {
                if (class46.anInt750 < 0) class46.anInt750 = 0
                else if (i_4_ < (class46.anInt789 + class46.anInt750)) class46.anInt750 = i_4_ - class46.anInt789
                if (class46.anInt800 >= 0) {
                    if (i_3_ < (class46.anInt800 - -class46.anInt709)) class46.anInt800 = i_3_ + -class46.anInt709
                } else class46.anInt800 = 0
            }
        }

        @JvmStatic
        fun method241(i: Byte) {
            anInt8617++
            var i_16_ = Class348_Sub35.anInt6981 * 512 + 256
            var i_17_ = 512 * Class275.anInt3550 + 256
            var i_18_ = (Class275.method2064(i_16_, Class355.anInt4372, 11219, i_17_) + -Class348_Sub42_Sub4.anInt9515)
            if (Class258_Sub2.anInt8537 >= 100) {
                Class59_Sub2_Sub2.anInt8685 = 256 + 512 * Class275.anInt3550
                Class286_Sub4.anInt6246 = Class348_Sub35.anInt6981 * 512 + 256
                Class305.anInt3855 = (Class275.method2064(Class286_Sub4.anInt6246, Class355.anInt4372, 11219, Class59_Sub2_Sub2.anInt8685) + -Class348_Sub42_Sub4.anInt9515)
            } else {
                if (Class286_Sub4.anInt6246 < i_16_) {
                    Class286_Sub4.anInt6246 += (Class348_Sub40_Sub31.anInt9406 + (Class258_Sub2.anInt8537 * (i_16_ + -Class286_Sub4.anInt6246) / 1000))
                    if (i_16_ < Class286_Sub4.anInt6246) Class286_Sub4.anInt6246 = i_16_
                }
                if (Class286_Sub4.anInt6246 > i_16_) {
                    Class286_Sub4.anInt6246 -= (Class348_Sub40_Sub31.anInt9406 - -(Class258_Sub2.anInt8537 * (-i_16_ + Class286_Sub4.anInt6246) / 1000))
                    if (Class286_Sub4.anInt6246 < i_16_) Class286_Sub4.anInt6246 = i_16_
                }
                if (Class305.anInt3855 < i_18_) {
                    Class305.anInt3855 += ((-Class305.anInt3855 + i_18_) * Class258_Sub2.anInt8537 / 1000) + Class348_Sub40_Sub31.anInt9406
                    if (i_18_ < Class305.anInt3855) Class305.anInt3855 = i_18_
                }
                if (Class59_Sub2_Sub2.anInt8685 < i_17_) {
                    Class59_Sub2_Sub2.anInt8685 += (Class348_Sub40_Sub31.anInt9406 - -((i_17_ + -Class59_Sub2_Sub2.anInt8685) * Class258_Sub2.anInt8537 / 1000))
                    if (Class59_Sub2_Sub2.anInt8685 > i_17_) Class59_Sub2_Sub2.anInt8685 = i_17_
                }
                if (i_18_ < Class305.anInt3855) {
                    Class305.anInt3855 -= ((Class305.anInt3855 - i_18_) * Class258_Sub2.anInt8537 / 1000) + Class348_Sub40_Sub31.anInt9406
                    if (i_18_ > Class305.anInt3855) Class305.anInt3855 = i_18_
                }
                if (Class59_Sub2_Sub2.anInt8685 > i_17_) {
                    Class59_Sub2_Sub2.anInt8685 -= (Class348_Sub40_Sub31.anInt9406 + ((Class59_Sub2_Sub2.anInt8685 - i_17_) * Class258_Sub2.anInt8537 / 1000))
                    if (i_17_ > Class59_Sub2_Sub2.anInt8685) Class59_Sub2_Sub2.anInt8685 = i_17_
                }
            }
            i_17_ = 256 + Class281.anInt3647 * 512
            i_16_ = 256 + 512 * Class352.anInt4336
            i_18_ = (Class275.method2064(i_16_, Class355.anInt4372, 11219, i_17_) - Class121.anInt1797)
            val i_19_ = -Class286_Sub4.anInt6246 + i_16_
            val i_20_ = -Class305.anInt3855 + i_18_
            val i_21_ = -Class59_Sub2_Sub2.anInt8685 + i_17_
            val i_22_ = sqrt((i_19_ * i_19_ - -(i_21_ * i_21_)).toDouble()).toInt()
            var i_23_ = ((atan2(i_20_.toDouble(), i_22_.toDouble()) * 2607.5945876176133).toInt() and 0x3fff)
            if (i < 126) aString8605 = null
            if (i_23_ < 1024) i_23_ = 1024
            val i_24_ = 0x3fff and (-2607.5945876176133 * atan2(i_19_.toDouble(), i_21_.toDouble())).toInt()
            if (i_23_ > 3072) i_23_ = 3072
            if (i_23_ > Class348_Sub42_Sub19.anInt9701) {
                Class348_Sub42_Sub19.anInt9701 += (Class239_Sub12.anInt5973 * (i_23_ - Class348_Sub42_Sub19.anInt9701 shr 3) / 1000) + Class367_Sub11.anInt7403 shl 3
                if (i_23_ < Class348_Sub42_Sub19.anInt9701) Class348_Sub42_Sub19.anInt9701 = i_23_
            }
            if (Class348_Sub42_Sub19.anInt9701 > i_23_) {
                Class348_Sub42_Sub19.anInt9701 -= (((-i_23_ + Class348_Sub42_Sub19.anInt9701 shr 3) * Class239_Sub12.anInt5973 / 1000) + Class367_Sub11.anInt7403) shl 3
                if (Class348_Sub42_Sub19.anInt9701 < i_23_) Class348_Sub42_Sub19.anInt9701 = i_23_
            }
            var i_25_ = -Class5.anInt4638 + i_24_
            if (i_25_ > 8192) i_25_ -= 16384
            if (i_25_ < -8192) i_25_ += 16384
            i_25_ = i_25_ shr 3
            if (i_25_ > 0) {
                Class5.anInt4638 += (Class367_Sub11.anInt7403 + Class239_Sub12.anInt5973 * i_25_ / 1000) shl 3
                Class5.anInt4638 = Class5.anInt4638 and 0x3fff
            }
            if (i_25_ < 0) {
                Class5.anInt4638 -= Class367_Sub11.anInt7403 - -(-i_25_ * Class239_Sub12.anInt5973 / 1000) shl 3
                Class5.anInt4638 = Class5.anInt4638 and 0x3fff
            }
            var i_26_ = i_24_ - Class5.anInt4638
            if (i_26_ > 8192) i_26_ -= 16384
            if (i_26_ < -8192) i_26_ += 16384
            Class338.anInt4186 = 0
            if (i_26_ < 0 && i_25_ > 0 || i_26_ > 0 && i_25_ < 0) Class5.anInt4638 = i_24_
        }

        @JvmStatic
        fun method242(bool: Boolean) {
            if (bool == true) aString8605 = null
        }
    }
}
