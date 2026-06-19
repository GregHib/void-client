import java.lang.Byte
import java.lang.Double
import java.lang.Float
import java.lang.Long
import java.lang.Short
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.IntArray
import kotlin.String
import kotlin.Throws

object ColorThresholdEffectStatics {
    @JvmField
            var anInt9085: Int = 0
            @JvmField
            var anInt9087: Int = 0
            @JvmField
            var anInt9088: Int = 0
            var aFontMetaRef_9089: FontMetaRef? = FontMetaRef(2, 6)
            @JvmField
            var aSpriteImage_9090: SpriteImage? = null
            @JvmField
            var anInt9093: Int = 0
            @JvmStatic
            fun method3050(bool: Boolean) {
                aFontMetaRef_9089 = null
                aSpriteImage_9090 = null
                if (bool != true) method3050(true)
            }
    
            @JvmStatic
            fun method3051(i: Int, i_3_: Int): Int {
                if (i_3_ != 4096) return -68
                anInt9085++
                var i_4_ = i ushr 1
                i_4_ = i_4_ or (i_4_ ushr 1)
                i_4_ = i_4_ or (i_4_ ushr 2)
                i_4_ = i_4_ or (i_4_ ushr 4)
                i_4_ = i_4_ or (i_4_ ushr 8)
                i_4_ = i_4_ or (i_4_ ushr 16)
                return (i_4_.inv()) and i
            }
    
            @Throws(ClassNotFoundException::class)
            fun method3052(i: Int, string: String?): Class<*> {
                if (i != 11012) aFontMetaRef_9089 = null
                anInt9088++
                if (string == "B") return Byte.TYPE
                if (string == "I") return Integer.TYPE
                if (string == "S") return Short.TYPE
                if (string == "J") return Long.TYPE
                if (string == "Z") return java.lang.Boolean.TYPE
                if (string == "F") return Float.TYPE
                if (string == "D") return Double.TYPE
                if (string == "C") return Character.TYPE
                return Class.forName(string)
            }
}
