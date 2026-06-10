import Class139.Companion.method1166
import Class171.Companion.method1320
import Class185.Companion.method1394
import Class199.Companion.method1457
import Class239.Companion.method1709
import Class258_Sub3.Companion.method1968
import Class318_Sub1_Sub5.Companion.method2483
import Class324.Companion.method2570
import Class348_Sub45.Companion.method3313
import Class367_Sub8.Companion.method3547
import Class369_Sub3_Sub1.Companion.method3576
import Class58.Companion.method536
import Class79.Companion.method802
import Class87.Companion.method837

/* Class237 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class Class237(i: Int, i_315_: Int, i_316_: Int, bool: Boolean, class268: Class268?, class183: Class183?) {
    var aByteArrayArrayArray3104: Array<Array<ByteArray?>?>? = null
    var aByteArrayArrayArray3108: Array<Array<ByteArray?>?>?
    var aBoolean3109: Boolean = false
    private val aByteArrayArrayArray3113: Array<Array<ByteArray?>?>
    var anInt3114: Int = 0
    var anInt3117: Int = 0
    private val aClass268_3119: Class268?
    private val aClass183_3120: Class183?
    var anIntArrayArrayArray3122: Array<Array<IntArray?>?>
    private val aByteArrayArrayArray3123: Array<Array<ByteArray?>?>
    private val anIntArray3124: IntArray
    private val aByteArrayArrayArray3126: Array<Array<ByteArray?>?>
    private val anIntArray3128 = intArrayOf(0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256)
    private val aByteArrayArrayArray3129: Array<Array<ByteArray?>?>
    var anInt3130: Int = 0
    private fun method1675(i: Int, i_0_: Int, `is`: Array<ByteArray?>?, i_1_: Int, is_2_: Array<ByteArray?>?, i_3_: Int, class277: Class277?, class22: Class22?, bools: BooleanArray?, i_4_: Int, is_5_: Array<ByteArray?>?, i_6_: Int, i_7_: Int, var_ha: ha?) {
        do {
            try {
                anInt3112++
                val bools_8_: BooleanArray = (if (class277 != null && class277.aBoolean3560) Class50_Sub1.aBooleanArrayArray5225!![i_7_] else Class265.aBooleanArrayArray4693!![i_7_])!!
                if (i_1_ > 0) {
                    if (i > 0) {
                        val i_9_ = is_5_!![i + -1]!![i_1_ - 1].toInt() and 0xff
                        if (i_9_ > 0) {
                            val class277_10_ = aClass268_3119!!.method2034(i_9_ - 1, false)
                            if (class277_10_.anInt3563 != -1 && class277_10_.aBoolean3560) {
                                val i_11_ = `is`!![-1 + i]!![i_1_ - 1]
                                val i_12_ = 4 + is_2_!![i + -1]!![-1 + i_1_] * 2 and 0x7
                                val i_13_ = (Class348_Sub42_Sub17.method3266(var_ha, 127, class277_10_))
                                if (Class160.aBooleanArrayArray2133!![i_11_.toInt()]!![i_12_]) {
                                    Class348_Sub15.anIntArray6775!![0] = class277_10_.anInt3563
                                    Class348_Sub40_Sub38.anIntArray9480!![0] = i_13_
                                    Class223.anIntArray2899!![0] = class277_10_.anInt3575
                                    Class348_Sub6.anIntArray6631!![0] = class277_10_.anInt3570
                                    Class306.anIntArray3873!![0] = class277_10_.anInt3564
                                    Class180.anIntArray2370!![0] = 256
                                }
                            }
                        }
                    }
                    if (i < i_6_ + -1) {
                        val i_14_ = 0xff and is_5_!![1 + i]!![i_1_ - 1].toInt()
                        if (i_14_ > 0) {
                            val class277_15_ = aClass268_3119!!.method2034(i_14_ - 1, false)
                            if (class277_15_.anInt3563 != -1 && class277_15_.aBoolean3560) {
                                val i_16_ = `is`!![i + 1]!![-1 + i_1_]
                                val i_17_ = 0x7 and 2 * is_2_!![1 + i]!![i_1_ + -1] + 6
                                val i_18_ = (Class348_Sub42_Sub17.method3266(var_ha, 125, class277_15_))
                                if (Class160.aBooleanArrayArray2133!![i_16_.toInt()]!![i_17_]) {
                                    Class348_Sub15.anIntArray6775!![2] = class277_15_.anInt3563
                                    Class348_Sub40_Sub38.anIntArray9480!![2] = i_18_
                                    Class223.anIntArray2899!![2] = class277_15_.anInt3575
                                    Class348_Sub6.anIntArray6631!![2] = class277_15_.anInt3570
                                    Class306.anIntArray3873!![2] = class277_15_.anInt3564
                                    Class180.anIntArray2370!![2] = 512
                                }
                            }
                        }
                    }
                }
                if (i_3_ + i_0_ > i_1_) {
                    if (i > 0) {
                        val i_19_ = is_5_!![-1 + i]!![1 + i_1_].toInt() and 0xff
                        if (i_19_ > 0) {
                            val class277_20_ = aClass268_3119!!.method2034(-1 + i_19_, false)
                            if (class277_20_.anInt3563 != -1 && class277_20_.aBoolean3560) {
                                val i_21_ = `is`!![-1 + i]!![1 + i_1_]
                                val i_22_ = 2 * is_2_!![-1 + i]!![1 + i_1_] + 2 and 0x7
                                val i_23_ = (Class348_Sub42_Sub17.method3266(var_ha, i_3_ xor 0x7c.inv(), class277_20_))
                                if (Class160.aBooleanArrayArray2133!![i_21_.toInt()]!![i_22_]) {
                                    Class348_Sub15.anIntArray6775!![6] = class277_20_.anInt3563
                                    Class348_Sub40_Sub38.anIntArray9480!![6] = i_23_
                                    Class223.anIntArray2899!![6] = class277_20_.anInt3575
                                    Class348_Sub6.anIntArray6631!![6] = class277_20_.anInt3570
                                    Class306.anIntArray3873!![6] = class277_20_.anInt3564
                                    Class180.anIntArray2370!![6] = 64
                                }
                            }
                        }
                    }
                    if (i < i_6_ - 1) {
                        val i_24_ = is_5_!![i - -1]!![i_1_ + 1].toInt() and 0xff
                        if (i_24_ > 0) {
                            val class277_25_ = aClass268_3119!!.method2034(-1 + i_24_, false)
                            if (class277_25_.anInt3563 != -1 && class277_25_.aBoolean3560) {
                                val i_26_ = `is`!![1 + i]!![i_1_ - -1]
                                val i_27_ = 0x7 and  /*--*/(is_2_!![i - -1]!![1 + i_1_] * 2)
                                val i_28_ = (Class348_Sub42_Sub17.method3266(var_ha, i_3_ + 127, class277_25_))
                                if (Class160.aBooleanArrayArray2133!![i_26_.toInt()]!![i_27_]) {
                                    Class348_Sub15.anIntArray6775!![4] = class277_25_.anInt3563
                                    Class348_Sub40_Sub38.anIntArray9480!![4] = i_28_
                                    Class223.anIntArray2899!![4] = class277_25_.anInt3575
                                    Class348_Sub6.anIntArray6631!![4] = class277_25_.anInt3570
                                    Class306.anIntArray3873!![4] = class277_25_.anInt3564
                                    Class180.anIntArray2370!![4] = 128
                                }
                            }
                        }
                    }
                }
                if (i_1_ > 0) {
                    val i_29_ = 0xff and is_5_!![i]!![i_1_ + -1].toInt()
                    if (i_29_ > 0) {
                        val class277_30_ = aClass268_3119!!.method2034(-1 + i_29_, false)
                        if (class277_30_.anInt3563 != -1) {
                            val i_31_ = `is`!![i]!![-1 + i_1_]
                            val i_32_ = is_2_!![i]!![i_1_ - 1].toInt()
                            if (class277_30_.aBoolean3560) {
                                var i_33_ = 2
                                var i_34_ = 4 + i_32_ * 2
                                val i_35_ = (Class348_Sub42_Sub17.method3266(var_ha, 125, class277_30_))
                                for (i_36_ in 0..2) {
                                    i_33_ = i_33_ and 0x7
                                    i_34_ = 0x7 and i_34_
                                    if ((Class160.aBooleanArrayArray2133!![i_31_.toInt()]!![i_34_]) && (Class306.anIntArray3873!![i_33_] <= (class277_30_.anInt3564))) {
                                        Class348_Sub15.anIntArray6775!![i_33_] = (class277_30_.anInt3563)
                                        Class348_Sub40_Sub38.anIntArray9480!![i_33_] = i_35_
                                        Class223.anIntArray2899!![i_33_] = (class277_30_.anInt3575)
                                        Class348_Sub6.anIntArray6631!![i_33_] = (class277_30_.anInt3570)
                                        if (Class306.anIntArray3873!![i_33_] != (class277_30_.anInt3564)) Class180.anIntArray2370!![i_33_] = 32
                                        else Class180.anIntArray2370!![i_33_] = (Class273.method2057((Class180.anIntArray2370!![i_33_]), 32))
                                        Class306.anIntArray3873!![i_33_] = (class277_30_.anInt3564)
                                    }
                                    i_34_++
                                    i_33_--
                                }
                                if (!bools_8_[0x3 and i_4_]) bools!![0] = (Class50_Sub1.aBooleanArrayArray5225!![i_31_.toInt()]!![method1166(i_32_ + 2, 3)])
                            } else if (!bools_8_[0x3 and i_4_]) bools!![0] = (Class265.aBooleanArrayArray4693!![i_31_.toInt()]!![method1166(3, i_32_ + 2)])
                        }
                    }
                }
                if (i_1_ < -1 + i_0_) {
                    val i_37_ = is_5_!![i]!![i_1_ - -1].toInt() and 0xff
                    if (i_37_ > 0) {
                        val class277_38_ = aClass268_3119!!.method2034(-1 + i_37_, false)
                        if (class277_38_.anInt3563 != -1) {
                            val i_39_ = `is`!![i]!![i_1_ + 1]
                            var i_40_ = is_2_!![i]!![i_1_ - -1].toInt()
                            if (class277_38_.aBoolean3560) {
                                var i_41_ = 4
                                var i_42_ = 2 * i_40_ + 2
                                val i_43_ = (Class348_Sub42_Sub17.method3266(var_ha, 124, class277_38_))
                                for (i_44_ in 0..2) {
                                    i_41_ = i_41_ and 0x7
                                    i_42_ = 0x7 and i_42_
                                    if ((Class160.aBooleanArrayArray2133!![i_39_.toInt()]!![i_42_]) && ((class277_38_.anInt3564) >= Class306.anIntArray3873!![i_41_])) {
                                        Class348_Sub15.anIntArray6775!![i_41_] = (class277_38_.anInt3563)
                                        Class348_Sub40_Sub38.anIntArray9480!![i_41_] = i_43_
                                        Class223.anIntArray2899!![i_41_] = (class277_38_.anInt3575)
                                        Class348_Sub6.anIntArray6631!![i_41_] = (class277_38_.anInt3570)
                                        if (Class306.anIntArray3873!![i_41_] != (class277_38_.anInt3564)) Class180.anIntArray2370!![i_41_] = 16
                                        else Class180.anIntArray2370!![i_41_] = (Class273.method2057((Class180.anIntArray2370!![i_41_]), 16))
                                        Class306.anIntArray3873!![i_41_] = (class277_38_.anInt3564)
                                    }
                                    i_42_--
                                    i_41_++
                                }
                                if (!bools_8_[0x3 and i_4_ + 2]) bools!![2] = (Class50_Sub1.aBooleanArrayArray5225!![i_39_.toInt()]!![method1166(3, --i_40_)])
                            } else if (!bools_8_[0x3 and 2 + i_4_]) bools!![2] = (Class265.aBooleanArrayArray4693!![i_39_.toInt()]!![method1166(3, i_40_)])
                        }
                    }
                }
                if (i > 0) {
                    val i_45_ = 0xff and is_5_!![i + -1]!![i_1_].toInt()
                    if (i_45_ > 0) {
                        val class277_46_ = aClass268_3119!!.method2034(-1 + i_45_, false)
                        if (class277_46_.anInt3563 != -1) {
                            val i_47_ = `is`!![-1 + i]!![i_1_]
                            val i_48_ = is_2_!![-1 + i]!![i_1_].toInt()
                            if (class277_46_.aBoolean3560) {
                                var i_49_ = 6
                                var i_50_ = 2 * i_48_ + 4
                                val i_51_ = (Class348_Sub42_Sub17.method3266(var_ha, 127, class277_46_))
                                for (i_52_ in 0..2) {
                                    i_50_ = i_50_ and 0x7
                                    i_49_ = 0x7 and i_49_
                                    if ((Class160.aBooleanArrayArray2133!![i_47_.toInt()]!![i_50_]) && (Class306.anIntArray3873!![i_49_] <= (class277_46_.anInt3564))) {
                                        Class348_Sub15.anIntArray6775!![i_49_] = (class277_46_.anInt3563)
                                        Class348_Sub40_Sub38.anIntArray9480!![i_49_] = i_51_
                                        Class223.anIntArray2899!![i_49_] = (class277_46_.anInt3575)
                                        Class348_Sub6.anIntArray6631!![i_49_] = (class277_46_.anInt3570)
                                        if (Class306.anIntArray3873!![i_49_] != (class277_46_.anInt3564)) Class180.anIntArray2370!![i_49_] = 8
                                        else Class180.anIntArray2370!![i_49_] = (Class273.method2057((Class180.anIntArray2370!![i_49_]), 8))
                                        Class306.anIntArray3873!![i_49_] = (class277_46_.anInt3564)
                                    }
                                    i_49_++
                                    i_50_--
                                }
                                if (!bools_8_[3 - -i_4_ and 0x3]) bools!![3] = (Class50_Sub1.aBooleanArrayArray5225!![i_47_.toInt()]!![method1166(3, 1 + i_48_)])
                            } else if (!bools_8_[0x3 and 3 - -i_4_]) bools!![3] = (Class265.aBooleanArrayArray4693!![i_47_.toInt()]!![method1166(3, 1 + i_48_)])
                        }
                    }
                }
                if (i_6_ - 1 > i) {
                    val i_53_ = is_5_!![1 + i]!![i_1_].toInt() and 0xff
                    if (i_53_ > 0) {
                        val class277_54_ = aClass268_3119!!.method2034(-1 + i_53_, false)
                        if (class277_54_.anInt3563 != -1) {
                            val i_55_ = `is`!![i + 1]!![i_1_]
                            val i_56_ = is_2_!![1 + i]!![i_1_].toInt()
                            if (class277_54_.aBoolean3560) {
                                var i_57_ = 4
                                var i_58_ = 6 + i_56_ * 2
                                val i_59_ = (Class348_Sub42_Sub17.method3266(var_ha, 127, class277_54_))
                                for (i_60_ in 0..2) {
                                    i_57_ = 0x7 and i_57_
                                    i_58_ = 0x7 and i_58_
                                    if ((Class160.aBooleanArrayArray2133!![i_55_.toInt()]!![i_58_]) && (Class306.anIntArray3873!![i_57_] <= (class277_54_.anInt3564))) {
                                        Class348_Sub15.anIntArray6775!![i_57_] = (class277_54_.anInt3563)
                                        Class348_Sub40_Sub38.anIntArray9480!![i_57_] = i_59_
                                        Class223.anIntArray2899!![i_57_] = (class277_54_.anInt3575)
                                        Class348_Sub6.anIntArray6631!![i_57_] = (class277_54_.anInt3570)
                                        if (class277_54_.anInt3564 == Class306.anIntArray3873!![i_57_]) Class180.anIntArray2370!![i_57_] = (Class273.method2057((Class180.anIntArray2370!![i_57_]), 4))
                                        else Class180.anIntArray2370!![i_57_] = 4
                                        Class306.anIntArray3873!![i_57_] = (class277_54_.anInt3564)
                                    }
                                    i_58_++
                                    i_57_--
                                }
                                if (!bools_8_[1 + i_4_ and 0x3]) bools!![1] = (Class50_Sub1.aBooleanArrayArray5225!![i_55_.toInt()]!![method1166(3, i_56_ + 3)])
                            } else if (!bools_8_[1 - -i_4_ and 0x3]) bools!![1] = (Class265.aBooleanArrayArray4693!![i_55_.toInt()]!![method1166(3, 3 - -i_56_)])
                        }
                    }
                }
                if (class277 == null) break
                val i_61_ = Class348_Sub42_Sub17.method3266(var_ha, i_3_ xor 0x7e.inv(), class277)
                if (!class277.aBoolean3560) break
                for (i_62_ in 0..7) {
                    val i_63_ = -(i_4_ * 2) + i_62_ and 0x7
                    if (Class160.aBooleanArrayArray2133!![i_7_]!![i_62_] && (Class306.anIntArray3873!![i_63_] <= class277.anInt3564)) {
                        Class348_Sub15.anIntArray6775!![i_63_] = class277.anInt3563
                        Class348_Sub40_Sub38.anIntArray9480!![i_63_] = i_61_
                        Class223.anIntArray2899!![i_63_] = class277.anInt3575
                        Class348_Sub6.anIntArray6631!![i_63_] = class277.anInt3570
                        if (Class306.anIntArray3873!![i_63_] != class277.anInt3564) Class180.anIntArray2370!![i_63_] = 2
                        else Class180.anIntArray2370!![i_63_] = Class273.method2057((Class180.anIntArray2370!![i_63_]), 2)
                        Class306.anIntArray3873!![i_63_] = class277.anInt3564
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(
                    runtimeexception,
                    ("sr.M(" + i + ',' + i_0_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_1_ + ',' + (if (is_2_ != null) "{...}" else "null") + ',' + i_3_ + ',' + (if (class277 != null) "{...}" else "null") + ',' + (if (class22 != null) "{...}" else "null") + ',' + (if (bools != null) "{...}" else "null") + ',' + i_4_ + ',' + (if (is_5_ != null) "{...}" else "null") + ',' + i_6_ + ',' + i_7_ + ',' + (if (var_ha != null) "{...}" else "null") + ')')
                )
            }
            break
        } while (false)
    }

    private fun method1676(var_s: s?, var_s_64_: s?, i: Int, var_s_65_: s?, `is`: Array<IntArray?>?, var_ha: ha?, i_66_: Int) {
        try {
            anInt3102++
            val is_67_ = aByteArrayArrayArray3126[i_66_]!!
            if (i != -26833) this.anInt3114 = -107
            val is_68_ = aByteArrayArrayArray3129[i_66_]!!
            val is_69_ = aByteArrayArrayArray3113[i_66_]!!
            val is_70_ = aByteArrayArrayArray3123[i_66_]!!
            var i_71_ = 0
            while ((i_71_ < this.anInt3117)) {
                val i_72_ = (if (i_71_ >= this.anInt3117 - 1) i_71_ else i_71_ + 1)
                for (i_73_ in 0..<this.anInt3114) {
                    val i_74_ = (if (i_73_ < this.anInt3114 + -1) 1 + i_73_ else i_73_)
                    if (OutputStream_Sub2.anInt101 == -1 || method536(i_73_, false, i_71_, OutputStream_Sub2.anInt101, i_66_)) {
                        var bool = false
                        var bool_75_ = false
                        val bools = BooleanArray(4)
                        var i_76_ = is_67_[i_71_]!![i_73_]
                        var i_77_ = is_68_[i_71_]!![i_73_].toInt()
                        val i_78_ = 0xff and is_70_[i_71_]!![i_73_].toInt()
                        val i_79_ = is_69_[i_71_]!![i_73_].toInt() and 0xff
                        var i_80_ = 0xff and is_69_[i_71_]!![i_74_].toInt()
                        var i_81_ = is_69_[i_72_]!![i_74_].toInt() and 0xff
                        var i_82_ = is_69_[i_72_]!![i_73_].toInt() and 0xff
                        if (i_78_ != 0 || i_79_ != 0) {
                            var class277 = (if (i_78_ == 0) null else aClass268_3119!!.method2034(i_78_ - 1, false))
                            val class22 = (if (i_79_ == 0) null else aClass183_3120!!.method1380(true, -1 + i_79_))
                            if (i_76_.toInt() == 0 && class277 == null) i_76_ = 12.toByte()
                            var class277_83_ = class277
                            if (class277 != null) {
                                if (class277.anInt3563 != -1 || class277.anInt3569 != -1) {
                                    if (class22 != null && i_76_.toInt() != 0) bool_75_ = (class277.aBoolean3560)
                                } else {
                                    class277_83_ = class277
                                    class277 = null
                                }
                            }
                            if ((i_76_.toInt() == 0 || i_76_.toInt() == 12) && i_71_ > 0 && i_73_ > 0 && (this.anInt3117 > i_71_) && (this.anInt3114 > i_73_)) {
                                var i_84_ = 0
                                var i_85_ = 0
                                var i_86_ = 0
                                i_86_ = i_86_ + (if (is_69_[i_72_]!![i_74_].toInt() != i_79_) -1 else 1)
                                i_85_ = (i_85_ + (if (is_69_[i_72_]!![i_73_ + -1].toInt() != i_79_) -1 else 1))
                                var i_87_ = 0
                                i_84_ = i_84_ + (if (i_79_ == (is_69_[-1 + i_71_]!![-1 + i_73_]).toInt()) 1 else -1)
                                if (is_69_[i_71_]!![i_73_ - 1].toInt() == i_79_) {
                                    i_84_++
                                    i_85_++
                                } else {
                                    i_85_--
                                    i_84_--
                                }
                                i_87_ = (i_87_ + (if (is_69_[-1 + i_71_]!![i_74_].toInt() != i_79_) -1 else 1))
                                if (i_79_ == is_69_[i_72_]!![i_73_].toInt()) {
                                    i_85_++
                                    i_86_++
                                } else {
                                    i_85_--
                                    i_86_--
                                }
                                if (i_79_ == is_69_[i_71_]!![i_74_].toInt()) {
                                    i_86_++
                                    i_87_++
                                } else {
                                    i_87_--
                                    i_86_--
                                }
                                if (i_79_ == is_69_[-1 + i_71_]!![i_73_].toInt()) {
                                    i_87_++
                                    i_84_++
                                } else {
                                    i_87_--
                                    i_84_--
                                }
                                var i_88_ = i_84_ + -i_86_
                                if (i_88_ < 0) i_88_ = -i_88_
                                var i_89_ = -i_87_ + i_85_
                                if (i_89_ < 0) i_89_ = -i_89_
                                if (i_89_ == i_88_) {
                                    i_88_ = (var_s_64_!!.method3982((-86).toByte(), i_73_, i_71_) + -var_s_64_.method3982((-86).toByte(), i_74_, i_72_))
                                    if (i_88_ < 0) i_88_ = -i_88_
                                    i_89_ = (var_s_64_.method3982((-86).toByte(), i_73_, i_72_) - var_s_64_.method3982((-86).toByte(), i_74_, i_71_))
                                    if (i_89_ < 0) i_89_ = -i_89_
                                }
                                i_77_ = (if (i_89_ <= i_88_) 0 else 1)
                            }
                            for (i_90_ in 0..12) {
                                Class306.anIntArray3873!![i_90_] = -1
                                Class180.anIntArray2370!![i_90_] = 1
                            }
                            val bools_91_: BooleanArray = (if (class277 == null || !class277.aBoolean3560) Class265.aBooleanArrayArray4693!![i_76_.toInt()] else (Class50_Sub1.aBooleanArrayArray5225!![i_76_.toInt()]))!!
                            method1675(i_71_, this.anInt3114, is_67_, i_73_, is_68_, -1, class277, class22, bools, i_77_, is_70_, this.anInt3117, i_76_.toInt(), var_ha)
                            var bool_92_ = (class277 != null && (class277.anInt3563 != class277.anInt3569))
                            if (!bool_92_) {
                                for (i_93_ in 0..7) {
                                    if (Class306.anIntArray3873!![i_93_] >= 0 && ((Class348_Sub15.anIntArray6775!![i_93_]) != (Class348_Sub40_Sub38.anIntArray9480!![i_93_]))) {
                                        bool_92_ = true
                                        break
                                    }
                                }
                            }
                            if (!bools_91_[i_77_ + 1 and 0x3]) bools[1] = (method3576(bools[1], method1166((Class180.anIntArray2370!![2]), (Class180.anIntArray2370!![4])) == 0))
                            if (!bools_91_[0x3 and i_77_ + 3]) bools[3] = (method3576(bools[3], method1166((Class180.anIntArray2370!![0]), (Class180.anIntArray2370!![6])) == 0))
                            if (!bools_91_[i_77_ and 0x3]) bools[0] = (method3576(bools[0], method1166((Class180.anIntArray2370!![0]), (Class180.anIntArray2370!![2])) == 0))
                            if (!bools_91_[i_77_ + 2 and 0x3]) bools[2] = (method3576(bools[2], method1166((Class180.anIntArray2370!![4]), (Class180.anIntArray2370!![6])) == 0))
                            if (!bool_75_ && (i_76_.toInt() == 0 || i_76_.toInt() == 12)) {
                                if (!bools[0] || bools[1] || bools[2] || !bools[3]) {
                                    if (!bools[0] || !bools[1] || bools[2] || bools[3]) {
                                        if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
                                            i_77_ = 2
                                            i_76_ = (if (i_76_.toInt() != 0) 14.toByte() else 13.toByte())
                                            bools[2] = false
                                            bools[1] = bools[2]
                                        } else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
                                            i_76_ = (if (i_76_.toInt() != 0) 14.toByte() else 13.toByte())
                                            bools[3] = false
                                            bools[2] = bools[3]
                                            i_77_ = 1
                                        }
                                    } else {
                                        i_76_ = (if (i_76_.toInt() == 0) 13.toByte() else 14.toByte())
                                        bools[1] = false
                                        bools[0] = bools[1]
                                        i_77_ = 3
                                    }
                                } else {
                                    bools[3] = false
                                    bools[0] = bools[3]
                                    i_77_ = 0
                                    i_76_ = (if (i_76_.toInt() == 0) 13.toByte() else 14.toByte())
                                }
                            }
                            val bool_94_ = (!bool_75_ && !bools[0] && !bools[2] && !bools[1] && !bools[3])
                            var is_95_: IntArray? = null
                            val is_96_: IntArray
                            val is_97_: IntArray
                            val i_98_: Int
                            val is_99_: IntArray
                            val i_100_: Int
                            if (bool_94_) {
                                is_96_ = Class10.anIntArrayArray174!![i_76_.toInt()]!!
                                is_97_ = Class68.anIntArrayArray1190!![i_76_.toInt()]!!
                                i_98_ = (if (class22 != null) Class43.anIntArray619!![i_76_.toInt()] else 0)
                                is_99_ = (Class348_Sub12.anIntArrayArray6740!![i_76_.toInt()]!!)
                                i_100_ = (if (class277 == null) 0 else (Class348_Sub40_Sub18.anIntArray9249!![i_76_.toInt()]))
                            } else if (bool_75_) {
                                i_100_ = (if (class277 == null) 0 else Class48.anIntArray860!![i_76_.toInt()])
                                is_96_ = Class98.anIntArrayArray1566!![i_76_.toInt()]
                                is_95_ = Class106.anIntArrayArray1638!![i_76_.toInt()]
                                is_97_ = Class163.anIntArrayArray2165!![i_76_.toInt()]!!
                                is_99_ = (Class348_Sub15.anIntArrayArray6780!![i_76_.toInt()]!!)
                                i_98_ = (if (class22 != null) Class283.anIntArray3659!![i_76_.toInt()] else 0)
                            } else {
                                i_98_ = (if (class22 == null) 0 else Class246.anIntArray3173!![i_76_.toInt()])
                                i_100_ = (if (class277 == null) 0 else Class334.anIntArray4152!![i_76_.toInt()])
                                is_97_ = Class284.anIntArrayArray3677!![i_76_.toInt()]!!
                                is_99_ = (Class239_Sub20.anIntArrayArray6054!![i_76_.toInt()]!!)
                                is_96_ = (Exception_Sub1.anIntArrayArray111!![i_76_.toInt()]!!)
                                is_95_ = (Class348_Sub16_Sub3.anIntArrayArray8910!![i_76_.toInt()])
                            }
                            var i_101_ = i_100_ + i_98_
                            if (i_101_ <= 0) method1394(i_66_, i_71_, i_73_)
                            else {
                                if (bools[0]) i_101_++
                                if (bools[2]) i_101_++
                                if (bools[1]) i_101_++
                                if (bools[3]) i_101_++
                                var i_102_ = 0
                                var i_103_ = 0
                                val i_104_ = i_101_ * 3
                                val is_105_ = if (bool_92_) IntArray(i_104_) else null
                                val is_106_ = IntArray(i_104_)
                                val is_107_ = IntArray(i_104_)
                                val is_108_ = IntArray(i_104_)
                                val is_109_ = IntArray(i_104_)
                                val is_110_ = IntArray(i_104_)
                                val is_111_ = if (var_s == null) null else IntArray(i_104_)
                                val is_112_ = (if (var_s == null && var_s_65_ == null) null else IntArray(i_104_))
                                var i_113_ = -1
                                var i_114_ = -1
                                var i_115_ = 256
                                if (class277 != null) {
                                    i_114_ = class277.anInt3575
                                    i_115_ = class277.anInt3570
                                    i_113_ = class277.anInt3563
                                    val i_116_ = (Class348_Sub42_Sub17.method3266(var_ha, i xor 0x68ad.inv(), class277))
                                    for (i_117_ in 0..<i_100_) {
                                        val bool_118_ = false
                                        val i_119_: Int
                                        if (!bools[-i_77_ and 0x3] || is_95_!![0] != i_102_) {
                                            if (!bools[-i_77_ + 2 and 0x3] || is_95_!![2] != i_102_) {
                                                if (!bools[-i_77_ + 1 and 0x3] || (is_95_!![1] != i_102_)) {
                                                    if (!(bools[0x3 and -i_77_ + 3]) || (i_102_ != is_95_!![3])) {
                                                        Class348.anIntArray4288!![0] = is_96_[i_102_]
                                                        Class348.anIntArray4288!![1] = is_97_[i_102_]
                                                        Class348.anIntArray4288!![2] = is_99_[i_102_]
                                                        i_119_ = 3
                                                    } else {
                                                        Class348.anIntArray4288!![0] = is_96_[i_102_]
                                                        Class348.anIntArray4288!![1] = 7
                                                        Class348.anIntArray4288!![2] = is_99_[i_102_]
                                                        Class348.anIntArray4288!![3] = 7
                                                        Class348.anIntArray4288!![4] = is_97_[i_102_]
                                                        i_119_ = 6
                                                        Class348.anIntArray4288!![5] = is_99_[i_102_]
                                                    }
                                                } else {
                                                    Class348.anIntArray4288!![0] = is_96_[i_102_]
                                                    Class348.anIntArray4288!![1] = 3
                                                    Class348.anIntArray4288!![2] = is_99_[i_102_]
                                                    Class348.anIntArray4288!![3] = 3
                                                    Class348.anIntArray4288!![4] = is_97_[i_102_]
                                                    i_119_ = 6
                                                    Class348.anIntArray4288!![5] = is_99_[i_102_]
                                                }
                                            } else {
                                                Class348.anIntArray4288!![0] = is_96_[i_102_]
                                                Class348.anIntArray4288!![1] = 5
                                                Class348.anIntArray4288!![2] = is_99_[i_102_]
                                                Class348.anIntArray4288!![3] = 5
                                                Class348.anIntArray4288!![4] = is_97_[i_102_]
                                                i_119_ = 6
                                                Class348.anIntArray4288!![5] = is_99_[i_102_]
                                            }
                                        } else {
                                            Class348.anIntArray4288!![0] = is_96_[i_102_]
                                            Class348.anIntArray4288!![1] = 1
                                            Class348.anIntArray4288!![2] = is_99_[i_102_]
                                            Class348.anIntArray4288!![3] = 1
                                            Class348.anIntArray4288!![4] = is_97_[i_102_]
                                            Class348.anIntArray4288!![5] = is_99_[i_102_]
                                            i_119_ = 6
                                        }
                                        var i_120_ = 0
                                        while ((i_119_ > i_120_)) {
                                            val i_121_ = (Class348.anIntArray4288!![i_120_])
                                            val i_122_ = -(2 * i_77_) + i_121_ and 0x7
                                            val i_123_ = anIntArray3124[i_121_]
                                            val i_124_ = anIntArray3128[i_121_]
                                            val i_125_: Int
                                            val i_126_: Int
                                            if (i_77_ == 1) {
                                                i_125_ = 512 + -i_123_
                                                i_126_ = i_124_
                                            } else if (i_77_ == 2) {
                                                i_126_ = 512 - i_123_
                                                i_125_ = -i_124_ + 512
                                            } else if (i_77_ == 3) {
                                                i_125_ = i_123_
                                                i_126_ = 512 + -i_124_
                                            } else {
                                                i_125_ = i_124_
                                                i_126_ = i_123_
                                            }
                                            is_106_[i_103_] = i_126_
                                            is_107_[i_103_] = i_125_
                                            if (is_111_ != null && (Class160.aBooleanArrayArray2133!![i_76_.toInt()]!![i_121_])) {
                                                val i_127_ = (i_126_ + (i_71_ shl 9))
                                                val i_128_ = i_125_ + (i_73_ shl 9)
                                                is_111_[i_103_] = ((var_s!!.method3986(i_127_, i_128_, 124.toByte())) + -(var_s_64_!!.method3986(i_127_, i_128_, (-118).toByte())))
                                            }
                                            if (is_112_ != null) {
                                                if (var_s == null || (Class160.aBooleanArrayArray2133!![i_76_.toInt()]!![i_121_])) {
                                                    if (var_s_65_ != null && !(Class348_Sub42_Sub1.aBooleanArrayArray9495!![i_76_.toInt()]!![i_121_])) {
                                                        val i_129_ = ((i_71_ shl 9) - -i_126_)
                                                        val i_130_ = ((i_73_ shl 9) + i_125_)
                                                        is_112_[i_103_] = ((var_s_65_.method3986(i_129_, i_130_, (-105).toByte())) + -(var_s_64_!!.method3986(i_129_, i_130_, (-109).toByte())))
                                                    }
                                                } else {
                                                    val i_131_ = ((i_71_ shl 9) + i_126_)
                                                    val i_132_ = (i_125_ + (i_73_ shl 9))
                                                    is_112_[i_103_] = ((var_s_64_!!.method3986(i_131_, i_132_, (-4).toByte())) - (var_s.method3986(i_131_, i_132_, 73.toByte())))
                                                }
                                            }
                                            if (i_121_ < 8 && ((Class306.anIntArray3873!![i_122_]) > (class277.anInt3564))) {
                                                if (is_105_ != null) is_105_[i_103_] = (Class348_Sub40_Sub38.anIntArray9480!![i_122_])
                                                is_110_[i_103_] = (Class348_Sub6.anIntArray6631!![i_122_])
                                                is_109_[i_103_] = (Class223.anIntArray2899!![i_122_])
                                                is_108_[i_103_] = (Class348_Sub15.anIntArray6775!![i_122_])
                                            } else {
                                                if (is_105_ != null) is_105_[i_103_] = i_116_
                                                is_109_[i_103_] = (class277.anInt3575)
                                                is_110_[i_103_] = (class277.anInt3570)
                                                is_108_[i_103_] = i_113_
                                            }
                                            i_103_++
                                            i_120_++
                                        }
                                        i_102_++
                                    }
                                    if (!this.aBoolean3109 && i_66_ == 0) Class333.method2643(i_71_, i_73_, class277.anInt3559, 8 * (class277.anInt3558), class277.anInt3574)
                                    if (i_76_.toInt() != 12 && (class277.anInt3563 != -1) && class277.aBoolean3566) bool = true
                                } else if (bool_94_) i_102_ += (Class348_Sub40_Sub18.anIntArray9249!![i_76_.toInt()])
                                else if (!bool_75_) i_102_ += Class334.anIntArray4152!![i_76_.toInt()]
                                else i_102_ += Class48.anIntArray860!![i_76_.toInt()]
                                if (class22 != null) {
                                    if (i_82_ == 0) i_82_ = i_79_
                                    if (i_81_ == 0) i_81_ = i_79_
                                    if (i_80_ == 0) i_80_ = i_79_
                                    val class22_133_ = aClass183_3120!!.method1380(true, -1 + i_79_)
                                    val class22_134_ = aClass183_3120.method1380(true, i_80_ - 1)
                                    val class22_135_ = aClass183_3120.method1380(true, i_81_ + -1)
                                    val class22_136_ = aClass183_3120.method1380(true, -1 + i_82_)
                                    var i_137_ = 0
                                    while ((i_98_ > i_137_)) {
                                        val bool_138_ = false
                                        val i_139_: Int
                                        if (!bools[-i_77_ and 0x3] || i_102_ != is_95_!![0]) {
                                            if (!bools[2 + -i_77_ and 0x3] || i_102_ != is_95_!![2]) {
                                                if (bools[0x3 and -i_77_ + 1] && (is_95_!![1] == i_102_)) {
                                                    Class348.anIntArray4288!![0] = is_96_[i_102_]
                                                    Class348.anIntArray4288!![1] = 3
                                                    Class348.anIntArray4288!![2] = is_99_[i_102_]
                                                    Class348.anIntArray4288!![3] = 3
                                                    Class348.anIntArray4288!![4] = is_97_[i_102_]
                                                    Class348.anIntArray4288!![5] = is_99_[i_102_]
                                                    i_139_ = 6
                                                } else if ((bools[-i_77_ + 3 and 0x3]) && (i_102_ == is_95_!![3])) {
                                                    Class348.anIntArray4288!![0] = is_96_[i_102_]
                                                    Class348.anIntArray4288!![1] = 7
                                                    Class348.anIntArray4288!![2] = is_99_[i_102_]
                                                    Class348.anIntArray4288!![3] = 7
                                                    Class348.anIntArray4288!![4] = is_97_[i_102_]
                                                    Class348.anIntArray4288!![5] = is_99_[i_102_]
                                                    i_139_ = 6
                                                } else {
                                                    Class348.anIntArray4288!![0] = is_96_[i_102_]
                                                    Class348.anIntArray4288!![1] = is_97_[i_102_]
                                                    i_139_ = 3
                                                    Class348.anIntArray4288!![2] = is_99_[i_102_]
                                                }
                                            } else {
                                                Class348.anIntArray4288!![0] = is_96_[i_102_]
                                                Class348.anIntArray4288!![1] = 5
                                                Class348.anIntArray4288!![2] = is_99_[i_102_]
                                                Class348.anIntArray4288!![3] = 5
                                                Class348.anIntArray4288!![4] = is_97_[i_102_]
                                                i_139_ = 6
                                                Class348.anIntArray4288!![5] = is_99_[i_102_]
                                            }
                                        } else {
                                            Class348.anIntArray4288!![0] = is_96_[i_102_]
                                            Class348.anIntArray4288!![1] = 1
                                            Class348.anIntArray4288!![2] = is_99_[i_102_]
                                            Class348.anIntArray4288!![3] = 1
                                            Class348.anIntArray4288!![4] = is_97_[i_102_]
                                            i_139_ = 6
                                            Class348.anIntArray4288!![5] = is_99_[i_102_]
                                        }
                                        i_102_++
                                        var i_140_ = 0
                                        while ((i_140_ < i_139_)) {
                                            val i_141_ = (Class348.anIntArray4288!![i_140_])
                                            val i_142_ = -(2 * i_77_) + i_141_ and 0x7
                                            val i_143_ = anIntArray3124[i_141_]
                                            val i_144_ = anIntArray3128[i_141_]
                                            val i_145_: Int
                                            val i_146_: Int
                                            if (i_77_ == 1) {
                                                i_146_ = i_144_
                                                i_145_ = -i_143_ + 512
                                            } else if (i_77_ == 2) {
                                                i_145_ = 512 + -i_144_
                                                i_146_ = 512 + -i_143_
                                            } else if (i_77_ == 3) {
                                                i_145_ = i_143_
                                                i_146_ = 512 + -i_144_
                                            } else {
                                                i_145_ = i_144_
                                                i_146_ = i_143_
                                            }
                                            is_106_[i_103_] = i_146_
                                            is_107_[i_103_] = i_145_
                                            if (is_111_ != null && (Class160.aBooleanArrayArray2133!![i_76_.toInt()]!![i_141_])) {
                                                val i_147_ = (i_146_ + (i_71_ shl 9))
                                                val i_148_ = ((i_73_ shl 9) - -i_145_)
                                                is_111_[i_103_] = ((var_s!!.method3986(i_147_, i_148_, (-95).toByte())) - (var_s_64_!!.method3986(i_147_, i_148_, 69.toByte())))
                                            }
                                            if (is_112_ != null) {
                                                if (var_s == null || (Class160.aBooleanArrayArray2133!![i_76_.toInt()]!![i_141_])) {
                                                    if (var_s_65_ != null && !(Class348_Sub42_Sub1.aBooleanArrayArray9495!![i_76_.toInt()]!![i_141_])) {
                                                        val i_149_ = ((i_71_ shl 9) - -i_146_)
                                                        val i_150_ = (i_145_ + (i_73_ shl 9))
                                                        is_112_[i_103_] = ((var_s_65_.method3986(i_149_, i_150_, 92.toByte())) + -(var_s_64_!!.method3986(i_149_, i_150_, 127.toByte())))
                                                    }
                                                } else {
                                                    val i_151_ = ((i_71_ shl 9) + i_146_)
                                                    val i_152_ = (i_145_ + (i_73_ shl 9))
                                                    is_112_[i_103_] = ((var_s_64_!!.method3986(i_151_, i_152_, (-102).toByte())) - (var_s.method3986(i_151_, i_152_, 106.toByte())))
                                                }
                                            }
                                            if (i_141_ < 8 && (Class306.anIntArray3873!![i_142_]) >= 0) {
                                                if (is_105_ != null) is_105_[i_103_] = (Class348_Sub40_Sub38.anIntArray9480!![i_142_])
                                                is_110_[i_103_] = (Class348_Sub6.anIntArray6631!![i_142_])
                                                is_109_[i_103_] = (Class223.anIntArray2899!![i_142_])
                                                is_108_[i_103_] = (Class348_Sub15.anIntArray6775!![i_142_])
                                            } else {
                                                if (!bool_75_ || !(Class160.aBooleanArrayArray2133!![i_76_.toInt()]!![i_141_])) {
                                                    if ((i_146_ == 0) && i_145_ == 0) {
                                                        is_108_[i_103_] = `is`!![i_71_]!![i_73_]
                                                        is_109_[i_103_] = (class22_133_!!.anInt331)
                                                        is_110_[i_103_] = (class22_133_.anInt336)
                                                    } else if (i_146_ != 0 || (i_145_ != 512)) {
                                                        if (i_146_ == 512 && i_145_ == 512) {
                                                            is_108_[i_103_] = (`is`!![i_72_]!![i_74_])
                                                            is_109_[i_103_] = (class22_135_!!.anInt331)
                                                            is_110_[i_103_] = (class22_135_.anInt336)
                                                        } else if ((i_146_ != 512) || (i_145_ != 0)) {
                                                            if (i_146_ >= 256) {
                                                                if (i_145_ >= 256) {
                                                                    is_109_[i_103_] = (class22_135_!!.anInt331)
                                                                    is_110_[i_103_] = (class22_135_.anInt336)
                                                                } else {
                                                                    is_109_[i_103_] = (class22_136_!!.anInt331)
                                                                    is_110_[i_103_] = (class22_136_.anInt336)
                                                                }
                                                            } else if (i_145_ < 256) {
                                                                is_109_[i_103_] = (class22_133_!!.anInt331)
                                                                is_110_[i_103_] = (class22_133_.anInt336)
                                                            } else {
                                                                is_109_[i_103_] = (class22_134_!!.anInt331)
                                                                is_110_[i_103_] = (class22_134_.anInt336)
                                                            }
                                                            val i_153_ = (Class334.method2652((`is`!![i_71_]!![i_73_]), (`is`[i_72_]!![i_73_]), 1, (i_146_ shl 7 shr 9)))
                                                            val i_154_ = (Class334.method2652((`is`[i_71_]!![i_74_]), (`is`[i_72_]!![i_74_]), 1, (i_146_ shl 7 shr 9)))
                                                            is_108_[i_103_] = (Class334.method2652(i_153_, i_154_, i + 26834, (i_145_ shl 7 shr 9)))
                                                        } else {
                                                            is_108_[i_103_] = (`is`!![i_72_]!![i_73_])
                                                            is_109_[i_103_] = (class22_136_!!.anInt331)
                                                            is_110_[i_103_] = (class22_136_.anInt336)
                                                        }
                                                    } else {
                                                        is_108_[i_103_] = `is`!![i_71_]!![i_74_]
                                                        is_109_[i_103_] = (class22_134_!!.anInt331)
                                                        is_110_[i_103_] = (class22_134_.anInt336)
                                                    }
                                                } else {
                                                    is_109_[i_103_] = i_114_
                                                    is_110_[i_103_] = i_115_
                                                    is_108_[i_103_] = i_113_
                                                }
                                                if (is_105_ != null) is_105_[i_103_] = is_108_[i_103_]
                                            }
                                            i_103_++
                                            i_140_++
                                        }
                                        i_137_++
                                    }
                                    if (i_76_.toInt() != 0 && class22.aBoolean342) bool = true
                                }
                                val i_155_ = var_s_64_!!.method3982((-86).toByte(), i_73_, i_71_)
                                val i_156_ = var_s_64_.method3982((-86).toByte(), i_73_, i_72_)
                                val i_157_ = var_s_64_.method3982((-86).toByte(), i_74_, i_72_)
                                val i_158_ = var_s_64_.method3982((-86).toByte(), i_74_, i_71_)
                                val bool_159_ = method802(i_73_, i_71_, true)
                                if (bool_159_ && i_66_ > 1 || (!bool_159_ && i_66_ > 0)) {
                                    var bool_160_ = true
                                    if (class22 != null && !class22.aBoolean334) bool_160_ = false
                                    else if (i_79_ == 0 && i_76_.toInt() != 0) bool_160_ = false
                                    else if (i_78_ > 0 && class277_83_ != null && !(class277_83_.aBoolean3561)) bool_160_ = false
                                    if (bool_160_ && (i_156_ == i_155_) && i_157_ == i_155_ && i_155_ == i_158_) this.aByteArrayArrayArray3108!![i_66_]!![i_71_]!![i_73_] = (Class273.method2057((this.aByteArrayArrayArray3108!![i_66_]!![i_71_]!![i_73_]).toInt(), 4)).toByte()
                                }
                                var i_161_ = 0
                                var i_162_ = 0
                                var i_163_ = 0
                                if (this.aBoolean3109) {
                                    i_161_ = method3547(i_71_, i_73_)
                                    i_162_ = method2483(i_71_, i_73_)
                                    i_163_ = method1457(i_71_, i_73_)
                                }
                                var_s_64_.U(i_71_, i_73_, is_106_, is_111_, is_107_, is_112_, is_108_, is_105_, is_109_, is_110_, i_161_, i_162_, i_163_, bool)
                                method1394(i_66_, i_71_, i_73_)
                            }
                        }
                    }
                }
                i_71_++
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("sr.B(" + (if (var_s != null) "{...}" else "null") + ',' + (if (var_s_64_ != null) "{...}" else "null") + ',' + i + ',' + (if (var_s_65_ != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_66_ + ')'))
        }
    }

    fun method1678(i: Int, i_166_: Int, i_167_: Int, i_168_: Int, i_169_: Int, i_170_: Int) {
        if (i_168_ >= -80) this.aByteArrayArrayArray3108 = null
        var i_171_ = i_167_
        while (i_166_ + i_167_ > i_171_) {
            var i_172_ = i
            while (i_169_ + i > i_172_) {
                if (i_172_ >= 0 && i_172_ < this.anInt3117 && i_171_ >= 0 && this.anInt3114 > i_171_) this.anIntArrayArrayArray3122[i_170_]!![i_172_]!![i_171_] = (if (i_170_ <= 0) 0 else -960 + (this.anIntArrayArrayArray3122[-1 + i_170_]!![i_172_]!![i_171_]))
                i_172_++
            }
            i_171_++
        }
        anInt3105++
        if (i > 0 && this.anInt3117 > i) {
            for (i_173_ in i_167_ - -1..<i_167_ - -i_166_) {
                if (i_173_ >= 0 && this.anInt3114 > i_173_) this.anIntArrayArrayArray3122[i_170_]!![i]!![i_173_] = (this.anIntArrayArrayArray3122[i_170_]!![i - 1]!![i_173_])
            }
        }
        if (i_167_ > 0 && i_167_ < this.anInt3114) {
            for (i_174_ in 1 + i..<i_169_ + i) {
                if (i_174_ >= 0 && i_174_ < this.anInt3117) this.anIntArrayArrayArray3122[i_170_]!![i_174_]!![i_167_] = (this.anIntArrayArrayArray3122[i_170_]!![i_174_]!![-1 + i_167_])
            }
        }
        if (i >= 0 && i_167_ >= 0 && this.anInt3117 > i && i_167_ < this.anInt3114) {
            if (i_170_ != 0) {
                if (i > 0 && ((this.anIntArrayArrayArray3122[i_170_ - 1]!![-1 + i]!![i_167_]) != (this.anIntArrayArrayArray3122[i_170_]!![i - 1]!![i_167_]))) this.anIntArrayArrayArray3122[i_170_]!![i]!![i_167_] = (this.anIntArrayArrayArray3122[i_170_]!![i - 1]!![i_167_])
                else if (i_167_ <= 0 || ((this.anIntArrayArrayArray3122[i_170_]!![i]!![-1 + i_167_]) == (this.anIntArrayArrayArray3122[-1 + i_170_]!![i]!![-1 + i_167_]))) {
                    if (i > 0 && i_167_ > 0 && ((this.anIntArrayArrayArray3122[i_170_ + -1]!![i + -1]!![-1 + i_167_]) != (this.anIntArrayArrayArray3122[i_170_]!![i + -1]!![-1 + i_167_]))) this.anIntArrayArrayArray3122[i_170_]!![i]!![i_167_] = (this.anIntArrayArrayArray3122[i_170_]!![i + -1]!![-1 + i_167_])
                } else this.anIntArrayArrayArray3122[i_170_]!![i]!![i_167_] = (this.anIntArrayArrayArray3122[i_170_]!![i]!![i_167_ + -1])
            } else if (i <= 0 || (this.anIntArrayArrayArray3122[i_170_]!![-1 + i]!![i_167_]) == 0) {
                if (i_167_ <= 0 || (this.anIntArrayArrayArray3122[i_170_]!![i]!![-1 + i_167_]) == 0) {
                    if (i > 0 && i_167_ > 0 && (this.anIntArrayArrayArray3122[i_170_]!![-1 + i]!![i_167_ - 1]) != 0) this.anIntArrayArrayArray3122[i_170_]!![i]!![i_167_] = (this.anIntArrayArrayArray3122[i_170_]!![i - 1]!![-1 + i_167_])
                } else this.anIntArrayArrayArray3122[i_170_]!![i]!![i_167_] = (this.anIntArrayArrayArray3122[i_170_]!![i]!![-1 + i_167_])
            } else this.anIntArrayArrayArray3122[i_170_]!![i]!![i_167_] = (this.anIntArrayArrayArray3122[i_170_]!![-1 + i]!![i_167_])
        }
    }

    fun method1679(i: Int, i_175_: Int, `is`: Array<IntArray?>) {
        anInt3121++
        val is_176_ = this.anIntArrayArrayArray3122[i]!!
        var i_177_ = i_175_
        while ((i_177_ < this.anInt3117 - -1)) {
            var i_178_ = 0
            while ((i_178_ < this.anInt3114 + 1)) {
                is_176_[i_177_]!![i_178_] += `is`[i_177_]!![i_178_]
                i_178_++
            }
            i_177_++
        }
    }

    fun method1680(var_s: s?, i: Byte, var_s_179_: s?, var_ha: ha?) {
        try {
            anInt3131++
            val `is` = (Array<IntArray?>(this.anInt3117) { IntArray(this.anInt3114) })
            if (i <= -122) {
                if (Class348_Sub24.anIntArray6878 == null || (this.anInt3114 != Class348_Sub24.anIntArray6878!!.size)) {
                    Class318_Sub9_Sub1.anIntArray8785 = IntArray(this.anInt3114)
                    Class348_Sub40_Sub6.anIntArray9135 = IntArray(this.anInt3114)
                    Class265.anIntArray4692 = IntArray(this.anInt3114)
                    Class348_Sub24.anIntArray6878 = IntArray(this.anInt3114)
                    Class348_Sub8.anIntArray6655 = IntArray(this.anInt3114)
                }
                var i_180_ = 0
                while (this.anInt3130 > i_180_) {
                    var i_181_ = 0
                    while (this.anInt3114 > i_181_) {
                        Class348_Sub24.anIntArray6878!![i_181_] = 0
                        Class348_Sub40_Sub6.anIntArray9135!![i_181_] = 0
                        Class348_Sub8.anIntArray6655!![i_181_] = 0
                        Class265.anIntArray4692!![i_181_] = 0
                        Class318_Sub9_Sub1.anIntArray8785!![i_181_] = 0
                        i_181_++
                    }
                    for (i_182_ in -5..<this.anInt3117) {
                        var i_183_ = 0
                        while ((i_183_ < this.anInt3114)) {
                            val i_184_ = i_182_ - -5
                            if (this.anInt3117 > i_184_) {
                                val i_185_ = ((aByteArrayArrayArray3113[i_180_]!![i_184_]!![i_183_]).toInt() and 0xff)
                                if (i_185_ > 0) {
                                    val class22 = aClass183_3120!!.method1380(true, -1 + i_185_)
                                    Class348_Sub24.anIntArray6878!![i_183_] += class22!!.anInt341
                                    Class348_Sub40_Sub6.anIntArray9135!![i_183_] += class22.anInt332
                                    Class348_Sub8.anIntArray6655!![i_183_] += class22.anInt335
                                    Class265.anIntArray4692!![i_183_] += class22.anInt343
                                    Class318_Sub9_Sub1.anIntArray8785!![i_183_]++
                                }
                            }
                            val i_186_ = i_182_ - 5
                            if (i_186_ >= 0) {
                                val i_187_ = 0xff and (aByteArrayArrayArray3113[i_180_]!![i_186_]!![i_183_]).toInt()
                                if (i_187_ > 0) {
                                    val class22 = aClass183_3120!!.method1380(true, -1 + i_187_)
                                    Class348_Sub24.anIntArray6878!![i_183_] -= class22!!.anInt341
                                    Class348_Sub40_Sub6.anIntArray9135!![i_183_] -= class22.anInt332
                                    Class348_Sub8.anIntArray6655!![i_183_] -= class22.anInt335
                                    Class265.anIntArray4692!![i_183_] -= class22.anInt343
                                    Class318_Sub9_Sub1.anIntArray8785!![i_183_]--
                                }
                            }
                            i_183_++
                        }
                        if (i_182_ >= 0) {
                            var i_188_ = 0
                            var i_189_ = 0
                            var i_190_ = 0
                            var i_191_ = 0
                            var i_192_ = 0
                            var i_193_ = -5
                            while ((this.anInt3114 > i_193_)) {
                                val i_194_ = 5 + i_193_
                                if (i_194_ < this.anInt3114) {
                                    i_190_ += (Class348_Sub8.anIntArray6655!![i_194_])
                                    i_189_ += (Class348_Sub40_Sub6.anIntArray9135!![i_194_])
                                    i_188_ += (Class348_Sub24.anIntArray6878!![i_194_])
                                    i_192_ += (Class318_Sub9_Sub1.anIntArray8785!![i_194_])
                                    i_191_ += Class265.anIntArray4692!![i_194_]
                                }
                                val i_195_ = i_193_ + -5
                                if (i_195_ >= 0) {
                                    i_191_ -= Class265.anIntArray4692!![i_195_]
                                    i_188_ -= (Class348_Sub24.anIntArray6878!![i_195_])
                                    i_190_ -= (Class348_Sub8.anIntArray6655!![i_195_])
                                    i_192_ -= (Class318_Sub9_Sub1.anIntArray8785!![i_195_])
                                    i_189_ -= (Class348_Sub40_Sub6.anIntArray9135!![i_195_])
                                }
                                if (i_193_ >= 0 && i_191_ > 0 && i_192_ > 0) `is`[i_182_]!![i_193_] = Class247.method1890(i_190_ / i_192_, 66.toByte(), i_189_ / i_192_, (256 * i_188_ / i_191_))
                                i_193_++
                            }
                        }
                    }
                    if (!IOException_Sub1.aBoolean86) method1683(var_ha, if (i_180_ != 0) null else var_s, i_180_, 127.toByte(), `is`, aa_Sub1.aSArray5191!![i_180_], if (i_180_ != 0) null else var_s_179_)
                    else method1676(if (i_180_ != 0) null else var_s, aa_Sub1.aSArray5191!![i_180_], -26833, if (i_180_ == 0) var_s_179_ else null, `is`, var_ha, i_180_)
                    aByteArrayArrayArray3113[i_180_] = null
                    aByteArrayArrayArray3123[i_180_] = null
                    aByteArrayArrayArray3126[i_180_] = null
                    aByteArrayArrayArray3129[i_180_] = null
                    i_180_++
                }
                if (!this.aBoolean3109) {
                    if (Class291.anInt3720 != 0) method1968()
                    if (Class186.aBoolean2492) method1320()
                }
                var i_196_ = 0
                while ((this.anInt3130 > i_196_)) {
                    aa_Sub1.aSArray5191!![i_196_]!!.YA()
                    i_196_++
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("sr.L(" + (if (var_s != null) "{...}" else "null") + ',' + i + ',' + (if (var_s_179_ != null) "{...}" else "null") + ',' + (if (var_ha != null) "{...}" else "null") + ')'))
        }
    }

    fun method1681(class348_sub49: Class348_Sub49?, i: Int, class361s: Array<Class361?>?, i_197_: Int, i_198_: Int, i_199_: Int, i_200_: Byte) {
        try {
            anInt3107++
            if (!this.aBoolean3109) {
                for (i_201_ in 0..3) {
                    val class361 = class361s!![i_201_]
                    for (i_202_ in 0..63) {
                        for (i_203_ in 0..63) {
                            val i_204_ = i_202_ + i
                            val i_205_ = i_199_ + i_203_
                            if (i_204_ >= 0 && (i_204_ < this.anInt3117) && i_205_ >= 0 && (this.anInt3114 > i_205_)) class361!!.method3501(107.toByte(), i_205_, i_204_)
                        }
                    }
                }
            }
            val i_206_ = i + i_198_
            val i_207_ = 65 % ((i_200_ - 34) / 42)
            val i_208_ = i_197_ - -i_199_
            var i_209_ = 0
            while (this.anInt3130 > i_209_) {
                for (i_210_ in 0..63) {
                    for (i_211_ in 0..63) method1682(false, 0, i_211_ + i_199_, 0, class348_sub49!!, 0, 1115212770, i + i_210_, i_206_ + i_210_, i_208_ - -i_211_, i_209_)
                }
                i_209_++
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("sr.I(" + (if (class348_sub49 != null) "{...}" else "null") + ',' + i + ',' + (if (class361s != null) "{...}" else "null") + ',' + i_197_ + ',' + i_198_ + ',' + i_199_ + ',' + i_200_ + ')'))
        }
    }

    private fun method1682(bool: Boolean, i: Int, i_212_: Int, i_213_: Int, class348_sub49: Class348_Sub49, i_214_: Int, i_215_: Int, i_216_: Int, i_217_: Int, i_218_: Int, i_219_: Int) {
        var i = i
        var i_214_ = i_214_
        anInt3125++
        if (i_213_ != 1) {
            if (i_213_ == 2) {
                i = 1
                i_214_ = 1
            } else if (i_213_ == 3) i_214_ = 1
        } else i = 1
        if (i_216_ < 0 || i_216_ >= this.anInt3117 || i_212_ < 0 || this.anInt3114 <= i_212_) {
            while (true) {
                val i_220_ = class348_sub49.readUnsignedByte(255)
                if (i_220_ == 0) break
                if (i_220_ == 1) {
                    class348_sub49.readUnsignedByte(i_215_ xor 0x4278cb1d)
                    break
                }
                if (i_220_ <= 49) class348_sub49.readUnsignedByte(255)
            }
        } else {
            if (!this.aBoolean3109 && !bool) Class348_Sub33.aByteArrayArrayArray6962!![i_219_]!![i_216_]!![i_212_] = 0.toByte()
            while (true) {
                val i_221_ = class348_sub49.readUnsignedByte(i_215_ xor 0x4278cb1d)
                if (i_221_ == 0) {
                    if (this.aBoolean3109) this.anIntArrayArrayArray3122[0]!![i_214_ + i_216_]!![i + i_212_] = 0
                    else if (i_219_ != 0) this.anIntArrayArrayArray3122[i_219_]!![i_214_ + i_216_]!![i + i_212_] = -960 + (this.anIntArrayArrayArray3122[-1 + i_219_]!![i_214_ + i_216_]!![i + i_212_])
                    else this.anIntArrayArrayArray3122[0]!![i_214_ + i_216_]!![i_212_ - -i] = (8 * -(Class318_Sub1_Sub3_Sub4.method2462(-113, i_217_ + 932731, i_218_ + 556238)) shl 2)
                    break
                }
                if (i_221_ == 1) {
                    var i_222_ = class348_sub49.readUnsignedByte(255)
                    if (this.aBoolean3109) this.anIntArrayArrayArray3122[0]!![i_216_ - -i_214_]!![i_212_ + i] = i_222_ * 8 shl 2
                    else {
                        if (i_222_ == 1) i_222_ = 0
                        if (i_219_ != 0) this.anIntArrayArrayArray3122[i_219_]!![i_214_ + i_216_]!![i + i_212_] = (this.anIntArrayArrayArray3122[-1 + i_219_]!![i_214_ + i_216_]!![i_212_ - -i]) - (i_222_ * 8 shl 2)
                        else this.anIntArrayArrayArray3122[0]!![i_216_ - -i_214_]!![i_212_ - -i] = 8 * -i_222_ shl 2
                    }
                    break
                }
                if (i_221_ <= 49) {
                    if (bool) class348_sub49.readUnsignedByte(255)
                    else {
                        aByteArrayArrayArray3123[i_219_]!![i_216_]!![i_212_] = class348_sub49.readByte(i_215_ + -1115212859)
                        aByteArrayArrayArray3126[i_219_]!![i_216_]!![i_212_] = ((i_221_ + -2) / 4).toByte()
                        aByteArrayArrayArray3129[i_219_]!![i_216_]!![i_212_] = method1166(3, -2 + i_221_ + i_213_).toByte()
                    }
                } else if (i_221_ <= 81) {
                    if (!this.aBoolean3109 && !bool) Class348_Sub33.aByteArrayArrayArray6962!![i_219_]!![i_216_]!![i_212_] = (i_221_ - 49).toByte()
                } else if (!bool) aByteArrayArrayArray3113[i_219_]!![i_216_]!![i_212_] = (-81 + i_221_).toByte()
            }
        }
        if (i_215_ != 1115212770) this.aByteArrayArrayArray3104 = null
    }

    private fun method1683(var_ha: ha?, var_s: s?, i: Int, i_223_: Byte, `is`: Array<IntArray?>?, var_s_224_: s?, var_s_225_: s?) {
        do {
            try {
                anInt3111++
                for (i_226_ in 0..<this.anInt3117) {
                    var i_227_ = 0
                    while (this.anInt3114 > i_227_) {
                        if (OutputStream_Sub2.anInt101 == -1 || method536(i_227_, false, i_226_, OutputStream_Sub2.anInt101, i)) {
                            var i_228_ = aByteArrayArrayArray3126[i]!![i_226_]!![i_227_]
                            val i_229_ = aByteArrayArrayArray3129[i]!![i_226_]!![i_227_]
                            val i_230_ = (aByteArrayArrayArray3123[i]!![i_226_]!![i_227_].toInt() and 0xff)
                            val i_231_ = 0xff and (aByteArrayArrayArray3113[i]!![i_226_]!![i_227_]).toInt()
                            val class277 = (if (i_230_ != 0) aClass268_3119!!.method2034(-1 + i_230_, false) else null)
                            if (i_228_.toInt() == 0 && class277 == null) i_228_ = 12.toByte()
                            val class22 = (if (i_231_ == 0) null else aClass183_3120!!.method1380(true, i_231_ - 1))
                            var i_232_ = 0
                            var i_233_ = 0
                            if (i_228_.toInt() != 0) {
                                i_233_ = (if (class277 == null) 0 else (Class348_Sub40_Sub18.anIntArray9249!![i_228_.toInt()]))
                                i_232_ = (if (class22 != null) Class43.anIntArray619!![i_228_.toInt()] else 0)
                            } else if (class277 != null) i_233_ = (Class348_Sub40_Sub18.anIntArray9249!![i_228_.toInt()])
                            else if (class22 != null) i_232_ = (Class348_Sub40_Sub18.anIntArray9249!![i_228_.toInt()])
                            val i_234_ = i_233_ + i_232_
                            var i_235_ = 0
                            if (i_234_ != 0) {
                                val i_236_ = (if (class277 != null) class277.anInt3575 else -1)
                                val i_237_ = (if (class22 != null) class22.anInt331 else -1)
                                val is_238_ = IntArray(i_234_)
                                var is_239_: IntArray? = IntArray(i_234_)
                                val is_240_ = IntArray(i_234_)
                                val is_241_ = IntArray(i_234_)
                                var bool = false
                                var bool_242_ = false
                                if (class277 == null || (class277.anInt3563 == -1 && (class277.anInt3569 == -1) && i_236_ == -1)) {
                                    bool_242_ = true
                                    for (i_243_ in 0..<i_233_) {
                                        is_238_[i_235_] = -1
                                        i_235_++
                                    }
                                } else {
                                    var i_244_ = 0
                                    while ((i_233_ > i_244_)) {
                                        is_240_[i_235_] = i_236_
                                        is_241_[i_235_] = class277.anInt3570
                                        if (class277.anInt3563 != -1) is_238_[i_235_] = (class277.anInt3563)
                                        else is_238_[i_235_] = -1
                                        if (class277.anInt3569 == -1) is_239_!![i_235_] = -1
                                        else {
                                            bool = true
                                            is_239_!![i_235_] = (class277.anInt3569)
                                        }
                                        i_235_++
                                        i_244_++
                                    }
                                    if (!this.aBoolean3109 && i == 0) Class333.method2643(i_226_, i_227_, class277.anInt3559, (class277.anInt3558 * 8), class277.anInt3574)
                                }
                                if (!bool) is_239_ = null
                                if (class22 == null) {
                                    if (bool_242_) {
                                        i_227_++
                                        continue
                                    }
                                    for (i_245_ in 0..<i_232_) {
                                        is_238_[i_235_] = -1
                                        i_235_++
                                    }
                                } else {
                                    var i_246_ = 0
                                    while ((i_232_ > i_246_)) {
                                        is_240_[i_235_] = i_237_
                                        is_241_[i_235_] = class22.anInt336
                                        is_238_[i_235_] = `is`!![i_226_]!![i_227_]
                                        if (is_239_ != null) is_239_[i_235_] = -1
                                        i_235_++
                                        i_246_++
                                    }
                                }
                                val i_247_ = anIntArray3124.size
                                val is_248_ = IntArray(i_247_)
                                val is_249_ = IntArray(i_247_)
                                val is_250_ = if (var_s == null) null else IntArray(i_247_)
                                val is_251_ = (if (var_s != null || var_s_225_ != null) IntArray(i_247_) else null)
                                var i_252_ = 0
                                while (i_247_ > i_252_) {
                                    val i_253_ = anIntArray3124[i_252_]
                                    val i_254_ = anIntArray3128[i_252_]
                                    if (i_229_.toInt() == 0) {
                                        is_248_[i_252_] = i_253_
                                        is_249_[i_252_] = i_254_
                                    } else if (i_229_.toInt() == 1) {
                                        is_248_[i_252_] = i_254_
                                        val i_256_ = i_253_
                                        is_249_[i_252_] = 512 - i_256_
                                    } else if (i_229_.toInt() == 2) {
                                        is_248_[i_252_] = -i_253_ + 512
                                        is_249_[i_252_] = 512 - i_254_
                                    } else if (i_229_.toInt() == 3) {
                                        is_248_[i_252_] = 512 - i_254_
                                        val i_255_ = i_253_
                                        is_249_[i_252_] = i_255_
                                    }
                                    if (is_250_ != null && (Class160.aBooleanArrayArray2133!![i_228_.toInt()]!![i_252_])) {
                                        val i_257_ = (is_248_[i_252_] + (i_226_ shl 9))
                                        val i_258_ = ((i_227_ shl 9) - -is_249_[i_252_])
                                        is_250_[i_252_] = (var_s!!.method3986(i_257_, i_258_, (-101).toByte()) + -(var_s_224_!!.method3986(i_257_, i_258_, (-12).toByte())))
                                    }
                                    if (is_251_ != null) {
                                        if (var_s != null && !(Class160.aBooleanArrayArray2133!![i_228_.toInt()]!![i_252_])) {
                                            val i_259_ = (is_248_[i_252_] + (i_226_ shl 9))
                                            val i_260_ = ((i_227_ shl 9) + is_249_[i_252_])
                                            is_251_[i_252_] = ((var_s_224_!!.method3986(i_259_, i_260_, 87.toByte())) - (var_s.method3986(i_259_, i_260_, (-90).toByte())))
                                        } else if (var_s_225_ != null && !(Class348_Sub42_Sub1.aBooleanArrayArray9495!![i_228_.toInt()]!![i_252_])) {
                                            val i_261_ = (is_248_[i_252_] + (i_226_ shl 9))
                                            val i_262_ = (is_249_[i_252_] + (i_227_ shl 9))
                                            is_251_[i_252_] = ((var_s_225_.method3986(i_261_, i_262_, (-128).toByte())) + -(var_s_224_!!.method3986(i_261_, i_262_, (-1).toByte())))
                                        }
                                    }
                                    i_252_++
                                }
                                val i_263_ = var_s_224_!!.method3982((-86).toByte(), i_227_, i_226_)
                                val i_264_ = var_s_224_.method3982((-86).toByte(), i_227_, 1 + i_226_)
                                val i_265_ = var_s_224_.method3982((-86).toByte(), 1 + i_227_, i_226_ - -1)
                                val i_266_ = var_s_224_.method3982((-86).toByte(), i_227_ + 1, i_226_)
                                val bool_267_ = method802(i_227_, i_226_, true)
                                if (bool_267_ && i > 1 || !bool_267_ && i > 0) {
                                    var bool_268_ = true
                                    if (class22 != null && !class22.aBoolean334) bool_268_ = false
                                    else if (i_231_ == 0 && i_228_.toInt() != 0) bool_268_ = false
                                    else if (i_230_ > 0 && class277 != null && !(class277.aBoolean3561)) bool_268_ = false
                                    if (bool_268_ && (i_264_ == i_263_) && (i_263_ == i_265_) && (i_263_ == i_266_)) this.aByteArrayArrayArray3108!![i]!![i_226_]!![i_227_] = (Class273.method2057((this.aByteArrayArrayArray3108!![i]!![i_226_]!![i_227_]).toInt(), 4)).toByte()
                                }
                                var i_269_ = 0
                                var i_270_ = 0
                                var i_271_ = 0
                                if (this.aBoolean3109) {
                                    i_269_ = method3547(i_226_, i_227_)
                                    i_270_ = method2483(i_226_, i_227_)
                                    i_271_ = method1457(i_226_, i_227_)
                                }
                                var_s_224_.method3978(i_226_, i_227_, is_248_, is_250_!!, is_249_, is_251_!!, Class10.anIntArrayArray174!![i_228_.toInt()]!!, Class68.anIntArrayArray1190!![i_228_.toInt()]!!, (Class348_Sub12.anIntArrayArray6740!![i_228_.toInt()]!!), is_238_, is_239_!!, is_240_, is_241_, i_269_, i_270_, i_271_, false)
                                method1394(i, i_226_, i_227_)
                            }
                        }
                        i_227_++
                    }
                }
                if (i_223_ >= 115) break
                this.anInt3117 = 57
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("sr.H(" + (if (var_ha != null) "{...}" else "null") + ',' + (if (var_s != null) "{...}" else "null") + ',' + i + ',' + i_223_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (var_s_224_ != null) "{...}" else "null") + ',' + (if (var_s_225_ != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    fun method1684(i: Int, i_272_: Int, i_273_: Int, class348_sub49: Class348_Sub49?, i_274_: Int, i_275_: Int, i_276_: Int, class361s: Array<Class361?>?, i_277_: Int, i_278_: Int) {
        try {
            if (i_273_ == -1) {
                anInt3115++
                val i_279_ = 8 * (i_276_ and 0x7)
                val i_280_ = 8 * (0x7 and i_274_)
                if (!this.aBoolean3109) {
                    val class361 = class361s!![i_272_]!!
                    for (i_281_ in 0..7) {
                        for (i_282_ in 0..7) {
                            val i_283_ = i + Class295.method2220(0x7 and i_282_, i_277_, 0x7 and i_281_, 71.toByte())
                            val i_284_ = (method837(i_281_ and 0x7, true, 0x7 and i_282_, i_277_) + i_275_)
                            if (i_283_ > 0 && i_283_ < -1 + this.anInt3117 && i_284_ > 0 && this.anInt3114 + -1 > i_284_) class361.method3501(124.toByte(), i_284_, i_283_)
                        }
                    }
                }
                val i_285_ = (i_276_ and 0x7.inv()) shl 3
                val i_286_ = (0x7.inv() and i_274_) shl 3
                var i_287_ = 0
                var i_288_ = 0
                if (i_277_ != 1) {
                    if (i_277_ == 2) {
                        i_288_ = 1
                        i_287_ = 1
                    } else if (i_277_ == 3) i_287_ = 1
                } else i_288_ = 1
                var i_289_ = 0
                while (this.anInt3130 > i_289_) {
                    for (i_290_ in 0..63) {
                        for (i_291_ in 0..63) {
                            if (i_278_ != i_289_ || i_279_ > i_290_ || i_290_ > i_279_ - -8 || i_280_ > i_291_ || 8 + i_280_ < i_291_) method1682(false, 0, -1, 0, class348_sub49!!, 0, 1115212770, -1, 0, 0, 0)
                            else {
                                val i_292_: Int
                                val i_293_: Int
                                if (i_290_ == i_279_ + 8 || i_280_ - -8 == i_291_) {
                                    if (i_277_ == 0) {
                                        i_292_ = -i_280_ + (i_291_ + i_275_)
                                        i_293_ = -i_279_ - -i_290_ + i
                                    } else if (i_277_ == 1) {
                                        i_292_ = i_275_ + 8 + (i_279_ + -i_290_)
                                        i_293_ = i_291_ - (i_280_ - i)
                                    } else if (i_277_ == 2) {
                                        i_292_ = i_275_ + 8 + (-i_291_ + i_280_)
                                        i_293_ = i_279_ - i_290_ + i + 8
                                    } else {
                                        i_293_ = i_280_ - (i_291_ - i) - -8
                                        i_292_ = i_275_ - (i_279_ + -i_290_)
                                    }
                                    method1682(true, 0, i_292_, 0, class348_sub49!!, 0, 1115212770, i_293_, i_290_ + i_285_, i_291_ + i_286_, i_272_)
                                } else {
                                    i_293_ = Class295.method2220(0x7 and i_291_, i_277_, i_290_ and 0x7, 71.toByte()) + i
                                    i_292_ = (i_275_ + method837(0x7 and i_290_, true, 0x7 and i_291_, i_277_))
                                    method1682(false, i_288_, i_292_, i_277_, class348_sub49!!, i_287_, 1115212770, i_293_, i_285_ - -i_290_, i_291_ + i_286_, i_272_)
                                }
                                if (i_290_ == 63 || i_291_ == 63) {
                                    var i_294_ = 1
                                    if (i_290_ == 63 && i_291_ == 63) i_294_ = 3
                                    var i_295_ = 0
                                    while ((i_294_ > i_295_)) {
                                        var i_296_ = i_290_
                                        var i_297_ = i_291_
                                        if (i_295_ == 0) {
                                            i_297_ = (if (i_291_ == 63) 64 else i_291_)
                                            i_296_ = if (i_290_ == 63) 64 else i_290_
                                        } else if (i_295_ == 1) i_296_ = 64
                                        else if (i_295_ == 2) i_297_ = 64
                                        val i_298_: Int
                                        val i_299_: Int
                                        if (i_277_ == 0) {
                                            i_298_ = -i_280_ - -i_297_ + i_275_
                                            i_299_ = i_296_ + -i_279_ + i
                                        } else if (i_277_ == 1) {
                                            i_298_ = i_279_ - (i_296_ - i_275_) - -8
                                            i_299_ = i + i_297_ - i_280_
                                        } else if (i_277_ == 2) {
                                            i_298_ = (8 + i_275_ + -i_297_ + i_280_)
                                            i_299_ = i_279_ - (i_296_ - i - 8)
                                        } else {
                                            i_299_ = -i_297_ - -i_280_ + 8 + i
                                            i_298_ = -i_279_ - -i_296_ + i_275_
                                        }
                                        if (i_299_ >= 0 && (i_299_ < this.anInt3117) && i_298_ >= 0 && (this.anInt3114 > i_298_)) this.anIntArrayArrayArray3122[i_272_]!![i_299_]!![i_298_] = (this.anIntArrayArrayArray3122[i_272_]!![i_287_ + i_293_]!![i_288_ + i_292_])
                                        i_295_++
                                    }
                                }
                            }
                        }
                    }
                    i_289_++
                }
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("sr.E(" + i + ',' + i_272_ + ',' + i_273_ + ',' + (if (class348_sub49 != null) "{...}" else "null") + ',' + i_274_ + ',' + i_275_ + ',' + i_276_ + ',' + (if (class361s != null) "{...}" else "null") + ',' + i_277_ + ',' + i_278_ + ')'))
        }
    }

    fun method1685(var_ha: ha?, `is`: Array<Array<IntArray?>?>?, i: Int, class361s: Array<Class361?>?) {
        try {
            anInt3118++
            if (i != 21407) method1680(null, (-116).toByte(), null, null)
            if (!this.aBoolean3109) {
                for (i_300_ in 0..3) {
                    var i_301_ = 0
                    while ((i_301_ < this.anInt3117)) {
                        var i_302_ = 0
                        while (this.anInt3114 > i_302_) {
                            if ((0x1 and (Class348_Sub33.aByteArrayArrayArray6962!![i_300_]!![i_301_]!![i_302_]).toInt()) != 0) {
                                var i_303_ = i_300_
                                if ((0x2 and (Class348_Sub33.aByteArrayArrayArray6962!![1]!![i_301_]!![i_302_]).toInt()) != 0) i_303_--
                                if (i_303_ >= 0) class361s!![i_303_]!!.method3507(i_302_, i_301_, (-116).toByte())
                            }
                            i_302_++
                        }
                        i_301_++
                    }
                }
            }
            var i_304_ = 0
            while (this.anInt3130 > i_304_) {
                var i_305_ = 0
                var i_306_ = 0
                if (!this.aBoolean3109) {
                    if (Class186.aBoolean2492) i_305_ = i_305_ or 0x2
                    if (Class369.aBoolean4972) i_306_ = i_306_ or 0x8
                    if (Class291.anInt3720 != 0) {
                        if ((i_304_ == 0) or Class296.aBoolean3767) i_306_ = i_306_ or 0x10
                        i_305_ = i_305_ or 0x1
                    }
                }
                if (Class186.aBoolean2492) i_306_ = i_306_ or 0x7
                if (!Class47.aBoolean845) i_306_ = i_306_ or 0x20
                val is_307_ = (if (`is` == null || `is`.size <= i_304_) this.anIntArrayArrayArray3122[i_304_] else `is`[i_304_])
                method3313(i_304_, var_ha!!.method3648(this.anInt3117, this.anInt3114, (this.anIntArrayArrayArray3122[i_304_]!!), is_307_, 512, i_305_, i_306_))
                i_304_++
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("sr.J(" + (if (var_ha != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (class361s != null) "{...}" else "null") + ')'))
        }
    }

    fun method1688(i: Int, i_310_: Int, i_311_: Int, i_312_: Int, i_313_: Int) {
        if (i_312_ > 50) {
            var i_314_ = 0
            while ((this.anInt3130 > i_314_)) {
                method1678(i_313_, i_310_, i, -124, i_311_, i_314_)
                i_314_++
            }
            anInt3127++
        }
    }

    init {
        anIntArray3124 = intArrayOf(0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256)
        try {
            this.aBoolean3109 = bool
            aClass268_3119 = class268
            aClass183_3120 = class183
            this.anInt3117 = i_315_
            this.anInt3130 = i
            this.anInt3114 = i_316_
            this.anIntArrayArrayArray3122 = (Array<Array<IntArray?>?>(this.anInt3130) { Array<IntArray?>(this.anInt3117 + 1) { IntArray(1 + this.anInt3114) } })
            this.aByteArrayArrayArray3108 = (Array<Array<ByteArray?>?>(this.anInt3130) { Array<ByteArray?>(this.anInt3117 - -1) { ByteArray(1 + this.anInt3114) } })
            aByteArrayArrayArray3113 = (Array<Array<ByteArray?>?>(this.anInt3130) { Array<ByteArray?>(this.anInt3117) { ByteArray(this.anInt3114) } })
            aByteArrayArrayArray3129 = (Array<Array<ByteArray?>?>(this.anInt3130) { Array<ByteArray?>(this.anInt3117) { ByteArray(this.anInt3114) } })
            aByteArrayArrayArray3126 = (Array<Array<ByteArray?>?>(this.anInt3130) { Array<ByteArray?>(this.anInt3117) { ByteArray(this.anInt3114) } })
            aByteArrayArrayArray3123 = (Array<Array<ByteArray?>?>(this.anInt3130) { Array<ByteArray?>(this.anInt3117) { ByteArray(this.anInt3114) } })
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("sr.<init>(" + i + ',' + i_315_ + ',' + i_316_ + ',' + bool + ',' + (if (class268 != null) "{...}" else "null") + ',' + (if (class183 != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt3102: Int = 0
        @JvmField
        var aBoolean3103: Boolean = false
        var anInt3105: Int = 0
        var anInt3106: Int = 0
        var anInt3107: Int = 0
        var anInt3110: Int = 0
        var anInt3111: Int = 0
        var anInt3112: Int = 0
        var anInt3115: Int = 0
        var anInt3116: Int = 0
        var anInt3118: Int = 0
        var anInt3121: Int = 0
        var anInt3125: Int = 0
        var anInt3127: Int = 0
        var anInt3131: Int = 0

        @JvmStatic
        fun method1677(i: Int, i_164_: Int): Class231? {
            anInt3116++
            val class231s: Array<Class231?> = method1709(-126)
            if (i >= -111) return null
            for (i_165_ in class231s.indices) {
                val class231 = class231s[i_165_]!!
                if (class231.anInt2995 == i_164_) return class231
            }
            return null
        }

        fun method1686(i: Int) {
            val i_308_ = -110 / ((i - -74) / 44)
            if (Class348_Sub40_Sub29.anInt9372 > 1) Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub17_7263), 4)
            else Class316.aClass348_Sub51_3959!!.method3429(74.toByte(), (Class316.aClass348_Sub51_3959!!.aClass239_Sub17_7263), 2)
            anInt3106++
        }

        fun method1687(class46: Class46, i: Int): Class46? {
            if (i != 3) method1686(-21)
            anInt3110++
            if (class46.anInt834 != -1) return method2570(1512932720, class46.anInt834)
            val i_309_ = class46.anInt830 ushr 16
            val class333 = Class333(Class125.aClass356_4915!!)
            var class348_sub41 = class333.method2644(123.toByte()) as Class348_Sub41?
            while (class348_sub41 != null) {
                if (i_309_ == class348_sub41.anInt7050) return method2570(1512932720, (class348_sub41.aLong4291).toInt())
                class348_sub41 = class333.method2646(117.toByte()) as Class348_Sub41?
            }
            return null
        }
    }
}
