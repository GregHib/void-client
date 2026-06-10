import Class156.Companion.method1242
import kotlin.concurrent.Volatile

/* Class250 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class250 : Runnable {
    @JvmField
    @Volatile
    var aClass279Array3218: Array<Class279?> = arrayOfNulls<Class279>(2)

    @JvmField
    @Volatile
    var aBoolean3221: Boolean = false

    @JvmField
    @Volatile
    var aBoolean3223: Boolean = false
    var aClass297_3228: Class297? = null

    override fun run() {
        this.aBoolean3223 = true
        anInt3224++
        try {
            while (!this.aBoolean3221) {
                for (i in 0..1) {
                    val class279 = this.aClass279Array3218[i]
                    if (class279 != null) class279.method2084(-6858)
                }
                Class286_Sub5.method2161((-107).toByte(), 10L)
                Class369_Sub3_Sub1.method3578((-42).toByte(), null, (this.aClass297_3228))
            }
        } catch (exception: Exception) {
            method1242(null, exception, 15004)
        } finally {
            this.aBoolean3223 = false
        }
    }

    companion object {
        var anInt3219: Int = 0
        @JvmField
        var anIntArray3220: IntArray? = null
        var anInt3222: Int = 0
        var anInt3224: Int = 0
        @JvmField
        var anInt3225: Int = 0
        @JvmField
        var aClass318_Sub1Array3226: Array<Class318_Sub1?>? = null
        @JvmField
        var anInt3227: Int = 0
        fun method1909(i: Byte, string: String): String {
            var string = string
            if (i.toInt() != 31) method1911(87.toByte())
            anInt3222++
            var string_0_: String? = null
            val i_1_ = string.indexOf("--> ")
            if (i_1_ >= 0) {
                string_0_ = string.substring(0, 4 + i_1_)
                string = string.substring(i_1_ + 4)
            }
            if (string.startsWith("directlogin ")) {
                val i_2_ = string.indexOf(" ", "directlogin ".length)
                if (i_2_ >= 0) {
                    val i_3_ = string.length
                    string = string.substring(0, i_2_) + " "
                    for (i_4_ in 1 + i_2_..<i_3_) string += "*"
                }
            }
            if (string_0_ == null) return string
            return string_0_ + string
        }

        @JvmStatic
        fun method1910(i: Int) {
            anIntArray3220 = null
            if (i != 0) method1910(-18)
            aClass318_Sub1Array3226 = null
        }

        @JvmStatic
        fun method1911(i: Byte) {
            if (i.toInt() != 99) anIntArray3220 = null
            Class367_Sub11.aClass32_7415 = Class32(8)
            anInt3219++
            Class318_Sub7.anInt6450 = 0
            var class318_sub10 = Class152.aClass243_2077!!.method1872(8) as Class318_Sub10?
            while (class318_sub10 != null) {
                class318_sub10.method2530()
                class318_sub10 = Class152.aClass243_2077!!.method1878((-115).toByte()) as Class318_Sub10?
            }
        }
    }
}
