/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
abstract class Class130 {
    companion object {
        @JvmField
        var aClass60_1894: Class60? = Class60(5)
        @JvmField
        var aClass356_1895: Class356? = Class356(64)
        @JvmField
        var anInt1896: Int = 0
        @JvmField
        var aClass45_1897: Class45? = null
        @JvmField
        var anInt1898: Int = 0
        @JvmField
        var aBoolean1899: Boolean = false
        @JvmField
        var aBoolean1900: Boolean = false

        @JvmStatic
        fun method1127(i: Int) {
            aClass45_1897 = null
            aClass356_1895 = null
            if (i == 5125) aClass60_1894 = null
        }

        @JvmStatic
        fun method1128(i: Int, class68: Class68?): Int {
            anInt1896++
            if (Class68.aClass68_1179 != class68) {
                if (class68 != Class68.aClass68_1181) {
                    if (class68 == Class68.aClass68_1182) return 5124
                    if (Class68.aClass68_1183 != class68) {
                        if (class68 != Class68.aClass68_1184) {
                            if (class68 == Class68.aClass68_1185) return 5125
                            if (Class68.aClass68_1186 != class68) {
                                if (Class68.aClass68_1187 == class68) return 5126
                            } else return 5131
                        } else return 5123
                    } else return 5121
                } else return 5122
            } else return 5120
            if (i > -19) method1129(-7, -90)
            throw IllegalArgumentException("")
        }

        @JvmStatic
        fun method1129(i: Int, i_0_: Int) {
            Class367_Sub9.anInt7379 = 3
            Class164.anInt2173 = i_0_
            Class34.anInt481 = -1
            Class348_Sub40_Sub30.anInt9399 = i
            anInt1898++
        }

        @JvmStatic
        fun method1130(var_r: r?, i: Int, i_1_: Int, i_2_: Int, bools: BooleanArray?): Boolean {
            var bool = false
            if (aa_Sub1.aSArray5191 != Class332.aSArray4142) {
                val i_3_ = Class348_Sub1_Sub1.aSArray8801!![i]!!.method3986(i_1_, i_2_, (-109).toByte())
                var i_4_ = 0
                while ( /**/i_4_ <= i) {
                    val var_s = Class348_Sub1_Sub1.aSArray8801!![i_4_]
                    if (var_s != null) {
                        val i_5_ = i_3_ - var_s.method3986(i_1_, i_2_, 72.toByte())
                        if (bools != null) {
                            bools[i_4_] = var_s.method3989(var_r, i_1_, i_5_, i_2_, 0, false)
                            if (!bools[i_4_]) {
                                i_4_++
                                continue
                            }
                        }
                        var_s.CA(var_r, i_1_, i_5_, i_2_, 0, false)
                        bool = true
                    }
                    i_4_++
                }
            }
            return bool
        }
    }
}
