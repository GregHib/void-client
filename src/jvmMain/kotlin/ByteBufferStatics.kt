import AbstractFrameBufferSurface.Companion.method3007
import Client.Companion.method3196
import CacheIndexManager.Companion.method2355
import CameraConfigDefinition.Companion.method1922
import ChatCommandProcessor.method703
import CombineTextureNode.Companion.method3088
import GlTextureBase.Companion.method235
import GraphicsOptionState.Companion.method1713
import ChatCommandProcessor.aShort9555
import HeadIconRenderer.Companion.method1213
import LoadProgressCounters.Companion.method1372
import LoadingScreenImageNode.Companion.method3177
import RsaPacketDecoder.Companion.method2672
import SpriteBlitter.method882
import SpriteRgbTextureNode.Companion.method3093

object ByteBufferStatics {
    var anInt7161: Int = 0
    var anInt7173: Int = 0
    var aProjectileFactory_7175: ProjectileFactory? = ProjectileFactory(1, 2)
    var anInt7201: Int = 0
    var aLongArray7206: LongArray? = LongArray(32)

    fun method3331(i: Int, i_0_: Byte, i_1_: Int): Int {
        var i = i
        var i_1_ = i_1_
        anInt7161++
        var i_2_ = 1
        while ( /**/i > 1) {
            if ((0x1 and i) != 0) i_2_ *= i_1_
            i_1_ *= i_1_
            i = i shr 1
        }
        val i_3_ = 3 / ((i_0_ - -24) / 46)
        if (i == 1) return i_2_ * i_1_
        return i_2_
    }

    fun method3354(i: Int) {
        if (IntPair.aRenderer6968 != null) {
            IntPair.aRenderer6968!!.method3635((-44).toByte())
            EdgeDetectTextureNode.aFont_9173 = null
            IntPair.aRenderer6968 = null
        }
        val i_37_ = -97 % ((i - -14) / 37)
        anInt7173++
    }

    @JvmStatic
    fun method3376(i: Int) {
        aLongArray7206 = null
        aProjectileFactory_7175 = null
        if (i != -2) method3376(-87)
    }

    var anInt9547: Int = 0
    fun method3198(bool: Boolean, i: Byte) {
        anInt9547++
        if (bool) {
            if (RenderNodeStatics.anInt9721 != -1) GlTextureBase.method235(RenderNodeStatics.anInt9721, (-113).toByte())
            var class348_sub41 = MinimapSpriteRenderer.aHashtable_4915!!.method3484(0) as RegionSceneShifter?
            while (class348_sub41 != null) {
                if (!class348_sub41.method2712(4.toByte())) {
                    class348_sub41 = (MinimapSpriteRenderer.aHashtable_4915!!.method3484(i.toInt() xor 0x2c.inv()) as RegionSceneShifter?)
                    if (class348_sub41 == null) break
                }
                ScrollingWidgetComponentNode.method1118(true, false, class348_sub41, 2533)
                class348_sub41 = (MinimapSpriteRenderer.aHashtable_4915!!.method3482(0) as RegionSceneShifter?)
            }
            RenderNodeStatics.anInt9721 = -1
            MinimapSpriteRenderer.aHashtable_4915 = Hashtable(8)
            SpriteBlitter.method882(11.toByte())
            RenderNodeStatics.anInt9721 = GlBufferObject.anInt4737
            method1713(false, 520)
            TextureCache.method3466(100)
            ChatCommandProcessor.method703(RenderNodeStatics.anInt9721)
        }
        ProjectileFactory.aBoolean2895 = false
        TextureGenerator.aString2496 = ""
        OpenGlModel.aString5600 = TextureGenerator.aString2496
        RenderableGroup.method1448(-56)
        Tooltip.anInt4458 = -1
        CacheArchiveIndexLoader.method338(i + 45, StreamingResourceRequest.anInt10447)
        LocalPlayerState.aPlayer_1907 = Player()
        LocalPlayerState.aPlayer_1907!!.x = 512 * GlCubemapLightPass.anInt7319 / 2
        LocalPlayerState.aPlayer_1907!!.anIntArray10320!![0] = GlCubemapLightPass.anInt7319 / 2
        LocalPlayerState.aPlayer_1907!!.y = 512 * RangeThresholdTextureNode.anInt9109 / 2
        LocalPlayerState.aPlayer_1907!!.anIntArray10317!![0] = RangeThresholdTextureNode.anInt9109 / 2
        CompositeRgbNoiseTexture.anInt8685 = 0
        GlslMaterialPass.anInt6246 = CompositeRgbNoiseTexture.anInt8685
        if (WeaveTextureNode.anInt9282 == 2) {
            GlslMaterialPass.anInt6246 = TwoStateOptionState.anInt6981 shl 9
            CompositeRgbNoiseTexture.anInt8685 = CollisionMapAccessor.anInt3550 shl 9
        } else CameraSplineNode.method2954(62.toByte())
        SceneObjectSpawner.method773(true)
    }

