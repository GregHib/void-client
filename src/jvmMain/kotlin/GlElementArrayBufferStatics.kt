import ProjectileConfigUtil.method313
import NodeDequeHolderStatics.method878

object GlElementArrayBufferStatics {
    var anInt4833: Int = 0
            var anInt4834: Int = 0
            var aConfigFlagUtil_4835: ConfigFlagUtil? = ConfigFlagUtil()
            var anInt4836: Int = 0
            var anInt4838: Int = 0
            @JvmField
            var aServerConnectionInfo_4839: ServerConnectionInfo? = null
            var anInt4840: Int = 0
            var anInt4841: Int = 0
            var anInt4842: Int = 0
            @JvmField
            var aJs5Archive_4843: Js5Archive? = null
            var anInt4844: Int = 0
            private var aCharArray4845: CharArray? = CharArray(64)
            @JvmField
            var aClass348_Sub42_Sub12_4846: ContactEntry? = null
    
            @JvmStatic
            fun method1155(i: Byte) {
                aConfigFlagUtil_4835 = null
                aServerConnectionInfo_4839 = null
                val i_2_ = -29 / ((i - -49) / 43)
                aJs5Archive_4843 = null
                aCharArray4845 = null
                aClass348_Sub42_Sub12_4846 = null
            }
    
            @JvmStatic
            fun method1156(i: Int, i_3_: Int, `is`: IntArray, i_4_: Int, i_5_: Int) {
                var i_3_ = i_3_
                var i_4_ = i_4_
                i_4_--
                anInt4841++
                val i_6_ = --i_3_ - 7
                if (i == -27) {
                    while (i_6_ > i_4_) {
                        `is`[++i_4_] = i_5_
                        `is`[++i_4_] = i_5_
                        `is`[++i_4_] = i_5_
                        `is`[++i_4_] = i_5_
                        `is`[++i_4_] = i_5_
                        `is`[++i_4_] = i_5_
                        `is`[++i_4_] = i_5_
                        `is`[++i_4_] = i_5_
                    }
                    while (i_3_ > i_4_) `is`[++i_4_] = i_5_
                }
            }
    
            @JvmStatic
            fun method1157(i: Int, i_7_: Byte) {
                if (i_7_ < -77) {
                    BloomGraphicsOptionStateStatics.anInt5969 = 2
                    anInt4834++
                    TextureLoadExceptionStatics.anInt4596 = i
                    var l = 0L
                    if (NullOggStreamStatics.aString9043 == null) {
                        GlRectangleTextureStatics.method254(35, (-87).toByte())
                        return
                    } else {
                        val class348_sub49 = (ByteBuffer(method878((MapLabelMenuEntryStatics.method1039(NullOggStreamStatics.aString9043!!, true)), -126)))
                        l = class348_sub49.readLong(-456577760)
                        AnimationFrameDefinitionStatics.aLong6966 = class348_sub49.readLong(-456577760)
                    }
                    LocalPlayerState.method1138(method313(l, -95), true, "", 79.toByte())
                }
            }
    
            fun method1158(i: Int, i_9_: Int, i_10_: Int): Boolean {
                if (i_9_ != -1) aServerConnectionInfo_4839 = null
                anInt4844++
                return (i_10_ and 0x180) != 0
            }
    
            init {
                for (i in 0..25) aCharArray4845!![i] = (65 + i).toChar()
                for (i in 26..51) aCharArray4845!![i] = (i + 71).toChar()
                for (i in 52..61) aCharArray4845!![i] = (-4 + i).toChar()
                aCharArray4845!![63] = '-'
                aCharArray4845!![62] = '*'
            }
}
