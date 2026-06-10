/* Class101_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class101_Sub2 : Class101() {
    @JvmField
    var aFloat5691: Float = 0f
    @JvmField
    var aFloat5700: Float = 0f
    @JvmField
    var aFloat5704: Float = 0f
    @JvmField
    var aFloat5708: Float = 0f
    var aFloat5710: Float = 0f
    @JvmField
    var aFloat5711: Float = 0f
    @JvmField
    var aFloat5716: Float = 0f
    @JvmField
    var aFloat5722: Float = 0f
    @JvmField
    var aFloat5724: Float = 0f
    var aFloat5729: Float = 0f
    @JvmField
    var aFloat5732: Float = 0f
    @JvmField
    var aFloat5736: Float = 0f
    override fun method902(i: Int) {
        this.aFloat5716 = 1.0f
        anInt5712++
        this.aFloat5722 = Class239_Sub4.aFloatArray5876!![0x3fff and i]
        this.aFloat5711 = this.aFloat5722
        this.aFloat5708 = Class239_Sub4.aFloatArray5874!![i and 0x3fff]
        this.aFloat5700 = -this.aFloat5708
        this.aFloat5724 = 0.0f
        this.aFloat5691 = this.aFloat5724
        this.aFloat5736 = this.aFloat5691
        this.aFloat5710 = this.aFloat5736
        this.aFloat5732 = this.aFloat5710
        this.aFloat5729 = this.aFloat5732
        this.aFloat5704 = this.aFloat5729
    }

    fun method914(f: Float, f_0_: Float, i: Int, f_1_: Float) {
        if (i == 0) {
            this.aFloat5724 *= f_0_
            this.aFloat5729 *= f_1_
            this.aFloat5732 *= f
            this.aFloat5708 *= f
            this.aFloat5704 *= f_1_
            this.aFloat5722 *= f
            this.aFloat5710 *= f
            this.aFloat5716 *= f_0_
            this.aFloat5736 *= f_0_
            anInt5728++
            this.aFloat5711 *= f_1_
            this.aFloat5691 *= f_0_
            this.aFloat5700 *= f_1_
        }
    }

    override fun method894(i: Int, i_2_: Int, i_3_: Int) {
        this.aFloat5724 = i_3_.toFloat()
        this.aFloat5716 = 1.0f
        this.aFloat5722 = this.aFloat5716
        this.aFloat5711 = this.aFloat5722
        this.aFloat5710 = i_2_.toFloat()
        this.aFloat5729 = i.toFloat()
        anInt5706++
        this.aFloat5732 = 0.0f
        this.aFloat5704 = this.aFloat5732
        this.aFloat5691 = this.aFloat5704
        this.aFloat5700 = this.aFloat5691
        this.aFloat5736 = this.aFloat5700
        this.aFloat5708 = this.aFloat5736
    }

    override fun method910() {
        this.aFloat5716 = 1.0f
        this.aFloat5722 = this.aFloat5716
        this.aFloat5711 = this.aFloat5722
        this.aFloat5724 = 0.0f
        this.aFloat5710 = this.aFloat5724
        this.aFloat5729 = this.aFloat5710
        this.aFloat5732 = this.aFloat5729
        this.aFloat5704 = this.aFloat5732
        this.aFloat5691 = this.aFloat5704
        this.aFloat5700 = this.aFloat5691
        this.aFloat5736 = this.aFloat5700
        this.aFloat5708 = this.aFloat5736
        anInt5696++
    }

    fun method915(fs: FloatArray, i: Int): FloatArray {
        fs[7] = this.aFloat5710
        anInt5726++
        fs[5] = this.aFloat5722
        fs[4] = this.aFloat5708
        fs[6] = this.aFloat5732
        fs[i] = this.aFloat5700
        fs[2] = this.aFloat5704
        fs[3] = this.aFloat5729
        fs[0] = this.aFloat5711
        return fs
    }

    override fun method903(i: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) {
        anInt5733++
        val f = Class239_Sub4.aFloatArray5876!![i_6_ and 0x3fff]
        val f_9_ = Class239_Sub4.aFloatArray5874!![i_6_ and 0x3fff]
        val f_10_ = Class239_Sub4.aFloatArray5876!![0x3fff and i_7_]
        val f_11_ = Class239_Sub4.aFloatArray5874!![0x3fff and i_7_]
        val f_12_ = Class239_Sub4.aFloatArray5876!![0x3fff and i_8_]
        val f_13_ = Class239_Sub4.aFloatArray5874!![i_8_ and 0x3fff]
        val f_14_ = f_12_ * f_9_
        val f_15_ = f_9_ * f_13_
        this.aFloat5700 = f_13_ * f
        this.aFloat5704 = -f_11_ * f_12_ + f_10_ * f_15_
        this.aFloat5716 = f * f_10_
        this.aFloat5732 = f_13_ * f_11_ + f_14_ * f_10_
        this.aFloat5711 = f_10_ * f_12_ + f_15_ * f_11_
        this.aFloat5736 = f * f_11_
        this.aFloat5722 = f_12_ * f
        this.aFloat5691 = -f_9_
        this.aFloat5708 = f_11_ * f_14_ + f_13_ * -f_10_
        this.aFloat5729 = (-(this.aFloat5704 * i_5_.toFloat()) + (-(i_4_.toFloat() * this.aFloat5700) + this.aFloat5711 * -i.toFloat()))
        this.aFloat5710 = (-i.toFloat() * this.aFloat5708 - this.aFloat5722 * i_4_.toFloat() - i_5_.toFloat() * this.aFloat5732)
        this.aFloat5724 = (-(this.aFloat5716 * i_5_.toFloat()) + (this.aFloat5736 * -i.toFloat() - this.aFloat5691 * i_4_.toFloat()))
    }

    override fun method895(i: Int) {
        this.aFloat5722 = 1.0f
        anInt5738++
        this.aFloat5716 = Class239_Sub4.aFloatArray5876!![0x3fff and i]
        this.aFloat5711 = this.aFloat5716
        this.aFloat5704 = Class239_Sub4.aFloatArray5874!![i and 0x3fff]
        this.aFloat5736 = -this.aFloat5704
        this.aFloat5724 = 0.0f
        this.aFloat5691 = this.aFloat5724
        this.aFloat5710 = this.aFloat5691
        this.aFloat5732 = this.aFloat5710
        this.aFloat5708 = this.aFloat5732
        this.aFloat5729 = this.aFloat5708
        this.aFloat5700 = this.aFloat5729
    }

    override fun method899(i: Int) {
        this.aFloat5711 = 1.0f
        anInt5721++
        this.aFloat5716 = Class239_Sub4.aFloatArray5876!![0x3fff and i]
        this.aFloat5722 = this.aFloat5716
        this.aFloat5691 = Class239_Sub4.aFloatArray5874!![0x3fff and i]
        this.aFloat5724 = 0.0f
        this.aFloat5736 = this.aFloat5724
        this.aFloat5710 = this.aFloat5736
        this.aFloat5708 = this.aFloat5710
        this.aFloat5729 = this.aFloat5708
        this.aFloat5704 = this.aFloat5729
        this.aFloat5700 = this.aFloat5704
        this.aFloat5732 = -this.aFloat5691
    }

    override fun method892(i: Int, i_16_: Int, i_17_: Int, `is`: IntArray) {
        var i = i
        var i_16_ = i_16_
        var i_17_ = i_17_
        anInt5694++
        i_17_ = (i_17_ - this.aFloat5724).toInt()
        i = (i - this.aFloat5729).toInt()
        i_16_ = (i_16_ - this.aFloat5710).toInt()
        `is`[2] = (i_17_.toFloat() * this.aFloat5716 + (i_16_.toFloat() * this.aFloat5732 + i.toFloat() * this.aFloat5704)).toInt()
        `is`[0] = (i.toFloat() * this.aFloat5711 + i_16_.toFloat() * this.aFloat5708 + this.aFloat5736 * i_17_.toFloat()).toInt()
        `is`[1] = (this.aFloat5700 * i.toFloat() + this.aFloat5722 * i_16_.toFloat() + this.aFloat5691 * i_17_.toFloat()).toInt()
    }

    fun method916(f: Float, bool: Boolean, f_18_: Float, f_19_: Float) {
        this.aFloat5710 = f
        this.aFloat5724 = f_18_
        this.aFloat5716 = 1.0f
        this.aFloat5722 = this.aFloat5716
        this.aFloat5711 = this.aFloat5722
        if (bool == true) {
            this.aFloat5729 = f_19_
            this.aFloat5732 = 0.0f
            this.aFloat5704 = this.aFloat5732
            this.aFloat5691 = this.aFloat5704
            this.aFloat5700 = this.aFloat5691
            this.aFloat5736 = this.aFloat5700
            this.aFloat5708 = this.aFloat5736
            anInt5735++
        }
    }

    override fun method891(i: Int, i_20_: Int, i_21_: Int) {
        this.aFloat5729 += i.toFloat()
        this.aFloat5710 += i_20_.toFloat()
        anInt5707++
        this.aFloat5724 += i_21_.toFloat()
    }

    fun method917(class101: Class101, i: Byte) {
        anInt5698++
        val class101_sub2_22_ = class101 as Class101_Sub2
        val f = this.aFloat5711
        val f_23_ = this.aFloat5708
        val f_24_ = this.aFloat5700
        val f_25_ = this.aFloat5722
        val f_26_ = this.aFloat5704
        val f_27_ = this.aFloat5732
        if (i <= 104) this.aFloat5732 = -0.557632f
        val f_28_ = this.aFloat5729
        this.aFloat5708 = (f * class101_sub2_22_.aFloat5708 + class101_sub2_22_.aFloat5722 * f_23_ + (this.aFloat5736 * class101_sub2_22_.aFloat5732))
        this.aFloat5711 = ((class101_sub2_22_.aFloat5704 * this.aFloat5736) + (class101_sub2_22_.aFloat5711 * f + f_23_ * class101_sub2_22_.aFloat5700))
        val f_29_ = this.aFloat5710
        this.aFloat5722 = ((class101_sub2_22_.aFloat5732 * this.aFloat5691) + (f_24_ * class101_sub2_22_.aFloat5708 + class101_sub2_22_.aFloat5722 * f_25_))
        this.aFloat5700 = ((this.aFloat5691 * class101_sub2_22_.aFloat5704) + (class101_sub2_22_.aFloat5711 * f_24_ + f_25_ * class101_sub2_22_.aFloat5700))
        this.aFloat5736 = (f_23_ * class101_sub2_22_.aFloat5691 + class101_sub2_22_.aFloat5736 * f + (this.aFloat5736 * class101_sub2_22_.aFloat5716))
        this.aFloat5691 = ((this.aFloat5691 * class101_sub2_22_.aFloat5716) + (f_25_ * class101_sub2_22_.aFloat5691 + class101_sub2_22_.aFloat5736 * f_24_))
        this.aFloat5732 = (class101_sub2_22_.aFloat5722 * f_27_ + class101_sub2_22_.aFloat5708 * f_26_ + (this.aFloat5716 * class101_sub2_22_.aFloat5732))
        this.aFloat5704 = ((this.aFloat5716 * class101_sub2_22_.aFloat5704) + (class101_sub2_22_.aFloat5711 * f_26_ + f_27_ * class101_sub2_22_.aFloat5700))
        this.aFloat5729 = (class101_sub2_22_.aFloat5729 + (f_28_ * class101_sub2_22_.aFloat5711 + class101_sub2_22_.aFloat5700 * f_29_ + (class101_sub2_22_.aFloat5704 * this.aFloat5724)))
        this.aFloat5710 = (class101_sub2_22_.aFloat5708 * f_28_ + f_29_ * class101_sub2_22_.aFloat5722 + (this.aFloat5724 * class101_sub2_22_.aFloat5732) + class101_sub2_22_.aFloat5710)
        this.aFloat5716 = ((this.aFloat5716 * class101_sub2_22_.aFloat5716) + (class101_sub2_22_.aFloat5736 * f_26_ + class101_sub2_22_.aFloat5691 * f_27_))
        this.aFloat5724 = (class101_sub2_22_.aFloat5736 * f_28_ + class101_sub2_22_.aFloat5691 * f_29_ + (this.aFloat5724 * class101_sub2_22_.aFloat5716) + class101_sub2_22_.aFloat5724)
    }

    fun method918(fs: FloatArray, i: Int): FloatArray {
        fs[7] = 0.0f
        fs[13] = this.aFloat5710
        fs[14] = this.aFloat5724
        fs[12] = this.aFloat5729
        fs[11] = 0.0f
        anInt5709++
        fs[9] = this.aFloat5732
        fs[8] = this.aFloat5704
        fs[4] = this.aFloat5700
        fs[0] = this.aFloat5711
        fs[10] = this.aFloat5716
        fs[5] = this.aFloat5722
        fs[15] = 1.0f
        fs[1] = this.aFloat5708
        fs[3] = i.toFloat()
        fs[2] = this.aFloat5736
        fs[6] = this.aFloat5691
        return fs
    }

    fun method919(f: Float, fs: FloatArray, f_30_: Float, f_31_: Float, f_32_: Float, i: Byte) {
        anInt5727++
        if (i.toInt() != -120) method921(((-93).toByte()).toByte(), false)
        fs[0] = (f_30_ * this.aFloat5700 + f_31_ * this.aFloat5711 + this.aFloat5704 * f)
        fs[1] = (this.aFloat5708 * f_31_ + f_30_ * this.aFloat5722 + this.aFloat5732 * f)
        val f_33_: Float
        val f_34_: Float
        val f_35_: Float
        if (f_31_ > 0.00390625f || f_31_ < -0.00390625f) {
            val f_36_ = -f_32_ / f_31_
            f_34_ = (this.aFloat5724 + f_36_ * this.aFloat5736)
            f_35_ = (this.aFloat5729 + f_36_ * this.aFloat5711)
            f_33_ = (f_36_ * this.aFloat5708 + this.aFloat5710)
        } else if (f_30_ <= 0.00390625f && f_30_ >= -0.00390625f) {
            val f_38_ = -f_32_ / f
            f_35_ = (this.aFloat5704 * f_38_ + this.aFloat5729)
            f_33_ = (this.aFloat5732 * f_38_ + this.aFloat5710)
            f_34_ = (this.aFloat5724 + f_38_ * this.aFloat5716)
        } else {
            val f_37_ = -f_32_ / f_30_
            f_33_ = (this.aFloat5710 + f_37_ * this.aFloat5722)
            f_34_ = (this.aFloat5724 + this.aFloat5691 * f_37_)
            f_35_ = (this.aFloat5729 + this.aFloat5700 * f_37_)
        }
        fs[2] = (f * this.aFloat5716 + (this.aFloat5691 * f_30_ + f_31_ * this.aFloat5736))
        fs[3] = -(fs[2] * f_34_ + (fs[0] * f_35_ + fs[1] * f_33_))
    }

    override fun method900(i: Int) {
        anInt5734++
        val f = Class239_Sub4.aFloatArray5876!![0x3fff and i]
        val f_39_ = Class239_Sub4.aFloatArray5874!![0x3fff and i]
        val f_40_ = this.aFloat5708
        val f_41_ = this.aFloat5722
        val f_42_ = this.aFloat5732
        this.aFloat5708 = f_40_ * f - f_39_ * this.aFloat5736
        val f_43_ = this.aFloat5710
        this.aFloat5722 = f_41_ * f - f_39_ * this.aFloat5691
        this.aFloat5736 = f * this.aFloat5736 + f_39_ * f_40_
        this.aFloat5691 = f * this.aFloat5691 + f_39_ * f_41_
        this.aFloat5732 = f_42_ * f - this.aFloat5716 * f_39_
        this.aFloat5710 = f * f_43_ - f_39_ * this.aFloat5724
        this.aFloat5716 = f * this.aFloat5716 + f_42_ * f_39_
        this.aFloat5724 = f_39_ * f_43_ + f * this.aFloat5724
    }

    fun method920(f: Float, bool: Boolean, f_44_: Float, f_45_: Float) {
        this.aFloat5724 += f_44_
        anInt5717++
        this.aFloat5729 += f_45_
        this.aFloat5710 += f
    }

    fun method922(i: Byte, f: Float, f_46_: Float, f_47_: Float): Float {
        anInt5701++
        if (i <= 63) this.aFloat5700 = -0.2392172f
        return (this.aFloat5722 * f_47_ + f * this.aFloat5708 + f_46_ * this.aFloat5732 + this.aFloat5710)
    }

    fun method923(f: Float, f_48_: Float, i: Byte, f_49_: Float, fs: FloatArray) {
        fs[2] = (f_49_ * this.aFloat5716 + (this.aFloat5691 * f_48_ + this.aFloat5736 * f))
        anInt5697++
        fs[1] = (this.aFloat5732 * f_49_ + (f_48_ * this.aFloat5722 + f * this.aFloat5708))
        fs[0] = (f_49_ * this.aFloat5704 + (this.aFloat5711 * f + f_48_ * this.aFloat5700))
    }

    fun method924(i: Int, fs: FloatArray): FloatArray {
        fs[2] = this.aFloat5704
        fs[0] = this.aFloat5711
        fs[6] = this.aFloat5732
        fs[13] = 0.0f
        fs[3] = this.aFloat5729
        fs[7] = this.aFloat5710
        fs[12] = 0.0f
        fs[14] = 0.0f
        anInt5705++
        fs[10] = this.aFloat5716
        fs[8] = this.aFloat5736
        fs[1] = this.aFloat5700
        fs[5] = this.aFloat5722
        fs[9] = this.aFloat5691
        fs[15] = 1.0f
        fs[4] = this.aFloat5708
        fs[i] = this.aFloat5724
        return fs
    }

    override fun method907(): Class101 {
        anInt5695++
        val class101_sub2_50_ = Class101_Sub2()
        class101_sub2_50_.aFloat5691 = this.aFloat5691
        class101_sub2_50_.aFloat5724 = this.aFloat5724
        class101_sub2_50_.aFloat5700 = this.aFloat5700
        class101_sub2_50_.aFloat5729 = this.aFloat5729
        class101_sub2_50_.aFloat5736 = this.aFloat5736
        class101_sub2_50_.aFloat5710 = this.aFloat5710
        class101_sub2_50_.aFloat5722 = this.aFloat5722
        class101_sub2_50_.aFloat5704 = this.aFloat5704
        class101_sub2_50_.aFloat5708 = this.aFloat5708
        class101_sub2_50_.aFloat5716 = this.aFloat5716
        class101_sub2_50_.aFloat5711 = this.aFloat5711
        class101_sub2_50_.aFloat5732 = this.aFloat5732
        return class101_sub2_50_
    }

    fun method926(i: Int, class101: Class101) {
        anInt5737++
        if (i != -15699) this.aFloat5722 = 0.6372093f
        val class101_sub2_51_ = class101 as Class101_Sub2
        this.aFloat5711 = class101_sub2_51_.aFloat5711
        this.aFloat5710 = 0.0f
        this.aFloat5722 = class101_sub2_51_.aFloat5722
        this.aFloat5736 = class101_sub2_51_.aFloat5736
        this.aFloat5691 = class101_sub2_51_.aFloat5691
        this.aFloat5716 = class101_sub2_51_.aFloat5716
        this.aFloat5700 = class101_sub2_51_.aFloat5700
        this.aFloat5708 = class101_sub2_51_.aFloat5708
        this.aFloat5732 = class101_sub2_51_.aFloat5732
        this.aFloat5724 = 0.0f
        this.aFloat5729 = 0.0f
        this.aFloat5704 = class101_sub2_51_.aFloat5704
    }

    fun method927(class101: Class101?, class101_52_: Class101?) {
        try {
            anInt5743++
            val class101_sub2_53_ = class101 as Class101_Sub2?
            val class101_sub2_54_ = class101_52_ as Class101_Sub2?
            this.aFloat5711 = ((class101_sub2_53_!!.aFloat5704 * class101_sub2_54_!!.aFloat5736) + ((class101_sub2_53_.aFloat5711 * class101_sub2_54_.aFloat5711) + (class101_sub2_54_.aFloat5708 * class101_sub2_53_.aFloat5700)))
            this.aFloat5708 = ((class101_sub2_53_.aFloat5722 * class101_sub2_54_.aFloat5708) + (class101_sub2_54_.aFloat5711 * class101_sub2_53_.aFloat5708) + (class101_sub2_53_.aFloat5732 * class101_sub2_54_.aFloat5736))
            this.aFloat5736 = ((class101_sub2_54_.aFloat5736 * class101_sub2_53_.aFloat5716) + ((class101_sub2_53_.aFloat5736 * class101_sub2_54_.aFloat5711) + (class101_sub2_54_.aFloat5708 * class101_sub2_53_.aFloat5691)))
            this.aFloat5700 = ((class101_sub2_54_.aFloat5691 * class101_sub2_53_.aFloat5704) + ((class101_sub2_54_.aFloat5722 * class101_sub2_53_.aFloat5700) + (class101_sub2_54_.aFloat5700 * class101_sub2_53_.aFloat5711)))
            this.aFloat5722 = ((class101_sub2_53_.aFloat5708 * class101_sub2_54_.aFloat5700) + (class101_sub2_54_.aFloat5722 * class101_sub2_53_.aFloat5722) + (class101_sub2_53_.aFloat5732 * class101_sub2_54_.aFloat5691))
            this.aFloat5704 = ((class101_sub2_53_.aFloat5700 * class101_sub2_54_.aFloat5732) + (class101_sub2_53_.aFloat5711 * class101_sub2_54_.aFloat5704) + (class101_sub2_53_.aFloat5704 * class101_sub2_54_.aFloat5716))
            this.aFloat5691 = ((class101_sub2_53_.aFloat5716 * class101_sub2_54_.aFloat5691) + ((class101_sub2_53_.aFloat5736 * class101_sub2_54_.aFloat5700) + (class101_sub2_53_.aFloat5691 * class101_sub2_54_.aFloat5722)))
            this.aFloat5732 = ((class101_sub2_53_.aFloat5708 * class101_sub2_54_.aFloat5704) + (class101_sub2_53_.aFloat5722 * class101_sub2_54_.aFloat5732) + (class101_sub2_54_.aFloat5716 * class101_sub2_53_.aFloat5732))
            this.aFloat5729 = (class101_sub2_53_.aFloat5729 + ((class101_sub2_54_.aFloat5724 * class101_sub2_53_.aFloat5704) + ((class101_sub2_54_.aFloat5710 * class101_sub2_53_.aFloat5700) + (class101_sub2_53_.aFloat5711 * (class101_sub2_54_.aFloat5729)))))
            this.aFloat5716 = ((class101_sub2_53_.aFloat5691 * class101_sub2_54_.aFloat5732) + (class101_sub2_53_.aFloat5736 * class101_sub2_54_.aFloat5704) + (class101_sub2_53_.aFloat5716 * class101_sub2_54_.aFloat5716))
            this.aFloat5710 = (class101_sub2_53_.aFloat5710 + ((class101_sub2_53_.aFloat5732 * class101_sub2_54_.aFloat5724) + ((class101_sub2_54_.aFloat5710 * class101_sub2_53_.aFloat5722) + (class101_sub2_53_.aFloat5708 * (class101_sub2_54_.aFloat5729)))))
            this.aFloat5724 = ((class101_sub2_53_.aFloat5691 * class101_sub2_54_.aFloat5710) + (class101_sub2_53_.aFloat5736 * class101_sub2_54_.aFloat5729) + (class101_sub2_54_.aFloat5724 * class101_sub2_53_.aFloat5716) + class101_sub2_53_.aFloat5724)
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, ("haa.HA(" + (if (class101 != null) "{...}" else "null") + ',' + (if (class101_52_ != null) "{...}" else "null") + ')'))
        }
    }

    fun method928(fs: FloatArray, i: Int): FloatArray {
        fs[13] = 0.0f
        fs[i] = this.aFloat5708
        fs[5] = this.aFloat5722
        fs[6] = 0.0f
        fs[3] = 0.0f
        fs[15] = 1.0f
        fs[4] = this.aFloat5700
        fs[14] = 0.0f
        fs[10] = this.aFloat5724
        fs[2] = 0.0f
        fs[0] = this.aFloat5711
        fs[7] = 0.0f
        fs[11] = 0.0f
        fs[12] = 0.0f
        anInt5690++
        fs[8] = this.aFloat5729
        fs[9] = this.aFloat5710
        return fs
    }

    fun method929(f: Float, f_55_: Float, i: Byte, f_56_: Float): Float {
        anInt5720++
        if (i.toInt() != 45) this.aFloat5722 = 0.64777815f
        return (f * this.aFloat5704 + (f_55_ * this.aFloat5700 + f_56_ * this.aFloat5711) + this.aFloat5729)
    }

    override fun method908(i: Int) {
        anInt5702++
        val f = Class239_Sub4.aFloatArray5876!![i and 0x3fff]
        val f_57_ = Class239_Sub4.aFloatArray5874!![i and 0x3fff]
        val f_58_ = this.aFloat5711
        val f_59_ = this.aFloat5700
        val f_60_ = this.aFloat5704
        val f_61_ = this.aFloat5729
        this.aFloat5711 = f_58_ * f - this.aFloat5708 * f_57_
        this.aFloat5708 = f * this.aFloat5708 + f_58_ * f_57_
        this.aFloat5700 = f_59_ * f - this.aFloat5722 * f_57_
        this.aFloat5722 = this.aFloat5722 * f + f_59_ * f_57_
        this.aFloat5704 = f_60_ * f - f_57_ * this.aFloat5732
        this.aFloat5729 = -(f_57_ * this.aFloat5710) + f * f_61_
        this.aFloat5732 = f_57_ * f_60_ + f * this.aFloat5732
        this.aFloat5710 = f_57_ * f_61_ + this.aFloat5710 * f
    }

    override fun method890(`is`: IntArray) {
        anInt5715++
        val f = -this.aFloat5729 + `is`[0].toFloat()
        val f_62_ = `is`[1].toFloat() - this.aFloat5710
        val f_63_ = `is`[2].toFloat() - this.aFloat5724
        `is`[2] = (f_63_ * this.aFloat5716 + (this.aFloat5704 * f + f_62_ * this.aFloat5732)).toInt()
        `is`[1] = (this.aFloat5691 * f_63_ + (this.aFloat5722 * f_62_ + f * this.aFloat5700)).toInt()
        `is`[0] = (this.aFloat5708 * f_62_ + this.aFloat5711 * f + f_63_ * this.aFloat5736).toInt()
    }

    override fun method897(i: Int, i_64_: Int, i_65_: Int, `is`: IntArray) {
        `is`[2] = (i_64_.toFloat() * this.aFloat5691 + this.aFloat5736 * i.toFloat() + this.aFloat5716 * i_65_.toFloat() + this.aFloat5724).toInt()
        anInt5723++
        `is`[1] = (this.aFloat5732 * i_65_.toFloat() + (this.aFloat5722 * i_64_.toFloat() + i.toFloat() * this.aFloat5708) + this.aFloat5710).toInt()
        `is`[0] = (this.aFloat5729 + (this.aFloat5704 * i_65_.toFloat() + (i.toFloat() * this.aFloat5711 + (this.aFloat5700 * i_64_.toFloat())))).toInt()
    }

    override fun method905(i: Int, i_66_: Int, i_67_: Int, `is`: IntArray) {
        `is`[0] = (i.toFloat() * this.aFloat5711 + this.aFloat5700 * i_66_.toFloat() + i_67_.toFloat() * this.aFloat5704).toInt()
        `is`[1] = (i_66_.toFloat() * this.aFloat5722 + this.aFloat5708 * i.toFloat() + this.aFloat5732 * i_67_.toFloat()).toInt()
        anInt5741++
        `is`[2] = (i.toFloat() * this.aFloat5736 + this.aFloat5691 * i_66_.toFloat() + i_67_.toFloat() * this.aFloat5716).toInt()
    }

    fun method930(i: Int, fs: FloatArray): FloatArray {
        fs[7] = 0.0f
        fs[14] = 0.0f
        fs[8] = this.aFloat5736
        fs[6] = this.aFloat5732
        fs[4] = this.aFloat5708
        fs[2] = this.aFloat5704
        fs[11] = 0.0f
        anInt5719++
        fs[15] = 0.0f
        fs[9] = this.aFloat5691
        fs[12] = 0.0f
        fs[13] = i.toFloat()
        fs[3] = 0.0f
        fs[1] = this.aFloat5700
        fs[0] = this.aFloat5711
        fs[10] = this.aFloat5716
        fs[5] = this.aFloat5722
        return fs
    }

    fun method931(i: Int, class101: Class101) {
        anInt5730++
        val class101_sub2_68_ = class101 as Class101_Sub2
        this.aFloat5700 = class101_sub2_68_.aFloat5708
        this.aFloat5704 = class101_sub2_68_.aFloat5736
        this.aFloat5711 = class101_sub2_68_.aFloat5711
        this.aFloat5708 = class101_sub2_68_.aFloat5700
        this.aFloat5722 = class101_sub2_68_.aFloat5722
        this.aFloat5736 = class101_sub2_68_.aFloat5704
        this.aFloat5732 = class101_sub2_68_.aFloat5691
        this.aFloat5691 = class101_sub2_68_.aFloat5732
        if (i != -25519) method932(0.19733748f, -0.027194114f, -1.3929868f, 77.toByte())
        this.aFloat5729 = -((this.aFloat5704 * class101_sub2_68_.aFloat5724) + ((class101_sub2_68_.aFloat5710 * this.aFloat5700) + (class101_sub2_68_.aFloat5729 * this.aFloat5711)))
        this.aFloat5716 = class101_sub2_68_.aFloat5716
        this.aFloat5710 = -((class101_sub2_68_.aFloat5724 * this.aFloat5732) + ((this.aFloat5708 * class101_sub2_68_.aFloat5729) + (class101_sub2_68_.aFloat5710 * this.aFloat5722)))
        this.aFloat5724 = -((class101_sub2_68_.aFloat5710 * this.aFloat5691) + (this.aFloat5736 * class101_sub2_68_.aFloat5729) + (this.aFloat5716 * class101_sub2_68_.aFloat5724))
    }

    override fun method896(i: Int) {
        anInt5725++
        val f = Class239_Sub4.aFloatArray5876!![i and 0x3fff]
        val f_69_ = Class239_Sub4.aFloatArray5874!![i and 0x3fff]
        val f_70_ = this.aFloat5711
        val f_71_ = this.aFloat5700
        val f_72_ = this.aFloat5704
        this.aFloat5711 = f * f_70_ + this.aFloat5736 * f_69_
        val f_73_ = this.aFloat5729
        this.aFloat5736 = -(f_69_ * f_70_) + this.aFloat5736 * f
        this.aFloat5700 = f * f_71_ + f_69_ * this.aFloat5691
        this.aFloat5691 = -(f_69_ * f_71_) + this.aFloat5691 * f
        this.aFloat5704 = f * f_72_ + this.aFloat5716 * f_69_
        this.aFloat5716 = -(f_72_ * f_69_) + this.aFloat5716 * f
        this.aFloat5729 = f_73_ * f + f_69_ * this.aFloat5724
        this.aFloat5724 = -(f_73_ * f_69_) + f * this.aFloat5724
    }

    fun method932(f: Float, f_74_: Float, f_75_: Float, i: Byte) {
        this.aFloat5722 = f_74_
        this.aFloat5704 = 0.0f
        this.aFloat5700 = 0.0f
        anInt5692++
        this.aFloat5729 = 0.0f
        this.aFloat5716 = f
        this.aFloat5724 = 0.0f
        this.aFloat5732 = 0.0f
        this.aFloat5710 = 0.0f
        if (i > -5) method900(-55)
        this.aFloat5736 = 0.0f
        this.aFloat5708 = 0.0f
        this.aFloat5691 = 0.0f
        this.aFloat5711 = f_75_
    }

    fun method933(i: Byte, f: Float, f_76_: Float, f_77_: Float): Float {
        if (i.toInt() != -105) this.aFloat5724 = -0.26493254f
        anInt5740++
        return (this.aFloat5724 + (this.aFloat5736 * f + f_77_ * this.aFloat5691 + this.aFloat5716 * f_76_))
    }

    fun method934(i: Byte) {
        this.aFloat5710 = -this.aFloat5710
        if (i.toInt() == 64) {
            this.aFloat5691 = -this.aFloat5691
            this.aFloat5736 = -this.aFloat5736
            this.aFloat5732 = -this.aFloat5732
            this.aFloat5724 = -this.aFloat5724
            anInt5731++
            this.aFloat5716 = -this.aFloat5716
            this.aFloat5708 = -this.aFloat5708
            this.aFloat5722 = -this.aFloat5722
        }
    }

    override fun method898(class101: Class101?) {
        anInt5693++
        val class101_sub2_78_ = class101 as Class101_Sub2?
        this.aFloat5724 = class101_sub2_78_!!.aFloat5724
        this.aFloat5736 = class101_sub2_78_.aFloat5736
        this.aFloat5729 = class101_sub2_78_.aFloat5729
        this.aFloat5700 = class101_sub2_78_.aFloat5700
        this.aFloat5691 = class101_sub2_78_.aFloat5691
        this.aFloat5711 = class101_sub2_78_.aFloat5711
        this.aFloat5704 = class101_sub2_78_.aFloat5704
        this.aFloat5732 = class101_sub2_78_.aFloat5732
        this.aFloat5716 = class101_sub2_78_.aFloat5716
        this.aFloat5722 = class101_sub2_78_.aFloat5722
        this.aFloat5710 = class101_sub2_78_.aFloat5710
        this.aFloat5708 = class101_sub2_78_.aFloat5708
    }

    fun method935(f: Float, f_79_: Float, f_80_: Float, f_81_: Float, f_82_: Float, f_83_: Float, f_84_: Float, f_85_: Float, f_86_: Float, i: Int) {
        anInt5718++
        this.aFloat5708 = f_79_
        this.aFloat5716 = f
        this.aFloat5700 = f_80_
        this.aFloat5724 = 0.0f
        this.aFloat5732 = f_85_
        this.aFloat5729 = 0.0f
        this.aFloat5722 = f_83_
        this.aFloat5704 = f_84_
        this.aFloat5710 = i.toFloat()
        this.aFloat5691 = f_82_
        this.aFloat5736 = f_81_
        this.aFloat5711 = f_86_
    }

    fun method936(i: Int, i_87_: Int, i_88_: Int, f: Float, f_89_: Float, f_90_: Float, i_91_: Int) {
        anInt5703++
        if (i == i_87_) {
            this.aFloat5732 = 0.0f
            this.aFloat5704 = this.aFloat5732
            this.aFloat5691 = this.aFloat5704
            this.aFloat5700 = this.aFloat5691
            this.aFloat5736 = this.aFloat5700
            this.aFloat5708 = this.aFloat5736
            this.aFloat5729 = f - i_91_.toFloat()
            this.aFloat5716 = 1.0f
            this.aFloat5710 = -i_88_.toFloat() + f_90_
            this.aFloat5711 = (i_91_ * 2).toFloat()
            this.aFloat5722 = (2 * i_88_).toFloat()
            this.aFloat5724 = f_89_
        } else {
            val f_92_ = Class239_Sub4.aFloatArray5876!![i and 0x3fff]
            val f_93_ = Class239_Sub4.aFloatArray5874!![0x3fff and i]
            this.aFloat5711 = 2.0f * f_92_ * i_91_.toFloat()
            this.aFloat5710 = (-0.5f * f_93_ - f_92_ * 0.5f) * (2 * i_88_).toFloat() + f_90_
            this.aFloat5722 = i_88_.toFloat() * (f_92_ * 2.0f)
            this.aFloat5716 = 1.0f
            this.aFloat5700 = -2.0f * f_93_ * i_88_.toFloat()
            this.aFloat5732 = 0.0f
            this.aFloat5704 = this.aFloat5732
            this.aFloat5691 = this.aFloat5704
            this.aFloat5736 = this.aFloat5691
            this.aFloat5724 = f_89_
            this.aFloat5708 = i_91_.toFloat() * (f_93_ * 2.0f)
            this.aFloat5729 = f + (2 * i_91_).toFloat() * (0.5f * f_93_ - f_92_ * 0.5f)
        }
    }

    init {
        method910()
    }

    companion object {
        @JvmField
        var anInt5690: Int = 0
        @JvmField
        var anInt5692: Int = 0
        @JvmField
        var anInt5693: Int = 0
        @JvmField
        var anInt5694: Int = 0
        @JvmField
        var anInt5695: Int = 0
        @JvmField
        var anInt5696: Int = 0
        @JvmField
        var anInt5697: Int = 0
        @JvmField
        var anInt5698: Int = 0
        var aClass351_5699: Class351?
        @JvmField
        var anInt5701: Int = 0
        @JvmField
        var anInt5702: Int = 0
        @JvmField
        var anInt5703: Int = 0
        @JvmField
        var anInt5705: Int = 0
        @JvmField
        var anInt5706: Int = 0
        @JvmField
        var anInt5707: Int = 0
        @JvmField
        var anInt5709: Int = 0
        @JvmField
        var anInt5712: Int = 0
        @JvmField
        var anInt5713: Int = -1
        @JvmField
        var anInt5714: Int = 0
        @JvmField
        var anInt5715: Int = 0
        @JvmField
        var anInt5717: Int = 0
        @JvmField
        var anInt5718: Int = 0
        @JvmField
        var anInt5719: Int = 0
        @JvmField
        var anInt5720: Int = 0
        @JvmField
        var anInt5721: Int = 0
        @JvmField
        var anInt5723: Int = 0
        @JvmField
        var anInt5725: Int = 0
        @JvmField
        var anInt5726: Int = 0
        @JvmField
        var anInt5727: Int = 0
        @JvmField
        var anInt5728: Int = 0
        @JvmField
        var anInt5730: Int = 0
        @JvmField
        var anInt5731: Int = 0
        @JvmField
        var anInt5733: Int = 0
        @JvmField
        var anInt5734: Int = 0
        @JvmField
        var anInt5735: Int = 0
        @JvmField
        var anInt5737: Int = 0
        @JvmField
        var anInt5738: Int = 0
        @JvmField
        var anInt5739: Int = 0
        @JvmField
        var anInt5740: Int = 0
        @JvmField
        var anInt5741: Int = 0
        var aClass114_5742: Class114?
        @JvmField
        var anInt5743: Int = 0
        var anInt5744: Int = 0
        @JvmField
        var aLong5745: Long = 0

        fun method921(i: Byte, bool: Boolean) {
            if (i.toInt() == 99) {
                var class348_sub9 = Class218.aClass262_2859!!.method1995(4) as? Class348_Sub9
                while (class348_sub9 != null) {
                    if (class348_sub9.aClass348_Sub16_Sub5_6676 != null) {
                        Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2880(class348_sub9.aClass348_Sub16_Sub5_6676!!)
                        class348_sub9.aClass348_Sub16_Sub5_6676 = null
                    }
                    if (class348_sub9.aClass348_Sub16_Sub5_6673 != null) {
                        Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2880(class348_sub9.aClass348_Sub16_Sub5_6673!!)
                        class348_sub9.aClass348_Sub16_Sub5_6673 = null
                    }
                    class348_sub9.method2715(94.toByte())
                    class348_sub9 = Class218.aClass262_2859!!.method1990(120.toByte()) as? Class348_Sub9
                }
                anInt5739++
                if (bool) {
                    run {
                        var class348_sub9 = Client.aClass262_5185!!.method1995(4) as? Class348_Sub9
                        while (class348_sub9 != null) {
                            if ((class348_sub9!!.aClass348_Sub16_Sub5_6676) != null) {
                                Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2880(class348_sub9!!.aClass348_Sub16_Sub5_6676!!)
                                class348_sub9!!.aClass348_Sub16_Sub5_6676 = null
                            }
                            class348_sub9!!.method2715(66.toByte())
                            class348_sub9 = (Client.aClass262_5185!!.method1990(69.toByte()) as? Class348_Sub9)
                        }
                    }
                    var class348_sub9 = Class348_Sub42_Sub16_Sub2.aClass356_10465!!.method3484(0) as? Class348_Sub9
                    while (class348_sub9 != null) {
                        if ((class348_sub9!!.aClass348_Sub16_Sub5_6676) != null) {
                            Class348_Sub43.aClass348_Sub16_Sub4_7065!!.method2880(class348_sub9!!.aClass348_Sub16_Sub5_6676!!)
                            class348_sub9!!.aClass348_Sub16_Sub5_6676 = null
                        }
                        class348_sub9!!.method2715(112.toByte())
                        class348_sub9 = Class348_Sub42_Sub16_Sub2.aClass356_10465!!.method3482(0) as? Class348_Sub9
                    }
                }
            }
        }

        @JvmStatic
        fun method925(i: Int) {
            if (i == -5997) {
                aClass351_5699 = null
                aClass114_5742 = null
            }
        }

        init {
            aClass351_5699 = Class351(53, -1)
            aClass114_5742 = Class114(119, 6)
        }
    }
}
