import GameAppletFrame.Companion.method94
import RangeThresholdTextureNode.Companion.method3055
import jaggl.OpenGL.Companion.glPixelStorei
import jaggl.OpenGL.Companion.glTexImage3Dub
import java.io.IOException

class Gl3dTexture internal constructor(glRenderDevice: GlRenderDevice?, textureFormatInfo: TextureFormatInfo?, i: Int, i_0_: Int, i_1_: Int, `is`: ByteArray?) : GlTextureBase(glRenderDevice, 32879, textureFormatInfo, Class68.aClass68_1183, i_0_ * (i * i_1_), false), Interface18_Impl1 {
    private val anInt8626: Int
    private val anInt8629: Int
    private val anInt8631: Int

    init {
        try {
            anInt8626 = i_1_
            anInt8631 = i
            anInt8629 = i_0_
            this.aGlRenderDevice_5082!!.method3850(86.toByte(), this)
            glPixelStorei(3317, 1)
            glTexImage3Dub(this.anInt5093, 0, this.method228(105), anInt8631, anInt8629, anInt8626, 0, method3055(109, this.aTextureFormatInfo_5084), 5121, `is`, 0)
            glPixelStorei(3317, 4)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("qba.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt8624: Int = 0
        @JvmField
        var anInt8625: Int = 0
        @JvmField
        var anInt8627: Int = 0
        @JvmField
        var anInt8628: Int = 0
        @JvmField
        var anInt8630: Int = 0
        @JvmField
        var anInt8632: Int = 0

        @JvmStatic
        fun method247(i: Int): DisplaySettingsConfig? {
            anInt8632++
            var randomAccessFileOnDisk: RandomAccessFileOnDisk? = null
            var class348_sub51 = DisplaySettingsConfig(HardCacheEntryReference.aSceneProjector_10434, 0)
            try {
                val class144 = VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.method2233((-46).toByte(), "", true)
                while (class144!!.anInt1997 == 0) TexGenMaterialPass.method2161((-85).toByte(), 1L)
                if (class144.anInt1997 == 1) {
                    randomAccessFileOnDisk = class144.anObject1998 as RandomAccessFileOnDisk?
                    val `is` = ByteArray(randomAccessFileOnDisk!!.method1662((-46).toByte()).toInt())
                    var i_2_: Int
                    var i_3_ = 0
                    while (`is`.size > i_3_) {
                        i_2_ = randomAccessFileOnDisk.method1656(`is`, i_3_, (-49).toByte(), -i_3_ + `is`.size)
                        if (i_2_ == -1) throw IOException("EOF")
                        i_3_ += i_2_
                    }
                    class348_sub51 = DisplaySettingsConfig(Buffer(`is`), (HardCacheEntryReference.aSceneProjector_10434), 0)
                }
            } catch (exception: Exception) {
                /* empty */
            }
            if (i != 24916) return null
            try {
                if (randomAccessFileOnDisk != null) randomAccessFileOnDisk.method1657(false)
            } catch (exception: Exception) {
                /* empty */
            }
            return class348_sub51
        }

        @JvmStatic
        fun method248(i: Int): Array<IntRange?> {
            anInt8624++
            if (i != -11271) method249(39)
            return (arrayOf<IntRange?>(
                ItemDefinitionLoader.aIntRange_2183,
                LocalizedTextTriple.aIntRange_3751,
                SequencedWallEntity.aIntRange_10168,
                Hashtable.aIntRange_4388,
                WidgetDefinition.aIntRange_250,
                VideoStreamDecoder.aIntRange_4126,
                EmoteDefinition.aIntRange_3264,
                GraphicsOptionState.aIntRange_3143,
                CollisionMapRegion.aIntRange_1722,
                LoadingScreenImageNode.aIntRange_9503,
                ScrollingWidgetComponentNode.aIntRange_8385,
                SceneEntity.aIntRange_6383,
                SocketStreamWorker.aIntRange_2665,
                TextureAtlasState.aIntRange_4421,
                AwtKeyboardListener.aIntRange_6528,
                WorldListEntry.aIntRange_315,
                Class367_Sub11.aIntRange_7398,
                WaterDetailOptionState.aIntRange_5992,
                ScrollingWidgetComponentNode.aIntRange_8384,
                ConnectionStateRefs.aIntRange_318,
                PlayerUpdateDecoder.aIntRange_1917,
                Class367_Sub3.aIntRange_7301,
                CollisionMap.aIntRange_4433,
                SequencedWallEntity.aIntRange_10149,
                AbstractMenuEntry.aIntRange_1702,
                HeapDiagnosticsHolder.aIntRange_2248,
                FogOptionState.aIntRange_6056,
                WidgetRedrawTracker.aIntRange_3925,
                CombineTextureNode.aIntRange_9225,
                MapArchiveSource.aIntRange_4798,
                SolidFillComponent.aIntRange_8365,
                RenderableEntry.aIntRange_4331,
                DetailLevelOptionState.aIntRange_6121,
                TerrainShadowBuilderGl3.aIntRange_7015,
                LightingOptionState.aIntRange_5883,
                NoiseTextureGenerator.aIntRange_1068,
                TimedRecordAccessor.aIntRange_7106,
                Class367_Sub9.aIntRange_7367,
                ParserSpecialCharsHolder.aIntRange_1901,
                GlArrayBufferObject.aIntRange_4707,
                MinimapRectClipper.aIntRange_220,
                SceneryDetailOptionState.aIntRange_6089,
                IOException_Sub1.aIntRange_90,
                SmoothingBuffer.aIntRange_3240,
                PixelBlender.aIntRange_3809,
                ParticleEffectCache.aIntRange_3467,
                RemoveRoofsOptionState.aIntRange_6058,
                MapSceneDefLoader.aIntRange_2483,
                ModelHeaderCache.aIntRange_3265,
                NativeLibraryUnloader.aIntRange_2972,
                InputSettingsState.aIntRange_1762,
                CharCountUtil.aIntRange_229,
                MinimapStateReset.aIntRange_1871,
                SceneTileBounds.aIntRange_1120,
                Class74.aIntRange_1234,
                HuffmanCodec.aIntRange_3773,
                WalkingTypeUtil.aIntRange_3307,
                SpotAnimVector.aIntRange_2305,
                WorldMapTextLabel.aIntRange_8590,
                ItemNameResolver.aIntRange_4998,
                NpcCountAccessor.aIntRange_2279,
                GradientLookupEffect.aIntRange_9197,
                OutgoingPacketNode.aIntRange_7124,
                CompassSmoother.aIntRange_3371,
                BinaryGraphicsOptionState.aIntRange_5950,
                HslColorConfig.aIntRange_330,
                NanoTimer.aIntRange_843,
                ParticleProcessor.aIntRange_4272,
                HeadIconRenderer.aIntRange_2068,
                BinaryGraphicsOptionState.aIntRange_5949,
                WorldListEntry.aIntRange_304,
                InputStream_Sub2.aIntRange_82,
                CacheEntryReference.aIntRange_9552,
                BlankTextureNode.aIntRange_9254,
                ArchiveResourceProvider.aIntRange_6340,
                InputStream_Sub1.aIntRange_79,
                Class73.aIntRange_4779,
                ObjectByteSerializerHolder.aIntRange_2285,
                SceneTileBounds.aIntRange_1123,
                GroundDecorRenderer.aIntRange_3641,
                PingHostListHolder.aIntRange_2335,
                ScreenBorderFiller.aIntRange_1959,
                SceneEffectMarker.aIntRange_6424,
                HashTileShape.aIntRange_8817,
                PlayerUpdateDecoder.aIntRange_1914,
                GradientMapTextureNode.aIntRange_9324,
                RegionSceneShifter.aIntRange_7052,
                ParticleProcessor.aIntRange_4269,
                FriendChatMember.aIntRange_4477,
                SimpleBinaryOptionState.aIntRange_6075,
                ImageFrameCache.aIntRange_4027,
                BrightnessTextureNode.aIntRange_9216,
                ScriptOpcodeHolder.aIntRange_2338,
                SlotBinding.aIntRange_3427,
                CircleDrawer.aIntRange_2693,
                ConnectionStateRefs.aIntRange_316,
                Class367_Sub4.aIntRange_7324,
                StringValueNode.aIntRange_7113,
                MapAreaDefinition.aIntRange_2527,
                HeapDiagnosticsHolder.aIntRange_2255,
                CompositeRgbNoiseTexture.aIntRange_8683,
                TimedRecordAccessor.aIntRange_7105,
                BlankTextureNode.aIntRange_9257,
                Class367_Sub8.aIntRange_7363,
                CellNoiseTextureNode.aIntRange_9285,
                Class367_Sub4.aIntRange_7323,
                MapSceneIconDef.aIntRange_2860,
                GroundDecorEntity.aIntRange_8756,
                GraphicsOptionState.aIntRange_3135,
                CacheEntryReference.aIntRange_9550,
                CacheStateResetter.aIntRange_123,
                ParticleSystemState.aIntRange_2196,
                CompassSmoother.aIntRange_3368,
                Class95.aIntRange_1540,
                ProjectileDefinition.aIntRange_3842,
                TextureQualityOptionState.aIntRange_5997,
                LocTypeDefinition.aIntRange_4015,
                LocConfigModelBuilder.aIntRange_4500,
                UnusedToStringStub.aIntRange_2717,
                FloatCameraTransform.aIntRange_5742,
                PingHostListHolder.aIntRange_2331
            ))
        }

        @JvmStatic
        fun method249(i: Int) {
            anInt8627++
            ArbFogMaterialPass.aStringArray6200 = arrayOfNulls<String>(500)
            ProducerImageSurface.anInt9077 = 2 + (WorldMapLabel.aFontDefinition_4962!!.anInt1993 + WorldMapLabel.aFontDefinition_4962!!.anInt1988)
            Class68.anInt1188 = (ParticleEmitterFactory.aFontDefinition_3179!!.anInt1988 - (-ParticleEmitterFactory.aFontDefinition_3179!!.anInt1993 - i))
            var i_4_ = 0
            while ((i_4_ < ArbFogMaterialPass.aStringArray6200!!.size)) {
                ArbFogMaterialPass.aStringArray6200!![i_4_] = ""
                i_4_++
            }
            method94(LocalizedText.aLocalizedText_3483!!.method2063(AnimationFrameDefinition.anInt6967, 544)!!, 67)
        }
    }
}
