import Class348_Sub40_Sub1.Companion.method3051
import java.awt.Canvas

class Class305 internal constructor(private val anInt3858: Int, private val aClass72Array3862: Array<Class72?>?, i_23_: Int, private val anInt3866: Int, private val anInt3854: Int, private var anInt3853: Int) {
    private var anInt3852 = 0
    private var aBoolean3857 = true
    private var anInt3859 = -1
    private var anInt3863 = 0
    private val aClass72Array3865: Array<Class72?>?
    private var aClass105_3867: Class105? = null
    private val aClass72_3871: Class72?

    fun method2292(i: Int, var_ha: ha, i_0_: Int): Boolean {
        if (anInt3859 != i_0_) {
            anInt3859 = i_0_
            var i_1_ = method3051(i_0_, 4096)
            if (i_1_ > 512) i_1_ = 512
            if (i_1_ <= 0) i_1_ = 1
            if (i_1_ != anInt3863) {
                aClass105_3867 = null
                anInt3863 = i_1_
            }
            if (aClass72Array3862 != null) {
                anInt3852 = 0
                val `is` = IntArray(aClass72Array3862.size)
                var i_2_ = 0
                while (aClass72Array3862.size > i_2_) {
                    val class72 = aClass72Array3862[i_2_]!!
                    if (class72.method733(anInt3866, anInt3854, anInt3853, anInt3859)) {
                        `is`[anInt3852] = class72.anInt1232
                        aClass72Array3865!![anInt3852++] = class72
                    }
                    i_2_++
                }
                Class279.method2092(-1 + anInt3852, 0, `is`, -120, aClass72Array3865 as? Array<Any?>)
            }
            aBoolean3857 = true
        }
        anInt3856++
        if (i <= 27) anInt3853 = -98
        var bool = false
        if (aBoolean3857) {
            aBoolean3857 = false
            for (i_3_ in -1 + anInt3852 downTo 0) {
                val bool_4_ = aClass72Array3865!![i_3_]!!.method736(var_ha, aClass72_3871)
                bool = bool or bool_4_
                val class305_5_ = this
                class305_5_.aBoolean3857 = class305_5_.aBoolean3857 or !bool_4_
            }
        }
        return bool
    }

    fun method2293(i: Int, var_ha: ha, i_6_: Byte, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int) {
        var i_10_ = i_10_
        i_10_ = 0x3fff and i + i_10_
        anInt3860++
        if (anInt3858 != -1 && anInt3863 != 0) {
            val class12 = Class101_Sub1.aD5684!!.method3(anInt3858, -6662)
            if (aClass105_3867 == null && Class101_Sub1.aD5684!!.method4(-7953, anInt3858)) {
                val `is` = (if (class12!!.anInt200 == 2) Class101_Sub1.aD5684!!.method6(-21540, anInt3863, 0.7f, anInt3858, false, anInt3863) else Class101_Sub1.aD5684!!.method5(false, anInt3858, 0.7f, anInt3863, anInt3863, -119))
                aClass105_3867 = var_ha.method3662(anInt3863, `is`, 94.toByte(), 0, anInt3863, anInt3863)
            }
            if (class12!!.anInt200 == 2) var_ha.aa(i_7_, i_9_, i_8_, i_13_, i_12_, 0)
            if (aClass105_3867 != null) {
                val i_14_ = if (class12.anInt200 == 2) 1 else 0
                var i_15_ = i_13_ * i_11_ / -4096
                var i_16_: Int
                i_16_ = (-i_13_ + i_8_) / 2 + i_13_ * i_10_ / 4096
                while (i_13_ < i_16_) {
                    i_16_ -= i_13_
                }
                while ( /**/i_16_ < 0) {
                    i_16_ += i_13_
                }
                while ( /**/i_13_ < i_15_) {
                    i_15_ -= i_13_
                }
                while ( /**/i_15_ < 0) {
                    i_15_ += i_13_
                }
                var i_17_ = -i_13_ + i_16_
                while (i_8_ > i_17_) {
                    var i_18_ = i_15_ + -i_13_
                    while (i_18_ < i_13_) {
                        aClass105_3867!!.method970(i_7_ + i_17_, i_18_ + i_9_, i_13_, i_13_, 1, 0, i_14_)
                        i_18_ += i_13_
                    }
                    i_17_ += i_13_
                }
            }
        } else var_ha.aa(i_7_, i_9_, i_8_, i_13_, i_12_, 0)
        for (i_19_ in -1 + anInt3852 downTo 0) aClass72Array3865!![i_19_]!!.method737(var_ha, i_7_, i_9_, i_8_, i_13_, i_11_, i_10_)
        val i_20_ = 103 % ((i_6_ - 14) / 32)
    }

    fun method2295(i: Byte) {
        anInt3864++
        if (aClass72Array3862 != null) {
            var i_21_ = 0
            while (aClass72Array3862.size > i_21_) {
                aClass72Array3862[i_21_]!!.method734()
                i_21_++
            }
        }
        aClass105_3867 = null
    }

    init {
        if (aClass72Array3862 == null) {
            aClass72Array3865 = null
            aClass72_3871 = null
        } else {
            aClass72Array3865 = arrayOfNulls<Class72>(aClass72Array3862.size)
            aClass72_3871 = if (i_23_ < 0) null else aClass72Array3862[i_23_]
        }
    }

    companion object {
        @JvmField
        var anInt3855: Int = 0
        var anInt3856: Int = 0
        var anInt3860: Int = 0
        var anInt3861: Int = 0
        var anInt3864: Int = 0
        var anInt3868: Int = 0
        @JvmField
        var aCanvas3869: Canvas? = null
        @JvmField
        var aBoolean3870: Boolean = false
        @JvmStatic
        fun method2294(i: Int) {
            aCanvas3869 = null
            if (i <= 94) method2296(-107)
        }

        @JvmStatic
        fun method2296(i: Int) {
            anInt3868++
            if (i < -46) {
                for (i_22_ in 0..99) Class318_Sub2.aClass147Array6400!![i_22_] = null
                za_Sub1.anInt9774 = 0
            }
        }
    }
}
