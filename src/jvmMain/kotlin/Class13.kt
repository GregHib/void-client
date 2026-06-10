import Class286_Sub4.Companion.method2154

object Class13 {
    @JvmField
    var anInt219: Int = 0
    @JvmField
    var aClass114_220: Class114? = Class114(40, -1)
    @JvmField
    var anInt221: Int = 0
    @JvmField
    var anIntArray222: IntArray?
    @JvmField
    var aClass314_Sub1Array223: Array<Class314_Sub1?>? = arrayOfNulls<Class314_Sub1>(37)
    @JvmField
    var anIntArray224: IntArray?

    @JvmStatic
    fun method225(i: Byte) {
        if (i > 54) {
            aClass114_220 = null
            anIntArray224 = null
            anIntArray222 = null
            aClass314_Sub1Array223 = null
        }
    }

    @JvmStatic
    fun method226(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
        var i_4_ = i_2_
        while (Class348_Sub38.anInt7008 > i_4_) {
            val rectangle = Class180.aRectangleArray2371!![i_4_]!!
            if (i < rectangle.width + rectangle.x && i_0_ + i > rectangle.x && (i_1_ < rectangle.y - -rectangle.height) && rectangle.y < i_1_ + i_3_) Class152.aBooleanArray2076!![i_4_] = true
            i_4_++
        }
        anInt219++
        Class338.method2663(i_2_ + -5590, i, i - -i_0_, i_1_, i_3_ + i_1_)
    }

    @JvmStatic
    fun method227(class318_sub1: Class318_Sub1, bool: Boolean, bool_5_: Boolean) {
        class318_sub1.aBoolean6391 = bool_5_
        if (Class348_Sub40_Sub5.aBoolean9121) {
            if (bool) Class319.aClass315Array3982!![Class319.aClass315Array3982!!.size - 1]!!.method2353(class318_sub1, false)
            else {
                val i = method2154(class318_sub1.anInt6386)
                val i_6_ = (Class52.anIntArray4906!![2] * class318_sub1.method2379(-25675) / class318_sub1.anInt6389)
                val i_7_ = method2154((class318_sub1.anInt6386) - i_6_)
                val i_8_ = method2154((class318_sub1.anInt6386) + i_6_)
                if (i_7_ == i_8_) Class319.aClass315Array3982!![i]!!.method2353(class318_sub1, false)
                else if (i_8_ - i_7_ == 1) Class319.aClass315Array3982!![Class75_Sub1.anInt5652 + i_7_]!!.method2353(class318_sub1, false)
                else Class319.aClass315Array3982!![Class319.aClass315Array3982!!.size - 1]!!.method2353(class318_sub1, false)
            }
        } else Class38.method365(class318_sub1, Class115.aClass348_Sub1Array1752)
    }

    init {
        anIntArray222 = IntArray(3)
        anIntArray224 = IntArray(250)
    }
}
