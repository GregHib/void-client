import Font.Companion.method2570
import HslColorTableNode.Companion.method2769

/* Class348_Sub40_Sub19 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class BlankTextureNode : AbstractProceduralTextureNode(0, true) {
    override fun method3042(i: Int, i_3_: Int): IntArray? {
        if (i_3_ != 255) aIntRange_9254 = null
        anInt9256++
        return SceneEffectMarker.anIntArray6432
    }

    companion object {
        @JvmField
        var anInt9253: Int = 0
        @JvmField
        var aIntRange_9254: IntRange? = IntRange(73, 3)
        @JvmField
        var anInt9255: Int = 0
        @JvmField
        var anInt9256: Int = 0
        @JvmField
        var aIntRange_9257: IntRange?
        @JvmField
        var anInt9258: Int = 0
        @JvmField
        var anIntArray9259: IntArray? = IntArray(2)

        /*synthetic*/
        var aClass9260: Class<*>? = null

        fun method3097(widgetComponents: Array<WidgetComponent?>, i: Int, i_0_: Int) {
            if (i_0_ >= 116) {
                var i_1_ = 0
                while (widgetComponents.size > i_1_) {
                    val class46 = widgetComponents[i_1_]
                    if (class46 != null) {
                        if (class46.anInt774 == 0) {
                            if (class46.aWidgetComponentArray798 != null) method3097(class46.aWidgetComponentArray798!!, i, 125)
                            val class348_sub41 = ((MinimapSpriteRenderer.aHashtable_4915!!.method3480(class46.anInt830.toLong(), -6008)) as RegionSceneShifter?)
                            if (class348_sub41 != null) BloomGraphicsOptionState.method1775((-8).toByte(), (class348_sub41.anInt7050), i)
                        }
                        if (i == 0 && class46.anObjectArray840 != null) {
                            val class348_sub36 = WidgetActionEntry()
                            class348_sub36.aWidgetComponent_6989 = class46
                            class348_sub36.anObjectArray6987 = class46.anObjectArray840
                            ChatCommandProcessor.method705(class348_sub36)
                        }
                        if (i == 1 && class46.anObjectArray701 != null) {
                            if (class46.anInt704 >= 0) {
                                val class46_2_ = method2570(1512932720, (class46.anInt830))
                                if (class46_2_ == null || (class46_2_.aWidgetComponentArray798 == null) || (class46.anInt704 >= (class46_2_.aWidgetComponentArray798!!).size) || class46 != (class46_2_.aWidgetComponentArray798!![class46.anInt704])) {
                                    i_1_++
                                    continue
                                }
                            }
                            val class348_sub36 = WidgetActionEntry()
                            class348_sub36.aWidgetComponent_6989 = class46
                            class348_sub36.anObjectArray6987 = class46.anObjectArray701
                            ChatCommandProcessor.method705(class348_sub36)
                        }
                    }
                    i_1_++
                }
                anInt9258++
            }
        }

        @JvmStatic
        fun method3098(i: Int, string: String?): Boolean {
            if (i != -30282) return true
            anInt9255++
            if (aClass9260 == null) {
                aClass9260 = RegionMapDecoder::class.java
            }
            return method2769(aClass9260, 20.toByte(), string)
        }

        @JvmStatic
        fun method3099(i: Byte) {
            aIntRange_9254 = null
            aIntRange_9257 = null
            anIntArray9259 = null
            if (i >= -63) anIntArray9259 = null
        }

        @JvmStatic
        fun method3100(i: Int, bool: Boolean, i_4_: Int): Boolean {
            anInt9253++
            if (bool != false) anIntArray9259 = null
            return SceneProjector.method1637(i, 32768, i_4_) or ((0x800 and i_4_) != 0) || BoundsConstraintEntry.method2056(i_4_, 86, i)
        }

        init {
            aIntRange_9257 = IntRange(102, 3)
        }
    }
}
