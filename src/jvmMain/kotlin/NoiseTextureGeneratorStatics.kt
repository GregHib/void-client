import java.io.File
import java.util.*
import kotlin.math.atan2
import kotlin.math.pow

object NoiseTextureGeneratorStatics {
    @JvmField
            var aIntRange_1068: IntRange? = IntRange(35, 0)
            @JvmField
            var anInt1070: Int = 0
            @JvmField
            var anInt1072: Int = 0
            @JvmField
            var anInt1073: Int = 0
            @JvmField
            var anInt1075: Int = 0
            @JvmField
            var anInt1076: Int = 0
            @JvmField
            var anInt1077: Int = 0
            @JvmField
            var anInt1080: Int = 0
            @JvmField
            var aDouble1083: Double = 0.0
    
            @JvmStatic
            fun method544(string: String?, bool: Boolean, i: Int) {
                anInt1075++
                FixedFunctionMaterialPassStatics.method2144("", i, (-96).toByte(), 0, string, "", "")
                if (bool != false) method547(null, -103)
            }
    
            @JvmStatic
            fun method545(i: Int, i_49_: Int) {
                FontMetaRefStatics.aLruByteCache_4327!!.method578(2, i)
                anInt1077++
                ParticleGeometryStatics.aLruByteCache_4417!!.method578(2, i)
                if (i_49_ != -1) aIntRange_1068 = null
                SceneryDetailOptionStateStatics.aLruByteCache_6096!!.method578(2, i)
                EdgeDetectTextureNodeStatics.aLruByteCache_9171!!.method578(i_49_ xor 0x2.inv(), i)
            }
    
            @JvmStatic
            fun method547(string: String?, i: Int): Int {
                anInt1076++
                if (!GrayscaleNoiseTextureStatics.aPrivilegedOperationWorker_5297!!.aBoolean3777) return -1
                if (CollisionMapAccessor.aHashtable3548!!.containsKey(string)) return 100
                val string_52_ = CameraOrModelTransformStatics.method2651(string, 3)
                if (string_52_ == null) return -1
                val string_53_ = RegionSceneShifterStatics.aString7048 + string_52_
                if (!ParticleSystemStateStatics.aJs5Archive_2208!!.method422("", string_53_, -88)) return -1
                if (!ParticleSystemStateStatics.aJs5Archive_2208!!.method413(i xor 0x1d48, string_53_)) return ParticleSystemStateStatics.aJs5Archive_2208!!.method397(string_53_, 0)
                val `is` = ParticleSystemStateStatics.aJs5Archive_2208!!.method391(string_53_, "", -29832)
                val `object`: Any? = null
                val file: File?
                try {
                    file = FileStoreLocator.method1466(i + -7470, string_52_)
                } catch (runtimeexception: RuntimeException) {
                    if (LoaderStatics.trace) {
                        runtimeexception.printStackTrace()
                    }
                    return -1
                }
                if (`is` != null && file != null) {
                    var bool = true
                    val is_54_ = SceneryDetailOptionStateStatics.method1821(i xor 0x1d5b, file)
                    if (is_54_ == null || is_54_.size != `is`.size) bool = false
                    else {
                        for (i_55_ in is_54_.indices) {
                            if (is_54_[i_55_] != `is`[i_55_]) {
                                bool = false
                                break
                            }
                        }
                    }
                    try {
                        if (!bool) GrayscaleNoiseTextureStatics.aPrivilegedOperationWorker_5297!!.method2242(`is`, (-104).toByte(), file)
                    } catch (throwable: Throwable) {
                        if (LoaderStatics.trace) {
                            throwable.printStackTrace()
                        }
                        return -1
                    }
                    ItemDefinitionLoaderStatics.method1286(file, 64, string)
                    return 100
                }
                return -1
            }
    
            @JvmStatic
            fun method548(i: Int) {
                aIntRange_1068 = null
                if (i != 10) aIntRange_1068 = null
            }
    
