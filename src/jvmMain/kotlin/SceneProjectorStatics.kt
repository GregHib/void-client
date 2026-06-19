import AudioResamplerStatics.method1274
import SocketStreamWorkerStatics.method1469
import GlTexture3DStatics.method1960
import MinimapTileEntryStatics.method383
import ScrollingNoiseTextureStatics.method560
import RenderNodeStatics.method3284
import kotlin.math.max
import kotlin.math.min

object SceneProjectorStatics {
    var anInt2982: Int = 0
            var anInt2983: Int = 0
            var anInt2984: Int = 0
            @JvmField
            var anInt2986: Int = 0
            var anInt2988: Int = 0
            var anInt2989: Int = 0
    
            fun method1634(`is`: IntArray?, i: Int, is_0_: Array<Array<ByteArray?>?>?, i_1_: Int, i_2_: Int, is_3_: IntArray?, i_4_: Int, i_5_: Int, bool: Boolean, i_6_: Int, i_7_: Int, is_8_: IntArray?, is_9_: IntArray?, i_10_: Byte, is_11_: IntArray?, i_12_: Int, bool_13_: Boolean, i_14_: Int) {
                do {
                    try {
                        anInt2982++
                        if (ByteBufferStatics.anInt7207 != -1) {
                            val is_15_ = CameraRotationStubStatics.aRenderer326!!.Y()
                            val i_16_ = is_15_[0]
                            val i_17_ = is_15_[1]
                            val i_18_ = is_15_[2]
                            val i_19_ = is_15_[3]
                            var i_20_ = i_18_
                            var i_21_ = i_19_
                            if (ByteBufferStatics.anInt7207 == 1) {
                                i_20_ = (i_18_.toDouble() * LinkedNodeListIteratorStatics.anInt1651.toDouble() / ShadowQualityOptionStateStatics.anInt6008.toDouble()).toInt()
                                i_21_ = (LinkedNodeListIteratorStatics.anInt1651.toDouble() * i_19_.toDouble() / ShadowQualityOptionStateStatics.anInt6008.toDouble()).toInt()
                            }
                            if (!PcmStreamBufferStatics.aBoolean8870) {
                                if (ByteBufferStatics.anInt7207 == 1) method383(0)
                                val i_22_ = -AnimatedModelRendererStatics.anInt8422 + i_4_
                                val i_23_ = i_6_ + -ConfigIdPairStatics.anInt403
                                val i_24_ = -CameraSplineNodeStatics.anInt6849 + i_5_
                                val i_25_ = ((VideoAdChecker.aDouble3182 * i_22_.toDouble() + i_23_.toDouble() * MapElementDefinitionCacheStatics.aDouble3980 + i_24_.toDouble() * SceneCollisionEntryStatics.aDouble4404) * i_20_.toDouble() / i_14_.toDouble()).toInt()
                                val i_26_ = (((i_24_.toDouble() * ProceduralTextureGraphStatics.aDouble9531) + ((i_22_.toDouble() * TheoraVideoStreamStatics.aDouble9023) + (i_23_.toDouble() * LocalizedTextTripleStatics.aDouble3761))) * i_21_.toDouble() / i_14_.toDouble()).toInt()
                                val d = (i_24_.toDouble() * PcmStreamBufferStatics.aDouble8869 + (MenuActionNodeStatics.aDouble6774 * i_23_.toDouble() + i_22_.toDouble() * NoiseTextureGeneratorStatics.aDouble1083))
                                val i_27_ = i_25_ + SoundEnvelopeStatics.anInt2747 - ShaderObjectStatics.anInt4100
                                val i_28_ = (HardKeyedCacheEntryReferenceStatics.anInt10444 + i_26_ + -ModelVertexColorBufferStatics.anInt6568)
                                val i_29_ = GrayscaleNoiseTextureStatics.anInt5283 + i_27_
                                val i_30_ = LinkedNodeListIteratorStatics.anInt1651 + i_28_
                                if ((i_27_ < 0 || i_28_ < 0 || i_29_ > SynthVoiceGroupStatics.anInt8854 || (i_30_ > ShadowQualityOptionStateStatics.anInt6008)) && ByteBufferStatics.anInt7207 != 2) {
                                    if (i_29_ <= 0 || i_30_ <= 0 || (SynthVoiceGroupStatics.anInt8854 <= i_27_) || (i_28_ >= ShadowQualityOptionStateStatics.anInt6008)) PcmStreamBufferStatics.aBoolean8870 = true
                                    else {
                                        val i_31_ = i_27_ - SoundEnvelopeStatics.anInt2747
                                        val i_32_ = (i_28_ - HardKeyedCacheEntryReferenceStatics.anInt10444)
                                        var i_33_ = 0
                                        var i_34_ = 0
                                        var i_35_ = 0
                                        var i_36_ = 0
                                        var d_37_ = 0.0
                                        if (ByteBufferStatics.anInt7207 == 0) {
                                            d_37_ = d + ShortMatrixNodeStatics.aDouble9517
                                            i_33_ = i_31_
                                            i_34_ = i_32_
                                        } else if (ByteBufferStatics.anInt7207 == 1) {
                                            i_35_ = i_31_ / DirectionPathStatics.anInt1067
                                            i_36_ = i_32_ / ByteStoreStatics.anInt4267
                                            i_33_ = i_35_ * DirectionPathStatics.anInt1067
                                            i_34_ = i_36_ * ByteStoreStatics.anInt4267
                                            d_37_ = ((d + ShortMatrixNodeStatics.aDouble9517) * (i_32_ * i_34_ + i_33_ * i_31_).toDouble() / (i_32_ * i_32_ + i_31_ * i_31_).toDouble())
                                        }
                                        d_37_ = -d_37_
                                        var i_38_ = 0
                                        var i_39_ = 0
                                        var i_40_ = 0
                                        var i_41_ = 0
                                        var i_42_ = 0
                                        val i_43_: Int
                                        val i_44_: Int
                                        val i_45_: Int
                                        val i_46_: Int
                                        if (i_33_ >= 0) {
                                            i_45_ = 0
                                            i_43_ = (-i_33_ + SynthVoiceGroupStatics.anInt8854)
                                            if (ByteBufferStatics.anInt7207 == 1) {
                                                i_42_ = i_35_
                                                i_40_ = -i_35_ + ItemModelDefinitionStatics.anInt425
                                            }
                                            i_46_ = i_33_
                                            i_44_ = i_43_
                                        } else {
                                            i_43_ = (SynthVoiceGroupStatics.anInt8854 + i_33_)
                                            i_44_ = 0
                                            i_45_ = -i_33_
                                            i_46_ = i_45_
                                            if (ByteBufferStatics.anInt7207 == 1) {
                                                i_42_ = -i_35_
                                                i_40_ = 0
                                            }
                                        }
                                        var i_47_ = 0
                                        val i_48_: Int
                                        val i_49_: Int
                                        val i_50_: Int
                                        val i_51_: Int
                                        val i_52_: Int
                                        val i_53_: Int
                                        if (i_34_ >= 0) {
                                            i_50_ = ShadowQualityOptionStateStatics.anInt6008 + -i_34_
                                            i_48_ = 0
                                            i_49_ = i_50_
                                            i_51_ = i_34_
                                            i_53_ = 0
                                            if (ByteBufferStatics.anInt7207 == 1) {
                                                i_41_ = 0
                                                i_39_ = i_36_
                                                i_38_ = -i_36_ + BackgroundWorkerThreadStatics.anInt3225
                                                i_47_ = i_38_
                                            }
                                            i_52_ = i_50_
                                        } else {
                                            i_48_ = -i_34_
                                            i_49_ = 0
                                            i_50_ = ShadowQualityOptionStateStatics.anInt6008 + i_34_
                                            i_51_ = i_48_
                                            i_52_ = i_50_
                                            i_53_ = i_51_
                                            if (ByteBufferStatics.anInt7207 == 1) {
                                                i_39_ = -i_36_
                                                i_38_ = 0
                                                i_47_ = i_36_ + BackgroundWorkerThreadStatics.anInt3225
                                                i_41_ = i_39_
                                            }
                                        }
                                        val class243 = (HardCacheEntryReferenceStatics.aSceneObjectSpawner_10436!!.aDoublyLinkedNodeList_1282)
                                        var class318_sub4 = (class243.method1872(8) as SceneEntityModel?)
                                        while (class318_sub4 != null) {
                                            val class318_sub3s = (class318_sub4.aClass318_Sub3Array6414)!!
                                            var bool_54_ = true
                                            var i_55_ = 0
                                            while (class318_sub3s.size > i_55_) {
                                                val class318_sub3 = class318_sub3s[i_55_]!!
                                                var i_56_ = (class318_sub3.anInt6405)
                                                var i_57_ = (class318_sub3.anInt6402)
                                                var i_58_ = (class318_sub3.anInt6406)
                                                var i_59_ = (class318_sub3.anInt6404)
                                                val i_60_ = (class318_sub3.anInt6403)
                                                i_59_ = -i_34_ + i_59_
                                                class318_sub3.anInt6404 = i_59_
                                                i_56_ = -i_33_ + i_56_
                                                class318_sub3.anInt6405 = i_56_
                                                i_58_ += -i_33_
                                                class318_sub3.anInt6406 = i_58_
                                                i_57_ = -i_34_ + i_57_
                                                class318_sub3.anInt6402 = i_57_
                                                if (bool_54_) {
                                                    val i_61_ = -i_60_ + (min(i_58_, i_56_))
                                                    if (i_61_ <= SynthVoiceGroupStatics.anInt8854) {
                                                        val i_62_ = (-i_60_ + (min(i_59_, i_57_)))
                                                        if (ShadowQualityOptionStateStatics.anInt6008 >= i_62_) {
                                                            val i_63_ = ((max(i_58_, i_56_)) - -i_60_)
                                                            if (i_63_ >= 0) {
                                                                val i_64_ = ((max(i_59_, i_57_)) + i_60_)
                                                                if (i_64_ >= 0) bool_54_ = false
                                                            }
                                                        }
                                                    }
                                                }
                                                i_55_++
                                            }
                                            if (bool_54_) {
                                                class318_sub4.method2373(false)
                                                method560(class318_sub4, i xor 0x4b)
                                            }
                                            class318_sub4 = (class243.method1878(122.toByte()) as SceneEntityModel?)
                                        }
                                        if (ByteBufferStatics.anInt7207 == 0) CameraRotationStubStatics.aRenderer326!!.method3687(WidgetDefinitionStatics.anSpriteDrawTarget_252)
                                        CameraRotationStubStatics.aRenderer326!!.F(-i_33_, -i_34_)
                                        CameraRotationStubStatics.aRenderer326!!.b(i_45_, i_48_, i_43_, i_50_, d_37_)
                                        method3284(true, (ShortMatrixNodeStatics.aDouble9517 + d_37_))
                                        GlCubeMapTextureStatics.aDouble8621 = d_37_ + ShortMatrixNodeStatics.aDouble9517
                                        if (ByteBufferStatics.anInt7207 == 1) {
                                            ShaderStateVariant.anInt8799 = (i_17_ + -ModelVertexColorBufferStatics.anInt6568 - i_34_)
                                            FireParticleStreamStatics.anInt95 = i_21_
                                            ConfigValueProviderStatics.anInt4910 = -ShaderObjectStatics.anInt4100 + (i_16_ - i_33_)
                                            TexGenMaterialPassStatics.anInt6255 = i_20_
                                            CameraRotationStubStatics.aRenderer326!!.DA(ConfigValueProviderStatics.anInt4910, (ShaderStateVariant.anInt8799), TexGenMaterialPassStatics.anInt6255, (FireParticleStreamStatics.anInt95))
                                        } else {
                                            TexGenMaterialPassStatics.anInt6255 = i_20_
                                            ShaderStateVariant.anInt8799 = (-ModelVertexColorBufferStatics.anInt6568 + i_17_ - (-(HardKeyedCacheEntryReferenceStatics.anInt10444) - -i_34_))
                                            ConfigValueProviderStatics.anInt4910 = (-ShaderObjectStatics.anInt4100 + i_16_ + (SoundEnvelopeStatics.anInt2747 + -i_33_))
                                            FireParticleStreamStatics.anInt95 = i_21_
                                            CameraRotationStubStatics.aRenderer326!!.DA(ConfigValueProviderStatics.anInt4910, (ShaderStateVariant.anInt8799), TexGenMaterialPassStatics.anInt6255, (FireParticleStreamStatics.anInt95))
                                        }
                                        method1274(HardCacheEntryReferenceStatics.aSceneObjectSpawner_10436)
                                        if (i_51_ > 0) {
                                            CameraRotationStubStatics.aRenderer326!!.KA(0, i_49_, (SynthVoiceGroupStatics.anInt8854), i_51_ + i_49_)
                                            CameraRotationStubStatics.aRenderer326!!.ya()
                                            CameraRotationStubStatics.aRenderer326!!.GA(IsaacCipherStatics.anInt1290)
                                            method1960(i_12_, i_4_, i_6_, i_5_, is_0_, is_3_, is_8_, is_9_, is_11_, `is`, i_2_, i_10_, i_7_, i_1_, bool, bool_13_, i_14_, 1, false)
                                        }
                                        if (i_46_ > 0) {
                                            CameraRotationStubStatics.aRenderer326!!.KA(i_44_, i_53_, i_44_ - -i_46_, i_53_ + i_52_)
                                            CameraRotationStubStatics.aRenderer326!!.ya()
                                            CameraRotationStubStatics.aRenderer326!!.GA(IsaacCipherStatics.anInt1290)
                                            method1960(i_12_, i_4_, i_6_, i_5_, is_0_, is_3_, is_8_, is_9_, is_11_, `is`, i_2_, i_10_, i_7_, i_1_, bool, bool_13_, i_14_, 1, false)
                                        }
                                        CameraRotationStubStatics.aRenderer326!!.la()
                                        ParticleEffectCacheStatics.method2046()
                                        if (ByteBufferStatics.anInt7207 == 0) CameraRotationStubStatics.aRenderer326!!.method3672()
                                        ModelVertexColorBufferStatics.anInt6568 += i_34_
                                        ShaderObjectStatics.anInt4100 += i_33_
                                        ShortMatrixNodeStatics.aDouble9517 += d_37_
                                        PerlinNoiseTextureNodeStatics.anInt9157 = (-ModelVertexColorBufferStatics.anInt6568 + i_26_ + HardKeyedCacheEntryReferenceStatics.anInt10444)
                                        MapRegionLoaderThreadStatics.anInt4211 = (-ShaderObjectStatics.anInt4100 + SoundEnvelopeStatics.anInt2747 + i_25_)
                                        if (ByteBufferStatics.anInt7207 == 1) {
                                            SceneryDetailOptionStateStatics.anInt6095 += i_35_
                                            MaterialPassStatics.anInt3682 += i_36_
                                            for (i_65_ in 0..<BackgroundWorkerThreadStatics.anInt3225) {
                                                val i_66_ = ((ModelTransformParamsStatics.method3452(i_65_ - -MaterialPassStatics.anInt3682, (-15).toByte(), BackgroundWorkerThreadStatics.anInt3225)) * ItemModelDefinitionStatics.anInt425)
                                                var i_67_ = 0
                                                while ((ItemModelDefinitionStatics.anInt425 > i_67_)) {
                                                    val i_68_ = ((ModelTransformParamsStatics.method3452(i_67_ + (SceneryDetailOptionStateStatics.anInt6095), (-15).toByte(), ItemModelDefinitionStatics.anInt425)) + i_66_)
                                                    val bool_69_ = (((i_38_ <= i_65_) && i_39_ + i_38_ > i_65_) || (i_65_ >= i_41_ && (i_65_ < i_41_ - -i_47_) && i_67_ >= i_40_ && (i_40_ - -i_42_ > i_67_)))
                                                    NpcSpawnDecoder.anSpriteDrawTargetArray1525!![i_68_]!!.method15(DirectionPathStatics.anInt1067 * i_67_, i_65_ * ByteStoreStatics.anInt4267, DirectionPathStatics.anInt1067, ByteStoreStatics.anInt4267, 0, 0, bool_69_, true)
                                                    i_67_++
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    MapRegionLoaderThreadStatics.anInt4211 = i_27_
                                    PerlinNoiseTextureNodeStatics.anInt9157 = i_28_
                                    if (ByteBufferStatics.anInt7207 == 2) ShortMatrixNodeStatics.aDouble9517 = -d
                                }
                            }
                            if (PcmStreamBufferStatics.aBoolean8870) {
                                CameraSplineNodeStatics.anInt6849 = i_5_
                                ConfigIdPairStatics.anInt403 = i_6_
                                PerlinNoiseTextureNodeStatics.anInt9157 = HardKeyedCacheEntryReferenceStatics.anInt10444
                                ShaderObjectStatics.anInt4100 = 0
                                MapRegionLoaderThreadStatics.anInt4211 = SoundEnvelopeStatics.anInt2747
                                AnimatedModelRendererStatics.anInt8422 = i_4_
                                ModelVertexColorBufferStatics.anInt6568 = 0
                                ShortMatrixNodeStatics.aDouble9517 = 0.0
                                if (ByteBufferStatics.anInt7207 == 0) CameraRotationStubStatics.aRenderer326!!.method3687(WidgetDefinitionStatics.anSpriteDrawTarget_252)
                                CameraRotationStubStatics.aRenderer326!!.la()
                                CameraRotationStubStatics.aRenderer326!!.ya()
                                CameraRotationStubStatics.aRenderer326!!.GA(IsaacCipherStatics.anInt1290)
                                NpcConfigStatics.aAbstractCameraTransform_905!!.method903(AnimatedModelRendererStatics.anInt8422, ConfigIdPairStatics.anInt403, CameraSplineNodeStatics.anInt6849, WorldMapAreaLabelStatics.anInt8583, LocalizedTextTripleStatics.anInt3760, ProjectileConfigUtil.anInt396)
                                CameraRotationStubStatics.aRenderer326!!.method3638(NpcConfigStatics.aAbstractCameraTransform_905)
                                if (ByteBufferStatics.anInt7207 == 1) {
                                    ShaderStateVariant.anInt8799 = i_17_
                                    ConfigValueProviderStatics.anInt4910 = i_16_
                                    FireParticleStreamStatics.anInt95 = i_21_
                                    TexGenMaterialPassStatics.anInt6255 = i_20_
                                    CameraRotationStubStatics.aRenderer326!!.DA(ConfigValueProviderStatics.anInt4910, ShaderStateVariant.anInt8799, TexGenMaterialPassStatics.anInt6255, FireParticleStreamStatics.anInt95)
                                } else {
                                    ConfigValueProviderStatics.anInt4910 = i_16_ - -SoundEnvelopeStatics.anInt2747
                                    ShaderStateVariant.anInt8799 = HardKeyedCacheEntryReferenceStatics.anInt10444 + i_17_
                                    TexGenMaterialPassStatics.anInt6255 = i_20_
                                    FireParticleStreamStatics.anInt95 = i_21_
                                    CameraRotationStubStatics.aRenderer326!!.DA(ConfigValueProviderStatics.anInt4910, ShaderStateVariant.anInt8799, TexGenMaterialPassStatics.anInt6255, FireParticleStreamStatics.anInt95)
                                }
                                GlCubeMapTextureStatics.aDouble8621 = 0.0
                                HardCacheEntryReferenceStatics.aSceneObjectSpawner_10436!!.method775(69.toByte())
                                method1274(HardCacheEntryReferenceStatics.aSceneObjectSpawner_10436)
                                method1960(i_12_, i_4_, i_6_, i_5_, is_0_, is_3_, is_8_, is_9_, is_11_, `is`, i_2_, i_10_, i_7_, i_1_, bool, bool_13_, i_14_, 1, false)
                                ParticleEffectCacheStatics.method2046()
                                PcmStreamBufferStatics.aBoolean8870 = false
                                if (ByteBufferStatics.anInt7207 == 0) CameraRotationStubStatics.aRenderer326!!.method3672()
                                if (ByteBufferStatics.anInt7207 == 1) method1469(-117)
                            }
                            if (ByteBufferStatics.anInt7207 == 0) WidgetDefinitionStatics.anSpriteDrawTarget_252!!.method14(MapRegionLoaderThreadStatics.anInt4211, PerlinNoiseTextureNodeStatics.anInt9157, GrayscaleNoiseTextureStatics.anInt5283, LinkedNodeListIteratorStatics.anInt1651, 0, 0, true, true)
                            GroundDecorSceneEntityStatics.anInt9997++
                            method3284(true, ShortMatrixNodeStatics.aDouble9517)
                            ModelWallEntityStatics.aDouble10120 = ShortMatrixNodeStatics.aDouble9517
                            if (ByteBufferStatics.anInt7207 == 0 || ByteBufferStatics.anInt7207 == 2) {
                                if (ByteBufferStatics.anInt7207 == 2) {
                                    CameraRotationStubStatics.aRenderer326!!.GA(IsaacCipherStatics.anInt1290)
                                    CameraRotationStubStatics.aRenderer326!!.ya()
                                }
                                TextureHandleStatics.anInt2590 = i_20_
                                ModelFacePriorityNodeStatics.anInt1879 = i_21_
                                AnimationFrameState.anInt1537 = (-MapRegionLoaderThreadStatics.anInt4211 + -ShaderObjectStatics.anInt4100 + (i_16_ + SoundEnvelopeStatics.anInt2747))
                                SceneTextLabelStatics.anInt6417 = (-PerlinNoiseTextureNodeStatics.anInt9157 + (i_17_ + HardKeyedCacheEntryReferenceStatics.anInt10444 + -ModelVertexColorBufferStatics.anInt6568))
                                CameraRotationStubStatics.aRenderer326!!.DA(AnimationFrameState.anInt1537, SceneTextLabelStatics.anInt6417, TextureHandleStatics.anInt2590, ModelFacePriorityNodeStatics.anInt1879)
                            } else if (ByteBufferStatics.anInt7207 == 1) {
                                TextureHandleStatics.anInt2590 = i_20_
                                AnimationFrameState.anInt1537 = i_16_ + -ShaderObjectStatics.anInt4100
                                SceneTextLabelStatics.anInt6417 = -ModelVertexColorBufferStatics.anInt6568 + i_17_
                                ModelFacePriorityNodeStatics.anInt1879 = i_21_
                                CameraRotationStubStatics.aRenderer326!!.DA(AnimationFrameState.anInt1537, SceneTextLabelStatics.anInt6417, TextureHandleStatics.anInt2590, ModelFacePriorityNodeStatics.anInt1879)
                                CameraRotationStubStatics.aRenderer326!!.KA(MapRegionLoaderThreadStatics.anInt4211, PerlinNoiseTextureNodeStatics.anInt9157, (MapRegionLoaderThreadStatics.anInt4211 - -GrayscaleNoiseTextureStatics.anInt5283), (LinkedNodeListIteratorStatics.anInt1651 + PerlinNoiseTextureNodeStatics.anInt9157))
                            }
                            method1960(i_12_, i_4_, i_6_, i_5_, is_0_, is_3_, is_8_, is_9_, is_11_, `is`, i_2_, i_10_, i_7_, i_1_, bool, bool_13_, i_14_, if (ByteBufferStatics.anInt7207 != 2) 2 else 0, ByteBufferStatics.anInt7207 == 1)
                            CameraRotationStubStatics.aRenderer326!!.la()
                            CameraRotationStubStatics.aRenderer326!!.DA(i_16_, i_17_, i_18_, i_19_)
                            if (i == -2) break
                            anInt2986 = -82
                        }
                    } catch (runtimeexception: RuntimeException) {
                        throw SoundBankPatchStatics.method2929(
                            runtimeexception,
                            ("sj.D(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (is_0_ != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ',' + (if (is_3_ != null) "{...}" else "null") + ',' + i_4_ + ',' + i_5_ + ',' + bool + ',' + i_6_ + ',' + i_7_ + ',' + (if (is_8_ != null) "{...}" else "null") + ',' + (if (is_9_ != null) "{...}" else "null") + ',' + i_10_ + ',' + (if (is_11_ != null) "{...}" else "null") + ',' + i_12_ + ',' + bool_13_ + ',' + i_14_ + ')')
                        )
                    }
                    break
                } while (false)
            }
    
            @JvmStatic
            fun method1635(i: Int, class318_sub1_sub3_sub3: ProjectedGroundDecor?) {
                try {
                    anInt2983++
                    do {
                        if ((class318_sub1_sub3_sub3!!.anInt10268) != -1) {
                            var class17 = (ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(class318_sub1_sub3_sub3.anInt10268, 7))
                            if (class17 == null || class17.anIntArray237 == null) {
                                class318_sub1_sub3_sub3.aBoolean10213 = false
                                class318_sub1_sub3_sub3.anInt10268 = -1
                            } else {
                                class318_sub1_sub3_sub3.anInt10203++
                                if ((class318_sub1_sub3_sub3.anInt10245 < class17.anIntArray237.size) && ((class17.anIntArray267!![class318_sub1_sub3_sub3.anInt10245]) < class318_sub1_sub3_sub3.anInt10203)) {
                                    class318_sub1_sub3_sub3.anInt10312++
                                    class318_sub1_sub3_sub3.anInt10245++
                                    class318_sub1_sub3_sub3.anInt10203 = 1
                                    if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTableStatics.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10245), class17, -58)
                                }
                                if (class318_sub1_sub3_sub3.anInt10245 >= class17.anIntArray237.size) {
                                    class318_sub1_sub3_sub3.anInt10245 = 0
                                    class318_sub1_sub3_sub3.anInt10203 = 0
                                    if (class318_sub1_sub3_sub3.aBoolean10213) {
                                        class318_sub1_sub3_sub3.anInt10268 = class318_sub1_sub3_sub3.method2422(72.toByte()).method1621((-16).toByte())
                                        if (class318_sub1_sub3_sub3.anInt10268 == -1) {
                                            class318_sub1_sub3_sub3.aBoolean10213 = false
                                            break
                                        }
                                        class17 = (ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(class318_sub1_sub3_sub3.anInt10268, 7))
                                    }
                                    if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTableStatics.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10245), class17, -23)
                                }
                                class318_sub1_sub3_sub3.anInt10312 = class318_sub1_sub3_sub3.anInt10245 + 1
                                if (class17.anIntArray237 == null) {
                                    class318_sub1_sub3_sub3.anInt10268 = -1
                                    class318_sub1_sub3_sub3.aBoolean10213 = false
                                } else if (class318_sub1_sub3_sub3.anInt10312 >= class17.anIntArray237.size) class318_sub1_sub3_sub3.anInt10312 = 0
                            }
                        }
                    } while (false)
                    do {
                        if ((class318_sub1_sub3_sub3.anInt10269) != -1 && (GlGroundShaderPassStatics.anInt7396 >= (class318_sub1_sub3_sub3.anInt10225))) {
                            val class368 = (ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2543(90.toByte(), class318_sub1_sub3_sub3.anInt10269))
                            val i_70_ = class368.anInt4503
                            if (i_70_ != -1) {
                                val class17 = ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(i_70_, 7)
                                if (class368.aBoolean4487) {
                                    if (class17.anInt262 == 3) {
                                        if (class318_sub1_sub3_sub3.anInt10322 > 0 && (class318_sub1_sub3_sub3.anInt10239 <= GlGroundShaderPassStatics.anInt7396) && (GlGroundShaderPassStatics.anInt7396 > (class318_sub1_sub3_sub3.anInt10300))) {
                                            class318_sub1_sub3_sub3.anInt10269 = -1
                                            break
                                        }
                                    } else if (class17.anInt262 == 1 && class318_sub1_sub3_sub3.anInt10322 > 0 && (GlGroundShaderPassStatics.anInt7396 >= (class318_sub1_sub3_sub3.anInt10239)) && (GlGroundShaderPassStatics.anInt7396 > (class318_sub1_sub3_sub3.anInt10300))) {
                                        class318_sub1_sub3_sub3.anInt10225 = 1 + GlGroundShaderPassStatics.anInt7396
                                        break
                                    }
                                }
                                if (class17 != null && class17.anIntArray237 != null) {
                                    if (class318_sub1_sub3_sub3.anInt10240 < 0) {
                                        class318_sub1_sub3_sub3.anInt10240 = 0
                                        if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTableStatics.method2178(class318_sub1_sub3_sub3, 0, class17, -89)
                                    }
                                    class318_sub1_sub3_sub3.anInt10243++
                                    if ((class17.anIntArray237.size > class318_sub1_sub3_sub3.anInt10240) && ((class17.anIntArray267!![class318_sub1_sub3_sub3.anInt10240]) < class318_sub1_sub3_sub3.anInt10243)) {
                                        class318_sub1_sub3_sub3.anInt10240++
                                        class318_sub1_sub3_sub3.anInt10243 = 1
                                        if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTableStatics.method2178(class318_sub1_sub3_sub3, class318_sub1_sub3_sub3.anInt10240, class17, -17)
                                    }
                                    if (class318_sub1_sub3_sub3.anInt10240 >= class17.anIntArray237.size) {
                                        if (class368.aBoolean4487) {
                                            class318_sub1_sub3_sub3.anInt10305++
                                            class318_sub1_sub3_sub3.anInt10240 -= class17.anInt238
                                            if (class17.anInt244 <= (class318_sub1_sub3_sub3.anInt10305)) class318_sub1_sub3_sub3.anInt10269 = -1
                                            else if ((class318_sub1_sub3_sub3.anInt10240) >= 0 && ((class17.anIntArray237).size > (class318_sub1_sub3_sub3.anInt10240))) {
                                                if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTableStatics.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10240), class17, -70)
                                            } else class318_sub1_sub3_sub3.anInt10269 = -1
                                        } else class318_sub1_sub3_sub3.anInt10269 = -1
                                    }
                                    class318_sub1_sub3_sub3.anInt10283 = class318_sub1_sub3_sub3.anInt10240 - -1
                                    if (class318_sub1_sub3_sub3.anInt10283 >= class17.anIntArray237.size) {
                                        if (class368.aBoolean4487) {
                                            class318_sub1_sub3_sub3.anInt10283 -= class17.anInt238
                                            if ((class318_sub1_sub3_sub3.anInt10305 - -1) >= class17.anInt244) class318_sub1_sub3_sub3.anInt10283 = -1
                                            else if ((class318_sub1_sub3_sub3.anInt10283) < 0 || ((class17.anIntArray237).size <= (class318_sub1_sub3_sub3.anInt10283))) class318_sub1_sub3_sub3.anInt10283 = -1
                                        } else class318_sub1_sub3_sub3.anInt10283 = -1
                                    }
                                } else class318_sub1_sub3_sub3.anInt10269 = -1
                            } else class318_sub1_sub3_sub3.anInt10269 = -1
                        }
                    } while (false)
                    do {
                        if ((class318_sub1_sub3_sub3.anInt10291) != -1 && (class318_sub1_sub3_sub3.anInt10211 <= GlGroundShaderPassStatics.anInt7396)) {
                            val class368 = (ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2543(93.toByte(), class318_sub1_sub3_sub3.anInt10291))
                            val i_71_ = class368.anInt4503
                            if (i_71_ != -1) {
                                val class17 = ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(i_71_, 7)
                                if (class368.aBoolean4487) {
                                    if (class17.anInt262 != 3) {
                                        if (class17.anInt262 == 1 && class318_sub1_sub3_sub3.anInt10322 > 0 && (GlGroundShaderPassStatics.anInt7396 >= (class318_sub1_sub3_sub3.anInt10239)) && (class318_sub1_sub3_sub3.anInt10300 < GlGroundShaderPassStatics.anInt7396)) {
                                            class318_sub1_sub3_sub3.anInt10211 = GlGroundShaderPassStatics.anInt7396 - -1
                                            break
                                        }
                                    } else if (class318_sub1_sub3_sub3.anInt10322 > 0 && ((class318_sub1_sub3_sub3.anInt10239) <= GlGroundShaderPassStatics.anInt7396) && ((class318_sub1_sub3_sub3.anInt10300) < GlGroundShaderPassStatics.anInt7396)) {
                                        class318_sub1_sub3_sub3.anInt10291 = -1
                                        break
                                    }
                                }
                                if (class17 == null || class17.anIntArray237 == null) class318_sub1_sub3_sub3.anInt10291 = -1
                                else {
                                    if (class318_sub1_sub3_sub3.anInt10224 < 0) {
                                        class318_sub1_sub3_sub3.anInt10224 = 0
                                        if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTableStatics.method2178(class318_sub1_sub3_sub3, 0, class17, -70)
                                    }
                                    class318_sub1_sub3_sub3.anInt10273++
                                    if ((class17.anIntArray237.size > class318_sub1_sub3_sub3.anInt10224) && ((class17.anIntArray267!![class318_sub1_sub3_sub3.anInt10224]) < class318_sub1_sub3_sub3.anInt10273)) {
                                        class318_sub1_sub3_sub3.anInt10224++
                                        class318_sub1_sub3_sub3.anInt10273 = 1
                                        if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTableStatics.method2178(class318_sub1_sub3_sub3, class318_sub1_sub3_sub3.anInt10224, class17, -114)
                                    }
                                    if (class17.anIntArray237.size <= class318_sub1_sub3_sub3.anInt10224) {
                                        if (class368.aBoolean4487) {
                                            class318_sub1_sub3_sub3.anInt10265++
                                            class318_sub1_sub3_sub3.anInt10224 -= class17.anInt238
                                            if (class17.anInt244 <= (class318_sub1_sub3_sub3.anInt10265)) class318_sub1_sub3_sub3.anInt10291 = -1
                                            else if ((class318_sub1_sub3_sub3.anInt10224) >= 0 && ((class318_sub1_sub3_sub3.anInt10224) < (class17.anIntArray237).size)) {
                                                if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTableStatics.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10224), class17, -92)
                                            } else class318_sub1_sub3_sub3.anInt10291 = -1
                                        } else class318_sub1_sub3_sub3.anInt10291 = -1
                                    }
                                    class318_sub1_sub3_sub3.anInt10276 = class318_sub1_sub3_sub3.anInt10224 - -1
                                    if (class318_sub1_sub3_sub3.anInt10276 >= class17.anIntArray237.size) {
                                        if (class368.aBoolean4487) {
                                            class318_sub1_sub3_sub3.anInt10276 -= class17.anInt238
                                            if (1 + (class318_sub1_sub3_sub3.anInt10265) < class17.anInt244) {
                                                if ((class318_sub1_sub3_sub3.anInt10276) < 0 || ((class318_sub1_sub3_sub3.anInt10276) >= (class17.anIntArray237).size)) class318_sub1_sub3_sub3.anInt10276 = -1
                                            } else class318_sub1_sub3_sub3.anInt10276 = -1
                                        } else class318_sub1_sub3_sub3.anInt10276 = -1
                                    }
                                }
                            } else class318_sub1_sub3_sub3.anInt10291 = -1
                        }
                    } while (false)
                    if ((class318_sub1_sub3_sub3.anInt10286 != -1) && (class318_sub1_sub3_sub3.anInt10218) <= 1) {
                        val class17 = (ParticleEmitterNodeStatics.aWidgetCache_191!!.method835((class318_sub1_sub3_sub3.anInt10286), 7))
                        if (class17.anInt262 != 3) {
                            if (class17.anInt262 == 1 && class318_sub1_sub3_sub3.anInt10322 > 0 && (class318_sub1_sub3_sub3.anInt10239) <= GlGroundShaderPassStatics.anInt7396 && (class318_sub1_sub3_sub3.anInt10300) < GlGroundShaderPassStatics.anInt7396) class318_sub1_sub3_sub3.anInt10218 = 2
                        } else if ((class318_sub1_sub3_sub3.anInt10322) > 0 && (class318_sub1_sub3_sub3.anInt10239 <= GlGroundShaderPassStatics.anInt7396) && (GlGroundShaderPassStatics.anInt7396 > class318_sub1_sub3_sub3.anInt10300)) {
                            class318_sub1_sub3_sub3.anInt10286 = -1
                            class318_sub1_sub3_sub3.anIntArray10236 = null
                        }
                    }
                    if ((class318_sub1_sub3_sub3.anInt10286 != -1) && (class318_sub1_sub3_sub3.anInt10218) == 0) {
                        val class17 = (ParticleEmitterNodeStatics.aWidgetCache_191!!.method835((class318_sub1_sub3_sub3.anInt10286), 7))
                        if (class17 == null || class17.anIntArray237 == null) {
                            class318_sub1_sub3_sub3.anInt10286 = -1
                            class318_sub1_sub3_sub3.anIntArray10236 = null
                        } else {
                            class318_sub1_sub3_sub3.anInt10232++
                            if ((class17.anIntArray237.size > (class318_sub1_sub3_sub3.anInt10267)) && (class318_sub1_sub3_sub3.anInt10232 > (class17.anIntArray267!![class318_sub1_sub3_sub3.anInt10267]))) {
                                class318_sub1_sub3_sub3.anInt10267++
                                class318_sub1_sub3_sub3.anInt10232 = 1
                                if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTableStatics.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10267), class17, -34)
                            }
                            if (class17.anIntArray237.size <= (class318_sub1_sub3_sub3.anInt10267)) {
                                class318_sub1_sub3_sub3.anInt10267 -= class17.anInt238
                                class318_sub1_sub3_sub3.anInt10294++
                                if (class17.anInt244 <= class318_sub1_sub3_sub3.anInt10294) {
                                    class318_sub1_sub3_sub3.anIntArray10236 = null
                                    class318_sub1_sub3_sub3.anInt10286 = -1
                                } else if (class318_sub1_sub3_sub3.anInt10267 < 0 || (class318_sub1_sub3_sub3.anInt10267 >= (class17.anIntArray237).size)) {
                                    class318_sub1_sub3_sub3.anIntArray10236 = null
                                    class318_sub1_sub3_sub3.anInt10286 = -1
                                } else if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTableStatics.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10267), class17, -88)
                            }
                            class318_sub1_sub3_sub3.anInt10244 = (class318_sub1_sub3_sub3.anInt10267) + 1
                            if (class17.anIntArray237.size <= (class318_sub1_sub3_sub3.anInt10244)) {
                                class318_sub1_sub3_sub3.anInt10244 -= class17.anInt238
                                if (class17.anInt244 <= 1 + class318_sub1_sub3_sub3.anInt10294) class318_sub1_sub3_sub3.anInt10244 = -1
                                else if (class318_sub1_sub3_sub3.anInt10244 < 0 || (class318_sub1_sub3_sub3.anInt10244 >= class17.anIntArray237.size)) class318_sub1_sub3_sub3.anInt10244 = -1
                            }
                        }
                    }
                    val i_72_ = -86 / ((-18 - i) / 51)
                    if (class318_sub1_sub3_sub3.anInt10218 > 0) class318_sub1_sub3_sub3.anInt10218--
                    var i_73_ = 0
                    while (((class318_sub1_sub3_sub3.aLoadProgressCountersArray10308)!!.size > i_73_)) {
                        val class182 = (class318_sub1_sub3_sub3.aLoadProgressCountersArray10308!![i_73_])
                        if (class182 != null) {
                            if (class182.anInt2448 > 0) class182.anInt2448--
                            else {
                                val class17 = ParticleEmitterNodeStatics.aWidgetCache_191!!.method835((class182.anInt2454), 7)
                                if (class17 == null || class17.anIntArray237 == null) class318_sub1_sub3_sub3.aLoadProgressCountersArray10308!![i_73_] = null
                                else {
                                    class182.anInt2456++
                                    if ((class17.anIntArray237.size > class182.anInt2451) && (class182.anInt2456 > (class17.anIntArray267!![class182.anInt2451]))) {
                                        class182.anInt2451++
                                        class182.anInt2456 = 1
                                        if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTableStatics.method2178(class318_sub1_sub3_sub3, class182.anInt2451, class17, -108)
                                    }
                                    if (class182.anInt2451 >= class17.anIntArray237.size) {
                                        class182.anInt2451 -= class17.anInt238
                                        class182.anInt2445++
                                        if (class17.anInt244 > class182.anInt2445) {
                                            if (class182.anInt2451 < 0 || ((class17.anIntArray237).size <= (class182.anInt2451))) class318_sub1_sub3_sub3.aLoadProgressCountersArray10308!![i_73_] = null
                                            else if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTableStatics.method2178(class318_sub1_sub3_sub3, class182.anInt2451, class17, -46)
                                        } else class318_sub1_sub3_sub3.aLoadProgressCountersArray10308!![i_73_] = null
                                    }
                                    class182.anInt2455 = 1 + class182.anInt2451
                                    if (class182.anInt2455 >= class17.anIntArray237.size) {
                                        class182.anInt2455 -= class17.anInt238
                                        if (class17.anInt244 > class182.anInt2445 - -1) {
                                            if (class182.anInt2455 < 0 || ((class17.anIntArray237).size <= (class182.anInt2455))) class182.anInt2455 = -1
                                        } else class182.anInt2455 = -1
                                    }
                                }
                            }
                        }
                        i_73_++
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("sj.A(" + i + ',' + (if (class318_sub1_sub3_sub3 != null) "{...}" else "null") + ')'))
                }
            }
    
            fun method1636(i: Int, i_74_: Int, i_75_: Int, i_76_: Int, i_77_: Int, i_78_: Int, i_79_: Int): CircleRasterizer? {
                anInt2988++
                val l = (i_76_.toLong() * 76724863L xor (i.toLong() * 32147369L xor (i_74_.toLong() * 986053L xor (i_75_.toLong() * 67481L xor i_77_.toLong() * 97549L xor i_79_.toLong() * 475427L))))
                var circleRasterizer = PlayerAppearanceUpdateDecoder.aLruByteCache_4543!!.method583(l, 90) as CircleRasterizer?
                if (circleRasterizer != null) return circleRasterizer
                circleRasterizer = LruByteCacheStatics.aRenderer1098!!.method3697(i_75_, i_77_, i_79_, i_74_, i, i_76_)
                if (i_78_ != -1) method1636(58, 63, -99, -89, -7, 18, 71)
                PlayerAppearanceUpdateDecoder.aLruByteCache_4543!!.method582(circleRasterizer, l, (-106).toByte())
                return circleRasterizer
            }
    
            fun method1637(i: Int, i_80_: Int, i_81_: Int): Boolean {
                anInt2984++
                if (i_80_ != 32768) return true
                return (0x8000 and i_81_) != 0
            }
}
