import java.util.*
import kotlin.math.max
import kotlin.math.min

object TurbulenceTextureNodeStatics {
    @JvmField
            var aBoolean9307: Boolean = true
            @JvmField
            var anInt9308: Int = 0
            @JvmField
            var anInt9309: Int = 0
            @JvmField
            var anInt9313: Int
            @JvmField
            var anInt9315: Int = 0
            @JvmField
            var anInt9316: Int = 0
            @JvmField
            var aClass348_Sub22Array9319: Array<NpcReference?>? = arrayOfNulls<NpcReference>(1024)
            @JvmField
            var anInt9321: Int = 0
            @JvmStatic
            fun method3113(c: Char, bool: Boolean, string: String): Array<String?> {
                anInt9315++
                val i = CharCountUtil.method257(4, string, c)
                val strings = arrayOfNulls<String>(i - -1)
                var i_37_ = 0
                var i_38_ = 0
                if (bool != true) method3114((-76).toByte())
                for (i_39_ in 0..<i) {
                    var i_40_: Int
                    i_40_ = i_38_
                    while (string.get(i_40_) != c) {
                        i_40_++
                    }
                    strings[i_37_++] = string.substring(i_38_, i_40_)
                    i_38_ = 1 + i_40_
                }
                strings[i] = string.substring(i_38_)
                return strings
            }
    
            @JvmStatic
            fun method3114(i: Byte) {
                aClass348_Sub22Array9319 = null
                if (i > -63) method3114((-91).toByte())
            }
    
            init {
                anInt9313 = 0
            }
}
