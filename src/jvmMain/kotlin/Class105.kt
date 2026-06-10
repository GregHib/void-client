import kotlin.math.cos
import kotlin.math.sin

/* Class105 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class105 : Interface3 {
    private fun method961(f: Float, f_0_: Float, f_1_: Float, f_2_: Float, i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
        if (i != 0) {
            val d = (i_3_ and 0xffff).toDouble() * 9.587379924285257E-5
            val f_7_ = sin(d).toFloat() * i.toFloat()
            val f_8_ = cos(d).toFloat() * i.toFloat()
            val f_9_ = (-f_1_ * f_8_ + -f_2_ * f_7_) / 4096.0f + f
            val f_10_ = (f_1_ * f_7_ + -f_2_ * f_8_) / 4096.0f + f_0_
            val f_11_ = (((method966().toFloat() - f_1_) * f_8_ + -f_2_ * f_7_) / 4096.0f + f)
            val f_12_ = ((-(method966().toFloat() - f_1_) * f_7_ + -f_2_ * f_8_) / 4096.0f + f_0_)
            val f_13_ = ((-f_1_ * f_8_ + (method980().toFloat() - f_2_) * f_7_) / 4096.0f + f)
            val f_14_ = (((f_1_ * f_7_ + (method980().toFloat() - f_2_) * f_8_) / 4096.0f) + f_0_)
            method978(f_9_, f_10_, f_11_, f_12_, f_13_, f_14_, i_4_, i_5_, i_6_)
        }
    }

    abstract fun method962(f: Float, f_15_: Float, f_16_: Float, f_17_: Float, f_18_: Float, f_19_: Float, i: Int, i_20_: Int, i_21_: Int, i_22_: Int)

    abstract fun method963(i: Int, i_23_: Int, var_aa: aa?, i_24_: Int, i_25_: Int)

    abstract fun method964(i: Int, i_26_: Int, i_27_: Int, i_28_: Int, i_29_: Int)

    abstract fun method965(i: Int, i_30_: Int, i_31_: Int, i_32_: Int, i_33_: Int, i_34_: Int, i_35_: Int)

    abstract fun method966(): Int

    fun method967(f: Float, f_36_: Float, f_37_: Float, f_38_: Float, i: Int, i_39_: Int, var_aa: aa?, i_40_: Int, i_41_: Int) {
        if (i != 0) {
            val d = (i_39_ and 0xffff).toDouble() * 9.587379924285257E-5
            val f_42_ = sin(d).toFloat() * i.toFloat()
            val f_43_ = cos(d).toFloat() * i.toFloat()
            val f_44_ = (-f_37_ * f_43_ + -f_38_ * f_42_) / 4096.0f + f
            val f_45_ = (f_37_ * f_42_ + -f_38_ * f_43_) / 4096.0f + f_36_
            val f_46_ = (((method966().toFloat() - f_37_) * f_43_ + -f_38_ * f_42_) / 4096.0f + f)
            val f_47_ = ((-(method966().toFloat() - f_37_) * f_42_ + -f_38_ * f_43_) / 4096.0f + f_36_)
            val f_48_ = ((-f_37_ * f_43_ + (method980().toFloat() - f_38_) * f_42_) / 4096.0f + f)
            val f_49_ = ((f_37_ * f_42_ + (method980().toFloat() - f_38_) * f_43_) / 4096.0f + f_36_)
            method975(f_44_, f_45_, f_46_, f_47_, f_48_, f_49_, var_aa, i_40_, i_41_)
        }
    }

    abstract fun method968(i: Int, i_50_: Int, i_51_: Int)

    abstract fun method969(): Int

    fun method970(i: Int, i_52_: Int, i_53_: Int, i_54_: Int, i_55_: Int, i_56_: Int, i_57_: Int) {
        method982(i, i_52_, i_53_, i_54_, i_55_, i_56_, i_57_, 1)
    }

    abstract fun method971(): Int

    fun method972(i: Int, i_58_: Int, i_59_: Int, i_60_: Int) {
        method965(i, i_58_, i_59_, i_60_, 1, 0, 1)
    }

    fun method973(i: Int, i_61_: Int, i_62_: Int, i_63_: Int) {
        method982(i, i_61_, i_62_, i_63_, 1, 0, 1, 1)
    }

    fun method974(i: Int, i_64_: Int) {
        method964(i, i_64_, 1, 0, 1)
    }

    private fun method975(f: Float, f_65_: Float, f_66_: Float, f_67_: Float, f_68_: Float, f_69_: Float, var_aa: aa?, i: Int, i_70_: Int) {
        method983(f, f_65_, f_66_, f_67_, f_68_, f_69_, 1, var_aa, i, i_70_)
    }

    fun method976(f: Float, f_71_: Float, i: Int, i_72_: Int, var_aa: aa?, i_73_: Int, i_74_: Int) {
        method967(f, f_71_, method966().toFloat() / 2.0f, method980().toFloat() / 2.0f, i, i_72_, var_aa, i_73_, i_74_)
    }

    fun method977(f: Float, f_75_: Float, i: Int, i_76_: Int, i_77_: Int, i_78_: Int, i_79_: Int) {
        method961(f, f_75_, method966().toFloat() / 2.0f, method980().toFloat() / 2.0f, i, i_76_, i_77_, i_78_, i_79_)
    }

    private fun method978(f: Float, f_80_: Float, f_81_: Float, f_82_: Float, f_83_: Float, f_84_: Float, i: Int, i_85_: Int, i_86_: Int) {
        method962(f, f_80_, f_81_, f_82_, f_83_, f_84_, i, i_85_, i_86_, 1)
    }

    abstract fun method979(i: Int, i_87_: Int, i_88_: Int, i_89_: Int, i_90_: Int, i_91_: Int)

    abstract fun method980(): Int

    fun method981(f: Float, f_92_: Float, i: Int, i_93_: Int) {
        method961(f, f_92_, method966().toFloat() / 2.0f, method980().toFloat() / 2.0f, i, i_93_, 1, 0, 1)
    }

    abstract fun method982(i: Int, i_94_: Int, i_95_: Int, i_96_: Int, i_97_: Int, i_98_: Int, i_99_: Int, i_100_: Int)

    abstract fun method983(f: Float, f_101_: Float, f_102_: Float, f_103_: Float, f_104_: Float, f_105_: Float, i: Int, var_aa: aa?, i_106_: Int, i_107_: Int)

    abstract fun method984(`is`: IntArray?)

    abstract fun method985(i: Int, i_108_: Int, i_109_: Int, i_110_: Int)
}
