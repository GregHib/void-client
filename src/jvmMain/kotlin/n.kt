/* n - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class n(var_oa: oa?, var_ya: ya?, class143: Class143?, class207s: Array<Class207>, class105s: Array<Class105?>?) : Class324(var_oa, class143), Interface19 {
    var nativeid: Long = 0

    private external fun S(var_oa: oa?, var_ya: ya?, `is`: Array<ByteArray?>?, is_0_: IntArray?, is_1_: IntArray?, is_2_: IntArray?, is_3_: IntArray?, is_4_: IntArray?)

    init {
        val `is` = arrayOfNulls<ByteArray>(class207s.size)
        val is_5_ = IntArray(class207s.size)
        val is_6_ = IntArray(class207s.size)
        val is_7_ = IntArray(class207s.size)
        val is_8_ = IntArray(class207s.size)
        for (i in class207s.indices) {
            `is`[i] = class207s[i]!!.aByteArray2699
            is_5_[i] = class207s[i]!!.anInt2702
            is_6_[i] = class207s[i]!!.anInt2696
            is_7_[i] = class207s[i]!!.anInt2703
            is_8_[i] = class207s[i]!!.anInt2700
        }
        S(var_oa, var_ya, `is`, class207s[0]!!.anIntArray2697, is_5_, is_6_, is_7_, is_8_)
    }

    external override fun w(bool: Boolean)

    protected fun finalize() {
        if (this.nativeid != 0L) Class257.method1947(0, this)
    }

    external override fun fa(c: Char, i: Int, i_9_: Int, i_10_: Int, bool: Boolean)

    private external fun PA(c: Char, i: Int, i_11_: Int, i_12_: Int, bool: Boolean, var_aa: aa?, i_13_: Int, i_14_: Int)

    override fun method2578(c: Char, i: Int, i_15_: Int, i_16_: Int, bool: Boolean, var_aa: aa?, i_17_: Int, i_18_: Int) {
        PA(c, i, i_15_, i_16_, bool, var_aa, i_17_, i_18_)
    }
}
