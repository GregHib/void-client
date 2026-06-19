import ModelBatchBaseStatics.method1128
import RangeThresholdTextureNodeStatics.method3055
import jaggl.OpenGLStatics.glGetTexImagei
import jaggl.OpenGLStatics.glPixelStorei
import jaggl.OpenGLStatics.glTexImage2Df
import jaggl.OpenGLStatics.glTexImage2Di
import jaggl.OpenGLStatics.glTexImage2Dub
import jaggl.OpenGLStatics.glTexSubImage2Di
import jaggl.OpenGLStatics.glTexSubImage2Dub
import GlRectangleTextureStatics.method250
import GlRectangleTextureStatics.anInt8635
import GlRectangleTextureStatics.anInt8637
import GlRectangleTextureStatics.anInt8639
import GlRectangleTextureStatics.aByteArrayArray8642
import GlRectangleTextureStatics.anInt8645
import GlRectangleTextureStatics.anInt8646
import GlRectangleTextureStatics.anInt8647
import GlRectangleTextureStatics.anInt8649
import GlRectangleTextureStatics.anInt8650
import GlRectangleTextureStatics.anInt8651
import GlRectangleTextureStatics.method254

class GlRectangleTexture : GlTextureBase, Renderable2dTexture {
    private var anInt8634 = 0
    private var anInt8640 = 0
    override fun method72(i: Int): Int {
        anInt8649++
        val i_2_ = 96 % ((i - 55) / 63)
        return anInt8634
    }

