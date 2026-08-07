import AudioResampler.Companion.method1274
import GlTexture3D.Companion.method1960
import MinimapTileEntry.Companion.method383
import OpenGlRenderer.Companion.method3802
import Client.Companion.anInt2986
import ScrollingNoiseTexture.Companion.method560
import SocketStreamWorker.Companion.method1469
import java.io.IOException
import java.io.OutputStream
import java.util.*
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sin

/*
 * OutputStream_Sub1
 */
class FireParticleStream : OutputStream() {
    @Throws(IOException::class)
    override fun write(i: Int) {
        anInt96++
        throw IOException()
    }

    companion object {

        var anInt92: Int = 0

        var aRandom93: Random? = Random()

        var anInt94: Int = 0

        var anInt95: Int = 0

        var anInt96: Int = 0

        var aClass110_Sub1Array97: Array<MapLabelMenuEntry?>? = null

        var anInt98: Int = 0

        var anIntArray99: IntArray?

        var anIntArray100: IntArray? = intArrayOf(99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120)

        @JvmStatic
        fun method132(i: Int, bool: Boolean, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
            var i_0_ = i_0_
            var i_1_ = i_1_
            var i_2_ = i_2_
            var i_3_ = i_3_
            anInt94++
            if (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029 == null) FacingDirectionNodeStatics.aRenderer6654!!.method3675(i_0_, (-125).toByte(), i_1_, i_3_, i_2_, -16777216)
            else if (LocalPlayerState.aPlayer_1907!!.x < 0 || (LocalPlayerState.aPlayer_1907!!.x >= GlCubemapLightPass.anInt7319 * 512) || LocalPlayerState.aPlayer_1907!!.y < 0 || (512 * RangeThresholdTextureNode.anInt9109 <= LocalPlayerState.aPlayer_1907!!.y)) FacingDirectionNodeStatics.aRenderer6654!!.method3675(i_0_, (-125).toByte(), i_1_, i_3_, i_2_, -16777216)
            else {
                TextureQualityOptionState.anInt6006++
                if (LocalPlayerState.aPlayer_1907 != null && MediaStreamClient.anInt3203 == (LocalPlayerState.aPlayer_1907!!.x + -(256 * LocalPlayerState.aPlayer_1907!!.method2436(90.toByte())) - -256) shr 9 && TerrainChunkBuilder.anInt1548 == (LocalPlayerState.aPlayer_1907!!.y + 256 + -(256 * LocalPlayerState.aPlayer_1907!!.method2436(112.toByte()))) shr 9) {
                    TerrainChunkBuilder.anInt1548 = -1
                    MediaStreamClient.anInt3203 = -1
                    CubemapTextureGlSource.method2264(false)
                }
                AsyncTaskHandle.method1434(-14988)
                if (!bool) NpcEntityUpdater.method2109(512)
                GroundItemRenderState.method1014(-4)
                LoadingScreenImageNodeStatics.method3174(i_1_, i_3_, i_0_, true, (-82).toByte(), i_2_)
                i_3_ = RandomAccessFileOnDisk.anInt3047
                i_1_ = LocalizedTextTripleStatics.anInt3764
                i_2_ = GroundDecorRenderer.anInt3643
                LocalPlayerState.anInt1906 = LocalPlayerState.anInt1911
                i_0_ = WidgetComponentNode.anInt4656
                if (WeaveTextureNode.anInt9282 == 1) {
                    var i_4_ = SceneObjectSpawner.aFloat1287.toInt()
                    if (CameraDistanceOptionState.anInt6979 shr 8 > i_4_) i_4_ = CameraDistanceOptionState.anInt6979 shr 8
                    if (MinimapStateReset.aBooleanArray2374!![4] && ModelHeaderCache.anIntArray3273!![4] + 128 > i_4_) i_4_ = ModelHeaderCache.anIntArray3273!![4] + 128
                    val i_5_ = CameraDistanceOptionState.aFloat3938.toInt() + RenderableGroup.anInt5016 and 0x3fff
                    WidgetDefinition.method268(i_4_, -200 + (CollisionMapAccessor.method2064((LocalPlayerState.aPlayer_1907!!.x), CompiledScriptCache.anInt4372, 11219, (LocalPlayerState.aPlayer_1907!!.y))), i_5_, AsyncTaskHandle.anInt2578, i_2_, -19360, FrameStatsReset.anInt5799, (i_4_ shr 3) * 3 + 600 shl 2)
                } else if (WeaveTextureNode.anInt9282 == 4) {
                    var i_6_ = SceneObjectSpawner.aFloat1287.toInt()
                    if (i_6_ < CameraDistanceOptionState.anInt6979 shr 8) i_6_ = CameraDistanceOptionState.anInt6979 shr 8
                    if (MinimapStateReset.aBooleanArray2374!![4] && (i_6_ < ModelHeaderCache.anIntArray3273!![4] + 128)) i_6_ = 128 + ModelHeaderCache.anIntArray3273!![4]
                    val i_7_ = CameraDistanceOptionState.aFloat3938.toInt() and 0x3fff
                    WidgetDefinition.method268(i_6_, -200 + CollisionMapAccessor.method2064(OpenGlRenderer.anInt6633, CompiledScriptCache.anInt4372, 11219, RegionTileNode.anInt6652), i_7_, AsyncTaskHandle.anInt2578, i_2_, -19360, FrameStatsReset.anInt5799, 600 - -((i_6_ shr 3) * 3) shl 2)
                } else if (WeaveTextureNode.anInt9282 == 5) LocDefinitionCache.method2035(i_2_, 0)
                val i_8_ = GlslMaterialPass.anInt6246
                val i_9_ = ParticleSystemRenderer.anInt3855
                val i_10_ = CompositeRgbNoiseTexture.anInt8685
                val i_11_ = MinimapAreaMarkerNode.anInt9701
                val i_12_ = WorldMapElement.anInt4638
                for (i_13_ in 0..4) {
                    if (MinimapStateReset.aBooleanArray2374!![i_13_]) {
                        val i_14_ = ((Math.random() * ((CollisionMapAccessor.anIntArray3552!![i_13_] * 2) - -1).toDouble()) - CollisionMapAccessor.anIntArray3552!![i_13_].toDouble() + (sin((GroundDecorSceneEntity.anIntArray9981!![i_13_]).toDouble() * ((MapTileShape.anIntArray4196!![i_13_]).toDouble() / 100.0)) * (ModelHeaderCache.anIntArray3273!![i_13_]).toDouble())).toInt()
                        if (i_13_ == 4) {
                            MinimapAreaMarkerNode.anInt9701 += i_14_
                            if (MinimapAreaMarkerNode.anInt9701 >= 1024) {
                                if (MinimapAreaMarkerNode.anInt9701 > 3072) MinimapAreaMarkerNode.anInt9701 = 3072
                            } else MinimapAreaMarkerNode.anInt9701 = 1024
                        }
                        if (i_13_ == 0) GlslMaterialPass.anInt6246 += i_14_ shl 2
                        if (i_13_ == 3) WorldMapElement.anInt4638 = 0x3fff and i_14_ + WorldMapElement.anInt4638
                        if (i_13_ == 1) ParticleSystemRenderer.anInt3855 += i_14_ shl 2
                        if (i_13_ == 2) CompositeRgbNoiseTexture.anInt8685 += i_14_ shl 2
                    }
                }
                if (GlslMaterialPass.anInt6246 < 0) GlslMaterialPass.anInt6246 = 0
                if (-1 + (ActorEntity.anInt6451 shl 9) < GlslMaterialPass.anInt6246) GlslMaterialPass.anInt6246 = -1 + (ActorEntity.anInt6451 shl 9)
                if (CompositeRgbNoiseTexture.anInt8685 < 0) CompositeRgbNoiseTexture.anInt8685 = 0
                if (CompositeRgbNoiseTexture.anInt8685 > (ActorEntity.anInt7054 shl 9) + -1) CompositeRgbNoiseTexture.anInt8685 = (ActorEntity.anInt7054 shl 9) - 1
                CharCodeMap.method3225(114)
                Client.method3175((-107).toByte())
                FacingDirectionNodeStatics.aRenderer6654!!.KA(i_1_, i_3_, i_1_ - -i_0_, i_3_ + i_2_)
                TextureDefinitionCache.method1626(1, true)
                if (GrayscaleNoiseTexture.aBoolean5300) {
                    ProjectionCameraTransform.method941(124, LocTypeDefLoader.anInt2500)
                    if (LocalPlayerState.anInt1906 != PlayerAppearanceUpdateDecoder.anInt4545) PcmStreamBuffer.aBoolean8870 = true
                    PlayerAppearanceUpdateDecoder.anInt4545 = LocalPlayerState.anInt1906
                } else {
                    FacingDirectionNodeStatics.aRenderer6654!!.ya()
                    val i_15_ = LocTypeDefLoader.anInt2500
                    if (KeyboardLayoutCache.aParticleSystemRenderer_3304 != null) KeyboardLayoutCache.aParticleSystemRenderer_3304!!.method2293(MapSceneDefLoader.anInt2481 shl 3, FacingDirectionNodeStatics.aRenderer6654!!, (-72).toByte(), i_1_, i_0_, i_3_, WorldMapElement.anInt4638, MinimapAreaMarkerNode.anInt9701, i_15_, i_2_)
                    else FacingDirectionNodeStatics.aRenderer6654!!.GA(i_15_)
                }
                WorldMapAreaLabel.method3570(false)
                if (i >= 80) {
                    SettingsCrcWriter.aAbstractCameraTransform_2123!!.method903(GlslMaterialPass.anInt6246, ParticleSystemRenderer.anInt3855, CompositeRgbNoiseTexture.anInt8685, -MinimapAreaMarkerNode.anInt9701 and 0x3fff, -WorldMapElement.anInt4638 and 0x3fff, 0x3fff and -MapTileShape.anInt4186)
                    FacingDirectionNodeStatics.aRenderer6654!!.method3638(SettingsCrcWriter.aAbstractCameraTransform_2123)
                    FacingDirectionNodeStatics.aRenderer6654!!.DA(i_0_ / 2 + i_1_, i_3_ + i_2_ / 2, TerrainChunkBuilder.anInt1550 shl 1, TerrainChunkBuilder.anInt1550 shl 1)
                    method319(TerrainChunkBuilder.anInt1550 shl 1, TerrainChunkBuilder.anInt1550 shl 1, (-18).toByte(), i_1_ + i_0_ / 2, i_3_ + i_2_ / 2)
                    SpriteRenderEntry.method3282(0x3fff and -(MinimapAreaMarkerNode.anInt9701), CompositeRgbNoiseTexture.anInt8685, ParticleSystemRenderer.anInt3855, 0, -WorldMapElement.anInt4638 and 0x3fff, GlslMaterialPass.anInt6246, -MapTileShape.anInt4186 and 0x3fff)
                    val i_16_ = (if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub14_7264!!.method1778(-32350) != 2) 1.toByte() else TextureQualityOptionState.anInt6006.toByte())
                    if (GrayscaleNoiseTexture.aBoolean5300) {
                        CameraRotationStubStatics.method289(-15902, 0x3fff and -WorldMapElement.anInt4638, -MapTileShape.anInt4186 and 0x3fff, (-MinimapAreaMarkerNode.anInt9701 and 0x3fff))
                        method1634(
                            CharCodeMap.anIntArray1127,
                            -2,
                            RegionSceneLoader.aByteArrayArrayArray3700,
                            (LocalPlayerState.aPlayer_1907!!.y) shr 9,
                            (LocalPlayerState.aPlayer_1907!!.plane) - -1,
                            FileIoUtil.anIntArray4097,
                            GlslMaterialPass.anInt6246,
                            CompositeRgbNoiseTexture.anInt8685,
                            IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub1_7246!!.method1720(-32350) == 0,
                            ParticleSystemRenderer.anInt3855,
                            (LocalPlayerState.aPlayer_1907!!.x) shr 9,
                            LinkedListIterator.anIntArray2117,
                            BlankTextureNode.anIntArray9259,
                            i_16_,
                            ConnectionStateType.anIntArray1045,
                            GlGroundShaderPass.anInt7396,
                            true,
                            LocalPlayerState.anInt1906
                        )
                    } else GlTexture3D.method1960(
                        GlGroundShaderPass.anInt7396,
                        GlslMaterialPass.anInt6246,
                        ParticleSystemRenderer.anInt3855,
                        CompositeRgbNoiseTexture.anInt8685,
                        RegionSceneLoader.aByteArrayArrayArray3700,
                        FileIoUtil.anIntArray4097,
                        LinkedListIterator.anIntArray2117,
                        BlankTextureNode.anIntArray9259,
                        ConnectionStateType.anIntArray1045,
                        CharCodeMap.anIntArray1127,
                        (LocalPlayerState.aPlayer_1907!!.plane) - -1,
                        i_16_,
                        (LocalPlayerState.aPlayer_1907!!.x) shr 9,
                        (LocalPlayerState.aPlayer_1907!!.y) shr 9,
                        IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub1_7246!!.method1720(-32350) == 0,
                        true,
                        if (!ParticleSystemRenderer.aBoolean3870) -1 else LocalPlayerState.anInt1906,
                        0,
                        false
                    )
                    WorldMapAreaLabel.method3570(false)
                    if (WorldMapRenderer.anInt4674 == 10) {
                        WorldListEntryStatics.method283(-127, i_0_, 256, i_2_, i_1_, i_3_, 256)
                        method3802(i_3_, i_2_, 2, i_1_, i_0_, 256, 256)
                        GroundDecorSceneEntity.method2403(i_1_, 256, i_3_, i_0_, 19206, i_2_, 256)
                        ItemDefinitionLoader.method1289(i_2_, i_0_, i_3_, 8, i_1_)
                    }
                    CharCodeMap.method3223()
                    GlslMaterialPass.anInt6246 = i_8_
                    MinimapAreaMarkerNode.anInt9701 = i_11_
                    WorldMapElement.anInt4638 = i_12_
                    ParticleSystemRenderer.anInt3855 = i_9_
                    CompositeRgbNoiseTexture.anInt8685 = i_10_
                    if (SocketGameConnection.aBoolean5840 && ClientMachineInfo.aMediaStreamClient_6601!!.method1902(4) == 0) SocketGameConnection.aBoolean5840 = false
                    if (SocketGameConnection.aBoolean5840) {
                        FacingDirectionNodeStatics.aRenderer6654!!.method3675(i_0_, (-125).toByte(), i_1_, i_3_, i_2_, -16777216)
                        Tooltip.method3511(false, GameAppletFrame.aRSFont_20, ParticleEmitterFactoryStatics.aFontDefinition_3179, (LocalizedText.aLocalizedText_3495!!.method2063(ChatCommandProcessor.anInt6967, 544)), 2, FacingDirectionNodeStatics.aRenderer6654)
                    }
                    TextureDefinitionCache.method1626(1, false)
                }
            }
        }

