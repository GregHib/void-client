/* wa - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class wa(var_oa: oa, var_j: j, var_xa: xa) : Interface4 {
    @JvmField
    var aJ4732: j
    @JvmField
    var aXa4733: xa
    private var aLong4734 = 0L

    override fun method14(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, bool: Boolean, bool_5_: Boolean) {
        Z(aLong4734, this.aJ4732.nativeid, this.aXa4733.nativeid, i, i_0_, i_1_, i_2_, i_3_, i_4_, bool, bool_5_)
    }

    private external fun X(l: Long, l_6_: Long, l_7_: Long, i: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int, bool: Boolean, bool_13_: Boolean)

    private external fun Z(l: Long, l_14_: Long, l_15_: Long, i: Int, i_16_: Int, i_17_: Int, i_18_: Int, i_19_: Int, i_20_: Int, bool: Boolean, bool_21_: Boolean)

    override fun method15(i: Int, i_22_: Int, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int, bool: Boolean, bool_27_: Boolean) {
        X(aLong4734, this.aJ4732.nativeid, this.aXa4733.nativeid, i, i_22_, i_23_, i_24_, i_25_, i_26_, bool, bool_27_)
    }

    init {
        aLong4734 = var_oa.nativeid
        this.aJ4732 = var_j
        this.aXa4733 = var_xa
    }
}
