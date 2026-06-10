import Class85.Companion.method831

/* Class336 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class336 {
    var anInt4170: Int = 0
    var anInt4171: Int = 0
    @JvmField
    var aShortArray4172: ShortArray? = ShortArray(256)

    fun method2656(i: Int, i_0_: Int, i_1_: Byte, i_2_: Int, i_3_: Int) {
        var i = i
        var i_3_ = i_3_
        anInt4170++
        if (i_1_ < 66) Class336.method2656(119, -53, (-62).toByte(), 54, -62)
        if (i_0_ >= Class369.anInt4960 && Class113.anInt1745 >= i_0_) {
            i = method831(Class38.anInt513, i, Class132.anInt1910, -123)
            i_3_ = method831(Class38.anInt513, i_3_, Class132.anInt1910, 123)
            Class332.method2641(i_3_, i, -76, i_0_, i_2_)
        }
    }

    @JvmStatic
    fun method2657(i: Byte) {
        aShortArray4172 = null
        if (i < 118) aShortArray4172 = null
    }
}
