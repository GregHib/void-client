import LinkedListIteratorStatics.method1242
import BoundsConstraintEntryStatics.method2057
import CollisionMapAccessor.method2064
import GlCubemapLightPassStatics.method3542
import MinimapSquareDrawerStatics.method462

object CharCodeMapStatics {
    var anInt9579: Int = 0
            var anInt9581: Int = 0
            var anInt9583: Int = 0
            var anInt9584: Int = 0
            var anInt9585: Int = 0
            var anInt9586: Int = 0
            var anInt9589: Int = 0
            var aFontMetaRef_9590: FontMetaRef? = FontMetaRef(83, -1)
            var anInt9591: Int = -1
            @JvmStatic
            fun method3220(i: Byte) {
                if (i < 96) anInt9591 = 45
                aFontMetaRef_9590 = null
            }
    
            fun method3223() {
                for (i in 0..<DrawListState.anInt1477) {
                    val class318_sub1_sub3 = ModelDataCache.aClass318_Sub1_Sub3Array357!![i]!!
                    StringValueNodeStatics.method3320(class318_sub1_sub3, true)
                    ModelDataCache.aClass318_Sub1_Sub3Array357!![i] = null
                }
                DrawListState.anInt1477 = 0
            }
    
            fun method3225(i: Int) {
                anInt9589++
                if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub14_7264!!.method1778(-32350) == 2) {
                    val i_5_ = (0xff and -4 + TextureQualityOptionStateStatics.anInt6006).toByte()
                    val i_6_ = TextureQualityOptionStateStatics.anInt6006 % GlCubemapLightPassStatics.anInt7319
                    for (i_7_ in 0..3) {
                        var i_8_ = 0
                        while (RangeThresholdTextureNodeStatics.anInt9109 > i_8_) {
                            RegionSceneLoader.aByteArrayArrayArray3700!![i_7_]!![i_6_]!![i_8_] = i_5_
                            i_8_++
                        }
                    }
                    if (CompiledScriptCacheStatics.anInt4372 != 3) {
                        for (i_9_ in 0..1) {
                            FileIoUtil.anIntArray4097!![i_9_] = -1000000
                            LinkedListIteratorStatics.anIntArray2117!![i_9_] = 1000000
                            BlankTextureNodeStatics.anIntArray9259!![i_9_] = 0
                            AbstractModelStatics.anIntArray1127!![i_9_] = 1000000
                            ConnectionStateTypeStatics.anIntArray1045!![i_9_] = 0
                        }
                        var i_10_ = (LocalPlayerState.aPlayer_1907!!.x)
                        var i_11_ = (LocalPlayerState.aPlayer_1907!!.y)
                        if (i >= 100) {
                            if (WeaveTextureNodeStatics.anInt9282 == 1 || NativeLibraryState.anInt167 != -1) {
                                if (WeaveTextureNodeStatics.anInt9282 != 1) {
                                    i_11_ = SequencedWallEntityStatics.anInt10163
                                    i_10_ = NativeLibraryState.anInt167
                                }
                                if ((0x4 and (AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![CompiledScriptCacheStatics.anInt4372]!![i_10_ shr 9]!![i_11_ shr 9]).toInt()) != 0) method3542(i_11_ shr 9, HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029, i_10_ shr 9, 0, 0, false)
                                if (MinimapAreaMarkerNodeStatics.anInt9701 < 2560) {
                                    var i_12_ = GlslMaterialPassStatics.anInt6246 shr 9
                                    var i_13_ = CompositeRgbNoiseTextureStatics.anInt8685 shr 9
                                    val i_14_ = i_10_ shr 9
                                    val i_15_ = i_11_ shr 9
                                    val i_16_: Int
                                    if (i_14_ > i_12_) i_16_ = i_14_ + -i_12_
                                    else i_16_ = i_12_ + -i_14_
                                    val i_17_: Int
                                    if (i_15_ <= i_13_) i_17_ = -i_15_ + i_13_
                                    else i_17_ = i_15_ + -i_13_
                                    if (i_16_ == 0 && i_17_ == 0 || -GlCubemapLightPassStatics.anInt7319 >= i_16_ || (GlCubemapLightPassStatics.anInt7319 <= i_16_) || i_17_ <= -RangeThresholdTextureNodeStatics.anInt9109 || RangeThresholdTextureNodeStatics.anInt9109 <= i_17_) method1242(("RC: " + i_12_ + "," + i_13_ + " " + i_14_ + "," + i_15_ + " " + ArbVertexProgramStatics.regionTileX + "," + RegionMapDecoder.regionTileY), null, 15004)
                                    else if (i_16_ <= i_17_) {
                                        val i_18_ = i_16_ * 65536 / i_17_
                                        var i_19_ = 32768
                                        while (i_15_ != i_13_) {
                                            if (i_15_ > i_13_) i_13_++
                                            else if (i_15_ < i_13_) i_13_--
                                            if ((0x4 and (AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![CompiledScriptCacheStatics.anInt4372]!![i_12_]!![i_13_]).toInt()) != 0) {
                                                method3542(i_13_, (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029), i_12_, 0, 1, false)
                                                break
                                            }
                                            i_19_ += i_18_
                                            if (i_19_ >= 65536) {
                                                if (i_12_ < i_14_) i_12_++
                                                else if (i_14_ < i_12_) i_12_--
                                                i_19_ -= 65536
                                                if ((0x4 and (AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![CompiledScriptCacheStatics.anInt4372]!![i_12_]!![i_13_]).toInt()) != 0) {
                                                    method3542(i_13_, (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029), i_12_, 0, 1, false)
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
                                            if ((0x4 and (AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![CompiledScriptCacheStatics.anInt4372]!![i_12_]!![i_13_]).toInt()) != 0) {
                                                method3542(i_13_, (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029), i_12_, 0, 1, false)
                                                break
                                            }
                                            i_21_ += i_20_
                                            if (i_21_ >= 65536) {
                                                if (i_15_ > i_13_) i_13_++
                                                else if (i_13_ > i_15_) i_13_--
                                                i_21_ -= 65536
                                                if ((0x4 and (AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![CompiledScriptCacheStatics.anInt4372]!![i_12_]!![i_13_]).toInt()) != 0) {
                                                    method3542(i_13_, (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029), i_12_, 0, 1, false)
                                                    break
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                val i_22_ = method2064(GlslMaterialPassStatics.anInt6246, CompiledScriptCacheStatics.anInt4372, 11219, CompositeRgbNoiseTextureStatics.anInt8685)
                                if (i_22_ - ParticleSystemRendererStatics.anInt3855 < 3200 && ((AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![CompiledScriptCacheStatics.anInt4372]!![GlslMaterialPassStatics.anInt6246 shr 9]!![CompositeRgbNoiseTextureStatics.anInt8685 shr 9]).toInt() and 0x4) != 0) method3542(CompositeRgbNoiseTextureStatics.anInt8685 shr 9, HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029, GlslMaterialPassStatics.anInt6246 shr 9, 0, 1, false)
                            }
                        }
                    }
                }
            }
}