        @JvmStatic
        fun method133(i: Byte) {
            anIntArray100 = null
            anIntArray99 = null
            aClass110_Sub1Array97 = null
            if (i.toInt() != -41) anIntArray99 = null
            aRandom93 = null
        }

        @JvmStatic
        fun method134(i: Byte) {
            if (i.toInt() != -126) method132(-95, true, 10, 28, 45, 100)
            if (CompiledScriptCache.anObject4366 == null) {
                val class59_sub1_sub1 = ScrollingNoiseTexture()
                val `is` = class59_sub1_sub1.method559(128, 128, 106.toByte(), 16)
                CompiledScriptCache.anObject4366 = Js5Archive.method1357(`is`, false, 111.toByte())
            }
            anInt92++
            if (BoxedIntHolderStatics.anObject2969 == null) {
                val class59_sub2_sub2 = CompositeRgbNoiseTexture()
                val `is` = class59_sub2_sub2.method571(128, (-38).toByte(), 16, 128)
                BoxedIntHolderStatics.anObject2969 = Js5Archive.method1357(`is`, false, 106.toByte())
            }
        }

        init {
            anIntArray99 = intArrayOf(1, -1, -1, 1)
        }


        var anInt2982: Int = 0
        fun method1634(`is`: IntArray?, i: Int, is_0_: Array<Array<ByteArray?>?>?, i_1_: Int, i_2_: Int, is_3_: IntArray?, i_4_: Int, i_5_: Int, bool: Boolean, i_6_: Int, i_7_: Int, is_8_: IntArray?, is_9_: IntArray?, i_10_: Byte, is_11_: IntArray?, i_12_: Int, bool_13_: Boolean, i_14_: Int) {
            do {
                try {
                    anInt2982++
                    if (WhirlpoolHash.anInt7207 != -1) {
                        val is_15_ = CameraRotationStubStatics.aRenderer326!!.Y()
                        val i_16_ = is_15_[0]
                        val i_17_ = is_15_[1]
                        val i_18_ = is_15_[2]
                        val i_19_ = is_15_[3]
                        var i_20_ = i_18_
                        var i_21_ = i_19_
                        if (WhirlpoolHash.anInt7207 == 1) {
                            i_20_ = (i_18_.toDouble() * WhirlpoolHash.anInt1651.toDouble() / WhirlpoolHash.anInt6008.toDouble()).toInt()
                            i_21_ = (WhirlpoolHash.anInt1651.toDouble() * i_19_.toDouble() / WhirlpoolHash.anInt6008.toDouble()).toInt()
                        }
                        if (!PcmStreamBuffer.aBoolean8870) {
                            if (WhirlpoolHash.anInt7207 == 1) method383(0)
                            val i_22_ = -AnimatedModelRenderer.anInt8422 + i_4_
                            val i_23_ = i_6_ + -ConfigIdPair.anInt403
                            val i_24_ = -CameraSplineNode.anInt6849 + i_5_
                            val i_25_ = ((VideoAdChecker.aDouble3182 * i_22_.toDouble() + i_23_.toDouble() * MapElementDefinitionCache.aDouble3980 + i_24_.toDouble() * SceneCollisionEntry.aDouble4404) * i_20_.toDouble() / i_14_.toDouble()).toInt()
                            val i_26_ = (((i_24_.toDouble() * ProceduralTextureGraph.aDouble9531) + ((i_22_.toDouble() * TheoraVideoStream.aDouble9023) + (i_23_.toDouble() * LocalizedTextTripleStatics.aDouble3761))) * i_21_.toDouble() / i_14_.toDouble()).toInt()
                            val d = (i_24_.toDouble() * PcmStreamBuffer.aDouble8869 + (MenuActionNode.aDouble6774 * i_23_.toDouble() + i_22_.toDouble() * NoiseTextureGenerator.aDouble1083))
                            val i_27_ = i_25_ + WhirlpoolHash.anInt2747 - ShaderObjectStatics.anInt4100
                            val i_28_ = (WhirlpoolHash.anInt10444 + i_26_ + -ModelVertexColorBuffer.anInt6568)
                            val i_29_ = WhirlpoolHash.anInt5283 + i_27_
                            val i_30_ = WhirlpoolHash.anInt1651 + i_28_
                            if ((i_27_ < 0 || i_28_ < 0 || i_29_ > WhirlpoolHash.anInt8854 || (i_30_ > WhirlpoolHash.anInt6008)) && WhirlpoolHash.anInt7207 != 2) {
                                if (i_29_ <= 0 || i_30_ <= 0 || (WhirlpoolHash.anInt8854 <= i_27_) || (i_28_ >= WhirlpoolHash.anInt6008)) PcmStreamBuffer.aBoolean8870 = true
                                else {
                                    val i_31_ = i_27_ - WhirlpoolHash.anInt2747
                                    val i_32_ = (i_28_ - WhirlpoolHash.anInt10444)
                                    var i_33_ = 0
                                    var i_34_ = 0
                                    var i_35_ = 0
                                    var i_36_ = 0
                                    var d_37_ = 0.0
                                    if (WhirlpoolHash.anInt7207 == 0) {
                                        d_37_ = d + ShortMatrixNode.aDouble9517
                                        i_33_ = i_31_
                                        i_34_ = i_32_
                                    } else if (WhirlpoolHash.anInt7207 == 1) {
                                        i_35_ = i_31_ / WhirlpoolHash.anInt1067
                                        i_36_ = i_32_ / WhirlpoolHash.anInt4267
                                        i_33_ = i_35_ * WhirlpoolHash.anInt1067
                                        i_34_ = i_36_ * WhirlpoolHash.anInt4267
                                        d_37_ = ((d + ShortMatrixNode.aDouble9517) * (i_32_ * i_34_ + i_33_ * i_31_).toDouble() / (i_32_ * i_32_ + i_31_ * i_31_).toDouble())
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
                                        i_43_ = (-i_33_ + WhirlpoolHash.anInt8854)
                                        if (WhirlpoolHash.anInt7207 == 1) {
                                            i_42_ = i_35_
                                            i_40_ = -i_35_ + WhirlpoolHash.anInt425
                                        }
                                        i_46_ = i_33_
                                        i_44_ = i_43_
                                    } else {
                                        i_43_ = (WhirlpoolHash.anInt8854 + i_33_)
                                        i_44_ = 0
                                        i_45_ = -i_33_
                                        i_46_ = i_45_
                                        if (WhirlpoolHash.anInt7207 == 1) {
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
                                        i_50_ = WhirlpoolHash.anInt6008 + -i_34_
                                        i_48_ = 0
                                        i_49_ = i_50_
                                        i_51_ = i_34_
                                        i_53_ = 0
                                        if (WhirlpoolHash.anInt7207 == 1) {
                                            i_41_ = 0
                                            i_39_ = i_36_
                                            i_38_ = -i_36_ + WhirlpoolHash.anInt3225
                                            i_47_ = i_38_
                                        }
                                        i_52_ = i_50_
                                    } else {
                                        i_48_ = -i_34_
                                        i_49_ = 0
                                        i_50_ = WhirlpoolHash.anInt6008 + i_34_
                                        i_51_ = i_48_
                                        i_52_ = i_50_
                                        i_53_ = i_51_
                                        if (WhirlpoolHash.anInt7207 == 1) {
                                            i_39_ = -i_36_
                                            i_38_ = 0
                                            i_47_ = i_36_ + WhirlpoolHash.anInt3225
                                            i_41_ = i_39_
                                        }
                                    }
                                    val class243 = (aSceneObjectSpawner_10436!!.aDoublyLinkedNodeList_1282)
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
                                                if (i_61_ <= WhirlpoolHash.anInt8854) {
                                                    val i_62_ = (-i_60_ + (min(i_59_, i_57_)))
                                                    if (WhirlpoolHash.anInt6008 >= i_62_) {
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
                                    if (WhirlpoolHash.anInt7207 == 0) CameraRotationStubStatics.aRenderer326!!.method3687(WidgetDefinition.anSpriteDrawTarget_252)
                                    CameraRotationStubStatics.aRenderer326!!.F(-i_33_, -i_34_)
                                    CameraRotationStubStatics.aRenderer326!!.b(i_45_, i_48_, i_43_, i_50_, d_37_)
                                    RenderNodeStatics.method3284(true, (ShortMatrixNode.aDouble9517 + d_37_))
                                    GlCubeMapTexture.aDouble8621 = d_37_ + ShortMatrixNode.aDouble9517
                                    if (WhirlpoolHash.anInt7207 == 1) {
                                        ShaderStateStatics.anInt8799 = (i_17_ + -ModelVertexColorBuffer.anInt6568 - i_34_)
                                        FireParticleStream.anInt95 = i_21_
                                        ConfigValueProvider.anInt4910 = -ShaderObjectStatics.anInt4100 + (i_16_ - i_33_)
                                        TexGenMaterialPass.anInt6255 = i_20_
                                        CameraRotationStubStatics.aRenderer326!!.DA(ConfigValueProvider.anInt4910, (ShaderStateStatics.anInt8799), TexGenMaterialPass.anInt6255, (FireParticleStream.anInt95))
                                    } else {
                                        TexGenMaterialPass.anInt6255 = i_20_
                                        ShaderStateStatics.anInt8799 = (-ModelVertexColorBuffer.anInt6568 + i_17_ - (-(WhirlpoolHash.anInt10444) - -i_34_))
                                        ConfigValueProvider.anInt4910 = (-ShaderObjectStatics.anInt4100 + i_16_ + (WhirlpoolHash.anInt2747 + -i_33_))
                                        FireParticleStream.anInt95 = i_21_
                                        CameraRotationStubStatics.aRenderer326!!.DA(ConfigValueProvider.anInt4910, (ShaderStateStatics.anInt8799), TexGenMaterialPass.anInt6255, (FireParticleStream.anInt95))
                                    }
                                    method1274(aSceneObjectSpawner_10436)
                                    if (i_51_ > 0) {
                                        CameraRotationStubStatics.aRenderer326!!.KA(0, i_49_, (WhirlpoolHash.anInt8854), i_51_ + i_49_)
                                        CameraRotationStubStatics.aRenderer326!!.ya()
                                        CameraRotationStubStatics.aRenderer326!!.GA(IsaacCipher.anInt1290)
                                        method1960(i_12_, i_4_, i_6_, i_5_, is_0_, is_3_, is_8_, is_9_, is_11_, `is`, i_2_, i_10_, i_7_, i_1_, bool, bool_13_, i_14_, 1, false)
                                    }
                                    if (i_46_ > 0) {
                                        CameraRotationStubStatics.aRenderer326!!.KA(i_44_, i_53_, i_44_ - -i_46_, i_53_ + i_52_)
                                        CameraRotationStubStatics.aRenderer326!!.ya()
                                        CameraRotationStubStatics.aRenderer326!!.GA(IsaacCipher.anInt1290)
                                        method1960(i_12_, i_4_, i_6_, i_5_, is_0_, is_3_, is_8_, is_9_, is_11_, `is`, i_2_, i_10_, i_7_, i_1_, bool, bool_13_, i_14_, 1, false)
                                    }
                                    CameraRotationStubStatics.aRenderer326!!.la()
                                    ParticleEffectCache.method2046()
                                    if (WhirlpoolHash.anInt7207 == 0) CameraRotationStubStatics.aRenderer326!!.method3672()
                                    ModelVertexColorBuffer.anInt6568 += i_34_
                                    ShaderObjectStatics.anInt4100 += i_33_
                                    ShortMatrixNode.aDouble9517 += d_37_
                                    FireParticleStream.anInt9157 = (-ModelVertexColorBuffer.anInt6568 + i_26_ + WhirlpoolHash.anInt10444)
                                    MapRegionLoaderThread.anInt4211 = (-ShaderObjectStatics.anInt4100 + WhirlpoolHash.anInt2747 + i_25_)
                                    if (WhirlpoolHash.anInt7207 == 1) {
                                        SceneryDetailOptionState.anInt6095 += i_35_
                                        MaterialPass.anInt3682 += i_36_
                                        for (i_65_ in 0..<WhirlpoolHash.anInt3225) {
                                            val i_66_ = ((ModelDefinition.method3452(i_65_ - -MaterialPass.anInt3682, (-15).toByte(), WhirlpoolHash.anInt3225)) * WhirlpoolHash.anInt425)
                                            var i_67_ = 0
                                            while ((WhirlpoolHash.anInt425 > i_67_)) {
                                                val i_68_ = ((ModelDefinition.method3452(i_67_ + (SceneryDetailOptionState.anInt6095), (-15).toByte(), WhirlpoolHash.anInt425)) + i_66_)
                                                val bool_69_ = (((i_38_ <= i_65_) && i_39_ + i_38_ > i_65_) || (i_65_ >= i_41_ && (i_65_ < i_41_ - -i_47_) && i_67_ >= i_40_ && (i_40_ - -i_42_ > i_67_)))
                                                NpcSpawnDecoder.anSpriteDrawTargetArray1525!![i_68_]!!.method15(WhirlpoolHash.anInt1067 * i_67_, i_65_ * WhirlpoolHash.anInt4267, WhirlpoolHash.anInt1067, WhirlpoolHash.anInt4267, 0, 0, bool_69_, true)
                                                i_67_++
                                            }
                                        }
                                    }
                                }
                            } else {
                                MapRegionLoaderThread.anInt4211 = i_27_
                                FireParticleStream.anInt9157 = i_28_
                                if (WhirlpoolHash.anInt7207 == 2) ShortMatrixNode.aDouble9517 = -d
                            }
                        }
                        if (PcmStreamBuffer.aBoolean8870) {
                            CameraSplineNode.anInt6849 = i_5_
                            ConfigIdPair.anInt403 = i_6_
                            FireParticleStream.anInt9157 = WhirlpoolHash.anInt10444
                            ShaderObjectStatics.anInt4100 = 0
                            MapRegionLoaderThread.anInt4211 = WhirlpoolHash.anInt2747
                            AnimatedModelRenderer.anInt8422 = i_4_
                            ModelVertexColorBuffer.anInt6568 = 0
                            ShortMatrixNode.aDouble9517 = 0.0
                            if (WhirlpoolHash.anInt7207 == 0) CameraRotationStubStatics.aRenderer326!!.method3687(WidgetDefinition.anSpriteDrawTarget_252)
                            CameraRotationStubStatics.aRenderer326!!.la()
                            CameraRotationStubStatics.aRenderer326!!.ya()
                            CameraRotationStubStatics.aRenderer326!!.GA(IsaacCipher.anInt1290)
                            NpcConfig.aAbstractCameraTransform_905!!.method903(AnimatedModelRenderer.anInt8422, ConfigIdPair.anInt403, CameraSplineNode.anInt6849, WorldMapAreaLabel.anInt8583, LocalizedTextTripleStatics.anInt3760, ProjectileConfigUtil.anInt396)
                            CameraRotationStubStatics.aRenderer326!!.method3638(NpcConfig.aAbstractCameraTransform_905)
                            if (WhirlpoolHash.anInt7207 == 1) {
                                ShaderStateStatics.anInt8799 = i_17_
                                ConfigValueProvider.anInt4910 = i_16_
                                FireParticleStream.anInt95 = i_21_
                                TexGenMaterialPass.anInt6255 = i_20_
                                CameraRotationStubStatics.aRenderer326!!.DA(ConfigValueProvider.anInt4910, ShaderStateStatics.anInt8799, TexGenMaterialPass.anInt6255, FireParticleStream.anInt95)
                            } else {
                                ConfigValueProvider.anInt4910 = i_16_ - -WhirlpoolHash.anInt2747
                                ShaderStateStatics.anInt8799 = WhirlpoolHash.anInt10444 + i_17_
                                TexGenMaterialPass.anInt6255 = i_20_
                                FireParticleStream.anInt95 = i_21_
                                CameraRotationStubStatics.aRenderer326!!.DA(ConfigValueProvider.anInt4910, ShaderStateStatics.anInt8799, TexGenMaterialPass.anInt6255, FireParticleStream.anInt95)
                            }
                            GlCubeMapTexture.aDouble8621 = 0.0
                            aSceneObjectSpawner_10436!!.method775(69.toByte())
                            method1274(aSceneObjectSpawner_10436)
                            method1960(i_12_, i_4_, i_6_, i_5_, is_0_, is_3_, is_8_, is_9_, is_11_, `is`, i_2_, i_10_, i_7_, i_1_, bool, bool_13_, i_14_, 1, false)
                            ParticleEffectCache.method2046()
                            PcmStreamBuffer.aBoolean8870 = false
                            if (WhirlpoolHash.anInt7207 == 0) CameraRotationStubStatics.aRenderer326!!.method3672()
                            if (WhirlpoolHash.anInt7207 == 1) method1469(-117)
                        }
                        if (WhirlpoolHash.anInt7207 == 0) WidgetDefinition.anSpriteDrawTarget_252!!.method14(MapRegionLoaderThread.anInt4211, FireParticleStream.anInt9157, WhirlpoolHash.anInt5283, WhirlpoolHash.anInt1651, 0, 0, true, true)
                        GroundDecorSceneEntity.anInt9997++
                        RenderNodeStatics.method3284(true, ShortMatrixNode.aDouble9517)
                        ModelWallEntity.aDouble10120 = ShortMatrixNode.aDouble9517
                        if (WhirlpoolHash.anInt7207 == 0 || WhirlpoolHash.anInt7207 == 2) {
                            if (WhirlpoolHash.anInt7207 == 2) {
                                CameraRotationStubStatics.aRenderer326!!.GA(IsaacCipher.anInt1290)
                                CameraRotationStubStatics.aRenderer326!!.ya()
                            }
                            TextureHandle.anInt2590 = i_20_
                            anInt1879 = i_21_
                            AnimationFrameState.anInt1537 = (-MapRegionLoaderThread.anInt4211 + -ShaderObjectStatics.anInt4100 + (i_16_ + WhirlpoolHash.anInt2747))
                            SceneTextLabel.anInt6417 = (-FireParticleStream.anInt9157 + (i_17_ + WhirlpoolHash.anInt10444 + -ModelVertexColorBuffer.anInt6568))
                            CameraRotationStubStatics.aRenderer326!!.DA(AnimationFrameState.anInt1537, SceneTextLabel.anInt6417, TextureHandle.anInt2590, anInt1879)
                        } else if (WhirlpoolHash.anInt7207 == 1) {
                            TextureHandle.anInt2590 = i_20_
                            AnimationFrameState.anInt1537 = i_16_ + -ShaderObjectStatics.anInt4100
                            SceneTextLabel.anInt6417 = -ModelVertexColorBuffer.anInt6568 + i_17_
                            anInt1879 = i_21_
                            CameraRotationStubStatics.aRenderer326!!.DA(AnimationFrameState.anInt1537, SceneTextLabel.anInt6417, TextureHandle.anInt2590, anInt1879)
                            CameraRotationStubStatics.aRenderer326!!.KA(MapRegionLoaderThread.anInt4211, FireParticleStream.anInt9157, (MapRegionLoaderThread.anInt4211 - -WhirlpoolHash.anInt5283), (WhirlpoolHash.anInt1651 + FireParticleStream.anInt9157))
                        }
                        method1960(i_12_, i_4_, i_6_, i_5_, is_0_, is_3_, is_8_, is_9_, is_11_, `is`, i_2_, i_10_, i_7_, i_1_, bool, bool_13_, i_14_, if (WhirlpoolHash.anInt7207 != 2) 2 else 0, WhirlpoolHash.anInt7207 == 1)
                        CameraRotationStubStatics.aRenderer326!!.la()
                        CameraRotationStubStatics.aRenderer326!!.DA(i_16_, i_17_, i_18_, i_19_)
                        if (i == -2) break
                        anInt2986 = -82
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw TextureLoadException.method2929(
                        runtimeexception,
                        ("sj.D(" + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (is_0_ != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ',' + (if (is_3_ != null) "{...}" else "null") + ',' + i_4_ + ',' + i_5_ + ',' + bool + ',' + i_6_ + ',' + i_7_ + ',' + (if (is_8_ != null) "{...}" else "null") + ',' + (if (is_9_ != null) "{...}" else "null") + ',' + i_10_ + ',' + (if (is_11_ != null) "{...}" else "null") + ',' + i_12_ + ',' + bool_13_ + ',' + i_14_ + ')')
                    )
                }
                break
            } while (false)
        }
        var aSceneObjectSpawner_10436: SceneObjectSpawner? = SceneObjectSpawner(true)
        var anInt1879: Int = 0

        var anInt414: Int = 0
        fun method319(i: Int, i_0_: Int, i_1_: Byte, i_2_: Int, i_3_: Int) {
            anInt414++
            HslPaletteState.anInt4171 = i_2_
            ParticleSystemRenderer.anInt3861 = i_0_
            GlFramebufferBlitter.anInt282 = i
            CircleDrawer.anInt2688 = i_3_
        }
        var anInt9157: Int = 0
    }
}
