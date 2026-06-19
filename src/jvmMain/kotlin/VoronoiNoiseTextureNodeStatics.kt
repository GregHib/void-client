import java.util.*
import kotlin.math.max
import kotlin.math.sqrt

object VoronoiNoiseTextureNodeStatics {
    @JvmField
            var anInt9120: Int = 0
            @JvmField
            var aBoolean9121: Boolean = false
            @JvmField
            var anInt9123: Int = 0
            @JvmField
            var anInt9126: Int = 0
            @JvmField
            var anInt9127: Int = 0
            @JvmField
            var anInt9128: Int = 0
            @JvmField
            var aFontMetaRef_9130: FontMetaRef? = FontMetaRef(1, -1)
    
            @JvmStatic
            fun method3059(i: Int) {
                aFontMetaRef_9130 = null
                if (i >= -111) method3059(-83)
            }
    
            @JvmStatic
            fun method3060(i: Int, bool: Boolean): Int {
                anInt9128++
                if (bool != true) aFontMetaRef_9130 = null
                return 0x7f and (i shr 11)
            }
}
