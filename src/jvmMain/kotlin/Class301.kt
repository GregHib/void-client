import Class122.method1088
import Class367_Sub10.Companion.method3553
import Class44.method384

/* Class301 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class301 {
    @JvmField
    var aClass351_3825: Class351?
    var anInt3826: Int = 0
    var anInt3827: Int = 0
    var anInt3828: Int = 0
    @JvmField
    var anInt3829: Int = -1
    var anInt3830: Int = 0

    @JvmStatic
    fun method2278(i: Int, i_0_: Int, i_1_: Byte, i_2_: Int): Int {
        anInt3830++
        val i_3_ = -114 / ((i_1_ - 74) / 45)
        val i_4_ = i_2_ / i
        val i_5_ = -1 + i and i_2_
        val i_6_ = i_0_ / i
        val i_7_ = i_0_ and -1 + i
        val i_8_ = method384(i_4_, -1, i_6_)
        val i_9_ = method384(i_4_ - -1, -1, i_6_)
        val i_10_ = method384(i_4_, -1, 1 + i_6_)
        val i_11_ = method384(i_4_ + 1, -1, i_6_ + 1)
        val i_12_ = method1088(i_9_, 22.toByte(), i, i_5_, i_8_)
        val i_13_ = method1088(i_11_, 22.toByte(), i, i_5_, i_10_)
        return method1088(i_13_, 22.toByte(), i, i_7_, i_12_)
    }

    fun method2279(bool: Boolean, i: Int, i_14_: Int, i_15_: Int, i_16_: Int): Int {
        anInt3828++
        val i_17_ = i and 0xf
        if (bool != true) aClass351_3825 = null
        val i_18_ = if (i_17_ < 8) i_16_ else i_15_
        val i_19_ = (if (i_17_ < 4) i_15_ else if (i_17_ == 12 || i_17_ == 14) i_16_ else i_14_)
        return ((if ((i_17_ and 0x1) != 0) -i_18_ else i_18_) - -(if ((0x2 and i_17_) == 0) i_19_ else -i_19_))
    }

    fun method2280(i: Byte, i_20_: Int) {
        anInt3826++
        if (Class289.aByteArrayArrayArray3700 == null) Class289.aByteArrayArrayArray3700 = (Array<Array<ByteArray?>?>(4) { Array<ByteArray?>(Class367_Sub4.anInt7319) { ByteArray(Class348_Sub40_Sub3.anInt9109) } })
        if (i_20_ != 28587) method2278(35, -47, 56.toByte(), -93)
        for (i_21_ in 0..3) {
            var i_22_ = 0
            while (Class367_Sub4.anInt7319 > i_22_) {
                var i_23_ = 0
                while ((Class348_Sub40_Sub3.anInt9109 > i_23_)) {
                    Class289.aByteArrayArrayArray3700!![i_21_]!![i_22_]!![i_23_] = i
                    i_23_++
                }
                i_22_++
            }
        }
    }

    @JvmStatic
    fun method2281(i: Int) {
        aClass351_3825 = null
        if (i != 1) Class301.method2278(-115, 106, (-74).toByte(), -75)
    }

    fun method2282(i: Int) {
        anInt3827++
        Class348_Sub42_Sub3.method3177(i xor 0x315e, false)
        if (i == -12648) {
            if (Class111.anInt1720 >= 0 && Class111.anInt1720 != 0) {
                method3553(false, 116.toByte(), Class111.anInt1720)
                Class111.anInt1720 = -1
            }
        }
    }

    init {
        aClass351_3825 = Class351(82, 18)
    }
}
