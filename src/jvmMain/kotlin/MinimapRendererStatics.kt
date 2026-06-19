import ClientExceptionStatics.method141

object MinimapRendererStatics {
    @JvmField
            var anInt1577: Int = 0
            @JvmField
            var aBufferedRandomAccessFileArray1579: Array<BufferedRandomAccessFile?>? = arrayOfNulls(37)
            @JvmField
            var anInt1580: Int = 0
            @JvmField
            var anIntArray1583: IntArray? = IntArray(14)
            @JvmField
            var aHashtable_1585: Hashtable? = Hashtable(16)
            @JvmField
            var anInt1587: Int = 0
            @JvmField
            var anInt1589: Int = 0
            @JvmField
            var anInt1590: Int = 0
            var aBoxedIntHolder_1591: BoxedIntHolder? = BoxedIntHolder(1)
            @JvmStatic
            fun method886(i: Int) {
                aHashtable_1585 = null
                aBufferedRandomAccessFileArray1579 = null
                if (i != 16) aBufferedRandomAccessFileArray1579 = null
                anIntArray1583 = null
                aBoxedIntHolder_1591 = null
            }
    
            @JvmStatic
            fun method887(widgetComponent: WidgetComponent?, i: Int, i_5_: Int, i_6_: Int) {
                if (i_6_ == 2147483647) {
                    anInt1589++
                    if (RegionSceneLoader.aWidgetComponent_3701 == null && !ScrollbarComponentStatics.aBoolean8335 && (widgetComponent != null && (method141(widgetComponent, ((-79).toByte()).toByte()) != null))) {
                        RegionSceneLoader.aWidgetComponent_3701 = widgetComponent
                        CalendarUtil.aWidgetComponent_4130 = method141(widgetComponent, ((-117).toByte()).toByte())
                        SceneEntityStatics.anInt6392 = 0
                        ModelDefinitionCacheStatics.anInt2872 = i_5_
                        SceneEntityModelStatics.anInt6411 = i
                        ParticleConfigParserStatics.aBoolean3819 = false
                    }
                }
            }
    
            fun method888(i: Byte, i_7_: Int, widgetComponent: WidgetComponent): Int {
                anInt1580++
                if (i.toInt() != 57) method886(7)
                if (!ClientStatics.method105(widgetComponent)!!.method3301(i_7_, false) && widgetComponent.anObjectArray741 == null) return -1
                if (widgetComponent.anIntArray706 != null && i_7_ < widgetComponent.anIntArray706!!.size) return widgetComponent.anIntArray706!![i_7_]
                return -1
            }
}
