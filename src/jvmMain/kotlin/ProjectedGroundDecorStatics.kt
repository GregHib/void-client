import kotlin.math.atan2
import kotlin.math.min

object ProjectedGroundDecorStatics {
    @JvmField
            var anInt10200: Int = 0
            private var aShortArrayArray10204: Array<ShortArray?>?
            @JvmField
            var anInt10205: Int = 0
            @JvmField
            var aVarpStore_10209: VarpStore? = null
            @JvmField
            var anInt10212: Int = 0
            @JvmField
            var anInt10214: Int = 0
            @JvmField
            var anInt10216: Int = 0
            @JvmField
            var aBoolean10221: Boolean = false
            @JvmField
            var anInt10228: Int = 0
            @JvmField
            var anInt10233: Int = 0
            @JvmField
            var anInt10235: Int = 0
            @JvmField
            var aBoolean10238: Boolean
            private var aShortArrayArray10246: Array<ShortArray?>? = arrayOf<ShortArray?>(ShortArray(0), ShortArray(0), ShortArray(0), ShortArray(0), ShortArray(0))
            @JvmField
            var anInt10249: Int = 0
            @JvmField
            var anInt10251: Int = 0
            @JvmField
            var aShortArrayArrayArray10253: Array<Array<ShortArray?>?>?
            @JvmField
            var anInt10254: Int = 0
            @JvmField
            var anInt10256: Int = 0
            @JvmField
            var anInt10257: Int = 0
            var aShortArrayArray10258: Array<ShortArray?>?
            @JvmField
            var anInt10262: Int = 0
            @JvmField
            var anInt10263: Int = 0
            @JvmField
            var anIntArray10266: IntArray? = IntArray(256)
            @JvmField
            var anInt10272: Int = 0
            @JvmField
            var anInt10277: Int = 0
            @JvmField
            var anInt10281: Int = 0
            @JvmField
            var anInt10297: Int = 0
            @JvmField
            var anInt10298: Int = 0
            @JvmField
            var anInt10299: Int = 0
            @JvmField
            var anInt10307: Int = 0
            @JvmField
            var anInt10311: Int = 0
            @JvmField
            var anInt10313: Int = 0
            @JvmStatic
            fun method2420(i: Int, i_0_: Int) {
                if (i_0_ != -1) aBoolean10238 = false
                Gl3dTextureStatics.anInt8628 = i
                anInt10272++
                ParticleGeometryStatics.aLruByteCache_4417!!.method590(0)
            }
    
            @JvmStatic
            fun method2429(i: Int) {
                aVarpStore_10209 = null
                aShortArrayArray10246 = null
                anIntArray10266 = null
                aShortArrayArray10204 = null
                aShortArrayArrayArray10253 = null
                if (i > -101) aShortArrayArray10246 = null
                aShortArrayArray10258 = null
            }
    
