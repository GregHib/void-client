import GlCubeMapTexture.Companion.method245
import ClickFeedbackTask.Companion.method1353
import GlTexture2D.Companion.method1969
import WaterMaterialPass.Companion.method2148
import CubemapTextureGlSource.Companion.method2264
import MidiSequencePlayer.Companion.method2878
import InvertTextureNode.Companion.method3135
import DirectionPath.Companion.method536
import NpcType.Companion.method802
import OpenGlRenderNode.Companion.method3297

object LongKeyNodeStatics {
    var anInt6760: Int = 0
    var anInt6761: Int = 0
    var anInt6763: Int = 0
    var aOutgoingPacketHeader_6764: OutgoingPacketHeader? = OutgoingPacketHeader(32, 4)
    var anInt6765: Int = 0
    var aOutgoingPacketHeader_6766: OutgoingPacketHeader? = OutgoingPacketHeader(75, 3)

    /*synthetic*/
    var aClass6767: Class<*>? = null

    fun method2804(i: Byte): Boolean {
        anInt6765++
        try {
            val gzipDecompressor = GzipDecompressor()
            val `is` = gzipDecompressor.method1214(9, InterfaceComponentGroup.aByteArray9622!!)
            val i_0_ = 19 % ((19 - i) / 43)
            method1969(`is`, -5901)
            return true
        } catch (exception: Exception) {
            return false
        }
    }

    @JvmStatic
    fun method2805(i: Byte) {
        aOutgoingPacketHeader_6766 = null
        val i_1_ = -14 % ((i - 72) / 32)
        aOutgoingPacketHeader_6764 = null
    }

    fun method2806(bool: Boolean, i: Int): Int {
        anInt6760++
        if (bool != false) method2807(-36, 35, (-71).toByte(), -71)
        return 0x3ff and i
    }

    fun method2807(i: Int, i_2_: Int, i_3_: Byte, i_4_: Int): OutgoingPacketNode? {
        anInt6761++
        var class348_sub47: OutgoingPacketNode? = null
        if (i_4_ == 0) {
            class348_sub47 = method2148(TextureGeneratorStatics.aOutgoingPacketHeader_2495, TheoraVideoStream.aIsaacCipher_9029, -100)
            StringValueNodeStatics.anInt7112++
        }
        if (i_4_ == 1) {
            class348_sub47 = method2148(HeightMapNoise.aOutgoingPacketHeader_3825, TheoraVideoStream.aIsaacCipher_9029, -93)
            ClickFeedbackTask.anInt4665++
        }
        class348_sub47!!.aClass348_Sub49_Sub2_7116!!.writeShortLittle(i + RegionMapDecoder.regionTileY, 3.toByte())
        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByteAdd(78.toByte(), if (!LoadProgressCountersStatics.aKeyboardInputSource_2449!!.method2696(82, -124)) 0 else 1)
        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAdd(-124, ArbVertexProgram.regionTileX + i_2_)
        MediaStreamClient.anInt3203 = i_2_
        if (i_3_ >= -88) aOutgoingPacketHeader_6764 = null
        TerrainChunkBuilder.anInt1548 = i
        ModelKeyBuilder.Companion.aBoolean6759 = false
        method2264(false)
        return class348_sub47
    }

    var anInt9479: Int = 0

