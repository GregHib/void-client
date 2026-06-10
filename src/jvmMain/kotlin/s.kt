import java.awt.Canvas

abstract class s internal constructor(i: Int, i_60_: Int, i_61_: Int, `is`: Array<IntArray?>) {
    @JvmField
    var anIntArrayArray4584: Array<IntArray?>
    @JvmField
    var anInt4587: Int
    @JvmField
    var anInt4588: Int
    @JvmField
    var anInt4590: Int
    @JvmField
    var anInt4592: Int
    abstract fun method3978(i: Int, i_0_: Int, `is`: IntArray, is_1_: IntArray, is_2_: IntArray, is_3_: IntArray, is_4_: IntArray, is_5_: IntArray, is_6_: IntArray, is_7_: IntArray, is_8_: IntArray, is_9_: IntArray, is_10_: IntArray, i_11_: Int, i_12_: Int, i_13_: Int, bool: Boolean)

    abstract fun method3979(i: Int, i_14_: Int)

    abstract fun wa(var_r: r?, i: Int, i_15_: Int, i_16_: Int, i_17_: Int, bool: Boolean)

    abstract fun ka(i: Int, i_18_: Int, i_19_: Int)

    abstract fun method3981(class348_sub1: Class348_Sub1, `is`: IntArray)

    fun method3982(i: Byte, i_20_: Int, i_21_: Int): Int {
        anInt4593++
        if (i.toInt() != -86) this.anInt4590 = -59
        return this.anIntArrayArray4584[i_21_]!![i_20_]
    }

    abstract fun method3983(i: Int, i_22_: Int, i_23_: Int, bools: Array<BooleanArray?>?, bool: Boolean, i_24_: Int)

    abstract fun method3984(i: Int, i_25_: Int, i_26_: Int, bools: Array<BooleanArray?>?, bool: Boolean, i_27_: Int, i_28_: Int)

    fun method3986(i: Int, i_30_: Int, i_31_: Byte): Int {
        anInt4589++
        val i_32_ = i shr this.anInt4588
        val i_33_ = i_30_ shr this.anInt4588
        if (i_32_ < 0 || i_33_ < 0 || i_32_ > -1 + this.anInt4587 || i_33_ > this.anInt4590 - 1) return 0
        val i_34_ = -78 % ((i_31_ - -53) / 36)
        val i_35_ = i and this.anInt4592 + -1
        val i_36_ = i_30_ and this.anInt4592 - 1
        val i_37_ = ((((-i_35_ + this.anInt4592) * this.anIntArrayArray4584[i_32_]!![i_33_]) - -(this.anIntArrayArray4584[i_32_ - -1]!![i_33_] * i_35_)) shr this.anInt4588)
        val i_38_ = ((i_35_ * this.anIntArrayArray4584[1 + i_32_]!![1 + i_33_] + ((this.anInt4592 - i_35_) * this.anIntArrayArray4584[i_32_]!![i_33_ + 1])) shr this.anInt4588)
        return (i_36_ * i_38_ + (this.anInt4592 + -i_36_) * i_37_ shr this.anInt4588)
    }

    abstract fun method3987(i: Int, i_39_: Int, i_40_: Int, i_41_: Int, i_42_: Int, i_43_: Int, i_44_: Int, bools: Array<BooleanArray?>)

    abstract fun U(i: Int, i_45_: Int, `is`: IntArray?, is_46_: IntArray?, is_47_: IntArray, is_48_: IntArray?, is_49_: IntArray, is_50_: IntArray?, is_51_: IntArray, is_52_: IntArray, i_53_: Int, i_54_: Int, i_55_: Int, bool: Boolean)

    abstract fun CA(var_r: r?, i: Int, i_57_: Int, i_58_: Int, i_59_: Int, bool: Boolean)

    init {
        var i_61_ = i_61_
        this.anInt4587 = i
        this.anInt4590 = i_60_
        var i_62_ = 0
        while ( /**/i_61_ > 1) {
            i_62_++
            i_61_ = i_61_ shr 1
        }
        this.anInt4592 = 1 shl i_62_
        this.anIntArrayArray4584 = `is`
        this.anInt4588 = i_62_
    }

    abstract fun method3989(var_r: r?, i: Int, i_63_: Int, i_64_: Int, i_65_: Int, bool: Boolean): Boolean

    abstract fun YA()

    abstract fun fa(i: Int, i_66_: Int, var_r: r?): r?

    companion object {
        @JvmField
        var aClass45_4585: Class45? = null
        @JvmField
        var anInt4586: Int = 0
        @JvmField
        var anInt4589: Int = 0
        @JvmField
        var anInt4591: Int = 0
        @JvmField
        var anInt4593: Int = 0

        @JvmStatic
        fun method3980(i: Int, canvas: Canvas) {
            if (i > 85) {
                anInt4586++
                val dimension = canvas.getSize()
                Class85.method828(38.toByte(), dimension.height, dimension.width)
                if (Class348_Sub49.anInt7207 != 1) Class21.aHa326!!.method3669(canvas, Class59_Sub1.anInt5283, Class107.anInt1651)
                else Class21.aHa326!!.method3669(canvas, Class348_Sub16_Sub1.anInt8854, Class239_Sub16.anInt6008)
            }
        }

        @JvmStatic
        fun method3985(i: Int, i_29_: Int): Class147? {
            anInt4591++
            if (i_29_ < 0 || i_29_ >= 100) return null
            return Class318_Sub2.aClass147Array6400!![i_29_]
        }

        @JvmStatic
        fun method3988(i: Int) {
            val i_56_ = 49 / ((15 - i) / 40)
            aClass45_4585 = null
        }
    }
}
