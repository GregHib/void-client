/* Class101_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class101_Sub1 : Class101() {
    var aFloat5655: Float = 0f
    var aFloat5662: Float = 0f
    var aFloat5664: Float = 0f
    var aFloat5666: Float = 0f
    var aFloat5669: Float = 0f
    var aFloat5672: Float = 0f
    var aFloat5673: Float = 0f
    var aFloat5678: Float = 0f
    var aFloat5680: Float = 0f
    var aFloat5681: Float = 0f
    var aFloat5685: Float = 0f
    var aFloat5686: Float = 0f
    override fun method910() {
        anInt5688++
        this.aFloat5664 = 1.0f
        this.aFloat5678 = this.aFloat5664
        this.aFloat5672 = this.aFloat5678
        this.aFloat5681 = 0.0f
        this.aFloat5685 = this.aFloat5681
        this.aFloat5686 = this.aFloat5685
        this.aFloat5666 = this.aFloat5686
        this.aFloat5669 = this.aFloat5666
        this.aFloat5680 = this.aFloat5669
        this.aFloat5673 = this.aFloat5680
        this.aFloat5662 = this.aFloat5673
        this.aFloat5655 = this.aFloat5662
    }

    override fun method894(i: Int, i_0_: Int, i_1_: Int) {
        anInt5674++
        this.aFloat5685 = i_0_.toFloat()
        this.aFloat5666 = 0.0f
        this.aFloat5669 = this.aFloat5666
        this.aFloat5680 = this.aFloat5669
        this.aFloat5673 = this.aFloat5680
        this.aFloat5662 = this.aFloat5673
        this.aFloat5655 = this.aFloat5662
        this.aFloat5664 = 1.0f
        this.aFloat5678 = this.aFloat5664
        this.aFloat5672 = this.aFloat5678
        this.aFloat5686 = i.toFloat()
        this.aFloat5681 = i_1_.toFloat()
    }

    override fun method903(i: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int) {
        anInt5682++
        val f = Class239_Sub4.aFloatArray5876!![i_4_ and 0x3fff]
        val f_7_ = Class239_Sub4.aFloatArray5874!![0x3fff and i_4_]
        val f_8_ = Class239_Sub4.aFloatArray5876!![i_5_ and 0x3fff]
        val f_9_ = Class239_Sub4.aFloatArray5874!![0x3fff and i_5_]
        val f_10_ = Class239_Sub4.aFloatArray5876!![0x3fff and i_6_]
        val f_11_ = Class239_Sub4.aFloatArray5874!![0x3fff and i_6_]
        val f_12_ = f_10_ * f_7_
        val f_13_ = f_7_ * f_11_
        this.aFloat5666 = f_11_ * f_9_ + f_8_ * f_12_
        this.aFloat5669 = f_10_ * -f_9_ + f_13_ * f_8_
        this.aFloat5680 = -f_7_
        this.aFloat5678 = f * f_10_
        this.aFloat5664 = f_8_ * f
        this.aFloat5662 = f * f_9_
        this.aFloat5655 = f_12_ * f_9_ + -f_8_ * f_11_
        this.aFloat5673 = f * f_11_
        this.aFloat5672 = f_13_ * f_9_ + f_10_ * f_8_
        this.aFloat5681 = (-(i_3_.toFloat() * this.aFloat5664) + (-(i_2_.toFloat() * this.aFloat5680) + -i.toFloat() * this.aFloat5662))
        this.aFloat5686 = (this.aFloat5672 * -i.toFloat() - i_2_.toFloat() * this.aFloat5673 - this.aFloat5669 * i_3_.toFloat())
        this.aFloat5685 = (-(this.aFloat5666 * i_3_.toFloat()) + (this.aFloat5655 * -i.toFloat() - i_2_.toFloat() * this.aFloat5678))
    }

    override fun method898(class101: Class101?) {
        anInt5683++
        val class101_sub1_14_ = class101 as Class101_Sub1?
        this.aFloat5669 = class101_sub1_14_!!.aFloat5669
        this.aFloat5681 = class101_sub1_14_.aFloat5681
        this.aFloat5655 = class101_sub1_14_.aFloat5655
        this.aFloat5664 = class101_sub1_14_.aFloat5664
        this.aFloat5666 = class101_sub1_14_.aFloat5666
        this.aFloat5678 = class101_sub1_14_.aFloat5678
        this.aFloat5680 = class101_sub1_14_.aFloat5680
        this.aFloat5672 = class101_sub1_14_.aFloat5672
        this.aFloat5662 = class101_sub1_14_.aFloat5662
        this.aFloat5686 = class101_sub1_14_.aFloat5686
        this.aFloat5673 = class101_sub1_14_.aFloat5673
        this.aFloat5685 = class101_sub1_14_.aFloat5685
    }

    override fun method905(i: Int, i_15_: Int, i_16_: Int, `is`: IntArray) {
        `is`!![0] = (i_16_.toFloat() * this.aFloat5669 + (this.aFloat5673 * i_15_.toFloat() + this.aFloat5672 * i.toFloat())).toInt()
        anInt5687++
        `is`[1] = (this.aFloat5655 * i.toFloat() + i_15_.toFloat() * this.aFloat5678 + this.aFloat5666 * i_16_.toFloat()).toInt()
        `is`[2] = (this.aFloat5664 * i_16_.toFloat() + (i.toFloat() * this.aFloat5662 + i_15_.toFloat() * this.aFloat5680)).toInt()
    }

    override fun method891(i: Int, i_17_: Int, i_18_: Int) {
        this.aFloat5685 += i_17_.toFloat()
        this.aFloat5681 += i_18_.toFloat()
        this.aFloat5686 += i.toFloat()
        anInt5661++
    }

    override fun method908(i: Int) {
        anInt5656++
        val f = Class239_Sub4.aFloatArray5876!![i and 0x3fff]
        val f_19_ = Class239_Sub4.aFloatArray5874!![i and 0x3fff]
        val f_20_ = this.aFloat5672
        val f_21_ = this.aFloat5673
        val f_22_ = this.aFloat5669
        this.aFloat5672 = -(f_19_ * this.aFloat5655) + f * f_20_
        val f_23_ = this.aFloat5686
        this.aFloat5673 = f_21_ * f - this.aFloat5678 * f_19_
        this.aFloat5655 = f * this.aFloat5655 + f_20_ * f_19_
        this.aFloat5669 = f * f_22_ - this.aFloat5666 * f_19_
        this.aFloat5678 = f * this.aFloat5678 + f_19_ * f_21_
        this.aFloat5666 = f_19_ * f_22_ + f * this.aFloat5666
        this.aFloat5686 = -(f_19_ * this.aFloat5685) + f_23_ * f
        this.aFloat5685 = f * this.aFloat5685 + f_19_ * f_23_
    }

    override fun method900(i: Int) {
        anInt5658++
        val f = Class239_Sub4.aFloatArray5876!![0x3fff and i]
        val f_24_ = Class239_Sub4.aFloatArray5874!![0x3fff and i]
        val f_25_ = this.aFloat5655
        val f_26_ = this.aFloat5678
        val f_27_ = this.aFloat5666
        this.aFloat5655 = f_25_ * f - this.aFloat5662 * f_24_
        val f_28_ = this.aFloat5685
        this.aFloat5662 = f_24_ * f_25_ + this.aFloat5662 * f
        this.aFloat5678 = f * f_26_ - this.aFloat5680 * f_24_
        this.aFloat5666 = -(f_24_ * this.aFloat5664) + f * f_27_
        this.aFloat5680 = this.aFloat5680 * f + f_24_ * f_26_
        this.aFloat5685 = f * f_28_ - f_24_ * this.aFloat5681
        this.aFloat5664 = f * this.aFloat5664 + f_27_ * f_24_
        this.aFloat5681 = f_28_ * f_24_ + f * this.aFloat5681
    }

    override fun method892(i: Int, i_29_: Int, i_30_: Int, `is`: IntArray) {
        var i = i
        var i_29_ = i_29_
        var i_30_ = i_30_
        i_30_ = (i_30_ - this.aFloat5681).toInt()
        anInt5668++
        i_29_ = (i_29_ - this.aFloat5685).toInt()
        i = (i - this.aFloat5686).toInt()
        `is`!![0] = (this.aFloat5662 * i_30_.toFloat() + (this.aFloat5655 * i_29_.toFloat() + this.aFloat5672 * i.toFloat())).toInt()
        `is`[1] = (i_29_.toFloat() * this.aFloat5678 + this.aFloat5673 * i.toFloat() + i_30_.toFloat() * this.aFloat5680).toInt()
        `is`[2] = (i_30_.toFloat() * this.aFloat5664 + (i_29_.toFloat() * this.aFloat5666 + i.toFloat() * this.aFloat5669)).toInt()
    }

    override fun method899(i: Int) {
        anInt5670++
        this.aFloat5672 = 1.0f
        this.aFloat5664 = Class239_Sub4.aFloatArray5876!![i and 0x3fff]
        this.aFloat5678 = this.aFloat5664
        this.aFloat5680 = Class239_Sub4.aFloatArray5874!![0x3fff and i]
        this.aFloat5666 = -this.aFloat5680
        this.aFloat5681 = 0.0f
        this.aFloat5662 = this.aFloat5681
        this.aFloat5685 = this.aFloat5662
        this.aFloat5655 = this.aFloat5685
        this.aFloat5686 = this.aFloat5655
        this.aFloat5669 = this.aFloat5686
        this.aFloat5673 = this.aFloat5669
    }

    override fun method902(i: Int) {
        anInt5667++
        this.aFloat5664 = 1.0f
        this.aFloat5678 = Class239_Sub4.aFloatArray5876!![0x3fff and i]
        this.aFloat5672 = this.aFloat5678
        this.aFloat5655 = Class239_Sub4.aFloatArray5874!![0x3fff and i]
        this.aFloat5681 = 0.0f
        this.aFloat5680 = this.aFloat5681
        this.aFloat5662 = this.aFloat5680
        this.aFloat5685 = this.aFloat5662
        this.aFloat5666 = this.aFloat5685
        this.aFloat5686 = this.aFloat5666
        this.aFloat5669 = this.aFloat5686
        this.aFloat5673 = -this.aFloat5655
    }

    override fun method907(): Class101 {
        anInt5660++
        val class101_sub1_31_ = Class101_Sub1()
        class101_sub1_31_.aFloat5664 = this.aFloat5664
        class101_sub1_31_.aFloat5681 = this.aFloat5681
        class101_sub1_31_.aFloat5662 = this.aFloat5662
        class101_sub1_31_.aFloat5669 = this.aFloat5669
        class101_sub1_31_.aFloat5655 = this.aFloat5655
        class101_sub1_31_.aFloat5666 = this.aFloat5666
        class101_sub1_31_.aFloat5686 = this.aFloat5686
        class101_sub1_31_.aFloat5678 = this.aFloat5678
        class101_sub1_31_.aFloat5673 = this.aFloat5673
        class101_sub1_31_.aFloat5685 = this.aFloat5685
        class101_sub1_31_.aFloat5672 = this.aFloat5672
        class101_sub1_31_.aFloat5680 = this.aFloat5680
        return class101_sub1_31_
    }

    override fun method895(i: Int) {
        this.aFloat5678 = 1.0f
        anInt5676++
        this.aFloat5664 = Class239_Sub4.aFloatArray5876!![0x3fff and i]
        this.aFloat5672 = this.aFloat5664
        this.aFloat5669 = Class239_Sub4.aFloatArray5874!![i and 0x3fff]
        this.aFloat5681 = 0.0f
        this.aFloat5680 = this.aFloat5681
        this.aFloat5685 = this.aFloat5680
        this.aFloat5666 = this.aFloat5685
        this.aFloat5655 = this.aFloat5666
        this.aFloat5686 = this.aFloat5655
        this.aFloat5673 = this.aFloat5686
        this.aFloat5662 = -this.aFloat5669
    }

    override fun method896(i: Int) {
        anInt5659++
        val f = Class239_Sub4.aFloatArray5876!![0x3fff and i]
        val f_32_ = Class239_Sub4.aFloatArray5874!![i and 0x3fff]
        val f_33_ = this.aFloat5672
        val f_34_ = this.aFloat5673
        val f_35_ = this.aFloat5669
        this.aFloat5672 = f_33_ * f + f_32_ * this.aFloat5662
        val f_36_ = this.aFloat5686
        this.aFloat5673 = f * f_34_ + f_32_ * this.aFloat5680
        this.aFloat5662 = -(f_32_ * f_33_) + this.aFloat5662 * f
        this.aFloat5669 = f * f_35_ + f_32_ * this.aFloat5664
        this.aFloat5680 = -(f_32_ * f_34_) + f * this.aFloat5680
        this.aFloat5664 = -(f_32_ * f_35_) + f * this.aFloat5664
        this.aFloat5686 = f_36_ * f + f_32_ * this.aFloat5681
        this.aFloat5681 = f * this.aFloat5681 - f_32_ * f_36_
    }

    override fun method890(`is`: IntArray) {
        anInt5671++
        val f = -this.aFloat5686 + `is`[0].toFloat()
        val f_37_ = `is`[1].toFloat() - this.aFloat5685
        val f_38_ = `is`[2].toFloat() - this.aFloat5681
        `is`[2] = (this.aFloat5669 * f + f_37_ * this.aFloat5666 + this.aFloat5664 * f_38_).toInt()
        `is`[1] = (this.aFloat5673 * f + f_37_ * this.aFloat5678 + f_38_ * this.aFloat5680).toInt()
        `is`[0] = (this.aFloat5662 * f_38_ + (f * this.aFloat5672 + this.aFloat5655 * f_37_)).toInt()
    }

    init {
        method910()
    }

    override fun method897(i: Int, i_39_: Int, i_40_: Int, `is`: IntArray) {
        anInt5665++
        `is`[1] = (i.toFloat() * this.aFloat5655 + this.aFloat5678 * i_39_.toFloat() + i_40_.toFloat() * this.aFloat5666 + this.aFloat5685).toInt()
        `is`[0] = (i_40_.toFloat() * this.aFloat5669 + (this.aFloat5673 * i_39_.toFloat() + i.toFloat() * this.aFloat5672) + this.aFloat5686).toInt()
        `is`[2] = (this.aFloat5681 + (this.aFloat5680 * i_39_.toFloat() + i.toFloat() * this.aFloat5662 + i_40_.toFloat() * this.aFloat5664)).toInt()
    }

    companion object {
        @JvmField
        var anInt5656: Int = 0
        @JvmField
        var anInt5657: Int = 0
        @JvmField
        var anInt5658: Int = 0
        @JvmField
        var anInt5659: Int = 0
        @JvmField
        var anInt5660: Int = 0
        @JvmField
        var anInt5661: Int = 0
        var aLong5663: Long = 0
        @JvmField
        var anInt5665: Int = 0
        @JvmField
        var anInt5667: Int = 0
        @JvmField
        var anInt5668: Int = 0
        @JvmField
        var anInt5670: Int = 0
        @JvmField
        var anInt5671: Int = 0
        @JvmField
        var anInt5674: Int = 0
        var aClass246_5675: Class246? = Class284.method2118(((-42).toByte()).toByte())
        @JvmField
        var anInt5676: Int = 0
        @JvmField
        var aClass351_5677: Class351? = Class351(56, 7)
        @JvmField
        var anInt5679: Int = 0
        @JvmField
        var anInt5682: Int = 0
        @JvmField
        var anInt5683: Int = 0
        @JvmField
        var aD5684: d? = null
        @JvmField
        var anInt5687: Int = 0
        @JvmField
        var anInt5688: Int = 0
        @JvmField
        var aClass223_5689: Class223? = Class223(4, 1)

        @JvmStatic
        fun method911(i: Int) {
            if (i != 0) method911(-121)
            aClass223_5689 = null
            aD5684 = null
            aClass246_5675 = null
            aClass351_5677 = null
        }

        @JvmStatic
        fun method912(i: Int): Int {
            if (i != 0) return -41
            anInt5657++
            return Class108.anInt1663
        }

        @JvmStatic
        fun method913(i: Byte): Boolean {
            if (i <= 115) return true
            anInt5679++
            return Class73.anInt4776 > 0
        }
    }
}
