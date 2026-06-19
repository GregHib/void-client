import Gl3dTextureStatics.method248
import SceneTilePlaneManager.method260
import LightDetailOptionStateStatics.method1802
import NoOpGraphicsOptionStateStatics.method1804
import ModelVertexColorBufferStatics.method2739
import ColourKeyTextureNodeStatics.method3120
import TileTextureNodeStatics.method3131
import FlipTextureNodeStatics.method3064
import FireParticleStreamStatics.method132
import OpenGlTerrainTileStatics.method4002
import NativeShaderProgramStatics.method3439
import java.io.IOException
import java.net.Socket
import java.net.URL

object SceneNodeDequeStatics {
    @JvmField
            var anInt1492: Int = 0
            @JvmField
            var anInt1493: Int = 0
            @JvmField
            var anInt1494: Int = 0
            @JvmField
            var anInt1495: Int = 0
            @JvmField
            var anInt1496: Int = 0
            var anInt1497: Int = 0
            @JvmField
            var anInt1498: Int = 0
            @JvmField
            var anInt1499: Int = 0
            @JvmField
            var aBoolean1500: Boolean = false
            @JvmField
            var anInt1501: Int = 0
            @JvmField
            var anInt1502: Int = 0
            @JvmField
            var anInt1504: Int = 0
            fun method841(i: Int): Array<BoxedIntHolder?> {
                anInt1504++
                return (arrayOf<BoxedIntHolder?>(SpriteSheetCacheStatics.aBoxedIntHolder_2568, MinimapRendererStatics.aBoxedIntHolder_1591, IdentKitRecolorStatics.aBoxedIntHolder_151))
            }
    
            @JvmStatic
            fun method842(bool: Boolean) {
                anInt1501++
                RectangleRegionStatics.aWidgetComponentArray1942 = null
                if (GrayscaleNoiseTextureStatics.aBoolean5300 && ContactEntryStatics.method3229(-82) != 1) method132(106, (WorldMapRendererStatics.anInt4674 == 3) || WorldMapRendererStatics.anInt4674 == 7, method3439(107), 0, PackedFlagsAccessorStatics.method3306((-111).toByte()), 0)
                var i = 0
                var i_1_ = 0
                if (GrayscaleNoiseTextureStatics.aBoolean5300) {
                    i = NativeTerrainTileStatics.method4008((-124).toByte())
                    i_1_ = method260(false)
                }
                ParticleAmountConfigStatics.method1252(i_1_, RenderNodeStatics.anInt9721, i_1_, -1, i, i + LocTypeDefinitionStatics.anInt4017, i_1_ - -HardCacheEntryReferenceStatics.anInt10432, 116.toByte(), i)
                if (RectangleRegionStatics.aWidgetComponentArray1942 != null) {
                    method3064(i, SpriteLoadValidatorStatics.anInt4792, true, AbstractTileShapeStatics.anInt6555, i_1_, CalendarUtil.aWidgetComponent_4130!!.anInt760, i + LocTypeDefinitionStatics.anInt4017, false, RectangleRegionStatics.aWidgetComponentArray1942, -1412584499, i_1_ - -HardCacheEntryReferenceStatics.anInt10432)
                    RectangleRegionStatics.aWidgetComponentArray1942 = null
                }
            }
    
