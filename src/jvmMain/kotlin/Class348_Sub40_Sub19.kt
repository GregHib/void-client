import Class324.Companion.method2570
import Class348_Sub6.Companion.method2769

/* Class348_Sub40_Sub19 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub19 : Class348_Sub40(0, true) {
    override fun method3042(i: Int, i_3_: Int): IntArray? {
        if (i_3_ != 255) aClass114_9254 = null
        anInt9256++
        return Class318_Sub6.anIntArray6432
    }

    companion object {
        @JvmField
        var anInt9253: Int = 0
        @JvmField
        var aClass114_9254: Class114? = Class114(73, 3)
        @JvmField
        var anInt9255: Int = 0
        @JvmField
        var anInt9256: Int = 0
        @JvmField
        var aClass114_9257: Class114?
        @JvmField
        var anInt9258: Int = 0
        @JvmField
        var anIntArray9259: IntArray? = IntArray(2)

        /*synthetic*/
        var aClass9260: Class<*>? = null

        fun method3097(class46s: Array<Class46?>, i: Int, i_0_: Int) {
            if (i_0_ >= 116) {
                var i_1_ = 0
                while (class46s.size > i_1_) {
                    val class46 = class46s[i_1_]
                    if (class46 != null) {
                        if (class46.anInt774 == 0) {
                            if (class46.aClass46Array798 != null) method3097(class46.aClass46Array798!!, i, 125)
                            val class348_sub41 = ((Class125.aClass356_4915!!.method3480(class46.anInt830.toLong(), -6008)) as Class348_Sub41?)
                            if (class348_sub41 != null) Class239_Sub12.method1775((-8).toByte(), (class348_sub41.anInt7050), i)
                        }
                        if (i == 0 && class46.anObjectArray840 != null) {
                            val class348_sub36 = Class348_Sub36()
                            class348_sub36.aClass46_6989 = class46
                            class348_sub36.anObjectArray6987 = class46.anObjectArray840
                            Class66.method705(class348_sub36)
                        }
                        if (i == 1 && class46.anObjectArray701 != null) {
                            if (class46.anInt704 >= 0) {
                                val class46_2_ = method2570(1512932720, (class46.anInt830))
                                if (class46_2_ == null || (class46_2_.aClass46Array798 == null) || (class46.anInt704 >= (class46_2_.aClass46Array798!!).size) || class46 != (class46_2_.aClass46Array798!![class46.anInt704])) {
                                    i_1_++
                                    continue
                                }
                            }
                            val class348_sub36 = Class348_Sub36()
                            class348_sub36.aClass46_6989 = class46
                            class348_sub36.anObjectArray6987 = class46.anObjectArray701
                            Class66.method705(class348_sub36)
                        }
                    }
                    i_1_++
                }
                anInt9258++
            }
        }

        @JvmStatic
        fun method3098(i: Int, string: String?): Boolean {
            if (i != -30282) return true
            anInt9255++
            if (aClass9260 == null) {
                aClass9260 = Class90::class.java
            }
            return method2769(aClass9260, 20.toByte(), string)
        }

        @JvmStatic
        fun method3099(i: Byte) {
            aClass114_9254 = null
            aClass114_9257 = null
            anIntArray9259 = null
            if (i >= -63) anIntArray9259 = null
        }

        @JvmStatic
        fun method3100(i: Int, bool: Boolean, i_4_: Int): Boolean {
            anInt9253++
            if (bool != false) anIntArray9259 = null
            return Class230.method1637(i, 32768, i_4_) or ((0x800 and i_4_) != 0) || Class273.method2056(i_4_, 86, i)
        }

        init {
            aClass114_9257 = Class114(102, 3)
        }
    }
}
