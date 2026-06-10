/* t - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class t(private val anOa5150: oa, var_ya: ya?, i: Int, i_50_: Int, `is`: Array<IntArray?>, is_51_: Array<IntArray?>?, i_52_: Int, i_53_: Int, i_54_: Int) : s(i, i_50_, i_52_, `is`), Interface19 {
    @JvmField
    var nativeid: Long = 0
    private val aClass262_5149 = Class262()
    private var anInt5151 = -1

    override fun method3984(i: Int, i_0_: Int, i_1_: Int, bools: Array<BooleanArray?>?, bool: Boolean, i_2_: Int, i_3_: Int) {
        anInt5151 = i_2_
        var i_4_ = 0
        val fs = FloatArray(aClass262_5149.method1998(0))
        var class348_sub1 = aClass262_5149.method1995(4) as? Class348_Sub1?
        while (class348_sub1 != null) {
            fs[i_4_++] = class348_sub1.method2721(-37)
            class348_sub1 = aClass262_5149.method1990(34.toByte()) as? Class348_Sub1?
        }
        q(fs)
        for (i_5_ in 0..<i_1_ + i_1_) {
            for (i_6_ in 0..<i_1_ + i_1_) {
                if (bools!![i_5_]!![i_6_]) {
                    val i_7_ = i - i_1_ + i_5_
                    val i_8_ = i_0_ - i_1_ + i_6_
                    if (i_7_ >= 0 && i_7_ < this.anInt4587 && i_8_ >= 0 && i_8_ < this.anInt4590) method3979(i_7_, i_8_)
                }
            }
        }
    }

    external override fun wa(var_r: r?, i: Int, i_9_: Int, i_10_: Int, i_11_: Int, bool: Boolean)

    override fun method3979(i: Int, i_12_: Int) {
        if (anInt5151 < 0) anOa5150.method3973()?.method142(this, i, i_12_)
        else anOa5150.method3973()?.method147(this, i, i_12_, anInt5151)
    }

    external override fun w(bool: Boolean)

    override fun method3978(i: Int, i_13_: Int, `is`: IntArray, is_14_: IntArray, is_15_: IntArray, is_16_: IntArray, is_17_: IntArray, is_18_: IntArray, is_19_: IntArray, is_20_: IntArray, is_21_: IntArray, is_22_: IntArray, is_23_: IntArray, i_24_: Int, i_25_: Int, i_26_: Int, bool: Boolean) {
        var bool_27_ = false
        if (is_20_ != null) {
            val is_28_: IntArray? = is_20_
            for (i_29_ in is_28_!!.indices) {
                val i_30_ = is_28_[i_29_]
                if (i_30_ != -1) {
                    bool_27_ = true
                    break
                }
            }
        }
        val i_31_ = is_20_!!.size
        val is_32_ = IntArray(i_31_ * 3)
        val is_33_ = IntArray(i_31_ * 3)
        val is_34_ = IntArray(i_31_ * 3)
        val is_35_ = IntArray(i_31_ * 3)
        val is_36_ = IntArray(i_31_ * 3)
        val is_37_ = if (is_21_ != null) IntArray(i_31_ * 3) else null
        val is_38_ = if (is_14_ != null) IntArray(i_31_ * 3) else null
        val is_39_ = if (is_16_ != null) IntArray(i_31_ * 3) else null
        var i_40_ = 0
        for (i_41_ in 0..<i_31_) {
            val i_42_ = is_17_[i_41_]
            val i_43_ = is_18_[i_41_]
            val i_44_ = is_19_[i_41_]
            is_32_[i_40_] = `is`[i_42_]
            is_33_[i_40_] = is_15_[i_42_]
            is_34_[i_40_] = is_20_[i_41_]
            is_35_[i_40_] = is_22_[i_41_]
            is_36_[i_40_] = is_23_[i_41_]
            if (is_21_ != null) is_37_!![i_40_] = is_21_[i_41_]
            if (is_14_ != null) is_38_!![i_40_] = is_14_[i_42_]
            if (is_16_ != null) is_39_!![i_40_] = is_16_[i_42_]
            i_40_++
            is_32_[i_40_] = `is`[i_43_]
            is_33_[i_40_] = is_15_[i_43_]
            is_34_[i_40_] = is_20_[i_41_]
            is_35_[i_40_] = is_22_[i_41_]
            is_36_[i_40_] = is_23_[i_41_]
            if (is_21_ != null) is_37_!![i_40_] = is_21_[i_41_]
            if (is_14_ != null) is_38_!![i_40_] = is_14_[i_43_]
            if (is_16_ != null) is_39_!![i_40_] = is_16_[i_43_]
            i_40_++
            is_32_[i_40_] = `is`[i_44_]
            is_33_[i_40_] = is_15_[i_44_]
            is_34_[i_40_] = is_20_[i_41_]
            is_35_[i_40_] = is_22_[i_41_]
            is_36_[i_40_] = is_23_[i_41_]
            if (is_21_ != null) is_37_!![i_40_] = is_21_[i_41_]
            if (is_14_ != null) is_38_!![i_40_] = is_14_[i_44_]
            if (is_16_ != null) is_39_!![i_40_] = is_16_[i_44_]
            i_40_++
        }
        if (bool_27_ || is_37_ != null) U(i, i_13_, is_32_, is_38_!!, is_33_, is_39_!!, is_34_, is_37_!!, is_35_, is_36_, i_24_, i_25_, i_26_, bool)
    }

    override fun method3981(class348_sub1: Class348_Sub1, `is`: IntArray) {
        aClass262_5149.method1999(class348_sub1, -20180)
        V(class348_sub1.hashCode(), class348_sub1.method2724(-1), class348_sub1.method2722(124), class348_sub1.method2717(83.toByte()), class348_sub1.method2723(-1), class348_sub1.method2720(-1), `is`)
    }

    external override fun CA(var_r: r?, i: Int, i_45_: Int, i_46_: Int, i_47_: Int, bool: Boolean)

    private external fun q(fs: FloatArray?)

    external override fun ka(i: Int, i_48_: Int, i_49_: Int)

    init {
        ga(anOa5150, var_ya, i, i_50_, this.anIntArrayArray4584, is_51_, i_52_, i_53_, i_54_)
    }

    override fun method3989(var_r: r?, i: Int, i_55_: Int, i_56_: Int, i_57_: Int, bool: Boolean): Boolean {
        return true
    }

    private external fun V(i: Int, i_58_: Int, i_59_: Int, i_60_: Int, i_61_: Int, i_62_: Int, `is`: IntArray?)

    external override fun YA()

    override fun method3983(i: Int, i_63_: Int, i_64_: Int, bools: Array<BooleanArray?>?, bool: Boolean, i_65_: Int) {
        anInt5151 = -1
        var i_66_ = 0
        val fs = FloatArray(aClass262_5149.method1998(0))
        var class348_sub1 = aClass262_5149.method1995(4) as? Class348_Sub1?
        while (class348_sub1 != null) {
            fs[i_66_++] = class348_sub1.method2721(-65)
            class348_sub1 = aClass262_5149.method1990(40.toByte()) as? Class348_Sub1?
        }
        q(fs)
        for (i_67_ in 0..<i_64_ + i_64_) {
            for (i_68_ in 0..<i_64_ + i_64_) {
                if (bools!![i_67_]!![i_68_]) {
                    val i_69_ = i - i_64_ + i_67_
                    val i_70_ = i_63_ - i_64_ + i_68_
                    if (i_69_ >= 0 && i_69_ < this.anInt4587 && i_70_ >= 0 && i_70_ < this.anInt4590) method3979(i_69_, i_70_)
                }
            }
        }
    }

    external override fun fa(i: Int, i_71_: Int, var_r: r?): r?

    protected fun finalize() {
        if (this.nativeid != 0L) Class257.method1947(0, this)
    }

    private external fun ga(var_oa: oa?, var_ya: ya?, i: Int, i_72_: Int, `is`: Array<IntArray?>?, is_73_: Array<IntArray?>?, i_74_: Int, i_75_: Int, i_76_: Int)

    external override fun U(i: Int, i_77_: Int, `is`: IntArray?, is_78_: IntArray?, is_79_: IntArray, is_80_: IntArray?, is_81_: IntArray, is_82_: IntArray?, is_83_: IntArray, is_84_: IntArray, i_85_: Int, i_86_: Int, i_87_: Int, bool: Boolean)

    override fun method3987(i: Int, i_88_: Int, i_89_: Int, i_90_: Int, i_91_: Int, i_92_: Int, i_93_: Int, bools: Array<BooleanArray?>) {
        anOa5150.method3973()?.method148(this, i, i_88_, i_89_, i_90_, i_91_, i_92_, i_93_, bools)
    }
}
