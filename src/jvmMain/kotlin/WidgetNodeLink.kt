import WidgetNodeLinkStatics.anInt2043

/* Class148 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WidgetNodeLink {
    @JvmField
    var aWidgetNodeLink_2038: WidgetNodeLink? = null
    @JvmField
    var aClass318_Sub1_Sub3_2040: GroundDecorEntity? = null
    fun method1199(i: Byte) {
        anInt2043++
        if (i.toInt() == -106 && OpenGlRendererStatics.anInt7722 < 500) {
            this.aClass318_Sub1_Sub3_2040 = null
            this.aWidgetNodeLink_2038 = SceneTilePlaneManager.aWidgetNodeLink_231
            SceneTilePlaneManager.aWidgetNodeLink_231 = this
            OpenGlRendererStatics.anInt7722++
        }
    }
}
