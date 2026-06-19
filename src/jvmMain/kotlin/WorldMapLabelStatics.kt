object WorldMapLabelStatics {
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
                WorldMapRendererStatics.aFont_4684 = GlTextureBaseStatics.method232(var_renderer, (-53).toByte(), true, ConnectionStateTypeStatics.anInt1044)
                GlTexture3DStatics.aFontDefinition_8527 = GlVertexBufferBaseStatics.method1151(-25411, var_renderer, ConnectionStateTypeStatics.anInt1044)
                if (i != 4) aFontDefinition_4962 = null
                GameAppletFrameStatics.aFont_20 = GlTextureBaseStatics.method232(var_renderer, (-53).toByte(), true, WidgetDefinitionStatics.anInt235)
                ParticleEmitterFactoryStatics.aFontDefinition_3179 = GlVertexBufferBaseStatics.method1151(-25411, var_renderer, WidgetDefinitionStatics.anInt235)
                NodeDequeStatics.aFont_3326 = GlTextureBaseStatics.method232(var_renderer, (-53).toByte(), true, CutsceneSequenceDataStatics.anInt3736)
                aFontDefinition_4962 = GlVertexBufferBaseStatics.method1151(-25411, var_renderer, CutsceneSequenceDataStatics.anInt3736)
            }
    
            @JvmStatic
            fun method3569(i: Int, i_1_: Int) {
                anInt4969++
                val i_2_ = 83 % ((i_1_ - -87) / 37)
                val class348_sub42_sub15 = NamedTimedNodeStatics.method2516(i, 105.toByte(), 4)
                class348_sub42_sub15.method3251(-16058)
            }
}
