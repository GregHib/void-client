/* Class249 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class249 {
    var anInt3216: Int = 0
    var aClass21_3217: Class21? = Class21()

    @JvmStatic
    fun method1907(i: Byte) {
        aClass21_3217 = null
        val i_0_ = -55 / ((i - -39) / 60)
    }

    fun method1908(i: Int, i_1_: Int, i_2_: Int, bool: Boolean, i_3_: Int, i_4_: Int, i_5_: Int): Int {
        var i_2_ = i_2_
        var i_3_ = i_3_
        var i_4_ = i_4_
        i_2_ = i_2_ and 0x3
        anInt3216++
        if (bool != true) aClass21_3217 = null
        if ((i_5_ and 0x1) == 1) {
            val i_6_ = i_4_
            i_4_ = i_3_
            i_3_ = i_6_
        }
        if (i_2_ == 0) return i_1_
        if (i_2_ == 1) return i
        if (i_2_ == 2) return 7 + -i_1_ + (-i_4_ + 1)
        return -i_3_ - (-1 - (7 - i))
    }
}
