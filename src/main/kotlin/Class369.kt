/* Class369 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
public open class Class369(screenAnchorAlignment: ScreenAnchorAlignment?, tileRenderState: TileRenderState?, i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) : Interface12 {
    @JvmField
    var anInt4959: Int = 0
    @JvmField
    var anInt4961: Int = 0
    @JvmField
    var anInt4963: Int = 0
    @JvmField
    var anInt4965: Int = 0
    @JvmField
    var anInt4966: Int = 0
    @JvmField
    var aScreenAnchorAlignment_4968: ScreenAnchorAlignment? = null
    @JvmField
    var anInt4970: Int = 0
    @JvmField
    var anInt4971: Int = 0
    @JvmField
    var aTileRenderState_4973: TileRenderState? = null

    override fun method51(i: Byte): ProjectileFactory? {
        if (i < 116) return null
        anInt4967++
        return null
    }

    init {
        try {
            this.anInt4961 = i_8_
            this.anInt4971 = i_4_
            this.anInt4965 = i_7_
            this.anInt4966 = i_6_
            this.anInt4959 = i_3_
            this.aTileRenderState_4973 = tileRenderState
            this.anInt4970 = i
            this.aScreenAnchorAlignment_4968 = screenAnchorAlignment
            this.anInt4963 = i_5_
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("fn.<init>(" + (if (screenAnchorAlignment != null) "{...}" else "null") + ',' + (if (tileRenderState != null) "{...}" else "null") + ',' + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt4960: Int = 0
        @JvmField
        var aFontDefinition_4962: FontDefinition? = null
        @JvmField
        var anInt4964: Int = 0
        @JvmField
        var anInt4967: Int = 0
        @JvmField
        var anInt4969: Int = 0
        @JvmField
        var aBoolean4972: Boolean = false
        @JvmStatic
        fun method3567(i: Int) {
            aFontDefinition_4962 = null
            val i_0_ = 105 % ((-15 - i) / 36)
        }

        @JvmStatic
        fun method3568(var_renderer: Renderer?, i: Int) {
            anInt4964++
            WorldMapRenderer.aFont_4684 = GlTextureBase.method232(var_renderer, (-53).toByte(), true, Class56.anInt1044)
            GlTexture3D.aFontDefinition_8527 = GlVertexBufferBase.method1151(-25411, var_renderer, Class56.anInt1044)
            if (i != 4) aFontDefinition_4962 = null
            GameAppletFrame.aFont_20 = GlTextureBase.method232(var_renderer, (-53).toByte(), true, WidgetDefinition.anInt235)
            ParticleEmitterFactory.aFontDefinition_3179 = GlVertexBufferBase.method1151(-25411, var_renderer, WidgetDefinition.anInt235)
            NodeDeque.aFont_3326 = GlTextureBase.method232(var_renderer, (-53).toByte(), true, CutsceneSequenceData.anInt3736)
            aFontDefinition_4962 = GlVertexBufferBase.method1151(-25411, var_renderer, CutsceneSequenceData.anInt3736)
        }

        @JvmStatic
        fun method3569(i: Int, i_1_: Int) {
            anInt4969++
            val i_2_ = 83 % ((i_1_ - -87) / 37)
            val class348_sub42_sub15 = NamedTimedNode.method2516(i, 105.toByte(), 4)
            class348_sub42_sub15.method3251(-16058)
        }
    }
}
