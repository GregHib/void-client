import GameAppletFrameStatics.method94
import GameAppletFrameStatics.set
import AbstractMenuEntryStatics.method1034
import AbstractGameSocketStatics.method1703
import GraphicsOptionStateStatics.method1713
import ShadowQualityOptionStateStatics.method1788
import NoOpGraphicsOptionStateStatics.method1803
import DisplayModeOptionStateStatics.method1825
import TwoStateOptionStateStatics.method1844
import MultiLevelOptionStateStatics.method1851
import GlVertexBufferArbStatics.method2127
import TileSceneEntityStatics.method2396
import FontStatics.method2570
import KeyedCacheEntryReferenceStatics.method3203
import FixedFunctionWaterPassStatics.method3546
import GlRenderDeviceStatics.method3965
import InputStream_Sub2Statics.method128
import java.io.IOException

object HardCacheEntryReferenceStatics {
    @JvmField
            var anInt10430: Int = 0
            @JvmField
            var aLongArrayArrayArray10431: Array<Array<LongArray?>?>? = null
            @JvmField
            var anInt10432: Int = 0
            @JvmField
            var anInt10433: Int = 0
            @JvmField
            var aSceneProjector_10434: SceneProjector? = null
            @JvmField
            var anInt10435: Int = 0
            @JvmField
            var aSceneObjectSpawner_10436: SceneObjectSpawner? = SceneObjectSpawner(true)
            @JvmField
            var aRgbColorPalette_10437: RgbColorPalette? = RgbColorPalette(0, 3)
            @JvmField
            var anInt10438: Int = 0
    
            @JvmStatic
            fun method3200(i: Int, i_0_: Int, i_1_: Byte): Boolean {
                anInt10433++
                val i_2_ = 18 / ((i_1_ - 30) / 42)
                if (!HuffmanCodecStatics.method2224(i, (-118).toByte(), i_0_)) return false
                if (DetailLevelOptionStateStatics.method1833((-118).toByte(), i, i_0_) or ((0x9000 and i) != 0) or KaraokeSubtitleStreamStatics.method2985(-31735, i_0_, i)) return true
                return (((0x37 and i_0_) == 0) and (((0x2000 and i) != 0) or LocalizedTextStatics.method2058(i, i_0_, 88) or method3203(i_0_, 127.toByte(), i)))
            }
    
