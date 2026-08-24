import ChatEffectsOptionState.Companion.method1728

/* Class251 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ConfigFlagUtil {
    override fun toString(): String {
        anInt3230++
        throw IllegalStateException()
    }

    companion object {
        var anInt3229: Int = 0
        var anInt3230: Int = 0
        var anInt3231: Int = 0

        var aFontMetaRef_3232: FontMetaRef? = FontMetaRef(51, 3)
        var anInt3233: Int = 0

        var anInt3234: Int = 0
        var anInt3235: Int = 0
        var anInt3236: Int = 0

        @JvmStatic
        fun method1912(i: Int) {
            if (i == 8549) aFontMetaRef_3232 = null
        }

        @JvmStatic
        fun method1913(bool: Boolean, i: Int, widgetComponent: WidgetComponent) {
            anInt3235++
            val i_0_ = -40 % ((-35 - i) / 51)
            val i_1_ = (if (widgetComponent.anInt698 == 0) widgetComponent.anInt709 else widgetComponent.anInt698)
            val i_2_ = (if (widgetComponent.anInt791 != 0) widgetComponent.anInt791 else widgetComponent.anInt789)
            NullRenderPass.method3534(false, widgetComponent.anInt830, i_1_, bool, i_2_, (WarpTextureNode.aWidgetComponentArrayArray9427!![(widgetComponent.anInt830 shr 16)]!!))
            if (widgetComponent.aWidgetComponentArray798 != null) NullRenderPass.method3534(false, widgetComponent.anInt830, i_1_, bool, i_2_, widgetComponent.aWidgetComponentArray798!!)
            val class348_sub41 = (MinimapSpriteRenderer.aHashtable_4915!!.method3480(widgetComponent.anInt830.toLong(), -6008) as RegionSceneShifter?)
            if (class348_sub41 != null) method1728(i_2_, -1, (class348_sub41.anInt7050), bool, i_1_)
        }

        fun method1914(i: Int, i_3_: Int): Int {
            anInt3231++
            return i_3_ and 0xff
        }

        @JvmStatic
        fun method1915(i: Byte, i_4_: Int): Boolean {
            if (i.toInt() != 4) return false
            anInt3233++
            return i_4_ != 1 && i_4_ != 7
        }

        @JvmStatic
        fun method1916(i: Int, widgetComponent: WidgetComponent) {
            anInt3229++
            if (widgetComponent.anInt794 == DirectionPath.anInt1064) OpenGlModel.aBooleanArray2076!![widgetComponent.anInt760] = true
            if (i != -9343) method1914(-107, 120)
        }
    }
}
