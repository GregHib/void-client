/* Exception_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
public class Exception_Sub1 : Exception() {
    companion object {

        @JvmField
        var anInt109: Int = 0
        @JvmField
        var anIntArray110: IntArray? = IntArray(4096)
        @JvmField
        var anIntArrayArray111: Array<IntArray?>? = arrayOf<IntArray?>(intArrayOf(0, 2, 4, 6), intArrayOf(6, 0, 2, 4), intArrayOf(6, 0, 2), intArrayOf(2, 6, 0), intArrayOf(0, 2, 6), intArrayOf(6, 0, 2), intArrayOf(5, 6, 0, 1, 2, 4), intArrayOf(7, 2, 4, 4), intArrayOf(2, 4, 4, 7), intArrayOf(6, 6, 4, 0, 2, 2), intArrayOf(0, 2, 2, 6, 6, 4), intArrayOf(0, 2, 2, 4, 6, 6), intArrayOf(0, 2, 4, 6))
        @JvmField
        var aClass255_112: Class255? = null


        @JvmStatic
        fun method140(i: Byte) {
            aClass255_112 = null
            anIntArray110 = null
            if (i.toInt() == -126) anIntArrayArray111 = null
        }

        @JvmStatic
        fun method141(class46: Class46, i: Byte): Class46? {
            anInt109++
            val i_0_ = 98 / ((i - -14) / 41)
            var class46_1_ = Client.method108(class46)
            if (class46_1_ == null) class46_1_ = class46.aClass46_782
            return class46_1_
        }
    }
}
