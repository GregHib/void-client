import jagtheora.ogg.OggPacket
import jagtheora.ogg.OggPage
import jagtheora.ogg.OggStreamState
import jagtheora.ogg.OggSyncState
import java.io.IOException

object OggMediaStreamStatics {
    @JvmField
            var anInt978: Int = 0
            @JvmField
            var aBoolean979: Boolean
            @JvmField
            var anInt980: Int = 0
            @JvmField
            var anInt982: Int = 0
            @JvmField
            var anInt984: Int = 4
            @JvmField
            var anInt985: Int = 0
            @JvmField
            var anInt986: Int = 0
            @JvmField
            var anInt988: Int = 0
            @JvmField
            var anInt989: Int = 0
            @JvmField
            var anInt990: Int = 0
            @JvmField
            var anInt992: Int = 0
            @JvmField
            var anInt994: Int = 0
            @JvmField
            var anInt996: Int = 0
            @JvmField
            var anInt997: Int = 0
            @JvmField
            var anInt998: Int = 0
            @JvmField
            var anInt1000: Int = 0
            @JvmField
            var anInt1002: Int = 0
            @JvmField
            var anInt1003: Int = 0
            @JvmField
            var anInt1004: Int = 0
            @JvmField
            var anInt1005: Int = 0
            @JvmField
            var aFloat1010: Float = 0f
            @JvmStatic
            fun method515(i: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
                anInt990++
                var i_7_ = 0
                val i_8_ = i_4_
                val i_9_ = i_5_ * i_5_
                val i_10_ = i_4_ * i_4_
                val i_11_ = i_10_ shl 1
                val i_12_ = i_9_ shl 1
                val i_13_ = -27 / ((38 - i_6_) / 62)
                val i_14_ = i_4_ shl 1
                var i_15_ = i_11_ + i_9_ * (1 + -i_14_)
                var i_16_ = -(i_12_ * (i_14_ - 1)) + i_10_
                val i_17_ = i_9_ shl 2
                val i_18_ = i_10_ shl 2
                var i_19_ = (3 + (i_7_ shl 1)) * i_11_
                var i_20_ = i_12_ * ((i_8_ shl 1) - 3)
                var i_21_ = i_18_ * (i_7_ + 1)
                GlElementArrayBufferStatics.method1156(-27, i_2_ + i_5_, WidgetDefinitionStatics.anIntArrayArray255!![i_3_]!!, -i_5_ + i_2_, i)
                var i_22_ = i_17_ * (-1 + i_8_)
                while (i_8_ > 0) {
                    if (i_15_ < 0) {
                        while (i_15_ < 0) {
                            i_16_ += i_21_
                            i_15_ += i_19_
                            i_7_++
                            i_21_ += i_18_
                            i_19_ += i_18_
                        }
                    }
                    if (i_16_ < 0) {
                        i_16_ += i_21_
                        i_15_ += i_19_
                        i_7_++
                        i_21_ += i_18_
                        i_19_ += i_18_
                    }
                    i_16_ += -i_20_
                    i_15_ += -i_22_
                    i_22_ -= i_17_
                    i_20_ -= i_17_
                    val i_23_ =  /*---*/i_8_ + i_3_
                    val i_24_ = i_3_ - -i_8_
                    val i_25_ = i_2_ - -i_7_
                    val i_26_ = i_2_ + -i_7_
                    GlElementArrayBufferStatics.method1156(-27, i_25_, WidgetDefinitionStatics.anIntArrayArray255!![i_23_]!!, i_26_, i)
                    GlElementArrayBufferStatics.method1156(-27, i_25_, WidgetDefinitionStatics.anIntArrayArray255!![i_24_]!!, i_26_, i)
                }
            }
    
            @JvmStatic
            fun method518(string: String?, i: Byte) {
                System.exit(1)
                anInt997++
                val i_29_ = 97 % ((-66 - i) / 54)
            }
    
            @JvmStatic
            fun method520(renderTarget: RenderTarget, i: Int): Boolean {
                anInt1000++
                val class51 = GradientLookupEffectStatics.aSeqDefinitionCache_9195!!.method2005(0, renderTarget.method42(-94))
                if (class51.anInt875 == -1) return true
                val class218 = ModelOrSpriteHolderStatics.aTextureDefinitionLoader_117!!.method1173(31.toByte(), class51.anInt875)
                if (i == class218!!.anInt2853) return true
                return class218.method1593(106)
            }
    
            init {
                aBoolean979 = false
            }
}
