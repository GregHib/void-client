object WaterDetailOptionStateStatics {
    @JvmField
            var anInt5982: Int = 0
            @JvmField
            var anInt5983: Int = 0
            @JvmField
            var anInt5984: Int = 0
            @JvmField
            var anInt5985: Int = 0
            @JvmField
            var anInt5986: Int = 0
            @JvmField
            var anInt5987: Int = 0
            @JvmField
            var anInt5988: Int = 0
            var aConfigFlagUtil_5989: ConfigFlagUtil? = ConfigFlagUtil()
            @JvmField
            var aModelLightingConfig_5990: ModelLightingConfig? = null
            @JvmField
            var anIntArrayArray5991: Array<IntArray?>? = arrayOfNulls<IntArray>(6)
            @JvmField
            var aIntRange_5992: IntRange? = IntRange(17, 4)
            @JvmField
            var aSoundEnvelopeArray5993: Array<SoundEnvelope?>? = null
            @JvmField
            var anInt5994: Int = 0
            @JvmField
            var aKeyboardLayoutCache_5995: KeyboardLayoutCache? = null
    
            @JvmStatic
            fun method1779(i: Byte) {
                anInt5985++
                NamedIdRecordStatics.method3517(73)
                NodeDequeStatics.aModelLightingConfigArrayArray3335 = null
                LruByteCacheStatics.aRenderer1098 = null
                if (i <= 89) anInt5994 = -75
                SceneryDetailOptionStateStatics.aCircleRasterizer_6098 = null
                HeapInfoRecordStatics.aCircleRasterizer_4938 = null
                ParameterizedTextStatics.aCircleRasterizer_9571 = null
            }
    
            @JvmStatic
            fun method1780(i: Int) {
                aIntRange_5992 = null
                val i_0_ = 108 % ((-24 - i) / 54)
                aConfigFlagUtil_5989 = null
                anIntArrayArray5991 = null
                aKeyboardLayoutCache_5995 = null
                aSoundEnvelopeArray5993 = null
                aModelLightingConfig_5990 = null
            }
    
            @JvmStatic
            fun method1781(i: Int, i_1_: Int, i_2_: Int): Int {
                anInt5983++
                if (AbstractFrameBufferSurfaceStatics.anInt6923 == -1) return 1
                if (i != IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350)) {
                    GlTexture2DRegionStatics.method1971(-2, LocalizedTextStatics.aLocalizedText_3496!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544), true, i)
                    if (i != IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350)) return -1
                }
                try {
                    val dimension = ParticleSystemRendererStatics.aCanvas3869!!.getSize()
                    Tooltip.method3511(true, GameAppletFrameStatics.aFont_20, ParticleEmitterFactoryStatics.aFontDefinition_3179, LocalizedTextStatics.aLocalizedText_3496!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544), 2, FacingDirectionNodeStatics.aRenderer6654)
                    val class124 = ParticleConfigParserStatics.method2277(0, RasterSpriteStatics.aJs5Archive_5207!!, AbstractFrameBufferSurfaceStatics.anInt6923, -1)
                    val l = GameClock.method599(-88)
                    FacingDirectionNodeStatics.aRenderer6654!!.la()
                    SettingsCrcWriter.aAbstractCameraTransform_2123!!.method894(0, TheoraVideoStreamStatics.anInt9037, 0)
                    FacingDirectionNodeStatics.aRenderer6654!!.method3638(SettingsCrcWriter.aAbstractCameraTransform_2123)
                    FacingDirectionNodeStatics.aRenderer6654!!.DA(dimension.width / 2, dimension.height / 2, 512, 512)
                    FacingDirectionNodeStatics.aRenderer6654!!.xa(1.0f)
                    if (i_1_ >= -66) aModelLightingConfig_5990 = null
                    FacingDirectionNodeStatics.aRenderer6654!!.ZA(16777215, 0.5f, 0.5f, 20.0f, -50.0f, 30.0f)
                    val class64 = FacingDirectionNodeStatics.aRenderer6654!!.method3625(class124, 2048, 64, 64, 768)
                    var i_3_ = 0
                    while_80_@ for (i_4_ in 0..499) {
                        FacingDirectionNodeStatics.aRenderer6654!!.GA(0)
                        FacingDirectionNodeStatics.aRenderer6654!!.ya()
                        for (i_5_ in 15 downTo 0) {
                            for (i_6_ in 0..i_5_) {
                                MinimapSquareDrawerStatics.aAbstractCameraTransform_5209!!.method894(((-(i_5_.toFloat() / 2.0f) + i_6_.toFloat()) * ArchiveFileConditionWrapperStatics.anInt3465.toFloat()).toInt(), 0, (i_5_ + 1) * ArchiveFileConditionWrapperStatics.anInt3465)
                                i_3_++
                                class64.method615(MinimapSquareDrawerStatics.aAbstractCameraTransform_5209, null, 0)
                                if (GameClock.method599(-105) + -l >= i_2_.toLong()) break@while_80_
                            }
                        }
                    }
                    FacingDirectionNodeStatics.aRenderer6654!!.method3633()
                    val l_7_ = (1000 * i_3_).toLong() / (GameClock.method599(-86) + -l)
                    FacingDirectionNodeStatics.aRenderer6654!!.GA(0)
                    FacingDirectionNodeStatics.aRenderer6654!!.ya()
                    return l_7_.toInt()
                } catch (throwable: Throwable) {
                    throwable.printStackTrace()
                    return -1
                }
            }
}
