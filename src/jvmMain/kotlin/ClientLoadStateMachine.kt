import GameAppletFrameStatics.method85
import AbstractCameraTransformStatics.method901
import AnimatedModelRendererStatics.method988
import InputSettingsState.method1063
import GlCubeMapTextureStatics.method243
import ModelDefinitionLoaderStatics.method1202
import CircleHitboxStatics.method323
import OggBitstreamDecoderStatics.method2965
import AbstractProceduralTextureNodeStatics.method3038
import DisplaceTextureNodeStatics.method3063
import AsyncResourceRequestStatics.method3256
import GlShadowRenderPassStatics.method3553
import WorldMapLabelStatics.method3568
import ScrollbarComponentStatics.method184
import GameClock.method599
import MapRegionLoaderStatics.method752
import WhirlpoolHashStatics.method830
import TextureLoadExceptionStatics.method4011
import NativeRendererStatics.method3886
import NativeRendererStatics.method3896
import jagex3.jagmisc.jagmisc.init
import NativeRenderNodeStatics.method3290

/*
 * Class164
 */
object ClientLoadStateMachine {
    var anInt2172: Int = 0
    @JvmField
    var anInt2173: Int = 0
    var anInt2174: Int = 0
    var anInt2175: Int = 0

    @JvmStatic
    fun method1277(i: Byte) {
        anInt2175++
        FontMetaRefStatics.aLruByteCache_4327!!.method590(i + -62)
        ParticleGeometryStatics.aLruByteCache_4417!!.method590(0)
        SceneryDetailOptionStateStatics.aLruByteCache_6096!!.method590(0)
        if (i.toInt() != 62) method1277(43.toByte())
        EdgeDetectTextureNodeStatics.aLruByteCache_9171!!.method590(0)
    }

