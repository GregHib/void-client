import WaterMaterialPassStatics.method2148
import NoiseTextureGeneratorStatics.method544

object SpriteComponentStatics {
    @JvmField
            var anInt8367: Int = 0
            @JvmField
            var anInt8368: Int = 0
            @JvmField
            var anInt8369: Int = 0
            @JvmField
            var anInt8370: Int = 0
            @JvmField
            var anInt8371: Int = 0
            @JvmField
            var anInt8372: Int = 0
            @JvmField
            var anInt8373: Int = 0
            @JvmField
            var anInt8374: Int = 0
            @JvmField
            var anInt8375: Int = 0
            @JvmField
            var anInt8376: Int = 0
            @JvmField
            var anInt8377: Int = 0
    
            @JvmStatic
            fun method199(i: Int): CameraSplineNode? {
                anInt8369++
                if (MapRegionLoaderStatics.aNodeDeque_1254 == null || RenderNodeStatics.aWidgetRedrawTracker_9716 == null) return null
                RenderNodeStatics.aWidgetRedrawTracker_9716!!.method2328(MapRegionLoaderStatics.aNodeDeque_1254!!, 75)
                val class348_sub21 = RenderNodeStatics.aWidgetRedrawTracker_9716!!.method2327((-53).toByte()) as CameraSplineNode?
                if (class348_sub21 == null) return null
                val class42 = MapRegionLoaderStatics.aConfigDefinitionLoader_1238!!.method1225(class348_sub21.anInt6847, 50.toByte())
                if (i != 1) anInt8370 = -75
                if (class42 != null && class42.aBoolean609 && class42.method373(MapRegionLoaderStatics.anVarResolver_1244!!, 98)) return class348_sub21
                return HashtableStatics.method3479(-1)
            }
    
            @JvmStatic
            fun method200(i: Int, i_3_: Int): Int {
                if (i >= -75) return -109
                anInt8377++
                return i_3_ ushr 8
            }
    
