import kotlin.math.atan2

/* Class246 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
abstract class Class246 {
    abstract fun method1888(i: Int, class348_sub42_sub8: Class348_Sub42_Sub8): Class348_Sub42_Sub8

    companion object {
        @JvmField
        var anIntArray3173: IntArray? = intArrayOf(0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4)
        @JvmField
        var aBoolean3174: Boolean = false
        @JvmField
        var anInt3175: Int = 0
        @JvmField
        var anInt3176: Int = 0
        @JvmField
        var aFloat3177: Float = 0f
        @JvmField
        var anInt3178: Int = 0
        @JvmField
        var aClass143_3179: Class143? = null

        @JvmStatic
        fun method1885(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, fs: FloatArray?, i_4_: Int, f: Float, i_5_: Int, i_6_: Int, f_7_: Float, fs_8_: FloatArray?) {
            var i_0_ = i_0_
            var i_3_ = i_3_
            var i_4_ = i_4_
            try {
                i_4_ -= i_5_
                i_0_ -= i
                anInt3175++
                i_3_ -= i_6_
                val f_9_ = fs_8_!![2] * i_0_.toFloat() + (fs_8_[1] * i_4_.toFloat() + i_3_.toFloat() * fs_8_[0])
                val f_10_ = (fs_8_[5] * i_0_.toFloat() + (fs_8_[3] * i_3_.toFloat() + i_4_.toFloat() * fs_8_[4]))
                val f_11_ = (i_3_.toFloat() * fs_8_[6] + fs_8_[7] * i_4_.toFloat() + i_0_.toFloat() * fs_8_[i_2_])
                var f_12_ = 0.5f + (atan2(f_9_.toDouble(), f_11_.toDouble()).toFloat() / 6.2831855f)
                if (f_7_ != 1.0f) f_12_ *= f_7_
                var f_13_ = 0.5f + f_10_ + f
                if (i_1_ == 1) {
                    val f_14_ = f_12_
                    f_12_ = -f_13_
                    f_13_ = f_14_
                } else if (i_1_ == 2) {
                    f_12_ = -f_12_
                    f_13_ = -f_13_
                } else if (i_1_ == 3) {
                    val f_15_ = f_12_
                    f_12_ = f_13_
                    f_13_ = -f_15_
                }
                fs!![1] = f_13_
                fs[0] = f_12_
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("ca.D(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + (if (fs != null) "{...}" else "null") + ',' + i_4_ + ',' + f + ',' + i_5_ + ',' + i_6_ + ',' + f_7_ + ',' + (if (fs_8_ != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method1886(i: Int) {
            if (i != 4908) method1885(-84, 89, 50, 37, 107, null, -109, 0.5058839f, -21, -30, 0.003914575f, null)
            anIntArray3173 = null
            aClass143_3179 = null
        }

        @JvmStatic
        fun method1887(i: Int, i_16_: Int, i_17_: Int): Boolean {
            anInt3178++
            if (i != 0) return true
            return Class348_Sub40_Sub3.method3056(63, i_17_, i_16_) or ((0x70000 and i_17_) != 0) || Class264.method2015(i_17_, i_16_, i + 7)
        }
    }
}
