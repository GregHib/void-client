import kotlin.jvm.JvmField
import kotlin.jvm.JvmStatic
import ClientLoadStateMachine.method1277
import PerlinTextureProvider.Companion.method1402
import SocketGameConnection.Companion.method1707
import DisplayModeOptionState.Companion.method1828
import ModelDataCache.method297
import CompassSmoother.Companion.method2017
import WorldMapIconLabel.Companion.method3573
import MapSceneCache.Companion.method821
import awt.Component
import lang.Class
//import lang.reflect.Constructor
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
        var aFontMetaRef_6814: FontMetaRef? = FontMetaRef(63, 3)
        var anInt6816: Int = 0
        var anInt6817: Int = 0
        var anInt6818: Int = 0
        var anInt6821: Int = 0
        var anInt6822: Int = 0

        /*synthetic*/
        var aClass6823: Class<*>? = null

        @JvmStatic
        fun method2936(i: Byte) {
            if (i.toInt() == -25) aFontMetaRef_6814 = null
        }

        fun method2938(i: Byte) {
            anInt6804++
            RenderConfigFactory.aFloorOverlayTypeList_2979!!.method2037(10205)
            Tooltip.aParticleDefLoader_4460!!.method1381(true)
            RadialTextureNode.aModelDefinitionLoader_9342!!.method1206((-37).toByte())
            GradientLookupEffect.aObjectTypeList_9195!!.method2012(-23828)
            MapAreaDefinition.aNpcTypeList_2529!!.method2078(-6080)
            ClientException.aItemTypeList_112!!.method1939(-110)
            ParticleEmitterNode.aAnimationTypeList_191!!.method834((-116).toByte())
            ConstantColourTextureNode.aGfxTypeList_9245!!.method2546(60)
            RenderConfigFactory.aVarbitDefLoader_2981!!.method1445(64)
            NormalMapGenerator.aParticleAmountCache_3453!!.method1589(127.toByte())
            OpenGlModel.aNpcDefinitionCache_5558!!.method1985(0)
            ModelOrSpriteHolder.aMapSceneDefinitionLoader_117!!.method1175(125.toByte())
            TheoraVideoStream.aConfigDefinitionLoader_9031!!.method1219(7851)
            TheoraVideoStream.aLocTypeDefLoader_9036!!.method1404((-82).toByte())
            ProjectionCameraTransform.aParamTypeList_5764!!.method2601((-44).toByte())
            Client.aMapSceneCache_413!!.method822((-120).toByte())
            HoverActionEntry.aSpriteStore_1813!!.method300((-123).toByte())
            AbstractTileShapeStatics.aMapSceneDefLoader_6559!!.method1393((-13).toByte())
            EnumTypeList.aCursorTypeList_3147!!.method1290(-8)
            SpriteLoadValidator.aWorldMapImageBuilder_4787!!.method695(true)
            FileExistsCondition.aModelDefinitionCache_4782!!.method1602(0)
            method3573(-15326)
            method1277(62.toByte())
            method821(-126)
            InterfaceBounds.method2375(16127)
            if (OggCacheStream.aNamedIdRecord_5271 != NpcAnimationResolver.aNamedIdRecord_165) {
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
                FacingDirectionNode.aRenderer6654!!.method3663()
                method1707(26469)
                ByteBufferStatics.method3354(-52)
                ShortKeyNode.Companion.animationFrames!!.method412((-124).toByte())
                TextureGenerator.animationSekeletons!!.method412((-119).toByte())
                DirectionUtil.config!!.method412(37.toByte())
                ClientLoadStateMachine.interfaces!!.method412((-113).toByte())
                ClientLoadStateMachine.soundEffects!!.method412((-116).toByte())
                AbstractCameraTransformStatics.maps!!.method412((-110).toByte())
                CachedRgbNoiseTexture.music!!.method412(64.toByte())
                RasterSprite.models!!.method412(120.toByte())
                CameraRotationStub.sprites!!.method412(98.toByte())
                WorldMapTextLabel.textures!!.method412(43.toByte())
                SceneTilePlaneManager.huffman!!.method412(20.toByte())
                TheoraVideoStream.jingles!!.method412(89.toByte())
                CameraNodeList.clientScripts!!.method412((-125).toByte())
                SoftwareSpriteRaster.aJs5Archive_1627!!.method412((-117).toByte())
                GroundDecorOptionState.vorbis!!.method412(29.toByte())
                HoverActionEntry.aJs5Archive_1815!!.method412(80.toByte())
                AnimationFrameState.objects!!.method412(34.toByte())
                VideoAdChecker.enums!!.method412((-116).toByte())
                FloatGrid.npcs!!.method412(28.toByte())
                ScriptOpcodeHolder.items!!.method412((-115).toByte())
                OpenGlRenderNode.animations!!.method412(22.toByte())
                BufferedRandomAccessFile.gfx!!.method412(36.toByte())
                MidiSequencePlayer.varbits!!.method412((-114).toByte())
                TerrainShadowBuilderGl2.Companion.worldMap!!.method412(36.toByte())
                ModelBatchBase.quickChat!!.method412((-114).toByte())
                ConfigArchiveLoader.quickChatMenus!!.method412((-117).toByte())
                KeyEventNode.Companion.textureMaterials!!.method412(78.toByte())
                ClientLoadStateMachine.particles!!.method412(88.toByte())
                FixedFunctionWaterPass.defaults!!.method412((-109).toByte())
                NodeDequeStatics.billboards!!.method412(112.toByte())
                Crc64Hashable.nativeLibraries!!.method412(85.toByte())
                SpriteLoadValidator.shaders!!.method412(93.toByte())
                HitsplatDefinition.aJs5Archive_2015!!.method412((-122).toByte())
                TextureMipDescriptor.aLruByteCache_4346!!.method590(0)
                MaterialTypeMarker.aLruByteCache_6517!!.method590(0)
                TerrainTileShape.aLruByteCache_8807!!.method590(0)
                SkeletalAnimFrameLoader.aLruByteCache_463!!.method590(0)
            }
        }

        @JvmStatic
        fun method2941(component: Component?, i: Int, bool: Boolean): InputTracker? {
            anInt6808++
            try {
                return MouseWheelInputTracker(component, bool) as InputTracker
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
                    val class17 = (if (widgetComponent.anInt699 != -1) ParticleEmitterNode.aAnimationTypeList_191!!.method835(widgetComponent.anInt699, 7) else null)
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
