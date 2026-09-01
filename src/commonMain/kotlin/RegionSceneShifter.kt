import kotlin.jvm.JvmStatic
import ClickFeedbackTask.Companion.method1353
import SoundLevelOptionState.Companion.method1836
import BackgroundWorkerThread.Companion.method1911
import SlotBinding.Companion.method2028
import MidiSequencePlayer.Companion.method2878
import RenderListTextureNode.Companion.method3153
import MinimapTriangleDrawer.Companion.method464
import MapRegionLoader.Companion.method766
import SceneObjectSpawner.Companion.method773
import OpenGlRenderNode.Companion.method3297
import lang.Class
import lang.jClass
import kotlin.math.abs

/* Class348_Sub41 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class RegionSceneShifter : LinkedListNode() {

    var anInt7050: Int = 0

    var anInt7053: Int = 0

    companion object {
        var anInt7047: Int = 0
        var aString7048: String? = null
        var anInt7049: Int = 0
        var anInt7051: Int = 0
        var anInt7055: Int = 0

        /*synthetic*/
        var aClass7056: Class<*>? = null

        fun method3154(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, `is`: ByteArray?, i_3_: Byte): Boolean {
            anInt7047++
            if (i_3_.toInt() != 39) InboundPacketHeader.aInboundPacketHeader_7052 = null
            var bool = true
            val class348_sub49 = ByteBuffer(`is`)
            var i_4_ = -1
            while (true) {
                val i_5_ = class348_sub49.method3334(107)
                if (i_5_ == 0) break
                i_4_ += i_5_
                var i_6_ = 0
                var bool_7_ = false
                while (true) {
                    if (bool_7_) {
                        val i_8_ = class348_sub49.readSmart(-118)
                        if (i_8_ == 0) break
                        class348_sub49.readUnsignedByte(255)
                    } else {
                        val i_9_ = class348_sub49.readSmart(i_3_.toInt() xor 0x58.inv())
                        if (i_9_ == 0) break
                        i_6_ += -1 + i_9_
                        val i_10_ = i_6_ and 0x3f
                        val i_11_ = i_6_ shr 6 and 0x3f
                        val i_12_ = class348_sub49.readUnsignedByte(255) shr 2
                        val i_13_ = i_11_ - -i_0_
                        val i_14_ = i_2_ + i_10_
                        if (i_13_ > 0 && i_14_ > 0 && i_13_ < -1 + i && -1 + i_1_ > i_14_) {
                            val class51 = GradientLookupEffect.aSeqDefinitionCache_9195!!.method2005(0, i_4_)
                            if (i_12_ != 22 || IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub4_7220!!.method1737(-32350) != 0 || class51.anInt874 != 0 || (class51.anInt920 == 1) || class51.aBoolean947) {
                                bool_7_ = true
                                if (!class51.method485(9773)) {
                                    CompositeNpcModelBuilder.anInt2101++
                                    bool = false
                                }
                            }
                        }
                    }
                }
            }
            return bool
        }

        @JvmStatic
        fun method3155(i: Int) {
            aString7048 = null
            InboundPacketHeader.aInboundPacketHeader_7052 = null
            if (i != -5) ActorEntity.anInt7054 = 110
        }

        fun method3156(bool: Boolean, string: String): Int {
            anInt7055++
            if (bool != true) InboundPacketHeader.aInboundPacketHeader_7052 = null
            return method1836(-123, 10, true, string)
        }

        fun method3157(i: Int, i_15_: Byte, i_16_: Int, i_17_: Int, bool: Boolean) {
            anInt7049++
            if (bool || i_16_ != Renderer.anInt4581 || FileIoUtil.anInt4095 != i || (CompiledScriptCache.anInt4372 != ParticleSystemState.anInt2204 && IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) != 1)) {
                Renderer.anInt4581 = i_16_
                FileIoUtil.anInt4095 = i
                ParticleSystemState.anInt2204 = CompiledScriptCache.anInt4372
                if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) == 1) ParticleSystemState.anInt2204 = 0
                ByteBufferStatics.method3379(2, i_17_)
                Tooltip.method3511(true, GameAppletFrame.aRSFont_20, ParticleEmitterFactoryStatics.aFontDefinition_3179, LocalizedText.aLocalizedText_3495!!.method2063(ChatCommandProcessor.anInt6967, 544), 2, FacingDirectionNode.aRenderer6654)
                val i_18_ = ArbVertexProgram.regionTileX
                val i_19_ = RegionMapDecoder.regionTileY
                ArbVertexProgram.regionTileX = (-(GlCubemapLightPass.anInt7319 shr 4) + Renderer.anInt4581) * 8
                RegionMapDecoder.regionTileY = 8 * (FileIoUtil.anInt4095 - (RangeThresholdTextureNode.anInt9109 shr 4))
                NamedIdEntry.Companion.aClass348_Sub42_Sub14_6885 = method766(Renderer.anInt4581 * 8, FileIoUtil.anInt4095 * 8)
                OpenGlRenderNode.aSmoothingBuffer_10488 = null
                val i_20_ = ArbVertexProgram.regionTileX - i_18_
                val i_21_ = -i_19_ + RegionMapDecoder.regionTileY
                if (i_17_ == 11) {
                    var i_22_ = 0
                    while (TerrainShadowBuilderGl2.Companion.anInt6930 > i_22_) {
                        val class348_sub22 = TurbulenceTextureNode.aClass348_Sub22Array9319!![i_22_]
                        if (class348_sub22 != null) {
                            val npc = (class348_sub22.aNpc_6859)!!
                            for (i_23_ in 0..9) {
                                npc.anIntArray10320!![i_23_] -= i_20_
                                npc.anIntArray10317!![i_23_] -= i_21_
                            }
                            npc.y -= i_21_ * 512
                            npc.x -= i_20_ * 512
                        }
                        i_22_++
                    }
                } else {
                    ModelDefinitionLoader.anInt2057 = 0
                    var bool_24_ = false
                    val i_25_ = GlCubemapLightPass.anInt7319 * 512 - 512
                    val i_26_ = 512 * (-1 + RangeThresholdTextureNode.anInt9109)
                    var i_27_ = 0
                    while ((TerrainShadowBuilderGl2.Companion.anInt6930 > i_27_)) {
                        val class348_sub22 = TurbulenceTextureNode.aClass348_Sub22Array9319!![i_27_]
                        if (class348_sub22 != null) {
                            val npc = (class348_sub22.aNpc_6859)!!
                            npc.y -= 512 * i_21_
                            npc.x -= 512 * i_20_
                            if ((npc.x) < 0 || i_25_ < (npc.x) || (npc.y) < 0 || i_26_ < (npc.y)) {
                                npc.method2448(null, -2)
                                class348_sub22.method2715(80.toByte())
                                bool_24_ = true
                            } else {
                                var bool_28_ = true
                                for (i_29_ in 0..9) {
                                    npc.anIntArray10320!![i_29_] -= i_20_
                                    npc.anIntArray10317!![i_29_] -= i_21_
                                    if ((npc.anIntArray10320!![i_29_]) < 0 || ((npc.anIntArray10320!![i_29_]) >= GlCubemapLightPass.anInt7319) || (npc.anIntArray10317!![i_29_]) < 0 || (RangeThresholdTextureNode.anInt9109 <= (npc.anIntArray10317!![i_29_]))) bool_28_ = false
                                }
                                if (!bool_28_) {
                                    npc.method2448(null, -2)
                                    bool_24_ = true
                                    class348_sub22.method2715(113.toByte())
                                } else Client.anIntArray1233!![ModelDefinitionLoader.anInt2057++] = (npc.anInt10290)
                            }
                        }
                        i_27_++
                    }
                    if (bool_24_) {
                        TerrainShadowBuilderGl2.Companion.anInt6930 = NpcEntityUpdater.aHashtable_3654!!.method3474(1)
                        NpcEntityUpdater.aHashtable_3654!!.method3477(3, TurbulenceTextureNode.aClass348_Sub22Array9319!! as Array<LinkedListNode?>)
                    }
                }
                if (i_15_ > 122) {
                    for (i_30_ in 0..2047) {
                        val player = (LoadingBarRenderer.aPlayerArray5058!![i_30_])
                        if (player != null) {
                            for (i_31_ in 0..9) {
                                player.anIntArray10320!![i_31_] -= i_20_
                                player.anIntArray10317!![i_31_] -= i_21_
                            }
                            player.x -= i_20_ * 512
                            player.y -= 512 * i_21_
                        }
                    }
                    val minimapPositionStates: Array<MinimapPositionState?> = MultiFieldRecord.Companion.aMinimapPositionStateArray6897s!!
                    var i_32_ = 0
                    while (minimapPositionStates.size > i_32_) {
                        val class302 = minimapPositionStates[i_32_]
                        if (class302 != null) {
                            class302.anInt3832 -= i_21_ * 512
                            class302.anInt3835 -= 512 * i_20_
                        }
                        i_32_++
                    }
                    var class348_sub27 = (SpriteRenderEntry.aNodeDeque_9711!!.method1995(4) as? MultiFieldRecord?)
                    while (class348_sub27 != null) {
                        class348_sub27.anInt6896 -= i_21_
                        class348_sub27.anInt6905 -= i_20_
                        if (WidgetRedrawTracker.anInt3931 != 4 && (class348_sub27.anInt6905 < 0 || class348_sub27.anInt6896 < 0 || (class348_sub27.anInt6905 >= GlCubemapLightPass.anInt7319) || (RangeThresholdTextureNode.anInt9109 <= (class348_sub27.anInt6896)))) class348_sub27.method2715(101.toByte())
                        class348_sub27 = SpriteRenderEntry.aNodeDeque_9711!!.method1990(68.toByte()) as? MultiFieldRecord?
                    }
                    if (WidgetRedrawTracker.anInt3931 != 4) {
                        var class348_sub37 = (ModelBatchBase.aHashtable_1895!!.method3484(0) as? HashTableContainer?)
                        while (class348_sub37 != null) {
                            val i_33_ = (0x3fffL and class348_sub37.aLong4291).toInt()
                            val i_34_ = -ArbVertexProgram.regionTileX + i_33_
                            val i_35_ = (0x3fffL and (class348_sub37.aLong4291 shr 14)).toInt()
                            val i_36_ = i_35_ + -RegionMapDecoder.regionTileY
                            if (i_34_ < 0 || i_36_ < 0 || (i_34_ >= GlCubemapLightPass.anInt7319) || i_36_ >= RangeThresholdTextureNode.anInt9109) class348_sub37.method2715(37.toByte())
                            class348_sub37 = (ModelBatchBase.aHashtable_1895!!.method3482(0) as? HashTableContainer?)
                        }
                    }
                    if (MediaStreamClient.anInt3203 != 0) {
                        MediaStreamClient.anInt3203 -= i_20_
                        TerrainChunkBuilder.anInt1548 -= i_21_
                    }
                    SoundBankPatch.Companion.method2928(true)
                    if (i_17_ != 11) {
                        CollisionMapAccessor.anInt3550 -= i_21_
                        GlslMaterialPass.anInt6246 -= 512 * i_20_
                        RenderableEntry.anInt4336 -= i_20_
                        ClanChatRequestSender.anInt3647 -= i_21_
                        LightingDetailOptionState.anInt6981 -= i_20_
                        CompositeRgbNoiseTexture.anInt8685 -= 512 * i_21_
                        if ((GlCubemapLightPass.anInt7319 < abs(i_20_)) || abs(i_21_) > RangeThresholdTextureNode.anInt9109) method773(true)
                    } else if (WeaveTextureNode.anInt9282 == 4) {
                        RegionTileNode.anInt6652 -= i_21_ * 512
                        FrameStatsReset.anInt5799 -= i_20_ * 512
                        AsyncTaskHandle.anInt2578 -= 512 * i_21_
                        OpenGlRenderer.anInt6633 -= i_20_ * 512
                    } else {
                        WeaveTextureNode.anInt9282 = 1
                        SequencedWallEntity.anInt10163 = -1
                        NativeLibraryState.anInt167 = SequencedWallEntity.anInt10163
                    }
                    method3153(0)
                    method464(-1)
                    OpenGlRenderNode.aNodeDeque_10492!!.method1996(107)
                    SpriteTextureNode.aNodeDeque_9240!!.method1996(103)
                    NpcDefinition.aDoublyLinkedNodeList_2957!!.method1876((-45).toByte())
                    method1911(99.toByte())
                }
            }
        }


        fun method3159(i: Int, i_42_: Int, bool: Boolean, i_43_: Int, i_44_: Int, i_45_: Int, var_renderer: Renderer, i_46_: Int, i_47_: Int) {
            anInt7051++
            var renderTarget = method3297(i_43_, i_45_, i_44_) as RenderTarget?
            if (renderTarget != null) {
                val class51 = GradientLookupEffect.aSeqDefinitionCache_9195!!.method2005(0, renderTarget.method42(-124))
                val i_48_ = 0x3 and renderTarget.method41(-32228)
                val i_49_ = renderTarget.method39(35)
                if (class51.anInt875 == -1) {
                    var i_50_ = i_47_
                    if (class51.anInt874 > 0) i_50_ = i
                    if (i_49_ == 0 || i_49_ == 2) {
                        if (i_48_ != 0) {
                            if (i_48_ == 1) var_renderer.method3649((-79).toByte(), 4, i_42_, i_50_, i_46_)
                            else if (i_48_ == 2) var_renderer.method3660(3 + i_46_, i_50_, 4, i_42_, true)
                            else if (i_48_ == 3) var_renderer.method3649((-121).toByte(), 4, i_42_ + 3, i_50_, i_46_)
                        } else var_renderer.method3660(i_46_, i_50_, 4, i_42_, !bool)
                    }
                    if (i_49_ == 3) {
                        if (i_48_ != 0) {
                            if (i_48_ == 1) var_renderer.method3675(1, (-125).toByte(), 3 + i_46_, i_42_, 1, i_50_)
                            else if (i_48_ != 2) {
                                if (i_48_ == 3) var_renderer.method3675(1, (-125).toByte(), i_46_, 3 + i_42_, 1, i_50_)
                            } else var_renderer.method3675(1, (-125).toByte(), 3 + i_46_, 3 + i_42_, 1, i_50_)
                        } else var_renderer.method3675(1, (-125).toByte(), i_46_, i_42_, 1, i_50_)
                    }
                    if (i_49_ == 2) {
                        if (i_48_ != 0) {
                            if (i_48_ == 1) var_renderer.method3660(3 + i_46_, i_50_, 4, i_42_, true)
                            else if (i_48_ != 2) {
                                if (i_48_ == 3) var_renderer.method3660(i_46_, i_50_, 4, i_42_, true)
                            } else var_renderer.method3649((-106).toByte(), 4, 3 + i_42_, i_50_, i_46_)
                        } else var_renderer.method3649((-96).toByte(), 4, i_42_, i_50_, i_46_)
                    }
                } else method2028(i_46_, class51, i_42_, var_renderer, i_48_, 126)
            }
            renderTarget = (method1353(i_43_, i_45_, i_44_, (if (aClass7056 != null) aClass7056 else (RenderTarget::class.jClass.also { aClass7056 = it }))) as RenderTarget?)
            if (renderTarget != null) {
                val class51 = GradientLookupEffect.aSeqDefinitionCache_9195!!.method2005(0, renderTarget.method42(-88))
                val i_51_ = renderTarget.method41(-32228) and 0x3
                val i_52_ = renderTarget.method39(-126)
                if (class51.anInt875 != -1) method2028(i_46_, class51, i_42_, var_renderer, i_51_, -86)
                else if (i_52_ == 9) {
                    var i_53_ = -1118482
                    if (class51.anInt874 > 0) i_53_ = -1179648
                    if (i_51_ != 0 && i_51_ != 2) var_renderer.method3645(i_42_, i_46_, 3 + i_46_, -8003, i_53_, i_42_ + 3)
                    else var_renderer.method3645(i_42_ + 3, i_46_, 3 + i_46_, -8003, i_53_, i_42_)
                }
            }
            renderTarget = method2878(i_43_, i_45_, i_44_) as RenderTarget?
            if (renderTarget != null) {
                val class51 = GradientLookupEffect.aSeqDefinitionCache_9195!!.method2005(0, renderTarget.method42(-118))
                val i_54_ = renderTarget.method41(-32228) and 0x3
                if (class51.anInt875 != -1) method2028(i_46_, class51, i_42_, var_renderer, i_54_, -5)
            }
        }
    }
}
