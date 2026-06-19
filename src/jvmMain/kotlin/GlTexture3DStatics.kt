import GlVertexBufferArbStatics.method2131
import jaggl.OpenGLStatics.glCopyTexSubImage3D
import jaggl.OpenGLStatics.glFlush
import jaggl.OpenGLStatics.glFramebufferTexture3DEXT
import jaggl.OpenGLStatics.glPixelStorei
import jaggl.OpenGLStatics.glTexImage3Dub

object GlTexture3DStatics {
    @JvmField
            var anInt8524: Int = 0
            @JvmField
            var anInt8526: Int = 0
            @JvmField
            var aFontDefinition_8527: FontDefinition? = null
            @JvmStatic
            fun method1959(i: Int) {
                val i_11_ = -121 / ((-52 - i) / 60)
                aFontDefinition_8527 = null
            }
    
            @JvmStatic
            fun method1960(i: Int, i_12_: Int, i_13_: Int, i_14_: Int, `is`: Array<Array<ByteArray?>?>?, is_15_: IntArray?, is_16_: IntArray?, is_17_: IntArray?, is_18_: IntArray?, is_19_: IntArray?, i_20_: Int, i_21_: Byte, i_22_: Int, i_23_: Int, bool: Boolean, bool_24_: Boolean, i_25_: Int, i_26_: Int, bool_27_: Boolean) {
                SkeletalAnimFrameDataStatics.aBoolean351 = true
                ProjectedGroundDecorStatics.aBoolean10221 = NativeLibraryState.aRenderer171!!.method3704() > 0
                SpriteTextureNodeStatics.aBoolean9242 = bool_24_
                DisplayModeOptionStateStatics.anInt6111 = i_12_ shr Tooltip.anInt4459
                GlIndexBufferArbStatics.anInt8502 = i_14_ shr Tooltip.anInt4459
                TextureDefinitionLoaderStatics.anInt1974 = i_12_
                BlendTextureNodeStatics.anInt9360 = i_14_
                TerrainTileGeometryStatics.anInt3006 = i_13_
                ByteArrayPool.anInt492 = DisplayModeOptionStateStatics.anInt6111 - NpcActorEntityStatics.anInt10084
                if (ByteArrayPool.anInt492 < 0) {
                    AnimatedModelRendererStatics.anInt8412 = -ByteArrayPool.anInt492
                    ByteArrayPool.anInt492 = 0
                } else AnimatedModelRendererStatics.anInt8412 = 0
                IntPairStatics.anInt6974 = GlIndexBufferArbStatics.anInt8502 - NpcActorEntityStatics.anInt10084
                if (IntPairStatics.anInt6974 < 0) {
                    WorldMapRendererStatics.anInt4686 = -IntPairStatics.anInt6974
                    IntPairStatics.anInt6974 = 0
                } else WorldMapRendererStatics.anInt4686 = 0
                ProjectileConfigUtil.anInt387 = DisplayModeOptionStateStatics.anInt6111 + NpcActorEntityStatics.anInt10084
                if (ProjectileConfigUtil.anInt387 > SpotAnimEntityStatics.anInt6451) ProjectileConfigUtil.anInt387 = SpotAnimEntityStatics.anInt6451
                GrayscaleNoiseTextureStatics.anInt5293 = GlIndexBufferArbStatics.anInt8502 + NpcActorEntityStatics.anInt10084
                if (GrayscaleNoiseTextureStatics.anInt5293 > RegionSceneShifterStatics.anInt7054) GrayscaleNoiseTextureStatics.anInt5293 = RegionSceneShifterStatics.anInt7054
                val bools = SpriteBlitter.aBooleanArrayArray1572
                val bools_28_ = FacingDirectionNodeStatics.aBooleanArrayArray6656
                if (SpriteTextureNodeStatics.aBoolean9242) {
                    for (i_29_ in 0..<(NpcActorEntityStatics.anInt10084 + NpcActorEntityStatics.anInt10084 + 2)) {
                        var i_30_ = 0
                        var i_31_ = 0
                        for (i_32_ in 0..<(NpcActorEntityStatics.anInt10084 + NpcActorEntityStatics.anInt10084 + 2)) {
                            if (i_32_ > 1) RefCountedHandleStatics.anIntArray2272!![i_32_ - 2] = i_30_
                            i_30_ = i_31_
                            val i_33_ = (DisplayModeOptionStateStatics.anInt6111 - NpcActorEntityStatics.anInt10084 + i_29_)
                            val i_34_ = (GlIndexBufferArbStatics.anInt8502 - NpcActorEntityStatics.anInt10084 + i_32_)
                            if (i_33_ >= 0 && i_34_ >= 0 && i_33_ < SpotAnimEntityStatics.anInt6451 && i_34_ < RegionSceneShifterStatics.anInt7054) {
                                val i_35_ = i_33_ shl Tooltip.anInt4459
                                val i_36_ = i_34_ shl Tooltip.anInt4459
                                val i_37_ = (TerrainTileShapeStatics.aTerrainTileArray8801!![TerrainTileShapeStatics.aTerrainTileArray8801!!.size - 1]!!.method3982((-86).toByte(), i_34_, i_33_) - (1000 shl Tooltip.anInt4459 - 7))
                                val i_38_ = (if (SoundCacheState.aTerrainTileArray4142 != null) (SoundCacheState.aTerrainTileArray4142!![0]!!.method3982((-86).toByte(), i_34_, i_33_) + ArchiveFileConditionWrapperStatics.anInt3465) else (TerrainTileShapeStatics.aTerrainTileArray8801!![0]!!.method3982((-86).toByte(), i_34_, i_33_) + ArchiveFileConditionWrapperStatics.anInt3465))
                                i_31_ = (if (i_25_ >= 0) NativeLibraryState.aRenderer171!!.r(i_35_, i_37_, i_36_, i_35_, i_38_, i_36_, i_25_) else NativeLibraryState.aRenderer171!!.JA(i_35_, i_37_, i_36_, i_35_, i_38_, i_36_))
                                FacingDirectionNodeStatics.aBooleanArrayArray6656!![i_29_]!![i_32_] = i_31_ == 0
                            } else {
                                i_31_ = -1
                                FacingDirectionNodeStatics.aBooleanArrayArray6656!![i_29_]!![i_32_] = false
                            }
                            if (i_29_ > 0 && i_32_ > 0) {
                                val i_39_ = (RefCountedHandleStatics.anIntArray2272!![i_32_ - 1] and RefCountedHandleStatics.anIntArray2272!![i_32_] and i_30_ and i_31_)
                                SpriteBlitter.aBooleanArrayArray1572!![i_29_ - 1]!![i_32_ - 1] = i_39_ == 0
                            }
                        }
                        RefCountedHandleStatics.anIntArray2272!![(NpcActorEntityStatics.anInt10084 + NpcActorEntityStatics.anInt10084)] = i_30_
                        RefCountedHandleStatics.anIntArray2272!![(NpcActorEntityStatics.anInt10084 + NpcActorEntityStatics.anInt10084 + 1)] = i_31_
                    }
                    if (i_25_ >= 0) SkeletalAnimFrameDataStatics.aBoolean351 = false
                    else {
                        PlayerStatics.anIntArray10566 = is_15_
                        BackgroundWorkerThreadStatics.anIntArray3220 = is_16_
                        StaticNoiseTextureStatics.anIntArray8666 = is_17_
                        CubemapTextureImplSourceStatics.anIntArray8712 = is_18_
                        ClientStatics.anIntArray5176 = is_19_
                        InterfaceComponentGroupStatics.method3241(i_20_, 39.toByte(), NativeLibraryState.aRenderer171!!)
                    }
                } else {
                    if (WorldMapIconLabelStatics.aBooleanArrayArray8596 == null) WorldMapIconLabelStatics.aBooleanArrayArray8596 = (Array<BooleanArray?>(SpotAnimEntityStatics.anInt6451 + SpotAnimEntityStatics.anInt6451 + 1) { BooleanArray((RegionSceneShifterStatics.anInt7054 + SpotAnimEntityStatics.anInt6451 + 1)) })
                    for (i_40_ in WorldMapIconLabelStatics.aBooleanArrayArray8596!!.indices) {
                        for (i_41_ in WorldMapIconLabelStatics.aBooleanArrayArray8596!![0]!!.indices) WorldMapIconLabelStatics.aBooleanArrayArray8596!![i_40_]!![i_41_] = true
                    }
                    FacingDirectionNodeStatics.aBooleanArrayArray6656 = WorldMapIconLabelStatics.aBooleanArrayArray8596
                    SpriteBlitter.aBooleanArrayArray1572 = WorldMapIconLabelStatics.aBooleanArrayArray8596!!
                    ByteArrayPool.anInt492 = 0
                    IntPairStatics.anInt6974 = 0
                    ProjectileConfigUtil.anInt387 = SpotAnimEntityStatics.anInt6451
                    GrayscaleNoiseTextureStatics.anInt5293 = RegionSceneShifterStatics.anInt7054
                    SkeletalAnimFrameDataStatics.aBoolean351 = false
                }
                DoublyLinkedNodeListStatics.method1877(NativeLibraryState.aRenderer171, -69)
                if (!PlayerSequenceSelector.aSceneObjectSpawner_1208!!.aBoolean1283) {
                    val class243 = PlayerSequenceSelector.aSceneObjectSpawner_1208!!.aDoublyLinkedNodeList_1282
                    var class318_sub4 = class243.method1872(8) as SceneEntityModel?
                    while (class318_sub4 != null) {
                        class318_sub4.method2373(false)
                        ScrollingNoiseTextureStatics.method560(class318_sub4, 6)
                        class318_sub4 = class243.method1878(125.toByte()) as SceneEntityModel?
                    }
                }
                if (ProjectedGroundDecorStatics.aBoolean10221) {
                    for (i_42_ in 0..<CalendarUtil.anInt4135) WaterDetailOptionStateStatics.aSoundEnvelopeArray5993!![i_42_]!!.method1544(8688, bool, i)
                }
                if (VoronoiNoiseTextureNodeStatics.aBoolean9121) {
                    RsaVarbitHandlerStatics.anIntArray4906 = NativeLibraryState.aRenderer171!!.Y()
                    NativeLibraryState.aRenderer171!!.K(BrightnessContrastEffectStatics.anIntArray9183)
                    val i_43_ = ((BrightnessContrastEffectStatics.anIntArray9183!![2] - BrightnessContrastEffectStatics.anIntArray9183!![0]) / ActiveMapRegion.anInt5652)
                    for (i_44_ in 0..<ActiveMapRegion.anInt5652 - 1) WidgetDefinitionStatics.anIntArray256!![i_44_] = i_43_ * (i_44_ + 1) + ParticleProcessorStatics.anIntArray4271!![i_44_]
                    for (i_45_ in NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!!.indices) NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![i_45_]!!.method2209()
                }
                if (ProducerImageSurfaceStatics.aSceneCollisionEntryArrayArrayArray9082 != null) {
                    if (VoronoiNoiseTextureNodeStatics.aBoolean9121) method2131(0)
                    DoublyLinkedNodeListStatics.method1879(true)
                    NativeLibraryState.aRenderer171!!.ra(-1, 1583160, 40, 127)
                    FloatBufferStatics.method3398(true, `is`, i_20_, i_21_, i_25_, i_26_, bool_27_)
                    if (VoronoiNoiseTextureNodeStatics.aBoolean9121) TextureFormatInfoStatics.method2290()
                    NativeLibraryState.aRenderer171!!.pa()
                    DoublyLinkedNodeListStatics.method1879(false)
                }
                FloatBufferStatics.method3398(false, `is`, i_20_, i_21_, i_25_, i_26_, bool_27_)
                if (VoronoiNoiseTextureNodeStatics.aBoolean9121) {
                    for (i_46_ in 0..<MapAreaDefinitionStatics.anInt2524) SolidFillComponentStatics.aBooleanArrayArrayArray8361!![i_46_] = OverlayColorTable.aBooleanArrayArrayArray1751!![i_46_]
                    method2131(0)
                    for (i_47_ in NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!!.indices) NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![i_47_]!!.method2209()
                }
                if (VoronoiNoiseTextureNodeStatics.aBoolean9121) {
                    TextureFormatInfoStatics.method2290()
                    for (i_48_ in 0..<MapAreaDefinitionStatics.anInt2524) OverlayColorTable.aBooleanArrayArrayArray1751!![i_48_] = SolidFillComponentStatics.aBooleanArrayArrayArray8361!![i_48_]!!
                    if (NpcStatics.anInt10503 == 2) {
                        if (HitsplatDefinitionStatics.aLongArray2013!![0] < HitsplatDefinitionStatics.aLongArray2013!![1]) {
                            if (WidgetDefinitionStatics.anIntArray256!![0] + ParticleProcessorStatics.anIntArray4271!![0] > BrightnessContrastEffectStatics.anIntArray9183!![0]) ParticleProcessorStatics.anIntArray4271!![0]++
                        } else if ((HitsplatDefinitionStatics.aLongArray2013!![0] > HitsplatDefinitionStatics.aLongArray2013!![1]) && ((WidgetDefinitionStatics.anIntArray256!![0] + ParticleProcessorStatics.anIntArray4271!![0]) < BrightnessContrastEffectStatics.anIntArray9183!![2])) ParticleProcessorStatics.anIntArray4271!![0]--
                    }
                }
                if (!SpriteTextureNodeStatics.aBoolean9242) {
                    SpriteBlitter.aBooleanArrayArray1572 = bools
                    FacingDirectionNodeStatics.aBooleanArrayArray6656 = bools_28_
                }
                DebugOverlayRenderer.method1884()
            }
}
