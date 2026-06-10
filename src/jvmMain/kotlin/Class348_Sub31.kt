import Class239_Sub15.Companion.method1783
import java.awt.Canvas
import java.awt.Graphics
import java.math.BigInteger

abstract class Class348_Sub31 : Class348() {
    @JvmField
    var anIntArray6916: IntArray? = null
    @JvmField
    var anInt6917: Int = 0
    var anInt6920: Int = 0
    abstract fun method3008(canvas: Canvas?, i: Int, i_1_: Int, i_2_: Int)

    abstract fun method3011(i: Int, i_38_: Int, i_39_: Int, graphics: Graphics?, i_40_: Int, i_41_: Int, i_42_: Int, i_43_: Int)

    companion object {
        @JvmField
        var anInt6913: Int = 0
        @JvmField
        var anInt6914: Int = 0
        @JvmField
        var anInt6915: Int = 0
        @JvmField
        var anInt6918: Int = 0
        @JvmField
        var anInt6919: Int = 0
        @JvmField
        var aBigInteger6921: BigInteger?
        @JvmField
        var anInt6922: Int = 0
        @JvmField
        var anInt6923: Int = -1
        @JvmField
        var anInt6924: Int = 0
        @JvmField
        var aClass351_6925: Class351?
        @JvmField
        var aString6926: String?

        @JvmStatic
        fun method3007(i: Int, i_0_: Int) {
            Class318_Sub1_Sub4_Sub1.anInt10074 = -1
            Class285.aClass348_Sub16_Sub3_4743 = null
            if (i_0_ != 22684) anInt6913 = -117
            anInt6922++
            Class346.aBoolean4275 = false
            Class124.aClass45_1848 = null
            Class318.anInt3971 = -1
            Class239_Sub14.anInt5994 = i
            Class348_Sub43.anInt7068 = 1
            Class58.anInt1059 = 0
        }

        fun method3009(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Byte, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int) {
            if (i_11_ != i_4_ || i != i_9_ || i_8_ != i_5_ || i_3_ != i_6_) {
                var i_12_ = i_11_
                var i_13_ = i_9_
                val i_14_ = 3 * i_11_
                val i_15_ = 3 * i_9_
                val i_16_ = 3 * i_4_
                val i_17_ = 3 * i
                val i_18_ = 3 * i_8_
                val i_19_ = i_3_ * 3
                val i_20_ = -i_11_ + (i_16_ + -i_18_) + i_5_
                val i_21_ = -i_9_ + i_17_ + -i_19_ + i_6_
                val i_22_ = i_14_ + (-i_16_ + (i_18_ + -i_16_))
                val i_23_ = -i_17_ + (-i_17_ + (i_19_ - -i_15_))
                val i_24_ = -i_14_ + i_16_
                val i_25_ = i_17_ - i_15_
                var i_26_ = 128
                while (i_26_ <= 4096) {
                    val i_27_ = i_26_ * i_26_ shr 12
                    val i_28_ = i_27_ * i_26_ shr 12
                    val i_29_ = i_20_ * i_28_
                    val i_30_ = i_28_ * i_21_
                    val i_31_ = i_22_ * i_27_
                    val i_32_ = i_27_ * i_23_
                    val i_33_ = i_24_ * i_26_
                    val i_34_ = i_25_ * i_26_
                    val i_35_ = i_11_ + (i_29_ + (i_31_ + i_33_) shr 12)
                    val i_36_ = i_9_ + (i_30_ - -i_32_ + i_34_ shr 12)
                    method1783(i_12_, -1, i_13_, i_36_, i_35_, i_10_)
                    i_13_ = i_36_
                    i_12_ = i_35_
                    i_26_ += 128
                }
            } else method1783(i_11_, -1, i_9_, i_6_, i_5_, i_10_)
            anInt6919++
            val i_37_ = 64 % ((50 - i_7_) / 51)
        }

        @JvmStatic
        fun method3010(i: Int) {
            aClass351_6925 = null
            aBigInteger6921 = null
            if (i != -1316) aClass351_6925 = null
            aString6926 = null
        }

        fun method3012(i: Int, i_44_: Int, i_45_: Int, i_46_: Int, i_47_: Int, i_48_: Byte, i_49_: Int, i_50_: Int) {
            anInt6918++
            var i_51_ = 0
            var i_52_ = i
            var i_53_ = 0
            val i_54_ = -i_50_ + i_45_
            val i_55_ = -i_50_ + i
            val i_56_ = i_45_ * i_45_
            val i_57_ = i * i
            val i_58_ = i_54_ * i_54_
            val i_59_ = i_55_ * i_55_
            val i_60_ = i_57_ shl 1
            val i_61_ = i_56_ shl 1
            val i_62_ = i_59_ shl 1
            val i_63_ = i_58_ shl 1
            val i_64_ = i shl 1
            val i_65_ = i_55_ shl 1
            var i_66_ = i_60_ + (-i_64_ + 1) * i_56_
            var i_67_ = i_57_ + -(i_61_ * (i_64_ - 1))
            var i_68_ = i_62_ + (-i_65_ + 1) * i_58_
            var i_69_ = -((i_65_ + -1) * i_63_) + i_59_
            val i_70_ = i_56_ shl 2
            val i_71_ = i_57_ shl 2
            val i_72_ = i_58_ shl 2
            val i_73_ = i_59_ shl 2
            var i_74_ = 3 * i_60_
            var i_75_ = (-3 + i_64_) * i_61_
            var i_76_ = 3 * i_62_
            var i_77_ = i_63_ * (-3 + i_65_)
            var i_78_ = i_71_
            var i_79_ = i_70_ * (-1 + i)
            val i_80_ = 51 / ((i_48_ - -63) / 44)
            var i_81_ = i_73_
            var i_82_ = (-1 + i_55_) * i_72_
            val `is` = Class17.anIntArrayArray255!![i_49_]!!
            Class135_Sub2.method1156(-27, i_47_ - i_54_, `is`, -i_45_ + i_47_, i_46_)
            Class135_Sub2.method1156(-27, i_47_ + i_54_, `is`, -i_54_ + i_47_, i_44_)
            Class135_Sub2.method1156(-27, i_45_ + i_47_, `is`, i_47_ + i_54_, i_46_)
            while (i_52_ > 0) {
                val bool = i_55_ >= i_52_
                if (i_66_ < 0) {
                    while (i_66_ < 0) {
                        i_67_ += i_78_
                        i_66_ += i_74_
                        i_78_ += i_71_
                        i_51_++
                        i_74_ += i_71_
                    }
                }
                if (bool) {
                    if (i_68_ < 0) {
                        while (i_68_ < 0) {
                            i_69_ += i_81_
                            i_68_ += i_76_
                            i_53_++
                            i_81_ += i_73_
                            i_76_ += i_73_
                        }
                    }
                    if (i_69_ < 0) {
                        i_69_ += i_81_
                        i_68_ += i_76_
                        i_76_ += i_73_
                        i_53_++
                        i_81_ += i_73_
                    }
                    i_69_ += -i_77_
                    i_68_ += -i_82_
                    i_77_ -= i_72_
                    i_82_ -= i_72_
                }
                if (i_67_ < 0) {
                    i_67_ += i_78_
                    i_66_ += i_74_
                    i_78_ += i_71_
                    i_51_++
                    i_74_ += i_71_
                }
                i_67_ += -i_75_
                i_66_ += -i_79_
                i_75_ -= i_70_
                i_52_--
                i_79_ -= i_70_
                val i_83_ = -i_52_ + i_49_
                val i_84_ = i_49_ - -i_52_
                val i_85_ = i_51_ + i_47_
                val i_86_ = -i_51_ + i_47_
                if (bool) {
                    val i_87_ = i_47_ + i_53_
                    val i_88_ = -i_53_ + i_47_
                    Class135_Sub2.method1156(-27, i_88_, Class17.anIntArrayArray255!![i_83_]!!, i_86_, i_46_)
                    Class135_Sub2.method1156(-27, i_87_, Class17.anIntArrayArray255!![i_83_]!!, i_88_, i_44_)
                    Class135_Sub2.method1156(-27, i_85_, Class17.anIntArrayArray255!![i_83_]!!, i_87_, i_46_)
                    Class135_Sub2.method1156(-27, i_88_, Class17.anIntArrayArray255!![i_84_]!!, i_86_, i_46_)
                    Class135_Sub2.method1156(-27, i_87_, Class17.anIntArrayArray255!![i_84_]!!, i_88_, i_44_)
                    Class135_Sub2.method1156(-27, i_85_, Class17.anIntArrayArray255!![i_84_]!!, i_87_, i_46_)
                } else {
                    Class135_Sub2.method1156(-27, i_85_, Class17.anIntArrayArray255!![i_83_]!!, i_86_, i_46_)
                    Class135_Sub2.method1156(-27, i_85_, Class17.anIntArrayArray255!![i_84_]!!, i_86_, i_46_)
                }
            }
        }

        @JvmStatic
        fun method3013(i: Int, bool: Boolean): Int {
            if (bool != true) anInt6923 = -14
            anInt6915++
            return i and 0xff
        }

        @JvmStatic
        fun method3014(class348_sub49: Class348_Sub49, i: Byte) {
            anInt6914++
            if ((class348_sub49.aByteArray7154!!.size - class348_sub49.anInt7197) >= 1) {
                val i_89_ = class348_sub49.readUnsignedByte(255)
                if (i_89_ >= 0 && i_89_ <= 1 && (class348_sub49.aByteArray7154!!.size - class348_sub49.anInt7197) >= 2) {
                    if (i.toInt() != -40) Companion.method3012(13, -47, -27, 107, -90, (-19).toByte(), -61, 36)
                    val i_90_ = class348_sub49.readUnsignedShort(842397944)
                    if (i_90_ * 6 <= (-class348_sub49.anInt7197 + (class348_sub49.aByteArray7154)!!.size)) {
                        for (i_91_ in 0..<i_90_) {
                            val i_92_ = class348_sub49.readUnsignedShort(842397944)
                            val i_93_ = class348_sub49.readInt((-126).toByte())
                            if ((Class77.anIntArray1303!!.size > i_92_) && Class286_Sub6.aBooleanArray6270!![i_92_] && ((Class239_Sub14.aClass259_5995!!.method1976(i_92_, -107).aChar2132) != '1' || i_93_ >= -1 && i_93_ <= 1)) Class77.anIntArray1303!![i_92_] = i_93_
                        }
                    }
                }
            }
        }

        init {
            aBigInteger6921 = Loader.LOGIN_SERVER_RSA_MODULUS
            aString6926 = null
            aClass351_6925 = Class351(31, 1)
        }
    }
}
