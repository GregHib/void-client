import kotlin.math.pow

/* Class59_Sub1_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class59_Sub1_Sub2 : Class59_Sub1(8, 5, 8, 8, 2, 0.1f, 0.55f, 3.0f) {
    private lateinit var aByteArray8660: ByteArray
    override fun method550(i: Int, i_0_: Byte, i_1_: Byte) {
        anInt8659++
        var i_2_ = i * 2
        val i_3_ = i_0_.toInt() and 0xff
        aByteArray8660[i_2_++] = (i_3_ * 3 shr 5).toByte()
        if (i_1_.toInt() == 14) aByteArray8660[i_2_] = (i_3_ * 3 shr 5).toByte()
    }

    fun method562(i: Int, i_4_: Int, i_5_: Byte, i_6_: Int): ByteArray {
        aByteArray8660 = ByteArray(2 * i_6_ * (i_4_ * i))
        if (i_5_ <= 85) aClass273_8664 = null
        anInt8661++
        this.method542(i_4_, i, 0, i_6_)
        return aByteArray8660
    }

    companion object {
        @JvmField
        var anInt8659: Int = 0
        @JvmField
        var anInt8661: Int = 0
        @JvmField
        var aClass74_8662: Class74? = Class74(6, 5)
        var anIntArray8663: IntArray? = IntArray(120)
        @JvmField
        var aClass273_8664: Class273?
        @JvmField
        var anInt8665: Int = 0
        @JvmField
        var anIntArray8666: IntArray? = null

        @JvmStatic
        fun method561(i: Int) {
            aClass74_8662 = null
            if (i != 120) method561(-85)
            anIntArray8666 = null
            anIntArray8663 = null
            aClass273_8664 = null
        }

        init {
            var i = 0
            for (i_7_ in 0..119) {
                val i_8_ = i_7_ - -1
                val i_9_ = (300.0 * 2.0.pow(i_8_.toDouble() / 7.0) + i_8_.toDouble()).toInt()
                i += i_9_
                anIntArray8663!![i_7_] = i / 4
            }
            aClass273_8664 = Class273("", 17)
        }
    }
}
