import Class239_Sub8.Companion.method1750
import Class318_Sub1_Sub3_Sub3.Companion.method2420
import Class367_Sub1.Companion.method3535

/* Class348_Sub40 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class348_Sub40 internal constructor(i: Int, @JvmField var aBoolean7045: Boolean) : Class348() {
    @JvmField
    var aClass348_Sub40Array7031: Array<Class348_Sub40?>
    var aClass191_7032: Class191? = null
    var aClass322_7033: Class322? = null
    @JvmField
    var anInt7036: Int = 0

    open fun method3037(i: Int): Int {
        if (i >= -113) method3048(-125, -85, 60)
        anInt7027++
        return -1
    }

    fun method3039(i: Byte, i_1_: Int, i_2_: Int): Array<IntArray?>? {
        anInt7039++
        val i_3_ = 9 / ((6 - i) / 37)
        if (this.aClass348_Sub40Array7031[i_2_]!!.aBoolean7045) {
            val `is` = this.aClass348_Sub40Array7031[i_2_]!!.method3042(i_1_, 255)
            val is_4_ = arrayOfNulls<IntArray>(3)
            is_4_[2] = `is`
            is_4_[1] = `is`
            is_4_[0] = `is`
            return is_4_
        }
        return this.aClass348_Sub40Array7031[i_2_]!!.method3047(i_1_, -1564599039)
    }

    open fun method3042(i: Int, i_53_: Int): IntArray? {
        if (i_53_ != 255) return null
        anInt7035++
        throw IllegalStateException("This operation does not have a monochrome output")
    }

    open fun method3043(i: Int): Int {
        anInt7037++
        if (i != -1) this.aClass322_7033 = null
        return -1
    }

    open fun method3044(i: Int) {
        if (i <= 108) this.aClass191_7032 = null
        anInt7029++
    }

    open fun method3045(i: Int, i_54_: Int, i_55_: Int) {
        anInt7043++
        val i_56_ = (if (i_55_ != (this.anInt7036.inv())) this.anInt7036 else i_54_)
        if (this.aBoolean7045) this.aClass191_7032 = Class191(i_56_, i_54_, i)
        else this.aClass322_7033 = Class322(i_56_, i_54_, i)
    }

    open fun method3046(i: Byte) {
        anInt7038++
        if (i > -102) method3046((-112).toByte())
        if (this.aBoolean7045) {
            this.aClass191_7032!!.method1432(124.toByte())
            this.aClass191_7032 = null
        } else {
            this.aClass322_7033!!.method2558(6144)
            this.aClass322_7033 = null
        }
    }

    open fun method3047(i: Int, i_57_: Int): Array<IntArray?>? {
        anInt7040++
        if (i_57_ != -1564599039) method3048(-4, -64, 20)
        throw IllegalStateException("This operation does not have a colour output")
    }

    fun method3048(i: Int, i_58_: Int, i_59_: Int): IntArray? {
        anInt7034++
        if (i_58_ != 633706337) this.aClass191_7032 = null
        if (!this.aClass348_Sub40Array7031[i_59_]!!.aBoolean7045) return (this.aClass348_Sub40Array7031[i_59_]!!.method3047(i, -1564599039)!![0])
        return this.aClass348_Sub40Array7031[i_59_]!!.method3042(i, i_58_ + -633706082)
    }

    open fun method3049(class348_sub49: Class348_Sub49, i: Int, i_60_: Int) {
        anInt7028++
        if (i_60_ != 31015) method3038(-16)
    }

    init {
        this.aClass348_Sub40Array7031 = arrayOfNulls<Class348_Sub40>(i)
    }

    companion object {
        @JvmField
        var anInt7026: Int = 0
        @JvmField
        var anInt7027: Int = 0
        @JvmField
        var anInt7028: Int = 0
        @JvmField
        var anInt7029: Int = 0
        @JvmField
        var anInt7030: Int = 0
        @JvmField
        var anInt7034: Int = 0
        @JvmField
        var anInt7035: Int = 0
        @JvmField
        var anInt7037: Int = 0
        @JvmField
        var anInt7038: Int = 0
        @JvmField
        var anInt7039: Int = 0
        @JvmField
        var anInt7040: Int = 0
        @JvmField
        var aClass356_7041: Class356? = Class356(32)
        @JvmField
        var aClass279_7042: Class279? = null
        @JvmField
        var anInt7043: Int = 0
        @JvmField
        var anInt7044: Int = 0
        fun method3036(class348_sub49: Class348_Sub49, i: Int): Class50_Sub2? {
            anInt7026++
            if (i > -4) return null
            return Class50_Sub2(class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readShort(13638), class348_sub49.readMedium(-1), class348_sub49.readMedium(-1), class348_sub49.readUnsignedByte(255))
        }

        @JvmStatic
        fun method3038(i: Int) {
            anInt7044++
            var i_0_ = 0
            if (Class316.aClass348_Sub51_3959!!.aClass239_Sub28_7230!!.method1845(-32350) == 1) {
                i_0_ = i_0_ or 0x1
                i_0_ = i_0_ or 0x10
                i_0_ = i_0_ or 0x20
                i_0_ = i_0_ or 0x2
                i_0_ = i_0_ or 0x4
            }
            if ((Class316.aClass348_Sub51_3959!!.aClass239_Sub24_7235!!.method1820(-32350).inv()) == i) i_0_ = i_0_ or 0x40
            method2420(i_0_, i)
            Class348_Sub40_Sub12.aClass263_9195!!.method2009(i_0_, 109.toByte())
            Exception_Sub1.aClass255_112!!.method1942(i_0_, (-125).toByte())
            Class189.aClass278_2529!!.method2073(-25032, i_0_)
            Class348_Sub40_Sub18.aClass319_9245!!.method2541(119, i_0_)
            method3535(i_0_, i.inv())
            Class269.method2040(i_0_, true)
            Class69.method720(i_0_, i + 1227)
            method1750(14056, i_0_)
            Class348_Sub20.method2953((-106).toByte())
        }

        @JvmStatic
        fun method3040(bool: Boolean) {
            aClass279_7042 = null
            aClass356_7041 = null
        }

        fun method3041(i: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int) {
            anInt7030++
            var i_12_ = 0
            var i_13_ = i_8_
            var i_14_ = 0
            val i_15_ = -i_11_ + i
            val i_16_ = i_8_ - i_11_
            val i_17_ = i * i
            val i_18_ = i_8_ * i_8_
            val i_19_ = i_15_ * i_15_
            val i_20_ = i_16_ * i_16_
            val i_21_ = i_18_ shl 1
            val i_22_ = i_17_ shl 1
            val i_23_ = i_20_ shl 1
            val i_24_ = i_19_ shl 1
            val i_25_ = i_8_ shl 1
            val i_26_ = i_16_ shl 1
            var i_27_ = i_21_ + i_17_ * (-i_25_ + 1)
            var i_28_ = i_18_ + -(i_22_ * (-1 + i_25_))
            var i_29_ = (1 - i_26_) * i_19_ + i_23_
            var i_30_ = i_20_ + -(i_24_ * (-1 + i_26_))
            val i_31_ = i_17_ shl 2
            val i_32_ = i_18_ shl 2
            val i_33_ = i_19_ shl 2
            val i_34_ = i_20_ shl 2
            var i_35_ = 3 * i_21_
            var i_36_ = i_22_ * (-3 + i_25_)
            var i_37_ = 3 * i_23_
            var i_38_ = (i_26_ - 3) * i_24_
            var i_39_ = i_32_
            var i_40_ = i_31_ * (i_7_ + i_8_)
            var i_41_ = i_34_
            var i_42_ = i_33_ * (-1 + i_16_)
            if (i_6_ >= Class132.anInt1910 && Class38.anInt513 >= i_6_) {
                val `is` = Class17.anIntArrayArray255!![i_6_]!!
                val i_43_ = Class85.method831(Class113.anInt1745, i_5_ + -i, Class369.anInt4960, 77)
                val i_44_ = Class85.method831(Class113.anInt1745, i + i_5_, Class369.anInt4960, -68)
                val i_45_ = Class85.method831(Class113.anInt1745, i_5_ + -i_15_, Class369.anInt4960, i_7_ + -115)
                val i_46_ = Class85.method831(Class113.anInt1745, i_5_ + i_15_, Class369.anInt4960, 97)
                Class135_Sub2.method1156(-27, i_45_, `is`, i_43_, i_10_)
                Class135_Sub2.method1156(-27, i_46_, `is`, i_45_, i_9_)
                Class135_Sub2.method1156(-27, i_44_, `is`, i_46_, i_10_)
            }
            while (i_13_ > 0) {
                val bool = i_16_ >= i_13_
                if (bool) {
                    if (i_29_ < 0) {
                        while (i_29_ < 0) {
                            i_29_ += i_37_
                            i_30_ += i_41_
                            i_41_ += i_34_
                            i_14_++
                            i_37_ += i_34_
                        }
                    }
                    if (i_30_ < 0) {
                        i_29_ += i_37_
                        i_30_ += i_41_
                        i_41_ += i_34_
                        i_37_ += i_34_
                        i_14_++
                    }
                    i_29_ += -i_42_
                    i_30_ += -i_38_
                    i_42_ -= i_33_
                    i_38_ -= i_33_
                }
                if (i_27_ < 0) {
                    while (i_27_ < 0) {
                        i_27_ += i_35_
                        i_28_ += i_39_
                        i_12_++
                        i_39_ += i_32_
                        i_35_ += i_32_
                    }
                }
                if (i_28_ < 0) {
                    i_28_ += i_39_
                    i_27_ += i_35_
                    i_35_ += i_32_
                    i_12_++
                    i_39_ += i_32_
                }
                i_27_ += -i_40_
                i_28_ += -i_36_
                i_13_--
                i_36_ -= i_31_
                i_40_ -= i_31_
                val i_47_ = -i_13_ + i_6_
                val i_48_ = i_13_ + i_6_
                if (i_48_ >= Class132.anInt1910 && Class38.anInt513 >= i_47_) {
                    val i_49_ = Class85.method831(Class113.anInt1745, i_12_ + i_5_, Class369.anInt4960, 36)
                    val i_50_ = Class85.method831(Class113.anInt1745, -i_12_ + i_5_, Class369.anInt4960, 97)
                    if (bool) {
                        val i_51_ = Class85.method831(Class113.anInt1745, i_5_ - -i_14_, Class369.anInt4960, i_7_ xor 0x5c.inv())
                        val i_52_ = Class85.method831(Class113.anInt1745, -i_14_ + i_5_, Class369.anInt4960, 32)
                        if (Class132.anInt1910 <= i_47_) {
                            val `is` = Class17.anIntArrayArray255!![i_47_]!!
                            Class135_Sub2.method1156(-27, i_52_, `is`, i_50_, i_10_)
                            Class135_Sub2.method1156(-27, i_51_, `is`, i_52_, i_9_)
                            Class135_Sub2.method1156(i_7_ + -26, i_49_, `is`, i_51_, i_10_)
                        }
                        if (Class38.anInt513 >= i_48_) {
                            val `is` = Class17.anIntArrayArray255!![i_48_]!!
                            Class135_Sub2.method1156(i_7_ xor 0x1a, i_52_, `is`, i_50_, i_10_)
                            Class135_Sub2.method1156(-27, i_51_, `is`, i_52_, i_9_)
                            Class135_Sub2.method1156(-27, i_49_, `is`, i_51_, i_10_)
                        }
                    } else {
                        if (i_47_ >= Class132.anInt1910) Class135_Sub2.method1156(-27, i_49_, (Class17.anIntArrayArray255!![i_47_]!!), i_50_, i_10_)
                        if (i_48_ <= Class38.anInt513) Class135_Sub2.method1156(-27, i_49_, (Class17.anIntArrayArray255!![i_48_]!!), i_50_, i_10_)
                    }
                }
            }
        }
    }
}
