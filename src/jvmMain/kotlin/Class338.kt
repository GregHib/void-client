import Class251.Companion.method1913
import Class251.Companion.method1916
import Class324.Companion.method2570
import Class348_Sub7.Companion.method2772
import Class66.method703

/* Class338 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class338 internal constructor(i: Int, i_15_: Int, i_16_: Int, i_17_: Int, i_18_: Int, i_19_: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int, i_27_: Int) {
    var aByte4181: Byte
    var aShort4182: Short
    @JvmField
    var aShortArray4183: ShortArray?
    @JvmField
    var anIntArray4184: IntArray = IntArray(4)
    var aShort4185: Short
    @JvmField
    var anIntArray4187: IntArray?
    @JvmField
    var aShortArray4188: ShortArray?
    var aShort4190: Short
    @JvmField
    var anIntArray4191: IntArray = IntArray(4)
    var aByte4192: Byte
    var aShort4193: Short
    @JvmField
    var aShortArray4194: ShortArray?

    init {
        this.aByte4192 = i.toByte()
        this.aByte4181 = i_15_.toByte()
        this.anIntArray4187 = IntArray(4)
        this.anIntArray4187!![0] = i_16_
        this.anIntArray4187!![1] = i_17_
        this.anIntArray4187!![3] = i_19_
        this.anIntArray4187!![2] = i_18_
        this.anIntArray4191[0] = i_20_
        this.anIntArray4191[2] = i_22_
        this.anIntArray4191[3] = i_23_
        this.anIntArray4191[1] = i_21_
        this.anIntArray4184[1] = i_25_
        this.aShort4185 = (i_16_ shr Class362.anInt4459).toShort()
        this.anIntArray4184[3] = i_27_
        this.anIntArray4184[0] = i_24_
        this.anIntArray4184[2] = i_26_
        this.aShort4182 = (i_18_ shr Class362.anInt4459).toShort()
        this.aShort4193 = (i_24_ shr Class362.anInt4459).toShort()
        this.aShort4190 = (i_26_ shr Class362.anInt4459).toShort()
        this.aShortArray4188 = ShortArray(4)
        this.aShortArray4183 = ShortArray(4)
        this.aShortArray4194 = ShortArray(4)
    }

    companion object {
        @JvmField
        var anInt4186: Int = 0
        var anInt4189: Int = 0
        var anInt4195: Int = 0
        var anIntArray4196: IntArray? = IntArray(5)
        var aClass237_Sub1_4197: Class237_Sub1? = null

        fun method2661(i: Int, i_0_: Int, i_1_: Int, bool: Boolean, i_2_: Int): Class348_Sub41 {
            if (i_2_ != 2) method2661(31, -43, 32, true, -110)
            anInt4189++
            val class348_sub41 = Class348_Sub41()
            class348_sub41.anInt7050 = i
            class348_sub41.anInt7053 = i_1_
            Class125.aClass356_4915!!.method3483(109.toByte(), i_0_.toLong(), class348_sub41)
            method2772(i, 110.toByte())
            val class46 = method2570(i_2_ + 1512932718, i_0_)
            if (class46 != null) method1916(-9343, class46)
            if (Class49.aClass46_4730 != null) {
                Class251.method1916(-9343, Class49.aClass46_4730!!)
                Class49.aClass46_4730 = null
            }
            Class348_Sub42_Sub17.method3270(120.toByte())
            if (class46 != null) method1913(!bool, i_2_ + -104, class46)
            if (!bool) method703(i)
            if (!bool && r.anInt9721 != -1) Class239_Sub12.method1775((-8).toByte(), r.anInt9721, 1)
            return class348_sub41
        }

        @JvmStatic
        fun method2662(i: Int) {
            aClass237_Sub1_4197 = null
            anIntArray4196 = null
            if (i != 4) method2663(91, -57, -85, 14, 6)
        }

        fun method2663(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
            anInt4195++
            if (Class348_Sub49.anInt7207 == 1) {
                var i_7_ = i_3_ / Class58.anInt1067
                var i_8_ = i_4_ / Class58.anInt1067
                var i_9_ = i_5_ / Class344.anInt4267
                var i_10_ = i_6_ / Class344.anInt4267
                if (i_7_ < Class31.anInt425 && i_8_ >= 0 && Class250.anInt3225 > i_9_ && i_10_ >= 0 && i == -5590) {
                    if (i_8_ >= Class31.anInt425) i_8_ = -1 + Class31.anInt425
                    if (i_9_ < 0) i_9_ = 0
                    if (i_10_ >= Class250.anInt3225) i_10_ = Class250.anInt3225 + -1
                    if (i_7_ < 0) i_7_ = 0
                    for (i_11_ in i_9_..i_10_) {
                        val i_12_ = (Class350.method3452(i_11_ + Class286.anInt3682, (-15).toByte(), Class250.anInt3225) * Class31.anInt425)
                        var i_13_ = i_7_
                        while (i_8_ >= i_13_) {
                            val i_14_ = (i_12_ + Class350.method3452((Class239_Sub24.anInt6095 + i_13_), (-15).toByte(), Class31.anInt425))
                            Class132.anIntArray1909!![i_14_] = Class318_Sub1_Sub1_Sub2.anInt9997
                            i_13_++
                        }
                    }
                }
            }
        }
    }
}
