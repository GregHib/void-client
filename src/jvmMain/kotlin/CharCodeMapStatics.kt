import LinkedListIteratorStatics.method1242
import CollisionMapAccessor.method2064
import GlCubemapLightPass.Companion.method3542
import ByteBuffer.Companion.method462

object CharCodeMapStatics {
    var anInt9589: Int = 0
    var aOutgoingPacketHeader_9590: OutgoingPacketHeader? = OutgoingPacketHeader(83, -1)
    var anInt9591: Int = -1

    @JvmStatic
    fun method3220(i: Byte) {
        if (i < 96) anInt9591 = 45
        aOutgoingPacketHeader_9590 = null
    }

    fun method3223() {
        for (i in 0..<DrawListState.anInt1477) {
            val class318_sub1_sub3 = ModelDataCache.aClass318_Sub1_Sub3Array357!![i]!!
            StringValueNodeStatics.method3320(class318_sub1_sub3, true)
            ModelDataCache.aClass318_Sub1_Sub3Array357!![i] = null
        }
        DrawListState.anInt1477 = 0
    }

    @JvmStatic
    fun method609(i: Byte) {
        if (i <= -7) {
            NativeRenderer.aHuffmanCodec_1131 = null
            anIntArray1127 = null
        }
    }

    var anIntArray1127: IntArray? = IntArray(2)

    fun method3225(i: Int) {
        anInt9589++
        if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub14_7264!!.method1778(-32350) == 2) {
            val i_5_ = (0xff and -4 + TextureQualityOptionState.anInt6006).toByte()
            val i_6_ = TextureQualityOptionState.anInt6006 % GlCubemapLightPass.anInt7319
            for (i_7_ in 0..3) {
                var i_8_ = 0
                while (RangeThresholdTextureNode.anInt9109 > i_8_) {
                    RegionSceneLoader.aByteArrayArrayArray3700!![i_7_]!![i_6_]!![i_8_] = i_5_
                    i_8_++
                }
            }
            if (CompiledScriptCache.anInt4372 != 3) {
                for (i_9_ in 0..1) {
                    FileIoUtil.anIntArray4097!![i_9_] = -1000000
                    LinkedListIteratorStatics.anIntArray2117!![i_9_] = 1000000
                    BlankTextureNodeStatics.anIntArray9259!![i_9_] = 0
                    anIntArray1127!![i_9_] = 1000000
                    ConnectionStateTypeStatics.anIntArray1045!![i_9_] = 0
                }
                var i_10_ = (LocalPlayerState.aPlayer_1907!!.x)
                var i_11_ = (LocalPlayerState.aPlayer_1907!!.y)
                if (i >= 100) {
                    if (WeaveTextureNode.anInt9282 == 1 || NativeLibraryState.anInt167 != -1) {
                        if (WeaveTextureNode.anInt9282 != 1) {
                            i_11_ = SequencedWallEntity.anInt10163
                            i_10_ = NativeLibraryState.anInt167
                        }
                        if ((0x4 and (GraphicsOptionState.aByteArrayArrayArray6962!![CompiledScriptCache.anInt4372]!![i_10_ shr 9]!![i_11_ shr 9]).toInt()) != 0) method3542(i_11_ shr 9, HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029, i_10_ shr 9, 0, 0, false)
                        if (MinimapAreaMarkerNodeStatics.anInt9701 < 2560) {
                            var i_12_ = GlslMaterialPass.anInt6246 shr 9
                            var i_13_ = CompositeRgbNoiseTexture.anInt8685 shr 9
                            val i_14_ = i_10_ shr 9
                            val i_15_ = i_11_ shr 9
                            val i_16_: Int
                            if (i_14_ > i_12_) i_16_ = i_14_ + -i_12_
                            else i_16_ = i_12_ + -i_14_
                            val i_17_: Int
                            if (i_15_ <= i_13_) i_17_ = -i_15_ + i_13_
                            else i_17_ = i_15_ + -i_13_
                            if (i_16_ == 0 && i_17_ == 0 || -GlCubemapLightPass.anInt7319 >= i_16_ || (GlCubemapLightPass.anInt7319 <= i_16_) || i_17_ <= -RangeThresholdTextureNode.anInt9109 || RangeThresholdTextureNode.anInt9109 <= i_17_) method1242(("RC: " + i_12_ + "," + i_13_ + " " + i_14_ + "," + i_15_ + " " + ArbVertexProgram.regionTileX + "," + RegionMapDecoder.regionTileY), null, 15004)
                            else if (i_16_ <= i_17_) {
                                val i_18_ = i_16_ * 65536 / i_17_
                                var i_19_ = 32768
                                while (i_15_ != i_13_) {
                                    if (i_15_ > i_13_) i_13_++
                                    else if (i_15_ < i_13_) i_13_--
                                    if ((0x4 and (GraphicsOptionState.aByteArrayArrayArray6962!![CompiledScriptCache.anInt4372]!![i_12_]!![i_13_]).toInt()) != 0) {
                                        method3542(i_13_, (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029), i_12_, 0, 1, false)
                                        break
                                    }
                                    i_19_ += i_18_
                                    if (i_19_ >= 65536) {
                                        if (i_12_ < i_14_) i_12_++
                                        else if (i_14_ < i_12_) i_12_--
                                        i_19_ -= 65536
                                        if ((0x4 and (GraphicsOptionState.aByteArrayArrayArray6962!![CompiledScriptCache.anInt4372]!![i_12_]!![i_13_]).toInt()) != 0) {
                                            method3542(i_13_, (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029), i_12_, 0, 1, false)
                                            break
                                        }
                                    }
                                }
                            } else {
                                val i_20_ = 65536 * i_17_ / i_16_
                                var i_21_ = 32768
                                while (i_14_ != i_12_) {
                                    if (i_12_ >= i_14_) {
                                        if (i_12_ > i_14_) i_12_--
                                    } else i_12_++
                                    if ((0x4 and (GraphicsOptionState.aByteArrayArrayArray6962!![CompiledScriptCache.anInt4372]!![i_12_]!![i_13_]).toInt()) != 0) {
                                        method3542(i_13_, (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029), i_12_, 0, 1, false)
                                        break
                                    }
                                    i_21_ += i_20_
                                    if (i_21_ >= 65536) {
                                        if (i_15_ > i_13_) i_13_++
                                        else if (i_13_ > i_15_) i_13_--
                                        i_21_ -= 65536
                                        if ((0x4 and (GraphicsOptionState.aByteArrayArrayArray6962!![CompiledScriptCache.anInt4372]!![i_12_]!![i_13_]).toInt()) != 0) {
                                            method3542(i_13_, (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029), i_12_, 0, 1, false)
                                            break
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        val i_22_ = method2064(GlslMaterialPass.anInt6246, CompiledScriptCache.anInt4372, 11219, CompositeRgbNoiseTexture.anInt8685)
                        if (i_22_ - ParticleSystemRenderer.anInt3855 < 3200 && ((GraphicsOptionState.aByteArrayArrayArray6962!![CompiledScriptCache.anInt4372]!![GlslMaterialPass.anInt6246 shr 9]!![CompositeRgbNoiseTexture.anInt8685 shr 9]).toInt() and 0x4) != 0) method3542(CompositeRgbNoiseTexture.anInt8685 shr 9, HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029, GlslMaterialPass.anInt6246 shr 9, 0, 1, false)
                    }
                }
            }
        }
    }
}
