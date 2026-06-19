import GlVertexBufferArbStatics.method2131
import jaggl.OpenGLStatics.glCopyTexSubImage3D
import jaggl.OpenGLStatics.glFlush
import jaggl.OpenGLStatics.glFramebufferTexture3DEXT
import jaggl.OpenGLStatics.glPixelStorei
import jaggl.OpenGLStatics.glTexImage3Dub
import GlTexture3DStatics.method1960
import GlTexture3DStatics.anInt8524
import GlTexture3DStatics.anInt8526
import GlTexture3DStatics.aFontDefinition_8527

class GlTexture3D : GlTexture {
    @JvmField
    var anInt8522: Int = 0
    @JvmField
    var anInt8523: Int = 0
    private var anInt8525 = -1
    private var anInt8528 = -1
    @JvmField
    var anInt8529: Int = 0

    fun method1958(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
        this.aHa_Sub2_4851.method3771((-110).toByte(), this)
        anInt8526++
        glCopyTexSubImage3D(this.anInt4849, 0, i_2_, i_6_, i_4_, i_3_, i_0_, i_1_, i_5_)
        glFlush()
        if (i != -26823) aFontDefinition_8527 = null
    }

    override fun method37(i: Int) {
        anInt8524++
        glFramebufferTexture3DEXT(anInt8528, anInt8525, this.anInt4849, 0, 0, 0)
        anInt8525 = -1
        if (i != -3022) method1960(112, -107, -46, -98, null, null, null, null, null, null, -114, 75.toByte(), -105, 62, true, false, 110, -31, true)
        anInt8528 = -1
    }

    internal constructor(var_ha_Sub2: OpenGlRenderer, i: Int, i_7_: Int, i_8_: Int, i_9_: Int, `is`: ByteArray?, i_10_: Int) : super(var_ha_Sub2, 32879, i, i_7_ * (i_8_ * i_9_), false) {
        try {
            this.anInt8523 = i_7_
            this.anInt8522 = i_9_
            this.anInt8529 = i_8_
            this.aHa_Sub2_4851.method3771((-84).toByte(), this)
            glPixelStorei(3317, 1)
            glTexImage3Dub(this.anInt4849, 0, this.anInt4858, this.anInt8523, this.anInt8529, this.anInt8522, 0, i_10_, 5121, `is`, 0)
            glPixelStorei(3317, 4)
            this.method1957(9728, true)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("gj.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_10_ + ')'))
        }
    }

    internal constructor(var_ha_Sub2: OpenGlRenderer, i: Int, i_49_: Int, i_50_: Int, i_51_: Int) : super(var_ha_Sub2, 32879, i, i_51_ * i_49_ * i_50_, false) {
        this.anInt8523 = i_49_
        this.anInt8529 = i_50_
        this.anInt8522 = i_51_
        this.aHa_Sub2_4851.method3771((-123).toByte(), this)
        glTexImage3Dub(this.anInt4849, 0, this.anInt4858, this.anInt8523, this.anInt8529, this.anInt8522, 0, CharacterRenderStateStatics.method2779(true, (this.anInt4858)), 5121, null, 0)
        this.method1957(9728, true)
    }
}
