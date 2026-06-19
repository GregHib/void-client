import GraphicsOptionStateStatics.method1713
import TexGenMaterialPassStatics.method2158
import CubemapTexture2dSourceStatics.method2260
import jaggl.OpenGLStatics.glBindProgramARB
import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glProgramLocalParameter4fARB
import ArbVertexProgramStatics.method3442
import java.awt.Container
import GlGroundShaderPassStatics.method3557
import GlGroundShaderPassStatics.anInt7393
import GlGroundShaderPassStatics.anInt7400
import GlGroundShaderPassStatics.anInt7401
import GlGroundShaderPassStatics.anInt7402
import GlGroundShaderPassStatics.anInt7408
import GlGroundShaderPassStatics.anInt7409
import GlGroundShaderPassStatics.anInt7412
import GlGroundShaderPassStatics.anInt7414
import GlGroundShaderPassStatics.aLongHashTable_7415

class GlGroundShaderPass internal constructor(glRenderDevice: GlRenderDevice, js5Archive: Js5Archive?) : AbstractRenderPass(glRenderDevice) {
    private var anInterface18_Impl3_7390: Renderable2dTexture? = null
    private val aBoolean7391: Boolean
    private var aTextureHandle_7392: TextureHandle? = null
    private var aTextureHandle_7395: TextureHandle? = null
    private var aBoolean7399 = false
    private var aTextureHandle_7404: TextureHandle? = null
    private var aBoolean7406 = false
    private var aTextureHandle_7407: TextureHandle? = null
    private var aBoolean7411 = false
    private val aFloatArray7413 = FloatArray(4)
    override fun method3528(i: Int) {
        if (i <= 45) method3557(true)
        anInt7401++
        val i_0_ = this.aHa_Sub3_4479.method3941(102)
        val class101_sub2 = this.aHa_Sub3_4479.method3887(98.toByte())
        if (!aBoolean7411) glBindProgramARB(34336, (if (i_0_ != 2147483647) aTextureHandle_7404!!.anInt2584 else aTextureHandle_7395!!.anInt2584))
        else glBindProgramARB(34336, (if (i_0_ == 2147483647) aTextureHandle_7392!!.anInt2584 else aTextureHandle_7407!!.anInt2584))
        glEnable(34336)
        aBoolean7406 = true
        class101_sub2.method919(0.0f, aFloatArray7413, -1.0f, 0.0f, i_0_.toFloat(), (-120).toByte())
        glProgramLocalParameter4fARB(34336, 1, aFloatArray7413[0], aFloatArray7413[1], aFloatArray7413[2], aFloatArray7413[3])
        method3522(-16252)
    }

    override fun method3530(i: Int): Boolean {
        anInt7414++
        if (i > -57) return false
        return aBoolean7391
    }

    override fun method3520(i: Byte) {
        anInt7408++
        this.aHa_Sub3_4479.method3897(1, -4382)
        this.aHa_Sub3_4479.method3850((-128).toByte(), null)
        this.aHa_Sub3_4479.method3874(ParticleSystemStateStatics.aRenderConfigFactory_2207, 116, ParticleSystemStateStatics.aRenderConfigFactory_2207)
        this.aHa_Sub3_4479.method3849(47.toByte(), 0, WidgetRedrawRegionStatics.aTrigLookupTables_4247)
        this.aHa_Sub3_4479.method3849(47.toByte(), 2, RenderListTextureNodeStatics.aTrigLookupTables_9485)
        this.aHa_Sub3_4479.method3885(0, true, WidgetRedrawRegionStatics.aTrigLookupTables_4247)
        this.aHa_Sub3_4479.method3897(0, -4382)
        if (aBoolean7399) {
            this.aHa_Sub3_4479.method3849(47.toByte(), 0, WidgetRedrawRegionStatics.aTrigLookupTables_4247)
            this.aHa_Sub3_4479.method3885(0, true, WidgetRedrawRegionStatics.aTrigLookupTables_4247)
            aBoolean7399 = false
        }
        if (i.toInt() != 87) aLongHashTable_7415 = null
        if (aBoolean7406) {
            glBindProgramARB(34336, 0)
            glDisable(34820)
            glDisable(34336)
            aBoolean7406 = false
        }
    }

    override fun method3526(i: Int, i_1_: Int, i_2_: Int) {
        if (i != 10756) method3527(113, null, 113)
        anInt7402++
    }