            @JvmStatic
            fun method549(i: Byte, class348_sub21: CameraSplineNode?, var_renderer: Renderer, structConfig: StructConfig?) {
                try {
                    anInt1080++
                    val class105 = structConfig!!.method375(var_renderer, false)
                    if (class105 != null) {
                        var i_56_ = class105.method971()
                        if (i_56_ < class105.method969()) i_56_ = class105.method969()
                        val i_57_ = 10
                        var i_58_ = class348_sub21!!.anInt6853
                        var i_59_ = class348_sub21.anInt6855
                        var i_60_ = 0
                        var i_61_ = 0
                        var i_62_ = 0
                        if (structConfig.aString597 != null) {
                            i_60_ = (GlTexture3DStatics.aFontDefinition_8527!!.method1188(structConfig.aString597, null, NativeRendererStatics.aStringArray8019, 87.toByte(), null))
                            var i_63_ = 0
                            while (i_60_ > i_63_) {
                                var string = NativeRendererStatics.aStringArray8019!![i_63_]!!
                                if (i_60_ + -1 > i_63_) string = string.substring(0, string.length - 4)
                                val i_64_ = GlShaderObjectHandleStatics.aSystemFontGlyphs_521!!.method2564(string)
                                if (i_61_ < i_64_) i_61_ = i_64_
                                i_63_++
                            }
                            i_62_ = (i_60_ * GlShaderObjectHandleStatics.aSystemFontGlyphs_521!!.method2565() - -(GlShaderObjectHandleStatics.aSystemFontGlyphs_521!!.method2560() / 2))
                        }
                        var i_65_ = i_56_ / 2 + class348_sub21.anInt6853
                        var i_66_ = class348_sub21.anInt6855
                        if (MapRegionLoaderStatics.anInt1272 - -i_56_ <= i_58_) {
                            if (i_58_ > -i_56_ + MapRegionLoaderStatics.anInt1276) {
                                i_58_ = -i_56_ + MapRegionLoaderStatics.anInt1276
                                i_65_ = (-(i_56_ / 2) + MapRegionLoaderStatics.anInt1276 + (-i_57_ + -(i_61_ / 2) - 5))
                            }
                        } else {
                            i_58_ = MapRegionLoaderStatics.anInt1272
                            i_65_ = i_61_ / 2 + i_57_ + i_56_ / 2 + (MapRegionLoaderStatics.anInt1272 + 5)
                        }
                        if (i_59_ < i_56_ + MapRegionLoaderStatics.anInt1262) {
                            i_59_ = MapRegionLoaderStatics.anInt1262
                            i_66_ = i_56_ / 2 + i_57_ + MapRegionLoaderStatics.anInt1262
                        } else if (i_59_ > MapRegionLoaderStatics.anInt1268 + -i_56_) {
                            i_59_ = -i_56_ + MapRegionLoaderStatics.anInt1268
                            i_66_ = -(i_56_ / 2) + MapRegionLoaderStatics.anInt1268 - (i_57_ - -i_62_)
                        }
                        val i_67_ = (32767.0 * (atan2((i_58_ - (class348_sub21.anInt6853)).toDouble(), (-(class348_sub21.anInt6855) + i_59_).toDouble()) / 3.141592653589793)).toInt() and 0xffff
                        class105.method981(i_56_.toFloat() / 2.0f + i_58_.toFloat(), i_56_.toFloat() / 2.0f + i_59_.toFloat(), 4096, i_67_)
                        var i_68_ = -2
                        var i_69_ = -2
                        var i_70_ = -2
                        if (i.toInt() != -43) method545(-91, -16)
                        var i_71_ = -2
                        if (structConfig.aString597 != null) {
                            i_69_ = i_66_
                            i_68_ = i_65_ + -(i_61_ / 2) - 5
                            i_71_ = 3 + (i_60_ * GlShaderObjectHandleStatics.aSystemFontGlyphs_521!!.method2565() + i_69_)
                            i_70_ = i_61_ + (i_68_ + 10)
                            if (structConfig.anInt602 != 0) var_renderer!!.method3675(-i_68_ + i_70_, (-125).toByte(), i_68_, i_69_, i_71_ - i_69_, structConfig.anInt602)
                            if (structConfig.anInt604 != 0) var_renderer!!.method3668(-i_68_ + i_70_, i_69_, structConfig.anInt604, i_68_, -i_69_ + i_71_, 67)
                            var i_72_ = 0
                            while (i_60_ > i_72_) {
                                var string = NativeRendererStatics.aStringArray8019!![i_72_]!!
                                if (i_72_ < i_60_ + -1) string = string.substring(0, -4 + string.length)
                                GlShaderObjectHandleStatics.aSystemFontGlyphs_521!!.method2563(var_renderer, string, i_65_, i_66_, (structConfig.anInt580), true)
                                i_66_ += GlShaderObjectHandleStatics.aSystemFontGlyphs_521!!.method2565()
                                i_72_++
                            }
                        }
                        if (structConfig.anInt578 != -1 || structConfig.aString597 != null) {
                            i_56_ = i_56_ shr 1
                            val class348_sub12 = BoundingBoxNode(class348_sub21)
                            class348_sub12.anInt6737 = i_70_
                            class348_sub12.anInt6746 = -i_56_ + i_59_
                            class348_sub12.anInt6735 = i_59_ - -i_56_
                            class348_sub12.anInt6750 = i_58_ - -i_56_
                            class348_sub12.anInt6738 = i_71_
                            class348_sub12.anInt6753 = i_69_
                            class348_sub12.anInt6747 = i_58_ - i_56_
                            class348_sub12.anInt6745 = i_68_
                            RegionSceneLoader.aNodeDeque_3705!!.method1999(class348_sub12, -20180)
                        }
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("jp.I(" + i + ',' + (if (class348_sub21 != null) "{...}" else "null") + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + (if (structConfig != null) "{...}" else "null") + ')'))
                }
            }
}
