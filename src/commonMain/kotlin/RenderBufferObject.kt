import DoublyLinkedNodeList.Companion.method1879
import WalkingTypeUtil.method1978
import SynthVoiceGroup.Companion.method2826
import TimedRecordAccessor.Companion.method3309
import jaggl.OpenGL.Companion.glBindRenderbufferEXT
import jaggl.OpenGL.Companion.glFramebufferRenderbufferEXT
import jaggl.OpenGL.Companion.glGenRenderbuffersEXT
import jaggl.OpenGL.Companion.glRenderbufferStorageEXT
import jaggl.OpenGL.Companion.glRenderbufferStorageMultisampleEXT
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.math.sqrt

class RenderBufferObject : HashLinkedListNode, IndexedDisposable {
    private var anInt8562 = -1
    private var anInt8563 = -1
    private val aHa_Sub2_8564: OpenGlRenderer?
    var anInt8565: Int = 0
    private val anInt8567: Int
    private var anInt8569 = 0
    private val anInt8571: Int
    var anInt8572: Int = 0

    @Throws(Throwable::class)
    protected fun finalize() {
        anInt8570++
        method3172(4)
//        super.finalize()
    }

    fun method3172(i: Int) {
        anInt8566++
        if (anInt8569 > 0) {
            aHa_Sub2_8564!!.method3810(anInt8569, anInt8571, -101)
            anInt8569 = 0
        }
        if (i != 4) method3171(null, 57, 49, -22, 43, -43, -45, true, true)
    }

    fun method3173(i: Int, i_9_: Int, i_10_: Int) {
        glFramebufferRenderbufferEXT(i_10_, i_9_, i, anInt8569)
        anInt8568++
        anInt8562 = i_10_
        anInt8563 = i_9_
    }

    override fun method37(i: Int) {
        anInt8561++
        if (i != -3022) this.anInt8572 = 15
        glFramebufferRenderbufferEXT(anInt8562, anInt8563, 36161, 0)
        anInt8562 = -1
        anInt8563 = -1
    }

    internal constructor(var_ha_Sub2: OpenGlRenderer?, i: Int, i_11_: Int, i_12_: Int) {
        try {
            this.anInt8572 = i_11_
            aHa_Sub2_8564 = var_ha_Sub2
            this.anInt8565 = i_12_
            anInt8567 = i
            glGenRenderbuffersEXT(1, NormalMapTextureNode.anIntArray9431, 0)
            anInt8569 = NormalMapTextureNode.anIntArray9431!![0]
            glBindRenderbufferEXT(36161, anInt8569)
            glRenderbufferStorageEXT(36161, anInt8567, (this.anInt8572), (this.anInt8565))
            anInt8571 = (this.anInt8565 * this.anInt8572 * aHa_Sub2_8564!!.method3798(anInt8567, 2))
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("kw.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_11_ + ',' + i_12_ + ')'))
        }
    }

    internal constructor(var_ha_Sub2: OpenGlRenderer?, i: Int, i_13_: Int, i_14_: Int, i_15_: Int) {
        try {
            this.anInt8572 = i_13_
            anInt8567 = i
            this.anInt8565 = i_14_
            aHa_Sub2_8564 = var_ha_Sub2
            glGenRenderbuffersEXT(1, NormalMapTextureNode.anIntArray9431, 0)
            anInt8569 = NormalMapTextureNode.anIntArray9431!![0]
            glBindRenderbufferEXT(36161, anInt8569)
            glRenderbufferStorageMultisampleEXT(36161, i_15_, anInt8567, this.anInt8572, this.anInt8565)
            anInt8571 = (this.anInt8565 * this.anInt8572 * aHa_Sub2_8564!!.method3798(anInt8567, 2))
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("kw.<init>(" + (if (var_ha_Sub2 != null) "{...}" else "null") + ',' + i + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ')'))
        }
    }

