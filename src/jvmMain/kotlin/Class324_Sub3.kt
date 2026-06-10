import kotlin.math.min

/* Class324_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class324_Sub3 internal constructor(private var aHa_Sub1_6499: ha_Sub1, class143: Class143?, class207s: Array<Class207>, `is`: IntArray, is_49_: IntArray) : Class324(aHa_Sub1_6499, class143) {
    private val anIntArray6496: IntArray
    private val anIntArray6497: IntArray
    private val anIntArray6498: IntArray
    private val anIntArray6500: IntArray
    private val anIntArray6501: IntArray
    private val aByteArrayArray6502: Array<ByteArray?>

    private fun method2590(`is`: ByteArray, is_0_: IntArray, i: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
        var i_1_ = i_1_
        var i_2_ = i_2_
        var i_3_ = i_3_
        val i_7_ = -(i_3_ shr 2)
        i_3_ = -(i_3_ and 0x3)
        for (i_8_ in -i_4_..-1) {
            for (i_9_ in i_7_..-1) {
                if (`is`[i_1_++].toInt() != 0) is_0_[i_2_++] = i
                else i_2_++
                if (`is`[i_1_++].toInt() != 0) is_0_[i_2_++] = i
                else i_2_++
                if (`is`[i_1_++].toInt() != 0) is_0_[i_2_++] = i
                else i_2_++
                if (`is`[i_1_++].toInt() != 0) is_0_[i_2_++] = i
                else i_2_++
            }
            for (i_10_ in i_3_..-1) {
                if (`is`[i_1_++].toInt() != 0) is_0_[i_2_++] = i
                else i_2_++
            }
            i_2_ += i_5_
            i_1_ += i_6_
        }
    }

    private fun method2591(`is`: ByteArray, is_11_: IntArray, is_12_: IntArray, i: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Int) {
        var i = i
        var i_13_ = i_13_
        var i_14_ = i_14_
        val i_18_ = -(i_14_ shr 2)
        i_14_ = -(i_14_ and 0x3)
        val bool = false
        for (i_19_ in -i_15_..-1) {
            for (i_20_ in i_18_..-1) {
                var i_21_: Int
                if ((`is`[i++].also { i_21_ = it.toInt() }).toInt() != 0) is_11_[i_13_++] = is_12_[i_21_ and 0xff]
                else i_13_++
                if ((`is`[i++].also { i_21_ = it.toInt() }).toInt() != 0) is_11_[i_13_++] = is_12_[i_21_ and 0xff]
                else i_13_++
                if ((`is`[i++].also { i_21_ = it.toInt() }).toInt() != 0) is_11_[i_13_++] = is_12_[i_21_ and 0xff]
                else i_13_++
                if ((`is`[i++].also { i_21_ = it.toInt() }).toInt() != 0) is_11_[i_13_++] = is_12_[i_21_ and 0xff]
                else i_13_++
            }
            for (i_22_ in i_14_..-1) {
                val i_23_: Int
                if ((`is`[i++].also { i_23_ = it.toInt() }).toInt() != 0) is_11_[i_13_++] = is_12_[i_23_ and 0xff]
                else i_13_++
            }
            i_13_ += i_16_
            i += i_17_
        }
    }

    private fun method2592(`is`: ByteArray, is_24_: IntArray, i: Int, i_25_: Int, i_26_: Int, i_27_: Int, i_28_: Int, i_29_: Int, i_30_: Int, i_31_: Int, i_32_: Int, i_33_: Int, var_aa: aa?, i_34_: Int, i_35_: Int) {
        var i_25_ = i_25_
        var i_26_ = i_26_
        val var_aa_Sub3 = var_aa as aa_Sub3
        val is_36_ = var_aa_Sub3.anIntArray5201
        val is_37_ = var_aa_Sub3.anIntArray5202
        val i_38_ = i_31_ - aHa_Sub1_6499.anInt7496
        var i_39_ = i_32_
        if (i_35_ > i_39_) {
            i_39_ = i_35_
            i_26_ += (i_35_ - i_32_) * aHa_Sub1_6499.anInt7477
            i_25_ += (i_35_ - i_32_) * i_33_
        }
        val i_40_ = (min(i_35_ + is_36_!!.size, i_32_ + i_28_))
        for (i_41_ in i_39_..<i_40_) {
            val i_42_ = is_36_[i_41_ - i_35_] + i_34_
            var i_43_ = is_37_!![i_41_ - i_35_]
            var i_44_ = i_27_
            if (i_38_ > i_42_) {
                val i_45_ = i_38_ - i_42_
                if (i_45_ >= i_43_) {
                    i_25_ += i_27_ + i_30_
                    i_26_ += i_27_ + i_29_
                    continue
                }
                i_43_ -= i_45_
            } else {
                val i_46_ = i_42_ - i_38_
                if (i_46_ >= i_27_) {
                    i_25_ += i_27_ + i_30_
                    i_26_ += i_27_ + i_29_
                    continue
                }
                i_25_ += i_46_
                i_44_ -= i_46_
                i_26_ += i_46_
            }
            var i_47_ = 0
            if (i_44_ < i_43_) i_43_ = i_44_
            else i_47_ = i_44_ - i_43_
            for (i_48_ in -i_43_..-1) {
                if (`is`[i_25_++].toInt() != 0) is_24_[i_26_++] = i
                else i_26_++
            }
            i_25_ += i_47_ + i_25_
            i_26_ += i_47_ + i_29_
        }
    }

    init {
        aHa_Sub1_6499 = aHa_Sub1_6499
        anIntArray6500 = `is`
        anIntArray6497 = is_49_
        aByteArrayArray6502 = arrayOfNulls<ByteArray>(class207s.size)
        anIntArray6501 = IntArray(class207s.size)
        anIntArray6498 = IntArray(class207s.size)
        for (i in class207s.indices) {
            aByteArrayArray6502[i] = class207s[i]!!.aByteArray2699
            anIntArray6501[i] = class207s[i]!!.anInt2700
            anIntArray6498[i] = class207s[i]!!.anInt2703
        }
        anIntArray6496 = class207s[0]!!.anIntArray2697
    }

    override fun method2578(c: Char, i: Int, i_50_: Int, i_51_: Int, bool: Boolean, var_aa: aa?, i_52_: Int, i_53_: Int) {
        var i = i
        var i_50_ = i_50_
        if (var_aa == null) fa(c, i, i_50_, i_51_, bool)
        else {
            i += anIntArray6498[c.code]
            i_50_ += anIntArray6501[c.code]
            var i_54_ = anIntArray6500[c.code]
            var i_55_ = anIntArray6497[c.code]
            val i_56_ = aHa_Sub1_6499.anInt7477
            var i_57_ = i + i_50_ * i_56_
            var i_58_ = i_56_ - i_54_
            var i_59_ = 0
            var i_60_ = 0
            if (i_50_ < aHa_Sub1_6499.anInt7476) {
                val i_61_ = aHa_Sub1_6499.anInt7476 - i_50_
                i_55_ -= i_61_
                i_50_ = aHa_Sub1_6499.anInt7476
                i_60_ += i_61_ * i_54_
                i_57_ += i_61_ * i_56_
            }
            if (i_50_ + i_55_ > aHa_Sub1_6499.anInt7503) i_55_ -= i_50_ + i_55_ - aHa_Sub1_6499.anInt7503
            if (i < aHa_Sub1_6499.anInt7496) {
                val i_62_ = aHa_Sub1_6499.anInt7496 - i
                i_54_ -= i_62_
                i = aHa_Sub1_6499.anInt7496
                i_60_ += i_62_
                i_57_ += i_62_
                i_59_ += i_62_
                i_58_ += i_62_
            }
            if (i + i_54_ > aHa_Sub1_6499.anInt7507) {
                val i_63_ = i + i_54_ - aHa_Sub1_6499.anInt7507
                i_54_ -= i_63_
                i_59_ += i_63_
                i_58_ += i_63_
            }
            if (i_54_ > 0 && i_55_ > 0) {
                if (bool) method2592(aByteArrayArray6502[c.code]!!, aHa_Sub1_6499.anIntArray7483!!, i_51_, i_60_, i_57_, i_54_, i_55_, i_58_, i_59_, i, i_50_, anIntArray6500[c.code], var_aa, i_52_, i_53_)
                else method2593(aByteArrayArray6502[c.code]!!, aHa_Sub1_6499.anIntArray7483!!, anIntArray6496, i_51_, i_60_, i_57_, i_54_, i_55_, i_58_, i_59_, i, i_50_, anIntArray6500[c.code], var_aa, i_52_, i_53_)
            }
        }
    }

    override fun fa(c: Char, i: Int, i_64_: Int, i_65_: Int, bool: Boolean) {
        var i = i
        var i_64_ = i_64_
        i += anIntArray6498[c.code]
        i_64_ += anIntArray6501[c.code]
        var i_66_ = anIntArray6500[c.code]
        var i_67_ = anIntArray6497[c.code]
        val i_68_ = aHa_Sub1_6499.anInt7477
        var i_69_ = i + i_64_ * i_68_
        var i_70_ = i_68_ - i_66_
        var i_71_ = 0
        var i_72_ = 0
        if (i_64_ < aHa_Sub1_6499.anInt7476) {
            val i_73_ = aHa_Sub1_6499.anInt7476 - i_64_
            i_67_ -= i_73_
            i_64_ = aHa_Sub1_6499.anInt7476
            i_72_ += i_73_ * i_66_
            i_69_ += i_73_ * i_68_
        }
        if (i_64_ + i_67_ > aHa_Sub1_6499.anInt7503) i_67_ -= i_64_ + i_67_ - aHa_Sub1_6499.anInt7503
        if (i < aHa_Sub1_6499.anInt7496) {
            val i_74_ = aHa_Sub1_6499.anInt7496 - i
            i_66_ -= i_74_
            i = aHa_Sub1_6499.anInt7496
            i_72_ += i_74_
            i_69_ += i_74_
            i_71_ += i_74_
            i_70_ += i_74_
        }
        if (i + i_66_ > aHa_Sub1_6499.anInt7507) {
            val i_75_ = i + i_66_ - aHa_Sub1_6499.anInt7507
            i_66_ -= i_75_
            i_71_ += i_75_
            i_70_ += i_75_
        }
        if (i_66_ > 0 && i_67_ > 0) {
            if (bool) method2590(aByteArrayArray6502[c.code]!!, aHa_Sub1_6499.anIntArray7483!!, i_65_, i_72_, i_69_, i_66_, i_67_, i_70_, i_71_)
            else method2591(aByteArrayArray6502[c.code]!!, aHa_Sub1_6499.anIntArray7483!!, anIntArray6496, i_72_, i_69_, i_66_, i_67_, i_70_, i_71_)
        }
    }

    private fun method2593(`is`: ByteArray, is_76_: IntArray, is_77_: IntArray, i: Int, i_78_: Int, i_79_: Int, i_80_: Int, i_81_: Int, i_82_: Int, i_83_: Int, i_84_: Int, i_85_: Int, i_86_: Int, var_aa: aa?, i_87_: Int, i_88_: Int) {
        var i_78_ = i_78_
        var i_79_ = i_79_
        val var_aa_Sub3 = var_aa as aa_Sub3
        val is_89_ = var_aa_Sub3.anIntArray5201
        val is_90_ = var_aa_Sub3.anIntArray5202
        val i_91_ = i_84_ - aHa_Sub1_6499.anInt7496
        var i_92_ = i_85_
        if (i_88_ > i_92_) {
            i_92_ = i_88_
            i_79_ += (i_88_ - i_85_) * aHa_Sub1_6499.anInt7477
            i_78_ += (i_88_ - i_85_) * i_86_
        }
        val i_93_ = (min(i_88_ + is_89_!!.size, i_85_ + i_81_))
        val bool = false
        for (i_94_ in i_92_..<i_93_) {
            val i_95_ = is_89_[i_94_ - i_88_] + i_87_
            var i_96_ = is_90_!![i_94_ - i_88_]
            var i_97_ = i_80_
            if (i_91_ > i_95_) {
                val i_98_ = i_91_ - i_95_
                if (i_98_ >= i_96_) {
                    i_78_ += i_80_ + i_83_
                    i_79_ += i_80_ + i_82_
                    continue
                }
                i_96_ -= i_98_
            } else {
                val i_99_ = i_95_ - i_91_
                if (i_99_ >= i_80_) {
                    i_78_ += i_80_ + i_83_
                    i_79_ += i_80_ + i_82_
                    continue
                }
                i_78_ += i_99_
                i_97_ -= i_99_
                i_79_ += i_99_
            }
            var i_100_ = 0
            if (i_97_ < i_96_) i_96_ = i_97_
            else i_100_ = i_97_ - i_96_
            for (i_101_ in -i_96_..-1) {
                val i_102_: Int
                if ((`is`[i_78_++].also { i_102_ = it.toInt() }).toInt() != 0) is_76_[i_79_++] = is_77_[i_102_ and 0xff]
                else i_79_++
            }
            i_78_ += i_100_ + i_83_
            i_79_ += i_100_ + i_82_
        }
    }
}
