import GameAppletFrameStatics.method94
import RangeThresholdTextureNodeStatics.method3055
import jaggl.OpenGLStatics.glPixelStorei
import jaggl.OpenGLStatics.glTexImage3Dub
import java.io.IOException

object Gl3dTextureStatics {
    @JvmField
            var anInt8624: Int = 0
            @JvmField
            var anInt8625: Int = 0
            @JvmField
            var anInt8627: Int = 0
            @JvmField
            var anInt8628: Int = 0
            @JvmField
            var anInt8630: Int = 0
            @JvmField
            var anInt8632: Int = 0
    
            @JvmStatic
            fun method247(i: Int): DisplaySettingsConfig? {
                anInt8632++
                var randomAccessFileOnDisk: RandomAccessFileOnDisk? = null
                var class348_sub51 = DisplaySettingsConfig(HardCacheEntryReferenceStatics.aSceneProjector_10434, 0)
                try {
                    val class144 = VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!.method2233((-46).toByte(), "", true)
                    while (class144!!.anInt1997 == 0) TexGenMaterialPassStatics.method2161((-85).toByte(), 1L)
                    if (class144.anInt1997 == 1) {
                        randomAccessFileOnDisk = class144.anObject1998 as RandomAccessFileOnDisk?
                        val `is` = ByteArray(randomAccessFileOnDisk!!.method1662((-46).toByte()).toInt())
                        var i_2_: Int
                        var i_3_ = 0
                        while (`is`.size > i_3_) {
                            i_2_ = randomAccessFileOnDisk.method1656(`is`, i_3_, (-49).toByte(), -i_3_ + `is`.size)
                            if (i_2_ == -1) throw IOException("EOF")
                            i_3_ += i_2_
                        }
                        class348_sub51 = DisplaySettingsConfig(ByteBuffer(`is`), (HardCacheEntryReferenceStatics.aSceneProjector_10434), 0)
                    }
                } catch (exception: Exception) {
                    /* empty */
                }
                if (i != 24916) return null
                try {
                    if (randomAccessFileOnDisk != null) randomAccessFileOnDisk.method1657(false)
                } catch (exception: Exception) {
                    /* empty */
                }
                return class348_sub51
            }
    
