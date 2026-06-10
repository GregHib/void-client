/* Class148 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class148 {
    @JvmField
    var aClass148_2038: Class148? = null
    @JvmField
    var aClass318_Sub1_Sub3_2040: Class318_Sub1_Sub3? = null
    fun method1199(i: Byte) {
        anInt2043++
        if (i.toInt() == -106 && ha_Sub2.anInt7722 < 500) {
            this.aClass318_Sub1_Sub3_2040 = null
            this.aClass148_2038 = Class16.aClass148_231
            Class16.aClass148_231 = this
            ha_Sub2.anInt7722++
        }
    }

    companion object {
        @JvmField
        var anInt2037: Int = 0
        @JvmField
        var anIntArray2039: IntArray? = intArrayOf(1, 0, -1, 0)
        var anInt2041: Int = 0
        var aClass196_2042: Class196? = Class196()
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
                aClass196_2042 = null
            }
        }
    }
}
