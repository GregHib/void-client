import WaterMaterialPassStatics.method2148
import StreamingResourceRequestStatics.method3262
import LocConfigModelBuilderStatics.method3563
import PlayerAppearanceUpdateDecoder.method3614

object CharacterRenderStateStatics {
    @JvmField
            var anInt6669: Int = 0
            @JvmField
            var anInt6671: Int = 0
            @JvmField
            var anInt6672: Int = 0
            @JvmField
            var anInt6682: Int = 0
            @JvmField
            var anInt6690: Int = 0
    
            @JvmStatic
            fun method2778(class318_sub1: SceneEntity, bool: Boolean, `is`: Array<Array<ByteArray?>?>?, i: Int, i_0_: Byte): Boolean {
                if (!SpriteTextureNodeStatics.aBoolean9242) return false
                var i_1_ = class318_sub1.x shr Tooltip.anInt4459
                var i_2_ = i_1_
                var i_3_ = class318_sub1.y shr Tooltip.anInt4459
                var i_4_ = i_3_
                if (class318_sub1 is GroundDecorEntity) {
                    i_2_ = (class318_sub1.aShort8751).toInt()
                    i_4_ = (class318_sub1.aShort8747).toInt()
                    i_1_ = (class318_sub1.aShort8743).toInt()
                    i_3_ = (class318_sub1.aShort8750).toInt()
                }
                for (i_5_ in i_1_..i_2_) {
                    for (i_6_ in i_3_..i_4_) {
                        if ((class318_sub1.aByte6376 < MapAreaDefinitionStatics.anInt2524) && i_5_ >= ByteArrayPool.anInt492 && i_5_ < ProjectileConfigUtil.anInt387 && i_6_ >= IntPairStatics.anInt6974 && i_6_ < GrayscaleNoiseTextureStatics.anInt5293) {
                            if ((`is` != null && class318_sub1.plane >= i && (`is`[class318_sub1.plane.toInt()]!![i_5_]!![i_6_]) == i_0_) || !class318_sub1.method2378(0) || class318_sub1.method2382((-79).toByte())) {
                                if (!bool && i_5_ >= DisplayModeOptionStateStatics.anInt6111 - 16 && i_5_ <= DisplayModeOptionStateStatics.anInt6111 + 16 && i_6_ >= GlIndexBufferArbStatics.anInt8502 - 16 && i_6_ <= GlIndexBufferArbStatics.anInt8502 + 16) {
                                    if (VoronoiNoiseTextureNodeStatics.aBoolean9121) {
                                        MapElementDefinitionCacheStatics.aCacheIndexManagerArray3982!![NpcSummaryDefinitionStatics.anInt1949++]!!.method2361(-15481, class318_sub1)
                                        NpcSummaryDefinitionStatics.anInt1949 %= ActiveMapRegion.anInt5652
                                    } else class318_sub1.method2387(NativeLibraryState.aRenderer171, -128)
                                }
                            } else return false
                        }
                    }
                }
                return true
            }
    
            fun method2779(bool: Boolean, i: Int): Int {
                anInt6672++
                if (i == 6407 || i == 34843 || i == 34837) return 6407
                if (i == 6408 || i == 34842 || i == 34836) return 6408
                if (i == 6406 || i == 34844) return 6406
                if (i == 6409 || i == 34846) return 6409
                if (i == 6410 || i == 34847) return 6410
                if (bool != true) method2780(36, null, (-28).toByte(), -58, -120)
                if (i == 6402) return 6402
                throw IllegalArgumentException("")
            }
    
