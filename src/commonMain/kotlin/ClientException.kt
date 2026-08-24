/* Exception_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
public class ClientException : Exception() {
    companion object {


        var anInt109: Int = 0

        var anIntArray110: IntArray? = IntArray(4096)

        var anIntArrayArray111: Array<IntArray?>? = arrayOf<IntArray?>(intArrayOf(0, 2, 4, 6), intArrayOf(6, 0, 2, 4), intArrayOf(6, 0, 2), intArrayOf(2, 6, 0), intArrayOf(0, 2, 6), intArrayOf(6, 0, 2), intArrayOf(5, 6, 0, 1, 2, 4), intArrayOf(7, 2, 4, 4), intArrayOf(2, 4, 4, 7), intArrayOf(6, 6, 4, 0, 2, 2), intArrayOf(0, 2, 2, 6, 6, 4), intArrayOf(0, 2, 2, 4, 6, 6), intArrayOf(0, 2, 4, 6))

        var aModelHeaderCache_112: ModelHeaderCache? = null


        @JvmStatic
        fun method140(i: Byte) {
            aModelHeaderCache_112 = null
            anIntArray110 = null
            if (i.toInt() == -126) anIntArrayArray111 = null
        }

        @JvmStatic
        fun method141(widgetComponent: WidgetComponent, i: Byte): WidgetComponent? {
            anInt109++
            val i_0_ = 98 / ((i - -14) / 41)
            var class46_1_ = Client.method108(widgetComponent)
            if (class46_1_ == null) class46_1_ = widgetComponent.aWidgetComponent_782
            return class46_1_
        }
    }
}
