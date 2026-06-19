import kotlin.math.pow
import kotlin.math.sqrt
import GlCubemapLightPassStatics.method3542
import GlCubemapLightPassStatics.anInt7308
import GlCubemapLightPassStatics.anInt7312
import GlCubemapLightPassStatics.anInt7313
import GlCubemapLightPassStatics.anInt7314
import GlCubemapLightPassStatics.anInt7316
import GlCubemapLightPassStatics.anInt7322

/* Class367_Sub4 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class GlCubemapLightPass internal constructor(var_ha_Sub3: NativeRenderer) : AbstractRenderPass(var_ha_Sub3) {
    private var aBoolean7311 = false
    private var anInterface18_Impl2Array7315: Array<RenderableCubeTexture?>? = null
    private var aBoolean7317 = false

    init {
        if (var_ha_Sub3.aBoolean8101) {
            aBoolean7311 = var_ha_Sub3.anInt8090 < 3
            val i = if (aBoolean7311) 48 else 127
            val `is` = Array<IntArray?>(6) { IntArray(4096) }
            val is_0_ = Array<IntArray?>(6) { IntArray(4096) }
            val is_1_ = Array<IntArray?>(6) { IntArray(4096) }
            var i_2_ = 0
            for (i_3_ in 0..63) {
                for (i_4_ in 0..63) {
                    var f = -1.0f + i_3_.toFloat() * 2.0f / 64.0f
                    var f_5_ = 2.0f * i_4_.toFloat() / 64.0f - 1.0f
                    val f_6_ = (1.0 / sqrt((f * f + (1.0f + f_5_ * f_5_)).toDouble())).toFloat()
                    f *= f_6_
                    f_5_ *= f_6_
                    for (i_7_ in 0..5) {
                        val f_8_: Float
                        if (i_7_ != 0) {
                            if (i_7_ != 1) {
                                if (i_7_ == 2) f_8_ = f
                                else if (i_7_ == 3) f_8_ = -f
                                else if (i_7_ != 4) f_8_ = -f_6_
                                else f_8_ = f_6_
                            } else f_8_ = f_5_
                        } else f_8_ = -f_5_
                        val i_9_: Int
                        val i_10_: Int
                        val i_11_: Int
                        if (f_8_ > 0.0f) {
                            i_9_ = (i.toDouble() * f_8_.toDouble().pow(96.0)).toInt()
                            i_10_ = (i.toDouble() * f_8_.toDouble().pow(36.0)).toInt()
                            i_11_ = (f_8_.toDouble().pow(12.0) * i.toDouble()).toInt()
                        } else {
                            i_11_ = 0
                            i_10_ = i_11_
                            i_9_ = i_10_
                        }
                        is_0_[i_7_]!![i_2_] = i_9_ shl 24
                        is_1_[i_7_]!![i_2_] = i_10_ shl 24
                        `is`[i_7_]!![i_2_] = i_11_ shl 24
                    }
                    i_2_++
                }
            }
            anInterface18_Impl2Array7315 = arrayOfNulls<RenderableCubeTexture>(3)
            anInterface18_Impl2Array7315!![0] = this.aHa_Sub3_4479.method3900(is_0_, false, 52, 64)
            anInterface18_Impl2Array7315!![1] = this.aHa_Sub3_4479.method3900(is_1_, false, 3, 64)
            anInterface18_Impl2Array7315!![2] = this.aHa_Sub3_4479.method3900(`is`, false, 17, 64)
        }
    }

    override fun method3530(i: Int): Boolean {
        anInt7314++
        if (i > -57) method3525(91, false)
        return true
    }

    override fun method3525(i: Int, bool: Boolean) {
        if (i != 15192) method3527(-85, null, -72)
        if (anInterface18_Impl2Array7315 != null && bool) {
            this.aHa_Sub3_4479.method3897(1, -4382)
            this.aHa_Sub3_4479.method3871(ItemModelDefinitionStatics.aCameraNodeList_430, 0)
            val class101_sub2 = this.aHa_Sub3_4479.method3820(false)
            class101_sub2.method899(1024)
            this.aHa_Sub3_4479.method3853(-32, ClampTextureNodeStatics.aConfigFlagUtil_9477)
            if (aBoolean7311) {
                this.aHa_Sub3_4479.method3874((RenderQueueState.aRenderConfigFactory_6519), 113, (TheoraVideoStreamStatics.aRenderConfigFactory_9011))
                this.aHa_Sub3_4479.method3924(true, false, 0, WidgetRedrawRegionStatics.aTrigLookupTables_4247, false)
                this.aHa_Sub3_4479.method3885(0, true, GlIndexBufferArbStatics.aTrigLookupTables_8503)
            } else {
                this.aHa_Sub3_4479.method3874((ParticleSystemStateStatics.aRenderConfigFactory_2207), 117, (RenderQueueState.aRenderConfigFactory_6519))
                this.aHa_Sub3_4479.method3849(47.toByte(), 0, (SceneObjectEntityStatics.aTrigLookupTables_8737))
                this.aHa_Sub3_4479.method3897(2, -4382)
                this.aHa_Sub3_4479.method3874((RenderQueueState.aRenderConfigFactory_6519), 122, (TheoraVideoStreamStatics.aRenderConfigFactory_9011))
                this.aHa_Sub3_4479.method3849(47.toByte(), 0, (SceneObjectEntityStatics.aTrigLookupTables_8737))
                this.aHa_Sub3_4479.method3924(true, false, 1, (SceneObjectEntityStatics.aTrigLookupTables_8737), false)
                this.aHa_Sub3_4479.method3885(0, true, GlIndexBufferArbStatics.aTrigLookupTables_8503)
                this.aHa_Sub3_4479.method3850((-61).toByte(), (this.aHa_Sub3_4479.anRenderable_8147))
            }
            this.aHa_Sub3_4479.method3897(0, i + -19574)
            aBoolean7317 = true
        } else this.aHa_Sub3_4479.method3885(0, true, GlIndexBufferArbStatics.aTrigLookupTables_8503)
        anInt7313++
    }

    override fun method3527(i: Int, renderable: Renderable?, i_12_: Int) {
        anInt7316++
        this.aHa_Sub3_4479.method3850(91.toByte(), renderable)
        this.aHa_Sub3_4479.method3923(true, i)
        if (i_12_ != -16776) method3525(61, true)
    }

    override fun method3520(i: Byte) {
        if (aBoolean7317) {
            this.aHa_Sub3_4479.method3897(1, i.toInt() xor 0x114a.inv())
            this.aHa_Sub3_4479.method3850((-121).toByte(), null)
            this.aHa_Sub3_4479.method3871(ModelDefinitionLoaderStatics.aCameraNodeList_2047, 0)
            this.aHa_Sub3_4479.method3879(-8629)
            if (aBoolean7311) {
                this.aHa_Sub3_4479.method3874(ParticleSystemStateStatics.aRenderConfigFactory_2207, 120, ParticleSystemStateStatics.aRenderConfigFactory_2207)
                this.aHa_Sub3_4479.method3849(47.toByte(), 0, WidgetRedrawRegionStatics.aTrigLookupTables_4247)
                this.aHa_Sub3_4479.method3885(0, true, WidgetRedrawRegionStatics.aTrigLookupTables_4247)
            } else {
                this.aHa_Sub3_4479.method3874(ParticleSystemStateStatics.aRenderConfigFactory_2207, 115, ParticleSystemStateStatics.aRenderConfigFactory_2207)
                this.aHa_Sub3_4479.method3849(47.toByte(), 0, WidgetRedrawRegionStatics.aTrigLookupTables_4247)
                this.aHa_Sub3_4479.method3897(2, i + -4469)
                this.aHa_Sub3_4479.method3874((ParticleSystemStateStatics.aRenderConfigFactory_2207), i.toInt() xor 0x21, (ParticleSystemStateStatics.aRenderConfigFactory_2207))
                this.aHa_Sub3_4479.method3849(47.toByte(), 0, WidgetRedrawRegionStatics.aTrigLookupTables_4247)
                this.aHa_Sub3_4479.method3849(47.toByte(), 1, (SceneObjectEntityStatics.aTrigLookupTables_8737))
                this.aHa_Sub3_4479.method3885(0, true, WidgetRedrawRegionStatics.aTrigLookupTables_4247)
                this.aHa_Sub3_4479.method3850(64.toByte(), null)
            }
            this.aHa_Sub3_4479.method3897(0, i.toInt() xor 0x114a.inv())
            aBoolean7317 = false
        } else this.aHa_Sub3_4479.method3885(0, true, WidgetRedrawRegionStatics.aTrigLookupTables_4247)
        anInt7312++
        if (i.toInt() != 87) aBoolean7311 = true
        this.aHa_Sub3_4479.method3874(ParticleSystemStateStatics.aRenderConfigFactory_2207, i + 13, ParticleSystemStateStatics.aRenderConfigFactory_2207)
    }

    override fun method3521(bool: Boolean, i: Byte) {
        this.aHa_Sub3_4479.method3874((RenderQueueState.aRenderConfigFactory_6519), 126, ParticleSystemStateStatics.aRenderConfigFactory_2207)
        if (i.toInt() != -103) method3542(74, null, 65, 65, -77, true)
        anInt7308++
    }

    override fun method3526(i: Int, i_40_: Int, i_41_: Int) {
        if (i != 10756) method3520((-127).toByte())
        if (aBoolean7317) {
            this.aHa_Sub3_4479.method3897(1, i + -15138)
            this.aHa_Sub3_4479.method3850((-67).toByte(), anInterface18_Impl2Array7315!![-1 + i_40_])
            this.aHa_Sub3_4479.method3897(0, i xor 0x3b19.inv())
        }
        anInt7322++
    }
}
