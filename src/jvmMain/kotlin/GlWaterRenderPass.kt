import BrightnessOptionStateStatics.method1745
import GlVertexBufferArbStatics.method2127
import WaterMaterialPassStatics.method2148
import jaggl.OpenGLStatics.glBindProgramARB
import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glProgramLocalParameter4fARB
import ArbVertexProgramStatics.method3442
import GlWaterRenderPassStatics.anInt7286
import GlWaterRenderPassStatics.anInt7287
import GlWaterRenderPassStatics.anInt7288
import GlWaterRenderPassStatics.anInt7289
import GlWaterRenderPassStatics.aShortArrayArrayArray7290
import GlWaterRenderPassStatics.anInt7292
import GlWaterRenderPassStatics.anInt7295

class GlWaterRenderPass internal constructor(glRenderDevice: GlRenderDevice, js5Archive: Js5Archive?, normalMapGenerator: NormalMapGenerator?) : AbstractRenderPass(glRenderDevice) {
    private val aTextureHandle_7293: TextureHandle?
    private val aNormalMapGenerator_7294: NormalMapGenerator?
    private var aGlRenderDevice_7296: GlRenderDevice? = null
    override fun method3527(i: Int, renderable: Renderable?, i_4_: Int) {
        anInt7288++
        if (i_4_ != -16776) aGlRenderDevice_7296 = null
    }

    override fun method3525(i: Int, bool: Boolean) {
        if (i == 15192) {
            anInt7287++
            glBindProgramARB(34336, aTextureHandle_7293!!.anInt2584)
            glEnable(34336)
            this.aHa_Sub3_4479.method3849(47.toByte(), 0, SceneObjectEntityStatics.aTrigLookupTables_8737)
        }
    }

    init {
        try {
            aGlRenderDevice_7296 = glRenderDevice
            aNormalMapGenerator_7294 = normalMapGenerator
            if (js5Archive == null || !aNormalMapGenerator_7294!!.method2039(100) || !aGlRenderDevice_7296!!.aBoolean9923) aTextureHandle_7293 = null
            else aTextureHandle_7293 = method3442(34336, js5Archive.method391("gl", "transparent_water", -29832), aGlRenderDevice_7296, 4)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("ov.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (normalMapGenerator != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3521(bool: Boolean, i: Byte) {
        if (i.toInt() != -103) aShortArrayArrayArray7290 = null
        this.aHa_Sub3_4479.method3874((TheoraVideoStreamStatics.aRenderConfigFactory_9011), 106, (RenderQueueState.aRenderConfigFactory_6519))
        anInt7292++
    }

    override fun method3520(i: Byte) {
        anInt7295++
        if (i.toInt() == 87) {
            this.aHa_Sub3_4479.method3849(47.toByte(), 0, WidgetRedrawRegionStatics.aTrigLookupTables_4247)
            glBindProgramARB(34336, 0)
            glDisable(34820)
            glDisable(34336)
        }
    }

    override fun method3526(i: Int, i_5_: Int, i_6_: Int) {
        anInt7286++
        if (i == 10756) {
            if (aNormalMapGenerator_7294!!.aBoolean3458) {
                val f = ((this.aHa_Sub3_4479.anInt8146) % 4000).toFloat() / 4000.0f
                this.aHa_Sub3_4479.method3850(79.toByte(), aNormalMapGenerator_7294.anInterface18_Impl1_3452)
                glProgramLocalParameter4fARB(34336, 0, f, 0.0f, 0.0f, 1.0f)
            } else {
                val i_7_ = (16 * (this.aHa_Sub3_4479.anInt8146 % 4000) / 4000)
                this.aHa_Sub3_4479.method3850((-118).toByte(), (aNormalMapGenerator_7294.anInterface18_Impl3Array3459!![i_7_]))
                glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f)
            }
        }
    }

    override fun method3530(i: Int): Boolean {
        anInt7289++
        if (i >= -57) return true
        return aTextureHandle_7293 != null
    }
}
