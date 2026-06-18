import ConfigFlagUtil.Companion.method1916
import CompassSmoother.Companion.method2017
import ActiveMapRegion.method769

/* Class348_Sub42_Sub4 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ShortMatrixNode internal constructor(var aShortArrayArray9518: Array<ShortArray?>, var aDouble9512: Double) : HashLinkedListNode() {
    fun method3182(i: Int): Long {
        if (i < 76) anInt9515 = 111
        anInt9510++
        return ((this.aShortArrayArray9518).size shl 0 or (this.aShortArrayArray9518[0])!!.size).toLong()
    }

    companion object {
        var anInt9510: Int = 0
        var anInt9511: Int = 0
        var anInt9513: Int = 0
        var anInt9514: Int = 0
        var anInt9515: Int = 0
        var aFloat9516: Float = 0f
        var aDouble9517: Double = 0.0
        var anIntArray9519: IntArray? = IntArray(2)

        fun method3180(i: Int, widgetComponents: Array<WidgetComponent?>, i_0_: Int) {
            if (i_0_ == 24235) {
                for (i_1_ in widgetComponents.indices) {
                    val class46 = widgetComponents[i_1_]
                    if (class46 != null && i == class46.anInt834 && !Client.method111(class46)) {
                        if (class46.anInt774 == 0) {
                            method3180(class46.anInt830, widgetComponents, 24235)
                            if (class46.aWidgetComponentArray798 != null) Companion.method3180(class46.anInt830, class46.aWidgetComponentArray798!!, i_0_)
                            val class348_sub41 = ((MinimapSpriteRenderer.aHashtable_4915!!.method3480(class46.anInt830.toLong(), -6008)) as RegionSceneShifter?)
                            if (class348_sub41 != null) method769(class348_sub41.anInt7050, 116.toByte())
                        }
                        if (class46.anInt774 == 6 && class46.anInt699 != -1) {
                            val class17 = ParticleEmitterNode.aClass87_191!!.method835(class46.anInt699, 7)
                            if (class17 != null) {
                                class46.anInt841 += DisplaySettingsConfig.anInt7267
                                val i_2_ = class46.anInt795
                                while (class46.anInt841 > (class17.anIntArray267!![class46.anInt795])) {
                                    class46.anInt841 -= (class17.anIntArray267!![class46.anInt795])
                                    class46.anInt795++
                                    if (class46.anInt795 >= (class17.anIntArray237).size) {
                                        class46.anInt795 -= class17.anInt238
                                        if (class46.anInt795 < 0 || (class46.anInt795 >= (class17.anIntArray237).size)) class46.anInt795 = 0
                                    }
                                    class46.anInt730 = 1 + class46.anInt795
                                    if (class46.anInt730 >= class17.anIntArray237.size) {
                                        class46.anInt730 -= class17.anInt238
                                        if (class46.anInt730 < 0 || ((class17.anIntArray237).size <= class46.anInt730)) class46.anInt730 = -1
                                    }
                                    method1916(-9343, class46)
                                }
                                if (i_2_ != class46.anInt795) method2017((class46.anInt795), class17, 98)
                            }
                        }
                    }
                }
                anInt9514++
            }
        }

        @JvmStatic
        fun method3181(i: Byte) {
            if (i.toInt() != 2) anInt9511 = 63
            anIntArray9519 = null
        }
    }
}
