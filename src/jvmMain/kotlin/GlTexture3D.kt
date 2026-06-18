import GlVertexBufferArb.Companion.method2131
import jaggl.OpenGL.Companion.glCopyTexSubImage3D
import jaggl.OpenGL.Companion.glFlush
import jaggl.OpenGL.Companion.glFramebufferTexture3DEXT
import jaggl.OpenGL.Companion.glPixelStorei
import jaggl.OpenGL.Companion.glTexImage3Dub

class GlTexture3D : GlTexture {
    @JvmField
    var anInt8522: Int = 0
    @JvmField
    var anInt8523: Int = 0
    private var anInt8525 = -1
    private var anInt8528 = -1
    @JvmField
    var anInt8529: Int = 0

    fun method1958(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
        this.aHa_Sub2_4851.method3771((-110).toByte(), this)
        anInt8526++
        glCopyTexSubImage3D(this.anInt4849, 0, i_2_, i_6_, i_4_, i_3_, i_0_, i_1_, i_5_)
        glFlush()
        if (i != -26823) aFontDefinition_8527 = null
    }

    override fun method37(i: Int) {
        anInt8524++
        glFramebufferTexture3DEXT(anInt8528, anInt8525, this.anInt4849, 0, 0, 0)
        anInt8525 = -1
        if (i != -3022) method1960(112, -107, -46, -98, null, null, null, null, null, null, -114, 75.toByte(), -105, 62, true, false, 110, -31, true)
        anInt8528 = -1
    }

