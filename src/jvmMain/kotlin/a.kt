/* a - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class a internal constructor(private val anOa5115: oa, i: Int, i_68_: Int) : Interface19 {
    private val anI5105: i
    var nativeid: Long = 0
    private val anI5106: i
    private val anI5107: i
    private val anI5108: i
    private val anI5109: i
    private val anI5110: i
    private val anI5111: i
    var aRunnable5112: Runnable? = null
    private val anI5113: i
    private val anI5114: i
    private val anI5116: i

    fun method142(var_s: s, i: Int, i_0_: Int) {
        H(this.nativeid, (var_s as t).nativeid, i, i_0_)
    }

    private external fun R(l: Long, l_1_: Long, i: Int, i_2_: Int, l_3_: Long, bool: Boolean): Boolean

    fun method143(class64: Class64, i: Int, i_4_: Int, class101: Class101?, bool: Boolean, i_5_: Int): Boolean {
        return n(this.nativeid, (class64 as i).nativeid, i, i_4_, (class101 as ja).nativeid, bool, i_5_)
    }

    fun method144(class64: Class64, class64_6_: Class64?, i: Int, i_7_: Int, i_8_: Int, bool: Boolean) {
        r(this.nativeid, (class64 as i).nativeid, (class64_6_ as i).nativeid, i, i_7_, i_8_, bool)
    }

    private external fun E(l: Long, bool: Boolean)

    private external fun e(l: Long, l_9_: Long, `is`: IntArray?, l_10_: Long)

    private external fun W(l: Long)

    protected fun finalize() {
        if (this.nativeid != 0L) Class257.method1947(0, this)
    }

    fun method145(class64: Class64?, class101: Class101, `is`: IntArray?, i: Int) {
        UA(this.nativeid, (class64 as i).nativeid, (class101 as ja).nativeid, `is`, i)
    }

    private external fun n(l: Long, l_11_: Long, i: Int, i_12_: Int, l_13_: Long, bool: Boolean, i_14_: Int): Boolean

    fun method146(class64: Class64, i: Int, i_15_: Int, class101: Class101?, bool: Boolean): Boolean {
        return R(this.nativeid, (class64 as i).nativeid, i, i_15_, (class101 as ja).nativeid, bool)
    }

    fun method147(var_s: s, i: Int, i_16_: Int, i_17_: Int) {
        Z(this.nativeid, (var_s as t).nativeid, i, i_16_, i_17_)
    }

    override fun w(bool: Boolean) {
        E(this.nativeid, bool)
    }

    fun method148(var_s: s, i: Int, i_18_: Int, i_19_: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Int, bools: Array<BooleanArray?>?) {
        ta(this.nativeid, (var_s as t).nativeid, i, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, bools)
    }

    fun method149(class64: Class64, class101: Class101?, `is`: IntArray?, i: Int, i_24_: Int) {
        f(this.nativeid, (class64 as i).nativeid, (class101 as ja).nativeid, `is`, i, i_24_)
    }

    private external fun na(l: Long, var_ha: ha?, i: Int, i_25_: Int, i_26_: Int, i_27_: Int, i_28_: Int, i_29_: Int, i_30_: Int)

    private external fun O(l: Long, var_ha: ha?, `is`: IntArray?, is_31_: IntArray?, is_32_: IntArray?, is_33_: ShortArray?, i: Int)

    fun method150(var_ha: ha?, i: Int, i_34_: Int, i_35_: Int, i_36_: Int, i_37_: Int, i_38_: Int, i_39_: Int) {
        na(this.nativeid, var_ha, i, i_34_, i_35_, i_36_, i_37_, i_38_, i_39_)
    }

    private external fun f(l: Long, l_40_: Long, l_41_: Long, `is`: IntArray?, i: Int, i_42_: Int)

    private external fun r(l: Long, l_43_: Long, l_44_: Long, i: Int, i_45_: Int, i_46_: Int, bool: Boolean)

    fun method151(class64: Class64, `is`: IntArray?, class101: Class101?) {
        e(this.nativeid, (class64 as i).nativeid, `is`, (class101 as ja).nativeid)
    }

    fun method152(var_i: i, i: Byte, i_47_: Int, bool: Boolean): Class64 {
        val var_i_48_: i
        val var_i_49_: i
        if (i.toInt() == 1) {
            var_i_48_ = anI5110
            var_i_49_ = anI5106
        } else if (i.toInt() == 2) {
            var_i_48_ = anI5107
            var_i_49_ = anI5111
        } else if (i.toInt() == 3) {
            var_i_48_ = anI5109
            var_i_49_ = anI5108
        } else if (i.toInt() == 4) {
            var_i_48_ = anI5113
            var_i_49_ = anI5116
        } else if (i.toInt() == 5) {
            var_i_48_ = anI5114
            var_i_49_ = anI5105
        } else {
            var_i_48_ = i(anOa5115)
            var_i_49_ = var_i_48_
        }
        var_i.ZA(var_i_49_, var_i_48_, i_47_, i.toInt() != 0, bool)
        var_i_49_.aClass129Array5119 = var_i.aClass129Array5119
        var_i_49_.aClass342Array5118 = var_i.aClass342Array5118
        return var_i_49_
    }

    private external fun ta(l: Long, l_50_: Long, i: Int, i_51_: Int, i_52_: Int, i_53_: Int, i_54_: Int, i_55_: Int, i_56_: Int, bools: Array<BooleanArray?>?)

    private external fun Z(l: Long, l_57_: Long, i: Int, i_58_: Int, i_59_: Int)

    private fun method153() {
        W(this.nativeid)
    }

    fun method154() {
        this.aRunnable5112 = Thread.currentThread()
        method157()
    }

    private external fun M(l: Long)

    private external fun H(l: Long, l_60_: Long, i: Int, i_61_: Int)

    private external fun UA(l: Long, l_62_: Long, l_63_: Long, `is`: IntArray?, i: Int)

    fun method155(var_ha: ha?, `is`: IntArray?, is_64_: IntArray?, is_65_: IntArray?, is_66_: ShortArray?, i: Int) {
        O(this.nativeid, var_ha, `is`, is_64_, is_65_, is_66_, i)
    }

    private external fun HA(l: Long, var_ha: ha?, i: Int, i_67_: Int)

    fun method156() {
        this.aRunnable5112 = null
        method153()
    }

    private fun method157() {
        M(this.nativeid)
    }

    init {
        anI5106 = i(anOa5115)
        anI5111 = i(anOa5115)
        anI5108 = i(anOa5115)
        anI5116 = i(anOa5115)
        anI5105 = i(anOa5115)
        anI5110 = i(anOa5115)
        anI5107 = i(anOa5115)
        anI5109 = i(anOa5115)
        anI5113 = i(anOa5115)
        anI5114 = i(anOa5115)
        HA(this.nativeid, anOa5115, i, i_68_)
    }
}
