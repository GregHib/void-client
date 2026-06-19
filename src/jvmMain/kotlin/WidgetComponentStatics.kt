import NoiseTextureNodeStatics.method3102
import VoronoiNoiseTextureNodeStatics.method3060
import kotlin.math.sqrt

object WidgetComponentStatics {
    @JvmField
            var anInt684: Int = 0
            @JvmField
            var anInt691: Int = 0
            @JvmField
            var anInt694: Int = 0
            @JvmField
            var anInt712: Int = 0
            @JvmField
            var anInt718: Int = 0
            @JvmField
            var anInt722: Int = 0
            @JvmField
            var anInt736: Int = 0
            @JvmField
            var anInt743: Int = 0
            @JvmField
            var anInt758: Int = 0
            @JvmField
            var anInt766: Int = 0
            @JvmField
            var anInt767: Int = 0
            @JvmField
            var anInt768: Int = 0
            @JvmField
            var anInt783: Int = 0
            @JvmField
            var anInt802: Int = 0
            @JvmField
            var anInt804: Int = 0
            @JvmField
            var anInt819: Int = 0
            var aByteArray821: ByteArray? = ByteArray(32896)
            @JvmField
            var anInt825: Int = 0
            @JvmField
            var anInt827: Int = 0
            @JvmField
            var anInt829: Int = 0
            @JvmField
            var anInt837: Int = 0
            @JvmField
            var aSingletonMarker_838: SingletonMarker?
    
            @JvmStatic
            fun method424(i: Int, i_0_: Int, var_renderer: Renderer?, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, `is`: Array<Array<ByteArray?>?>?, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int) {
                var i_4_ = i_4_
                var i_7_ = i_7_
                try {
                    anInt768++
                    if (i_7_ != i_1_ && i_3_ != 0) {
                        if (i_7_ == 9) {
                            i_7_ = 1
                            i_4_ = i_4_ - -1 and 0x3
                        }
                        if (i_7_ == 10) {
                            i_4_ = 3 + i_4_ and 0x3
                            i_7_ = 1
                        }
                        if (i_7_ == 11) {
                            i_4_ = i_4_ + 3 and 0x3
                            i_7_ = 8
                        }
                        var_renderer!!.Q(i_6_, i_9_, i_5_, i_8_, i_0_, i, `is`!![i_7_ - 1]!![i_4_], i_3_, i_2_)
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("at.S(" + i + ',' + i_0_ + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'))
                }
            }
    
            @JvmStatic
            fun method427(i: Int) {
                anInt837++
                RenderConfigFactoryStatics.aLocDefinitionCache_2979!!.method2033(46.toByte())
                Tooltip.aParticleDefLoader_4460!!.method1377(2)
                RadialTextureNodeStatics.aModelDefinitionLoader_9342!!.method1204(0)
                GradientLookupEffectStatics.aSeqDefinitionCache_9195!!.method2006(88)
                MapAreaDefinitionStatics.aBufferedMessageQueue_2529!!.method2080(127)
                ClientExceptionStatics.aModelHeaderCache_112!!.method1938(126)
                ParticleEmitterNodeStatics.aWidgetCache_191!!.method838(7)
                ConstantColourTextureNodeStatics.aMapElementDefinitionCache_9245!!.method2542(-101)
                RenderConfigFactoryStatics.aVarbitDefLoader_2981!!.method1443(83)
                NormalMapGeneratorStatics.aParticleAmountCache_3453!!.method1590(0)
                OpenGlModelStatics.aNpcDefinitionCache_5558!!.method1986((-91).toByte())
                ModelOrSpriteHolderStatics.aTextureDefinitionLoader_117!!.method1174((-99).toByte())
                TheoraVideoStreamStatics.aConfigDefinitionLoader_9031!!.method1222(true)
                TheoraVideoStreamStatics.aLocTypeDefLoader_9036!!.method1410(-27995)
                ProjectionCameraTransformStatics.aEmoteDefCache_5764!!.method2602(0)
                CircleHitboxStatics.aMapSceneCache_413!!.method816(false)
                HoverActionEntryStatics.aSpriteStore_1813!!.method302(-797644856)
                AbstractTileShapeStatics.aMapSceneDefLoader_6559!!.method1390(23)
                GraphicsOptionStateStatics.aItemDefinitionLoader_3147!!.method1283(1)
                SpriteLoadValidatorStatics.aWorldMapImageBuilder_4787!!.method694(-1007)
                FileExistsConditionStatics.aModelDefinitionCache_4782!!.method1598(111)
                CalendarUtil.method2638(-4631)
                NpcCountAccessor.method1328(-26162)
                method3102(22385)
                MapSceneRenderer.method386((-106).toByte())
                AudioResamplerStatics.method1271(0)
                TextureMipDescriptorStatics.aLruByteCache_4346!!.method587(-108)
                MaterialTypeMarkerStatics.aLruByteCache_6517!!.method587(-109)
                TerrainTileShapeStatics.aLruByteCache_8807!!.method587(-113)
                SkeletalAnimFrameLoaderStatics.aLruByteCache_463!!.method587(-83)
                ChatCommandProcessor.aLruByteCache_1174!!.method587(-91)
                val i_17_ = 54 / ((26 - i) / 53)
            }
    
            fun method440(i: Int, i_67_: Byte) {
                BlankTextureNodeStatics.anIntArray9259 = IntArray(i)
                if (i_67_.toInt() == -61) {
                    ConnectionStateTypeStatics.anIntArray1045 = IntArray(i)
                    LinkedListIteratorStatics.anIntArray2117 = IntArray(i)
                    anInt825++
                    AbstractModelStatics.anIntArray1127 = IntArray(i)
                    FileIoUtil.anIntArray4097 = IntArray(i)
                }
            }
    
            @JvmStatic
            fun method442(i: Byte) {
                if (i <= -8) {
                    aSingletonMarker_838 = null
                    aByteArray821 = null
                }
            }
    
            init {
                var i = 0
                for (i_69_ in 0..255) {
                    var i_70_ = 0
                    while (i_69_ >= i_70_) {
                        aByteArray821!![i++] = (255.0 / sqrt((((i_69_ * i_69_) + (i_70_ * i_70_) - -65535).toFloat() / 65535.0f).toDouble())).toInt().toByte()
                        i_70_++
                    }
                }
                aSingletonMarker_838 = SingletonMarker()
            }
}
