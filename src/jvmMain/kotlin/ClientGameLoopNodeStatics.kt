import NpcSummaryDefinitionStatics.method1166
import Gl2dTextureStatics.method241
import SizeBoundedSoftCacheStatics.method1343
import TextureGeneratorStatics.method1397
import FrameBufferObjectStatics.method1501
import BinaryGraphicsOptionStateStatics.method1767
import LightDetailOptionStateStatics.method1802
import ConfigFlagUtilStatics.method1916
import NpcDefinitionCacheStatics.method1987
import CompassSmootherStatics.method2017
import SocketFactoryStatics.method2049
import MaterialPassStatics.method2138
import WaterMaterialPassStatics.method2148
import SkyboxGradient.method2334
import SceneObjectEntityStatics.method2405
import FontStatics.method2570
import SkeletalAnimFrameLoaderStatics.method349
import DragDropControllerStatics.method2708
import HslAdjustTextureNodeStatics.method3127
import ClampTextureNodeStatics.method3150
import WidgetTextConfigStatics.method362
import SolidFillComponentStatics.method198
import GameClock.method599
import Direct3dModelStatics.method661
import ChatCommandProcessor.method705
import LinkedListNodeStatics.anInt4292
import java.io.File
import java.io.IOException
import java.util.*

object ClientGameLoopNodeStatics {
    var anInt6871: Int = 0
            var anInt6873: Int = 0
            var anInt6874: Int = 0
            var aString6876: String?
            var aString6877: String?
            @JvmField
            var anIntArray6878: IntArray? = null
    
