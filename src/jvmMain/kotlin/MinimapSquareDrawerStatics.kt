import TextureCubeProviderStatics.method2267
import NativeRendererStatics.method3873

object MinimapSquareDrawerStatics {
    @JvmField
            var aAbstractCameraTransform_5209: AbstractCameraTransform? = null
            @JvmField
            var anInt5210: Int = 0
            @JvmField
            var anInt5211: Int = 0
            @JvmField
            var anInt5215: Int = 0
            @JvmField
            var anInt5216: Int = 0
            var aFontMetaRef_5217: FontMetaRef?
            @JvmField
            var anInt5218: Int = 0
            @JvmField
            var aBoolean5219: Boolean = true
            @JvmField
            var anInt5220: Int = 0
            @JvmField
            var aBoolean5221: Boolean = false
            @JvmField
            var aStringArray5223: Array<String?>? = null
            @JvmField
            var aBoolean5224: Boolean
            @JvmField
            var aBooleanArrayArray5225: Array<BooleanArray?>?
            var aBoolean5226: Boolean
    
            @JvmStatic
            fun method460(i: Int) {
                if (i != 2) method460(-52)
                aAbstractCameraTransform_5209 = null
                aBooleanArrayArray5225 = null
                aStringArray5223 = null
                aFontMetaRef_5217 = null
            }
    
            @JvmStatic
            fun method461(bool: Boolean, `object`: Any?, i: Int): ByteArray? {
                anInt5215++
                if (`object` == null) return null
                if (`object` is ByteArray) {
                    val `is` = `object`
                    if (bool) return method3873(`is`, 0)
                    return `is`
                }
                if (i != 53146732) return null
                if (`object` is ByteStore) {
                    val class344 = `object`
                    return class344.method2692(-3672)
                }
                throw IllegalArgumentException()
            }
    
            @JvmStatic
            fun method462(i: Byte, i_20_: Int): Char {
                anInt5216++
                var i_21_ = 0xff and i.toInt()
                require(i_21_ != 0) { "Non cp1252 character 0x" + i_21_.toString(16) + " provided" }
                if (i_21_ >= 128 && i_21_ < 160) {
                    var i_22_ = MapSceneRenderer.aCharArray625!![i_21_ + -128].code
                    if (i_22_ == 0) i_22_ = 63
                    i_21_ = i_22_
                }
                return i_21_.toChar()
            }
    
            @JvmStatic
            fun method463(class348_sub47: OutgoingPacketNode, bool: Boolean): IntArray {
                anInt5210++
                val class348_sub49 = ByteBuffer(518)
                val `is` = IntArray(4)
                for (i in 0..3) `is`[i] = (Math.random() * 9.9999999E7).toInt()
                class348_sub49.writeByte(bool, 10)
                class348_sub49.writeInt(114.toByte(), `is`[0])
                class348_sub49.writeInt(97.toByte(), `is`[1])
                class348_sub49.writeInt(109.toByte(), `is`[2])
                class348_sub49.writeInt(105.toByte(), `is`[3])
                for (i in 0..9) class348_sub49.writeInt(120.toByte(), (9.9999999E7 * Math.random()).toInt())
                class348_sub49.writeShort(107.toByte(), (9.9999999E7 * Math.random()).toInt())
                class348_sub49.method3390(AbstractFrameBufferSurfaceStatics.aBigInteger6921, (-98).toByte(), ActorEntityStatics.aBigInteger8762)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeBytes(class348_sub49.anInt7197, 0, class348_sub49.aByteArray7154!!, 80)
                return `is`
            }
    
            init {
                aFontMetaRef_5217 = FontMetaRef(17, 8)
                aBooleanArrayArray5225 = (arrayOf<BooleanArray?>(
                    BooleanArray(4),
                    booleanArrayOf(false, true, true, false),
                    booleanArrayOf(true, false, true, false),
                    booleanArrayOf(true, false, true, false),
                    booleanArrayOf(false, false, true, false),
                    booleanArrayOf(false, false, true, false),
                    booleanArrayOf(true, false, true, false),
                    booleanArrayOf(true, false, false, true),
                    booleanArrayOf(true, false, false, true),
                    booleanArrayOf(true, true, false, false),
                    BooleanArray(4),
                    booleanArrayOf(false, true, false, true),
                    BooleanArray(4)
                ))
                aBoolean5226 = false
                aBoolean5224 = false
            }
}
