import Class214.method1576

/* Class331 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class331 {
    @JvmField
    var anIntArray4128: IntArray? = IntArray(5)
    var aStringArray4129: Array<String?>? = arrayOf<String?>("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec")
    @JvmField
    var aClass46_4130: Class46?
    var anInt4131: Int = 0
    var anInt4132: Int = 0
    @JvmField
    var anInt4133: Int = 0
    var anInt4134: Int = 0
    @JvmField
    var anInt4135: Int = 0
    var anInt4136: Int = 0
    var anInt4137: Int = 0

    fun method2635(f: Float, bool: Boolean, f_0_: Float, f_1_: Float): Int {
        anInt4131++
        val f_2_ = if (!(f_1_ < 0.0f)) f_1_ else -f_1_
        val f_3_ = if (f < 0.0f) -f else f
        if (bool != false) method2637(-85)
        val f_4_ = if (!(f_0_ < 0.0f)) f_0_ else -f_0_
        if (!(f_2_ < f_3_) || !(f_3_ > f_4_)) {
            if (!(f_4_ > f_2_) || !(f_3_ < f_4_)) {
                if (!(f_1_ > 0.0f)) return 5
                return 4
            }
            if (f_0_ > 0.0f) return 2
            return 3
        }
        if (f > 0.0f) return 0
        return 1
    }

    fun method2636(i: Int) {
        val i_5_ = -114 % ((i - 22) / 33)
        anInt4137++
        Class100.aClass356_1585!!.method3481(0)
        s_Sub2.aClass107_8241!!.method1009(2110355138)
        Class367_Sub4.aClass107_7325!!.method1009(2110355138)
    }

    @JvmStatic
    fun method2637(i: Int) {
        aStringArray4129 = null
        aClass46_4130 = null
        if (i != 0) aClass46_4130 = null
        anIntArray4128 = null
    }

    fun method2638(i: Int) {
        synchronized(Class24.aClass60_355!!) {
            Class24.aClass60_355!!.method587(-98)
        }
        anInt4136++
        synchronized(Class130.aClass60_1894!!) {
            Class130.aClass60_1894!!.method587(i + 4530)
        }
        if (i != -4631) anInt4135 = 37
    }

    fun method2639(i: Byte, `is`: ShortArray, i_6_: Int): ShortArray {
        val i_7_ = 77 / ((i - -32) / 47)
        anInt4132++
        val is_8_ = ShortArray(i_6_)
        method1576(`is`, 0, is_8_, 0, i_6_)
        return is_8_
    }

    init {
        aClass46_4130 = null
    }
}