    fun method3379(i: Int, i_71_: Int) {
        anInt7201++
        if (i_71_ != WorldMapRenderer.anInt4674) {
            if (i_71_ == 13) {
                if (NullOggStream.aString9043 != null) GlElementArrayBuffer.method1157(TextureLoadExceptionStatics.anInt4596, (-81).toByte())
                else method1922(TextureGenerator.aString2496, TextureLoadExceptionStatics.anInt4596, OpenGlModel.aString5600, true)
            }
            if (i_71_ != 13 && ItemDefinition.aAbstractGameSocket_2773 != null) {
                ItemDefinition.aAbstractGameSocket_2773!!.method1700(36.toByte())
                ItemDefinition.aAbstractGameSocket_2773 = null
            }
            if (i_71_ == 3) method3198((GlBufferObject.anInt4737 != RenderNodeStatics.anInt9721), (-45).toByte())
            if (i_71_ == 7) method1006((RenderNodeStatics.anInt9721 != FloorOverlayDefinition.anInt970), 102.toByte())
            if (i_71_ == 5) {
                if (NullOggStream.aString9043 == null) method1213(OpenGlModel.aString5600, TextureGenerator.aString2496, -124)
                else method1372(-1)
            } else if (i_71_ != 6) {
                if (i_71_ == 9) {
                    if (NullOggStream.aString9043 != null) GlElementArrayBuffer.method1157((TextureLoadExceptionStatics.anInt4596), (-120).toByte())
                    else method1922(TextureGenerator.aString2496, TextureLoadExceptionStatics.anInt4596, OpenGlModel.aString5600, true)
                } else if (i_71_ == 12) {
                    if (NullOggStream.aString9043 == null) method1213(OpenGlModel.aString5600, TextureGenerator.aString2496, -98)
                    else method1372(-1)
                }
            } else if (NullOggStream.aString9043 == null) method1922(TextureGenerator.aString2496, TextureLoadExceptionStatics.anInt4596, OpenGlModel.aString5600, true)
            else GlElementArrayBuffer.method1157(TextureLoadExceptionStatics.anInt4596, (-99).toByte())
            if (GroundDecorSceneEntity.method2402(WorldMapRenderer.anInt4674, (-78).toByte())) {
                DirectionUtil.aJs5Archive_1541!!.anInt634 = 2
                VideoAdChecker.aJs5Archive_3183!!.anInt634 = 2
                AnimationFrameState.aJs5Archive_1538!!.anInt634 = 2
                FloatGrid.aJs5Archive_4975!!.anInt634 = 2
                ScriptOpcodeHolder.aJs5Archive_2306!!.anInt634 = 2
                OpenGlRenderNode.aJs5Archive_10480!!.anInt634 = 2
                BufferedRandomAccessFile.aJs5Archive_1322!!.anInt634 = 2
            }
            if (GroundDecorSceneEntity.method2402(i_71_, (-119).toByte())) {
                ItemModelDefinition.anInt443 = 1
                AnimationFrameTable.anInt489 = 0
                StringValueNode.Companion.anInt7115 = 1
                CompositeNpcModelBuilder.anInt2101 = 0
                LocDefinitionCache.anInt3441 = 0
                method3177(-111, true)
                DirectionUtil.aJs5Archive_1541!!.anInt634 = 1
                VideoAdChecker.aJs5Archive_3183!!.anInt634 = 1
                AnimationFrameState.aJs5Archive_1538!!.anInt634 = 1
                FloatGrid.aJs5Archive_4975!!.anInt634 = 1
                ScriptOpcodeHolder.aJs5Archive_2306!!.anInt634 = 1
                OpenGlRenderNode.aJs5Archive_10480!!.anInt634 = 1
                BufferedRandomAccessFile.aJs5Archive_1322!!.anInt634 = 1
            }
            if (i_71_ == 11 || i_71_ == 3) method3088(9)
            val bool = (i == i_71_ || method3196(i_71_, i xor 0x58.inv()) || method2672(i_71_, -100))
            val bool_72_ = (WorldMapRenderer.anInt4674 == 2 || method3196(WorldMapRenderer.anInt4674, -110) || method2672(WorldMapRenderer.anInt4674, -128))
            if (bool != bool_72_) {
                if (bool) {
                    SlotBinding.anInt3428 = ParticleProcessor.anInt4270
                    if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7245!!.method1838(-32350) != 0) {
                        method2355(IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7245!!.method1838(-32350), 50.toByte(), false, CachedRgbNoiseTexture.aJs5Archive_8667, ParticleProcessor.anInt4270, 0, 2)
                        method3093(i xor 0x66)
                    } else method3007(2, 22684)
                    ClientMachineInfo.aMediaStreamClient_6601!!.method1892(-117, false)
                } else {
                    method3007(2, 22684)
                    ClientMachineInfo.aMediaStreamClient_6601!!.method1892(i xor 0x4b.inv(), true)
                }
            }
            if (GroundDecorSceneEntity.method2402(i_71_, (-64).toByte()) || i_71_ == 13) FacingDirectionNode.aRenderer6654!!.method3673()
            WorldMapRenderer.anInt4674 = i_71_
        }
    }


    var anInt1655: Int = 0
    fun method1006(bool: Boolean, i: Byte) {
        anInt1655++
        if (bool) {
            if (RenderNodeStatics.anInt9721 != -1) method235(RenderNodeStatics.anInt9721, ((-108).toByte()).toByte())
            var class348_sub41 = MinimapSpriteRenderer.aHashtable_4915!!.method3484(0) as? RegionSceneShifter
            while (class348_sub41 != null) {
                if (!class348_sub41.method2712(4.toByte())) {
                    class348_sub41 = (MinimapSpriteRenderer.aHashtable_4915!!.method3484(0) as? RegionSceneShifter)
                    if (class348_sub41 == null) break
                }
                ScrollingWidgetComponentNode.method1118(true, false, class348_sub41, 2533)
                class348_sub41 = (MinimapSpriteRenderer.aHashtable_4915!!.method3482(0) as? RegionSceneShifter)
            }
            RenderNodeStatics.anInt9721 = -1
            MinimapSpriteRenderer.aHashtable_4915 = Hashtable(8)
            method882(11.toByte())
            RenderNodeStatics.anInt9721 = FloorOverlayDefinition.anInt970
            method1713(false, 520)
            TextureCache.method3466(-119)
            method703(RenderNodeStatics.anInt9721)
        }
        ProjectileFactory.aBoolean2895 = true
        if (i < 49) WhirlpoolHash.anInt1651 = 10
    }
}