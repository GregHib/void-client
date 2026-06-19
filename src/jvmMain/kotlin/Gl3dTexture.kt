import GameAppletFrame.Companion.method94
import RangeThresholdTextureNode.Companion.method3055
import jaggl.OpenGL.Companion.glPixelStorei
import jaggl.OpenGL.Companion.glTexImage3Dub
import java.io.IOException

class Gl3dTexture internal constructor(glRenderDevice: GlRenderDevice?, textureFormatInfo: TextureFormatInfo?, i: Int, i_0_: Int, i_1_: Int, `is`: ByteArray?) : GlTextureBase(glRenderDevice, 32879, textureFormatInfo, MovementDirection.aMovementDirection_1183, i_0_ * (i * i_1_), false), Renderable3dTexture {
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
            throw TextureLoadException.method2929(runtimeexception, ("qba.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    companion object {

        var anInt8624: Int = 0

        var anInt8625: Int = 0

        var anInt8627: Int = 0

        var anInt8628: Int = 0

        var anInt8630: Int = 0

        var anInt8632: Int = 0

        @JvmStatic
        fun method247(i: Int): DisplaySettingsConfig? {
            anInt8632++
            var randomAccessFileOnDisk: RandomAccessFileOnDisk? = null
            var class348_sub51 = DisplaySettingsConfig(Client.aSceneProjector_10434, 0)
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
                    class348_sub51 = DisplaySettingsConfig(ByteBuffer(`is`), (Client.aSceneProjector_10434), 0)
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
        fun method248(i: Int): Array<InboundPacketHeader?> {
            anInt8624++
            if (i != -11271) method249(39)
            return (arrayOf<InboundPacketHeader?>(
                ItemDefinitionLoader.aInboundPacketHeader_2183,
                LocalizedTextTriple.aInboundPacketHeader_3751,
                SequencedWallEntity.aInboundPacketHeader_10168,
                ChatCommandProcessor.aInboundPacketHeader_4388,
                WidgetDefinition.aInboundPacketHeader_250,
                VideoStreamDecoder.aInboundPacketHeader_4126,
                EmoteDefinition.aInboundPacketHeader_3264,
                GraphicsOptionState.aInboundPacketHeader_3143,
                CollisionMapRegion.aInboundPacketHeader_1722,
                LoadingScreenImageNode.aInboundPacketHeader_9503,
                ScrollingWidgetComponentNode.aInboundPacketHeader_8385,
                Client.aInboundPacketHeader_6383,
                SocketStreamWorker.aInboundPacketHeader_2665,
                TextureAtlasState.aInboundPacketHeader_4421,
                AwtKeyboardListener.aInboundPacketHeader_6528,
                WorldListEntry.aInboundPacketHeader_315,
                GlGroundShaderPass.aInboundPacketHeader_7398,
                WaterDetailOptionState.aInboundPacketHeader_5992,
                ScrollingWidgetComponentNode.aInboundPacketHeader_8384,
                ConnectionStateRefs.aInboundPacketHeader_318,
                PlayerUpdateDecoder.aInboundPacketHeader_1917,
                BasicGlRenderPass.aInboundPacketHeader_7301,
                CollisionMap.aInboundPacketHeader_4433,
                SequencedWallEntity.aInboundPacketHeader_10149,
                AbstractMenuEntryStatics.aInboundPacketHeader_1702,
                HeapDiagnosticsHolder.aInboundPacketHeader_2248,
                FogOptionState.aInboundPacketHeader_6056,
                WidgetRedrawTracker.aInboundPacketHeader_3925,
                CombineTextureNode.aInboundPacketHeader_9225,
                MapArchiveSource.aInboundPacketHeader_4798,
                SolidFillComponent.aInboundPacketHeader_8365,
                RenderableEntry.aInboundPacketHeader_4331,
                DetailLevelOptionState.aInboundPacketHeader_6121,
                TerrainShadowBuilderGl3.aInboundPacketHeader_7015,
                LightingOptionState.aInboundPacketHeader_5883,
                NoiseTextureGenerator.aInboundPacketHeader_1068,
                TimedRecordAccessor.aInboundPacketHeader_7106,
                GlEnvMappedWaterPass.aInboundPacketHeader_7367,
                ParserSpecialCharsHolder.aInboundPacketHeader_1901,
                GlArrayBufferObject.aInboundPacketHeader_4707,
                MinimapRectClipper.aInboundPacketHeader_220,
                SceneryDetailOptionState.aInboundPacketHeader_6089,
                IOException_Sub1.aInboundPacketHeader_90,
                SmoothingBuffer.aInboundPacketHeader_3240,
                PixelBlender.aInboundPacketHeader_3809,
                ParticleEffectCache.aInboundPacketHeader_3467,
                RemoveRoofsOptionState.aInboundPacketHeader_6058,
                MapSceneDefLoader.aInboundPacketHeader_2483,
                ModelHeaderCache.aInboundPacketHeader_3265,
                NativeLibraryUnloader.aInboundPacketHeader_2972,
                InputSettingsState.aInboundPacketHeader_1762,
                CharCountUtil.aInboundPacketHeader_229,
                MinimapStateReset.aInboundPacketHeader_1871,
                SceneTileBounds.aInboundPacketHeader_1120,
                Client.aInboundPacketHeader_1234,
                HuffmanCodec.aInboundPacketHeader_3773,
                WalkingTypeUtil.aInboundPacketHeader_3307,
                Client.aInboundPacketHeader_2305,
                WorldMapTextLabel.aInboundPacketHeader_8590,
                ItemNameResolver.aInboundPacketHeader_4998,
                NpcCountAccessor.aInboundPacketHeader_2279,
                GradientLookupEffect.aInboundPacketHeader_9197,
                OutgoingPacketNode.aInboundPacketHeader_7124,
                CompassSmoother.aInboundPacketHeader_3371,
                BinaryGraphicsOptionState.aInboundPacketHeader_5950,
                HslColorConfig.aInboundPacketHeader_330,
                NanoTimer.aInboundPacketHeader_843,
                ParticleProcessor.aInboundPacketHeader_4272,
                HeadIconRenderer.aInboundPacketHeader_2068,
                BinaryGraphicsOptionState.aInboundPacketHeader_5949,
                WorldListEntry.aInboundPacketHeader_304,
                InputStream_Sub2.aInboundPacketHeader_82,
                Client.aInboundPacketHeader_9552,
                BlankTextureNode.aInboundPacketHeader_9254,
                ArchiveResourceProvider.aInboundPacketHeader_6340,
                InputStream_Sub1.aInboundPacketHeader_79,
                FileExistsCondition.aInboundPacketHeader_4779,
                InboundPacketHeader.aInboundPacketHeader_2285,
                SceneTileBounds.aInboundPacketHeader_1123,
                GroundDecorRenderer.aInboundPacketHeader_3641,
                PingHostListHolder.aInboundPacketHeader_2335,
                ScreenBorderFiller.aInboundPacketHeader_1959,
                Client.aInboundPacketHeader_6424,
                HashTileShape.aInboundPacketHeader_8817,
                PlayerUpdateDecoder.aInboundPacketHeader_1914,
                GradientMapTextureNode.aInboundPacketHeader_9324,
                RegionSceneShifter.aInboundPacketHeader_7052,
                ParticleProcessor.aInboundPacketHeader_4269,
                RendererType.aInboundPacketHeader_4477,
                SimpleBinaryOptionState.aInboundPacketHeader_6075,
                Gl3dTexture.aInboundPacketHeader_4027,
                BrightnessTextureNode.aInboundPacketHeader_9216,
                ScriptOpcodeHolder.aInboundPacketHeader_2338,
                SlotBinding.aInboundPacketHeader_3427,
                CircleDrawer.aInboundPacketHeader_2693,
                ConnectionStateRefs.aInboundPacketHeader_316,
                GlCubemapLightPass.aInboundPacketHeader_7324,
                StringValueNode.aInboundPacketHeader_7113,
                MapAreaDefinition.aInboundPacketHeader_2527,
                HeapDiagnosticsHolder.aInboundPacketHeader_2255,
                CompositeRgbNoiseTexture.aInboundPacketHeader_8683,
                TimedRecordAccessor.aInboundPacketHeader_7105,
                BlankTextureNode.aInboundPacketHeader_9257,
                FixedFunctionWaterPass.aInboundPacketHeader_7363,
                CellNoiseTextureNode.aInboundPacketHeader_9285,
                GlCubemapLightPass.aInboundPacketHeader_7323,
                MapSceneIconDef.aInboundPacketHeader_2860,
                GroundDecorEntity.aInboundPacketHeader_8756,
                GraphicsOptionState.aInboundPacketHeader_3135,
                ChatCommandProcessor.aInboundPacketHeader_9550,
                CacheStateResetter.aInboundPacketHeader_123,
                ParticleSystemState.aInboundPacketHeader_2196,
                CompassSmoother.aInboundPacketHeader_3368,
                DirectionUtil.aInboundPacketHeader_1540,
                ProjectileDefinition.aInboundPacketHeader_3842,
                TextureQualityOptionState.aInboundPacketHeader_5997,
                LocTypeDefinition.aInboundPacketHeader_4015,
                LocConfigModelBuilder.aInboundPacketHeader_4500,
                UnusedToStringStub.aInboundPacketHeader_2717,
                FloatCameraTransform.aInboundPacketHeader_5742,
                PingHostListHolder.aInboundPacketHeader_2331
            ))
        }
        var aInboundPacketHeader_4027: InboundPacketHeader? = InboundPacketHeader(90, 10)

        @JvmStatic
        fun method249(i: Int) {
            anInt8627++
            ArbFogMaterialPass.aStringArray6200 = arrayOfNulls<String>(500)
            ProducerImageSurface.anInt9077 = 2 + (WorldMapLabel.aFontDefinition_4962!!.anInt1993 + WorldMapLabel.aFontDefinition_4962!!.anInt1988)
            MovementDirection.anInt1188 = (ParticleEmitterFactoryStatics.aFontDefinition_3179!!.anInt1988 - (-ParticleEmitterFactoryStatics.aFontDefinition_3179!!.anInt1993 - i))
            var i_4_ = 0
            while ((i_4_ < ArbFogMaterialPass.aStringArray6200!!.size)) {
                ArbFogMaterialPass.aStringArray6200!![i_4_] = ""
                i_4_++
            }
            method94(LocalizedText.aLocalizedText_3483!!.method2063(ChatCommandProcessor.anInt6967, 544)!!, 67)
        }
    }
}
