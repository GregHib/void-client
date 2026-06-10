import Class104.Companion.method958
import Class62.method599
import java.awt.Canvas

class Class284 {
    @JvmField
    var anInt3666: Int = 0
    @JvmField
    var anInt3667: Int = 0
    @JvmField
    var anInt3668: Int = 0
    @JvmField
    var anInt3669: Int = 0
    @JvmField
    var anInt3670: Int = 0
    @JvmField
    var anInt3671: Int = 0
    @JvmField
    var anInt3672: Int = 0
    @JvmField
    var anInt3673: Int = 0
    @JvmField
    var anInt3675: Int = 0
    @JvmField
    var anInt3678: Int = 0
    @JvmField
    var anInt3679: Int = 0
    @JvmField
    var anInt3680: Int = 0

    fun method2115(class284_0_: Class284, bool: Boolean): Boolean {
        if (bool != true) return true
        anInt3664++
        return class284_0_.anInt3673 == this.anInt3673 && (this.anInt3667 == class284_0_.anInt3667) && (this.anInt3671 == class284_0_.anInt3671)
    }

    companion object {
        var anInt3664: Int = 0
        var anInt3665: Int = 0
        var anInt3674: Int = 0
        var anInt3676: Int = 0
        var anIntArrayArray3677: Array<IntArray?>? = arrayOf<IntArray?>(intArrayOf(2, 4, 6, 0), intArrayOf(0, 2, 4, 6), intArrayOf(0, 2, 4), intArrayOf(4, 0, 2), intArrayOf(2, 4, 0), intArrayOf(0, 2, 4), intArrayOf(6, 0, 1, 2, 4, 5), intArrayOf(0, 4, 7, 6), intArrayOf(4, 7, 6, 0), intArrayOf(0, 8, 6, 2, 9, 4), intArrayOf(2, 9, 4, 0, 8, 6), intArrayOf(2, 11, 4, 6, 10, 0), intArrayOf(2, 4, 6, 0))
        fun method2116(i: Int): Int {
            anInt3665++
            var var_ha = Class348_Sub8.aHa6654
            var bool = false
            if (Class316.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(i + -5766) != 0) {
                val canvas = Canvas()
                canvas.setSize(100, 100)
                var_ha = method958(true, 0, null, 0, canvas, null)
                bool = true
            }
            val l = method599(i + 26482)
            for (i_1_ in 0..9999) var_ha!!.method3676(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1)
            val i_2_ = (-l + method599(-71)).toInt()
            if (i != -26584) method2116(-124)
            var_ha!!.method3675(100, (-125).toByte(), 0, 0, 100, -16777216)
            if (bool) var_ha.method3635(121.toByte())
            return i_2_
        }

        @JvmStatic
        fun method2117(i: Int) {
            if (i == 0) anIntArrayArray3677 = null
        }

        fun method2118(i: Byte): Class246? {
            anInt3674++
            try {
                if (i.toInt() != -42) anInt3676 = -23
                return Class246_Sub1()
            } catch (throwable: Throwable) {
                return null
            }
        }
    }
}
