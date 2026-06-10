import kotlin.math.min

/* Class324_Sub4 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class324_Sub4 internal constructor(private var aHa_Sub1_6506: ha_Sub1, class143: Class143?, class207s: Array<Class207>, `is`: IntArray, is_0_: IntArray) : Class324(aHa_Sub1_6506, class143) {
    private val anIntArray6503: IntArray
    private val aByteArrayArray6504: Array<ByteArray?>
    private val anIntArray6505: IntArray
    private val anIntArray6507: IntArray
    private val anIntArray6508: IntArray

    init {
        aHa_Sub1_6506 = aHa_Sub1_6506
        anIntArray6503 = `is`
        anIntArray6505 = is_0_
        aByteArrayArray6504 = arrayOfNulls<ByteArray?>(class207s.size)
        anIntArray6508 = IntArray(class207s.size)
        anIntArray6507 = IntArray(class207s.size)
        for (i in class207s.indices) {
            val class207 = class207s[i]!!
            if (class207.aByteArray2695 == null) {
                val is_1_ = class207.aByteArray2699
                aByteArrayArray6504[i] = ByteArray(is_1_.size)
                val is_2_ = aByteArrayArray6504[i]!!
                for (i_3_ in is_1_.indices) is_2_[i_3_] = (if (is_1_[i_3_].toInt() == 0) 0 else -1).toByte()
            } else aByteArrayArray6504[i] = class207.aByteArray2695
            anIntArray6508[i] = class207.anInt2700
            anIntArray6507[i] = class207.anInt2703
        }
    }

    private fun method2594(`is`: ByteArray, is_4_: IntArray, i: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int, var_aa: aa?, i_14_: Int, i_15_: Int) {
        var i_5_ = i_5_
        var i_6_ = i_6_
        val var_aa_Sub3 = var_aa as aa_Sub3
        val is_16_ = var_aa_Sub3.anIntArray5201
        val is_17_ = var_aa_Sub3.anIntArray5202
        val i_18_ = i_11_ - aHa_Sub1_6506.anInt7496
        var i_19_ = i_12_
        if (i_15_ > i_19_) {
            i_19_ = i_15_
            i_6_ += (i_15_ - i_12_) * aHa_Sub1_6506.anInt7477
            i_5_ += (i_15_ - i_12_) * i_13_
        }
        val i_20_ = (min(i_15_ + is_16_!!.size, i_12_ + i_8_))
        for (i_21_ in i_19_..<i_20_) {
            val i_22_ = is_16_[i_21_ - i_15_] + i_14_
            var i_23_ = is_17_!![i_21_ - i_15_]
            var i_24_ = i_7_
            if (i_18_ > i_22_) {
                val i_25_ = i_18_ - i_22_
                if (i_25_ >= i_23_) {
                    i_5_ += i_7_ + i_10_
                    i_6_ += i_7_ + i_9_
                    continue
                }
                i_23_ -= i_25_
            } else {
                val i_26_ = i_22_ - i_18_
                if (i_26_ >= i_7_) {
                    i_5_ += i_7_ + i_10_
                    i_6_ += i_7_ + i_9_
                    continue
                }
                i_5_ += i_26_
                i_24_ -= i_26_
                i_6_ += i_26_
            }
            var i_27_ = 0
            if (i_24_ < i_23_) i_23_ = i_24_
            else i_27_ = i_24_ - i_23_
            for (i_28_ in -i_23_..-1) {
                var i_29_ = `is`[i_5_++].toInt() and 0xff
                if (i_29_ != 0) {
                    val i_30_ = ((((i and 0xff00ff) * i_29_ and 0xff00ff.inv()) + ((i and 0xff00) * i_29_ and 0xff0000)) shr 8)
                    i_29_ = 256 - i_29_
                    val i_31_ = is_4_[i_6_]
                    is_4_[i_6_++] = ((((i_31_ and 0xff00ff) * i_29_ and 0xff00ff.inv()) + ((i_31_ and 0xff00) * i_29_ and 0xff0000)) shr 8) + i_30_
                } else i_6_++
            }
            i_5_ += i_27_ + i_10_
            i_6_ += i_27_ + i_9_
        }
    }

    private fun method2595(`is`: ByteArray, is_32_: IntArray, i: Int, i_33_: Int, i_34_: Int, i_35_: Int, i_36_: Int, i_37_: Int, i_38_: Int) {
        var i_33_ = i_33_
        var i_34_ = i_34_
        for (i_39_ in -i_36_..-1) {
            for (i_40_ in -i_35_..-1) {
                var i_41_ = `is`[i_33_++].toInt() and 0xff
                if (i_41_ != 0) {
                    val i_42_ = ((((i and 0xff00ff) * i_41_ and 0xff00ff.inv()) + ((i and 0xff00) * i_41_ and 0xff0000)) shr 8)
                    i_41_ = 256 - i_41_
                    val i_43_ = is_32_[i_34_]
                    is_32_[i_34_++] = ((((i_43_ and 0xff00ff) * i_41_ and 0xff00ff.inv()) + ((i_43_ and 0xff00) * i_41_ and 0xff0000)) shr 8) + i_42_
                } else i_34_++
            }
            i_34_ += i_37_
            i_33_ += i_38_
        }
    }

    override fun method2578(c: Char, i: Int, i_44_: Int, i_45_: Int, bool: Boolean, var_aa: aa?, i_46_: Int, i_47_: Int) {
        var i = i
        var i_44_ = i_44_
        if (var_aa == null) fa(c, i, i_44_, i_45_, bool)
        else {
            i += anIntArray6507[c.code]
            i_44_ += anIntArray6508[c.code]
            var i_48_ = anIntArray6503[c.code]
            var i_49_ = anIntArray6505[c.code]
            val i_50_ = aHa_Sub1_6506.anInt7477
            var i_51_ = i + i_44_ * i_50_
            var i_52_ = i_50_ - i_48_
            var i_53_ = 0
            var i_54_ = 0
            if (i_44_ < aHa_Sub1_6506.anInt7476) {
                val i_55_ = aHa_Sub1_6506.anInt7476 - i_44_
                i_49_ -= i_55_
                i_44_ = aHa_Sub1_6506.anInt7476
                i_54_ += i_55_ * i_48_
                i_51_ += i_55_ * i_50_
            }
            if (i_44_ + i_49_ > aHa_Sub1_6506.anInt7503) i_49_ -= i_44_ + i_49_ - aHa_Sub1_6506.anInt7503
            if (i < aHa_Sub1_6506.anInt7496) {
                val i_56_ = aHa_Sub1_6506.anInt7496 - i
                i_48_ -= i_56_
                i = aHa_Sub1_6506.anInt7496
                i_54_ += i_56_
                i_51_ += i_56_
                i_53_ += i_56_
                i_52_ += i_56_
            }
            if (i + i_48_ > aHa_Sub1_6506.anInt7507) {
                val i_57_ = i + i_48_ - aHa_Sub1_6506.anInt7507
                i_48_ -= i_57_
                i_53_ += i_57_
                i_52_ += i_57_
            }
            if (i_48_ > 0 && i_49_ > 0) method2594(aByteArrayArray6504[c.code]!!, aHa_Sub1_6506.anIntArray7483!!, i_45_, i_54_, i_51_, i_48_, i_49_, i_52_, i_53_, i, i_44_, anIntArray6503[c.code], var_aa, i_46_, i_47_)
        }
    }

    override fun fa(c: Char, i: Int, i_58_: Int, i_59_: Int, bool: Boolean) {
        var i = i
        var i_58_ = i_58_
        i += anIntArray6507[c.code]
        i_58_ += anIntArray6508[c.code]
        var i_60_ = anIntArray6503[c.code]
        var i_61_ = anIntArray6505[c.code]
        val i_62_ = aHa_Sub1_6506.anInt7477
        var i_63_ = i + i_58_ * i_62_
        var i_64_ = i_62_ - i_60_
        var i_65_ = 0
        var i_66_ = 0
        if (i_58_ < aHa_Sub1_6506.anInt7476) {
            val i_67_ = aHa_Sub1_6506.anInt7476 - i_58_
            i_61_ -= i_67_
            i_58_ = aHa_Sub1_6506.anInt7476
            i_66_ += i_67_ * i_60_
            i_63_ += i_67_ * i_62_
        }
        if (i_58_ + i_61_ > aHa_Sub1_6506.anInt7503) i_61_ -= i_58_ + i_61_ - aHa_Sub1_6506.anInt7503
        if (i < aHa_Sub1_6506.anInt7496) {
            val i_68_ = aHa_Sub1_6506.anInt7496 - i
            i_60_ -= i_68_
            i = aHa_Sub1_6506.anInt7496
            i_66_ += i_68_
            i_63_ += i_68_
            i_65_ += i_68_
            i_64_ += i_68_
        }
        if (i + i_60_ > aHa_Sub1_6506.anInt7507) {
            val i_69_ = i + i_60_ - aHa_Sub1_6506.anInt7507
            i_60_ -= i_69_
            i_65_ += i_69_
            i_64_ += i_69_
        }
        if (i_60_ > 0 && i_61_ > 0) method2595(aByteArrayArray6504[c.code]!!, aHa_Sub1_6506.anIntArray7483!!, i_59_, i_66_, i_63_, i_60_, i_61_, i_64_, i_65_)
    }
}
