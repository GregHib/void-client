import CircleRasterizerStatics.method2253
import jagex3.jagmisc.jagmisc.ping
import java.net.InetAddress

object HostPingThreadStatics {
    var anInt2257: Int = 0
            @JvmField
            var aAbstractModelRendererArray2260: Array<AbstractModelRenderer?>? = null
            @JvmField
            var aWorldListEntryArray2261: Array<WorldListEntry?>? = null
            var anInt2262: Int = 0
            var anInt2263: Int = 0
            @JvmField
            var anInt2264: Int = 0
            @JvmField
            var anInt2265: Int = method2253(1600, 124)
            var anInt2266: Int = 0
    
            @JvmStatic
            fun method1300(i: Byte) {
                if (i < -127) {
                    aAbstractModelRendererArray2260 = null
                    aWorldListEntryArray2261 = null
                }
            }
    
            @JvmStatic
            fun method1301(var_renderNode: RenderNode?, i: Int, i_0_: Int, i_1_: Int, bools: BooleanArray?) {
                if (NativeSpriteStatics.aTerrainTileArray5191 != SoundCacheState.aTerrainTileArray4142) {
                    val i_2_ = TerrainTileShapeStatics.aTerrainTileArray8801!![i]!!.method3986(i_0_, i_1_, (-93).toByte())
                    for (i_3_ in 0..i) {
                        if (bools == null || bools[i_3_]) {
                            val var_s = TerrainTileShapeStatics.aTerrainTileArray8801!![i_3_]
                            if (var_s != null) var_s.wa(var_renderNode, i_0_, i_2_ - var_s.method3986(i_0_, i_1_, (-103).toByte()), i_1_, 0, false)
                        }
                    }
                }
            }
}
