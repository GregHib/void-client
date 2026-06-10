import Class374.method3610
import java.io.File
import java.io.IOException

object Class327 {
    var anInt4090: Int = 0
    var aClass273_4091: Class273? = Class273("", 10)
    var anInt4092: Int = 0
    var anInt4093: Int = 0
    var aClass351_4094: Class351? = Class351(47, 4)
    @JvmField
    var anInt4095: Int = 0
    @JvmField
    var anIntArray4096: IntArray? = IntArray(32)
    @JvmField
    var anIntArray4097: IntArray? = IntArray(2)
    var aClass74_4098: Class74? = Class74(4, 7)

    @JvmStatic
    fun method2604(i: Byte) {
        aClass273_4091 = null
        if (i >= -49) method2606(31, -15L)
        aClass74_4098 = null
        aClass351_4094 = null
        anIntArray4096 = null
        anIntArray4097 = null
    }

    fun method2605(i: Byte): Boolean {
        anInt4092++
        if (i.toInt() != -99) anIntArray4097 = null
        return Class348_Sub43.anInt7068 != 0
    }

    fun method2606(i: Int, l: Long) {
        try {
            anInt4090++
            try {
                Thread.sleep(l)
                val i_0_ = 107 % ((-80 - i) / 35)
            } catch (interruptedexception: InterruptedException) {
                /* empty */
            }
        } catch (runtimeexception: RuntimeException) {
            throw Class348_Sub17.method2929(runtimeexception, "de.A(" + i + ',' + l + ')')
        }
    }

    fun method2607(i: Int, file: File?, i_1_: Int): ByteArray? {
        anInt4093++
        try {
            val i_2_ = -87 / ((28 - i_1_) / 54)
            val `is` = ByteArray(i)
            method3610(`is`, 7.toByte(), i, file)
            return `is`
        } catch (ioexception: IOException) {
            return null
        }
    }
}