    internal constructor(glRenderDevice: GlRenderDevice?, i: Int, i_3_: Int, `is`: IntArray?, i_4_: Int, i_5_: Int) : super(glRenderDevice, 34037, GroundItemRenderState.aTextureFormatInfo_1662, MovementDirectionStatics.aMovementDirection_1183, i * i_3_, false) {
        try {
            anInt8640 = i
            anInt8634 = i_3_
            this.aGlRenderDevice_5082!!.method3850(76.toByte(), this)
            glPixelStorei(3314, i_5_)
            glTexImage2Di(this.anInt5093, 0, 6408, anInt8640, anInt8634, 0, 32993, (this.aGlRenderDevice_5082!!.anInt9918), `is`, i_4_ * 4)
            glPixelStorei(3314, 0)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("tw.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + i + ',' + i_3_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_4_ + ',' + i_5_ + ')'))
        }
    }

    internal constructor(glRenderDevice: GlRenderDevice?, textureFormatInfo: TextureFormatInfo?, i: Int, i_6_: Int, `is`: ByteArray?, i_7_: Int, i_8_: Int) : super(glRenderDevice, 34037, textureFormatInfo, MovementDirectionStatics.aMovementDirection_1183, i * i_6_, false) {
        try {
            anInt8634 = i_6_
            anInt8640 = i
            this.aGlRenderDevice_5082!!.method3850((-127).toByte(), this)
            glPixelStorei(3317, 1)
            glPixelStorei(3314, i_8_)
            glTexImage2Dub(this.anInt5093, 0, this.method228(126), i, i_6_, 0, (method3055(111, this.aTextureFormatInfo_5084)), 5121, `is`, i_7_)
            glPixelStorei(3314, 0)
            glPixelStorei(3317, 4)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("tw.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + i + ',' + i_6_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_7_ + ',' + i_8_ + ')'))
        }
    }

    override fun method66(bool: Boolean, bool_9_: Boolean, i: Int) {
        if (i != 25688) method254(-82, (-35).toByte())
        anInt8639++
    }

    internal constructor(glRenderDevice: GlRenderDevice?, textureFormatInfo: TextureFormatInfo?, movementDirection: MovementDirection?, i: Int, i_10_: Int) : super(glRenderDevice, 34037, textureFormatInfo, movementDirection, i_10_ * i, false) {
        try {
            anInt8634 = i_10_
            anInt8640 = i
            this.aGlRenderDevice_5082!!.method3850(115.toByte(), this)
            glTexImage2Dub(this.anInt5093, 0, this.method228(109), i, i_10_, 0, method3055(105, this.aTextureFormatInfo_5084), method1128(-54, this.aMovementDirection_5088), null, 0)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("tw.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + (if (movementDirection != null) "{...}" else "null") + ',' + i + ',' + i_10_ + ')'))
        }
    }

    override fun method65(i: Int, `is`: IntArray, i_26_: Int, i_27_: Int, i_28_: Int, i_29_: Byte, i_30_: Int) {
        anInt8645++
        if (i_29_.toInt() != 112) anInt8634 = 49
        val is_31_ = IntArray(anInt8634 * anInt8640)
        this.aGlRenderDevice_5082!!.method3850((-34).toByte(), this)
        glGetTexImagei(this.anInt5093, 0, 32993, 5121, is_31_, 0)
        var i_32_ = 0
        while (i_28_ > i_32_) {
            ArrayCopyUtil.method1578(is_31_, anInt8640 * (i_28_ + -1 + (i_27_ + -i_32_)), `is`, i_32_ * i_26_ + i_30_, i_26_)
            i_32_++
        }
    }

    override fun method67(f: Float, i: Int): Float {
        if (i <= 69) aByteArrayArray8642 = null
        anInt8646++
        return f
    }

    internal constructor(glRenderDevice: GlRenderDevice?, textureFormatInfo: TextureFormatInfo?, i: Int, i_33_: Int, fs: FloatArray?, i_34_: Int, i_35_: Int) : super(glRenderDevice, 34037, textureFormatInfo, MovementDirectionStatics.aMovementDirection_1187, i_33_ * i, false) {
        try {
            anInt8640 = i
            anInt8634 = i_33_
            this.aGlRenderDevice_5082!!.method3850((-45).toByte(), this)
            glPixelStorei(3314, i_35_)
            glTexImage2Df(this.anInt5093, 0, this.method228(107), i, i_33_, 0, (method3055(126, this.aTextureFormatInfo_5084)), 5126, fs, i_34_ * 4)
            glPixelStorei(3314, 0)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("tw.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + i + ',' + i_33_ + ',' + (if (fs != null) "{...}" else "null") + ',' + i_34_ + ',' + i_35_ + ')'))
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
        this.aGlRenderDevice_5082!!.method3850(118.toByte(), this)
        anInt8650++
        if (i == 0) i = i_39_
        if (i_39_ != i) glPixelStorei(3314, i)
        glTexSubImage2Di(this.anInt5093, 0, i_37_, i_40_, i_39_, i_41_, 32993, (this.aGlRenderDevice_5082!!.anInt9918), `is`, i_38_)
        if (i != i_39_) glPixelStorei(3314, 0)
        if (i_36_ != 22809) anInt8634 = 115
    }

    override fun method70(i: Int, i_42_: Int, i_43_: Byte, i_44_: Int, i_45_: Int, i_46_: Int, i_47_: Int, `is`: ByteArray?, textureFormatInfo: TextureFormatInfo?) {
        var i_44_ = i_44_
        try {
            this.aGlRenderDevice_5082!!.method3850((-39).toByte(), this)
            anInt8647++
            if (i_44_ == 0) i_44_ = i_46_
            glPixelStorei(3317, 1)
            if (i_43_ >= -4) method250(74, false, -106)
            if (i_46_ != i_44_) glPixelStorei(3314, i_44_)
            glTexSubImage2Dub(this.anInt5093, 0, i_47_, i, i_46_, i_45_, method3055(120, textureFormatInfo), 5121, `is`, i_42_)
            if (i_46_ != i_44_) glPixelStorei(3314, 0)
            glPixelStorei(3317, 4)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("tw.T(" + i + ',' + i_42_ + ',' + i_43_ + ',' + i_44_ + ',' + i_45_ + ',' + i_46_ + ',' + i_47_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ')'))
        }
    }
}
