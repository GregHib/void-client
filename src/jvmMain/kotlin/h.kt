/* h - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class h(var_oa: oa?, var_ya: ya?, class143: Class143?, class207s: Array<Class207>, class105s: Array<Class105?>?) : Class324(var_oa, class143), Interface19 {
    var nativeid: Long = 0

    init {
        val `is` = arrayOfNulls<ByteArray>(class207s.size)
        val is_0_ = IntArray(class207s.size)
        val is_1_ = IntArray(class207s.size)
        val is_2_ = IntArray(class207s.size)
        val is_3_ = IntArray(class207s.size)
        for (i in class207s.indices) {
            `is`[i] = class207s[i]!!.aByteArray2699
            is_0_[i] = class207s[i]!!.anInt2702
            is_1_[i] = class207s[i]!!.anInt2696
            is_2_[i] = class207s[i]!!.anInt2703
            is_3_[i] = class207s[i]!!.anInt2700
        }
        JA(var_oa, var_ya, `is`, is_0_, is_1_, is_2_, is_3_)
    }

    protected fun finalize() {
        if (this.nativeid != 0L) Class257.method1947(0, this)
    }

    external override fun w(bool: Boolean)

    external override fun fa(c: Char, i: Int, i_4_: Int, i_5_: Int, bool: Boolean)

    override fun method2578(c: Char, i: Int, i_6_: Int, i_7_: Int, bool: Boolean, var_aa: aa?, i_8_: Int, i_9_: Int) {
        NA(c, i, i_6_, i_7_, bool, var_aa, i_8_, i_9_)
    }

    private external fun NA(c: Char, i: Int, i_10_: Int, i_11_: Int, bool: Boolean, var_aa: aa?, i_12_: Int, i_13_: Int)

    private external fun JA(var_oa: oa?, var_ya: ya?, `is`: Array<ByteArray?>?, is_14_: IntArray?, is_15_: IntArray?, is_16_: IntArray?, is_17_: IntArray?)
}
