/* Class105_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class105_Sub3(@JvmField var aHa_Sub1_8460: ha_Sub1, @JvmField var anInt8471: Int, @JvmField var anInt8470: Int) : Class105() {
    @JvmField
    var anInt8454: Int = 0
    @JvmField
    var anInt8456: Int = 0
    @JvmField
    var anInt8461: Int = 0
    private var anIntArray8462: IntArray? = null
    @JvmField
    var anInt8464: Int = 0
    abstract override fun method964(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int)

    override fun method971(): Int {
        return this.anInt8471
    }

    override fun method984(`is`: IntArray?) {
        `is`!![0] = this.anInt8461
        `is`[1] = this.anInt8464
        `is`[2] = this.anInt8454
        `is`[3] = this.anInt8456
    }

    override fun method965(i: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int) {
        check(!this.aHa_Sub1_8460.method3716())
        if (anIntArray8462 == null) anIntArray8462 = IntArray(4)
        this.aHa_Sub1_8460.K(anIntArray8462)
        this.aHa_Sub1_8460.T(this.aHa_Sub1_8460.anInt7496, this.aHa_Sub1_8460.anInt7476, i + i_5_, i_4_ + i_6_)
        val i_10_ = method966()
        val i_11_ = method980()
        val i_12_ = (i_5_ + i_10_ - 1) / i_10_
        val i_13_ = (i_6_ + i_11_ - 1) / i_11_
        for (i_14_ in 0..<i_13_) {
            val i_15_ = i_14_ * i_11_
            for (i_16_ in 0..<i_12_) method964(i + i_16_ * i_10_, i_4_ + i_15_, i_7_, i_8_, i_9_)
        }
        this.aHa_Sub1_8460.KA(anIntArray8462!![0], anIntArray8462!![1], anIntArray8462!![2], anIntArray8462!![3])
    }

    override fun method983(f: Float, f_17_: Float, f_18_: Float, f_19_: Float, f_20_: Float, f_21_: Float, i: Int, var_aa: aa?, i_22_: Int, i_23_: Int) {
        check(!this.aHa_Sub1_8460.method3716())
        if (method997(f, f_17_, f_18_, f_19_, f_20_, f_21_)) {
            val var_aa_Sub3 = var_aa as aa_Sub3
            method995(var_aa_Sub3.anIntArray5201, var_aa_Sub3.anIntArray5202, anInt8473 - i_22_, -i_23_ - (anInt8468 - anInt8466))
        }
    }

    override fun method985(i: Int, i_24_: Int, i_25_: Int, i_26_: Int) {
        this.anInt8461 = i
        this.anInt8464 = i_24_
        this.anInt8454 = i_25_
        this.anInt8456 = i_26_
    }

    abstract fun method994(i: Int, i_27_: Int)

    abstract fun method995(`is`: IntArray?, is_28_: IntArray?, i: Int, i_29_: Int)

    override fun method962(f: Float, f_30_: Float, f_31_: Float, f_32_: Float, f_33_: Float, f_34_: Float, i: Int, i_35_: Int, i_36_: Int, i_37_: Int) {
        check(!this.aHa_Sub1_8460.method3716())
        if (method997(f, f_30_, f_31_, f_32_, f_33_, f_34_)) {
            anInt8480 = i_35_
            if (i != 1) {
                anInt8477 = i_35_ ushr 24
                anInt8472 = 256 - anInt8477
                if (i == 0) {
                    anInt8469 = (i_35_ and 0xff0000) shr 16
                    anInt8463 = (i_35_ and 0xff00) shr 8
                    anInt8465 = i_35_ and 0xff
                } else if (i == 2) {
                    anInt8459 = i_35_ ushr 24
                    anInt8455 = 256 - anInt8459
                    val i_38_: Int = (i_35_ and 0xff00ff) * anInt8455 and 0xff00ff.inv()
                    val i_39_: Int = (i_35_ and 0xff00) * anInt8455 and 0xff0000
                    anInt8474 = (i_38_ or i_39_) ushr 8
                }
            }
            if (i == 1) {
                if (i_36_ == 0) method994(1, 0)
                else if (i_36_ == 1) method994(1, 1)
                else if (i_36_ == 2) method994(1, 2)
            } else if (i == 0) {
                if (i_36_ == 0) method994(0, 0)
                else if (i_36_ == 1) method994(0, 1)
                else if (i_36_ == 2) method994(0, 2)
            } else if (i == 3) {
                if (i_36_ == 0) method994(3, 0)
                else if (i_36_ == 1) method994(3, 1)
                else if (i_36_ == 2) method994(3, 2)
            } else if (i == 2) {
                if (i_36_ == 0) method994(2, 0)
                else if (i_36_ == 1) method994(2, 1)
                else if (i_36_ == 2) method994(2, 2)
            }
        }
    }

    abstract fun method996(i: Int, i_40_: Int, i_41_: Int, i_42_: Int, i_43_: Int, i_44_: Int, i_45_: Int, i_46_: Int, i_47_: Int)

    abstract override fun method982(i: Int, i_48_: Int, i_49_: Int, i_50_: Int, i_51_: Int, i_52_: Int, i_53_: Int, i_54_: Int)

    override fun method969(): Int {
        return this.anInt8470
    }

    override fun method980(): Int {
        return (this.anInt8464 + this.anInt8470 + this.anInt8456)
    }

    override fun method966(): Int {
        return (this.anInt8461 + this.anInt8471 + this.anInt8454)
    }

    abstract override fun method963(i: Int, i_56_: Int, var_aa: aa?, i_57_: Int, i_58_: Int)

    private fun method997(f: Float, f_59_: Float, f_60_: Float, f_61_: Float, f_62_: Float, f_63_: Float): Boolean {
        var f = f
        var f_59_ = f_59_
        var f_60_ = f_60_
        var f_61_ = f_61_
        var f_62_ = f_62_
        var f_63_ = f_63_
        val i = (this.anInt8461 + this.anInt8471 + this.anInt8454)
        val i_64_ = (this.anInt8464 + this.anInt8470 + this.anInt8456)
        if (i != this.anInt8471 || i_64_ != this.anInt8470) {
            val f_65_ = (f_60_ - f) / i.toFloat()
            val f_66_ = (f_61_ - f_59_) / i.toFloat()
            val f_67_ = (f_62_ - f) / i_64_.toFloat()
            val f_68_ = (f_63_ - f_59_) / i_64_.toFloat()
            val f_69_ = f_67_ * this.anInt8464.toFloat()
            val f_70_ = f_68_ * this.anInt8464.toFloat()
            val f_71_ = f_65_ * this.anInt8461.toFloat()
            val f_72_ = f_66_ * this.anInt8461.toFloat()
            val f_73_ = -f_65_ * this.anInt8454.toFloat()
            val f_74_ = -f_66_ * this.anInt8454.toFloat()
            val f_75_ = -f_67_ * this.anInt8456.toFloat()
            val f_76_ = -f_68_ * this.anInt8456.toFloat()
            f += f_71_ + f_69_
            f_59_ += f_72_ + f_70_
            f_60_ += f_73_ + f_69_
            f_61_ += f_74_ + f_70_
            f_62_ += f_71_ + f_75_
            f_63_ += f_72_ + f_76_
        }
        val f_77_ = f_62_ + (f_60_ - f)
        val f_78_ = f_61_ + (f_63_ - f_59_)
        var f_79_: Float
        var f_80_: Float
        if (f < f_60_) {
            f_79_ = f
            f_80_ = f_60_
        } else {
            f_79_ = f_60_
            f_80_ = f
        }
        if (f_62_ < f_79_) f_79_ = f_62_
        if (f_77_ < f_79_) f_79_ = f_77_
        if (f_62_ > f_80_) f_80_ = f_62_
        if (f_77_ > f_80_) f_80_ = f_77_
        var f_81_: Float
        var f_82_: Float
        if (f_59_ < f_61_) {
            f_81_ = f_59_
            f_82_ = f_61_
        } else {
            f_81_ = f_61_
            f_82_ = f_59_
        }
        if (f_63_ < f_81_) f_81_ = f_63_
        if (f_78_ < f_81_) f_81_ = f_78_
        if (f_63_ > f_82_) f_82_ = f_63_
        if (f_78_ > f_82_) f_82_ = f_78_
        if (f_79_ < (this.aHa_Sub1_8460.anInt7496).toFloat()) f_79_ = (this.aHa_Sub1_8460.anInt7496).toFloat()
        if (f_80_ > (this.aHa_Sub1_8460.anInt7507).toFloat()) f_80_ = (this.aHa_Sub1_8460.anInt7507).toFloat()
        if (f_81_ < (this.aHa_Sub1_8460.anInt7476).toFloat()) f_81_ = (this.aHa_Sub1_8460.anInt7476).toFloat()
        if (f_82_ > (this.aHa_Sub1_8460.anInt7503).toFloat()) f_82_ = (this.aHa_Sub1_8460.anInt7503).toFloat()
        f_80_ = f_79_ - f_80_
        if (f_80_ >= 0.0f) return false
        f_82_ = f_81_ - f_82_
        if (f_82_ >= 0.0f) return false
        anInt8453 = this.aHa_Sub1_8460.anInt7477
        anInt8451 = ((f_81_.toInt() * anInt8453).toFloat() + f_79_).toInt()
        val f_83_ = (f_60_ - f) * (f_63_ - f_59_) - (f_61_ - f_59_) * (f_62_ - f)
        val f_84_ = (f_62_ - f) * (f_61_ - f_59_) - (f_63_ - f_59_) * (f_60_ - f)
        anInt8481 = ((f_63_ - f_59_) * 4096.0f * this.anInt8471.toFloat() / f_83_).toInt()
        anInt8450 = ((f_61_ - f_59_) * 4096.0f * this.anInt8470.toFloat() / f_84_).toInt()
        anInt8457 = ((f_62_ - f) * 4096.0f * this.anInt8471.toFloat() / f_84_).toInt()
        anInt8452 = ((f_60_ - f) * 4096.0f * this.anInt8470.toFloat() / f_83_).toInt()
        anInt8476 = (f_79_ * 16.0f + 8.0f - (f + f_60_ + f_62_ + f_77_) / 4.0f * 16.0f).toInt()
        anInt8482 = (f_81_ * 16.0f + 8.0f - (f_59_ + f_61_ + f_63_ + f_78_) / 4.0f * 16.0f).toInt()
        anInt8458 = ((this.anInt8471 shr 1 shl 12) + (anInt8482 * anInt8457 shr 4))
        anInt8467 = ((this.anInt8470 shr 1 shl 12) + (anInt8482 * anInt8452 shr 4))
        anInt8479 = anInt8476 * anInt8481 shr 4
        anInt8475 = anInt8476 * anInt8450 shr 4
        anInt8473 = f_79_.toInt()
        anInt8478 = f_80_.toInt()
        anInt8466 = f_81_.toInt()
        anInt8468 = f_82_.toInt()
        return true
    }

    companion object {
        @JvmField
        var anInt8450: Int = 0
        @JvmField
        var anInt8451: Int = 0
        @JvmField
        var anInt8452: Int = 0
        @JvmField
        var anInt8453: Int = 0
        private var anInt8455: Int
        @JvmField
        var anInt8457: Int = 0
        @JvmField
        var anInt8458: Int = 0
        private var anInt8459: Int
        @JvmField
        var anInt8463: Int
        @JvmField
        var anInt8465: Int = 0
        private var anInt8466 = 0
        @JvmField
        var anInt8467: Int = 0
        @JvmField
        var anInt8468: Int = 0
        @JvmField
        var anInt8469: Int
        @JvmField
        var anInt8472: Int
        private var anInt8473 = 0
        @JvmField
        var anInt8474: Int = 0
        @JvmField
        var anInt8475: Int = 0
        private var anInt8476 = 0
        @JvmField
        var anInt8477: Int
        @JvmField
        var anInt8478: Int = 0
        @JvmField
        var anInt8479: Int = 0
        @JvmField
        var anInt8480: Int = 0
        @JvmField
        var anInt8481: Int = 0
        private var anInt8482 = 0

        init {
            anInt8472 = 0
            anInt8463 = 0
            anInt8469 = 0
            anInt8477 = 0
            anInt8459 = 0
            anInt8455 = 0
        }
    }
}
