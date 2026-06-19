import java.io.InputStream

object InputStream_Sub2Statics {
    @JvmField
            var anInt80: Int = 0
            @JvmField
            var anInt81: Int = 0
            @JvmField
            var aIntRange_82: IntRange? = IntRange(71, 7)
            @JvmField
            var aDoublyLinkedNodeList_83: DoublyLinkedNodeList? = DoublyLinkedNodeList()
            var aFloatArray84: FloatArray? = FloatArray(4)
            @JvmField
            var anInt85: Int = 0
    
            @JvmStatic
            fun method127(i: Byte) {
                if (i.toInt() != 118) method128(null, (-48).toByte())
                aFloatArray84 = null
                aDoublyLinkedNodeList_83 = null
                aIntRange_82 = null
            }
    
            @JvmStatic
            fun method128(rgbColorPalette: RgbColorPalette?, i: Byte) {
                try {
                    anInt81++
                    if (rgbColorPalette == NamedIdEntryStatics.aRgbColorPalette_6891) {
                        val i_0_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-124).toByte())
                        val i_1_ = i_0_ shr 2
                        val i_2_ = 0x3 and i_0_
                        val i_3_ = AnimationFrameTable.anIntArray487!![i_1_]
                        val i_4_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        val i_5_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteAdd(65.toByte())
                        val i_6_ = BufferedMessageQueueStatics.anInt3581 + (0x7 and (i_5_ shr 4))
                        val i_7_ = FileExistsConditionStatics.anInt4786 - -(i_5_ and 0x7)
                        if (NpcEntityUpdater.method2112(126, WidgetRedrawTrackerStatics.anInt3931) || (i_6_ >= 0 && i_7_ >= 0 && GlCubemapLightPassStatics.anInt7319 > i_6_ && (i_7_ < RangeThresholdTextureNodeStatics.anInt9109))) BoundingBoxNodeStatics.method2800(GradientLookupEffectStatics.anInt9200, 0, i_7_, -1, i_1_, i_3_, i_2_, i_4_, 121.toByte(), i_6_)
                    } else if (rgbColorPalette == ClampTextureNodeStatics.aRgbColorPalette_9475) {
                        val i_8_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i + 247)
                        val i_9_ = BufferedMessageQueueStatics.anInt3581 + ((0x7a and i_8_) shr 4)
                        val i_10_ = FileExistsConditionStatics.anInt4786 - -(i_8_ and 0x7)
                        val i_11_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        val i_12_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        val i_13_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        val i_14_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i.toInt() xor 0xf7)
                        if (i_9_ >= 0 && i_10_ >= 0 && i_9_ < GlCubemapLightPassStatics.anInt7319 && RangeThresholdTextureNodeStatics.anInt9109 > i_10_) {
                            val i_15_ = 512 * i_9_ - -256
                            val i_16_ = 256 + 512 * i_10_
                            var i_17_ = GradientLookupEffectStatics.anInt9200
                            if (i_17_ < 3 && NpcTypeStatics.method802(i_10_, i_9_, true)) i_17_++
                            val class318_sub1_sub3_sub4 = (MapElementDecor(i_11_, i_13_, GlGroundShaderPassStatics.anInt7396, GradientLookupEffectStatics.anInt9200, i_17_, i_15_, CollisionMapAccessor.method2064(i_15_, GradientLookupEffectStatics.anInt9200, 11219, i_16_) + -i_12_, i_16_, i_9_, i_9_, i_10_, i_10_, i_14_))
                            OpenGlRenderNodeStatics.aNodeDeque_10492!!.method1999(ChatScriptListNode(class318_sub1_sub3_sub4), -20180)
                        }
                    } else if (rgbColorPalette == NpcUpdateProcessor.aRgbColorPalette_1519) {
                        val i_18_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        val i_19_ = BufferedMessageQueueStatics.anInt3581 - -(i_18_ shr 4 and 0x7)
                        val i_20_ = (0x7 and i_18_) + FileExistsConditionStatics.anInt4786
                        var i_21_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        if (i_21_ == 65535) i_21_ = -1
                        val i_22_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i + 247)
                        val i_23_ = i_22_ shr 4 and 0xf
                        val i_24_ = 0x7 and i_22_
                        val i_25_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        val i_26_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        val i_27_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i + 842397936)
                        if (i_19_ >= 0 && i_20_ >= 0 && i_19_ < GlCubemapLightPassStatics.anInt7319 && (i_20_ < RangeThresholdTextureNodeStatics.anInt9109)) {
                            val i_28_ = 1 + i_23_
                            if (((LocalPlayerState.aPlayer_1907!!.anIntArray10320!![0]) >= i_19_ + -i_28_) && i_28_ + i_19_ >= (LocalPlayerState.aPlayer_1907!!.anIntArray10320!![0]) && ((LocalPlayerState.aPlayer_1907!!.anIntArray10317!![0]) >= -i_28_ + i_20_) && i_20_ + i_28_ >= (LocalPlayerState.aPlayer_1907!!.anIntArray10317!![0])) RangedGraphicsOptionStateStatics.method1760(
                                i_21_,
                                i_26_,
                                false,
                                ((i_20_ shl 8) + (((GradientLookupEffectStatics.anInt9200) shl 24) + ((i_19_ shl 16) - -i_23_))),
                                (-98).toByte(),
                                i_24_,
                                i_27_,
                                i_25_
                            )
                        }
                    } else if (rgbColorPalette == IntKeyNodeStatics.aRgbColorPalette_6977) {
                        val i_29_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        val i_30_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        GradientLookupEffectStatics.aSeqDefinitionCache_9195!!.method2005(0, i_29_).method478(i_30_, -31076)
                    } else if (SynthVoiceGroupStatics.aRgbColorPalette_8853 == rgbColorPalette) {
                        val i_31_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i + 247)
                        val i_32_ = BufferedMessageQueueStatics.anInt3581 + ((i_31_ and 0x7b) shr 4)
                        val i_33_ = (i_31_ and 0x7) + FileExistsConditionStatics.anInt4786
                        var i_34_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        if (i_34_ == 65535) i_34_ = -1
                        val i_35_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i + 247)
                        val i_36_ = 0xf and (i_35_ shr 4)
                        val i_37_ = 0x7 and i_35_
                        val i_38_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        val i_39_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i.toInt() xor 0xf7)
                        val i_40_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        if (i_32_ >= 0 && i_33_ >= 0 && i_32_ < GlCubemapLightPassStatics.anInt7319 && i_33_ < RangeThresholdTextureNodeStatics.anInt9109) {
                            val i_41_ = i_36_ + 1
                            if ((LocalPlayerState.aPlayer_1907!!.anIntArray10320!![0]) >= i_32_ - i_41_ && (LocalPlayerState.aPlayer_1907!!.anIntArray10320!![0]) <= i_41_ + i_32_ && ((LocalPlayerState.aPlayer_1907!!.anIntArray10317!![0]) >= -i_41_ + i_33_) && (i_33_ - -i_41_ >= (LocalPlayerState.aPlayer_1907!!.anIntArray10317!![0]))) ByteArrayPool.method358(i_37_, (i_36_ + (i_33_ shl 8) + ((GradientLookupEffectStatics.anInt9200 shl 24) + (i_32_ shl 16))), i_38_, i_39_, i_40_, i_34_, -29494)
                        }
                    } else if (SplashImageLoadableStatics.aRgbColorPalette_4689 == rgbColorPalette) {
                        var i_42_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                        if (i_42_ == 65535) i_42_ = -1
                        val i_43_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(65.toByte())
                        val i_44_ = ((i_43_ and 0x71) shr 4) + BufferedMessageQueueStatics.anInt3581
                        val i_45_ = FileExistsConditionStatics.anInt4786 + (i_43_ and 0x7)
                        val i_46_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                        val i_47_ = i_46_ shr 2
                        val i_48_ = i_46_ and 0x3
                        val i_49_ = AnimationFrameTable.anIntArray487!![i_47_]
                        NativeRendererStatics.method3824(i_45_, i_42_, i_47_, i_44_, i_48_, 115, GradientLookupEffectStatics.anInt9200, i_49_)
                    } else if (rgbColorPalette == ArbFogMaterialPassStatics.aRgbColorPalette_6201) {
                        val i_50_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        var i_51_ = (i_50_ shr 4 and 0xf) + BufferedMessageQueueStatics.anInt3581 * 2
                        var i_52_ = (i_50_ and 0xf) + FileExistsConditionStatics.anInt4786 * 2
                        val i_53_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        val bool = (0x1 and i_53_) != 0
                        val bool_54_ = (i_53_ and 0x2) != 0
                        val i_55_ = if (bool_54_) i_53_ shr 2 else -1
                        var i_56_ = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByte(-77) + i_51_)
                        var i_57_ = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByte(-88) + i_52_)
                        val i_58_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShort(13638)
                        val i_59_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShort(13638)
                        val i_60_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i + 842397936)
                        var i_61_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        if (!bool_54_) i_61_ *= 4
                        else i_61_ = i_61_.toByte().toInt()
                        var i_62_ = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i.toInt() xor 0xf7) * 4)
                        val i_63_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i + 842397936)
                        val i_64_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        var i_65_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        var i_66_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        if (i_65_ == 255) i_65_ = -1
                        if (i_51_ >= 0 && i_52_ >= 0 && (i_51_ < 2 * GlCubemapLightPassStatics.anInt7319) && (i_52_ < GlCubemapLightPassStatics.anInt7319 * 2) && i_56_ >= 0 && i_57_ >= 0 && (i_56_ < RangeThresholdTextureNodeStatics.anInt9109 * 2) && 2 * RangeThresholdTextureNodeStatics.anInt9109 > i_57_ && i_60_ != 65535) {
                            i_57_ *= 256
                            i_56_ = 256 * i_56_
                            i_62_ = i_62_ shl 2
                            i_51_ = 256 * i_51_
                            i_66_ = i_66_ shl 2
                            i_61_ = i_61_ shl 2
                            i_52_ *= 256
                            if (i_58_ != 0 && i_55_ != -1) {
                                var class318_sub1_sub3_sub3: ProjectedGroundDecor? = null
                                if (i_58_ < 0) {
                                    val i_67_ = -i_58_ + -1
                                    if (CharCodeMapStatics.anInt9591 != i_67_) class318_sub1_sub3_sub3 = (LoadingBarRendererStatics.aPlayerArray5058!![i_67_])
                                    else class318_sub1_sub3_sub3 = (LocalPlayerState.aPlayer_1907)
                                } else {
                                    val i_68_ = i_58_ + -1
                                    val class348_sub22 = (NpcEntityUpdater.aHashtable_3654!!.method3480(i_68_.toLong(), -6008) as? NpcReference?)
                                    if (class348_sub22 != null) class318_sub1_sub3_sub3 = (class348_sub22.aNpc_6859)
                                }
                                if (class318_sub1_sub3_sub3 != null) {
                                    val class225 = class318_sub1_sub3_sub3.method2422(72.toByte())
                                    if ((class225.anIntArrayArray2939 != null) && (class225.anIntArrayArray2939!![i_55_]) != null) i_61_ -= (class225.anIntArrayArray2939!![i_55_]!![1])
                                    if ((class225.anIntArrayArray2910 != null) && (class225.anIntArrayArray2910!![i_55_]) != null) i_61_ -= (class225.anIntArrayArray2910!![i_55_]!![1])
                                }
                            }
                            val class318_sub1_sub3_sub5 = (TrackedGroundDecor(i_60_, GradientLookupEffectStatics.anInt9200, GradientLookupEffectStatics.anInt9200, i_51_, i_52_, i_61_, i_63_ - -GlGroundShaderPassStatics.anInt7396, i_64_ + GlGroundShaderPassStatics.anInt7396, i_65_, i_66_, i_58_, i_59_, i_62_, bool, i_55_))
                            class318_sub1_sub3_sub5.method2471((-103).toByte(), (-i_62_ + CollisionMapAccessor.method2064(i_56_, GradientLookupEffectStatics.anInt9200, 11219, i_57_)), i_57_, i_63_ + GlGroundShaderPassStatics.anInt7396, i_56_)
                            SpriteTextureNodeStatics.aNodeDeque_9240!!.method1999(ParticleEmitterListNode(class318_sub1_sub3_sub5), -20180)
                        }
                    } else if (rgbColorPalette == HardCacheEntryReferenceStatics.aRgbColorPalette_10437) {
                        val i_69_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-128)
                        val i_70_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(31.toByte())
                        val i_71_ = FileExistsConditionStatics.anInt4786 + (i_70_ and 0x7)
                        val i_72_ = RegionMapDecoder.regionTileY + i_71_
                        val i_73_ = BufferedMessageQueueStatics.anInt3581 + (i_70_ shr 4 and 0x7)
                        val i_74_ = ArbVertexProgramStatics.regionTileX + i_73_
                        val class348_sub37 = ((ModelBatchBaseStatics.aHashtable_1895!!.method3480((i_72_ shl 14 or (GradientLookupEffectStatics.anInt9200 shl 28) or i_74_).toLong(), -6008)) as HashTableContainer?)
                        if (class348_sub37 != null) {
                            var class348_sub34 = (class348_sub37.aNodeDeque_6998.method1995(4) as IntPair?)
                            while (class348_sub34 != null) {
                                if ((0x7fff and i_69_) == class348_sub34.anInt6973) {
                                    class348_sub34.method2715(127.toByte())
                                    break
                                }
                                class348_sub34 = (class348_sub37.aNodeDeque_6998.method1990(49.toByte()) as IntPair?)
                            }
                            if (class348_sub37.aNodeDeque_6998.method2002(18.toByte())) class348_sub37.method2715(62.toByte())
                            if (i_73_ >= 0 && i_71_ >= 0 && GlCubemapLightPassStatics.anInt7319 > i_73_ && RangeThresholdTextureNodeStatics.anInt9109 > i_71_) ProjectileSpawner.method1479(i_71_, (-125).toByte(), i_73_, GradientLookupEffectStatics.anInt9200)
                        }
                    } else if (StaticNoiseTextureStatics.aRgbColorPalette_8662 == rgbColorPalette) {
                        val i_75_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                        val i_76_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                        val i_77_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        val i_78_ = FileExistsConditionStatics.anInt4786 - -(0x7 and i_77_)
                        val i_79_ = i_78_ + RegionMapDecoder.regionTileY
                        val i_80_ = BufferedMessageQueueStatics.anInt3581 - -((i_77_ and 0x79) shr 4)
                        val i_81_ = ArbVertexProgramStatics.regionTileX - -i_80_
                        val bool = (i_80_ >= 0 && i_78_ >= 0 && GlCubemapLightPassStatics.anInt7319 > i_80_ && RangeThresholdTextureNodeStatics.anInt9109 > i_78_)
                        if (bool || NpcEntityUpdater.method2112(124, WidgetRedrawTrackerStatics.anInt3931)) {
                            RenderableEntryStatics.method3459(IntPair(i_76_, i_75_), GradientLookupEffectStatics.anInt9200, i_79_, i_81_, -2)
                            if (bool) ProjectileSpawner.method1479(i_78_, (-124).toByte(), i_80_, GradientLookupEffectStatics.anInt9200)
                        }
                    } else if (rgbColorPalette == BufferedFileReader.aRgbColorPalette_4537) {
                        val i_82_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByteAdd(83.toByte())
                        val i_83_ = i_82_ shr 2
                        val i_84_ = 0x3 and i_82_
                        val i_85_ = AnimationFrameTable.anIntArray487!![i_83_]
                        val i_86_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i.toInt() xor 0xf7)
                        val i_87_ = BufferedMessageQueueStatics.anInt3581 + (i_86_ shr 4 and 0x7)
                        val i_88_ = FileExistsConditionStatics.anInt4786 - -(0x7 and i_86_)
                        if (NpcEntityUpdater.method2112(i.toInt() xor 0x73, WidgetRedrawTrackerStatics.anInt3931) || (i_87_ >= 0 && i_88_ >= 0 && GlCubemapLightPassStatics.anInt7319 > i_87_ && (i_88_ < RangeThresholdTextureNodeStatics.anInt9109))) BoundingBoxNodeStatics.method2800(GradientLookupEffectStatics.anInt9200, 0, i_88_, -1, i_83_, i_85_, i_84_, -1, 125.toByte(), i_87_)
                    } else {
                        if (i.toInt() != 8) aIntRange_82 = null
                        if (GlShaderObjectHandleStatics.aRgbColorPalette_515 == rgbColorPalette) {
                            val i_89_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                            val i_90_ = FileExistsConditionStatics.anInt4786 + (0x7 and i_89_)
                            val i_91_ = i_90_ + RegionMapDecoder.regionTileY
                            val i_92_ = (BufferedMessageQueueStatics.anInt3581 - -((i_89_ and 0x7a) shr 4))
                            val i_93_ = ArbVertexProgramStatics.regionTileX + i_92_
                            val i_94_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                            val i_95_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i + 842397936)
                            val i_96_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                            if (ModelBatchBaseStatics.aHashtable_1895 != null) {
                                val class348_sub37 = ((ModelBatchBaseStatics.aHashtable_1895!!.method3480((i_93_ or ((GradientLookupEffectStatics.anInt9200 shl 28) or (i_91_ shl 14))).toLong(), -6008)) as HashTableContainer?)
                                if (class348_sub37 != null) {
                                    var class348_sub34 = (class348_sub37.aNodeDeque_6998.method1995(4) as IntPair?)
                                    while (class348_sub34 != null) {
                                        if ((class348_sub34.anInt6973) == (0x7fff and i_94_) && i_95_ == class348_sub34.anInt6971) {
                                            class348_sub34.method2715(32.toByte())
                                            class348_sub34.anInt6971 = i_96_
                                            RenderableEntryStatics.method3459(class348_sub34, (GradientLookupEffectStatics.anInt9200), i_91_, i_93_, i.toInt() xor 0x9.inv())
                                            break
                                        }
                                        class348_sub34 = (class348_sub37.aNodeDeque_6998.method1990(34.toByte()) as IntPair?)
                                    }
                                    if (i_92_ >= 0 && i_90_ >= 0 && (i_92_ < GlCubemapLightPassStatics.anInt7319) && (RangeThresholdTextureNodeStatics.anInt9109 > i_90_)) ProjectileSpawner.method1479(i_90_, (-125).toByte(), i_92_, (GradientLookupEffectStatics.anInt9200))
                                }
                            }
                        } else if (rgbColorPalette == FileIoUtil.aRgbColorPalette_4098) {
                            val i_97_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                            val i_98_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                            val i_99_ = (0x7 and i_98_) + FileExistsConditionStatics.anInt4786
                            val i_100_ = RegionMapDecoder.regionTileY + i_99_
                            val i_101_ = BufferedMessageQueueStatics.anInt3581 - -((i_98_ and 0x7b) shr 4)
                            val i_102_ = ArbVertexProgramStatics.regionTileX + i_101_
                            val i_103_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(-25)
                            val i_104_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShortAdd(123)
                            if (i_104_ != CharCodeMapStatics.anInt9591) {
                                val bool = (i_101_ >= 0 && i_99_ >= 0 && (i_101_ < GlCubemapLightPassStatics.anInt7319) && (i_99_ < RangeThresholdTextureNodeStatics.anInt9109))
                                if (bool || NpcEntityUpdater.method2112(122, WidgetRedrawTrackerStatics.anInt3931)) {
                                    RenderableEntryStatics.method3459(IntPair(i_103_, i_97_), GradientLookupEffectStatics.anInt9200, i_100_, i_102_, i + -10)
                                    if (bool) ProjectileSpawner.method1479(i_99_, (-120).toByte(), i_101_, (GradientLookupEffectStatics.anInt9200))
                                }
                            }
                        } else if (rgbColorPalette == RectangleBoundsStatics.aRgbColorPalette_2157) {
                            val i_105_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i + 247)
                            val bool = (0x80 and i_105_) != 0
                            var i_106_ = BufferedMessageQueueStatics.anInt3581 - -(i_105_ shr 3 and 0x7)
                            var i_107_ = (0x7 and i_105_) + FileExistsConditionStatics.anInt4786
                            var i_108_ = i_106_ - -CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByte(-94)
                            var i_109_ = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readByte(-87) + i_107_)
                            val i_110_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readShort(13638)
                            val i_111_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i + 842397936)
                            var i_112_ = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) * 4)
                            var i_113_ = (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) * 4)
                            val i_114_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i + 842397936)
                            val i_115_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i + 842397936)
                            var i_116_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                            if (i_116_ == 255) i_116_ = -1
                            var i_117_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                            if (i_106_ >= 0 && i_107_ >= 0 && (i_106_ < GlCubemapLightPassStatics.anInt7319) && i_107_ < RangeThresholdTextureNodeStatics.anInt9109 && i_108_ >= 0 && i_109_ >= 0 && GlCubemapLightPassStatics.anInt7319 > i_108_ && (RangeThresholdTextureNodeStatics.anInt9109 > i_109_) && i_111_ != 65535) {
                                i_117_ = i_117_ shl 2
                                i_109_ = 256 + i_109_ * 512
                                i_113_ = i_113_ shl 2
                                i_108_ = 256 + 512 * i_108_
                                i_107_ = i_107_ * 512 + 256
                                i_106_ = i_106_ * 512 + 256
                                i_112_ = i_112_ shl 2
                                val class318_sub1_sub3_sub5 = (TrackedGroundDecor(i_111_, GradientLookupEffectStatics.anInt9200, GradientLookupEffectStatics.anInt9200, i_106_, i_107_, i_112_, i_114_ + GlGroundShaderPassStatics.anInt7396, GlGroundShaderPassStatics.anInt7396 + i_115_, i_116_, i_117_, 0, i_110_, i_113_, bool, -1))
                                class318_sub1_sub3_sub5.method2471((-103).toByte(), CollisionMapAccessor.method2064(i_108_, (GradientLookupEffectStatics.anInt9200), 11219, i_109_) + -i_113_, i_109_, i_114_ + GlGroundShaderPassStatics.anInt7396, i_108_)
                                SpriteTextureNodeStatics.aNodeDeque_9240!!.method1999(ParticleEmitterListNode(class318_sub1_sub3_sub5), -20180)
                            }
                        } else if (TextureGeneratorStatics.aRgbColorPalette_2491 == rgbColorPalette) {
                            CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                            val i_118_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(i + 247)
                            val i_119_ = (i_118_ shr 4 and 0x7) + BufferedMessageQueueStatics.anInt3581
                            val i_120_ = (0x7 and i_118_) + FileExistsConditionStatics.anInt4786
                            val i_121_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(i.toInt() xor 0x3235f8f0)
                            val i_122_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                            val i_123_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readMedium(-1)
                            val string = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readString((-126).toByte())
                            IdentKitRecolorStatics.method205(i_121_, i_119_, i_123_, string, i_122_, -109, i_120_, GradientLookupEffectStatics.anInt9200)
                        } else {
                            LinkedListIteratorStatics.method1242("T3 - " + rgbColorPalette, null, 15004)
                            NormalMapTextureNodeStatics.method3141(false, 11.toByte())
                        }
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("sfa.A(" + (if (rgbColorPalette != null) "{...}" else "null") + ',' + i + ')'))
                }
            }
}
