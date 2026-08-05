import GameAppletFrame.Companion.method94
import BloomGraphicsOptionState.Companion.method1772
import CameraDistanceOptionState.Companion.method1725
import WaterMaterialPass.Companion.method2148
import CubemapTextureImplSource.Companion.method2271
import WorldMapAreaLabel.Companion.method3570
import NativeRenderer.Companion.method3936
import java.awt.Canvas
import java.awt.Component
import java.awt.Graphics

/*
 * Canvas_Sub1
 */
class DelegatingRenderCanvas internal constructor(private val aComponent64: Component) : Canvas() {
    override fun update(graphics: Graphics?) {
        anInt61++
        aComponent64.update(graphics)
    }

    override fun paint(graphics: Graphics?) {
        aComponent64.paint(graphics)
        anInt65++
    }

    companion object {

        var anIntArray60: IntArray?

        var anInt61: Int = 0

        var anInt62: Int = 0

        var anInt63: Int = 0

        var anInt65: Int = 0

        var anInt66: Int = 0

        var anInt67: Int = 0

        var anInt69: Int = 0

        var anInt70: Int = 0

        @JvmStatic
        fun method119(i: Int, l: Long) {
            try {
                anInt66++
                val i_0_ = (ConnectionStateRefs.anInt319 + LocalPlayerState.aPlayer_1907!!.x)
                val i_1_ = (WalkingTypeUtil.anInt3310 + LocalPlayerState.aPlayer_1907!!.y)
                if (-i_0_ + FrameStatsReset.anInt5799 < -2000 || -i_0_ + FrameStatsReset.anInt5799 > 2000 || AsyncTaskHandle.anInt2578 - i_1_ < -2000 || -i_1_ + AsyncTaskHandle.anInt2578 > 2000) {
                    AsyncTaskHandle.anInt2578 = i_1_
                    FrameStatsReset.anInt5799 = i_0_
                }
                if (FrameStatsReset.anInt5799 != i_0_) {
                    val i_2_ = i_0_ - FrameStatsReset.anInt5799
                    var i_3_ = (i_2_.toLong() * l / 320L).toInt()
                    if (i_2_ <= 0) {
                        if (i_3_ == 0) i_3_ = -1
                        else if (i_3_ < i_2_) i_3_ = i_2_
                    } else if (i_3_ == 0) i_3_ = 1
                    else if (i_3_ > i_2_) i_3_ = i_2_
                    FrameStatsReset.anInt5799 += i_3_
                }
                if (i == -1) {
                    CameraDistanceOptionState.aFloat3938 += CircleDrawer.aFloat2687 * l.toFloat() / 6.0f
                    if (i_1_ != AsyncTaskHandle.anInt2578) {
                        val i_4_ = i_1_ - AsyncTaskHandle.anInt2578
                        var i_5_ = (i_4_.toLong() * l / 320L).toInt()
                        if (i_4_ > 0) {
                            if (i_5_ != 0) {
                                if (i_5_ > i_4_) i_5_ = i_4_
                            } else i_5_ = 1
                        } else if (i_5_ != 0) {
                            if (i_5_ < i_4_) i_5_ = i_4_
                        } else i_5_ = -1
                        AsyncTaskHandle.anInt2578 += i_5_
                    }
                    SceneObjectSpawner.aFloat1287 += MultiFieldRecord.aFloat6898 * l.toFloat() / 6.0f
                    method1725(262144)
                }
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, "vg.A(" + i + ',' + l + ')')
            }
        }

        @JvmStatic
        fun method120(bool: Boolean) {
            anIntArray60 = null
            if (bool != false) anIntArray60 = null
        }

