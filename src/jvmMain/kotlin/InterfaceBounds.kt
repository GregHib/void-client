import ClientLoadStateMachine.method1277
import PerlinTextureProvider.Companion.method1402
import SocketGameConnection.Companion.method1707
import DisplayModeOptionState.Companion.method1828
import ModelDataCache.method297
import CompassSmoother.Companion.method2017
import WorldMapIconLabel.Companion.method3573
import MapSceneCache.Companion.method821
import java.awt.Component
import java.lang.reflect.Constructor
import kotlin.math.sin

class InterfaceBounds internal constructor(private val anInt6815: Int, private val anInt6820: Int, private var anInt6811: Int, private val anInt6806: Int, private var anInt6810: Int, @JvmField var anInt6809: Int, @JvmField var anInt6812: Int, @JvmField var anInt6819: Int, @JvmField var anInt6813: Int) : LinkedListNode() {
    fun method2934(i: Int, i_0_: Int, i_1_: Int): Boolean {
        anInt6822++
        if (i != 3589) method2941(null, 70, false)
        return i_0_ >= anInt6820 && i_0_ <= anInt6806 && i_1_ >= anInt6811 && anInt6810 >= i_1_
    }

    fun method2935(i: Int, i_2_: Int, i_3_: Int, bool: Boolean): Boolean {
        anInt6821++
        if (bool != true) anInt6811 = -84
        return i_3_ == anInt6815 && i_2_ >= anInt6820 && anInt6806 >= i_2_ && i >= anInt6811 && anInt6810 >= i
    }

    fun method2937(i: Int, i_4_: Int, i_5_: Int, `is`: IntArray) {
        anInt6816++
        `is`[0] = anInt6815
        `is`[1] = -this.anInt6809 - -anInt6820 + i
        `is`[2] = i_4_ + (-this.anInt6812 + anInt6811)
        if (i_5_ != -3069) anInt6810 = -14
    }

    fun method2939(i: Int, i_7_: Int, i_8_: Int): Boolean {
        anInt6807++
        if (i_7_ != 2) return true
        return this.anInt6809 <= i && this.anInt6819 >= i && (i_8_ >= this.anInt6812) && this.anInt6813 >= i_8_
    }

    fun method2940(i: Int, bool: Boolean, `is`: IntArray, i_9_: Int) {
        anInt6817++
        `is`[0] = 0
        `is`[2] = i + -anInt6811 + this.anInt6812
        `is`[1] = i_9_ - anInt6820 - -this.anInt6809
        if (bool != true) this.anInt6812 = -26
    }

