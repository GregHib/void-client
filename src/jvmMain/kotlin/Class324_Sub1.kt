import kotlin.math.min

/* Class324_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class324_Sub1 internal constructor(private val aHa_Sub1_6486: ha_Sub1, class143: Class143?, class207s: Array<Class207>, private val anIntArray6489: IntArray, private val anIntArray6488: IntArray) : Class324(aHa_Sub1_6486, class143) {
    private val anIntArray6487: IntArray
    private val aByteArrayArray6490: Array<ByteArray?>
    private val anIntArray6491: IntArray

    override fun fa(c: Char, i: Int, i_0_: Int, i_1_: Int, bool: Boolean) {
        var i = i
        var i_0_ = i_0_
        i += anIntArray6491[c.code]
        i_0_ += anIntArray6487[c.code]
        var i_2_ = anIntArray6489[c.code]
        var i_3_ = anIntArray6488[c.code]
        val i_4_ = aHa_Sub1_6486.anInt7477
        var i_5_ = i + i_0_ * i_4_
        var i_6_ = i_4_ - i_2_
        var i_7_ = 0
        var i_8_ = 0
        if (i_0_ < aHa_Sub1_6486.anInt7476) {
            val i_9_ = aHa_Sub1_6486.anInt7476 - i_0_
            i_3_ -= i_9_
            i_0_ = aHa_Sub1_6486.anInt7476
            i_8_ += i_9_ * i_2_
            i_5_ += i_9_ * i_4_
        }
        if (i_0_ + i_3_ > aHa_Sub1_6486.anInt7503) i_3_ -= i_0_ + i_3_ - aHa_Sub1_6486.anInt7503
        if (i < aHa_Sub1_6486.anInt7496) {
            val i_10_ = aHa_Sub1_6486.anInt7496 - i
            i_2_ -= i_10_
            i = aHa_Sub1_6486.anInt7496
            i_8_ += i_10_
            i_5_ += i_10_
            i_7_ += i_10_
            i_6_ += i_10_
        }
        if (i + i_2_ > aHa_Sub1_6486.anInt7507) {
            val i_11_ = i + i_2_ - aHa_Sub1_6486.anInt7507
            i_2_ -= i_11_
            i_7_ += i_11_
            i_6_ += i_11_
        }
        if (i_2_ > 0 && i_3_ > 0) {
            if ((i_1_ and 0xffffff.inv()) == -16777216) method2588(aByteArrayArray6490[c.code]!!, aHa_Sub1_6486.anIntArray7483!!, i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_)
            else if ((i_1_ and 0xffffff.inv()) != 0) method2586(aByteArrayArray6490[c.code]!!, aHa_Sub1_6486.anIntArray7483!!, i_1_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_)
        }
    }

    private fun method2586(`is`: ByteArray, is_12_: IntArray, i: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Int, i_18_: Int) {
        var i_13_ = i_13_
        var i_14_ = i_14_
        val i_19_ = i ushr 24
        val i_20_ = 255 - i_19_
        for (i_21_ in -i_16_..-1) {
            for (i_22_ in -i_15_..-1) {
                if (`is`[i_13_++].toInt() != 0) {
                    val i_23_ = ((((i and 0xff00ff) * i_19_ and 0xff00ff.inv()) + ((i and 0xff00) * i_19_ and 0xff0000)) shr 8)
                    val i_24_ = is_12_[i_14_]
                    is_12_[i_14_++] = ((((i_24_ and 0xff00ff) * i_20_ and 0xff00ff.inv()) + ((i_24_ and 0xff00) * i_20_ and 0xff0000)) shr 8) + i_23_
                } else i_14_++
            }
            i_14_ += i_17_
            i_13_ += i_18_
        }
    }

    private fun method2587(`is`: ByteArray, is_25_: IntArray, i: Int, i_26_: Int, i_27_: Int, i_28_: Int, i_29_: Int, i_30_: Int, i_31_: Int, i_32_: Int, i_33_: Int, i_34_: Int, var_aa: aa?, i_35_: Int, i_36_: Int) {
        var i_26_ = i_26_
        var i_27_ = i_27_
        val var_aa_Sub3 = var_aa as aa_Sub3
        val is_37_ = var_aa_Sub3.anIntArray5201
        val is_38_ = var_aa_Sub3.anIntArray5202
        var i_39_ = i_33_
        if (i_36_ > i_39_) {
            i_39_ = i_36_
            i_27_ += (i_36_ - i_33_) * aHa_Sub1_6486.anInt7477
            i_26_ += (i_36_ - i_33_) * i_34_
        }
        val i_40_ = (min(i_36_ + is_37_!!.size, i_33_ + i_29_))
        for (i_41_ in i_39_..<i_40_) {
            val i_42_ = i_35_ + is_37_[i_41_ - i_36_]
            var i_43_ = is_38_!![i_41_ - i_36_]
            var i_44_ = i_28_
            if (i_32_ > i_42_) {
                val i_45_ = i_32_ - i_42_
                if (i_45_ >= i_43_) {
                    i_26_ += i_28_ + i_31_
                    i_27_ += i_28_ + i_30_
                    continue
                }
                i_43_ -= i_45_
            } else {
                val i_46_ = i_42_ - i_32_
                if (i_46_ >= i_28_) {
                    i_26_ += i_28_ + i_31_
                    i_27_ += i_28_ + i_30_
                    continue
                }
                i_26_ += i_46_
                i_44_ -= i_46_
                i_27_ += i_46_
            }
            var i_47_ = 0
            if (i_44_ < i_43_) i_43_ = i_44_
            else i_47_ = i_44_ - i_43_
            for (i_48_ in 0..<i_43_) {
                if (`is`[i_26_++].toInt() != 0) is_25_[i_27_++] = i
                else i_27_++
            }
            i_26_ += i_47_ + i_31_
            i_27_ += i_47_ + i_30_
        }
    }

    private fun method2588(`is`: ByteArray, is_49_: IntArray, i: Int, i_50_: Int, i_51_: Int, i_52_: Int, i_53_: Int, i_54_: Int, i_55_: Int) {
        var i_50_ = i_50_
        var i_51_ = i_51_
        var i_52_ = i_52_
        val i_56_ = -(i_52_ shr 2)
        i_52_ = -(i_52_ and 0x3)
        for (i_57_ in -i_53_..-1) {
            for (i_58_ in i_56_..-1) {
                if (`is`[i_50_++].toInt() != 0) is_49_[i_51_++] = i
                else i_51_++
                if (`is`[i_50_++].toInt() != 0) is_49_[i_51_++] = i
                else i_51_++
                if (`is`[i_50_++].toInt() != 0) is_49_[i_51_++] = i
                else i_51_++
                if (`is`[i_50_++].toInt() != 0) is_49_[i_51_++] = i
                else i_51_++
            }
            for (i_59_ in i_52_..-1) {
                if (`is`[i_50_++].toInt() != 0) is_49_[i_51_++] = i
                else i_51_++
            }
            i_51_ += i_54_
            i_50_ += i_55_
        }
    }

    override fun method2578(c: Char, i: Int, i_60_: Int, i_61_: Int, bool: Boolean, var_aa: aa?, i_62_: Int, i_63_: Int) {
        var i = i
        var i_60_ = i_60_
        if (var_aa == null) fa(c, i, i_60_, i_61_, bool)
        else {
            i += anIntArray6491[c.code]
            i_60_ += anIntArray6487[c.code]
            var i_64_ = anIntArray6489[c.code]
            var i_65_ = anIntArray6488[c.code]
            val i_66_ = aHa_Sub1_6486.anInt7477
            var i_67_ = i + i_60_ * i_66_
            var i_68_ = i_66_ - i_64_
            var i_69_ = 0
            var i_70_ = 0
            if (i_60_ < aHa_Sub1_6486.anInt7476) {
                val i_71_ = aHa_Sub1_6486.anInt7476 - i_60_
                i_65_ -= i_71_
                i_60_ = aHa_Sub1_6486.anInt7476
                i_70_ += i_71_ * i_64_
                i_67_ += i_71_ * i_66_
            }
            if (i_60_ + i_65_ > aHa_Sub1_6486.anInt7503) i_65_ -= i_60_ + i_65_ - aHa_Sub1_6486.anInt7503
            if (i < aHa_Sub1_6486.anInt7496) {
                val i_72_ = aHa_Sub1_6486.anInt7496 - i
                i_64_ -= i_72_
                i = aHa_Sub1_6486.anInt7496
                i_70_ += i_72_
                i_67_ += i_72_
                i_69_ += i_72_
                i_68_ += i_72_
            }
            if (i + i_64_ > aHa_Sub1_6486.anInt7507) {
                val i_73_ = i + i_64_ - aHa_Sub1_6486.anInt7507
                i_64_ -= i_73_
                i_69_ += i_73_
                i_68_ += i_73_
            }
            if (i_64_ > 0 && i_65_ > 0) {
                if ((i_61_ and 0xffffff.inv()) == -16777216) method2587(aByteArrayArray6490[c.code]!!, aHa_Sub1_6486.anIntArray7483!!, i_61_, i_70_, i_67_, i_64_, i_65_, i_68_, i_69_, i, i_60_, anIntArray6489[c.code], var_aa, i_62_, i_63_)
                else method2589(aByteArrayArray6490[c.code]!!, aHa_Sub1_6486.anIntArray7483!!, i_61_, i_70_, i_67_, i_64_, i_65_, i_68_, i_69_, i, i_60_, anIntArray6489[c.code], var_aa, i_62_, i_63_)
            }
        }
    }

    private fun method2589(`is`: ByteArray, is_74_: IntArray, i: Int, i_75_: Int, i_76_: Int, i_77_: Int, i_78_: Int, i_79_: Int, i_80_: Int, i_81_: Int, i_82_: Int, i_83_: Int, var_aa: aa?, i_84_: Int, i_85_: Int) {
        var i_75_ = i_75_
        var i_76_ = i_76_
        val var_aa_Sub3 = var_aa as aa_Sub3
        val is_86_ = var_aa_Sub3.anIntArray5201
        val is_87_ = var_aa_Sub3.anIntArray5202
        val i_88_ = i_81_ - aHa_Sub1_6486.anInt7496
        var i_89_ = i_82_
        if (i_85_ > i_89_) {
            i_89_ = i_85_
            i_76_ += (i_85_ - i_82_) * aHa_Sub1_6486.anInt7477
            i_75_ += (i_85_ - i_82_) * i_83_
        }
        val i_90_ = (min(i_85_ + is_86_!!.size, i_82_ + i_78_))
        val i_91_ = i ushr 24
        val i_92_ = 255 - i_91_
        for (i_93_ in i_89_..<i_90_) {
            val i_94_ = is_86_[i_93_ - i_85_] + i_84_
            var i_95_ = is_87_!![i_93_ - i_85_]
            var i_96_ = i_77_
            if (i_88_ > i_94_) {
                val i_97_ = i_88_ - i_94_
                if (i_97_ >= i_95_) {
                    i_75_ += i_77_ + i_80_
                    i_76_ += i_77_ + i_79_
                    continue
                }
                i_95_ -= i_97_
            } else {
                val i_98_ = i_94_ - i_88_
                if (i_98_ >= i_77_) {
                    i_75_ += i_77_ + i_80_
                    i_76_ += i_77_ + i_79_
                    continue
                }
                i_75_ += i_98_
                i_96_ -= i_98_
                i_76_ += i_98_
            }
            var i_99_ = 0
            if (i_96_ < i_95_) i_95_ = i_96_
            else i_99_ = i_96_ - i_95_
            for (i_100_ in -i_95_..-1) {
                if (`is`[i_75_++].toInt() != 0) {
                    val i_101_ = ((((i and 0xff00ff) * i_91_ and 0xff00ff.inv()) + ((i and 0xff00) * i_91_ and 0xff0000)) shr 8)
                    val i_102_ = is_74_[i_76_]
                    is_74_[i_76_++] = ((((i_102_ and 0xff00ff) * i_92_ and 0xff00ff.inv()) + ((i_102_ and 0xff00) * i_92_ and 0xff0000)) shr 8) + i_101_
                } else i_76_++
            }
            i_75_ += i_99_ + i_80_
            i_76_ += i_99_ + i_79_
        }
    }

    init {
        aByteArrayArray6490 = arrayOfNulls<ByteArray>(class207s.size)
        anIntArray6487 = IntArray(class207s.size)
        anIntArray6491 = IntArray(class207s.size)
        for (i in class207s.indices) {
            aByteArrayArray6490[i] = class207s[i]!!.aByteArray2699
            anIntArray6487[i] = class207s[i]!!.anInt2700
            anIntArray6491[i] = class207s[i]!!.anInt2703
        }
    }
}
