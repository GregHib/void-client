import jaggl.OpenGL.Companion.glCopyTexImage2D
import jaggl.OpenGL.Companion.glCopyTexSubImage2D
import jaggl.OpenGL.Companion.glFlush
import jaggl.OpenGL.Companion.glFramebufferTexture2DEXT
import jaggl.OpenGL.Companion.glPixelStorei
import jaggl.OpenGL.Companion.glTexImage2Df
import jaggl.OpenGL.Companion.glTexImage2Di
import jaggl.OpenGL.Companion.glTexImage2Dub
import jaggl.OpenGL.Companion.glTexParameteri
import jaggl.OpenGL.Companion.glTexSubImage2Di
import jaggl.OpenGL.Companion.glTexSubImage2Dub
import java.awt.MediaTracker
import java.awt.Toolkit
import java.awt.image.PixelGrabber

open class Class258_Sub3 : Class258 {
    private var anInt8545: Int
    @JvmField
    var anInt8547: Int = 0
    private var anInt8549 = -1
    @JvmField
    var anInt8551: Int = 0

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_0_: Int, i_1_: Int, i_2_: Int) : super(var_ha_Sub2, i, i_0_, i_1_ * i_2_, false) {
        anInt8545 = -1
        this.anInt8547 = i_1_
        this.anInt8551 = i_2_
        this.aHa_Sub2_4851.method3771((-111).toByte(), this)
        glTexImage2Dub(this.anInt4849, 0, this.anInt4858, i_1_, i_2_, 0, Class348_Sub9.method2779(true, (this.anInt4858)), 5121, null, 0)
        this.method1957(9728, true)
    }

    fun method1963(i: Int, i_3_: Int, i_4_: Int, i_5_: Int) {
        anInt8541++
        if (i_4_ != 0) anInt8550 = -125
        glFramebufferTexture2DEXT(i, i_5_, this.anInt4849, this.anInt4859, i_3_)
        anInt8549 = i
        anInt8545 = i_5_
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_6_: Int, i_7_: Int, i_8_: Int, bool: Boolean, fs: FloatArray, i_9_: Int) : super(var_ha_Sub2, i, i_6_, i_8_ * i_7_, bool) {
        anInt8545 = -1
        try {
            this.anInt8547 = i_7_
            this.anInt8551 = i_8_
            this.aHa_Sub2_4851.method3771((-91).toByte(), this)
            if (bool && this.anInt4849 != 34037) {
                Class59_Sub1.method551(i_7_, i_9_, i, fs, 0, i_8_, i_6_)
                this.method1955(true, (-123).toByte())
            } else {
                glTexImage2Df(this.anInt4849, 0, this.anInt4858, this.anInt8547, this.anInt8551, 0, i_9_, 5126, fs, 0)
                this.method1955(false, (-123).toByte())
            }
            this.method1957(9728, true)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("tp.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + bool + ',' + (if (fs != null) "{...}" else "null") + ',' + i_9_ + ')'))
        }
    }

    fun method1964(bool: Boolean, i: Int, i_10_: Int, `is`: IntArray?, i_11_: Int, i_12_: Byte, i_13_: Int, i_14_: Int, i_15_: Int) {
        var `is` = `is`!!
        var i_15_ = i_15_
        anInt8543++
        if (i_15_ == 0) i_15_ = i_13_
        if (bool) {
            val is_16_ = IntArray(i_13_ * i)
            for (i_17_ in 0..<i) {
                var i_18_ = i_13_ * i_17_
                var i_19_ = (-1 + i - i_17_) * i_15_ + i_11_
                for (i_20_ in 0..<i_13_) is_16_[i_18_++] = `is`[i_19_++]
            }
            `is` = is_16_
        }
        this.aHa_Sub2_4851.method3771((-80).toByte(), this)
        if (i_13_ != i_15_) glPixelStorei(3314, i_15_)
        glTexSubImage2Di(this.anInt4849, 0, i_14_, i_10_, i_13_, i, 32993, (this.aHa_Sub2_4851.anInt7812), `is`, i_11_)
        if (i_13_ != i_15_) glPixelStorei(3314, 0)
        if (i_12_ > -65) this.anInt8547 = 101
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_21_: Int, i_22_: Int, i_23_: Int, bool: Boolean, `is`: IntArray?, i_24_: Int, i_25_: Int, bool_26_: Boolean) : super(var_ha_Sub2, i, i_21_, i_23_ * i_22_, bool) {
        var `is` = `is`
        anInt8545 = -1
        try {
            this.anInt8547 = i_22_
            this.anInt8551 = i_23_
            if (bool_26_) {
                val is_27_ = IntArray(`is`!!.size)
                var i_28_ = 0
                while (i_23_ > i_28_) {
                    var i_29_ = i_28_ * i_22_
                    var i_30_ = i_22_ * (-1 + -i_28_ + i_23_)
                    for (i_31_ in 0..<i_22_) is_27_[i_29_++] = `is`[i_30_++]
                    i_28_++
                }
                `is` = is_27_
            }
            this.aHa_Sub2_4851.method3771((-79).toByte(), this)
            if (this.anInt4849 == 34037 || !bool || i_24_ != 0 || i_25_ != 0) {
                glPixelStorei(3314, i_24_)
                glTexImage2Di(this.anInt4849, 0, this.anInt4858, this.anInt8547, this.anInt8551, 0, 32993, this.aHa_Sub2_4851.anInt7812, `is`, 4 * i_25_)
                glPixelStorei(3314, 0)
                this.method1955(false, (-123).toByte())
            } else {
                Class353.method3460(this.anInt4849, this.anInt4858, this.anInt8551, this.aHa_Sub2_4851.anInt7812, this.anInt8547, `is`!!, 32993, -103)
                this.method1955(true, (-123).toByte())
            }
            this.method1957(9728, true)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("tp.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + bool + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_24_ + ',' + i_25_ + ',' + bool_26_ + ')'))
        }
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_32_: Int, i_33_: Int, i_34_: Int, bool: Boolean, `is`: ByteArray?, i_35_: Int, bool_36_: Boolean) : super(var_ha_Sub2, i, i_32_, i_33_ * i_34_, bool) {
        var `is` = `is`
        anInt8545 = -1
        try {
            this.anInt8547 = i_33_
            this.anInt8551 = i_34_
            if (bool_36_) {
                val is_37_ = ByteArray(`is`!!.size)
                var i_38_ = 0
                while (i_34_ > i_38_) {
                    var i_39_ = i_33_ * i_38_
                    var i_40_ = i_33_ * (-i_38_ + (i_34_ + -1))
                    var i_41_ = 0
                    while (i_33_ > i_41_) {
                        is_37_[i_39_++] = `is`[i_40_++]
                        i_41_++
                    }
                    i_38_++
                }
                `is` = is_37_
            }
            this.aHa_Sub2_4851.method3771((-84).toByte(), this)
            glPixelStorei(3317, 1)
            if (!bool || this.anInt4849 == 34037) {
                glTexImage2Dub(this.anInt4849, 0, this.anInt4858, this.anInt8547, this.anInt8551, 0, i_35_, 5121, `is`, 0)
                this.method1955(false, (-123).toByte())
            } else {
                Class186_Sub1.method1403(i_34_, i_33_, `is`!!, false, i_35_, i, i_32_)
                this.method1955(true, (-123).toByte())
            }
            glPixelStorei(3317, 4)
            this.method1957(9728, true)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("tp.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_32_ + ',' + i_33_ + ',' + i_34_ + ',' + bool + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_35_ + ',' + bool_36_ + ')'))
        }
    }

    fun method1965(bool: Boolean, bool_42_: Boolean, i: Int) {
        anInt8540++
        if (i != 10243) Companion.method1966(-20, 83, 1, -22, (-31).toByte(), 74, -57, 109, -102)
        if (this.anInt4849 == 3553) {
            this.aHa_Sub2_4851.method3771((-102).toByte(), this)
            glTexParameteri(this.anInt4849, 10242, if (bool_42_) 10497 else 33071)
            glTexParameteri(this.anInt4849, 10243, if (!bool) 33071 else 10497)
        }
    }

    fun method1967(i: Int, i_51_: Int, i_52_: Int, i_53_: Int, i_54_: Int, i_55_: Byte, i_56_: Int) {
        anInt8544++
        val i_57_ = (this.aHa_Sub2_4851.anInt7641 + (-i_52_ - i_51_))
        this.aHa_Sub2_4851.method3771((-100).toByte(), this)
        glCopyTexSubImage2D(this.anInt4849, 0, i, -i_51_ - (i_53_ - (this.anInt8551)), i_54_, i_57_, i_56_, i_51_)
        if (i_55_.toInt() != -120) method1965(true, true, -57)
        glFlush()
    }

    override fun method37(i: Int) {
        if (i != -3022) this.anInt8547 = 75
        glFramebufferTexture2DEXT(anInt8549, anInt8545, this.anInt4849, 0, 0)
        anInt8542++
        anInt8545 = -1
        anInt8549 = -1
    }

    fun method1970(i: Int, i_61_: Int, i_62_: Int, bool: Boolean, i_63_: Int, i_64_: Int, i_65_: Int, i_66_: Int, `is`: ByteArray?, i_67_: Int) {
        var i_63_ = i_63_
        var `is` = `is`!!
        if (i_63_ == 0) i_63_ = i_62_
        anInt8539++
        if (bool) {
            val i_68_ = Class183.method1382(i_65_, -6409)
            val i_69_ = i_68_ * i_62_
            val i_70_ = i_63_ * i_68_
            val is_71_ = ByteArray(i_64_ * i_69_)
            var i_72_ = 0
            while (i_64_ > i_72_) {
                var i_73_ = i_69_ * i_72_
                var i_74_ = (-1 + i_64_ - i_72_) * i_70_ + i_67_
                for (i_75_ in 0..<i_69_) is_71_[i_73_++] = `is`[i_74_++]
                i_72_++
            }
            `is` = is_71_
        }
        this.aHa_Sub2_4851.method3771((-102).toByte(), this)
        glPixelStorei(3317, 1)
        if (i_62_ != i_63_) glPixelStorei(3314, i_63_)
        glTexSubImage2Dub(this.anInt4849, 0, i, i_61_, i_62_, i_64_, i_65_, 5121, `is`, i_67_)
        if (i_63_ != i_62_) glPixelStorei(3314, 0)
        glPixelStorei(3317, 4)
        val i_76_ = -17 % ((46 - i_66_) / 59)
    }

    internal constructor(var_ha_Sub2: ha_Sub2, i: Int, i_77_: Int, i_78_: Int, i_79_: Int, i_80_: Int) : super(var_ha_Sub2, i, 6407, i_80_ * i_79_, false) {
        anInt8545 = -1
        this.anInt8547 = i_79_
        this.anInt8551 = i_80_
        val i_81_ = (this.aHa_Sub2_4851.anInt7641 + (-i_78_ + -i_80_))
        this.aHa_Sub2_4851.method3771((-111).toByte(), this)
        glCopyTexImage2D(this.anInt4849, 0, this.anInt4858, i_77_, i_81_, i_79_, i_80_, 0)
        this.method1957(9728, true)
    }

    companion object {
        @JvmField
        var anInt8539: Int = 0
        @JvmField
        var anInt8540: Int = 0
        @JvmField
        var anInt8541: Int = 0
        @JvmField
        var anInt8542: Int = 0
        @JvmField
        var anInt8543: Int = 0
        @JvmField
        var anInt8544: Int = 0
        @JvmField
        var anInt8546: Int = 0
        @JvmField
        var anInt8548: Int = 0
        @JvmField
        var anInt8550: Int = 0

        @JvmStatic
        fun method1966(i: Int, i_43_: Int, i_44_: Int, i_45_: Int, i_46_: Byte, i_47_: Int, i_48_: Int, i_49_: Int, i_50_: Int) {
            Class147.aClass338Array2034!![Class239_Sub26.anInt6115++] = Class338(i_47_, i_49_, i_50_, i, i, i_50_, i_45_, i_43_, i_43_, i_45_, i_44_, i_44_, i_48_, i_48_)
            anInt8548++
            if (i_46_.toInt() != 0) method1968()
        }

        @JvmStatic
        fun method1968() {
            za.method3437(1, Class189.anInt2524)
        }

        @JvmStatic
        fun method1969(`is`: ByteArray, i: Int): Class105? {
            anInt8546++
            if (i != -5901) anInt8550 = 83
            if (`is` == null) throw RuntimeException("")
            while (true) {
                try {
                    val image = Toolkit.getDefaultToolkit().createImage(`is`)
                    val mediatracker = MediaTracker(Class79.aClient1367)
                    mediatracker.addImage(image, 0)
                    mediatracker.waitForAll()
                    val i_58_ = image.getWidth(Class79.aClient1367)
                    val i_59_ = image.getHeight(Class79.aClient1367)
                    if (mediatracker.isErrorAny() || i_58_ < 0 || i_59_ < 0) throw RuntimeException("")
                    val is_60_ = IntArray(i_59_ * i_58_)
                    val pixelgrabber = PixelGrabber(image, 0, 0, i_58_, i_59_, is_60_, 0, i_58_)
                    pixelgrabber.grabPixels()
                    return Class348_Sub8.aHa6654!!.method3662(i_58_, is_60_, 94.toByte(), 0, i_58_, i_59_)
                } catch (interruptedexception: InterruptedException) {
                    /* empty */
                }
            }
        }
    }
}
