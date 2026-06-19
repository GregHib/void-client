import GameAppletFrameStatics.method94
import RangeThresholdTextureNodeStatics.method3055
import jaggl.OpenGLStatics.glPixelStorei
import jaggl.OpenGLStatics.glTexImage3Dub
import java.io.IOException

class Gl3dTexture internal constructor(glRenderDevice: GlRenderDevice?, textureFormatInfo: TextureFormatInfo?, i: Int, i_0_: Int, i_1_: Int, `is`: ByteArray?) : GlTextureBase(glRenderDevice, 32879, textureFormatInfo, MovementDirectionStatics.aMovementDirection_1183, i_0_ * (i * i_1_), false), Renderable3dTexture {
    private val anInt8626: Int
    private val anInt8629: Int
    private val anInt8631: Int

    init {
        try {
            anInt8626 = i_1_
            anInt8631 = i
            anInt8629 = i_0_
            this.aGlRenderDevice_5082!!.method3850(86.toByte(), this)
            glPixelStorei(3317, 1)
            glTexImage3Dub(this.anInt5093, 0, this.method228(105), anInt8631, anInt8629, anInt8626, 0, method3055(109, this.aTextureFormatInfo_5084), 5121, `is`, 0)
            glPixelStorei(3317, 4)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("qba.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }
}
