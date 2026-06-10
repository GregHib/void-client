/* za - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class za : Class348() {
    companion object {
        @JvmField
        var aClass138_7274: Class138? = Class138(10, 2, 2, 0)
        @JvmField
        var anInt7275: Int = 0
        @JvmField
        var anInt7276: Int = 0

        fun method3437(i: Int, i_0_: Int) {
            var var_r: r? = null
            for (i_1_ in i..<i_0_) {
                val var_s = Class348_Sub1_Sub1.aSArray8801!![i_1_]
                if (var_s != null) {
                    for (i_2_ in 0..<Class348_Sub41.anInt7054) {
                        for (i_3_ in 0..<Class318_Sub7.anInt6451) {
                            var_r = var_s.fa(i_3_, i_2_, var_r)
                            if (var_r != null) {
                                val i_4_ = i_3_ shl Class362.anInt4459
                                val i_5_ = i_2_ shl Class362.anInt4459
                                for (i_6_ in i_1_ - 1 downTo 0) {
                                    val var_s_7_ = Class348_Sub1_Sub1.aSArray8801!![i_6_]
                                    if (var_s_7_ != null) {
                                        val i_8_ = (var_s.method3982((-86).toByte(), i_2_, i_3_) - var_s_7_.method3982((-86).toByte(), i_2_, i_3_))
                                        val i_9_ = (var_s.method3982((-86).toByte(), i_2_, i_3_ + 1) - var_s_7_.method3982((-86).toByte(), i_2_, i_3_ + 1))
                                        val i_10_ = (var_s.method3982((-86).toByte(), i_2_ + 1, i_3_ + 1) - var_s_7_.method3982((-86).toByte(), i_2_ + 1, i_3_ + 1))
                                        val i_11_ = (var_s.method3982((-86).toByte(), i_2_ + 1, i_3_) - var_s_7_.method3982((-86).toByte(), i_2_ + 1, i_3_))
                                        var_s_7_.CA(var_r, i_4_, ((i_8_ + i_9_ + i_10_ + i_11_) / 4), i_5_, 0, false)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        @JvmStatic
        fun method3438(i: Byte) {
            if (i > 39) aClass138_7274 = null
        }
    }
}