            @JvmStatic
            @Throws(IOException::class)
            fun method3201(bool: Boolean): Boolean {
                anInt10430++
                if (PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 == null) return false
                if (ModelVertexColorBufferStatics.aIntRange_6584 == null) {
                    if (GroundItemRenderState.aBoolean1661) {
                        if (!PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(1, 119)) return false
                        PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(1, 0, 6.toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                        StringCacheNodeStatics.anInt7213 = 0
                        GroundItemRenderState.aBoolean1661 = false
                        MinimapRectClipper.anInt221++
                    }
                    CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                    if (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.method3404(-1510)) {
                        if (!PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(1, 119)) return false
                        PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(1, 1, 26.toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                        MinimapRectClipper.anInt221++
                        StringCacheNodeStatics.anInt7213 = 0
                    }
                    GroundItemRenderState.aBoolean1661 = true
                    val class114s = Gl3dTextureStatics.method248(-11271)
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.method3407(15295)
                    if (i < 0 || i >= class114s.size) throw IOException("invo:" + i + " ip:" + (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197))
                    ModelVertexColorBufferStatics.aIntRange_6584 = class114s[i]
                    if (LoaderStatics.debug) {
                        println("Packet read: " + i + " length: " + ModelVertexColorBufferStatics.aIntRange_6584!!.anInt1749)
                    }
                    RadialTextureNodeStatics.anInt9341 = ModelVertexColorBufferStatics.aIntRange_6584!!.anInt1749
                }
                if (RadialTextureNodeStatics.anInt9341 == -1) {
                    if (!PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(1, 116)) return false
                    PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(1, 0, (-118).toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                    RadialTextureNodeStatics.anInt9341 = 0xff and (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt()
                    MinimapRectClipper.anInt221++
                    StringCacheNodeStatics.anInt7213 = 0
                }
                if (RadialTextureNodeStatics.anInt9341 == -2) {
                    if (!PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(2, 120)) return false
                    PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(2, 0, 127.toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                    CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                    RadialTextureNodeStatics.anInt9341 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    MinimapRectClipper.anInt221 += 2
                    StringCacheNodeStatics.anInt7213 = 0
                }
                if (RadialTextureNodeStatics.anInt9341 > 0) {
                    if (!PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(RadialTextureNodeStatics.anInt9341, 104)) return false
                    CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                    PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(RadialTextureNodeStatics.anInt9341, 0, (-123).toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                    MinimapRectClipper.anInt221 += RadialTextureNodeStatics.anInt9341
                    StringCacheNodeStatics.anInt7213 = 0
                }
                SineWaveTextureNodeStatics.aIntRange_9456 = GraphicsOptionStateStatics.aIntRange_3145
                GraphicsOptionStateStatics.aIntRange_3145 = AbstractGameSocketStatics.aIntRange_3133
                AbstractGameSocketStatics.aIntRange_3133 = ModelVertexColorBufferStatics.aIntRange_6584
                if (IOException_Sub1Statics.aIntRange_90 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    MinimapTileEntryStatics.method382(CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(118.toByte()), true)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == LoadingScreenImageNodeStatics.aIntRange_9503) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val bool_3_ = (i and 0x1) == 1
                    val string = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(108.toByte())
                    var string_4_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-92).toByte())
                    if (string_4_ == "") string_4_ = string
                    val string_5_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-64).toByte())
                    var string_6_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-97).toByte())
                    if (string_6_ == "") string_6_ = string_5_
                    if (bool_3_) {
                        var i_7_ = 0
                        while ((i_7_ < ContactEntryStatics.anInt9604)) {
                            if (ObjectSpawnDecoder.aStringArray1808!![i_7_] == string_6_) {
                                NpcConfigStatics.aStringArray932!![i_7_] = string
                                ObjectSpawnDecoder.aStringArray1808!![i_7_] = string_4_
                                WeaveTextureNodeStatics.aStringArray9275!![i_7_] = string_5_
                                IndexedSpriteStatics.aStringArray5197!![i_7_] = string_6_
                                break
                            }
                            i_7_++
                        }
                    } else {
                        NpcConfigStatics.aStringArray932!![ContactEntryStatics.anInt9604] = string
                        ObjectSpawnDecoder.aStringArray1808!![ContactEntryStatics.anInt9604] = string_4_
                        WeaveTextureNodeStatics.aStringArray9275!![(ContactEntryStatics.anInt9604)] = string_5_
                        IndexedSpriteStatics.aStringArray5197!![ContactEntryStatics.anInt9604] = string_6_
                        BasicGlRenderPassStatics.aBooleanArray7304!![ContactEntryStatics.anInt9604] = NpcSummaryDefinitionStatics.method1166(i, 2) == 2
                        ContactEntryStatics.anInt9604++
                    }
                    Crc64HashableStatics.anInt4985 = ResourceLoaderThreadStatics.anInt3918
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == SceneEffectMarkerStatics.aIntRange_6424) {
                    method128(NamedIdEntryStatics.aRgbColorPalette_6891, 8.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (HashtableStatics.aIntRange_4388 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByte(-100)
                    val i_8_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-111)
                    WallSceneEntityStatics.method2397((-126).toByte())
                    MinimapPolygonDrawerStatics.method467(i_8_, -18075, i.toInt())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (GlArrayBufferObjectStatics.aIntRange_4707 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntLittle((-123).toByte())
                    val i_9_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                    WallSceneEntityStatics.method2397((-124).toByte())
                    val class348_sub41 = (MinimapSpriteRendererStatics.aHashtable_4915!!.method3480(i_9_.toLong(), -6008) as RegionSceneShifter?)
                    val class348_sub41_10_ = (MinimapSpriteRendererStatics.aHashtable_4915!!.method3480(i.toLong(), -6008) as RegionSceneShifter?)
                    if (class348_sub41_10_ != null) ScrollingWidgetComponentNodeStatics.method1118((class348_sub41 == null || (class348_sub41_10_.anInt7050 != class348_sub41.anInt7050)), false, class348_sub41_10_, 2533)
                    if (class348_sub41 != null) {
                        class348_sub41.method2715(32.toByte())
                        MinimapSpriteRendererStatics.aHashtable_4915!!.method3483(102.toByte(), i.toLong(), class348_sub41)
                    }
                    var class46 = method2570(1512932720, i_9_)
                    if (class46 != null) ConfigFlagUtilStatics.method1916(-9343, class46)
                    class46 = method2570(1512932720, i)
                    if (class46 != null) {
                        ConfigFlagUtilStatics.method1916(-9343, class46)
                        ConfigFlagUtilStatics.method1913(true, -123, class46)
                    }
                    if (RenderNodeStatics.anInt9721 != -1) BloomGraphicsOptionStateStatics.method1775((-8).toByte(), RenderNodeStatics.anInt9721, 1)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (bool != true) aSceneProjector_10434 = null
                if (ModelVertexColorBufferStatics.aIntRange_6584 == InputSettingsState.aIntRange_1762) {
                    LightingOptionStateStatics.aString5882 = (if (RadialTextureNodeStatics.anInt9341 > 2) CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-119).toByte()) else LocalizedTextStatics.aLocalizedText_3509!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544))
                    MapElementLookupStatics.anInt4144 = (if (RadialTextureNodeStatics.anInt9341 <= 0) -1 else CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944))
                    if (MapElementLookupStatics.anInt4144 == 65535) MapElementLookupStatics.anInt4144 = -1
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (GraphicsOptionStateStatics.aIntRange_3135 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteAdd(62.toByte())
                    val i_11_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntLittle((-126).toByte())
                    WallSceneEntityStatics.method2397((-124).toByte())
                    MenuActionNodeStatics.method2813(true, i, i_11_)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == ConnectionStateRefs.aIntRange_316) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                    val i_12_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                    val i_13_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(10)
                    val i_14_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                    WallSceneEntityStatics.method2397((-127).toByte())
                    method1703(7, i, i_13_ shl 16 or i_14_, 4, i_12_)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (BrightnessTextureNodeStatics.aIntRange_9216 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    MinimapStateReset.anInt1872 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShort(13638)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    TurbulenceTextureNodeStatics.anInt9313 = ResourceLoaderThreadStatics.anInt3918
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == VideoStreamDecoderStatics.aIntRange_4126) {
                    method128(SynthVoiceGroupStatics.aRgbColorPalette_8853, 8.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == ObjectByteSerializerHolderStatics.aIntRange_2285) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                    WallSceneEntityStatics.method2397((-124).toByte())
                    method1703(3, i, -1, 4, -1)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == HslColorConfigStatics.aIntRange_330) {
                    val bool_15_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                    val string = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-34).toByte())
                    var string_16_ = string
                    if (bool_15_) string_16_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-64).toByte())
                    val l = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readLong(-456577760)
                    val l_17_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944).toLong()
                    val l_18_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readMedium(-1).toLong()
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val l_19_ = l_18_ + (l_17_ shl 32)
                    var bool_20_ = false
                    while_217_@ do {
                        for (i_21_ in 0..99) {
                            if (l_19_ == SceneCollisionEntryStatics.aLongArray4410!![i_21_]) {
                                bool_20_ = true
                                break@while_217_
                            }
                        }
                        if (i <= 1) {
                            if ((RangeThresholdTextureNodeStatics.aBoolean9103 && !PlayerUpdateDecoder.aBoolean1915) || MinimapTriangleDrawerStatics.aBoolean5233) bool_20_ = true
                            else if (FontMetaRefStatics.method3455(string_16_, 28280)) bool_20_ = true
                        }
                    } while (false)
                    if (!bool_20_ && BackgroundWorkerThreadStatics.anInt3227 == 0) {
                        SceneCollisionEntryStatics.aLongArray4410!![NpcTypeStatics.anInt1359] = l_19_
                        NpcTypeStatics.anInt1359 = (1 + NpcTypeStatics.anInt1359) % 100
                        val string_22_ = (CompositeRgbNoiseTextureStatics.method572((InvertTextureNodeStatics.method3136(64.toByte(), CircleRasterizerStatics.aClass348_Sub49_Sub2_3813)), 23034))
                        if (i == 2 || i == 3) TrackedGroundDecorStatics.method2477("<img=1>" + string_16_, string_22_, (-126).toByte(), -1, "<img=1>" + string, ShadowQualityOptionStateStatics.method1788((-76).toByte(), l), 9, 0, string)
                        else if (i != 1) TrackedGroundDecorStatics.method2477(string_16_, string_22_, (-125).toByte(), -1, string, ShadowQualityOptionStateStatics.method1788((-83).toByte(), l), 9, 0, string)
                        else TrackedGroundDecorStatics.method2477("<img=0>" + string_16_, string_22_, (-126).toByte(), -1, "<img=0>" + string, ShadowQualityOptionStateStatics.method1788((-75).toByte(), l), 9, 0, string)
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == LocalizedTextTripleStatics.aIntRange_3751) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(!bool)
                    WallSceneEntityStatics.method2397((-126).toByte())
                    FontDefinitionStatics.method1189(-1, i)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == InputStream_Sub2Statics.aIntRange_82) {
                    method128(GlShaderObjectHandleStatics.aRgbColorPalette_515, 8.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == FileExistsConditionStatics.aIntRange_4779) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteAdd((-78).toByte())
                    val i_23_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                    val i_24_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(127)
                    val i_25_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-128).toByte())
                    val i_26_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                    WallSceneEntityStatics.method2397((-127).toByte())
                    SpotAnimDefinitionStatics.aBooleanArray2374!![i_23_] = true
                    CollisionMapAccessor.anIntArray3552!![i_23_] = i
                    ModelHeaderCacheStatics.anIntArray3273!![i_23_] = i_25_
                    MapTileShapeStatics.anIntArray4196!![i_23_] = i_26_
                    GroundDecorSceneEntityStatics.anIntArray9981!![i_23_] = i_24_
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == SceneryDetailOptionStateStatics.aIntRange_6089) {
                    FileExistsConditionStatics.anInt4786 = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(-622951480).toInt() shl 3)
                    GradientLookupEffectStatics.anInt9200 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteAdd((-84).toByte())
                    BufferedMessageQueueStatics.anInt3581 = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.method3341(-8679).toInt() shl 3)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == WorldListEntryStatics.aIntRange_304) {
                    RegionMapDecoder.method853(99.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return false
                }
                if (ParticleProcessorStatics.aIntRange_4269 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteAdd(71.toByte())
                    WallSceneEntityStatics.method2397((-128).toByte())
                    ByteArrayPool.anInt495 = i
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (WorldMapTextLabelStatics.aIntRange_8590 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    method128(BufferedFileReader.aRgbColorPalette_4537, 8.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == SmoothingBufferStatics.aIntRange_3240) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-117)
                    val i_27_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(125)
                    WallSceneEntityStatics.method2397((-128).toByte())
                    method2396(i, i_27_, 0, 3)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ImageFrameCacheStatics.aIntRange_4027 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    var i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                    if (i == 65535) i = -1
                    val i_28_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                    val i_29_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                    WallSceneEntityStatics.method2397((-128).toByte())
                    TrigLookupTablesStatics.method727((-63).toByte(), i_29_, i, i_28_)
                    val class213 = ClientExceptionStatics.aModelHeaderCache_112!!.method1940(-126, i)
                    ObjectSpawnDecoder.method1085(class213.anInt2825, class213.anInt2787, (-59).toByte(), class213.anInt2781, i_28_)
                    SkeletalAnimFrameLoaderStatics.method350(class213.anInt2779, class213.anInt2826, 125, i_28_, class213.anInt2810)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (PlayerUpdateDecoder.aIntRange_1917 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_30_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val bool_31_ = (0x1 and i_30_) == 1
                    LocTypeDefLoaderStatics.method1405(i, bool_31_, true)
                    val i_32_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    for (i_33_ in 0..<i_32_) {
                        var i_34_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteAdd((-127).toByte())
                        if (i_34_ == 255) {
                            val index = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197
                            val data = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154
                            i_34_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                        }
                        val i_35_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(-78)
                        DelegatingRenderCanvasStatics.method121(i, -364570972, bool_31_, i_33_, i_34_, i_35_ - 1)
                    }
                    LoadingScreenStateStatics.anIntArray2633!![NpcSummaryDefinitionStatics.method1166(31, DualMaterialContainerStatics.anInt1631++)] = i
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == HuffmanCodecStatics.aIntRange_3773) {
                    NormalMapTextureNodeStatics.method3141(false, 11.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return false
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == PixelBlender.aIntRange_3809) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                    val i_36_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                    ProjectedGroundDecorStatics.aVarpStore_10209!!.method1313(42.toByte(), i, i_36_)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == FogOptionStateStatics.aIntRange_6056) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(75.toByte())
                    val i_37_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                    var i_38_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(125)
                    val i_39_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_40_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                    val bool_41_ = (0x80 and i) != 0
                    val i_42_ = 0x7 and i
                    var i_43_ = (i and 0x7e) shr 3
                    if (i_43_ == 15) i_43_ = -1
                    if (i_40_ shr 30 == 0) {
                        if (i_40_ shr 29 != 0) {
                            val i_44_ = i_40_ and 0xffff
                            val class348_sub22 = (NpcEntityUpdater.aHashtable_3654!!.method3480(i_44_.toLong(), -6008) as NpcReference?)
                            if (class348_sub22 != null) {
                                val npc = (class348_sub22.aNpc_6859)!!
                                if (i_38_ == 65535) i_38_ = -1
                                var bool_45_ = true
                                val i_46_ = (if (!bool_41_) npc.anInt10269 else npc.anInt10291)
                                if (i_38_ != -1 && i_46_ != -1) {
                                    if (i_46_ == i_38_) {
                                        val class368 = ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2543(55.toByte(), i_38_)
                                        if (class368.aBoolean4487 && class368.anInt4503 != -1) {
                                            val class17 = (ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(class368.anInt4503, 7))
                                            val i_47_ = class17.anInt248
                                            if (i_47_ != 0 && i_47_ != 2) {
                                                if (i_47_ == 1) bool_45_ = true
                                            } else bool_45_ = false
                                        }
                                    } else {
                                        val class368 = ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2543(105.toByte(), i_38_)
                                        val class368_48_ = ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2543(56.toByte(), i_46_)
                                        if (class368.anInt4503 != -1 && (class368_48_.anInt4503 != -1)) {
                                            val class17 = (ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(class368.anInt4503, 7))
                                            val class17_49_ = (ParticleEmitterNodeStatics.aWidgetCache_191!!.method835((class368_48_.anInt4503), 7))
                                            if (class17.anInt239 < class17_49_.anInt239) bool_45_ = false
                                        }
                                    }
                                }
                                if (bool_45_) {
                                    if (bool_41_) {
                                        npc.anInt10211 = i_39_ + GlGroundShaderPassStatics.anInt7396
                                        npc.anInt10260 = i_37_
                                        npc.anInt10291 = i_38_
                                        npc.anInt10289 = i_43_
                                        npc.anInt10202 = i_42_
                                        npc.anInt10273 = 0
                                        npc.anInt10276 = 1
                                        npc.anInt10224 = 0
                                        if (npc.anInt10211 > GlGroundShaderPassStatics.anInt7396) npc.anInt10224 = -1
                                        if (npc.anInt10291 != -1 && (GlGroundShaderPassStatics.anInt7396 == (npc.anInt10211))) {
                                            val i_51_ = (ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2543(103.toByte(), (npc.anInt10291)).anInt4503)
                                            if (i_51_ != -1) {
                                                val class17 = ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(i_51_, 7)
                                                if (class17 != null && (class17.anIntArray237) != null && !(npc.aBoolean10309)) TypedRecordTableStatics.method2178(npc, 0, class17, -17)
                                            }
                                        }
                                    } else {
                                        npc.anInt10243 = 0
                                        npc.anInt10220 = i_37_
                                        npc.anInt10269 = i_38_
                                        npc.anInt10240 = 0
                                        npc.anInt10278 = i_43_
                                        npc.anInt10225 = GlGroundShaderPassStatics.anInt7396 + i_39_
                                        npc.anInt10237 = i_42_
                                        npc.anInt10283 = 1
                                        if (npc.anInt10225 > GlGroundShaderPassStatics.anInt7396) npc.anInt10240 = -1
                                        if (npc.anInt10269 != -1 && (GlGroundShaderPassStatics.anInt7396 == (npc.anInt10225))) {
                                            val i_50_ = (ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2543(87.toByte(), (npc.anInt10269)).anInt4503)
                                            if (i_50_ != -1) {
                                                val class17 = ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(i_50_, 7)
                                                if (class17 != null && (class17.anIntArray237) != null && !(npc.aBoolean10309)) TypedRecordTableStatics.method2178(npc, 0, class17, -44)
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (i_40_ shr 28 != 0) {
                            val i_52_ = i_40_ and 0xffff
                            val player: Player?
                            if (CharCodeMapStatics.anInt9591 != i_52_) player = (LoadingBarRendererStatics.aPlayerArray5058!![i_52_])
                            else player = LocalPlayerState.aPlayer_1907
                            if (player != null) {
                                if (i_38_ == 65535) i_38_ = -1
                                var bool_53_ = true
                                val i_54_ = (if (!bool_41_) player.anInt10269 else player.anInt10291)
                                if (i_38_ != -1 && i_54_ != -1) {
                                    if (i_38_ == i_54_) {
                                        val class368 = ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2543(111.toByte(), i_38_)
                                        if (class368.aBoolean4487 && class368.anInt4503 != -1) {
                                            val class17 = (ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(class368.anInt4503, 7))
                                            val i_57_ = class17.anInt248
                                            if (i_57_ != 0 && i_57_ != 2) {
                                                if (i_57_ == 1) bool_53_ = true
                                            } else bool_53_ = false
                                        }
                                    } else {
                                        val class368 = ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2543(105.toByte(), i_38_)
                                        val class368_55_ = ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2543(118.toByte(), i_54_)
                                        if (class368.anInt4503 != -1 && class368_55_.anInt4503 != -1) {
                                            val class17 = (ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(class368.anInt4503, 7))
                                            val class17_56_ = (ParticleEmitterNodeStatics.aWidgetCache_191!!.method835((class368_55_.anInt4503), 7))
                                            if (class17.anInt239 < class17_56_.anInt239) bool_53_ = false
                                        }
                                    }
                                }
                                if (bool_53_) {
                                    if (bool_41_) {
                                        player.anInt10224 = 0
                                        player.anInt10260 = i_37_
                                        player.anInt10289 = i_43_
                                        player.anInt10273 = 0
                                        player.anInt10276 = 1
                                        player.anInt10291 = i_38_
                                        player.anInt10211 = i_39_ + GlGroundShaderPassStatics.anInt7396
                                        player.anInt10202 = i_42_
                                        if (player.anInt10211 > GlGroundShaderPassStatics.anInt7396) player.anInt10224 = -1
                                        if (player.anInt10291 == 65535) player.anInt10291 = -1
                                        if ((player.anInt10291 != -1) && ((player.anInt10211) == GlGroundShaderPassStatics.anInt7396)) {
                                            val i_58_ = (ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2543(45.toByte(), (player.anInt10291)).anInt4503)
                                            if (i_58_ != -1) {
                                                val class17 = ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(i_58_, 7)
                                                if (class17 != null && (class17.anIntArray237) != null && !(player.aBoolean10309)) TypedRecordTableStatics.method2178(player, 0, class17, -120)
                                            }
                                        }
                                    } else {
                                        player.anInt10269 = i_38_
                                        player.anInt10243 = 0
                                        player.anInt10220 = i_37_
                                        player.anInt10240 = 0
                                        player.anInt10278 = i_43_
                                        player.anInt10237 = i_42_
                                        player.anInt10283 = 1
                                        player.anInt10225 = i_39_ + GlGroundShaderPassStatics.anInt7396
                                        if (player.anInt10269 == 65535) player.anInt10269 = -1
                                        if (GlGroundShaderPassStatics.anInt7396 < (player.anInt10225)) player.anInt10240 = -1
                                        if ((player.anInt10269 != -1) && (GlGroundShaderPassStatics.anInt7396 == (player.anInt10225))) {
                                            val i_59_ = (ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2543(81.toByte(), (player.anInt10269)).anInt4503)
                                            if (i_59_ != -1) {
                                                val class17 = ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(i_59_, 7)
                                                if (class17 != null && (class17.anIntArray237) != null && !(player.aBoolean10309)) TypedRecordTableStatics.method2178(player, 0, class17, -101)
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        val i_60_ = (i_40_ and 0x33705717) shr 28
                        val i_61_ = -ArbVertexProgramStatics.regionTileX + ((0xffff4fe and i_40_) shr 14)
                        val i_62_ = -RegionMapDecoder.regionTileY + (0x3fff and i_40_)
                        if (i_61_ >= 0 && i_62_ >= 0 && GlCubemapLightPassStatics.anInt7319 > i_61_ && RangeThresholdTextureNodeStatics.anInt9109 > i_62_) {
                            val i_63_ = 256 + 512 * i_61_
                            val i_64_ = 512 * i_62_ + 256
                            var i_65_ = i_60_
                            if (i_65_ < 3 && NpcTypeStatics.method802(i_62_, i_61_, true)) i_65_++
                            val class318_sub1_sub3_sub4 = (MapElementDecor(i_38_, i_39_, GlGroundShaderPassStatics.anInt7396, i_60_, i_65_, i_63_, -i_37_ + CollisionMapAccessor.method2064(i_63_, i_60_, 11219, i_64_), i_64_, i_61_, i_61_, i_62_, i_62_, i_42_))
                            OpenGlRenderNodeStatics.aNodeDeque_10492!!.method1999(ChatScriptListNode(class318_sub1_sub3_sub4), -20180)
                        }
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == SceneTileBoundsStatics.aIntRange_1120) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-116)
                    val string = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-85).toByte())
                    WallSceneEntityStatics.method2397((-125).toByte())
                    method3965(string, i, 2)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == RgbColorPaletteStatics.aIntRange_1234) {
                    ModelDataCache.anInt359 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.method3369(125.toByte())
                    RangeThresholdTextureNodeStatics.aBoolean9103 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (RenderableEntryStatics.aIntRange_4331 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val string = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(122.toByte())
                    val bool_66_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                    val string_67_: String?
                    if (!bool_66_) string_67_ = string
                    else string_67_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(125.toByte())
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_68_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByte(-128)
                    var bool_69_ = false
                    if (i_68_.toInt() == -128) bool_69_ = true
                    if (bool_69_) {
                        if (ByteArrayPool.anInt496 == 0) {
                            ModelVertexColorBufferStatics.aIntRange_6584 = null
                            return true
                        }
                        val bool_70_ = false
                        var i_71_: Int
                        i_71_ = 0
                        while (ByteArrayPool.anInt496 > i_71_) {
                            if (HostPingThreadStatics.aWorldListEntryArray2261!![i_71_]!!.aString306 == string_67_ && i == (HostPingThreadStatics.aWorldListEntryArray2261!![i_71_]!!.anInt308)) break
                            i_71_++
                        }
                        if (ByteArrayPool.anInt496 > i_71_) {
                            while ( /**/-1 + ByteArrayPool.anInt496 > i_71_) {
                                HostPingThreadStatics.aWorldListEntryArray2261!![i_71_] = HostPingThreadStatics.aWorldListEntryArray2261!![i_71_ - -1]
                                i_71_++
                            }
                            ByteArrayPool.anInt496--
                            HostPingThreadStatics.aWorldListEntryArray2261!![ByteArrayPool.anInt496] = null
                        }
                    } else {
                        val string_72_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-74).toByte())
                        val worldListEntry = WorldListEntry()
                        worldListEntry.aString306 = string_67_
                        worldListEntry.aString314 = string
                        worldListEntry.aString312 = method2127(2, worldListEntry.aString306)
                        worldListEntry.aString313 = string_72_
                        worldListEntry.anInt308 = i
                        worldListEntry.aByte310 = i_68_
                        var i_73_: Int
                        i_73_ = -1 + ByteArrayPool.anInt496
                        while (i_73_ >= 0) {
                            val i_74_ = HostPingThreadStatics.aWorldListEntryArray2261!![i_73_]!!.aString312!!.compareTo(worldListEntry.aString312!!)
                            if (i_74_ == 0) {
                                HostPingThreadStatics.aWorldListEntryArray2261!![i_73_]!!.anInt308 = i
                                HostPingThreadStatics.aWorldListEntryArray2261!![i_73_]!!.aByte310 = i_68_
                                HostPingThreadStatics.aWorldListEntryArray2261!![i_73_]!!.aString313 = string_72_
                                if (string_67_ == LocalPlayerState.aPlayer_1907!!.aString10544) NativeIndexBufferStatics.aByte4702 = i_68_
                                SceneProjectorStatics.anInt2986 = ResourceLoaderThreadStatics.anInt3918
                                ModelVertexColorBufferStatics.aIntRange_6584 = null
                                return true
                            }
                            if (i_74_ < 0) break
                            i_73_--
                        }
                        if (HostPingThreadStatics.aWorldListEntryArray2261!!.size <= ByteArrayPool.anInt496) {
                            ModelVertexColorBufferStatics.aIntRange_6584 = null
                            return true
                        }
                        for (i_75_ in ByteArrayPool.anInt496 - 1 downTo i_73_ + 1) HostPingThreadStatics.aWorldListEntryArray2261!![1 + i_75_] = HostPingThreadStatics.aWorldListEntryArray2261!![i_75_]
                        if (ByteArrayPool.anInt496 == 0) HostPingThreadStatics.aWorldListEntryArray2261 = arrayOfNulls<WorldListEntry>(100)
                        HostPingThreadStatics.aWorldListEntryArray2261!![i_73_ - -1] = worldListEntry
                        ByteArrayPool.anInt496++
                        if (string_67_ == LocalPlayerState.aPlayer_1907!!.aString10544) NativeIndexBufferStatics.aByte4702 = i_68_
                    }
                    SceneProjectorStatics.anInt2986 = ResourceLoaderThreadStatics.anInt3918
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (BinaryGraphicsOptionStateStatics.aIntRange_5949 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_76_ = i shr 5
                    val i_77_ = 0x1f and i
                    if (i_77_ == 0) {
                        MultiFieldRecordStatics.aMinimapPositionStateArray6897s!![i_76_] = null
                        ModelVertexColorBufferStatics.aIntRange_6584 = null
                        return true
                    }
                    val minimapPositionState = MinimapPositionState()
                    minimapPositionState.anInt3840 = i_77_
                    minimapPositionState.anInt3831 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    if (minimapPositionState.anInt3831 >= 0 && (minimapPositionState.anInt3831 < CustomCursorsOptionStateStatics.aAbstractModelRendererArray5933!!.size)) {
                        if (minimapPositionState.anInt3840 == 1 || minimapPositionState.anInt3840 == 10) {
                            minimapPositionState.anInt3833 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                            CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197 += 6
                        } else if (minimapPositionState.anInt3840 >= 2 && minimapPositionState.anInt3840 <= 6) {
                            if (minimapPositionState.anInt3840 == 2) {
                                minimapPositionState.anInt3832 = 256
                                minimapPositionState.anInt3835 = 256
                            }
                            if (minimapPositionState.anInt3840 == 3) {
                                minimapPositionState.anInt3835 = 0
                                minimapPositionState.anInt3832 = 256
                            }
                            if (minimapPositionState.anInt3840 == 4) {
                                minimapPositionState.anInt3835 = 512
                                minimapPositionState.anInt3832 = 256
                            }
                            if (minimapPositionState.anInt3840 == 5) {
                                minimapPositionState.anInt3835 = 256
                                minimapPositionState.anInt3832 = 0
                            }
                            if (minimapPositionState.anInt3840 == 6) {
                                minimapPositionState.anInt3835 = 256
                                minimapPositionState.anInt3832 = 512
                            }
                            minimapPositionState.anInt3840 = 2
                            minimapPositionState.anInt3838 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                            minimapPositionState.anInt3835 += (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944) + -ArbVertexProgramStatics.regionTileX shl 9)
                            minimapPositionState.anInt3832 += (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944) - RegionMapDecoder.regionTileY shl 9)
                            minimapPositionState.anInt3839 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) shl 2
                            minimapPositionState.anInt3837 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        }
                        minimapPositionState.anInt3834 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        if (minimapPositionState.anInt3834 == 65535) minimapPositionState.anInt3834 = -1
                        MultiFieldRecordStatics.aMinimapPositionStateArray6897s!![i_76_] = minimapPositionState
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (NpcCountAccessor.aIntRange_2279 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    NormalMapTextureNodeStatics.method3141(ProjectileFactoryStatics.aBoolean2895, 11.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return false
                }
    
                if (GlCubemapLightPassStatics.aIntRange_7323 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    SynthVoiceGroupStatics.method2822(-101, CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!, RadialTextureNodeStatics.anInt9341)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == DetailLevelOptionStateStatics.aIntRange_6121) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                    val i_78_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntLittle((-118).toByte())
                    WallSceneEntityStatics.method2397((-128).toByte())
                    NpcUpdateProcessor.method855(6, i, i_78_)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (CompassSmootherStatics.aIntRange_3371 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    method128(StaticNoiseTextureStatics.aRgbColorPalette_8662, 8.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == GlCubemapLightPassStatics.aIntRange_7324) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                    val i_79_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-120)
                    val i_80_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(125)
                    WallSceneEntityStatics.method2397((-125).toByte())
                    SoundEnvelopeStatics.method1540(-101, i, i_79_ + (i_80_ shl 16))
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == CollisionMapStatics.aIntRange_4433) {
                    ProjectedGroundDecorStatics.aVarpStore_10209!!.method1314(80.toByte())
                    TypedRecordTableStatics.anInt3695 += 32
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == ProjectileDefinition.aIntRange_3842) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                    WallSceneEntityStatics.method2397((-128).toByte())
                    method1703(5, i, CharCodeMapStatics.anInt9591, 4, 0)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (AwtKeyboardListenerStatics.aIntRange_6528 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(-124)
                    WallSceneEntityStatics.method2397((-124).toByte())
                    OpenGlModelStatics.method690((-107).toByte(), i)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (SolidFillComponentStatics.aIntRange_8365 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val bool_81_ = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                    val string = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-29).toByte())
                    var string_82_ = string
                    if (bool_81_) string_82_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-98).toByte())
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    var bool_83_ = false
                    if (i <= 1) {
                        if (RangeThresholdTextureNodeStatics.aBoolean9103 && !PlayerUpdateDecoder.aBoolean1915 || MinimapTriangleDrawerStatics.aBoolean5233) bool_83_ = true
                        else if (i <= 1 && FontMetaRefStatics.method3455(string_82_, 28280)) bool_83_ = true
                    }
                    if (!bool_83_ && BackgroundWorkerThreadStatics.anInt3227 == 0) {
                        val string_84_ = (CompositeRgbNoiseTextureStatics.method572((InvertTextureNodeStatics.method3136(64.toByte(), CircleRasterizerStatics.aClass348_Sub49_Sub2_3813)), 23034))
                        if (i == 2) TrackedGroundDecorStatics.method2477("<img=1>" + string_82_, string_84_, (-119).toByte(), -1, "<img=1>" + string, null, 24, 0, string)
                        else if (i == 1) TrackedGroundDecorStatics.method2477("<img=0>" + string_82_, string_84_, (-119).toByte(), -1, "<img=0>" + string, null, 24, 0, string)
                        else TrackedGroundDecorStatics.method2477(string_82_, string_84_, (-115).toByte(), -1, string, null, 24, 0, string)
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (CharCountUtil.aIntRange_229 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    method128(ArbFogMaterialPassStatics.aRgbColorPalette_6201, 8.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == FloatCameraTransformStatics.aIntRange_5742) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(31.toByte())
                    val i_85_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-104).toByte())
                    val i_86_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                    val i_87_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                    val i_88_ = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(126) shl 2)
                    WallSceneEntityStatics.method2397((-127).toByte())
                    method1844(i_85_, i_86_, true, i_88_, !bool, i_87_, i)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == CollisionMapRegionStatics.aIntRange_1722) {
                    val string = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-100).toByte())
                    val objects = arrayOfNulls<Any>(1 + string.length)
                    for (i in -1 + string.length downTo 0) {
                        if (string.get(i) != 's') objects[i + 1] = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                        else objects[1 + i] = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(122.toByte())
                    }
                    objects[0] = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                    WallSceneEntityStatics.method2397((-127).toByte())
                    val class348_sub36 = WidgetActionEntry()
                    class348_sub36.anObjectArray6987 = objects
                    ChatCommandProcessor.method705(class348_sub36)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (SimpleBinaryOptionStateStatics.aIntRange_6075 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    WallSceneEntityStatics.method2397((-127).toByte())
                    method1851(125.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == RegionSceneShifterStatics.aIntRange_7052) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntLittle((-118).toByte())
                    var i_89_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(127)
                    if (i_89_ == 65535) i_89_ = -1
                    WallSceneEntityStatics.method2397((-126).toByte())
                    method1703(2, i, i_89_, 4, -1)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == CompassSmootherStatics.aIntRange_3368) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                    WallSceneEntityStatics.method2397((-124).toByte())
                    val class348_sub41 = (MinimapSpriteRendererStatics.aHashtable_4915!!.method3480(i.toLong(), -6008) as RegionSceneShifter?)
                    if (class348_sub41 != null) ScrollingWidgetComponentNodeStatics.method1118(true, false, class348_sub41, 2533)
                    if (SpriteRenderableStatics.aWidgetComponent_4730 != null) {
                        ConfigFlagUtilStatics.method1916(-9343, SpriteRenderableStatics.aWidgetComponent_4730!!)
                        SpriteRenderableStatics.aWidgetComponent_4730 = null
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (InputStream_Sub1Statics.aIntRange_79 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(-86)
                    val i_90_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                    WallSceneEntityStatics.method2397((-124).toByte())
                    OggBitstreamDecoderStatics.method2966(i_90_, i, false)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (WidgetRedrawTrackerStatics.aIntRange_3925 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    method128(aRgbColorPalette_10437, 8.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == NativeLibraryUnloader.aIntRange_2972) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                    ChatScriptListNodeStatics.aLinkedQueueNode_9536 = VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!.method2232(80, i)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == ParserSpecialCharsHolder.aIntRange_1901) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val player: Player?
                    if (i != CharCodeMapStatics.anInt9591) player = LoadingBarRendererStatics.aPlayerArray5058!![i]
                    else player = LocalPlayerState.aPlayer_1907
                    if (player == null) {
                        ModelVertexColorBufferStatics.aIntRange_6584 = null
                        return true
                    }
                    var i_91_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_92_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val bool_93_ = (0x8000 and i_91_) != 0
                    if ((player.aString10544) != null && player.aCompositeNpcModelBuilder_10536 != null) {
                        var bool_94_ = false
                        if (i_92_ <= 1) {
                            if (!bool_93_ && ((RangeThresholdTextureNodeStatics.aBoolean9103 && !PlayerUpdateDecoder.aBoolean1915) || MinimapTriangleDrawerStatics.aBoolean5233)) bool_94_ = true
                            else if (FontMetaRefStatics.method3455(player.aString10544, 28280)) bool_94_ = true
                        }
                        if (!bool_94_ && BackgroundWorkerThreadStatics.anInt3227 == 0) {
                            var i_95_ = -1
                            val string: String?
                            if (bool_93_) {
                                i_91_ = i_91_ and 0x7fff
                                val class43 = RsaVarbitHandlerStatics.method490((-104).toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!))
                                i_95_ = class43.anInt615
                                string = (class43.aClass348_Sub42_Sub10_614!!.method3216(CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!, 119.toByte()))
                            } else string = (CompositeRgbNoiseTextureStatics.method572((InvertTextureNodeStatics.method3136(64.toByte(), CircleRasterizerStatics.aClass348_Sub49_Sub2_3813)), 23034))
                            player.aString10292 = string!!.trim { it <= ' ' }
                            player.anInt10201 = i_91_ shr 8
                            player.anInt10234 = i_91_ and 0xff
                            player.anInt10264 = 150
                            val i_96_: Int
                            if (i_92_ != 1 && i_92_ != 2) i_96_ = if (!bool_93_) 2 else 17
                            else i_96_ = if (bool_93_) 17 else 1
                            if (i_92_ != 2) {
                                if (i_92_ != 1) TrackedGroundDecorStatics.method2477(player.method2450(false, -121), string, (-126).toByte(), i_95_, player.method2456(true, 255), null, i_96_, 0, player.aString10537)
                                else TrackedGroundDecorStatics.method2477("<img=0>" + player.method2450(false, -93), string, (-111).toByte(), i_95_, "<img=0>" + player.method2456(true, 255), null, i_96_, 0, player.aString10537)
                            } else TrackedGroundDecorStatics.method2477("<img=1>" + player.method2450(false, -95), string, (-120).toByte(), i_95_, "<img=1>" + player.method2456(true, 255), null, i_96_, 0, player.aString10537)
                        }
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (SceneTileBoundsStatics.aIntRange_1123 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val bool_97_ = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                    val string = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(126.toByte())
                    var string_98_ = string
                    if (bool_97_) string_98_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(86.toByte())
                    val l = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944).toLong()
                    val l_99_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readMedium(-1).toLong()
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val l_100_ = (l shl 32) - -l_99_
                    var bool_101_ = false
                    while_218_@ do {
                        for (i_102_ in 0..99) {
                            if (l_100_ == SceneCollisionEntryStatics.aLongArray4410!![i_102_]) {
                                bool_101_ = true
                                break@while_218_
                            }
                        }
                        if (i <= 1) {
                            if ((RangeThresholdTextureNodeStatics.aBoolean9103 && !PlayerUpdateDecoder.aBoolean1915) || MinimapTriangleDrawerStatics.aBoolean5233) bool_101_ = true
                            else if (FontMetaRefStatics.method3455(string_98_, 28280)) bool_101_ = true
                        }
                    } while (false)
                    if (!bool_101_ && BackgroundWorkerThreadStatics.anInt3227 == 0) {
                        SceneCollisionEntryStatics.aLongArray4410!![NpcTypeStatics.anInt1359] = l_100_
                        NpcTypeStatics.anInt1359 = (1 + NpcTypeStatics.anInt1359) % 100
                        val string_103_ = (CompositeRgbNoiseTextureStatics.method572((InvertTextureNodeStatics.method3136(64.toByte(), CircleRasterizerStatics.aClass348_Sub49_Sub2_3813)), 23034))
                        if (i == 2) TrackedGroundDecorStatics.method2477("<img=1>" + string_98_, string_103_, (-127).toByte(), -1, "<img=1>" + string, null, 7, 0, string)
                        else if (i == 1) TrackedGroundDecorStatics.method2477("<img=0>" + string_98_, string_103_, (-115).toByte(), -1, "<img=0>" + string, null, 7, 0, string)
                        else TrackedGroundDecorStatics.method2477(string_98_, string_103_, (-128).toByte(), -1, string, null, 3, 0, string)
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (CacheEntryReferenceStatics.aIntRange_9552 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    if (RenderNodeStatics.anInt9721 != -1) BloomGraphicsOptionStateStatics.method1775((-8).toByte(), RenderNodeStatics.anInt9721, 0)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (HeapDiagnosticsHolder.aIntRange_2248 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_104_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-87).toByte())
                    val i_105_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_106_ = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(!bool) shl 2)
                    val i_107_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                    WallSceneEntityStatics.method2397((-125).toByte())
                    ContactEntryStatics.method3231(i_104_, i, i_106_, i_107_, i_105_, -127)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
    
                if (ModelVertexColorBufferStatics.aIntRange_6584 == StringValueNodeStatics.aIntRange_7113) {
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return false
                }
                if (SlotBindingStatics.aIntRange_3427 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    method1034(RadialTextureNodeStatics.anInt9341, CircleRasterizerStatics.aClass348_Sub49_Sub2_3813, VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992, 110)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (MapAreaDefinitionStatics.aIntRange_2527 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val bool_108_ = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                    val `is` = ByteArray(RadialTextureNodeStatics.anInt9341 - 1)
                    CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.method3389(2147483647, 0, (RadialTextureNodeStatics.anInt9341) + -1, `is`)
                    ScanlineRasterFillerStatics.method1385(bool_108_, `is`, (-104).toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == EmoteDefinitionStatics.aIntRange_3264) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_109_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.method3341(-8679)
                    WallSceneEntityStatics.method2397((-128).toByte())
                    InterfaceComponentGroupStatics.method3244(i_109_.toInt(), i, 120)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelHeaderCacheStatics.aIntRange_3265 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    BufferedMessageQueueStatics.anInt3581 = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(-622951480).toInt() shl 3)
                    GradientLookupEffectStatics.anInt9200 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(98.toByte())
                    FileExistsConditionStatics.anInt4786 = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteSubtract(-27697).toInt() shl 3)
                    while ((CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197) < RadialTextureNodeStatics.anInt9341) {
                        val class74 = (ModelHeaderCacheStatics.method1929((-19).toByte())[CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)])
                        method128(class74, 8.toByte())
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ParticleEffectCacheStatics.aIntRange_3467 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShort(13638)
                    val i_110_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                    val i_111_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.method3375(84.toByte())
                    WallSceneEntityStatics.method2397((-124).toByte())
                    ConfigValueProviderStatics.method1080(i_111_, -23697, i, i_110_)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ScriptOpcodeHolder.aIntRange_2338 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val string = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(100.toByte())
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                    WallSceneEntityStatics.method2397((-127).toByte())
                    method3965(string, i, 2)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == SequencedWallEntityStatics.aIntRange_10168) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-117)
                    val i_112_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                    WallSceneEntityStatics.method2397((-127).toByte())
                    BrightnessTextureNodeStatics.method3084(i, (-88).toByte(), i_112_)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ParticleSystemStateStatics.aIntRange_2196 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val bool_113_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                    val string = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-81).toByte())
                    var string_114_ = string
                    if (bool_113_) string_114_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-39).toByte())
                    val l = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readLong(-456577760)
                    val l_115_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944).toLong()
                    val l_116_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readMedium(-1).toLong()
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_117_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val l_118_ = (l_115_ shl 32) - -l_116_
                    var bool_119_ = false
                    while_219_@ do {
                        for (i_120_ in 0..99) {
                            if (SceneCollisionEntryStatics.aLongArray4410!![i_120_] == l_118_) {
                                bool_119_ = true
                                break@while_219_
                            }
                        }
                        if (i <= 1 && FontMetaRefStatics.method3455(string_114_, 28280)) bool_119_ = true
                    } while (false)
                    if (!bool_119_ && BackgroundWorkerThreadStatics.anInt3227 == 0) {
                        SceneCollisionEntryStatics.aLongArray4410!![NpcTypeStatics.anInt1359] = l_118_
                        NpcTypeStatics.anInt1359 = (NpcTypeStatics.anInt1359 + 1) % 100
                        val string_121_ = (BrightnessOptionStateStatics.aCompiledScriptCache_5900!!.method3471(i_117_, (-106).toByte()).method3216(CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!, 42.toByte()))
                        if (i == 2) TrackedGroundDecorStatics.method2477("<img=1>" + string_114_, string_121_, (-120).toByte(), i_117_, "<img=1>" + string, method1788(87.toByte(), l), 20, 0, string)
                        else if (i != 1) TrackedGroundDecorStatics.method2477(string_114_, string_121_, (-111).toByte(), i_117_, string, method1788(80.toByte(), l), 20, 0, string)
                        else TrackedGroundDecorStatics.method2477("<img=0>" + string_114_, string_121_, (-116).toByte(), i_117_, "<img=0>" + string, ShadowQualityOptionStateStatics.method1788((-98).toByte(), l), 20, 0, string)
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (OutgoingPacketNodeStatics.aIntRange_7124 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                    WallSceneEntityStatics.method2397((-125).toByte())
                    if (i == -1) {
                        NativeLibraryState.anInt167 = -1
                        SequencedWallEntityStatics.anInt10163 = -1
                    } else {
                        var i_122_ = 0x3fff and (i shr 14)
                        i_122_ -= ArbVertexProgramStatics.regionTileX
                        var i_123_ = 0x3fff and i
                        i_123_ -= RegionMapDecoder.regionTileY
                        if (i_122_ >= 0) {
                            if (GlCubemapLightPassStatics.anInt7319 <= i_122_) i_122_ = GlCubemapLightPassStatics.anInt7319
                        } else i_122_ = 0
                        NativeLibraryState.anInt167 = (i_122_ shl 9) - -256
                        if (i_123_ >= 0) {
                            if (i_123_ >= RangeThresholdTextureNodeStatics.anInt9109) i_123_ = RangeThresholdTextureNodeStatics.anInt9109
                        } else i_123_ = 0
                        SequencedWallEntityStatics.anInt10163 = 256 + (i_123_ shl 9)
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == BlankTextureNodeStatics.aIntRange_9254) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteAdd((-88).toByte())
                    val i_124_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(!bool)
                    ProjectedGroundDecorStatics.aVarpStore_10209!!.method1316((-58).toByte(), i_124_, i)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (PlayerUpdateDecoder.aIntRange_1914 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    method128(ClampTextureNodeStatics.aRgbColorPalette_9475, 8.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == MapArchiveSourceStatics.aIntRange_4798) {
                    var i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-107)
                    if (i == 65535) i = -1
                    val i_125_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteAdd((-121).toByte())
                    val i_126_ = i_125_ shr 2
                    val i_127_ = i_125_ and 0x3
                    val i_128_ = AnimationFrameTable.anIntArray487!![i_126_]
                    val i_129_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                    val i_130_ = (0x36079814 and i_129_) shr 28
                    var i_131_ = i_129_ shr 14 and 0x3fff
                    var i_132_ = 0x3fff and i_129_
                    i_131_ -= ArbVertexProgramStatics.regionTileX
                    i_132_ -= RegionMapDecoder.regionTileY
                    NativeRendererStatics.method3824(i_132_, i, i_126_, i_131_, i_127_, 102, i_130_, i_128_)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == HeapDiagnosticsHolder.aIntRange_2255) {
                    val string = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-104).toByte())
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val string_133_ = (BrightnessOptionStateStatics.aCompiledScriptCache_5900!!.method3471(i, (-98).toByte()).method3216(CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!, 42.toByte()))
                    TrackedGroundDecorStatics.method2477(string, string_133_, (-122).toByte(), i, string, null, 19, 0, string)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == CacheEntryReferenceStatics.aIntRange_9550) {
                    method128(FileIoUtil.aRgbColorPalette_4098, 8.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (SocketStreamWorkerStatics.aIntRange_2665 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    for (i in LoadingBarRendererStatics.aPlayerArray5058!!.indices) {
                        if (LoadingBarRendererStatics.aPlayerArray5058!![i] != null) {
                            LoadingBarRendererStatics.aPlayerArray5058!![i]!!.anIntArray10236 = null
                            LoadingBarRendererStatics.aPlayerArray5058!![i]!!.anInt10286 = -1
                        }
                    }
                    var i = 0
                    while (TerrainShadowBuilderGl2Statics.anInt6930 > i) {
                        TurbulenceTextureNodeStatics.aClass348_Sub22Array9319!![i]!!.aNpc_6859!!.anIntArray10236 = null
                        TurbulenceTextureNodeStatics.aClass348_Sub22Array9319!![i]!!.aNpc_6859!!.anInt10286 = -1
                        i++
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (FriendChatMemberStatics.aIntRange_4477 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                    val i_134_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_135_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-109)
                    val i_136_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(16)
                    WallSceneEntityStatics.method2397((-125).toByte())
                    ObjectSpawnDecoder.method1085(i_136_, i_134_, (-86).toByte(), i_135_, i)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (DirectionUtil.aIntRange_1540 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    MapSceneTileStatics.aBoxedIntHolder_1055 = WidgetTextConfigStatics.method360((-57).toByte(), CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255))
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (RemoveRoofsOptionStateStatics.aIntRange_6058 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    method128(TextureGeneratorStatics.aRgbColorPalette_2491, 8.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (PingHostListHolder.aIntRange_2331 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    ContactEntryStatics.anInt9604 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    var i = 0
                    while (ContactEntryStatics.anInt9604 > i) {
                        NpcConfigStatics.aStringArray932!![i] = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-36).toByte())
                        ObjectSpawnDecoder.aStringArray1808!![i] = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(112.toByte())
                        if (ObjectSpawnDecoder.aStringArray1808!![i] == "") ObjectSpawnDecoder.aStringArray1808!![i] = NpcConfigStatics.aStringArray932!![i]
                        WeaveTextureNodeStatics.aStringArray9275!![i] = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(84.toByte())
                        IndexedSpriteStatics.aStringArray5197!![i] = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-111).toByte())
                        if (IndexedSpriteStatics.aStringArray5197!![i] == "") IndexedSpriteStatics.aStringArray5197!![i] = WeaveTextureNodeStatics.aStringArray9275!![i]
                        BasicGlRenderPassStatics.aBooleanArray7304!![i] = false
                        i++
                    }
                    Crc64HashableStatics.anInt4985 = ResourceLoaderThreadStatics.anInt3918
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == ItemDefinitionLoaderStatics.aIntRange_2183) {
                    var i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-121)
                    if (i == 65535) i = -1
                    var string: String? = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(103.toByte())
                    val i_137_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-91).toByte())
                    val i_138_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteAdd(13.toByte())
                    if (i_137_ >= 1 && i_137_ <= 8) {
                        if (string.equals("null", ignoreCase = true)) string = null
                        DynamicSceneObjectEntityStatics.aStringArray10195!![i_137_ + -1] = string
                        DelegatingRenderCanvasStatics.anIntArray60!![i_137_ + -1] = i
                        PlayerSequenceSelector.aBooleanArray1214!![i_137_ - 1] = i_138_ == 0
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (MinimapStateReset.aIntRange_1871 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readSmart(-117)
                    val i_139_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                    val i_140_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    var string = ""
                    var string_141_ = string
                    if ((i_140_ and 0x1) != 0) {
                        string = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(92.toByte())
                        if ((i_140_ and 0x2) != 0) string_141_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(126.toByte())
                        else string_141_ = string
                    }
                    val string_142_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-95).toByte())
                    if (i == 99) method94(string_142_, -93)
                    else if (i == 98) set(string_142_)
                    else {
                        if (string_141_ != "" && FontMetaRefStatics.method3455(string_141_, 28280)) {
                            ModelVertexColorBufferStatics.aIntRange_6584 = null
                            return true
                        }
                        FixedFunctionMaterialPassStatics.method2144(string_141_, i, (-92).toByte(), i_139_, string_142_, string, string)
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == TimedRecordAccessorStatics.aIntRange_7105) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    if (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 0) DetailLevelOptionStateStatics.aFloorOverlayDefinitionArray6114!![i] = FloorOverlayDefinition()
                    else {
                        CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197--
                        DetailLevelOptionStateStatics.aFloorOverlayDefinitionArray6114!![i] = FloorOverlayDefinition(CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!)
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    MapAreaDefinitionStatics.anInt2523 = ResourceLoaderThreadStatics.anInt3918
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == AbstractMenuEntryStatics.aIntRange_1702) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShort(13638)
                    val i_143_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                    WallSceneEntityStatics.method2397((-126).toByte())
                    ObjectByteSerializerHolderStatics.method1330(i, -19906, i_143_)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == CacheStateResetter.aIntRange_123) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                    val i_144_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    var i_145_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    if (i_145_ == 65535) i_145_ = -1
                    var i_146_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                    WallSceneEntityStatics.method2397((-128).toByte())
                    if (i_146_ == 65535) i_146_ = -1
                    var i_147_ = i_146_
                    while (i_145_ >= i_147_) {
                        val l = (i.toLong() shl 32) - -i_147_.toLong()
                        val class348_sub44 = (TextureDefinitionCacheStatics.aHashtable_2959!!.method3480(l, -6008) as PackedFlagsAccessor?)
                        val class348_sub44_148_: PackedFlagsAccessor?
                        if (class348_sub44 == null) {
                            if (i_147_ == -1) class348_sub44_148_ = (PackedFlagsAccessor(method2570(1512932720, i)!!.aClass348_Sub44_748!!.anInt7098, i_144_))
                            else class348_sub44_148_ = PackedFlagsAccessor(0, i_144_)
                        } else {
                            class348_sub44_148_ = PackedFlagsAccessor((class348_sub44.anInt7098), i_144_)
                            class348_sub44.method2715(91.toByte())
                        }
                        TextureDefinitionCacheStatics.aHashtable_2959!!.method3483(125.toByte(), l, class348_sub44_148_)
                        i_147_++
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == TimedRecordAccessorStatics.aIntRange_7106) {
                    while ((CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197) < RadialTextureNodeStatics.anInt9341) {
                        val bool_149_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                        var string: String? = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-95).toByte())
                        val string_150_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(118.toByte())
                        val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        val i_151_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        var string_152_ = ""
                        var bool_153_ = false
                        if (i > 0) {
                            string_152_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(119.toByte())
                            bool_153_ = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                        }
                        var i_154_ = 0
                        while ((i_154_ < HslAdjustTextureNodeStatics.anInt9383)) {
                            if (!bool_149_) {
                                if (string == WaterTextureSetStatics.aStringArray1441!![i_154_]) {
                                    if (i != RendererStatics.anIntArray4578!![i_154_]) {
                                        var bool_155_ = true
                                        var class318_sub9_sub1 = (InterfaceComponentGroupStatics.aDoublyLinkedNodeList_9642!!.method1872(8) as? NamedTimedNode?)
                                        while (class318_sub9_sub1 != null) {
                                            if (class318_sub9_sub1.aString8783 == string) {
                                                if (i == 0 || (class318_sub9_sub1.aShort8786.toInt() != 0)) {
                                                    if (i == 0 && (class318_sub9_sub1.aShort8786).toInt() != 0) {
                                                        bool_155_ = false
                                                        class318_sub9_sub1.method2373(false)
                                                    }
                                                } else {
                                                    bool_155_ = false
                                                    class318_sub9_sub1.method2373(false)
                                                }
                                            }
                                            class318_sub9_sub1 = (InterfaceComponentGroupStatics.aDoublyLinkedNodeList_9642!!.method1878(124.toByte()) as? NamedTimedNode?)
                                        }
                                        if (bool_155_) InterfaceComponentGroupStatics.aDoublyLinkedNodeList_9642!!.method1869(-95, NamedTimedNode(string, i))
                                        RendererStatics.anIntArray4578!![i_154_] = i
                                    }
                                    FixedFunctionMaterialPassStatics.aStringArray6205!![i_154_] = string_150_
                                    GlBufferObjectStatics.aStringArray4744!![i_154_] = string_152_
                                    NpcCountAccessor.anIntArray2280!![i_154_] = i_151_
                                    string = null
                                    ObjectSpawnDecoder.aBooleanArray1806!![i_154_] = bool_153_
                                    break
                                }
                            } else if (string_150_ == WaterTextureSetStatics.aStringArray1441!![i_154_]) {
                                WaterTextureSetStatics.aStringArray1441!![i_154_] = string
                                FixedFunctionMaterialPassStatics.aStringArray6205!![i_154_] = string_150_
                                string = null
                                break
                            }
                            i_154_++
                        }
                        if (string != null && HslAdjustTextureNodeStatics.anInt9383 < 200) {
                            WaterTextureSetStatics.aStringArray1441!![HslAdjustTextureNodeStatics.anInt9383] = string
                            FixedFunctionMaterialPassStatics.aStringArray6205!![(HslAdjustTextureNodeStatics.anInt9383)] = string_150_
                            RendererStatics.anIntArray4578!![HslAdjustTextureNodeStatics.anInt9383] = i
                            GlBufferObjectStatics.aStringArray4744!![HslAdjustTextureNodeStatics.anInt9383] = string_152_
                            NpcCountAccessor.anIntArray2280!![HslAdjustTextureNodeStatics.anInt9383] = i_151_
                            ObjectSpawnDecoder.aBooleanArray1806!![HslAdjustTextureNodeStatics.anInt9383] = bool_153_
                            HslAdjustTextureNodeStatics.anInt9383++
                        }
                    }
                    MinimapSpriteRendererStatics.anInt4930 = 2
                    Crc64HashableStatics.anInt4985 = ResourceLoaderThreadStatics.anInt3918
                    var bool_156_ = false
                    var i = HslAdjustTextureNodeStatics.anInt9383
                    while (i > 0) {
                        i--
                        bool_156_ = true
                        var i_157_ = 0
                        while (i > i_157_) {
                            if (((CacheStateResetter.aServerConnectionInfo_125!!.anInt2143 != RendererStatics.anIntArray4578!![i_157_]) && (RendererStatics.anIntArray4578!![i_157_ - -1] == CacheStateResetter.aServerConnectionInfo_125!!.anInt2143)) || (RendererStatics.anIntArray4578!![i_157_] == 0 && (RendererStatics.anIntArray4578!![1 + i_157_] != 0))) {
                                val i_158_ = RendererStatics.anIntArray4578!![i_157_]
                                RendererStatics.anIntArray4578!![i_157_] = RendererStatics.anIntArray4578!![1 + i_157_]
                                RendererStatics.anIntArray4578!![i_157_ - -1] = i_158_
                                val string = GlBufferObjectStatics.aStringArray4744!![i_157_]
                                GlBufferObjectStatics.aStringArray4744!![i_157_] = GlBufferObjectStatics.aStringArray4744!![1 + i_157_]
                                GlBufferObjectStatics.aStringArray4744!![1 + i_157_] = string
                                val string_159_ = WaterTextureSetStatics.aStringArray1441!![i_157_]
                                WaterTextureSetStatics.aStringArray1441!![i_157_] = WaterTextureSetStatics.aStringArray1441!![i_157_ + 1]
                                WaterTextureSetStatics.aStringArray1441!![i_157_ + 1] = string_159_
                                val string_160_ = FixedFunctionMaterialPassStatics.aStringArray6205!![i_157_]
                                FixedFunctionMaterialPassStatics.aStringArray6205!![i_157_] = FixedFunctionMaterialPassStatics.aStringArray6205!![i_157_ + 1]
                                FixedFunctionMaterialPassStatics.aStringArray6205!![i_157_ - -1] = string_160_
                                val i_161_ = NpcCountAccessor.anIntArray2280!![i_157_]
                                NpcCountAccessor.anIntArray2280!![i_157_] = NpcCountAccessor.anIntArray2280!![1 + i_157_]
                                NpcCountAccessor.anIntArray2280!![i_157_ + 1] = i_161_
                                val bool_162_ = ObjectSpawnDecoder.aBooleanArray1806!![i_157_]
                                ObjectSpawnDecoder.aBooleanArray1806!![i_157_] = ObjectSpawnDecoder.aBooleanArray1806!![1 + i_157_]
                                bool_156_ = false
                                ObjectSpawnDecoder.aBooleanArray1806!![i_157_ + 1] = bool_162_
                            }
                            i_157_++
                        }
                        if (bool_156_) break
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (CompositeRgbNoiseTextureStatics.aIntRange_8683 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    if (SkeletalAnimFrameLoaderStatics.aFrame476 != null) WhirlpoolHashStatics.method830(IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350), -1, 102.toByte(), false, -1)
                    val `is` = ByteArray(RadialTextureNodeStatics.anInt9341)
                    CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.method3409(RadialTextureNodeStatics.anInt9341, `is`, 0, -32769)
                    val string = method3546(`is`, 0, RadialTextureNodeStatics.anInt9341, 0)
                    GrowableStringListStatics.method1360(string, VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992, IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 1, true, 99)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (FixedFunctionWaterPassStatics.aIntRange_7363 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    var i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    if (i == 65535) i = -1
                    val i_163_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_164_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_165_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_166_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    TextureTileRendererStatics.method2947(true, i_165_, i, i_163_, i_164_, i_166_)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == GraphicsOptionStateStatics.aIntRange_3143) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_167_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByte(-83)
                    ProjectedGroundDecorStatics.aVarpStore_10209!!.method1313(42.toByte(), i_167_.toInt(), i)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == GroundDecorEntityStatics.aIntRange_8756) {
                    var i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                    if (i == 65535) i = -1
                    val i_168_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                    WallSceneEntityStatics.method2397((-127).toByte())
                    SpriteStoreStatics.method304(i, 437853543, i_168_)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == GroundDecorRendererStatics.aIntRange_3641) {
                    method128(IntKeyNodeStatics.aRgbColorPalette_6977, 8.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == MapSceneIconDefStatics.aIntRange_2860) {
                    var i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    if (i == 65535) i = -1
                    val i_169_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_170_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_171_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_172_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    SoundChannelMixerStatics.method2090(i_169_, i_172_, false, (-35).toByte(), i_171_, i_170_, i)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
    
                if (ModelVertexColorBufferStatics.aIntRange_6584 == ConnectionStateRefs.aIntRange_318) {
                    ColourKeyTextureNodeStatics.method3120(-86)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return false
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == ParticleProcessorStatics.aIntRange_4272) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(-127)
                    val i_173_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    WallSceneEntityStatics.method2397((-128).toByte())
                    OggCacheStreamStatics.method524(i_173_, true, i, -127)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (CircleDrawer.aIntRange_2693 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val bool_174_ = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                    val string = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(107.toByte())
                    var string_175_ = string
                    if (bool_174_) string_175_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-71).toByte())
                    val l = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944).toLong()
                    val l_176_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readMedium(-1).toLong()
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_177_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val l_178_ = l_176_ + (l shl 32)
                    var bool_179_ = false
                    while_220_@ do {
                        for (i_180_ in 0..99) {
                            if (l_178_ == SceneCollisionEntryStatics.aLongArray4410!![i_180_]) {
                                bool_179_ = true
                                break@while_220_
                            }
                        }
                        if (i <= 1 && FontMetaRefStatics.method3455(string_175_, 28280)) bool_179_ = true
                    } while (false)
                    if (!bool_179_ && BackgroundWorkerThreadStatics.anInt3227 == 0) {
                        SceneCollisionEntryStatics.aLongArray4410!![NpcTypeStatics.anInt1359] = l_178_
                        NpcTypeStatics.anInt1359 = (NpcTypeStatics.anInt1359 - -1) % 100
                        val string_181_ = (BrightnessOptionStateStatics.aCompiledScriptCache_5900!!.method3471(i_177_, (-93).toByte()).method3216(CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!, 62.toByte()))
                        if (i == 2) TrackedGroundDecorStatics.method2477("<img=1>" + string_175_, string_181_, (-110).toByte(), i_177_, "<img=1>" + string, null, 18, 0, string)
                        else if (i == 1) TrackedGroundDecorStatics.method2477("<img=0>" + string_175_, string_181_, (-112).toByte(), i_177_, "<img=0>" + string, null, 18, 0, string)
                        else TrackedGroundDecorStatics.method2477(string_175_, string_181_, (-118).toByte(), i_177_, string, null, 18, 0, string)
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == GlEnvMappedWaterPassStatics.aIntRange_7367) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                    val i_182_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntLittle((-122).toByte())
                    val i_183_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteAdd((-95).toByte())
                    WallSceneEntityStatics.method2397((-125).toByte())
                    val class348_sub41 = (MinimapSpriteRendererStatics.aHashtable_4915!!.method3480(i_182_.toLong(), -6008) as RegionSceneShifter?)
                    if (class348_sub41 != null) ScrollingWidgetComponentNodeStatics.method1118(i != (class348_sub41.anInt7050), false, class348_sub41, 2533)
                    MapTileShapeStatics.method2661(i, i_182_, i_183_, false, 2)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == ScrollingWidgetComponentNodeStatics.aIntRange_8384) {
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    MinimapSpriteRendererStatics.anInt4930 = 1
                    Crc64HashableStatics.anInt4985 = ResourceLoaderThreadStatics.anInt3918
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == PingHostListHolder.aIntRange_2335) {
                    WallSceneEntityStatics.method2397((-125).toByte())
                    MinimapStateReset.method1122(0)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (MinimapRectClipper.aIntRange_220 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_184_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_185_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    WallSceneEntityStatics.method2397((-125).toByte())
                    if (WarpTextureNodeStatics.aWidgetComponentArrayArray9427!![i] != null) {
                        var i_186_ = i_184_
                        while (i_185_ > i_186_) {
                            val i_187_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readMedium(-1)
                            if ((WarpTextureNodeStatics.aWidgetComponentArrayArray9427!![i])!!.size > i_186_ && (WarpTextureNodeStatics.aWidgetComponentArrayArray9427!![i]!![i_186_]) != null) WarpTextureNodeStatics.aWidgetComponentArrayArray9427!![i]!![i_186_]!!.anInt732 = i_187_
                            i_186_++
                        }
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == WaterDetailOptionStateStatics.aIntRange_5992) {
                    method128(SplashImageLoadableStatics.aRgbColorPalette_4689, 8.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (TerrainShadowBuilderGl3Statics.aIntRange_7015 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    GradientLookupEffectStatics.anInt9200 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteAdd(126.toByte())
                    FileExistsConditionStatics.anInt4786 = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(-622951480).toInt() shl 3)
                    BufferedMessageQueueStatics.anInt3581 = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(-622951480).toInt() shl 3)
                    var class348_sub37 = ModelBatchBaseStatics.aHashtable_1895!!.method3484(0) as? HashTableContainer?
                    while (class348_sub37 != null) {
                        val i = ((class348_sub37.aLong4291 shr 28) and 0x3L).toInt()
                        val i_188_ = (class348_sub37.aLong4291 and 0x3fffL).toInt()
                        val i_189_ = i_188_ + -ArbVertexProgramStatics.regionTileX
                        val i_190_ = (0x3fffL and (class348_sub37.aLong4291 shr 14)).toInt()
                        val i_191_ = -RegionMapDecoder.regionTileY + i_190_
                        if (i == GradientLookupEffectStatics.anInt9200 && BufferedMessageQueueStatics.anInt3581 <= i_189_ && 8 + BufferedMessageQueueStatics.anInt3581 > i_189_ && FileExistsConditionStatics.anInt4786 <= i_191_ && FileExistsConditionStatics.anInt4786 - -8 > i_191_) {
                            class348_sub37.method2715(89.toByte())
                            if (i_189_ >= 0 && i_191_ >= 0 && i_189_ < GlCubemapLightPassStatics.anInt7319 && (i_191_ < RangeThresholdTextureNodeStatics.anInt9109)) ProjectileSpawner.method1479(i_191_, (-118).toByte(), i_189_, GradientLookupEffectStatics.anInt9200)
                        }
                        class348_sub37 = (ModelBatchBaseStatics.aHashtable_1895!!.method3482(0) as? HashTableContainer?)
                    }
                    var class348_sub27 = (SpriteRenderEntryStatics.aNodeDeque_9711!!.method1995(4) as? MultiFieldRecord?)
                    while (class348_sub27 != null) {
                        if ((BufferedMessageQueueStatics.anInt3581 <= class348_sub27.anInt6905) && (class348_sub27.anInt6905 < BufferedMessageQueueStatics.anInt3581 - -8) && (class348_sub27.anInt6896 >= FileExistsConditionStatics.anInt4786) && (class348_sub27.anInt6896 < FileExistsConditionStatics.anInt4786 + 8) && (class348_sub27.anInt6899 == GradientLookupEffectStatics.anInt9200)) class348_sub27.anInt6893 = 0
                        class348_sub27 = SpriteRenderEntryStatics.aNodeDeque_9711!!.method1990(31.toByte()) as? MultiFieldRecord?
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == TextureQualityOptionStateStatics.aIntRange_5997) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                    val `is` = IntArray(4)
                    for (i_192_ in 0..3) `is`[i_192_] = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_193_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                    val class348_sub22 = (NpcEntityUpdater.aHashtable_3654!!.method3480(i_193_.toLong(), -6008) as NpcReference?)
                    if (class348_sub22 != null) SoundBankPatchStatics.method2931(i, 110.toByte(), `is`, (class348_sub22.aNpc_6859))
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == CellNoiseTextureNodeStatics.aIntRange_9285) {
                    KeyboardLayoutCacheStatics.anInt3306 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (GradientMapTextureNodeStatics.aIntRange_9324 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-104).toByte())
                    val i_194_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-92).toByte())
                    var i_195_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-127)
                    if (i_195_ == 65535) i_195_ = -1
                    HeadIconRendererStatics.method1212(i_194_, i_195_, -1, i)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (LocTypeDefinitionStatics.aIntRange_4015 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.method3363(-13309)
                    var i_196_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-124)
                    if (i_196_ == 65535) i_196_ = -1
                    val i_197_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                    ClickFeedbackTaskStatics.method1352(i_196_, i_197_, i, (-98).toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (GradientLookupEffectStatics.aIntRange_9197 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val string = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-43).toByte())
                    val string_198_ = CompositeRgbNoiseTextureStatics.method572((InvertTextureNodeStatics.method3136(64.toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813))), 23034)
                    FixedFunctionMaterialPassStatics.method2144(string, 6, (-101).toByte(), 0, string_198_, string, string)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == ScrollingWidgetComponentNodeStatics.aIntRange_8385) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntLittle((-124).toByte())
                    val string = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-97).toByte())
                    WallSceneEntityStatics.method2397((-125).toByte())
                    method1803(i, string, -32394)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == SpotAnimVectorStatics.aIntRange_2305) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                    val i_199_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                    val i_200_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                    WallSceneEntityStatics.method2397((-126).toByte())
                    method1703(5, i, i_200_, 4, i_199_)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (LocConfigModelBuilderStatics.aIntRange_4500 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val bool_201_ = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte()) == 1)
                    WallSceneEntityStatics.method2397((-124).toByte())
                    ObjectSpawnDecoder.aBoolean1801 = bool_201_
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == NoiseTextureGeneratorStatics.aIntRange_1068) {
                    LocDefinitionCacheStatics.method2038(-103)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (HashTileShapeStatics.aIntRange_8817 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    ShaderProgramStatics.anInt7276 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(69.toByte())
                    BufferToggleStateStatics.anInt3713 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteAdd((-82).toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == BlankTextureNodeStatics.aIntRange_9257) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                    val i_202_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(127)
                    WallSceneEntityStatics.method2397((-125).toByte())
                    if (i == 2) FrameStatsResetStatics.method1134(92)
                    RenderNodeStatics.anInt9721 = i_202_
                    RegionTileNodeStatics.method2772(i_202_, 123.toByte())
                    method1713(false, 520)
                    ChatCommandProcessor.method703(RenderNodeStatics.anInt9721)
                    for (i_203_ in 0..99) GzipDecompressorStatics.aBooleanArray2076!![i_203_] = true
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == WalkingTypeUtil.aIntRange_3307) {
                    if (!RsaPacketDecoderStatics.method2672(WorldMapRendererStatics.anInt4674, -105)) RegionSceneLoader.anInt3699 = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944) * 30)
                    else RegionSceneLoader.anInt3699 = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944).toFloat() * 2.5f).toInt()
                    TurbulenceTextureNodeStatics.anInt9313 = ResourceLoaderThreadStatics.anInt3918
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == SceneEntityStatics.aIntRange_6383) {
                    var i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    if (i == 65535) i = -1
                    val i_204_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_205_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_206_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    SoundChannelMixerStatics.method2090(i_204_, 256, true, (-35).toByte(), i_206_, i_205_, i)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (SequencedWallEntityStatics.aIntRange_10149 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    var i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(-16)
                    if (i == 65535) i = -1
                    val i_207_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                    WallSceneEntityStatics.method2397((-125).toByte())
                    method1703(1, i_207_, i, 4, -1)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == NanoTimerStatics.aIntRange_843) {
                    method128(NpcUpdateProcessor.aRgbColorPalette_1519, 8.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == LightingOptionStateStatics.aIntRange_5883) {
                    var i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(125)
                    if (i == 65535) i = -1
                    var i_208_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                    if (i_208_ == 65535) i_208_ = -1
                    val i_209_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                    val i_210_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                    WallSceneEntityStatics.method2397((-127).toByte())
                    for (i_211_ in i_208_..i) {
                        val l = i_211_.toLong() + (i_209_.toLong() shl 32)
                        val class348_sub44 = (TextureDefinitionCacheStatics.aHashtable_2959!!.method3480(l, -6008) as PackedFlagsAccessor?)
                        val class348_sub44_212_: PackedFlagsAccessor?
                        if (class348_sub44 != null) {
                            class348_sub44_212_ = PackedFlagsAccessor(i_210_, (class348_sub44.anInt7093))
                            class348_sub44.method2715(80.toByte())
                        } else if (i_211_ == -1) class348_sub44_212_ = (PackedFlagsAccessor(i_210_, method2570(1512932720, i_209_)!!.aClass348_Sub44_748!!.anInt7093))
                        else class348_sub44_212_ = PackedFlagsAccessor(i_210_, -1)
                        TextureDefinitionCacheStatics.aHashtable_2959!!.method3483(114.toByte(), l, class348_sub44_212_)
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == HeadIconRendererStatics.aIntRange_2068) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(-103)
                    val i_213_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                    ProjectedGroundDecorStatics.aVarpStore_10209!!.method1316((-124).toByte(), i, i_213_)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == ArchiveResourceProviderStatics.aIntRange_6340) {
                    CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197 += 28
                    if (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.method3352(-25541)) GrowableStringListStatics.method1365((CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197) + -28, (-126).toByte(), CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == WidgetDefinitionStatics.aIntRange_250) {
                    ConfigVarProgressStatics.anInt4816 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    TurbulenceTextureNodeStatics.anInt9313 = ResourceLoaderThreadStatics.anInt3918
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (MapSceneDefLoaderStatics.aIntRange_2483 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(20.toByte())
                    val i_214_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                    val i_215_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                    TextureGeneratorStatics.anIntArray2497!![i_214_] = i_215_
                    ServerConnectionInfoStatics.anIntArray2145!![i_214_] = i
                    SpotAnimDefCache.anIntArray3295!![i_214_] = 1
                    val i_216_ = FireParticleStreamStatics.anIntArray100!![i_214_] + -1
                    var i_217_ = 0
                    while (i_216_ > i_217_) {
                        if (StaticNoiseTextureStatics.anIntArray8663!![i_217_] <= i_215_) SpotAnimDefCache.anIntArray3295!![i_214_] = i_217_ - -2
                        i_217_++
                    }
                    LoadingScreenStateStatics.anIntArray2632!![NpcSummaryDefinitionStatics.method1166(31, EmoteDefCacheStatics.anInt4086++)] = i_214_
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (WorldListEntryStatics.aIntRange_315 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    method128(RectangleBoundsStatics.aRgbColorPalette_2157, 8.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ItemNameResolverStatics.aIntRange_4998 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(10)
                    val i_218_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(70.toByte())
                    val bool_219_ = (0x1 and i_218_) == 1
                    RangeThresholdTextureNodeStatics.method3054(bool_219_, i, -128)
                    LoadingScreenStateStatics.anIntArray2633!![NpcSummaryDefinitionStatics.method1166(31, DualMaterialContainerStatics.anInt1631++)] = i
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (CombineTextureNodeStatics.aIntRange_9225 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_220_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val bool_221_ = (i_220_ and 0x1) == 1
                    while ((CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.anInt7197) < RadialTextureNodeStatics.anInt9341) {
                        val i_222_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readSmart(-125)
                        val i_223_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        var i_224_ = 0
                        if (i_223_ != 0) {
                            i_224_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                            if (i_224_ == 255) i_224_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                        }
                        DelegatingRenderCanvasStatics.method121(i, -364570972, bool_221_, i_222_, i_224_, -1 + i_223_)
                    }
                    LoadingScreenStateStatics.anIntArray2633!![NpcSummaryDefinitionStatics.method1166(31, DualMaterialContainerStatics.anInt1631++)] = i
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (BinaryGraphicsOptionStateStatics.aIntRange_5950 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    var i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-113).toByte())
                    var i_225_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteAdd(127.toByte())
                    if (i == 255) {
                        i_225_ = -1
                        i = -1
                    }
                    method1825(120, i_225_, i)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (GlGroundShaderPassStatics.aIntRange_7398 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntLittle((-124).toByte())
                    val i_226_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                    WallSceneEntityStatics.method2397((-124).toByte())
                    MinimapPolygonDrawerStatics.method467(i_226_, -18075, i)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (UnusedToStringStubStatics.aIntRange_2717 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    NpcUpdateProcessor.method856(63.toByte())
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (BasicGlRenderPassStatics.aIntRange_7301 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val bool_227_ = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                    val string = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(89.toByte())
                    var string_228_ = string
                    if (bool_227_) string_228_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(98.toByte())
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_229_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    var bool_230_ = false
                    if (i <= 1 && FontMetaRefStatics.method3455(string_228_, 28280)) bool_230_ = true
                    if (!bool_230_ && BackgroundWorkerThreadStatics.anInt3227 == 0) {
                        val string_231_ = (BrightnessOptionStateStatics.aCompiledScriptCache_5900!!.method3471(i_229_, (-108).toByte()).method3216(CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!, 93.toByte()))
                        if (i == 2) TrackedGroundDecorStatics.method2477("<img=1>" + string_228_, string_231_, (-127).toByte(), i_229_, "<img=1>" + string, null, 25, 0, string)
                        else if (i != 1) TrackedGroundDecorStatics.method2477(string_228_, string_231_, (-119).toByte(), i_229_, string, null, 25, 0, string)
                        else TrackedGroundDecorStatics.method2477("<img=0>" + string_228_, string_231_, (-125).toByte(), i_229_, "<img=0>" + string, null, 25, 0, string)
                    }
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ScreenBorderFiller.aIntRange_1959 == ModelVertexColorBufferStatics.aIntRange_6584) {
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                    val i_232_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(-110)
                    WallSceneEntityStatics.method2397((-124).toByte())
                    CipheredPacketBufferStatics.method3411(i, 12, i_232_)
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                if (ModelVertexColorBufferStatics.aIntRange_6584 == TextureAtlasStateStatics.aIntRange_4421) {
                    SceneProjectorStatics.anInt2986 = ResourceLoaderThreadStatics.anInt3918
                    if (RadialTextureNodeStatics.anInt9341 == 0) {
                        ByteArrayPool.anInt496 = 0
                        MinimapShapeDrawerStatics.aString863 = null
                        HostPingThreadStatics.aWorldListEntryArray2261 = null
                        CameraSplineNodeStatics.aString6854 = null
                        ModelVertexColorBufferStatics.aIntRange_6584 = null
                        return true
                    }
                    CameraSplineNodeStatics.aString6854 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-112).toByte())
                    var bool_233_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                    if (bool_233_) CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(108.toByte())
                    val l = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readLong(-456577760)
                    MinimapShapeDrawerStatics.aString863 = ProjectileConfigUtil.method313(l, -104)
                    ModelDefinitionCacheStatics.aByte2871 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByte(-90)
                    val i = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    if (i == 255) {
                        ModelVertexColorBufferStatics.aIntRange_6584 = null
                        return true
                    }
                    ByteArrayPool.anInt496 = i
                    val worldListEntries = arrayOfNulls<WorldListEntry>(100)
                    var i_234_ = 0
                    while (ByteArrayPool.anInt496 > i_234_) {
                        worldListEntries[i_234_] = WorldListEntry()
                        worldListEntries[i_234_]!!.aString314 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(103.toByte())
                        bool_233_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                        if (!bool_233_) worldListEntries[i_234_]!!.aString306 = worldListEntries[i_234_]!!.aString314
                        else worldListEntries[i_234_]!!.aString306 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(107.toByte())
                        worldListEntries[i_234_]!!.aString312 = method2127(2, (worldListEntries[i_234_]!!.aString306))
                        worldListEntries[i_234_]!!.anInt308 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        worldListEntries[i_234_]!!.aByte310 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByte(-118)
                        worldListEntries[i_234_]!!.aString313 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-124).toByte())
                        if (worldListEntries[i_234_]!!.aString306 == LocalPlayerState.aPlayer_1907!!.aString10544) NativeIndexBufferStatics.aByte4702 = worldListEntries[i_234_]!!.aByte310
                        i_234_++
                    }
                    var bool_235_ = false
                    var i_236_ = ByteArrayPool.anInt496
                    while (i_236_ > 0) {
                        i_236_--
                        bool_235_ = true
                        var i_237_ = 0
                        while (i_236_ > i_237_) {
                            if ((worldListEntries[i_237_]!!.aString312!!.compareTo(worldListEntries[1 + i_237_]!!.aString312!!)) > 0) {
                                val class19 = worldListEntries[i_237_]
                                worldListEntries[i_237_] = worldListEntries[i_237_ - -1]
                                worldListEntries[1 + i_237_] = class19
                                bool_235_ = false
                            }
                            i_237_++
                        }
                        if (bool_235_) break
                    }
                    HostPingThreadStatics.aWorldListEntryArray2261 = worldListEntries
                    ModelVertexColorBufferStatics.aIntRange_6584 = null
                    return true
                }
                LinkedListIteratorStatics.method1242(("T1 - " + (if (ModelVertexColorBufferStatics.aIntRange_6584 == null) -1 else ModelVertexColorBufferStatics.aIntRange_6584!!.method1058(110.toByte())) + "," + (if (GraphicsOptionStateStatics.aIntRange_3145 == null) -1 else GraphicsOptionStateStatics.aIntRange_3145!!.method1058(127.toByte())) + "," + (if (SineWaveTextureNodeStatics.aIntRange_9456 == null) -1 else SineWaveTextureNodeStatics.aIntRange_9456!!.method1058(125.toByte())) + " - " + RadialTextureNodeStatics.anInt9341), null, 15004)
                NormalMapTextureNodeStatics.method3141(false, 11.toByte())
                return true
            }
    
            @JvmStatic
            fun method3202(i: Byte) {
                aSceneProjector_10434 = null
                if (i > 38) {
                    aLongArrayArrayArray10431 = null
                    aSceneObjectSpawner_10436 = null
                    aRgbColorPalette_10437 = null
                }
            }
}