    @JvmStatic
    fun method2808(i: Int, var_renderer: Renderer?, bool: Boolean): Boolean {
        try {
            anInt6763++
            val i_5_ = (-104 + GlCubemapLightPass.anInt7319) / 2
            val i_6_ = (RangeThresholdTextureNode.anInt9109 - 104) / 2
            var bool_7_ = bool
            for (i_8_ in i_5_..<104 + i_5_) {
                var i_9_ = i_6_
                while (i_6_ + 104 > i_9_) {
                    for (i_10_ in i..3) {
                        if (method536(i_9_, false, i_8_, i, i_10_)) {
                            var i_11_ = i_10_
                            if (method802(i_9_, i_8_, true)) i_11_--
                            if (i_11_ >= 0) bool_7_ = bool_7_ and method245(i_11_, i_8_, i_9_, 75.toByte())
                        }
                    }
                    i_9_++
                }
            }
            if (!bool_7_) return false
            val `is` = IntArray(262144)
            var i_12_ = 0
            while (`is`.size > i_12_) {
                `is`[i_12_] = -16777216
                i_12_++
            }
            GroundItemRenderState.aAbstractModelRenderer_1664 = var_renderer!!.method3662(512, `is`, 94.toByte(), 0, 512, 512)
            ParticleGeometryStatics.method3489(-3)
            val i_13_ = (((-10 + (238 + (20.0 * Math.random()).toInt()) shl 8) + (-10 + (Math.random() * 20.0).toInt() + 238 shl 16) - (-(Math.random() * 20.0).toInt() + -228)) or 0xffffff.inv())
            val i_14_ = (228 - -(20.0 * Math.random()).toInt() shl 16 or 0xffffff.inv())
            val i_15_ = ((8.0 * Math.random()).toInt() or ((8.0 * Math.random()).toInt() shl 16 or ((8.0 * Math.random()).toInt() shl 8)))
            val bools = (Array<BooleanArray?>(3 + TextureLoadExceptionStatics.anInt4600) { BooleanArray(TextureLoadExceptionStatics.anInt4600 - -1 + 2) })
            var i_16_ = i_5_
            while (i_16_ < i_5_ - -104) {
                var i_17_ = i_6_
                while (i_17_ < i_6_ - -104) {
                    var i_18_ = 0
                    var i_19_ = 0
                    var i_20_ = i_16_
                    if (i_20_ > 0) {
                        i_20_--
                        i_18_ += 4
                    }
                    var i_21_ = i_17_
                    if (i_21_ > 0) i_21_--
                    var i_22_ = TextureLoadExceptionStatics.anInt4600 + i_16_
                    if (i_22_ < 104) i_22_++
                    var i_23_ = i_17_ - -TextureLoadExceptionStatics.anInt4600
                    if (i_23_ < 104) {
                        i_23_++
                        i_19_ += 4
                    }
                    var_renderer.KA(0, 0, TextureLoadExceptionStatics.anInt4600 * 4 + i_18_, TextureLoadExceptionStatics.anInt4600 * 4 + i_19_)
                    var_renderer.GA(-16777216)
                    for (i_24_ in i..3) {
                        for (i_25_ in 0..TextureLoadExceptionStatics.anInt4600) {
                            var i_26_ = 0
                            while ((i_26_ <= TextureLoadExceptionStatics.anInt4600)) {
                                bools[i_25_]!![i_26_] = method536(i_21_ + i_26_, false, i_20_ + i_25_, i, i_24_)
                                i_26_++
                            }
                        }
                        TerrainTileShapeStatics.aTerrainTileArray8801!![i_24_]!!.method3987(0, 0, 1024, i_20_, i_21_, i_22_, i_23_, bools)
                        if (!PlayerAppearanceUpdateDecoder.aBoolean4542) {
                            for (i_27_ in -4..<TextureLoadExceptionStatics.anInt4600) {
                                for (i_28_ in -4..<TextureLoadExceptionStatics.anInt4600) {
                                    val i_29_ = i_16_ + i_27_
                                    val i_30_ = i_28_ + i_17_
                                    if (i_5_ <= i_29_ && i_6_ <= i_30_ && method536(i_30_, false, i_29_, i, i_24_)) {
                                        var i_31_ = i_24_
                                        if (method802(i_30_, i_29_, true)) i_31_--
                                        if (i_31_ >= 0) RegionSceneShifterStatics.method3159(i_14_, ((-i_28_ + (TextureLoadExceptionStatics.anInt4600)) * 4 + i_19_ + -4), false, i_31_, i_30_, i_29_, var_renderer, 4 * i_27_ + i_18_, i_13_)
                                    }
                                }
                            }
                        }
                    }
                    if (PlayerAppearanceUpdateDecoder.aBoolean4542) {
                        val class361 = TimedRecordAccessorStatics.aCollisionMapArray7108s!![i]
                        for (i_32_ in 0..<TextureLoadExceptionStatics.anInt4600) {
                            var i_33_ = 0
                            while ((TextureLoadExceptionStatics.anInt4600 > i_33_)) {
                                val i_34_ = i_16_ + i_32_
                                val i_35_ = i_33_ + i_17_
                                val i_36_ = (class361!!.anIntArrayArray4438!![(-class361.anInt4453 + i_34_)]!![(-class361.anInt4441 + i_35_)])
                                if ((0x40240000 and i_36_) != 0) var_renderer.method3675(4, (-125).toByte(), i_32_ * 4 + i_18_, -4 + (TextureLoadExceptionStatics.anInt4600 + -i_33_) * 4 + i_19_, 4, -1713569622)
                                else if ((0x800000 and i_36_) == 0) {
                                    if ((i_36_ and 0x2000000) != 0) var_renderer.method3660(3 + (i_18_ - -(i_32_ * 4)), -1713569622, 4, (-4 + (4 * (-i_33_ + (TextureLoadExceptionStatics.anInt4600)) + i_19_)), true)
                                    else if ((i_36_ and 0x8000000) != 0) var_renderer.method3649((-126).toByte(), 4, 3 + (i_19_ + ((TextureLoadExceptionStatics.anInt4600) - i_33_) * 4) + -4, -1713569622, i_18_ + 4 * i_32_)
                                    else if ((0x20000000 and i_36_) != 0) var_renderer.method3660(i_18_ + 4 * i_32_, -1713569622, 4, (4 * (-i_33_ + (TextureLoadExceptionStatics.anInt4600)) + (i_19_ - 4)), bool)
                                } else var_renderer.method3649((-113).toByte(), 4, (-4 + i_19_ + 4 * (-i_33_ + (TextureLoadExceptionStatics.anInt4600))), -1713569622, i_32_ * 4 + i_18_)
                                i_33_++
                            }
                        }
                    }
                    var_renderer.aa(i_18_, i_19_, 4 * TextureLoadExceptionStatics.anInt4600, TextureLoadExceptionStatics.anInt4600 * 4, i_15_, 2)
                    GroundItemRenderState.aAbstractModelRenderer_1664!!.method979((-i_5_ + i_16_) * 4 + 48, (-(4 * (i_17_ - i_6_)) + 464 + -(TextureLoadExceptionStatics.anInt4600 * 4)), TextureLoadExceptionStatics.anInt4600 * 4, 4 * TextureLoadExceptionStatics.anInt4600, i_18_, i_19_)
                    i_17_ += TextureLoadExceptionStatics.anInt4600
                }
                i_16_ += TextureLoadExceptionStatics.anInt4600
            }
            var_renderer.la()
            var_renderer.GA(-16777215)
            TextureCache.method3466(-86)
            anInt9479 = 0
            ModelWallEntity.aNodeDeque_10125!!.method1996(116)
            if (!PlayerAppearanceUpdateDecoder.aBoolean4542) {
                var i_37_ = i_5_
                while (104 + i_5_ > i_37_) {
                    var i_38_ = i_6_
                    while (104 + i_6_ > i_38_) {
                        var i_39_ = i
                        while (i_39_ <= 1 + i && i_39_ <= 3) {
                            if (method536(i_38_, !bool, i_37_, i, i_39_)) {
                                var renderTarget = (method2878(i_39_, i_37_, i_38_) as RenderTarget?)
                                if (renderTarget == null) renderTarget = ((method1353(i_39_, i_37_, i_38_, (if (aClass6767 != null) aClass6767 else (RenderTarget::class.java.also { aClass6767 = it })))) as RenderTarget?)
                                if (renderTarget == null) renderTarget = (method3297(i_39_, i_37_, i_38_) as RenderTarget?)
                                if (renderTarget == null) renderTarget = ((method3135(i_39_, i_37_, i_38_)) as RenderTarget?)
                                if (renderTarget != null) {
                                    val class51 = (GradientLookupEffect.aSeqDefinitionCache_9195!!.method2005(0, renderTarget.method42(-99)))
                                    if (!class51.aBoolean942 || ModelBatchBaseStatics.aBoolean1900) {
                                        var i_40_ = class51.anInt921
                                        if (class51.anIntArray945 != null) {
                                            var i_41_ = 0
                                            while (((class51.anIntArray945!!).size > i_41_)) {
                                                if ((class51.anIntArray945!![i_41_]) != -1) {
                                                    val class51_42_ = (GradientLookupEffect.aSeqDefinitionCache_9195!!.method2005(0, (class51.anIntArray945!![i_41_])))
                                                    if (class51_42_.anInt921 >= 0) i_40_ = (class51_42_.anInt921)
                                                }
                                                i_41_++
                                            }
                                        }
                                        if (i_40_ >= 0) {
                                            var bool_43_ = false
                                            if (i_40_ >= 0) {
                                                val class42 = (TheoraVideoStream.aConfigDefinitionLoader_9031!!.method1225(i_40_, 126.toByte()))
                                                if (class42 != null && (class42.aBoolean599)) bool_43_ = true
                                            }
                                            var i_44_ = i_37_
                                            var i_45_ = i_38_
                                            if (bool_43_) {
                                                val is_46_ = (TimedRecordAccessorStatics.aCollisionMapArray7108s!![i_39_]!!.anIntArrayArray4438)!!
                                                val i_47_ = (TimedRecordAccessorStatics.aCollisionMapArray7108s!![i_39_]!!.anInt4453)
                                                val i_48_ = (TimedRecordAccessorStatics.aCollisionMapArray7108s!![i_39_]!!.anInt4441)
                                                for (i_49_ in 0..9) {
                                                    val i_50_ = (Math.random() * 4.0).toInt()
                                                    if ((i_50_ == 0) && (i_44_ > i_5_) && i_37_ + -3 < i_44_ && ((0x2c0108 and (is_46_[(-i_47_ + (i_44_ - 1))]!![(-i_48_ + i_45_)])) == 0)) i_44_--
                                                    if (i_50_ == 1 && (i_44_ < 104 + (i_5_ - 1)) && 3 + i_37_ > i_44_ && ((is_46_[(-i_47_ + 1 + i_44_)]!![i_45_ + -i_48_]) and 0x2c0180) == 0) i_44_++
                                                    if ((i_50_ == 2) && (i_6_ < i_45_) && i_45_ > -3 + i_38_ && ((0x2c0102 and (is_46_[(-i_47_ + i_44_)]!![(i_45_ - 1 - i_48_)])) == 0)) i_45_--
                                                    if (i_50_ == 3 && (104 + i_6_ - 1 > i_45_) && 3 + i_38_ > i_45_ && ((0x2c0120 and (is_46_[i_44_ - i_47_]!![(-i_48_ + 1 + i_45_)])) == 0)) i_45_++
                                                }
                                            }
                                            SeqDefinitionCache.anIntArray3347!![(anInt9479)] = class51.anInt941
                                            MenuActionNode.anIntArray6770!![(anInt9479)] = i_44_
                                            BoxBlurTextureNode.anIntArray9458!![(anInt9479)] = i_45_
                                            anInt9479++
                                        }
                                    }
                                }
                            }
                            i_39_++
                        }
                        i_38_++
                    }
                    i_37_++
                }
                if (OpenGlRenderNode.aSmoothingBuffer_10488 != null) {
                    DirectionUtil.aJs5Archive_1541!!.anInt634 = 1
                    TheoraVideoStream.aConfigDefinitionLoader_9031!!.method1220(116.toByte(), 64, 1024)
                    for (i_51_ in 0..<OpenGlRenderNode.aSmoothingBuffer_10488!!.anInt3241) {
                        val i_52_ = (OpenGlRenderNode.aSmoothingBuffer_10488!!.anIntArray3238!![i_51_])
                        if ((LocalPlayerState.aPlayer_1907!!.plane).toInt() == i_52_ shr 28) {
                            val i_53_ = ((i_52_ shr 14 and 0x3fff) - ArbVertexProgram.regionTileX)
                            val i_54_ = (i_52_ and 0x3fff) + -RegionMapDecoder.regionTileY
                            if (i_53_ >= 0 && i_53_ < GlCubemapLightPass.anInt7319 && i_54_ >= 0 && (RangeThresholdTextureNode.anInt9109 > i_54_)) ModelWallEntity.aNodeDeque_10125!!.method1999(IntKeyNode(i_51_), -20180)
                            else {
                                val class42 = (TheoraVideoStream.aConfigDefinitionLoader_9031!!.method1225((OpenGlRenderNode.aSmoothingBuffer_10488!!.anIntArray3239!![i_51_]), 120.toByte()))
                                if (class42!!.anIntArray591 != null && (i_53_ + class42.anInt595 >= 0) && (GlCubemapLightPass.anInt7319 > class42.anInt603 + i_53_) && i_54_ + class42.anInt570 >= 0 && (RangeThresholdTextureNode.anInt9109 > (i_54_ - -class42.anInt607))) ModelWallEntity.aNodeDeque_10125!!.method1999(IntKeyNode(i_51_), -20180)
                            }
                        }
                    }
                    TheoraVideoStream.aConfigDefinitionLoader_9031!!.method1220(13.toByte(), 64, 128)
                    DirectionUtil.aJs5Archive_1541!!.anInt634 = 2
                    DirectionUtil.aJs5Archive_1541!!.method412((-126).toByte())
                }
            }
            return true
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("ij.E(" + i + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + bool + ')'))
        }
    }
}
