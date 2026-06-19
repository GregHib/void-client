import ModelBatchBaseStatics.method1128
import RangeThresholdTextureNodeStatics.method3055
import jaggl.OpenGLStatics.glGetTexImagei
import jaggl.OpenGLStatics.glPixelStorei
import jaggl.OpenGLStatics.glTexImage2Df
import jaggl.OpenGLStatics.glTexImage2Di
import jaggl.OpenGLStatics.glTexImage2Dub
import jaggl.OpenGLStatics.glTexParameteri
import jaggl.OpenGLStatics.glTexSubImage2Df
import jaggl.OpenGLStatics.glTexSubImage2Di
import jaggl.OpenGLStatics.glTexSubImage2Dub
import kotlin.math.atan2
import kotlin.math.sqrt

object Gl2dTextureStatics {
    @JvmField
            var aString8605: String? = null
            @JvmField
            var anInt8606: Int = 0
            @JvmField
            var anInt8607: Int = 0
            @JvmField
            var anInt8608: Int = 0
            @JvmField
            var anInt8609: Int = 0
            @JvmField
            var anInt8610: Int = 0
            @JvmField
            var anInt8611: Int = 0
            @JvmField
            var anInt8613: Int = 0
            @JvmField
            var anInt8614: Int = 0
            @JvmField
            var anInt8615: Int = 0
            @JvmField
            var anInt8616: Int = 0
            @JvmField
            var anInt8617: Int = 0
            @JvmField
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
                if (TextureCubeProviderStatics.aBoolean6327 && (ClientStatics.method105(widgetComponent)!!.anInt7098 != 0 || widgetComponent.anInt774 == 0)) {
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
                var i_16_ = IntKeyNodeStatics.anInt6981 * 512 + 256
                var i_17_ = 512 * CollisionMapAccessor.anInt3550 + 256
                var i_18_ = (CollisionMapAccessor.method2064(i_16_, CompiledScriptCacheStatics.anInt4372, 11219, i_17_) + -ShortMatrixNodeStatics.anInt9515)
                if (GlTextureCubeMapStatics.anInt8537 >= 100) {
                    CompositeRgbNoiseTextureStatics.anInt8685 = 256 + 512 * CollisionMapAccessor.anInt3550
                    GlslMaterialPassStatics.anInt6246 = IntKeyNodeStatics.anInt6981 * 512 + 256
                    ParticleSystemRendererStatics.anInt3855 = (CollisionMapAccessor.method2064(GlslMaterialPassStatics.anInt6246, CompiledScriptCacheStatics.anInt4372, 11219, CompositeRgbNoiseTextureStatics.anInt8685) + -ShortMatrixNodeStatics.anInt9515)
                } else {
                    if (GlslMaterialPassStatics.anInt6246 < i_16_) {
                        GlslMaterialPassStatics.anInt6246 += (TileTextureNodeStatics.anInt9406 + (GlTextureCubeMapStatics.anInt8537 * (i_16_ + -GlslMaterialPassStatics.anInt6246) / 1000))
                        if (i_16_ < GlslMaterialPassStatics.anInt6246) GlslMaterialPassStatics.anInt6246 = i_16_
                    }
                    if (GlslMaterialPassStatics.anInt6246 > i_16_) {
                        GlslMaterialPassStatics.anInt6246 -= (TileTextureNodeStatics.anInt9406 - -(GlTextureCubeMapStatics.anInt8537 * (-i_16_ + GlslMaterialPassStatics.anInt6246) / 1000))
                        if (GlslMaterialPassStatics.anInt6246 < i_16_) GlslMaterialPassStatics.anInt6246 = i_16_
                    }
                    if (ParticleSystemRendererStatics.anInt3855 < i_18_) {
                        ParticleSystemRendererStatics.anInt3855 += ((-ParticleSystemRendererStatics.anInt3855 + i_18_) * GlTextureCubeMapStatics.anInt8537 / 1000) + TileTextureNodeStatics.anInt9406
                        if (i_18_ < ParticleSystemRendererStatics.anInt3855) ParticleSystemRendererStatics.anInt3855 = i_18_
                    }
                    if (CompositeRgbNoiseTextureStatics.anInt8685 < i_17_) {
                        CompositeRgbNoiseTextureStatics.anInt8685 += (TileTextureNodeStatics.anInt9406 - -((i_17_ + -CompositeRgbNoiseTextureStatics.anInt8685) * GlTextureCubeMapStatics.anInt8537 / 1000))
                        if (CompositeRgbNoiseTextureStatics.anInt8685 > i_17_) CompositeRgbNoiseTextureStatics.anInt8685 = i_17_
                    }
                    if (i_18_ < ParticleSystemRendererStatics.anInt3855) {
                        ParticleSystemRendererStatics.anInt3855 -= ((ParticleSystemRendererStatics.anInt3855 - i_18_) * GlTextureCubeMapStatics.anInt8537 / 1000) + TileTextureNodeStatics.anInt9406
                        if (i_18_ > ParticleSystemRendererStatics.anInt3855) ParticleSystemRendererStatics.anInt3855 = i_18_
                    }
                    if (CompositeRgbNoiseTextureStatics.anInt8685 > i_17_) {
                        CompositeRgbNoiseTextureStatics.anInt8685 -= (TileTextureNodeStatics.anInt9406 + ((CompositeRgbNoiseTextureStatics.anInt8685 - i_17_) * GlTextureCubeMapStatics.anInt8537 / 1000))
                        if (i_17_ > CompositeRgbNoiseTextureStatics.anInt8685) CompositeRgbNoiseTextureStatics.anInt8685 = i_17_
                    }
                }
                i_17_ = 256 + ClanChatRequestSender.anInt3647 * 512
                i_16_ = 256 + 512 * RenderableEntryStatics.anInt4336
                i_18_ = (CollisionMapAccessor.method2064(i_16_, CompiledScriptCacheStatics.anInt4372, 11219, i_17_) - MinimapFlagRenderer.anInt1797)
                val i_19_ = -GlslMaterialPassStatics.anInt6246 + i_16_
                val i_20_ = -ParticleSystemRendererStatics.anInt3855 + i_18_
                val i_21_ = -CompositeRgbNoiseTextureStatics.anInt8685 + i_17_
                val i_22_ = sqrt((i_19_ * i_19_ - -(i_21_ * i_21_)).toDouble()).toInt()
                var i_23_ = ((atan2(i_20_.toDouble(), i_22_.toDouble()) * 2607.5945876176133).toInt() and 0x3fff)
                if (i < 126) aString8605 = null
                if (i_23_ < 1024) i_23_ = 1024
                val i_24_ = 0x3fff and (-2607.5945876176133 * atan2(i_19_.toDouble(), i_21_.toDouble())).toInt()
                if (i_23_ > 3072) i_23_ = 3072
                if (i_23_ > MinimapAreaMarkerNodeStatics.anInt9701) {
                    MinimapAreaMarkerNodeStatics.anInt9701 += (BloomGraphicsOptionStateStatics.anInt5973 * (i_23_ - MinimapAreaMarkerNodeStatics.anInt9701 shr 3) / 1000) + GlGroundShaderPassStatics.anInt7403 shl 3
                    if (i_23_ < MinimapAreaMarkerNodeStatics.anInt9701) MinimapAreaMarkerNodeStatics.anInt9701 = i_23_
                }
                if (MinimapAreaMarkerNodeStatics.anInt9701 > i_23_) {
                    MinimapAreaMarkerNodeStatics.anInt9701 -= (((-i_23_ + MinimapAreaMarkerNodeStatics.anInt9701 shr 3) * BloomGraphicsOptionStateStatics.anInt5973 / 1000) + GlGroundShaderPassStatics.anInt7403) shl 3
                    if (MinimapAreaMarkerNodeStatics.anInt9701 < i_23_) MinimapAreaMarkerNodeStatics.anInt9701 = i_23_
                }
                var i_25_ = -WorldMapElementStatics.anInt4638 + i_24_
                if (i_25_ > 8192) i_25_ -= 16384
                if (i_25_ < -8192) i_25_ += 16384
                i_25_ = i_25_ shr 3
                if (i_25_ > 0) {
                    WorldMapElementStatics.anInt4638 += (GlGroundShaderPassStatics.anInt7403 + BloomGraphicsOptionStateStatics.anInt5973 * i_25_ / 1000) shl 3
                    WorldMapElementStatics.anInt4638 = WorldMapElementStatics.anInt4638 and 0x3fff
                }
                if (i_25_ < 0) {
                    WorldMapElementStatics.anInt4638 -= GlGroundShaderPassStatics.anInt7403 - -(-i_25_ * BloomGraphicsOptionStateStatics.anInt5973 / 1000) shl 3
                    WorldMapElementStatics.anInt4638 = WorldMapElementStatics.anInt4638 and 0x3fff
                }
                var i_26_ = i_24_ - WorldMapElementStatics.anInt4638
                if (i_26_ > 8192) i_26_ -= 16384
                if (i_26_ < -8192) i_26_ += 16384
                MapTileShapeStatics.anInt4186 = 0
                if (i_26_ < 0 && i_25_ > 0 || i_26_ > 0 && i_25_ < 0) WorldMapElementStatics.anInt4638 = i_24_
            }
    
            @JvmStatic
            fun method242(bool: Boolean) {
                if (bool == true) aString8605 = null
            }
}
