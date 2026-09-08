import kotlin.jvm.JvmStatic
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
import EnumTypeList.Companion.aCursorTypeList_3147
import MapRegionLoader.Companion.method752
import NativeRenderer.Companion.method3886
import NativeRenderer.Companion.method3896
import jagex3.jagmisc.jagmisc.init
import NativeRenderNode.Companion.method3290
import lang.PlatformRuntime
import lang.StringBuffer
import lang.gc

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
        TextureOptionState.aLruByteCache_6096!!.method590(0)
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
            val i_1_ = ((PlatformRuntime.totalMemory() + -PlatformRuntime.freeMemory()) / 1024L).toInt()
            val l = method599(i + 28559)
            if (SoundBankPatch.aLong6791 == 0L) SoundBankPatch.aLong6791 = l
            if (i_1_ > 16384 && -SoundBankPatch.aLong6791 + l < 5000) {
                if (-ObjectByteSerializerHolder.aLong2286 + l > 1000L) {
                    gc()
                    ObjectByteSerializerHolder.aLong2286 = l
                }
                return 0
            }
        }
        if (ConnectionStateType.aConnectionStateType_1023 == TimedTileQueueEntry.aConnectionStateType_9660) {
            if (SizeBoundedSoftCache.aRsaPacketDecoder_2327 == null) SizeBoundedSoftCache.aRsaPacketDecoder_2327 = RsaPacketDecoder(ClientMachineInfo.aMediaStreamClient_6601, GlShaderObjectHandle.aScriptCompilerThread_520, RsaVarbitHandler.aBigInteger4896, TimedTileQueueEntry.aBigInteger9657)
            if (!SizeBoundedSoftCache.aRsaPacketDecoder_2327!!.method2674(7)) return 0
            method2965(null, 0, true, 0)
            ScrollTexMaterialPass.aBoolean6289 = !LongKeyNode.method2804((-63).toByte())
            ScrollTexMaterialPass.aJs5Archive_6277 = WorldMapTextLabel.createIndex(false, (if (ScrollTexMaterialPass.aBoolean6289) 34 else 32), (-23).toByte(), 1)
            SpriteRgbTextureNode.aJs5Archive_10426 = WorldMapTextLabel.createIndex(false, 33, (-23).toByte(), 1)
            SoftwareSpriteRaster.aJs5Archive_1627 = WorldMapTextLabel.createIndex(false, 13, (-23).toByte(), 1)
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
            PerlinTextureProvider.aCollisionMapRegion_5813 = CollisionMapRegion(Client.mode, ChatCommandProcessor.language, SpriteRgbTextureNode.aJs5Archive_10426)
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
        if (TimedTileQueueEntry.aConnectionStateType_9660 == ConnectionStateType.aConnectionStateType_1026) LoadingScreenImageNode.method3178(SoftwareSpriteRaster.aJs5Archive_1627, -81, method184(1084489728), ScrollTexMaterialPass.aJs5Archive_6277)
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
            VarpStore.method1311(5139, FacingDirectionNode.aRenderer6654!!)
            method3568(FacingDirectionNode.aRenderer6654, 4)
            ByteBufferStatics.method3379(2, 1)
        }
        if (TimedTileQueueEntry.aConnectionStateType_9660 == ConnectionStateType.aConnectionStateType_1029) {
            for (i_7_ in 0..3) TimedRecordAccessor.aCollisionMapArray7108s!![i_7_] = method988(RangeThresholdTextureNode.anInt9109, 1, GlCubemapLightPass.anInt7319)
        }
        if (TimedTileQueueEntry.aConnectionStateType_9660 == ConnectionStateType.aConnectionStateType_1030) {
            CameraRotationStub.sprites = WorldMapTextLabel.createIndex(false, 8, (-23).toByte(), 1)
            ShortKeyNode.animationFrames = WorldMapTextLabel.createIndex(false, 0, (-23).toByte(), 1)
            TextureGenerator.animationSekeletons = WorldMapTextLabel.createIndex(false, 1, (-23).toByte(), 1)
            DirectionUtil.config = WorldMapTextLabel.createIndex(false, 2, (-23).toByte(), 1)
            ClientLoadStateMachine.interfaces = WorldMapTextLabel.createIndex(false, 3, (-23).toByte(), 1)
            ClientLoadStateMachine.soundEffects = WorldMapTextLabel.createIndex(false, 4, (-23).toByte(), 1)
            AbstractCameraTransformStatics.maps = WorldMapTextLabel.createIndex(true, 5, (-23).toByte(), 1)
            CachedRgbNoiseTexture.music = WorldMapTextLabel.createIndex(true, 6, (-23).toByte(), 1)
            RasterSprite.models = WorldMapTextLabel.createIndex(false, 7, (-23).toByte(), 1)
            WorldMapTextLabel.textures = WorldMapTextLabel.createIndex(false, 9, (-23).toByte(), 1)
            SceneTilePlaneManager.huffman = WorldMapTextLabel.createIndex(false, 10, (-23).toByte(), 1)
            TheoraVideoStream.jingles = WorldMapTextLabel.createIndex(false, 11, (-23).toByte(), 1)
            CameraNodeList.clientScripts = WorldMapTextLabel.createIndex(false, 12, (-23).toByte(), 1)
            GroundDecorOptionState.vorbis = WorldMapTextLabel.createIndex(false, 14, (-23).toByte(), 1)
            HoverActionEntry.aJs5Archive_1815 = WorldMapTextLabel.createIndex(false, 15, (-23).toByte(), 1)
            AnimationFrameState.objects = WorldMapTextLabel.createIndex(false, 16, (-23).toByte(), 1)
            VideoAdChecker.enums = WorldMapTextLabel.createIndex(false, 17, (-23).toByte(), 1)
            FloatGrid.npcs = WorldMapTextLabel.createIndex(false, 18, (-23).toByte(), 1)
            ScriptOpcodeHolder.items = WorldMapTextLabel.createIndex(false, 19, (-23).toByte(), 1)
            OpenGlRenderNode.animations = WorldMapTextLabel.createIndex(false, 20, (-23).toByte(), 1)
            BufferedRandomAccessFile.gfx = WorldMapTextLabel.createIndex(false, 21, (-23).toByte(), 1)
            MidiSequencePlayer.varbits = WorldMapTextLabel.createIndex(false, 22, (-23).toByte(), 1)
            TerrainShadowBuilderGl2.worldMap = WorldMapTextLabel.createIndex(true, 23, (-23).toByte(), 1)
            ModelBatchBase.quickChat = WorldMapTextLabel.createIndex(false, 24, (-23).toByte(), 1)
            ConfigArchiveLoader.quickChatMenus = WorldMapTextLabel.createIndex(false, 25, (-23).toByte(), 1)
            KeyEventNode.textureMaterials = WorldMapTextLabel.createIndex(true, 26, (-23).toByte(), 1)
            ClientLoadStateMachine.particles = WorldMapTextLabel.createIndex(false, 27, (-23).toByte(), 1)
            FixedFunctionWaterPass.defaults = WorldMapTextLabel.createIndex(true, 28, (-23).toByte(), 1)
            NodeDequeStatics.billboards = WorldMapTextLabel.createIndex(false, 29, (-23).toByte(), 1)
            Crc64Hashable.nativeLibraries = WorldMapTextLabel.createIndex(true, 30, (-23).toByte(), 1)
            SpriteLoadValidator.shaders = WorldMapTextLabel.createIndex(true, 31, (-23).toByte(), 1)
            HitsplatDefinition.aJs5Archive_2015 = WorldMapTextLabel.createIndex(true, 36, (-23).toByte(), 2)
        }
        if (ConnectionStateType.aConnectionStateType_1031 == TimedTileQueueEntry.aConnectionStateType_9660) {
            var i_8_ = 0
            for (i_9_ in 0..36) {
                if (MinimapRectClipper.aClass314_Sub1Array223!![i_9_] != null) i_8_ += (MinimapRectClipper.aClass314_Sub1Array223!![i_9_]!!.method2349(i + 28661) * NpcAnimationResolver.anIntArray164!![i_9_] / 100)
            }
            if (i_8_ != 100) {
                if (FloorOverlayTypeList.anInt3435 < 0) FloorOverlayTypeList.anInt3435 = i_8_
                return ((i_8_ + -FloorOverlayTypeList.anInt3435) * 100 / (-FloorOverlayTypeList.anInt3435 + 100))
            }
            TexGenMaterialPass.method2159((-109).toByte(), CameraRotationStub.sprites!!)
            LoadingScreenImageNode.method3178(SoftwareSpriteRaster.aJs5Archive_1627, -124, method184(i xor 0x40a46ff3.inv()), CameraRotationStub.sprites)
        }
        if (ConnectionStateType.aConnectionStateType_1032 == TimedTileQueueEntry.aConnectionStateType_9660) {
            if (ParticleProcessor.anInt4270 == -1) ParticleProcessor.anInt4270 = CachedRgbNoiseTexture.music!!.method417("scape main", 0)
            method3290(56)
            ByteBufferStatics.method3379(2, 2)
        }
        if (ConnectionStateType.aConnectionStateType_1033 == TimedTileQueueEntry.aConnectionStateType_9660) OSInfo.method323(Crc64Hashable.nativeLibraries, VorbisOggDecoder.aPrivilegedOperationWorker_8992, 95.toByte())
        if (ConnectionStateType.aConnectionStateType_1034 == TimedTileQueueEntry.aConnectionStateType_9660) {
            val i_10_ = BinaryGraphicsOptionState.method1770((-25).toByte())
            if (i_10_ < 100) return i_10_
            ObjectTypeList.method2013(FixedFunctionWaterPass.defaults!!.method415(73.toByte(), 1), 112.toByte())
            TextureLoadExceptionStatics.method4012(FixedFunctionWaterPass.defaults!!.method415(73.toByte(), 3), (-111).toByte())
        }
        if (i != -28660) return 2
        if (TimedTileQueueEntry.aConnectionStateType_9660 == ConnectionStateType.aConnectionStateType_1035) {
            if (AbstractFrameBufferSurface.anInt6923 != -1 && !RasterSprite.models!!.method420(-10499, AbstractFrameBufferSurface.anInt6923, 0)) return 99
            SourceRowTextureNode.aRenderConfig9113 = TextureMetadataProvider(KeyEventNode.textureMaterials, WorldMapTextLabel.textures, CameraRotationStub.sprites)
            ProjectionCameraTransform.aParamTypeList_5764 = ParamTypeList(Client.mode, ChatCommandProcessor.language, DirectionUtil.config)
            OpenGlModel.aNpcDefinitionCache_5558 = NpcDefinitionCache(Client.mode, ChatCommandProcessor.language, DirectionUtil.config)
            EnumTypeList.aCursorTypeList_3147 = CursorTypeList(Client.mode, ChatCommandProcessor.language, DirectionUtil.config, CameraRotationStub.sprites)
            RegionTileNode.aEnumTypeList_6653 = EnumTypeList(Client.mode, ChatCommandProcessor.language, VideoAdChecker.enums)
            RenderConfigFactory.aFloorOverlayTypeList_2979 = FloorOverlayTypeList(Client.mode, ChatCommandProcessor.language, DirectionUtil.config)
            Tooltip.aParticleDefLoader_4460 = ParticleDefLoader(Client.mode, ChatCommandProcessor.language, DirectionUtil.config)
            FileExistsCondition.aModelDefinitionCache_4782 = ModelDefinitionCache(Client.mode, ChatCommandProcessor.language, DirectionUtil.config, CameraRotationStub.sprites)
            RadialTextureNode.aModelDefinitionLoader_9342 = ModelDefinitionLoader(Client.mode, ChatCommandProcessor.language, DirectionUtil.config, RasterSprite.models)
            ScrollingWidgetComponentNode.aParticleEffectCache_8378 = ParticleEffectCache(Client.mode, ChatCommandProcessor.language, DirectionUtil.config)
            AbstractTileShapeStatics.aMapSceneDefLoader_6559 = MapSceneDefLoader(Client.mode, ChatCommandProcessor.language, DirectionUtil.config)
            GradientLookupEffect.aObjectTypeList_9195 = ObjectTypeList(Client.mode, ChatCommandProcessor.language, true, AnimationFrameState.objects, RasterSprite.models)
            TheoraVideoStream.aConfigDefinitionLoader_9031 = ConfigDefinitionLoader(Client.mode, ChatCommandProcessor.language, DirectionUtil.config, CameraRotationStub.sprites)
            ModelOrSpriteHolder.aMapSceneDefinitionLoader_117 = MapSceneDefinitionLoader(Client.mode, ChatCommandProcessor.language, DirectionUtil.config, CameraRotationStub.sprites)
            MapAreaDefinition.aNpcTypeList_2529 = NpcTypeList(Client.mode, ChatCommandProcessor.language, true, FloatGrid.npcs, RasterSprite.models)
            ClientException.aItemTypeList_112 = ItemTypeList(Client.mode, ChatCommandProcessor.language, true, ProjectionCameraTransform.aParamTypeList_5764, ScriptOpcodeHolder.items, RasterSprite.models)
            TheoraVideoStream.aLocTypeDefLoader_9036 = LocTypeDefLoader(Client.mode, ChatCommandProcessor.language, DirectionUtil.config)
            ParticleEmitterNode.aAnimationTypeList_191 = AnimationTypeList(Client.mode, ChatCommandProcessor.language, OpenGlRenderNode.animations, ShortKeyNode.animationFrames, TextureGenerator.animationSekeletons)
            Client.aMapSceneCache_413 = MapSceneCache(Client.mode, ChatCommandProcessor.language, DirectionUtil.config)
            HoverActionEntry.aSpriteStore_1813 = SpriteStore(Client.mode, ChatCommandProcessor.language, DirectionUtil.config)
            ConstantColourTextureNode.aGfxTypeList_9245 = GfxTypeList(Client.mode, ChatCommandProcessor.language, BufferedRandomAccessFile.gfx, RasterSprite.models)
            SpriteLoadValidator.aWorldMapImageBuilder_4787 = WorldMapImageBuilder(Client.mode, ChatCommandProcessor.language, DirectionUtil.config)
            NpcUpdateProcessor.aConfigArchiveLoader_1523 = ConfigArchiveLoader(Client.mode, ChatCommandProcessor.language, DirectionUtil.config)
            RemoveRoofLightingDetailOptionState.aKeyboardLayoutCache_5995 = KeyboardLayoutCache(Client.mode, ChatCommandProcessor.language, DirectionUtil.config)
            RenderConfigFactory.aVarbitDefLoader_2981 = VarbitDefLoader(Client.mode, ChatCommandProcessor.language, MidiSequencePlayer.varbits)
            NormalMapGenerator.aParticleAmountCache_3453 = ParticleAmountCache(Client.mode, ChatCommandProcessor.language, DirectionUtil.config)
            WorldMapImageBuilder.method699(SoftwareSpriteRaster.aJs5Archive_1627, (-100).toByte(), ClientLoadStateMachine.interfaces, CameraRotationStub.sprites, RasterSprite.models)
            method85(0, NodeDequeStatics.billboards)
            ScriptResources.aQuickChatTypeList_2639 = QuickChatTypeList(ChatCommandProcessor.language, ModelBatchBase.quickChat, ConfigArchiveLoader.quickChatMenus)
            BrightnessOptionState.aQuickChatMenuTypeList_5900 = QuickChatMenuTypeList(ChatCommandProcessor.language, ModelBatchBase.quickChat, ConfigArchiveLoader.quickChatMenus, ItemNameResolver())
            method1202(0)
            GradientLookupEffect.aObjectTypeList_9195!!.method2008(i + 28539, IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(i + -3690) == 0)
            ProjectedGroundDecor.aVarpStore_10209 = VarpStore()
            method3038(-1)
            TextureLoadExceptionStatics.method4011(i + 29684, ClientLoadStateMachine.particles)
            ShortKeyNode.method3004(RasterSprite.models, false, SourceRowTextureNode.aRenderConfig9113)
            val huffmanCodec = HuffmanCodec(SceneTilePlaneManager.huffman!!.method391("huffman", "", -29832)!!)
            method3896(huffmanCodec, 13.toByte())
            try {
                init()
            } catch (throwable: Throwable) {
                throwable.printStackTrace()
            }
            FacingDirectionNode.aBufferPositionTracker_6660 = RenderConfigFactory.method1631(false)
            NoiseTextureNode.aClass348_Sub4_9264 = ClientMachineInfo(true, VorbisOggDecoder.aPrivilegedOperationWorker_8992!!)
        }
        if (TimedTileQueueEntry.aConnectionStateType_9660 == ConnectionStateType.aConnectionStateType_1037) {
            val i_11_ = (NpcReference.method2958(22388, CameraRotationStub.sprites!!) + CipheredPacketBuffer.method3405(2012104999, true))
            val i_12_ = (ParticleEmitterDefExt.method2188(-30477) - -method3256(2))
            if (i_11_ < i_12_) return i_11_ * 100 / i_12_
        }
        if (ConnectionStateType.aConnectionStateType_1038 == TimedTileQueueEntry.aConnectionStateType_9660) method752(TerrainShadowBuilderGl2.worldMap, RenderConfigFactory.aFloorOverlayTypeList_2979, Tooltip.aParticleDefLoader_4460, GradientLookupEffect.aObjectTypeList_9195, TheoraVideoStream.aConfigDefinitionLoader_9031, ModelOrSpriteHolder.aMapSceneDefinitionLoader_117, ProjectedGroundDecor.aVarpStore_10209)
        if (ConnectionStateType.aConnectionStateType_1039 == TimedTileQueueEntry.aConnectionStateType_9660) {
            // TODO make cache edit to extend these or change id's
            IsaacCipher.anIntArray1303 = (IntArray(RemoveRoofLightingDetailOptionState.aKeyboardLayoutCache_5995!!.anInt3305 + 1000))
            GlslEnvMaterialPass.aBooleanArray6270 = (BooleanArray(RemoveRoofLightingDetailOptionState.aKeyboardLayoutCache_5995!!.anInt3305 + 1000))
            GlTextureCubeMap.aStringArray8532 = arrayOfNulls<String>(NpcUpdateProcessor.aConfigArchiveLoader_1523!!.anInt1439)
            var i_13_ = 0
            while (RemoveRoofLightingDetailOptionState.aKeyboardLayoutCache_5995!!.anInt3305 + 1000 > i_13_) {
                if (RemoveRoofLightingDetailOptionState.aKeyboardLayoutCache_5995!!.method1976(i_13_, i xor 0x6fc0.inv()).anInt2135 == 0) {
                    GlslEnvMaterialPass.aBooleanArray6270!![i_13_] = true
                    TimingCounters.anInt4168++
                }
                IsaacCipher.anIntArray1303!![i_13_] = -1
                i_13_++
            }
            method1063(1)
            GlBufferObject.anInt4737 = ClientLoadStateMachine.interfaces!!.method417("loginscreen", i xor 0x6ff3.inv())
            FloorOverlayDefinition.anInt970 = ClientLoadStateMachine.interfaces!!.method417("lobbyscreen", 0)
            AbstractCameraTransformStatics.maps!!.method404(0, true, false)
            CachedRgbNoiseTexture.music!!.method404(0, true, true)
            CameraRotationStub.sprites!!.method404(i + 28660, true, true)
            SoftwareSpriteRaster.aJs5Archive_1627!!.method404(0, true, true)
            SceneTilePlaneManager.huffman!!.method404(0, true, true)
            ClientLoadStateMachine.interfaces!!.method404(0, true, true)
            DirectionUtil.config!!.anInt634 = 2
            GfxTypeList.aBoolean3988 = true
            VideoAdChecker.enums!!.anInt634 = 2
            AnimationFrameState.objects!!.anInt634 = 2
            FloatGrid.npcs!!.anInt634 = 2
            ScriptOpcodeHolder.items!!.anInt634 = 2
            OpenGlRenderNode.animations!!.anInt634 = 2
            BufferedRandomAccessFile.gfx!!.anInt634 = 2
        }
        if (TimedTileQueueEntry.aConnectionStateType_9660 == ConnectionStateType.aConnectionStateType_1040) {
            if (!TextureLoaderUtil.method2547(GlBufferObject.anInt4737, 84.toByte())) return 0
            var bool = true
            for (i_14_ in (WarpTextureNode.aWidgetComponentArrayArray9427!![GlBufferObject.anInt4737])!!.indices) {
                val widgetComponent: WidgetComponent = (WarpTextureNode.aWidgetComponentArrayArray9427!![GlBufferObject.anInt4737]!![i_14_])!!
                if (widgetComponent.anInt774 == 5 && widgetComponent.anInt756 != -1 && !CameraRotationStub.sprites!!.method420(-10499, (widgetComponent.anInt756), 0)) bool = false
            }
            if (!bool) return 0
        }
        if (ConnectionStateType.aConnectionStateType_1041 == TimedTileQueueEntry.aConnectionStateType_9660) ByteBufferStatics.method3198(true, (-45).toByte())
        if (TimedTileQueueEntry.aConnectionStateType_9660 == ConnectionStateType.aConnectionStateType_1042) {
            ActorEntity.aResourceLoaderThread_897!!.method2319((-56).toByte())
            if (TerrainShadowBuilderGl2.job?.isCompleted != true) return 0
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
            // The default for aClass239_Sub27_7261 (DefaultGraphicsOptionState) is computed once at
            // construction time from the render mode, but construction can race with the real render
            // mode being applied above (the client always boots with mode 0 first). Recompute it now
            // that the real mode is settled, so it never latches onto the transient boot-time value.
            IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1716(false)
            ChatCommandProcessor.method830(IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350), -1, 102.toByte(), false, -1)
            VarpStore.method1311(5139, FacingDirectionNode.aRenderer6654!!)
            method3568(FacingDirectionNode.aRenderer6654, i xor 0x6ff7.inv())
            ItemTypeList.method1933(CameraRotationStub.sprites, FacingDirectionNode.aRenderer6654, true)
            AbstractCameraTransformStatics.method901(CameraNodeList.aAbstractModelRendererArray1744, 515880227)
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
    var soundEffects: Js5Archive? = null
    var interfaces: Js5Archive? = null
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

    var particles: Js5Archive? = null
    @JvmStatic
    fun method1715(i: Int) {
        InboundPacketHeader.aInboundPacketHeader_3145 = null
        InboundPacketHeader.aInboundPacketHeader_3143 = null
        ClientLoadStateMachine.particles = null
        InboundPacketHeader.aInboundPacketHeader_3135 = null
        aByteArray3144 = null
        aCursorTypeList_3147 = null
    }
}