    companion object {
        var anInt8561: Int = 0
        var anInt8566: Int = 0
        var anInt8568: Int = 0
        var anInt8570: Int = 0

        var aLong8573: Long = 0L

        fun method3171(var_renderer: Renderer?, i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, bool: Boolean, bool_5_: Boolean) {
            NativeLibraryState.aRenderer171 = var_renderer
            Npc.anInt10503 = i
            VoronoiNoiseTextureNode.aBoolean9121 = (Npc.anInt10503 > 1 && NativeLibraryState.aRenderer171!!.method3708())
            ActorEntity.anInt4459 = i_0_
            ActorEntity.anInt3465 = 1 shl ActorEntity.anInt4459
            ActorEntity.anInt9037 = ActorEntity.anInt3465 shr 1
            sqrt(((ActorEntity.anInt9037 * ActorEntity.anInt9037) + (ActorEntity.anInt9037 * ActorEntity.anInt9037)).toDouble())
            MapAreaDefinition.anInt2524 = i_1_
            ActorEntity.anInt6451 = i_2_
            ActorEntity.anInt7054 = i_3_
            ActorEntity.anInt10084 = i_4_
            MinimapLineDrawer.aNanoTimer_5262 = method2826(15)
            method3309(-124)
            WorldMapImageBuilder.aSceneCollisionEntryArrayArrayArray1148 = (Array<Array<Array<SceneCollisionEntry?>?>?>(i_1_) { Array<Array<SceneCollisionEntry?>?>(ActorEntity.anInt6451) { arrayOfNulls<SceneCollisionEntry>(ActorEntity.anInt7054) } })
            TerrainTileShape.aTerrainTileArray8801 = arrayOfNulls<TerrainTile>(i_1_)
            if (bool) {
                LoadingBarRenderer.anIntArrayArray4253 = Array<IntArray?>(ActorEntity.anInt6451) { IntArray(ActorEntity.anInt7054) }
                HashTileShape.aByteArrayArray8816 = Array<ByteArray?>(ActorEntity.anInt6451) { ByteArray(ActorEntity.anInt7054) }
                FlickeringGraphicsOptionState.aShortArrayArray5847 = Array<ShortArray?>(ActorEntity.anInt6451) { ShortArray(ActorEntity.anInt7054) }
                ProducerImageSurface.aSceneCollisionEntryArrayArrayArray9082 = (Array<Array<Array<SceneCollisionEntry?>?>?>(1) { Array<Array<SceneCollisionEntry?>?>(ActorEntity.anInt6451) { arrayOfNulls<SceneCollisionEntry>(ActorEntity.anInt7054) } })
                ActorEntity.aTerrainTileArray4142 = arrayOfNulls<TerrainTile>(1)
            } else {
                LoadingBarRenderer.anIntArrayArray4253 = null
                HashTileShape.aByteArrayArray8816 = null
                FlickeringGraphicsOptionState.aShortArrayArray5847 = null
                ProducerImageSurface.aSceneCollisionEntryArrayArrayArray9082 = null
                ActorEntity.aTerrainTileArray4142 = null
            }
            if (bool_5_) {
                SceneEntity.aLongArrayArrayArray10431 = Array<Array<LongArray?>?>(i_1_) { Array<LongArray?>(i_2_) { LongArray(i_3_) } }
                SceneEntity.aSoundEnvelopeArray5993 = arrayOfNulls<SoundEnvelope>(65535)
                RenderNodeStatics.aBooleanArray9718 = BooleanArray(65535)
                CalendarUtil.anInt4135 = 0
            } else {
                SceneEntity.aLongArrayArrayArray10431 = null
                SceneEntity.aSoundEnvelopeArray5993 = null
                RenderNodeStatics.aBooleanArray9718 = null
                CalendarUtil.anInt4135 = 0
            }
            method1879(false)
            LinkedListNodeStatics.aClass318_Sub1Array4293 = arrayOfNulls<SceneEntity>(2)
            BackgroundWorkerThread.aClass318_Sub1Array3226 = arrayOfNulls<SceneEntity>(2)
            OverlayColorTable.aClass318_Sub1Array1754 = arrayOfNulls<SceneEntity>(2)
            RemoveRoofsOptionState.aClass318_Sub1Array6066 = arrayOfNulls<SceneEntity>(10000)
            ProportionalScrollbarComponent.anInt9930 = 0
            GlTexture3D.aClass318_Sub1Array3737 = arrayOfNulls<SceneEntity>(5000)
            LoadingScreenImageNode.anInt9504 = 0
            ModelDataCache.aClass318_Sub1_Sub3Array357 = arrayOfNulls<GroundDecorEntity>(5000)
            DrawListState.anInt1477 = 0
            ActorEntity.aBooleanArrayArray1572 = (Array<BooleanArray?>((ActorEntity.anInt10084 + ActorEntity.anInt10084 + 1)) { BooleanArray((ActorEntity.anInt10084 + ActorEntity.anInt10084 + 1)) })
            FacingDirectionNode.aBooleanArrayArray6656 = (Array<BooleanArray?>((ActorEntity.anInt10084 + ActorEntity.anInt10084 + 2)) { BooleanArray((ActorEntity.anInt10084 + ActorEntity.anInt10084 + 2)) })
            RefCountedHandle.anIntArray2272 = IntArray((ActorEntity.anInt10084 + ActorEntity.anInt10084 + 2))
            PlayerSequenceSelector.aSceneObjectSpawner_1208 = PlayerSequenceSelector.aSceneObjectSpawner_1210
            if (VoronoiNoiseTextureNode.aBoolean9121) {
                OverlayColorTable.aBooleanArrayArrayArray1751 = (Array<Array<BooleanArray?>?>(i_1_) { Array<BooleanArray?>((ActorEntity.anInt10084 + ActorEntity.anInt10084 + 1)) { BooleanArray((ActorEntity.anInt10084 + ActorEntity.anInt10084 + 1)) } })
                SolidFillComponent.aBooleanArrayArrayArray8361 = arrayOfNulls<Array<BooleanArray?>>(i_1_)
                if (NormalMapTextureNode.aSceneLoaderThreadArray9432 != null) method1978()
                NormalMapTextureNode.aSceneLoaderThreadArray9432 = arrayOfNulls<SceneLoaderThread>(Npc.anInt10503)
                NativeLibraryState.aRenderer171!!.method3631((NormalMapTextureNode.aSceneLoaderThreadArray9432)!!.size + 1)
                NativeLibraryState.aRenderer171!!.method3659(0)
                for (i_6_ in NormalMapTextureNode.aSceneLoaderThreadArray9432!!.indices) {
                    val thread = SceneLoaderThread(i_6_ + 1, NativeLibraryState.aRenderer171!!)
                    NormalMapTextureNode.aSceneLoaderThreadArray9432!![i_6_] = thread
                    GlobalScope.launch(Dispatchers.Default + CoroutineName("wr${i_6_}")) {
                        thread.run()
                    }
                }
                val i_7_: Int
                if (Npc.anInt10503 == 2) {
                    i_7_ = 4
                    ActiveMapRegion.anInt5652 = 2
                } else if (Npc.anInt10503 == 3) {
                    i_7_ = 6
                    ActiveMapRegion.anInt5652 = 3
                } else {
                    i_7_ = 8
                    ActiveMapRegion.anInt5652 = 4
                }
                GfxTypeList.aCacheIndexManagerArray3982 = arrayOfNulls<CacheIndexManager>(i_7_)
                for (i_8_ in 0..<i_7_) GfxTypeList.aCacheIndexManagerArray3982!![i_8_] = CacheIndexManager(TextureOptionState.aStringArrayArray6093!![(Npc.anInt10503 - 2)]!![i_8_])
            } else ActiveMapRegion.anInt5652 = 1
            WidgetDefinition.anIntArray256 = IntArray(ActiveMapRegion.anInt5652 - 1)
            ParticleProcessor.anIntArray4271 = IntArray(ActiveMapRegion.anInt5652 - 1)
        }
    }
}
