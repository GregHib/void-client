import ModelBatchBaseStatics.method1128
import RangeThresholdTextureNode.Companion.method3055
import jaggl.OpenGL.Companion.glGetTexImagei
import jaggl.OpenGL.Companion.glPixelStorei
import jaggl.OpenGL.Companion.glTexImage2Df
import jaggl.OpenGL.Companion.glTexImage2Di
import jaggl.OpenGL.Companion.glTexImage2Dub
import jaggl.OpenGL.Companion.glTexParameteri
import jaggl.OpenGL.Companion.glTexSubImage2Df
import jaggl.OpenGL.Companion.glTexSubImage2Di
import jaggl.OpenGL.Companion.glTexSubImage2Dub
import kotlin.math.atan2
import kotlin.math.sqrt

class Gl2dTexture : GlTextureBase, Renderable2dTexture {
    private var anInt8604 = 0
    private var anInt8612 = 0
    override fun method71(i: Byte, f: Float): Float {
        anInt8606++
        if (i >= -24) method242(false)
        return f / anInt8604.toFloat()
    }

    internal constructor(glRenderDevice: GlRenderDevice?, i: Int, i_0_: Int, bool: Boolean, `is`: IntArray?, i_1_: Int, i_2_: Int) : super(glRenderDevice, 3553, GroundItemRenderState.aTextureFormatInfo_1662, MovementDirection.aMovementDirection_1183, i * i_0_, bool) {
        try {
            anInt8612 = i
            anInt8604 = i_0_
            this.aGlRenderDevice_5082!!.method3850(79.toByte(), this)
            if (bool && i_2_ == 0 && i_1_ == 0) this.method233(i, i_0_, `is`!!, this.anInt5093, 255)
            else {
                glPixelStorei(3314, i_2_)
                glTexImage2Di(this.anInt5093, 0, 6408, anInt8612, anInt8604, 0, 32993, this.aGlRenderDevice_5082!!.anInt9918, `is`, 4 * i_1_)
                glPixelStorei(3314, 0)
            }
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("bm.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + bool + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ')'))
        }
    }

    internal constructor(glRenderDevice: GlRenderDevice?, textureFormatInfo: TextureFormatInfo?, i: Int, i_6_: Int, bool: Boolean, `is`: ByteArray?, i_7_: Int, i_8_: Int) : super(glRenderDevice, 3553, textureFormatInfo, MovementDirection.aMovementDirection_1183, i_6_ * i, bool) {
        try {
            anInt8612 = i
            anInt8604 = i_6_
            this.aGlRenderDevice_5082!!.method3850((-102).toByte(), this)
            glPixelStorei(3317, 1)
            if (!bool || i_8_ != 0 || i_7_ != 0) {
                glPixelStorei(3314, i_8_)
                glTexImage2Dub(this.anInt5093, 0, this.method228(109), i, i_6_, 0, (method3055(121, this.aTextureFormatInfo_5084)), 5121, `is`, i_7_)
                glPixelStorei(3314, 0)
            } else this.method230(7365, i, `is`!!, i_6_, this.anInt5093)
            glPixelStorei(3317, 4)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("bm.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + i + ',' + i_6_ + ',' + bool + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_7_ + ',' + i_8_ + ')'))
        }
    }

    override fun method67(f: Float, i: Int): Float {
        anInt8611++
        if (i <= 69) method72(84)
        return f / anInt8612.toFloat()
    }

    fun method240(i: Int, i_9_: Byte, fs: FloatArray?, textureFormatInfo: TextureFormatInfo?, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int) {
        try {
            val i_15_ = 108 / ((-45 - i_9_) / 49)
            anInt8614++
            this.aGlRenderDevice_5082!!.method3850((-106).toByte(), this)
            glPixelStorei(3314, i)
            glTexSubImage2Df(this.anInt5093, 0, i_12_, i_10_, i_13_, i_14_, method3055(106, textureFormatInfo), 5121, fs, i_11_)
            glPixelStorei(3314, 0)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("bm.CA(" + i + ',' + i_9_ + ',' + (if (fs != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + i_10_ + ',' + i_11_ + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ')'))
        }
    }

    override fun method70(i: Int, i_27_: Int, i_28_: Byte, i_29_: Int, i_30_: Int, i_31_: Int, i_32_: Int, `is`: ByteArray?, textureFormatInfo: TextureFormatInfo?) {
        try {
            anInt8608++
            this.aGlRenderDevice_5082!!.method3850((-24).toByte(), this)
            glPixelStorei(3317, 1)
            glPixelStorei(3314, i_29_)
            glTexSubImage2Dub(this.anInt5093, 0, i_32_, i, i_31_, i_30_, method3055(103, textureFormatInfo), 5121, `is`, i_27_)
            if (i_28_ >= -4) anInt8612 = 33
            glPixelStorei(3314, 0)
            glPixelStorei(3317, 4)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("bm.T(" + i + ',' + i_27_ + ',' + i_28_ + ',' + i_29_ + ',' + i_30_ + ',' + i_31_ + ',' + i_32_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ')'))
        }
    }

    override fun method65(i: Int, `is`: IntArray, i_33_: Int, i_34_: Int, i_35_: Int, i_36_: Byte, i_37_: Int) {
        anInt8613++
        val is_38_ = IntArray(anInt8612 * anInt8604)
        this.aGlRenderDevice_5082!!.method3850((-32).toByte(), this)
        glGetTexImagei(this.anInt5093, 0, 32993, 5121, is_38_, 0)
        if (i_36_.toInt() == 112) {
            var i_39_ = 0
            while (i_35_ > i_39_) {
                ArrayCopyUtil.method1578(is_38_, ((-i_39_ + i_35_ + (-1 + i_34_)) * anInt8612), `is`, i_33_ * i_39_ + i_37_, i_33_)
                i_39_++
            }
        }
    }

    override fun method69(bool: Boolean): Int {
        anInt8607++
        if (bool != false) return -121
        return anInt8612
    }

    override fun method72(i: Int): Int {
        anInt8609++
        val i_40_ = -48 / ((55 - i) / 63)
        return anInt8604
    }

    override fun method73(i: Int): Boolean {
        anInt8618++
        return i >= 84
    }

    override fun method68(i: Int, i_41_: Int, `is`: IntArray?, i_42_: Int, i_43_: Int, i_44_: Int, i_45_: Int, i_46_: Int) {
        this.aGlRenderDevice_5082!!.method3850((-116).toByte(), this)
        if (i_41_ != 22809) aString8605 = null
        anInt8616++
        glPixelStorei(3314, i)
        glTexSubImage2Di(this.anInt5093, 0, i_42_, i_45_, i_44_, i_46_, 32993, (this.aGlRenderDevice_5082!!.anInt9918), `is`, i_43_)
        glPixelStorei(3314, 0)
    }

    internal constructor(glRenderDevice: GlRenderDevice?, textureFormatInfo: TextureFormatInfo?, movementDirection: MovementDirection?, i: Int, i_47_: Int) : super(glRenderDevice, 3553, textureFormatInfo, movementDirection, i_47_ * i, false) {
        try {
            anInt8612 = i
            anInt8604 = i_47_
            this.aGlRenderDevice_5082!!.method3850(110.toByte(), this)
            glTexImage2Dub(this.anInt5093, 0, this.method228(113), i, i_47_, 0, method3055(113, this.aTextureFormatInfo_5084), method1128(-112, this.aMovementDirection_5088), null, 0)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("bm.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + (if (movementDirection != null) "{...}" else "null") + ',' + i + ',' + i_47_ + ')'))
        }
    }

    override fun method66(bool: Boolean, bool_48_: Boolean, i: Int) {
        this.aGlRenderDevice_5082!!.method3850((-29).toByte(), this)
        anInt8615++
        glTexParameteri(this.anInt5093, 10242, if (!bool) 33071 else 10497)
        glTexParameteri(this.anInt5093, 10243, if (!bool_48_) 33071 else 10497)
        if (i != 25688) anInt8604 = -90
    }

    internal constructor(glRenderDevice: GlRenderDevice?, textureFormatInfo: TextureFormatInfo?, i: Int, i_49_: Int, bool: Boolean, fs: FloatArray?, i_50_: Int, i_51_: Int) : super(glRenderDevice, 3553, textureFormatInfo, MovementDirection.aMovementDirection_1187, i * i_49_, bool) {
        try {
            anInt8612 = i
            anInt8604 = i_49_
            this.aGlRenderDevice_5082!!.method3850((-67).toByte(), this)
            if (bool || i_51_ != 0 || i_50_ != 0) {
                glPixelStorei(3314, i_51_)
                glTexImage2Df(this.anInt5093, 0, this.method228(111), i, i_49_, 0, (method3055(106, this.aTextureFormatInfo_5084)), 5126, fs, 4 * i_50_)
                glPixelStorei(3314, 0)
            } else this.method238(this.anInt5093, 1, i, fs, i_49_)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("bm.<init>(" + (if (glRenderDevice != null) "{...}" else "null") + ',' + (if (textureFormatInfo != null) "{...}" else "null") + ',' + i + ',' + i_49_ + ',' + bool + ',' + (if (fs != null) "{...}" else "null") + ',' + i_50_ + ',' + i_51_ + ')'))
        }
    }

    companion object {

        var aString8605: String? = null

        var anInt8606: Int = 0

        var anInt8607: Int = 0

        var anInt8608: Int = 0

        var anInt8609: Int = 0

        var anInt8610: Int = 0

        var anInt8611: Int = 0

        var anInt8613: Int = 0

        var anInt8614: Int = 0

        var anInt8615: Int = 0

        var anInt8616: Int = 0

        var anInt8617: Int = 0

        var anInt8618: Int = 0

        @JvmStatic
        fun method239(i: Byte, i_3_: Int, i_4_: Int, widgetComponent: WidgetComponent) {
            anInt8610++
            if (widgetComponent.aByte817.toInt() != 0) {
                if (widgetComponent.aByte817.toInt() == 1) widgetComponent.anInt800 = ((-widgetComponent.anInt709 + i_3_) / 2 + widgetComponent.anInt788)
                else if (widgetComponent.aByte817.toInt() != 2) {
                    if (widgetComponent.aByte817.toInt() != 3) {
                        if (widgetComponent.aByte817.toInt() != 4) widgetComponent.anInt800 = (-widgetComponent.anInt709 + i_3_ + -(i_3_ * widgetComponent.anInt788 shr 14))
                        else widgetComponent.anInt800 = ((-widgetComponent.anInt709 + i_3_) / 2 - -(i_3_ * widgetComponent.anInt788 shr 14))
                    } else widgetComponent.anInt800 = i_3_ * widgetComponent.anInt788 shr 14
                } else widgetComponent.anInt800 = (-widgetComponent.anInt788 + (-widgetComponent.anInt709 + i_3_))
            } else widgetComponent.anInt800 = widgetComponent.anInt788
            val i_5_ = 83 % ((i - 50) / 50)
            if (widgetComponent.aByte681.toInt() != 0) {
                if (widgetComponent.aByte681.toInt() == 1) widgetComponent.anInt750 = ((i_4_ + -widgetComponent.anInt789) / 2 - -widgetComponent.anInt739)
                else if (widgetComponent.aByte681.toInt() == 2) widgetComponent.anInt750 = (i_4_ - widgetComponent.anInt789 - widgetComponent.anInt739)
                else if (widgetComponent.aByte681.toInt() != 3) {
                    if (widgetComponent.aByte681.toInt() != 4) widgetComponent.anInt750 = (-(i_4_ * widgetComponent.anInt739 shr 14) + (i_4_ + -widgetComponent.anInt789))
                    else widgetComponent.anInt750 = ((i_4_ * widgetComponent.anInt739 shr 14) + (-widgetComponent.anInt789 + i_4_) / 2)
                } else widgetComponent.anInt750 = widgetComponent.anInt739 * i_4_ shr 14
            } else widgetComponent.anInt750 = widgetComponent.anInt739
            if (TextureCubeProviderStatics.aBoolean6327 && (Client.method105(widgetComponent)!!.anInt7098 != 0 || widgetComponent.anInt774 == 0)) {
                if (widgetComponent.anInt750 < 0) widgetComponent.anInt750 = 0
                else if (i_4_ < (widgetComponent.anInt789 + widgetComponent.anInt750)) widgetComponent.anInt750 = i_4_ - widgetComponent.anInt789
                if (widgetComponent.anInt800 >= 0) {
                    if (i_3_ < (widgetComponent.anInt800 - -widgetComponent.anInt709)) widgetComponent.anInt800 = i_3_ + -widgetComponent.anInt709
                } else widgetComponent.anInt800 = 0
            }
        }

        @JvmStatic
        fun method241(i: Byte) {
            anInt8617++
            var i_16_ = TwoStateOptionState.anInt6981 * 512 + 256
            var i_17_ = 512 * CollisionMapAccessor.anInt3550 + 256
            var i_18_ = (CollisionMapAccessor.method2064(i_16_, CompiledScriptCache.anInt4372, 11219, i_17_) + -ShortMatrixNode.anInt9515)
            if (GlTextureCubeMap.anInt8537 >= 100) {
                CompositeRgbNoiseTexture.anInt8685 = 256 + 512 * CollisionMapAccessor.anInt3550
                GlslMaterialPass.anInt6246 = TwoStateOptionState.anInt6981 * 512 + 256
                ParticleSystemRenderer.anInt3855 = (CollisionMapAccessor.method2064(GlslMaterialPass.anInt6246, CompiledScriptCache.anInt4372, 11219, CompositeRgbNoiseTexture.anInt8685) + -ShortMatrixNode.anInt9515)
            } else {
                if (GlslMaterialPass.anInt6246 < i_16_) {
                    GlslMaterialPass.anInt6246 += (TileTextureNode.anInt9406 + (GlTextureCubeMap.anInt8537 * (i_16_ + -GlslMaterialPass.anInt6246) / 1000))
                    if (i_16_ < GlslMaterialPass.anInt6246) GlslMaterialPass.anInt6246 = i_16_
                }
                if (GlslMaterialPass.anInt6246 > i_16_) {
                    GlslMaterialPass.anInt6246 -= (TileTextureNode.anInt9406 - -(GlTextureCubeMap.anInt8537 * (-i_16_ + GlslMaterialPass.anInt6246) / 1000))
                    if (GlslMaterialPass.anInt6246 < i_16_) GlslMaterialPass.anInt6246 = i_16_
                }
                if (ParticleSystemRenderer.anInt3855 < i_18_) {
                    ParticleSystemRenderer.anInt3855 += ((-ParticleSystemRenderer.anInt3855 + i_18_) * GlTextureCubeMap.anInt8537 / 1000) + TileTextureNode.anInt9406
                    if (i_18_ < ParticleSystemRenderer.anInt3855) ParticleSystemRenderer.anInt3855 = i_18_
                }
                if (CompositeRgbNoiseTexture.anInt8685 < i_17_) {
                    CompositeRgbNoiseTexture.anInt8685 += (TileTextureNode.anInt9406 - -((i_17_ + -CompositeRgbNoiseTexture.anInt8685) * GlTextureCubeMap.anInt8537 / 1000))
                    if (CompositeRgbNoiseTexture.anInt8685 > i_17_) CompositeRgbNoiseTexture.anInt8685 = i_17_
                }
                if (i_18_ < ParticleSystemRenderer.anInt3855) {
                    ParticleSystemRenderer.anInt3855 -= ((ParticleSystemRenderer.anInt3855 - i_18_) * GlTextureCubeMap.anInt8537 / 1000) + TileTextureNode.anInt9406
                    if (i_18_ > ParticleSystemRenderer.anInt3855) ParticleSystemRenderer.anInt3855 = i_18_
                }
                if (CompositeRgbNoiseTexture.anInt8685 > i_17_) {
                    CompositeRgbNoiseTexture.anInt8685 -= (TileTextureNode.anInt9406 + ((CompositeRgbNoiseTexture.anInt8685 - i_17_) * GlTextureCubeMap.anInt8537 / 1000))
                    if (i_17_ > CompositeRgbNoiseTexture.anInt8685) CompositeRgbNoiseTexture.anInt8685 = i_17_
                }
            }
            i_17_ = 256 + ClanChatRequestSender.anInt3647 * 512
            i_16_ = 256 + 512 * RenderableEntry.anInt4336
            i_18_ = (CollisionMapAccessor.method2064(i_16_, CompiledScriptCache.anInt4372, 11219, i_17_) - MinimapFlagRenderer.anInt1797)
            val i_19_ = -GlslMaterialPass.anInt6246 + i_16_
            val i_20_ = -ParticleSystemRenderer.anInt3855 + i_18_
            val i_21_ = -CompositeRgbNoiseTexture.anInt8685 + i_17_
            val i_22_ = sqrt((i_19_ * i_19_ - -(i_21_ * i_21_)).toDouble()).toInt()
            var i_23_ = ((atan2(i_20_.toDouble(), i_22_.toDouble()) * 2607.5945876176133).toInt() and 0x3fff)
            if (i < 126) aString8605 = null
            if (i_23_ < 1024) i_23_ = 1024
            val i_24_ = 0x3fff and (-2607.5945876176133 * atan2(i_19_.toDouble(), i_21_.toDouble())).toInt()
            if (i_23_ > 3072) i_23_ = 3072
            if (i_23_ > MinimapAreaMarkerNode.anInt9701) {
                MinimapAreaMarkerNode.anInt9701 += (BloomGraphicsOptionState.anInt5973 * (i_23_ - MinimapAreaMarkerNode.anInt9701 shr 3) / 1000) + GlGroundShaderPass.anInt7403 shl 3
                if (i_23_ < MinimapAreaMarkerNode.anInt9701) MinimapAreaMarkerNode.anInt9701 = i_23_
            }
            if (MinimapAreaMarkerNode.anInt9701 > i_23_) {
                MinimapAreaMarkerNode.anInt9701 -= (((-i_23_ + MinimapAreaMarkerNode.anInt9701 shr 3) * BloomGraphicsOptionState.anInt5973 / 1000) + GlGroundShaderPass.anInt7403) shl 3
                if (MinimapAreaMarkerNode.anInt9701 < i_23_) MinimapAreaMarkerNode.anInt9701 = i_23_
            }
            var i_25_ = -WorldMapElement.anInt4638 + i_24_
            if (i_25_ > 8192) i_25_ -= 16384
            if (i_25_ < -8192) i_25_ += 16384
            i_25_ = i_25_ shr 3
            if (i_25_ > 0) {
                WorldMapElement.anInt4638 += (GlGroundShaderPass.anInt7403 + BloomGraphicsOptionState.anInt5973 * i_25_ / 1000) shl 3
                WorldMapElement.anInt4638 = WorldMapElement.anInt4638 and 0x3fff
            }
            if (i_25_ < 0) {
                WorldMapElement.anInt4638 -= GlGroundShaderPass.anInt7403 - -(-i_25_ * BloomGraphicsOptionState.anInt5973 / 1000) shl 3
                WorldMapElement.anInt4638 = WorldMapElement.anInt4638 and 0x3fff
            }
            var i_26_ = i_24_ - WorldMapElement.anInt4638
            if (i_26_ > 8192) i_26_ -= 16384
            if (i_26_ < -8192) i_26_ += 16384
            MapTileShape.anInt4186 = 0
            if (i_26_ < 0 && i_25_ > 0 || i_26_ > 0 && i_25_ < 0) WorldMapElement.anInt4638 = i_24_
        }

        @JvmStatic
        fun method242(bool: Boolean) {
            if (bool == true) aString8605 = null
        }
    }
}
