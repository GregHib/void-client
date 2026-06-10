/* j - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class j : Class105, Interface19 {
    var nativeid: Long = 0

    private external fun R(l: Long, bool: Boolean)

    private external fun P(l: Long, i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int)

    public override fun method964(i: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int) {
        W(this.nativeid, i, i_6_, i_7_, i_8_, i_9_)
    }

    private external fun RA(l: Long, i: Int, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int)

    private external fun UA(l: Long, f: Float, f_17_: Float, f_18_: Float, f_19_: Float, f_20_: Float, f_21_: Float, i: Int, l_22_: Long, i_23_: Int, i_24_: Int)

    private external fun wa(l: Long): Int

    private external fun M(l: Long): Int

    public override fun method963(i: Int, i_25_: Int, var_aa: aa?, i_26_: Int, i_27_: Int) {
        V(this.nativeid, i, i_25_, (var_aa as na).nativeid, i_26_, i_27_)
    }

    public override fun method984(`is`: IntArray?) {
        CA(this.nativeid, `is`)
    }

    override fun w(bool: Boolean) {
        R(this.nativeid, bool)
    }

    public override fun method980(): Int {
        return JA(this.nativeid)
    }

    private external fun EA(var_oa: oa?, i: Int, i_28_: Int)

    public override fun method985(i: Int, i_29_: Int, i_30_: Int, i_31_: Int) {
        A(this.nativeid, i, i_29_, i_30_, i_31_)
    }

    private external fun ma(var_oa: oa?, `is`: IntArray?, is_32_: ByteArray?, is_33_: ByteArray?, i: Int, i_34_: Int, i_35_: Int, i_36_: Int)

    public override fun method968(i: Int, i_37_: Int, i_38_: Int) {
        N(this.nativeid, i, i_37_, i_38_)
    }

    public override fun method983(f: Float, f_39_: Float, f_40_: Float, f_41_: Float, f_42_: Float, f_43_: Float, i: Int, var_aa: aa?, i_44_: Int, i_45_: Int) {
        UA(this.nativeid, f, f_39_, f_40_, f_41_, f_42_, f_43_, i, (var_aa as na).nativeid, i_44_, i_45_)
    }

    public override fun method969(): Int {
        return I(this.nativeid)
    }

    private external fun CA(l: Long, `is`: IntArray?)

    private external fun W(l: Long, i: Int, i_46_: Int, i_47_: Int, i_48_: Int, i_49_: Int)

    public override fun method982(i: Int, i_50_: Int, i_51_: Int, i_52_: Int, i_53_: Int, i_54_: Int, i_55_: Int, i_56_: Int) {
        RA(this.nativeid, i, i_50_, i_51_, i_52_, i_53_, i_54_, i_55_, i_56_)
    }

    public override fun method971(): Int {
        return M(this.nativeid)
    }

    constructor(var_oa: oa?, i: Int, i_57_: Int) {
        EA(var_oa, i, i_57_)
    }

    private external fun b(l: Long, f: Float, f_58_: Float, f_59_: Float, f_60_: Float, f_61_: Float, f_62_: Float, i: Int, i_63_: Int, i_64_: Int, i_65_: Int)

    constructor(var_oa: oa?, `is`: IntArray?, i: Int, i_66_: Int, i_67_: Int, i_68_: Int, bool: Boolean) {
        ua(var_oa, `is`, i, i_66_, i_67_, i_68_, bool)
    }

    private external fun A(l: Long, i: Int, i_69_: Int, i_70_: Int, i_71_: Int)

    private external fun V(l: Long, i: Int, i_72_: Int, l_73_: Long, i_74_: Int, i_75_: Int)

    constructor(var_oa: oa?, `is`: IntArray?, is_76_: ByteArray?, is_77_: ByteArray?, i: Int, i_78_: Int, i_79_: Int, i_80_: Int) {
        ma(var_oa, `is`, is_76_, is_77_, i, i_78_, i_79_, i_80_)
    }

    private external fun N(l: Long, i: Int, i_81_: Int, i_82_: Int)

    private external fun YA(l: Long, i: Int, i_83_: Int, i_84_: Int, i_85_: Int, i_86_: Int, i_87_: Int)

    constructor(var_oa: oa?, i: Int, i_88_: Int, i_89_: Int, i_90_: Int, bool: Boolean) {
        h(var_oa, i, i_88_, i_89_, i_90_, bool)
    }

    private external fun I(l: Long): Int

    protected fun finalize() {
        if (this.nativeid != 0L) Class257.method1947(0, this)
    }

    private external fun ua(var_oa: oa?, `is`: IntArray?, i: Int, i_91_: Int, i_92_: Int, i_93_: Int, bool: Boolean)

    public override fun method979(i: Int, i_94_: Int, i_95_: Int, i_96_: Int, i_97_: Int, i_98_: Int) {
        YA(this.nativeid, i, i_94_, i_95_, i_96_, i_97_, i_98_)
    }

    private external fun h(var_oa: oa?, i: Int, i_99_: Int, i_100_: Int, i_101_: Int, bool: Boolean)

    public override fun method965(i: Int, i_102_: Int, i_103_: Int, i_104_: Int, i_105_: Int, i_106_: Int, i_107_: Int) {
        P(this.nativeid, i, i_102_, i_103_, i_104_, i_105_, i_106_, i_107_)
    }

    public override fun method966(): Int {
        return wa(this.nativeid)
    }

    public override fun method962(f: Float, f_108_: Float, f_109_: Float, f_110_: Float, f_111_: Float, f_112_: Float, i: Int, i_113_: Int, i_114_: Int, i_115_: Int) {
        b(this.nativeid, f, f_108_, f_109_, f_110_, f_111_, f_112_, i, i_113_, i_114_, i_115_)
    }

    private external fun JA(l: Long): Int
}
