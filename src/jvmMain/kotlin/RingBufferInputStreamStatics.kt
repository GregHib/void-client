import java.io.EOFException
import java.io.IOException
import java.io.InputStream

object RingBufferInputStreamStatics {
    @JvmField
            var anInt4547: Int = 0
            @JvmField
            var anInt4549: Int = 0
            @JvmField
            var anInt4550: Int = 0
            @JvmField
            var anInt4551: Int = 0
            @JvmField
            var anInt4552: Int = 0
            @JvmField
            var anInt4553: Int = 0
            @JvmField
            var anInt4555: Int = 0
            @JvmField
            var anInt4559: Int = 0
            @JvmStatic
            fun method3616(i: Int) {
                anInt4549++
                if (LoadProgressCountersStatics.anCursorControllerArray2447 != null) {
                    val interface16s = LoadProgressCountersStatics.anCursorControllerArray2447!!
                    for (i_0_ in interface16s.indices) {
                        val interface16 = interface16s[i_0_]
                        interface16!!.method57(108)
                    }
                }
                if (i != 12639) anInt4559 = 72
            }
    
            @JvmStatic
            fun method3620(class318_sub1_sub3: GroundDecorEntity?, i: Int): WidgetNodeLink {
                if (i < 9) anInt4559 = -27
                anInt4547++
                val widgetNodeLink: WidgetNodeLink
                if (SceneTilePlaneManager.aWidgetNodeLink_231 != null) {
                    widgetNodeLink = SceneTilePlaneManager.aWidgetNodeLink_231!!
                    SceneTilePlaneManager.aWidgetNodeLink_231 = SceneTilePlaneManager.aWidgetNodeLink_231!!.aWidgetNodeLink_2038
                    widgetNodeLink.aWidgetNodeLink_2038 = null
                    OpenGlRendererStatics.anInt7722--
                } else widgetNodeLink = WidgetNodeLink()
                widgetNodeLink.aClass318_Sub1_Sub3_2040 = class318_sub1_sub3
                return widgetNodeLink
            }
}
