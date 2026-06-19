import ParticleSystemStateStatics.method1296
import WaterMaterialPassStatics.method2148
import ParticleTileShapeStatics.method2732
import BrightnessTextureNodeStatics.method3086
import jaggl.OpenGLStatics.glBindFramebufferEXT
import jaggl.OpenGLStatics.glCheckFramebufferStatusEXT
import jaggl.OpenGLStatics.glDrawBuffer
import jaggl.OpenGLStatics.glGenFramebuffersEXT
import jaggl.OpenGLStatics.glReadBuffer
import kotlin.math.abs
import kotlin.math.atan2

object FrameBufferObjectStatics {
    var anInt4864: Int = 0
            var anInt4865: Int = 0
            var anInt4866: Int = 0
            var anInt4867: Int = 0
            var anInt4868: Int = 0
            var anInt4869: Int = 0
            var anInt4870: Int = 0
            var anInt4871: Int = 0
            var aClass209_4874: UnusedToStringStub?
            var anInt4876: Int = 0
            var anInt4877: Int = 0
            var anInt4878: Int = 0
            var anInt4879: Int = 0
            var anInt4880: Int = 0
            var anInt4881: Int = 0
            var anInt4885: Int = 0
            var anInt4887: Int = 0
            @JvmField
            var aBoolean4888: Boolean = false
            var anInt4889: Int
            var anInt4890: Int = 0
            var anInt4892: Int = 0
            var anInt4893: Int = 0
    
            @JvmStatic
            fun method1499(i: Int) {
                if (i < -124) aClass209_4874 = null
            }
    
