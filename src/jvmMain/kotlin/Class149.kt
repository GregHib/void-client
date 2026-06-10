/* Class149 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class149 {
    var anInt2044: Int = 0
    @JvmField
    var aClass223_2045: Class223? = Class223(8, 1)
    @JvmField
    var anInt2046: Int = 0

    @JvmStatic
    fun method1200(bool: Boolean) {
        aClass223_2045 = null
        if (bool != false) anInt2046 = 37
    }

    @JvmStatic
    fun method1201(i: Int, i_0_: Int, i_1_: Int, i_2_: Int): Int {
        var i_2_ = i_2_
        i_2_ = i_2_ and 0x3
        anInt2044++
        if (i_2_ == 0) return i_0_
        if ((i_2_.inv()) == i_1_) return i
        if (i_2_ == 2) return -i_0_ + 4095
        return -i + 4095
    }
}
