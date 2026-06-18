import CharacterRenderState.Companion.method2778
import jaclib.memory.Stream.Companion.floatToRawIntBits
import OpenGlTerrainTile.Companion.method4001
import java.util.*

class FloatBuffer internal constructor(i: Int) : Buffer(i) {
    fun method3399(i: Int, f: Float) {
        anInt9741++
        val i_23_ = floatToRawIntBits(f)
        this.aByteArray7154!![this.anInt7197++] = i_23_.toByte()
        this.aByteArray7154!![this.anInt7197++] = (i_23_ shr 8).toByte()
        if (i != 18291) aBoolean9746 = true
        this.aByteArray7154!![this.anInt7197++] = (i_23_ shr 16).toByte()
        this.aByteArray7154!![this.anInt7197++] = (i_23_ shr 24).toByte()
    }

    fun method3400(f: Float, i: Byte) {
        anInt9744++
        val i_24_ = floatToRawIntBits(f)
        this.aByteArray7154!![this.anInt7197++] = (i_24_ shr 24).toByte()
        this.aByteArray7154!![this.anInt7197++] = (i_24_ shr 16).toByte()
        if (i >= -76) aBoolean9746 = true
        this.aByteArray7154!![this.anInt7197++] = (i_24_ shr 8).toByte()
        this.aByteArray7154!![this.anInt7197++] = i_24_.toByte()
    }

