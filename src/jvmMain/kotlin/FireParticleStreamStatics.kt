import OpenGlRendererStatics.method3802
import java.io.IOException
import java.io.OutputStream
import java.util.*
import kotlin.math.sin

object FireParticleStreamStatics {
    @JvmField
            var anInt92: Int = 0
            @JvmField
            var aRandom93: Random? = Random()
            @JvmField
            var anInt94: Int = 0
            @JvmField
            var anInt95: Int = 0
            @JvmField
            var anInt96: Int = 0
            @JvmField
            var aClass110_Sub1Array97: Array<MapLabelMenuEntry?>? = null
            @JvmField
            var anInt98: Int = 0
            @JvmField
            var anIntArray99: IntArray?
            @JvmField
            var anIntArray100: IntArray? = intArrayOf(99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120)
    
            @JvmStatic
            fun method132(i: Int, bool: Boolean, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
                var i_0_ = i_0_
                var i_1_ = i_1_
                var i_2_ = i_2_
                var i_3_ = i_3_
                anInt94++
                if (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029 == null) FacingDirectionNodeStatics.aRenderer6654!!.method3675(i_0_, (-125).toByte(), i_1_, i_3_, i_2_, -16777216)
                else if (LocalPlayerState.aPlayer_1907!!.x < 0 || (LocalPlayerState.aPlayer_1907!!.x >= GlCubemapLightPassStatics.anInt7319 * 512) || LocalPlayerState.aPlayer_1907!!.y < 0 || (512 * RangeThresholdTextureNodeStatics.anInt9109 <= LocalPlayerState.aPlayer_1907!!.y)) FacingDirectionNodeStatics.aRenderer6654!!.method3675(i_0_, (-125).toByte(), i_1_, i_3_, i_2_, -16777216)
                else {
                    TextureQualityOptionStateStatics.anInt6006++
                    if (LocalPlayerState.aPlayer_1907 != null && MediaStreamClientStatics.anInt3203 == (LocalPlayerState.aPlayer_1907!!.x + -(256 * LocalPlayerState.aPlayer_1907!!.method2436(90.toByte())) - -256) shr 9 && TerrainChunkBuilderStatics.anInt1548 == (LocalPlayerState.aPlayer_1907!!.y + 256 + -(256 * LocalPlayerState.aPlayer_1907!!.method2436(112.toByte()))) shr 9) {
                        TerrainChunkBuilderStatics.anInt1548 = -1
                        MediaStreamClientStatics.anInt3203 = -1
                        CubemapTextureGlSourceStatics.method2264(false)
                    }
                    AsyncTaskHandleStatics.method1434(-14988)
                    if (!bool) NpcEntityUpdater.method2109(512)
                    GroundItemRenderState.method1014(-4)
                    LoadingScreenImageNodeStatics.method3174(i_1_, i_3_, i_0_, true, (-82).toByte(), i_2_)
                    i_3_ = RandomAccessFileOnDiskStatics.anInt3047
                    i_1_ = LocalizedTextTripleStatics.anInt3764
                    i_2_ = GroundDecorRendererStatics.anInt3643
                    LocalPlayerState.anInt1906 = LocalPlayerState.anInt1911
                    i_0_ = WidgetComponentNodeStatics.anInt4656
                    if (WeaveTextureNodeStatics.anInt9282 == 1) {
                        var i_4_ = SceneObjectSpawnerStatics.aFloat1287.toInt()
                        if (IntKeyNodeStatics.anInt6979 shr 8 > i_4_) i_4_ = IntKeyNodeStatics.anInt6979 shr 8
                        if (SpotAnimDefinitionStatics.aBooleanArray2374!![4] && ModelHeaderCacheStatics.anIntArray3273!![4] + 128 > i_4_) i_4_ = ModelHeaderCacheStatics.anIntArray3273!![4] + 128
                        val i_5_ = ResourceProviderStatics.aFloat3938.toInt() + RenderableGroupStatics.anInt5016 and 0x3fff
                        WidgetDefinitionStatics.method268(i_4_, -200 + (CollisionMapAccessor.method2064((LocalPlayerState.aPlayer_1907!!.x), CompiledScriptCacheStatics.anInt4372, 11219, (LocalPlayerState.aPlayer_1907!!.y))), i_5_, AsyncTaskHandleStatics.anInt2578, i_2_, -19360, FrameStatsResetStatics.anInt5799, (i_4_ shr 3) * 3 + 600 shl 2)
                    } else if (WeaveTextureNodeStatics.anInt9282 == 4) {
                        var i_6_ = SceneObjectSpawnerStatics.aFloat1287.toInt()
                        if (i_6_ < IntKeyNodeStatics.anInt6979 shr 8) i_6_ = IntKeyNodeStatics.anInt6979 shr 8
                        if (SpotAnimDefinitionStatics.aBooleanArray2374!![4] && (i_6_ < ModelHeaderCacheStatics.anIntArray3273!![4] + 128)) i_6_ = 128 + ModelHeaderCacheStatics.anIntArray3273!![4]
                        val i_7_ = ResourceProviderStatics.aFloat3938.toInt() and 0x3fff
                        WidgetDefinitionStatics.method268(i_6_, -200 + CollisionMapAccessor.method2064(HslColorTableNodeStatics.anInt6633, CompiledScriptCacheStatics.anInt4372, 11219, RegionTileNodeStatics.anInt6652), i_7_, AsyncTaskHandleStatics.anInt2578, i_2_, -19360, FrameStatsResetStatics.anInt5799, 600 - -((i_6_ shr 3) * 3) shl 2)
                    } else if (WeaveTextureNodeStatics.anInt9282 == 5) LocDefinitionCacheStatics.method2035(i_2_, 0)
                    val i_8_ = GlslMaterialPassStatics.anInt6246
                    val i_9_ = ParticleSystemRendererStatics.anInt3855
                    val i_10_ = CompositeRgbNoiseTextureStatics.anInt8685
                    val i_11_ = MinimapAreaMarkerNodeStatics.anInt9701
                    val i_12_ = WorldMapElementStatics.anInt4638
                    for (i_13_ in 0..4) {
                        if (SpotAnimDefinitionStatics.aBooleanArray2374!![i_13_]) {
                            val i_14_ = ((Math.random() * ((CollisionMapAccessor.anIntArray3552!![i_13_] * 2) - -1).toDouble()) - CollisionMapAccessor.anIntArray3552!![i_13_].toDouble() + (sin((GroundDecorSceneEntityStatics.anIntArray9981!![i_13_]).toDouble() * ((MapTileShapeStatics.anIntArray4196!![i_13_]).toDouble() / 100.0)) * (ModelHeaderCacheStatics.anIntArray3273!![i_13_]).toDouble())).toInt()
                            if (i_13_ == 4) {
                                MinimapAreaMarkerNodeStatics.anInt9701 += i_14_
                                if (MinimapAreaMarkerNodeStatics.anInt9701 >= 1024) {
                                    if (MinimapAreaMarkerNodeStatics.anInt9701 > 3072) MinimapAreaMarkerNodeStatics.anInt9701 = 3072
                                } else MinimapAreaMarkerNodeStatics.anInt9701 = 1024
                            }
                            if (i_13_ == 0) GlslMaterialPassStatics.anInt6246 += i_14_ shl 2
                            if (i_13_ == 3) WorldMapElementStatics.anInt4638 = 0x3fff and i_14_ + WorldMapElementStatics.anInt4638
                            if (i_13_ == 1) ParticleSystemRendererStatics.anInt3855 += i_14_ shl 2
                            if (i_13_ == 2) CompositeRgbNoiseTextureStatics.anInt8685 += i_14_ shl 2
                        }
                    }
                    if (GlslMaterialPassStatics.anInt6246 < 0) GlslMaterialPassStatics.anInt6246 = 0
                    if (-1 + (SpotAnimEntityStatics.anInt6451 shl 9) < GlslMaterialPassStatics.anInt6246) GlslMaterialPassStatics.anInt6246 = -1 + (SpotAnimEntityStatics.anInt6451 shl 9)
                    if (CompositeRgbNoiseTextureStatics.anInt8685 < 0) CompositeRgbNoiseTextureStatics.anInt8685 = 0
                    if (CompositeRgbNoiseTextureStatics.anInt8685 > (RegionSceneShifterStatics.anInt7054 shl 9) + -1) CompositeRgbNoiseTextureStatics.anInt8685 = (RegionSceneShifterStatics.anInt7054 shl 9) - 1
                    CharCodeMapStatics.method3225(114)
                    LoadingScreenImageNodeStatics.method3175((-107).toByte())
                    FacingDirectionNodeStatics.aRenderer6654!!.KA(i_1_, i_3_, i_1_ - -i_0_, i_3_ + i_2_)
                    TextureDefinitionCacheStatics.method1626(1, true)
                    if (GrayscaleNoiseTextureStatics.aBoolean5300) {
                        ProjectionCameraTransformStatics.method941(124, LocTypeDefLoaderStatics.anInt2500)
                        if (LocalPlayerState.anInt1906 != PlayerAppearanceUpdateDecoder.anInt4545) PcmStreamBufferStatics.aBoolean8870 = true
                        PlayerAppearanceUpdateDecoder.anInt4545 = LocalPlayerState.anInt1906
                    } else {
                        FacingDirectionNodeStatics.aRenderer6654!!.ya()
                        val i_15_ = LocTypeDefLoaderStatics.anInt2500
                        if (KeyboardLayoutCacheStatics.aParticleSystemRenderer_3304 != null) KeyboardLayoutCacheStatics.aParticleSystemRenderer_3304!!.method2293(MapSceneDefLoaderStatics.anInt2481 shl 3, FacingDirectionNodeStatics.aRenderer6654!!, (-72).toByte(), i_1_, i_0_, i_3_, WorldMapElementStatics.anInt4638, MinimapAreaMarkerNodeStatics.anInt9701, i_15_, i_2_)
                        else FacingDirectionNodeStatics.aRenderer6654!!.GA(i_15_)
                    }
                    WorldMapAreaLabelStatics.method3570(false)
                    if (i >= 80) {
                        SettingsCrcWriter.aAbstractCameraTransform_2123!!.method903(GlslMaterialPassStatics.anInt6246, ParticleSystemRendererStatics.anInt3855, CompositeRgbNoiseTextureStatics.anInt8685, -MinimapAreaMarkerNodeStatics.anInt9701 and 0x3fff, -WorldMapElementStatics.anInt4638 and 0x3fff, 0x3fff and -MapTileShapeStatics.anInt4186)
                        FacingDirectionNodeStatics.aRenderer6654!!.method3638(SettingsCrcWriter.aAbstractCameraTransform_2123)
                        FacingDirectionNodeStatics.aRenderer6654!!.DA(i_0_ / 2 + i_1_, i_3_ + i_2_ / 2, TerrainChunkBuilderStatics.anInt1550 shl 1, TerrainChunkBuilderStatics.anInt1550 shl 1)
                        CircleHitboxStatics.method319(TerrainChunkBuilderStatics.anInt1550 shl 1, TerrainChunkBuilderStatics.anInt1550 shl 1, (-18).toByte(), i_1_ + i_0_ / 2, i_3_ + i_2_ / 2)
                        SpriteRenderEntryStatics.method3282(0x3fff and -(MinimapAreaMarkerNodeStatics.anInt9701), CompositeRgbNoiseTextureStatics.anInt8685, ParticleSystemRendererStatics.anInt3855, 0, -WorldMapElementStatics.anInt4638 and 0x3fff, GlslMaterialPassStatics.anInt6246, -MapTileShapeStatics.anInt4186 and 0x3fff)
                        val i_16_ = (if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub14_7264!!.method1778(-32350) != 2) 1.toByte() else TextureQualityOptionStateStatics.anInt6006.toByte())
                        if (GrayscaleNoiseTextureStatics.aBoolean5300) {
                            CameraRotationStubStatics.method289(-15902, 0x3fff and -WorldMapElementStatics.anInt4638, -MapTileShapeStatics.anInt4186 and 0x3fff, (-MinimapAreaMarkerNodeStatics.anInt9701 and 0x3fff))
                            SceneProjectorStatics.method1634(
                                AbstractModelStatics.anIntArray1127,
                                -2,
                                RegionSceneLoader.aByteArrayArrayArray3700,
                                (LocalPlayerState.aPlayer_1907!!.y) shr 9,
                                (LocalPlayerState.aPlayer_1907!!.plane) - -1,
                                FileIoUtil.anIntArray4097,
                                GlslMaterialPassStatics.anInt6246,
                                CompositeRgbNoiseTextureStatics.anInt8685,
                                IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub1_7246!!.method1720(-32350) == 0,
                                ParticleSystemRendererStatics.anInt3855,
                                (LocalPlayerState.aPlayer_1907!!.x) shr 9,
                                LinkedListIteratorStatics.anIntArray2117,
                                BlankTextureNodeStatics.anIntArray9259,
                                i_16_,
                                ConnectionStateTypeStatics.anIntArray1045,
                                GlGroundShaderPassStatics.anInt7396,
                                true,
                                LocalPlayerState.anInt1906
                            )
                        } else GlTexture3DStatics.method1960(
                            GlGroundShaderPassStatics.anInt7396,
                            GlslMaterialPassStatics.anInt6246,
                            ParticleSystemRendererStatics.anInt3855,
                            CompositeRgbNoiseTextureStatics.anInt8685,
                            RegionSceneLoader.aByteArrayArrayArray3700,
                            FileIoUtil.anIntArray4097,
                            LinkedListIteratorStatics.anIntArray2117,
                            BlankTextureNodeStatics.anIntArray9259,
                            ConnectionStateTypeStatics.anIntArray1045,
                            AbstractModelStatics.anIntArray1127,
                            (LocalPlayerState.aPlayer_1907!!.plane) - -1,
                            i_16_,
                            (LocalPlayerState.aPlayer_1907!!.x) shr 9,
                            (LocalPlayerState.aPlayer_1907!!.y) shr 9,
                            IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub1_7246!!.method1720(-32350) == 0,
                            true,
                            if (!ParticleSystemRendererStatics.aBoolean3870) -1 else LocalPlayerState.anInt1906,
                            0,
                            false
                        )
                        WorldMapAreaLabelStatics.method3570(false)
                        if (WorldMapRendererStatics.anInt4674 == 10) {
                            WorldListEntryStatics.method283(-127, i_0_, 256, i_2_, i_1_, i_3_, 256)
                            method3802(i_3_, i_2_, 2, i_1_, i_0_, 256, 256)
                            GroundDecorSceneEntityStatics.method2403(i_1_, 256, i_3_, i_0_, 19206, i_2_, 256)
                            ItemDefinitionLoaderStatics.method1289(i_2_, i_0_, i_3_, 8, i_1_)
                        }
                        CharCodeMapStatics.method3223()
                        GlslMaterialPassStatics.anInt6246 = i_8_
                        MinimapAreaMarkerNodeStatics.anInt9701 = i_11_
                        WorldMapElementStatics.anInt4638 = i_12_
                        ParticleSystemRendererStatics.anInt3855 = i_9_
                        CompositeRgbNoiseTextureStatics.anInt8685 = i_10_
                        if (SocketGameConnectionStatics.aBoolean5840 && ClientMachineInfoStatics.aMediaStreamClient_6601!!.method1902(4) == 0) SocketGameConnectionStatics.aBoolean5840 = false
                        if (SocketGameConnectionStatics.aBoolean5840) {
                            FacingDirectionNodeStatics.aRenderer6654!!.method3675(i_0_, (-125).toByte(), i_1_, i_3_, i_2_, -16777216)
                            Tooltip.method3511(false, GameAppletFrameStatics.aFont_20, ParticleEmitterFactoryStatics.aFontDefinition_3179, (LocalizedTextStatics.aLocalizedText_3495!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544)), 2, FacingDirectionNodeStatics.aRenderer6654)
                        }
                        TextureDefinitionCacheStatics.method1626(1, false)
                    }
                }
            }
    
            @JvmStatic
            fun method133(i: Byte) {
                anIntArray100 = null
                anIntArray99 = null
                aClass110_Sub1Array97 = null
                if (i.toInt() != -41) anIntArray99 = null
                aRandom93 = null
            }
    
            @JvmStatic
            fun method134(i: Byte) {
                if (i.toInt() != -126) method132(-95, true, 10, 28, 45, 100)
                if (CompiledScriptCacheStatics.anObject4366 == null) {
                    val class59_sub1_sub1 = ScrollingNoiseTexture()
                    val `is` = class59_sub1_sub1.method559(128, 128, 106.toByte(), 16)
                    CompiledScriptCacheStatics.anObject4366 = GrowableStringListStatics.method1357(`is`, false, 111.toByte())
                }
                anInt92++
                if (BoxedIntHolderStatics.anObject2969 == null) {
                    val class59_sub2_sub2 = CompositeRgbNoiseTexture()
                    val `is` = class59_sub2_sub2.method571(128, (-38).toByte(), 16, 128)
                    BoxedIntHolderStatics.anObject2969 = GrowableStringListStatics.method1357(`is`, false, 106.toByte())
                }
            }
    
            init {
                anIntArray99 = intArrayOf(1, -1, -1, 1)
            }
}
