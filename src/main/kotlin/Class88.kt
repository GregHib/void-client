import Gl3dTexture.Companion.method248
import SceneTilePlaneManager.method260
import LightDetailOptionState.Companion.method1802
import NoOpGraphicsOptionState.Companion.method1804
import Class348_Sub3.Companion.method2739
import Class348_Sub40_Sub26.Companion.method3120
import Class348_Sub40_Sub31.Companion.method3131
import Class348_Sub40_Sub7.Companion.method3064
import OutputStream_Sub1.Companion.method132
import OpenGlTerrainTile.Companion.method4002
import NativeShaderProgram.Companion.method3439
import java.io.IOException
import java.net.Socket
import java.net.URL

class Class88 {
    @JvmField
    var aClass318_Sub9_1503: SceneListNode? = SceneListNode()
    private var aClass318_Sub9_1505: SceneListNode? = null

    fun method840(i: Int): Int {
        anInt1496++
        var i_0_ = i
        var class318_sub9 = (this.aClass318_Sub9_1503!!.aClass318_Sub9_6469)
        while (this.aClass318_Sub9_1503 !== class318_sub9) {
            class318_sub9 = class318_sub9!!.aClass318_Sub9_6469
            i_0_++
        }
        return i_0_
    }

    fun method844(class318_sub9: SceneListNode?, bool: Boolean) {
        try {
            anInt1495++
            if (class318_sub9!!.aClass318_Sub9_6468 != null) class318_sub9.method2514(93)
            class318_sub9.aClass318_Sub9_6469 = this.aClass318_Sub9_1503
            class318_sub9.aClass318_Sub9_6468 = (this.aClass318_Sub9_1503!!.aClass318_Sub9_6468)
            if (bool != true) this.aClass318_Sub9_1503 = null
            class318_sub9.aClass318_Sub9_6468!!.aClass318_Sub9_6469 = class318_sub9
            class318_sub9.aClass318_Sub9_6469!!.aClass318_Sub9_6468 = class318_sub9
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("lh.A(" + (if (class318_sub9 != null) "{...}" else "null") + ',' + bool + ')'))
        }
    }

    fun method845(i: Byte) {
        while (true) {
            val class318_sub9 = (this.aClass318_Sub9_1503!!.aClass318_Sub9_6469)
            if (class318_sub9 === this.aClass318_Sub9_1503) break
            class318_sub9!!.method2514(54)
        }
        if (i < 23) aClass318_Sub9_1505 = null
        anInt1493++
        aClass318_Sub9_1505 = null
    }

    fun method846(i: Byte): SceneListNode? {
        anInt1494++
        val class318_sub9 = aClass318_Sub9_1505
        if (class318_sub9 === this.aClass318_Sub9_1503) {
            aClass318_Sub9_1505 = null
            return null
        }
        if (i > -34) aClass318_Sub9_1505 = null
        aClass318_Sub9_1505 = class318_sub9!!.aClass318_Sub9_6469
        return class318_sub9
    }

    fun method848(i: Int): SceneListNode? {
        if (i != 8) return null
        anInt1502++
        val class318_sub9 = (this.aClass318_Sub9_1503!!.aClass318_Sub9_6469)
        if (class318_sub9 === this.aClass318_Sub9_1503) {
            aClass318_Sub9_1505 = null
            return null
        }
        aClass318_Sub9_1505 = class318_sub9!!.aClass318_Sub9_6469
        return class318_sub9
    }

    init {
        this.aClass318_Sub9_1503!!.aClass318_Sub9_6468 = this.aClass318_Sub9_1503
        this.aClass318_Sub9_1503!!.aClass318_Sub9_6469 = this.aClass318_Sub9_1503
    }

    companion object {
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
            return (arrayOf<BoxedIntHolder?>(SpriteSheetCache.aBoxedIntHolder_2568, MinimapRenderer.aBoxedIntHolder_1591, Class6.aBoxedIntHolder_151))
        }

        @JvmStatic
        fun method842(bool: Boolean) {
            anInt1501++
            RectangleRegion.aClass46Array1942 = null
            if (Class59_Sub1.aBoolean5300 && Class348_Sub42_Sub12.method3229(-82) != 1) method132(106, (WorldMapRenderer.anInt4674 == 3) || WorldMapRenderer.anInt4674 == 7, method3439(107), 0, Class348_Sub44.method3306((-111).toByte()), 0)
            var i = 0
            var i_1_ = 0
            if (Class59_Sub1.aBoolean5300) {
                i = NativeTerrainTile.method4008((-124).toByte())
                i_1_ = method260(false)
            }
            ParticleAmountConfig.method1252(i_1_, RenderNode.anInt9721, i_1_, -1, i, i + LocTypeDefinition.anInt4017, i_1_ - -Class348_Sub42_Sub8_Sub2.anInt10432, 116.toByte(), i)
            if (RectangleRegion.aClass46Array1942 != null) {
                method3064(i, SpriteLoadValidator.anInt4792, true, Class348_Sub1.anInt6555, i_1_, Class331.aClass46_4130!!.anInt760, i + LocTypeDefinition.anInt4017, false, RectangleRegion.aClass46Array1942, -1412584499, i_1_ - -Class348_Sub42_Sub8_Sub2.anInt10432)
                RectangleRegion.aClass46Array1942 = null
            }
        }

        @JvmStatic
        fun method843(i: Byte) {
            anInt1499++
            if (NpcDefinition.anInt2955 != 0 && NpcDefinition.anInt2955 != 5) {
                try {
                    val i_2_: Int
                    if (GroundDecorSceneEntity.anInt9971 != 0) i_2_ = 2000
                    else i_2_ = 250
                    if (i_2_ < ++SceneRegionState.anInt197) {
                        if (Class348_Sub40_Sub8.aAbstractGameSocket_9165 != null) {
                            Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1700(36.toByte())
                            Class348_Sub40_Sub8.aAbstractGameSocket_9165 = null
                        }
                        if (GroundDecorSceneEntity.anInt9971 >= 3) {
                            NpcDefinition.anInt2955 = 0
                            GlRectangleTexture.method254(-5, (-111).toByte())
                            return
                        }
                        if (BloomGraphicsOptionState.anInt5969 != 2) ModelHeaderCache.aServerConnectionInfo_3285!!.method1259(0)
                        else CacheStateResetter.aServerConnectionInfo_125!!.method1259(0)
                        GroundDecorSceneEntity.anInt9971++
                        NpcDefinition.anInt2955 = 1
                        SceneRegionState.anInt197 = 0
                    }
                    if (NpcDefinition.anInt2955 == 1) {
                        if (BloomGraphicsOptionState.anInt5969 == 2 && !Loader.splitPorts) FrameStatsReset.aLinkedQueueNode_5800 = (CacheStateResetter.aServerConnectionInfo_125!!.method1262(Class348_Sub23_Sub1.aPrivilegedOperationWorker_8992!!, 36.toByte()))
                        else FrameStatsReset.aLinkedQueueNode_5800 = (ModelHeaderCache.aServerConnectionInfo_3285!!.method1262(Class348_Sub23_Sub1.aPrivilegedOperationWorker_8992!!, 36.toByte()))
                        NpcDefinition.anInt2955 = 2
                    }
                    if (NpcDefinition.anInt2955 == 2) {
                        if (FrameStatsReset.aLinkedQueueNode_5800!!.anInt1997 == 2) throw IOException()
                        if (FrameStatsReset.aLinkedQueueNode_5800!!.anInt1997 != 1) return
                        Class348_Sub40_Sub8.aAbstractGameSocket_9165 = Class348_Sub23_Sub3.method2982((((FrameStatsReset.aLinkedQueueNode_5800!!.anObject1998) as Socket?)!!), (-118).toByte(), 7500)
                        FrameStatsReset.aLinkedQueueNode_5800 = null
                        method2739(0)
                        val class348_sub47 = ProjectileSpawner.method1478(true)
                        class348_sub47!!.aClass348_Sub49_Sub2_7116!!.writeByte(false, ScriptOpcodeHolder.aConfigIdPair_2339!!.anInt400)
                        Class348_Sub42_Sub14.method3243(9, class348_sub47)
                        method1802(0)
                        NpcDefinition.anInt2955 = 3
                    }
                    if (NpcDefinition.anInt2955 == 3) {
                        if (!Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1705(1, 107)) return
                        Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1701(1, 0, (-118).toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                        val i_3_ = ((CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt() and 0xff)
                        if (i_3_ != 0) {
                            NpcDefinition.anInt2955 = 0
                            GlRectangleTexture.method254(i_3_, (-113).toByte())
                            Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1700(36.toByte())
                            Class348_Sub40_Sub8.aAbstractGameSocket_9165 = null
                            GzipDecompressor.method1215(3.toByte())
                            return
                        }
                        CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                        val class348_sub49 = Class348_Sub49(518)
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
                        class348_sub49.writeString((-5).toByte(), TextureGenerator.aString2496!!)
                        class348_sub49.writeLong(Class348_Sub33.aLong6966, (-124).toByte())
                        class348_sub49.writeLong(OutputStream_Sub2.aLong108, (-112).toByte())
                        class348_sub49.method3390(Class348_Sub31.aBigInteger6921, (-76).toByte(), (ActorEntity.aBigInteger8762))
                        method2739(0)
                        val class348_sub47 = ProjectileSpawner.method1478(true)
                        val class348_sub49_sub2 = (class348_sub47!!.aClass348_Sub49_Sub2_7116)!!
                        if (BloomGraphicsOptionState.anInt5969 == 2) {
                            if (WorldMapRenderer.anInt4674 != 13) class348_sub49_sub2.writeByte(false, ScriptOpcodeHolder.aConfigIdPair_2342!!.anInt400)
                            else class348_sub49_sub2.writeByte(false, ScriptOpcodeHolder.aConfigIdPair_2344!!.anInt400)
                            class348_sub49_sub2.writeShort(107.toByte(), 0)
                            val i_6_ = class348_sub49_sub2.anInt7197
                            class348_sub49_sub2.writeInt(117.toByte(), 634)
                            class348_sub49_sub2.writeBytes(class348_sub49.anInt7197, 0, class348_sub49.aByteArray7154!!, 92)
                            val i_7_ = class348_sub49_sub2.anInt7197
                            class348_sub49_sub2.writeString((-5).toByte(), Class64_Sub3.aString5600!!)
                            class348_sub49_sub2.writeByte(false, (RuntimeException_Sub1.anInt4596))
                            class348_sub49_sub2.writeByte(false, Class348_Sub42_Sub12.method3229(-71))
                            class348_sub49_sub2.writeShort(107.toByte(), LocTypeDefinition.anInt4017)
                            class348_sub49_sub2.writeShort(107.toByte(), Class348_Sub42_Sub8_Sub2.anInt10432)
                            class348_sub49_sub2.writeByte(false, IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub20_7248!!.method1808(-32350))
                            method4002(class348_sub49_sub2, 55.toByte())
                            class348_sub49_sub2.writeString((-5).toByte(), BloomGraphicsOptionState.aString5966!!)
                            class348_sub49_sub2.writeInt(120.toByte(), SocketStreamWorker.anInt2670)
                            val class348_sub49_8_ = IntHashSet.aClass348_Sub51_3959!!.method3427(24)
                            class348_sub49_sub2.writeByte(false, (class348_sub49_8_.anInt7197))
                            class348_sub49_sub2.writeBytes(class348_sub49_8_.anInt7197, 0, (class348_sub49_8_.aByteArray7154!!), 74)
                            RenderNode.aBoolean9719 = true
                            val class348_sub49_9_ = Class348_Sub49(Class348_Sub40_Sub20.aClass348_Sub4_9264!!.method2746((-76).toByte()))
                            Class348_Sub40_Sub20.aClass348_Sub4_9264!!.method2747(1, class348_sub49_9_)
                            class348_sub49_sub2.writeBytes((class348_sub49_9_.aByteArray7154!!).size, 0, (class348_sub49_9_.aByteArray7154!!), -73)
                            class348_sub49_sub2.writeShort(107.toByte(), GlArrayBufferObject.anInt4718)
                            class348_sub49_sub2.writeLong(TextureMetadataProvider.aLong4615, (-63).toByte())
                            class348_sub49_sub2.writeByte(false, if (Gl2dTexture.aString8605 == null) 0 else 1)
                            if (Gl2dTexture.aString8605 != null) class348_sub49_sub2.writeString((-5).toByte(), (Gl2dTexture.aString8605!!))
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
                            class348_sub49_sub2.writeString((-5).toByte(), Class64_Sub3.aString5600!!)
                            class348_sub49_sub2.writeByte(false, Class348_Sub42_Sub8_Sub2.aSceneProjector_10434!!.anInt2987)
                            class348_sub49_sub2.writeByte(false, Class348_Sub33.anInt6967)
                            method4002(class348_sub49_sub2, 55.toByte())
                            class348_sub49_sub2.writeString((-5).toByte(), BloomGraphicsOptionState.aString5966!!)
                            class348_sub49_sub2.writeInt(106.toByte(), SocketStreamWorker.anInt2670)
                            SettingsCrcWriter.method1244(92, class348_sub49_sub2)
                            class348_sub49_sub2.method3350(i_5_, true, `is`, (class348_sub49_sub2.anInt7197))
                            class348_sub49_sub2.method3383(1809639944, -i_4_ + (class348_sub49_sub2.anInt7197))
                        }
                        Class348_Sub42_Sub14.method3243(-48, class348_sub47)
                        method1802(0)
                        Class348_Sub23_Sub2.aClass77_9029 = Class77(`is`)
                        for (i_10_ in 0..3) `is`[i_10_] += 50
                        CircleRasterizer.aClass348_Sub49_Sub2_3813!!.method3406(-111, `is`)
                        NpcDefinition.anInt2955 = 4
                    }
                    if (NpcDefinition.anInt2955 == 4) {
                        if (!Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1705(1, 94)) return
                        Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1701(1, 0, (-117).toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                        val i_11_ = ((CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt() and 0xff)
                        if (i_11_ != 21) {
                            if (i_11_ == 29) NpcDefinition.anInt2955 = 13
                            else {
                                if (i_11_ == 1) {
                                    NpcDefinition.anInt2955 = 5
                                    GlRectangleTexture.method254(i_11_, (-125).toByte())
                                    return
                                }
                                if (i_11_ != 2) {
                                    if (i_11_ != 15) {
                                        if (i_11_ == 23 && GroundDecorSceneEntity.anInt9971 < 3) {
                                            NpcDefinition.anInt2955 = 1
                                            GroundDecorSceneEntity.anInt9971++
                                            SceneRegionState.anInt197 = 0
                                            Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1700(36.toByte())
                                            Class348_Sub40_Sub8.aAbstractGameSocket_9165 = null
                                        } else {
                                            NpcDefinition.anInt2955 = 0
                                            GlRectangleTexture.method254(i_11_, (-87).toByte())
                                            Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1700(36.toByte())
                                            Class348_Sub40_Sub8.aAbstractGameSocket_9165 = null
                                            GzipDecompressor.method1215(3.toByte())
                                            return
                                        }
                                        return
                                    }
                                    NpcDefinition.anInt2955 = 14
                                    Class348_Sub40_Sub25.anInt9341 = -2
                                } else NpcDefinition.anInt2955 = 8
                            }
                        } else NpcDefinition.anInt2955 = 7
                    }
                    if (NpcDefinition.anInt2955 == 6) {
                        method2739(0)
                        val class348_sub47 = ProjectileSpawner.method1478(true)
                        val class348_sub49_sub2 = (class348_sub47!!.aClass348_Sub49_Sub2_7116)!!
                        class348_sub49_sub2.method3416(-18, Class348_Sub23_Sub2.aClass77_9029!!)
                        class348_sub49_sub2.method3408((ScriptOpcodeHolder.aConfigIdPair_2351!!.anInt400), 18676)
                        Class348_Sub42_Sub14.method3243(-87, class348_sub47)
                        method1802(0)
                        NpcDefinition.anInt2955 = 4
                    } else if (NpcDefinition.anInt2955 == 7) {
                        if (Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1705(1, 118)) {
                            Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1701(1, 0, (-109).toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                            val i_12_ = 0xff and (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt()
                            NpcDefinition.anInt2955 = 0
                            Class63.anInt1121 = (3 + i_12_) * 60
                            GlRectangleTexture.method254(21, (-95).toByte())
                            Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1700(36.toByte())
                            Class348_Sub40_Sub8.aAbstractGameSocket_9165 = null
                            GzipDecompressor.method1215(3.toByte())
                        }
                    } else if (NpcDefinition.anInt2955 == 13) {
                        if (Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1705(1, 102)) {
                            Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1701(1, 0, (-128).toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                            NpcDefinition.anInt2955 = 0
                            Class348_Sub42_Sub7.anInt9541 = 0xff and (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt()
                            GlRectangleTexture.method254(29, (-97).toByte())
                            Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1700(36.toByte())
                            Class348_Sub40_Sub8.aAbstractGameSocket_9165 = null
                            GzipDecompressor.method1215(3.toByte())
                        }
                    } else if (NpcDefinition.anInt2955 == 8) {
                        if (Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1705(1, 107)) {
                            Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1701(1, 0, (-107).toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                            Class76.Companion.anInt1288 = 0xff and (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt()
                            NpcDefinition.anInt2955 = 9
                        }
                    } else {
                        if (NpcDefinition.anInt2955 == 9) {
                            val class348_sub49_sub2 = CircleRasterizer.aClass348_Sub49_Sub2_3813
                            if (BloomGraphicsOptionState.anInt5969 == 2) {
                                if (!Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1705(Class76.Companion.anInt1288, 93)) return
                                Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1701(Class76.Companion.anInt1288, 0, 60.toByte(), (class348_sub49_sub2!!.aByteArray7154!!))
                                class348_sub49_sub2.anInt7197 = 0
                                AsyncTaskHandle.anInt2581 = class348_sub49_sub2.readUnsignedByte(255)
                                MinimapSpriteRenderer.anInt4919 = class348_sub49_sub2.readUnsignedByte(255)
                                Class348_Sub40_Sub3.aBoolean9103 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                PlayerUpdateDecoder.aBoolean1915 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                Class52.aBoolean4903 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                Class50_Sub2.aBoolean5233 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                Class348_Sub42_Sub11.anInt9591 = class348_sub49_sub2.readUnsignedShort(842397944)
                                FrameBufferObject.aBoolean4888 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                ModelDataCache.anInt359 = class348_sub49_sub2.method3369(125.toByte())
                                ModelBatchBase.aBoolean1900 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                Class348_Sub40_Sub12.aSeqDefinitionCache_9195!!.method2004(ModelBatchBase.aBoolean1900, 25.toByte())
                                Exception_Sub1.aModelHeaderCache_112!!.method1934(11.toByte(), ModelBatchBase.aBoolean1900)
                                MapAreaDefinition.aBufferedMessageQueue_2529!!.method2072(88.toByte(), ModelBatchBase.aBoolean1900)
                            } else {
                                if (!Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1705(Class76.Companion.anInt1288, 107)) return
                                Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1701(Class76.Companion.anInt1288, 0, 85.toByte(), (class348_sub49_sub2!!.aByteArray7154!!))
                                class348_sub49_sub2.anInt7197 = 0
                                AsyncTaskHandle.anInt2581 = class348_sub49_sub2.readUnsignedByte(255)
                                MinimapSpriteRenderer.anInt4919 = class348_sub49_sub2.readUnsignedByte(255)
                                Class348_Sub40_Sub3.aBoolean9103 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                PlayerUpdateDecoder.aBoolean1915 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                Class52.aBoolean4903 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                InputSettingsState.anInt1758 = class348_sub49_sub2.readShort(13638)
                                FrameBufferObject.aBoolean4888 = InputSettingsState.anInt1758 > 0
                                GlArrayBufferObject.anInt4716 = class348_sub49_sub2.readUnsignedShort(842397944)
                                Class322.anInt4026 = class348_sub49_sub2.readUnsignedShort(842397944)
                                FrameBufferObject.anInt4870 = class348_sub49_sub2.readUnsignedShort(842397944)
                                VarpStore.anInt5065 = class348_sub49_sub2.readInt((-126).toByte())
                                Class348_Sub42_Sub6.aLinkedQueueNode_9536 = Class348_Sub23_Sub1.aPrivilegedOperationWorker_8992!!.method2232(116, VarpStore.anInt5065)
                                FloatGrid.anInt4976 = class348_sub49_sub2.readUnsignedByte(255)
                                FrameStatsReset.anInt5797 = class348_sub49_sub2.readUnsignedShort(842397944)
                                Class348_Sub6.anInt6632 = class348_sub49_sub2.readUnsignedShort(842397944)
                                BufferToggleState.aBoolean3706 = class348_sub49_sub2.readUnsignedByte(255) == 1
                                OpenGlTerrainTile.aString8265 = class348_sub49_sub2.method3371(-13487)
                                LocalPlayerState.aPlayer_1907!!.aString10537 = OpenGlTerrainTile.aString8265
                                LocalPlayerState.aPlayer_1907!!.aString10544 = LocalPlayerState.aPlayer_1907!!.aString10537
                                GameAppletFrame.anInt37 = class348_sub49_sub2.readUnsignedByte(255)
                                Class348_Sub1.anInt6551 = class348_sub49_sub2.readInt((-126).toByte())
                                IndexedSprite.aServerConnectionInfo_5199 = ServerConnectionInfo()
                                IndexedSprite.aServerConnectionInfo_5199!!.anInt2143 = class348_sub49_sub2.readUnsignedShort(842397944)
                                if (IndexedSprite.aServerConnectionInfo_5199!!.anInt2143 == 65535) IndexedSprite.aServerConnectionInfo_5199!!.anInt2143 = -1
                                IndexedSprite.aServerConnectionInfo_5199!!.aString2147 = class348_sub49_sub2.method3371(-13487)
                                if (Class55_Sub1.aClass364_5271 != Class8.aClass364_165) {
                                    IndexedSprite.aServerConnectionInfo_5199!!.anInt2138 = (50000 + (IndexedSprite.aServerConnectionInfo_5199!!.anInt2143))
                                    IndexedSprite.aServerConnectionInfo_5199!!.anInt2148 = (40000 + (IndexedSprite.aServerConnectionInfo_5199!!.anInt2143))
                                }
                                if (Class8.aClass364_165 != Class76.Companion.aClass364_1279 && ((CacheStateResetter.aServerConnectionInfo_125!!.method1264(94.toByte(), GlElementArrayBuffer.aServerConnectionInfo_4839)) || (CacheStateResetter.aServerConnectionInfo_125!!.method1264(112.toByte(), (Class348_Sub40_Sub35.aServerConnectionInfo_9443))))) Class348_Sub42_Sub20.method3283(114)
                            }
                            if ((!Class348_Sub40_Sub3.aBoolean9103 || Class52.aBoolean4903) && !FrameBufferObject.aBoolean4888) {
                                try {
                                    JavaScriptBridge.method1617(125.toByte(), Class93.anApplet1530, "unzap")
                                } catch (throwable: Throwable) {
                                    /* empty */
                                }
                            } else {
                                try {
                                    JavaScriptBridge.method1617(125.toByte(), Class93.anApplet1530, "zap")
                                } catch (throwable: Throwable) {
                                    if (WallEntity.aBoolean8773) {
                                        try {
                                            Class93.anApplet1530!!.showDocument(URL(Class93.anApplet1530!!.getCodeBase(), "blank.ws"), "tbi")
                                        } catch (exception: Exception) {
                                            /* empty */
                                        }
                                    }
                                }
                            }
                            if (Class8.aClass364_165 == Class55_Sub1.aClass364_5271) {
                                try {
                                    JavaScriptBridge.method1617(125.toByte(), Class93.anApplet1530, "loggedin")
                                } catch (throwable: Throwable) {
                                    /* empty */
                                }
                            }
                            if (BloomGraphicsOptionState.anInt5969 == 2) NpcDefinition.anInt2955 = 11
                            else {
                                NpcDefinition.anInt2955 = 0
                                GlRectangleTexture.method254(2, (-92).toByte())
                                method1804(8839)
                                Class348_Sub49.method3379(2, 7)
                                Class348_Sub3.aIntRange_6584 = null
                                return
                            }
                        }
                        if (NpcDefinition.anInt2955 == 11) {
                            if (!Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1705(3, 94)) return
                            Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1701(3, 0, 11.toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                            NpcDefinition.anInt2955 = 12
                        }
                        if (NpcDefinition.anInt2955 == 12) {
                            val class348_sub49_sub2 = CircleRasterizer.aClass348_Sub49_Sub2_3813
                            class348_sub49_sub2!!.anInt7197 = 0
                            if (class348_sub49_sub2.method3404(-1510)) {
                                if (!Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1705(1, 110)) return
                                Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1701(1, 3, (-127).toByte(), (class348_sub49_sub2.aByteArray7154!!))
                            }
                            Class348_Sub3.aIntRange_6584 = (method248(-11271)[class348_sub49_sub2.method3407(15295)])
                            Class348_Sub40_Sub25.anInt9341 = class348_sub49_sub2.readUnsignedShort(842397944)
                            NpcDefinition.anInt2955 = 10
                        }
                        if (NpcDefinition.anInt2955 == 10) {
                            if (Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1705(Class348_Sub40_Sub25.anInt9341, 96)) {
                                Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1701(Class348_Sub40_Sub25.anInt9341, 0, 28.toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                                CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                                NpcDefinition.anInt2955 = 0
                                val i_13_ = Class348_Sub40_Sub25.anInt9341
                                GlRectangleTexture.method254(2, (-124).toByte())
                                FrameStatsReset.method1135(0)
                                SimpleToggleOptionState.method1741(CircleRasterizer.aClass348_Sub49_Sub2_3813!!, 118.toByte())
                                Renderer.anInt4581 = -1
                                if (Class348_Sub3.aIntRange_6584 != WorldListEntry.aIntRange_304) method3120(-92)
                                else Class90.method853(99.toByte())
                                if (i_13_ != CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197) throw RuntimeException("lswp pos:" + (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197) + " psize:" + i_13_)
                                Class348_Sub3.aIntRange_6584 = null
                            }
                        } else {
                            val i_14_ = -128 / (-i / 53)
                            if (NpcDefinition.anInt2955 == 14) {
                                if (Class348_Sub40_Sub25.anInt9341 == -2) {
                                    if (!Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1705(2, 106)) return
                                    Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1701(2, 0, (-128).toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                                    CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                                    Class348_Sub40_Sub25.anInt9341 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                                }
                                if (Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1705(Class348_Sub40_Sub25.anInt9341, 117)) {
                                    Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1701(Class348_Sub40_Sub25.anInt9341, 0, (-104).toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                                    CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                                    val i_15_ = Class348_Sub40_Sub25.anInt9341
                                    NpcDefinition.anInt2955 = 0
                                    GlRectangleTexture.method254(15, (-120).toByte())
                                    WidgetRedrawTracker.method2330(86.toByte())
                                    SimpleToggleOptionState.method1741(CircleRasterizer.aClass348_Sub49_Sub2_3813!!, 118.toByte())
                                    if (i_15_ != (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197)) throw RuntimeException("lswpr pos:" + (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197) + " psize:" + i_15_)
                                    Class348_Sub3.aIntRange_6584 = null
                                }
                            }
                        }
                    }
                } catch (ioexception: IOException) {
                    if (Class348_Sub40_Sub8.aAbstractGameSocket_9165 != null) {
                        Class348_Sub40_Sub8.aAbstractGameSocket_9165!!.method1700(36.toByte())
                        Class348_Sub40_Sub8.aAbstractGameSocket_9165 = null
                    }
                    if (GroundDecorSceneEntity.anInt9971 >= 3) {
                        NpcDefinition.anInt2955 = 0
                        GlRectangleTexture.method254(-4, (-87).toByte())
                        GzipDecompressor.method1215(3.toByte())
                    } else {
                        if (BloomGraphicsOptionState.anInt5969 != 2) ModelHeaderCache.aServerConnectionInfo_3285!!.method1259(0)
                        else CacheStateResetter.aServerConnectionInfo_125!!.method1259(0)
                        GroundDecorSceneEntity.anInt9971++
                        SceneRegionState.anInt197 = 0
                        NpcDefinition.anInt2955 = 1
                    }
                }
            }
        }

        @JvmStatic
        fun method847(string: String, i: Int) {
            println("Error: " + Class341.method2680("\n", true, "%0a", string))
            anInt1492++
            if (i != -5192) method843(17.toByte())
        }
    }
}