    companion object {
        var anInt9741: Int = 0
        var anInt9742: Int = 0
        var aFontMetaRef_9743: FontMetaRef? = FontMetaRef(84, -1)
        var anInt9744: Int = 0
        var anInt9745: Int = 0
        var aBoolean9746: Boolean = true
        @JvmField
        var anInt9747: Int = 0
        var aRectangleRegion_9748: RectangleRegion? = RectangleRegion(7, 0, 1, 1)
        var aFontMetaRef_9749: FontMetaRef?
        @JvmField
        var anInt9750: Int
        var anInt9751: Int = 0

        fun method3398(bool: Boolean, `is`: Array<Array<ByteArray?>?>?, i: Int, i_0_: Byte, i_1_: Int, i_2_: Int, bool_3_: Boolean) {
            val i_4_ = if (bool) 1 else 0
            ProportionalScrollbarComponent.anInt9930 = 0
            LoadingScreenImageNode.anInt9504 = 0
            RandomAccessFileOnDisk.anInt3049++
            if ((i_2_ and 0x2) == 0) {
                var class318_sub1 = aClass318_Sub1Array4293!![i_4_]
                while (class318_sub1 != null) {
                    if (!method2778(class318_sub1, bool, `is`, i, i_0_)) {
                        method4001(class318_sub1)
                        if (class318_sub1.anInt6389 != -1) RemoveRoofsOptionState.aClass318_Sub1Array6066!![ProportionalScrollbarComponent.anInt9930++] = class318_sub1
                    }
                    class318_sub1 = class318_sub1.aClass318_Sub1_6379
                }
            }
            if ((i_2_ and 0x1) == 0) {
                run {
                    var class318_sub1 = BackgroundWorkerThread.aClass318_Sub1Array3226!![i_4_]
                    while (class318_sub1 != null) {
                        if (!method2778(class318_sub1, bool, `is`, i, i_0_)) {
                            method4001(class318_sub1)
                            if (class318_sub1.anInt6389 != -1) CutsceneSequenceData.aClass318_Sub1Array3737!![LoadingScreenImageNode.anInt9504++] = class318_sub1
                        }
                        class318_sub1 = class318_sub1.aClass318_Sub1_6379
                    }
                }
                var class318_sub1 = OverlayColorTable.aClass318_Sub1Array1754!![i_4_]
                while (class318_sub1 != null) {
                    if (!method2778(class318_sub1, bool, `is`, i, i_0_)) {
                        if (class318_sub1.method2377(122.toByte())) {
                            method4001(class318_sub1)
                            if (class318_sub1.anInt6389 != -1) CutsceneSequenceData.aClass318_Sub1Array3737!![LoadingScreenImageNode.anInt9504++] = class318_sub1
                        } else {
                            method4001(class318_sub1)
                            if (class318_sub1.anInt6389 != -1) RemoveRoofsOptionState.aClass318_Sub1Array6066!![ProportionalScrollbarComponent.anInt9930++] = class318_sub1
                        }
                    }
                    class318_sub1 = class318_sub1.aClass318_Sub1_6379
                }
                if (!bool) {
                    for (i_5_ in 0..<DrawListState.anInt1477) {
                        if (!CharacterRenderState.method2778((ModelDataCache.aClass318_Sub1_Sub3Array357!![i_5_]!!), bool, `is`, i, i_0_)) {
                            OpenGlTerrainTile.method4001(ModelDataCache.aClass318_Sub1_Sub3Array357!![i_5_]!!)
                            if ((ModelDataCache.aClass318_Sub1_Sub3Array357!![i_5_]!!.anInt6389) != -1) {
                                if (ModelDataCache.aClass318_Sub1_Sub3Array357!![i_5_]!!.method2377(122.toByte())) CutsceneSequenceData.aClass318_Sub1Array3737!![LoadingScreenImageNode.anInt9504++] = (ModelDataCache.aClass318_Sub1_Sub3Array357!![i_5_])
                                else RemoveRoofsOptionState.aClass318_Sub1Array6066!![ProportionalScrollbarComponent.anInt9930++] = (ModelDataCache.aClass318_Sub1_Sub3Array357!![i_5_])
                            }
                        }
                    }
                }
            }
            if (ProportionalScrollbarComponent.anInt9930 > 0) {
                ParticleSystemState.method1295(RemoveRoofsOptionState.aClass318_Sub1Array6066!!, 0, ProportionalScrollbarComponent.anInt9930 - 1)
                for (i_6_ in 0..<ProportionalScrollbarComponent.anInt9930) MinimapRectClipper.method227(RemoveRoofsOptionState.aClass318_Sub1Array6066!![i_6_]!!, true, bool_3_)
            }
            if (ProjectedGroundDecor.aBoolean10221) Class9.aRenderer171!!.method3642(0, null)
            if ((i_2_ and 0x2) == 0) {
                for (i_7_ in DelegatingRenderCanvas.anInt67..<MapAreaDefinition.anInt2524) {
                    if (i_7_ >= i && `is` != null) {
                        var i_8_ = Class99.aBooleanArrayArray1572!!.size
                        if ((ByteArrayPool.anInt492 + Class99.aBooleanArrayArray1572!!.size) > SpotAnimEntity.anInt6451) i_8_ -= (ByteArrayPool.anInt492 + Class99.aBooleanArrayArray1572!!.size - SpotAnimEntity.anInt6451)
                        var i_9_ = Class99.aBooleanArrayArray1572!![0]!!.size
                        if ((IntPair.anInt6974 + Class99.aBooleanArrayArray1572!![0]!!.size) > RegionSceneShifter.anInt7054) i_9_ -= (IntPair.anInt6974 + Class99.aBooleanArrayArray1572!![0]!!.size - RegionSceneShifter.anInt7054)
                        var bools = FacingDirectionNode.aBooleanArrayArray6656
                        if (SpriteTextureNode.aBoolean9242) {
                            if (VoronoiNoiseTextureNode.aBoolean9121) bools = OverlayColorTable.aBooleanArrayArrayArray1751!![i_7_]
                            for (i_10_ in AnimatedModelRenderer.anInt8412..<i_8_) {
                                val i_11_ = (i_10_ + ByteArrayPool.anInt492 - AnimatedModelRenderer.anInt8412)
                                for (i_12_ in WorldMapRenderer.anInt4686..<i_9_) {
                                    bools!![i_10_]!![i_12_] = false
                                    if (Class99.aBooleanArrayArray1572!![i_10_]!![i_12_]) {
                                        val i_13_ = (i_12_ + IntPair.anInt6974 - WorldMapRenderer.anInt4686)
                                        for (i_14_ in i_7_ downTo 0) {
                                            if ((HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i_14_]!![i_11_]!![i_13_]) != null && (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i_14_]!![i_11_]!![i_13_]!!.aByte4399).toInt() == i_7_) {
                                                bools[i_10_]!![i_12_] = (i_14_ < i || (`is`[i_14_]!![i_11_]!![i_13_]) != i_0_) && (!IndexedSprite.method164(i_7_, i_11_, (-97).toByte(), i_13_))
                                                break
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (VoronoiNoiseTextureNode.aBoolean9121) {
                            if (i_1_ >= 0) NativeSprite.aTerrainTileArray5191!![i_7_]!!.method3984(0, 0, 0, null, false, i_1_, i_2_)
                            else NativeSprite.aTerrainTileArray5191!![i_7_]!!.method3983(0, 0, 0, null, false, i_2_)
                            for (i_15_ in 0..<Npc.anInt10503) MapElementDefinitionCache.aCacheIndexManagerArray3982!![i_15_]!!.method2359(SceneModelBuilder(i_7_ + 1), -1)
                        } else if (i_1_ >= 0) NativeSprite.aTerrainTileArray5191!![i_7_]!!.method3984(DisplayModeOptionState.anInt6111, GlIndexBufferArb.anInt8502, NpcActorEntity.anInt10084, FacingDirectionNode.aBooleanArrayArray6656!!, false, i_1_, i_2_)
                        else NativeSprite.aTerrainTileArray5191!![i_7_]!!.method3983(DisplayModeOptionState.anInt6111, GlIndexBufferArb.anInt8502, NpcActorEntity.anInt10084, FacingDirectionNode.aBooleanArrayArray6656!!, false, i_2_)
                    } else {
                        var i_16_ = Class99.aBooleanArrayArray1572!!.size
                        if ((ByteArrayPool.anInt492 + Class99.aBooleanArrayArray1572!!.size) > SpotAnimEntity.anInt6451) i_16_ -= (ByteArrayPool.anInt492 + Class99.aBooleanArrayArray1572!!.size - SpotAnimEntity.anInt6451)
                        var i_17_ = Class99.aBooleanArrayArray1572!![0]!!.size
                        if ((IntPair.anInt6974 + Class99.aBooleanArrayArray1572!![0]!!.size) > RegionSceneShifter.anInt7054) i_17_ -= (IntPair.anInt6974 + Class99.aBooleanArrayArray1572!![0]!!.size - RegionSceneShifter.anInt7054)
                        var bools = FacingDirectionNode.aBooleanArrayArray6656
                        if (SpriteTextureNode.aBoolean9242) {
                            if (VoronoiNoiseTextureNode.aBoolean9121) bools = OverlayColorTable.aBooleanArrayArrayArray1751!![i_7_]
                            for (i_18_ in AnimatedModelRenderer.anInt8412..<i_16_) {
                                val i_19_ = (i_18_ + ByteArrayPool.anInt492 - AnimatedModelRenderer.anInt8412)
                                for (i_20_ in WorldMapRenderer.anInt4686..<i_17_) {
                                    bools!![i_18_]!![i_20_] = (Class99.aBooleanArrayArray1572!![i_18_]!![i_20_]) && !IndexedSprite.method164(i_7_, i_19_, (-97).toByte(), (i_20_ + (IntPair.anInt6974) - (WorldMapRenderer.anInt4686)))
                                }
                            }
                        }
                        if (VoronoiNoiseTextureNode.aBoolean9121) {
                            if (i_1_ >= 0) NativeSprite.aTerrainTileArray5191!![i_7_]!!.method3984(0, 0, 0, null, false, i_1_, i_2_)
                            else NativeSprite.aTerrainTileArray5191!![i_7_]!!.method3983(0, 0, 0, null, false, i_2_)
                            for (i_21_ in 0..<Npc.anInt10503) MapElementDefinitionCache.aCacheIndexManagerArray3982!![i_21_]!!.method2359(SceneModelBuilder(i_7_ + 1), -1)
                        } else if (i_1_ >= 0) NativeSprite.aTerrainTileArray5191!![i_7_]!!.method3984(DisplayModeOptionState.anInt6111, GlIndexBufferArb.anInt8502, NpcActorEntity.anInt10084, FacingDirectionNode.aBooleanArrayArray6656!!, true, i_1_, i_2_)
                        else NativeSprite.aTerrainTileArray5191!![i_7_]!!.method3983(DisplayModeOptionState.anInt6111, GlIndexBufferArb.anInt8502, NpcActorEntity.anInt10084, FacingDirectionNode.aBooleanArrayArray6656!!, true, i_2_)
                    }
                }
            }
            if (LoadingScreenImageNode.anInt9504 > 0) {
                TooltipComponentRenderer.method718(CutsceneSequenceData.aClass318_Sub1Array3737!!, 0, LoadingScreenImageNode.anInt9504 - 1)
                for (i_22_ in 0..<LoadingScreenImageNode.anInt9504) MinimapRectClipper.method227(CutsceneSequenceData.aClass318_Sub1Array3737!![i_22_]!!, true, bool_3_)
            }
        }

        fun method3401(i: Int, i_25_: Int, i_26_: Byte): Int {
            var i_25_ = i_25_
            anInt9745++
            if (i_26_ <= 10) return -118
            if (i == -1) return 12345678
            i_25_ = (i and 0x7f) * i_25_ shr 7
            if (i_25_ < 2) i_25_ = 2
            else if (i_25_ > 126) i_25_ = 126
            return i_25_ + (i and 0xff80)
        }

        fun method3402(i: Byte) {
            if (PrivilegedOperationWorker.aString3782!!.lowercase(Locale.getDefault()).indexOf("microsoft") == -1) {
                GlIndexBufferArb.anIntArray8507!![46] = 72
                GlIndexBufferArb.anIntArray8507!![92] = 74
                GlIndexBufferArb.anIntArray8507!![44] = 71
                GlIndexBufferArb.anIntArray8507!![61] = 27
                GlIndexBufferArb.anIntArray8507!![91] = 42
                if (PrivilegedOperationWorker.aMethod3783 == null) {
                    GlIndexBufferArb.anIntArray8507!![192] = 58
                    GlIndexBufferArb.anIntArray8507!![222] = 59
                } else {
                    GlIndexBufferArb.anIntArray8507!![520] = 59
                    GlIndexBufferArb.anIntArray8507!![192] = 28
                    GlIndexBufferArb.anIntArray8507!![222] = 58
                }
                GlIndexBufferArb.anIntArray8507!![45] = 26
                GlIndexBufferArb.anIntArray8507!![47] = 73
                GlIndexBufferArb.anIntArray8507!![59] = 57
                GlIndexBufferArb.anIntArray8507!![93] = 43
            } else {
                GlIndexBufferArb.anIntArray8507!![222] = 59
                GlIndexBufferArb.anIntArray8507!![187] = 27
                GlIndexBufferArb.anIntArray8507!![186] = 57
                GlIndexBufferArb.anIntArray8507!![221] = 43
                GlIndexBufferArb.anIntArray8507!![219] = 42
                GlIndexBufferArb.anIntArray8507!![191] = 73
                GlIndexBufferArb.anIntArray8507!![190] = 72
                GlIndexBufferArb.anIntArray8507!![220] = 74
                GlIndexBufferArb.anIntArray8507!![188] = 71
                GlIndexBufferArb.anIntArray8507!![189] = 26
                GlIndexBufferArb.anIntArray8507!![192] = 58
                GlIndexBufferArb.anIntArray8507!![223] = 28
            }
            anInt9742++
            if (i > -20) aBoolean9746 = false
        }

        @JvmStatic
        fun method3403(i: Int) {
            if (i >= 58) {
                aRectangleRegion_9748 = null
                aFontMetaRef_9749 = null
                aFontMetaRef_9743 = null
            }
        }

        init {
            anInt9750 = 0
            aFontMetaRef_9749 = FontMetaRef(45, 7)
        }
    }
}
