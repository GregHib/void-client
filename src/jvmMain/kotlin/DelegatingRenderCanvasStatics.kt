import GameAppletFrameStatics.method94
import BloomGraphicsOptionStateStatics.method1772
import CameraDistanceOptionStateStatics.method1725
import WaterMaterialPassStatics.method2148
import CubemapTextureImplSourceStatics.method2271
import AbstractTileShapeStatics.method2718
import WorldMapAreaLabelStatics.method3570
import NativeRendererStatics.method3936
import java.awt.Canvas
import java.awt.Component
import java.awt.Graphics

object DelegatingRenderCanvasStatics {
    @JvmField
            var anIntArray60: IntArray?
            @JvmField
            var anInt61: Int = 0
            @JvmField
            var anInt62: Int = 0
            @JvmField
            var anInt63: Int = 0
            @JvmField
            var anInt65: Int = 0
            @JvmField
            var anInt66: Int = 0
            @JvmField
            var anInt67: Int = 0
            @JvmField
            var anInt68: Int = 0
            @JvmField
            var anInt69: Int = 0
            @JvmField
            var anInt70: Int = 0
    
            @JvmStatic
            fun method119(i: Int, l: Long) {
                try {
                    anInt66++
                    val i_0_ = (ConnectionStateRefs.anInt319 + LocalPlayerState.aPlayer_1907!!.x)
                    val i_1_ = (WalkingTypeUtil.anInt3310 + LocalPlayerState.aPlayer_1907!!.y)
                    if (-i_0_ + FrameStatsResetStatics.anInt5799 < -2000 || -i_0_ + FrameStatsResetStatics.anInt5799 > 2000 || AsyncTaskHandleStatics.anInt2578 - i_1_ < -2000 || -i_1_ + AsyncTaskHandleStatics.anInt2578 > 2000) {
                        AsyncTaskHandleStatics.anInt2578 = i_1_
                        FrameStatsResetStatics.anInt5799 = i_0_
                    }
                    if (FrameStatsResetStatics.anInt5799 != i_0_) {
                        val i_2_ = i_0_ - FrameStatsResetStatics.anInt5799
                        var i_3_ = (i_2_.toLong() * l / 320L).toInt()
                        if (i_2_ <= 0) {
                            if (i_3_ == 0) i_3_ = -1
                            else if (i_3_ < i_2_) i_3_ = i_2_
                        } else if (i_3_ == 0) i_3_ = 1
                        else if (i_3_ > i_2_) i_3_ = i_2_
                        FrameStatsResetStatics.anInt5799 += i_3_
                    }
                    if (i == -1) {
                        ResourceProviderStatics.aFloat3938 += CircleDrawer.aFloat2687 * l.toFloat() / 6.0f
                        if (i_1_ != AsyncTaskHandleStatics.anInt2578) {
                            val i_4_ = i_1_ - AsyncTaskHandleStatics.anInt2578
                            var i_5_ = (i_4_.toLong() * l / 320L).toInt()
                            if (i_4_ > 0) {
                                if (i_5_ != 0) {
                                    if (i_5_ > i_4_) i_5_ = i_4_
                                } else i_5_ = 1
                            } else if (i_5_ != 0) {
                                if (i_5_ < i_4_) i_5_ = i_4_
                            } else i_5_ = -1
                            AsyncTaskHandleStatics.anInt2578 += i_5_
                        }
                        SceneObjectSpawnerStatics.aFloat1287 += MultiFieldRecordStatics.aFloat6898 * l.toFloat() / 6.0f
                        method1725(262144)
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, "vg.A(" + i + ',' + l + ')')
                }
            }
    
            @JvmStatic
            fun method120(bool: Boolean) {
                anIntArray60 = null
                if (bool != false) anIntArray60 = null
            }
    
