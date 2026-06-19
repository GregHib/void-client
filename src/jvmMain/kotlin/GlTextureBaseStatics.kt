import jaggl.OpenGLStatics.glBindTexture
import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glGenTextures
import jaggl.OpenGLStatics.glTexImage2Df
import jaggl.OpenGLStatics.glTexImage2Di
import jaggl.OpenGLStatics.glTexImage2Dub
import jaggl.OpenGLStatics.glTexParameteri
import kotlin.math.min

object GlTextureBaseStatics {
    @JvmField
            var anInt5083: Int = 0
            @JvmField
            var anInt5085: Int = 0
            @JvmField
            var anInt5086: Int = 0
            @JvmField
            var anInt5087: Int = 0
            @JvmField
            var aLong5089: Long = -1L
            @JvmField
            var anIntArray5091: IntArray? = null
            @JvmField
            var anInt5092: Int = 0
            @JvmField
            var anInt5094: Int = 0
            @JvmField
            var anInt5095: Int = 0
            @JvmField
            var anInt5097: Int = 0
            @JvmField
            var anInt5098: Int = 0
            @JvmField
            var anInt5100: Int = 0
            @JvmField
            var anInt5102: Int = 0
            @JvmField
            var anInt5103: Int = 0
            @JvmField
            var anInt5104: Int = 0
    
            @JvmStatic
            fun method232(var_renderer: Renderer?, i: Byte, bool: Boolean, i_22_: Int): Font? {
                if (i.toInt() != -53) method237(true)
                anInt5094++
                val class352 = ChatEffectsOptionStateStatics.method1734(i_22_, var_renderer, 55.toByte(), bool)
                if (class352 == null) return null
                return class352.aFont_4332
            }
    
            @JvmStatic
            fun method235(i: Int, i_46_: Byte) {
                anInt5087++
                if (i != -1 && AudioResamplerStatics.aBooleanArray2162!![i]) {
                    RenderConfigFactoryStatics.aJs5Archive_2978!!.method411(i, -120)
                    WarpTextureNodeStatics.aWidgetComponentArrayArray9427!![i] = null
                    WorldMapTextLabelStatics.aWidgetComponentArrayArray8584!![i] = null
                    if (i_46_ <= -94) AudioResamplerStatics.aBooleanArray2162!![i] = false
                }
            }
    
            @JvmStatic
            fun method237(bool: Boolean) {
                if (bool != false) aLong5089 = -54L
                anIntArray5091 = null
            }
}
