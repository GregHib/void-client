import SpriteSheetCacheStatics.method1428
import IndexedSpriteStatics.method163
import java.awt.Color
import java.awt.Font
import java.awt.FontMetrics
import java.awt.Image

object LoadingBarRendererStatics {
    var anInt5025: Int = 0
            var anInt5027: Int = 0
            var anInt5028: Int = 0
            var anInt5031: Int = 0
            var anInt5033: Int = 0
            var anInt5038: Int = 0
            var anInt5039: Int = 0
            var anInt5043: Int = 0
            var anInt5044: Int = 0
            var anInt5048: Int = 0
            var anInt5049: Int = 0
            var anInt5052: Int = 0
            var anInt5055: Int = 0
            var aFontMetaRef_5057: FontMetaRef? = FontMetaRef(10, -1)
            @JvmField
            var aPlayerArray5058: Array<Player?>? = arrayOfNulls<Player>(2048)
            @JvmField
            var aMapTileShapeArray5060: Array<MapTileShape?>? = null
            var anInt5061: Int = 0
    
            @JvmStatic
            fun method2214(i: Int) {
                aFontMetaRef_5057 = null
                if (i != 0) aPlayerArray5058 = null
                aMapTileShapeArray5060 = null
                aPlayerArray5058 = null
            }
    
            fun method2217(i: Int, i_3_: Int, i_4_: Int): Boolean {
                anInt5027++
                if (i_4_ != 0) aMapTileShapeArray5060 = null
                return (i_3_ and 0x21) != 0
            }
}
