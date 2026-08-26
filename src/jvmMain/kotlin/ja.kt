import AbstractCameraTransform
import Disposable

/* ja - Decompiled by JODE
* Visit http://jode.sourceforge.net/
* NativeMatrix
*/
actual class ja : AbstractCameraTransform(), Disposable {

    actual var nativeid: Long = 0

    /*private*/ actual external fun la()

    /*private*/ actual external fun za(l: Long, i: Int)

    /*private*/ actual external fun AA(l: Long, bool: Boolean)

    /*private*/ actual external fun VA(l: Long, i: Int)

    /*private*/ actual external fun NA(l: Long, i: Int)

    public actual override fun method891(i: Int, i_0_: Int, i_1_: Int) {
        a(this.nativeid, i, i_0_, i_1_)
    }

    /*private*/ actual external fun l(l: Long, l_2_: Long)

    public actual override fun method910() {
        u(this.nativeid)
    }

    actual override fun w(bool: Boolean) {
        AA(this.nativeid, bool)
    }

    public actual override fun method905(i: Int, i_3_: Int, i_4_: Int, `is`: IntArray) {
        XA(this.nativeid, i, i_3_, i_4_, `is`)
    }

    public actual override fun method890(`is`: IntArray) {
        w(this.nativeid, `is`)
    }

    /*private*/ actual external fun w(l: Long, `is`: IntArray?)

    public actual override fun method908(i: Int) {
        za(this.nativeid, i)
    }

    /*private*/ actual external fun XA(l: Long, i: Int, i_5_: Int, i_6_: Int, `is`: IntArray?)

    public actual override fun method903(i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int) {
        P(this.nativeid, i, i_7_, i_8_, i_9_, i_10_, i_11_)
    }

    /*private*/ actual external fun t(l: Long, i: Int)

    public actual override fun method900(i: Int) {
        J(this.nativeid, i)
    }

    /*private*/ actual external fun u(l: Long)

    public actual override fun method897(i: Int, i_12_: Int, i_13_: Int, `is`: IntArray) {
        b(this.nativeid, i, i_12_, i_13_, `is`)
    }

    /*private*/ actual external fun m(l: Long, i: Int)

    /*private*/ actual external fun FA(l: Long, i: Int, i_14_: Int, i_15_: Int)

    public actual override fun method902(i: Int) {
        NA(this.nativeid, i)
    }

    /*private*/ actual external fun va(l: Long, i: Int, i_16_: Int, i_17_: Int, `is`: IntArray?)

    /*private*/ actual external fun J(l: Long, i: Int)

    public actual override fun method898(abstractCameraTransform: AbstractCameraTransform?) {
        l(this.nativeid, (abstractCameraTransform as ja).nativeid)
    }

    /*private*/ actual external fun b(l: Long, i: Int, i_18_: Int, i_19_: Int, `is`: IntArray?)

    public actual override fun method892(i: Int, i_20_: Int, i_21_: Int, `is`: IntArray) {
        va(this.nativeid, i, i_20_, i_21_, `is`)
    }

    /*private*/ actual external fun P(l: Long, i: Int, i_22_: Int, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int)

    /*private*/ actual external fun a(l: Long, i: Int, i_27_: Int, i_28_: Int)

    /*protected*/ actual fun finalize() {
        if (this.nativeid != 0L) RequestGate.method1947(0, this)
    }

    public actual override fun method896(i: Int) {
        m(this.nativeid, i)
    }

    public actual override fun method907(): AbstractCameraTransform {
        val var_ja_29_ = ja()
        var_ja_29_.method898(this)
        return var_ja_29_
    }

    public actual override fun method895(i: Int) {
        t(this.nativeid, i)
    }

    init {
        la()
    }

    public actual override fun method894(i: Int, i_30_: Int, i_31_: Int) {
        FA(this.nativeid, i, i_30_, i_31_)
    }

    public actual override fun method899(i: Int) {
        VA(this.nativeid, i)
    }
}
