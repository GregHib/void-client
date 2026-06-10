import java.io.IOException

abstract class Class238 {
    abstract fun method1700(i: Byte)

    @Throws(IOException::class)
    abstract fun method1701(i: Int, i_0_: Int, i_1_: Byte, `is`: ByteArray): Int

    abstract fun method1702(i: Int)

    @Throws(IOException::class)
    abstract fun method1705(i: Int, i_6_: Int): Boolean

    @Throws(IOException::class)
    abstract fun method1706(i: Int, i_7_: Int, i_8_: Int, `is`: ByteArray)

    companion object {
        @JvmField
        var anInt3132: Int = 0
        @JvmField
        var aClass114_3133: Class114? = null

        @JvmStatic
        fun method1703(i: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int) {
            anInt3132++
            val class348_sub42_sub15 = Class318_Sub9_Sub1.method2516(i_2_, 105.toByte(), i_4_) //4
            class348_sub42_sub15.method3246(-25490)
            class348_sub42_sub15.anInt9651 = i_3_
            class348_sub42_sub15.anInt9652 = i
            class348_sub42_sub15.anInt9650 = i_5_
        }

        @JvmStatic
        fun method1704(i: Byte) {
            if (i >= -90) aClass114_3133 = null
            aClass114_3133 = null
        }
    }
}