            @JvmStatic
            fun method248(i: Int): Array<IntRange?> {
                anInt8624++
                if (i != -11271) method249(39)
                return (arrayOf<IntRange?>(
                    ItemDefinitionLoaderStatics.aIntRange_2183,
                    LocalizedTextTripleStatics.aIntRange_3751,
                    SequencedWallEntityStatics.aIntRange_10168,
                    HashtableStatics.aIntRange_4388,
                    WidgetDefinitionStatics.aIntRange_250,
                    VideoStreamDecoderStatics.aIntRange_4126,
                    EmoteDefinitionStatics.aIntRange_3264,
                    GraphicsOptionStateStatics.aIntRange_3143,
                    CollisionMapRegionStatics.aIntRange_1722,
                    LoadingScreenImageNodeStatics.aIntRange_9503,
                    ScrollingWidgetComponentNodeStatics.aIntRange_8385,
                    SceneEntityStatics.aIntRange_6383,
                    SocketStreamWorkerStatics.aIntRange_2665,
                    TextureAtlasStateStatics.aIntRange_4421,
                    AwtKeyboardListenerStatics.aIntRange_6528,
                    WorldListEntryStatics.aIntRange_315,
                    GlGroundShaderPassStatics.aIntRange_7398,
                    WaterDetailOptionStateStatics.aIntRange_5992,
                    ScrollingWidgetComponentNodeStatics.aIntRange_8384,
                    ConnectionStateRefs.aIntRange_318,
                    PlayerUpdateDecoder.aIntRange_1917,
                    BasicGlRenderPassStatics.aIntRange_7301,
                    CollisionMapStatics.aIntRange_4433,
                    SequencedWallEntityStatics.aIntRange_10149,
                    AbstractMenuEntryStatics.aIntRange_1702,
                    HeapDiagnosticsHolder.aIntRange_2248,
                    FogOptionStateStatics.aIntRange_6056,
                    WidgetRedrawTrackerStatics.aIntRange_3925,
                    CombineTextureNodeStatics.aIntRange_9225,
                    MapArchiveSourceStatics.aIntRange_4798,
                    SolidFillComponentStatics.aIntRange_8365,
                    RenderableEntryStatics.aIntRange_4331,
                    DetailLevelOptionStateStatics.aIntRange_6121,
                    TerrainShadowBuilderGl3Statics.aIntRange_7015,
                    LightingOptionStateStatics.aIntRange_5883,
                    NoiseTextureGeneratorStatics.aIntRange_1068,
                    TimedRecordAccessorStatics.aIntRange_7106,
                    GlEnvMappedWaterPassStatics.aIntRange_7367,
                    ParserSpecialCharsHolder.aIntRange_1901,
                    GlArrayBufferObjectStatics.aIntRange_4707,
                    MinimapRectClipper.aIntRange_220,
                    SceneryDetailOptionStateStatics.aIntRange_6089,
                    IOException_Sub1Statics.aIntRange_90,
                    SmoothingBufferStatics.aIntRange_3240,
                    PixelBlender.aIntRange_3809,
                    ParticleEffectCacheStatics.aIntRange_3467,
                    RemoveRoofsOptionStateStatics.aIntRange_6058,
                    MapSceneDefLoaderStatics.aIntRange_2483,
                    ModelHeaderCacheStatics.aIntRange_3265,
                    NativeLibraryUnloader.aIntRange_2972,
                    InputSettingsState.aIntRange_1762,
                    CharCountUtil.aIntRange_229,
                    MinimapStateReset.aIntRange_1871,
                    SceneTileBoundsStatics.aIntRange_1120,
                    RgbColorPaletteStatics.aIntRange_1234,
                    HuffmanCodecStatics.aIntRange_3773,
                    WalkingTypeUtil.aIntRange_3307,
                    SpotAnimVectorStatics.aIntRange_2305,
                    WorldMapTextLabelStatics.aIntRange_8590,
                    ItemNameResolverStatics.aIntRange_4998,
                    NpcCountAccessor.aIntRange_2279,
                    GradientLookupEffectStatics.aIntRange_9197,
                    OutgoingPacketNodeStatics.aIntRange_7124,
                    CompassSmootherStatics.aIntRange_3371,
                    BinaryGraphicsOptionStateStatics.aIntRange_5950,
                    HslColorConfigStatics.aIntRange_330,
                    NanoTimerStatics.aIntRange_843,
                    ParticleProcessorStatics.aIntRange_4272,
                    HeadIconRendererStatics.aIntRange_2068,
                    BinaryGraphicsOptionStateStatics.aIntRange_5949,
                    WorldListEntryStatics.aIntRange_304,
                    InputStream_Sub2Statics.aIntRange_82,
                    CacheEntryReferenceStatics.aIntRange_9552,
                    BlankTextureNodeStatics.aIntRange_9254,
                    ArchiveResourceProviderStatics.aIntRange_6340,
                    InputStream_Sub1Statics.aIntRange_79,
                    FileExistsConditionStatics.aIntRange_4779,
                    ObjectByteSerializerHolderStatics.aIntRange_2285,
                    SceneTileBoundsStatics.aIntRange_1123,
                    GroundDecorRendererStatics.aIntRange_3641,
                    PingHostListHolder.aIntRange_2335,
                    ScreenBorderFiller.aIntRange_1959,
                    SceneEffectMarkerStatics.aIntRange_6424,
                    HashTileShapeStatics.aIntRange_8817,
                    PlayerUpdateDecoder.aIntRange_1914,
                    GradientMapTextureNodeStatics.aIntRange_9324,
                    RegionSceneShifterStatics.aIntRange_7052,
                    ParticleProcessorStatics.aIntRange_4269,
                    FriendChatMemberStatics.aIntRange_4477,
                    SimpleBinaryOptionStateStatics.aIntRange_6075,
                    ImageFrameCacheStatics.aIntRange_4027,
                    BrightnessTextureNodeStatics.aIntRange_9216,
                    ScriptOpcodeHolder.aIntRange_2338,
                    SlotBindingStatics.aIntRange_3427,
                    CircleDrawer.aIntRange_2693,
                    ConnectionStateRefs.aIntRange_316,
                    GlCubemapLightPassStatics.aIntRange_7324,
                    StringValueNodeStatics.aIntRange_7113,
                    MapAreaDefinitionStatics.aIntRange_2527,
                    HeapDiagnosticsHolder.aIntRange_2255,
                    CompositeRgbNoiseTextureStatics.aIntRange_8683,
                    TimedRecordAccessorStatics.aIntRange_7105,
                    BlankTextureNodeStatics.aIntRange_9257,
                    FixedFunctionWaterPassStatics.aIntRange_7363,
                    CellNoiseTextureNodeStatics.aIntRange_9285,
                    GlCubemapLightPassStatics.aIntRange_7323,
                    MapSceneIconDefStatics.aIntRange_2860,
                    GroundDecorEntityStatics.aIntRange_8756,
                    GraphicsOptionStateStatics.aIntRange_3135,
                    CacheEntryReferenceStatics.aIntRange_9550,
                    CacheStateResetter.aIntRange_123,
                    ParticleSystemStateStatics.aIntRange_2196,
                    CompassSmootherStatics.aIntRange_3368,
                    DirectionUtil.aIntRange_1540,
                    ProjectileDefinition.aIntRange_3842,
                    TextureQualityOptionStateStatics.aIntRange_5997,
                    LocTypeDefinitionStatics.aIntRange_4015,
                    LocConfigModelBuilderStatics.aIntRange_4500,
                    UnusedToStringStubStatics.aIntRange_2717,
                    FloatCameraTransformStatics.aIntRange_5742,
                    PingHostListHolder.aIntRange_2331
                ))
            }
    
            @JvmStatic
            fun method249(i: Int) {
                anInt8627++
                ArbFogMaterialPassStatics.aStringArray6200 = arrayOfNulls<String>(500)
                ProducerImageSurfaceStatics.anInt9077 = 2 + (WorldMapLabelStatics.aFontDefinition_4962!!.anInt1993 + WorldMapLabelStatics.aFontDefinition_4962!!.anInt1988)
                MovementDirectionStatics.anInt1188 = (ParticleEmitterFactoryStatics.aFontDefinition_3179!!.anInt1988 - (-ParticleEmitterFactoryStatics.aFontDefinition_3179!!.anInt1993 - i))
                var i_4_ = 0
                while ((i_4_ < ArbFogMaterialPassStatics.aStringArray6200!!.size)) {
                    ArbFogMaterialPassStatics.aStringArray6200!![i_4_] = ""
                    i_4_++
                }
                method94(LocalizedTextStatics.aLocalizedText_3483!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544)!!, 67)
            }
}