            @JvmStatic
            fun method1501(i: Int) {
                val i_3_ = 56 / ((i - -56) / 42)
                var i_4_ = 0
                while (i_4_ < HintArrowOrMessageStatics.anInt2021) {
                    val class10 = GlTextureCubeMapStatics.aParticleEmitterNodeArray8531s!![i_4_]
                    var bool = false
                    if (class10!!.aClass348_Sub16_Sub5_176 == null) {
                        class10.anInt188--
                        if (class10.anInt188 >= (if (!class10.method220((-66).toByte())) -10 else -1500)) {
                            if (class10.aByte180.toInt() == 1 && class10.aAudioClipDefinition_183 == null) {
                                class10.aAudioClipDefinition_183 = AudioClipDefinitionStatics.method2372(ModelFacePriorityNodeStatics.aJs5Archive_1878!!, class10.anInt185, 0)
                                if (class10.aAudioClipDefinition_183 == null) {
                                    i_4_++
                                    continue
                                }
                                class10.anInt188 += class10.aAudioClipDefinition_183!!.method2370()
                            } else if (class10.method220((-39).toByte()) && ((class10.aClass348_Sub10_192 == null) || (class10.aClass348_Sub19_Sub1_189) == null)) {
                                if (class10.aClass348_Sub10_192 == null) class10.aClass348_Sub10_192 = VorbisAudioDecoderStatics.method2793((LightingOptionStateStatics.aJs5Archive_5878!!), (class10.anInt185))
                                if (class10.aClass348_Sub10_192 == null) {
                                    i_4_++
                                    continue
                                }
                                if (class10.aClass348_Sub19_Sub1_189 == null) {
                                    class10.aClass348_Sub19_Sub1_189 = class10.aClass348_Sub10_192!!.method2791(intArrayOf(22050))
                                    if (class10.aClass348_Sub19_Sub1_189 == null) {
                                        i_4_++
                                        continue
                                    }
                                }
                            }
                            if (class10.anInt188 < 0) {
                                var i_5_ = 8192
                                val i_6_: Int
                                if (class10.anInt178 == 0) i_6_ = ((class10.anInt184 * (if (class10.aByte180.toInt() == 3) IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7215!!.method1838(-32350) else IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7272!!.method1838(-32350))) shr 2)
                                else {
                                    val i_7_ = 0x3 and (class10.anInt178 shr 24)
                                    if ((LocalPlayerState.aPlayer_1907!!.plane).toInt() == i_7_) {
                                        val i_8_ = 0x1fe00 and (class10.anInt178 shl 9)
                                        val i_9_ = (LocalPlayerState.aPlayer_1907!!.method2436(52.toByte()) shl 8)
                                        val i_10_ = ((class10.anInt178 and 0xff7e29) shr 16)
                                        val i_11_ = (-(LocalPlayerState.aPlayer_1907!!.x) + 256 + (i_10_ shl 9) + i_9_)
                                        val i_12_ = ((class10.anInt178 and 0xffc1) shr 8)
                                        val i_13_ = (256 + (i_12_ shl 9) - ((LocalPlayerState.aPlayer_1907!!.y) - i_9_))
                                        var i_14_ = (abs(i_11_) + (abs(i_13_) + -512))
                                        if (i_8_ < i_14_) {
                                            class10.anInt188 = -99999
                                            i_4_++
                                            continue
                                        }
                                        if (i_14_ < 0) i_14_ = 0
                                        i_6_ = ((i_8_ + -i_14_) * (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7234!!.method1838(-32350) * class10.anInt184) / i_8_) shr 2
                                        if ((class10.aClass318_Sub1_172 != null) && (class10.aClass318_Sub1_172 is GroundDecorEntity)) {
                                            val class318_sub1_sub3 = ((class10.aClass318_Sub1_172) as GroundDecorEntity)
                                            val i_15_ = (class318_sub1_sub3.aShort8743)
                                            val i_16_ = (class318_sub1_sub3.aShort8750)
                                        }
                                        if (i_11_ != 0 || i_13_ != 0) {
                                            var i_17_ = (0x3fff and (-4096 + -WorldMapElementStatics.anInt4638 + -(2607.5945876176133 * (atan2(i_11_.toDouble(), i_13_.toDouble()))).toInt()))
                                            if (i_17_ > 8192) i_17_ = 16384 + -i_17_
                                            val i_18_: Int
                                            if (i_14_ <= 0) i_18_ = 8192
                                            else if (i_14_ >= 4096) i_18_ = 16384
                                            else i_18_ = 8192 + (-i_14_ + 8192) / 4096
                                            i_5_ = ((-i_18_ + 16384 shr 1) + i_18_ * i_17_ / 8192)
                                        }
                                    } else i_6_ = 0
                                }
                                if (i_6_ > 0) {
                                    var class348_sub19_sub1: PcmSampleData? = null
                                    if (class10.aByte180.toInt() != 1) {
                                        if (class10.method220((-112).toByte())) class348_sub19_sub1 = (class10.aClass348_Sub19_Sub1_189)
                                    } else class348_sub19_sub1 = class10.aAudioClipDefinition_183!!.method2369().method2944(MapSceneTileStatics.aAudioResampler_1050!!)
                                    val class348_sub16_sub5 = (SampledVoiceStatics.method2911(class348_sub19_sub1!!, class10.anInt173, i_6_, i_5_).also { class10.aClass348_Sub16_Sub5_176 = it })
                                    class348_sub16_sub5!!.method2917(-1 + class10.anInt177)
                                    SpriteDefinitionStatics.aClass348_Sub16_Sub4_7065!!.method2883(class348_sub16_sub5)
                                }
                            }
                        } else bool = true
                    } else if (!class10.aClass348_Sub16_Sub5_176!!.method2712(4.toByte())) bool = true
                    if (bool) {
                        HintArrowOrMessageStatics.anInt2021--
                        var i_19_ = i_4_
                        while (HintArrowOrMessageStatics.anInt2021 > i_19_) {
                            GlTextureCubeMapStatics.aParticleEmitterNodeArray8531s!![i_19_] = GlTextureCubeMapStatics.aParticleEmitterNodeArray8531s!![i_19_ - -1]
                            i_19_++
                        }
                        i_4_--
                    }
                    i_4_++
                }
                anInt4890++
                if (RgbColorPaletteStatics.aBoolean1236 && !method1296(true)) {
                    if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7260!!.method1838(-32350) != 0 && SlotBindingStatics.anInt3428 != -1) {
                        if (UnusedToStringStubStatics.aClass348_Sub16_Sub3_2718 != null) method3086(2, UnusedToStringStubStatics.aClass348_Sub16_Sub3_2718, IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7260!!.method1838(-32350), CachedRgbNoiseTextureStatics.aJs5Archive_8667, false, 0, SlotBindingStatics.anInt3428)
                        else method2732(0, SlotBindingStatics.anInt3428, false, 124, CachedRgbNoiseTextureStatics.aJs5Archive_8667, IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7260!!.method1838(-32350))
                    }
                    RgbColorPaletteStatics.aBoolean1236 = false
                    UnusedToStringStubStatics.aClass348_Sub16_Sub3_2718 = null
                } else if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7260!!.method1838(-32350) != 0 && SlotBindingStatics.anInt3428 != -1 && !method1296(true)) {
                    SceneLinkedListNodeStatics.anInt3973++
                    val class348_sub47 = method2148(OpenGlRendererStatics.aFontMetaRef_7554, TheoraVideoStreamStatics.aIsaacCipher_9029, -107)
                    class348_sub47.aClass348_Sub49_Sub2_7116!!.writeInt(118.toByte(), SlotBindingStatics.anInt3428)
                    InterfaceComponentGroupStatics.method3243(-54, class348_sub47)
                    SlotBindingStatics.anInt3428 = -1
                }
            }
    
            init {
                aClass209_4874 = UnusedToStringStub()
                anInt4889 = 0
            }
}
