import Class318_Sub9_Sub1.Companion.method2516

/* Class348_Sub15 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub15 internal constructor(var anInt6773: Int, var aClass55_Sub1_6768: Class55_Sub1?, var anInt6782: Int, var aBoolean6776: Boolean) : Class348() {
    var aBoolean6772: Boolean = false
    var aBoolean6781: Boolean = false
    var aBoolean6783: Boolean = false

    companion object {
        var anInt6769: Int
        var anIntArray6770: IntArray? = IntArray(1000)
        var anInt6771: Int = 0
        var aDouble6774: Double = 0.0
        var anIntArray6775: IntArray? = IntArray(13)
        var anInt6777: Int = 0
        var anInt6778: Int = 0
        var anInt6779: Int = 0
        var anIntArrayArray6780: Array<IntArray?>? =
            arrayOf<IntArray?>(intArrayOf(12, 12, 12, 12), intArrayOf(12, 12, 12, 12, 12, 5), intArrayOf(5, 5, 1, 1), intArrayOf(5, 1, 1, 5), intArrayOf(5, 5, 5), intArrayOf(5, 5, 5), intArrayOf(12, 12, 12, 12, 12, 12), intArrayOf(1, 12, 12, 12, 12, 12), intArrayOf(1, 1, 7, 1), intArrayOf(8, 9, 9, 8, 8, 3, 1, 9), intArrayOf(8, 8, 9, 8, 9, 9), intArrayOf(10, 10, 11, 11, 11, 7, 3, 7), intArrayOf(12, 12, 12, 12))

        @JvmStatic
        fun method2810(i: Byte) {
            anIntArray6770 = null
            anIntArray6775 = null
            anIntArrayArray6780 = null
        }

        fun method2811(bool: Boolean) {
            anInt6777++
            if (Class348_Sub36.Companion.anInt6992 < 0) {
                Class348_Sub36.Companion.anInt6992 = 0
                Class244.anInt4609 = -1
                Class48.anInt859 = -1
            }
            if (Class348_Sub36.Companion.anInt6992 > Class75.anInt1259) {
                Class348_Sub36.Companion.anInt6992 = Class75.anInt1259
                Class48.anInt859 = -1
                Class244.anInt4609 = -1
            }
            if (Class245.anInt3170 < 0) {
                Class48.anInt859 = -1
                Class245.anInt3170 = 0
                Class244.anInt4609 = -1
            }
            if (Class75.anInt1267 < Class245.anInt3170) {
                Class245.anInt3170 = Class75.anInt1267
                Class244.anInt4609 = -1
                Class48.anInt859 = -1
            }
            if (bool != false) aDouble6774 = 1.5874482848681375
        }

        fun method2812(i: Int, class348_sub42_sub13: Class348_Sub42_Sub13): String {
            anInt6779++
            return (class348_sub42_sub13.aString9617 + " <col=ffffff>>")
        }

        fun method2813(bool: Boolean, i: Int, i_0_: Int) {
            anInt6778++
            val class348_sub42_sub15 = method2516(i_0_, 105.toByte(), 7)
            class348_sub42_sub15.method3246(-25490)
            if (bool != true) anInt6769 = -113
            class348_sub42_sub15.anInt9652 = i
        }

        fun method2814(class348_sub16: Class348_Sub16, i: Int) {
            class348_sub16.aBoolean6784 = false
            if (i >= 39) {
                if (class348_sub16.aClass348_Sub19_6787 != null) class348_sub16.aClass348_Sub19_6787!!.anInt6824 = 0
                anInt6771++
                var class348_sub16_1_ = class348_sub16.method2816()
                while (class348_sub16_1_ != null) {
                    method2814(class348_sub16_1_, 40)
                    class348_sub16_1_ = class348_sub16.method2818()
                }
            }
        }

        init {
            anInt6769 = -1
        }
    }
}