            @JvmStatic
            fun method843(i: Byte) {
                anInt1499++
                if (NpcDefinitionStatics.anInt2955 != 0 && NpcDefinitionStatics.anInt2955 != 5) {
                    try {
                        val i_2_: Int
                        if (GroundDecorSceneEntityStatics.anInt9971 != 0) i_2_ = 2000
                        else i_2_ = 250
                        if (i_2_ < ++SceneRegionState.anInt197) {
                            if (PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 != null) {
                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1700(36.toByte())
                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 = null
                            }
                            if (GroundDecorSceneEntityStatics.anInt9971 >= 3) {
                                NpcDefinitionStatics.anInt2955 = 0
                                GlRectangleTextureStatics.method254(-5, (-111).toByte())
                                return
                            }
                            if (BloomGraphicsOptionStateStatics.anInt5969 != 2) ModelHeaderCacheStatics.aServerConnectionInfo_3285!!.method1259(0)
                            else CacheStateResetter.aServerConnectionInfo_125!!.method1259(0)
                            GroundDecorSceneEntityStatics.anInt9971++
                            NpcDefinitionStatics.anInt2955 = 1
                            SceneRegionState.anInt197 = 0
                        }
                        if (NpcDefinitionStatics.anInt2955 == 1) {
                            if (BloomGraphicsOptionStateStatics.anInt5969 == 2 && !LoaderStatics.splitPorts) FrameStatsResetStatics.aLinkedQueueNode_5800 = (CacheStateResetter.aServerConnectionInfo_125!!.method1262(VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!, 36.toByte()))
                            else FrameStatsResetStatics.aLinkedQueueNode_5800 = (ModelHeaderCacheStatics.aServerConnectionInfo_3285!!.method1262(VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!, 36.toByte()))
                            NpcDefinitionStatics.anInt2955 = 2
                        }
                        if (NpcDefinitionStatics.anInt2955 == 2) {
                            if (FrameStatsResetStatics.aLinkedQueueNode_5800!!.anInt1997 == 2) throw IOException()
                            if (FrameStatsResetStatics.aLinkedQueueNode_5800!!.anInt1997 != 1) return
                            PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 = NullOggStreamStatics.method2982((((FrameStatsResetStatics.aLinkedQueueNode_5800!!.anObject1998) as Socket?)!!), (-118).toByte(), 7500)
                            FrameStatsResetStatics.aLinkedQueueNode_5800 = null
                            method2739(0)
                            val class348_sub47 = ProjectileSpawner.method1478(true)
                            class348_sub47!!.aClass348_Sub49_Sub2_7116!!.writeByte(false, ScriptOpcodeHolder.aConfigIdPair_2339!!.anInt400)
                            InterfaceComponentGroupStatics.method3243(9, class348_sub47)
                            method1802(0)
                            NpcDefinitionStatics.anInt2955 = 3
                        }
                        if (NpcDefinitionStatics.anInt2955 == 3) {
                            if (!PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(1, 107)) return
                            PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(1, 0, (-118).toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                            val i_3_ = ((CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt() and 0xff)
                            if (i_3_ != 0) {
                                NpcDefinitionStatics.anInt2955 = 0
                                GlRectangleTextureStatics.method254(i_3_, (-113).toByte())
                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1700(36.toByte())
                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 = null
                                GzipDecompressorStatics.method1215(3.toByte())
                                return
                            }
                            CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                            val class348_sub49 = ByteBuffer(518)
                            val `is` = IntArray(4)
                            `is`[0] = (Math.random() * 9.9999999E7).toInt()
                            `is`[1] = (9.9999999E7 * Math.random()).toInt()
                            `is`[3] = (9.9999999E7 * Math.random()).toInt()
                            `is`[2] = (9.9999999E7 * Math.random()).toInt()
                            class348_sub49.writeByte(false, 10)
                            class348_sub49.writeInt(91.toByte(), `is`[0])
                            class348_sub49.writeInt(96.toByte(), `is`[1])
                            class348_sub49.writeInt(95.toByte(), `is`[2])
                            class348_sub49.writeInt(127.toByte(), `is`[3])
                            class348_sub49.writeLong(0L, 70.toByte())
                            class348_sub49.writeString((-5).toByte(), TextureGeneratorStatics.aString2496!!)
                            class348_sub49.writeLong(AnimationFrameDefinitionStatics.aLong6966, (-124).toByte())
                            class348_sub49.writeLong(ChatMessageStreamStatics.aLong108, (-112).toByte())
                            class348_sub49.method3390(AbstractFrameBufferSurfaceStatics.aBigInteger6921, (-76).toByte(), (ActorEntityStatics.aBigInteger8762))
                            method2739(0)
                            val class348_sub47 = ProjectileSpawner.method1478(true)
                            val class348_sub49_sub2 = (class348_sub47!!.aClass348_Sub49_Sub2_7116)!!
                            if (BloomGraphicsOptionStateStatics.anInt5969 == 2) {
                                if (WorldMapRendererStatics.anInt4674 != 13) class348_sub49_sub2.writeByte(false, ScriptOpcodeHolder.aConfigIdPair_2342!!.anInt400)
                                else class348_sub49_sub2.writeByte(false, ScriptOpcodeHolder.aConfigIdPair_2344!!.anInt400)
                                class348_sub49_sub2.writeShort(107.toByte(), 0)
                                val i_6_ = class348_sub49_sub2.anInt7197
                                class348_sub49_sub2.writeInt(117.toByte(), 634)
                                class348_sub49_sub2.writeBytes(class348_sub49.anInt7197, 0, class348_sub49.aByteArray7154!!, 92)
                                val i_7_ = class348_sub49_sub2.anInt7197
                                class348_sub49_sub2.writeString((-5).toByte(), OpenGlModelStatics.aString5600!!)
                                class348_sub49_sub2.writeByte(false, (TextureLoadExceptionStatics.anInt4596))
                                class348_sub49_sub2.writeByte(false, ContactEntryStatics.method3229(-71))
                                class348_sub49_sub2.writeShort(107.toByte(), LocTypeDefinitionStatics.anInt4017)
                                class348_sub49_sub2.writeShort(107.toByte(), HardCacheEntryReferenceStatics.anInt10432)
                                class348_sub49_sub2.writeByte(false, IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub20_7248!!.method1808(-32350))
                                method4002(class348_sub49_sub2, 55.toByte())
                                class348_sub49_sub2.writeString((-5).toByte(), BloomGraphicsOptionStateStatics.aString5966!!)
                                class348_sub49_sub2.writeInt(120.toByte(), SocketStreamWorkerStatics.anInt2670)
                                val class348_sub49_8_ = IntHashSetStatics.aClass348_Sub51_3959!!.method3427(24)
                                class348_sub49_sub2.writeByte(false, (class348_sub49_8_.anInt7197))
                                class348_sub49_sub2.writeBytes(class348_sub49_8_.anInt7197, 0, (class348_sub49_8_.aByteArray7154!!), 74)
                                RenderNodeStatics.aBoolean9719 = true
                                val class348_sub49_9_ = ByteBuffer(NoiseTextureNodeStatics.aClass348_Sub4_9264!!.method2746((-76).toByte()))
                                NoiseTextureNodeStatics.aClass348_Sub4_9264!!.method2747(1, class348_sub49_9_)
                                class348_sub49_sub2.writeBytes((class348_sub49_9_.aByteArray7154!!).size, 0, (class348_sub49_9_.aByteArray7154!!), -73)
                                class348_sub49_sub2.writeShort(107.toByte(), GlArrayBufferObjectStatics.anInt4718)
                                class348_sub49_sub2.writeLong(TextureMetadataProviderStatics.aLong4615, (-63).toByte())
                                class348_sub49_sub2.writeByte(false, if (Gl2dTextureStatics.aString8605 == null) 0 else 1)
                                if (Gl2dTextureStatics.aString8605 != null) class348_sub49_sub2.writeString((-5).toByte(), (Gl2dTextureStatics.aString8605!!))
                                class348_sub49_sub2.writeByte(false, (if (!method3131(50.toByte(), "jagtheora")) 0 else 1))
                                SettingsCrcWriter.method1244(64, class348_sub49_sub2)
                                class348_sub49_sub2.method3350(i_7_, true, `is`, (class348_sub49_sub2.anInt7197))
                                class348_sub49_sub2.method3383(1809639944, -i_6_ + (class348_sub49_sub2.anInt7197))
                            } else {
                                class348_sub49_sub2.writeByte(false, ScriptOpcodeHolder.aConfigIdPair_2345!!.anInt400)
                                class348_sub49_sub2.writeShort(107.toByte(), 0)
                                val i_4_ = class348_sub49_sub2.anInt7197
                                class348_sub49_sub2.writeInt(119.toByte(), 634)
                                class348_sub49_sub2.writeBytes(class348_sub49.anInt7197, 0, class348_sub49.aByteArray7154!!, -109)
                                val i_5_ = class348_sub49_sub2.anInt7197
                                class348_sub49_sub2.writeString((-5).toByte(), OpenGlModelStatics.aString5600!!)
                                class348_sub49_sub2.writeByte(false, HardCacheEntryReferenceStatics.aSceneProjector_10434!!.anInt2987)
                                class348_sub49_sub2.writeByte(false, AnimationFrameDefinitionStatics.anInt6967)
                                method4002(class348_sub49_sub2, 55.toByte())
                                class348_sub49_sub2.writeString((-5).toByte(), BloomGraphicsOptionStateStatics.aString5966!!)
                                class348_sub49_sub2.writeInt(106.toByte(), SocketStreamWorkerStatics.anInt2670)
                                SettingsCrcWriter.method1244(92, class348_sub49_sub2)
                                class348_sub49_sub2.method3350(i_5_, true, `is`, (class348_sub49_sub2.anInt7197))
                                class348_sub49_sub2.method3383(1809639944, -i_4_ + (class348_sub49_sub2.anInt7197))
                            }
                            InterfaceComponentGroupStatics.method3243(-48, class348_sub47)
                            method1802(0)
                            TheoraVideoStreamStatics.aIsaacCipher_9029 = IsaacCipher(`is`)
                            for (i_10_ in 0..3) `is`[i_10_] += 50
                            CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.method3406(-111, `is`)
                            NpcDefinitionStatics.anInt2955 = 4
                        }
                        if (NpcDefinitionStatics.anInt2955 == 4) {
                            if (!PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(1, 94)) return
                            PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(1, 0, (-117).toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                            val i_11_ = ((CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt() and 0xff)
                            if (i_11_ != 21) {
                                if (i_11_ == 29) NpcDefinitionStatics.anInt2955 = 13
                                else {
                                    if (i_11_ == 1) {
                                        NpcDefinitionStatics.anInt2955 = 5
                                        GlRectangleTextureStatics.method254(i_11_, (-125).toByte())
                                        return
                                    }
                                    if (i_11_ != 2) {
                                        if (i_11_ != 15) {
                                            if (i_11_ == 23 && GroundDecorSceneEntityStatics.anInt9971 < 3) {
                                                NpcDefinitionStatics.anInt2955 = 1
                                                GroundDecorSceneEntityStatics.anInt9971++
                                                SceneRegionState.anInt197 = 0
                                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1700(36.toByte())
                                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 = null
                                            } else {
                                                NpcDefinitionStatics.anInt2955 = 0
                                                GlRectangleTextureStatics.method254(i_11_, (-87).toByte())
                                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1700(36.toByte())
                                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 = null
                                                GzipDecompressorStatics.method1215(3.toByte())
                                                return
                                            }
                                            return
                                        }
                                        NpcDefinitionStatics.anInt2955 = 14
                                        RadialTextureNodeStatics.anInt9341 = -2
                                    } else NpcDefinitionStatics.anInt2955 = 8
                                }
                            } else NpcDefinitionStatics.anInt2955 = 7
                        }
                        if (NpcDefinitionStatics.anInt2955 == 6) {
                            method2739(0)
                            val class348_sub47 = ProjectileSpawner.method1478(true)
                            val class348_sub49_sub2 = (class348_sub47!!.aClass348_Sub49_Sub2_7116)!!
                            class348_sub49_sub2.method3416(-18, TheoraVideoStreamStatics.aIsaacCipher_9029!!)
                            class348_sub49_sub2.method3408((ScriptOpcodeHolder.aConfigIdPair_2351!!.anInt400), 18676)
                            InterfaceComponentGroupStatics.method3243(-87, class348_sub47)
                            method1802(0)
                            NpcDefinitionStatics.anInt2955 = 4
                        } else if (NpcDefinitionStatics.anInt2955 == 7) {
                            if (PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(1, 118)) {
                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(1, 0, (-109).toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                                val i_12_ = 0xff and (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt()
                                NpcDefinitionStatics.anInt2955 = 0
                                SceneTileBoundsStatics.anInt1121 = (3 + i_12_) * 60
                                GlRectangleTextureStatics.method254(21, (-95).toByte())
                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1700(36.toByte())
                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 = null
                                GzipDecompressorStatics.method1215(3.toByte())
                            }
                        } else if (NpcDefinitionStatics.anInt2955 == 13) {
                            if (PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(1, 102)) {
                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(1, 0, (-128).toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                                NpcDefinitionStatics.anInt2955 = 0
                                ConfigShortValueNodeStatics.anInt9541 = 0xff and (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt()
                                GlRectangleTextureStatics.method254(29, (-97).toByte())
                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1700(36.toByte())
                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 = null
                                GzipDecompressorStatics.method1215(3.toByte())
                            }
                        } else if (NpcDefinitionStatics.anInt2955 == 8) {
                            if (PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(1, 107)) {
                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(1, 0, (-107).toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                                SceneObjectSpawnerStatics.anInt1288 = 0xff and (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt()
                                NpcDefinitionStatics.anInt2955 = 9
                            }
                        } else {
                            if (NpcDefinitionStatics.anInt2955 == 9) {
                                val class348_sub49_sub2 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813
                                if (BloomGraphicsOptionStateStatics.anInt5969 == 2) {
                                    if (!PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(SceneObjectSpawnerStatics.anInt1288, 93)) return
                                    PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(SceneObjectSpawnerStatics.anInt1288, 0, 60.toByte(), (class348_sub49_sub2!!.aByteArray7154!!))
                                    class348_sub49_sub2.anInt7197 = 0
                                    AsyncTaskHandleStatics.anInt2581 = class348_sub49_sub2.readUnsignedByte(255)
                                    MinimapSpriteRendererStatics.anInt4919 = class348_sub49_sub2.readUnsignedByte(255)
                                    RangeThresholdTextureNodeStatics.aBoolean9103 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                    PlayerUpdateDecoder.aBoolean1915 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                    RsaVarbitHandlerStatics.aBoolean4903 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                    MinimapTriangleDrawerStatics.aBoolean5233 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                    CharCodeMapStatics.anInt9591 = class348_sub49_sub2.readUnsignedShort(842397944)
                                    FrameBufferObjectStatics.aBoolean4888 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                    ModelDataCache.anInt359 = class348_sub49_sub2.method3369(125.toByte())
                                    ModelBatchBaseStatics.aBoolean1900 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                    GradientLookupEffectStatics.aSeqDefinitionCache_9195!!.method2004(ModelBatchBaseStatics.aBoolean1900, 25.toByte())
                                    ClientExceptionStatics.aModelHeaderCache_112!!.method1934(11.toByte(), ModelBatchBaseStatics.aBoolean1900)
                                    MapAreaDefinitionStatics.aBufferedMessageQueue_2529!!.method2072(88.toByte(), ModelBatchBaseStatics.aBoolean1900)
                                } else {
                                    if (!PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(SceneObjectSpawnerStatics.anInt1288, 107)) return
                                    PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(SceneObjectSpawnerStatics.anInt1288, 0, 85.toByte(), (class348_sub49_sub2!!.aByteArray7154!!))
                                    class348_sub49_sub2.anInt7197 = 0
                                    AsyncTaskHandleStatics.anInt2581 = class348_sub49_sub2.readUnsignedByte(255)
                                    MinimapSpriteRendererStatics.anInt4919 = class348_sub49_sub2.readUnsignedByte(255)
                                    RangeThresholdTextureNodeStatics.aBoolean9103 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                    PlayerUpdateDecoder.aBoolean1915 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                    RsaVarbitHandlerStatics.aBoolean4903 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                    InputSettingsState.anInt1758 = class348_sub49_sub2.readShort(13638)
                                    FrameBufferObjectStatics.aBoolean4888 = InputSettingsState.anInt1758 > 0
                                    GlArrayBufferObjectStatics.anInt4716 = class348_sub49_sub2.readUnsignedShort(842397944)
                                    ImageFrameCacheStatics.anInt4026 = class348_sub49_sub2.readUnsignedShort(842397944)
                                    FrameBufferObjectStatics.anInt4870 = class348_sub49_sub2.readUnsignedShort(842397944)
                                    VarpStoreStatics.anInt5065 = class348_sub49_sub2.readInt((-126).toByte())
                                    ChatScriptListNodeStatics.aLinkedQueueNode_9536 = VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!.method2232(116, VarpStoreStatics.anInt5065)
                                    FloatGridStatics.anInt4976 = class348_sub49_sub2.readUnsignedByte(255)
                                    FrameStatsResetStatics.anInt5797 = class348_sub49_sub2.readUnsignedShort(842397944)
                                    HslColorTableNodeStatics.anInt6632 = class348_sub49_sub2.readUnsignedShort(842397944)
                                    BufferToggleStateStatics.aBoolean3706 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                    OpenGlTerrainTileStatics.aString8265 = class348_sub49_sub2.method3371(-13487)
                                    LocalPlayerState.aPlayer_1907!!.aString10537 = OpenGlTerrainTileStatics.aString8265
                                    LocalPlayerState.aPlayer_1907!!.aString10544 = LocalPlayerState.aPlayer_1907!!.aString10537
                                    GameAppletFrameStatics.anInt37 = class348_sub49_sub2.readUnsignedByte(255)
                                    AbstractTileShapeStatics.anInt6551 = class348_sub49_sub2.readInt((-126).toByte())
                                    IndexedSpriteStatics.aServerConnectionInfo_5199 = ServerConnectionInfo()
                                    IndexedSpriteStatics.aServerConnectionInfo_5199!!.anInt2143 = class348_sub49_sub2.readUnsignedShort(842397944)
                                    if (IndexedSpriteStatics.aServerConnectionInfo_5199!!.anInt2143 == 65535) IndexedSpriteStatics.aServerConnectionInfo_5199!!.anInt2143 = -1
                                    IndexedSpriteStatics.aServerConnectionInfo_5199!!.aString2147 = class348_sub49_sub2.method3371(-13487)
                                    if (OggCacheStreamStatics.aNamedIdRecord_5271 != NpcAnimationResolverStatics.aNamedIdRecord_165) {
                                        IndexedSpriteStatics.aServerConnectionInfo_5199!!.anInt2138 = (50000 + (IndexedSpriteStatics.aServerConnectionInfo_5199!!.anInt2143))
                                        IndexedSpriteStatics.aServerConnectionInfo_5199!!.anInt2148 = (40000 + (IndexedSpriteStatics.aServerConnectionInfo_5199!!.anInt2143))
                                    }
                                    if (NpcAnimationResolverStatics.aNamedIdRecord_165 != SceneObjectSpawnerStatics.aNamedIdRecord_1279 && ((CacheStateResetter.aServerConnectionInfo_125!!.method1264(94.toByte(), GlElementArrayBufferStatics.aServerConnectionInfo_4839)) || (CacheStateResetter.aServerConnectionInfo_125!!.method1264(112.toByte(), (DirectionalLightTextureNodeStatics.aServerConnectionInfo_9443))))) SpriteRenderEntryStatics.method3283(114)
                                }
                                if ((!RangeThresholdTextureNodeStatics.aBoolean9103 || RsaVarbitHandlerStatics.aBoolean4903) && !FrameBufferObjectStatics.aBoolean4888) {
                                    try {
                                        JavaScriptBridge.method1617(125.toByte(), JagGlToolkitFactory.anApplet1530, "unzap")
                                    } catch (throwable: Throwable) {
                                        /* empty */
                                    }
                                } else {
                                    try {
                                        JavaScriptBridge.method1617(125.toByte(), JagGlToolkitFactory.anApplet1530, "zap")
                                    } catch (throwable: Throwable) {
                                        if (WallEntityStatics.aBoolean8773) {
                                            try {
                                                JagGlToolkitFactory.anApplet1530!!.showDocument(URL(JagGlToolkitFactory.anApplet1530!!.getCodeBase(), "blank.ws"), "tbi")
                                            } catch (exception: Exception) {
                                                /* empty */
                                            }
                                        }
                                    }
                                }
                                if (NpcAnimationResolverStatics.aNamedIdRecord_165 == OggCacheStreamStatics.aNamedIdRecord_5271) {
                                    try {
                                        JavaScriptBridge.method1617(125.toByte(), JagGlToolkitFactory.anApplet1530, "loggedin")
                                    } catch (throwable: Throwable) {
                                        /* empty */
                                    }
                                }
                                if (BloomGraphicsOptionStateStatics.anInt5969 == 2) NpcDefinitionStatics.anInt2955 = 11
                                else {
                                    NpcDefinitionStatics.anInt2955 = 0
                                    GlRectangleTextureStatics.method254(2, (-92).toByte())
                                    method1804(8839)
                                    ByteBufferStatics.method3379(2, 7)
                                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                                    return
                                }
                            }
                            if (NpcDefinitionStatics.anInt2955 == 11) {
                                if (!PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(3, 94)) return
                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(3, 0, 11.toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                                NpcDefinitionStatics.anInt2955 = 12
                            }
                            if (NpcDefinitionStatics.anInt2955 == 12) {
                                val class348_sub49_sub2 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813
                                class348_sub49_sub2!!.anInt7197 = 0
                                if (class348_sub49_sub2.method3404(-1510)) {
                                    if (!PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(1, 110)) return
                                    PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(1, 3, (-127).toByte(), (class348_sub49_sub2.aByteArray7154!!))
                                }
                                ModelVertexColorBufferStatics.aIntRange_6584 = (method248(-11271)[class348_sub49_sub2.method3407(15295)])
                                RadialTextureNodeStatics.anInt9341 = class348_sub49_sub2.readUnsignedShort(842397944)
                                NpcDefinitionStatics.anInt2955 = 10
                            }
                            if (NpcDefinitionStatics.anInt2955 == 10) {
                                if (PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(RadialTextureNodeStatics.anInt9341, 96)) {
                                    PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(RadialTextureNodeStatics.anInt9341, 0, 28.toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                                    CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                                    NpcDefinitionStatics.anInt2955 = 0
                                    val i_13_ = RadialTextureNodeStatics.anInt9341
                                    GlRectangleTextureStatics.method254(2, (-124).toByte())
                                    FrameStatsResetStatics.method1135(0)
                                    SimpleToggleOptionStateStatics.method1741(CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!, 118.toByte())
                                    RendererStatics.anInt4581 = -1
                                    if (ModelVertexColorBufferStatics.aIntRange_6584 != WorldListEntryStatics.aIntRange_304) method3120(-92)
                                    else RegionMapDecoder.method853(99.toByte())
                                    if (i_13_ != CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197) throw RuntimeException("lswp pos:" + (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197) + " psize:" + i_13_)
                                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                                }
                            } else {
                                val i_14_ = -128 / (-i / 53)
                                if (NpcDefinitionStatics.anInt2955 == 14) {
                                    if (RadialTextureNodeStatics.anInt9341 == -2) {
                                        if (!PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(2, 106)) return
                                        PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(2, 0, (-128).toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                                        CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                                        RadialTextureNodeStatics.anInt9341 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                                    }
                                    if (PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(RadialTextureNodeStatics.anInt9341, 117)) {
                                        PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(RadialTextureNodeStatics.anInt9341, 0, (-104).toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                                        CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                                        val i_15_ = RadialTextureNodeStatics.anInt9341
                                        NpcDefinitionStatics.anInt2955 = 0
                                        GlRectangleTextureStatics.method254(15, (-120).toByte())
                                        WidgetRedrawTrackerStatics.method2330(86.toByte())
                                        SimpleToggleOptionStateStatics.method1741(CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!, 118.toByte())
                                        if (i_15_ != (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197)) throw RuntimeException("lswpr pos:" + (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197) + " psize:" + i_15_)
                                        ModelVertexColorBufferStatics.aIntRange_6584 = null
                                    }
                                }
                            }
                        }
                    } catch (ioexception: IOException) {
                        if (PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 != null) {
                            PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1700(36.toByte())
                            PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 = null
                        }
                        if (GroundDecorSceneEntityStatics.anInt9971 >= 3) {
                            NpcDefinitionStatics.anInt2955 = 0
                            GlRectangleTextureStatics.method254(-4, (-87).toByte())
                            GzipDecompressorStatics.method1215(3.toByte())
                        } else {
                            if (BloomGraphicsOptionStateStatics.anInt5969 != 2) ModelHeaderCacheStatics.aServerConnectionInfo_3285!!.method1259(0)
                            else CacheStateResetter.aServerConnectionInfo_125!!.method1259(0)
                            GroundDecorSceneEntityStatics.anInt9971++
                            SceneRegionState.anInt197 = 0
                            NpcDefinitionStatics.anInt2955 = 1
                        }
                    }
                }
            }
    
            @JvmStatic
            fun method847(string: String, i: Int) {
                println("Error: " + TileRenderStateStatics.method2680("\n", true, "%0a", string))
                anInt1492++
                if (i != -5192) method843(17.toByte())
            }
}
