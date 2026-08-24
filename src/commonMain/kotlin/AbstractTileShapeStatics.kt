import kotlin.jvm.JvmStatic
object AbstractTileShapeStatics {

    var anIntArray6547: IntArray? = null

    var anInt6551: Int = 0

    var anInt6555: Int = 0

    var aBoolean6558: Boolean = false

    var aMapSceneDefLoader_6559: MapSceneDefLoader? = null

    var anInt6560: Int = 0

    var aWidgetComponent_6561: WidgetComponent? = null

    @JvmStatic
    fun method2718(i: Int) {
        if (i >= -95) method2719(90)
        anInt6560++
        if (GroundDecorOptionState.anInt5976 != -1) {
            ModelDataCache.method298(false, -1, -1, GroundDecorOptionState.anInt5976, -67)
            GroundDecorOptionState.anInt5976 = -1
        }
    }

    @JvmStatic
    fun method2719(i: Int) {
        if (i != 11339) method2719(87)
        aWidgetComponent_6561 = null
        anIntArray6547 = null
        aMapSceneDefLoader_6559 = null
    }
}