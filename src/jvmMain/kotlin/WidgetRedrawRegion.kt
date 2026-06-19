import SpotAnimDefCache.method1943
import NodeDequeStatics.method1992
import PositionedSceneNodeStatics.method2519
import java.awt.Image
import WidgetRedrawRegionStatics.method2683
import WidgetRedrawRegionStatics.anInt4241
import WidgetRedrawRegionStatics.anInt4243

/*
 * Class342
 */
class WidgetRedrawRegion internal constructor(var anInt4245: Int, var anInt4244: Int) {
    @JvmField
    var anInt4238: Int = 0
    @JvmField
    var anInt4239: Int = 0
    @JvmField
    var anInt4240: Int = 0
    var aWidgetRedrawRegion_4248: WidgetRedrawRegion? = null
    @JvmField
    var aAbstractCameraTransform_4252: AbstractCameraTransform? = null
    fun method2685(i: Byte): SpotAnimVector {
        if (i.toInt() != -13) method2683(null, null, -120, 35, -33, null, 90, 71, null)
        anInt4243++
        return method1943(false, this.anInt4245)
    }

    fun method2687(i: Byte, i_11_: Int): WidgetRedrawRegion? {
        anInt4241++
        if (i < 61) return null
        return WidgetRedrawRegion(this.anInt4245, i_11_)
    }
}