        var anInt68: Int = 0
        fun method121(i: Int, i_6_: Int, bool: Boolean, i_7_: Int, i_8_: Int, i_9_: Int) {
            if (i_6_ != -364570972) anInt70 = -4
            anInt68++
            val l = (i or (if (!bool) 0 else -2147483648)).toLong()
            var class348_sub13 = (Client.aHashtable_7041!!.method3480(l, -6008) as ModelKeyBuilder?)
            if (class348_sub13 == null) {
                class348_sub13 = ModelKeyBuilder()
                Client.aHashtable_7041!!.method3483(109.toByte(), l, class348_sub13)
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
                val class124 = ParticleConfigParser.method2277(0, RasterSprite.aJs5Archive_5207!!, i_16_, -1)
                if (class124 == null) return null
                if (class124.anInt1830 < 13) class124.method1092(2, 105)
                abstractModel = var_renderer.method3625(class124, i_18_, RefCountedHandle.anInt2275, 64, 768)
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
            LocDefinitionCache.anInt3441 = 0
            var bool = true
            var i_19_ = 0
            while (DragDropController.aByteArrayArray4281!!.size > i_19_) {
                if (NativeSprite.anIntArray5192!![i_19_] != -1 && DragDropController.aByteArrayArray4281!![i_19_] == null) {
                    DragDropController.aByteArrayArray4281!![i_19_] = AbstractCameraTransformStatics.aJs5Archive_7382!!.method410(-1860, NativeSprite.anIntArray5192!![i_19_], 0)
                    if (DragDropController.aByteArrayArray4281!![i_19_] == null) {
                        bool = false
                        LocDefinitionCache.anInt3441++
                    }
                }
                if (GameAppletFrame.anIntArray38!![i_19_] != -1 && GlRectangleTexture.aByteArrayArray8642!![i_19_] == null) {
                    GlRectangleTexture.aByteArrayArray8642!![i_19_] = (AbstractCameraTransformStatics.aJs5Archive_7382!!.method393(GameAppletFrame.anIntArray38!![i_19_], 0, i + 2, BrightnessOptionState.anIntArrayArray5894!![i_19_]))
                    if (GlRectangleTexture.aByteArrayArray8642!![i_19_] == null) {
                        LocDefinitionCache.anInt3441++
                        bool = false
                    }
                }
                if (LocalizedTextTriple.anIntArray3759!![i_19_] != -1 && RegionMapDecoder.aByteArrayArray1887!![i_19_] == null) {
                    RegionMapDecoder.aByteArrayArray1887!![i_19_] = AbstractCameraTransformStatics.aJs5Archive_7382!!.method410(-1860, LocalizedTextTriple.anIntArray3759!![i_19_], 0)
                    if (RegionMapDecoder.aByteArrayArray1887!![i_19_] == null) {
                        LocDefinitionCache.anInt3441++
                        bool = false
                    }
                }
                if (RenderNodeStatics.anIntArray9724!![i_19_] != -1 && VorbisOggDecoder.aByteArrayArray8996!![i_19_] == null) {
                    VorbisOggDecoder.aByteArrayArray8996!![i_19_] = AbstractCameraTransformStatics.aJs5Archive_7382!!.method410(-1860, RenderNodeStatics.anIntArray9724!![i_19_], 0)
                    if (VorbisOggDecoder.aByteArrayArray8996!![i_19_] == null) {
                        bool = false
                        LocDefinitionCache.anInt3441++
                    }
                }
                if (AbstractCameraTransformStatics.anIntArray4031 != null && StringCacheNode.aByteArrayArray7212!![i_19_] == null && AbstractCameraTransformStatics.anIntArray4031!![i_19_] != -1) {
                    StringCacheNode.aByteArrayArray7212!![i_19_] = (AbstractCameraTransformStatics.aJs5Archive_7382!!.method393(AbstractCameraTransformStatics.anIntArray4031!![i_19_], 0, i + 2, BrightnessOptionState.anIntArrayArray5894!![i_19_]))
                    if (StringCacheNode.aByteArrayArray7212!![i_19_] == null) {
                        bool = false
                        LocDefinitionCache.anInt3441++
                    }
                }
                i_19_++
            }
            if (OpenGlRenderNode.aSmoothingBuffer_10488 == null) {
                if (NamedIdEntry.aClass348_Sub42_Sub14_6885 != null && (TerrainShadowBuilderGl2.aJs5Archive_6950!!.method400(-18308, (NamedIdEntry.aClass348_Sub42_Sub14_6885!!.aString9625) + "_staticelements"))) {
                    if (TerrainShadowBuilderGl2.aJs5Archive_6950!!.method413(100, (NamedIdEntry.aClass348_Sub42_Sub14_6885!!.aString9625) + "_staticelements")) OpenGlRenderNode.aSmoothingBuffer_10488 = SkeletonSequenceLoader.method2300(TerrainShadowBuilderGl2.aJs5Archive_6950, ((NamedIdEntry.aClass348_Sub42_Sub14_6885!!.aString9625) + "_staticelements"), ModelBatchBaseStatics.aBoolean1900, (-91).toByte())
                    else {
                        bool = false
                        LocDefinitionCache.anInt3441++
                    }
                } else OpenGlRenderNode.aSmoothingBuffer_10488 = SmoothingBuffer(0)
            }
            if (bool) {
                bool = true
                CompositeNpcModelBuilder.anInt2101 = 0
                for (i_20_ in DragDropController.aByteArrayArray4281!!.indices) {
                    var `is` = GlRectangleTexture.aByteArrayArray8642!![i_20_]
                    if (`is` != null) {
                        var i_21_ = 64 * (NullOggStream.anIntArray9042!![i_20_] shr 8) - ArbVertexProgram.regionTileX
                        var i_22_ = 64 * (NullOggStream.anIntArray9042!![i_20_] and 0xff) - RegionMapDecoder.regionTileY
                        if (WidgetRedrawTracker.anInt3931 != 0) {
                            i_22_ = 10
                            i_21_ = 10
                        }
                        bool = bool and RegionSceneShifterStatics.method3154(GlCubemapLightPass.anInt7319, i_21_, (RangeThresholdTextureNode.anInt9109), i_22_, `is`, 39.toByte())
                    }
                    `is` = VorbisOggDecoder.aByteArrayArray8996!![i_20_]
                    if (`is` != null) {
                        var i_23_ = 64 * (NullOggStream.anIntArray9042!![i_20_] shr 8) - ArbVertexProgram.regionTileX
                        var i_24_ = 64 * (NullOggStream.anIntArray9042!![i_20_] and 0xff) + -RegionMapDecoder.regionTileY
                        if (WidgetRedrawTracker.anInt3931 != 0) {
                            i_24_ = 10
                            i_23_ = 10
                        }
                        bool = bool and RegionSceneShifterStatics.method3154(GlCubemapLightPass.anInt7319, i_23_, (RangeThresholdTextureNode.anInt9109), i_24_, `is`, 39.toByte())
                    }
                }
                if (bool) {
                    if (AnimationFrameTable.anInt489 != 0) Tooltip.method3511(true, GameAppletFrame.aRSFont_20, ParticleEmitterFactoryStatics.aFontDefinition_3179, ((LocalizedText.aLocalizedText_3495!!.method2063(ChatCommandProcessor.anInt6967, 544)) + "<br>(100%)"), 2, FacingDirectionNodeStatics.aRenderer6654)
                    method3570(false)
                    InterfaceBounds.method2938(102.toByte())
                    method1772(i xor 0x41)
                    var bool_25_ = false
                    if (FacingDirectionNodeStatics.aRenderer6654!!.method3639() && IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub18_7259!!.method1800(-32350) == 2) {
                        var i_26_ = 0
                        while ((i_26_ < DragDropController.aByteArrayArray4281!!.size)) {
                            if ((VorbisOggDecoder.aByteArrayArray8996!![i_26_] != null) || RegionMapDecoder.aByteArrayArray1887!![i_26_] != null) {
                                bool_25_ = true
                                break
                            }
                            i_26_++
                        }
                    }
                    var i_27_: Int
                    if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub16_7247!!.method1789(-32350) != 1) i_27_ = NativeLibraryState.anIntArray168!![MenuActionNode.anInt6769]
                    else i_27_ = (CubeMapMaterialPass.anIntArray6296!![MenuActionNode.anInt6769])
                    if (FacingDirectionNodeStatics.aRenderer6654!!.method3670()) i_27_++
                    RenderbufferObject.method3171(FacingDirectionNodeStatics.aRenderer6654, ShadowQualityOptionState.anInt6012, 9, 4, GlCubemapLightPass.anInt7319, RangeThresholdTextureNode.anInt9109, i_27_, bool_25_, FacingDirectionNodeStatics.aRenderer6654!!.method3704() > 0)
                    TerrainShadowBuilderGl2.method3018(SequencedActorEntity.anInt10096)
                    if (SequencedActorEntity.anInt10096 != 0) ModelResourceBundle.method3328(WorldMapRenderer.aRSFont_4684)
                    else ModelResourceBundle.method3328(null)
                    for (i_28_ in 0..3) TimedRecordAccessor.aCollisionMapArray7108s!![i_28_]!!.method3500(i xor 0x2bc)
                    RsaVarbitHandler.method491((-86).toByte())
                    FloatCameraTransform.method921(99.toByte(), false)
                    method3936(i + i)
                    KeyboardLayoutCache.aParticleSystemRenderer_3304 = null
                    OggCacheStream.aBoolean5265 = false
                    method3570(false)
                    System.gc()
                    RegionSceneLoader.method2193(true, (-128).toByte())
                    AnimationFrameTable.method354(2)
                    anInt3720 = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1748(-32350)
                    HuffmanCodec.aBoolean3767 = TextureDefinitionCache.anInt2964 >= 96
                    WorldMapLabel.aBoolean4972 = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub18_7259!!.method1800(-32350) == 2
                    TextureGenerator.aBoolean2492 = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub28_7230!!.method1845(i + -32350) == 1
                    ChatMessageStream.anInt101 = if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) == 1) -1 else ParticleSystemState.anInt2204
                    IOException_Sub1.aBoolean86 = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub9_7256!!.method1759(-32350) == 1
                    NanoTimerStatics.aBoolean845 = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub24_7235!!.method1820(i xor 0x7e5d.inv()) == 1
                    MapTileShape.aClass237_Sub1_4197 = WorldMapSceneSoftware(4, GlCubemapLightPass.anInt7319, RangeThresholdTextureNode.anInt9109, false)
                    if (WidgetRedrawTracker.anInt3931 != 0) MapSceneRenderer.method385(false, MapTileShape.aClass237_Sub1_4197, DragDropController.aByteArrayArray4281)
                    else TerrainTileShape.method2727((-65).toByte(), MapTileShape.aClass237_Sub1_4197, (DragDropController.aByteArrayArray4281))
                    GroundItemRenderState.method1015(GlCubemapLightPass.anInt7319 shr 4, (RangeThresholdTextureNode.anInt9109 shr 4), true)
                    Client.method3175((-77).toByte())
                    if (bool_25_) {
                        DoublyLinkedNodeList.method1879(true)
                        VarpStore.aClass237_Sub1_5067 = WorldMapSceneSoftware(1, GlCubemapLightPass.anInt7319, RangeThresholdTextureNode.anInt9109, true)
                        if (WidgetRedrawTracker.anInt3931 == 0) {
                            TerrainTileShape.method2727((-44).toByte(), (VarpStore.aClass237_Sub1_5067), (RegionMapDecoder.aByteArrayArray1887))
                            RegionSceneLoader.method2193(true, (-119).toByte())
                        } else {
                            MapSceneRenderer.method385(false, VarpStore.aClass237_Sub1_5067, RegionMapDecoder.aByteArrayArray1887)
                            RegionSceneLoader.method2193(true, (-125).toByte())
                        }
                        VarpStore.aClass237_Sub1_5067!!.method1679(0, 0, (MapTileShape.aClass237_Sub1_4197!!.anIntArrayArrayArray3122[0]!!))
                        VarpStore.aClass237_Sub1_5067!!.method1685(FacingDirectionNodeStatics.aRenderer6654, null, 21407, null)
                        DoublyLinkedNodeList.method1879(false)
                    }
                    MapTileShape.aClass237_Sub1_4197!!.method1685(FacingDirectionNodeStatics.aRenderer6654, (if (!bool_25_) null else (VarpStore.aClass237_Sub1_5067!!.anIntArrayArrayArray3122)), 21407, TimedRecordAccessor.aCollisionMapArray7108s)
                    if (WidgetRedrawTracker.anInt3931 == 0) {
                        RegionSceneLoader.method2193(true, (-128).toByte())
                        ObjectSpawnDecoder.method1090(GlRectangleTexture.aByteArrayArray8642, i + 65536, MapTileShape.aClass237_Sub1_4197)
                        if (StringCacheNode.aByteArrayArray7212 != null) NpcSpawnDecoder.method859(i xor 0x7e.inv())
                    } else {
                        RegionSceneLoader.method2193(true, (-121).toByte())
                        ProjectionCameraTransform.method944(i + -8212, GlRectangleTexture.aByteArrayArray8642, MapTileShape.aClass237_Sub1_4197)
                    }
                    InterfaceBounds.method2938(66.toByte())
                    if (TextureDefinitionCache.anInt2964 < 96) method2271(31268)
                    RegionSceneLoader.method2193(true, (-119).toByte())
                    MapTileShape.aClass237_Sub1_4197!!.method1680(null, (-125).toByte(), (if (!bool_25_) null else (ActorEntity.aTerrainTileArray4142!![0])), FacingDirectionNodeStatics.aRenderer6654)
                    MapTileShape.aClass237_Sub1_4197!!.method1697(false, FacingDirectionNodeStatics.aRenderer6654, -36)
                    RegionSceneLoader.method2193(true, (-122).toByte())
                    if (bool_25_) {
                        DoublyLinkedNodeList.method1879(true)
                        RegionSceneLoader.method2193(true, (-124).toByte())
                        if (WidgetRedrawTracker.anInt3931 != 0) ProjectionCameraTransform.method944(-8212, (VorbisOggDecoder.aByteArrayArray8996), VarpStore.aClass237_Sub1_5067)
                        else ObjectSpawnDecoder.method1090((VorbisOggDecoder.aByteArrayArray8996), i + 65536, VarpStore.aClass237_Sub1_5067)
                        InterfaceBounds.method2938(73.toByte())
                        RegionSceneLoader.method2193(true, (-121).toByte())
                        VarpStore.aClass237_Sub1_5067!!.method1680((TerrainTileShape.aTerrainTileArray8801!![0]), (-127).toByte(), null, (FacingDirectionNodeStatics.aRenderer6654))
                        VarpStore.aClass237_Sub1_5067!!.method1697(true, FacingDirectionNodeStatics.aRenderer6654, i + -60)
                        RegionSceneLoader.method2193(true, (-126).toByte())
                        DoublyLinkedNodeList.method1879(false)
                    }
                    StringCacheNode.method3419(13022)
                    var i_29_ = MapTileShape.aClass237_Sub1_4197!!.anInt5824
                    if (i_29_ > CompiledScriptCache.anInt4372) i_29_ = CompiledScriptCache.anInt4372
                    if (i_29_ < -1 + CompiledScriptCache.anInt4372) i_29_ = CompiledScriptCache.anInt4372 - 1
                    if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) == 0) MapSceneCache.method824(i_29_)
                    else MapSceneCache.method824(0)
                    for (i_30_ in 0..3) {
                        var i_31_ = 0
                        while (GlCubemapLightPass.anInt7319 > i_31_) {
                            var i_32_ = 0
                            while (RangeThresholdTextureNode.anInt9109 > i_32_) {
                                ProjectileSpawner.method1479(i_32_, (-126).toByte(), i_31_, i_30_)
                                i_32_++
                            }
                            i_31_++
                        }
                    }
                    EdgeDetectTextureNode.method3072((-99).toByte())
                    method3570(false)
                    MapElementManager.method3514((-105).toByte())
                    InterfaceBounds.method2938(62.toByte())
                    FrameStatsReset.method1131(99)
                    if (RsaVarbitHandler.aFrame4904 != null && Client.aAbstractGameSocket_9165 != null && WorldMapRenderer.anInt4674 == 11) {
                        RenderableEntry.anInt4335++
                        val class348_sub47 = method2148(FileIoUtil.aFontMetaRef_4094, (TheoraVideoStream.aIsaacCipher_9029), i xor 0x55.inv())
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(108.toByte(), 1057001181)
                        InterfaceComponentGroup.method3243(-122, class348_sub47)
                    }
                    if (WidgetRedrawTracker.anInt3931 == 0) {
                        val i_33_ = ((Renderer.anInt4581 + -(GlCubemapLightPass.anInt7319 shr 4)) / 8)
                        val i_34_ = ((Renderer.anInt4581 - -(GlCubemapLightPass.anInt7319 shr 4)) / 8)
                        val i_35_ = ((FileIoUtil.anInt4095 + -(RangeThresholdTextureNode.anInt9109 shr 4)) / 8)
                        val i_36_ = (((RangeThresholdTextureNode.anInt9109 shr 4) + FileIoUtil.anInt4095) / 8)
                        for (i_37_ in i_33_ - 1..i_34_ - -1) {
                            for (i_38_ in i_35_ + -1..i_36_ - -1) {
                                if (i_33_ > i_37_ || i_34_ < i_37_ || i_38_ < i_35_ || i_38_ > i_36_) {
                                    AbstractCameraTransformStatics.aJs5Archive_7382!!.method409("m" + i_37_ + "_" + i_38_, true)
                                    AbstractCameraTransformStatics.aJs5Archive_7382!!.method409("l" + i_37_ + "_" + i_38_, true)
                                }
                            }
                        }
                    }
                    if (WorldMapRenderer.anInt4674 != 4) {
                        if (WorldMapRenderer.anInt4674 != 8) {
                            ByteBufferStatics.method3379(2, 10)
                            if (Client.aAbstractGameSocket_9165 != null) {
                                val class348_sub47 = method2148((RsaPacketDecoder.aFontMetaRef_4223), (TheoraVideoStream.aIsaacCipher_9029), -106)
                                InterfaceComponentGroup.method3243(127, class348_sub47)
                            }
                        } else ByteBufferStatics.method3379(2, 7)
                    } else ByteBufferStatics.method3379(i xor 0x2, 3)
                    AbstractTileShapeStatics.method2718(-106)
                    method3570(false)
                    AnimationFrameState.method867(true)
                    PcmStreamBuffer.aBoolean8870 = true
                    if (GlTexture1D.aBoolean8558) {
                        method94(("Took: " + (GameClock.method599(-117) + -RegionMapDecoder.aLong1516) + "ms"), i + 52)
                        GlTexture1D.aBoolean8558 = false
                    }
                } else AnimationFrameTable.anInt489 = 2
            } else AnimationFrameTable.anInt489 = 1
        }
        var anInt3720: Int = 0

        init {
            anIntArray60 = IntArray(8)
        }
    }
}
