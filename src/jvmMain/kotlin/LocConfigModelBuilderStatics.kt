object LocConfigModelBuilderStatics {
    @JvmField
            var anInt4486: Int = 0
            @JvmField
            var anInt4491: Int = 0
            @JvmField
            var anInt4493: Int = 0
            @JvmField
            var anInt4494: Int = 0
            @JvmField
            var anInt4495: Int = 0
            @JvmField
            var anInt4496: Int = 0
            @JvmField
            var anInt4497: Int = 0
            @JvmField
            var aIntRange_4500: IntRange? = IntRange(117, 1)
            @JvmField
            var anInt4505: Int = 0
            @JvmField
            var anInt4509: Int = 0
            @JvmField
            var anInt4510: Int = 0
            @JvmField
            var anInt4511: Int = 0
            @JvmStatic
            fun method3560(i: Int) {
                if (i != -13) method3563(-34, 21.toByte(), -111)
                aIntRange_4500 = null
            }
    
            @JvmStatic
            fun method3561(i: Int, widgetComponent: WidgetComponent, bool: Boolean): String? {
                anInt4495++
                if (bool != true) method3560(68)
                if (!ClientStatics.method105(widgetComponent)!!.method3301(i, !bool) && widgetComponent.anObjectArray741 == null) return null
                if (widgetComponent.aStringArray833 == null || (i >= widgetComponent.aStringArray833!!.size) || widgetComponent.aStringArray833!![i] == null || widgetComponent.aStringArray833!![i]!!.trim { it <= ' ' }.length == 0) {
                    if (TextureCubeProviderStatics.aBoolean6327) return "Hidden-" + i
                    return null
                }
                return widgetComponent.aStringArray833!![i]
            }
    
            @JvmStatic
            fun method3563(i: Int, i_9_: Byte, i_10_: Int): Boolean {
                anInt4493++
                if (i_9_.toInt() != 56) method3563(-107, 118.toByte(), 32)
                return (i and 0x800) != 0
            }
}
