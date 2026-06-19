import MidiSequencePlayerStatics.method2878
import RangeThresholdTextureNodeStatics.method3055
import OggMediaStreamStatics.method520
import jaggl.OpenGLStatics.glTexImage2Di
import OpenGlRenderNodeStatics.method3297

class GlCubeMapTexture internal constructor(glRenderDevice: GlRenderDevice?, i: Int, bool: Boolean, `is`: Array<IntArray?>?) : GlTextureBase(glRenderDevice, 34067, GroundItemRenderState.aTextureFormatInfo_1662, MovementDirectionStatics.aMovementDirection_1183, 6 * (i * i), bool), RenderableCubeTexture {
    init {
        try {
            this.aGlRenderDevice_5082!!.method3850((-109).toByte(), this)
            if (bool) {
                for (i_1_ in 0..5) this.method233(i, i, `is`!![i_1_]!!, i_1_ + 34069, 255)
            } else {
                for (i_0_ in 0..5) glTexImage2Di(34069 + i_0_, 0, this.method228(121), i, i, 0, method3055(110, this.aTextureFormatInfo_5084), (this.aGlRenderDevice_5082!!.anInt9918), `is`!![i_0_], 0)
            }
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("le.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }
}