    companion object {
        var anInt6804: Int = 0
        var anInt6805: Int = 0
        var anInt6807: Int = 0
        var anInt6808: Int = 0
        var aOutgoingPacketHeader_6814: OutgoingPacketHeader? = OutgoingPacketHeader(63, 3)
        var anInt6816: Int = 0
        var anInt6817: Int = 0
        var anInt6818: Int = 0
        var anInt6821: Int = 0
        var anInt6822: Int = 0

        /*synthetic*/
        var aClass6823: Class<*>? = null

        @JvmStatic
        fun method2936(i: Byte) {
            if (i.toInt() == -25) aOutgoingPacketHeader_6814 = null
        }

        fun method2938(i: Byte) {
            anInt6804++
            RenderConfigFactoryStatics.aLocDefinitionCache_2979!!.method2037(10205)
            Tooltip.aParticleDefLoader_4460!!.method1381(true)
            RadialTextureNode.aModelDefinitionLoader_9342!!.method1206((-37).toByte())
            GradientLookupEffect.aSeqDefinitionCache_9195!!.method2012(-23828)
            MapAreaDefinition.aBufferedMessageQueue_2529!!.method2078(-6080)
            ClientExceptionStatics.aModelHeaderCache_112!!.method1939(-110)
            ParticleEmitterNode.aWidgetCache_191!!.method834((-116).toByte())
            ConstantColourTextureNode.aMapElementDefinitionCache_9245!!.method2546(60)
            RenderConfigFactoryStatics.aVarbitDefLoader_2981!!.method1445(64)
            NormalMapGenerator.aParticleAmountCache_3453!!.method1589(127.toByte())
            OpenGlModel.aNpcDefinitionCache_5558!!.method1985(0)
            ModelOrSpriteHolderStatics.aTextureDefinitionLoader_117!!.method1175(125.toByte())
            TheoraVideoStream.aConfigDefinitionLoader_9031!!.method1219(7851)
            TheoraVideoStream.aLocTypeDefLoader_9036!!.method1404((-82).toByte())
            ProjectionCameraTransform.aEmoteDefCache_5764!!.method2601((-44).toByte())
            Client.aMapSceneCache_413!!.method822((-120).toByte())
            HoverActionEntryStatics.aSpriteStore_1813!!.method300((-123).toByte())
            AbstractTileShapeStatics.aMapSceneDefLoader_6559!!.method1393((-13).toByte())
            CacheArchiveIndexLoader.aItemDefinitionLoader_3147!!.method1290(-8)
            SpriteLoadValidatorStatics.aWorldMapImageBuilder_4787!!.method695(true)
            FileExistsConditionStatics.aModelDefinitionCache_4782!!.method1602(0)
            method3573(-15326)
            method1277(62.toByte())
            method821(-126)
            InterfaceBounds.method2375(16127)
            if (OggCacheStream.aNamedIdRecord_5271 != NpcAnimationResolverStatics.aNamedIdRecord_165) {
                var i_6_ = 0
                while (CacheLruCache.aByteArrayArray3882!!.size > i_6_) {
                    CacheLruCache.aByteArrayArray3882!![i_6_] = null
                    i_6_++
                }
                ScrollingWidgetComponentNode.anInt8388 = 0
            }
            NamedIdRecord.method3517(83)
            IntHashSetStatics.method2368(-1)
            method1828(87)
            if (i > 53) {
                method297(false)
                method1402(1)
                ChatCommandProcessor.aLruByteCache_1174!!.method590(0)
                FacingDirectionNodeStatics.aRenderer6654!!.method3663()
                method1707(26469)
                ByteBufferStatics.method3354(-52)
                ShortKeyNodeStatics.aJs5Archive_6909!!.method412((-124).toByte())
                TextureGeneratorStatics.aJs5Archive_2490!!.method412((-119).toByte())
                DirectionUtil.aJs5Archive_1541!!.method412(37.toByte())
                ClientLoadStateMachine.aJs5Archive_6980!!.method412((-113).toByte())
                ClientLoadStateMachine.aJs5Archive_1878!!.method412((-116).toByte())
                AbstractCameraTransformStatics.aJs5Archive_7382!!.method412((-110).toByte())
                CachedRgbNoiseTexture.aJs5Archive_8667!!.method412(64.toByte())
                RasterSpriteStatics.aJs5Archive_5207!!.method412(120.toByte())
                CameraRotationStubStatics.aJs5Archive_322!!.method412(98.toByte())
                WorldMapTextLabel.aJs5Archive_8589!!.method412(43.toByte())
                SceneTilePlaneManager.aJs5Archive_233!!.method412(20.toByte())
                TheoraVideoStream.aJs5Archive_9033!!.method412(89.toByte())
                CameraNodeListStatics.aJs5Archive_1743!!.method412((-125).toByte())
                SoftwareSpriteRaster.aJs5Archive_1627!!.method412((-117).toByte())
                LightingOptionState.aJs5Archive_5878!!.method412(29.toByte())
                HoverActionEntryStatics.aJs5Archive_1815!!.method412(80.toByte())
                AnimationFrameState.aJs5Archive_1538!!.method412(34.toByte())
                VideoAdChecker.aJs5Archive_3183!!.method412((-116).toByte())
                FloatGridStatics.aJs5Archive_4975!!.method412(28.toByte())
                ScriptOpcodeHolder.aJs5Archive_2306!!.method412((-115).toByte())
                OpenGlRenderNode.aJs5Archive_10480!!.method412(22.toByte())
                BufferedRandomAccessFile.aJs5Archive_1322!!.method412(36.toByte())
                MidiSequencePlayer.aJs5Archive_8926!!.method412((-114).toByte())
                TerrainShadowBuilderGl2.Companion.aJs5Archive_6950!!.method412(36.toByte())
                ModelBatchBaseStatics.aJs5Archive_1897!!.method412((-114).toByte())
                ConfigArchiveLoaderStatics.aJs5Archive_1434!!.method412((-117).toByte())
                KeyEventNode.Companion.aJs5Archive_4770!!.method412(78.toByte())
                ClientLoadStateMachine.aJs5Archive_3146!!.method412(88.toByte())
                FixedFunctionWaterPass.aJs5Archive_7362!!.method412((-109).toByte())
                NodeDequeStatics.aJs5Archive_3323!!.method412(112.toByte())
                Crc64Hashable.aJs5Archive_4984!!.method412(85.toByte())
                SpriteLoadValidatorStatics.aJs5Archive_4796!!.method412(93.toByte())
                HitsplatDefinition.aJs5Archive_2015!!.method412((-122).toByte())
                TextureMipDescriptor.aLruByteCache_4346!!.method590(0)
                MaterialTypeMarkerStatics.aLruByteCache_6517!!.method590(0)
                TerrainTileShape.aLruByteCache_8807!!.method590(0)
                SkeletalAnimFrameLoader.aLruByteCache_463!!.method590(0)
            }
        }

        @JvmStatic
        fun method2941(component: Component?, i: Int, bool: Boolean): InputTracker? {
            anInt6808++
            try {
                val constructor: Constructor<*> = (MouseWheelInputTracker::class.java.getDeclaredConstructor((if (aClass6823 != null) aClass6823 else (Component::class.java.also { aClass6823 = it })), java.lang.Boolean.TYPE))
                return (constructor.newInstance(*arrayOf<Any?>(component, bool)) as InputTracker)
            } catch (throwable: Throwable) {
                if (i != 0) return null
                return MouseInputTracker(component, bool)
            }
        }

        fun method2942(widgetComponent: WidgetComponent, i: Byte) {
            anInt6805++
            if (widgetComponent.anInt765 == TextureMetadataProvider.anInt4610) {
                if (LocalPlayerState.aPlayer_1907!!.aString10544 == null) {
                    widgetComponent.anInt779 = 0
                    widgetComponent.anInt753 = 0
                } else {
                    widgetComponent.anInt757 = 150
                    widgetComponent.anInt675 = 0x7ff and (256.0 * sin((GlGroundShaderPass.anInt7396).toDouble() / 40.0)).toInt()
                    widgetComponent.anInt770 = 5
                    widgetComponent.anInt753 = CharCodeMap.anInt9591
                    widgetComponent.anInt779 = (ModelGroundDecor.method2418((LocalPlayerState.aPlayer_1907!!.aString10544!!), (-41).toByte()))
                    widgetComponent.anInt699 = LocalPlayerState.aPlayer_1907!!.anInt10268
                    widgetComponent.anInt841 = 0
                    widgetComponent.anInt730 = LocalPlayerState.aPlayer_1907!!.anInt10312
                    widgetComponent.anInt795 = LocalPlayerState.aPlayer_1907!!.anInt10245
                    val class17 = (if (widgetComponent.anInt699 != -1) ParticleEmitterNode.aWidgetCache_191!!.method835(widgetComponent.anInt699, 7) else null)
                    if (class17 != null) method2017(widgetComponent.anInt795, class17, 50)
                }
            } else {
                val i_10_ = -14 % ((27 - i) / 59)
            }
        }
        var anInt3972: Int = 0
        fun method2375(i: Int) {
            anInt3972++
            SocketStreamWorker.aLruByteCache_2671!!.method590(0)
        }
    }
}