            fun method121(i: Int, i_6_: Int, bool: Boolean, i_7_: Int, i_8_: Int, i_9_: Int) {
                if (i_6_ != -364570972) anInt70 = -4
                anInt68++
                val l = (i or (if (!bool) 0 else -2147483648)).toLong()
                var class348_sub13 = (AbstractProceduralTextureNodeStatics.aHashtable_7041!!.method3480(l, -6008) as ModelKeyBuilder?)
                if (class348_sub13 == null) {
                    class348_sub13 = ModelKeyBuilder()
                    AbstractProceduralTextureNodeStatics.aHashtable_7041!!.method3483(109.toByte(), l, class348_sub13)
                }
                if (class348_sub13.anIntArray6757!!.size <= i_7_) {
                    val `is` = IntArray(1 + i_7_)
                    val is_10_ = IntArray(1 + i_7_)
                    var i_11_ = 0
                    while ((class348_sub13.anIntArray6757!!.size > i_11_)) {
                        `is`[i_11_] = class348_sub13.anIntArray6757!![i_11_]
                        is_10_[i_11_] = class348_sub13.anIntArray6758[i_11_]
                        i_11_++
                    }
                    for (i_12_ in class348_sub13.anIntArray6757!!.size..<i_7_) {
                        `is`[i_12_] = -1
                        is_10_[i_12_] = 0
                    }
                    class348_sub13.anIntArray6757 = `is`
                    class348_sub13.anIntArray6758 = is_10_
                }
                class348_sub13.anIntArray6757!![i_7_] = i_9_
                class348_sub13.anIntArray6758[i_7_] = i_8_
            }
    
            fun method122(i: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Byte, var_renderer: Renderer): AbstractModel? {
                anInt62++
                if (i_17_.toInt() != -35) anInt70 = 10
                val l = i_16_.toLong()
                var abstractModel = CharCountUtil.aLruByteCache_225!!.method583(l, 81) as AbstractModel?
                val i_18_ = 2055
                if (abstractModel == null) {
                    val class124 = ParticleConfigParserStatics.method2277(0, RasterSpriteStatics.aJs5Archive_5207!!, i_16_, -1)
                    if (class124 == null) return null
                    if (class124.anInt1830 < 13) class124.method1092(2, 105)
                    abstractModel = var_renderer.method3625(class124, i_18_, RefCountedHandleStatics.anInt2275, 64, 768)
                    CharCountUtil.aLruByteCache_225!!.method582(abstractModel, l, (-122).toByte())
                }
                abstractModel = abstractModel.method614(2.toByte(), i_18_, true)
                if (i_15_ != 0) abstractModel!!.a(i_15_)
                if (i_13_ != 0) abstractModel!!.FA(i_13_)
                if (i_14_ != 0) abstractModel!!.VA(i_14_)
                if (i != 0) abstractModel!!.H(0, i, 0)
                return abstractModel
            }
    
