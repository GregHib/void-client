import GlTexture2DRegion.Companion.method1971

/* Class367_Sub10 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class GlShadowRenderPass internal constructor(var_ha_Sub3: NativeRenderer) : AbstractRenderPass(var_ha_Sub3) {
    private var aBoolean7385 = false
    override fun method3527(i: Int, interface18: Interface18?, i_0_: Int) {
        this.aHa_Sub3_4479.method3850(79.toByte(), interface18)
        if (i_0_ != -16776) aBoolean7385 = false
        anInt7381++
        this.aHa_Sub3_4479.method3923(true, i)
    }

    override fun method3525(i: Int, bool: Boolean) {
        anInt7384++
        val interface18_impl2 = this.aHa_Sub3_4479.method3834(-16777216)
        if (i != 15192) aBoolean7385 = false
        if (interface18_impl2 != null && bool) {
            this.aHa_Sub3_4479.method3897(1, i + -19574)
            this.aHa_Sub3_4479.method3850(96.toByte(), interface18_impl2)
            this.aHa_Sub3_4479.method3871(NpcDefinitionCache.aCameraNodeList_3314, i + -15192)
            this.aHa_Sub3_4479.method3897(1, -4382)
            this.aHa_Sub3_4479.method3874(RenderQueueState.aRenderConfigFactory_6519, 104, MediaStreamClient.aRenderConfigFactory_3196)
            this.aHa_Sub3_4479.method3924(true, false, 2, (SceneObjectEntity.aTrigLookupTables_8737), false)
            this.aHa_Sub3_4479.method3885(0, true, GlIndexBufferArb.aTrigLookupTables_8503)
            val class101_sub2 = this.aHa_Sub3_4479.method3820(false)
            class101_sub2.method926(i + -30891, this.aHa_Sub3_4479.method3854((-44).toByte()))
            this.aHa_Sub3_4479.method3853(i xor 0x3b47.inv(), ClampTextureNode.aConfigFlagUtil_9477)
            this.aHa_Sub3_4479.method3897(0, -4382)
            aBoolean7385 = true
        } else this.aHa_Sub3_4479.method3885(0, true, GlIndexBufferArb.aTrigLookupTables_8503)
    }

    override fun method3520(i: Byte) {
        if (i.toInt() != 87) aJs5Archive_7382 = null
        anInt7386++
        if (aBoolean7385) {
            this.aHa_Sub3_4479.method3897(1, -4382)
            this.aHa_Sub3_4479.method3871(ModelDefinitionLoader.aCameraNodeList_2047, i.toInt() xor 0x57)
            this.aHa_Sub3_4479.method3874(ParticleSystemState.aRenderConfigFactory_2207, 103, (ParticleSystemState.aRenderConfigFactory_2207))
            this.aHa_Sub3_4479.method3849(47.toByte(), 2, RenderListTextureNode.aTrigLookupTables_9485)
            this.aHa_Sub3_4479.method3885(0, true, WidgetRedrawRegion.aTrigLookupTables_4247)
            this.aHa_Sub3_4479.method3879(-8629)
            this.aHa_Sub3_4479.method3850((-111).toByte(), null)
            this.aHa_Sub3_4479.method3897(0, -4382)
            aBoolean7385 = false
        } else this.aHa_Sub3_4479.method3885(0, true, WidgetRedrawRegion.aTrigLookupTables_4247)
        this.aHa_Sub3_4479.method3874(ParticleSystemState.aRenderConfigFactory_2207, i.toInt() xor 0x2c, ParticleSystemState.aRenderConfigFactory_2207)
    }

    override fun method3526(i: Int, i_2_: Int, i_3_: Int) {
        anInt7389++
        if (i != 10756) aBoolean7385 = false
    }

    override fun method3530(i: Int): Boolean {
        anInt7387++
        if (i > -57) aJs5Archive_7382 = null
        return true
    }

    override fun method3521(bool: Boolean, i: Byte) {
        if (i.toInt() == -103) {
            anInt7383++
            this.aHa_Sub3_4479.method3874(RenderQueueState.aRenderConfigFactory_6519, 99, ParticleSystemState.aRenderConfigFactory_2207)
        }
    }

    companion object {
        @JvmField
        var anInt7381: Int = 0
        @JvmField
        var aJs5Archive_7382: Js5Archive? = null
        @JvmField
        var anInt7383: Int = 0
        @JvmField
        var anInt7384: Int = 0
        @JvmField
        var anInt7386: Int = 0
        @JvmField
        var anInt7387: Int = 0
        @JvmField
        var anInt7388: Int = 0
        @JvmField
        var anInt7389: Int = 0

        @JvmStatic
        fun method3553(bool: Boolean, i: Byte, i_1_: Int) {
            if (i <= 98) method3553(true, 34.toByte(), 120)
            method1971(-2, LocalizedText.aLocalizedText_3495!!.method2063(AnimationFrameDefinition.anInt6967, 544), bool, i_1_)
            anInt7388++
        }

        @JvmStatic
        fun method3554(i: Int) {
            if (i != 1) aJs5Archive_7382 = null
            aJs5Archive_7382 = null
        }
    }
}