    internal constructor(var_ha_Sub2: OpenGlRenderer, i: Int, i_7_: Int, i_8_: Int, i_9_: Int, `is`: ByteArray?, i_10_: Int) : super(var_ha_Sub2, 32879, i, i_7_ * (i_8_ * i_9_), false) {
        try {
            this.anInt8523 = i_7_
            this.anInt8522 = i_9_
            this.anInt8529 = i_8_
            this.aHa_Sub2_4851.method3771((-84).toByte(), this)
            glPixelStorei(3317, 1)
            glTexImage3Dub(this.anInt4849, 0, this.anInt4858, this.anInt8523, this.anInt8529, this.anInt8522, 0, i_10_, 5121, `is`, 0)
            glPixelStorei(3317, 4)
            this.method1957(9728, true)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("gj.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_10_ + ')'))
        }
    }

    internal constructor(var_ha_Sub2: OpenGlRenderer, i: Int, i_49_: Int, i_50_: Int, i_51_: Int) : super(var_ha_Sub2, 32879, i, i_51_ * i_49_ * i_50_, false) {
        this.anInt8523 = i_49_
        this.anInt8529 = i_50_
        this.anInt8522 = i_51_
        this.aHa_Sub2_4851.method3771((-123).toByte(), this)
        glTexImage3Dub(this.anInt4849, 0, this.anInt4858, this.anInt8523, this.anInt8529, this.anInt8522, 0, CharacterRenderState.method2779(true, (this.anInt4858)), 5121, null, 0)
        this.method1957(9728, true)
    }

    companion object {
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
            SkeletalAnimFrameData.aBoolean351 = true
            ProjectedGroundDecor.aBoolean10221 = NativeLibraryState.aRenderer171!!.method3704() > 0
            SpriteTextureNode.aBoolean9242 = bool_24_
            DisplayModeOptionState.anInt6111 = i_12_ shr Tooltip.anInt4459
            GlIndexBufferArb.anInt8502 = i_14_ shr Tooltip.anInt4459
            TextureDefinitionLoader.anInt1974 = i_12_
            BlendTextureNode.anInt9360 = i_14_
            TerrainTileGeometry.anInt3006 = i_13_
            ByteArrayPool.anInt492 = DisplayModeOptionState.anInt6111 - NpcActorEntity.anInt10084
            if (ByteArrayPool.anInt492 < 0) {
                AnimatedModelRenderer.anInt8412 = -ByteArrayPool.anInt492
                ByteArrayPool.anInt492 = 0
            } else AnimatedModelRenderer.anInt8412 = 0
            IntPair.anInt6974 = GlIndexBufferArb.anInt8502 - NpcActorEntity.anInt10084
            if (IntPair.anInt6974 < 0) {
                WorldMapRenderer.anInt4686 = -IntPair.anInt6974
                IntPair.anInt6974 = 0
            } else WorldMapRenderer.anInt4686 = 0
            ProjectileConfigUtil.anInt387 = DisplayModeOptionState.anInt6111 + NpcActorEntity.anInt10084
            if (ProjectileConfigUtil.anInt387 > SpotAnimEntity.anInt6451) ProjectileConfigUtil.anInt387 = SpotAnimEntity.anInt6451
            GrayscaleNoiseTexture.anInt5293 = GlIndexBufferArb.anInt8502 + NpcActorEntity.anInt10084
            if (GrayscaleNoiseTexture.anInt5293 > RegionSceneShifter.anInt7054) GrayscaleNoiseTexture.anInt5293 = RegionSceneShifter.anInt7054
            val bools = SpriteBlitter.aBooleanArrayArray1572
            val bools_28_ = FacingDirectionNode.aBooleanArrayArray6656
            if (SpriteTextureNode.aBoolean9242) {
                for (i_29_ in 0..<(NpcActorEntity.anInt10084 + NpcActorEntity.anInt10084 + 2)) {
                    var i_30_ = 0
                    var i_31_ = 0
                    for (i_32_ in 0..<(NpcActorEntity.anInt10084 + NpcActorEntity.anInt10084 + 2)) {
                        if (i_32_ > 1) RefCountedHandle.anIntArray2272!![i_32_ - 2] = i_30_
                        i_30_ = i_31_
                        val i_33_ = (DisplayModeOptionState.anInt6111 - NpcActorEntity.anInt10084 + i_29_)
                        val i_34_ = (GlIndexBufferArb.anInt8502 - NpcActorEntity.anInt10084 + i_32_)
                        if (i_33_ >= 0 && i_34_ >= 0 && i_33_ < SpotAnimEntity.anInt6451 && i_34_ < RegionSceneShifter.anInt7054) {
                            val i_35_ = i_33_ shl Tooltip.anInt4459
                            val i_36_ = i_34_ shl Tooltip.anInt4459
                            val i_37_ = (TerrainTileShape.aTerrainTileArray8801!![TerrainTileShape.aTerrainTileArray8801!!.size - 1]!!.method3982((-86).toByte(), i_34_, i_33_) - (1000 shl Tooltip.anInt4459 - 7))
                            val i_38_ = (if (SoundCacheState.aTerrainTileArray4142 != null) (SoundCacheState.aTerrainTileArray4142!![0]!!.method3982((-86).toByte(), i_34_, i_33_) + ArchiveFileConditionWrapper.anInt3465) else (TerrainTileShape.aTerrainTileArray8801!![0]!!.method3982((-86).toByte(), i_34_, i_33_) + ArchiveFileConditionWrapper.anInt3465))
                            i_31_ = (if (i_25_ >= 0) NativeLibraryState.aRenderer171!!.r(i_35_, i_37_, i_36_, i_35_, i_38_, i_36_, i_25_) else NativeLibraryState.aRenderer171!!.JA(i_35_, i_37_, i_36_, i_35_, i_38_, i_36_))
                            FacingDirectionNode.aBooleanArrayArray6656!![i_29_]!![i_32_] = i_31_ == 0
                        } else {
                            i_31_ = -1
                            FacingDirectionNode.aBooleanArrayArray6656!![i_29_]!![i_32_] = false
                        }
                        if (i_29_ > 0 && i_32_ > 0) {
                            val i_39_ = (RefCountedHandle.anIntArray2272!![i_32_ - 1] and RefCountedHandle.anIntArray2272!![i_32_] and i_30_ and i_31_)
                            SpriteBlitter.aBooleanArrayArray1572!![i_29_ - 1]!![i_32_ - 1] = i_39_ == 0
                        }
                    }
                    RefCountedHandle.anIntArray2272!![(NpcActorEntity.anInt10084 + NpcActorEntity.anInt10084)] = i_30_
                    RefCountedHandle.anIntArray2272!![(NpcActorEntity.anInt10084 + NpcActorEntity.anInt10084 + 1)] = i_31_
                }
                if (i_25_ >= 0) SkeletalAnimFrameData.aBoolean351 = false
                else {
                    Player.anIntArray10566 = is_15_
                    BackgroundWorkerThread.anIntArray3220 = is_16_
                    StaticNoiseTexture.anIntArray8666 = is_17_
                    CubemapTextureImplSource.anIntArray8712 = is_18_
                    Client.anIntArray5176 = is_19_
                    InterfaceComponentGroup.method3241(i_20_, 39.toByte(), NativeLibraryState.aRenderer171!!)
                }
            } else {
                if (WorldMapIconLabel.aBooleanArrayArray8596 == null) WorldMapIconLabel.aBooleanArrayArray8596 = (Array<BooleanArray?>(SpotAnimEntity.anInt6451 + SpotAnimEntity.anInt6451 + 1) { BooleanArray((RegionSceneShifter.anInt7054 + SpotAnimEntity.anInt6451 + 1)) })
                for (i_40_ in WorldMapIconLabel.aBooleanArrayArray8596!!.indices) {
                    for (i_41_ in WorldMapIconLabel.aBooleanArrayArray8596!![0]!!.indices) WorldMapIconLabel.aBooleanArrayArray8596!![i_40_]!![i_41_] = true
                }
                FacingDirectionNode.aBooleanArrayArray6656 = WorldMapIconLabel.aBooleanArrayArray8596
                SpriteBlitter.aBooleanArrayArray1572 = WorldMapIconLabel.aBooleanArrayArray8596!!
                ByteArrayPool.anInt492 = 0
                IntPair.anInt6974 = 0
                ProjectileConfigUtil.anInt387 = SpotAnimEntity.anInt6451
                GrayscaleNoiseTexture.anInt5293 = RegionSceneShifter.anInt7054
                SkeletalAnimFrameData.aBoolean351 = false
            }
            DoublyLinkedNodeList.method1877(NativeLibraryState.aRenderer171, -69)
            if (!PlayerSequenceSelector.aSceneObjectSpawner_1208!!.aBoolean1283) {
                val class243 = PlayerSequenceSelector.aSceneObjectSpawner_1208!!.aDoublyLinkedNodeList_1282
                var class318_sub4 = class243.method1872(8) as SceneEntityModel?
                while (class318_sub4 != null) {
                    class318_sub4.method2373(false)
                    ScrollingNoiseTexture.method560(class318_sub4, 6)
                    class318_sub4 = class243.method1878(125.toByte()) as SceneEntityModel?
                }
            }
            if (ProjectedGroundDecor.aBoolean10221) {
                for (i_42_ in 0..<CalendarUtil.anInt4135) WaterDetailOptionState.aSoundEnvelopeArray5993!![i_42_]!!.method1544(8688, bool, i)
            }
            if (VoronoiNoiseTextureNode.aBoolean9121) {
                RsaVarbitHandler.anIntArray4906 = NativeLibraryState.aRenderer171!!.Y()
                NativeLibraryState.aRenderer171!!.K(BrightnessContrastEffect.anIntArray9183)
                val i_43_ = ((BrightnessContrastEffect.anIntArray9183!![2] - BrightnessContrastEffect.anIntArray9183!![0]) / ActiveMapRegion.anInt5652)
                for (i_44_ in 0..<ActiveMapRegion.anInt5652 - 1) WidgetDefinition.anIntArray256!![i_44_] = i_43_ * (i_44_ + 1) + ParticleProcessor.anIntArray4271!![i_44_]
                for (i_45_ in NormalMapTextureNode.aSceneLoaderThreadArray9432!!.indices) NormalMapTextureNode.aSceneLoaderThreadArray9432!![i_45_]!!.method2209()
            }
            if (ProducerImageSurface.aSceneCollisionEntryArrayArrayArray9082 != null) {
                if (VoronoiNoiseTextureNode.aBoolean9121) method2131(0)
                DoublyLinkedNodeList.method1879(true)
                NativeLibraryState.aRenderer171!!.ra(-1, 1583160, 40, 127)
                FloatBuffer.method3398(true, `is`, i_20_, i_21_, i_25_, i_26_, bool_27_)
                if (VoronoiNoiseTextureNode.aBoolean9121) TextureFormatInfo.method2290()
                NativeLibraryState.aRenderer171!!.pa()
                DoublyLinkedNodeList.method1879(false)
            }
            FloatBuffer.method3398(false, `is`, i_20_, i_21_, i_25_, i_26_, bool_27_)
            if (VoronoiNoiseTextureNode.aBoolean9121) {
                for (i_46_ in 0..<MapAreaDefinition.anInt2524) SolidFillComponent.aBooleanArrayArrayArray8361!![i_46_] = OverlayColorTable.aBooleanArrayArrayArray1751!![i_46_]
                method2131(0)
                for (i_47_ in NormalMapTextureNode.aSceneLoaderThreadArray9432!!.indices) NormalMapTextureNode.aSceneLoaderThreadArray9432!![i_47_]!!.method2209()
            }
            if (VoronoiNoiseTextureNode.aBoolean9121) {
                TextureFormatInfo.method2290()
                for (i_48_ in 0..<MapAreaDefinition.anInt2524) OverlayColorTable.aBooleanArrayArrayArray1751!![i_48_] = SolidFillComponent.aBooleanArrayArrayArray8361!![i_48_]!!
                if (Npc.anInt10503 == 2) {
                    if (HitsplatDefinition.aLongArray2013!![0] < HitsplatDefinition.aLongArray2013!![1]) {
                        if (WidgetDefinition.anIntArray256!![0] + ParticleProcessor.anIntArray4271!![0] > BrightnessContrastEffect.anIntArray9183!![0]) ParticleProcessor.anIntArray4271!![0]++
                    } else if ((HitsplatDefinition.aLongArray2013!![0] > HitsplatDefinition.aLongArray2013!![1]) && ((WidgetDefinition.anIntArray256!![0] + ParticleProcessor.anIntArray4271!![0]) < BrightnessContrastEffect.anIntArray9183!![2])) ParticleProcessor.anIntArray4271!![0]--
                }
            }
            if (!SpriteTextureNode.aBoolean9242) {
                SpriteBlitter.aBooleanArrayArray1572 = bools
                FacingDirectionNode.aBooleanArrayArray6656 = bools_28_
            }
            DebugOverlayRenderer.method1884()
        }
    }
}