            @JvmStatic
            fun method123(i: Int) {
                anInt63++
                RegionSceneLoader.method2193(false, (-125).toByte())
                LocDefinitionCacheStatics.anInt3441 = 0
                var bool = true
                var i_19_ = 0
                while (DragDropControllerStatics.aByteArrayArray4281!!.size > i_19_) {
                    if (NativeSpriteStatics.anIntArray5192!![i_19_] != -1 && DragDropControllerStatics.aByteArrayArray4281!![i_19_] == null) {
                        DragDropControllerStatics.aByteArrayArray4281!![i_19_] = GlShadowRenderPassStatics.aJs5Archive_7382!!.method410(-1860, NativeSpriteStatics.anIntArray5192!![i_19_], 0)
                        if (DragDropControllerStatics.aByteArrayArray4281!![i_19_] == null) {
                            bool = false
                            LocDefinitionCacheStatics.anInt3441++
                        }
                    }
                    if (GameAppletFrameStatics.anIntArray38!![i_19_] != -1 && GlRectangleTextureStatics.aByteArrayArray8642!![i_19_] == null) {
                        GlRectangleTextureStatics.aByteArrayArray8642!![i_19_] = (GlShadowRenderPassStatics.aJs5Archive_7382!!.method393(GameAppletFrameStatics.anIntArray38!![i_19_], 0, i + 2, BrightnessOptionStateStatics.anIntArrayArray5894!![i_19_]))
                        if (GlRectangleTextureStatics.aByteArrayArray8642!![i_19_] == null) {
                            LocDefinitionCacheStatics.anInt3441++
                            bool = false
                        }
                    }
                    if (LocalizedTextTripleStatics.anIntArray3759!![i_19_] != -1 && ModelFacePriorityNodeStatics.aByteArrayArray1887!![i_19_] == null) {
                        ModelFacePriorityNodeStatics.aByteArrayArray1887!![i_19_] = GlShadowRenderPassStatics.aJs5Archive_7382!!.method410(-1860, LocalizedTextTripleStatics.anIntArray3759!![i_19_], 0)
                        if (ModelFacePriorityNodeStatics.aByteArrayArray1887!![i_19_] == null) {
                            LocDefinitionCacheStatics.anInt3441++
                            bool = false
                        }
                    }
                    if (RenderNodeStatics.anIntArray9724!![i_19_] != -1 && VorbisOggDecoderStatics.aByteArrayArray8996!![i_19_] == null) {
                        VorbisOggDecoderStatics.aByteArrayArray8996!![i_19_] = GlShadowRenderPassStatics.aJs5Archive_7382!!.method410(-1860, RenderNodeStatics.anIntArray9724!![i_19_], 0)
                        if (VorbisOggDecoderStatics.aByteArrayArray8996!![i_19_] == null) {
                            bool = false
                            LocDefinitionCacheStatics.anInt3441++
                        }
                    }
                    if (ImageFrameCacheStatics.anIntArray4031 != null && StringCacheNodeStatics.aByteArrayArray7212!![i_19_] == null && ImageFrameCacheStatics.anIntArray4031!![i_19_] != -1) {
                        StringCacheNodeStatics.aByteArrayArray7212!![i_19_] = (GlShadowRenderPassStatics.aJs5Archive_7382!!.method393(ImageFrameCacheStatics.anIntArray4031!![i_19_], 0, i + 2, BrightnessOptionStateStatics.anIntArrayArray5894!![i_19_]))
                        if (StringCacheNodeStatics.aByteArrayArray7212!![i_19_] == null) {
                            bool = false
                            LocDefinitionCacheStatics.anInt3441++
                        }
                    }
                    i_19_++
                }
                if (OpenGlRenderNodeStatics.aSmoothingBuffer_10488 == null) {
                    if (NamedIdEntryStatics.aClass348_Sub42_Sub14_6885 != null && (TerrainShadowBuilderGl2Statics.aJs5Archive_6950!!.method400(-18308, (NamedIdEntryStatics.aClass348_Sub42_Sub14_6885!!.aString9625) + "_staticelements"))) {
                        if (TerrainShadowBuilderGl2Statics.aJs5Archive_6950!!.method413(100, (NamedIdEntryStatics.aClass348_Sub42_Sub14_6885!!.aString9625) + "_staticelements")) OpenGlRenderNodeStatics.aSmoothingBuffer_10488 = SkeletonSequenceLoader.method2300(TerrainShadowBuilderGl2Statics.aJs5Archive_6950, ((NamedIdEntryStatics.aClass348_Sub42_Sub14_6885!!.aString9625) + "_staticelements"), ModelBatchBaseStatics.aBoolean1900, (-91).toByte())
                        else {
                            bool = false
                            LocDefinitionCacheStatics.anInt3441++
                        }
                    } else OpenGlRenderNodeStatics.aSmoothingBuffer_10488 = SmoothingBuffer(0)
                }
                if (bool) {
                    bool = true
                    CompositeNpcModelBuilderStatics.anInt2101 = 0
                    for (i_20_ in DragDropControllerStatics.aByteArrayArray4281!!.indices) {
                        var `is` = GlRectangleTextureStatics.aByteArrayArray8642!![i_20_]
                        if (`is` != null) {
                            var i_21_ = 64 * (NullOggStreamStatics.anIntArray9042!![i_20_] shr 8) - ArbVertexProgramStatics.regionTileX
                            var i_22_ = 64 * (NullOggStreamStatics.anIntArray9042!![i_20_] and 0xff) - RegionMapDecoder.regionTileY
                            if (WidgetRedrawTrackerStatics.anInt3931 != 0) {
                                i_22_ = 10
                                i_21_ = 10
                            }
                            bool = bool and RegionSceneShifterStatics.method3154(GlCubemapLightPassStatics.anInt7319, i_21_, (RangeThresholdTextureNodeStatics.anInt9109), i_22_, `is`, 39.toByte())
                        }
                        `is` = VorbisOggDecoderStatics.aByteArrayArray8996!![i_20_]
                        if (`is` != null) {
                            var i_23_ = 64 * (NullOggStreamStatics.anIntArray9042!![i_20_] shr 8) - ArbVertexProgramStatics.regionTileX
                            var i_24_ = 64 * (NullOggStreamStatics.anIntArray9042!![i_20_] and 0xff) + -RegionMapDecoder.regionTileY
                            if (WidgetRedrawTrackerStatics.anInt3931 != 0) {
                                i_24_ = 10
                                i_23_ = 10
                            }
                            bool = bool and RegionSceneShifterStatics.method3154(GlCubemapLightPassStatics.anInt7319, i_23_, (RangeThresholdTextureNodeStatics.anInt9109), i_24_, `is`, 39.toByte())
                        }
                    }
                    if (bool) {
                        if (AnimationFrameTable.anInt489 != 0) Tooltip.method3511(true, GameAppletFrameStatics.aFont_20, ParticleEmitterFactoryStatics.aFontDefinition_3179, ((LocalizedTextStatics.aLocalizedText_3495!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544)) + "<br>(100%)"), 2, FacingDirectionNodeStatics.aRenderer6654)
                        method3570(false)
                        InterfaceBoundsStatics.method2938(102.toByte())
                        method1772(i xor 0x41)
                        var bool_25_ = false
                        if (FacingDirectionNodeStatics.aRenderer6654!!.method3639() && IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub18_7259!!.method1800(-32350) == 2) {
                            var i_26_ = 0
                            while ((i_26_ < DragDropControllerStatics.aByteArrayArray4281!!.size)) {
                                if ((VorbisOggDecoderStatics.aByteArrayArray8996!![i_26_] != null) || ModelFacePriorityNodeStatics.aByteArrayArray1887!![i_26_] != null) {
                                    bool_25_ = true
                                    break
                                }
                                i_26_++
                            }
                        }
                        var i_27_: Int
                        if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub16_7247!!.method1789(-32350) != 1) i_27_ = NativeLibraryState.anIntArray168!![MenuActionNodeStatics.anInt6769]
                        else i_27_ = (CubeMapMaterialPassStatics.anIntArray6296!![MenuActionNodeStatics.anInt6769])
                        if (FacingDirectionNodeStatics.aRenderer6654!!.method3670()) i_27_++
                        RenderbufferObjectStatics.method3171(FacingDirectionNodeStatics.aRenderer6654, ShadowQualityOptionStateStatics.anInt6012, 9, 4, GlCubemapLightPassStatics.anInt7319, RangeThresholdTextureNodeStatics.anInt9109, i_27_, bool_25_, FacingDirectionNodeStatics.aRenderer6654!!.method3704() > 0)
                        TerrainShadowBuilderGl2Statics.method3018(SequencedActorEntityStatics.anInt10096)
                        if (SequencedActorEntityStatics.anInt10096 != 0) ModelResourceBundleStatics.method3328(WorldMapRendererStatics.aFont_4684)
                        else ModelResourceBundleStatics.method3328(null)
                        for (i_28_ in 0..3) TimedRecordAccessorStatics.aCollisionMapArray7108s!![i_28_]!!.method3500(i xor 0x2bc)
                        RsaVarbitHandlerStatics.method491((-86).toByte())
                        FloatCameraTransformStatics.method921(99.toByte(), false)
                        method3936(i + i)
                        KeyboardLayoutCacheStatics.aParticleSystemRenderer_3304 = null
                        OggCacheStreamStatics.aBoolean5265 = false
                        method3570(false)
                        System.gc()
                        RegionSceneLoader.method2193(true, (-128).toByte())
                        AnimationFrameTable.method354(2)
                        CutsceneSequenceDataStatics.anInt3720 = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1748(-32350)
                        HuffmanCodecStatics.aBoolean3767 = TextureDefinitionCacheStatics.anInt2964 >= 96
                        WorldMapLabelStatics.aBoolean4972 = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub18_7259!!.method1800(-32350) == 2
                        TextureGeneratorStatics.aBoolean2492 = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub28_7230!!.method1845(i + -32350) == 1
                        ChatMessageStreamStatics.anInt101 = if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) == 1) -1 else ParticleSystemStateStatics.anInt2204
                        IOException_Sub1Statics.aBoolean86 = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub9_7256!!.method1759(-32350) == 1
                        NanoTimerStatics.aBoolean845 = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub24_7235!!.method1820(i xor 0x7e5d.inv()) == 1
                        MapTileShapeStatics.aClass237_Sub1_4197 = WorldMapSceneSoftware(4, GlCubemapLightPassStatics.anInt7319, RangeThresholdTextureNodeStatics.anInt9109, false)
                        if (WidgetRedrawTrackerStatics.anInt3931 != 0) MapSceneRenderer.method385(false, MapTileShapeStatics.aClass237_Sub1_4197, DragDropControllerStatics.aByteArrayArray4281)
                        else TerrainTileShapeStatics.method2727((-65).toByte(), MapTileShapeStatics.aClass237_Sub1_4197, (DragDropControllerStatics.aByteArrayArray4281))
                        GroundItemRenderState.method1015(GlCubemapLightPassStatics.anInt7319 shr 4, (RangeThresholdTextureNodeStatics.anInt9109 shr 4), true)
                        LoadingScreenImageNodeStatics.method3175((-77).toByte())
                        if (bool_25_) {
                            DoublyLinkedNodeListStatics.method1879(true)
                            VarpStoreStatics.aClass237_Sub1_5067 = WorldMapSceneSoftware(1, GlCubemapLightPassStatics.anInt7319, RangeThresholdTextureNodeStatics.anInt9109, true)
                            if (WidgetRedrawTrackerStatics.anInt3931 == 0) {
                                TerrainTileShapeStatics.method2727((-44).toByte(), (VarpStoreStatics.aClass237_Sub1_5067), (ModelFacePriorityNodeStatics.aByteArrayArray1887))
                                RegionSceneLoader.method2193(true, (-119).toByte())
                            } else {
                                MapSceneRenderer.method385(false, VarpStoreStatics.aClass237_Sub1_5067, ModelFacePriorityNodeStatics.aByteArrayArray1887)
                                RegionSceneLoader.method2193(true, (-125).toByte())
                            }
                            VarpStoreStatics.aClass237_Sub1_5067!!.method1679(0, 0, (MapTileShapeStatics.aClass237_Sub1_4197!!.anIntArrayArrayArray3122[0]!!))
                            VarpStoreStatics.aClass237_Sub1_5067!!.method1685(FacingDirectionNodeStatics.aRenderer6654, null, 21407, null)
                            DoublyLinkedNodeListStatics.method1879(false)
                        }
                        MapTileShapeStatics.aClass237_Sub1_4197!!.method1685(FacingDirectionNodeStatics.aRenderer6654, (if (!bool_25_) null else (VarpStoreStatics.aClass237_Sub1_5067!!.anIntArrayArrayArray3122)), 21407, TimedRecordAccessorStatics.aCollisionMapArray7108s)
                        if (WidgetRedrawTrackerStatics.anInt3931 == 0) {
                            RegionSceneLoader.method2193(true, (-128).toByte())
                            ObjectSpawnDecoder.method1090(GlRectangleTextureStatics.aByteArrayArray8642, i + 65536, MapTileShapeStatics.aClass237_Sub1_4197)
                            if (StringCacheNodeStatics.aByteArrayArray7212 != null) NpcSpawnDecoder.method859(i xor 0x7e.inv())
                        } else {
                            RegionSceneLoader.method2193(true, (-121).toByte())
                            ProjectionCameraTransformStatics.method944(i + -8212, GlRectangleTextureStatics.aByteArrayArray8642, MapTileShapeStatics.aClass237_Sub1_4197)
                        }
                        InterfaceBoundsStatics.method2938(66.toByte())
                        if (TextureDefinitionCacheStatics.anInt2964 < 96) method2271(31268)
                        RegionSceneLoader.method2193(true, (-119).toByte())
                        MapTileShapeStatics.aClass237_Sub1_4197!!.method1680(null, (-125).toByte(), (if (!bool_25_) null else (SoundCacheState.aTerrainTileArray4142!![0])), FacingDirectionNodeStatics.aRenderer6654)
                        MapTileShapeStatics.aClass237_Sub1_4197!!.method1697(false, FacingDirectionNodeStatics.aRenderer6654, -36)
                        RegionSceneLoader.method2193(true, (-122).toByte())
                        if (bool_25_) {
                            DoublyLinkedNodeListStatics.method1879(true)
                            RegionSceneLoader.method2193(true, (-124).toByte())
                            if (WidgetRedrawTrackerStatics.anInt3931 != 0) ProjectionCameraTransformStatics.method944(-8212, (VorbisOggDecoderStatics.aByteArrayArray8996), VarpStoreStatics.aClass237_Sub1_5067)
                            else ObjectSpawnDecoder.method1090((VorbisOggDecoderStatics.aByteArrayArray8996), i + 65536, VarpStoreStatics.aClass237_Sub1_5067)
                            InterfaceBoundsStatics.method2938(73.toByte())
                            RegionSceneLoader.method2193(true, (-121).toByte())
                            VarpStoreStatics.aClass237_Sub1_5067!!.method1680((TerrainTileShapeStatics.aTerrainTileArray8801!![0]), (-127).toByte(), null, (FacingDirectionNodeStatics.aRenderer6654))
                            VarpStoreStatics.aClass237_Sub1_5067!!.method1697(true, FacingDirectionNodeStatics.aRenderer6654, i + -60)
                            RegionSceneLoader.method2193(true, (-126).toByte())
                            DoublyLinkedNodeListStatics.method1879(false)
                        }
                        StringCacheNodeStatics.method3419(13022)
                        var i_29_ = MapTileShapeStatics.aClass237_Sub1_4197!!.anInt5824
                        if (i_29_ > CompiledScriptCacheStatics.anInt4372) i_29_ = CompiledScriptCacheStatics.anInt4372
                        if (i_29_ < -1 + CompiledScriptCacheStatics.anInt4372) i_29_ = CompiledScriptCacheStatics.anInt4372 - 1
                        if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) == 0) MapSceneCacheStatics.method824(i_29_)
                        else MapSceneCacheStatics.method824(0)
                        for (i_30_ in 0..3) {
                            var i_31_ = 0
                            while (GlCubemapLightPassStatics.anInt7319 > i_31_) {
                                var i_32_ = 0
                                while (RangeThresholdTextureNodeStatics.anInt9109 > i_32_) {
                                    ProjectileSpawner.method1479(i_32_, (-126).toByte(), i_31_, i_30_)
                                    i_32_++
                                }
                                i_31_++
                            }
                        }
                        EdgeDetectTextureNodeStatics.method3072((-99).toByte())
                        method3570(false)
                        MapElementManager.method3514((-105).toByte())
                        InterfaceBoundsStatics.method2938(62.toByte())
                        FrameStatsResetStatics.method1131(99)
                        if (RsaVarbitHandlerStatics.aFrame4904 != null && PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 != null && WorldMapRendererStatics.anInt4674 == 11) {
                            RenderableEntryStatics.anInt4335++
                            val class348_sub47 = method2148(FileIoUtil.aFontMetaRef_4094, (TheoraVideoStreamStatics.aIsaacCipher_9029), i xor 0x55.inv())
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(108.toByte(), 1057001181)
                            InterfaceComponentGroupStatics.method3243(-122, class348_sub47)
                        }
                        if (WidgetRedrawTrackerStatics.anInt3931 == 0) {
                            val i_33_ = ((RendererStatics.anInt4581 + -(GlCubemapLightPassStatics.anInt7319 shr 4)) / 8)
                            val i_34_ = ((RendererStatics.anInt4581 - -(GlCubemapLightPassStatics.anInt7319 shr 4)) / 8)
                            val i_35_ = ((FileIoUtil.anInt4095 + -(RangeThresholdTextureNodeStatics.anInt9109 shr 4)) / 8)
                            val i_36_ = (((RangeThresholdTextureNodeStatics.anInt9109 shr 4) + FileIoUtil.anInt4095) / 8)
                            for (i_37_ in i_33_ - 1..i_34_ - -1) {
                                for (i_38_ in i_35_ + -1..i_36_ - -1) {
                                    if (i_33_ > i_37_ || i_34_ < i_37_ || i_38_ < i_35_ || i_38_ > i_36_) {
                                        GlShadowRenderPassStatics.aJs5Archive_7382!!.method409("m" + i_37_ + "_" + i_38_, true)
                                        GlShadowRenderPassStatics.aJs5Archive_7382!!.method409("l" + i_37_ + "_" + i_38_, true)
                                    }
                                }
                            }
                        }
                        if (WorldMapRendererStatics.anInt4674 != 4) {
                            if (WorldMapRendererStatics.anInt4674 != 8) {
                                ByteBufferStatics.method3379(2, 10)
                                if (PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 != null) {
                                    val class348_sub47 = method2148((RsaPacketDecoderStatics.aFontMetaRef_4223), (TheoraVideoStreamStatics.aIsaacCipher_9029), -106)
                                    InterfaceComponentGroupStatics.method3243(127, class348_sub47)
                                }
                            } else ByteBufferStatics.method3379(2, 7)
                        } else ByteBufferStatics.method3379(i xor 0x2, 3)
                        method2718(-106)
                        method3570(false)
                        AnimationFrameState.method867(true)
                        PcmStreamBufferStatics.aBoolean8870 = true
                        if (GlTexture1DStatics.aBoolean8558) {
                            method94(("Took: " + (GameClock.method599(-117) + -RegionMapDecoder.aLong1516) + "ms"), i + 52)
                            GlTexture1DStatics.aBoolean8558 = false
                        }
                    } else AnimationFrameTable.anInt489 = 2
                } else AnimationFrameTable.anInt489 = 1
            }
    
            init {
                anIntArray60 = IntArray(8)
            }
}
