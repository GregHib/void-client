import Class130.Companion.method1128
import Class348_Sub40_Sub3.Companion.method3055
import jaggl.OpenGL.Companion.glGetTexImagei
import jaggl.OpenGL.Companion.glPixelStorei
import jaggl.OpenGL.Companion.glTexImage2Df
import jaggl.OpenGL.Companion.glTexImage2Di
import jaggl.OpenGL.Companion.glTexImage2Dub
import jaggl.OpenGL.Companion.glTexSubImage2Di
import jaggl.OpenGL.Companion.glTexSubImage2Dub

class Class14_Sub4 : Class14, Interface18_Impl3 {
    private var anInt8634 = 0
    private var anInt8640 = 0
    override fun method72(i: Int): Int {
        anInt8649++
        val i_2_ = 96 % ((i - 55) / 63)
        return anInt8634
    }

    internal constructor(class377: Class377?, i: Int, i_3_: Int, `is`: IntArray?, i_4_: Int, i_5_: Int) : super(class377, 34037, Class108.aClass304_1662, Class68.aClass68_1183, i * i_3_, false) {
        try {
            anInt8640 = i
            anInt8634 = i_3_
            this.aClass377_5082!!.method3850(76.toByte(), this)
            glPixelStorei(3314, i_5_)
            glTexImage2Di(this.anInt5093, 0, 6408, anInt8640, anInt8634, 0, 32993, (this.aClass377_5082!!.anInt9918), `is`, i_4_ * 4)
            glPixelStorei(3314, 0)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("tw.<init>(" + (if (class377 != null) "{...}" else "null") + ',' + i + ',' + i_3_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_4_ + ',' + i_5_ + ')'))
        }
    }

    internal constructor(class377: Class377?, class304: Class304?, i: Int, i_6_: Int, `is`: ByteArray?, i_7_: Int, i_8_: Int) : super(class377, 34037, class304, Class68.aClass68_1183, i * i_6_, false) {
        try {
            anInt8634 = i_6_
            anInt8640 = i
            this.aClass377_5082!!.method3850((-127).toByte(), this)
            glPixelStorei(3317, 1)
            glPixelStorei(3314, i_8_)
            glTexImage2Dub(this.anInt5093, 0, this.method228(126), i, i_6_, 0, (method3055(111, this.aClass304_5084)), 5121, `is`, i_7_)
            glPixelStorei(3314, 0)
            glPixelStorei(3317, 4)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("tw.<init>(" + (if (class377 != null) "{...}" else "null") + ',' + (if (class304 != null) "{...}" else "null") + ',' + i + ',' + i_6_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_7_ + ',' + i_8_ + ')'))
        }
    }

    override fun method66(bool: Boolean, bool_9_: Boolean, i: Int) {
        if (i != 25688) Companion.method254(-82, (-35).toByte())
        anInt8639++
    }

    internal constructor(class377: Class377?, class304: Class304?, class68: Class68?, i: Int, i_10_: Int) : super(class377, 34037, class304, class68, i_10_ * i, false) {
        try {
            anInt8634 = i_10_
            anInt8640 = i
            this.aClass377_5082!!.method3850(115.toByte(), this)
            glTexImage2Dub(this.anInt5093, 0, this.method228(109), i, i_10_, 0, method3055(105, this.aClass304_5084), method1128(-54, this.aClass68_5088), null, 0)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("tw.<init>(" + (if (class377 != null) "{...}" else "null") + ',' + (if (class304 != null) "{...}" else "null") + ',' + (if (class68 != null) "{...}" else "null") + ',' + i + ',' + i_10_ + ')'))
        }
    }

    override fun method65(i: Int, `is`: IntArray, i_26_: Int, i_27_: Int, i_28_: Int, i_29_: Byte, i_30_: Int) {
        anInt8645++
        if (i_29_.toInt() != 112) anInt8634 = 49
        val is_31_ = IntArray(anInt8634 * anInt8640)
        this.aClass377_5082!!.method3850((-34).toByte(), this)
        glGetTexImagei(this.anInt5093, 0, 32993, 5121, is_31_, 0)
        var i_32_ = 0
        while (i_28_ > i_32_) {
            Class214.method1578(is_31_, anInt8640 * (i_28_ + -1 + (i_27_ + -i_32_)), `is`, i_32_ * i_26_ + i_30_, i_26_)
            i_32_++
        }
    }

    override fun method67(f: Float, i: Int): Float {
        if (i <= 69) aByteArrayArray8642 = null
        anInt8646++
        return f
    }

    internal constructor(class377: Class377?, class304: Class304?, i: Int, i_33_: Int, fs: FloatArray?, i_34_: Int, i_35_: Int) : super(class377, 34037, class304, Class68.aClass68_1187, i_33_ * i, false) {
        try {
            anInt8640 = i
            anInt8634 = i_33_
            this.aClass377_5082!!.method3850((-45).toByte(), this)
            glPixelStorei(3314, i_35_)
            glTexImage2Df(this.anInt5093, 0, this.method228(107), i, i_33_, 0, (method3055(126, this.aClass304_5084)), 5126, fs, i_34_ * 4)
            glPixelStorei(3314, 0)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("tw.<init>(" + (if (class377 != null) "{...}" else "null") + ',' + (if (class304 != null) "{...}" else "null") + ',' + i + ',' + i_33_ + ',' + (if (fs != null) "{...}" else "null") + ',' + i_34_ + ',' + i_35_ + ')'))
        }
    }

    override fun method71(i: Byte, f: Float): Float {
        if (i > -24) method67(-1.6376895f, -84)
        anInt8637++
        return f
    }

    override fun method73(i: Int): Boolean {
        if (i <= 84) method68(-26, 9, null, -21, 80, 34, 77, -73)
        anInt8635++
        return false
    }

    override fun method69(bool: Boolean): Int {
        anInt8651++
        if (bool != false) anInt8640 = -103
        return anInt8640
    }

    override fun method68(i: Int, i_36_: Int, `is`: IntArray?, i_37_: Int, i_38_: Int, i_39_: Int, i_40_: Int, i_41_: Int) {
        var i = i
        this.aClass377_5082!!.method3850(118.toByte(), this)
        anInt8650++
        if (i == 0) i = i_39_
        if (i_39_ != i) glPixelStorei(3314, i)
        glTexSubImage2Di(this.anInt5093, 0, i_37_, i_40_, i_39_, i_41_, 32993, (this.aClass377_5082!!.anInt9918), `is`, i_38_)
        if (i != i_39_) glPixelStorei(3314, 0)
        if (i_36_ != 22809) anInt8634 = 115
    }

    override fun method70(i: Int, i_42_: Int, i_43_: Byte, i_44_: Int, i_45_: Int, i_46_: Int, i_47_: Int, `is`: ByteArray?, class304: Class304?) {
        var i_44_ = i_44_
        try {
            this.aClass377_5082!!.method3850((-39).toByte(), this)
            anInt8647++
            if (i_44_ == 0) i_44_ = i_46_
            glPixelStorei(3317, 1)
            if (i_43_ >= -4) method250(74, false, -106)
            if (i_46_ != i_44_) glPixelStorei(3314, i_44_)
            glTexSubImage2Dub(this.anInt5093, 0, i_47_, i, i_46_, i_45_, method3055(120, class304), 5121, `is`, i_42_)
            if (i_46_ != i_44_) glPixelStorei(3314, 0)
            glPixelStorei(3317, 4)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("tw.T(" + i + ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ',' + i_45_ + ',' + i_46_ + ',' + i_47_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (class304 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt8633: Int = 0
        @JvmField
        var anInt8635: Int = 0
        @JvmField
        var anInt8636: Int = 0
        @JvmField
        var anInt8637: Int = 0
        @JvmField
        var aClass230_8638: Class230? = Class230("stellardawn", 1)
        @JvmField
        var anInt8639: Int = 0
        @JvmField
        var anInt8641: Int = 0
        @JvmField
        var aByteArrayArray8642: Array<ByteArray?>? = null
        @JvmField
        var anInt8643: Int = 0
        @JvmField
        var aClass323_8644: Class323? = null
        @JvmField
        var anInt8645: Int = 0
        @JvmField
        var anInt8646: Int = 0
        @JvmField
        var anInt8647: Int = 0
        @JvmField
        var anInt8648: Int = 0
        @JvmField
        var anInt8649: Int = 0
        @JvmField
        var anInt8650: Int = 0
        @JvmField
        var anInt8651: Int = 0

        @JvmStatic
        fun method250(i: Int, bool: Boolean, i_0_: Int): String {
            if (bool != true) method251(96.toByte())
            anInt8641++
            val i_1_ = -i_0_ + i
            if (i_1_ < -9) return "<col=ff0000>"
            if (i_1_ < -6) return "<col=ff3000>"
            if (i_1_ < -3) return "<col=ff7000>"
            if (i_1_ < 0) return "<col=ffb000>"
            if (i_1_ > 9) return "<col=00ff00>"
            if (i_1_ > 6) return "<col=40ff00>"
            if (i_1_ > 3) return "<col=80ff00>"
            if (i_1_ > 0) return "<col=c0ff00>"
            return "<col=ffff00>"
        }

        @JvmStatic
        fun method251(i: Byte) {
            if (i.toInt() != 2) method250(-45, false, -102)
            aClass323_8644 = null
            aClass230_8638 = null
            aByteArrayArray8642 = null
        }

        fun method252(i: Int, i_11_: Int): Boolean {
            anInt8636++
            if (i_11_ != 5126) aByteArrayArray8642 = null
            return i == 0 || i == 2
        }

        @JvmStatic
        fun method253(i: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int) {
            anInt8648++
            if (i_13_ != -648) aClass323_8644 = null
            var i_16_ = 0
            var i_17_ = i_15_
            var i_18_ = -i_15_
            var i_19_ = -1
            Class135_Sub2.method1156(i_13_ + 621, i_12_ + i_15_, Class17.anIntArrayArray255!![i]!!, i_12_ + -i_15_, i_14_)
            while (i_16_ < i_17_) {
                i_19_ += 2
                i_18_ += i_19_
                i_16_++
                if (i_18_ >= 0) {
                    i_17_--
                    i_18_ -= i_17_ shl 1
                    val `is` = Class17.anIntArrayArray255!![i - -i_17_]!!
                    val is_20_ = Class17.anIntArrayArray255!![i + -i_17_]!!
                    val i_21_ = i_16_ + i_12_
                    val i_22_ = i_12_ + -i_16_
                    Class135_Sub2.method1156(-27, i_21_, `is`, i_22_, i_14_)
                    Class135_Sub2.method1156(-27, i_21_, is_20_, i_22_, i_14_)
                }
                val i_23_ = i_17_ + i_12_
                val i_24_ = i_12_ - i_17_
                val `is` = Class17.anIntArrayArray255!![i_16_ + i]!!
                val is_25_ = Class17.anIntArrayArray255!![-i_16_ + i]!!
                Class135_Sub2.method1156(i_13_ + 621, i_23_, `is`, i_24_, i_14_)
                Class135_Sub2.method1156(-27, i_23_, is_25_, i_24_, i_14_)
            }
        }

        @JvmStatic
        fun method254(i: Int, i_48_: Byte) {
            if (i_48_ > -79) method252(127, 53)
            if (Loader.skipLobby) {
                Class348_Sub6.anInt6634 = i
                Class107.anInt1645 = i
            } else if (Class239_Sub12.anInt5969 != 1) {
                if (Class239_Sub12.anInt5969 == 2) Class348_Sub6.anInt6634 = i
            } else Class107.anInt1645 = i
            anInt8643++
        }
    }
}
