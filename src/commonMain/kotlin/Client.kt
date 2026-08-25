import kotlin.jvm.JvmStatic
import DelegatingRenderCanvas.Companion.method120
import DelegatingRenderCanvas.Companion.method123
import ParticleEmitterNode.Companion.method218
import MinimapRenderer.Companion.method886
import MinimapRenderer.Companion.method887
import MatrixCameraTransform.Companion.method911
import MatrixCameraTransform.Companion.method913
import FloatCameraTransform.Companion.method925
import ProjectionCameraTransform.Companion.method938
import MinimapDrawController.method948
import MinimapDrawController.method949
import SoftwareSpriteRaster.Companion.method953
import DualMaterialContainer.Companion.method999
import GlRenderDevice.Companion.method1004
import GroundItemRenderState.method1013
import SceneRegionState.method221
import MapLabelMenuEntry.Companion.method1040
import CollisionMapRegion.Companion.method1047
import CameraNodeList.Companion.method1057
import OverlayColorTable.method1061
import InputSettingsState.method1062
import CacheArchiveIndex.Companion.method1064
import MapSceneTileDefinition.Companion.method1075
import MinimapFlagRenderer.method1081
import ObjectSpawnDecoder.method1086
import HoverActionEntry.Companion.method1091
import ModelDefinition.Companion.method1096
import Crc64Hashable.Companion.method1112
import WidgetComponentNode.Companion.method1117
import ScrollingWidgetComponentNode.Companion.method1120
import MinimapStateReset.method1123
import VarpStore.Companion.method1126
import MinimapRectClipper.method225
import ModelBatchBase.Companion.method1127
import FrameStatsReset.Companion.method1133
import LocalPlayerState.method1137
import PlayerUpdateDecoder.method1139
import GlVertexBufferBase.Companion.method1149
import GlArrayBufferObject.Companion.method1154
import SpriteLoadValidator.Companion.method1159
import GlTextureBase.Companion.method237
import ScreenBorderFiller.method1168
import ScreenBorderFiller.method1169
import HitsplatDefinition.Companion.method1194
import HintArrowOrMessage.Companion.method1195
import WidgetNodeLink.Companion.method1198
import OrientationRotator.method1200
import Gl2dTexture.Companion.method241
import Gl2dTexture.Companion.method242
import GlCubeMapTexture.Companion.method243
import Gl3dTexture.Companion.method247
import GlRectangleTexture.Companion.method251
import CharCountUtil.method255
import ModelDefinitionLoader.Companion.method1208
import HeadIconRenderer.Companion.method1209
import CompositeNpcModelBuilder.Companion.method1235
import LinkedListIterator.Companion.method1239
import LinkedListIterator.Companion.method1242
import SettingsCrcWriter.method1246
import HeapInfoRecord.Companion.method1249
import SceneTilePlaneManager.method260
import KeyboardLayoutConfig.Companion.method1254
import ServerConnectionInfo.Companion.method1261
import ClientLoadStateMachine.method1265
import RgbColorPalette.Companion.method1267
import AudioResampler.Companion.method1269
import AudioResampler.Companion.method1276
import ItemDefinitionLoader.Companion.method1284
import ParticleSystemState.Companion.method1293
import HeapDiagnosticsHolder.method1298
import WidgetDefinition.Companion.method265
import VarpStore.Companion.method1309
import VarpStore.Companion.method1310
import VarpStore.Companion.method1315
import NpcCountAccessor.method1325
import ObjectByteSerializerHolder.Companion.method1329
import SizeBoundedSoftCache.Companion.method1343
import PingHostListHolder.method1351
import ScriptOpcodeHolder.method1355
import GlFramebufferBlitter.Companion.method273
import GlFramebufferBlitter.Companion.method277
import LoadProgressCounters.Companion.method1373
import LoadProgressCounters.Companion.method1375
import ParticleDefLoader.Companion.method1378
import ScanlineRasterFiller.Companion.method1386
import MapSceneDefLoader.Companion.method1395
import TextureGenerator.Companion.method1396
import PerlinTextureProvider.Companion.method1400
import LocTypeDefLoader.Companion.method1407
import GlowPostProcessor.Companion.method1411
import GlowPostProcessor.Companion.method1416
import WorldListEntry.Companion.method284
import ModelLightingConfig.Companion.method1426
import AsyncTaskHandle.Companion.method1438
import TextureHandle.Companion.method1440
import VarbitDefLoader.Companion.method1441
import RenderableGroup.Companion.method1447
import LoadingScreenState.Companion.method1461
import ModelOrSpriteHolder.Companion.method171
import ConnectionStateRefs.method287
import ScriptResources.method1463
import SocketStreamWorker.Companion.method1471
import MidiTrackReader.Companion.method1493
import CircleDrawer.method1497
import FrameBufferObject.Companion.method1499
import BufferedOutputStreamWorker.Companion.method1525
import HeadIconRenderer.Companion.method1529
import CameraRotationStub.Companion.method288
import VorbisFloorDecoder.Companion.method1536
import CompressedBlockDecoder.method1551
import ItemDefinition.Companion.method1564
import ParticleAmountCache.Companion.method1585
import MapSceneIconDef.Companion.method1594
import ModelDefinitionCache.Companion.method1600
import ModelDefinitionCache.Companion.method1604
import HslColorConfig.Companion.method294
import NpcDefinition.Companion.method1619
import TextureDefinitionCache.Companion.method1624
import BoxedIntHolder.Companion.method1627
import NativeLibraryUnloader.method1628
import RenderConfigFactory.Companion.method1632
import HudTabPanel.Companion.method1641
import TerrainTileGeometry.Companion.method1645
import ParticleSortRenderer.Companion.method1653
import SceneObjectAnimator.Companion.method1673
import WorldMapScene.Companion.method1677
import WorldMapSceneSoftware.Companion.method1698
import BooleanGraphicsOptionState.Companion.method1723
import RangedGraphicsOptionState.Companion.method1761
import RangedGraphicsOptionState.Companion.method1763
import BinaryGraphicsOptionState.Companion.method1769
import BloomGraphicsOptionState.Companion.method1773
import GroundDecorOptionState.Companion.method1777
import WaterDetailOptionState.Companion.method1780
import TextureQualityOptionState.Companion.method1785
import ParticleDetailOptionState.Companion.method1794
import LightDetailOptionState.Companion.method1799
import LightDetailOptionState.Companion.method1802
import CameraDistanceOptionState.Companion.method1724
import SimpleBinaryOptionState.Companion.method1816
import SceneryDetailOptionState.Companion.method1822
import DisplayModeOptionState.Companion.method1832
import DetailLevelOptionState.Companion.method1835
import DefaultGraphicsOptionState.Companion.method1841
import LightingOptionState.Companion.method1738
import BrightnessOptionState.Companion.method1746
import FlickeringEffectsOptionState.Companion.method1753
import FlickeringEffectsOptionState.Companion.method1755
import CustomCursorsOptionState.Companion.method1758
import WorldMapRenderer.Companion.method1853
import ManagedGlResource.Companion.method1866
import TextureMetadataProvider.Companion.method1880
import DebugOverlayRenderer.method1882
import ParticleEmitterFactoryStatics.method1886
import VideoAdChecker.method1889
import MediaStreamClient.Companion.method1897
import TileTransform.method1907
import BackgroundWorkerThread.Companion.method1910
import ConfigFlagUtil.Companion.method1912
import SmoothingBuffer.Companion.method1917
import EmoteDefinition.Companion.method1926
import ModelHeaderCache.Companion.method1931
import ChatCommandProcessor.method1944
import GlTexture3D.Companion.method1959
import GlTextureCubeMap.Companion.method1962
import GlTexture1D.Companion.method1973
import SpriteArchiveLoader.Companion.method306
import WalkingTypeUtil.method1979
import NpcDefinitionCache.Companion.method1980
import NpcDefinitionCache.Companion.method1987
import CompassSmoother.Companion.method2018
import SlotBinding.Companion.method2026
import SlotBinding.Companion.method2029
import LocDefinitionCache.Companion.method2036
import ProjectileConfigUtil.method315
import ArchiveFileConditionWrapper.Companion.method2043
import ParticleEffectCache.Companion.method2045
import SocketFactory.Companion.method2048
import BoundsConstraintEntry.Companion.method2055
import CollisionMapAccessor.method2064
import CollisionMapAccessor.method2065
import CollisionMapAccessor.method2066
import LocTypeConfig.Companion.method2071
import NativeSoundOutput.Companion.method2097
import ItemNameResolver.Companion.method318
import GroundDecorRenderer.Companion.method2104
import ClanChatRequestSender.method2107
import NpcEntityUpdater.method2111
import DataHolder.Companion.method2113
import DataHolder.Companion.method2114
import ViewportTransform.Companion.method2117
import GlBufferObject.Companion.method2124
import GlIndexBufferArb.Companion.method2132
import MaterialPass.Companion.method2135
import FixedFunctionMaterialPass.Companion.method2147
import WaterMaterialPass.Companion.method2148
import WaterMaterialPass.Companion.method2151
import GlslMaterialPass.Companion.method2156
import TexGenMaterialPass.Companion.method2160
import GlslEnvMaterialPass.Companion.method2163
import GlslEnvMaterialPass.Companion.method2164
import ScrollTexMaterialPass.Companion.method2166
import CubeMapMaterialPass.Companion.method2170
import CubeMapMaterialPass.Companion.method2171
import ParticleEmitterDef.Companion.method2185
import ParticleEmitterDefExt.Companion.method2190
import RegionSceneLoader.method2191
import MapArchiveSource.Companion.method2202
import LoadingBarRenderer.Companion.method2214
import LocalizedTextTriple.Companion.method2223
import HuffmanCodec.Companion.method2225
import HuffmanCodec.Companion.method2228
import PixelBlender.method2251
import CircleRasterizer.Companion.method2254
import CubemapTextureGlSource.Companion.method2265
import TextureCubeProvider.Companion.method2268
import CubemapTextureImplSource.Companion.method2272
import CacheStateResetter.method176
import HeightMapNoise.method2281
import ProjectileDefinition.method2286
import ParticleSystemRenderer.Companion.method2294
import ConfigVarProgress.Companion.method2310
import ItemModelDefinition.Companion.method328
import ResourceLoaderThread.Companion.method2317
import WidgetRedrawTracker.Companion.method2331
import SkyboxGradient.method2333
import ArchiveResourceProvider.Companion.method2344
import CacheIndexManager.Companion.method2354
import SceneGraphContainer.Companion.method2527
import TileSceneEntity.Companion.method2395
import GroundDecorSceneEntity.Companion.method2400
import SceneObjectEntity.Companion.method2405
import SceneObjectEntity.Companion.method2406
import DynamicSceneObjectEntity.Companion.method2407
import GroundDecorEntity.Companion.method2412
import ModelGroundDecor.Companion.method2415
import ProjectedGroundDecor.Companion.method2429
import MapElementDecor.Companion.method2469
import SceneNodeDeque.Companion.method2479
import WallEntity.Companion.method2484
import WallEntity.Companion.method2485
import ModelWallEntity.Companion.method2490
import SequencedWallEntity.Companion.method2492
import SceneModelBuilder.Companion.method2495
import SpotAnimEntity.Companion.method2508
import NamedTimedNode.Companion.method2517
import PositionedSceneNode.Companion.method2518
import MapElementDefinitionCache.Companion.method2545
import AbstractCameraTransformStatics.method2555
import SystemFontGlyphs.Companion.method2562
import RSFont.Companion.method2570
import RSFont.Companion.method2572
import SpriteMaskShape.Companion.method2597
import ShaderState.Companion.method2610
import ShaderStateVariant.method2611
import MaterialTypeMarker.Companion.method2613
import MaterialTypeVariant.method2614
import RenderQueueState.method2617
import PolygonFiller.method2621
import VideoStreamDecoder.Companion.method2631
import CalendarUtil.method2637
import SoundCacheState.method2640
import MapElementLookup.Companion.method2645
import CameraOrModelTransform.Companion.method2653
import CameraOrModelTransform.Companion.method2654
import HslPaletteState.method2657
import GlShaderProgramHandle.Companion.method2658
import MapTileShape.Companion.method2662
import MapRegionLoaderThread.Companion.method2664
import MapRegionLoaderThread.Companion.method2666
import SkeletalAnimFrameLoader.Companion.method347
import SkeletalAnimFrameLoader.Companion.method351
import RsaPacketDecoder.Companion.method2671
import RsaPacketDecoder.Companion.method2672
import TileRenderState.Companion.method2676
import TileRenderState.Companion.method2677
import TileRenderState.Companion.method2678
import ParticleProcessor.Companion.method2693
import AwtKeyboardListener.Companion.method2705
import DragDropController.Companion.method2707
import DragDropController.Companion.method2708
import VorbisAudioDecoder.Companion.method2785
import KeyEventNode.Companion.method2796
import BoundingBoxNode.Companion.method2798
import LongKeyNode.Companion.method2805
import MenuActionNode.Companion.method2810
import SynthVoiceGroup.Companion.method2823
import PcmStreamBuffer.Companion.method2830
import MidiSequencePlayer.Companion.method2871
import InterfaceBounds.Companion.method2941
import TerrainTileShape.Companion.method2728
import TextureTileRenderer.Companion.method2950
import CameraSplineNode.Companion.method2956
import OggBitstreamDecoder.Companion.method2962
import TheoraVideoStream.Companion.method2974
import NullOggStream.Companion.method2981
import KaraokeSubtitleStream.Companion.method2990
import ImageBoxBlurScroller.Companion.method2996
import MultiFieldRecord.Companion.method3001
import ShortKeyNode.Companion.method3003
import ModelVertexColorBuffer.Companion.method2738
import AbstractFrameBufferSurface.Companion.method3010
import ProducerImageSurface.Companion.method3016
import IntPair.Companion.method3026
import WidgetActionEntry.Companion.method3029
import TerrainShadowBuilderGl3.Companion.method3035
import ClientMachineInfo.Companion.method2748
import ClientLoadStateMachine.method3040
import ColorThresholdEffect.Companion.method3050
import BrightnessContrastEffect.Companion.method3074
import RadialGradientMaskEffect.Companion.method3075
import GrayscaleEffect.Companion.method3080
import BrightnessTextureNode.Companion.method3085
import CombineTextureNode.Companion.method3087
import CombineTextureNode.Companion.method3088
import SpriteTextureNode.Companion.method3091
import SpriteRgbTextureNode.Companion.method3092
import ConstantColourTextureNode.Companion.method3096
import DirectionalStripeTextureNode.Companion.method3053
import NoiseTextureNode.Companion.method3104
import WeaveTextureNode.Companion.method3106
import CellNoiseTextureNode.Companion.method3110
import GradientMapTextureNode.Companion.method3115
import RadialTextureNode.Companion.method3117
import ColourKeyTextureNode.Companion.method3118
import BlendTextureNode.Companion.method3121
import ScatterTextureNode.Companion.method3123
import NormalMapTextureNode.Companion.method3141
import NormalMapTextureNode.Companion.method3142
import DirectionalLightTextureNode.Companion.method3144
import SineWaveTextureNode.Companion.method3145
import BoxBlurTextureNode.Companion.method3148
import WorldMapScene.Companion.method3149
import RenderListTextureNode.Companion.method3152
import VoronoiNoiseTextureNode.Companion.method3059
import DisplaceTextureNode.Companion.method3062
import FlipTextureNode.Companion.method3066
import EdgeDetectTextureNode.Companion.method3071
import RegionSceneShifter.Companion.method3155
import ParamMap.Companion.method3165
import ParameterizedText.Companion.method3217
import CharCodeMap.Companion.method3220
import ContactEntry.Companion.method3228
import ContactEntry.Companion.method3229
import InterfaceComponentGroup.Companion.method3237
import InterfaceComponentGroup.Companion.method3243
import TimedTileQueueEntry.Companion.method3247
import AsyncResourceRequest.Companion.method3252
import StreamingResourceRequest.Companion.method3260
import CompletedResourceRequest.Companion.method3263
import ParticleEmitterListNode.Companion.method3274
import MinimapAreaMarkerNode.Companion.method3278
import SpriteRenderEntry.Companion.method3280
import LoadingScreenImageNode.Companion.method3176
import ShortMatrixNode.Companion.method3181
import ChatScriptListNode.Companion.method3190
import ChatCommandProcessor.method3199
import KeyedCacheEntryReference.Companion.method3204
import HardKeyedCacheEntryReference.Companion.method3208
import SpriteDefinition.Companion.method3300
import TimedRecordAccessor.Companion.method3314
import OutgoingPacketNode.Companion.method3323
import OutgoingPacketNode.Companion.method3327
import FloatBuffer.Companion.method3403
import CipheredPacketBuffer.Companion.method3414
import AbstractBloomEffect.Companion.method2757
import AbstractBloomEffect.Companion.method2762
import StringCacheNode.Companion.method3418
import DisplaySettingsConfig.Companion.method3430
import GlBloomEffect.Companion.method2765
import RegionTileNode.Companion.method2773
import FacingDirectionNode.Companion.method2774
import CharacterRenderState.Companion.method2780
import FormantSynthFilter.Companion.method3450
import LoadingBarRenderer.Companion.method3457
import RenderableEntry.Companion.method3458
import TextureMipDescriptor.Companion.method3462
import TextureCache.Companion.method3466
import TextureCache.Companion.method3468
import CompiledScriptCache.Companion.method3473
import SceneCollisionEntry.Companion.method3487
import ParticleGeometry.Companion.method3488
import TextureAtlasState.Companion.method3491
import AnimationFrameTable.method355
import CollisionMap.Companion.method3502
import CollisionMap.Companion.method3508
import Tooltip.method3511
import Tooltip.method3512
import MapElementManager.method3516
import RendererType.Companion.method3518
import GlTexture2DRegion.Companion.method3553
import GlGroundShaderPass.Companion.method3556
import GlGroundShaderPass.Companion.method3557
import GlWaterRenderPass.Companion.method3537
import GlCubemapLightPass.Companion.method3541
import GlEnvMappedWaterPass.Companion.method3552
import LocConfigModelBuilder.Companion.method3560
import WorldMapLabel.Companion.method3567
import WorldMapTextLabel.Companion.method3572
import WorldMapIconLabel.Companion.method3574
import CubemapTextureFactory.Companion.method3584
import MouseInputTracker.Companion.method3609
import BufferedFileReader.method3611
import PlayerAppearanceUpdateDecoder.method3613
import GlRenderDevice.Companion.method3968
import WidgetTextConfig.Companion.method363
import GlShaderObjectHandle.Companion.method367
import NpcModelTransform.Companion.method177
import MinimapTileEntry.Companion.method380
import MapSceneRenderer.method387
import NanoTimer.Companion.method445
import SpriteRenderable.Companion.method453
import WorldMapElement.Companion.method180
import MinimapShapeDrawer.Companion.method458
import MinimapSquareDrawer.Companion.method460
import MinimapLineDrawer.Companion.method471
import NpcConfig.Companion.method486
import RsaVarbitHandler.Companion.method492
import RsaVarbitHandler.Companion.method493
import FloorOverlayDefinition.Companion.method501
import OggMediaStream.Companion.method518
import OggCacheStream.Companion.method523
import ConnectionStateType.Companion.method526
import ConnectionStateType.Companion.method527
import MapSceneTile.Companion.method530
import NoiseTextureGenerator.Companion.method548
import GrayscaleNoiseTexture.Companion.method553
import ScrollingNoiseTexture.Companion.method556
import StaticNoiseTexture.Companion.method561
import CachedRgbNoiseTexture.Companion.method568
import CompositeRgbNoiseTexture.Companion.method570
import CompositeRgbNoiseTexture.Companion.method574
import ScrollbarComponent.Companion.method189
import ProportionalScrollbarComponent.Companion.method190
import SolidFillComponent.Companion.method191
import SolidFillComponent.Companion.method193
import SolidFillComponent.Companion.method198
import IdentKitRecolor.Companion.method207
import IdentKitRecolor.Companion.method208
import TerrainChunkBuilder.Companion.method584
import GameClock.method598
import GameClock.method599
import direct.Direct3dModel.Companion.method661
import direct.Direct3dModel.Companion.method676
import OpenGlModel.Companion.method681
import WorldMapImageBuilder.Companion.method698
import ChatCommandProcessor.method705
import ChatCommandProcessor.method713
import TooltipComponentRenderer.Companion.method716
import D3dRenderDevice.Companion.method722
import TrigLookupTables.Companion.method725
import PlayerSequenceSelector.method728
import PlayerSequenceSelector.method729
import HintArrowRenderer.Companion.method731
import MapRegionLoader.Companion.method746
import IsaacCipher.Companion.method782
import BufferedRandomAccessFile.Companion.method786
import NpcType.Companion.method804
import SynthSoundGenerator.Companion.method808
import FogState.method810
import WaterTextureSet.Companion.method815
import MapSceneCache.Companion.method817
import MapSceneCache.Companion.method825
import SceneNodeDeque.Companion.method843
import NativeLibraryState.method216
import RegionMapDecoder.method852
import NpcUpdateProcessor.method857
import NpcSpawnDecoder.method860
import JagGlToolkitFactory.method861
import AnimationFrameState.method866
import AnimationFrameState.method867
import DirectionUtil.method869
import NodeDequeHolder.Companion.method879
import SpriteBlitter.method883
import IOException_Sub1.Companion.method130
import InputStream_Sub1.Companion.method124
import InputStream_Sub2.Companion.method127
import ChatMessageStream.Companion.method139
import Player.Companion.method2458
import NativeSprite.Companion.method161
import RasterSprite.Companion.method167
import Renderer.Companion.method3680
import OpenGlRenderer.Companion.method3736
import NativeRenderer.Companion.method3870
import NativeRenderNode.Companion.method3288
import OpenGlRenderNode.Companion.method3295
import OpenGlTerrainTile.Companion.method4000
import NativeTerrainTile.Companion.method4006
import ShaderProgram.Companion.method3438
import NativeShaderProgram.Companion.method3441
import ArbVertexProgram.Companion.method3443
import ArbVertexProgram.Companion.method3444
import BinaryGraphicsOptionState.Companion.method1767
import DisplayModeOptionState.Companion.method1825
import GlRenderDevice.Companion.method3965
import GlVertexBufferArb.Companion.method2127
import ByteBufferStatics.method1713
import ChatCommandProcessor.anIntArray3295
import CompassSmoother.Companion.method2017
import ConfigFlagUtil.Companion.method1916
import FrameBufferObject.Companion.method1501
import FrameStatsReset.Companion.method1131
import HslAdjustTextureNode.Companion.method3126
import HslAdjustTextureNode.Companion.method3127
import MapArchiveSource.Companion.method1365
import InputStream_Sub2.Companion.method128
import InvertTextureNode.Companion.method3134
import KaraokeSubtitleStream.Companion.method2988
import MapLabelMenuEntry.Companion.method1041
import MaterialPass.Companion.method2138
import MultiLevelOptionState.Companion.method1851
import NoOpGraphicsOptionState.Companion.method1803
import ShadowQualityOptionState.Companion.method1788
import SkeletalAnimFrameLoader.Companion.method349
import SkyboxGradient.method2334
import SocketFactory.Companion.method2049
import TextureGenerator.Companion.method1397
import TileSceneEntity.Companion.method2396
import TwoStateOptionState.Companion.method1844
import WhirlpoolHash.Companion.method1166
import WidgetTextConfig.Companion.method362
import awt.Canvas
import awt.Component
import awt.Container
import awt.Frame
import io.ByteArrayInputStream
import io.IOException
import io.InvalidClassException
import io.ObjectInputStream
import io.OptionalDataException
import io.StreamCorruptedException
import java.lang.reflect.Field
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method
import net.Socket
import java.net.URL
import java.util.*
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlin.math.max
import kotlin.math.min
import kotlin.time.Clock
import kotlin.time.ExperimentalTime

class Client : GameAppletFrame() {
    private fun method101(i: Byte) {
        anInt5179++
        if (ClientMachineInfo.aMediaStreamClient_6601!!.anInt3213 > BinaryGraphicsOptionState.anInt5959) {
            CacheStateResetter.aServerConnectionInfo_125!!.method1259(0)
            TileRenderState.anInt4235 = (ClientMachineInfo.aMediaStreamClient_6601!!.anInt3213 * 50 + -50) * 5
            if (TileRenderState.anInt4235 > 3000) TileRenderState.anInt4235 = 3000
            if (ClientMachineInfo.aMediaStreamClient_6601!!.anInt3213 >= 2 && ClientMachineInfo.aMediaStreamClient_6601!!.anInt3214 == 6) {
                this.method82(-80, "js5connect_outofdate")
                WorldMapRenderer.anInt4674 = 14
                return
            }
            if (ClientMachineInfo.aMediaStreamClient_6601!!.anInt3213 >= 4 && ClientMachineInfo.aMediaStreamClient_6601!!.anInt3214 == -1) {
                this.method82(81, "js5crc")
                WorldMapRenderer.anInt4674 = 14
                return
            }
            if (ClientMachineInfo.aMediaStreamClient_6601!!.anInt3213 >= 4 && NpcSummaryDefinition.method1167(WorldMapRenderer.anInt4674, (-81).toByte())) {
                if (ClientMachineInfo.aMediaStreamClient_6601!!.anInt3214 != 7 && ClientMachineInfo.aMediaStreamClient_6601!!.anInt3214 != 9) {
                    if (ClientMachineInfo.aMediaStreamClient_6601!!.anInt3214 <= 0) this.method82(72, "js5io")
                    else if (AbstractFrameBufferSurface.aString6926 == null) this.method82(-116, "js5connect")
                    else this.method82(113, ("js5proxy_" + AbstractFrameBufferSurface.aString6926!!.trim { it <= ' ' }))
                } else this.method82(-93, "js5connect_full")
                WorldMapRenderer.anInt4674 = 14
                return
            }
        }
        BinaryGraphicsOptionState.anInt5959 = ClientMachineInfo.aMediaStreamClient_6601!!.anInt3213
        if (TileRenderState.anInt4235 > 0) TileRenderState.anInt4235--
        else {
            try {
                if (NanoTimer.anInt846 == 0) {
                    aLinkedQueueNode_114 = CacheStateResetter.aServerConnectionInfo_125!!.method1262((VorbisOggDecoder.aPrivilegedOperationWorker_8992!!), 36.toByte())
                    NanoTimer.anInt846++
                }
                if (NanoTimer.anInt846 == 1) {
                    if (aLinkedQueueNode_114!!.anInt1997 == 2) {
                        if (aLinkedQueueNode_114!!.anObject1998 != null) AbstractFrameBufferSurface.aString6926 = aLinkedQueueNode_114!!.anObject1998 as String?
                        method103(1000, 100.toByte())
                        return
                    }
                    if (aLinkedQueueNode_114!!.anInt1997 == 1) NanoTimer.anInt846++
                }
                if (NanoTimer.anInt846 == 2) {
                    TextureHandle.aSocketStreamWorker_2589 = SocketStreamWorker(aLinkedQueueNode_114!!.anObject1998 as Socket?, VorbisOggDecoder.aPrivilegedOperationWorker_8992, 25000)
                    val class348_sub49 = ByteBuffer(5)
                    class348_sub49.writeByte(false, (ScriptOpcodeHolder.aConfigIdPair_2341!!.anInt400))
                    class348_sub49.writeInt(103.toByte(), 634)
                    TextureHandle.aSocketStreamWorker_2589!!.method1470((class348_sub49.aByteArray7154!!), 5, 0, -1)
                    NanoTimer.anInt846++
                    Js5Archive.aLong667 = method599(-70)
                }
                if (NanoTimer.anInt846 == 3) {
                    if (NpcSummaryDefinition.method1167(WorldMapRenderer.anInt4674, (-100).toByte()) || TextureHandle.aSocketStreamWorker_2589!!.method1467(83.toByte()) > 0) {
                        val i_0_ = TextureHandle.aSocketStreamWorker_2589!!.method1473(0)
                        if (i_0_ != 0) {
                            method103(i_0_, 111.toByte())
                            return
                        }
                        NanoTimer.anInt846++
                    } else if (method599(-63) - Js5Archive.aLong667 > 30000) {
                        method103(1001, 85.toByte())
                        return
                    }
                }
                if (NanoTimer.anInt846 == 4) {
                    val bool = (NpcSummaryDefinition.method1167(WorldMapRenderer.anInt4674, (-100).toByte()) || method3196(WorldMapRenderer.anInt4674, -87) || method2672(WorldMapRenderer.anInt4674, -127))
                    val class267s = method2029(105)
                    val class348_sub49 = ByteBuffer(class267s!!.size * 4)
                    TextureHandle.aSocketStreamWorker_2589!!.method1474(class348_sub49.aByteArray7154!!, 0, (-72).toByte(), (class348_sub49.aByteArray7154)!!.size)
                    for (i_1_ in class267s.indices) class267s[i_1_]!!.method2030(1, class348_sub49.readInt((-126).toByte()))
                    ClientMachineInfo.aMediaStreamClient_6601!!.method1903(false, !bool, TextureHandle.aSocketStreamWorker_2589)
                    NanoTimer.anInt846 = 0
                    aLinkedQueueNode_114 = null
                    TextureHandle.aSocketStreamWorker_2589 = null
                }
                val i_2_ = 127 / ((1 - i) / 60)
            } catch (ioexception: IOException) {
                method103(1002, 127.toByte())
            }
        }
    }

    public override fun method92(i: Int) {
        if (ServerConnectionInfo.aBoolean2151) TextureDefinitionCache.anInt2964 = 64
        anInt5177++
        val frame = Frame("Jagex")
        frame.pack()
        frame.dispose()
        method3556(false)
        GlShaderObjectHandle.aScriptCompilerThread_520 = ScriptCompilerThread(VorbisOggDecoder.aPrivilegedOperationWorker_8992!!)
        ClientMachineInfo.aMediaStreamClient_6601 = MediaStreamClient()
        ByteArrayPool.method3230(intArrayOf(20, 260), intArrayOf(1000, 100), 0)
        if (NpcAnimationResolver.aNamedIdRecord_165 != OggCacheStream.aNamedIdRecord_5271) CacheLruCache.aByteArrayArray3882 = arrayOfNulls<ByteArray>(50)
        IntHashSetStatics.aClass348_Sub51_3959 = method247(24916)
        if (NpcAnimationResolver.aNamedIdRecord_165 == OggCacheStream.aNamedIdRecord_5271) GlElementArrayBuffer.aServerConnectionInfo_4839!!.aString2147 = this.getCodeBase()!!.getHost()
        else if (method2354(NpcAnimationResolver.aNamedIdRecord_165, i xor 0x7044.inv())) {
            GlElementArrayBuffer.aServerConnectionInfo_4839!!.aString2147 = this.getCodeBase()!!.getHost()
            GlElementArrayBuffer.aServerConnectionInfo_4839!!.anInt2148 = 40000 - -GlElementArrayBuffer.aServerConnectionInfo_4839!!.anInt2143
            ModelHeaderCache.aServerConnectionInfo_3285!!.anInt2148 = ModelHeaderCache.aServerConnectionInfo_3285!!.anInt2143 + 40000
            GlElementArrayBuffer.aServerConnectionInfo_4839!!.anInt2138 = 50000 - -GlElementArrayBuffer.aServerConnectionInfo_4839!!.anInt2143
            DirectionalLightTextureNode.aServerConnectionInfo_9443!!.anInt2148 = (DirectionalLightTextureNode.aServerConnectionInfo_9443!!.anInt2143 + 40000)
            ModelHeaderCache.aServerConnectionInfo_3285!!.anInt2138 = 50000 - -ModelHeaderCache.aServerConnectionInfo_3285!!.anInt2143
            DirectionalLightTextureNode.aServerConnectionInfo_9443!!.anInt2138 = (DirectionalLightTextureNode.aServerConnectionInfo_9443!!.anInt2143 + 50000)
        } else if (SceneObjectSpawner.aNamedIdRecord_1279 == NpcAnimationResolver.aNamedIdRecord_165) {
            GlElementArrayBuffer.aServerConnectionInfo_4839!!.aString2147 = "127.0.0.1"
            ModelHeaderCache.aServerConnectionInfo_3285!!.aString2147 = "127.0.0.1"
            GlElementArrayBuffer.aServerConnectionInfo_4839!!.anInt2148 = (40000 + GlElementArrayBuffer.aServerConnectionInfo_4839!!.anInt2143)
            DirectionalLightTextureNode.aServerConnectionInfo_9443!!.aString2147 = "127.0.0.1"
            ModelHeaderCache.aServerConnectionInfo_3285!!.anInt2148 = 40000 - -ModelHeaderCache.aServerConnectionInfo_3285!!.anInt2143
            DirectionalLightTextureNode.aServerConnectionInfo_9443!!.anInt2148 = 40000 - -DirectionalLightTextureNode.aServerConnectionInfo_9443!!.anInt2143
            GlElementArrayBuffer.aServerConnectionInfo_4839!!.anInt2138 = (GlElementArrayBuffer.aServerConnectionInfo_4839!!.anInt2143 + 50000)
            ModelHeaderCache.aServerConnectionInfo_3285!!.anInt2138 = ModelHeaderCache.aServerConnectionInfo_3285!!.anInt2143 + 50000
            DirectionalLightTextureNode.aServerConnectionInfo_9443!!.anInt2138 = 50000 - -DirectionalLightTextureNode.aServerConnectionInfo_9443!!.anInt2143
        }
        HslPaletteState.aShortArray4172 = ShortArray(256)
        LoadingScreenImageNode.aShortArray9502 = HslPaletteState.aShortArray4172
        NamedIdEntry.aShortArray6889 = LoadingScreenImageNode.aShortArray9502
        aShortArray6428 = NamedIdEntry.aShortArray6889
        if (Client.aSceneProjector_10434 == ParticleEmitterNode.aSceneProjector_186) TextureLoadExceptionStatics.aBoolean4599 = false
        if (GlRectangleTexture.aSceneProjector_8638 == Client.aSceneProjector_10434) {
            InputSettingsState.shiftClick = true
            SpriteLoadValidator.aShortArrayArray4791 = FacingDirectionNode.aShortArrayArray6664
            LocDefinitionCache.anInt3439 = 16777215
            GlWaterRenderPass.aShortArrayArrayArray7290 = DisplaySettingsConfig.aShortArrayArrayArray7262
            LocDefinitionCache.anInt3444 = 0
        } else if (Client.aSceneProjector_10434 == CustomCursorsOptionState.aSceneProjector_5932) {
            SpriteLoadValidator.aShortArrayArray4791 = LocDefinitionCache.aShortArrayArray3443
            GlWaterRenderPass.aShortArrayArrayArray7290 = ProjectedGroundDecor.aShortArrayArrayArray10253
        } else {
            SpriteLoadValidator.aShortArrayArray4791 = InvertTextureNode.aShortArrayArray9424
            GlWaterRenderPass.aShortArrayArrayArray7290 = BoundingBoxNode.aShortArrayArrayArray6736
        }
        CacheStateResetter.aServerConnectionInfo_125 = GlElementArrayBuffer.aServerConnectionInfo_4839
        try {
            BlendTextureNode.aClipboard9357 = NpcType.aClient1367!!.getToolkit().getSystemClipboard()
        } catch (exception: Exception) {
            /* empty */
        }
        LoadProgressCounters.aKeyboardInputSource_2449 = ModelVertexColorBuffer.method2743(ParticleSystemRenderer.aCanvas3869, (-124).toByte())
        GlTexture1D.aInputTracker_8552 = method2941(ParticleSystemRenderer.aCanvas3869, 0, true)
        //        try {
        if (VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aRandomAccessFileOnDisk_3785 != null) {
            TextureCubeProvider.aBufferedRandomAccessFile_6328 = BufferedRandomAccessFile((VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aRandomAccessFileOnDisk_3785!!), 5200, 0)
            for (i_3_ in 0..36) MinimapRenderer.aBufferedRandomAccessFileArray1579!![i_3_] = BufferedRandomAccessFile((VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aRandomAccessFileOnDiskArray3795!![i_3_]!!), 6000, 0)
            SceneObjectAnimator.aBufferedRandomAccessFile_3075 = BufferedRandomAccessFile((VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aRandomAccessFileOnDisk_3779!!), 6000, 0)
            LocTypeConfig.aIndexedFileCache_3568 = IndexedFileCache(255, TextureCubeProvider.aBufferedRandomAccessFile_6328, SceneObjectAnimator.aBufferedRandomAccessFile_3075, 500000)
            BufferedFileReader.aBufferedRandomAccessFile_4538 = BufferedRandomAccessFile((VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aRandomAccessFileOnDisk_3788!!), 24, 0)
            VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aRandomAccessFileOnDisk_3779 = null
            VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aRandomAccessFileOnDisk_3785 = null
            VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aRandomAccessFileOnDiskArray3795 = null
            VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aRandomAccessFileOnDisk_3788 = null
        }
        //        } catch (java.io.IOException ioexception) {
//            Class299_Sub2.aClass78_6328 = null;
//            Class235.aClass78_3075 = null;
//            Class374.aClass78_4538 = null;
//            Class277.aClass137_3568 = null;
//        }
        if (NpcAnimationResolver.aNamedIdRecord_165 != OggCacheStream.aNamedIdRecord_5271) PixelBlender.aBoolean3811 = true
        AsyncResourceRequest.aString9665 = LocalizedText.aLocalizedText_3495!!.method2063(ChatCommandProcessor.anInt6967, 544)
    }

