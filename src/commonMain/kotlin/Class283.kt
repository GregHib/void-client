/* Class283 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class283 {
    var anInt3657: Int = 0
    var aString3663: String? = null

    companion object {
        var anInt3656: Int = 0
        var aFloatArray3658: FloatArray? = FloatArray(2)
        var anIntArray3659: IntArray?
        var aLong3660: Long = 0
        var anIntArray3661: IntArray? = intArrayOf(8, 11, 4, 6, 9, 7, 10, 0)
        var anInt3662: Int = 0
        @JvmStatic
        fun method2113(i: Byte) {
            anIntArray3659 = null
            anIntArray3661 = null
            if (i.toInt() != 74) Companion.method2113((-2).toByte())
            aFloatArray3658 = null
        }

        @JvmStatic
        fun method2114(i: Int, bool: Boolean): Boolean {
            anInt3656++
            if (bool != true) method2114(90, true)
            return i == 3 || i == 5 || i == 6
        }

        init {
            anIntArray3659 = intArrayOf(0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4)
        }
    }
}
