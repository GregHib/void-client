import GameAppletFrame.Companion.method85
import AnimatedModelRenderer.Companion.method988
import InputSettingsState.method1063
import GlCubeMapTexture.Companion.method243
import ModelDefinitionLoader.Companion.method1202
import OggBitstreamDecoder.Companion.method2965
import ChatCommandProcessor.method3038
import DisplaceTextureNode.Companion.method3063
import AsyncResourceRequest.Companion.method3256
import GlTexture2DRegion.Companion.method3553
import WorldMapLabel.Companion.method3568
import ScrollbarComponent.Companion.method184
import GameClock.method599
import GraphicsOptionState.Companion.aByteArray3144
import CacheArchiveIndexLoader.Companion.aItemDefinitionLoader_3147
import WorldMapScene.Companion.method1709
import MapRegionLoaderStatics.method752
import NativeRenderer.Companion.method3886
import NativeRenderer.Companion.method3896
import jagex3.jagmisc.jagmisc.init
import NativeRenderNode.Companion.method3290
import kotlinx.coroutines.runBlocking

/*
 * Class164
 */
object ClientLoadStateMachine {
    var anInt2172: Int = 0

    var anInt2173: Int = 0
    var anInt2174: Int = 0
    var anInt2175: Int = 0

    @JvmStatic
    fun method1277(i: Byte) {
        anInt2175++
        FontMetaRef.aLruByteCache_4327!!.method590(i + -62)
        ParticleGeometry.aLruByteCache_4417!!.method590(0)
        SceneryDetailOptionState.aLruByteCache_6096!!.method590(0)
        if (i.toInt() != 62) method1277(43.toByte())
        EdgeDetectTextureNode.aLruByteCache_9171!!.method590(0)
    }

