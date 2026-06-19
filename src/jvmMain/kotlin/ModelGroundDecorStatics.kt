import ModelBatchBaseStatics.method1130
import HostPingThreadStatics.method1301
import VorbisOggDecoderStatics.method2967
import CharacterRenderStateStatics.method2782
import ChatMessageStreamStatics.method136

object ModelGroundDecorStatics {
    var anInt10004: Int = 0
            var anInt10005: Int = 0
            var anInt10006: Int = 0
            var anInt10007: Int = 0
            var anInt10008: Int = 0
            var anInt10009: Int = 0
            var aClass348_Sub42_Sub17Array10010: Array<TextureMaterialGroup?>? = arrayOfNulls<TextureMaterialGroup>(14)
            var anInt10011: Int = 0
            var anInt10012: Int = 0
            var anInt10013: Int = 0
            var anInt10016: Int = 0
            var anInt10018: Int = 0
            var anInt10020: Int = 0
            var anInt10021: Int = 0
            var anInt10022: Int = 0
            var anInt10023: Int = -60
            var anInt10026: Int = 0
            var anInt10027: Int = 0
            var anInt10029: Int = 0
            var anInt10030: Int = 0
            var anInt10031: Int = 0
            var anInt10033: Int = 0
            var anInt10034: Int = 0
            var anInt10035: Int = 0
            var anInt10037: Int = 0
    
            @JvmStatic
            fun method2415(i: Int) {
                aClass348_Sub42_Sub17Array10010 = null
                val i_15_ = 93 / ((i - -62) / 35)
            }
    
            @JvmStatic
            fun method2418(string: String, i: Byte): Int {
                anInt10011++
                val i_22_ = -51 / ((i - 3) / 42)
                val i_23_ = string.length
                var i_24_ = 0
                var i_25_ = 0
                while (i_23_ > i_25_) {
                    i_24_ = string.get(i_25_).code + ((i_24_ shl 5) + -i_24_)
                    i_25_++
                }
                return i_24_
            }
    
            @JvmStatic
            fun method2419(i: Byte, i_26_: Int): Int {
                anInt10018++
                if (i < 122) return -49
                return i_26_ ushr 8
            }
}
