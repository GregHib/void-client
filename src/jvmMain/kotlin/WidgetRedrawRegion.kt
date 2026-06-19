
/*
 * Class342
 */
class WidgetRedrawRegion internal constructor(var anInt4245: Int, var anInt4244: Int) {
    var anInt4238: Int = 0
    var anInt4239: Int = 0
    var anInt4240: Int = 0
    var aWidgetRedrawRegion_4248: WidgetRedrawRegion? = null
    var aAbstractCameraTransform_4252: AbstractCameraTransform? = null
    fun method2685(i: Byte): SpotAnimVector {
        anInt4243++
        return SpotAnimDefCache.method1943(false, this.anInt4245)
    }

    fun method2687(i: Byte, i_11_: Int): WidgetRedrawRegion? {
        anInt4241++
        if (i < 61) return null
        return WidgetRedrawRegion(this.anInt4245, i_11_)
    }

    companion object {
        var anInt4241: Int = 0
        var anInt4243: Int = 0
    }
}
