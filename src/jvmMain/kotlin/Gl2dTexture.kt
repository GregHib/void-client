import ModelBatchBaseStatics.method1128
import RangeThresholdTextureNodeStatics.method3055
import jaggl.OpenGLStatics.glGetTexImagei
import jaggl.OpenGLStatics.glPixelStorei
import jaggl.OpenGLStatics.glTexImage2Df
import jaggl.OpenGLStatics.glTexImage2Di
import jaggl.OpenGLStatics.glTexImage2Dub
import jaggl.OpenGLStatics.glTexParameteri
import jaggl.OpenGLStatics.glTexSubImage2Df
import jaggl.OpenGLStatics.glTexSubImage2Di
import jaggl.OpenGLStatics.glTexSubImage2Dub
import kotlin.math.atan2
import kotlin.math.sqrt
import Gl2dTextureStatics.method242
import Gl2dTextureStatics.aString8605
import Gl2dTextureStatics.anInt8606
import Gl2dTextureStatics.anInt8607
import Gl2dTextureStatics.anInt8608
import Gl2dTextureStatics.anInt8609
import Gl2dTextureStatics.anInt8611
import Gl2dTextureStatics.anInt8613
import Gl2dTextureStatics.anInt8614
import Gl2dTextureStatics.anInt8615
import Gl2dTextureStatics.anInt8616
import Gl2dTextureStatics.anInt8618

class Gl2dTexture : GlTextureBase, Renderable2dTexture {
    private var anInt8604 = 0
    private var anInt8612 = 0
    override fun method71(i: Byte, f: Float): Float {
        anInt8606++
        if (i >= -24) method242(false)
        return f / anInt8604.toFloat()
    }