    public override fun method91(i: Byte) {
        var i_4_: Int = anInt5190
        anInt5181++
        method110(31)
        method1497(16384)
        method1979(125.toByte())
        method3247(-74)
        LocalizedTextStatics.method2059(i.toInt() xor 0x1f.inv())
        method216(false)
        method2026(23377)
        method328(i.toInt() xor 0x6c)
        method1604(11868)
        method1246(-83)
        HashLinkedListNodeStatics.method3161(0)
        LinkedListNodeStatics.method2713(0)
        method1004(16.toByte())
        ChatCommandProcessor.method3478(false)
        method98(i + 32609)
        BufferPositionTracker.method1860((-89).toByte())
        method1641(85.toByte())
        AbstractCameraTransformStatics.method906(-31777)
        method3680(-24016)
        method3430(false)
        method2748(-86)
        method1310(true)
        NodeDequeStatics.method1994(-13722)
        method1471(124.toByte())
        method1897(119.toByte())
        ScriptCompilerThread.method1052((-124).toByte())
        method2671(0)
        method2344(i + -108)
        ChatCommandProcessor.method390(10.toByte())
        method786(0.toByte())
        method584(116.toByte())
        method1980(i.toInt() xor 0xe)
        method1284(-21165)
        method2036(121.toByte())
        method1378(14)
        method1208(55)
        method2045(62.toByte())
        method1395(82.toByte())
        SeqDefinitionCache.method2011((-71).toByte())
        TextureDefinitionLoader.method1179((-124).toByte())
        method1931(true)
        method1407(124.toByte())
        method825(i + -204)
        SpriteMaskShape.method305(79.toByte())
        method2545(true)
        method698(i + -106)
        ConfigArchiveLoader.method811((-123).toByte())
        KeyboardLayoutCache.method1975((-15).toByte())
        method1441(18.toByte())
        method1585(-1)
        method1624(28962)
        method3473(12949)
        AbstractGameSocketStatics.method1704((-95).toByte())
        method782(1)
        method3414(21515)
        HostPingThread.method1300((-128).toByte())
        NamedIdEntry.method2998((-35).toByte())
        method3508(2)
        method1698(1)
        method3237(42.toByte())
        method1917(40960)
        method2294(126)
        DoublyLinkedNodeList.method1873((-120).toByte())
        WidgetComponent.method442((-84).toByte())
        method530(14)
        method2458(true)
        method1627(116.toByte())
        method284(51.toByte())
        method501(1)
        ByteBufferStatics.method3376(i.toInt() xor 0x6d.inv())
        method3323(-44)
        method2429(-123)
        method3487(-65)
        method744(115.toByte())
        method3001(0)
        method3026(true)
        method3155(i + -113)
        method3199(i.toInt() xor 0x70)
        method866(-14603)
        method861(-76)
        MapElementManager.method2374((-125).toByte())
        method810(true)
        GameClock.method597((-122).toByte())
        method1086(true)
        method225(57.toByte())
        method1040(i + 404)
        method2251(16711680)
        method1261(108.toByte())
        WorldMapToggle.method2299((-128).toByte())
        TextureLoadExceptionStatics.method4010(-3)
        method883(66.toByte())
        CompletedResourceRequest.method3264((-24).toByte())
        method1325(-128)
        method1235(7.toByte())
        NpcType.method3269(true)
        method265(false)
        method1375(5616)
        CharCodeMap.method609((-52).toByte())
        method355(i + 4189)
        method1426(25165)
        method2254(i.toInt() xor 0x39bf.inv())
        method3613(64)
        method486(-123)
        method1096(i.toInt() xor 0x11)
        method171(72.toByte())
        TerrainTileStatics.method3988(i + -182)
        method804(-3752)
        method1564(104)
        method2572(23.toByte())
        RandomAccessFileOnDisk.method1659((-71).toByte())
        method1461(112.toByte())
        FogOptionState.method1807((-121).toByte())
        method1773(120.toByte())
        method1763(-15596)
        method1746(-15628)
        method1723(119.toByte())
        method1758(-16211)
        method1738(i + 21813)
        method1785(i.toInt() xor 0x64)
        method1780(i + -48)
        RemoveRoofsOptionState.method1814((-70).toByte())
        method1724(-4)
        method1822(110.toByte())
        method1832(1)
        method1841(16878)
        method1799(124)
        method1755(i + -107)
        method1816(1)
        method1794(63)
        method1769(100)
        method1835(i + -28702)
        ClientLoadStateMachine.method1715(103)
        method852(6)
        method3518(i.toInt() xor 0x34)
        ClientException.method140((-126).toByte())
        method158((-67).toByte())
        method3438(59.toByte())
        FontDefinition.method1180((-76).toByte())
        method879(96)
        AbstractTileShapeStatics.method2719(11339)
        method2412(true)
        method2389(1)
        method2871(-65)
        method1276(i + -199)
        method218(119.toByte())
        method713()
        method3457(true)
        method2055(1)
        method2990(125.toByte())
        method523(119)
        method2974(1)
        VorbisOggDecoder.method2968((-116).toByte())
        method2830(i.toInt() xor 0x6c)
        method3516(124)
        method255(6725)
        method287(51)
        method526(85)
        method2657(124.toByte())
        SceneTilePlaneManager.method261((-120).toByte())
        method1880(i + -221)
        method2225(i + -76)
        ParserSpecialCharsHolder.method1136((-98).toByte())
        method999(21745)
        method318(122)
        method1047(1)
        method1254(62.toByte())
        method746()
        method2317(79.toByte())
        method2281(1)
        method1169(false)
        method1351(1)
        method306(true)
        method1910(0)
        method1081(121.toByte())
        method1137(3)
        method2677(i.toInt() xor 0x33)
        method1200(false)
        HintIconState.method1366((-43).toByte())
        SceneObjectSpawner.method772((-113).toByte())
        method322(1)
        method2018(0)
        method2527()
        method1619(108.toByte())
        ProjectileConfigUtil.method316((-94).toByte())
        GlTexture3D.method2199(63.toByte())
        OpenGlModel.method1216((-97).toByte())
        method2286(114)
        method2645(i + -16777324)
        method2331(true)
        method2956(53.toByte())
        method2562()
        method722(13569)
        method1386(true)
        method380(0)
        method3029(126)
        method3278(1)
        method1298(-1)
        method3252(353)
        method445(i.toInt() xor 0x6e)
        RSFont.method1543(-4524)
        method2395(50.toByte())
        method2406(i.toInt() xor 0x12.inv())
        method2479(i + 19316)
        method2484(0)
        method1198(1010)
        RenderNodeStatics.method3285(88)
        method1355(-108)
        method731()
        method1126(32)
        LoadingBarRenderer.method2682(i.toInt() xor 0x29)
        method1267(85.toByte())
        GraphicsOptionState.method3024(-100)
        method177()
        UnderlayDefinition.method1609((-121).toByte())
        SizeBoundedSoftCache.method1349((-121).toByte())
        method3560(-13)
        method1062(35.toByte())
        method1013(114.toByte())
        method2785()
        method3491(1)
        method2805(113.toByte())
        method2071(-128)
        HslColorConfig.method293((-83).toByte())
        method351(80)
        method1194(10)
        method1594(-1966608624)
        method1926(-127)
        LocTypeDefinition.method2549((-85).toByte())
        method3165(44.toByte())
        MinimapStateReset.method1369(2.toByte())
        ScriptOpcodeHolder.method1334((-110).toByte())
        method1061(16711680)
        CacheLruCache.method2306((-90).toByte())
        method948(false)
        method2107(77.toByte())
        method2111(68.toByte())
        method1195(127.toByte())
        method857(126)
        method2191(0)
        ItemActionPacketSender.method1236((-110).toByte())
        method1463(25.toByte())
        method2506((-46).toByte())
        method2469(true)
        method2640(true)
        method869(3)
        FileIoUtil.method2604((-102).toByte())
        method3217(61.toByte())
        SolidFillComponent.method1164((-52).toByte())
        method2407(false)
        method1673(i.toInt() xor 0x75.inv())
        method2492(1)
        WallSceneEntity.method2398((-83).toByte())
        method1889(255)
        method2705(i + 14537)
        method3609(48.toByte())
        HeapInfoRecord.method1612((-9).toByte())
        TypedRecordTable.method2180((-72).toByte())
        method1447(i.toInt() xor 0x20)
        method492(i + -216)
        method3574(i.toInt() xor 0x4c47)
        MinimapSpriteRenderer.method1109((-22).toByte())
        method2190(true)
        method3572(1000000)
        method2185(2)
        method1249(true)
        method2664(i.toInt() xor 0x6f)
        ProceduralTextureGraph.method3187((-52).toByte())
        method1064(-3)
        MapAreaDefinition.method1421((-85).toByte())
        method3220(102.toByte())
        if (i.toInt() != 108) anInt5171 = -60
        method2962(-31055)
        method1944(1)
        method2662(4)
        method120(false)
        method387(67)
        method2048(1)
        method130(i + -100)
        method2637(i + -108)
        method2333(false)
        ModelDataCache.method296((-99).toByte())
        method176(-1)
        IntHashSetStatics.method2366(true)
        SpriteMaskShape.method2690(-124)
        method1551()
        TerrainChunkBuilder.method370(true)
        method3202(79.toByte())
        method1886(4908)
        method3204(-112)
        method3068(i + 13607)
        method2400(3.toByte())
        method2415(61)
        method860(44.toByte())
        method2490(4)
        InterfaceBounds.method2936((-25).toByte())
        method3028(-11677)
        method3418(114)
        AbstractMenuEntryStatics.method1030(-24)
        method2113(74.toByte())
        method3300(0)
        method1493()
        method2823(i + -108)
        SoundBankPatch.method2930((-87).toByte())
        method808()
        method1536()
        FacingDirectionNode.method2775((-127).toByte())
        method2097()
        method1882(25365)
        method2981(false)
        method1139(2767)
        method3040(true)
        method2310(69.toByte())
        method2202(-17902)
        FileExistsCondition.method741((-128).toByte())
        method1159(112.toByte())
        ClickFeedbackTask.method1354((-22).toByte())
        method1853(48.toByte())
        method1117(105)
        method1120(1)
        method193(i + -78)
        method180(-19960)
        method3567(i.toInt() xor 0x24.inv())
        method189(121.toByte())
        method716(1)
        SplashImageLoadable.method2023((-78).toByte())
        method190(32.toByte())
        method2223(i.toInt() xor 0x5)
        method728(true)
        method2621()
        method2214(0)
        method1123(-1)
        method3611(true)
        method3280(-109)
        method2518(137)
        method2508(i.toInt() xor 0x7f93)
        method1239(30114)
        method2495(113.toByte())
        method2065(31913)
        method548(10)
        method2555(28.toByte())
        SceneNodeDeque.method1431(0)
        HardKeyedCacheEntryReference.method3207((-120).toByte())
        method2693(3)
        method3085(0)
        method3091(true)
        StringValueNode.method3318((-80).toByte())
        method3010(-1316)
        method453(-2001)
        method911(0)
        method1293(1)
        method3736(100.toByte())
        method3468(-1401)
        method886(16)
        method277(115.toByte())
        method2765(2048)
        method1653(i + 1489574628)
        method938(47)
        method1411(true)
        method1499(i + -235)
        Texture2DProvider.method2258((-122).toByte())
        method681(i + -14)
        method1091(-9341)
        method3403(84)
        method1962(-1)
        method3870(113)
        method2597(-27327)
        method719(72.toByte())
        NormalMapGenerator.method2042((-67).toByte())
        method925(i + -6105)
        method1912(8549)
        method1632(-11)
        method2268(-24054)
        method1329(4)
        method2104(88)
        method1127(5125)
        method676(126)
        method725(16384)
        method1057(true)
        method288(119.toByte())
        method3968(15)
        method3450()
        method3096(i.toInt() xor 0x7ea2)
        BlankTextureNode.method3099((-121).toByte())
        SourceRowTextureNode.method3057((-54).toByte())
        method3110(-1633784916)
        method3148(true)
        method3149(104)
        method3087(false)
        method3066(-1)
        GradientLookupEffect.method3077((-98).toByte())
        method3118(127.toByte())
        method3145(0)
        method3104(false)
        method3075(false)
        method3059(-120)
        method3053(4)
        method3092(-1)
        method3062(true)
        method3121(104.toByte())
        InvertTextureNode.method3133((-109).toByte())
        WarpTextureNode.method3138((-115).toByte())
        method3080(111.toByte())
        method3050(true)
        method3115(-114)
        TurbulenceTextureNode.method3114((-123).toByte())
        method3152(255)
        method3074(i.toInt() xor 0x6c)
        method3117(109)
        method3144(119.toByte())
        method3142(0)
        method3071(59.toByte())
        method3106(97.toByte())
        method3123(i + -108)
        method2996()
        FloatGrid.method1584((-64).toByte())
        method167(19612)
        method208(0.toByte())
        method3016(65280)
        HashTileShape.method2731((-23).toByte())
        method221(0)
        method1645(121)
        method953(9.toByte())
        method4000(i.toInt() xor 0x216c)
        method2658(true)
        method1959(-112)
        method2762(108)
        method2135(0)
        method815(false)
        ArbFogMaterialPass.method2142((-126).toByte())
        method1075(17.toByte())
        ColourAdjustment.method448((-16).toByte())
        method3295(i + -109)
        method3441(1)
        method161(114)
        method2950(71)
        RefCountedHandle.method1322((-28).toByte())
        method2728(9.toByte())
        method2265(-10794)
        GlElementArrayBuffer.method1155((-125).toByte())
        method1149(99)
        method1154(11.toByte())
        method2151(-86)
        method2166(i.toInt() xor 0x18ac)
        method1973(24885)
        method2160(0)
        method2147(i.toInt() xor 0x6c.inv())
        method2171(i + -108)
        method2164(true)
        method2156(77)
        method1866(0)
        method1628(54.toByte())
        method1529(true)
        method3444(i + -198)
        method3462(-30094)
        method2654(-6896)
        method3288(74.toByte())
        method3512(4)
        method1400(i + -107)
        IndexedSprite.method162((-112).toByte())
        method4006(-43)
        method2738(82.toByte())
        method2631(127)
        method2272(88)
        BasicGlRenderPass.method3539((-32).toByte())
        method3541(23.toByte())
        FixedFunctionWaterPass.method3550((-122).toByte())
        AbstractCameraTransformStatics.method3554(i + -107)
        method553(0)
        RgbNoiseTexture.method564((-54).toByte())
        method1396(25)
        method1907(49.toByte())
        method242(true)
        method237(false)
        method251(2.toByte())
        method3557(true)
        method1440(-127)
        method3537(i.toInt() xor 0x864c)
        method3552(i.toInt() xor 0x3b)
        ByteBuffer.method851(i + -107)
        method2124(0)
        method2132(-125)
        method1133(96)
        method2610(true)
        method2611(-123)
        method2617(93.toByte())
        method2614(i.toInt() xor 0x4d)
        method2613(-1)
        method3003(-4587)
        TerrainShadowBuilderGl2.method3020((-64).toByte())
        method3035(1)
        method367(-15833)
        method2517(4.toByte())
        method3274(true)
        method3190(false)
        method3314(5)
        method2810(79.toByte())
        method3458(i + 2564)
        method127(118.toByte())
        method139(88)
        method1112(1)
        method3488(64)
        method3181(2.toByte())
        method2773(0)
        method2798(122)
        method3228(75)
        method2796(104.toByte())
        method1525(4.toByte())
        FireParticleStream.method133((-41).toByte())
        method124(i.toInt() xor 0x6e)
        method2117(0)
        OSInfo.method2993(50.toByte())
        CubemapTextureGlSource.method2768(3)
        method3176(true)
        method2707(false)
        NpcAnimationResolver.method213((-106).toByte())
        method2043(true)
        method570(105)
        method1438(-120)
        SceneTileBounds.method601((-85).toByte())
        method1209(i + -51)
        method458(-14487)
        method471(i.toInt() xor 0x751c.inv())
        MinimapPolygonDrawer.method469((-62).toByte())
        method460(i.toInt() xor 0x6e)
        method561(120)
        method568(true)
        if (aBoolean41) anInt5190 = ++i_4_
    }

    private fun method102(i: Byte) {
        if (i.toInt() != 61) method106()
        anInt5184++
        val bool = ClientMachineInfo.aMediaStreamClient_6601!!.method1893(99.toByte())
        if (!bool) method101((-112).toByte())
    }

    private fun method103(i: Int, i_5_: Byte) {
        anInt5182++
        ClientMachineInfo.aMediaStreamClient_6601!!.anInt3213++
        aLinkedQueueNode_114 = null
        ClientMachineInfo.aMediaStreamClient_6601!!.anInt3214 = i
        if (i_5_ > 74) {
            NanoTimer.anInt846 = 0
            TextureHandle.aSocketStreamWorker_2589 = null
        }
    }

    public override fun method80(i: Int) {
        if (ScanlineRasterFiller.aBoolean2469) method2405(i + -110)
        anInt5170++
        method556(false)
        if (FacingDirectionNode.aRenderer6654 != null) FacingDirectionNode.aRenderer6654!!.method3635(89.toByte())
        if (SkeletalAnimFrameLoader.aFrame476 != null) {
            method527(SkeletalAnimFrameLoader.aFrame476, VorbisOggDecoder.aPrivilegedOperationWorker_8992, false)
            SkeletalAnimFrameLoader.aFrame476 = null
        }
        if (Client.aAbstractGameSocket_9165 != null) {
            Client.aAbstractGameSocket_9165!!.method1700(36.toByte())
            Client.aAbstractGameSocket_9165 = null
        }
        method1265(16)
        ClientMachineInfo.aMediaStreamClient_6601!!.method1901(i xor 0x44.inv())
        GlShaderObjectHandle.aScriptCompilerThread_520!!.method1051(true)
        if (SceneObjectSpawner.aHostPingThread_1286 != null) {
            SceneObjectSpawner.aHostPingThread_1286!!.method1303(16.toByte())
            SceneObjectSpawner.aHostPingThread_1286 = null
        }
        try {
            TextureCubeProvider.aBufferedRandomAccessFile_6328!!.method790((-62).toByte())
            for (i_6_ in i..36) MinimapRenderer.aBufferedRandomAccessFileArray1579!![i_6_]!!.method790(118.toByte())
            SceneObjectAnimator.aBufferedRandomAccessFile_3075!!.method790((-84).toByte())
            BufferedFileReader.aBufferedRandomAccessFile_4538!!.method790(80.toByte())
            StringValueNode.method3317((-53).toByte())
        } catch (exception: Exception) {
            /* empty */
        }
    }