            @JvmStatic
            fun method2780(i: Int, string: String?, i_7_: Byte, i_8_: Int, i_9_: Int) {
                do {
                    try {
                        anInt6669++
                        val class46 = NpcReferenceStatics.method2957(i, (-54).toByte(), i_9_)
                        if (class46 != null) {
                            if (class46.anObjectArray741 != null) {
                                val class348_sub36 = WidgetActionEntry()
                                class348_sub36.aWidgetComponent_6989 = class46
                                class348_sub36.aString6994 = string
                                class348_sub36.anObjectArray6987 = class46.anObjectArray741
                                class348_sub36.anInt6986 = i_8_
                                ChatCommandProcessor.method705(class348_sub36)
                            }
                            if (WorldMapRendererStatics.anInt4674 == 10 && ClientStatics.method105(class46)!!.method3301(-1 + i_8_, false)) {
                                if (i_8_ == 1) {
                                    ScrollingWidgetComponentNodeStatics.anInt8380++
                                    val class348_sub47 = method2148((ProjectileConfigUtil.aFontMetaRef_398), (TheoraVideoStreamStatics.aIsaacCipher_9029), -93)
                                    method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                    InterfaceComponentGroupStatics.method3243(118, class348_sub47)
                                }
                                if (i_8_ == 2) {
                                    InputStream_Sub1Statics.anInt71++
                                    val class348_sub47 = method2148((ScriptResources.aFontMetaRef_2638), (TheoraVideoStreamStatics.aIsaacCipher_9029), -98)
                                    method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                    InterfaceComponentGroupStatics.method3243(126, class348_sub47)
                                }
                                if (i_8_ == 3) {
                                    RegionSceneLoader.anInt3703++
                                    val class348_sub47 = method2148((GlslMaterialPassStatics.aFontMetaRef_6244), (TheoraVideoStreamStatics.aIsaacCipher_9029), -93)
                                    method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                    InterfaceComponentGroupStatics.method3243(-80, class348_sub47)
                                }
                                if (i_8_ == 4) {
                                    RegionMapDecoder.anInt1514++
                                    val class348_sub47 = method2148((RasterSpriteStatics.aFontMetaRef_5204), (TheoraVideoStreamStatics.aIsaacCipher_9029), -82)
                                    method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                    InterfaceComponentGroupStatics.method3243(116, class348_sub47)
                                }
                                val i_10_ = -80 / ((64 - i_7_) / 43)
                                if (i_8_ == 5) {
                                    FloatCameraTransformStatics.anInt5714++
                                    val class348_sub47 = method2148((MinimapSquareDrawerStatics.aFontMetaRef_5217), (TheoraVideoStreamStatics.aIsaacCipher_9029), -94)
                                    method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                    InterfaceComponentGroupStatics.method3243(123, class348_sub47)
                                }
                                if (i_8_ == 6) {
                                    WorldMapRendererStatics.anInt4680++
                                    val class348_sub47 = method2148((UnderlayDefinitionStatics.aFontMetaRef_2892), (TheoraVideoStreamStatics.aIsaacCipher_9029), -100)
                                    method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                    InterfaceComponentGroupStatics.method3243(-4, class348_sub47)
                                }
                                if (i_8_ == 7) {
                                    CalendarUtil.anInt4134++
                                    val class348_sub47 = method2148((ParticleGeometryStatics.aFontMetaRef_4418), (TheoraVideoStreamStatics.aIsaacCipher_9029), -84)
                                    method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                    InterfaceComponentGroupStatics.method3243(118, class348_sub47)
                                }
                                if (i_8_ == 8) {
                                    ScriptCompilerThreadStatics.anInt1726++
                                    val class348_sub47 = method2148((DoublyLinkedNodeListStatics.aFontMetaRef_3165), (TheoraVideoStreamStatics.aIsaacCipher_9029), -117)
                                    method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                    InterfaceComponentGroupStatics.method3243(-96, class348_sub47)
                                }
                                if (i_8_ == 9) {
                                    MapRegionLoaderThreadStatics.anInt4198++
                                    val class348_sub47 = method2148((ResourceLoaderThreadStatics.aFontMetaRef_3898), (TheoraVideoStreamStatics.aIsaacCipher_9029), -107)
                                    method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                    InterfaceComponentGroupStatics.method3243(119, class348_sub47)
                                }
                                if (i_8_ != 10) break
                                CacheLruCacheStatics.anInt3886++
                                val class348_sub47 = method2148(ClanChatRequestSender.aFontMetaRef_3644, (TheoraVideoStreamStatics.aIsaacCipher_9029), -120)
                                method3614(i_9_, i, class46.anInt812, class348_sub47, -19692)
                                InterfaceComponentGroupStatics.method3243(117, class348_sub47)
                            }
                        }
                    } catch (runtimeexception: RuntimeException) {
                        throw SoundBankPatchStatics.method2929(runtimeexception, ("hf.D(" + i + ',' + (if (string != null) "{...}" else "null") + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'))
                    }
                    break
                } while (false)
            }
    
            @JvmStatic
            fun method2782(i: Int, i_13_: Int, i_14_: Int): Byte {
                if (i_14_ != 0) method2783(-96, (-65).toByte(), -96)
                anInt6690++
                if (i_13_ != 9) return 0.toByte()
                if ((i and 0x1) == 0) return 1.toByte()
                return 2.toByte()
            }
    
            @JvmStatic
            fun method2783(i: Int, i_15_: Byte, i_16_: Int): Boolean {
                anInt6682++
                val i_17_ = 53 / ((15 - i_15_) / 55)
                return (method3262(i_16_, i, 118) and method3563(i_16_, 56.toByte(), i))
            }
}
