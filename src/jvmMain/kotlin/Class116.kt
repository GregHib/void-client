import Class286_Sub5.Companion.method2161
import Class348_Sub31.Companion.method3014
import java.io.IOException

object Class116 {
    var anInt1758: Int = 0
    @JvmField
    var shiftClick: Boolean = true
    @JvmField
    var anInt1760: Int = 0
    @JvmField
    var aString1761: String? = null
    var aClass114_1762: Class114? = null

    @JvmStatic
    fun method1062(i: Byte) {
        if (i.toInt() == 35) {
            aClass114_1762 = null
            aString1761 = null
        }
    }

    @JvmStatic
    fun method1063(i: Int) {
        if (i != 1) aString1761 = null
        anInt1760++
        var class234: Class234? = null
        try {
            val class144 = Class348_Sub23_Sub1.aClass297_8992!!.method2233(((-46).toByte()).toByte(), "2", true)
            while (class144!!.anInt1997 == 0) method2161(63.toByte(), 1L)
            if (class144.anInt1997 == 1) {
                class234 = class144.anObject1998 as Class234
                val `is` = ByteArray(class234!!.method1662(((-46).toByte()).toByte()).toInt())
                var i_0_: Int
                var i_1_ = 0
                while (`is`.size > i_1_) {
                    i_0_ = class234.method1656(`is`, i_1_, ((-12).toByte()).toByte(), `is`.size + -i_1_)
                    if (i_0_ == -1) throw IOException("EOF")
                    i_1_ += i_0_
                }
                method3014(Class348_Sub49(`is`), ((-40).toByte()).toByte())
            }
        } catch (exception: Exception) {
            /* empty */
        }
        do {
            try {
                if (class234 == null) break
                class234.method1657(false)
            } catch (exception: Exception) {
                break
            }
            break
        } while (false)
    }

    init {
        aClass114_1762 = Class114(50, -1)
    }
}
