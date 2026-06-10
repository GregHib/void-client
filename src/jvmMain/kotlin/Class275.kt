import java.util.*

object Class275 {
    var aHashtable3548: Hashtable<Any?, Any?>? = Hashtable<Any?, Any?>()
    var anInt3549: Int = 0
    @JvmField
    var anInt3550: Int = 0
    @JvmField
    var anIntArray3551: IntArray?
    var anIntArray3552: IntArray? = IntArray(5)
    var anInt3553: Int = 0

    @JvmStatic
    fun method2064(i: Int, i_0_: Int, i_1_: Int, i_2_: Int): Int {
        anInt3549++
        if (aa_Sub1.aSArray5191 == null) return 0
        val i_3_ = i shr 9
        val i_4_ = i_2_ shr 9
        if (i_3_ < 0 || i_4_ < 0 || i_3_ > -1 + Class367_Sub4.anInt7319 || (i_4_ > Class348_Sub40_Sub3.anInt9109 + -1)) return 0
        var i_5_ = i_0_
        if (i_5_ < 3 && (Class348_Sub33.aByteArrayArrayArray6962!![1]!![i_3_]!![i_4_].toInt() and 0x2) != 0) i_5_++
        if (i_1_ != 11219) aHashtable3548 = null
        return aa_Sub1.aSArray5191!![i_5_]!!.method3986(i, i_2_, (-113).toByte())
    }

    @JvmStatic
    fun method2065(i: Int) {
        anIntArray3552 = null
        anIntArray3551 = null
        aHashtable3548 = null
        if (i != 31913) anInt3550 = 52
    }

    @JvmStatic
    fun method2066(i: Byte): Boolean {
        anInt3553++
        if (Class240.anInt4674 < 1) return false
        if (i < 101) method2065(66)
        return true
    }

    init {
        anIntArray3551 = intArrayOf(2047, 16383, 65535)
    }
}
