import ModelBatchBaseStatics.method1128
import RangeThresholdTextureNodeStatics.method3055
import jaggl.OpenGLStatics.glGetTexImagei
import jaggl.OpenGLStatics.glPixelStorei
import jaggl.OpenGLStatics.glTexImage2Df
import jaggl.OpenGLStatics.glTexImage2Di
import jaggl.OpenGLStatics.glTexImage2Dub
import jaggl.OpenGLStatics.glTexSubImage2Di
import jaggl.OpenGLStatics.glTexSubImage2Dub

object GlRectangleTextureStatics {
    @JvmField
            var anInt8633: Int = 0
            @JvmField
            var anInt8635: Int = 0
            @JvmField
            var anInt8636: Int = 0
            @JvmField
            var anInt8637: Int = 0
            @JvmField
            var aSceneProjector_8638: SceneProjector? = SceneProjector("stellardawn", 1)
            @JvmField
            var anInt8639: Int = 0
            @JvmField
            var anInt8641: Int = 0
            @JvmField
            var aByteArrayArray8642: Array<ByteArray?>? = null
            @JvmField
            var anInt8643: Int = 0
            @JvmField
            var aSystemFontGlyphs_8644: SystemFontGlyphs? = null
            @JvmField
            var anInt8645: Int = 0
            @JvmField
            var anInt8646: Int = 0
            @JvmField
            var anInt8647: Int = 0
            @JvmField
            var anInt8648: Int = 0
            @JvmField
            var anInt8649: Int = 0
            @JvmField
            var anInt8650: Int = 0
            @JvmField
            var anInt8651: Int = 0
    
            @JvmStatic
            fun method250(i: Int, bool: Boolean, i_0_: Int): String {
                if (bool != true) method251(96.toByte())
                anInt8641++
                val i_1_ = -i_0_ + i
                if (i_1_ < -9) return "<col=ff0000>"
                if (i_1_ < -6) return "<col=ff3000>"
                if (i_1_ < -3) return "<col=ff7000>"
                if (i_1_ < 0) return "<col=ffb000>"
                if (i_1_ > 9) return "<col=00ff00>"
                if (i_1_ > 6) return "<col=40ff00>"
                if (i_1_ > 3) return "<col=80ff00>"
                if (i_1_ > 0) return "<col=c0ff00>"
                return "<col=ffff00>"
            }
    
            @JvmStatic
            fun method251(i: Byte) {
                if (i.toInt() != 2) method250(-45, false, -102)
                aSystemFontGlyphs_8644 = null
                aSceneProjector_8638 = null
                aByteArrayArray8642 = null
            }
    
            fun method252(i: Int, i_11_: Int): Boolean {
                anInt8636++
                if (i_11_ != 5126) aByteArrayArray8642 = null
                return i == 0 || i == 2
            }
    
            @JvmStatic
            fun method253(i: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int) {
                anInt8648++
                if (i_13_ != -648) aSystemFontGlyphs_8644 = null
                var i_16_ = 0
                var i_17_ = i_15_
                var i_18_ = -i_15_
                var i_19_ = -1
                GlElementArrayBufferStatics.method1156(i_13_ + 621, i_12_ + i_15_, WidgetDefinitionStatics.anIntArrayArray255!![i]!!, i_12_ + -i_15_, i_14_)
                while (i_16_ < i_17_) {
                    i_19_ += 2
                    i_18_ += i_19_
                    i_16_++
                    if (i_18_ >= 0) {
                        i_17_--
                        i_18_ -= i_17_ shl 1
                        val `is` = WidgetDefinitionStatics.anIntArrayArray255!![i - -i_17_]!!
                        val is_20_ = WidgetDefinitionStatics.anIntArrayArray255!![i + -i_17_]!!
                        val i_21_ = i_16_ + i_12_
                        val i_22_ = i_12_ + -i_16_
                        GlElementArrayBufferStatics.method1156(-27, i_21_, `is`, i_22_, i_14_)
                        GlElementArrayBufferStatics.method1156(-27, i_21_, is_20_, i_22_, i_14_)
                    }
                    val i_23_ = i_17_ + i_12_
                    val i_24_ = i_12_ - i_17_
                    val `is` = WidgetDefinitionStatics.anIntArrayArray255!![i_16_ + i]!!
                    val is_25_ = WidgetDefinitionStatics.anIntArrayArray255!![-i_16_ + i]!!
                    GlElementArrayBufferStatics.method1156(i_13_ + 621, i_23_, `is`, i_24_, i_14_)
                    GlElementArrayBufferStatics.method1156(-27, i_23_, is_25_, i_24_, i_14_)
                }
            }
    
            @JvmStatic
            fun method254(i: Int, i_48_: Byte) {
                if (i_48_ > -79) method252(127, 53)
                if (LoaderStatics.skipLobby) {
                    HslColorTableNodeStatics.anInt6634 = i
                    LinkedNodeListIteratorStatics.anInt1645 = i
                } else if (BloomGraphicsOptionStateStatics.anInt5969 != 1) {
                    if (BloomGraphicsOptionStateStatics.anInt5969 == 2) HslColorTableNodeStatics.anInt6634 = i
                } else LinkedNodeListIteratorStatics.anInt1645 = i
                anInt8643++
            }
}