            @JvmStatic
            fun method2991(i: Int) {
                if (RegionSceneLoader.anInt3699 > 1) {
                    TurbulenceTextureNodeStatics.anInt9313 = ResourceLoaderThreadStatics.anInt3918
                    RegionSceneLoader.anInt3699--
                }
                anInt6874++
                if (AbstractMenuEntryStatics.aBoolean1712) {
                    AbstractMenuEntryStatics.aBoolean1712 = false
                    method2049(67)
                } else {
                    if (!ScrollbarComponentStatics.aBoolean8335) method661(95.toByte())
                    for (i_0_ in 0..99) {
                        if (!MapArchiveSourceStatics.method2203((-52).toByte())) break
                    }
                    if (WorldMapRendererStatics.anInt4674 == 10) {
                        while (method2138(i xor 0x2ca2)) {
                            val class348_sub47 = method2148(ScreenBorderFiller.aFontMetaRef_1961, (TheoraVideoStreamStatics.aIsaacCipher_9029), -92)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                            val i_1_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                            AnimationFrameDefinitionStatics.method3025(121.toByte(), (class348_sub47.aClass348_Sub49_Sub2_7116!!))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(113, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197) + -i_1_)
                            InterfaceComponentGroupStatics.method3243(119, class348_sub47)
                        }
                        if (LightingOptionStateStatics.aClass348_Sub26_5881 != null) {
                            if ((LightingOptionStateStatics.aClass348_Sub26_5881!!.anInt6887) != -1) {
                                val class348_sub47 = method2148((GlCubemapLightPassStatics.aFontMetaRef_7318), (TheoraVideoStreamStatics.aIsaacCipher_9029), -81)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), LightingOptionStateStatics.aClass348_Sub26_5881!!.anInt6887)
                                InterfaceComponentGroupStatics.method3243(122, class348_sub47)
                                LightingOptionStateStatics.aClass348_Sub26_5881 = null
                                FloatCameraTransformStatics.aLong5745 = method599(-106) + 30000L
                            }
                        } else if (FloatCameraTransformStatics.aLong5745 <= method599(-121)) LightingOptionStateStatics.aClass348_Sub26_5881 = SceneObjectSpawnerStatics.aHostPingThread_1286!!.method1302(-5255, (CacheStateResetter.aServerConnectionInfo_125!!.aString2147!!))
                        val class348_sub45 = (GroundDecorEntityStatics.aNodeDeque_8744!!.method1995(4) as TimedRecordAccessor?)
                        if (class348_sub45 != null || (CompiledScriptCacheStatics.aLong4367 < -2000L + method599(-97))) {
                            var class348_sub47: OutgoingPacketNode? = null
                            var i_2_ = 0
                            var class348_sub45_3_ = (NativeRenderNodeStatics.aNodeDeque_10479!!.method1995(4) as TimedRecordAccessor?)
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
                                if (OpenGlTerrainTileStatics.anInt8270 != i_5_ || i_4_ != ImageFrameCacheStatics.anInt4032) {
                                    if (class348_sub47 == null) {
                                        CollisionMapStatics.anInt4450++
                                        class348_sub47 = (method2148(CharCodeMapStatics.aFontMetaRef_9590, TheoraVideoStreamStatics.aIsaacCipher_9029, -94))
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                                        i_2_ = class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197
                                    }
                                    var i_6_ = -OpenGlTerrainTileStatics.anInt8270 + i_5_
                                    OpenGlTerrainTileStatics.anInt8270 = i_5_
                                    var i_7_ = i_4_ - ImageFrameCacheStatics.anInt4032
                                    ImageFrameCacheStatics.anInt4032 = i_4_
                                    val i_8_ = ((class348_sub45_3_.method3312((-107).toByte()) + -CompiledScriptCacheStatics.aLong4367) / 20L).toInt()
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
                                    CompiledScriptCacheStatics.aLong4367 = class348_sub45_3_.method3312((-109).toByte())
                                }
                                class348_sub45_3_ = NativeRenderNodeStatics.aNodeDeque_10479!!.method1990(79.toByte()) as TimedRecordAccessor?
                            }
                            if (class348_sub47 != null) {
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(105, class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197 + -i_2_)
                                InterfaceComponentGroupStatics.method3243(23, class348_sub47)
                            }
                        }
                        if (class348_sub45 != null) {
                            var l = ((class348_sub45.method3312((-110).toByte()) + -GlTextureBaseStatics.aLong5089) / 50L)
                            GlTextureBaseStatics.aLong5089 = class348_sub45.method3312((-87).toByte())
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
                            ParticleEmitterNodeStatics.anInt182++
                            val class348_sub47 = method2148(ProjectileConfigUtil.aFontMetaRef_395, (TheoraVideoStreamStatics.aIsaacCipher_9029), i + -11525)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_12_ or (i_11_ shl 15))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(121.toByte(), i_9_ shl 16 or i_10_)
                            InterfaceComponentGroupStatics.method3243(25, class348_sub47)
                        }
                        if (CameraConfigDefinitionStatics.anInt3246 > 0) {
                            ColourKeyTextureNodeStatics.anInt9348++
                            val class348_sub47 = method2148((ShaderStateVariant.aFontMetaRef_8798), (TheoraVideoStreamStatics.aIsaacCipher_9029), -111)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 3 * CameraConfigDefinitionStatics.anInt3246)
                            var i_13_ = 0
                            while ((i_13_ < CameraConfigDefinitionStatics.anInt3246)) {
                                val interface6 = CacheLruCacheStatics.anCharStreamReaderArray3884s!![i_13_]
                                var l = ((interface6!!.method29((-29).toByte()) + -RegionTileNodeStatics.aLong6651) / 50L)
                                RegionTileNodeStatics.aLong6651 = interface6.method29(106.toByte())
                                if (l > 65535L) l = 65535L
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, interface6.method30(false))
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), l.toInt())
                                i_13_++
                            }
                            InterfaceComponentGroupStatics.method3243(-49, class348_sub47)
                        }
                        if (HintArrowOrMessageStatics.anInt2035 > 0) HintArrowOrMessageStatics.anInt2035--
                        if (WorldMapPolygonIconLabelStatics.aBoolean10174 && HintArrowOrMessageStatics.anInt2035 <= 0) {
                            LightDetailOptionStateStatics.anInt6033++
                            WorldMapPolygonIconLabelStatics.aBoolean10174 = false
                            HintArrowOrMessageStatics.anInt2035 = 20
                            val class348_sub47 = method2148(ClanChatRequestSender.aFontMetaRef_3648, (TheoraVideoStreamStatics.aIsaacCipher_9029), i + -11549)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShortAddLittle(i xor 0x3c4d, ResourceProviderStatics.aFloat3938.toInt() shr 3)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), SceneObjectSpawnerStatics.aFloat1287.toInt() shr 3)
                            InterfaceComponentGroupStatics.method3243(-31, class348_sub47)
                        }
                        if (DragDropControllerStatics.aBoolean4278 != SizeBoundedSoftCacheStatics.aBoolean2329) {
                            NormalMapGeneratorStatics.anInt3460++
                            DragDropControllerStatics.aBoolean4278 = SizeBoundedSoftCacheStatics.aBoolean2329
                            val class348_sub47 = method2148((InputStream_Sub1Statics.aFontMetaRef_77), (TheoraVideoStreamStatics.aIsaacCipher_9029), i xor 0x2cc8.inv())
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, if (!SizeBoundedSoftCacheStatics.aBoolean2329) 0 else 1)
                            InterfaceComponentGroupStatics.method3243(i + -11501, class348_sub47)
                        }
                        if (!RenderNodeStatics.aBoolean9719) {
                            GameClock.anInt1110++
                            val class348_sub47 = method2148((FloatBufferStatics.aFontMetaRef_9743), (TheoraVideoStreamStatics.aIsaacCipher_9029), -113)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, 0)
                            val i_14_ = (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197)
                            val class348_sub49 = IntHashSetStatics.aClass348_Sub51_3959!!.method3427(i xor 0x2cb0)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeBytes(class348_sub49.anInt7197, 0, class348_sub49.aByteArray7154!!, 82)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.method3339(96, (class348_sub47.aClass348_Sub49_Sub2_7116!!.anInt7197) + -i_14_)
                            InterfaceComponentGroupStatics.method3243(i + -11473, class348_sub47)
                            RenderNodeStatics.aBoolean9719 = true
                        }
                        if (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029 != null) {
                            if (WeaveTextureNodeStatics.anInt9282 == 2) method241(127.toByte())
                            else if (WeaveTextureNodeStatics.anInt9282 == 3) CameraSplineNodeStatics.method2954((-4).toByte())
                        }
                        if (!KeyboardLayoutConfigStatics.aBoolean2130) CircleDrawer.aFloat2687 /= 2.0f
                        else KeyboardLayoutConfigStatics.aBoolean2130 = false
                        if (!MinimapSquareDrawerStatics.aBoolean5224) MultiFieldRecordStatics.aFloat6898 /= 2.0f
                        else MinimapSquareDrawerStatics.aBoolean5224 = false
                        IntKeyNodeStatics.method3027(33.toByte())
                        if (WorldMapRendererStatics.anInt4674 == 10) {
                            LoadingScreenImageNodeStatics.method3175(55.toByte())
                            method362(i + -11335)
                            method1501(-123)
                            StringCacheNodeStatics.anInt7213++
                            if (StringCacheNodeStatics.anInt7213 > 750) method2049(83)
                            else {
                                method349(i + -6692)
                                method3150(true)
                                method1397(0)
                                var i_15_ = ProjectedGroundDecorStatics.aVarpStore_10209!!.method1305((-126).toByte(), true)
                                while (i_15_ != -1) {
                                    method1767(true, i_15_)
                                    FileIoUtil.anIntArray4096!![method1166(31, TypedRecordTableStatics.anInt3695++)] = i_15_
                                    i_15_ = ProjectedGroundDecorStatics.aVarpStore_10209!!.method1305((-128).toByte(), false)
                                }
                                var class348_sub42_sub15 = method3127(2681)
                                while (class348_sub42_sub15 != null) {
                                    val i_16_ = class348_sub42_sub15.method3245(true)
                                    val i_17_ = class348_sub42_sub15.method3248(1)
                                    if (i_16_ == 1) {
                                        IsaacCipherStatics.anIntArray1303!![i_17_] = class348_sub42_sub15.anInt9652
                                        ScanlineRasterFillerStatics.aBoolean2469 = ScanlineRasterFillerStatics.aBoolean2469 or GlslEnvMaterialPassStatics.aBooleanArray6270!![i_17_]
                                        NamedIdEntryStatics.anIntArray6890!![method1166(31, ScrollbarComponentStatics.anInt8352++)] = i_17_
                                    } else if (i_16_ == 2) {
                                        GlTextureCubeMapStatics.aStringArray8532!![i_17_] = class348_sub42_sub15.aString9654
                                        RemoveRoofsOptionStateStatics.anIntArray6061!![method1166(HslAdjustTextureNodeStatics.anInt9385++, 31)] = i_17_
                                    } else if (i_16_ == 3) {
                                        val class46 = method2570(1512932720, i_17_)
                                        if (class348_sub42_sub15.aString9654 != class46!!.aString792) {
                                            class46.aString792 = class348_sub42_sub15.aString9654
                                            ConfigFlagUtilStatics.method1916(-9343, class46)
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
                                            ConfigFlagUtilStatics.method1916(-9343, class46)
                                        }
                                    } else if (i_16_ == 5) {
                                        val class46 = method2570(i xor 0x5a2da9d8, i_17_)
                                        if ((class46!!.anInt699 != class348_sub42_sub15.anInt9652) || (class348_sub42_sub15.anInt9652 == -1)) {
                                            class46.anInt699 = class348_sub42_sub15.anInt9652
                                            class46.anInt795 = 0
                                            class46.anInt841 = 0
                                            class46.anInt730 = 1
                                            val class17 = (if (class46.anInt699 == -1) null else (ParticleEmitterNodeStatics.aWidgetCache_191!!.method835((class46.anInt699), 7)))
                                            if (class17 != null) method2017((class46.anInt795), class17, 30)
                                            ConfigFlagUtilStatics.method1916(-9343, class46)
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
                                            ConfigFlagUtilStatics.method1916(-9343, class46)
                                        }
                                    } else if (i_16_ == 7) {
                                        val class46 = method2570(1512932720, i_17_)
                                        val bool = (class348_sub42_sub15.anInt9652 == 1)
                                        if (!class46!!.aBoolean813 == bool) {
                                            class46.aBoolean813 = bool
                                            ConfigFlagUtilStatics.method1916(-9343, class46)
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
                                            ConfigFlagUtilStatics.method1916(-9343, class46)
                                        }
                                    } else if (i_16_ == 9) {
                                        val class46 = method2570(1512932720, i_17_)
                                        if ((class348_sub42_sub15.anInt9652 != class46!!.anInt812) || (class348_sub42_sub15.anInt9651 != class46.anInt781)) {
                                            class46.anInt781 = class348_sub42_sub15.anInt9651
                                            class46.anInt812 = class348_sub42_sub15.anInt9652
                                            ConfigFlagUtilStatics.method1916(-9343, class46)
                                        }
                                    } else if (i_16_ == 10) {
                                        val class46 = method2570(1512932720, i_17_)
                                        if ((class46!!.anInt808 != (class348_sub42_sub15.anInt9652)) || ((class46.anInt786) != (class348_sub42_sub15.anInt9651)) || ((class348_sub42_sub15.anInt9650) != class46.anInt717)) {
                                            class46.anInt786 = (class348_sub42_sub15.anInt9651)
                                            class46.anInt808 = (class348_sub42_sub15.anInt9652)
                                            class46.anInt717 = (class348_sub42_sub15.anInt9650)
                                            ConfigFlagUtilStatics.method1916(-9343, class46)
                                        }
                                    } else if (i_16_ == 11) {
                                        val class46 = (method2570(1512932720, i_17_))
                                        class46!!.aByte817 = 0.toByte()
                                        class46.anInt739 = (class348_sub42_sub15.anInt9651)
                                        class46.anInt750 = class46.anInt739
                                        class46.aByte681 = 0.toByte()
                                        class46.anInt788 = (class348_sub42_sub15.anInt9652)
                                        class46.anInt800 = class46.anInt788
                                        ConfigFlagUtilStatics.method1916(-9343, class46)
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
                                        TerrainChunkBuilderStatics.anInt1548 = (class348_sub42_sub15.anInt9651)
                                        MediaStreamClientStatics.anInt3203 = (class348_sub42_sub15.anInt9652)
                                        ModelKeyBuilderStatics.aBoolean6759 = true
                                    } else if (i_16_ == 16) {
                                        val class46 = (method2570(1512932720, i_17_))
                                        class46!!.anInt702 = (class348_sub42_sub15.anInt9652)
                                    } else if (i_16_ == 17) {
                                        val class46 = (method2570(1512932720, i_17_))
                                        class46!!.anInt806 = (class348_sub42_sub15.anInt9652)
                                    }
                                    class348_sub42_sub15 = method3127(2681)
                                }
                                DisplaySettingsConfigStatics.anInt7267++
                                if (FogOptionStateStatics.anInt6048 != 0) {
                                    anInt4292 += 20
                                    if (anInt4292 >= 400) FogOptionStateStatics.anInt6048 = 0
                                }
                                if (ResourceLoaderThreadStatics.aWidgetComponent_3913 != null) {
                                    GroundItemRenderState.anInt1656++
                                    if (GroundItemRenderState.anInt1656 >= 15) {
                                        ConfigFlagUtilStatics.method1916(-9343, ResourceLoaderThreadStatics.aWidgetComponent_3913!!)
                                        ResourceLoaderThreadStatics.aWidgetComponent_3913 = null
                                    }
                                }
                                MapElementDecorStatics.aWidgetComponent_10336 = null
                                MinimapSquareDrawerStatics.aBoolean5221 = false
                                HeapDiagnosticsHolder.aWidgetComponent_2249 = null
                                ScrollingWidgetComponentNodeStatics.aBoolean8386 = false
                                method198(null, false, -1, -1)
                                method1343(-1, null, 1, -1)
                                if (!RenderNodeStatics.aBoolean9722) Tooltip.anInt4458 = -1
                                FloatGridStatics.method1583((-73).toByte())
                                ResourceLoaderThreadStatics.anInt3918++
                                if (WorldMapSceneStatics.aBoolean3103) {
                                    NodeDequeHolderStatics.anInt1568++
                                    val class348_sub47 = method2148((OpenGlRendererStatics.aFontMetaRef_7715), (TheoraVideoStreamStatics.aIsaacCipher_9029), i + -11525)
                                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(117.toByte(), (InputStream_Sub2Statics.anInt85 shl 14 or (ColourKeyTextureNodeStatics.anInt9349 shl 28) or NpcTypeStatics.anInt1404))
                                    InterfaceComponentGroupStatics.method3243(30, class348_sub47)
                                    WorldMapSceneStatics.aBoolean3103 = false
                                }
                                while (true) {
                                    val class348_sub36 = (BufferedOutputStreamWorkerStatics.aNodeDeque_2707!!.method1997(8) as? WidgetActionEntry?)
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
                                    val class348_sub36 = (FriendChatMemberStatics.aNodeDeque_4473!!.method1997(8) as? WidgetActionEntry?)
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
                                    val class348_sub36 = (HashTileShapeStatics.aNodeDeque_8810!!.method1997(i + -11424) as? WidgetActionEntry?)
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
                                if (AsyncTaskHandleStatics.anInt2581 > 0 && LoadProgressCountersStatics.aKeyboardInputSource_2449!!.method2696(82, i xor 0x2cd5.inv()) && LoadProgressCountersStatics.aKeyboardInputSource_2449!!.method2696(81, -121) && NodeDequeHolderStatics.anInt1565 != 0) {
                                    var i_30_ = ((LocalPlayerState.aPlayer_1907!!.plane) - NodeDequeHolderStatics.anInt1565)
                                    if (i_30_ >= 0) {
                                        if (i_30_ > 3) i_30_ = 3
                                    } else i_30_ = 0
                                    CollisionMapStatics.method3502((LocalPlayerState.aPlayer_1907!!.anIntArray10317!![0]) + RegionMapDecoder.regionTileY, i xor 0x2caa, i_30_, (LocalPlayerState.aPlayer_1907!!.anIntArray10320!![0]) + ArbVertexProgramStatics.regionTileX)
                                }
                                method1987(-120)
                                var i_31_ = 0
                                if (i == 11432) {
                                    while ( /**/i_31_ < 5) {
                                        GroundDecorSceneEntityStatics.anIntArray9981!![i_31_] = GroundDecorSceneEntityStatics.anIntArray9981!![i_31_] + 1
                                        i_31_++
                                    }
                                    if (ScanlineRasterFillerStatics.aBoolean2469 && (-60000L + method599(-84) > SkeletalAnimFrameLoaderStatics.aLong482)) method2405(i + -11313)
                                    var class318_sub9_sub1 = (InterfaceComponentGroupStatics.aDoublyLinkedNodeList_9642!!.method1872(i + -11424) as? NamedTimedNode?)
                                    while (class318_sub9_sub1 != null) {
                                        if ((method599(i xor 0x2ce9.inv()) / 1000L + -5L) > class318_sub9_sub1.anInt8787.toLong()) {
                                            if (class318_sub9_sub1.aShort8786 > 0) FixedFunctionMaterialPassStatics.method2144("", 5, (-128).toByte(), 0, (class318_sub9_sub1.aString8783 + (LocalizedTextStatics.aLocalizedText_3502!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544))), "", "")
                                            if (class318_sub9_sub1.aShort8786.toInt() == 0) FixedFunctionMaterialPassStatics.method2144("", 5, (-105).toByte(), 0, (class318_sub9_sub1.aString8783 + (LocalizedTextStatics.aLocalizedText_3503!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544))), "", "")
                                            class318_sub9_sub1.method2373(false)
                                        }
                                        class318_sub9_sub1 = (InterfaceComponentGroupStatics.aDoublyLinkedNodeList_9642!!.method1878((-105).toByte()) as? NamedTimedNode?)
                                    }
                                    ItemNameResolverStatics.anInt4999++
                                    if (ItemNameResolverStatics.anInt4999 > 500) {
                                        ItemNameResolverStatics.anInt4999 = 0
                                        val i_32_ = (8.0 * Math.random()).toInt()
                                        if ((0x4 and i_32_) == 4) RenderableGroupStatics.anInt5016 += ProjectileDefinition.anInt3844
                                        if ((i_32_ and 0x1) == 1) ConnectionStateRefs.anInt319 += WallEntityStatics.anInt8775
                                        if ((0x2 and i_32_) == 2) WalkingTypeUtil.anInt3310 += ByteStoreStatics.anInt4263
                                    }
                                    if (ConnectionStateRefs.anInt319 < -50) WallEntityStatics.anInt8775 = 2
                                    if (ConnectionStateRefs.anInt319 > 50) WallEntityStatics.anInt8775 = -2
                                    if (WalkingTypeUtil.anInt3310 < -55) ByteStoreStatics.anInt4263 = 2
                                    if (RenderableGroupStatics.anInt5016 < -40) ProjectileDefinition.anInt3844 = 1
                                    if (WalkingTypeUtil.anInt3310 > 55) ByteStoreStatics.anInt4263 = -2
                                    GlBufferObjectStatics.anInt4753++
                                    if (RenderableGroupStatics.anInt5016 > 40) ProjectileDefinition.anInt3844 = -1
                                    if (GlBufferObjectStatics.anInt4753 > 500) {
                                        GlBufferObjectStatics.anInt4753 = 0
                                        val i_33_ = (Math.random() * 8.0).toInt()
                                        if ((i_33_ and 0x2) == 2) FloatBufferStatics.anInt9750 += InterfaceComponentGroupStatics.anInt9645
                                        if ((i_33_ and 0x1) == 1) OpenGlRenderNodeStatics.anInt10483 += HardKeyedCacheEntryReferenceStatics.anInt10443
                                    }
                                    if (OpenGlRenderNodeStatics.anInt10483 < -60) HardKeyedCacheEntryReferenceStatics.anInt10443 = 2
                                    if (FloatBufferStatics.anInt9750 < -20) InterfaceComponentGroupStatics.anInt9645 = 1
                                    if (OpenGlRenderNodeStatics.anInt10483 > 60) HardKeyedCacheEntryReferenceStatics.anInt10443 = -2
                                    if (FloatBufferStatics.anInt9750 > 10) InterfaceComponentGroupStatics.anInt9645 = -1
                                    SceneRegionState.anInt193++
                                    if (SceneRegionState.anInt193 > 50) {
                                        IOException_Sub1Statics.anInt88++
                                        val class348_sub47 = (method2148(RangedGraphicsOptionStateStatics.aFontMetaRef_5938, TheoraVideoStreamStatics.aIsaacCipher_9029, -125))
                                        InterfaceComponentGroupStatics.method3243(i xor 0x2cc0.inv(), class348_sub47)
                                    }
                                    if (MultiLevelOptionStateStatics.aBoolean6147) {
                                        method2334(0)
                                        MultiLevelOptionStateStatics.aBoolean6147 = false
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
    
            fun method2992(string: String?, i: Byte): ByteArray {
                try {
                    anInt6873++
                    val i_34_ = string!!.length
                    val `is` = ByteArray(i_34_)
                    if (i.toInt() != -20) method2991(-54)
                    for (i_35_ in 0..<i_34_) {
                        val i_36_ = string.get(i_35_).code
                        if (i_36_ > 0 && i_36_ < 128 || i_36_ >= 160 && i_36_ <= 255) `is`[i_35_] = i_36_.toByte()
                        else if (i_36_ != 8364) {
                            if (i_36_ != 8218) {
                                if (i_36_ != 402) {
                                    if (i_36_ == 8222) `is`[i_35_] = (-124).toByte()
                                    else if (i_36_ == 8230) `is`[i_35_] = (-123).toByte()
                                    else if (i_36_ != 8224) {
                                        if (i_36_ != 8225) {
                                            if (i_36_ == 710) `is`[i_35_] = (-120).toByte()
                                            else if (i_36_ == 8240) `is`[i_35_] = (-119).toByte()
                                            else if (i_36_ == 352) `is`[i_35_] = (-118).toByte()
                                            else if (i_36_ != 8249) {
                                                if (i_36_ != 338) {
                                                    if (i_36_ != 381) {
                                                        if (i_36_ == 8216) `is`[i_35_] = (-111).toByte()
                                                        else if (i_36_ == 8217) `is`[i_35_] = (-110).toByte()
                                                        else if (i_36_ != 8220) {
                                                            if (i_36_ != 8221) {
                                                                if (i_36_ == 8226) `is`[i_35_] = (-107).toByte()
                                                                else if (i_36_ == 8211) `is`[i_35_] = (-106).toByte()
                                                                else if (i_36_ != 8212) {
                                                                    if (i_36_ != 732) {
                                                                        if (i_36_ != 8482) {
                                                                            if (i_36_ == 353) `is`[i_35_] = (-102).toByte()
                                                                            else if (i_36_ == 8250) `is`[i_35_] = (-101).toByte()
                                                                            else if (i_36_ != 339) {
                                                                                if (i_36_ == 382) `is`[i_35_] = (-98).toByte()
                                                                                else if (i_36_ != 376) `is`[i_35_] = 63.toByte()
                                                                                else `is`[i_35_] = (-97).toByte()
                                                                            } else `is`[i_35_] = (-100).toByte()
                                                                        } else `is`[i_35_] = (-103).toByte()
                                                                    } else `is`[i_35_] = (-104).toByte()
                                                                } else `is`[i_35_] = (-105).toByte()
                                                            } else `is`[i_35_] = (-108).toByte()
                                                        } else `is`[i_35_] = (-109).toByte()
                                                    } else `is`[i_35_] = (-114).toByte()
                                                } else `is`[i_35_] = (-116).toByte()
                                            } else `is`[i_35_] = (-117).toByte()
                                        } else `is`[i_35_] = (-121).toByte()
                                    } else `is`[i_35_] = (-122).toByte()
                                } else `is`[i_35_] = (-125).toByte()
                            } else `is`[i_35_] = (-126).toByte()
                        } else `is`[i_35_] = (-128).toByte()
                    }
                    return `is`
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("ls.B(" + (if (string != null) "{...}" else "null") + ',' + i + ')'))
                }
            }
    
            @JvmStatic
            fun method2993(i: Byte) {
                anIntArray6878 = null
                aString6876 = null
                aString6877 = null
                val i_37_ = 31 % ((3 - i) / 37)
            }
    
            fun method2994(i: Int) {
                anInt6871++
                if (i == 2) LoadingScreenStateStatics.aRenderableEntryArray2636 = null
            }
    
            init {
                var string = "Unknown"
                try {
                    string = System.getProperty("java.vendor").lowercase(Locale.getDefault())
                } catch (exception: Exception) {
                    /* empty */
                }
                string.lowercase(Locale.getDefault())
                string = "Unknown"
                try {
                    string = System.getProperty("java.version").lowercase(Locale.getDefault())
                } catch (exception: Exception) {
                    /* empty */
                }
                string.lowercase(Locale.getDefault())
                string = "Unknown"
                try {
                    string = System.getProperty("os.name").lowercase(Locale.getDefault())
                } catch (exception: Exception) {
                    /* empty */
                }
                aString6877 = string.lowercase(Locale.getDefault())
                string = "Unknown"
                try {
                    string = System.getProperty("os.arch").lowercase(Locale.getDefault())
                } catch (exception: Exception) {
                    /* empty */
                }
                aString6876 = string.lowercase(Locale.getDefault())
                string = "Unknown"
                try {
                    string = System.getProperty("os.version").lowercase(Locale.getDefault())
                } catch (exception: Exception) {
                    /* empty */
                }
                string.lowercase(Locale.getDefault())
                string = "~/"
                try {
                    string = System.getProperty("user.home").lowercase(Locale.getDefault())
                } catch (exception: Exception) {
                    /* empty */
                }
                File(string)
            }
}
