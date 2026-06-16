/* Class348_Sub7 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub7 internal constructor(var anInt6649: Int, var anInt6648: Int, var anInt6645: Int, var anInt6647: Int, var anInt6642: Int, var aBoolean6650: Boolean) : Class348() {
    companion object {
        var anInt6641: Int = 0
        var aClass207_6643: Class207? = null
        var aClass229_6644: Class229? = Class229()
        var anInt6646: Int = 0
        var aLong6651: Long = -1L
        var anInt6652: Int = 0
        var aClass33_6653: Class33? = null

        fun method2772(i: Int, i_0_: Byte) {
            anInt6641++
            if (Class320.method2547(i, 84.toByte()) && i_0_ > 105) {
                val class46s = Class348_Sub40_Sub33.aClass46ArrayArray9427!![i]!!
                for (i_1_ in class46s.indices) {
                    val class46 = class46s[i_1_]
                    if (class46 != null) {
                        class46.anInt795 = 0
                        class46.anInt730 = 1
                        class46.anInt841 = 0
                    }
                }
            }
        }

        fun method2773(i: Int) {
            aClass207_6643 = null
            aClass229_6644 = null
            if (i == 0) aClass33_6653 = null
        }
    }
}
