import kotlin.jvm.JvmStatic
/* Class148 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WidgetNodeLink {

    var aWidgetNodeLink_2038: WidgetNodeLink? = null

    var aClass318_Sub1_Sub3_2040: GroundDecorEntity? = null
    fun method1199(i: Byte) {
        anInt2043++
        if (i.toInt() == -106 && OpenGlRenderer.anInt7722 < 500) {
            this.aClass318_Sub1_Sub3_2040 = null
            this.aWidgetNodeLink_2038 = SceneTilePlaneManager.aWidgetNodeLink_231
            SceneTilePlaneManager.aWidgetNodeLink_231 = this
            OpenGlRenderer.anInt7722++
        }
    }

    companion object {

        var anInt2037: Int = 0

        var anIntArray2039: IntArray? = intArrayOf(1, 0, -1, 0)
        var anInt2041: Int = 0
        var aSingletonMarker_2042: SingletonMarker? = SingletonMarker()
        var anInt2043: Int = 0

        @JvmStatic
        fun method1197(i: Int, i_0_: Int): Boolean {
            if (i != -12081) return true
            anInt2041++
            if (i_0_ == 21 || i_0_ == 10 || i_0_ == 47 || i_0_ == 22 || i_0_ == 5) return true
            return i_0_ == 49 || i_0_ == 1010
        }

        @JvmStatic
        fun method1198(i: Int) {
            if (i == 1010) {
                anIntArray2039 = null
                aSingletonMarker_2042 = null
            }
        }
    }
}