    internal constructor(glRenderDevice: GlRenderDevice?, i: Int, i_0_: Int, bool: Boolean, `is`: IntArray?, i_1_: Int, i_2_: Int) : super(glRenderDevice, 3553, GroundItemRenderState.aTextureFormatInfo_1662, MovementDirectionStatics.aMovementDirection_1183, i * i_0_, bool) {
        try {
            anInt8612 = i
            anInt8604 = i_0_
            this.aGlRenderDevice_5082!!.method3850(79.toByte(), this)
            if (bool && i_2_ == 0 && i_1_ == 0) this.method233(i, i_0_, `is`!!, this.anInt5093, 255)
            else {
                glPixelStorei(3314, i_2_)
                glTexImage2Di(this.anInt5093, 0, 6408, anInt8612, anInt8604, 0, 32993, this.aGlRenderDevice_5082!!.anInt9918, `is`, 4 * i_1_)
                glPixelStorei(3314, 0)
            }
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("bm.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + bool + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ')'))
        }
    }

    internal constructor(glRenderDevice: GlRenderDevice?, textureFormatInfo: TextureFormatInfo?, i: Int, i_6_: Int, bool: Boolean, `is`: ByteArray?, i_7_: Int, i_8_: Int) : super(glRenderDevice, 3553, textureFormatInfo, MovementDirectionStatics.aMovementDirection_1183, i_6_ * i, bool) {
        try {
            anInt8612 = i
            anInt8604 = i_6_
            this.aGlRenderDevice_5082!!.method3850((-102).toByte(), this)
            glPixelStorei(3317, 1)
            if (!bool || i_8_ != 0 || i_7_ != 0) {
                glPixelStorei(3314, i_8_)
                glTexImage2Dub(this.anInt5093, 0, this.method228(109), i, i_6_, 0, (method3055(121, this.aTextureFormatInfo_5084)), 5121, `is`, i_7_)
                glPixelStorei(3314, 0)
            } else this.method230(7365, i, `is`!!, i_6_, this.anInt5093)
            glPixelStorei(3317, 4)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("bm.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + i + ',' + i_6_ + ',' + bool + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_7_ + ',' + i_8_ + ')'))
        }
    }

    override fun method67(f: Float, i: Int): Float {
        anInt8611++
        if (i <= 69) method72(84)
        return f / anInt8612.toFloat()
    }

    fun method240(i: Int, i_9_: Byte, fs: FloatArray?, textureFormatInfo: TextureFormatInfo?, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int) {
        try {
            val i_15_ = 108 / ((-45 - i_9_) / 49)
            anInt8614++
            this.aGlRenderDevice_5082!!.method3850((-106).toByte(), this)
            glPixelStorei(3314, i)
            glTexSubImage2Df(this.anInt5093, 0, i_12_, i_10_, i_13_, i_14_, method3055(106, textureFormatInfo), 5121, fs, i_11_)
            glPixelStorei(3314, 0)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("bm.CA(" + i + ',' + i_9_ + ',' + (if (fs != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'))
        }
    }

    override fun method70(i: Int, i_27_: Int, i_28_: Byte, i_29_: Int, i_30_: Int, i_31_: Int, i_32_: Int, `is`: ByteArray?, textureFormatInfo: TextureFormatInfo?) {
        try {
            anInt8608++
            this.aGlRenderDevice_5082!!.method3850((-24).toByte(), this)
            glPixelStorei(3317, 1)
            glPixelStorei(3314, i_29_)
            glTexSubImage2Dub(this.anInt5093, 0, i_32_, i, i_31_, i_30_, method3055(103, textureFormatInfo), 5121, `is`, i_27_)
            if (i_28_ >= -4) anInt8612 = 33
            glPixelStorei(3314, 0)
            glPixelStorei(3317, 4)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("bm.T(" + i + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ')'))
        }
    }

    override fun method65(i: Int, `is`: IntArray, i_33_: Int, i_34_: Int, i_35_: Int, i_36_: Byte, i_37_: Int) {
        anInt8613++
        val is_38_ = IntArray(anInt8612 * anInt8604)
        this.aGlRenderDevice_5082!!.method3850((-32).toByte(), this)
        glGetTexImagei(this.anInt5093, 0, 32993, 5121, is_38_, 0)
        if (i_36_.toInt() == 112) {
            var i_39_ = 0
            while (i_35_ > i_39_) {
                ArrayCopyUtil.method1578(is_38_, ((-i_39_ + i_35_ + (-1 + i_34_)) * anInt8612), `is`, i_33_ * i_39_ + i_37_, i_33_)
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
        this.aGlRenderDevice_5082!!.method3850((-116).toByte(), this)
        if (i_41_ != 22809) aString8605 = null
        anInt8616++
        glPixelStorei(3314, i)
        glTexSubImage2Di(this.anInt5093, 0, i_42_, i_45_, i_44_, i_46_, 32993, (this.aGlRenderDevice_5082!!.anInt9918), `is`, i_43_)
        glPixelStorei(3314, 0)
    }

    internal constructor(glRenderDevice: GlRenderDevice?, textureFormatInfo: TextureFormatInfo?, movementDirection: MovementDirection?, i: Int, i_47_: Int) : super(glRenderDevice, 3553, textureFormatInfo, movementDirection, i_47_ * i, false) {
        try {
            anInt8612 = i
            anInt8604 = i_47_
            this.aGlRenderDevice_5082!!.method3850(110.toByte(), this)
            glTexImage2Dub(this.anInt5093, 0, this.method228(113), i, i_47_, 0, method3055(113, this.aTextureFormatInfo_5084), method1128(-112, this.aMovementDirection_5088), null, 0)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("bm.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + (if (movementDirection != null) "{...}" else "null") + ',' + i + ',' + i_47_ + ')'))
        }
    }

    override fun method66(bool: Boolean, bool_48_: Boolean, i: Int) {
        this.aGlRenderDevice_5082!!.method3850((-29).toByte(), this)
        anInt8615++
        glTexParameteri(this.anInt5093, 10242, if (!bool) 33071 else 10497)
        glTexParameteri(this.anInt5093, 10243, if (!bool_48_) 33071 else 10497)
        if (i != 25688) anInt8604 = -90
    }

    internal constructor(glRenderDevice: GlRenderDevice?, textureFormatInfo: TextureFormatInfo?, i: Int, i_49_: Int, bool: Boolean, fs: FloatArray?, i_50_: Int, i_51_: Int) : super(glRenderDevice, 3553, textureFormatInfo, MovementDirectionStatics.aMovementDirection_1187, i * i_49_, bool) {
        try {
            anInt8612 = i
            anInt8604 = i_49_
            this.aGlRenderDevice_5082!!.method3850((-67).toByte(), this)
            if (bool || i_51_ != 0 || i_50_ != 0) {
                glPixelStorei(3314, i_51_)
                glTexImage2Df(this.anInt5093, 0, this.method228(111), i, i_49_, 0, (method3055(106, this.aTextureFormatInfo_5084)), 5126, fs, 4 * i_50_)
                glPixelStorei(3314, 0)
            } else this.method238(this.anInt5093, 1, i, fs, i_49_)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("bm.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + i + ',' + i_49_ + ',' + bool + ',' + (if (fs != null) "{...}" else "null") + ',' + i_50_ + ',' + i_51_ + ')'))
        }
    }
}
