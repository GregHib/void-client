import Class318_Sub9_Sub1.Companion.method2516
import kotlin.concurrent.Volatile

/* Class348_Sub26 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub26 internal constructor(@field:Volatile var aString6888: String?) : Class348() {
    @Volatile
    var anInt6887: Int = -1

    companion object {
        var aClass348_Sub42_Sub14_6885: Class348_Sub42_Sub14? = null
        var anInt6886: Int = 0
        @JvmField
        var aShortArray6889: ShortArray?
        @JvmField
        var anIntArray6890: IntArray? = IntArray(32)
        var aClass74_6891: Class74?

        @JvmStatic
        fun method2998(i: Byte) {
            anIntArray6890 = null
            aClass348_Sub42_Sub14_6885 = null
            aClass74_6891 = null
            aShortArray6889 = null
            if (i.toInt() != -35) Companion.method2999((-26).toByte(), -20)
        }

        fun method2999(i: Byte, i_0_: Int) {
            anInt6886++
            val class348_sub42_sub15 = method2516(i_0_, 105.toByte(), 7)
            if (i < 42) method2999(62.toByte(), -64)
            class348_sub42_sub15.method3251(-16058)
        }

        init {
            aShortArray6889 = ShortArray(256)
            aClass74_6891 = Class74(1, 4)
        }
    }
}
