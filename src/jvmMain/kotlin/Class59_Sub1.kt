import Applet_Sub1.Companion.method94
import jaggl.OpenGL.Companion.glTexImage2Df
import kotlin.math.min
import kotlin.math.pow

open class Class59_Sub1(i: Int, i_22_: Int, i_23_: Int, i_24_: Int, i_25_: Int, f: Float, f_26_: Float, f_27_: Float) : Class59(i, i_22_, i_23_, i_24_, i_25_) {
    private val anInt5278: Int
    private val anInt5279: Int
    private var anInt5280 = 0
    private var anInt5285: Int
    private var anInt5287 = 0
    private var anInt5289 = 0
    private var anInt5290 = 0
    private lateinit var aByteArray5296: ByteArray
    private val anInt5298: Int
    open fun method550(i: Int, i_0_: Byte, i_1_: Byte) {
        if (i_1_.toInt() != 14) method555(true, -38)
        anInt5281++
        aByteArray5296[i] = i_0_
    }

    public override fun method543(bool: Boolean) {
        anInt5287 = 0
        if (bool != true) method555(false, -53)
        anInt5290 = 0
        anInt5291++
    }

    init {
        anInt5298 = (4096.0f * f_27_).toInt()
        anInt5278 = (f_26_ * 4096.0f).toInt()
        anInt5279 = (0.5.pow(-f.toDouble()) * 4096.0).toInt()
        anInt5285 = anInt5279
    }

    public override fun method546(i: Int, i_40_: Int, i_41_: Int) {
        if (i_41_ == -2) {
            if (i_40_ == 0) {
                anInt5280 = -(if (i >= 0) i else -i) + anInt5278
                anInt5289 = 4096
                anInt5280 = anInt5280 * anInt5280 shr 12
                anInt5290 = anInt5280
            } else {
                anInt5289 = anInt5280 * anInt5298 shr 12
                if (anInt5289 < 0) anInt5289 = 0
                else if (anInt5289 > 4096) anInt5289 = 4096
                anInt5280 = anInt5278 + -(if (i < 0) -i else i)
                anInt5280 = anInt5280 * anInt5280 shr 12
                anInt5280 = anInt5289 * anInt5280 shr 12
                anInt5290 += anInt5280 * anInt5285 shr 12
                anInt5285 = anInt5285 * anInt5279 shr 12
            }
            anInt5292++
        }
    }

    public override fun method541(i: Int) {
        anInt5285 = anInt5279
        anInt5290 = anInt5290 shr 4
        anInt5295++
        if (anInt5290 >= 0) {
            if (anInt5290 > 255) anInt5290 = 255
        } else anInt5290 = 0
        if (i != -1538606516) anInt5289 = 17
        method550(anInt5287++, anInt5290.toByte(), 14.toByte())
        anInt5290 = 0
    }

    companion object {
        @JvmField
        var anInt5277: Int = 0
        @JvmField
        var anInt5281: Int = 0
        @JvmField
        var anInt5282: Int = 0
        @JvmField
        var anInt5283: Int = 0
        @JvmField
        var anInt5284: Int = 0
        @JvmField
        var anInt5286: Int = 0
        var aClass351_5288: Class351? = Class351(7, 6)
        @JvmField
        var anInt5291: Int = 0
        @JvmField
        var anInt5292: Int = 0
        var anInt5293: Int = 0
        @JvmField
        var aClass105Array5294: Array<Class105?>? = null
        @JvmField
        var anInt5295: Int = 0
        var aClass297_5297: Class297? = null
        @JvmField
        var aFloat5299: Float = 0f
        @JvmField
        var aBoolean5300: Boolean = false

        fun method551(i: Int, i_2_: Int, i_3_: Int, fs: FloatArray, i_4_: Int, i_5_: Int, i_6_: Int) {
            var i = i
            var i_5_ = i_5_
            anInt5277++
            require(!(i_4_ < i && !Class192.method1436(i_4_ + -23, i))) { "" }
            require(!(i_5_ > 0 && !Class192.method1436(56, i_5_))) { "" }
            val i_7_ = Class183.method1382(i_2_, -6409)
            var i_8_ = 0
            var i_9_ = min(i_5_, i)
            var i_10_ = i shr 1
            var i_11_ = i_5_ shr 1
            var fs_12_ = fs
            var fs_13_ = FloatArray(i_7_ * i_10_ * i_11_)
            while (true) {
                glTexImage2Df(i_3_, i_8_, i_6_, i, i_5_, 0, i_2_, 5126, fs_12_, 0)
                if (i_9_ <= 1) break
                val i_14_ = i * i_7_
                val fs_15_ = fs_13_
                for (i_16_ in 0..<i_7_) {
                    var i_17_ = i_16_
                    var i_18_ = i_16_
                    var i_19_ = i_14_ + i_18_
                    var i_20_ = 0
                    while (i_11_ > i_20_) {
                        var i_21_ = 0
                        while (i_10_ > i_21_) {
                            var f = fs_12_[i_18_]
                            i_18_ += i_7_
                            f += fs_12_[i_18_]
                            i_18_ += i_7_
                            f += fs_12_[i_19_]
                            i_19_ += i_7_
                            f += fs_12_[i_19_]
                            i_19_ += i_7_
                            fs_13_[i_17_] = f * 0.25f
                            i_17_ += i_7_
                            i_21_++
                        }
                        i_18_ += i_14_
                        i_19_ += i_14_
                        i_20_++
                    }
                }
                fs_13_ = fs_12_
                fs_12_ = fs_15_
                i = i_10_
                i_5_ = i_11_
                i_8_++
                i_9_ = i_9_ shr 1
                i_10_ = i_10_ shr 1
                i_11_ = i_11_ shr 1
            }
        }

        @JvmStatic
        fun method552(i: Int, i_28_: Int, i_29_: Byte, i_30_: Int, i_31_: Int, i_32_: Int, `is`: ByteArray): Boolean {
            var i_32_ = i_32_
            anInt5282++
            val i_33_ = i_31_ % i_30_
            val i_34_ = 39 / ((31 - i_29_) / 63)
            val i_35_: Int
            if (i_33_ != 0) i_35_ = i_30_ - i_33_
            else i_35_ = 0
            val i_36_ = -((i_28_ - -i_30_ + -1) / i_30_)
            val i_37_ = -((i_30_ + i_31_ - 1) / i_30_)
            for (i_38_ in i_36_..-1) {
                for (i_39_ in i_37_..-1) {
                    if (`is`[i_32_].toInt() == 0) return true
                    i_32_ += i_30_
                }
                i_32_ -= i_35_
                if (`is`[i_32_ + -1].toInt() == 0) return true
                i_32_ += i
            }
            return false
        }

        @JvmStatic
        fun method553(i: Int) {
            aClass105Array5294 = null
            aClass351_5288 = null
            if (i != 0) aClass297_5297 = null
            aClass297_5297 = null
        }

        @JvmStatic
        fun method554(i: Int, i_42_: Int, `is`: ByteArray?): Int {
            if (i != 5126) method553(52)
            anInt5284++
            return Class171.method1319(i_42_, true, `is`!!, 0)
        }

        @JvmStatic
        fun method555(bool: Boolean, i: Int) {
            anInt5286++
            if (i != Class363.aString4461!!.length) {
                Class82.method812(Class363.aString4461, false, bool, (-79).toByte())
                if (!bool) {
                    method94("--> " + Class363.aString4461, 110)
                    Class348_Sub38.anInt7006 = 0
                    Class363.aString4461 = ""
                    Class260.anInt3312 = 0
                }
            }
        }
    }
}
