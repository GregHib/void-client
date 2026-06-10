/* ja - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ja : Class101(), Interface19 {
    @JvmField
    var nativeid: Long = 0

    private external fun la()

    private external fun za(l: Long, i: Int)

    private external fun AA(l: Long, bool: Boolean)

    private external fun VA(l: Long, i: Int)

    private external fun NA(l: Long, i: Int)

    public override fun method891(i: Int, i_0_: Int, i_1_: Int) {
        a(this.nativeid, i, i_0_, i_1_)
    }

    private external fun l(l: Long, l_2_: Long)

    public override fun method910() {
        u(this.nativeid)
    }

    override fun w(bool: Boolean) {
        AA(this.nativeid, bool)
    }

    public override fun method905(i: Int, i_3_: Int, i_4_: Int, `is`: IntArray) {
        XA(this.nativeid, i, i_3_, i_4_, `is`)
    }

    public override fun method890(`is`: IntArray) {
        w(this.nativeid, `is`)
    }

    private external fun w(l: Long, `is`: IntArray?)

    public override fun method908(i: Int) {
        za(this.nativeid, i)
    }

    private external fun XA(l: Long, i: Int, i_5_: Int, i_6_: Int, `is`: IntArray?)

    public override fun method903(i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int) {
        P(this.nativeid, i, i_7_, i_8_, i_9_, i_10_, i_11_)
    }

    private external fun t(l: Long, i: Int)

    public override fun method900(i: Int) {
        J(this.nativeid, i)
    }

    private external fun u(l: Long)

    public override fun method897(i: Int, i_12_: Int, i_13_: Int, `is`: IntArray) {
        b(this.nativeid, i, i_12_, i_13_, `is`)
    }

    private external fun m(l: Long, i: Int)

    private external fun FA(l: Long, i: Int, i_14_: Int, i_15_: Int)

    public override fun method902(i: Int) {
        NA(this.nativeid, i)
    }

    private external fun va(l: Long, i: Int, i_16_: Int, i_17_: Int, `is`: IntArray?)

    private external fun J(l: Long, i: Int)

    public override fun method898(class101: Class101?) {
        l(this.nativeid, (class101 as ja).nativeid)
    }

    private external fun b(l: Long, i: Int, i_18_: Int, i_19_: Int, `is`: IntArray?)

    public override fun method892(i: Int, i_20_: Int, i_21_: Int, `is`: IntArray) {
        va(this.nativeid, i, i_20_, i_21_, `is`)
    }

    private external fun P(l: Long, i: Int, i_22_: Int, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int)

    private external fun a(l: Long, i: Int, i_27_: Int, i_28_: Int)

    protected fun finalize() {
        if (this.nativeid != 0L) Class257.method1947(0, this)
    }

    public override fun method896(i: Int) {
        m(this.nativeid, i)
    }

    public override fun method907(): Class101 {
        val var_ja_29_ = ja()
        var_ja_29_.method898(this)
        return var_ja_29_
    }

    public override fun method895(i: Int) {
        t(this.nativeid, i)
    }

    init {
        la()
    }

    public override fun method894(i: Int, i_30_: Int, i_31_: Int) {
        FA(this.nativeid, i, i_30_, i_31_)
    }

    public override fun method899(i: Int) {
        VA(this.nativeid, i)
    }
}
