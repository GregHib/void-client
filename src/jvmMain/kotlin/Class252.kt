/* Class252 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class252 internal constructor(@JvmField var anInt3241: Int) {
    @JvmField
    var anIntArray3238: IntArray? = IntArray(this.anInt3241)

    @JvmField
    var anIntArray3239: IntArray? = IntArray(this.anInt3241)

    companion object {
        @JvmField
        var aClass351_3237: Class351? = Class351(80, 7)
        var aClass114_3240: Class114? = Class114(43, 4)
        var aFloat3242: Float = 0f
        var anInt3243: Int = 0

        @JvmStatic
        fun method1917(i: Int) {
            if (i != 40960) aClass114_3240 = null
            aClass351_3237 = null
            aClass114_3240 = null
        }

        fun method1918(i: Int, i_0_: Int): Int {
            if (i != -3358) return 126
            anInt3243++
            val i_1_ = i_0_ * (i_0_ * i_0_ shr 12) shr 12
            val i_2_ = i_0_ * 6 + -61440
            val i_3_ = 40960 - -(i_2_ * i_0_ shr 12)
            return i_3_ * i_1_ shr 12
        }
    }
}