    fun method1278(i: Int): Int {
        if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub11_7265!!.method1768(i + -3690) == 0) {
            var i_0_ = 0
            while ((i_0_ < MinimapAreaMarkerNodeStatics.anInt9699)) {
                if (ProceduralTextureGraphStatics.anCharStreamReaderArray9534s!![i_0_]!!.method28(31.toByte()).code == 115 || ProceduralTextureGraphStatics.anCharStreamReaderArray9534s!![i_0_]!!.method28(71.toByte()).code == 83) {
                    IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub11_7265), 1)
                    TextureFormatInfoStatics.aBoolean3847 = true
                    break
                }
                i_0_++
            }
        }
        anInt2174++
        if (TimedTileQueueEntryStatics.aConnectionStateType_9660 == ConnectionStateTypeStatics.aConnectionStateType_1018) {
            val runtime = Runtime.getRuntime()
            val i_1_ = ((runtime.totalMemory() + -runtime.freeMemory()) / 1024L).toInt()
            val l = method599(i + 28559)
            if (SoundBankPatchStatics.aLong6791 == 0L) SoundBankPatchStatics.aLong6791 = l
            if (i_1_ > 16384 && -SoundBankPatchStatics.aLong6791 + l < 5000) {
                if (-ObjectByteSerializerHolderStatics.aLong2286 + l > 1000L) {
                    System.gc()
                    ObjectByteSerializerHolderStatics.aLong2286 = l
                }
                return 0
            }
        }
        if (ConnectionStateTypeStatics.aConnectionStateType_1023 == TimedTileQueueEntryStatics.aConnectionStateType_9660) {
            if (SizeBoundedSoftCacheStatics.aRsaPacketDecoder_2327 == null) SizeBoundedSoftCacheStatics.aRsaPacketDecoder_2327 = RsaPacketDecoder(ClientMachineInfoStatics.aMediaStreamClient_6601, GlShaderObjectHandleStatics.aScriptCompilerThread_520, RsaVarbitHandlerStatics.aBigInteger4896, TimedTileQueueEntryStatics.aBigInteger9657)
            if (!SizeBoundedSoftCacheStatics.aRsaPacketDecoder_2327!!.method2674(7)) return 0
            method2965(null, 0, true, 0)
            ScrollTexMaterialPassStatics.aBoolean6289 = !LongKeyNodeStatics.method2804((-63).toByte())
            ScrollTexMaterialPassStatics.aJs5Archive_6277 = WorldMapTextLabelStatics.method3571(false, (if (ScrollTexMaterialPassStatics.aBoolean6289) 34 else 32), (-23).toByte(), 1)
            SpriteRgbTextureNodeStatics.aJs5Archive_10426 = WorldMapTextLabelStatics.method3571(false, 33, (-23).toByte(), 1)
            SoftwareSpriteRasterStatics.aJs5Archive_1627 = WorldMapTextLabelStatics.method3571(false, 13, (-23).toByte(), 1)
        }
        if (ConnectionStateTypeStatics.aConnectionStateType_1024 == TimedTileQueueEntryStatics.aConnectionStateType_9660) {
            val bool = SpriteRgbTextureNodeStatics.aJs5Archive_10426!!.method401(89)
            var i_2_ = MinimapRectClipper.aClass314_Sub1Array223!![33]!!.method2349(1)
            i_2_ = i_2_ + MinimapRectClipper.aClass314_Sub1Array223!![if (!ScrollTexMaterialPassStatics.aBoolean6289) 32 else 34]!!.method2349(1)
            i_2_ += MinimapRectClipper.aClass314_Sub1Array223!![13]!!.method2349(1)
            i_2_ = i_2_ + (if (!bool) SpriteRgbTextureNodeStatics.aJs5Archive_10426!!.method398((-31).toByte()) else 100)
            if (i_2_ != 400) return i_2_ / 4
            AbstractFrameBufferSurfaceStatics.anInt6924 = ScrollTexMaterialPassStatics.aJs5Archive_6277!!.method389(77)
            GroundItemRenderState.anInt1663 = SpriteRgbTextureNodeStatics.aJs5Archive_10426!!.method389(i + 28561)
            DualMaterialContainerStatics.method1001(ScrollTexMaterialPassStatics.aJs5Archive_6277!!, 0)
            val i_3_ = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub19_7257!!.method1805(i xor 0x11ae)
            PerlinTextureProviderStatics.aCollisionMapRegion_5813 = CollisionMapRegion(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, SpriteRgbTextureNodeStatics.aJs5Archive_10426)
            var `is` = PerlinTextureProviderStatics.aCollisionMapRegion_5813!!.method1046(i_3_, 0)
            if (`is`!!.size == 0) `is` = PerlinTextureProviderStatics.aCollisionMapRegion_5813!!.method1046(0, 0)
            val dualMaterialContainer = DualMaterialContainer(ScrollTexMaterialPassStatics.aJs5Archive_6277, SoftwareSpriteRasterStatics.aJs5Archive_1627)
            if (`is`!!.size > 0) {
                LoadProgressCountersStatics.anCursorControllerArray2447 = arrayOfNulls<CursorController>(`is`.size)
                var i_4_ = 0
                while ((LoadProgressCountersStatics.anCursorControllerArray2447!!.size > i_4_)) {
                    LoadProgressCountersStatics.anCursorControllerArray2447!![i_4_] = RenderableGroup(PerlinTextureProviderStatics.aCollisionMapRegion_5813!!.method1043(`is`[i_4_], 102.toByte()), dualMaterialContainer)
                    i_4_++
                }
            }
        }
        if (TimedTileQueueEntryStatics.aConnectionStateType_9660 == ConnectionStateTypeStatics.aConnectionStateType_1026) LoadingScreenImageNodeStatics.method3178(SoftwareSpriteRasterStatics.aJs5Archive_1627, -81, method184(1084489728), ScrollTexMaterialPassStatics.aJs5Archive_6277)
        if (ConnectionStateTypeStatics.aConnectionStateType_1027 == TimedTileQueueEntryStatics.aConnectionStateType_9660) {
            val i_5_ = StringCacheNodeStatics.method3420(0)
            val i_6_ = method3256(2)
            if (i_6_ > i_5_) return 100 * i_5_ / i_6_
        }
        if (TimedTileQueueEntryStatics.aConnectionStateType_9660 == ConnectionStateTypeStatics.aConnectionStateType_1028) {
            if (LoadProgressCountersStatics.anCursorControllerArray2447 != null && (LoadProgressCountersStatics.anCursorControllerArray2447!!.size > 0)) {
                if (LoadProgressCountersStatics.anCursorControllerArray2447!![0]!!.method60(-19079) < 100) return 0
                if (LoadProgressCountersStatics.anCursorControllerArray2447!!.size > 1 && PerlinTextureProviderStatics.aCollisionMapRegion_5813!!.method1044(86) && (LoadProgressCountersStatics.anCursorControllerArray2447!![1]!!.method60(i + 9581) < 100)) return 0
            }
            VarpStoreStatics.method1311(5139, FacingDirectionNodeStatics.aRenderer6654!!)
            method3568(FacingDirectionNodeStatics.aRenderer6654, 4)
            ByteBufferStatics.method3379(2, 1)
        }
        if (TimedTileQueueEntryStatics.aConnectionStateType_9660 == ConnectionStateTypeStatics.aConnectionStateType_1029) {
            for (i_7_ in 0..3) TimedRecordAccessorStatics.aCollisionMapArray7108s!![i_7_] = method988(RangeThresholdTextureNodeStatics.anInt9109, 1, GlCubemapLightPassStatics.anInt7319)
        }
        if (TimedTileQueueEntryStatics.aConnectionStateType_9660 == ConnectionStateTypeStatics.aConnectionStateType_1030) {
            CameraRotationStubStatics.aJs5Archive_322 = WorldMapTextLabelStatics.method3571(false, 8, (-23).toByte(), 1)
            ShortKeyNodeStatics.aJs5Archive_6909 = WorldMapTextLabelStatics.method3571(false, 0, (-23).toByte(), 1)
            TextureGeneratorStatics.aJs5Archive_2490 = WorldMapTextLabelStatics.method3571(false, 1, (-23).toByte(), 1)
            DirectionUtil.aJs5Archive_1541 = WorldMapTextLabelStatics.method3571(false, 2, (-23).toByte(), 1)
            IntKeyNodeStatics.aJs5Archive_6980 = WorldMapTextLabelStatics.method3571(false, 3, (-23).toByte(), 1)
            ModelFacePriorityNodeStatics.aJs5Archive_1878 = WorldMapTextLabelStatics.method3571(false, 4, (-23).toByte(), 1)
            GlShadowRenderPassStatics.aJs5Archive_7382 = WorldMapTextLabelStatics.method3571(true, 5, (-23).toByte(), 1)
            CachedRgbNoiseTextureStatics.aJs5Archive_8667 = WorldMapTextLabelStatics.method3571(true, 6, (-23).toByte(), 1)
            RasterSpriteStatics.aJs5Archive_5207 = WorldMapTextLabelStatics.method3571(false, 7, (-23).toByte(), 1)
            WorldMapTextLabelStatics.aJs5Archive_8589 = WorldMapTextLabelStatics.method3571(false, 9, (-23).toByte(), 1)
            SceneTilePlaneManager.aJs5Archive_233 = WorldMapTextLabelStatics.method3571(false, 10, (-23).toByte(), 1)
            TheoraVideoStreamStatics.aJs5Archive_9033 = WorldMapTextLabelStatics.method3571(false, 11, (-23).toByte(), 1)
            CameraNodeListStatics.aJs5Archive_1743 = WorldMapTextLabelStatics.method3571(false, 12, (-23).toByte(), 1)
            LightingOptionStateStatics.aJs5Archive_5878 = WorldMapTextLabelStatics.method3571(false, 14, (-23).toByte(), 1)
            HoverActionEntryStatics.aJs5Archive_1815 = WorldMapTextLabelStatics.method3571(false, 15, (-23).toByte(), 1)
            AnimationFrameState.aJs5Archive_1538 = WorldMapTextLabelStatics.method3571(false, 16, (-23).toByte(), 1)
            VideoAdChecker.aJs5Archive_3183 = WorldMapTextLabelStatics.method3571(false, 17, (-23).toByte(), 1)
            FloatGridStatics.aJs5Archive_4975 = WorldMapTextLabelStatics.method3571(false, 18, (-23).toByte(), 1)
            SpotAnimVectorStatics.aJs5Archive_2306 = WorldMapTextLabelStatics.method3571(false, 19, (-23).toByte(), 1)
            OpenGlRenderNodeStatics.aJs5Archive_10480 = WorldMapTextLabelStatics.method3571(false, 20, (-23).toByte(), 1)
            BufferedRandomAccessFileStatics.aJs5Archive_1322 = WorldMapTextLabelStatics.method3571(false, 21, (-23).toByte(), 1)
            MidiSequencePlayerStatics.aJs5Archive_8926 = WorldMapTextLabelStatics.method3571(false, 22, (-23).toByte(), 1)
            TerrainShadowBuilderGl2Statics.aJs5Archive_6950 = WorldMapTextLabelStatics.method3571(true, 23, (-23).toByte(), 1)
            ModelBatchBaseStatics.aJs5Archive_1897 = WorldMapTextLabelStatics.method3571(false, 24, (-23).toByte(), 1)
            ConfigArchiveLoaderStatics.aJs5Archive_1434 = WorldMapTextLabelStatics.method3571(false, 25, (-23).toByte(), 1)
            KeyEventNodeStatics.aJs5Archive_4770 = WorldMapTextLabelStatics.method3571(true, 26, (-23).toByte(), 1)
            GraphicsOptionStateStatics.aJs5Archive_3146 = WorldMapTextLabelStatics.method3571(false, 27, (-23).toByte(), 1)
            FixedFunctionWaterPassStatics.aJs5Archive_7362 = WorldMapTextLabelStatics.method3571(true, 28, (-23).toByte(), 1)
            NodeDequeStatics.aJs5Archive_3323 = WorldMapTextLabelStatics.method3571(false, 29, (-23).toByte(), 1)
            Crc64HashableStatics.aJs5Archive_4984 = WorldMapTextLabelStatics.method3571(true, 30, (-23).toByte(), 1)
            SpriteLoadValidatorStatics.aJs5Archive_4796 = WorldMapTextLabelStatics.method3571(true, 31, (-23).toByte(), 1)
            HitsplatDefinitionStatics.aJs5Archive_2015 = WorldMapTextLabelStatics.method3571(true, 36, (-23).toByte(), 2)
        }
        if (ConnectionStateTypeStatics.aConnectionStateType_1031 == TimedTileQueueEntryStatics.aConnectionStateType_9660) {
            var i_8_ = 0
            for (i_9_ in 0..36) {
                if (MinimapRectClipper.aClass314_Sub1Array223!![i_9_] != null) i_8_ += (MinimapRectClipper.aClass314_Sub1Array223!![i_9_]!!.method2349(i + 28661) * NpcAnimationResolverStatics.anIntArray164!![i_9_] / 100)
            }
            if (i_8_ != 100) {
                if (LocDefinitionCacheStatics.anInt3435 < 0) LocDefinitionCacheStatics.anInt3435 = i_8_
                return ((i_8_ + -LocDefinitionCacheStatics.anInt3435) * 100 / (-LocDefinitionCacheStatics.anInt3435 + 100))
            }
            TexGenMaterialPassStatics.method2159((-109).toByte(), CameraRotationStubStatics.aJs5Archive_322!!)
            LoadingScreenImageNodeStatics.method3178(SoftwareSpriteRasterStatics.aJs5Archive_1627, -124, method184(i xor 0x40a46ff3.inv()), CameraRotationStubStatics.aJs5Archive_322)
        }
        if (ConnectionStateTypeStatics.aConnectionStateType_1032 == TimedTileQueueEntryStatics.aConnectionStateType_9660) {
            if (ParticleProcessorStatics.anInt4270 == -1) ParticleProcessorStatics.anInt4270 = CachedRgbNoiseTextureStatics.aJs5Archive_8667!!.method417("scape main", 0)
            method3290(56)
            ByteBufferStatics.method3379(2, 2)
        }
        if (ConnectionStateTypeStatics.aConnectionStateType_1033 == TimedTileQueueEntryStatics.aConnectionStateType_9660) method323(Crc64HashableStatics.aJs5Archive_4984, VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992, 95.toByte())
        if (ConnectionStateTypeStatics.aConnectionStateType_1034 == TimedTileQueueEntryStatics.aConnectionStateType_9660) {
            val i_10_ = BinaryGraphicsOptionStateStatics.method1770((-25).toByte())
            if (i_10_ < 100) return i_10_
            SeqDefinitionCacheStatics.method2013(FixedFunctionWaterPassStatics.aJs5Archive_7362!!.method415(73.toByte(), 1), 112.toByte())
            TextureLoadExceptionStatics.method4012(FixedFunctionWaterPassStatics.aJs5Archive_7362!!.method415(73.toByte(), 3), (-111).toByte())
        }
        if (i != -28660) return 2
        if (TimedTileQueueEntryStatics.aConnectionStateType_9660 == ConnectionStateTypeStatics.aConnectionStateType_1035) {
            if (AbstractFrameBufferSurfaceStatics.anInt6923 != -1 && !RasterSpriteStatics.aJs5Archive_5207!!.method420(-10499, AbstractFrameBufferSurfaceStatics.anInt6923, 0)) return 99
            SourceRowTextureNodeStatics.aRenderConfig9113 = TextureMetadataProvider(KeyEventNodeStatics.aJs5Archive_4770, WorldMapTextLabelStatics.aJs5Archive_8589, CameraRotationStubStatics.aJs5Archive_322)
            ProjectionCameraTransformStatics.aEmoteDefCache_5764 = EmoteDefCache(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541)
            OpenGlModelStatics.aNpcDefinitionCache_5558 = NpcDefinitionCache(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541)
            GraphicsOptionStateStatics.aItemDefinitionLoader_3147 = ItemDefinitionLoader(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541, CameraRotationStubStatics.aJs5Archive_322)
            RegionTileNodeStatics.aCacheArchiveIndexLoader_6653 = CacheArchiveIndexLoader(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, VideoAdChecker.aJs5Archive_3183)
            RenderConfigFactoryStatics.aLocDefinitionCache_2979 = LocDefinitionCache(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541)
            Tooltip.aParticleDefLoader_4460 = ParticleDefLoader(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541)
            FileExistsConditionStatics.aModelDefinitionCache_4782 = ModelDefinitionCache(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541, CameraRotationStubStatics.aJs5Archive_322)
            RadialTextureNodeStatics.aModelDefinitionLoader_9342 = ModelDefinitionLoader(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541, RasterSpriteStatics.aJs5Archive_5207)
            ScrollingWidgetComponentNodeStatics.aParticleEffectCache_8378 = ParticleEffectCache(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541)
            AbstractTileShapeStatics.aMapSceneDefLoader_6559 = MapSceneDefLoader(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541)
            GradientLookupEffectStatics.aSeqDefinitionCache_9195 = SeqDefinitionCache(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, true, AnimationFrameState.aJs5Archive_1538, RasterSpriteStatics.aJs5Archive_5207)
            TheoraVideoStreamStatics.aConfigDefinitionLoader_9031 = ConfigDefinitionLoader(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541, CameraRotationStubStatics.aJs5Archive_322)
            ModelOrSpriteHolderStatics.aTextureDefinitionLoader_117 = TextureDefinitionLoader(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541, CameraRotationStubStatics.aJs5Archive_322)
            MapAreaDefinitionStatics.aBufferedMessageQueue_2529 = BufferedMessageQueue(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, true, FloatGridStatics.aJs5Archive_4975, RasterSpriteStatics.aJs5Archive_5207)
            ClientExceptionStatics.aModelHeaderCache_112 = ModelHeaderCache(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, true, ProjectionCameraTransformStatics.aEmoteDefCache_5764, SpotAnimVectorStatics.aJs5Archive_2306, RasterSpriteStatics.aJs5Archive_5207)
            TheoraVideoStreamStatics.aLocTypeDefLoader_9036 = LocTypeDefLoader(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541)
            ParticleEmitterNodeStatics.aWidgetCache_191 = WidgetCache(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, OpenGlRenderNodeStatics.aJs5Archive_10480, ShortKeyNodeStatics.aJs5Archive_6909, TextureGeneratorStatics.aJs5Archive_2490)
            CircleHitboxStatics.aMapSceneCache_413 = MapSceneCache(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541)
            HoverActionEntryStatics.aSpriteStore_1813 = SpriteStore(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541)
            ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245 = MapElementDefinitionCache(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, BufferedRandomAccessFileStatics.aJs5Archive_1322, RasterSpriteStatics.aJs5Archive_5207)
            SpriteLoadValidatorStatics.aWorldMapImageBuilder_4787 = WorldMapImageBuilder(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541)
            NpcUpdateProcessor.aConfigArchiveLoader_1523 = ConfigArchiveLoader(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541)
            WaterDetailOptionStateStatics.aKeyboardLayoutCache_5995 = KeyboardLayoutCache(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541)
            RenderConfigFactoryStatics.aVarbitDefLoader_2981 = VarbitDefLoader(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, MidiSequencePlayerStatics.aJs5Archive_8926)
            NormalMapGeneratorStatics.aParticleAmountCache_3453 = ParticleAmountCache(HardCacheEntryReferenceStatics.aSceneProjector_10434, AnimationFrameDefinitionStatics.anInt6967, DirectionUtil.aJs5Archive_1541)
            WorldMapImageBuilderStatics.method699(SoftwareSpriteRasterStatics.aJs5Archive_1627, (-100).toByte(), IntKeyNodeStatics.aJs5Archive_6980, CameraRotationStubStatics.aJs5Archive_322, RasterSpriteStatics.aJs5Archive_5207)
            method85(0, NodeDequeStatics.aJs5Archive_3323)
            ScriptResources.aTextureDefinitionCache_2639 = TextureDefinitionCache(AnimationFrameDefinitionStatics.anInt6967, ModelBatchBaseStatics.aJs5Archive_1897, ConfigArchiveLoaderStatics.aJs5Archive_1434)
            BrightnessOptionStateStatics.aCompiledScriptCache_5900 = CompiledScriptCache(AnimationFrameDefinitionStatics.anInt6967, ModelBatchBaseStatics.aJs5Archive_1897, ConfigArchiveLoaderStatics.aJs5Archive_1434, ItemNameResolver())
            method1202(0)
            GradientLookupEffectStatics.aSeqDefinitionCache_9195!!.method2008(i + 28539, IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(i + -3690) == 0)
            ProjectedGroundDecorStatics.aVarpStore_10209 = VarpStore()
            method3038(-1)
            method4011(i + 29684, GraphicsOptionStateStatics.aJs5Archive_3146)
            ShortKeyNodeStatics.method3004(RasterSpriteStatics.aJs5Archive_5207, false, SourceRowTextureNodeStatics.aRenderConfig9113)
            val huffmanCodec = HuffmanCodec(SceneTilePlaneManager.aJs5Archive_233!!.method391("huffman", "", -29832)!!)
            method3896(huffmanCodec, 13.toByte())
            try {
                init()
            } catch (throwable: Throwable) {
                /* empty */
            }
            FacingDirectionNodeStatics.aBufferPositionTracker_6660 = RenderConfigFactoryStatics.method1631(false)
            NoiseTextureNodeStatics.aClass348_Sub4_9264 = ClientMachineInfo(true, VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!)
        }
        if (TimedTileQueueEntryStatics.aConnectionStateType_9660 == ConnectionStateTypeStatics.aConnectionStateType_1037) {
            val i_11_ = (NpcReferenceStatics.method2958(22388, CameraRotationStubStatics.aJs5Archive_322!!) + CipheredPacketBufferStatics.method3405(2012104999, true))
            val i_12_ = (ParticleEmitterDefExtStatics.method2188(-30477) - -method3256(2))
            if (i_11_ < i_12_) return i_11_ * 100 / i_12_
        }
        if (ConnectionStateTypeStatics.aConnectionStateType_1038 == TimedTileQueueEntryStatics.aConnectionStateType_9660) method752(TerrainShadowBuilderGl2Statics.aJs5Archive_6950, RenderConfigFactoryStatics.aLocDefinitionCache_2979, Tooltip.aParticleDefLoader_4460, GradientLookupEffectStatics.aSeqDefinitionCache_9195, TheoraVideoStreamStatics.aConfigDefinitionLoader_9031, ModelOrSpriteHolderStatics.aTextureDefinitionLoader_117, ProjectedGroundDecorStatics.aVarpStore_10209)
        if (ConnectionStateTypeStatics.aConnectionStateType_1039 == TimedTileQueueEntryStatics.aConnectionStateType_9660) {
            // TODO make cache edit to extend these or change id's
            IsaacCipherStatics.anIntArray1303 = (IntArray(WaterDetailOptionStateStatics.aKeyboardLayoutCache_5995!!.anInt3305 + 1000))
            GlslEnvMaterialPassStatics.aBooleanArray6270 = (BooleanArray(WaterDetailOptionStateStatics.aKeyboardLayoutCache_5995!!.anInt3305 + 1000))
            GlTextureCubeMapStatics.aStringArray8532 = arrayOfNulls<String>(NpcUpdateProcessor.aConfigArchiveLoader_1523!!.anInt1439)
            var i_13_ = 0
            while (WaterDetailOptionStateStatics.aKeyboardLayoutCache_5995!!.anInt3305 + 1000 > i_13_) {
                if (WaterDetailOptionStateStatics.aKeyboardLayoutCache_5995!!.method1976(i_13_, i xor 0x6fc0.inv()).anInt2135 == 0) {
                    GlslEnvMaterialPassStatics.aBooleanArray6270!![i_13_] = true
                    TimingCounters.anInt4168++
                }
                IsaacCipherStatics.anIntArray1303!![i_13_] = -1
                i_13_++
            }
            method1063(1)
            GlBufferObjectStatics.anInt4737 = IntKeyNodeStatics.aJs5Archive_6980!!.method417("loginscreen", i xor 0x6ff3.inv())
            FloorOverlayDefinitionStatics.anInt970 = IntKeyNodeStatics.aJs5Archive_6980!!.method417("lobbyscreen", 0)
            GlShadowRenderPassStatics.aJs5Archive_7382!!.method404(0, true, false)
            CachedRgbNoiseTextureStatics.aJs5Archive_8667!!.method404(0, true, true)
            CameraRotationStubStatics.aJs5Archive_322!!.method404(i + 28660, true, true)
            SoftwareSpriteRasterStatics.aJs5Archive_1627!!.method404(0, true, true)
            SceneTilePlaneManager.aJs5Archive_233!!.method404(0, true, true)
            IntKeyNodeStatics.aJs5Archive_6980!!.method404(0, true, true)
            DirectionUtil.aJs5Archive_1541!!.anInt634 = 2
            MapElementDefinitionCacheStatics.aBoolean3988 = true
            VideoAdChecker.aJs5Archive_3183!!.anInt634 = 2
            AnimationFrameState.aJs5Archive_1538!!.anInt634 = 2
            FloatGridStatics.aJs5Archive_4975!!.anInt634 = 2
            SpotAnimVectorStatics.aJs5Archive_2306!!.anInt634 = 2
            OpenGlRenderNodeStatics.aJs5Archive_10480!!.anInt634 = 2
            BufferedRandomAccessFileStatics.aJs5Archive_1322!!.anInt634 = 2
        }
        if (TimedTileQueueEntryStatics.aConnectionStateType_9660 == ConnectionStateTypeStatics.aConnectionStateType_1040) {
            if (!TextureLoaderUtil.method2547(GlBufferObjectStatics.anInt4737, 84.toByte())) return 0
            var bool = true
            for (i_14_ in (WarpTextureNodeStatics.aWidgetComponentArrayArray9427!![GlBufferObjectStatics.anInt4737])!!.indices) {
                val widgetComponent: WidgetComponent = (WarpTextureNodeStatics.aWidgetComponentArrayArray9427!![GlBufferObjectStatics.anInt4737]!![i_14_])!!
                if (widgetComponent.anInt774 == 5 && widgetComponent.anInt756 != -1 && !CameraRotationStubStatics.aJs5Archive_322!!.method420(-10499, (widgetComponent.anInt756), 0)) bool = false
            }
            if (!bool) return 0
        }
        if (ConnectionStateTypeStatics.aConnectionStateType_1041 == TimedTileQueueEntryStatics.aConnectionStateType_9660) CacheEntryReferenceStatics.method3198(true, (-45).toByte())
        if (TimedTileQueueEntryStatics.aConnectionStateType_9660 == ConnectionStateTypeStatics.aConnectionStateType_1042) {
            NpcConfigStatics.aResourceLoaderThread_897!!.method2319((-56).toByte())
            try {
                TerrainShadowBuilderGl2Statics.aThread6946!!.join()
            } catch (interruptedexception: InterruptedException) {
                return 0
            }
            PerlinTextureProviderStatics.aCollisionMapRegion_5813 = null
            SpriteRgbTextureNodeStatics.aJs5Archive_10426 = null
            NpcConfigStatics.aResourceLoaderThread_897 = null
            LoadProgressCountersStatics.anCursorControllerArray2447 = null
            TerrainShadowBuilderGl2Statics.aThread6946 = null
            ScrollTexMaterialPassStatics.aJs5Archive_6277 = null
            method3886(i + 28556)
            TheoraVideoStreamStatics.aBoolean9038 = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub11_7265!!.method1768(-32350) == 1
            IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub11_7265), 1)
            if (TheoraVideoStreamStatics.aBoolean9038) IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 0)
            else if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7251!!.aBoolean6113 && NoiseTextureNodeStatics.aClass348_Sub4_9264!!.anInt6609 < 512 && NoiseTextureNodeStatics.aClass348_Sub4_9264!!.anInt6609 != 0) IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7251), 0)
            method243(i xor 0x6fd6.inv())
            if (TheoraVideoStreamStatics.aBoolean9038) method3553(false, 108.toByte(), 0)
            else method3553(false, 102.toByte(), IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7251!!.method1829(-32350))
            method830(IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350), -1, 102.toByte(), false, -1)
            VarpStoreStatics.method1311(5139, FacingDirectionNodeStatics.aRenderer6654!!)
            method3568(FacingDirectionNodeStatics.aRenderer6654, i xor 0x6ff7.inv())
            ModelHeaderCacheStatics.method1933(CameraRotationStubStatics.aJs5Archive_322, FacingDirectionNodeStatics.aRenderer6654, true)
            method901(CameraNodeListStatics.aAbstractModelRendererArray1744, 515880227)
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
            throw SoundBankPatchStatics.method2929(runtimeexception, ("pea.C(" + bool + ',' + i + ',' + (if (strings != null) "{...}" else "null") + ',' + i_15_ + ')'))
        }
    }
}
