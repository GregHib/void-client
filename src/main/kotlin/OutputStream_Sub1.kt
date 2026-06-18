import OpenGlRenderer.Companion.method3802
import java.io.IOException
import java.io.OutputStream
import java.util.*
import kotlin.math.sin

class OutputStream_Sub1 : OutputStream() {
    @Throws(IOException::class)
    override fun write(i: Int) {
        anInt96++
        throw IOException()
    }

    companion object {
        @JvmField
        var anInt92: Int = 0
        @JvmField
        var aRandom93: Random? = Random()
        @JvmField
        var anInt94: Int = 0
        @JvmField
        var anInt95: Int = 0
        @JvmField
        var anInt96: Int = 0
        @JvmField
        var aClass110_Sub1Array97: Array<MapLabelMenuEntry?>? = null
        @JvmField
        var anInt98: Int = 0
        @JvmField
        var anIntArray99: IntArray?
        @JvmField
        var anIntArray100: IntArray? = intArrayOf(99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120)

        @JvmStatic
        fun method132(i: Int, bool: Boolean, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
            var i_0_ = i_0_
            var i_1_ = i_1_
            var i_2_ = i_2_
            var i_3_ = i_3_
            anInt94++
            if (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029 == null) FacingDirectionNode.aRenderer6654!!.method3675(i_0_, (-125).toByte(), i_1_, i_3_, i_2_, -16777216)
            else if (LocalPlayerState.aPlayer_1907!!.x < 0 || (LocalPlayerState.aPlayer_1907!!.x >= Class367_Sub4.anInt7319 * 512) || LocalPlayerState.aPlayer_1907!!.y < 0 || (512 * RangeThresholdTextureNode.anInt9109 <= LocalPlayerState.aPlayer_1907!!.y)) FacingDirectionNode.aRenderer6654!!.method3675(i_0_, (-125).toByte(), i_1_, i_3_, i_2_, -16777216)
            else {
                TextureQualityOptionState.anInt6006++
                if (LocalPlayerState.aPlayer_1907 != null && MediaStreamClient.anInt3203 == (LocalPlayerState.aPlayer_1907!!.x + -(256 * LocalPlayerState.aPlayer_1907!!.method2436(90.toByte())) - -256) shr 9 && Class97.anInt1548 == (LocalPlayerState.aPlayer_1907!!.y + 256 + -(256 * LocalPlayerState.aPlayer_1907!!.method2436(112.toByte()))) shr 9) {
                    Class97.anInt1548 = -1
                    MediaStreamClient.anInt3203 = -1
                    CubemapTextureGlSource.method2264(false)
                }
                AsyncTaskHandle.method1434(-14988)
                if (!bool) NpcEntityUpdater.method2109(512)
                GroundItemRenderState.method1014(-4)
                LoadingScreenImageNode.method3174(i_1_, i_3_, i_0_, true, (-82).toByte(), i_2_)
                i_3_ = RandomAccessFileOnDisk.anInt3047
                i_1_ = LocalizedTextTriple.anInt3764
                i_2_ = GroundDecorRenderer.anInt3643
                LocalPlayerState.anInt1906 = LocalPlayerState.anInt1911
                i_0_ = WidgetComponentNode.anInt4656
                if (WeaveTextureNode.anInt9282 == 1) {
                    var i_4_ = Class76.aFloat1287.toInt()
                    if (IntKeyNode.anInt6979 shr 8 > i_4_) i_4_ = IntKeyNode.anInt6979 shr 8
                    if (SpotAnimDefinition.aBooleanArray2374!![4] && ModelHeaderCache.anIntArray3273!![4] + 128 > i_4_) i_4_ = ModelHeaderCache.anIntArray3273!![4] + 128
                    val i_5_ = ResourceProvider.aFloat3938.toInt() + RenderableGroup.anInt5016 and 0x3fff
                    WidgetDefinition.method268(i_4_, -200 + (CollisionMapAccessor.method2064((LocalPlayerState.aPlayer_1907!!.x), CompiledScriptCache.anInt4372, 11219, (LocalPlayerState.aPlayer_1907!!.y))), i_5_, AsyncTaskHandle.anInt2578, i_2_, -19360, FrameStatsReset.anInt5799, (i_4_ shr 3) * 3 + 600 shl 2)
                } else if (WeaveTextureNode.anInt9282 == 4) {
                    var i_6_ = Class76.aFloat1287.toInt()
                    if (i_6_ < IntKeyNode.anInt6979 shr 8) i_6_ = IntKeyNode.anInt6979 shr 8
                    if (SpotAnimDefinition.aBooleanArray2374!![4] && (i_6_ < ModelHeaderCache.anIntArray3273!![4] + 128)) i_6_ = 128 + ModelHeaderCache.anIntArray3273!![4]
                    val i_7_ = ResourceProvider.aFloat3938.toInt() and 0x3fff
                    WidgetDefinition.method268(i_6_, -200 + CollisionMapAccessor.method2064(HslColorTableNode.anInt6633, CompiledScriptCache.anInt4372, 11219, RegionTileNode.anInt6652), i_7_, AsyncTaskHandle.anInt2578, i_2_, -19360, FrameStatsReset.anInt5799, 600 - -((i_6_ shr 3) * 3) shl 2)
                } else if (WeaveTextureNode.anInt9282 == 5) LocDefinitionCache.method2035(i_2_, 0)
                val i_8_ = GlslMaterialPass.anInt6246
                val i_9_ = ParticleSystemRenderer.anInt3855
                val i_10_ = Class59_Sub2_Sub2.anInt8685
                val i_11_ = MinimapAreaMarkerNode.anInt9701
                val i_12_ = Class5.anInt4638
                for (i_13_ in 0..4) {
                    if (SpotAnimDefinition.aBooleanArray2374!![i_13_]) {
                        val i_14_ = ((Math.random() * ((CollisionMapAccessor.anIntArray3552!![i_13_] * 2) - -1).toDouble()) - CollisionMapAccessor.anIntArray3552!![i_13_].toDouble() + (sin((GroundDecorSceneEntity.anIntArray9981!![i_13_]).toDouble() * ((MapTileShape.anIntArray4196!![i_13_]).toDouble() / 100.0)) * (ModelHeaderCache.anIntArray3273!![i_13_]).toDouble())).toInt()
                        if (i_13_ == 4) {
                            MinimapAreaMarkerNode.anInt9701 += i_14_
                            if (MinimapAreaMarkerNode.anInt9701 >= 1024) {
                                if (MinimapAreaMarkerNode.anInt9701 > 3072) MinimapAreaMarkerNode.anInt9701 = 3072
                            } else MinimapAreaMarkerNode.anInt9701 = 1024
                        }
                        if (i_13_ == 0) GlslMaterialPass.anInt6246 += i_14_ shl 2
                        if (i_13_ == 3) Class5.anInt4638 = 0x3fff and i_14_ + Class5.anInt4638
                        if (i_13_ == 1) ParticleSystemRenderer.anInt3855 += i_14_ shl 2
                        if (i_13_ == 2) Class59_Sub2_Sub2.anInt8685 += i_14_ shl 2
                    }
                }
                if (GlslMaterialPass.anInt6246 < 0) GlslMaterialPass.anInt6246 = 0
                if (-1 + (SpotAnimEntity.anInt6451 shl 9) < GlslMaterialPass.anInt6246) GlslMaterialPass.anInt6246 = -1 + (SpotAnimEntity.anInt6451 shl 9)
                if (Class59_Sub2_Sub2.anInt8685 < 0) Class59_Sub2_Sub2.anInt8685 = 0
                if (Class59_Sub2_Sub2.anInt8685 > (RegionSceneShifter.anInt7054 shl 9) + -1) Class59_Sub2_Sub2.anInt8685 = (RegionSceneShifter.anInt7054 shl 9) - 1
                CharCodeMap.method3225(114)
                LoadingScreenImageNode.method3175((-107).toByte())
                FacingDirectionNode.aRenderer6654!!.KA(i_1_, i_3_, i_1_ - -i_0_, i_3_ + i_2_)
                TextureDefinitionCache.method1626(1, true)
                if (Class59_Sub1.aBoolean5300) {
                    ProjectionCameraTransform.method941(124, LocTypeDefLoader.anInt2500)
                    if (LocalPlayerState.anInt1906 != Class375.anInt4545) PcmStreamBuffer.aBoolean8870 = true
                    Class375.anInt4545 = LocalPlayerState.anInt1906
                } else {
                    FacingDirectionNode.aRenderer6654!!.ya()
                    val i_15_ = LocTypeDefLoader.anInt2500
                    if (KeyboardLayoutCache.aParticleSystemRenderer_3304 != null) KeyboardLayoutCache.aParticleSystemRenderer_3304!!.method2293(MapSceneDefLoader.anInt2481 shl 3, FacingDirectionNode.aRenderer6654!!, (-72).toByte(), i_1_, i_0_, i_3_, Class5.anInt4638, MinimapAreaMarkerNode.anInt9701, i_15_, i_2_)
                    else FacingDirectionNode.aRenderer6654!!.GA(i_15_)
                }
                Class369_Sub1.method3570(false)
                if (i >= 80) {
                    SettingsCrcWriter.aAbstractCameraTransform_2123!!.method903(GlslMaterialPass.anInt6246, ParticleSystemRenderer.anInt3855, Class59_Sub2_Sub2.anInt8685, -MinimapAreaMarkerNode.anInt9701 and 0x3fff, -Class5.anInt4638 and 0x3fff, 0x3fff and -MapTileShape.anInt4186)
                    FacingDirectionNode.aRenderer6654!!.method3638(SettingsCrcWriter.aAbstractCameraTransform_2123)
                    FacingDirectionNode.aRenderer6654!!.DA(i_0_ / 2 + i_1_, i_3_ + i_2_ / 2, Class97.anInt1550 shl 1, Class97.anInt1550 shl 1)
                    CircleHitbox.method319(Class97.anInt1550 shl 1, Class97.anInt1550 shl 1, (-18).toByte(), i_1_ + i_0_ / 2, i_3_ + i_2_ / 2)
                    SpriteRenderEntry.method3282(0x3fff and -(MinimapAreaMarkerNode.anInt9701), Class59_Sub2_Sub2.anInt8685, ParticleSystemRenderer.anInt3855, 0, -Class5.anInt4638 and 0x3fff, GlslMaterialPass.anInt6246, -MapTileShape.anInt4186 and 0x3fff)
                    val i_16_ = (if (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub14_7264!!.method1778(-32350) != 2) 1.toByte() else TextureQualityOptionState.anInt6006.toByte())
                    if (Class59_Sub1.aBoolean5300) {
                        CameraRotationStub.method289(-15902, 0x3fff and -Class5.anInt4638, -MapTileShape.anInt4186 and 0x3fff, (-MinimapAreaMarkerNode.anInt9701 and 0x3fff))
                        SceneProjector.method1634(
                            Class64.anIntArray1127,
                            -2,
                            RegionSceneLoader.aByteArrayArrayArray3700,
                            (LocalPlayerState.aPlayer_1907!!.y) shr 9,
                            (LocalPlayerState.aPlayer_1907!!.plane) - -1,
                            FileIoUtil.anIntArray4097,
                            GlslMaterialPass.anInt6246,
                            Class59_Sub2_Sub2.anInt8685,
                            IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub1_7246!!.method1720(-32350) == 0,
                            ParticleSystemRenderer.anInt3855,
                            (LocalPlayerState.aPlayer_1907!!.x) shr 9,
                            LinkedListIterator.anIntArray2117,
                            BlankTextureNode.anIntArray9259,
                            i_16_,
                            Class56.anIntArray1045,
                            Class367_Sub11.anInt7396,
                            true,
                            LocalPlayerState.anInt1906
                        )
                    } else GlTexture3D.method1960(
                        Class367_Sub11.anInt7396,
                        GlslMaterialPass.anInt6246,
                        ParticleSystemRenderer.anInt3855,
                        Class59_Sub2_Sub2.anInt8685,
                        RegionSceneLoader.aByteArrayArrayArray3700,
                        FileIoUtil.anIntArray4097,
                        LinkedListIterator.anIntArray2117,
                        BlankTextureNode.anIntArray9259,
                        Class56.anIntArray1045,
                        Class64.anIntArray1127,
                        (LocalPlayerState.aPlayer_1907!!.plane) - -1,
                        i_16_,
                        (LocalPlayerState.aPlayer_1907!!.x) shr 9,
                        (LocalPlayerState.aPlayer_1907!!.y) shr 9,
                        IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub1_7246!!.method1720(-32350) == 0,
                        true,
                        if (!ParticleSystemRenderer.aBoolean3870) -1 else LocalPlayerState.anInt1906,
                        0,
                        false
                    )
                    Class369_Sub1.method3570(false)
                    if (WorldMapRenderer.anInt4674 == 10) {
                        WorldListEntry.method283(-127, i_0_, 256, i_2_, i_1_, i_3_, 256)
                        method3802(i_3_, i_2_, 2, i_1_, i_0_, 256, 256)
                        GroundDecorSceneEntity.method2403(i_1_, 256, i_3_, i_0_, 19206, i_2_, 256)
                        ItemDefinitionLoader.method1289(i_2_, i_0_, i_3_, 8, i_1_)
                    }
                    CharCodeMap.method3223()
                    GlslMaterialPass.anInt6246 = i_8_
                    MinimapAreaMarkerNode.anInt9701 = i_11_
                    Class5.anInt4638 = i_12_
                    ParticleSystemRenderer.anInt3855 = i_9_
                    Class59_Sub2_Sub2.anInt8685 = i_10_
                    if (SocketGameConnection.aBoolean5840 && ClientMachineInfo.aMediaStreamClient_6601!!.method1902(4) == 0) SocketGameConnection.aBoolean5840 = false
                    if (SocketGameConnection.aBoolean5840) {
                        FacingDirectionNode.aRenderer6654!!.method3675(i_0_, (-125).toByte(), i_1_, i_3_, i_2_, -16777216)
                        Tooltip.method3511(false, GameAppletFrame.aFont_20, ParticleEmitterFactory.aFontDefinition_3179, (LocalizedText.aLocalizedText_3495!!.method2063(AnimationFrameDefinition.anInt6967, 544)), 2, FacingDirectionNode.aRenderer6654)
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
                val class59_sub1_sub1 = Class59_Sub1_Sub1()
                val `is` = class59_sub1_sub1.method559(128, 128, 106.toByte(), 16)
                CompiledScriptCache.anObject4366 = GrowableStringList.method1357(`is`, false, 111.toByte())
            }
            anInt92++
            if (BoxedIntHolder.anObject2969 == null) {
                val class59_sub2_sub2 = Class59_Sub2_Sub2()
                val `is` = class59_sub2_sub2.method571(128, (-38).toByte(), 16, 128)
                BoxedIntHolder.anObject2969 = GrowableStringList.method1357(`is`, false, 106.toByte())
            }
        }

        init {
            anIntArray99 = intArrayOf(1, -1, -1, 1)
        }
    }
}
