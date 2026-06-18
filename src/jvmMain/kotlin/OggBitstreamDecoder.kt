import AntialiasOptionState.Companion.method1819
import jagtheora.ogg.OggPacket
import jagtheora.ogg.OggStreamState
import kotlin.math.cos
import kotlin.math.sin

abstract class OggBitstreamDecoder internal constructor(var anOggStreamState6869: OggStreamState) : LinkedListNode() {
    var anInt6868: Int = 0
    abstract fun method2961(i: Byte)

    fun method2963(oggpacket: OggPacket, i: Int) {
        method2964((-120).toByte(), oggpacket)
        if (i != 16384) aFloatArray6867 = null
        anInt6863++
        this.anInt6868++
    }

    abstract fun method2964(i: Byte, oggpacket: OggPacket)

    companion object {
        @JvmField
        var anInt6863: Int = 0
        @JvmField
        var anInt6864: Int = 0
        @JvmField
        var aFloatArray6865: FloatArray? = FloatArray(16384)
        @JvmField
        var anInt6866: Int = 0
        @JvmField
        var aFloatArray6867: FloatArray? = FloatArray(16384)
        @JvmField
        var anInt6870: Int = 0

        fun method2960(bool: Boolean, i: Int): Int {
            if (i >= -16) aFloatArray6865 = null
            anInt6870++
            val i_0_ = ByteBufferStatics.anInt7207
            while_128_@ do {
                do {
                    if (i_0_ == 0) {
                        if (bool) return 0
                        return PerlinNoiseTextureNode.anInt9157
                    } else if (i_0_ != 1) {
                        if (i_0_ == 2) break
                        break@while_128_
                    }
                    return PerlinNoiseTextureNode.anInt9157
                } while (false)
                return 0
            } while (false)
            return 0
        }

        @JvmStatic
        fun method2962(i: Int) {
            aFloatArray6865 = null
            aFloatArray6867 = null
            if (i != -31055) method2966(-119, -98, true)
        }

        @JvmStatic
        fun method2965(string: String?, i: Int, bool: Boolean, i_1_: Int) {
            anInt6866++
            LocTypeDefLoader.method1406(true)
            if (i == 0) {
                FacingDirectionNode.aRenderer6654 = SoftwareSpriteRaster.method958(true, 0, SourceRowTextureNode.aRenderConfig9113, IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub20_7248!!.method1808(-32350) * 2, ParticleSystemRenderer.aCanvas3869, SpriteLoadValidator.aJs5Archive_4796)
                if (string != null) {
                    FacingDirectionNode.aRenderer6654!!.GA(0)
                    val class143 = method1819(WidgetDefinition.anInt235, 0, -117, SoftwareSpriteRaster.aJs5Archive_1627!!)
                    val class324 = (FacingDirectionNode.aRenderer6654!!.method3686(class143, SpriteImage.method1519(CameraRotationStub.aJs5Archive_322!!, WidgetDefinition.anInt235, 0), true))
                    ScreenBorderFiller.method1170((-89).toByte())
                    Tooltip.method3511(true, class324, class143, string, 2, FacingDirectionNode.aRenderer6654)
                }
            } else {
                var var_renderer: Renderer? = null
                if (string != null) {
                    var_renderer = SoftwareSpriteRaster.method958(true, 0, SourceRowTextureNode.aRenderConfig9113, 0, ParticleSystemRenderer.aCanvas3869, SpriteLoadValidator.aJs5Archive_4796)!!
                    var_renderer.GA(0)
                    val class143 = method1819(WidgetDefinition.anInt235, 0, -115, SoftwareSpriteRaster.aJs5Archive_1627!!)
                    val class324 = var_renderer.method3686(class143, SpriteImage.method1519((CameraRotationStub.aJs5Archive_322!!), WidgetDefinition.anInt235, 0), true)
                    ScreenBorderFiller.method1170((-107).toByte())
                    Tooltip.method3511(true, class324, class143, string, i_1_ + 2, var_renderer)
                }
                try {
                    FacingDirectionNode.aRenderer6654 = SoftwareSpriteRaster.method958(true, i, SourceRowTextureNode.aRenderConfig9113, 2 * IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub20_7248!!.method1808(i_1_ + -32350), ParticleSystemRenderer.aCanvas3869, SpriteLoadValidator.aJs5Archive_4796)
                    if (string != null) {
                        var_renderer!!.GA(0)
                        val class143 = method1819(WidgetDefinition.anInt235, 0, -51, SoftwareSpriteRaster.aJs5Archive_1627!!)
                        val class324 = (var_renderer.method3686(class143, SpriteImage.method1519(CameraRotationStub.aJs5Archive_322!!, WidgetDefinition.anInt235, 0), true))
                        ScreenBorderFiller.method1170((-26).toByte())
                        Tooltip.method3511(true, class324, class143, string, i_1_ + 2, var_renderer)
                    }
                    if (FacingDirectionNode.aRenderer6654!!.method3693()) {
                        var bool_2_ = true
                        try {
                            bool_2_ = (NoiseTextureNode.aClass348_Sub4_9264!!.anInt6609) > 256
                        } catch (throwable: Throwable) {
                            /* empty */
                        }
                        val var_shaderProgram: ShaderProgram?
                        if (!bool_2_) var_shaderProgram = FacingDirectionNode.aRenderer6654!!.method3702(104857600)
                        else var_shaderProgram = FacingDirectionNode.aRenderer6654!!.method3702(146800640)
                        FacingDirectionNode.aRenderer6654!!.method3651(var_shaderProgram)
                    }
                } catch (throwable: Throwable) {
                    val i_3_ = IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350)
                    if (i_3_ == 2) NpcSummaryDefinition.aBoolean1952 = true
                    IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub25_7271), 0)
                    method2965(string, i_3_, bool, i_1_)
                    return
                } finally {
                    if (var_renderer != null) {
                        try {
                            var_renderer.method3635((-111).toByte())
                        } catch (throwable: Throwable) {
                            /* empty */
                        }
                    }
                }
            }
            IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1826(!bool, -142238264)
            IntHashSet.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub25_7271), i)
            ByteBufferStatics.method3354(i_1_ + -78)
            FacingDirectionNode.aRenderer6654!!.method3650(10000)
            FacingDirectionNode.aRenderer6654!!.X(32)
            SettingsCrcWriter.aAbstractCameraTransform_2123 = FacingDirectionNode.aRenderer6654!!.method3654()
            MinimapSquareDrawer.aAbstractCameraTransform_5209 = FacingDirectionNode.aRenderer6654!!.method3654()
            BufferToggleState.method2196((-9).toByte())
            FacingDirectionNode.aRenderer6654!!.method3630(IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub2_7228!!.method1726(-32350) == 1)
            if (FacingDirectionNode.aRenderer6654!!.method3627()) WarpTextureNode.method3137(IntHashSet.aClass348_Sub51_3959!!.aClass239_Sub12_7243!!.method1771(-32350) == 1, (-24).toByte())
            TerrainChunkBuilder.method873(GlCubemapLightPass.anInt7319 shr 3, 21719, FacingDirectionNode.aRenderer6654, RangeThresholdTextureNode.anInt9109 shr 3)
            SceneObjectSpawner.method773(true)
            RenderNodeStatics.aBoolean9719 = false
            NativeLibraryUnloader.aMapSceneTileArray2974 = null
            TextureLoadExceptionStatics.aBoolean4604 = true
            LoadingScreenImageNode.method3179(i_1_)
        }

        fun method2966(i: Int, i_4_: Int, bool: Boolean) {
            anInt6864++
            val class348_sub42_sub15 = NamedTimedNode.method2516(i, 105.toByte(), 14)
            if (bool != false) aFloatArray6865 = null
            class348_sub42_sub15.method3246(-25490)
            class348_sub42_sub15.anInt9652 = i_4_
        }

        init {
            val d = 3.834951969714103E-4
            for (i in 0..16383) {
                aFloatArray6865!![i] = sin(d * i.toDouble()).toFloat()
                aFloatArray6867!![i] = cos(i.toDouble() * d).toFloat()
            }
        }
    }
}
