/* Class348_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
abstract class Class348_Sub1 internal constructor(var anInt6562: Int, var anInt6548: Int, var anInt6553: Int, private val anInt6554: Int, private val anInt6545: Int, var aFloat6550: Float) : Class348() {
    abstract fun method2716(i: Int, f: Float)

    fun method2717(i: Byte): Int {
        if (i <= 69) method2719(74)
        anInt6549++
        return this.anInt6553
    }

    fun method2720(i: Int): Int {
        if (i != -1) this.anInt6562 = -97
        anInt6552++
        return anInt6545
    }

    fun method2721(i: Int): Float {
        if (i >= -7) return 0.08188432f
        anInt6557++
        return this.aFloat6550
    }

    fun method2722(i: Int): Int {
        if (i <= 119) return -23
        anInt6556++
        return this.anInt6548
    }

    fun method2723(i: Int): Int {
        if (i != -1) return -46
        anInt6546++
        return anInt6554
    }

    fun method2724(i: Int): Int {
        if (i != -1) method2725(53, (-84).toByte(), -7, -12)
        anInt6563++
        return this.anInt6562
    }

    abstract fun method2725(i: Int, i_0_: Byte, i_1_: Int, i_2_: Int)

    companion object {
        @JvmField
        var anInt6546: Int = 0
        @JvmField
        var anIntArray6547: IntArray? = null
        @JvmField
        var anInt6549: Int = 0
        @JvmField
        var anInt6551: Int = 0
        @JvmField
        var anInt6552: Int = 0
        @JvmField
        var anInt6555: Int = 0
        @JvmField
        var anInt6556: Int = 0
        @JvmField
        var anInt6557: Int = 0
        @JvmField
        var aBoolean6558: Boolean = false
        @JvmField
        var aClass185_6559: Class185? = null
        @JvmField
        var anInt6560: Int = 0
        @JvmField
        var aClass46_6561: Class46? = null
        @JvmField
        var anInt6563: Int = 0

        @JvmStatic
        fun method2718(i: Int) {
            if (i >= -95) method2719(90)
            anInt6560++
            if (Class239_Sub13.anInt5976 != -1) {
                Class24.method298(false, -1, -1, Class239_Sub13.anInt5976, -67)
                Class239_Sub13.anInt5976 = -1
            }
        }

        @JvmStatic
        fun method2719(i: Int) {
            if (i != 11339) method2719(87)
            aClass46_6561 = null
            anIntArray6547 = null
            aClass185_6559 = null
        }
    }
}
