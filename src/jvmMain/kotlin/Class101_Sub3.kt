import Class369_Sub1.Companion.method3570

/* Class101_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class101_Sub3 : Class101() {
    var aFloat5747: Float = 0f
    var aFloat5750: Float = 0f
    @JvmField
    var aFloat5751: Float = 0f
    @JvmField
    var aFloat5754: Float = 0f
    @JvmField
    var aFloat5756: Float = 0f
    var aFloat5761: Float = 0f
    var aFloat5762: Float = 0f
    var aFloat5769: Float = 0f
    var aFloat5770: Float = 0f
    var aFloat5772: Float = 0f
    var aFloat5781: Float = 0f
    @JvmField
    var aFloat5784: Float = 0f
    override fun method902(i: Int) {
        anInt5779++
        this.aFloat5784 = 1.0f
        this.aFloat5769 = Class348_Sub23.aFloatArray6867!![0x3fff and i]
        this.aFloat5770 = this.aFloat5769
        this.aFloat5761 = Class348_Sub23.aFloatArray6865!![0x3fff and i]
        this.aFloat5751 = 0.0f
        this.aFloat5754 = this.aFloat5751
        this.aFloat5756 = this.aFloat5754
        this.aFloat5772 = this.aFloat5756
        this.aFloat5762 = this.aFloat5772
        this.aFloat5747 = this.aFloat5762
        this.aFloat5781 = this.aFloat5747
        this.aFloat5750 = -this.aFloat5761
    }

    fun method937(bool: Boolean, f: Float, f_0_: Float, f_1_: Float, f_2_: Float, fs: FloatArray) {
        anInt5765++
        val f_3_: Float
        val f_4_: Float
        val f_5_: Float
        if (f > 0.00390625f || f < -0.00390625f) {
            val f_6_ = -f_2_ / f
            f_4_ = (f_6_ * this.aFloat5770 + this.aFloat5747)
            f_5_ = (this.aFloat5751 + this.aFloat5756 * f_6_)
            f_3_ = (this.aFloat5772 + f_6_ * this.aFloat5761)
        } else if (f_1_ <= 0.00390625f && f_1_ >= -0.00390625f) {
            val f_8_ = -f_2_ / f_0_
            f_4_ = (f_8_ * this.aFloat5781 + this.aFloat5747)
            f_3_ = (this.aFloat5762 * f_8_ + this.aFloat5772)
            f_5_ = (this.aFloat5751 + f_8_ * this.aFloat5784)
        } else {
            val f_7_ = -f_2_ / f_1_
            f_3_ = (this.aFloat5769 * f_7_ + this.aFloat5772)
            f_4_ = (this.aFloat5750 * f_7_ + this.aFloat5747)
            f_5_ = (this.aFloat5754 * f_7_ + this.aFloat5751)
        }
        fs[0] = (f_0_ * this.aFloat5781 + (f * this.aFloat5770 + f_1_ * this.aFloat5750))
        fs[2] = (f_0_ * this.aFloat5784 + (this.aFloat5756 * f + this.aFloat5754 * f_1_))
        if (bool != true) this.aFloat5772 = -0.4364811f
        fs[1] = (this.aFloat5769 * f_1_ + this.aFloat5761 * f + this.aFloat5762 * f_0_)
        fs[3] = -(fs[0] * f_4_ + f_3_ * fs[1] + f_5_ * fs[2])
    }

    override fun method891(i: Int, i_9_: Int, i_10_: Int) {
        this.aFloat5751 += i_10_.toFloat()
        this.aFloat5772 += i_9_.toFloat()
        this.aFloat5747 += i.toFloat()
        anInt5785++
    }

    override fun method900(i: Int) {
        anInt5763++
        val f = Class348_Sub23.aFloatArray6867!![0x3fff and i]
        val f_11_ = Class348_Sub23.aFloatArray6865!![0x3fff and i]
        val f_12_ = this.aFloat5761
        val f_13_ = this.aFloat5769
        val f_14_ = this.aFloat5762
        this.aFloat5761 = f * f_12_ - this.aFloat5756 * f_11_
        val f_15_ = this.aFloat5772
        this.aFloat5756 = this.aFloat5756 * f + f_11_ * f_12_
        this.aFloat5769 = -(f_11_ * this.aFloat5754) + f_13_ * f
        this.aFloat5762 = f * f_14_ - this.aFloat5784 * f_11_
        this.aFloat5754 = f_13_ * f_11_ + f * this.aFloat5754
        this.aFloat5784 = f_14_ * f_11_ + f * this.aFloat5784
        this.aFloat5772 = -(f_11_ * this.aFloat5751) + f * f_15_
        this.aFloat5751 = f * this.aFloat5751 + f_15_ * f_11_
    }

    fun method939(f: Float, i: Int, f_16_: Float, i_17_: Int, i_18_: Int, i_19_: Int, f_20_: Float) {
        if (i_18_ == 0) {
            this.aFloat5762 = 0.0f
            this.aFloat5781 = this.aFloat5762
            this.aFloat5754 = this.aFloat5781
            this.aFloat5750 = this.aFloat5754
            this.aFloat5756 = this.aFloat5750
            this.aFloat5761 = this.aFloat5756
            this.aFloat5770 = i.toFloat()
            this.aFloat5784 = 1.0f
            this.aFloat5769 = i_17_.toFloat()
        } else {
            val f_21_ = Class348_Sub23.aFloatArray6867!![0x3fff and i_18_]
            val f_22_ = Class348_Sub23.aFloatArray6865!![i_18_ and 0x3fff]
            this.aFloat5761 = i.toFloat() * f_22_
            this.aFloat5769 = i_17_.toFloat() * f_21_
            this.aFloat5762 = 0.0f
            this.aFloat5781 = this.aFloat5762
            this.aFloat5754 = this.aFloat5781
            this.aFloat5756 = this.aFloat5754
            this.aFloat5784 = 1.0f
            this.aFloat5750 = -f_22_ * i_17_.toFloat()
            this.aFloat5770 = i.toFloat() * f_21_
        }
        anInt5746++
        this.aFloat5747 = f_16_
        this.aFloat5772 = f_20_
        this.aFloat5751 = f
        val i_23_ = -88 / ((i_19_ - 6) / 39)
    }

    override fun method897(i: Int, i_24_: Int, i_25_: Int, `is`: IntArray) {
        anInt5767++
        `is`[0] = (i_25_.toFloat() * this.aFloat5781 + (i.toFloat() * this.aFloat5770 + i_24_.toFloat() * this.aFloat5750) + this.aFloat5747).toInt()
        `is`[2] = (i_24_.toFloat() * this.aFloat5754 + this.aFloat5756 * i.toFloat() + this.aFloat5784 * i_25_.toFloat() + this.aFloat5751).toInt()
        `is`[1] = (this.aFloat5772 + (i_25_.toFloat() * this.aFloat5762 + (i.toFloat() * this.aFloat5761 + (i_24_.toFloat() * this.aFloat5769)))).toInt()
    }

    override fun method894(i: Int, i_26_: Int, i_27_: Int) {
        this.aFloat5751 = i_27_.toFloat()
        this.aFloat5747 = i.toFloat()
        this.aFloat5762 = 0.0f
        this.aFloat5781 = this.aFloat5762
        this.aFloat5754 = this.aFloat5781
        this.aFloat5750 = this.aFloat5754
        this.aFloat5756 = this.aFloat5750
        this.aFloat5761 = this.aFloat5756
        this.aFloat5772 = i_26_.toFloat()
        this.aFloat5784 = 1.0f
        this.aFloat5769 = this.aFloat5784
        this.aFloat5770 = this.aFloat5769
        anInt5749++
    }

    override fun method890(`is`: IntArray) {
        anInt5775++
        val f = `is`[0].toFloat() - this.aFloat5747
        val f_28_ = -this.aFloat5772 + `is`[1].toFloat()
        val f_29_ = -this.aFloat5751 + `is`[2].toFloat()
        `is`[1] = (this.aFloat5769 * f_28_ + f * this.aFloat5750 + this.aFloat5754 * f_29_).toInt()
        `is`[2] = (this.aFloat5784 * f_29_ + (f_28_ * this.aFloat5762 + this.aFloat5781 * f)).toInt()
        `is`[0] = (this.aFloat5770 * f + this.aFloat5761 * f_28_ + f_29_ * this.aFloat5756).toInt()
    }

    override fun method903(i: Int, i_30_: Int, i_31_: Int, i_32_: Int, i_33_: Int, i_34_: Int) {
        anInt5782++
        val f = Class348_Sub23.aFloatArray6867!![i_32_ and 0x3fff]
        val f_35_ = Class348_Sub23.aFloatArray6865!![i_32_ and 0x3fff]
        val f_36_ = Class348_Sub23.aFloatArray6867!![0x3fff and i_33_]
        val f_37_ = Class348_Sub23.aFloatArray6865!![0x3fff and i_33_]
        val f_38_ = Class348_Sub23.aFloatArray6867!![0x3fff and i_34_]
        val f_39_ = Class348_Sub23.aFloatArray6865!![0x3fff and i_34_]
        val f_40_ = f_35_ * f_38_
        val f_41_ = f_39_ * f_35_
        this.aFloat5762 = f_40_ * f_36_ + f_37_ * f_39_
        this.aFloat5756 = f * f_37_
        this.aFloat5770 = f_37_ * f_41_ + f_36_ * f_38_
        this.aFloat5769 = f_38_ * f
        this.aFloat5754 = -f_35_
        this.aFloat5750 = f_39_ * f
        this.aFloat5784 = f * f_36_
        this.aFloat5781 = f_38_ * -f_37_ + f_36_ * f_41_
        this.aFloat5761 = f_40_ * f_37_ + -f_36_ * f_39_
        this.aFloat5751 = (this.aFloat5756 * -i.toFloat() - this.aFloat5754 * i_30_.toFloat() - i_31_.toFloat() * this.aFloat5784)
        this.aFloat5747 = (-(this.aFloat5750 * i_30_.toFloat()) + this.aFloat5770 * -i.toFloat() - this.aFloat5781 * i_31_.toFloat())
        this.aFloat5772 = (-(i_31_.toFloat() * this.aFloat5762) + (this.aFloat5761 * -i.toFloat() - this.aFloat5769 * i_30_.toFloat()))
    }

    override fun method908(i: Int) {
        anInt5774++
        val f = Class348_Sub23.aFloatArray6867!![i and 0x3fff]
        val f_42_ = Class348_Sub23.aFloatArray6865!![i and 0x3fff]
        val f_43_ = this.aFloat5770
        val f_44_ = this.aFloat5750
        val f_45_ = this.aFloat5781
        this.aFloat5770 = f * f_43_ - this.aFloat5761 * f_42_
        val f_46_ = this.aFloat5747
        this.aFloat5761 = this.aFloat5761 * f + f_43_ * f_42_
        this.aFloat5750 = -(this.aFloat5769 * f_42_) + f_44_ * f
        this.aFloat5781 = -(f_42_ * this.aFloat5762) + f_45_ * f
        this.aFloat5769 = f * this.aFloat5769 + f_42_ * f_44_
        this.aFloat5762 = this.aFloat5762 * f + f_45_ * f_42_
        this.aFloat5747 = -(f_42_ * this.aFloat5772) + f * f_46_
        this.aFloat5772 = this.aFloat5772 * f + f_42_ * f_46_
    }

    fun method940(i: Int): FloatArray {
        Class288_Sub1.aFloatArray8575!![0] = this.aFloat5770
        Class288_Sub1.aFloatArray8575!![9] = this.aFloat5762
        Class288_Sub1.aFloatArray8575!![12] = this.aFloat5747
        anInt5777++
        Class288_Sub1.aFloatArray8575!![i] = this.aFloat5761
        Class288_Sub1.aFloatArray8575!![6] = this.aFloat5754
        Class288_Sub1.aFloatArray8575!![4] = this.aFloat5750
        Class288_Sub1.aFloatArray8575!![10] = this.aFloat5784
        Class288_Sub1.aFloatArray8575!![8] = this.aFloat5781
        Class288_Sub1.aFloatArray8575!![14] = this.aFloat5751
        Class288_Sub1.aFloatArray8575!![13] = this.aFloat5772
        Class288_Sub1.aFloatArray8575!![2] = this.aFloat5756
        Class288_Sub1.aFloatArray8575!![5] = this.aFloat5769
        return Class288_Sub1.aFloatArray8575!!
    }

    override fun method907(): Class101 {
        anInt5748++
        val class101_sub3_47_ = Class101_Sub3()
        class101_sub3_47_.aFloat5747 = this.aFloat5747
        class101_sub3_47_.aFloat5750 = this.aFloat5750
        class101_sub3_47_.aFloat5769 = this.aFloat5769
        class101_sub3_47_.aFloat5784 = this.aFloat5784
        class101_sub3_47_.aFloat5772 = this.aFloat5772
        class101_sub3_47_.aFloat5762 = this.aFloat5762
        class101_sub3_47_.aFloat5781 = this.aFloat5781
        class101_sub3_47_.aFloat5770 = this.aFloat5770
        class101_sub3_47_.aFloat5756 = this.aFloat5756
        class101_sub3_47_.aFloat5761 = this.aFloat5761
        class101_sub3_47_.aFloat5751 = this.aFloat5751
        class101_sub3_47_.aFloat5754 = this.aFloat5754
        return class101_sub3_47_
    }

    fun method942(i: Int) {
        this.aFloat5754 = -this.aFloat5754
        anInt5760++
        this.aFloat5761 = -this.aFloat5761
        if (i == 3128) {
            this.aFloat5769 = -this.aFloat5769
            this.aFloat5756 = -this.aFloat5756
            this.aFloat5784 = -this.aFloat5784
            this.aFloat5762 = -this.aFloat5762
            this.aFloat5772 = -this.aFloat5772
            this.aFloat5751 = -this.aFloat5751
        }
    }

    override fun method892(i: Int, i_49_: Int, i_50_: Int, `is`: IntArray) {
        var i = i
        var i_49_ = i_49_
        var i_50_ = i_50_
        i_49_ = (i_49_ - this.aFloat5772).toInt()
        anInt5773++
        i_50_ = (i_50_ - this.aFloat5751).toInt()
        i = (i - this.aFloat5747).toInt()
        `is`[0] = (this.aFloat5756 * i_50_.toFloat() + (i.toFloat() * this.aFloat5770 + i_49_.toFloat() * this.aFloat5761)).toInt()
        `is`[2] = (this.aFloat5781 * i.toFloat() + i_49_.toFloat() * this.aFloat5762 + this.aFloat5784 * i_50_.toFloat()).toInt()
        `is`[1] = (i_50_.toFloat() * this.aFloat5754 + (this.aFloat5750 * i.toFloat() + i_49_.toFloat() * this.aFloat5769)).toInt()
    }

    override fun method898(class101: Class101?) {
        anInt5758++
        val class101_sub3_51_ = class101 as Class101_Sub3?
        this.aFloat5751 = class101_sub3_51_!!.aFloat5751
        this.aFloat5769 = class101_sub3_51_.aFloat5769
        this.aFloat5770 = class101_sub3_51_.aFloat5770
        this.aFloat5781 = class101_sub3_51_.aFloat5781
        this.aFloat5747 = class101_sub3_51_.aFloat5747
        this.aFloat5754 = class101_sub3_51_.aFloat5754
        this.aFloat5761 = class101_sub3_51_.aFloat5761
        this.aFloat5772 = class101_sub3_51_.aFloat5772
        this.aFloat5784 = class101_sub3_51_.aFloat5784
        this.aFloat5762 = class101_sub3_51_.aFloat5762
        this.aFloat5756 = class101_sub3_51_.aFloat5756
        this.aFloat5750 = class101_sub3_51_.aFloat5750
    }

    override fun method895(i: Int) {
        anInt5780++
        this.aFloat5769 = 1.0f
        this.aFloat5784 = Class348_Sub23.aFloatArray6867!![0x3fff and i]
        this.aFloat5770 = this.aFloat5784
        this.aFloat5781 = Class348_Sub23.aFloatArray6865!![0x3fff and i]
        this.aFloat5756 = -this.aFloat5781
        this.aFloat5751 = 0.0f
        this.aFloat5754 = this.aFloat5751
        this.aFloat5772 = this.aFloat5754
        this.aFloat5762 = this.aFloat5772
        this.aFloat5761 = this.aFloat5762
        this.aFloat5747 = this.aFloat5761
        this.aFloat5750 = this.aFloat5747
    }

    override fun method899(i: Int) {
        anInt5757++
        this.aFloat5770 = 1.0f
        this.aFloat5784 = Class348_Sub23.aFloatArray6867!![0x3fff and i]
        this.aFloat5769 = this.aFloat5784
        this.aFloat5754 = Class348_Sub23.aFloatArray6865!![0x3fff and i]
        this.aFloat5762 = -this.aFloat5754
        this.aFloat5751 = 0.0f
        this.aFloat5756 = this.aFloat5751
        this.aFloat5772 = this.aFloat5756
        this.aFloat5761 = this.aFloat5772
        this.aFloat5747 = this.aFloat5761
        this.aFloat5781 = this.aFloat5747
        this.aFloat5750 = this.aFloat5781
    }

    override fun method910() {
        anInt5759++
        this.aFloat5784 = 1.0f
        this.aFloat5769 = this.aFloat5784
        this.aFloat5770 = this.aFloat5769
        this.aFloat5751 = 0.0f
        this.aFloat5772 = this.aFloat5751
        this.aFloat5747 = this.aFloat5772
        this.aFloat5762 = this.aFloat5747
        this.aFloat5781 = this.aFloat5762
        this.aFloat5754 = this.aFloat5781
        this.aFloat5750 = this.aFloat5754
        this.aFloat5756 = this.aFloat5750
        this.aFloat5761 = this.aFloat5756
    }

    override fun method896(i: Int) {
        anInt5766++
        val f = Class348_Sub23.aFloatArray6867!![i and 0x3fff]
        val f_62_ = Class348_Sub23.aFloatArray6865!![i and 0x3fff]
        val f_63_ = this.aFloat5770
        val f_64_ = this.aFloat5750
        val f_65_ = this.aFloat5781
        this.aFloat5770 = f_63_ * f + this.aFloat5756 * f_62_
        val f_66_ = this.aFloat5747
        this.aFloat5756 = f * this.aFloat5756 - f_62_ * f_63_
        this.aFloat5750 = f * f_64_ + f_62_ * this.aFloat5754
        this.aFloat5754 = -(f_64_ * f_62_) + this.aFloat5754 * f
        this.aFloat5781 = f * f_65_ + this.aFloat5784 * f_62_
        this.aFloat5784 = -(f_65_ * f_62_) + f * this.aFloat5784
        this.aFloat5747 = this.aFloat5751 * f_62_ + f * f_66_
        this.aFloat5751 = this.aFloat5751 * f - f_62_ * f_66_
    }

    fun method945(bool: Boolean): FloatArray {
        if (bool != true) this.aFloat5756 = 0.66213727f
        Class288_Sub1.aFloatArray8575!![14] = 0.0f
        Class288_Sub1.aFloatArray8575!![0] = this.aFloat5770
        Class288_Sub1.aFloatArray8575!![13] = 0.0f
        Class288_Sub1.aFloatArray8575!![1] = this.aFloat5761
        Class288_Sub1.aFloatArray8575!![12] = 0.0f
        Class288_Sub1.aFloatArray8575!![10] = this.aFloat5784
        Class288_Sub1.aFloatArray8575!![5] = this.aFloat5769
        Class288_Sub1.aFloatArray8575!![6] = this.aFloat5754
        Class288_Sub1.aFloatArray8575!![9] = this.aFloat5762
        anInt5778++
        Class288_Sub1.aFloatArray8575!![2] = this.aFloat5756
        Class288_Sub1.aFloatArray8575!![4] = this.aFloat5750
        Class288_Sub1.aFloatArray8575!![8] = this.aFloat5781
        return Class288_Sub1.aFloatArray8575!!
    }

    fun method946(class101: Class101, i: Int) {
        anInt5771++
        val class101_sub3_67_ = class101 as Class101_Sub3
        this.aFloat5781 = class101_sub3_67_.aFloat5756
        if (i != -7929) method899(52)
        this.aFloat5750 = class101_sub3_67_.aFloat5761
        this.aFloat5770 = class101_sub3_67_.aFloat5770
        this.aFloat5756 = class101_sub3_67_.aFloat5781
        this.aFloat5762 = class101_sub3_67_.aFloat5754
        this.aFloat5761 = class101_sub3_67_.aFloat5750
        this.aFloat5769 = class101_sub3_67_.aFloat5769
        this.aFloat5747 = -((class101_sub3_67_.aFloat5772 * this.aFloat5750) + (class101_sub3_67_.aFloat5747 * this.aFloat5770) + (class101_sub3_67_.aFloat5751 * this.aFloat5781))
        this.aFloat5754 = class101_sub3_67_.aFloat5762
        this.aFloat5784 = class101_sub3_67_.aFloat5784
        this.aFloat5772 = -((class101_sub3_67_.aFloat5772 * this.aFloat5769) + (class101_sub3_67_.aFloat5747 * this.aFloat5761) + (class101_sub3_67_.aFloat5751 * this.aFloat5762))
        this.aFloat5751 = -((this.aFloat5756 * class101_sub3_67_.aFloat5747) + (this.aFloat5754 * class101_sub3_67_.aFloat5772) + (class101_sub3_67_.aFloat5751 * this.aFloat5784))
    }

    init {
        method910()
    }

    override fun method905(i: Int, i_68_: Int, i_69_: Int, `is`: IntArray) {
        anInt5753++
        `is`[1] = (i_69_.toFloat() * this.aFloat5762 + (i_68_.toFloat() * this.aFloat5769 + this.aFloat5761 * i.toFloat())).toInt()
        `is`[2] = (this.aFloat5754 * i_68_.toFloat() + this.aFloat5756 * i.toFloat() + i_69_.toFloat() * this.aFloat5784).toInt()
        `is`[0] = (this.aFloat5750 * i_68_.toFloat() + this.aFloat5770 * i.toFloat() + this.aFloat5781 * i_69_.toFloat()).toInt()
    }

    companion object {
        @JvmField
        var anInt5746: Int = 0
        @JvmField
        var anInt5748: Int = 0
        @JvmField
        var anInt5749: Int = 0
        @JvmField
        var anInt5752: Int = 0
        @JvmField
        var anInt5753: Int = 0
        @JvmField
        var anInt5755: Int = 0
        @JvmField
        var anInt5757: Int = 0
        @JvmField
        var anInt5758: Int = 0
        @JvmField
        var anInt5759: Int = 0
        @JvmField
        var anInt5760: Int = 0
        @JvmField
        var anInt5763: Int = 0
        @JvmField
        var aClass326_5764: Class326? = null
        @JvmField
        var anInt5765: Int = 0
        @JvmField
        var anInt5766: Int = 0
        @JvmField
        var anInt5767: Int = 0
        @JvmField
        var anInt5768: Int = 0
        @JvmField
        var anInt5771: Int = 0
        @JvmField
        var anInt5773: Int = 0
        @JvmField
        var anInt5774: Int = 0
        @JvmField
        var anInt5775: Int = 0
        @JvmField
        var anInt5776: Int = 0
        @JvmField
        var anInt5777: Int = 0
        @JvmField
        var anInt5778: Int = 0
        @JvmField
        var anInt5779: Int = 0
        @JvmField
        var anInt5780: Int = 0
        @JvmField
        var anInt5782: Int = 0
        @JvmField
        var anInt5783: Int = 0
        @JvmField
        var anInt5785: Int = 0

        @JvmStatic
        fun method938(i: Int) {
            aClass326_5764 = null
            if (i <= 8) aClass326_5764 = null
        }

        fun method941(i: Int, i_48_: Int) {
            Class77.anInt1290 = i_48_
            anInt5755++
            if (i <= 113) aClass326_5764 = null
        }

        @JvmStatic
        fun method943(bool: Boolean): Class348_Sub16_Sub3? {
            anInt5776++
            if (bool != false) method943(true)
            return Class98.aClass348_Sub16_Sub3_1564
        }

        fun method944(i: Int, `is`: Array<ByteArray?>?, class237_sub1: Class237_Sub1?) {
            try {
                if (i != -8212) method944(65, null, null)
                anInt5752++
                for (i_52_ in 0..<class237_sub1!!.anInt3130) {
                    method3570(false)
                    var i_53_ = 0
                    while ((i_53_ < Class367_Sub4.anInt7319 shr 3)) {
                        var i_54_ = 0
                        while ((Class348_Sub40_Sub3.anInt9109 shr 3 > i_54_)) {
                            val i_55_ = (Class62.anIntArrayArrayArray1116!![i_52_]!![i_53_]!![i_54_])
                            if (i_55_ != -1) {
                                val i_56_ = 0x3 and (i_55_ shr 24)
                                if (!class237_sub1.aBoolean3109 || i_56_ == 0) {
                                    val i_57_ = (0x6 and i_55_) shr 1
                                    val i_58_ = i_55_ shr 14 and 0x3ff
                                    val i_59_ = (0x3ff9 and i_55_) shr 3
                                    val i_60_ = i_59_ / 8 + (i_58_ / 8 shl 8)
                                    for (i_61_ in Class348_Sub23_Sub3.anIntArray9042!!.indices) {
                                        if (i_60_ == (Class348_Sub23_Sub3.anIntArray9042!![i_61_]) && `is`!![i_61_] != null) {
                                            class237_sub1.method1692((i_58_ and 0x7) * 8, i_57_, `is`[i_61_], i_56_, (i_59_ and 0x7) * 8, Class348_Sub8.aHa6654, 8 * i_54_, 8 * i_53_, i + 8219, Class348_Sub45.aClass361Array7108, i_52_)
                                            break
                                        }
                                    }
                                }
                            }
                            i_54_++
                        }
                        i_53_++
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("iaa.W(" + i + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (class237_sub1 != null) "{...}" else "null") + ')'))
            }
        }

        fun method947(i: Byte) {
            anInt5783++
            if (i.toInt() != 41) anInt5768 = 38
            run {
                var class348_sub9 = Class218.aClass262_2859!!.method1995(4) as? Class348_Sub9
                while (class348_sub9 != null) {
                    if (class348_sub9!!.aBoolean6684) class348_sub9!!.method2781(21.toByte())
                    class348_sub9 = Class218.aClass262_2859!!.method1990(117.toByte()) as? Class348_Sub9
                }
            }
            var class348_sub9 = Client.aClass262_5185!!.method1995(4) as? Class348_Sub9
            while (class348_sub9 != null) {
                if (class348_sub9!!.aBoolean6684) class348_sub9!!.method2781(21.toByte())
                class348_sub9 = (Client.aClass262_5185!!.method1990(39.toByte()) as? Class348_Sub9)
            }
        }
    }
}
