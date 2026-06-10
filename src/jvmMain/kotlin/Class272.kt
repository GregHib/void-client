import java.io.IOException
import java.net.Socket

abstract class Class272 {
    @JvmField
    var anInt3470: Int = 0
    @JvmField
    var aString3476: String? = null

    @Throws(IOException::class)
    fun method2047(i: Byte): Socket {
        anInt3472++
        if (i <= 84) anIntArray3475 = null
        return Socket(this.aString3476, this.anInt3470)
    }

    @Throws(IOException::class)
    abstract fun method2050(i: Int): Socket?

    companion object {
        @JvmField
        var anInt3471: Int = 0
        @JvmField
        var anInt3472: Int = 0
        @JvmField
        var anInt3473: Int = 0
        @JvmField
        var anInt3474: Int = 0
        @JvmField
        var anIntArray3475: IntArray? = intArrayOf(1, 4, 1, 2)
        @JvmStatic
        fun method2048(i: Int) {
            anIntArray3475 = null
            if (i != 1) anInt3473 = -69
        }

        @JvmStatic
        fun method2049(i: Int) {
            anInt3474++
            if (i > 49) {
                if (Class240.anInt4674 == 7) Class348_Sub40_Sub34.method3141(false, 11.toByte())
                else {
                    Class213.aClass238_2773 = Class348_Sub40_Sub8.aClass238_9165
                    Class348_Sub40_Sub8.aClass238_9165 = null
                    Class348_Sub49.method3379(2, 13)
                }
            }
        }

        @JvmStatic
        fun method2051(i: Int, i_0_: Int, class221: Class221?, class341: Class341?, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Byte, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) {
            try {
                Class95.aClass221_1542 = class221
                Class239_Sub3.anInt5871 = i_7_
                Class239_Sub27.aClass341_6128 = class341
                Class86.anInt1479 = i
                Class348_Sub7.aClass207_6643 = null
                Class295.anInt3762 = i_8_
                Class348_Sub40_Sub1.aClass207_9090 = null
                Class289.anInt3704 = i_3_
                Class20.anInt317 = i_5_
                anInt3471++
                Class269.anInt3451 = i_0_
                OutputStream_Sub1.anInt98 = i_2_
                Class290.anInt3712 = i_6_
                Class112.aClass207_1727 = null
                Class348_Sub32.anInt6938 = i_1_
                Class359.method3490(true)
                val i_9_ = -77 % ((i_4_ - 29) / 34)
                Class295.aBoolean3763 = true
            } catch (runtimeexception: RuntimeException) {
                throw Class348_Sub17.method2929(runtimeexception, ("uu.E(" + i + ',' + i_0_ + ',' + (if (class221 != null) "{...}" else "null") + ',' + (if (class341 != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'))
            }
        }
    }
}
