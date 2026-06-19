import NpcSummaryDefinitionStatics.method1166
import RefCountedHandleStatics.method1320
import MapSceneDefLoaderStatics.method1394
import LoadingScreenStateStatics.method1457
import GraphicsOptionStateStatics.method1709
import GlTexture2DStatics.method1968
import WallEntityStatics.method2483
import FontStatics.method2570
import TimedRecordAccessorStatics.method3313
import FixedFunctionWaterPassStatics.method3547
import WorldMapPolygonIconLabelStatics.method3576
import DirectionPathStatics.method536
import NpcTypeStatics.method802
import WidgetCacheStatics.method837

object WorldMapSceneStatics {
    var anInt3102: Int = 0
            @JvmField
            var aBoolean3103: Boolean = false
            var anInt3105: Int = 0
            var anInt3106: Int = 0
            var anInt3107: Int = 0
            var anInt3110: Int = 0
            var anInt3111: Int = 0
            var anInt3112: Int = 0
            var anInt3115: Int = 0
            var anInt3116: Int = 0
            var anInt3118: Int = 0
            var anInt3121: Int = 0
            var anInt3125: Int = 0
            var anInt3127: Int = 0
            var anInt3131: Int = 0
    
            @JvmStatic
            fun method1677(i: Int, i_164_: Int): HudTabPanel? {
                anInt3116++
                val hudTabPanels: Array<HudTabPanel?> = method1709(-126)
                if (i >= -111) return null
                for (i_165_ in hudTabPanels.indices) {
                    val class231 = hudTabPanels[i_165_]!!
                    if (class231.anInt2995 == i_164_) return class231
                }
                return null
            }
    
            fun method1686(i: Int) {
                val i_308_ = -110 / ((i - -74) / 44)
                if (TextureMapImageNodeStatics.anInt9372 > 1) IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub17_7263), 4)
                else IntHashSetStatics.aClass348_Sub51_3959!!.method3429(74.toByte(), (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub17_7263), 2)
                anInt3106++
            }
    
            fun method1687(widgetComponent: WidgetComponent, i: Int): WidgetComponent? {
                if (i != 3) method1686(-21)
                anInt3110++
                if (widgetComponent.anInt834 != -1) return method2570(1512932720, widgetComponent.anInt834)
                val i_309_ = widgetComponent.anInt830 ushr 16
                val mapElementLookup = MapElementLookup(MinimapSpriteRendererStatics.aHashtable_4915!!)
                var class348_sub41 = mapElementLookup.method2644(123.toByte()) as RegionSceneShifter?
                while (class348_sub41 != null) {
                    if (i_309_ == class348_sub41.anInt7050) return method2570(1512932720, (class348_sub41.aLong4291).toInt())
                    class348_sub41 = mapElementLookup.method2646(117.toByte()) as RegionSceneShifter?
                }
                return null
            }
}
