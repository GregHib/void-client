import Class256.method1943
import Class262.Companion.method1992
import Class318_Sub9_Sub2.Companion.method2519
import java.awt.Image

class Class342 internal constructor(var anInt4245: Int, var anInt4244: Int) {
    @JvmField
    var anInt4238: Int = 0
    @JvmField
    var anInt4239: Int = 0
    @JvmField
    var anInt4240: Int = 0
    var aClass342_4248: Class342? = null
    @JvmField
    var aClass101_4252: Class101? = null
    fun method2685(i: Byte): Class174 {
        if (i.toInt() != -13) method2683(null, null, -120, 35, -33, null, 90, 71, null)
        anInt4243++
        return method1943(false, this.anInt4245)
    }

    fun method2687(i: Byte, i_11_: Int): Class342? {
        anInt4241++
        if (i < 61) return null
        return Class342(this.anInt4245, i_11_)
    }

    companion object {
        var anInt4241: Int = 0
        var anInt4242: Int = 0
        var anInt4243: Int = 0
        var aClass364_4246: Class364? = Class364("WTI", 5)
        var aClass70_4247: Class70?
        var anImage4249: Image? = null
        var anIntArray4250: IntArray? = IntArray(64)
        var anInt4251: Int = 0
        @JvmField
        var anIntArrayArray4253: Array<IntArray?>? = null
        var aClass60_4254: Class60?

        @JvmStatic
        fun method2682(i: Int) {
            aClass364_4246 = null
            anIntArrayArray4253 = null
            if (i > 5) {
                aClass70_4247 = null
                anIntArray4250 = null
                aClass60_4254 = null
                anImage4249 = null
            }
        }

        fun method2683(class323: Class323?, class348_sub21: Class348_Sub21?, i: Int, i_0_: Int, i_1_: Int, var_ha: ha?, i_2_: Int, i_3_: Int, class42: Class42?) {
            var i_2_ = i_2_
            try {
                if (i_0_ == 64) {
                    anInt4242++
                    val i_4_ = -5 + i - i_3_ / 2
                    val i_5_ = i_2_ - -2
                    if (class42!!.anInt602 != 0) var_ha!!.method3675(i_3_ + 10, (-125).toByte(), i_4_, i_5_, (i_2_ - -(class323!!.method2565() * i_1_) - (i_5_ - 1)), class42.anInt602)
                    if (class42.anInt604 != 0) var_ha!!.method3668(i_3_ + 10, i_5_, class42.anInt604, i_4_, (i_1_ * class323!!.method2565() + i_2_ - (i_5_ + -1)), 92)
                    var i_6_ = class42.anInt580
                    if (class348_sub21!!.aBoolean6848 && class42.anInt567 != -1) i_6_ = class42.anInt567
                    var i_7_ = 0
                    while (i_1_ > i_7_) {
                        var string = ha_Sub3.aStringArray8019!![i_7_]
                        if (-1 + i_1_ > i_7_) string = string!!.substring(0, -4 + string.length)
                        class323!!.method2563(var_ha!!, string!!, i, i_2_, i_6_, true)
                        i_2_ += class323.method2565()
                        i_7_++
                    }
                }
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("eca.A(" + (if (class323 != null) "{...}" else "null") + ',' + (if (class348_sub21 != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (if (var_ha != null) "{...}" else "null") + ',' + i_2_ + ',' + i_3_ + ',' + (if (class42 != null) "{...}" else "null") + ')'))
            }
        }

        fun method2684(i: Int, f: Float): Float {
            if (i != 6) aClass70_4247 = null
            anInt4251++
            return (f * (6.0f * f - 15.0f) + 10.0f) * (f * (f * f))
        }

        fun method2686() {
            for (i in Canvas_Sub1.anInt67..<Class189.anInt2524) {
                for (i_8_ in 0..<Class318_Sub7.anInt6451) {
                    for (i_9_ in 0..<Class348_Sub41.anInt7054) {
                        val class357 = Class147.aClass357ArrayArrayArray2029!![i]!![i_8_]!![i_9_]
                        if (class357 != null) {
                            val class318_sub1_sub4 = class357.aClass318_Sub1_Sub4_4406
                            val class318_sub1_sub4_10_ = class357.aClass318_Sub1_Sub4_4403
                            if (class318_sub1_sub4 != null && class318_sub1_sub4.method2388(-121)) {
                                method2519(class318_sub1_sub4, i, i_8_, i_9_, 1, 1)
                                if (class318_sub1_sub4_10_ != null && class318_sub1_sub4_10_.method2388(-125)) {
                                    method2519(class318_sub1_sub4_10_, i, i_8_, i_9_, 1, 1)
                                    class318_sub1_sub4_10_.method2380(Class9.aHa171, 0, false, class318_sub1_sub4, 0, (-110).toByte(), 0)
                                    class318_sub1_sub4_10_.method2392(true)
                                }
                                class318_sub1_sub4.method2392(true)
                            }
                            var class148 = class357.aClass148_4396
                            while (class148 != null) {
                                val class318_sub1_sub3 = (class148.aClass318_Sub1_Sub3_2040)
                                if (class318_sub1_sub3 != null && class318_sub1_sub3.method2388(-71)) {
                                    method2519(class318_sub1_sub3, i, i_8_, i_9_, (class318_sub1_sub3.aShort8751 - class318_sub1_sub3.aShort8743 + 1), (class318_sub1_sub3.aShort8747 - class318_sub1_sub3.aShort8750 + 1))
                                    class318_sub1_sub3.method2392(true)
                                }
                                class148 = class148.aClass148_2038
                            }
                            val class318_sub1_sub1 = class357.aClass318_Sub1_Sub1_4402
                            if (class318_sub1_sub1 != null && class318_sub1_sub1.method2388(-85)) {
                                method1992(class318_sub1_sub1, i, i_8_, i_9_)
                                class318_sub1_sub1.method2392(true)
                            }
                        }
                    }
                }
            }
        }

        init {
            aClass70_4247 = Class70()
            aClass60_4254 = Class60(32)
        }
    }
}
