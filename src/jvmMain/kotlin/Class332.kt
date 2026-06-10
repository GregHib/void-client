object Class332 {
    var anInt4138: Int = 0
    var aClass60_4139: Class60?
    var anInt4140: Int = 0
    var anInt4141: Int = -1
    @JvmField
    var aSArray4142: Array<s?>? = null
    var anInt4143: Int

    @JvmStatic
    fun method2640(bool: Boolean) {
        aClass60_4139 = null
        aSArray4142 = null
        if (bool != true) anInt4143 = 110
    }

    fun method2641(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
        anInt4140++
        if (i_1_ >= -6) aClass60_4139 = null
        if (i < i_0_) {
            var i_4_ = i
            while (i_0_ > i_4_) {
                Class17.anIntArrayArray255!![i_4_]!![i_2_] = i_3_
                i_4_++
            }
        } else {
            var i_5_ = i_0_
            while (i > i_5_) {
                Class17.anIntArrayArray255!![i_5_]!![i_2_] = i_3_
                i_5_++
            }
        }
    }

    fun method2642(i: Int, i_6_: Int, bool: Boolean, i_7_: Int, i_8_: Int) {
        anInt4138++
        var i_9_ = 0
        while (Class348_Sub38.anInt7008 > i_9_) {
            val rectangle = Class180.aRectangleArray2371!![i_9_]
            if (rectangle!!.width + rectangle.x > i_7_ && rectangle.x < i + i_7_ && rectangle.height + rectangle.y > i_6_ && rectangle.y < i_8_ + i_6_) Class268.aBooleanArray3438!![i_9_] = true
            i_9_++
        }
        Class338.Companion.method2663(-5590, i_7_, i_7_ + i, i_6_, i_6_ - -i_8_)
        if (bool != true) method2642(-120, -24, false, -125, -16)
    }

    init {
        aClass60_4139 = Class60(20)
        anInt4143 = -1
    }
}
