import SoundBankPatchStatics.method2929

object HashtableStatics {
    var anInt4375: Int = 0
            var anInt4376: Int = 0
            var anInt4378: Int = 0
            var anInt4379: Int = 0
            var anInt4380: Int = 0
            var anInt4381: Int = 0
            var anInt4382: Int = 0
            @JvmField
            var anInt4383: Int = 0
            var anInt4384: Int = 0
            var anInt4386: Int = 0
            var anInt4387: Int = 0
            var aIntRange_4388: IntRange? = IntRange(3, 3)
            @JvmStatic
            fun method3478(bool: Boolean) {
                aIntRange_4388 = null
                if (bool != false) anInt4383 = 67
            }
    
            fun method3479(i: Int): CameraSplineNode? {
                anInt4378++
                if (i != -1) anInt4383 = 43
                if (MapRegionLoaderStatics.aNodeDeque_1254 == null || RenderNodeStatics.aWidgetRedrawTracker_9716 == null) return null
                var class348_sub21 = RenderNodeStatics.aWidgetRedrawTracker_9716!!.method2329(10) as CameraSplineNode?
                while (class348_sub21 != null) {
                    val class42 = MapRegionLoaderStatics.aConfigDefinitionLoader_1238!!.method1225(class348_sub21.anInt6847, 92.toByte())
                    if (class42 != null && class42.aBoolean609 && class42.method373(MapRegionLoaderStatics.anVarResolver_1244!!, 127)) return class348_sub21
                    class348_sub21 = RenderNodeStatics.aWidgetRedrawTracker_9716!!.method2329(i xor 0xa.inv()) as CameraSplineNode?
                }
                return null
            }
}
