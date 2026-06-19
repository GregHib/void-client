import ProjectileDefinition.method2288
import SoundBankPatchStatics.method2929
import VorbisOggDecoderStatics.method2972

object SpriteRenderEntryStatics {
    var anInt9703: Int = 0
            var anInt9708: Int = 0
            var anInt9709: Int = 0
            @JvmField
            var aNodeDeque_9711: NodeDeque? = NodeDeque()
            var anInt9713: Int = 0
            var anIntArray9714: IntArray? = intArrayOf(1, 2, 4, 8)
            var anInt9715: Int = 0
    
            @JvmStatic
            fun method3280(i: Int) {
                aNodeDeque_9711 = null
                anIntArray9714 = null
                val i_0_ = 112 / ((i - 16) / 57)
            }
    
            fun method3281(i: Byte, var_renderer: Renderer) {
                if (ScrollbarComponentStatics.aBoolean8335) method2288(false, var_renderer)
                else NativeIndexBufferStatics.method1077(var_renderer, (-123).toByte())
                anInt9709++
                if (i < 29) method3280(81)
            }
    
            fun method3282(i: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
                DisplaySettingsConfigStatics.anInt7244 = i_6_
                GlRectangleTextureStatics.anInt8633 = i_5_
                CachedRgbNoiseTextureStatics.anInt8668 = i_2_
                PackedFlagsAccessorStatics.anInt7092 = i
                ClanChatRequestSender.anInt3650 = i_4_
                MinimapTileEntryStatics.anInt620 = i_1_
                anInt9703++
            }
    
            fun method3283(i: Int) {
                if (VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!.aBoolean3777 && (IndexedSpriteStatics.aServerConnectionInfo_5199!!.anInt2143 != -1)) method2972((IndexedSpriteStatics.aServerConnectionInfo_5199!!.aString2147), (IndexedSpriteStatics.aServerConnectionInfo_5199!!.anInt2143), -54)
                anInt9713++
                val i_7_ = 9 / ((i - 60) / 50)
            }
}