    override fun method3527(i: Int, renderable: Renderable?, i_3_: Int) {
        if (renderable != null) {
            if (aBoolean7399) {
                this.aHa_Sub3_4479.method3849(47.toByte(), 0, WidgetRedrawRegionStatics.aTrigLookupTables_4247)
                this.aHa_Sub3_4479.method3885(0, true, WidgetRedrawRegionStatics.aTrigLookupTables_4247)
                aBoolean7399 = false
            }
            this.aHa_Sub3_4479.method3850((-122).toByte(), renderable)
            this.aHa_Sub3_4479.method3923(true, i)
        } else if (!aBoolean7399) {
            this.aHa_Sub3_4479.method3850(99.toByte(), (this.aHa_Sub3_4479.anRenderable_8147))
            this.aHa_Sub3_4479.method3923(true, 1)
            this.aHa_Sub3_4479.method3849(47.toByte(), 0, SceneObjectEntityStatics.aTrigLookupTables_8737)
            this.aHa_Sub3_4479.method3885(0, true, SceneObjectEntityStatics.aTrigLookupTables_8737)
            aBoolean7399 = true
        }
        if (i_3_ != -16776) method3525(16, true)
        anInt7409++
    }

    override fun method3522(i: Int) {
        if (i != -16252) aBoolean7411 = true
        if (aBoolean7406) {
            val i_4_ = this.aHa_Sub3_4479.XA()
            val i_5_ = this.aHa_Sub3_4479.i()
            val f = i_4_.toFloat() - 0.125f * (-i_5_ + i_4_).toFloat()
            val f_6_ = -(0.25f * (-i_5_ + i_4_).toFloat()) + i_4_.toFloat()
            glProgramLocalParameter4fARB(34336, 0, f_6_, f, 1.0f / this.aHa_Sub3_4479.method3833((-58).toByte()).toFloat(), this.aHa_Sub3_4479.method3826((-70).toByte()).toFloat() / 255.0f)
            this.aHa_Sub3_4479.method3897(1, -4382)
            this.aHa_Sub3_4479.method3894(-28186, this.aHa_Sub3_4479.method3863(-104))
            this.aHa_Sub3_4479.method3897(0, -4382)
        }
        anInt7412++
    }

    init {
        try {
            if (js5Archive != null && glRenderDevice!!.aBoolean9923) {
                aTextureHandle_7395 = method3442(34336, js5Archive.method391("gl", "uw_ground_unlit", -29832), glRenderDevice, 4)
                aTextureHandle_7392 = method3442(34336, js5Archive.method391("gl", "uw_ground_lit", -29832), glRenderDevice, 4)
                aTextureHandle_7404 = method3442(34336, js5Archive.method391("gl", "uw_model_unlit", -29832), glRenderDevice, 4)
                aTextureHandle_7407 = method3442(34336, js5Archive.method391("gl", "uw_model_lit", -29832), glRenderDevice, 4)
                if ((aTextureHandle_7395 != null) and (aTextureHandle_7392 != null) and (aTextureHandle_7404 != null) and (aTextureHandle_7407 != null)) {
                    anInterface18_Impl3_7390 = this.aHa_Sub3_4479.method3839(1, 2, -15137, false, (intArrayOf(0, -1)))
                    anInterface18_Impl3_7390!!.method66(false, false, 25688)
                    aBoolean7391 = true
                } else aBoolean7391 = false
            } else aBoolean7391 = false
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("or.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }

    override fun method3525(i: Int, bool: Boolean) {
        anInt7400++
        aBoolean7411 = bool
        this.aHa_Sub3_4479.method3897(1, i xor 0x2a45.inv())
        this.aHa_Sub3_4479.method3850((-32).toByte(), anInterface18_Impl3_7390)
        this.aHa_Sub3_4479.method3874((RenderQueueState.aRenderConfigFactory_6519), 109, MediaStreamClientStatics.aRenderConfigFactory_3196)
        this.aHa_Sub3_4479.method3849(47.toByte(), 0, RenderListTextureNodeStatics.aTrigLookupTables_9485)
        if (i == 15192) {
            this.aHa_Sub3_4479.method3924(true, false, 2, WidgetRedrawRegionStatics.aTrigLookupTables_4247, false)
            this.aHa_Sub3_4479.method3885(0, true, SceneObjectEntityStatics.aTrigLookupTables_8737)
            this.aHa_Sub3_4479.method3897(0, i + -19574)
            method3528(75)
        }
    }

    override fun method3521(bool: Boolean, i: Byte) {
        anInt7393++
        if (i.toInt() != -103) aTextureHandle_7392 = null
    }
}