            @JvmStatic
            fun method2431(i: Int, i_56_: Int, class348_sub42_sub13: ContactList?, i_57_: Int, i_58_: Int, i_59_: Int, i_60_: Int, var_renderer: Renderer?, i_61_: Int, i_62_: Int, i_63_: Int, i_64_: Int) {
                var i = i
                try {
                    if (i_62_ < 111) aShortArrayArray10246 = null
                    if (i_63_ < i_57_ && i_57_ < i_58_ + i_63_ && i_60_ > i_56_ - 13 && i_60_ < 3 + i_56_) i = i_59_
                    anInt10212++
                    val string = MenuActionNodeStatics.method2812(-44, class348_sub42_sub13!!)
                    NodeDequeStatics.aFont_3326!!.method2567(i_56_, string, 120.toByte(), i, 0, i_63_ - -3, TileRenderStateStatics.aAbstractModelRendererArray4234, SizeBoundedSoftCacheStatics.anIntArray2330)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("kda.VA(" + i + ',' + i_56_ + ',' + (if (class348_sub42_sub13 != null) "{...}" else "null") + ',' + i_57_ + ',' + i_58_ + ',' + i_59_ + ',' + i_60_ + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_61_ + ',' + i_62_ + ',' + i_63_ + ',' + i_64_ + ')'))
                }
            }
    
            @JvmStatic
            fun method2433() {
                if (WorldMapImageBuilderStatics.aSceneCollisionEntryArrayArrayArray1148 != null) {
                    for (i in WorldMapImageBuilderStatics.aSceneCollisionEntryArrayArrayArray1148!!.indices) {
                        for (i_80_ in 0..<SpotAnimEntityStatics.anInt6451) {
                            for (i_81_ in 0..<RegionSceneShifterStatics.anInt7054) {
                                if ((WorldMapImageBuilderStatics.aSceneCollisionEntryArrayArrayArray1148!![i]!![i_80_]!![i_81_]) != null) WorldMapImageBuilderStatics.aSceneCollisionEntryArrayArrayArray1148!![i]!![i_80_]!![i_81_]!!.method3485(true)
                                WorldMapImageBuilderStatics.aSceneCollisionEntryArrayArrayArray1148!![i]!![i_80_]!![i_81_] = null
                            }
                        }
                    }
                }
                WorldMapImageBuilderStatics.aSceneCollisionEntryArrayArrayArray1148 = null
                TerrainTileShapeStatics.aTerrainTileArray8801 = null
                if (ProducerImageSurfaceStatics.aSceneCollisionEntryArrayArrayArray9082 != null) {
                    for (i in ProducerImageSurfaceStatics.aSceneCollisionEntryArrayArrayArray9082!!.indices) {
                        for (i_82_ in 0..<SpotAnimEntityStatics.anInt6451) {
                            for (i_83_ in 0..<RegionSceneShifterStatics.anInt7054) {
                                if ((ProducerImageSurfaceStatics.aSceneCollisionEntryArrayArrayArray9082!![i]!![i_82_]!![i_83_]) != null) ProducerImageSurfaceStatics.aSceneCollisionEntryArrayArrayArray9082!![i]!![i_82_]!![i_83_]!!.method3485(true)
                                ProducerImageSurfaceStatics.aSceneCollisionEntryArrayArrayArray9082!![i]!![i_82_]!![i_83_] = null
                            }
                        }
                    }
                }
                ProducerImageSurfaceStatics.aSceneCollisionEntryArrayArrayArray9082 = null
                SoundCacheState.aTerrainTileArray4142 = null
                HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029 = null
                NativeSpriteStatics.aTerrainTileArray5191 = null
                SpriteBlitter.aBooleanArrayArray1572 = null
                FacingDirectionNodeStatics.aBooleanArrayArray6656 = null
                RefCountedHandleStatics.anIntArray2272 = null
                OverlayColorTable.aBooleanArrayArrayArray1751 = null
                SolidFillComponentStatics.aBooleanArrayArrayArray8361 = null
                LocalizedTextStatics.method2062(89.toByte())
                if (ModelDataCache.aClass318_Sub1_Sub3Array357 != null) {
                    for (i in 0..<DrawListState.anInt1477) ModelDataCache.aClass318_Sub1_Sub3Array357!![i] = null
                    DrawListState.anInt1477 = 0
                }
                LinkedListNodeStatics.aClass318_Sub1Array4293 = null
                BackgroundWorkerThreadStatics.aClass318_Sub1Array3226 = null
                OverlayColorTable.aClass318_Sub1Array1754 = null
                if (RemoveRoofsOptionStateStatics.aClass318_Sub1Array6066 != null) {
                    for (i in RemoveRoofsOptionStateStatics.aClass318_Sub1Array6066!!.indices) RemoveRoofsOptionStateStatics.aClass318_Sub1Array6066!![i] = null
                    ProportionalScrollbarComponentStatics.anInt9930 = 0
                }
                if (CutsceneSequenceDataStatics.aClass318_Sub1Array3737 != null) {
                    for (i in CutsceneSequenceDataStatics.aClass318_Sub1Array3737!!.indices) CutsceneSequenceDataStatics.aClass318_Sub1Array3737!![i] = null
                    LoadingScreenImageNodeStatics.anInt9504 = 0
                }
                if (WaterDetailOptionStateStatics.aSoundEnvelopeArray5993 != null) {
                    for (i in 0..<CalendarUtil.anInt4135) WaterDetailOptionStateStatics.aSoundEnvelopeArray5993!![i] = null
                    for (i in 0..<MapAreaDefinitionStatics.anInt2524) {
                        for (i_84_ in 0..<SpotAnimEntityStatics.anInt6451) {
                            for (i_85_ in 0..<RegionSceneShifterStatics.anInt7054) HardCacheEntryReferenceStatics.aLongArrayArrayArray10431!![i]!![i_84_]!![i_85_] = 0L
                        }
                    }
                    CalendarUtil.anInt4135 = 0
                }
                MapElementManager.method3513(-120)
                PlayerSequenceSelector.aSceneObjectSpawner_1208 = PlayerSequenceSelector.aSceneObjectSpawner_1210
                PlayerSequenceSelector.aSceneObjectSpawner_1208!!.method775(69.toByte())
                HashTileShapeStatics.aByteArrayArray8816 = null
                WidgetRedrawRegionStatics.anIntArrayArray4253 = null
                BooleanGraphicsOptionStateStatics.aShortArrayArray5847 = null
                if (NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432 != null) {
                    WalkingTypeUtil.method1978()
                    NativeLibraryState.aRenderer171!!.method3631(1)
                    NativeLibraryState.aRenderer171!!.method3659(0)
                }
                if (MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982 != null) MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982 = null
                NativeLibraryState.aRenderer171 = null
            }
    
            init {
                aBoolean10238 = false
                aShortArrayArray10258 = (arrayOf<ShortArray?>(
                    shortArrayOf(6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545),
                    shortArrayOf(8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545),
                    shortArrayOf(25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545),
                    shortArrayOf(4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545),
                    shortArrayOf(4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545)
                ))
                aShortArrayArray10204 = arrayOf<ShortArray?>(ShortArray(0), ShortArray(0), ShortArray(0), ShortArray(0), ShortArray(0))
                aShortArrayArrayArray10253 = arrayOf<Array<ShortArray?>?>(aShortArrayArray10258, aShortArrayArray10204, aShortArrayArray10246)
            }
}