            @JvmStatic
            fun method201(i: Int, i_5_: Int, string: String?) {
                do {
                    try {
                        anInt8372++
                        val i_6_ = ShaderStateStatics.anInt6513
                        val `is` = ScrollTexMaterialPassStatics.anIntArray6290
                        if (i_5_ == -7257) {
                            var bool = false
                            var i_7_ = 0
                            while (i_6_ > i_7_) {
                                val player = (LoadingBarRendererStatics.aPlayerArray5058!![`is`!![i_7_]])
                                if (player != null && (LocalPlayerState.aPlayer_1907 != player) && (player.aString10544 != null) && player.aString10544.equals(string, ignoreCase = true)) {
                                    bool = true
                                    if (i == 1) {
                                        WidgetComponentNodeStatics.anInt4657++
                                        val class348_sub47 = (method2148(CustomCursorsOptionStateStatics.aFontMetaRef_5929, TheoraVideoStreamStatics.aIsaacCipher_9029, i_5_ + 7158))
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(4325, `is`[i_7_])
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteInverse((-75).toByte(), 0)
                                        InterfaceComponentGroupStatics.method3243(i_5_ xor 0x1c2a, class348_sub47)
                                    } else if (i == 4) {
                                        NpcActorEntityStatics.anInt10073++
                                        val class348_sub47 = (method2148(RsaVarbitHandlerStatics.aFontMetaRef_4905, TheoraVideoStreamStatics.aIsaacCipher_9029, -88))
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), `is`[i_7_])
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteAdd((-128).toByte(), 0)
                                        InterfaceComponentGroupStatics.method3243(126, class348_sub47)
                                    } else if (i == 5) {
                                        FloatGridStatics.anInt4979++
                                        val class348_sub47 = (method2148(ParticleEmitterListNodeStatics.aFontMetaRef_9684, TheoraVideoStreamStatics.aIsaacCipher_9029, -83))
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(81, `is`[i_7_])
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                                        InterfaceComponentGroupStatics.method3243(-112, class348_sub47)
                                    } else if (i == 6) {
                                        HuffmanCodecStatics.anInt3768++
                                        val class348_sub47 = (method2148(ConfigFlagUtilStatics.aFontMetaRef_3232, TheoraVideoStreamStatics.aIsaacCipher_9029, -83))
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-119, `is`[i_7_])
                                        InterfaceComponentGroupStatics.method3243(i_5_ + 7281, class348_sub47)
                                    } else if (i == 7) {
                                        WorldMapTextLabelStatics.anInt8588++
                                        val class348_sub47 = (method2148(ProceduralTextureGraphStatics.aFontMetaRef_9533, TheoraVideoStreamStatics.aIsaacCipher_9029, -116))
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(i_5_ xor 0x1c2c, `is`[i_7_])
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteAdd(92.toByte(), 0)
                                        InterfaceComponentGroupStatics.method3243(127, class348_sub47)
                                    }
                                    break
                                }
                                i_7_++
                            }
                            if (bool) break
                            method544(((LocalizedTextStatics.aLocalizedText_3504!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544)) + string), false, 4)
                        }
                    } catch (runtimeexception: RuntimeException) {
                        throw SoundBankPatchStatics.method2929(runtimeexception, ("tq.A(" + i + ',' + i_5_ + ',' + (if (string != null) "{...}" else "null") + ')'))
                    }
                    break
                } while (false)
            }
    
            @JvmStatic
            fun method202(i: Int, class348_sub42_sub12: ContactEntry?) {
                do {
                    try {
                        anInt8375++
                        if (i == 6 && !ScrollbarComponentStatics.aBoolean8335) {
                            class348_sub42_sub12!!.method2715(111.toByte())
                            FileExistsConditionStatics.anInt4776--
                            if (class348_sub42_sub12.aBoolean9611) {
                                var class348_sub42_sub13 = (ParticleSortRendererStatics.aLinkedNodeListIterator_3022!!.method1011(-99) as ContactList?)
                                while (class348_sub42_sub13 != null) {
                                    if (class348_sub42_sub13.aString9617 == class348_sub42_sub12.aString9601) {
                                        var bool = false
                                        var class348_sub42_sub12_12_ = (class348_sub42_sub13.aLinkedNodeListIterator_9621.method1011(-58) as ContactEntry?)
                                        while (class348_sub42_sub12_12_ != null) {
                                            if (class348_sub42_sub12 == class348_sub42_sub12_12_) {
                                                if (class348_sub42_sub13.method3234((-123).toByte(), class348_sub42_sub12)) ManagedGlResourceStatics.method1868((-98).toByte(), class348_sub42_sub13)
                                                bool = true
                                                break
                                            }
                                            class348_sub42_sub12_12_ = (class348_sub42_sub13.aLinkedNodeListIterator_9621.method1003(112.toByte()) as ContactEntry?)
                                        }
                                        if (bool) break
                                    }
                                    class348_sub42_sub13 = (ParticleSortRendererStatics.aLinkedNodeListIterator_3022!!.method1003(110.toByte()) as ContactList?)
                                }
                            } else {
                                val l = (class348_sub42_sub12.aLong9600)
                                var class348_sub42_sub13: ContactList?
                                class348_sub42_sub13 = (ContactEntryStatics.aHashtable_9603!!.method3480(l, -6008) as? ContactList?)
                                while (class348_sub42_sub13 != null) {
                                    if (class348_sub42_sub13.aString9617 == class348_sub42_sub12.aString9601) break
                                    class348_sub42_sub13 = (ContactEntryStatics.aHashtable_9603!!.method3476(true) as? ContactList?)
                                }
                                if (class348_sub42_sub13 == null || !(class348_sub42_sub13.method3234(15.toByte(), class348_sub42_sub12))) break
                                ManagedGlResourceStatics.method1868(120.toByte(), class348_sub42_sub13)
                            }
                        }
                    } catch (runtimeexception: RuntimeException) {
                        throw SoundBankPatchStatics.method2929(runtimeexception, ("tq.I(" + i + ',' + (if (class348_sub42_sub12 != null) "{...}" else "null") + ')'))
                    }
                    break
                } while (false)
            }
}
