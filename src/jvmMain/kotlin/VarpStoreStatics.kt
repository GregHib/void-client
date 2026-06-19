import ChatEffectsOptionStateStatics.method1730
import MidiSequencePlayerStatics.method2862
import FixedFunctionWaterPassStatics.method3548
import WorldMapElementStatics.method181
import GameClock.method599
import TrigLookupTablesStatics.method726
import NativeTerrainTileStatics.method4004

object VarpStoreStatics {
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
                if (WorldMapLabelStatics.anInt4960 <= i_15_ && i_19_ <= CameraNodeListStatics.anInt1745 && i_14_ >= LocalPlayerState.anInt1910 && WidgetTextConfigStatics.anInt513 >= i_20_) method1730(i_16_, i_20_, i_14_, i_19_, i, i_18_, -128, i_15_)
                else method4004(i_20_, i_19_, i_14_, i, i_18_, -80, i_15_, i_16_)
                if (i_17_ > -113) aClass237_Sub1_5067 = null
            }
    
            @JvmStatic
            fun method1309(bool: Boolean, i: Int) {
                if (NpcConfigStatics.aResourceLoaderThread_897 == null) method726(92)
                if (i < 116) aClass237_Sub1_5067 = null
                anInt5062++
                if (bool) NpcConfigStatics.aResourceLoaderThread_897!!.method2326(96)
            }
    
            @JvmStatic
            fun method1310(bool: Boolean) {
                if (bool == true) aClass237_Sub1_5067 = null
            }
    
            fun method1311(i: Int, var_renderer: Renderer) {
                LoadingScreenStateStatics.aRenderableEntryArray2636 = arrayOfNulls<RenderableEntry>(AbstractTileShapeStatics.anIntArray6547!!.size)
                anInt5064++
                if (i != 5139) anInt5065 = 62
                var i_21_ = 0
                while ((i_21_ < AbstractTileShapeStatics.anIntArray6547!!.size)) {
                    val i_22_ = AbstractTileShapeStatics.anIntArray6547!![i_21_]
                    val class143 = RangedGraphicsOptionStateStatics.method1766((-86).toByte(), i_22_, TerrainTileStatics.aJs5Archive_4585!!)
                    val class324 = var_renderer.method3686(class143, SpriteImageStatics.method1523(GlShaderObjectHandleStatics.aJs5Archive_518!!, i_22_), true)
                    LoadingScreenStateStatics.aRenderableEntryArray2636!![i_21_] = RenderableEntry(class324, class143)
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
                if (WallEntityStatics.aLinkedQueueNode_8766 != null) {
                    if (WallEntityStatics.aLinkedQueueNode_8766!!.anInt1997 == 1) {
                        WallEntityStatics.aLinkedQueueNode_8766 = null
                        return
                    }
                    if (WallEntityStatics.aLinkedQueueNode_8766!!.anInt1997 == 2) {
                        method2862(RenderableGroupStatics.aPrivilegedOperationWorker_5017, CacheEntryReferenceStatics.aString9554, -120, 2)
                        WallEntityStatics.aLinkedQueueNode_8766 = null
                        return
                    }
                }
                val i_29_ = -31 / ((-29 - i) / 61)
            }
    
            fun method1317(i: Int, i_36_: Byte, i_37_: Int): Boolean {
                anInt5079++
                if (i_36_ >= -67) method1317(43, 36.toByte(), 20)
                return LoadingBarRendererStatics.method2217(i, i_37_, 0) or ((i_37_ and 0x70000) != 0) || CompassSmootherStatics.method2015(i_37_, i, 7)
            }
    
            fun method1318(i: Int) {
                if (i != -65536) method1310(false)
                for (i_38_ in 0..<AbstractCameraTransformStatics.anInt1597) {
                    val i_39_ = MinimapRectClipper.anIntArray224!![i_38_]
                    val npc = ((NpcEntityUpdater.aHashtable_3654!!.method3480(i_39_.toLong(), -6008) as NpcReference).aNpc_6859)!!
                    var i_40_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    if ((0x10 and i_40_) != 0) i_40_ += CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i xor 0xff00.inv()) shl 8
                    if ((0x2 and i_40_) != 0) {
                        if (npc.aNpcType_10505!!.method793(i xor 0xffff.inv())) method181(true, npc)
                        npc.method2448((MapAreaDefinitionStatics.aBufferedMessageQueue_2529!!.method2079(CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(-1), -1)), -2)
                        npc.method2434(95.toByte(), npc.aNpcType_10505!!.anInt1399)
                        npc.anInt10310 = npc.aNpcType_10505!!.anInt1329 shl 3
                        if (npc.aNpcType_10505!!.method793(0)) ProjectileFactoryStatics.method1614(979190089, npc, (npc.plane).toInt(), (npc.anIntArray10317!![0]), (npc.anIntArray10320!![0]), null, null, 0)
                    }
                    if ((0x8 and i_40_) != 0) {
                        val `is` = IntArray(4)
                        for (i_41_ in 0..3) {
                            `is`[i_41_] = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                            if (`is`[i_41_] == 65535) `is`[i_41_] = -1
                        }
                        val i_42_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-121).toByte())
                        SoundBankPatchStatics.method2931(i_42_, 115.toByte(), `is`, npc)
                    }
                    if ((i_40_ and 0x20) != 0) {
                        var i_43_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                        val i_44_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                        if (i_43_ == 65535) i_43_ = -1
                        val i_45_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        val i_46_ = 0x7 and i_45_
                        var i_47_ = (i_45_ and 0x79) shr 3
                        if (i_47_ == 15) i_47_ = -1
                        npc.method2437(i_46_, i_43_, i xor 0x3c569b2e, i_47_, false, i_44_)
                    }
                    if ((0x4000 and i_40_) != 0) {
                        val i_48_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                        val `is` = IntArray(i_48_)
                        val is_49_ = IntArray(i_48_)
                        val is_50_ = IntArray(i_48_)
                        var i_51_ = 0
                        while (i_48_ > i_51_) {
                            var i_52_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                            if (i_52_ == 65535) i_52_ = -1
                            `is`[i_51_] = i_52_
                            is_49_[i_51_] = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                            is_50_[i_51_] = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-109)
                            i_51_++
                        }
                        method3548(-7387, npc, is_50_, `is`, is_49_)
                    }
                    if ((i_40_ and 0x200) != 0) {
                        val i_53_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-121).toByte())
                        val `is` = IntArray(i_53_)
                        val is_54_ = IntArray(i_53_)
                        var i_55_ = 0
                        while (i_53_ > i_55_) {
                            val i_56_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                            if ((0xc000 and i_56_) == 49152) {
                                val i_57_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i + 842463480)
                                `is`[i_55_] = BoundsConstraintEntryStatics.method2057(i_57_, i_56_ shl 16)
                            } else `is`[i_55_] = i_56_
                            is_54_[i_55_] = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                            i_55_++
                        }
                        npc.method2430(is_54_, `is`, -100)
                    }
                    if ((0x4 and i_40_) != 0) {
                        npc.anInt10499 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                        npc.anInt10512 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                    }
                    if ((0x1000 and i_40_) != 0) {
                        npc.anInt10293 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteSubtract(-27697).toInt()
                        npc.anInt10314 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteSubtract(-27697).toInt()
                        npc.anInt10241 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByte(-128).toInt()
                        npc.anInt10288 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteSubtract(-27697).toInt()
                        npc.anInt10239 = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false) + GlGroundShaderPassStatics.anInt7396)
                        npc.anInt10300 = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(12) - -GlGroundShaderPassStatics.anInt7396)
                        npc.anInt10231 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(66.toByte())
                        npc.anInt10314 += npc.anIntArray10317!![0]
                        npc.anInt10322 = 0
                        npc.anInt10288 += npc.anIntArray10317!![0]
                        npc.anInt10293 += npc.anIntArray10320!![0]
                        npc.anInt10241 += npc.anIntArray10320!![0]
                        npc.anInt10319 = 1
                    }
                    if ((i_40_ and 0x2000) != 0) {
                        npc.aByte10255 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(-622951480)
                        npc.aByte10206 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteSubtract(-27697)
                        npc.aByte10270 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(i + -622885944)
                        npc.aByte10279 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255).toByte()
                        npc.anInt10248 = GlGroundShaderPassStatics.anInt7396 + CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        npc.anInt10250 = GlGroundShaderPassStatics.anInt7396 + CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    }
                    if ((i_40_ and 0x40) != 0) {
                        val i_58_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-100).toByte())
                        if (i_58_ > 0) {
                            var i_59_ = 0
                            while (i_58_ > i_59_) {
                                var i_60_ = -1
                                var i_61_ = -1
                                var i_62_ = -1
                                var i_63_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readSmart(-126)
                                if (i_63_ == 32767) {
                                    i_63_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readSmart(-118)
                                    i_61_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readSmart(-117)
                                    i_60_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readSmart(-122)
                                    i_62_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readSmart(-123)
                                } else if (i_63_ != 32766) i_61_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readSmart(-123)
                                else i_63_ = -1
                                val i_64_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readSmart(-122)
                                val i_65_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                                npc.method2438(i_61_, GlGroundShaderPassStatics.anInt7396, i_63_, i_62_, i_60_, i_64_, i_65_, 124.toByte())
                                i_59_++
                            }
                        }
                    }
                    if ((i_40_ and 0x80) != 0) {
                        npc.anInt10275 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        if ((npc.anInt10275) == 65535) npc.anInt10275 = -1
                    }
                    if ((0x1 and i_40_) != 0) {
                        npc.aString10292 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString(121.toByte())
                        npc.anInt10264 = 100
                    }
                    if ((i_40_ and 0x800) != 0) {
                        val i_66_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        npc.anInt10227 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-84).toByte())
                        npc.anInt10271 = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-88).toByte())
                        npc.anInt10210 = 0x7fff and i_66_
                        npc.aBoolean10226 = (0x8000 and i_66_) != 0
                        npc.anInt10287 = (npc.anInt10227 + GlGroundShaderPassStatics.anInt7396 + npc.anInt10210)
                    }
                    if ((i_40_ and 0x400) != 0) {
                        var i_67_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                        val i_68_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readIntLittle((-127).toByte())
                        if (i_67_ == 65535) i_67_ = -1
                        val i_69_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-116).toByte())
                        val i_70_ = i_69_ and 0x7
                        var i_71_ = (i_69_ and 0x7e) shr 3
                        if (i_71_ == 15) i_71_ = -1
                        npc.method2437(i_70_, i_67_, i xor 0x3c569b2e, i_71_, true, i_68_)
                    }
                }
                anInt5080++
            }
}
