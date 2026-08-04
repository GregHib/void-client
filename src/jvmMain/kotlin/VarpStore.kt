import ChatEffectsOptionState.Companion.method1730
import MidiSequencePlayer.Companion.method2862
import FixedFunctionWaterPass.Companion.method3548
import WorldMapElement.Companion.method181
import GameClock.method599
import RegionMapDecoder.aByteArrayArray1887
import TrigLookupTablesStatics.method726
import NativeTerrainTile.Companion.method4004
import kotlin.collections.set

/* Class170 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class VarpStore : VarResolver {
    var anIntArray5063: IntArray
    private var aHashtable_5070 = Hashtable(128)
    private val anIntArray5078: IntArray
    fun method1305(i: Byte, bool: Boolean): Int {
        anInt5071++
        if (i >= -124) method1308(-105, 89, -65, -52, 76.toByte(), 37, -61, 73)
        val l = method599(-79)
        var class348_sub14 = (if (bool) aHashtable_5070.method3484(0) as LongKeyNode? else aHashtable_5070.method3482(0) as LongKeyNode?)
        while (class348_sub14 != null) {
            if (l > (class348_sub14.aLong6762 and 0x3fffffffffffffffL)) {
                if ((0x4000000000000000L and class348_sub14.aLong6762) != 0L) {
                    val i_0_ = class348_sub14.aLong4291.toInt()
                    this.anIntArray5063[i_0_] = anIntArray5078[i_0_]
                    class348_sub14.method2715(31.toByte())
                    return i_0_
                }
                class348_sub14.method2715(75.toByte())
            }
            class348_sub14 = aHashtable_5070.method3482(0) as LongKeyNode?
        }
        return -1
    }

    fun method1306(i: Byte, i_1_: Int, i_2_: Int) {
        if (i.toInt() == -78) {
            anInt5066++
            this.anIntArray5063[i_2_] = i_1_
            var class348_sub14 = (aHashtable_5070.method3480(i_2_.toLong(), -6008) as LongKeyNode?)
            if (class348_sub14 == null) {
                class348_sub14 = LongKeyNode(500L + method599(-122))
                aHashtable_5070.method3483(73.toByte(), i_2_.toLong(), class348_sub14)
            } else class348_sub14.aLong6762 = method599(-88) - -500L
        }
    }

    override fun method62(i: Int, i_3_: Int): Int {
        anInt5068++
        val class146 = RenderConfigFactoryStatics.aVarbitDefLoader_2981!!.method1446(i, -1)
        val i_4_ = class146!!.anInt2019
        if (i_3_ != -65536) return -52
        val i_5_ = class146.anInt2016
        val i_6_ = class146.anInt2020
        val i_7_ = anIntArray1885!![-i_5_ + i_6_]
        return this.anIntArray5063[i_4_] shr i_5_ and i_7_
    }

    fun method1307(i: Int, i_8_: Int, i_9_: Int) {
        var i_9_ = i_9_
        anInt5074++
        val class146 = RenderConfigFactoryStatics.aVarbitDefLoader_2981!!.method1446(i, -1)
        val i_10_ = class146!!.anInt2019
        val i_11_ = class146.anInt2016
        val i_12_ = class146.anInt2020
        var i_13_ = anIntArray1885!![-i_11_ + i_12_]
        if (i_8_ < (i_9_.inv()) || i_13_ < i_9_) i_9_ = 0
        i_13_ = i_13_ shl i_11_
        method1306((-78).toByte(), i_9_ shl i_11_ and i_13_ or ((this.anIntArray5063[i_10_]) and (i_13_.inv())), i_10_)
    }

    fun method1313(i: Byte, i_24_: Int, i_25_: Int) {
        anInt5073++
        if (i.toInt() != 42) anInt5065 = -16
        anIntArray5078[i_25_] = i_24_
        var class348_sub14 = (aHashtable_5070.method3480(i_25_.toLong(), i + -6050) as LongKeyNode?)
        if (class348_sub14 == null) {
            class348_sub14 = LongKeyNode(4611686018427387905L)
            aHashtable_5070.method3483(19.toByte(), i_25_.toLong(), class348_sub14)
        } else if (class348_sub14.aLong6762 != 4611686018427387905L) class348_sub14.aLong6762 = 0x4000000000000000L or 500L + method599(-108)
    }

    fun method1314(i: Byte) {
        var i_26_ = 0
        while ((i_26_ < NormalMapGenerator.aParticleAmountCache_3453!!.anInt2845)) {
            val class159 = NormalMapGenerator.aParticleAmountCache_3453!!.method1588(-105, i_26_)
            if (class159 != null && class159.anInt2125 == 0) {
                anIntArray5078[i_26_] = 0
                this.anIntArray5063[i_26_] = 0
            }
            i_26_++
        }
        anInt5076++
        aHashtable_5070 = Hashtable(128)
        val i_27_ = -69 % ((25 - i) / 39)
    }

    override fun method61(i: Int, i_28_: Byte): Int {
        anInt5081++
        if (i_28_.toInt() != -16) anInt5065 = 51
        return this.anIntArray5063[i]
    }

    fun method1316(i: Byte, i_30_: Int, i_31_: Int) {
        var i_31_ = i_31_
        anInt5069++
        val class146 = RenderConfigFactoryStatics.aVarbitDefLoader_2981!!.method1446(i_30_, -1)
        val i_32_ = class146!!.anInt2019
        val i_33_ = class146.anInt2016
        if (i < -56) {
            val i_34_ = class146.anInt2020
            var i_35_ = anIntArray1885!![i_34_ - i_33_]
            if (i_31_ < 0 || i_35_ < i_31_) i_31_ = 0
            i_35_ = i_35_ shl i_33_
            method1313(42.toByte(), (i_31_ shl i_33_ and i_35_ or ((i_35_.inv()) and anIntArray5078[i_32_])), i_32_)
        }
    }

    init {
        this.anIntArray5063 = IntArray(NormalMapGenerator.aParticleAmountCache_3453!!.anInt2845)
        anIntArray5078 = IntArray(NormalMapGenerator.aParticleAmountCache_3453!!.anInt2845)
    }

    companion object {
        var anInt5062: Int = 0
        var anInt5064: Int = 0
        var anInt5065: Int = 0
        var anInt5066: Int = 0
        var aClass237_Sub1_5067: WorldMapSceneSoftware? = null
        var anInt5068: Int = 0
        var anInt5069: Int = 0
        var anInt5071: Int = 0
        var anInt5072: Int = 0
        var anInt5073: Int = 0
        var anInt5074: Int = 0
        var anInt5075: Int = 0
        var anInt5076: Int = 0
        var anInt5077: Int = 0
        var anInt5079: Int = 0
        var anInt5080: Int = 0
        var anInt5081: Int = 0

        fun method1308(i: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Byte, i_18_: Int, i_19_: Int, i_20_: Int) {
            anInt5072++
            if (WorldMapLabel.anInt4960 <= i_15_ && i_19_ <= CameraNodeListStatics.anInt1745 && i_14_ >= LocalPlayerState.anInt1910 && WidgetTextConfig.anInt513 >= i_20_) method1730(i_16_, i_20_, i_14_, i_19_, i, i_18_, -128, i_15_)
            else method4004(i_20_, i_19_, i_14_, i, i_18_, -80, i_15_, i_16_)
            if (i_17_ > -113) aClass237_Sub1_5067 = null
        }

        @JvmStatic
        fun method1309(bool: Boolean, i: Int) {
            if (ActorEntity.aResourceLoaderThread_897 == null) method726(92)
            if (i < 116) aClass237_Sub1_5067 = null
            anInt5062++
            if (bool) ActorEntity.aResourceLoaderThread_897!!.method2326(96)
        }

        @JvmStatic
        fun method1310(bool: Boolean) {
            if (bool == true) aClass237_Sub1_5067 = null
        }

        fun method1311(i: Int, var_renderer: Renderer) {
            LoadingScreenState.aRenderableEntryArray2636 = arrayOfNulls<RenderableEntry>(AbstractTileShapeStatics.anIntArray6547!!.size)
            anInt5064++
            if (i != 5139) anInt5065 = 62
            var i_21_ = 0
            while ((i_21_ < AbstractTileShapeStatics.anIntArray6547!!.size)) {
                val i_22_ = AbstractTileShapeStatics.anIntArray6547!![i_21_]
                val class143 = RangedGraphicsOptionState.method1766((-86).toByte(), i_22_, TerrainTileStatics.aJs5Archive_4585!!)
                val class324 = var_renderer.method3686(class143, SpriteImage.method1523(GlShaderObjectHandle.aJs5Archive_518!!, i_22_), true)
                LoadingScreenState.aRenderableEntryArray2636!![i_21_] = RenderableEntry(class324, class143)
                i_21_++
            }
        }

        @JvmStatic
        fun method1312(i: Byte, class348_sub49: ByteBuffer): RsaVarbitHandler {
            anInt5075++
            val i_23_ = class348_sub49.readInt((-126).toByte())
            if (i < 47) method1315(4)
            return RsaVarbitHandler(i_23_)
        }

        @JvmStatic
        fun method1315(i: Int) {
            anInt5077++
            if (WallEntity.aLinkedQueueNode_8766 != null) {
                if (WallEntity.aLinkedQueueNode_8766!!.anInt1997 == 1) {
                    WallEntity.aLinkedQueueNode_8766 = null
                    return
                }
                if (WallEntity.aLinkedQueueNode_8766!!.anInt1997 == 2) {
                    method2862(RenderableGroup.aPrivilegedOperationWorker_5017, ChatCommandProcessor.aString9554, -120, 2)
                    WallEntity.aLinkedQueueNode_8766 = null
                    return
                }
            }
            val i_29_ = -31 / ((-29 - i) / 61)
        }

        fun method1317(i: Int, i_36_: Byte, i_37_: Int): Boolean {
            anInt5079++
            if (i_36_ >= -67) method1317(43, 36.toByte(), 20)
            return LoadingBarRenderer.method2217(i, i_37_, 0) or ((i_37_ and 0x70000) != 0) || CompassSmoother.method2015(i_37_, i, 7)
        }

        fun method1318(i: Int) {
            if (i != -65536) method1310(false)
            for (i_38_ in 0..<AbstractCameraTransformStatics.anInt1597) {
                val i_39_ = MinimapRectClipper.anIntArray224!![i_38_]
                val npc = ((NpcEntityUpdater.aHashtable_3654!!.method3480(i_39_.toLong(), -6008) as NpcReference).aNpc_6859)!!
                var i_40_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                if ((0x10 and i_40_) != 0) i_40_ += CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i xor 0xff00.inv()) shl 8
                if ((0x2 and i_40_) != 0) {
                    if (npc.aNpcType_10505!!.method793(i xor 0xffff.inv())) method181(true, npc)
                    npc.method2448((MapAreaDefinition.aBufferedMessageQueue_2529!!.method2079(CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readShortAdd(-1), -1)), -2)
                    npc.method2434(95.toByte(), npc.aNpcType_10505!!.anInt1399)
                    npc.anInt10310 = npc.aNpcType_10505!!.anInt1329 shl 3
                    if (npc.aNpcType_10505!!.method793(0)) IdentKitRecolor.method1614(979190089, npc, (npc.plane).toInt(), (npc.anIntArray10317!![0]), (npc.anIntArray10320!![0]), null, null, 0)
                }
                if ((0x8 and i_40_) != 0) {
                    val `is` = IntArray(4)
                    for (i_41_ in 0..3) {
                        `is`[i_41_] = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        if (`is`[i_41_] == 65535) `is`[i_41_] = -1
                    }
                    val i_42_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-121).toByte())
                    SoundBankPatch.method2931(i_42_, 115.toByte(), `is`, npc)
                }
                if ((i_40_ and 0x20) != 0) {
                    var i_43_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                    val i_44_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                    if (i_43_ == 65535) i_43_ = -1
                    val i_45_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    val i_46_ = 0x7 and i_45_
                    var i_47_ = (i_45_ and 0x79) shr 3
                    if (i_47_ == 15) i_47_ = -1
                    npc.method2437(i_46_, i_43_, i xor 0x3c569b2e, i_47_, false, i_44_)
                }
                if ((0x4000 and i_40_) != 0) {
                    val i_48_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                    val `is` = IntArray(i_48_)
                    val is_49_ = IntArray(i_48_)
                    val is_50_ = IntArray(i_48_)
                    var i_51_ = 0
                    while (i_48_ > i_51_) {
                        var i_52_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        if (i_52_ == 65535) i_52_ = -1
                        `is`[i_51_] = i_52_
                        is_49_[i_51_] = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                        is_50_[i_51_] = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-109)
                        i_51_++
                    }
                    method3548(-7387, npc, is_50_, `is`, is_49_)
                }
                if ((i_40_ and 0x200) != 0) {
                    val i_53_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-121).toByte())
                    val `is` = IntArray(i_53_)
                    val is_54_ = IntArray(i_53_)
                    var i_55_ = 0
                    while (i_53_ > i_55_) {
                        val i_56_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                        if ((0xc000 and i_56_) == 49152) {
                            val i_57_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i + 842463480)
                            `is`[i_55_] = WhirlpoolHash.method2057(i_57_, i_56_ shl 16)
                        } else `is`[i_55_] = i_56_
                        is_54_[i_55_] = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        i_55_++
                    }
                    npc.method2430(is_54_, `is`, -100)
                }
                if ((0x4 and i_40_) != 0) {
                    npc.anInt10499 = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                    npc.anInt10512 = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                }
                if ((0x1000 and i_40_) != 0) {
                    npc.anInt10293 = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readByteSubtract(-27697).toInt()
                    npc.anInt10314 = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readByteSubtract(-27697).toInt()
                    npc.anInt10241 = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readByte(-128).toInt()
                    npc.anInt10288 = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readByteSubtract(-27697).toInt()
                    npc.anInt10239 = (CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readShortLittle(false) + GlGroundShaderPass.anInt7396)
                    npc.anInt10300 = (CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readShortAdd(12) - -GlGroundShaderPass.anInt7396)
                    npc.anInt10231 = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(66.toByte())
                    npc.anInt10314 += npc.anIntArray10317!![0]
                    npc.anInt10322 = 0
                    npc.anInt10288 += npc.anIntArray10317!![0]
                    npc.anInt10293 += npc.anIntArray10320!![0]
                    npc.anInt10241 += npc.anIntArray10320!![0]
                    npc.anInt10319 = 1
                }
                if ((i_40_ and 0x2000) != 0) {
                    npc.aByte10255 = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readByteInverse(-622951480)
                    npc.aByte10206 = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readByteSubtract(-27697)
                    npc.aByte10270 = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readByteInverse(i + -622885944)
                    npc.aByte10279 = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255).toByte()
                    npc.anInt10248 = GlGroundShaderPass.anInt7396 + CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    npc.anInt10250 = GlGroundShaderPass.anInt7396 + CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                }
                if ((i_40_ and 0x40) != 0) {
                    val i_58_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-100).toByte())
                    if (i_58_ > 0) {
                        var i_59_ = 0
                        while (i_58_ > i_59_) {
                            var i_60_ = -1
                            var i_61_ = -1
                            var i_62_ = -1
                            var i_63_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readSmart(-126)
                            if (i_63_ == 32767) {
                                i_63_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readSmart(-118)
                                i_61_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readSmart(-117)
                                i_60_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readSmart(-122)
                                i_62_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readSmart(-123)
                            } else if (i_63_ != 32766) i_61_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readSmart(-123)
                            else i_63_ = -1
                            val i_64_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readSmart(-122)
                            val i_65_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                            npc.method2438(i_61_, GlGroundShaderPass.anInt7396, i_63_, i_62_, i_60_, i_64_, i_65_, 124.toByte())
                            i_59_++
                        }
                    }
                }
                if ((i_40_ and 0x80) != 0) {
                    npc.anInt10275 = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    if ((npc.anInt10275) == 65535) npc.anInt10275 = -1
                }
                if ((0x1 and i_40_) != 0) {
                    npc.aString10292 = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readString(121.toByte())
                    npc.anInt10264 = 100
                }
                if ((i_40_ and 0x800) != 0) {
                    val i_66_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    npc.anInt10227 = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-84).toByte())
                    npc.anInt10271 = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-88).toByte())
                    npc.anInt10210 = 0x7fff and i_66_
                    npc.aBoolean10226 = (0x8000 and i_66_) != 0
                    npc.anInt10287 = (npc.anInt10227 + GlGroundShaderPass.anInt7396 + npc.anInt10210)
                }
                if ((i_40_ and 0x400) != 0) {
                    var i_67_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                    val i_68_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readIntLittle((-127).toByte())
                    if (i_67_ == 65535) i_67_ = -1
                    val i_69_ = CircleRasterizerObject.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-116).toByte())
                    val i_70_ = i_69_ and 0x7
                    var i_71_ = (i_69_ and 0x7e) shr 3
                    if (i_71_ == 15) i_71_ = -1
                    npc.method2437(i_70_, i_67_, i xor 0x3c569b2e, i_71_, true, i_68_)
                }
            }
            anInt5080++
        }
        var anIntArray1885: IntArray? = IntArray(32)
        init {
            var i = 2
            for (i_7_ in 0..31) {
                anIntArray1885!![i_7_] = -1 + i
                i += i
            }
        }
        @JvmStatic
        fun method1126(i: Int) {
            if (i == 32) {
                ClientLoadStateMachine.aJs5Archive_1878 = null
                aByteArrayArray1887 = null
                VarpStore.anIntArray1885 = null
            }
        }
    }
}