    fun method1278(i: Int): Int {
        if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub11_7265!!.method1768(i + -3690) == 0) {
            var i_0_ = 0
            while ((i_0_ < MinimapAreaMarkerNode.anInt9699)) {
                if (ProceduralTextureGraph.anCharStreamReaderArray9534s!![i_0_]!!.method28(31.toByte()).code == 115 || ProceduralTextureGraph.anCharStreamReaderArray9534s!![i_0_]!!.method28(71.toByte()).code == 83) {
                    IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub11_7265), 1)
                    TextureFormatInfo.aBoolean3847 = true
                    break
                }
                i_0_++
            }
        }
        anInt2174++
        if (TimedTileQueueEntry.aConnectionStateType_9660 == ConnectionStateType.aConnectionStateType_1018) {
            val runtime = Runtime.getRuntime()
            val i_1_ = ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L).toInt()
            val l = method599(i + 28559)
            if (SoundBankPatch.aLong6791 == 0L) SoundBankPatch.aLong6791 = l
            if (i_1_ > 16384 && -SoundBankPatch.aLong6791 + l < 5000) {
                if (-ObjectByteSerializerHolderStatics.aLong2286 + l > 1000L) {
                    System.gc()
                    ObjectByteSerializerHolderStatics.aLong2286 = l
                }
                return 0
            }
        }
        if (ConnectionStateType.aConnectionStateType_1023 == TimedTileQueueEntry.aConnectionStateType_9660) {
            if (SizeBoundedSoftCache.aRsaPacketDecoder_2327 == null) SizeBoundedSoftCache.aRsaPacketDecoder_2327 = RsaPacketDecoder(ClientMachineInfo.aMediaStreamClient_6601, GlShaderObjectHandle.aScriptCompilerThread_520, RsaVarbitHandler.aBigInteger4896, TimedTileQueueEntry.aBigInteger9657)
            if (!SizeBoundedSoftCache.aRsaPacketDecoder_2327!!.method2674(7)) return 0
            method2965(null, 0, true, 0)
            ScrollTexMaterialPass.aBoolean6289 = !LongKeyNode.method2804((-63).toByte())
            ScrollTexMaterialPass.aJs5Archive_6277 = WorldMapTextLabel.method3571(false, (if (ScrollTexMaterialPass.aBoolean6289) 34 else 32), (-23).toByte(), 1)
            SpriteRgbTextureNode.aJs5Archive_10426 = WorldMapTextLabel.method3571(false, 33, (-23).toByte(), 1)
            SoftwareSpriteRaster.aJs5Archive_1627 = WorldMapTextLabel.method3571(false, 13, (-23).toByte(), 1)
        }
        if (ConnectionStateType.aConnectionStateType_1024 == TimedTileQueueEntry.aConnectionStateType_9660) {
            val bool = SpriteRgbTextureNode.aJs5Archive_10426!!.method401(89)
            var i_2_ = MinimapRectClipper.aClass314_Sub1Array223!![33]!!.method2349(1)
            i_2_ = i_2_ + MinimapRectClipper.aClass314_Sub1Array223!![if (!ScrollTexMaterialPass.aBoolean6289) 32 else 34]!!.method2349(1)
            i_2_ += MinimapRectClipper.aClass314_Sub1Array223!![13]!!.method2349(1)
            i_2_ = i_2_ + (if (!bool) SpriteRgbTextureNode.aJs5Archive_10426!!.method398((-31).toByte()) else 100)
            if (i_2_ != 400) return i_2_ / 4
            AbstractFrameBufferSurface.anInt6924 = ScrollTexMaterialPass.aJs5Archive_6277!!.method389(77)
            GroundItemRenderState.anInt1663 = SpriteRgbTextureNode.aJs5Archive_10426!!.method389(i + 28561)
            DualMaterialContainer.method1001(ScrollTexMaterialPass.aJs5Archive_6277!!, 0)
            val i_3_ = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub19_7257!!.method1805(i xor 0x11ae)
            PerlinTextureProvider.aCollisionMapRegion_5813 = CollisionMapRegion(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, SpriteRgbTextureNode.aJs5Archive_10426)
            var `is` = PerlinTextureProvider.aCollisionMapRegion_5813!!.method1046(i_3_, 0)
            if (`is`!!.size == 0) `is` = PerlinTextureProvider.aCollisionMapRegion_5813!!.method1046(0, 0)
            val dualMaterialContainer = DualMaterialContainer(ScrollTexMaterialPass.aJs5Archive_6277, SoftwareSpriteRaster.aJs5Archive_1627)
            if (`is`!!.size > 0) {
                LoadProgressCounters.anCursorControllerArray2447 = arrayOfNulls<CursorController>(`is`.size)
                var i_4_ = 0
                while ((LoadProgressCounters.anCursorControllerArray2447!!.size > i_4_)) {
                    LoadProgressCounters.anCursorControllerArray2447!![i_4_] = RenderableGroup(PerlinTextureProvider.aCollisionMapRegion_5813!!.method1043(`is`[i_4_], 102.toByte()), dualMaterialContainer)
                    i_4_++
                }
            }
        }
        if (TimedTileQueueEntry.aConnectionStateType_9660 == ConnectionStateType.aConnectionStateType_1026) LoadingScreenImageNodeStatics.method3178(SoftwareSpriteRaster.aJs5Archive_1627, -81, method184(1084489728), ScrollTexMaterialPass.aJs5Archive_6277)
        if (ConnectionStateType.aConnectionStateType_1027 == TimedTileQueueEntry.aConnectionStateType_9660) {
            val i_5_ = StringCacheNode.method3420(0)
            val i_6_ = method3256(2)
            if (i_6_ > i_5_) return 100 * i_5_ / i_6_
        }
        if (TimedTileQueueEntry.aConnectionStateType_9660 == ConnectionStateType.aConnectionStateType_1028) {
            if (LoadProgressCounters.anCursorControllerArray2447 != null && (LoadProgressCounters.anCursorControllerArray2447!!.size > 0)) {
                if (LoadProgressCounters.anCursorControllerArray2447!![0]!!.method60(-19079) < 100) return 0
                if (LoadProgressCounters.anCursorControllerArray2447!!.size > 1 && PerlinTextureProvider.aCollisionMapRegion_5813!!.method1044(86) && (LoadProgressCounters.anCursorControllerArray2447!![1]!!.method60(i + 9581) < 100)) return 0
            }
            VarpStore.method1311(5139, FacingDirectionNodeStatics.aRenderer6654!!)
            method3568(FacingDirectionNodeStatics.aRenderer6654, 4)
            ByteBufferStatics.method3379(2, 1)
        }
        if (TimedTileQueueEntry.aConnectionStateType_9660 == ConnectionStateType.aConnectionStateType_1029) {
            for (i_7_ in 0..3) TimedRecordAccessor.aCollisionMapArray7108s!![i_7_] = method988(RangeThresholdTextureNode.anInt9109, 1, GlCubemapLightPass.anInt7319)
        }
        if (TimedTileQueueEntry.aConnectionStateType_9660 == ConnectionStateType.aConnectionStateType_1030) {
            CameraRotationStubStatics.aJs5Archive_322 = WorldMapTextLabel.method3571(false, 8, (-23).toByte(), 1)
            ShortKeyNode.aJs5Archive_6909 = WorldMapTextLabel.method3571(false, 0, (-23).toByte(), 1)
            TextureGenerator.aJs5Archive_2490 = WorldMapTextLabel.method3571(false, 1, (-23).toByte(), 1)
            DirectionUtil.aJs5Archive_1541 = WorldMapTextLabel.method3571(false, 2, (-23).toByte(), 1)
            ClientLoadStateMachine.aJs5Archive_6980 = WorldMapTextLabel.method3571(false, 3, (-23).toByte(), 1)
            ClientLoadStateMachine.aJs5Archive_1878 = WorldMapTextLabel.method3571(false, 4, (-23).toByte(), 1)
            AbstractCameraTransformStatics.aJs5Archive_7382 = WorldMapTextLabel.method3571(true, 5, (-23).toByte(), 1)
            CachedRgbNoiseTexture.aJs5Archive_8667 = WorldMapTextLabel.method3571(true, 6, (-23).toByte(), 1)
            RasterSprite.aJs5Archive_5207 = WorldMapTextLabel.method3571(false, 7, (-23).toByte(), 1)
            WorldMapTextLabel.aJs5Archive_8589 = WorldMapTextLabel.method3571(false, 9, (-23).toByte(), 1)
            SceneTilePlaneManager.aJs5Archive_233 = WorldMapTextLabel.method3571(false, 10, (-23).toByte(), 1)
            TheoraVideoStream.aJs5Archive_9033 = WorldMapTextLabel.method3571(false, 11, (-23).toByte(), 1)
            CameraNodeListStatics.aJs5Archive_1743 = WorldMapTextLabel.method3571(false, 12, (-23).toByte(), 1)
            LightingOptionState.aJs5Archive_5878 = WorldMapTextLabel.method3571(false, 14, (-23).toByte(), 1)
            HoverActionEntry.aJs5Archive_1815 = WorldMapTextLabel.method3571(false, 15, (-23).toByte(), 1)
            AnimationFrameState.aJs5Archive_1538 = WorldMapTextLabel.method3571(false, 16, (-23).toByte(), 1)
            VideoAdChecker.aJs5Archive_3183 = WorldMapTextLabel.method3571(false, 17, (-23).toByte(), 1)
            FloatGrid.aJs5Archive_4975 = WorldMapTextLabel.method3571(false, 18, (-23).toByte(), 1)
            ScriptOpcodeHolder.aJs5Archive_2306 = WorldMapTextLabel.method3571(false, 19, (-23).toByte(), 1)
            OpenGlRenderNode.aJs5Archive_10480 = WorldMapTextLabel.method3571(false, 20, (-23).toByte(), 1)
            BufferedRandomAccessFile.aJs5Archive_1322 = WorldMapTextLabel.method3571(false, 21, (-23).toByte(), 1)
            MidiSequencePlayer.aJs5Archive_8926 = WorldMapTextLabel.method3571(false, 22, (-23).toByte(), 1)
            TerrainShadowBuilderGl2.aJs5Archive_6950 = WorldMapTextLabel.method3571(true, 23, (-23).toByte(), 1)
            ModelBatchBaseStatics.aJs5Archive_1897 = WorldMapTextLabel.method3571(false, 24, (-23).toByte(), 1)
            ConfigArchiveLoader.aJs5Archive_1434 = WorldMapTextLabel.method3571(false, 25, (-23).toByte(), 1)
            KeyEventNode.aJs5Archive_4770 = WorldMapTextLabel.method3571(true, 26, (-23).toByte(), 1)
            ClientLoadStateMachine.aJs5Archive_3146 = WorldMapTextLabel.method3571(false, 27, (-23).toByte(), 1)
            FixedFunctionWaterPass.aJs5Archive_7362 = WorldMapTextLabel.method3571(true, 28, (-23).toByte(), 1)
            NodeDequeStatics.aJs5Archive_3323 = WorldMapTextLabel.method3571(false, 29, (-23).toByte(), 1)
            Crc64Hashable.aJs5Archive_4984 = WorldMapTextLabel.method3571(true, 30, (-23).toByte(), 1)
            SpriteLoadValidator.aJs5Archive_4796 = WorldMapTextLabel.method3571(true, 31, (-23).toByte(), 1)
            HitsplatDefinition.aJs5Archive_2015 = WorldMapTextLabel.method3571(true, 36, (-23).toByte(), 2)
        }
        if (ConnectionStateType.aConnectionStateType_1031 == TimedTileQueueEntry.aConnectionStateType_9660) {
            var i_8_ = 0
            for (i_9_ in 0..36) {
                if (MinimapRectClipper.aClass314_Sub1Array223!![i_9_] != null) i_8_ += (MinimapRectClipper.aClass314_Sub1Array223!![i_9_]!!.method2349(i + 28661) * NpcAnimationResolver.anIntArray164!![i_9_] / 100)
            }
            if (i_8_ != 100) {
                if (LocDefinitionCache.anInt3435 < 0) LocDefinitionCache.anInt3435 = i_8_
                return ((i_8_ + -LocDefinitionCache.anInt3435) * 100 / (-LocDefinitionCache.anInt3435 + 100))
            }
            TexGenMaterialPass.method2159((-109).toByte(), CameraRotationStubStatics.aJs5Archive_322!!)
            LoadingScreenImageNodeStatics.method3178(SoftwareSpriteRaster.aJs5Archive_1627, -124, method184(i xor 0x40a46ff3.inv()), CameraRotationStubStatics.aJs5Archive_322)
        }
        if (ConnectionStateType.aConnectionStateType_1032 == TimedTileQueueEntry.aConnectionStateType_9660) {
            if (ParticleProcessor.anInt4270 == -1) ParticleProcessor.anInt4270 = CachedRgbNoiseTexture.aJs5Archive_8667!!.method417("scape main", 0)
            method3290(56)
            ByteBufferStatics.method3379(2, 2)
        }
        if (ConnectionStateType.aConnectionStateType_1033 == TimedTileQueueEntry.aConnectionStateType_9660) OSInfo.method323(Crc64Hashable.aJs5Archive_4984, VorbisOggDecoder.aPrivilegedOperationWorker_8992, 95.toByte())
        if (ConnectionStateType.aConnectionStateType_1034 == TimedTileQueueEntry.aConnectionStateType_9660) {
            val i_10_ = BinaryGraphicsOptionState.method1770((-25).toByte())
            if (i_10_ < 100) return i_10_
            SeqDefinitionCache.method2013(FixedFunctionWaterPass.aJs5Archive_7362!!.method415(73.toByte(), 1), 112.toByte())
            TextureLoadExceptionStatics.method4012(FixedFunctionWaterPass.aJs5Archive_7362!!.method415(73.toByte(), 3), (-111).toByte())
        }
        if (i != -28660) return 2
        if (TimedTileQueueEntry.aConnectionStateType_9660 == ConnectionStateType.aConnectionStateType_1035) {
            if (AbstractFrameBufferSurface.anInt6923 != -1 && !RasterSprite.aJs5Archive_5207!!.method420(-10499, AbstractFrameBufferSurface.anInt6923, 0)) return 99
            SourceRowTextureNode.aRenderConfig9113 = TextureMetadataProvider(KeyEventNode.aJs5Archive_4770, WorldMapTextLabel.aJs5Archive_8589, CameraRotationStubStatics.aJs5Archive_322)
            ProjectionCameraTransform.aEmoteDefCache_5764 = EmoteDefCache(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541)
            OpenGlModel.aNpcDefinitionCache_5558 = NpcDefinitionCache(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541)
            CacheArchiveIndexLoader.aItemDefinitionLoader_3147 = ItemDefinitionLoader(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541, CameraRotationStubStatics.aJs5Archive_322)
            RegionTileNode.aCacheArchiveIndexLoader_6653 = CacheArchiveIndexLoader(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, VideoAdChecker.aJs5Archive_3183)
            RenderConfigFactoryStatics.aLocDefinitionCache_2979 = LocDefinitionCache(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541)
            Tooltip.aParticleDefLoader_4460 = ParticleDefLoader(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541)
            FileExistsCondition.aModelDefinitionCache_4782 = ModelDefinitionCache(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541, CameraRotationStubStatics.aJs5Archive_322)
            RadialTextureNode.aModelDefinitionLoader_9342 = ModelDefinitionLoader(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541, RasterSprite.aJs5Archive_5207)
            ScrollingWidgetComponentNode.aParticleEffectCache_8378 = ParticleEffectCache(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541)
            AbstractTileShapeStatics.aMapSceneDefLoader_6559 = MapSceneDefLoader(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541)
            GradientLookupEffect.aSeqDefinitionCache_9195 = SeqDefinitionCache(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, true, AnimationFrameState.aJs5Archive_1538, RasterSprite.aJs5Archive_5207)
            TheoraVideoStream.aConfigDefinitionLoader_9031 = ConfigDefinitionLoader(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541, CameraRotationStubStatics.aJs5Archive_322)
            ModelOrSpriteHolderStatics.aTextureDefinitionLoader_117 = TextureDefinitionLoader(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541, CameraRotationStubStatics.aJs5Archive_322)
            MapAreaDefinition.aBufferedMessageQueue_2529 = BufferedMessageQueue(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, true, FloatGrid.aJs5Archive_4975, RasterSprite.aJs5Archive_5207)
            ClientExceptionStatics.aModelHeaderCache_112 = ModelHeaderCache(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, true, ProjectionCameraTransform.aEmoteDefCache_5764, ScriptOpcodeHolder.aJs5Archive_2306, RasterSprite.aJs5Archive_5207)
            TheoraVideoStream.aLocTypeDefLoader_9036 = LocTypeDefLoader(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541)
            ParticleEmitterNode.aWidgetCache_191 = WidgetCache(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, OpenGlRenderNode.aJs5Archive_10480, ShortKeyNode.aJs5Archive_6909, TextureGenerator.aJs5Archive_2490)
            Client.aMapSceneCache_413 = MapSceneCache(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541)
            HoverActionEntry.aSpriteStore_1813 = SpriteStore(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541)
            ConstantColourTextureNode.aMapElementDefinitionCache_9245 = MapElementDefinitionCache(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, BufferedRandomAccessFile.aJs5Archive_1322, RasterSprite.aJs5Archive_5207)
            SpriteLoadValidator.aWorldMapImageBuilder_4787 = WorldMapImageBuilder(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541)
            NpcUpdateProcessor.aConfigArchiveLoader_1523 = ConfigArchiveLoader(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541)
            WaterDetailOptionState.aKeyboardLayoutCache_5995 = KeyboardLayoutCache(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541)
            RenderConfigFactoryStatics.aVarbitDefLoader_2981 = VarbitDefLoader(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, MidiSequencePlayer.aJs5Archive_8926)
            NormalMapGenerator.aParticleAmountCache_3453 = ParticleAmountCache(Client.aSceneProjector_10434, ChatCommandProcessor.anInt6967, DirectionUtil.aJs5Archive_1541)
            WorldMapImageBuilder.method699(SoftwareSpriteRaster.aJs5Archive_1627, (-100).toByte(), ClientLoadStateMachine.aJs5Archive_6980, CameraRotationStubStatics.aJs5Archive_322, RasterSprite.aJs5Archive_5207)
            method85(0, NodeDequeStatics.aJs5Archive_3323)
            ScriptResources.aTextureDefinitionCache_2639 = TextureDefinitionCache(ChatCommandProcessor.anInt6967, ModelBatchBaseStatics.aJs5Archive_1897, ConfigArchiveLoader.aJs5Archive_1434)
            BrightnessOptionState.aCompiledScriptCache_5900 = CompiledScriptCache(ChatCommandProcessor.anInt6967, ModelBatchBaseStatics.aJs5Archive_1897, ConfigArchiveLoader.aJs5Archive_1434, ItemNameResolver())
            method1202(0)
            GradientLookupEffect.aSeqDefinitionCache_9195!!.method2008(i + 28539, IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(i + -3690) == 0)
            ProjectedGroundDecor.aVarpStore_10209 = VarpStore()
            method3038(-1)
            TextureLoadExceptionStatics.method4011(i + 29684, ClientLoadStateMachine.aJs5Archive_3146)
            ShortKeyNode.method3004(RasterSprite.aJs5Archive_5207, false, SourceRowTextureNode.aRenderConfig9113)
            val huffmanCodec = HuffmanCodec(SceneTilePlaneManager.aJs5Archive_233!!.method391("huffman", "", -29832)!!)
            method3896(huffmanCodec, 13.toByte())
            try {
                init()
            } catch (throwable: Throwable) {
                /* empty */
            }
            FacingDirectionNodeStatics.aBufferPositionTracker_6660 = RenderConfigFactoryStatics.method1631(false)
            NoiseTextureNode.aClass348_Sub4_9264 = ClientMachineInfo(true, VorbisOggDecoder.aPrivilegedOperationWorker_8992!!)
        }
        if (TimedTileQueueEntry.aConnectionStateType_9660 == ConnectionStateType.aConnectionStateType_1037) {
            val i_11_ = (NpcReference.method2958(22388, CameraRotationStubStatics.aJs5Archive_322!!) + CipheredPacketBuffer.method3405(2012104999, true))
            val i_12_ = (ParticleEmitterDefExt.method2188(-30477) - -method3256(2))
            if (i_11_ < i_12_) return i_11_ * 100 / i_12_
        }
        if (ConnectionStateType.aConnectionStateType_1038 == TimedTileQueueEntry.aConnectionStateType_9660) method752(TerrainShadowBuilderGl2.aJs5Archive_6950, RenderConfigFactoryStatics.aLocDefinitionCache_2979, Tooltip.aParticleDefLoader_4460, GradientLookupEffect.aSeqDefinitionCache_9195, TheoraVideoStream.aConfigDefinitionLoader_9031, ModelOrSpriteHolderStatics.aTextureDefinitionLoader_117, ProjectedGroundDecor.aVarpStore_10209)
        if (ConnectionStateType.aConnectionStateType_1039 == TimedTileQueueEntry.aConnectionStateType_9660) {
            // TODO make cache edit to extend these or change id's
            IsaacCipher.anIntArray1303 = (IntArray(WaterDetailOptionState.aKeyboardLayoutCache_5995!!.anInt3305 + 1000))
            GlslEnvMaterialPass.aBooleanArray6270 = (BooleanArray(WaterDetailOptionState.aKeyboardLayoutCache_5995!!.anInt3305 + 1000))
            GlTextureCubeMap.aStringArray8532 = arrayOfNulls<String>(NpcUpdateProcessor.aConfigArchiveLoader_1523!!.anInt1439)
            var i_13_ = 0
            while (WaterDetailOptionState.aKeyboardLayoutCache_5995!!.anInt3305 + 1000 > i_13_) {
                if (WaterDetailOptionState.aKeyboardLayoutCache_5995!!.method1976(i_13_, i xor 0x6fc0.inv()).anInt2135 == 0) {
                    GlslEnvMaterialPass.aBooleanArray6270!![i_13_] = true
                    TimingCounters.anInt4168++
                }
                IsaacCipher.anIntArray1303!![i_13_] = -1
                i_13_++
            }
            method1063(1)
            GlBufferObject.anInt4737 = ClientLoadStateMachine.aJs5Archive_6980!!.method417("loginscreen", i xor 0x6ff3.inv())
            FloorOverlayDefinition.anInt970 = ClientLoadStateMachine.aJs5Archive_6980!!.method417("lobbyscreen", 0)
            AbstractCameraTransformStatics.aJs5Archive_7382!!.method404(0, true, false)
            CachedRgbNoiseTexture.aJs5Archive_8667!!.method404(0, true, true)
            CameraRotationStubStatics.aJs5Archive_322!!.method404(i + 28660, true, true)
            SoftwareSpriteRaster.aJs5Archive_1627!!.method404(0, true, true)
            SceneTilePlaneManager.aJs5Archive_233!!.method404(0, true, true)
            ClientLoadStateMachine.aJs5Archive_6980!!.method404(0, true, true)
            DirectionUtil.aJs5Archive_1541!!.anInt634 = 2
            MapElementDefinitionCache.aBoolean3988 = true
            VideoAdChecker.aJs5Archive_3183!!.anInt634 = 2
            AnimationFrameState.aJs5Archive_1538!!.anInt634 = 2
            FloatGrid.aJs5Archive_4975!!.anInt634 = 2
            ScriptOpcodeHolder.aJs5Archive_2306!!.anInt634 = 2
            OpenGlRenderNode.aJs5Archive_10480!!.anInt634 = 2
            BufferedRandomAccessFile.aJs5Archive_1322!!.anInt634 = 2
        }
        if (TimedTileQueueEntry.aConnectionStateType_9660 == ConnectionStateType.aConnectionStateType_1040) {
            if (!TextureLoaderUtil.method2547(GlBufferObject.anInt4737, 84.toByte())) return 0
            var bool = true
            for (i_14_ in (WarpTextureNode.aWidgetComponentArrayArray9427!![GlBufferObject.anInt4737])!!.indices) {
                val widgetComponent: WidgetComponent = (WarpTextureNode.aWidgetComponentArrayArray9427!![GlBufferObject.anInt4737]!![i_14_])!!
                if (widgetComponent.anInt774 == 5 && widgetComponent.anInt756 != -1 && !CameraRotationStubStatics.aJs5Archive_322!!.method420(-10499, (widgetComponent.anInt756), 0)) bool = false
            }
            if (!bool) return 0
        }
        if (ConnectionStateType.aConnectionStateType_1041 == TimedTileQueueEntry.aConnectionStateType_9660) ByteBufferStatics.method3198(true, (-45).toByte())
        if (TimedTileQueueEntry.aConnectionStateType_9660 == ConnectionStateType.aConnectionStateType_1042) {
            ActorEntity.aResourceLoaderThread_897!!.method2319((-56).toByte())
            try {
                runBlocking {
                    TerrainShadowBuilderGl2.job!!.join()
                }
            } catch (interruptedexception: InterruptedException) {
                return 0
            }
            PerlinTextureProvider.aCollisionMapRegion_5813 = null
            SpriteRgbTextureNode.aJs5Archive_10426 = null
            ActorEntity.aResourceLoaderThread_897 = null
            LoadProgressCounters.anCursorControllerArray2447 = null
            TerrainShadowBuilderGl2.job = null
            ScrollTexMaterialPass.aJs5Archive_6277 = null
            method3886(i + 28556)
            TheoraVideoStream.aBoolean9038 = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub11_7265!!.method1768(-32350) == 1
            IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub11_7265), 1)
            if (TheoraVideoStream.aBoolean9038) IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 0)
            else if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7251!!.aBoolean6113 && NoiseTextureNode.aClass348_Sub4_9264!!.anInt6609 < 512 && NoiseTextureNode.aClass348_Sub4_9264!!.anInt6609 != 0) IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 0)
            method243(i xor 0x6fd6.inv())
            if (TheoraVideoStream.aBoolean9038) method3553(false, 108.toByte(), 0)
            else method3553(false, 102.toByte(), IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7251!!.method1829(-32350))
            ChatCommandProcessor.method830(IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350), -1, 102.toByte(), false, -1)
            VarpStore.method1311(5139, FacingDirectionNodeStatics.aRenderer6654!!)
            method3568(FacingDirectionNodeStatics.aRenderer6654, i xor 0x6ff7.inv())
            ModelHeaderCache.method1933(CameraRotationStubStatics.aJs5Archive_322, FacingDirectionNodeStatics.aRenderer6654, true)
            AbstractCameraTransformStatics.method901(CameraNodeListStatics.aAbstractModelRendererArray1744, 515880227)
        }
        return method3063(false)
    }

    fun method1279(bool: Boolean, i: Int, strings: Array<String?>?, i_15_: Int): String {
        try {
            anInt2172++
            if (i == 0) return ""
            if (i == 1) {
                val string = strings!![i_15_]
                if (string == null) return "null"
                return string
            }
            val i_16_ = i + i_15_
            var i_17_ = 0
            var i_18_ = i_15_
            while (i_16_ > i_18_) {
                val string = strings!![i_18_]
                if (string == null) i_17_ += 4
                else i_17_ += string.length
                i_18_++
            }
            val stringbuffer = StringBuffer(i_17_)
            for (i_19_ in i_15_..<i_16_) {
                val string = strings!![i_19_]
                if (string == null) stringbuffer.append("null")
                else stringbuffer.append(string)
            }
            if (bool != true) ClientLoadStateMachine.method1277((-20).toByte())
            return stringbuffer.toString()
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("pea.C(" + bool + ',' + i + ',' + (if (strings != null) "{...}" else "null") + ',' + i_15_ + ')'))
        }
    }
    var aJs5Archive_1878: Js5Archive? = null
    var aJs5Archive_6980: Js5Archive? = null
    var aSoundChannelMixer_7042: SoundChannelMixer? = null
    fun method3040(bool: Boolean) {
        ClientLoadStateMachine.aSoundChannelMixer_7042 = null
        Client.aHashtable_7041 = null
    }
    var anInt2152: Int = 0
    @JvmStatic
    fun method1265(i: Int) {
        anInt2152++
        if (ClientLoadStateMachine.aSoundChannelMixer_7042 != null) ClientLoadStateMachine.aSoundChannelMixer_7042!!.method2093(true)
        if (VarbitDefLoader.aSoundChannelMixer_2596 != null) VarbitDefLoader.aSoundChannelMixer_2596!!.method2093(true)
    }

    var aJs5Archive_3146: Js5Archive? = null
    @JvmStatic
    fun method1715(i: Int) {
        InboundPacketHeader.aInboundPacketHeader_3145 = null
        InboundPacketHeader.aInboundPacketHeader_3143 = null
        ClientLoadStateMachine.aJs5Archive_3146 = null
        InboundPacketHeader.aInboundPacketHeader_3135 = null
        aByteArray3144 = null
        aItemDefinitionLoader_3147 = null
    }
}
