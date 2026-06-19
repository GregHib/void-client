import DoublyLinkedNodeListStatics.method1879
import LinkedListNodeStatics.aClass318_Sub1Array4293
import WalkingTypeUtil.method1978
import SynthVoiceGroupStatics.method2826
import SoundBankPatchStatics.method2929
import TimedRecordAccessorStatics.method3309
import jaggl.OpenGLStatics.glBindRenderbufferEXT
import jaggl.OpenGLStatics.glFramebufferRenderbufferEXT
import jaggl.OpenGLStatics.glGenRenderbuffersEXT
import jaggl.OpenGLStatics.glRenderbufferStorageEXT
import jaggl.OpenGLStatics.glRenderbufferStorageMultisampleEXT
import kotlin.math.sqrt

object RenderbufferObjectStatics {
    var anInt8561: Int = 0
            var anInt8566: Int = 0
            var anInt8568: Int = 0
            var anInt8570: Int = 0
            @JvmField
            var aLong8573: Long = 0L
    
            fun method3171(var_renderer: Renderer?, i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, bool: Boolean, bool_5_: Boolean) {
                NativeLibraryState.aRenderer171 = var_renderer
                NpcStatics.anInt10503 = i
                VoronoiNoiseTextureNodeStatics.aBoolean9121 = (NpcStatics.anInt10503 > 1 && NativeLibraryState.aRenderer171!!.method3708())
                Tooltip.anInt4459 = i_0_
                ArchiveFileConditionWrapperStatics.anInt3465 = 1 shl Tooltip.anInt4459
                TheoraVideoStreamStatics.anInt9037 = ArchiveFileConditionWrapperStatics.anInt3465 shr 1
                sqrt(((TheoraVideoStreamStatics.anInt9037 * TheoraVideoStreamStatics.anInt9037) + (TheoraVideoStreamStatics.anInt9037 * TheoraVideoStreamStatics.anInt9037)).toDouble())
                MapAreaDefinitionStatics.anInt2524 = i_1_
                SpotAnimEntityStatics.anInt6451 = i_2_
                RegionSceneShifterStatics.anInt7054 = i_3_
                NpcActorEntityStatics.anInt10084 = i_4_
                MinimapLineDrawerStatics.aNanoTimer_5262 = method2826(15)
                method3309(-124)
                WorldMapImageBuilderStatics.aSceneCollisionEntryArrayArrayArray1148 = (Array<Array<Array<SceneCollisionEntry?>?>?>(i_1_) { Array<Array<SceneCollisionEntry?>?>(SpotAnimEntityStatics.anInt6451) { arrayOfNulls<SceneCollisionEntry>(RegionSceneShifterStatics.anInt7054) } })
                TerrainTileShapeStatics.aTerrainTileArray8801 = arrayOfNulls<TerrainTile>(i_1_)
                if (bool) {
                    WidgetRedrawRegionStatics.anIntArrayArray4253 = Array<IntArray?>(SpotAnimEntityStatics.anInt6451) { IntArray(RegionSceneShifterStatics.anInt7054) }
                    HashTileShapeStatics.aByteArrayArray8816 = Array<ByteArray?>(SpotAnimEntityStatics.anInt6451) { ByteArray(RegionSceneShifterStatics.anInt7054) }
                    BooleanGraphicsOptionStateStatics.aShortArrayArray5847 = Array<ShortArray?>(SpotAnimEntityStatics.anInt6451) { ShortArray(RegionSceneShifterStatics.anInt7054) }
                    ProducerImageSurfaceStatics.aSceneCollisionEntryArrayArrayArray9082 = (Array<Array<Array<SceneCollisionEntry?>?>?>(1) { Array<Array<SceneCollisionEntry?>?>(SpotAnimEntityStatics.anInt6451) { arrayOfNulls<SceneCollisionEntry>(RegionSceneShifterStatics.anInt7054) } })
                    SoundCacheState.aTerrainTileArray4142 = arrayOfNulls<TerrainTile>(1)
                } else {
                    WidgetRedrawRegionStatics.anIntArrayArray4253 = null
                    HashTileShapeStatics.aByteArrayArray8816 = null
                    BooleanGraphicsOptionStateStatics.aShortArrayArray5847 = null
                    ProducerImageSurfaceStatics.aSceneCollisionEntryArrayArrayArray9082 = null
                    SoundCacheState.aTerrainTileArray4142 = null
                }
                if (bool_5_) {
                    HardCacheEntryReferenceStatics.aLongArrayArrayArray10431 = Array<Array<LongArray?>?>(i_1_) { Array<LongArray?>(i_2_) { LongArray(i_3_) } }
                    WaterDetailOptionStateStatics.aSoundEnvelopeArray5993 = arrayOfNulls<SoundEnvelope>(65535)
                    RenderNodeStatics.aBooleanArray9718 = BooleanArray(65535)
                    CalendarUtil.anInt4135 = 0
                } else {
                    HardCacheEntryReferenceStatics.aLongArrayArrayArray10431 = null
                    WaterDetailOptionStateStatics.aSoundEnvelopeArray5993 = null
                    RenderNodeStatics.aBooleanArray9718 = null
                    CalendarUtil.anInt4135 = 0
                }
                method1879(false)
                aClass318_Sub1Array4293 = arrayOfNulls<SceneEntity>(2)
                BackgroundWorkerThreadStatics.aClass318_Sub1Array3226 = arrayOfNulls<SceneEntity>(2)
                OverlayColorTable.aClass318_Sub1Array1754 = arrayOfNulls<SceneEntity>(2)
                RemoveRoofsOptionStateStatics.aClass318_Sub1Array6066 = arrayOfNulls<SceneEntity>(10000)
                ProportionalScrollbarComponentStatics.anInt9930 = 0
                CutsceneSequenceDataStatics.aClass318_Sub1Array3737 = arrayOfNulls<SceneEntity>(5000)
                LoadingScreenImageNodeStatics.anInt9504 = 0
                ModelDataCache.aClass318_Sub1_Sub3Array357 = arrayOfNulls<GroundDecorEntity>(5000)
                DrawListState.anInt1477 = 0
                SpriteBlitter.aBooleanArrayArray1572 = (Array<BooleanArray?>((NpcActorEntityStatics.anInt10084 + NpcActorEntityStatics.anInt10084 + 1)) { BooleanArray((NpcActorEntityStatics.anInt10084 + NpcActorEntityStatics.anInt10084 + 1)) })
                FacingDirectionNodeStatics.aBooleanArrayArray6656 = (Array<BooleanArray?>((NpcActorEntityStatics.anInt10084 + NpcActorEntityStatics.anInt10084 + 2)) { BooleanArray((NpcActorEntityStatics.anInt10084 + NpcActorEntityStatics.anInt10084 + 2)) })
                RefCountedHandleStatics.anIntArray2272 = IntArray((NpcActorEntityStatics.anInt10084 + NpcActorEntityStatics.anInt10084 + 2))
                PlayerSequenceSelector.aSceneObjectSpawner_1208 = PlayerSequenceSelector.aSceneObjectSpawner_1210
                if (VoronoiNoiseTextureNodeStatics.aBoolean9121) {
                    OverlayColorTable.aBooleanArrayArrayArray1751 = (Array<Array<BooleanArray?>?>(i_1_) { Array<BooleanArray?>((NpcActorEntityStatics.anInt10084 + NpcActorEntityStatics.anInt10084 + 1)) { BooleanArray((NpcActorEntityStatics.anInt10084 + NpcActorEntityStatics.anInt10084 + 1)) } })
                    SolidFillComponentStatics.aBooleanArrayArrayArray8361 = arrayOfNulls<Array<BooleanArray?>>(i_1_)
                    if (NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432 != null) method1978()
                    NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432 = arrayOfNulls<SceneLoaderThread>(NpcStatics.anInt10503)
                    NativeLibraryState.aRenderer171!!.method3631((NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432)!!.size + 1)
                    NativeLibraryState.aRenderer171!!.method3659(0)
                    for (i_6_ in NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!!.indices) {
                        NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![i_6_] = SceneLoaderThread(i_6_ + 1, NativeLibraryState.aRenderer171!!)
                        Thread(NormalMapTextureNodeStatics.aSceneLoaderThreadArray9432!![i_6_], "wr" + i_6_).start()
                    }
                    val i_7_: Int
                    if (NpcStatics.anInt10503 == 2) {
                        i_7_ = 4
                        ActiveMapRegion.anInt5652 = 2
                    } else if (NpcStatics.anInt10503 == 3) {
                        i_7_ = 6
                        ActiveMapRegion.anInt5652 = 3
                    } else {
                        i_7_ = 8
                        ActiveMapRegion.anInt5652 = 4
                    }
                    MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982 = arrayOfNulls<CacheIndexManager>(i_7_)
                    for (i_8_ in 0..<i_7_) MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![i_8_] = CacheIndexManager(SceneryDetailOptionStateStatics.aStringArrayArray6093!![(NpcStatics.anInt10503 - 2)]!![i_8_])
                } else ActiveMapRegion.anInt5652 = 1
                WidgetDefinitionStatics.anIntArray256 = IntArray(ActiveMapRegion.anInt5652 - 1)
                ParticleProcessorStatics.anIntArray4271 = IntArray(ActiveMapRegion.anInt5652 - 1)
            }
}