    public override fun method99(i: Byte) {
        if (i.toInt() != 93) anIntArray5176 = null
        anInt5183++
        if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 2) {
            try {
                method114(i.toInt() xor 0x66)
            } catch (throwable: Throwable) {
                method1242((throwable.message + " (Recovered) " + method81(115.toByte())), throwable, 15004)
                NpcSummaryDefinition.aBoolean1952 = true
                method3553(false, 102.toByte(), 0)
            }
        } else method114(123)
    }

    public override fun init() {
        anInt5180++
        if (this.method89(48)) {
            GlElementArrayBuffer.aServerConnectionInfo_4839 = ServerConnectionInfo()
            GlElementArrayBuffer.aServerConnectionInfo_4839!!.anInt2143 = this.getParameter("worldid")!!.toInt()
            ModelHeaderCache.aServerConnectionInfo_3285 = ServerConnectionInfo()
            ModelHeaderCache.aServerConnectionInfo_3285!!.anInt2143 = this.getParameter("lobbyid")!!.toInt()
            ModelHeaderCache.aServerConnectionInfo_3285!!.aString2147 = this.getParameter("lobbyaddress")
            DirectionalLightTextureNode.aServerConnectionInfo_9443 = ServerConnectionInfo()
            DirectionalLightTextureNode.aServerConnectionInfo_9443!!.anInt2143 = this.getParameter("demoid")!!.toInt()
            DirectionalLightTextureNode.aServerConnectionInfo_9443!!.aString2147 = this.getParameter("demoaddress")
            NpcAnimationResolver.aNamedIdRecord_165 = (FacingDirectionNode.method2776((-93).toByte(), this.getParameter("modewhere")!!.toInt()))
            if (SceneObjectSpawner.aNamedIdRecord_1279 == NpcAnimationResolver.aNamedIdRecord_165) {
                NpcAnimationResolver.aNamedIdRecord_165 = GroundItemRenderState.aNamedIdRecord_1657
            } else if (!method2354(NpcAnimationResolver.aNamedIdRecord_165, -1) && OggCacheStream.aNamedIdRecord_5271 != NpcAnimationResolver.aNamedIdRecord_165) {
                NpcAnimationResolver.aNamedIdRecord_165 = OggCacheStream.aNamedIdRecord_5271
            }
            SceneRegionState.aHudTabPanel_196 = (method1677(-121, this.getParameter("modewhat")!!.toInt()))
            if (SceneRegionState.aHudTabPanel_196 != ParticleEmitterDef.aHudTabPanel_4953 && SceneRegionState.aHudTabPanel_196 != NoiseTextureNode.aHudTabPanel_9263 && Client.aHudTabPanel_1189 != SceneRegionState.aHudTabPanel_196) SceneRegionState.aHudTabPanel_196 = Client.aHudTabPanel_1189
            try {
                ChatCommandProcessor.anInt6967 = this.getParameter("lang")!!.toInt()
            } catch (exception: Exception) {
                ChatCommandProcessor.anInt6967 = 0
            }
            val string = this.getParameter("objecttag")
            aBoolean6997 = string != null && string == "1"
            val string_24_ = this.getParameter("js")
            RegionSceneLoader.aBoolean3697 = string_24_ != null && string_24_ == "1"
            val string_25_ = this.getParameter("advert")
            WallEntity.aBoolean8773 = string_25_ != null && string_25_ == "1"
            val string_26_ = this.getParameter("game")
            if (string_26_ != null) {
                if (string_26_ == "0") Client.aSceneProjector_10434 = ParticleEmitterNode.aSceneProjector_186
                else if (string_26_ == "1") Client.aSceneProjector_10434 = GlRectangleTexture.aSceneProjector_8638
                else if (string_26_ != "2") {
                    if (string_26_ == "3") Client.aSceneProjector_10434 = CustomCursorsOptionState.aSceneProjector_5932
                } else Client.aSceneProjector_10434 = GlslEnvMaterialPass.aSceneProjector_6262
            }
            try {
                SocketStreamWorker.anInt2670 = this.getParameter("affid")!!.toInt()
            } catch (exception: Exception) {
                SocketStreamWorker.anInt2670 = 0
            }
            InputSettingsState.aString1761 = this.getParameter("quiturl")
            BloomGraphicsOptionState.aString5966 = this.getParameter("settings")
            if (BloomGraphicsOptionState.aString5966 == null) BloomGraphicsOptionState.aString5966 = ""
            VideoStreamDecoder.aBoolean4127 = "1" == this.getParameter("under")
            val string_27_ = this.getParameter("country")
            if (string_27_ != null) {
                try {
                    Renderer.anInt4583 = string_27_.toInt()
                } catch (exception: Exception) {
                    Renderer.anInt4583 = 0
                }
            }
            UnderlayDefinition.anInt2884 = this.getParameter("colourid")!!.toInt()
            if (UnderlayDefinition.anInt2884 < 0 || GlVertexBufferBase.aColorArray1928!!.size <= UnderlayDefinition.anInt2884) UnderlayDefinition.anInt2884 = 0
            if (this.getParameter("sitesettings_member")!!.toInt() == 1) {
                ItemActionPacketSender.aBoolean2110 = true
                FrameBufferObject.aBoolean4888 = ItemActionPacketSender.aBoolean2110
            }
            val string_28_ = this.getParameter("frombilling")
            if (string_28_ != null && string_28_ == "true") PlayerAppearanceUpdateDecoder.aBoolean4540 = true
            NullOggStream.aString9043 = this.getParameter("sskey")
            if (NullOggStream.aString9043 != null && NullOggStream.aString9043!!.length < 2) NullOggStream.aString9043 = null
            val string_29_ = this.getParameter("force64mb")
            if (string_29_ != null && string_29_ == "true") ServerConnectionInfo.aBoolean2151 = true
            val string_30_ = this.getParameter("worldflags")
            if (string_30_ != null) {
                try {
                    ConfigFlagUtil.anInt3234 = string_30_.toInt()
                } catch (exception: Exception) {
                    /* empty */
                }
            }
            val string_31_ = this.getParameter("userFlow")
            if (string_31_ != null) {
                try {
                    TextureMetadataProvider.aLong4615 = string_31_.toLong()
                } catch (numberformatexception: NumberFormatException) {
                    /* empty */
                }
            }
            Gl2dTexture.aString8605 = this.getParameter("additionalInfo")
            if (Gl2dTexture.aString8605 != null && Gl2dTexture.aString8605!!.length > 50) Gl2dTexture.aString8605 = null
            if (ParticleEmitterNode.aSceneProjector_186 == Client.aSceneProjector_10434) {
                OpenGlRenderer.anInt7666 = 503
                NpcSpawnDecoder.anInt1524 = 765
            } else if (Client.aSceneProjector_10434 == GlRectangleTexture.aSceneProjector_8638) {
                NpcSpawnDecoder.anInt1524 = 640
                OpenGlRenderer.anInt7666 = 480
            }
            NpcType.aClient1367 = this
            this.method95(NpcSpawnDecoder.anInt1524, 634, OpenGlRenderer.anInt7666, SceneRegionState.aHudTabPanel_196!!.method1640(0) + 32, 37, Client.aSceneProjector_10434!!.aString2985, 50)
        }
    }

    public override fun method93(i: Int) {
        if (i != -11018) method80(9)
        anInt5186++
        if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 2) {
            try {
                method116(true)
            } catch (throwable: Throwable) {
                method1242((throwable.message + " (Recovered) " + method81(52.toByte())), throwable, 15004)
                NpcSummaryDefinition.aBoolean1952 = true
                method3553(false, 123.toByte(), 0)
            }
        } else method116(true)
    }

    private fun method113(i: Byte) {
        if (WorldMapRenderer.anInt4674 == 7 && NpcDefinition.anInt2955 == 0) {
            if (RegionSceneLoader.anInt3699 > 1) {
                TurbulenceTextureNode.anInt9313 = ResourceLoaderThread.anInt3918
                RegionSceneLoader.anInt3699--
            }
            if (!ScrollbarComponent.aBoolean8335) method661(111.toByte())
            for (i_95_ in 0..99) {
                if (!MapArchiveSource.method2203((-85).toByte())) break
            }
        }
        anInt5174++
        DisplaySettingsConfig.anInt7267++
        method198(null, false, -1, -1)
        method1343(-1, null, 1, -1)
        FloatGrid.method1583((-73).toByte())
        ResourceLoaderThread.anInt3918++
        var i_96_ = 0
        while (TerrainShadowBuilderGl2.anInt6930 > i_96_) {
            val npc = (TurbulenceTextureNode.aClass348_Sub22Array9319!![i_96_]!!.aNpc_6859)
            if (npc != null) {
                val i_97_ = (npc.aNpcType_10505!!.aByte1325)
                if ((i_97_.toInt() and 0x1) != 0) {
                    val i_98_ = npc.method2436(117.toByte())
                    if ((0x2 and i_97_.toInt()) != 0 && npc.anInt10319 == 0 && Math.random() * 1000.0 < 10.0) {
                        val i_99_ = Math.round(-5.0 + 10.0 * Math.random()).toInt()
                        val i_100_ = Math.round(10.0 * Math.random() - 5.0).toInt()
                        if (i_99_ != 0 || i_100_ != 0) {
                            var i_101_ = ((npc.anIntArray10320!![0]) - -i_99_)
                            if (i_101_ < 0) i_101_ = 0
                            else if (i_101_ > GlCubemapLightPass.anInt7319 + -i_98_ + -1) i_101_ = -1 + (-i_98_ + GlCubemapLightPass.anInt7319)
                            var i_102_ = i_100_ + (npc.anIntArray10317!![0])
                            if (i_102_ < 0) i_102_ = 0
                            else if ((-i_98_ + RangeThresholdTextureNode.anInt9109 - 1) < i_102_) i_102_ = (-i_98_ + RangeThresholdTextureNode.anInt9109 - 1)
                            var i_103_ = (method574(i_101_, i_98_, i_98_, RadialGradientMaskEffect.anIntArray9185, true, 120.toByte(), -1, (npc.anIntArray10320!![0]), (npc.anIntArray10317!![0]), InterfaceComponentGroup.anIntArray9626, i_102_, (TimedRecordAccessor.aCollisionMapArray7108s!![(npc.plane).toInt()]), i_98_, 0, 0))
                            if (i_103_ > 0) {
                                if (i_103_ > 9) i_103_ = 9
                                var i_104_ = 0
                                while (i_103_ > i_104_) {
                                    npc.anIntArray10320!![i_104_] = (InterfaceComponentGroup.anIntArray9626!![-1 + (-i_104_ + i_103_)])
                                    npc.anIntArray10317!![i_104_] = (RadialGradientMaskEffect.anIntArray9185!![-1 + (-i_104_ + i_103_)])
                                    npc.aByteArray10321!![i_104_] = 1.toByte()
                                    i_104_++
                                }
                                npc.anInt10319 = i_103_
                            }
                        }
                    }
                    method1600(true, 0, npc)
                    val i_105_ = (method2774(108.toByte(), npc))
                    method3443(true, npc)
                    method729(SceneObjectAnimator.anInt3062, i_105_, 122.toByte(), npc, ScrollingWidgetComponentNode.anInt8387)
                    method3208(npc, SceneObjectAnimator.anInt3062, -84)
                    method1635(-106, npc)
                }
            }
            i_96_++
        }
        if (NpcDefinition.anInt2955 == 0 && GlWaterRenderPass.anInt7297 == 0) {
            if (WeaveTextureNode.anInt9282 == 2) method241(127.toByte())
            else CameraSplineNode.method2954((-127).toByte())
            if (GlslMaterialPass.anInt6246 shr 9 < 14 || (GlslMaterialPass.anInt6246 shr 9 >= -14 + GlCubemapLightPass.anInt7319) || (CompositeRgbNoiseTexture.anInt8685 shr 9 < 14) || (RangeThresholdTextureNode.anInt9109 + -14 <= CompositeRgbNoiseTexture.anInt8685 shr 9)) AbstractCameraTransformStatics.method893((-49).toByte())
        }
        if (i.toInt() != 112) anInt5171 = 22
        while (true) {
            val class348_sub36 = BufferedOutputStreamWorker.aNodeDeque_2707!!.method1997(8) as WidgetActionEntry?
            if (class348_sub36 == null) break
            val class46 = class348_sub36.aWidgetComponent_6989
            if (class46!!.anInt704 >= 0) {
                val class46_106_ = method2570(i.toInt() xor 0x5a2d8500, class46.anInt834)
                if (class46_106_ == null || class46_106_.aWidgetComponentArray798 == null || (class46_106_.aWidgetComponentArray798!!.size <= class46.anInt704) || class46 != (class46_106_.aWidgetComponentArray798!![class46.anInt704])) {
                    continue
                }
            }
            method705(class348_sub36)
        }
        while (true) {
            val class348_sub36 = (RendererType.aNodeDeque_4473!!.method1997(i + -104) as WidgetActionEntry?)
            if (class348_sub36 == null) break
            val class46 = class348_sub36.aWidgetComponent_6989
            if (class46!!.anInt704 >= 0) {
                val class46_107_ = method2570(1512932720, class46.anInt834)
                if (class46_107_ == null || class46_107_.aWidgetComponentArray798 == null || (class46_107_.aWidgetComponentArray798!!.size <= class46.anInt704) || class46 != (class46_107_.aWidgetComponentArray798!![class46.anInt704])) {
                    continue
                }
            }
            method705(class348_sub36)
        }
        while (true) {
            val class348_sub36 = (HashTileShape.aNodeDeque_8810!!.method1997(i.toInt() xor 0x78) as WidgetActionEntry?)
            if (class348_sub36 == null) break
            val class46 = class348_sub36.aWidgetComponent_6989
            if (class46!!.anInt704 >= 0) {
                val class46_108_ = method2570(1512932720, class46.anInt834)
                if (class46_108_ == null || class46_108_.aWidgetComponentArray798 == null || (class46_108_.aWidgetComponentArray798!!.size <= class46.anInt704) || class46 != (class46_108_.aWidgetComponentArray798!![class46.anInt704])) {
                    continue
                }
            }
            method705(class348_sub36)
        }
        if (RegionSceneLoader.aWidgetComponent_3701 != null) method2708(-30206)
        if (GlGroundShaderPass.anInt7396 % 1500 == 0) method3088(9)
        if (WorldMapRenderer.anInt4674 == 7 && NpcDefinition.anInt2955 == 0) method1987(-124)
        AbstractCameraTransformStatics.method909(3553)
        if (ScanlineRasterFiller.aBoolean2469 && (SkeletalAnimFrameLoader.aLong482 < method599(-107) + -60000L)) method2405(41)
        var class318_sub9_sub1 = (InterfaceComponentGroup.aDoublyLinkedNodeList_9642!!.method1872(8) as NamedTimedNode?)
        while (class318_sub9_sub1 != null) {
            if (class318_sub9_sub1.anInt8787.toLong() < -5L + method599(-80) / 1000L) {
                if (class318_sub9_sub1.aShort8786 > 0) FixedFunctionMaterialPass.method2144("", 5, (-91).toByte(), 0, (class318_sub9_sub1.aString8783 + LocalizedText.aLocalizedText_3502!!.method2063(ChatCommandProcessor.anInt6967, 544)), "", "")
                if (class318_sub9_sub1.aShort8786.toInt() == 0) FixedFunctionMaterialPass.method2144("", 5, (-105).toByte(), 0, (class318_sub9_sub1.aString8783 + LocalizedText.aLocalizedText_3503!!.method2063((ChatCommandProcessor.anInt6967), i.toInt() xor 0x250)), "", "")
                class318_sub9_sub1.method2373(false)
            }
            class318_sub9_sub1 = InterfaceComponentGroup.aDoublyLinkedNodeList_9642!!.method1878((-43).toByte()) as NamedTimedNode?
        }
        do {
            if (WorldMapRenderer.anInt4674 == 7 && NpcDefinition.anInt2955 == 0) {
                if (Client.aAbstractGameSocket_9165 == null) method3141(false, 11.toByte())
                else {
                    SceneRegionState.anInt193++
                    if (SceneRegionState.anInt193 > 50) {
                        IOException_Sub1.anInt88++
                        val class348_sub47 = method2148((RangedGraphicsOptionState.aFontMetaRef_5938), (TheoraVideoStream.aIsaacCipher_9029), -104)
                        method3243(-49, class348_sub47)
                    }
                    try {
                        method1802(0)
                    } catch (ioexception: IOException) {
                        method3141(false, 11.toByte())
                        break
                    }
                    break
                }
                break
            }
        } while (false)
    }

    @OptIn(ExperimentalTime::class)
    private fun method114(i: Int) {
        anInt5188++
        if (WorldMapRenderer.anInt4674 != 14) {
            GlGroundShaderPass.anInt7396++
            if (GlGroundShaderPass.anInt7396 % 1000 == 1) {
                val ldt = Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault())
                SpriteRenderEntry.anInt4383 = (ldt.time.hour * 600 + ldt.time.minute * 10 + ldt.time.second / 6)
                FireParticleStream.aRandom93!!.setSeed(SpriteRenderEntry.anInt4383.toLong())
            }
            if (GlGroundShaderPass.anInt7396 % 50 == 0) {
                ModelResourceBundle.anInt7134 = FogState.anInt1433
                FogState.anInt1433 = 0
                CompassSmoother.anInt3372 = MinimapRectClipper.anInt221
                MinimapRectClipper.anInt221 = 0
            }
            method102(61.toByte())
            if (SizeBoundedSoftCache.aRsaPacketDecoder_2327 != null) SizeBoundedSoftCache.aRsaPacketDecoder_2327!!.method2670(0)
            method2228(0)
            method3260(66)
            LoadProgressCounters.aKeyboardInputSource_2449!!.method2695(67)
            GlTexture1D.aInputTracker_8552!!.method3589(0)
            if (FacingDirectionNode.aRenderer6654 != null) FacingDirectionNode.aRenderer6654!!.method3646(method599(-74).toInt())
            method1315(93)
            CameraConfigDefinition.anInt3246 = 0
            MinimapAreaMarkerNode.anInt9699 = 0
            var interface6 = LoadProgressCounters.aKeyboardInputSource_2449!!.method2697(0)
            while (interface6 != null) {
                val i_109_ = interface6.method27(26276)
                if (i_109_ == 2 || i_109_ == 3) {
                    val i_110_ = interface6.method28(96.toByte()).code
                    if (!method2066(116.toByte()) || (i_110_ != 96 && i_110_ != 167 && i_110_ != 178)) {
                        if (MinimapAreaMarkerNode.anInt9699 < 128) {
                            ProceduralTextureGraph.anCharStreamReaderArray9534s!![MinimapAreaMarkerNode.anInt9699] = interface6
                            MinimapAreaMarkerNode.anInt9699++
                        }
                    } else if (!method3263(true)) IntHashSetStatics.method2363(-84)
                    else GlCubemapLightPass.method3543((-89).toByte())
                } else if (i_109_ == 0 && CameraConfigDefinition.anInt3246 < 75) {
                    CacheLruCache.anCharStreamReaderArray3884s!![CameraConfigDefinition.anInt3246] = interface6
                    CameraConfigDefinition.anInt3246++
                }
                interface6 = LoadProgressCounters.aKeyboardInputSource_2449!!.method2697(0)
            }
            NodeDequeHolder.anInt1565 = 0
            var class348_sub45 = GlTexture1D.aInputTracker_8552!!.method3596(0)
            while (class348_sub45 != null) {
                val i_111_ = class348_sub45.method3310(86)
                if (i_111_ != -1) {
                    if (i_111_ != 6) {
                        if (method3584(i_111_, 1)) {
                            GroundDecorEntity.aNodeDeque_8744!!.method1999(class348_sub45, -20180)
                            if (GroundDecorEntity.aNodeDeque_8744!!.method1998(0) > 10) GroundDecorEntity.aNodeDeque_8744!!.method1997(8)
                        }
                    } else NodeDequeHolder.anInt1565 += class348_sub45.method3315(0)
                } else NativeRenderNode.aNodeDeque_10479!!.method1999(class348_sub45, -20180)
                class348_sub45 = GlTexture1D.aInputTracker_8552!!.method3596(0)
            }
            if (method3263(true)) method363(125)
            if (NpcSummaryDefinition.method1167(WorldMapRenderer.anInt4674, (-51).toByte())) {
                method493(true)
                method867(true)
            } else if (GroundDecorSceneEntity.method2402(WorldMapRenderer.anInt4674, (-120).toByte())) method123(0)
            if (i < 32) aNodeDeque_5185 = null
            if (method3196(WorldMapRenderer.anInt4674, -74) && !GroundDecorSceneEntity.method2402(WorldMapRenderer.anInt4674, (-55).toByte())) {
                method113(112.toByte())
                method2757(110)
                method843(102.toByte())
            } else if (!method2672(WorldMapRenderer.anInt4674, -123) || GroundDecorSceneEntity.method2402(WorldMapRenderer.anInt4674, (-115).toByte())) {
                if (WorldMapRenderer.anInt4674 == 12) method843(113.toByte())
                else if (method2653(true, WorldMapRenderer.anInt4674) && !GroundDecorSceneEntity.method2402(WorldMapRenderer.anInt4674, (-86).toByte())) method2991(11432)
                else if (WorldMapRenderer.anInt4674 == 13) {
                    SceneNodeDeque.method843((-75).toByte())
                    if (Client.anInt6634 != -3 && Client.anInt6634 != 2 && Client.anInt6634 != 15) method3141(false, 11.toByte())
                }
            } else {
                method113(112.toByte())
                method843(67.toByte())
            }
            method294(FacingDirectionNode.aRenderer6654, 0)
            GroundDecorEntity.aNodeDeque_8744!!.method1997(8)
        }
    }

    @Synchronized
    public override fun method87(i: Byte) {
        if (i > -11) aNodeDeque_5185 = null
        anInt5173++
        if (JagGlToolkitFactory.anApplet1530 != null && ParticleSystemRenderer.aCanvas3869 == null && !VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aBoolean3794) {
            try {
                val var_class: Class<*> = JagGlToolkitFactory.anApplet1530!!.javaClass
                val field = var_class.getDeclaredField("canvas")
                ParticleSystemRenderer.aCanvas3869 = field.get(JagGlToolkitFactory.anApplet1530) as? Canvas
                field.set(JagGlToolkitFactory.anApplet1530, null)
                if (ParticleSystemRenderer.aCanvas3869 != null) return
            } catch (exception: Exception) {
                if (Loader.trace) {
                    exception.printStackTrace()
                }
            }
        }
        super.method87((-28).toByte())
    }

    private fun method116(bool: Boolean) {
        anInt5172++
        if (WorldMapRenderer.anInt4674 != 14) {
            val l = (BufferPositionTracker.method1857((-45).toByte()) / 1000000L + -RenderbufferObject.aLong8573)
            RenderbufferObject.aLong8573 = BufferPositionTracker.method1857((-45).toByte()) / 1000000L
            val bool_118_ = method2163(!bool)
            if (bool_118_ && RgbColorPalette.aBoolean1236 && ClientLoadStateMachine.aSoundChannelMixer_7042 != null) ClientLoadStateMachine.aSoundChannelMixer_7042!!.method2087(-115)
            if (WalkingTypeUtil.method1977((-79).toByte(), WorldMapRenderer.anInt4674)) {
                if ((PcmStreamBuffer.aLong8866 != 0L) && method599(-98) > PcmStreamBuffer.aLong8866) ChatCommandProcessor.method830(method3229(-128), LocTypeDefinition.anInt4005, 102.toByte(), false, RadialTextureNode.anInt9335)
                else if (!FacingDirectionNode.aRenderer6654!!.method3655() && ProjectileSpawner.aBoolean2674) method3327(1406)
            }
            if (SkeletalAnimFrameLoader.aFrame476 == null) {
                val container: Container?
                if (RsaVarbitHandler.aFrame4904 == null) {
                    if (JagGlToolkitFactory.anApplet1530 == null) container = EdgeDetectTextureNode.anGameApplet_Frame_9169
                    else container = JagGlToolkitFactory.anApplet1530 as? Container
                } else container = RsaVarbitHandler.aFrame4904
                var i = container!!.getSize().width
                var i_119_ = container.getSize().height
                if (container === RsaVarbitHandler.aFrame4904) {
                    val insets = RsaVarbitHandler.aFrame4904!!.getInsets()
                    i -= insets.left + insets.right
                    i_119_ -= insets.top - -insets.bottom
                }
                if (i != SocketFactory.anInt3473 || i_119_ != NpcReference.anInt6857 || TextureLoadExceptionStatics.aBoolean4604) {
                    if (FacingDirectionNode.aRenderer6654 == null || FacingDirectionNode.aRenderer6654!!.method3695()) method3556(false)
                    else {
                        NpcReference.anInt6857 = i_119_
                        SocketFactory.anInt3473 = i
                    }
                    PcmStreamBuffer.aLong8866 = method599(-66) - -500L
                    TextureLoadExceptionStatics.aBoolean4604 = false
                }
            }
            if (SkeletalAnimFrameLoader.aFrame476 != null && !SizeBoundedSoftCache.aBoolean2329 && WalkingTypeUtil.method1977((-79).toByte(), WorldMapRenderer.anInt4674)) ChatCommandProcessor.method830(IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350), -1, 102.toByte(), false, -1)
            var bool_120_ = false
            if (SpriteRenderable.aBoolean4726) {
                bool_120_ = true
                SpriteRenderable.aBoolean4726 = false
            }
            if (bool_120_) ScreenBorderFiller.method1170((-116).toByte())
            if ((FacingDirectionNode.aRenderer6654 != null && FacingDirectionNode.aRenderer6654!!.method3655()) || method3229(-91) != 1) method3466(-77)
            if (NpcSummaryDefinition.method1167(WorldMapRenderer.anInt4674, (-113).toByte())) method1309(bool_120_, 117)
            else if (!method2114(WorldMapRenderer.anInt4674, bool)) {
                if (!method3197(WorldMapRenderer.anInt4674, 56.toByte())) {
                    if (GroundDecorSceneEntity.method2402(WorldMapRenderer.anInt4674, (-78).toByte())) {
                        if (AnimationFrameTable.anInt489 == 1) {
                            if (LocDefinitionCache.anInt3441 > StringValueNode.anInt7115) StringValueNode.anInt7115 = LocDefinitionCache.anInt3441
                            val i = ((-LocDefinitionCache.anInt3441 + StringValueNode.anInt7115) * 50 / StringValueNode.anInt7115)
                            method3511(true, aRSFont_20, ParticleEmitterFactoryStatics.aFontDefinition_3179, (LocalizedText.aLocalizedText_3495!!.method2063(ChatCommandProcessor.anInt6967, 544)) + "<br>(" + i + "%)", 2, FacingDirectionNode.aRenderer6654)
                        } else if (AnimationFrameTable.anInt489 == 2) {
                            if (ItemModelDefinition.anInt443 < CompositeNpcModelBuilder.anInt2101) ItemModelDefinition.anInt443 = CompositeNpcModelBuilder.anInt2101
                            val i = (((ItemModelDefinition.anInt443 - CompositeNpcModelBuilder.anInt2101) * 50 / ItemModelDefinition.anInt443) + 50)
                            method3511(true, aRSFont_20, ParticleEmitterFactoryStatics.aFontDefinition_3179, (LocalizedText.aLocalizedText_3495!!.method2063(ChatCommandProcessor.anInt6967, 544)) + "<br>(" + i + "%)", 2, FacingDirectionNode.aRenderer6654)
                        } else method3511(true, aRSFont_20, ParticleEmitterFactoryStatics.aFontDefinition_3179, (LocalizedText.aLocalizedText_3495!!.method2063(ChatCommandProcessor.anInt6967, 544)), 2, FacingDirectionNode.aRenderer6654)
                    } else if (WorldMapRenderer.anInt4674 != 10) {
                        if (WorldMapRenderer.anInt4674 == 13) method3511(false, aRSFont_20, ParticleEmitterFactoryStatics.aFontDefinition_3179, ((LocalizedText.aLocalizedText_3497!!.method2063(ChatCommandProcessor.anInt6967, 544)) + "<br>" + (LocalizedText.aLocalizedText_3498!!.method2063(ChatCommandProcessor.anInt6967, 544))), 2, FacingDirectionNode.aRenderer6654)
                    } else MinimapPositionState.method2284((-43).toByte(), l)
                } else method1761(85)
            } else method1761(85)
            if (NativeRenderer.anInt8045 == 3) {
                var i = 0
                while (TerrainShadowBuilderGl3.anInt7008 > i) {
                    val rectangle = HintIconState.aRectangleArray2371!![i]
                    if (SizeBoundedSoftCache.aBooleanArray2326!![i]) FacingDirectionNode.aRenderer6654!!.method3668(rectangle!!.width, rectangle.y, -65281, rectangle.x, rectangle.height, 46)
                    else if (!LocDefinitionCache.aBooleanArray3438!![i]) FacingDirectionNode.aRenderer6654!!.method3668(rectangle!!.width, rectangle.y, -16711936, rectangle.x, rectangle.height, 66)
                    else FacingDirectionNode.aRenderer6654!!.method3668(rectangle!!.width, rectangle.y, -65536, rectangle.x, rectangle.height, 40)
                    i++
                }
            }
            if (method3263(bool)) method207(FacingDirectionNode.aRenderer6654, 124.toByte())
            if (VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aBoolean3794 && WalkingTypeUtil.method1977((-79).toByte(), WorldMapRenderer.anInt4674) && NativeRenderer.anInt8045 == 0 && method3229(-85) == 1 && !bool_120_) {
                var i = 0
                var i_121_ = 0
                while ((TerrainShadowBuilderGl3.anInt7008 > i_121_)) {
                    if (LocDefinitionCache.aBooleanArray3438!![i_121_]) {
                        LocDefinitionCache.aBooleanArray3438!![i_121_] = false
                        ModelLightingConfig.aRectangleArray2554!![i++] = HintIconState.aRectangleArray2371!![i_121_]
                    }
                    i_121_++
                }
                try {
                    if (!GrayscaleNoiseTexture.aBoolean5300) FacingDirectionNode.aRenderer6654!!.method3657(ModelLightingConfig.aRectangleArray2554, i, 66)
                    else method1168(i, 0, ModelLightingConfig.aRectangleArray2554)
                } catch (clientException_: ClientException) {
                    /* empty */
                }
            } else if (!NpcSummaryDefinition.method1167(WorldMapRenderer.anInt4674, (-59).toByte())) {
                var i = 0
                while (TerrainShadowBuilderGl3.anInt7008 > i) {
                    LocDefinitionCache.aBooleanArray3438!![i] = false
                    i++
                }
                try {
                    if (GrayscaleNoiseTexture.aBoolean5300) Tooltip.method395(107)
                    else FacingDirectionNode.aRenderer6654!!.method3689(104.toByte())
                } catch (clientException_: ClientException) {
                    method1242((clientException_.message + " (Recovered) " + method81(79.toByte())), clientException_, 15004)
                    method3553(false, 113.toByte(), 0)
                }
            }
            method598(9013)
            val i = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub17_7263!!.method1798(-32350)
            if (i == 0) TexGenMaterialPass.method2161((-127).toByte(), 15L)
            else if (i != 1) {
                if (i != 2) {
                    if (i == 3) TexGenMaterialPass.method2161((-102).toByte(), 2L)
                } else TexGenMaterialPass.method2161((-97).toByte(), 5L)
            } else TexGenMaterialPass.method2161((-104).toByte(), 10L)
            if (MapElementDefinitionCache.aBoolean3988) method1416(5)
            if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub11_7265!!.method1768(-32350) == 1 && WorldMapRenderer.anInt4674 == 3 && RenderNodeStatics.anInt9721 != -1) {
                IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub11_7265), 0)
                method243(37)
            }
        }
    }

    public override fun method81(i: Byte): String? {
        anInt5175++
        var string: String? = null
        try {
            string = ("[1)" + ArbVertexProgram.regionTileX + "," + RegionMapDecoder.regionTileY + "," + GlCubemapLightPass.anInt7319 + "," + RangeThresholdTextureNode.anInt9109 + "|")
            if (i < 40) aNodeDeque_5185 = null
            if (LocalPlayerState.aPlayer_1907 != null) string += ("2)" + CompiledScriptCache.anInt4372 + "," + (ArbVertexProgram.regionTileX + (LocalPlayerState.aPlayer_1907!!.anIntArray10320!![0])) + "," + (RegionMapDecoder.regionTileY + (LocalPlayerState.aPlayer_1907!!.anIntArray10317!![0])) + "|")
            string += ("3)" + IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) + "|4)" + IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub20_7216!!.method1808(-32350) + "|5)" + method3229(-65) + "|6)" + LocTypeDefinition.anInt4017 + "," + GameDisplayManager.anInt10432 + "|")
            string += "7)" + IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub28_7230!!.method1845(-32350) + "|"
            string += "8)" + IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub7_7238!!.method1748(-32350) + "|"
            string += "9)" + IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub18_7259!!.method1800(-32350) + "|"
            string += "10)" + IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub24_7235!!.method1820(-32350) + "|"
            string += "11)" + IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub12_7243!!.method1771(-32350) + "|"
            string += "12)" + IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) + "|"
            string += "13)" + TextureDefinitionCache.anInt2964 + "|"
            string += "14)" + WorldMapRenderer.anInt4674
            if (NoiseTextureNode.aClass348_Sub4_9264 != null) string += "|15)" + (NoiseTextureNode.aClass348_Sub4_9264!!.anInt6609)
            try {
                if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 2) {
                    val field = ClassLoader::class.java.getDeclaredField("nativeLibraries")
                    field.setAccessible(true)
                    val vector = (field.get((if (aClass5189 != null) aClass5189 else (Client::class.java.also { aClass5189 = it }))!!.getClassLoader()) as Vector<*>)
                    for (i_135_ in vector.indices) {
                        try {
                            val `object`: Any = vector.elementAt(i_135_)
                            val field_136_ = `object`.javaClass.getDeclaredField("name")
                            field_136_.setAccessible(true)
                            try {
                                val string_137_ = field_136_.get(`object`) as String?

                                if (string_137_ != null && string_137_.indexOf("sw3d.dll") != -1) {
                                    val field_138_ = `object`.javaClass.getDeclaredField("handle")


                                    field_138_.setAccessible(true)
                                    string += ("|16)" + (java.lang.Long.toHexString(field_138_.getLong(`object`))))
                                    field_138_.setAccessible(false)
                                }
                            } catch (throwable: Throwable) {
                                if (Loader.trace) {
                                    throwable.printStackTrace()
                                }
                                /* empty */
                            }
                            field_136_.setAccessible(false)
                        } catch (throwable: Throwable) {
                            if (Loader.trace) {
                                throwable.printStackTrace()
                            }
                            /* empty */
                        }
                    }
                }
            } catch (throwable: Throwable) {
                if (Loader.trace) {
                    throwable.printStackTrace()
                }
                /* empty */
            }
            string += "]"
        } catch (throwable: Throwable) {
            if (Loader.trace) {
                throwable.printStackTrace()
            }
            /* empty */
        }
        return string
    }

    override fun getPulseComponent(): Component? {
        return null
    }

    override fun showDocument(url: URL?, target: String?) {
    }

    companion object {
        var anInt5170: Int = 0
        var anInt5171: Int = 0
        var anInt5172: Int = 0
        var anInt5173: Int = 0
        var anInt5174: Int = 0
        var anInt5175: Int = 0
        var anIntArray5176: IntArray? = null
        var anInt5177: Int = 0
        var anInt5178: Int = 0
        var anInt5179: Int = 0
        var anInt5180: Int = 0
        var anInt5181: Int = 0
        var anInt5182: Int = 0
        var anInt5183: Int = 0
        var anInt5184: Int = 0
        var aNodeDeque_5185: NodeDeque? = NodeDeque()
        var anInt5186: Int = 0
        var anInt5187: Int = 0
        var anInt5188: Int = 0

        /*synthetic*/
        var aClass5189: Class<*>? = null
        var anInt5190: Int = 0

        fun method104(i: Int) {
            val i_7_ = ShaderState.anInt6513
            val `is` = ScrollTexMaterialPass.anIntArray6290
            val i_8_ = if (MouseInputTracker.aBoolean7444) i_7_ else i_7_ + ModelDefinitionLoader.anInt2057
            for (i_9_ in 0..<i_8_) {
                val class318_sub1_sub3_sub3: ProjectedGroundDecor?
                if (i_9_ < i_7_) class318_sub1_sub3_sub3 = (LoadingBarRenderer.aPlayerArray5058!![`is`!![i_9_]])
                else class318_sub1_sub3_sub3 = ((NpcEntityUpdater.aHashtable_3654!!.method3480(Client.anIntArray1233!![i_9_ - i_7_].toLong(), -6008) as NpcReference).aNpc_6859)
                if (class318_sub1_sub3_sub3!!.plane.toInt() == i) {
                    class318_sub1_sub3_sub3.anInt10261 = 0
                    if ((class318_sub1_sub3_sub3.anInt10285) < 0) class318_sub1_sub3_sub3.aBoolean10309 = false
                    else {
                        val i_10_ = class318_sub1_sub3_sub3.method2436(71.toByte())
                        if ((i_10_ and 0x1) == 0) {
                            if (((class318_sub1_sub3_sub3.x) and 0x1ff) != 0 || ((class318_sub1_sub3_sub3.y) and 0x1ff) != 0) {
                                class318_sub1_sub3_sub3.aBoolean10309 = false
                                continue
                            }
                        } else if (((class318_sub1_sub3_sub3.x) and 0x1ff) != 256 || ((class318_sub1_sub3_sub3.y) and 0x1ff) != 256) {
                            class318_sub1_sub3_sub3.aBoolean10309 = false
                            continue
                        }
                        if (i_10_ == 1) {
                            val i_11_ = ((class318_sub1_sub3_sub3.x) shr 9)
                            val i_12_ = ((class318_sub1_sub3_sub3.y) shr 9)
                            if (class318_sub1_sub3_sub3.anInt10285 != (NpcType.anIntArrayArray9678!![i_11_]!![i_12_])) {
                                class318_sub1_sub3_sub3.aBoolean10309 = true
                                continue
                            }
                            if (FlickeringEffectsOptionState.anIntArrayArray5921!![i_11_]!![i_12_] > 1) {
                                FlickeringEffectsOptionState.anIntArrayArray5921!![i_11_]!![i_12_] = FlickeringEffectsOptionState.anIntArrayArray5921!![i_11_]!![i_12_] - 1
                                class318_sub1_sub3_sub3.aBoolean10309 = true
                                continue
                            }
                        } else {
                            val i_13_ = (i_10_ - 1) * 256 + 252
                            val i_14_ = ((class318_sub1_sub3_sub3.x) - i_13_ shr 9)
                            val i_15_ = ((class318_sub1_sub3_sub3.y) - i_13_ shr 9)
                            val i_16_ = ((class318_sub1_sub3_sub3.x) + i_13_ shr 9)
                            val i_17_ = ((class318_sub1_sub3_sub3.y) + i_13_ shr 9)
                            if (!method949(i_15_, i_16_, (class318_sub1_sub3_sub3.anInt10285), 124.toByte(), i_14_, i_17_)) {
                                for (i_18_ in i_14_..i_16_) {
                                    for (i_19_ in i_15_..i_17_) {
                                        if (class318_sub1_sub3_sub3.anInt10285 == (NpcType.anIntArrayArray9678!![i_18_]!![i_19_])) FlickeringEffectsOptionState.anIntArrayArray5921!![i_18_]!![i_19_] = FlickeringEffectsOptionState.anIntArrayArray5921!![i_18_]!![i_19_] - 1
                                    }
                                }
                                class318_sub1_sub3_sub3.aBoolean10309 = true
                                continue
                            }
                        }
                        class318_sub1_sub3_sub3.aBoolean10309 = false
                        class318_sub1_sub3_sub3.anInt6382 = method2064((class318_sub1_sub3_sub3.x), (class318_sub1_sub3_sub3.plane).toInt(), 11219, (class318_sub1_sub3_sub3.y))
                        NativeBufferHandle.method850(class318_sub1_sub3_sub3, true)
                    }
                }
            }
        }

        fun method105(widgetComponent: WidgetComponent): PackedFlagsAccessor? {
            val class348_sub44 = (TextureDefinitionCache.aHashtable_2959!!.method3480(((widgetComponent.anInt830.toLong() shl 32) + widgetComponent.anInt704.toLong()), -6008)) as PackedFlagsAccessor?
            if (class348_sub44 != null) return class348_sub44
            return widgetComponent.aClass348_Sub44_748
        }

        fun method106() {
            Js5Archive.anInt669 = 0
            for (i in 0..<ModelDefinitionLoader.anInt2057) {
                val npc = ((NpcEntityUpdater.aHashtable_3654!!.method3480(Client.anIntArray1233!![i].toLong(), -6008) as NpcReference).aNpc_6859)
                if ((npc!!.aBoolean10309) && npc.method2425(-1) != -1) {
                    val i_20_ = ((npc.method2436(119.toByte()) - 1) * 256 + 252)
                    val i_21_ = (npc.x - i_20_) shr 9
                    val i_22_ = (npc.y - i_20_) shr 9
                    val class318_sub1_sub3_sub3 = method817(252, i_21_, (npc.plane).toInt(), i_22_)
                    if (class318_sub1_sub3_sub3 != null) {
                        var i_23_ = (class318_sub1_sub3_sub3.anInt10290)
                        if (class318_sub1_sub3_sub3 is Npc) i_23_ += 2048
                        if ((class318_sub1_sub3_sub3.anInt10261) == 0 && class318_sub1_sub3_sub3.method2425(-1) != -1) {
                            GlTexture1D.anIntArray8557!![Js5Archive.anInt669] = i_23_
                            LocDefinitionCache.anIntArray3432!![Js5Archive.anInt669] = i_23_
                            Js5Archive.anInt669++
                            class318_sub1_sub3_sub3.anInt10261++
                        }
                        GlTexture1D.anIntArray8557!![Js5Archive.anInt669] = i_23_
                        LocDefinitionCache.anIntArray3432!![Js5Archive.anInt669] = npc.anInt10290 + 2048
                        Js5Archive.anInt669++
                        class318_sub1_sub3_sub3.anInt10261++
                    }
                }
            }
            method347(LocDefinitionCache.anIntArray3432, GlTexture1D.anIntArray8557, 0, -22222, Js5Archive.anInt669 - 1)
        }

        @JvmStatic
        fun main(strings: Array<String>) {
            try {
                try {
                    if (strings.size != 6) method518("Argument count", 44.toByte())
                    GlElementArrayBuffer.aServerConnectionInfo_4839 = ServerConnectionInfo()
                    GlElementArrayBuffer.aServerConnectionInfo_4839!!.anInt2143 = strings[0].toInt()
                    ModelHeaderCache.aServerConnectionInfo_3285 = ServerConnectionInfo()
                    ModelHeaderCache.aServerConnectionInfo_3285!!.anInt2143 = strings[1].toInt()
                    DirectionalLightTextureNode.aServerConnectionInfo_9443 = ServerConnectionInfo()
                    DirectionalLightTextureNode.aServerConnectionInfo_9443!!.anInt2143 = strings[2].toInt()
                    NpcAnimationResolver.aNamedIdRecord_165 = SceneObjectSpawner.aNamedIdRecord_1279
                    if (strings[3] == "live") SceneRegionState.aHudTabPanel_196 = Client.aHudTabPanel_1189
                    else if (strings[3] != "rc") {
                        if (strings[3] == "wip") SceneRegionState.aHudTabPanel_196 = ParticleEmitterDef.aHudTabPanel_4953
                        else method518("modewhat", 41.toByte())
                    } else SceneRegionState.aHudTabPanel_196 = NoiseTextureNode.aHudTabPanel_9263
                    ChatCommandProcessor.anInt6967 = method315(103.toByte(), strings[4])
                    if (ChatCommandProcessor.anInt6967 == -1) {
                        if (strings[4] != "english") {
                            if (strings[4] == "german") ChatCommandProcessor.anInt6967 = 1
                            else OggMediaStream.method518("language", (-128).toByte())
                        } else ChatCommandProcessor.anInt6967 = 0
                    }
                    aBoolean6997 = false
                    RegionSceneLoader.aBoolean3697 = false
                    if (strings[5] != "game0") {
                        if (strings[5] != "game1") {
                            if (strings[5] != "game2") {
                                if (strings[5] != "game3") OggMediaStream.method518("game", (-124).toByte())
                                else aSceneProjector_10434 = CustomCursorsOptionState.aSceneProjector_5932
                            } else aSceneProjector_10434 = GlslEnvMaterialPass.aSceneProjector_6262
                        } else aSceneProjector_10434 = GlRectangleTexture.aSceneProjector_8638
                    } else aSceneProjector_10434 = ParticleEmitterNode.aSceneProjector_186
                    ServerConnectionInfo.aBoolean2151 = false
                    BloomGraphicsOptionState.aString5966 = ""
                    TextureMetadataProvider.aLong4615 = 0L
                    NullOggStream.aString9043 = null
                    SocketStreamWorker.anInt2670 = 0
                    ItemActionPacketSender.aBoolean2110 = true
                    FrameBufferObject.aBoolean4888 = ItemActionPacketSender.aBoolean2110
                    PlayerAppearanceUpdateDecoder.aBoolean4540 = false
                    ConfigFlagUtil.anInt3234 = 0
                    UnderlayDefinition.anInt2884 = (aSceneProjector_10434!!.anInt2987)
                    Renderer.anInt4583 = 0
                    Gl2dTexture.aString8605 = null
                    val var_client = Client()
                    NpcType.aClient1367 = var_client
                    var_client.method96(SceneRegionState.aHudTabPanel_196!!.method1640(0) + 32, 1024, false, 634, 37, (aSceneProjector_10434!!.aString2985), 23499, 768)
                    RsaVarbitHandler.aFrame4904!!.setLocation(40, 40)
                } catch (exception: Exception) {
                    method1242(null, exception, 15004)
                }
                anInt5178++
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, "client.main(" + (if (strings != null) "{...}" else "null") + ')')
            }
        }

        fun method107(widgetComponents: Array<WidgetComponent?>, i: Int, i_32_: Int, i_33_: Int, i_34_: Int, i_35_: Int, i_36_: Int, i_37_: Int, i_38_: Int, i_39_: Int, i_40_: Int, i_41_: Int) {
            for (i_42_ in widgetComponents.indices) {
                val class46 = widgetComponents[i_42_]
                if (class46 != null && class46.anInt834 == i) {
                    val i_43_ = class46.anInt800 + i_36_
                    val i_44_ = class46.anInt750 + i_37_
                    val i_45_: Int
                    val i_46_: Int
                    val i_47_: Int
                    val i_48_: Int
                    if (class46.anInt774 == 2) {
                        i_45_ = i_32_
                        i_46_ = i_33_
                        i_47_ = i_34_
                        i_48_ = i_35_
                    } else {
                        var i_49_ = i_43_ + class46.anInt709
                        var i_50_ = i_44_ + class46.anInt789
                        if (class46.anInt774 == 9) {
                            i_49_++
                            i_50_++
                        }
                        i_45_ = max(i_43_, i_32_)
                        i_46_ = max(i_44_, i_33_)
                        i_47_ = min(i_49_, i_34_)
                        i_48_ = min(i_50_, i_35_)
                    }
                    if (class46.anInt774 != 0 && !class46.aBoolean682 && method105(class46)!!.anInt7098 == 0 && class46 != CalendarUtil.aWidgetComponent_4130 && class46.anInt765 != BufferToggleState.anInt3717 && (class46.anInt765 != OutgoingPacketNode.anInt7125)) {
                        if (i_45_ < i_47_ && i_46_ < i_48_) method273(class46, -2835)
                    } else if (!method111(class46)) {
                        var i_51_ = 0
                        var i_52_ = 0
                        if (GrayscaleNoiseTexture.aBoolean5300) {
                            i_51_ = NativeTerrainTile.method4008((-128).toByte())
                            i_52_ = method260(false)
                        }
                        if (class46 == RegionSceneLoader.aWidgetComponent_3701 && ClientException.method141(RegionSceneLoader.aWidgetComponent_3701!!, 125.toByte()) != null) {
                            MinimapSquareDrawer.aBoolean5221 = true
                            NativeRenderer.anInt8001 = i_43_
                            GrayscaleEffect.anInt9203 = i_44_
                        }
                        if (class46.aBoolean676 || i_45_ < i_47_ && i_46_ < i_48_) {
                            if (class46.aBoolean776 && i_40_ >= i_45_ && i_41_ >= i_46_ && i_40_ < i_47_ && i_41_ < i_48_) {
                                var class348_sub36 = HashTileShape.aNodeDeque_8810!!.method1995(4) as WidgetActionEntry?
                                while (class348_sub36 != null) {
                                    if (class348_sub36.aBoolean6993) {
                                        class348_sub36.method2715(65.toByte())
                                        class348_sub36.aWidgetComponent_6989!!.aBoolean737 = false
                                    }
                                    class348_sub36 = (HashTileShape.aNodeDeque_8810!!.method1990(71.toByte()) as WidgetActionEntry?)
                                }
                                if (DragDropController.anInt6392 == 0) {
                                    RegionSceneLoader.aWidgetComponent_3701 = null
                                    CalendarUtil.aWidgetComponent_4130 = null
                                }
                                HashLinkedListNodeStatics.anInt7059 = 0
                                ParticleEmitterFactoryStatics.aBoolean3174 = false
                                WorldMapScene.aBoolean3103 = false
                                if (!ScrollbarComponent.aBoolean8335) method661(111.toByte())
                            }
                            var bool: Boolean
                            bool = (GlTexture1D.aInputTracker_8552!!.method3597(true) + i_51_) >= i_45_ && GlTexture1D.aInputTracker_8552!!.method3594(89.toByte()) + i_52_ >= i_46_ && (GlTexture1D.aInputTracker_8552!!.method3597(true) + i_51_) < i_47_ && GlTexture1D.aInputTracker_8552!!.method3594(74.toByte()) + i_52_ < i_48_
                            if (!RenderNodeStatics.aBoolean9722 && bool) {
                                if (class46.anInt719 >= 0) Tooltip.anInt4458 = class46.anInt719
                                else if (class46.aBoolean776) Tooltip.anInt4458 = -1
                            }
                            if (!ScrollbarComponent.aBoolean8335 && i_40_ >= i_45_ && i_41_ >= i_46_ && i_40_ < i_47_ && i_41_ < i_48_) ParticleDetailOptionState.method1797(i_41_ - i_44_, i_40_ - i_43_, class46, (-95).toByte())
                            var bool_53_ = false
                            if (GlTexture1D.aInputTracker_8552!!.method3595(-91) && bool) bool_53_ = true
                            var bool_54_ = false
                            val class348_sub45 = (GroundDecorEntity.aNodeDeque_8744!!.method1995(4) as TimedRecordAccessor?)
                            if (class348_sub45 != null && class348_sub45.method3310(109) == 0 && (class348_sub45.method3308((-128).toByte()) + i_51_ >= i_45_) && class348_sub45.method3311(33) + i_52_ >= i_46_ && (class348_sub45.method3308((-127).toByte()) + i_51_ < i_47_) && class348_sub45.method3311(8) + i_52_ < i_48_) bool_54_ = true
                            if (class46.aByteArray746 != null && !method3263(true)) {
                                var i_55_ = 0
                                while ((i_55_ < class46.aByteArray746.size)) {
                                    if (!LoadProgressCounters.aKeyboardInputSource_2449!!.method2696(class46.aByteArray746[i_55_].toInt(), -122)) {
                                        if (class46.anIntArray801 != null) class46.anIntArray801!![i_55_] = 0
                                    } else if ((class46.anIntArray801 == null) || (GlGroundShaderPass.anInt7396 >= (class46.anIntArray801!![i_55_]))) {
                                        val i_56_ = (class46.aByteArray832[i_55_])
                                        if (i_56_.toInt() == 0 || (((i_56_.toInt() and 0x8) == 0 || (!LoadProgressCounters.aKeyboardInputSource_2449!!.method2696(86, -124) && !LoadProgressCounters.aKeyboardInputSource_2449!!.method2696(82, -123) && !(LoadProgressCounters.aKeyboardInputSource_2449!!.method2696(81, -122)))) && ((i_56_.toInt() and 0x2) == 0 || LoadProgressCounters.aKeyboardInputSource_2449!!.method2696(86, -127)) && ((i_56_.toInt() and 0x1) == 0 || LoadProgressCounters.aKeyboardInputSource_2449!!.method2696(
                                                82,
                                                -124
                                            )) && ((i_56_.toInt() and 0x4) == 0 || (LoadProgressCounters.aKeyboardInputSource_2449!!.method2696(81, -126))))
                                        ) {
                                            if (i_55_ < 10) method2780(-1, "", 122.toByte(), i_55_ + 1, class46.anInt830)
                                            else if (i_55_ == 10) {
                                                method2678(-2049)
                                                val class348_sub44: PackedFlagsAccessor? = method105(class46)
                                                method2666(class348_sub44!!.anInt7093, class348_sub44.method3307(110), class46, 21.toByte())
                                                ItemNameResolver.aString5001 = method1753(0, class46)
                                                if (ItemNameResolver.aString5001 == null) ItemNameResolver.aString5001 = "Null"
                                                ItemNameResolver.aString5000 = ((class46.aString752) + "<col=ffffff>")
                                            }
                                            val i_57_ = (class46.anIntArray707[i_55_])
                                            if (class46.anIntArray801 == null) class46.anIntArray801 = (IntArray((class46.aByteArray746).size))
                                            if (i_57_ != 0) class46.anIntArray801!![i_55_] = (GlGroundShaderPass.anInt7396 + i_57_)
                                            else class46.anIntArray801!![i_55_] = 2147483647
                                        }
                                    }
                                    i_55_++
                                }
                            }
                            if (bool_54_) method887(class46, (i_51_ + class348_sub45!!.method3308((-127).toByte()) - i_43_), (i_52_ + class348_sub45.method3311(-114) - i_44_), 2147483647)
                            if (RegionSceneLoader.aWidgetComponent_3701 != null && RegionSceneLoader.aWidgetComponent_3701 != class46 && bool && method105(class46)!!.method3302(17356)) MapElementDecor.aWidgetComponent_10336 = class46
                            if (class46 == CalendarUtil.aWidgetComponent_4130) {
                                ScrollingWidgetComponentNode.aBoolean8386 = true
                                BoxBlurTextureNode.anInt9461 = i_43_
                                DragDropController.anInt558 = i_44_
                            }
                            if (class46.aBoolean682 || class46.anInt765 != 0) {
                                if (bool && NodeDequeHolder.anInt1565 != 0 && (class46.anObjectArray803 != null)) {
                                    val class348_sub36 = WidgetActionEntry()
                                    class348_sub36.aBoolean6993 = true
                                    class348_sub36.aWidgetComponent_6989 = class46
                                    class348_sub36.anInt6995 = NodeDequeHolder.anInt1565
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray803
                                    HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                }
                                if (RegionSceneLoader.aWidgetComponent_3701 != null || ScrollbarComponent.aBoolean8335 || ((class46.anInt765 != TimedRecordAccessor.anInt7102) && HashLinkedListNodeStatics.anInt7059 > 0)) {
                                    bool_54_ = false
                                    bool_53_ = false
                                    bool = false
                                }
                                if (class46.anInt765 != 0) {
                                    if ((class46.anInt765 == RangedGraphicsOptionState.anInt5943) || (class46.anInt765 == WidgetRedrawTracker.anInt3932)) {
                                        AbstractTileShapeStatics.aWidgetComponent_6561 = class46
                                        if (KeyboardLayoutCache.aParticleSystemRenderer_3304 != null) KeyboardLayoutCache.aParticleSystemRenderer_3304!!.method2292(123, FacingDirectionNode.aRenderer6654!!, class46.anInt789)
                                        if (class46.anInt765 == RangedGraphicsOptionState.anInt5943) {
                                            if (!ScrollbarComponent.aBoolean8335 && i_40_ >= i_45_ && i_41_ >= i_46_ && i_40_ < i_47_ && i_41_ < i_48_) {
                                                SceneryDetailOptionState.method1823(FacingDirectionNode.aRenderer6654!!, i_38_, i_39_, (-50).toByte())
                                                var class318_sub6 = (InputStream_Sub2.aDoublyLinkedNodeList_83!!.method1872(8) as SceneEffectMarker?)
                                                while (class318_sub6 != null) {
                                                    if (i_40_ >= (class318_sub6.anInt6429) && (i_40_ < (class318_sub6.anInt6426)) && (i_41_ >= (class318_sub6.anInt6427)) && (i_41_ < (class318_sub6.anInt6425))) {
                                                        method661(107.toByte())
                                                        method1777(-3, (class318_sub6.aClass318_Sub1_Sub3_Sub3_6431))
                                                    }
                                                    class318_sub6 = ((InputStream_Sub2.aDoublyLinkedNodeList_83!!.method1878((-67).toByte())) as SceneEffectMarker?)
                                                }
                                            }
                                            continue
                                        }
                                    }
                                    if (class46.anInt765 == BufferToggleState.anInt3717) {
                                        if (class46.method425((FacingDirectionNode.aRenderer6654!!), 3.toByte()) != null && (KeyboardLayoutCache.anInt3306 == 0 || KeyboardLayoutCache.anInt3306 == 3) && !ScrollbarComponent.aBoolean8335 && i_40_ >= i_45_ && i_41_ >= i_46_ && i_40_ < i_47_ && i_41_ < i_48_) {
                                            var i_58_ = i_40_ - i_43_
                                            var i_59_ = i_41_ - i_44_
                                            val i_60_ = (class46.anIntArray677!![i_59_])
                                            if (i_58_ >= i_60_ && (i_58_ <= i_60_ + (class46.anIntArray772!![i_59_]))) {
                                                i_58_ -= (class46.anInt709) / 2
                                                i_59_ -= (class46.anInt789) / 2
                                                val i_61_: Int
                                                if (WeaveTextureNode.anInt9282 == 4) i_61_ = ((CameraDistanceOptionState.aFloat3938).toInt() and 0x3fff)
                                                else i_61_ = (((CameraDistanceOptionState.aFloat3938).toInt() + OpenGlRenderNode.anInt10483) and 0x3fff)
                                                var i_62_ = (SpotAnimVector.anIntArray1207!![i_61_])
                                                var i_63_ = (SpotAnimVector.anIntArray1204!![i_61_])
                                                if (WeaveTextureNode.anInt9282 != 4) {
                                                    i_62_ = (i_62_ * ((FloatBuffer.anInt9750) + 256)) shr 8
                                                    i_63_ = (i_63_ * ((FloatBuffer.anInt9750) + 256)) shr 8
                                                }
                                                val i_64_ = ((i_59_ * i_62_ + i_58_ * i_63_) shr 14)
                                                val i_65_ = ((i_59_ * i_63_ - i_58_ * i_62_) shr 14)
                                                val i_66_: Int
                                                val i_67_: Int
                                                if (WeaveTextureNode.anInt9282 == 4) {
                                                    i_66_ = (OpenGlRenderer.anInt6633 shr 9) + (i_64_ shr 2)
                                                    i_67_ = (RegionTileNode.anInt6652 shr 9) - (i_65_ shr 2)
                                                } else {
                                                    val i_68_ = ((LocalPlayerState.aPlayer_1907!!.method2436(51.toByte())) - 1) * 256
                                                    i_66_ = ((LocalPlayerState.aPlayer_1907!!.x) - i_68_ shr 9) + (i_64_ shr 2)
                                                    i_67_ = ((LocalPlayerState.aPlayer_1907!!.y) - i_68_ shr 9) - (i_65_ shr 2)
                                                }
                                                if (RenderNodeStatics.aBoolean9722 && ((WidgetTextConfig.anInt500 and 0x40) != 0)) {
                                                    val class46_69_ = (NpcReference.method2957(NativeLibraryState.anInt169, (-54).toByte(), OrientationRotator.anInt2046))
                                                    if (class46_69_ != null) MinimapPolygonDrawer.method466(false, " ->", i_67_, (-109).toByte(), true, i_66_, (class46.anInt812), true, 15, (((class46.anInt704) shl 0) or (class46.anInt830)).toLong(), ItemNameResolver.aString5001, 1L, (FloatBuffer.anInt9747))
                                                    else method2678(-2049)
                                                } else {
                                                    if ((Client.aSceneProjector_10434) == (GlRectangleTexture.aSceneProjector_8638)) MinimapPolygonDrawer.method466(false, "", i_67_, (-116).toByte(), true, i_66_, -1, true, 12, 0L, (LocalizedText.aLocalizedText_3510!!.method2063((ChatCommandProcessor.anInt6967), 544)), 1L, -1)
                                                    MinimapPolygonDrawer.method466(false, "", i_67_, (-93).toByte(), true, i_66_, -1, true, 19, 0L, LightingOptionState.aString5882, 1L, MapElementLookup.anInt4144)
                                                }
                                            }
                                        }
                                        continue
                                    }
                                    if (class46.anInt765 == TimedRecordAccessor.anInt7102) {
                                        HeapDiagnosticsHolder.aWidgetComponent_2249 = class46
                                        if (bool) ParticleEmitterFactoryStatics.aBoolean3174 = true
                                        if (bool_54_) {
                                            val i_70_ = ((i_51_ + (class348_sub45!!.method3308((-127).toByte())) - i_43_ - ((class46.anInt709) / 2)).toDouble() * 2.0 / (MapRegionLoader.aFloat1247).toDouble()).toInt()
                                            val i_71_ = -((i_52_ + (class348_sub45.method3311(-111)) - i_44_ - ((class46.anInt789) / 2)).toDouble() * 2.0 / (MapRegionLoader.aFloat1247).toDouble()).toInt()
                                            val i_72_ = (WidgetActionEntry.anInt6992 + i_70_ + MapRegionLoader.anInt1266)
                                            val i_73_ = (DebugOverlayRenderer.anInt3170 + i_71_ + MapRegionLoader.anInt1263)
                                            val class348_sub42_sub14 = method1269(-17096)
                                            if (class348_sub42_sub14 != null) {
                                                val `is`: IntArray? = IntArray(3)
                                                class348_sub42_sub14.method3239(true, i_73_, i_72_, `is`!!)
                                                if (`is` != null) {
                                                    if (LoadProgressCounters.aKeyboardInputSource_2449!!.method2696(82, -128) && (AsyncTaskHandle.anInt2581 > 0)) {
                                                        method3502(`is`[2], 2, `is`[0], `is`[1])
                                                        continue
                                                    }
                                                    WorldMapScene.aBoolean3103 = true
                                                    ColourKeyTextureNode.anInt9349 = `is`[0]
                                                    InputStream_Sub2.anInt85 = `is`[1]
                                                    NpcType.anInt1404 = `is`[2]
                                                }
                                                HashLinkedListNodeStatics.anInt7059 = 1
                                                SoundBankPatch.aBoolean6788 = false
                                                SceneEntityModel.anInt6411 = GlTexture1D.aInputTracker_8552!!.method3597(true)
                                                ModelDefinitionCache.anInt2872 = GlTexture1D.aInputTracker_8552!!.method3594(72.toByte())
                                            }
                                        } else if (bool_53_ && (HashLinkedListNodeStatics.anInt7059 > 0)) {
                                            if (HashLinkedListNodeStatics.anInt7059 == 1 && ((SceneEntityModel.anInt6411 != GlTexture1D.aInputTracker_8552!!.method3597(true)) || (ModelDefinitionCache.anInt2872 != (GlTexture1D.aInputTracker_8552!!.method3594(117.toByte()))))) {
                                                ParticleDefLoader.anInt2464 = WidgetActionEntry.anInt6992
                                                OpenGlTerrainTile.anInt8237 = DebugOverlayRenderer.anInt3170
                                                HashLinkedListNodeStatics.anInt7059 = 2
                                            }
                                            if (HashLinkedListNodeStatics.anInt7059 == 2) {
                                                SoundBankPatch.aBoolean6788 = true
                                                OpenGlModel.method689((-59).toByte(), (ParticleDefLoader.anInt2464 + (((SceneEntityModel.anInt6411) - (GlTexture1D.aInputTracker_8552!!.method3597(true))).toDouble() * 2.0 / (MapRegionLoader.aFloat1249).toDouble()).toInt()))
                                                method2170((OpenGlTerrainTile.anInt8237 - (((ModelDefinitionCache.anInt2872) - (GlTexture1D.aInputTracker_8552!!.method3594(83.toByte()))).toDouble() * 2.0 / (MapRegionLoader.aFloat1249).toDouble()).toInt()), 3.toByte())
                                            }
                                        } else {
                                            if (HashLinkedListNodeStatics.anInt7059 > 0 && !SoundBankPatch.aBoolean6788) {
                                                if (((WallEntity.anInt8770 == 1) || method2485(-124)) && FileExistsCondition.anInt4776 > 2) method191(true, SceneEntityModel.anInt6411, ModelDefinitionCache.anInt2872)
                                                else if (method913(117.toByte())) method191(true, SceneEntityModel.anInt6411, ModelDefinitionCache.anInt2872)
                                            }
                                            HashLinkedListNodeStatics.anInt7059 = 0
                                        }
                                        continue
                                    }
                                    if (class46.anInt765 == MapSceneIconDef.anInt2861) {
                                        if (bool_53_) method2676(class46.anInt709, class46.anInt789, (i_51_ + GlTexture1D.aInputTracker_8552!!.method3597(true) - i_43_), 58.toByte(), (i_52_ + GlTexture1D.aInputTracker_8552!!.method3594(111.toByte()) - i_44_))
                                        continue
                                    }
                                    if (class46.anInt765 == OutgoingPacketNode.anInt7125) {
                                        method1343(i_44_, class46, 1, i_43_)
                                        continue
                                    }
                                }
                                if (!class46.aBoolean793 && bool_54_) {
                                    class46.aBoolean793 = true
                                    if (class46.anObjectArray763 != null) {
                                        val class348_sub36 = WidgetActionEntry()
                                        class348_sub36.aBoolean6993 = true
                                        class348_sub36.aWidgetComponent_6989 = class46
                                        class348_sub36.anInt6984 = (i_51_ + class348_sub45!!.method3308((-128).toByte()) - i_43_)
                                        class348_sub36.anInt6995 = (i_52_ + class348_sub45.method3311(-123) - i_44_)
                                        class348_sub36.anObjectArray6987 = class46.anObjectArray763
                                        HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                    }
                                }
                                if (class46.aBoolean793 && bool_53_ && (class46.anObjectArray785 != null)) {
                                    val class348_sub36 = WidgetActionEntry()
                                    class348_sub36.aBoolean6993 = true
                                    class348_sub36.aWidgetComponent_6989 = class46
                                    class348_sub36.anInt6984 = i_51_ + GlTexture1D.aInputTracker_8552!!.method3597(true) - i_43_
                                    class348_sub36.anInt6995 = (i_52_ + GlTexture1D.aInputTracker_8552!!.method3594(98.toByte()) - i_44_)
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray785
                                    HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                }
                                if (class46.aBoolean793 && !bool_53_) {
                                    class46.aBoolean793 = false
                                    if (class46.anObjectArray742 != null) {
                                        val class348_sub36 = WidgetActionEntry()
                                        class348_sub36.aBoolean6993 = true
                                        class348_sub36.aWidgetComponent_6989 = class46
                                        class348_sub36.anInt6984 = (i_51_ + GlTexture1D.aInputTracker_8552!!.method3597(true) - i_43_)
                                        class348_sub36.anInt6995 = (i_52_ + GlTexture1D.aInputTracker_8552!!.method3594(75.toByte()) - i_44_)
                                        class348_sub36.anObjectArray6987 = class46.anObjectArray742
                                        RendererType.aNodeDeque_4473!!.method1999(class348_sub36, -20180)
                                    }
                                }
                                if (bool_53_ && (class46.anObjectArray805 != null)) {
                                    val class348_sub36 = WidgetActionEntry()
                                    class348_sub36.aBoolean6993 = true
                                    class348_sub36.aWidgetComponent_6989 = class46
                                    class348_sub36.anInt6984 = i_51_ + GlTexture1D.aInputTracker_8552!!.method3597(true) - i_43_
                                    class348_sub36.anInt6995 = (i_52_ + GlTexture1D.aInputTracker_8552!!.method3594(80.toByte()) - i_44_)
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray805
                                    HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                }
                                if (!class46.aBoolean737 && bool) {
                                    class46.aBoolean737 = true
                                    if (class46.anObjectArray811 != null) {
                                        val class348_sub36 = WidgetActionEntry()
                                        class348_sub36.aBoolean6993 = true
                                        class348_sub36.aWidgetComponent_6989 = class46
                                        class348_sub36.anInt6984 = (i_51_ + GlTexture1D.aInputTracker_8552!!.method3597(true) - i_43_)
                                        class348_sub36.anInt6995 = (i_52_ + GlTexture1D.aInputTracker_8552!!.method3594(112.toByte()) - i_44_)
                                        class348_sub36.anObjectArray6987 = class46.anObjectArray811
                                        HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                    }
                                }
                                if (class46.aBoolean737 && bool && (class46.anObjectArray839 != null)) {
                                    val class348_sub36 = WidgetActionEntry()
                                    class348_sub36.aBoolean6993 = true
                                    class348_sub36.aWidgetComponent_6989 = class46
                                    class348_sub36.anInt6984 = i_51_ + GlTexture1D.aInputTracker_8552!!.method3597(true) - i_43_
                                    class348_sub36.anInt6995 = (i_52_ + GlTexture1D.aInputTracker_8552!!.method3594(95.toByte()) - i_44_)
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray839
                                    HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                }
                                if (class46.aBoolean737 && !bool) {
                                    class46.aBoolean737 = false
                                    if (class46.anObjectArray683 != null) {
                                        val class348_sub36 = WidgetActionEntry()
                                        class348_sub36.aBoolean6993 = true
                                        class348_sub36.aWidgetComponent_6989 = class46
                                        class348_sub36.anInt6984 = (i_51_ + GlTexture1D.aInputTracker_8552!!.method3597(true) - i_43_)
                                        class348_sub36.anInt6995 = (i_52_ + GlTexture1D.aInputTracker_8552!!.method3594(90.toByte()) - i_44_)
                                        class348_sub36.anObjectArray6987 = class46.anObjectArray683
                                        RendererType.aNodeDeque_4473!!.method1999(class348_sub36, -20180)
                                    }
                                }
                                if (class46.anObjectArray764 != null) {
                                    val class348_sub36 = WidgetActionEntry()
                                    class348_sub36.aWidgetComponent_6989 = class46
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray764
                                    BufferedOutputStreamWorker.aNodeDeque_2707!!.method1999(class348_sub36, -20180)
                                }
                                if (class46.anObjectArray685 != null && (ScrollbarComponent.anInt8352 > class46.anInt738)) {
                                    if (class46.anIntArray818 == null || (ScrollbarComponent.anInt8352 - class46.anInt738) > 32) {
                                        val class348_sub36 = WidgetActionEntry()
                                        class348_sub36.aWidgetComponent_6989 = class46
                                        class348_sub36.anObjectArray6987 = class46.anObjectArray685
                                        HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                    } else {
                                        while_224_@ for (i_74_ in class46.anInt738..<ScrollbarComponent.anInt8352) {
                                            val i_75_ = (NamedIdEntry.anIntArray6890!![i_74_ and 0x1f])
                                            for (i_76_ in (class46.anIntArray818!!).indices) {
                                                if ((class46.anIntArray818!![i_76_]) == i_75_) {
                                                    val class348_sub36 = WidgetActionEntry()
                                                    class348_sub36.aWidgetComponent_6989 = class46
                                                    class348_sub36.anObjectArray6987 = (class46.anObjectArray685)
                                                    HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                                    break@while_224_
                                                }
                                            }
                                        }
                                    }
                                    class46.anInt738 = ScrollbarComponent.anInt8352
                                }
                                if (class46.anObjectArray708 != null && (HslAdjustTextureNode.anInt9385 > class46.anInt814)) {
                                    if (class46.anIntArray831 == null || (HslAdjustTextureNode.anInt9385 - class46.anInt814) > 32) {
                                        val class348_sub36 = WidgetActionEntry()
                                        class348_sub36.aWidgetComponent_6989 = class46
                                        class348_sub36.anObjectArray6987 = class46.anObjectArray708
                                        HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                    } else {
                                        var i_77_ = class46.anInt814
                                        while_225_@ while ((i_77_ < HslAdjustTextureNode.anInt9385)) {
                                            val i_78_ = (RemoveRoofsOptionState.anIntArray6061!![i_77_ and 0x1f])
                                            for (i_79_ in (class46.anIntArray831!!).indices) {
                                                if ((class46.anIntArray831!![i_79_]) == i_78_) {
                                                    val class348_sub36 = WidgetActionEntry()
                                                    class348_sub36.aWidgetComponent_6989 = class46
                                                    class348_sub36.anObjectArray6987 = (class46.anObjectArray708)
                                                    HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                                    break@while_225_
                                                }
                                            }
                                            i_77_++
                                        }
                                    }
                                    class46.anInt814 = HslAdjustTextureNode.anInt9385
                                }
                                if (class46.anObjectArray777 != null && (TypedRecordTable.anInt3695 > class46.anInt725)) {
                                    if (class46.anIntArray686 == null || (TypedRecordTable.anInt3695 - class46.anInt725) > 32) {
                                        val class348_sub36 = WidgetActionEntry()
                                        class348_sub36.aWidgetComponent_6989 = class46
                                        class348_sub36.anObjectArray6987 = class46.anObjectArray777
                                        HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                    } else {
                                        while_226_@ for (i_80_ in class46.anInt725..<TypedRecordTable.anInt3695) {
                                            val i_81_ = (FileIoUtil.anIntArray4096!![i_80_ and 0x1f])
                                            for (i_82_ in (class46.anIntArray686!!).indices) {
                                                if ((class46.anIntArray686!![i_82_]) == i_81_) {
                                                    val class348_sub36 = WidgetActionEntry()
                                                    class348_sub36.aWidgetComponent_6989 = class46
                                                    class348_sub36.anObjectArray6987 = (class46.anObjectArray777)
                                                    HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                                    break@while_226_
                                                }
                                            }
                                        }
                                    }
                                    class46.anInt725 = TypedRecordTable.anInt3695
                                }
                                if (class46.anObjectArray751 != null && (DualMaterialContainer.anInt1631 > class46.anInt723)) {
                                    if (class46.anIntArray771 == null || (DualMaterialContainer.anInt1631 - class46.anInt723) > 32) {
                                        val class348_sub36 = WidgetActionEntry()
                                        class348_sub36.aWidgetComponent_6989 = class46
                                        class348_sub36.anObjectArray6987 = class46.anObjectArray751
                                        HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                    } else {
                                        while_227_@ for (i_83_ in class46.anInt723..<DualMaterialContainer.anInt1631) {
                                            val i_84_ = (LoadingScreenState.anIntArray2633!![i_83_ and 0x1f])
                                            for (i_85_ in (class46.anIntArray771!!).indices) {
                                                if ((class46.anIntArray771!![i_85_]) == i_84_) {
                                                    val class348_sub36 = WidgetActionEntry()
                                                    class348_sub36.aWidgetComponent_6989 = class46
                                                    class348_sub36.anObjectArray6987 = (class46.anObjectArray751)
                                                    HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                                    break@while_227_
                                                }
                                            }
                                        }
                                    }
                                    class46.anInt723 = DualMaterialContainer.anInt1631
                                }
                                if (class46.anObjectArray671 != null && (EmoteDefCache.anInt4086 > class46.anInt715)) {
                                    if (class46.anIntArray731 == null || (EmoteDefCache.anInt4086 - class46.anInt715) > 32) {
                                        val class348_sub36 = WidgetActionEntry()
                                        class348_sub36.aWidgetComponent_6989 = class46
                                        class348_sub36.anObjectArray6987 = class46.anObjectArray671
                                        HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                    } else {
                                        while_228_@ for (i_86_ in class46.anInt715..<EmoteDefCache.anInt4086) {
                                            val i_87_ = (LoadingScreenState.anIntArray2632!![i_86_ and 0x1f])
                                            for (i_88_ in (class46.anIntArray731!!).indices) {
                                                if ((class46.anIntArray731!![i_88_]) == i_87_) {
                                                    val class348_sub36 = WidgetActionEntry()
                                                    class348_sub36.aWidgetComponent_6989 = class46
                                                    class348_sub36.anObjectArray6987 = (class46.anObjectArray671)
                                                    HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                                    break@while_228_
                                                }
                                            }
                                        }
                                    }
                                    class46.anInt715 = EmoteDefCache.anInt4086
                                }
                                if ((LoadingScreenImageNode.anInt9501 > class46.anInt726) && (class46.anObjectArray820 != null)) {
                                    val class348_sub36 = WidgetActionEntry()
                                    class348_sub36.aWidgetComponent_6989 = class46
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray820
                                    HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                }
                                if ((Crc64Hashable.anInt4985 > class46.anInt726) && (class46.anObjectArray734 != null)) {
                                    val class348_sub36 = WidgetActionEntry()
                                    class348_sub36.aWidgetComponent_6989 = class46
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray734
                                    HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                }
                                if ((Client.anInt2986 > class46.anInt726) && (class46.anObjectArray761 != null)) {
                                    val class348_sub36 = WidgetActionEntry()
                                    class348_sub36.aWidgetComponent_6989 = class46
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray761
                                    HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                }
                                if ((MapAreaDefinition.anInt2523 > class46.anInt726) && (class46.anObjectArray807 != null)) {
                                    val class348_sub36 = WidgetActionEntry()
                                    class348_sub36.aWidgetComponent_6989 = class46
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray807
                                    HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                }
                                if ((TurbulenceTextureNode.anInt9313 > class46.anInt726) && (class46.anObjectArray836 != null)) {
                                    val class348_sub36 = WidgetActionEntry()
                                    class348_sub36.aWidgetComponent_6989 = class46
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray836
                                    HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                }
                                class46.anInt726 = ResourceLoaderThread.anInt3918
                                if (class46.anObjectArray822 != null) {
                                    for (i_89_ in 0..<MinimapAreaMarkerNode.anInt9699) {
                                        val class348_sub36 = WidgetActionEntry()
                                        class348_sub36.aWidgetComponent_6989 = class46
                                        class348_sub36.anInt6991 = ProceduralTextureGraph.anCharStreamReaderArray9534s!![i_89_]!!.method30(false)
                                        class348_sub36.anInt6982 = ProceduralTextureGraph.anCharStreamReaderArray9534s!![i_89_]!!.method28(39.toByte()).code
                                        class348_sub36.anObjectArray6987 = class46.anObjectArray822
                                        HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                    }
                                }
                                if (DragDropController.aBoolean4284 && (class46.anObjectArray687 != null)) {
                                    val class348_sub36 = WidgetActionEntry()
                                    class348_sub36.aWidgetComponent_6989 = class46
                                    class348_sub36.anObjectArray6987 = class46.anObjectArray687
                                    HashTileShape.aNodeDeque_8810!!.method1999(class348_sub36, -20180)
                                }
                            }
                            if (class46.anInt774 == 5 && class46.anInt705 != -1) class46.method444(false, HoverActionEntry.aSpriteStore_1813, aMapSceneCache_413)!!.method2292(84, FacingDirectionNode.aRenderer6654!!, class46.anInt789)
                            method273(class46, -2835)
                            if (class46.anInt774 == 0) {
                                method107(widgetComponents, class46.anInt830, i_45_, i_46_, i_47_, i_48_, i_43_ - class46.anInt747, i_44_ - class46.anInt755, i_38_, i_39_, i_40_, i_41_)
                                if (class46.aWidgetComponentArray798 != null) Companion.method107(class46.aWidgetComponentArray798!!, class46.anInt830, i_45_, i_46_, i_47_, i_48_, i_43_ - class46.anInt747, i_44_ - class46.anInt755, i_38_, i_39_, i_40_, i_41_)
                                val class348_sub41 = ((MinimapSpriteRenderer.aHashtable_4915!!.method3480(class46.anInt830.toLong(), -6008)) as RegionSceneShifter?)
                                if (class348_sub41 != null) {
                                    if ((Client.aSceneProjector_10434 == ParticleEmitterNode.aSceneProjector_186) && (class348_sub41.anInt7053) == 0 && !ScrollbarComponent.aBoolean8335 && bool && !TextureCubeProvider.aBoolean6327) method661(105.toByte())
                                    method1373(class348_sub41.anInt7050, i_43_, i_45_, i_47_, i_39_, i_38_, -1391, i_40_, i_48_, i_44_, i_41_, i_46_)
                                }
                            }
                        }
                    }
                }
            }
        }

        fun method108(widgetComponent: WidgetComponent?): WidgetComponent? {
            var class46 = widgetComponent
            val i: Int = Companion.method105(class46!!)!!.method3304(125.toByte())
            if (i == 0) return null
            for (i_90_ in 0..<i) {
                class46 = method2570(1512932720, class46!!.anInt834)
                if (class46 == null) return null
            }
            return class46
        }

        fun method109() {
            for (i in 0..<GlCubemapLightPass.anInt7319) {
                val `is`: IntArray = NpcType.anIntArrayArray9678!![i]!!
                for (i_91_ in 0..<RangeThresholdTextureNode.anInt9109) `is`[i_91_] = 0
            }
        }

        fun method110(i: Int) {
            aNodeDeque_5185 = null
            if (i == 31) anIntArray5176 = null
        }

        fun method111(widgetComponent: WidgetComponent): Boolean {
            if (TextureCubeProvider.aBoolean6327) {
                if (method105(widgetComponent)!!.anInt7098 != 0) return false
                if (widgetComponent.anInt774 == 0) return false
            }
            return widgetComponent.aBoolean813
        }

        fun method112() {
            val i = ShaderState.anInt6513
            val `is` = ScrollTexMaterialPass.anIntArray6290
            val i_92_ = if (MouseInputTracker.aBoolean7444) i else i + ModelDefinitionLoader.anInt2057
            for (i_93_ in 0..<i_92_) {
                val class318_sub1_sub3_sub3: ProjectedGroundDecor?
                if (i_93_ < i) class318_sub1_sub3_sub3 = (LoadingBarRenderer.aPlayerArray5058!![`is`!![i_93_]])
                else class318_sub1_sub3_sub3 = ((NpcEntityUpdater.aHashtable_3654!!.method3480(Client.anIntArray1233!![i_93_ - i].toLong(), -6008) as NpcReference).aNpc_6859)
                if (class318_sub1_sub3_sub3!!.anInt10285 >= 0) {
                    val i_94_ = class318_sub1_sub3_sub3.method2436(74.toByte())
                    if ((i_94_ and 0x1) == 0) {
                        if ((class318_sub1_sub3_sub3.x and 0x1ff) == 0 && (class318_sub1_sub3_sub3.y and 0x1ff) == 0) continue
                    } else if ((class318_sub1_sub3_sub3.x and 0x1ff) == 256 && ((class318_sub1_sub3_sub3.y) and 0x1ff) == 256) continue
                    class318_sub1_sub3_sub3.anInt6382 = (method2064(class318_sub1_sub3_sub3.x, class318_sub1_sub3_sub3.plane.toInt(), 11219, class318_sub1_sub3_sub3.y))
                    NativeBufferHandle.method850(class318_sub1_sub3_sub3, true)
                }
            }
        }

        fun method115() {
            val i = ShaderState.anInt6513
            val `is` = ScrollTexMaterialPass.anIntArray6290
            val i_112_ = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub13_7236!!.method1776(-32350)
            val bool = i_112_ == 1 && i > 200 || i_112_ == 0 && i > 50
            for (i_113_ in 0..<i) {
                val player = LoadingBarRenderer.aPlayerArray5058!![`is`!![i_113_]]
                if (!player!!.method2457((-90).toByte())) player.anInt10285 = -1
                else if (player.aBoolean10551) player.anInt10285 = -1
                else {
                    player.method2409((-126).toByte())
                    if ((player.aShort8743) < 0 || (player.aShort8750) < 0 || (player.aShort8751) >= GlCubemapLightPass.anInt7319 || (player.aShort8747) >= RangeThresholdTextureNode.anInt9109) player.anInt10285 = -1
                    else {
                        player.aBoolean10521 = (player.aBoolean10213 && bool)
                        if (player == LocalPlayerState.aPlayer_1907) player.anInt10285 = 2147483647
                        else {
                            var i_114_ = 0
                            if (!player.aBoolean10309) i_114_++
                            if (player.anInt10223 > GlGroundShaderPass.anInt7396) i_114_ += 2
                            i_114_ += 5 - player.method2436(101.toByte()) shl 2
                            if (player.aBoolean10554) i_114_ += 512
                            else {
                                if (ByteArrayPool.anInt495 == 0) i_114_ += 32
                                else i_114_ += 128
                                i_114_ += 256
                            }
                            player.anInt10285 = i_114_ + 1
                        }
                    }
                }
            }
            for (i_115_ in 0..<ModelDefinitionLoader.anInt2057) {
                val npc = ((NpcEntityUpdater.aHashtable_3654!!.method3480(Client.anIntArray1233!![i_115_].toLong(), -6008) as NpcReference).aNpc_6859)
                if (!npc!!.method2445((-4).toByte()) || !(npc.aNpcType_10505!!.method796(ProjectedGroundDecor.aVarpStore_10209!!, 18627))) npc.anInt10285 = -1
                else {
                    npc.method2409((-118).toByte())
                    if ((npc.aShort8743) < 0 || (npc.aShort8750) < 0 || (npc.aShort8751) >= GlCubemapLightPass.anInt7319 || (npc.aShort8747) >= RangeThresholdTextureNode.anInt9109) npc.anInt10285 = -1
                    else {
                        var i_116_ = 0
                        if (!npc.aBoolean10309) i_116_++
                        if (npc.anInt10223 > GlGroundShaderPass.anInt7396) i_116_ += 2
                        i_116_ += 5 - npc.method2436(82.toByte()) shl 2
                        if (ByteArrayPool.anInt495 == 0) {
                            if (npc.aNpcType_10505!!.aBoolean1362) i_116_ += 64
                            else i_116_ += 128
                        } else if (ByteArrayPool.anInt495 == 1) {
                            if (npc.aNpcType_10505!!.aBoolean1362) i_116_ += 32
                            else i_116_ += 64
                        }
                        if (npc.aNpcType_10505!!.aBoolean1345) i_116_ += 1024
                        else if (!npc.aNpcType_10505!!.aBoolean1381) i_116_ += 256
                        npc.anInt10285 = i_116_ + 1
                    }
                }
            }
            for (i_117_ in MultiFieldRecord.aMinimapPositionStateArray6897s!!.indices) {
                val class302 = MultiFieldRecord.aMinimapPositionStateArray6897s!![i_117_]
                if (class302 != null) {
                    if (class302.anInt3840 == 1) {
                        val class348_sub22 = ((NpcEntityUpdater.aHashtable_3654!!.method3480(class302.anInt3833.toLong(), -6008)) as NpcReference?)
                        if (class348_sub22 != null) {
                            val npc = (class348_sub22.aNpc_6859)
                            if (npc!!.anInt10285 >= 0) npc.anInt10285 += 2048
                        }
                    } else if (class302.anInt3840 == 10) {
                        val player = (LoadingBarRenderer.aPlayerArray5058!![class302.anInt3833])
                        if (player != null && (player != LocalPlayerState.aPlayer_1907) && player.anInt10285 >= 0) player.anInt10285 += 2048
                    }
                }
            }
        }

        fun method117(i: Int) {
            val i_122_ = ShaderState.anInt6513
            val `is` = ScrollTexMaterialPass.anIntArray6290
            for (i_123_ in 0..<i_122_ + ModelDefinitionLoader.anInt2057) {
                val class318_sub1_sub3_sub3: ProjectedGroundDecor?
                if (i_123_ < i_122_) class318_sub1_sub3_sub3 = (LoadingBarRenderer.aPlayerArray5058!![`is`!![i_123_]])
                else class318_sub1_sub3_sub3 = (NpcEntityUpdater.aHashtable_3654!!.method3480(Client.anIntArray1233!![i_123_ - i_122_].toLong(), -6008) as NpcReference).aNpc_6859
                if (class318_sub1_sub3_sub3!!.plane.toInt() == i && (class318_sub1_sub3_sub3.anInt10285) >= 0) {
                    val i_124_ = class318_sub1_sub3_sub3.method2436(114.toByte())
                    if ((i_124_ and 0x1) == 0) {
                        if ((class318_sub1_sub3_sub3.x and 0x1ff) != 0 || (class318_sub1_sub3_sub3.y and 0x1ff) != 0) continue
                    } else if ((class318_sub1_sub3_sub3.x and 0x1ff) != 256 || ((class318_sub1_sub3_sub3.y) and 0x1ff) != 256) continue
                    if (i_124_ == 1) {
                        val i_125_ = (class318_sub1_sub3_sub3.x shr 9)
                        val i_126_ = (class318_sub1_sub3_sub3.y shr 9)
                        if ((class318_sub1_sub3_sub3.anInt10285) > (NpcType.anIntArrayArray9678!![i_125_]!![i_126_])) {
                            NpcType.anIntArrayArray9678!![i_125_]!![i_126_] = class318_sub1_sub3_sub3.anInt10285
                            FlickeringEffectsOptionState.anIntArrayArray5921!![i_125_]!![i_126_] = 1
                        } else if (class318_sub1_sub3_sub3.anInt10285 == (NpcType.anIntArrayArray9678!![i_125_]!![i_126_])) FlickeringEffectsOptionState.anIntArrayArray5921!![i_125_]!![i_126_] = FlickeringEffectsOptionState.anIntArrayArray5921!![i_125_]!![i_126_] + 1
                    } else {
                        val i_127_ = (i_124_ - 1) * 256 + 60
                        val i_128_ = ((class318_sub1_sub3_sub3.x - i_127_) shr 9)
                        val i_129_ = ((class318_sub1_sub3_sub3.y - i_127_) shr 9)
                        val i_130_ = ((class318_sub1_sub3_sub3.x + i_127_) shr 9)
                        val i_131_ = ((class318_sub1_sub3_sub3.y + i_127_) shr 9)
                        for (i_132_ in i_128_..i_130_) {
                            for (i_133_ in i_129_..i_131_) {
                                if (class318_sub1_sub3_sub3.anInt10285 > (NpcType.anIntArrayArray9678!![i_132_]!![i_133_])) {
                                    NpcType.anIntArrayArray9678!![i_132_]!![i_133_] = class318_sub1_sub3_sub3.anInt10285
                                    FlickeringEffectsOptionState.anIntArrayArray5921!![i_132_]!![i_133_] = 1
                                } else if (class318_sub1_sub3_sub3.anInt10285 == (NpcType.anIntArrayArray9678!![i_132_]!![i_133_])) FlickeringEffectsOptionState.anIntArrayArray5921!![i_132_]!![i_133_] = FlickeringEffectsOptionState.anIntArrayArray5921!![i_132_]!![i_133_] + 1
                            }
                        }
                    }
                }
            }
        }
        var aBoolean6997: Boolean = false


        var anInt10430: Int = 0
        @Throws(IOException::class)
        fun method3201(bool: Boolean): Boolean {
            anInt10430++
            if (Client.aAbstractGameSocket_9165 == null) return false
            if (InboundPacketHeader.aInboundPacketHeader_6584 == null) {
                if (GroundItemRenderState.aBoolean1661) {
                    if (!Client.aAbstractGameSocket_9165!!.method1705(1, 119)) return false
                    Client.aAbstractGameSocket_9165!!.method1701(1, 0, 6.toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                    StringCacheNode.anInt7213 = 0
                    GroundItemRenderState.aBoolean1661 = false
                    MinimapRectClipper.anInt221++
                }
                CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                if (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.method3404(-1510)) {
                    if (!Client.aAbstractGameSocket_9165!!.method1705(1, 119)) return false
                    Client.aAbstractGameSocket_9165!!.method1701(1, 1, 26.toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                    MinimapRectClipper.anInt221++
                    StringCacheNode.anInt7213 = 0
                }
                GroundItemRenderState.aBoolean1661 = true
                val class114s = Gl3dTexture.method248(-11271)
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.method3407(15295)
                if (i < 0 || i >= class114s.size) throw IOException("invo:" + i + " ip:" + (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197))
                InboundPacketHeader.aInboundPacketHeader_6584 = class114s[i]
                if (Loader.debug) {
                    println("Packet read: " + i + " length: " + InboundPacketHeader.aInboundPacketHeader_6584!!.anInt1749)
                }
                RadialTextureNode.anInt9341 = InboundPacketHeader.aInboundPacketHeader_6584!!.anInt1749
            }
            if (RadialTextureNode.anInt9341 == -1) {
                if (!Client.aAbstractGameSocket_9165!!.method1705(1, 116)) return false
                Client.aAbstractGameSocket_9165!!.method1701(1, 0, (-118).toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                RadialTextureNode.anInt9341 = 0xff and (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt()
                MinimapRectClipper.anInt221++
                StringCacheNode.anInt7213 = 0
            }
            if (RadialTextureNode.anInt9341 == -2) {
                if (!Client.aAbstractGameSocket_9165!!.method1705(2, 120)) return false
                Client.aAbstractGameSocket_9165!!.method1701(2, 0, 127.toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                RadialTextureNode.anInt9341 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                MinimapRectClipper.anInt221 += 2
                StringCacheNode.anInt7213 = 0
            }
            if (RadialTextureNode.anInt9341 > 0) {
                if (!Client.aAbstractGameSocket_9165!!.method1705(RadialTextureNode.anInt9341, 104)) return false
                CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197 = 0
                Client.aAbstractGameSocket_9165!!.method1701(RadialTextureNode.anInt9341, 0, (-123).toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                MinimapRectClipper.anInt221 += RadialTextureNode.anInt9341
                StringCacheNode.anInt7213 = 0
            }
            InboundPacketHeader.aInboundPacketHeader_9456 = InboundPacketHeader.aInboundPacketHeader_3145
            InboundPacketHeader.aInboundPacketHeader_3145 = InboundPacketHeader.aInboundPacketHeader_3133
            InboundPacketHeader.aInboundPacketHeader_3133 = InboundPacketHeader.aInboundPacketHeader_6584
            if (InboundPacketHeader.aInboundPacketHeader_90 == InboundPacketHeader.aInboundPacketHeader_6584) {
                MinimapTileEntry.method382(CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(118.toByte()), true)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_9503) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val bool_3_ = (i and 0x1) == 1
                val string = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(108.toByte())
                var string_4_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-92).toByte())
                if (string_4_ == "") string_4_ = string
                val string_5_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-64).toByte())
                var string_6_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-97).toByte())
                if (string_6_ == "") string_6_ = string_5_
                if (bool_3_) {
                    var i_7_ = 0
                    while ((i_7_ < ContactEntry.anInt9604)) {
                        if (ObjectSpawnDecoder.aStringArray1808!![i_7_] == string_6_) {
                            NpcConfig.aStringArray932!![i_7_] = string
                            ObjectSpawnDecoder.aStringArray1808!![i_7_] = string_4_
                            WeaveTextureNode.aStringArray9275!![i_7_] = string_5_
                            IndexedSprite.aStringArray5197!![i_7_] = string_6_
                            break
                        }
                        i_7_++
                    }
                } else {
                    NpcConfig.aStringArray932!![ContactEntry.anInt9604] = string
                    ObjectSpawnDecoder.aStringArray1808!![ContactEntry.anInt9604] = string_4_
                    WeaveTextureNode.aStringArray9275!![(ContactEntry.anInt9604)] = string_5_
                    IndexedSprite.aStringArray5197!![ContactEntry.anInt9604] = string_6_
                    BasicGlRenderPass.aBooleanArray7304!![ContactEntry.anInt9604] = WhirlpoolHash.method1166(i, 2) == 2
                    ContactEntry.anInt9604++
                }
                Crc64Hashable.anInt4985 = ResourceLoaderThread.anInt3918
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_6424) {
                method128(NamedIdEntry.aRgbColorPalette_6891, 8.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_4388 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByte(-100)
                val i_8_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-111)
                WallSceneEntity.method2397((-126).toByte())
                MinimapPolygonDrawer.method467(i_8_, -18075, i.toInt())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_4707 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntLittle((-123).toByte())
                val i_9_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                WallSceneEntity.method2397((-124).toByte())
                val class348_sub41 = (MinimapSpriteRenderer.aHashtable_4915!!.method3480(i_9_.toLong(), -6008) as RegionSceneShifter?)
                val class348_sub41_10_ = (MinimapSpriteRenderer.aHashtable_4915!!.method3480(i.toLong(), -6008) as RegionSceneShifter?)
                if (class348_sub41_10_ != null) ScrollingWidgetComponentNode.method1118((class348_sub41 == null || (class348_sub41_10_.anInt7050 != class348_sub41.anInt7050)), false, class348_sub41_10_, 2533)
                if (class348_sub41 != null) {
                    class348_sub41.method2715(32.toByte())
                    MinimapSpriteRenderer.aHashtable_4915!!.method3483(102.toByte(), i.toLong(), class348_sub41)
                }
                var class46 = method2570(1512932720, i_9_)
                if (class46 != null) ConfigFlagUtil.method1916(-9343, class46)
                class46 = method2570(1512932720, i)
                if (class46 != null) {
                    ConfigFlagUtil.method1916(-9343, class46)
                    ConfigFlagUtil.method1913(true, -123, class46)
                }
                if (RenderNodeStatics.anInt9721 != -1) BloomGraphicsOptionState.method1775((-8).toByte(), RenderNodeStatics.anInt9721, 1)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (bool != true) aSceneProjector_10434 = null
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_1762) {
                LightingOptionState.aString5882 = (if (RadialTextureNode.anInt9341 > 2) CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-119).toByte()) else LocalizedText.aLocalizedText_3509!!.method2063(ChatCommandProcessor.anInt6967, 544))
                MapElementLookup.anInt4144 = (if (RadialTextureNode.anInt9341 <= 0) -1 else CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944))
                if (MapElementLookup.anInt4144 == 65535) MapElementLookup.anInt4144 = -1
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_3135 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteAdd(62.toByte())
                val i_11_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntLittle((-126).toByte())
                WallSceneEntity.method2397((-124).toByte())
                MenuActionNode.method2813(true, i, i_11_)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_316) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                val i_12_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                val i_13_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(10)
                val i_14_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                WallSceneEntity.method2397((-127).toByte())
                AbstractGameSocketStatics.method1703(7, i, i_13_ shl 16 or i_14_, 4, i_12_)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_9216 == InboundPacketHeader.aInboundPacketHeader_6584) {
                MinimapStateReset.anInt1872 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShort(13638)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                TurbulenceTextureNode.anInt9313 = ResourceLoaderThread.anInt3918
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_4126) {
                method128(SynthVoiceGroup.aRgbColorPalette_8853, 8.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_2285) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                WallSceneEntity.method2397((-124).toByte())
                AbstractGameSocketStatics.method1703(3, i, -1, 4, -1)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_330) {
                val bool_15_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                val string = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-34).toByte())
                var string_16_ = string
                if (bool_15_) string_16_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-64).toByte())
                val l = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readLong(-456577760)
                val l_17_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944).toLong()
                val l_18_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readMedium(-1).toLong()
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val l_19_ = l_18_ + (l_17_ shl 32)
                var bool_20_ = false
                while_217_@ do {
                    for (i_21_ in 0..99) {
                        if (l_19_ == SceneCollisionEntry.aLongArray4410!![i_21_]) {
                            bool_20_ = true
                            break@while_217_
                        }
                    }
                    if (i <= 1) {
                        if ((RangeThresholdTextureNode.aBoolean9103 && !PlayerUpdateDecoder.aBoolean1915) || MinimapTriangleDrawer.aBoolean5233) bool_20_ = true
                        else if (ObjectSpawnDecoder.method3455(string_16_, 28280)) bool_20_ = true
                    }
                } while (false)
                if (!bool_20_ && BackgroundWorkerThread.anInt3227 == 0) {
                    SceneCollisionEntry.aLongArray4410!![NpcType.anInt1359] = l_19_
                    NpcType.anInt1359 = (1 + NpcType.anInt1359) % 100
                    val string_22_ = (CompositeRgbNoiseTexture.method572((InvertTextureNode.method3136(64.toByte(), CircleRasterizer.aClass348_Sub49_Sub2_3813)), 23034))
                    if (i == 2 || i == 3) TrackedGroundDecor.method2477("<img=1>" + string_16_, string_22_, (-126).toByte(), -1, "<img=1>" + string, ShadowQualityOptionState.method1788((-76).toByte(), l), 9, 0, string)
                    else if (i != 1) TrackedGroundDecor.method2477(string_16_, string_22_, (-125).toByte(), -1, string, ShadowQualityOptionState.method1788((-83).toByte(), l), 9, 0, string)
                    else TrackedGroundDecor.method2477("<img=0>" + string_16_, string_22_, (-126).toByte(), -1, "<img=0>" + string, ShadowQualityOptionState.method1788((-75).toByte(), l), 9, 0, string)
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_3751) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortLittle(!bool)
                WallSceneEntity.method2397((-126).toByte())
                FontDefinition.method1189(-1, i)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_82) {
                method128(GlShaderObjectHandle.aRgbColorPalette_515, 8.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_4779) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteAdd((-78).toByte())
                val i_23_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                val i_24_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(127)
                val i_25_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-128).toByte())
                val i_26_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                WallSceneEntity.method2397((-127).toByte())
                MinimapStateReset.aBooleanArray2374!![i_23_] = true
                CollisionMapAccessor.anIntArray3552!![i_23_] = i
                ModelHeaderCache.anIntArray3273!![i_23_] = i_25_
                MapTileShape.anIntArray4196!![i_23_] = i_26_
                GroundDecorSceneEntity.anIntArray9981!![i_23_] = i_24_
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_6089) {
                FileExistsCondition.anInt4786 = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteInverse(-622951480).toInt() shl 3)
                GradientLookupEffect.anInt9200 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteAdd((-84).toByte())
                BufferedMessageQueue.anInt3581 = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.method3341(-8679).toInt() shl 3)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_304) {
                RegionMapDecoder.method853(99.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return false
            }
            if (InboundPacketHeader.aInboundPacketHeader_4269 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteAdd(71.toByte())
                WallSceneEntity.method2397((-128).toByte())
                ByteArrayPool.anInt495 = i
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_8590 == InboundPacketHeader.aInboundPacketHeader_6584) {
                method128(BufferedFileReader.aRgbColorPalette_4537, 8.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_3240) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-117)
                val i_27_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(125)
                WallSceneEntity.method2397((-128).toByte())
                method2396(i, i_27_, 0, 3)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_4027 == InboundPacketHeader.aInboundPacketHeader_6584) {
                var i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                if (i == 65535) i = -1
                val i_28_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                val i_29_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                WallSceneEntity.method2397((-128).toByte())
                TrigLookupTables.method727((-63).toByte(), i_29_, i, i_28_)
                val class213 = ClientException.aModelHeaderCache_112!!.method1940(-126, i)
                ObjectSpawnDecoder.method1085(class213.anInt2825, class213.anInt2787, (-59).toByte(), class213.anInt2781, i_28_)
                SkeletalAnimFrameLoader.method350(class213.anInt2779, class213.anInt2826, 125, i_28_, class213.anInt2810)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_1917 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_30_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val bool_31_ = (0x1 and i_30_) == 1
                LocTypeDefLoader.method1405(i, bool_31_, true)
                val i_32_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                for (i_33_ in 0..<i_32_) {
                    var i_34_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteAdd((-127).toByte())
                    if (i_34_ == 255) {
                        val index = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197
                        val data = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154
                        i_34_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                    }
                    val i_35_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(-78)
                    DelegatingRenderCanvas.method121(i, -364570972, bool_31_, i_33_, i_34_, i_35_ - 1)
                }
                LoadingScreenState.anIntArray2633!![WhirlpoolHash.method1166(31, DualMaterialContainer.anInt1631++)] = i
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_3773) {
                NormalMapTextureNode.method3141(false, 11.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return false
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_3809) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                val i_36_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                ProjectedGroundDecor.aVarpStore_10209!!.method1313(42.toByte(), i, i_36_)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_6056) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(75.toByte())
                val i_37_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                var i_38_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(125)
                val i_39_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_40_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                val bool_41_ = (0x80 and i) != 0
                val i_42_ = 0x7 and i
                var i_43_ = (i and 0x7e) shr 3
                if (i_43_ == 15) i_43_ = -1
                if (i_40_ shr 30 == 0) {
                    if (i_40_ shr 29 != 0) {
                        val i_44_ = i_40_ and 0xffff
                        val class348_sub22 = (NpcEntityUpdater.aHashtable_3654!!.method3480(i_44_.toLong(), -6008) as NpcReference?)
                        if (class348_sub22 != null) {
                            val npc = (class348_sub22.aNpc_6859)!!
                            if (i_38_ == 65535) i_38_ = -1
                            var bool_45_ = true
                            val i_46_ = (if (!bool_41_) npc.anInt10269 else npc.anInt10291)
                            if (i_38_ != -1 && i_46_ != -1) {
                                if (i_46_ == i_38_) {
                                    val class368 = ConstantColourTextureNode.aMapElementDefinitionCache_9245!!.method2543(55.toByte(), i_38_)
                                    if (class368.aBoolean4487 && class368.anInt4503 != -1) {
                                        val class17 = (ParticleEmitterNode.aWidgetCache_191!!.method835(class368.anInt4503, 7))
                                        val i_47_ = class17.anInt248
                                        if (i_47_ != 0 && i_47_ != 2) {
                                            if (i_47_ == 1) bool_45_ = true
                                        } else bool_45_ = false
                                    }
                                } else {
                                    val class368 = ConstantColourTextureNode.aMapElementDefinitionCache_9245!!.method2543(105.toByte(), i_38_)
                                    val class368_48_ = ConstantColourTextureNode.aMapElementDefinitionCache_9245!!.method2543(56.toByte(), i_46_)
                                    if (class368.anInt4503 != -1 && (class368_48_.anInt4503 != -1)) {
                                        val class17 = (ParticleEmitterNode.aWidgetCache_191!!.method835(class368.anInt4503, 7))
                                        val class17_49_ = (ParticleEmitterNode.aWidgetCache_191!!.method835((class368_48_.anInt4503), 7))
                                        if (class17.anInt239 < class17_49_.anInt239) bool_45_ = false
                                    }
                                }
                            }
                            if (bool_45_) {
                                if (bool_41_) {
                                    npc.anInt10211 = i_39_ + GlGroundShaderPass.anInt7396
                                    npc.anInt10260 = i_37_
                                    npc.anInt10291 = i_38_
                                    npc.anInt10289 = i_43_
                                    npc.anInt10202 = i_42_
                                    npc.anInt10273 = 0
                                    npc.anInt10276 = 1
                                    npc.anInt10224 = 0
                                    if (npc.anInt10211 > GlGroundShaderPass.anInt7396) npc.anInt10224 = -1
                                    if (npc.anInt10291 != -1 && (GlGroundShaderPass.anInt7396 == (npc.anInt10211))) {
                                        val i_51_ = (ConstantColourTextureNode.aMapElementDefinitionCache_9245!!.method2543(103.toByte(), (npc.anInt10291)).anInt4503)
                                        if (i_51_ != -1) {
                                            val class17 = ParticleEmitterNode.aWidgetCache_191!!.method835(i_51_, 7)
                                            if (class17 != null && (class17.anIntArray237) != null && !(npc.aBoolean10309)) TypedRecordTable.method2178(npc, 0, class17, -17)
                                        }
                                    }
                                } else {
                                    npc.anInt10243 = 0
                                    npc.anInt10220 = i_37_
                                    npc.anInt10269 = i_38_
                                    npc.anInt10240 = 0
                                    npc.anInt10278 = i_43_
                                    npc.anInt10225 = GlGroundShaderPass.anInt7396 + i_39_
                                    npc.anInt10237 = i_42_
                                    npc.anInt10283 = 1
                                    if (npc.anInt10225 > GlGroundShaderPass.anInt7396) npc.anInt10240 = -1
                                    if (npc.anInt10269 != -1 && (GlGroundShaderPass.anInt7396 == (npc.anInt10225))) {
                                        val i_50_ = (ConstantColourTextureNode.aMapElementDefinitionCache_9245!!.method2543(87.toByte(), (npc.anInt10269)).anInt4503)
                                        if (i_50_ != -1) {
                                            val class17 = ParticleEmitterNode.aWidgetCache_191!!.method835(i_50_, 7)
                                            if (class17 != null && (class17.anIntArray237) != null && !(npc.aBoolean10309)) TypedRecordTable.method2178(npc, 0, class17, -44)
                                        }
                                    }
                                }
                            }
                        }
                    } else if (i_40_ shr 28 != 0) {
                        val i_52_ = i_40_ and 0xffff
                        val player: Player?
                        if (CharCodeMap.anInt9591 != i_52_) player = (LoadingBarRenderer.aPlayerArray5058!![i_52_])
                        else player = LocalPlayerState.aPlayer_1907
                        if (player != null) {
                            if (i_38_ == 65535) i_38_ = -1
                            var bool_53_ = true
                            val i_54_ = (if (!bool_41_) player.anInt10269 else player.anInt10291)
                            if (i_38_ != -1 && i_54_ != -1) {
                                if (i_38_ == i_54_) {
                                    val class368 = ConstantColourTextureNode.aMapElementDefinitionCache_9245!!.method2543(111.toByte(), i_38_)
                                    if (class368.aBoolean4487 && class368.anInt4503 != -1) {
                                        val class17 = (ParticleEmitterNode.aWidgetCache_191!!.method835(class368.anInt4503, 7))
                                        val i_57_ = class17.anInt248
                                        if (i_57_ != 0 && i_57_ != 2) {
                                            if (i_57_ == 1) bool_53_ = true
                                        } else bool_53_ = false
                                    }
                                } else {
                                    val class368 = ConstantColourTextureNode.aMapElementDefinitionCache_9245!!.method2543(105.toByte(), i_38_)
                                    val class368_55_ = ConstantColourTextureNode.aMapElementDefinitionCache_9245!!.method2543(118.toByte(), i_54_)
                                    if (class368.anInt4503 != -1 && class368_55_.anInt4503 != -1) {
                                        val class17 = (ParticleEmitterNode.aWidgetCache_191!!.method835(class368.anInt4503, 7))
                                        val class17_56_ = (ParticleEmitterNode.aWidgetCache_191!!.method835((class368_55_.anInt4503), 7))
                                        if (class17.anInt239 < class17_56_.anInt239) bool_53_ = false
                                    }
                                }
                            }
                            if (bool_53_) {
                                if (bool_41_) {
                                    player.anInt10224 = 0
                                    player.anInt10260 = i_37_
                                    player.anInt10289 = i_43_
                                    player.anInt10273 = 0
                                    player.anInt10276 = 1
                                    player.anInt10291 = i_38_
                                    player.anInt10211 = i_39_ + GlGroundShaderPass.anInt7396
                                    player.anInt10202 = i_42_
                                    if (player.anInt10211 > GlGroundShaderPass.anInt7396) player.anInt10224 = -1
                                    if (player.anInt10291 == 65535) player.anInt10291 = -1
                                    if ((player.anInt10291 != -1) && ((player.anInt10211) == GlGroundShaderPass.anInt7396)) {
                                        val i_58_ = (ConstantColourTextureNode.aMapElementDefinitionCache_9245!!.method2543(45.toByte(), (player.anInt10291)).anInt4503)
                                        if (i_58_ != -1) {
                                            val class17 = ParticleEmitterNode.aWidgetCache_191!!.method835(i_58_, 7)
                                            if (class17 != null && (class17.anIntArray237) != null && !(player.aBoolean10309)) TypedRecordTable.method2178(player, 0, class17, -120)
                                        }
                                    }
                                } else {
                                    player.anInt10269 = i_38_
                                    player.anInt10243 = 0
                                    player.anInt10220 = i_37_
                                    player.anInt10240 = 0
                                    player.anInt10278 = i_43_
                                    player.anInt10237 = i_42_
                                    player.anInt10283 = 1
                                    player.anInt10225 = i_39_ + GlGroundShaderPass.anInt7396
                                    if (player.anInt10269 == 65535) player.anInt10269 = -1
                                    if (GlGroundShaderPass.anInt7396 < (player.anInt10225)) player.anInt10240 = -1
                                    if ((player.anInt10269 != -1) && (GlGroundShaderPass.anInt7396 == (player.anInt10225))) {
                                        val i_59_ = (ConstantColourTextureNode.aMapElementDefinitionCache_9245!!.method2543(81.toByte(), (player.anInt10269)).anInt4503)
                                        if (i_59_ != -1) {
                                            val class17 = ParticleEmitterNode.aWidgetCache_191!!.method835(i_59_, 7)
                                            if (class17 != null && (class17.anIntArray237) != null && !(player.aBoolean10309)) TypedRecordTable.method2178(player, 0, class17, -101)
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    val i_60_ = (i_40_ and 0x33705717) shr 28
                    val i_61_ = -ArbVertexProgram.regionTileX + ((0xffff4fe and i_40_) shr 14)
                    val i_62_ = -RegionMapDecoder.regionTileY + (0x3fff and i_40_)
                    if (i_61_ >= 0 && i_62_ >= 0 && GlCubemapLightPass.anInt7319 > i_61_ && RangeThresholdTextureNode.anInt9109 > i_62_) {
                        val i_63_ = 256 + 512 * i_61_
                        val i_64_ = 512 * i_62_ + 256
                        var i_65_ = i_60_
                        if (i_65_ < 3 && NpcType.method802(i_62_, i_61_, true)) i_65_++
                        val class318_sub1_sub3_sub4 = (MapElementDecor(i_38_, i_39_, GlGroundShaderPass.anInt7396, i_60_, i_65_, i_63_, -i_37_ + CollisionMapAccessor.method2064(i_63_, i_60_, 11219, i_64_), i_64_, i_61_, i_61_, i_62_, i_62_, i_42_))
                        OpenGlRenderNode.aNodeDeque_10492!!.method1999(ChatScriptListNode(class318_sub1_sub3_sub4), -20180)
                    }
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_1120) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-116)
                val string = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-85).toByte())
                WallSceneEntity.method2397((-125).toByte())
                method3965(string, i, 2)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_1234) {
                ModelDataCache.anInt359 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.method3369(125.toByte())
                RangeThresholdTextureNode.aBoolean9103 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_4331 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val string = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(122.toByte())
                val bool_66_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                val string_67_: String?
                if (!bool_66_) string_67_ = string
                else string_67_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(125.toByte())
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_68_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByte(-128)
                var bool_69_ = false
                if (i_68_.toInt() == -128) bool_69_ = true
                if (bool_69_) {
                    if (ByteArrayPool.anInt496 == 0) {
                        InboundPacketHeader.aInboundPacketHeader_6584 = null
                        return true
                    }
                    val bool_70_ = false
                    var i_71_: Int
                    i_71_ = 0
                    while (ByteArrayPool.anInt496 > i_71_) {
                        if (HostPingThread.aWorldListEntryArray2261!![i_71_]!!.aString306 == string_67_ && i == (HostPingThread.aWorldListEntryArray2261!![i_71_]!!.anInt308)) break
                        i_71_++
                    }
                    if (ByteArrayPool.anInt496 > i_71_) {
                        while ( /**/-1 + ByteArrayPool.anInt496 > i_71_) {
                            HostPingThread.aWorldListEntryArray2261!![i_71_] = HostPingThread.aWorldListEntryArray2261!![i_71_ - -1]
                            i_71_++
                        }
                        ByteArrayPool.anInt496--
                        HostPingThread.aWorldListEntryArray2261!![ByteArrayPool.anInt496] = null
                    }
                } else {
                    val string_72_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-74).toByte())
                    val worldListEntry = WorldListEntry()
                    worldListEntry.aString306 = string_67_
                    worldListEntry.aString314 = string
                    worldListEntry.aString312 = method2127(2, worldListEntry.aString306)
                    worldListEntry.aString313 = string_72_
                    worldListEntry.anInt308 = i
                    worldListEntry.aByte310 = i_68_
                    var i_73_: Int
                    i_73_ = -1 + ByteArrayPool.anInt496
                    while (i_73_ >= 0) {
                        val i_74_ = HostPingThread.aWorldListEntryArray2261!![i_73_]!!.aString312!!.compareTo(worldListEntry.aString312!!)
                        if (i_74_ == 0) {
                            HostPingThread.aWorldListEntryArray2261!![i_73_]!!.anInt308 = i
                            HostPingThread.aWorldListEntryArray2261!![i_73_]!!.aByte310 = i_68_
                            HostPingThread.aWorldListEntryArray2261!![i_73_]!!.aString313 = string_72_
                            if (string_67_ == LocalPlayerState.aPlayer_1907!!.aString10544) NativeIndexBuffer.aByte4702 = i_68_
                            Client.anInt2986 = ResourceLoaderThread.anInt3918
                            InboundPacketHeader.aInboundPacketHeader_6584 = null
                            return true
                        }
                        if (i_74_ < 0) break
                        i_73_--
                    }
                    if (HostPingThread.aWorldListEntryArray2261!!.size <= ByteArrayPool.anInt496) {
                        InboundPacketHeader.aInboundPacketHeader_6584 = null
                        return true
                    }
                    for (i_75_ in ByteArrayPool.anInt496 - 1 downTo i_73_ + 1) HostPingThread.aWorldListEntryArray2261!![1 + i_75_] = HostPingThread.aWorldListEntryArray2261!![i_75_]
                    if (ByteArrayPool.anInt496 == 0) HostPingThread.aWorldListEntryArray2261 = arrayOfNulls<WorldListEntry>(100)
                    HostPingThread.aWorldListEntryArray2261!![i_73_ - -1] = worldListEntry
                    ByteArrayPool.anInt496++
                    if (string_67_ == LocalPlayerState.aPlayer_1907!!.aString10544) NativeIndexBuffer.aByte4702 = i_68_
                }
                Client.anInt2986 = ResourceLoaderThread.anInt3918
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_5949 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_76_ = i shr 5
                val i_77_ = 0x1f and i
                if (i_77_ == 0) {
                    MultiFieldRecord.aMinimapPositionStateArray6897s!![i_76_] = null
                    InboundPacketHeader.aInboundPacketHeader_6584 = null
                    return true
                }
                val minimapPositionState = MinimapPositionState()
                minimapPositionState.anInt3840 = i_77_
                minimapPositionState.anInt3831 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                if (minimapPositionState.anInt3831 >= 0 && (minimapPositionState.anInt3831 < CustomCursorsOptionState.aAbstractModelRendererArray5933!!.size)) {
                    if (minimapPositionState.anInt3840 == 1 || minimapPositionState.anInt3840 == 10) {
                        minimapPositionState.anInt3833 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                        CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197 += 6
                    } else if (minimapPositionState.anInt3840 >= 2 && minimapPositionState.anInt3840 <= 6) {
                        if (minimapPositionState.anInt3840 == 2) {
                            minimapPositionState.anInt3832 = 256
                            minimapPositionState.anInt3835 = 256
                        }
                        if (minimapPositionState.anInt3840 == 3) {
                            minimapPositionState.anInt3835 = 0
                            minimapPositionState.anInt3832 = 256
                        }
                        if (minimapPositionState.anInt3840 == 4) {
                            minimapPositionState.anInt3835 = 512
                            minimapPositionState.anInt3832 = 256
                        }
                        if (minimapPositionState.anInt3840 == 5) {
                            minimapPositionState.anInt3835 = 256
                            minimapPositionState.anInt3832 = 0
                        }
                        if (minimapPositionState.anInt3840 == 6) {
                            minimapPositionState.anInt3835 = 256
                            minimapPositionState.anInt3832 = 512
                        }
                        minimapPositionState.anInt3840 = 2
                        minimapPositionState.anInt3838 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        minimapPositionState.anInt3835 += (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944) + -ArbVertexProgram.regionTileX shl 9)
                        minimapPositionState.anInt3832 += (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944) - RegionMapDecoder.regionTileY shl 9)
                        minimapPositionState.anInt3839 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) shl 2
                        minimapPositionState.anInt3837 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    }
                    minimapPositionState.anInt3834 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    if (minimapPositionState.anInt3834 == 65535) minimapPositionState.anInt3834 = -1
                    MultiFieldRecord.aMinimapPositionStateArray6897s!![i_76_] = minimapPositionState
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_2279 == InboundPacketHeader.aInboundPacketHeader_6584) {
                NormalMapTextureNode.method3141(ProjectileFactory.aBoolean2895, 11.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return false
            }

            if (InboundPacketHeader.aInboundPacketHeader_7323 == InboundPacketHeader.aInboundPacketHeader_6584) {
                SynthVoiceGroup.method2822(-101, CircleRasterizer.aClass348_Sub49_Sub2_3813!!, RadialTextureNode.anInt9341)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_6121) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                val i_78_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntLittle((-118).toByte())
                WallSceneEntity.method2397((-128).toByte())
                NpcUpdateProcessor.method855(6, i, i_78_)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_3371 == InboundPacketHeader.aInboundPacketHeader_6584) {
                method128(StaticNoiseTexture.aRgbColorPalette_8662, 8.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_7324) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                val i_79_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-120)
                val i_80_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(125)
                WallSceneEntity.method2397((-125).toByte())
                method1540(-101, i, i_79_ + (i_80_ shl 16))
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_4433) {
                ProjectedGroundDecor.aVarpStore_10209!!.method1314(80.toByte())
                TypedRecordTable.anInt3695 += 32
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_3842) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                WallSceneEntity.method2397((-128).toByte())
                AbstractGameSocketStatics.method1703(5, i, CharCodeMap.anInt9591, 4, 0)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6528 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(-124)
                WallSceneEntity.method2397((-124).toByte())
                OpenGlModel.method690((-107).toByte(), i)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_8365 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val bool_81_ = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                val string = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-29).toByte())
                var string_82_ = string
                if (bool_81_) string_82_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-98).toByte())
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                var bool_83_ = false
                if (i <= 1) {
                    if (RangeThresholdTextureNode.aBoolean9103 && !PlayerUpdateDecoder.aBoolean1915 || MinimapTriangleDrawer.aBoolean5233) bool_83_ = true
                    else if (i <= 1 && ObjectSpawnDecoder.method3455(string_82_, 28280)) bool_83_ = true
                }
                if (!bool_83_ && BackgroundWorkerThread.anInt3227 == 0) {
                    val string_84_ = (CompositeRgbNoiseTexture.method572((InvertTextureNode.method3136(64.toByte(), CircleRasterizer.aClass348_Sub49_Sub2_3813)), 23034))
                    if (i == 2) TrackedGroundDecor.method2477("<img=1>" + string_82_, string_84_, (-119).toByte(), -1, "<img=1>" + string, null, 24, 0, string)
                    else if (i == 1) TrackedGroundDecor.method2477("<img=0>" + string_82_, string_84_, (-119).toByte(), -1, "<img=0>" + string, null, 24, 0, string)
                    else TrackedGroundDecor.method2477(string_82_, string_84_, (-115).toByte(), -1, string, null, 24, 0, string)
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_229 == InboundPacketHeader.aInboundPacketHeader_6584) {
                method128(ArbFogMaterialPass.aRgbColorPalette_6201, 8.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_5742) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(31.toByte())
                val i_85_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-104).toByte())
                val i_86_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                val i_87_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                val i_88_ = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(126) shl 2)
                WallSceneEntity.method2397((-127).toByte())
                method1844(i_85_, i_86_, true, i_88_, !bool, i_87_, i)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_1722) {
                val string = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-100).toByte())
                val objects = arrayOfNulls<Any>(1 + string.length)
                for (i in -1 + string.length downTo 0) {
                    if (string.get(i) != 's') objects[i + 1] = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                    else objects[1 + i] = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(122.toByte())
                }
                objects[0] = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                WallSceneEntity.method2397((-127).toByte())
                val class348_sub36 = WidgetActionEntry()
                class348_sub36.anObjectArray6987 = objects
                ChatCommandProcessor.method705(class348_sub36)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6075 == InboundPacketHeader.aInboundPacketHeader_6584) {
                WallSceneEntity.method2397((-127).toByte())
                method1851(125.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_7052) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntLittle((-118).toByte())
                var i_89_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(127)
                if (i_89_ == 65535) i_89_ = -1
                WallSceneEntity.method2397((-126).toByte())
                AbstractGameSocketStatics.method1703(2, i, i_89_, 4, -1)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_3368) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                WallSceneEntity.method2397((-124).toByte())
                val class348_sub41 = (MinimapSpriteRenderer.aHashtable_4915!!.method3480(i.toLong(), -6008) as RegionSceneShifter?)
                if (class348_sub41 != null) ScrollingWidgetComponentNode.method1118(true, false, class348_sub41, 2533)
                if (SpriteRenderable.aWidgetComponent_4730 != null) {
                    ConfigFlagUtil.method1916(-9343, SpriteRenderable.aWidgetComponent_4730!!)
                    SpriteRenderable.aWidgetComponent_4730 = null
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_79 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(-86)
                val i_90_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                WallSceneEntity.method2397((-124).toByte())
                OggBitstreamDecoder.method2966(i_90_, i, false)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_3925 == InboundPacketHeader.aInboundPacketHeader_6584) {
                method128(aRgbColorPalette_10437, 8.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_2972) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                ChatScriptListNode.aLinkedQueueNode_9536 = VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.method2232(80, i)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_1901) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val player: Player?
                if (i != CharCodeMap.anInt9591) player = LoadingBarRenderer.aPlayerArray5058!![i]
                else player = LocalPlayerState.aPlayer_1907
                if (player == null) {
                    InboundPacketHeader.aInboundPacketHeader_6584 = null
                    return true
                }
                var i_91_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_92_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val bool_93_ = (0x8000 and i_91_) != 0
                if ((player.aString10544) != null && player.aCompositeNpcModelBuilder_10536 != null) {
                    var bool_94_ = false
                    if (i_92_ <= 1) {
                        if (!bool_93_ && ((RangeThresholdTextureNode.aBoolean9103 && !PlayerUpdateDecoder.aBoolean1915) || MinimapTriangleDrawer.aBoolean5233)) bool_94_ = true
                        else if (ObjectSpawnDecoder.method3455(player.aString10544, 28280)) bool_94_ = true
                    }
                    if (!bool_94_ && BackgroundWorkerThread.anInt3227 == 0) {
                        var i_95_ = -1
                        val string: String?
                        if (bool_93_) {
                            i_91_ = i_91_ and 0x7fff
                            val class43 = RsaVarbitHandler.method490((-104).toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813!!))
                            i_95_ = class43.anInt615
                            string = (class43.aClass348_Sub42_Sub10_614!!.method3216(CircleRasterizer.aClass348_Sub49_Sub2_3813!!, 119.toByte()))
                        } else string = (CompositeRgbNoiseTexture.method572((InvertTextureNode.method3136(64.toByte(), CircleRasterizer.aClass348_Sub49_Sub2_3813)), 23034))
                        player.aString10292 = string!!.trim { it <= ' ' }
                        player.anInt10201 = i_91_ shr 8
                        player.anInt10234 = i_91_ and 0xff
                        player.anInt10264 = 150
                        val i_96_: Int
                        if (i_92_ != 1 && i_92_ != 2) i_96_ = if (!bool_93_) 2 else 17
                        else i_96_ = if (bool_93_) 17 else 1
                        if (i_92_ != 2) {
                            if (i_92_ != 1) TrackedGroundDecor.method2477(player.method2450(false, -121), string, (-126).toByte(), i_95_, player.method2456(true, 255), null, i_96_, 0, player.aString10537)
                            else TrackedGroundDecor.method2477("<img=0>" + player.method2450(false, -93), string, (-111).toByte(), i_95_, "<img=0>" + player.method2456(true, 255), null, i_96_, 0, player.aString10537)
                        } else TrackedGroundDecor.method2477("<img=1>" + player.method2450(false, -95), string, (-120).toByte(), i_95_, "<img=1>" + player.method2456(true, 255), null, i_96_, 0, player.aString10537)
                    }
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_1123 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val bool_97_ = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                val string = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(126.toByte())
                var string_98_ = string
                if (bool_97_) string_98_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(86.toByte())
                val l = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944).toLong()
                val l_99_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readMedium(-1).toLong()
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val l_100_ = (l shl 32) - -l_99_
                var bool_101_ = false
                while_218_@ do {
                    for (i_102_ in 0..99) {
                        if (l_100_ == SceneCollisionEntry.aLongArray4410!![i_102_]) {
                            bool_101_ = true
                            break@while_218_
                        }
                    }
                    if (i <= 1) {
                        if ((RangeThresholdTextureNode.aBoolean9103 && !PlayerUpdateDecoder.aBoolean1915) || MinimapTriangleDrawer.aBoolean5233) bool_101_ = true
                        else if (ObjectSpawnDecoder.method3455(string_98_, 28280)) bool_101_ = true
                    }
                } while (false)
                if (!bool_101_ && BackgroundWorkerThread.anInt3227 == 0) {
                    SceneCollisionEntry.aLongArray4410!![NpcType.anInt1359] = l_100_
                    NpcType.anInt1359 = (1 + NpcType.anInt1359) % 100
                    val string_103_ = (CompositeRgbNoiseTexture.method572((InvertTextureNode.method3136(64.toByte(), CircleRasterizer.aClass348_Sub49_Sub2_3813)), 23034))
                    if (i == 2) TrackedGroundDecor.method2477("<img=1>" + string_98_, string_103_, (-127).toByte(), -1, "<img=1>" + string, null, 7, 0, string)
                    else if (i == 1) TrackedGroundDecor.method2477("<img=0>" + string_98_, string_103_, (-115).toByte(), -1, "<img=0>" + string, null, 7, 0, string)
                    else TrackedGroundDecor.method2477(string_98_, string_103_, (-128).toByte(), -1, string, null, 3, 0, string)
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_9552 == InboundPacketHeader.aInboundPacketHeader_6584) {
                if (RenderNodeStatics.anInt9721 != -1) BloomGraphicsOptionState.method1775((-8).toByte(), RenderNodeStatics.anInt9721, 0)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_2248 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_104_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-87).toByte())
                val i_105_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_106_ = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortLittle(!bool) shl 2)
                val i_107_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                WallSceneEntity.method2397((-125).toByte())
                ContactEntry.method3231(i_104_, i, i_106_, i_107_, i_105_, -127)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }

            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_7113) {
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return false
            }
            if (InboundPacketHeader.aInboundPacketHeader_3427 == InboundPacketHeader.aInboundPacketHeader_6584) {
                AbstractMenuEntryStatics.method1034(RadialTextureNode.anInt9341, CircleRasterizer.aClass348_Sub49_Sub2_3813, VorbisOggDecoder.aPrivilegedOperationWorker_8992, 110)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_2527 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val bool_108_ = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                val `is` = ByteArray(RadialTextureNode.anInt9341 - 1)
                CircleRasterizer.aClass348_Sub49_Sub2_3813!!.method3389(2147483647, 0, (RadialTextureNode.anInt9341) + -1, `is`)
                ScanlineRasterFiller.method1385(bool_108_, `is`, (-104).toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_3264) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_109_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.method3341(-8679)
                WallSceneEntity.method2397((-128).toByte())
                InterfaceComponentGroup.method3244(i_109_.toInt(), i, 120)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_3265 == InboundPacketHeader.aInboundPacketHeader_6584) {
                BufferedMessageQueue.anInt3581 = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteInverse(-622951480).toInt() shl 3)
                GradientLookupEffect.anInt9200 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(98.toByte())
                FileExistsCondition.anInt4786 = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteSubtract(-27697).toInt() shl 3)
                while ((CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197) < RadialTextureNode.anInt9341) {
                    val class74 = (ModelHeaderCache.method1929((-19).toByte())[CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)])
                    method128(class74, 8.toByte())
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_3467 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShort(13638)
                val i_110_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                val i_111_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.method3375(84.toByte())
                WallSceneEntity.method2397((-124).toByte())
                ConfigValueProvider.method1080(i_111_, -23697, i, i_110_)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_2338 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val string = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(100.toByte())
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                WallSceneEntity.method2397((-127).toByte())
                method3965(string, i, 2)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_10168) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-117)
                val i_112_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                WallSceneEntity.method2397((-127).toByte())
                BrightnessTextureNode.method3084(i, (-88).toByte(), i_112_)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_2196 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val bool_113_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                val string = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-81).toByte())
                var string_114_ = string
                if (bool_113_) string_114_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-39).toByte())
                val l = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readLong(-456577760)
                val l_115_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944).toLong()
                val l_116_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readMedium(-1).toLong()
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_117_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val l_118_ = (l_115_ shl 32) - -l_116_
                var bool_119_ = false
                while_219_@ do {
                    for (i_120_ in 0..99) {
                        if (SceneCollisionEntry.aLongArray4410!![i_120_] == l_118_) {
                            bool_119_ = true
                            break@while_219_
                        }
                    }
                    if (i <= 1 && ObjectSpawnDecoder.method3455(string_114_, 28280)) bool_119_ = true
                } while (false)
                if (!bool_119_ && BackgroundWorkerThread.anInt3227 == 0) {
                    SceneCollisionEntry.aLongArray4410!![NpcType.anInt1359] = l_118_
                    NpcType.anInt1359 = (NpcType.anInt1359 + 1) % 100
                    val string_121_ = (BrightnessOptionState.aCompiledScriptCache_5900!!.method3471(i_117_, (-106).toByte()).method3216(CircleRasterizer.aClass348_Sub49_Sub2_3813!!, 42.toByte()))
                    if (i == 2) TrackedGroundDecor.method2477("<img=1>" + string_114_, string_121_, (-120).toByte(), i_117_, "<img=1>" + string, method1788(87.toByte(), l), 20, 0, string)
                    else if (i != 1) TrackedGroundDecor.method2477(string_114_, string_121_, (-111).toByte(), i_117_, string, method1788(80.toByte(), l), 20, 0, string)
                    else TrackedGroundDecor.method2477("<img=0>" + string_114_, string_121_, (-116).toByte(), i_117_, "<img=0>" + string, ShadowQualityOptionState.method1788((-98).toByte(), l), 20, 0, string)
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_7124 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                WallSceneEntity.method2397((-125).toByte())
                if (i == -1) {
                    NativeLibraryState.anInt167 = -1
                    SequencedWallEntity.anInt10163 = -1
                } else {
                    var i_122_ = 0x3fff and (i shr 14)
                    i_122_ -= ArbVertexProgram.regionTileX
                    var i_123_ = 0x3fff and i
                    i_123_ -= RegionMapDecoder.regionTileY
                    if (i_122_ >= 0) {
                        if (GlCubemapLightPass.anInt7319 <= i_122_) i_122_ = GlCubemapLightPass.anInt7319
                    } else i_122_ = 0
                    NativeLibraryState.anInt167 = (i_122_ shl 9) - -256
                    if (i_123_ >= 0) {
                        if (i_123_ >= RangeThresholdTextureNode.anInt9109) i_123_ = RangeThresholdTextureNode.anInt9109
                    } else i_123_ = 0
                    SequencedWallEntity.anInt10163 = 256 + (i_123_ shl 9)
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_9254) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteAdd((-88).toByte())
                val i_124_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortLittle(!bool)
                ProjectedGroundDecor.aVarpStore_10209!!.method1316((-58).toByte(), i_124_, i)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_1914 == InboundPacketHeader.aInboundPacketHeader_6584) {
                method128(RgbColorPalette.aRgbColorPalette_9475, 8.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_4798) {
                var i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-107)
                if (i == 65535) i = -1
                val i_125_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteAdd((-121).toByte())
                val i_126_ = i_125_ shr 2
                val i_127_ = i_125_ and 0x3
                val i_128_ = AnimationFrameTable.anIntArray487!![i_126_]
                val i_129_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                val i_130_ = (0x36079814 and i_129_) shr 28
                var i_131_ = i_129_ shr 14 and 0x3fff
                var i_132_ = 0x3fff and i_129_
                i_131_ -= ArbVertexProgram.regionTileX
                i_132_ -= RegionMapDecoder.regionTileY
                NativeRenderer.method3824(i_132_, i, i_126_, i_131_, i_127_, 102, i_130_, i_128_)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_2255) {
                val string = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-104).toByte())
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val string_133_ = (BrightnessOptionState.aCompiledScriptCache_5900!!.method3471(i, (-98).toByte()).method3216(CircleRasterizer.aClass348_Sub49_Sub2_3813!!, 42.toByte()))
                TrackedGroundDecor.method2477(string, string_133_, (-122).toByte(), i, string, null, 19, 0, string)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_9550) {
                method128(FileIoUtil.aRgbColorPalette_4098, 8.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_2665 == InboundPacketHeader.aInboundPacketHeader_6584) {
                for (i in LoadingBarRenderer.aPlayerArray5058!!.indices) {
                    if (LoadingBarRenderer.aPlayerArray5058!![i] != null) {
                        LoadingBarRenderer.aPlayerArray5058!![i]!!.anIntArray10236 = null
                        LoadingBarRenderer.aPlayerArray5058!![i]!!.anInt10286 = -1
                    }
                }
                var i = 0
                while (TerrainShadowBuilderGl2.anInt6930 > i) {
                    TurbulenceTextureNode.aClass348_Sub22Array9319!![i]!!.aNpc_6859!!.anIntArray10236 = null
                    TurbulenceTextureNode.aClass348_Sub22Array9319!![i]!!.aNpc_6859!!.anInt10286 = -1
                    i++
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_4477 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                val i_134_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_135_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-109)
                val i_136_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(16)
                WallSceneEntity.method2397((-125).toByte())
                ObjectSpawnDecoder.method1085(i_136_, i_134_, (-86).toByte(), i_135_, i)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_1540 == InboundPacketHeader.aInboundPacketHeader_6584) {
                MapSceneTile.aBoxedIntHolder_1055 = WidgetTextConfig.method360((-57).toByte(), CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255))
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6058 == InboundPacketHeader.aInboundPacketHeader_6584) {
                method128(TextureGenerator.aRgbColorPalette_2491, 8.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_2331 == InboundPacketHeader.aInboundPacketHeader_6584) {
                ContactEntry.anInt9604 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                var i = 0
                while (ContactEntry.anInt9604 > i) {
                    NpcConfig.aStringArray932!![i] = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-36).toByte())
                    ObjectSpawnDecoder.aStringArray1808!![i] = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(112.toByte())
                    if (ObjectSpawnDecoder.aStringArray1808!![i] == "") ObjectSpawnDecoder.aStringArray1808!![i] = NpcConfig.aStringArray932!![i]
                    WeaveTextureNode.aStringArray9275!![i] = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(84.toByte())
                    IndexedSprite.aStringArray5197!![i] = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-111).toByte())
                    if (IndexedSprite.aStringArray5197!![i] == "") IndexedSprite.aStringArray5197!![i] = WeaveTextureNode.aStringArray9275!![i]
                    BasicGlRenderPass.aBooleanArray7304!![i] = false
                    i++
                }
                Crc64Hashable.anInt4985 = ResourceLoaderThread.anInt3918
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_2183) {
                var i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-121)
                if (i == 65535) i = -1
                var string: String? = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(103.toByte())
                val i_137_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-91).toByte())
                val i_138_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteAdd(13.toByte())
                if (i_137_ >= 1 && i_137_ <= 8) {
                    if (string.equals("null", ignoreCase = true)) string = null
                    DynamicSceneObjectEntity.aStringArray10195!![i_137_ + -1] = string
                    DelegatingRenderCanvas.anIntArray60!![i_137_ + -1] = i
                    PlayerSequenceSelector.aBooleanArray1214!![i_137_ - 1] = i_138_ == 0
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_1871 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readSmart(-117)
                val i_139_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                val i_140_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                var string = ""
                var string_141_ = string
                if ((i_140_ and 0x1) != 0) {
                    string = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(92.toByte())
                    if ((i_140_ and 0x2) != 0) string_141_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(126.toByte())
                    else string_141_ = string
                }
                val string_142_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-95).toByte())
                if (i == 99) method94(string_142_, -93)
                else if (i == 98) GameAppletFrame.set(string_142_)
                else {
                    if (string_141_ != "" && ObjectSpawnDecoder.method3455(string_141_, 28280)) {
                        InboundPacketHeader.aInboundPacketHeader_6584 = null
                        return true
                    }
                    FixedFunctionMaterialPass.method2144(string_141_, i, (-92).toByte(), i_139_, string_142_, string, string)
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_7105) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                if (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 0) DetailLevelOptionState.aFloorOverlayDefinitionArray6114!![i] = FloorOverlayDefinition()
                else {
                    CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197--
                    DetailLevelOptionState.aFloorOverlayDefinitionArray6114!![i] = FloorOverlayDefinition(CircleRasterizer.aClass348_Sub49_Sub2_3813!!)
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                MapAreaDefinition.anInt2523 = ResourceLoaderThread.anInt3918
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_1702) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShort(13638)
                val i_143_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                WallSceneEntity.method2397((-126).toByte())
                ObjectByteSerializerHolder.method1330(i, -19906, i_143_)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_123) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                val i_144_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                var i_145_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                if (i_145_ == 65535) i_145_ = -1
                var i_146_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(124)
                WallSceneEntity.method2397((-128).toByte())
                if (i_146_ == 65535) i_146_ = -1
                var i_147_ = i_146_
                while (i_145_ >= i_147_) {
                    val l = (i.toLong() shl 32) - -i_147_.toLong()
                    val class348_sub44 = (TextureDefinitionCache.aHashtable_2959!!.method3480(l, -6008) as PackedFlagsAccessor?)
                    val class348_sub44_148_: PackedFlagsAccessor?
                    if (class348_sub44 == null) {
                        if (i_147_ == -1) class348_sub44_148_ = (PackedFlagsAccessor(method2570(1512932720, i)!!.aClass348_Sub44_748!!.anInt7098, i_144_))
                        else class348_sub44_148_ = PackedFlagsAccessor(0, i_144_)
                    } else {
                        class348_sub44_148_ = PackedFlagsAccessor((class348_sub44.anInt7098), i_144_)
                        class348_sub44.method2715(91.toByte())
                    }
                    TextureDefinitionCache.aHashtable_2959!!.method3483(125.toByte(), l, class348_sub44_148_)
                    i_147_++
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_7106) {
                while ((CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197) < RadialTextureNode.anInt9341) {
                    val bool_149_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                    var string: String? = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-95).toByte())
                    val string_150_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(118.toByte())
                    val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    val i_151_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                    var string_152_ = ""
                    var bool_153_ = false
                    if (i > 0) {
                        string_152_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(119.toByte())
                        bool_153_ = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                    }
                    var i_154_ = 0
                    while ((i_154_ < HslAdjustTextureNode.anInt9383)) {
                        if (!bool_149_) {
                            if (string == WaterTextureSet.aStringArray1441!![i_154_]) {
                                if (i != Renderer.anIntArray4578!![i_154_]) {
                                    var bool_155_ = true
                                    var class318_sub9_sub1 = (InterfaceComponentGroup.aDoublyLinkedNodeList_9642!!.method1872(8) as? NamedTimedNode?)
                                    while (class318_sub9_sub1 != null) {
                                        if (class318_sub9_sub1.aString8783 == string) {
                                            if (i == 0 || (class318_sub9_sub1.aShort8786.toInt() != 0)) {
                                                if (i == 0 && (class318_sub9_sub1.aShort8786).toInt() != 0) {
                                                    bool_155_ = false
                                                    class318_sub9_sub1.method2373(false)
                                                }
                                            } else {
                                                bool_155_ = false
                                                class318_sub9_sub1.method2373(false)
                                            }
                                        }
                                        class318_sub9_sub1 = (InterfaceComponentGroup.aDoublyLinkedNodeList_9642!!.method1878(124.toByte()) as? NamedTimedNode?)
                                    }
                                    if (bool_155_) InterfaceComponentGroup.aDoublyLinkedNodeList_9642!!.method1869(-95, NamedTimedNode(string, i))
                                    Renderer.anIntArray4578!![i_154_] = i
                                }
                                FixedFunctionMaterialPass.aStringArray6205!![i_154_] = string_150_
                                GlBufferObject.aStringArray4744!![i_154_] = string_152_
                                NpcCountAccessor.anIntArray2280!![i_154_] = i_151_
                                string = null
                                ObjectSpawnDecoder.aBooleanArray1806!![i_154_] = bool_153_
                                break
                            }
                        } else if (string_150_ == WaterTextureSet.aStringArray1441!![i_154_]) {
                            WaterTextureSet.aStringArray1441!![i_154_] = string
                            FixedFunctionMaterialPass.aStringArray6205!![i_154_] = string_150_
                            string = null
                            break
                        }
                        i_154_++
                    }
                    if (string != null && HslAdjustTextureNode.anInt9383 < 200) {
                        WaterTextureSet.aStringArray1441!![HslAdjustTextureNode.anInt9383] = string
                        FixedFunctionMaterialPass.aStringArray6205!![(HslAdjustTextureNode.anInt9383)] = string_150_
                        Renderer.anIntArray4578!![HslAdjustTextureNode.anInt9383] = i
                        GlBufferObject.aStringArray4744!![HslAdjustTextureNode.anInt9383] = string_152_
                        NpcCountAccessor.anIntArray2280!![HslAdjustTextureNode.anInt9383] = i_151_
                        ObjectSpawnDecoder.aBooleanArray1806!![HslAdjustTextureNode.anInt9383] = bool_153_
                        HslAdjustTextureNode.anInt9383++
                    }
                }
                MinimapSpriteRenderer.anInt4930 = 2
                Crc64Hashable.anInt4985 = ResourceLoaderThread.anInt3918
                var bool_156_ = false
                var i = HslAdjustTextureNode.anInt9383
                while (i > 0) {
                    i--
                    bool_156_ = true
                    var i_157_ = 0
                    while (i > i_157_) {
                        if (((CacheStateResetter.aServerConnectionInfo_125!!.anInt2143 != Renderer.anIntArray4578!![i_157_]) && (Renderer.anIntArray4578!![i_157_ - -1] == CacheStateResetter.aServerConnectionInfo_125!!.anInt2143)) || (Renderer.anIntArray4578!![i_157_] == 0 && (Renderer.anIntArray4578!![1 + i_157_] != 0))) {
                            val i_158_ = Renderer.anIntArray4578!![i_157_]
                            Renderer.anIntArray4578!![i_157_] = Renderer.anIntArray4578!![1 + i_157_]
                            Renderer.anIntArray4578!![i_157_ - -1] = i_158_
                            val string = GlBufferObject.aStringArray4744!![i_157_]
                            GlBufferObject.aStringArray4744!![i_157_] = GlBufferObject.aStringArray4744!![1 + i_157_]
                            GlBufferObject.aStringArray4744!![1 + i_157_] = string
                            val string_159_ = WaterTextureSet.aStringArray1441!![i_157_]
                            WaterTextureSet.aStringArray1441!![i_157_] = WaterTextureSet.aStringArray1441!![i_157_ + 1]
                            WaterTextureSet.aStringArray1441!![i_157_ + 1] = string_159_
                            val string_160_ = FixedFunctionMaterialPass.aStringArray6205!![i_157_]
                            FixedFunctionMaterialPass.aStringArray6205!![i_157_] = FixedFunctionMaterialPass.aStringArray6205!![i_157_ + 1]
                            FixedFunctionMaterialPass.aStringArray6205!![i_157_ - -1] = string_160_
                            val i_161_ = NpcCountAccessor.anIntArray2280!![i_157_]
                            NpcCountAccessor.anIntArray2280!![i_157_] = NpcCountAccessor.anIntArray2280!![1 + i_157_]
                            NpcCountAccessor.anIntArray2280!![i_157_ + 1] = i_161_
                            val bool_162_ = ObjectSpawnDecoder.aBooleanArray1806!![i_157_]
                            ObjectSpawnDecoder.aBooleanArray1806!![i_157_] = ObjectSpawnDecoder.aBooleanArray1806!![1 + i_157_]
                            bool_156_ = false
                            ObjectSpawnDecoder.aBooleanArray1806!![i_157_ + 1] = bool_162_
                        }
                        i_157_++
                    }
                    if (bool_156_) break
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_8683 == InboundPacketHeader.aInboundPacketHeader_6584) {
                if (SkeletalAnimFrameLoader.aFrame476 != null) ChatCommandProcessor.method830(IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub8_7227!!.method1751(-32350), -1, 102.toByte(), false, -1)
                val `is` = ByteArray(RadialTextureNode.anInt9341)
                CircleRasterizer.aClass348_Sub49_Sub2_3813!!.method3409(RadialTextureNode.anInt9341, `is`, 0, -32769)
                val string = ByteBuffer.method3546(`is`, 0, RadialTextureNode.anInt9341, 0)
                ChatCommandProcessor.method1360(string, VorbisOggDecoder.aPrivilegedOperationWorker_8992, IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 1, true, 99)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_7363 == InboundPacketHeader.aInboundPacketHeader_6584) {
                var i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                if (i == 65535) i = -1
                val i_163_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_164_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_165_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_166_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                TextureTileRenderer.method2947(true, i_165_, i, i_163_, i_164_, i_166_)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_3143) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_167_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByte(-83)
                ProjectedGroundDecor.aVarpStore_10209!!.method1313(42.toByte(), i_167_.toInt(), i)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_8756) {
                var i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                if (i == 65535) i = -1
                val i_168_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                WallSceneEntity.method2397((-127).toByte())
                SpriteStore.method304(i, 437853543, i_168_)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_3641) {
                method128(InputStream_Sub2.aRgbColorPalette_6977, 8.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_2860) {
                var i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                if (i == 65535) i = -1
                val i_169_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_170_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_171_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_172_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                SoundChannelMixer.method2090(i_169_, i_172_, false, (-35).toByte(), i_171_, i_170_, i)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }

            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_318) {
                ColourKeyTextureNode.method3120(-86)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return false
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_4272) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(-127)
                val i_173_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                WallSceneEntity.method2397((-128).toByte())
                OggCacheStream.method524(i_173_, true, i, -127)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_2693 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val bool_174_ = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                val string = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(107.toByte())
                var string_175_ = string
                if (bool_174_) string_175_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-71).toByte())
                val l = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944).toLong()
                val l_176_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readMedium(-1).toLong()
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_177_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val l_178_ = l_176_ + (l shl 32)
                var bool_179_ = false
                while_220_@ do {
                    for (i_180_ in 0..99) {
                        if (l_178_ == SceneCollisionEntry.aLongArray4410!![i_180_]) {
                            bool_179_ = true
                            break@while_220_
                        }
                    }
                    if (i <= 1 && ObjectSpawnDecoder.method3455(string_175_, 28280)) bool_179_ = true
                } while (false)
                if (!bool_179_ && BackgroundWorkerThread.anInt3227 == 0) {
                    SceneCollisionEntry.aLongArray4410!![NpcType.anInt1359] = l_178_
                    NpcType.anInt1359 = (NpcType.anInt1359 - -1) % 100
                    val string_181_ = (BrightnessOptionState.aCompiledScriptCache_5900!!.method3471(i_177_, (-93).toByte()).method3216(CircleRasterizer.aClass348_Sub49_Sub2_3813!!, 62.toByte()))
                    if (i == 2) TrackedGroundDecor.method2477("<img=1>" + string_175_, string_181_, (-110).toByte(), i_177_, "<img=1>" + string, null, 18, 0, string)
                    else if (i == 1) TrackedGroundDecor.method2477("<img=0>" + string_175_, string_181_, (-112).toByte(), i_177_, "<img=0>" + string, null, 18, 0, string)
                    else TrackedGroundDecor.method2477(string_175_, string_181_, (-118).toByte(), i_177_, string, null, 18, 0, string)
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_7367) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                val i_182_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntLittle((-122).toByte())
                val i_183_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteAdd((-95).toByte())
                WallSceneEntity.method2397((-125).toByte())
                val class348_sub41 = (MinimapSpriteRenderer.aHashtable_4915!!.method3480(i_182_.toLong(), -6008) as RegionSceneShifter?)
                if (class348_sub41 != null) ScrollingWidgetComponentNode.method1118(i != (class348_sub41.anInt7050), false, class348_sub41, 2533)
                MapTileShape.method2661(i, i_182_, i_183_, false, 2)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_8384) {
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                MinimapSpriteRenderer.anInt4930 = 1
                Crc64Hashable.anInt4985 = ResourceLoaderThread.anInt3918
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_2335) {
                WallSceneEntity.method2397((-125).toByte())
                MinimapStateReset.method1122(0)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_220 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_184_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_185_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                WallSceneEntity.method2397((-125).toByte())
                if (WarpTextureNode.aWidgetComponentArrayArray9427!![i] != null) {
                    var i_186_ = i_184_
                    while (i_185_ > i_186_) {
                        val i_187_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readMedium(-1)
                        if ((WarpTextureNode.aWidgetComponentArrayArray9427!![i])!!.size > i_186_ && (WarpTextureNode.aWidgetComponentArrayArray9427!![i]!![i_186_]) != null) WarpTextureNode.aWidgetComponentArrayArray9427!![i]!![i_186_]!!.anInt732 = i_187_
                        i_186_++
                    }
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_5992) {
                method128(SplashImageLoadable.aRgbColorPalette_4689, 8.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_7015 == InboundPacketHeader.aInboundPacketHeader_6584) {
                GradientLookupEffect.anInt9200 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteAdd(126.toByte())
                FileExistsCondition.anInt4786 = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteInverse(-622951480).toInt() shl 3)
                BufferedMessageQueue.anInt3581 = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteInverse(-622951480).toInt() shl 3)
                var class348_sub37 = ModelBatchBase.aHashtable_1895!!.method3484(0) as? HashTableContainer?
                while (class348_sub37 != null) {
                    val i = ((class348_sub37.aLong4291 shr 28) and 0x3L).toInt()
                    val i_188_ = (class348_sub37.aLong4291 and 0x3fffL).toInt()
                    val i_189_ = i_188_ + -ArbVertexProgram.regionTileX
                    val i_190_ = (0x3fffL and (class348_sub37.aLong4291 shr 14)).toInt()
                    val i_191_ = -RegionMapDecoder.regionTileY + i_190_
                    if (i == GradientLookupEffect.anInt9200 && BufferedMessageQueue.anInt3581 <= i_189_ && 8 + BufferedMessageQueue.anInt3581 > i_189_ && FileExistsCondition.anInt4786 <= i_191_ && FileExistsCondition.anInt4786 - -8 > i_191_) {
                        class348_sub37.method2715(89.toByte())
                        if (i_189_ >= 0 && i_191_ >= 0 && i_189_ < GlCubemapLightPass.anInt7319 && (i_191_ < RangeThresholdTextureNode.anInt9109)) ProjectileSpawner.method1479(i_191_, (-118).toByte(), i_189_, GradientLookupEffect.anInt9200)
                    }
                    class348_sub37 = (ModelBatchBase.aHashtable_1895!!.method3482(0) as? HashTableContainer?)
                }
                var class348_sub27 = (SpriteRenderEntry.aNodeDeque_9711!!.method1995(4) as? MultiFieldRecord?)
                while (class348_sub27 != null) {
                    if ((BufferedMessageQueue.anInt3581 <= class348_sub27.anInt6905) && (class348_sub27.anInt6905 < BufferedMessageQueue.anInt3581 - -8) && (class348_sub27.anInt6896 >= FileExistsCondition.anInt4786) && (class348_sub27.anInt6896 < FileExistsCondition.anInt4786 + 8) && (class348_sub27.anInt6899 == GradientLookupEffect.anInt9200)) class348_sub27.anInt6893 = 0
                    class348_sub27 = SpriteRenderEntry.aNodeDeque_9711!!.method1990(31.toByte()) as? MultiFieldRecord?
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_5997) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                val `is` = IntArray(4)
                for (i_192_ in 0..3) `is`[i_192_] = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_193_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                val class348_sub22 = (NpcEntityUpdater.aHashtable_3654!!.method3480(i_193_.toLong(), -6008) as NpcReference?)
                if (class348_sub22 != null) SoundBankPatch.method2931(i, 110.toByte(), `is`, (class348_sub22.aNpc_6859))
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_9285) {
                KeyboardLayoutCache.anInt3306 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_9324 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-104).toByte())
                val i_194_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-92).toByte())
                var i_195_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-127)
                if (i_195_ == 65535) i_195_ = -1
                HeadIconRenderer.method1212(i_194_, i_195_, -1, i)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_4015 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.method3363(-13309)
                var i_196_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAddLittle(-124)
                if (i_196_ == 65535) i_196_ = -1
                val i_197_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                ClickFeedbackTask.method1352(i_196_, i_197_, i, (-98).toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_9197 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val string = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-43).toByte())
                val string_198_ = CompositeRgbNoiseTexture.method572((InvertTextureNode.method3136(64.toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813))), 23034)
                FixedFunctionMaterialPass.method2144(string, 6, (-101).toByte(), 0, string_198_, string, string)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_8385) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntLittle((-124).toByte())
                val string = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-97).toByte())
                WallSceneEntity.method2397((-125).toByte())
                method1803(i, string, -32394)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_2305) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                val i_199_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                val i_200_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                WallSceneEntity.method2397((-126).toByte())
                AbstractGameSocketStatics.method1703(5, i, i_200_, 4, i_199_)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_4500 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val bool_201_ = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte()) == 1)
                WallSceneEntity.method2397((-124).toByte())
                ObjectSpawnDecoder.aBoolean1801 = bool_201_
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_1068) {
                LocDefinitionCache.method2038(-103)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_8817 == InboundPacketHeader.aInboundPacketHeader_6584) {
                ShaderProgram.anInt7276 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(69.toByte())
                BufferToggleState.anInt3713 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteAdd((-82).toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_9257) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                val i_202_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(127)
                WallSceneEntity.method2397((-125).toByte())
                if (i == 2) FrameStatsReset.method1134(92)
                RenderNodeStatics.anInt9721 = i_202_
                RegionTileNode.method2772(i_202_, 123.toByte())
                method1713(false, 520)
                ChatCommandProcessor.method703(RenderNodeStatics.anInt9721)
                for (i_203_ in 0..99) OpenGlModel.aBooleanArray2076!![i_203_] = true
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_3307) {
                if (!RsaPacketDecoder.method2672(WorldMapRenderer.anInt4674, -105)) RegionSceneLoader.anInt3699 = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944) * 30)
                else RegionSceneLoader.anInt3699 = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944).toFloat() * 2.5f).toInt()
                TurbulenceTextureNode.anInt9313 = ResourceLoaderThread.anInt3918
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_6383) {
                var i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                if (i == 65535) i = -1
                val i_204_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_205_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_206_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                SoundChannelMixer.method2090(i_204_, 256, true, (-35).toByte(), i_206_, i_205_, i)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_10149 == InboundPacketHeader.aInboundPacketHeader_6584) {
                var i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(-16)
                if (i == 65535) i = -1
                val i_207_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                WallSceneEntity.method2397((-125).toByte())
                AbstractGameSocketStatics.method1703(1, i_207_, i, 4, -1)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_843) {
                method128(NpcUpdateProcessor.aRgbColorPalette_1519, 8.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_5883) {
                var i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(125)
                if (i == 65535) i = -1
                var i_208_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                if (i_208_ == 65535) i_208_ = -1
                val i_209_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                val i_210_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                WallSceneEntity.method2397((-127).toByte())
                for (i_211_ in i_208_..i) {
                    val l = i_211_.toLong() + (i_209_.toLong() shl 32)
                    val class348_sub44 = (TextureDefinitionCache.aHashtable_2959!!.method3480(l, -6008) as PackedFlagsAccessor?)
                    val class348_sub44_212_: PackedFlagsAccessor?
                    if (class348_sub44 != null) {
                        class348_sub44_212_ = PackedFlagsAccessor(i_210_, (class348_sub44.anInt7093))
                        class348_sub44.method2715(80.toByte())
                    } else if (i_211_ == -1) class348_sub44_212_ = (PackedFlagsAccessor(i_210_, method2570(1512932720, i_209_)!!.aClass348_Sub44_748!!.anInt7093))
                    else class348_sub44_212_ = PackedFlagsAccessor(i_210_, -1)
                    TextureDefinitionCache.aHashtable_2959!!.method3483(114.toByte(), l, class348_sub44_212_)
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_2068) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(-103)
                val i_213_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                ProjectedGroundDecor.aVarpStore_10209!!.method1316((-124).toByte(), i, i_213_)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_6340) {
                CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197 += 28
                if (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.method3352(-25541)) method1365((CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197) + -28, (-126).toByte(), CircleRasterizer.aClass348_Sub49_Sub2_3813!!)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_250) {
                ConfigVarProgress.anInt4816 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                TurbulenceTextureNode.anInt9313 = ResourceLoaderThread.anInt3918
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_2483 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(20.toByte())
                val i_214_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteInverse(21.toByte())
                val i_215_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntMiddleEndian(82.toByte())
                TextureGenerator.anIntArray2497!![i_214_] = i_215_
                ServerConnectionInfo.anIntArray2145!![i_214_] = i
                anIntArray3295!![i_214_] = 1
                val i_216_ = FireParticleStream.anIntArray100!![i_214_] + -1
                var i_217_ = 0
                while (i_216_ > i_217_) {
                    if (StaticNoiseTexture.anIntArray8663!![i_217_] <= i_215_) anIntArray3295!![i_214_] = i_217_ - -2
                    i_217_++
                }
                LoadingScreenState.anIntArray2632!![WhirlpoolHash.method1166(31, EmoteDefCache.anInt4086++)] = i_214_
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_315 == InboundPacketHeader.aInboundPacketHeader_6584) {
                method128(RgbColorPalette.aRgbColorPalette_2157, 8.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_4998 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(10)
                val i_218_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract(70.toByte())
                val bool_219_ = (0x1 and i_218_) == 1
                RangeThresholdTextureNode.method3054(bool_219_, i, -128)
                LoadingScreenState.anIntArray2633!![WhirlpoolHash.method1166(31, DualMaterialContainer.anInt1631++)] = i
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_9225 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                val i_220_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val bool_221_ = (i_220_ and 0x1) == 1
                while ((CircleRasterizer.aClass348_Sub49_Sub2_3813!!.anInt7197) < RadialTextureNode.anInt9341) {
                    val i_222_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readSmart(-125)
                    val i_223_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    var i_224_ = 0
                    if (i_223_ != 0) {
                        i_224_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                        if (i_224_ == 255) i_224_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readInt((-126).toByte())
                    }
                    DelegatingRenderCanvas.method121(i, -364570972, bool_221_, i_222_, i_224_, -1 + i_223_)
                }
                LoadingScreenState.anIntArray2633!![WhirlpoolHash.method1166(31, DualMaterialContainer.anInt1631++)] = i
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_5950 == InboundPacketHeader.aInboundPacketHeader_6584) {
                var i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByteSubtract((-113).toByte())
                var i_225_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByteAdd(127.toByte())
                if (i == 255) {
                    i_225_ = -1
                    i = -1
                }
                method1825(120, i_225_, i)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_7398 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntLittle((-124).toByte())
                val i_226_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortLittle(false)
                WallSceneEntity.method2397((-124).toByte())
                MinimapPolygonDrawer.method467(i_226_, -18075, i)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_2717 == InboundPacketHeader.aInboundPacketHeader_6584) {
                NpcUpdateProcessor.method856(63.toByte())
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_7301 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val bool_227_ = (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1)
                val string = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(89.toByte())
                var string_228_ = string
                if (bool_227_) string_228_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(98.toByte())
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                val i_229_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                var bool_230_ = false
                if (i <= 1 && ObjectSpawnDecoder.method3455(string_228_, 28280)) bool_230_ = true
                if (!bool_230_ && BackgroundWorkerThread.anInt3227 == 0) {
                    val string_231_ = (BrightnessOptionState.aCompiledScriptCache_5900!!.method3471(i_229_, (-108).toByte()).method3216(CircleRasterizer.aClass348_Sub49_Sub2_3813!!, 93.toByte()))
                    if (i == 2) TrackedGroundDecor.method2477("<img=1>" + string_228_, string_231_, (-127).toByte(), i_229_, "<img=1>" + string, null, 25, 0, string)
                    else if (i != 1) TrackedGroundDecor.method2477(string_228_, string_231_, (-119).toByte(), i_229_, string, null, 25, 0, string)
                    else TrackedGroundDecor.method2477("<img=0>" + string_228_, string_231_, (-125).toByte(), i_229_, "<img=0>" + string, null, 25, 0, string)
                }
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_1959 == InboundPacketHeader.aInboundPacketHeader_6584) {
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readIntInverseMiddle(255)
                val i_232_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readShortAdd(-110)
                WallSceneEntity.method2397((-124).toByte())
                CipheredPacketBuffer.method3411(i, 12, i_232_)
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            if (InboundPacketHeader.aInboundPacketHeader_6584 == InboundPacketHeader.aInboundPacketHeader_4421) {
                Client.anInt2986 = ResourceLoaderThread.anInt3918
                if (RadialTextureNode.anInt9341 == 0) {
                    ByteArrayPool.anInt496 = 0
                    MinimapShapeDrawer.aString863 = null
                    HostPingThread.aWorldListEntryArray2261 = null
                    CameraSplineNode.aString6854 = null
                    InboundPacketHeader.aInboundPacketHeader_6584 = null
                    return true
                }
                CameraSplineNode.aString6854 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-112).toByte())
                var bool_233_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                if (bool_233_) CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(108.toByte())
                val l = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readLong(-456577760)
                MinimapShapeDrawer.aString863 = ProjectileConfigUtil.method313(l, -104)
                ModelDefinitionCache.aByte2871 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByte(-90)
                val i = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255)
                if (i == 255) {
                    InboundPacketHeader.aInboundPacketHeader_6584 = null
                    return true
                }
                ByteArrayPool.anInt496 = i
                val worldListEntries = arrayOfNulls<WorldListEntry>(100)
                var i_234_ = 0
                while (ByteArrayPool.anInt496 > i_234_) {
                    worldListEntries[i_234_] = WorldListEntry()
                    worldListEntries[i_234_]!!.aString314 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(103.toByte())
                    bool_233_ = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedByte(255) == 1
                    if (!bool_233_) worldListEntries[i_234_]!!.aString306 = worldListEntries[i_234_]!!.aString314
                    else worldListEntries[i_234_]!!.aString306 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString(107.toByte())
                    worldListEntries[i_234_]!!.aString312 = method2127(2, (worldListEntries[i_234_]!!.aString306))
                    worldListEntries[i_234_]!!.anInt308 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readUnsignedShort(842397944)
                    worldListEntries[i_234_]!!.aByte310 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readByte(-118)
                    worldListEntries[i_234_]!!.aString313 = CircleRasterizer.aClass348_Sub49_Sub2_3813!!.readString((-124).toByte())
                    if (worldListEntries[i_234_]!!.aString306 == LocalPlayerState.aPlayer_1907!!.aString10544) NativeIndexBuffer.aByte4702 = worldListEntries[i_234_]!!.aByte310
                    i_234_++
                }
                var bool_235_ = false
                var i_236_ = ByteArrayPool.anInt496
                while (i_236_ > 0) {
                    i_236_--
                    bool_235_ = true
                    var i_237_ = 0
                    while (i_236_ > i_237_) {
                        if ((worldListEntries[i_237_]!!.aString312!!.compareTo(worldListEntries[1 + i_237_]!!.aString312!!)) > 0) {
                            val class19 = worldListEntries[i_237_]
                            worldListEntries[i_237_] = worldListEntries[i_237_ - -1]
                            worldListEntries[1 + i_237_] = class19
                            bool_235_ = false
                        }
                        i_237_++
                    }
                    if (bool_235_) break
                }
                HostPingThread.aWorldListEntryArray2261 = worldListEntries
                InboundPacketHeader.aInboundPacketHeader_6584 = null
                return true
            }
            LinkedListIterator.method1242(("T1 - " + (if (InboundPacketHeader.aInboundPacketHeader_6584 == null) -1 else InboundPacketHeader.aInboundPacketHeader_6584!!.method1058(110.toByte())) + "," + (if (InboundPacketHeader.aInboundPacketHeader_3145 == null) -1 else InboundPacketHeader.aInboundPacketHeader_3145!!.method1058(127.toByte())) + "," + (if (InboundPacketHeader.aInboundPacketHeader_9456 == null) -1 else InboundPacketHeader.aInboundPacketHeader_9456!!.method1058(125.toByte())) + " - " + RadialTextureNode.anInt9341), null, 15004)
            NormalMapTextureNode.method3141(false, 11.toByte())
            return true
        }
        var aSceneProjector_10434: SceneProjector? = null
        var aRgbColorPalette_10437: RgbColorPalette? = RgbColorPalette(0, 3)
        @JvmStatic
        fun method3202(i: Byte) {
            Client.aSceneProjector_10434 = null
            if (i > 38) {
                SceneEntity.aLongArrayArrayArray10431 = null
                FireParticleStream.aSceneObjectSpawner_10436 = null
                Client.aRgbColorPalette_10437 = null
            }
        }

        var anInt9549: Int = 0
        fun method3197(i: Int, i_3_: Byte): Boolean {
            anInt9549++
            return i == 7 || i == 9
        }
        var anInt9546: Int = 0
        fun method3196(i: Int, i_2_: Int): Boolean {
            if (i_2_ >= -39) return false
            anInt9546++
            return i == 3 || i == 4 || i == 5 || i == 6
        }


        var anInt115: Int = 0
        fun method159(i: Int) {
            if (WalkingTypeUtil.anInt3312 > 0) {
                var i_1_ = 0
                var i_2_ = 0
                while (ArbFogMaterialPass.aStringArray6200!!.size > i_2_) {
                    if (ArbFogMaterialPass.aStringArray6200!![i_2_]!!.indexOf("--> ") != -1 && ++i_1_ == WalkingTypeUtil.anInt3312) {
                        MapElementManager.aString4461 = (ArbFogMaterialPass.aStringArray6200!![i_2_]!!.substring(2 + ArbFogMaterialPass.aStringArray6200!![i_2_]!!.indexOf(">")))
                        break
                    }
                    i_2_++
                }
            } else MapElementManager.aString4461 = ""
            anInt115++
        }

        var aLinkedQueueNode_114: LinkedQueueNode? = null

        fun method158(i: Byte) {
            aLinkedQueueNode_114 = null
        }

        var anInt6634: Int = -2

        var anInt9469: Int = 0
        fun method3150(bool: Boolean) {
            anInt9469++
            var i = 0
            if (bool != true) method3150(false)
            while ( /**/ModelDefinitionLoader.anInt2057 > i) {
                val i_14_ = Client.anIntArray1233!![i]
                val class348_sub22 = (NpcEntityUpdater.aHashtable_3654!!.method3480(i_14_.toLong(), -6008) as NpcReference?)
                if (class348_sub22 != null) {
                    val npc = (class348_sub22.aNpc_6859)!!
                    method2556(false, npc.aNpcType_10505!!.anInt1399, npc)
                }
                i++
            }
        }
        var aHashtable_7041: Hashtable? = Hashtable(32)


        var anInt4028: Int = 0
        fun method2556(bool: Boolean, i: Int, class318_sub1_sub3_sub3: ProjectedGroundDecor) {
            anInt4028++
            var i_3_ = -1
            var i_4_ = 0
            if (GlGroundShaderPass.anInt7396 < class318_sub1_sub3_sub3.anInt10239) DetailLevelOptionState.method1834(class318_sub1_sub3_sub3, (-16).toByte())
            else if (GlGroundShaderPass.anInt7396 <= (class318_sub1_sub3_sub3.anInt10300)) method1041(-1, class318_sub1_sub3_sub3)
            else {
                method1600(false, 0, class318_sub1_sub3_sub3)
                i_3_ = SceneObjectAnimator.anInt3062
                i_4_ = ScrollingWidgetComponentNode.anInt8387
            }
            if (bool != false) InboundPacketHeader.aInboundPacketHeader_4027 = null
            if ((class318_sub1_sub3_sub3.x < 512) || class318_sub1_sub3_sub3.y < 512 || (-512 + GlCubemapLightPass.anInt7319 * 512 <= class318_sub1_sub3_sub3.x) || (-512 + RangeThresholdTextureNode.anInt9109 * 512 <= class318_sub1_sub3_sub3.y)) {
                class318_sub1_sub3_sub3.anInt10291 = -1
                class318_sub1_sub3_sub3.anInt10300 = 0
                i_4_ = 0
                i_3_ = -1
                class318_sub1_sub3_sub3.anIntArray10236 = null
                class318_sub1_sub3_sub3.anInt10269 = -1
                class318_sub1_sub3_sub3.anInt10286 = -1
                class318_sub1_sub3_sub3.anInt10239 = 0
                class318_sub1_sub3_sub3.x = (512 * (class318_sub1_sub3_sub3.anIntArray10320!![0]) + 256 * class318_sub1_sub3_sub3.method2436(120.toByte()))
                class318_sub1_sub3_sub3.y = (512 * (class318_sub1_sub3_sub3.anIntArray10317!![0]) + class318_sub1_sub3_sub3.method2436(88.toByte()) * 256)
                class318_sub1_sub3_sub3.method2427(70)
            }
            if ((LocalPlayerState.aPlayer_1907 == class318_sub1_sub3_sub3) && (class318_sub1_sub3_sub3.x < 6144 || class318_sub1_sub3_sub3.y < 6144 || (class318_sub1_sub3_sub3.x >= 512 * (GlCubemapLightPass.anInt7319 + -12)) || (512 * (RangeThresholdTextureNode.anInt9109 - 12) <= class318_sub1_sub3_sub3.y))) {
                class318_sub1_sub3_sub3.anInt10291 = -1
                i_3_ = -1
                class318_sub1_sub3_sub3.anInt10300 = 0
                class318_sub1_sub3_sub3.anInt10269 = -1
                class318_sub1_sub3_sub3.anInt10239 = 0
                i_4_ = 0
                class318_sub1_sub3_sub3.anIntArray10236 = null
                class318_sub1_sub3_sub3.anInt10286 = -1
                class318_sub1_sub3_sub3.x = (512 * (class318_sub1_sub3_sub3.anIntArray10320!![0]) + 256 * class318_sub1_sub3_sub3.method2436(115.toByte()))
                class318_sub1_sub3_sub3.y = (512 * (class318_sub1_sub3_sub3.anIntArray10317!![0]) + 256 * class318_sub1_sub3_sub3.method2436(115.toByte()))
                class318_sub1_sub3_sub3.method2427(54)
            }
            val i_5_ = method2774(108.toByte(), class318_sub1_sub3_sub3)
            method3443(true, class318_sub1_sub3_sub3)
            method729(i_3_, i_5_, 67.toByte(), class318_sub1_sub3_sub3, i_4_)
            method3208(class318_sub1_sub3_sub3, i_3_, -98)
            method1635(-69, class318_sub1_sub3_sub3)
        }

        var anInt2983: Int = 0
        fun method1635(i: Int, class318_sub1_sub3_sub3: ProjectedGroundDecor?) {
            try {
                anInt2983++
                do {
                    if ((class318_sub1_sub3_sub3!!.anInt10268) != -1) {
                        var class17 = (ParticleEmitterNode.aWidgetCache_191!!.method835(class318_sub1_sub3_sub3.anInt10268, 7))
                        if (class17 == null || class17.anIntArray237 == null) {
                            class318_sub1_sub3_sub3.aBoolean10213 = false
                            class318_sub1_sub3_sub3.anInt10268 = -1
                        } else {
                            class318_sub1_sub3_sub3.anInt10203++
                            if ((class318_sub1_sub3_sub3.anInt10245 < class17.anIntArray237.size) && ((class17.anIntArray267!![class318_sub1_sub3_sub3.anInt10245]) < class318_sub1_sub3_sub3.anInt10203)) {
                                class318_sub1_sub3_sub3.anInt10312++
                                class318_sub1_sub3_sub3.anInt10245++
                                class318_sub1_sub3_sub3.anInt10203 = 1
                                if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTable.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10245), class17, -58)
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
                                    class17 = (ParticleEmitterNode.aWidgetCache_191!!.method835(class318_sub1_sub3_sub3.anInt10268, 7))
                                }
                                if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTable.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10245), class17, -23)
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
                    if ((class318_sub1_sub3_sub3.anInt10269) != -1 && (GlGroundShaderPass.anInt7396 >= (class318_sub1_sub3_sub3.anInt10225))) {
                        val class368 = (ConstantColourTextureNode.aMapElementDefinitionCache_9245!!.method2543(90.toByte(), class318_sub1_sub3_sub3.anInt10269))
                        val i_70_ = class368.anInt4503
                        if (i_70_ != -1) {
                            val class17 = ParticleEmitterNode.aWidgetCache_191!!.method835(i_70_, 7)
                            if (class368.aBoolean4487) {
                                if (class17.anInt262 == 3) {
                                    if (class318_sub1_sub3_sub3.anInt10322 > 0 && (class318_sub1_sub3_sub3.anInt10239 <= GlGroundShaderPass.anInt7396) && (GlGroundShaderPass.anInt7396 > (class318_sub1_sub3_sub3.anInt10300))) {
                                        class318_sub1_sub3_sub3.anInt10269 = -1
                                        break
                                    }
                                } else if (class17.anInt262 == 1 && class318_sub1_sub3_sub3.anInt10322 > 0 && (GlGroundShaderPass.anInt7396 >= (class318_sub1_sub3_sub3.anInt10239)) && (GlGroundShaderPass.anInt7396 > (class318_sub1_sub3_sub3.anInt10300))) {
                                    class318_sub1_sub3_sub3.anInt10225 = 1 + GlGroundShaderPass.anInt7396
                                    break
                                }
                            }
                            if (class17 != null && class17.anIntArray237 != null) {
                                if (class318_sub1_sub3_sub3.anInt10240 < 0) {
                                    class318_sub1_sub3_sub3.anInt10240 = 0
                                    if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTable.method2178(class318_sub1_sub3_sub3, 0, class17, -89)
                                }
                                class318_sub1_sub3_sub3.anInt10243++
                                if ((class17.anIntArray237.size > class318_sub1_sub3_sub3.anInt10240) && ((class17.anIntArray267!![class318_sub1_sub3_sub3.anInt10240]) < class318_sub1_sub3_sub3.anInt10243)) {
                                    class318_sub1_sub3_sub3.anInt10240++
                                    class318_sub1_sub3_sub3.anInt10243 = 1
                                    if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTable.method2178(class318_sub1_sub3_sub3, class318_sub1_sub3_sub3.anInt10240, class17, -17)
                                }
                                if (class318_sub1_sub3_sub3.anInt10240 >= class17.anIntArray237.size) {
                                    if (class368.aBoolean4487) {
                                        class318_sub1_sub3_sub3.anInt10305++
                                        class318_sub1_sub3_sub3.anInt10240 -= class17.anInt238
                                        if (class17.anInt244 <= (class318_sub1_sub3_sub3.anInt10305)) class318_sub1_sub3_sub3.anInt10269 = -1
                                        else if ((class318_sub1_sub3_sub3.anInt10240) >= 0 && ((class17.anIntArray237).size > (class318_sub1_sub3_sub3.anInt10240))) {
                                            if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTable.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10240), class17, -70)
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
                    if ((class318_sub1_sub3_sub3.anInt10291) != -1 && (class318_sub1_sub3_sub3.anInt10211 <= GlGroundShaderPass.anInt7396)) {
                        val class368 = (ConstantColourTextureNode.aMapElementDefinitionCache_9245!!.method2543(93.toByte(), class318_sub1_sub3_sub3.anInt10291))
                        val i_71_ = class368.anInt4503
                        if (i_71_ != -1) {
                            val class17 = ParticleEmitterNode.aWidgetCache_191!!.method835(i_71_, 7)
                            if (class368.aBoolean4487) {
                                if (class17.anInt262 != 3) {
                                    if (class17.anInt262 == 1 && class318_sub1_sub3_sub3.anInt10322 > 0 && (GlGroundShaderPass.anInt7396 >= (class318_sub1_sub3_sub3.anInt10239)) && (class318_sub1_sub3_sub3.anInt10300 < GlGroundShaderPass.anInt7396)) {
                                        class318_sub1_sub3_sub3.anInt10211 = GlGroundShaderPass.anInt7396 - -1
                                        break
                                    }
                                } else if (class318_sub1_sub3_sub3.anInt10322 > 0 && ((class318_sub1_sub3_sub3.anInt10239) <= GlGroundShaderPass.anInt7396) && ((class318_sub1_sub3_sub3.anInt10300) < GlGroundShaderPass.anInt7396)) {
                                    class318_sub1_sub3_sub3.anInt10291 = -1
                                    break
                                }
                            }
                            if (class17 == null || class17.anIntArray237 == null) class318_sub1_sub3_sub3.anInt10291 = -1
                            else {
                                if (class318_sub1_sub3_sub3.anInt10224 < 0) {
                                    class318_sub1_sub3_sub3.anInt10224 = 0
                                    if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTable.method2178(class318_sub1_sub3_sub3, 0, class17, -70)
                                }
                                class318_sub1_sub3_sub3.anInt10273++
                                if ((class17.anIntArray237.size > class318_sub1_sub3_sub3.anInt10224) && ((class17.anIntArray267!![class318_sub1_sub3_sub3.anInt10224]) < class318_sub1_sub3_sub3.anInt10273)) {
                                    class318_sub1_sub3_sub3.anInt10224++
                                    class318_sub1_sub3_sub3.anInt10273 = 1
                                    if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTable.method2178(class318_sub1_sub3_sub3, class318_sub1_sub3_sub3.anInt10224, class17, -114)
                                }
                                if (class17.anIntArray237.size <= class318_sub1_sub3_sub3.anInt10224) {
                                    if (class368.aBoolean4487) {
                                        class318_sub1_sub3_sub3.anInt10265++
                                        class318_sub1_sub3_sub3.anInt10224 -= class17.anInt238
                                        if (class17.anInt244 <= (class318_sub1_sub3_sub3.anInt10265)) class318_sub1_sub3_sub3.anInt10291 = -1
                                        else if ((class318_sub1_sub3_sub3.anInt10224) >= 0 && ((class318_sub1_sub3_sub3.anInt10224) < (class17.anIntArray237).size)) {
                                            if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTable.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10224), class17, -92)
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
                    val class17 = (ParticleEmitterNode.aWidgetCache_191!!.method835((class318_sub1_sub3_sub3.anInt10286), 7))
                    if (class17.anInt262 != 3) {
                        if (class17.anInt262 == 1 && class318_sub1_sub3_sub3.anInt10322 > 0 && (class318_sub1_sub3_sub3.anInt10239) <= GlGroundShaderPass.anInt7396 && (class318_sub1_sub3_sub3.anInt10300) < GlGroundShaderPass.anInt7396) class318_sub1_sub3_sub3.anInt10218 = 2
                    } else if ((class318_sub1_sub3_sub3.anInt10322) > 0 && (class318_sub1_sub3_sub3.anInt10239 <= GlGroundShaderPass.anInt7396) && (GlGroundShaderPass.anInt7396 > class318_sub1_sub3_sub3.anInt10300)) {
                        class318_sub1_sub3_sub3.anInt10286 = -1
                        class318_sub1_sub3_sub3.anIntArray10236 = null
                    }
                }
                if ((class318_sub1_sub3_sub3.anInt10286 != -1) && (class318_sub1_sub3_sub3.anInt10218) == 0) {
                    val class17 = (ParticleEmitterNode.aWidgetCache_191!!.method835((class318_sub1_sub3_sub3.anInt10286), 7))
                    if (class17 == null || class17.anIntArray237 == null) {
                        class318_sub1_sub3_sub3.anInt10286 = -1
                        class318_sub1_sub3_sub3.anIntArray10236 = null
                    } else {
                        class318_sub1_sub3_sub3.anInt10232++
                        if ((class17.anIntArray237.size > (class318_sub1_sub3_sub3.anInt10267)) && (class318_sub1_sub3_sub3.anInt10232 > (class17.anIntArray267!![class318_sub1_sub3_sub3.anInt10267]))) {
                            class318_sub1_sub3_sub3.anInt10267++
                            class318_sub1_sub3_sub3.anInt10232 = 1
                            if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTable.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10267), class17, -34)
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
                            } else if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTable.method2178(class318_sub1_sub3_sub3, (class318_sub1_sub3_sub3.anInt10267), class17, -88)
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
                            val class17 = ParticleEmitterNode.aWidgetCache_191!!.method835((class182.anInt2454), 7)
                            if (class17 == null || class17.anIntArray237 == null) class318_sub1_sub3_sub3.aLoadProgressCountersArray10308!![i_73_] = null
                            else {
                                class182.anInt2456++
                                if ((class17.anIntArray237.size > class182.anInt2451) && (class182.anInt2456 > (class17.anIntArray267!![class182.anInt2451]))) {
                                    class182.anInt2451++
                                    class182.anInt2456 = 1
                                    if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTable.method2178(class318_sub1_sub3_sub3, class182.anInt2451, class17, -108)
                                }
                                if (class182.anInt2451 >= class17.anIntArray237.size) {
                                    class182.anInt2451 -= class17.anInt238
                                    class182.anInt2445++
                                    if (class17.anInt244 > class182.anInt2445) {
                                        if (class182.anInt2451 < 0 || ((class17.anIntArray237).size <= (class182.anInt2451))) class318_sub1_sub3_sub3.aLoadProgressCountersArray10308!![i_73_] = null
                                        else if (!class318_sub1_sub3_sub3.aBoolean10309) TypedRecordTable.method2178(class318_sub1_sub3_sub3, class182.anInt2451, class17, -46)
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
                throw TextureLoadException.method2929(runtimeexception, ("sj.A(" + i + ',' + (if (class318_sub1_sub3_sub3 != null) "{...}" else "null") + ')'))
            }
        }


        var anInt2986: Int = 0


        var anInt6874: Int = 0
        @JvmStatic
        fun method2991(i: Int) {
            if (RegionSceneLoader.anInt3699 > 1) {
                TurbulenceTextureNode.anInt9313 = ResourceLoaderThread.anInt3918
                RegionSceneLoader.anInt3699--
            }
            anInt6874++
            if (AbstractMenuEntryStatics.aBoolean1712) {
                AbstractMenuEntryStatics.aBoolean1712 = false
                method2049(67)
            } else {
                if (!ScrollbarComponent.aBoolean8335) method661(95.toByte())
                for (i_0_ in 0..99) {
                    if (!MapArchiveSource.method2203((-52).toByte())) break
                }
                if (WorldMapRenderer.anInt4674 == 10) {
                    while (method2138(i xor 0x2ca2)) {
                        val class348_sub47 = method2148(ScreenBorderFiller.aFontMetaRef_1961, (TheoraVideoStream.aIsaacCipher_9029), -92)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                        val i_1_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                        method3025(121.toByte(), (class348_sub47.aClass348_Sub49_Sub2_7116!!))
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(113, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197) + -i_1_)
                        InterfaceComponentGroup.method3243(119, class348_sub47)
                    }
                    if (LightingOptionState.aClass348_Sub26_5881 != null) {
                        if ((LightingOptionState.aClass348_Sub26_5881!!.anInt6887) != -1) {
                            val class348_sub47 = method2148((GlCubemapLightPass.aFontMetaRef_7318), (TheoraVideoStream.aIsaacCipher_9029), -81)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), LightingOptionState.aClass348_Sub26_5881!!.anInt6887)
                            InterfaceComponentGroup.method3243(122, class348_sub47)
                            LightingOptionState.aClass348_Sub26_5881 = null
                            FloatCameraTransform.aLong5745 = method599(-106) + 30000L
                        }
                    } else if (FloatCameraTransform.aLong5745 <= method599(-121)) LightingOptionState.aClass348_Sub26_5881 = SceneObjectSpawner.aHostPingThread_1286!!.method1302(-5255, (CacheStateResetter.aServerConnectionInfo_125!!.aString2147!!))
                    val class348_sub45 = (GroundDecorEntity.aNodeDeque_8744!!.method1995(4) as TimedRecordAccessor?)
                    if (class348_sub45 != null || (CompiledScriptCache.aLong4367 < -2000L + method599(-97))) {
                        var class348_sub47: OutgoingPacketNode? = null
                        var i_2_ = 0
                        var class348_sub45_3_ = (NativeRenderNode.aNodeDeque_10479!!.method1995(4) as TimedRecordAccessor?)
                        while (class348_sub45_3_ != null) {
                            if (class348_sub47 != null && (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197 - i_2_ >= 240)) break
                            class348_sub45_3_.method2715(107.toByte())
                            var i_4_ = class348_sub45_3_.method3311(-15)
                            if (i_4_ >= -1) {
                                if (i_4_ > 65534) i_4_ = 65534
                            } else i_4_ = -1
                            var i_5_ = class348_sub45_3_.method3308((-127).toByte())
                            if (i_5_ >= -1) {
                                if (i_5_ > 65534) i_5_ = 65534
                            } else i_5_ = -1
                            if (OpenGlTerrainTile.anInt8270 != i_5_ || i_4_ != anInt4032) {
                                if (class348_sub47 == null) {
                                    CollisionMap.anInt4450++
                                    class348_sub47 = (method2148(CharCodeMap.aFontMetaRef_9590, TheoraVideoStream.aIsaacCipher_9029, -94))
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                                    i_2_ = class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197
                                }
                                var i_6_ = -OpenGlTerrainTile.anInt8270 + i_5_
                                OpenGlTerrainTile.anInt8270 = i_5_
                                var i_7_ = i_4_ - anInt4032
                                anInt4032 = i_4_
                                val i_8_ = ((class348_sub45_3_.method3312((-107).toByte()) + -CompiledScriptCache.aLong4367) / 20L).toInt()
                                if (i_8_ >= 8 || i_6_ < -32 || i_6_ > 31 || i_7_ < -32 || i_7_ > 31) {
                                    if (i_8_ < 32 && i_6_ >= -128 && i_6_ <= 127 && i_7_ >= -128 && i_7_ <= 127) {
                                        i_6_ += 128
                                        i_7_ += 128
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 128 + i_8_)
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_7_ + (i_6_ shl 8))
                                    } else if (i_8_ >= 32) {
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), 57344 + i_8_)
                                        if (i_5_ == 1 || i_4_ == -1) class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(99.toByte(), -2147483648)
                                        else class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(101.toByte(), i_4_ shl 16 or i_5_)
                                    } else {
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 192 + i_8_)
                                        if (i_5_ != 1 && i_4_ != -1) class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(100.toByte(), i_5_ or (i_4_ shl 16))
                                        else class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(114.toByte(), -2147483648)
                                    }
                                } else {
                                    i_6_ += 32
                                    i_7_ += 32
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), (i_7_ + (i_6_ shl 6) + (i_8_ shl 12)))
                                }
                                CompiledScriptCache.aLong4367 = class348_sub45_3_.method3312((-109).toByte())
                            }
                            class348_sub45_3_ = NativeRenderNode.aNodeDeque_10479!!.method1990(79.toByte()) as TimedRecordAccessor?
                        }
                        if (class348_sub47 != null) {
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(105, class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197 + -i_2_)
                            InterfaceComponentGroup.method3243(23, class348_sub47)
                        }
                    }
                    if (class348_sub45 != null) {
                        var l = ((class348_sub45.method3312((-110).toByte()) + -GlTextureBase.aLong5089) / 50L)
                        GlTextureBase.aLong5089 = class348_sub45.method3312((-87).toByte())
                        if (l > 32767) l = 32767L
                        var i_9_ = class348_sub45.method3311(20)
                        if (i_9_ >= 0) {
                            if (i_9_ > 65535) i_9_ = 65535
                        } else i_9_ = 0
                        var i_10_ = class348_sub45.method3308((-128).toByte())
                        if (i_10_ < 0) i_10_ = 0
                        else if (i_10_ > 65535) i_10_ = 65535
                        var i_11_ = 0
                        if (class348_sub45.method3310(i xor 0x2cee) == 2) i_11_ = 1
                        val i_12_ = l.toInt()
                        ParticleEmitterNode.anInt182++
                        val class348_sub47 = method2148(ProjectileConfigUtil.aFontMetaRef_395, (TheoraVideoStream.aIsaacCipher_9029), i + -11525)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_12_ or (i_11_ shl 15))
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(121.toByte(), i_9_ shl 16 or i_10_)
                        InterfaceComponentGroup.method3243(25, class348_sub47)
                    }
                    if (CameraConfigDefinition.anInt3246 > 0) {
                        ColourKeyTextureNode.anInt9348++
                        val class348_sub47 = method2148((ShaderStateVariant.aFontMetaRef_8798), (TheoraVideoStream.aIsaacCipher_9029), -111)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 3 * CameraConfigDefinition.anInt3246)
                        var i_13_ = 0
                        while ((i_13_ < CameraConfigDefinition.anInt3246)) {
                            val interface6 = CacheLruCache.anCharStreamReaderArray3884s!![i_13_]
                            var l = ((interface6!!.method29((-29).toByte()) + -RegionTileNode.aLong6651) / 50L)
                            RegionTileNode.aLong6651 = interface6.method29(106.toByte())
                            if (l > 65535L) l = 65535L
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, interface6.method30(false))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), l.toInt())
                            i_13_++
                        }
                        InterfaceComponentGroup.method3243(-49, class348_sub47)
                    }
                    if (HintArrowOrMessage.anInt2035 > 0) HintArrowOrMessage.anInt2035--
                    if (WorldMapPolygonIconLabel.aBoolean10174 && HintArrowOrMessage.anInt2035 <= 0) {
                        LightDetailOptionState.anInt6033++
                        WorldMapPolygonIconLabel.aBoolean10174 = false
                        HintArrowOrMessage.anInt2035 = 20
                        val class348_sub47 = method2148(ClanChatRequestSender.aFontMetaRef_3648, (TheoraVideoStream.aIsaacCipher_9029), i + -11549)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(i xor 0x3c4d, CameraDistanceOptionState.aFloat3938.toInt() shr 3)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), SceneObjectSpawner.aFloat1287.toInt() shr 3)
                        InterfaceComponentGroup.method3243(-31, class348_sub47)
                    }
                    if (DragDropController.aBoolean4278 != SizeBoundedSoftCache.aBoolean2329) {
                        NormalMapGenerator.anInt3460++
                        DragDropController.aBoolean4278 = SizeBoundedSoftCache.aBoolean2329
                        val class348_sub47 = method2148((InputStream_Sub1.aFontMetaRef_77), (TheoraVideoStream.aIsaacCipher_9029), i xor 0x2cc8.inv())
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, if (!SizeBoundedSoftCache.aBoolean2329) 0 else 1)
                        InterfaceComponentGroup.method3243(i + -11501, class348_sub47)
                    }
                    if (!RenderNodeStatics.aBoolean9719) {
                        GameClock.anInt1110++
                        val class348_sub47 = method2148((FloatBuffer.aFontMetaRef_9743), (TheoraVideoStream.aIsaacCipher_9029), -113)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                        val i_14_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                        val class348_sub49 = IntHashSetStatics.aClass348_Sub51_3959!!.method3427(i xor 0x2cb0)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeBytes(class348_sub49.anInt7197, 0, class348_sub49.aByteArray7154!!, 82)
                        class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(96, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197) + -i_14_)
                        InterfaceComponentGroup.method3243(i + -11473, class348_sub47)
                        RenderNodeStatics.aBoolean9719 = true
                    }
                    if (HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029 != null) {
                        if (WeaveTextureNode.anInt9282 == 2) method241(127.toByte())
                        else if (WeaveTextureNode.anInt9282 == 3) CameraSplineNode.Companion.method2954((-4).toByte())
                    }
                    if (!KeyboardLayoutConfig.aBoolean2130) CircleDrawer.aFloat2687 /= 2.0f
                    else KeyboardLayoutConfig.aBoolean2130 = false
                    if (!MinimapSquareDrawer.aBoolean5224) MultiFieldRecord.Companion.aFloat6898 /= 2.0f
                    else MinimapSquareDrawer.aBoolean5224 = false
                    method3027(33.toByte())
                    if (WorldMapRenderer.anInt4674 == 10) {
                        Client.method3175(55.toByte())
                        method362(i + -11335)
                        method1501(-123)
                        StringCacheNode.anInt7213++
                        if (StringCacheNode.anInt7213 > 750) method2049(83)
                        else {
                            method349(i + -6692)
                            method3150(true)
                            method1397(0)
                            var i_15_ = ProjectedGroundDecor.aVarpStore_10209!!.method1305((-126).toByte(), true)
                            while (i_15_ != -1) {
                                method1767(true, i_15_)
                                FileIoUtil.anIntArray4096!![method1166(31, TypedRecordTable.anInt3695++)] = i_15_
                                i_15_ = ProjectedGroundDecor.aVarpStore_10209!!.method1305((-128).toByte(), false)
                            }
                            var class348_sub42_sub15 = method3127(2681)
                            while (class348_sub42_sub15 != null) {
                                val i_16_ = class348_sub42_sub15.method3245(true)
                                val i_17_ = class348_sub42_sub15.method3248(1)
                                if (i_16_ == 1) {
                                    IsaacCipher.anIntArray1303!![i_17_] = class348_sub42_sub15.anInt9652
                                    ScanlineRasterFiller.aBoolean2469 = ScanlineRasterFiller.aBoolean2469 or GlslEnvMaterialPass.aBooleanArray6270!![i_17_]
                                    NamedIdEntry.Companion.anIntArray6890!![method1166(31, ScrollbarComponent.anInt8352++)] = i_17_
                                } else if (i_16_ == 2) {
                                    GlTextureCubeMap.aStringArray8532!![i_17_] = class348_sub42_sub15.aString9654
                                    RemoveRoofsOptionState.anIntArray6061!![method1166(HslAdjustTextureNode.anInt9385++, 31)] = i_17_
                                } else if (i_16_ == 3) {
                                    val class46 = method2570(1512932720, i_17_)
                                    if (class348_sub42_sub15.aString9654 != class46!!.aString792) {
                                        class46.aString792 = class348_sub42_sub15.aString9654
                                        ConfigFlagUtil.method1916(-9343, class46)
                                    }
                                } else if (i_16_ == 4) {
                                    val class46 = method2570(1512932720, i_17_)
                                    val i_18_ = (class348_sub42_sub15.anInt9652)
                                    val i_19_ = (class348_sub42_sub15.anInt9651)
                                    val i_20_ = (class348_sub42_sub15.anInt9650)
                                    if (i_18_ != class46!!.anInt770 || (class46.anInt753 != i_19_) || (i_20_ != class46.anInt779)) {
                                        class46.anInt753 = i_19_
                                        class46.anInt770 = i_18_
                                        class46.anInt779 = i_20_
                                        ConfigFlagUtil.method1916(-9343, class46)
                                    }
                                } else if (i_16_ == 5) {
                                    val class46 = method2570(i xor 0x5a2da9d8, i_17_)
                                    if ((class46!!.anInt699 != class348_sub42_sub15.anInt9652) || (class348_sub42_sub15.anInt9652 == -1)) {
                                        class46.anInt699 = class348_sub42_sub15.anInt9652
                                        class46.anInt795 = 0
                                        class46.anInt841 = 0
                                        class46.anInt730 = 1
                                        val class17 = (if (class46.anInt699 == -1) null else (ParticleEmitterNode.aWidgetCache_191!!.method835((class46.anInt699), 7)))
                                        if (class17 != null) method2017((class46.anInt795), class17, 30)
                                        ConfigFlagUtil.method1916(-9343, class46)
                                    }
                                } else if (i_16_ == 6) {
                                    val i_21_ = (class348_sub42_sub15.anInt9652)
                                    val i_22_ = (0x7ff9 and i_21_) shr 10
                                    val i_23_ = 0x1f and (i_21_ shr 5)
                                    val i_24_ = 0x1f and i_21_
                                    val i_25_ = ((i_24_ shl 3) + ((i_22_ shl 19) - -(i_23_ shl 11)))
                                    val class46 = method2570(1512932720, i_17_)
                                    if (class46!!.anInt749 != i_25_) {
                                        class46.anInt749 = i_25_
                                        ConfigFlagUtil.method1916(-9343, class46)
                                    }
                                } else if (i_16_ == 7) {
                                    val class46 = method2570(1512932720, i_17_)
                                    val bool = (class348_sub42_sub15.anInt9652 == 1)
                                    if (!class46!!.aBoolean813 == bool) {
                                        class46.aBoolean813 = bool
                                        ConfigFlagUtil.method1916(-9343, class46)
                                    }
                                } else if (i_16_ == 8) {
                                    val class46 = method2570(1512932720, i_17_)
                                    if ((class46!!.anInt757 != class348_sub42_sub15.anInt9652) || (class46.anInt675 != class348_sub42_sub15.anInt9651) || (class46.anInt716 != class348_sub42_sub15.anInt9650)) {
                                        class46.anInt716 = class348_sub42_sub15.anInt9650
                                        class46.anInt675 = class348_sub42_sub15.anInt9651
                                        class46.anInt757 = class348_sub42_sub15.anInt9652
                                        if (class46.anInt812 != -1) {
                                            if (class46.anInt796 <= 0) {
                                                if ((class46.anInt842) > 0) class46.anInt716 = (32 * class46.anInt716 / (class46.anInt842))
                                            } else class46.anInt716 = ((class46.anInt716) * 32 / (class46.anInt796))
                                        }
                                        ConfigFlagUtil.method1916(-9343, class46)
                                    }
                                } else if (i_16_ == 9) {
                                    val class46 = method2570(1512932720, i_17_)
                                    if ((class348_sub42_sub15.anInt9652 != class46!!.anInt812) || (class348_sub42_sub15.anInt9651 != class46.anInt781)) {
                                        class46.anInt781 = class348_sub42_sub15.anInt9651
                                        class46.anInt812 = class348_sub42_sub15.anInt9652
                                        ConfigFlagUtil.method1916(-9343, class46)
                                    }
                                } else if (i_16_ == 10) {
                                    val class46 = method2570(1512932720, i_17_)
                                    if ((class46!!.anInt808 != (class348_sub42_sub15.anInt9652)) || ((class46.anInt786) != (class348_sub42_sub15.anInt9651)) || ((class348_sub42_sub15.anInt9650) != class46.anInt717)) {
                                        class46.anInt786 = (class348_sub42_sub15.anInt9651)
                                        class46.anInt808 = (class348_sub42_sub15.anInt9652)
                                        class46.anInt717 = (class348_sub42_sub15.anInt9650)
                                        ConfigFlagUtil.method1916(-9343, class46)
                                    }
                                } else if (i_16_ == 11) {
                                    val class46 = (method2570(1512932720, i_17_))
                                    class46!!.aByte817 = 0.toByte()
                                    class46.anInt739 = (class348_sub42_sub15.anInt9651)
                                    class46.anInt750 = class46.anInt739
                                    class46.aByte681 = 0.toByte()
                                    class46.anInt788 = (class348_sub42_sub15.anInt9652)
                                    class46.anInt800 = class46.anInt788
                                    ConfigFlagUtil.method1916(-9343, class46)
                                } else if (i_16_ == 12) {
                                    val class46 = (method2570(1512932720, i_17_))
                                    var i_26_ = (class348_sub42_sub15.anInt9652)
                                    if (class46 != null && (class46.anInt774) == 0) {
                                        if ((-(class46.anInt789) + (class46.anInt791)) < i_26_) i_26_ = ((class46.anInt791) - (class46.anInt789))
                                        if (i_26_ < 0) i_26_ = 0
                                        if (i_26_ != (class46.anInt755)) {
                                            class46.anInt755 = i_26_
                                            method1916(-9343, class46)
                                        }
                                    }
                                } else if (i_16_ == 14) {
                                    val class46 = (method2570(1512932720, i_17_))
                                    class46!!.anInt756 = (class348_sub42_sub15.anInt9652)
                                } else if (i_16_ == 15) {
                                    TerrainChunkBuilder.anInt1548 = (class348_sub42_sub15.anInt9651)
                                    MediaStreamClient.anInt3203 = (class348_sub42_sub15.anInt9652)
                                    ModelKeyBuilder.Companion.aBoolean6759 = true
                                } else if (i_16_ == 16) {
                                    val class46 = (method2570(1512932720, i_17_))
                                    class46!!.anInt702 = (class348_sub42_sub15.anInt9652)
                                } else if (i_16_ == 17) {
                                    val class46 = (method2570(1512932720, i_17_))
                                    class46!!.anInt806 = (class348_sub42_sub15.anInt9652)
                                }
                                class348_sub42_sub15 = method3127(2681)
                            }
                            DisplaySettingsConfig.anInt7267++
                            if (FogOptionState.anInt6048 != 0) {
                                LinkedListNodeStatics.anInt4292 += 20
                                if (LinkedListNodeStatics.anInt4292 >= 400) FogOptionState.anInt6048 = 0
                            }
                            if (ResourceLoaderThread.aWidgetComponent_3913 != null) {
                                GroundItemRenderState.anInt1656++
                                if (GroundItemRenderState.anInt1656 >= 15) {
                                    ConfigFlagUtil.method1916(-9343, ResourceLoaderThread.aWidgetComponent_3913!!)
                                    ResourceLoaderThread.aWidgetComponent_3913 = null
                                }
                            }
                            MapElementDecor.aWidgetComponent_10336 = null
                            MinimapSquareDrawer.aBoolean5221 = false
                            HeapDiagnosticsHolder.aWidgetComponent_2249 = null
                            ScrollingWidgetComponentNode.aBoolean8386 = false
                            method198(null, false, -1, -1)
                            method1343(-1, null, 1, -1)
                            if (!RenderNodeStatics.aBoolean9722) Tooltip.anInt4458 = -1
                            FloatGrid.method1583((-73).toByte())
                            ResourceLoaderThread.anInt3918++
                            if (WorldMapScene.aBoolean3103) {
                                NodeDequeHolder.anInt1568++
                                val class348_sub47 = method2148((OpenGlRenderer.aFontMetaRef_7715), (TheoraVideoStream.aIsaacCipher_9029), i + -11525)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(117.toByte(), (InputStream_Sub2.anInt85 shl 14 or (ColourKeyTextureNode.anInt9349 shl 28) or NpcType.anInt1404))
                                InterfaceComponentGroup.method3243(30, class348_sub47)
                                WorldMapScene.aBoolean3103 = false
                            }
                            while (true) {
                                val class348_sub36 = (BufferedOutputStreamWorker.aNodeDeque_2707!!.method1997(8) as? WidgetActionEntry?)
                                if (class348_sub36 == null) break
                                val class46 = (class348_sub36.aWidgetComponent_6989)!!
                                if (class46.anInt704 >= 0) {
                                    val class46_27_ = method2570(1512932720, (class46.anInt834))
                                    if (class46_27_ == null || (class46_27_.aWidgetComponentArray798) == null || ((class46_27_.aWidgetComponentArray798!!).size <= class46.anInt704) || (class46 != (class46_27_.aWidgetComponentArray798!![class46.anInt704]))) {
                                        continue
                                    }
                                }
                                method705(class348_sub36)
                            }
                            while (true) {
                                val class348_sub36 = (RendererType.aNodeDeque_4473!!.method1997(8) as? WidgetActionEntry?)
                                if (class348_sub36 == null) break
                                val class46 = (class348_sub36.aWidgetComponent_6989)!!
                                if (class46.anInt704 >= 0) {
                                    val class46_28_ = method2570(1512932720, (class46.anInt834))
                                    if (class46_28_ == null || (class46_28_.aWidgetComponentArray798) == null || (class46.anInt704 >= (class46_28_.aWidgetComponentArray798!!).size) || ((class46_28_.aWidgetComponentArray798!![class46.anInt704]) != class46)) {
                                        continue
                                    }
                                }
                                method705(class348_sub36)
                            }
                            while (true) {
                                val class348_sub36 = (HashTileShape.aNodeDeque_8810!!.method1997(i + -11424) as? WidgetActionEntry?)
                                if (class348_sub36 == null) break
                                val class46 = (class348_sub36.aWidgetComponent_6989)!!
                                if (class46.anInt704 >= 0) {
                                    val class46_29_ = method2570(1512932720, (class46.anInt834))
                                    if (class46_29_ == null || (class46_29_.aWidgetComponentArray798) == null || (class46.anInt704 >= (class46_29_.aWidgetComponentArray798!!).size) || ((class46_29_.aWidgetComponentArray798!![class46.anInt704]) != class46)) {
                                        continue
                                    }
                                }
                                method705(class348_sub36)
                            }
                            if (HeapDiagnosticsHolder.aWidgetComponent_2249 == null) HashLinkedListNodeStatics.anInt7059 = 0
                            if (RegionSceneLoader.aWidgetComponent_3701 != null) method2708(-30206)
                            if (AsyncTaskHandle.anInt2581 > 0 && LoadProgressCounters.aKeyboardInputSource_2449!!.method2696(82, i xor 0x2cd5.inv()) && LoadProgressCounters.aKeyboardInputSource_2449!!.method2696(81, -121) && NodeDequeHolder.anInt1565 != 0) {
                                var i_30_ = ((LocalPlayerState.aPlayer_1907!!.plane) - NodeDequeHolder.anInt1565)
                                if (i_30_ >= 0) {
                                    if (i_30_ > 3) i_30_ = 3
                                } else i_30_ = 0
                                CollisionMap.method3502((LocalPlayerState.aPlayer_1907!!.anIntArray10317!![0]) + RegionMapDecoder.regionTileY, i xor 0x2caa, i_30_, (LocalPlayerState.aPlayer_1907!!.anIntArray10320!![0]) + ArbVertexProgram.regionTileX)
                            }
                            method1987(-120)
                            var i_31_ = 0
                            if (i == 11432) {
                                while ( /**/i_31_ < 5) {
                                    GroundDecorSceneEntity.anIntArray9981!![i_31_] = GroundDecorSceneEntity.anIntArray9981!![i_31_] + 1
                                    i_31_++
                                }
                                if (ScanlineRasterFiller.aBoolean2469 && (-60000L + method599(-84) > SkeletalAnimFrameLoader.aLong482)) method2405(i + -11313)
                                var class318_sub9_sub1 = (InterfaceComponentGroup.aDoublyLinkedNodeList_9642!!.method1872(i + -11424) as? NamedTimedNode?)
                                while (class318_sub9_sub1 != null) {
                                    if ((method599(i xor 0x2ce9.inv()) / 1000L + -5L) > class318_sub9_sub1.anInt8787.toLong()) {
                                        if (class318_sub9_sub1.aShort8786 > 0) FixedFunctionMaterialPass.method2144("", 5, (-128).toByte(), 0, (class318_sub9_sub1.aString8783 + (LocalizedText.aLocalizedText_3502!!.method2063(ChatCommandProcessor.anInt6967, 544))), "", "")
                                        if (class318_sub9_sub1.aShort8786.toInt() == 0) FixedFunctionMaterialPass.method2144("", 5, (-105).toByte(), 0, (class318_sub9_sub1.aString8783 + (LocalizedText.aLocalizedText_3503!!.method2063(ChatCommandProcessor.anInt6967, 544))), "", "")
                                        class318_sub9_sub1.method2373(false)
                                    }
                                    class318_sub9_sub1 = (InterfaceComponentGroup.aDoublyLinkedNodeList_9642!!.method1878((-105).toByte()) as? NamedTimedNode?)
                                }
                                ItemNameResolver.anInt4999++
                                if (ItemNameResolver.anInt4999 > 500) {
                                    ItemNameResolver.anInt4999 = 0
                                    val i_32_ = (8.0 * Math.random()).toInt()
                                    if ((0x4 and i_32_) == 4) RenderableGroup.anInt5016 += ProjectileDefinition.anInt3844
                                    if ((i_32_ and 0x1) == 1) ConnectionStateRefs.anInt319 += WallEntity.anInt8775
                                    if ((0x2 and i_32_) == 2) WalkingTypeUtil.anInt3310 += anInt4263
                                }
                                if (ConnectionStateRefs.anInt319 < -50) WallEntity.anInt8775 = 2
                                if (ConnectionStateRefs.anInt319 > 50) WallEntity.anInt8775 = -2
                                if (WalkingTypeUtil.anInt3310 < -55) anInt4263 = 2
                                if (RenderableGroup.anInt5016 < -40) ProjectileDefinition.anInt3844 = 1
                                if (WalkingTypeUtil.anInt3310 > 55) anInt4263 = -2
                                GlBufferObject.anInt4753++
                                if (RenderableGroup.anInt5016 > 40) ProjectileDefinition.anInt3844 = -1
                                if (GlBufferObject.anInt4753 > 500) {
                                    GlBufferObject.anInt4753 = 0
                                    val i_33_ = (Math.random() * 8.0).toInt()
                                    if ((i_33_ and 0x2) == 2) FloatBuffer.anInt9750 += InterfaceComponentGroup.anInt9645
                                    if ((i_33_ and 0x1) == 1) OpenGlRenderNode.anInt10483 += HardKeyedCacheEntryReference.anInt10443
                                }
                                if (OpenGlRenderNode.anInt10483 < -60) HardKeyedCacheEntryReference.anInt10443 = 2
                                if (FloatBuffer.anInt9750 < -20) InterfaceComponentGroup.anInt9645 = 1
                                if (OpenGlRenderNode.anInt10483 > 60) HardKeyedCacheEntryReference.anInt10443 = -2
                                if (FloatBuffer.anInt9750 > 10) InterfaceComponentGroup.anInt9645 = -1
                                SceneRegionState.anInt193++
                                if (SceneRegionState.anInt193 > 50) {
                                    IOException_Sub1.anInt88++
                                    val class348_sub47 = (method2148(RangedGraphicsOptionState.aFontMetaRef_5938, TheoraVideoStream.aIsaacCipher_9029, -125))
                                    InterfaceComponentGroup.method3243(i xor 0x2cc0.inv(), class348_sub47)
                                }
                                if (MultiLevelOptionState.aBoolean6147) {
                                    method2334(0)
                                    MultiLevelOptionState.aBoolean6147 = false
                                }
                                try {
                                    method1802(0)
                                } catch (ioexception: IOException) {
                                    method2049(93)
                                }
                            }
                        }
                    }
                }
            }
        }

        var anInt4032: Int = -1


        var anInt6961: Int = 0
        fun method3025(i: Byte, class348_sub49_sub2: CipheredPacketBuffer) {
            anInt6961++
            val class348_sub48 = aNodeDeque_6978!!.method1995(4) as ModelResourceBundle?
            if (class348_sub48 != null) {
                var bool = false
                for (i_0_ in 0..<class348_sub48.anInt7126) {
                    if (class348_sub48.aLinkedQueueNodeArray7135!![i_0_] != null) {
                        if ((class348_sub48.aLinkedQueueNodeArray7135!![i_0_]!!.anInt1997) == 2) class348_sub48.anIntArray7131!![i_0_] = -5
                        if ((class348_sub48.aLinkedQueueNodeArray7135!![i_0_]!!.anInt1997) == 0) bool = true
                    }
                    if (class348_sub48.aLinkedQueueNodeArray7127!![i_0_] != null) {
                        if ((class348_sub48.aLinkedQueueNodeArray7127!![i_0_]!!.anInt1997) == 2) class348_sub48.anIntArray7131!![i_0_] = -6
                        if ((class348_sub48.aLinkedQueueNodeArray7127!![i_0_]!!.anInt1997) == 0) bool = true
                    }
                }
                if (i < 37) LoadProgressCounters.aLong6966 = -3L
                if (!bool) {
                    val i_1_ = class348_sub49_sub2.anInt7197
                    class348_sub49_sub2.writeInt(94.toByte(), class348_sub48.anInt7130)
                    var i_2_ = 0
                    while ((i_2_ < class348_sub48.anInt7126)) {
                        if (class348_sub48.anIntArray7131!![i_2_] == 0) {
                            try {
                                val i_3_ = (class348_sub48.anIntArray7132!![i_2_])
                                if (i_3_ == 0) {
                                    val field = ((class348_sub48.aLinkedQueueNodeArray7135!![i_2_]!!.anObject1998) as Field?)
                                    val i_5_ = field!!.getInt(null)
                                    class348_sub49_sub2.writeByte(false, 0)
                                    class348_sub49_sub2.writeInt(108.toByte(), i_5_)
                                } else if (i_3_ == 1) {
                                    val field = ((class348_sub48.aLinkedQueueNodeArray7135!![i_2_]!!.anObject1998) as Field?)
                                    field!!.setInt(null, (class348_sub48.anIntArray7136!![i_2_]))
                                    class348_sub49_sub2.writeByte(false, 0)
                                } else if (i_3_ == 2) {
                                    val field = ((class348_sub48.aLinkedQueueNodeArray7135!![i_2_]!!.anObject1998) as Field?)
                                    val i_4_ = field!!.getModifiers()
                                    class348_sub49_sub2.writeByte(false, 0)
                                    class348_sub49_sub2.writeInt(122.toByte(), i_4_)
                                }
                                if (i_3_ == 3) {
                                    val method = ((class348_sub48.aLinkedQueueNodeArray7127!![i_2_]!!.anObject1998) as Method?)
                                    val `is` = (class348_sub48.aByteArrayArrayArray7128!![i_2_])!!
                                    val objects = arrayOfNulls<Any>(`is`.size)
                                    var i_6_ = 0
                                    while (`is`.size > i_6_) {
                                        val objectinputstream = (ObjectInputStream(ByteArrayInputStream(`is`[i_6_])))
                                        objects[i_6_] = objectinputstream.readObject()
                                        i_6_++
                                    }
                                    val `object` = method!!.invoke(null, *objects)
                                    if (`object` != null) {
                                        if (`object` is Number) {
                                            class348_sub49_sub2.writeByte(false, 1)
                                            class348_sub49_sub2.writeLong(`object`.toLong(), (-81).toByte())
                                        } else if (`object` is String) {
                                            class348_sub49_sub2.writeByte(false, 2)
                                            class348_sub49_sub2.writeString((-5).toByte(), `object`)
                                        } else class348_sub49_sub2.writeByte(false, 4)
                                    } else class348_sub49_sub2.writeByte(false, 0)
                                } else if (i_3_ == 4) {
                                    val method = ((class348_sub48.aLinkedQueueNodeArray7127!![i_2_]!!.anObject1998) as Method?)
                                    val i_7_ = method!!.getModifiers()
                                    class348_sub49_sub2.writeByte(false, 0)
                                    class348_sub49_sub2.writeInt(95.toByte(), i_7_)
                                }
                            } catch (classnotfoundexception: ClassNotFoundException) {
                                class348_sub49_sub2.writeByte(false, -10)
                            } catch (invalidclassexception: InvalidClassException) {
                                class348_sub49_sub2.writeByte(false, -11)
                            } catch (streamcorruptedexception: StreamCorruptedException) {
                                class348_sub49_sub2.writeByte(false, -12)
                            } catch (optionaldataexception: OptionalDataException) {
                                class348_sub49_sub2.writeByte(false, -13)
                            } catch (illegalaccessexception: IllegalAccessException) {
                                class348_sub49_sub2.writeByte(false, -14)
                            } catch (illegalargumentexception: IllegalArgumentException) {
                                class348_sub49_sub2.writeByte(false, -15)
                            } catch (invocationtargetexception: InvocationTargetException) {
                                class348_sub49_sub2.writeByte(false, -16)
                            } catch (securityexception: SecurityException) {
                                class348_sub49_sub2.writeByte(false, -17)
                            } catch (ioexception: IOException) {
                                class348_sub49_sub2.writeByte(false, -18)
                            } catch (nullpointerexception: NullPointerException) {
                                class348_sub49_sub2.writeByte(false, -19)
                            } catch (exception: Exception) {
                                class348_sub49_sub2.writeByte(false, -20)
                            } catch (throwable: Throwable) {
                                class348_sub49_sub2.writeByte(false, -21)
                            }
                        } else class348_sub49_sub2.writeByte(false, (class348_sub48.anIntArray7131!![i_2_]))
                        i_2_++
                    }
                    class348_sub49_sub2.method3344(i_1_, false)
                    class348_sub48.method2715(46.toByte())
                }
            }
        }


        var anInt4263: Int = 2
        var anInt6975: Int = 0
        fun method3027(i: Byte) {
            anInt6975++
            if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub27_7261!!.method1840(-32350) == 0 && CompiledScriptCache.anInt4372 != ParticleSystemState.anInt2204) RegionSceneShifter.Companion.method3157(FileIoUtil.anInt4095, 123.toByte(), Renderer.anInt4581, 11, false)
            else {
                StringValueNode.method3319(FacingDirectionNode.aRenderer6654, (-121).toByte())
                if (TrackedGroundDecor.anInt10395 != CompiledScriptCache.anInt4372) EdgeDetectTextureNode.method3072((-96).toByte())
            }
        }
        var aNodeDeque_6978: NodeDeque? = NodeDeque()

        var anInt8761: Int = 0
        fun method2480(i: Int) {
            if (i == -1) {
                anInt8761++
                Client.aNodeDeque_6978 = NodeDeque()
            }
        }
        @JvmStatic
        fun method3028(i: Int) {
            InputStream_Sub2.aRgbColorPalette_6977 = null
            ClientLoadStateMachine.aJs5Archive_6980 = null
            aNodeDeque_6978 = null
        }
        fun method2389(i: Int) {
            InboundPacketHeader.aInboundPacketHeader_6383 = null
        }
        var aMapSceneCache_413: MapSceneCache? = null
        fun method322(i: Int) {
            NativeTerrainTile.anIntArray407 = null
            Client.aMapSceneCache_413 = null
        }
        var anInt2746: Int = 0
        fun method1540(i: Int, i_31_: Int, i_32_: Int) {
            anInt2746++
            val class348_sub42_sub15 = NamedTimedNode.method2516(i_31_, 105.toByte(), 13)
            class348_sub42_sub15.method3246(-25490)
            class348_sub42_sub15.anInt9652 = i_32_
        }
        var aAbstractGameSocket_9165: AbstractGameSocket? = null
        fun method3068(i: Int) {
            LoadingBarRenderer.aColorArray9163 = null
            Client.aAbstractGameSocket_9165 = null
        }
        var anIntArray1233: IntArray? = IntArray(1024)
        fun method744(i: Byte) {
            InboundPacketHeader.aInboundPacketHeader_1234 = null
            anIntArray1233 = null
        }
        var anInt9509: Int = 0
        fun method3175(i: Byte) {
            if (!method3196(WorldMapRenderer.anInt4674, -114) && !method2672(WorldMapRenderer.anInt4674, -103)) {
                val i_12_ = ((LocalPlayerState.aPlayer_1907!!.anIntArray10320!![0]) shr 3)
                val i_13_ = ((LocalPlayerState.aPlayer_1907!!.anIntArray10317!![0]) shr 3)
                if (i_12_ < 0 || GlCubemapLightPass.anInt7319 shr 3 <= i_12_ || i_13_ < 0 || (RangeThresholdTextureNode.anInt9109 shr 3 <= i_13_)) AwtKeyboardListener.method2703(0, GlCubemapLightPass.anInt7319 shr 4, (RangeThresholdTextureNode.anInt9109 shr 4), (-13).toByte())
                else AwtKeyboardListener.method2703(5000, i_12_, i_13_, (-13).toByte())
            } else AwtKeyboardListener.method2703(5000, GlslMaterialPass.anInt6246 shr 12, CompositeRgbNoiseTexture.anInt8685 shr 12, (-13).toByte())
            anInt9509++
            method3134(-1)
            method2988(true)
            val i_14_ = -8 % ((-30 - i) / 38)
            method3126(98.toByte())
            method1131(117)
        }
        var aShortArray6428: ShortArray? = null
        fun method2506(i: Byte) {
            aShortArray6428 = null
            PerlinNoiseTextureNode.anIntArray6432 = null
            InboundPacketHeader.aInboundPacketHeader_6424 = null
        }
        var aHudTabPanel_1189: HudTabPanel? = HudTabPanel("LIVE", 0)


        @JvmStatic
        fun method719(i: Byte) {
            MovementDirection.aMovementDirection_1183 = null
            MovementDirection.aMovementDirection_1184 = null
            MovementDirection.aMovementDirection_1181 = null
            if (i.toInt() == 72) {
                MovementDirection.aMovementDirection_1182 = null
                MovementDirection.anIntArrayArray1190 = null
                MovementDirection.aMovementDirection_1187 = null
                Client.aHudTabPanel_1189 = null
                MovementDirection.aMovementDirection_1179 = null
                MovementDirection.aMovementDirection_1186 = null
                MovementDirection.aMovementDirection_1185 = null
            }
        }
    }
}
