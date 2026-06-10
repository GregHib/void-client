import Class239_Sub18.Companion.method1802
import Class286_Sub3.Companion.method2148
import Class369_Sub1.Companion.method3570
import java.io.IOException

/* Class289 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class289 {
    var anInt3696: Int = 0
    @JvmField
    var aBoolean3697: Boolean = false
    var anInt3698: Int = 0
    @JvmField
    var anInt3699: Int
    @JvmField
    var aByteArrayArrayArray3700: Array<Array<ByteArray?>?>? = null
    @JvmField
    var aClass46_3701: Class46? = null
    var anInt3702: Int = 0
    var anInt3703: Int = 0
    @JvmField
    var anInt3704: Int = 0
    @JvmField
    var aClass262_3705: Class262? = null

    @JvmStatic
    fun method2191(i: Int) {
        if (i != 0) Class289.method2192((-74).toByte())
        aClass46_3701 = null
        aByteArrayArrayArray3700 = null
        aClass262_3705 = null
    }

    fun method2192(i: Byte) {
        Class250.anInt3227 = 0
        anInt3702++
        val i_0_ = (((Class132.aPlayer_1907!!.x) shr 9) - -za_Sub2.regionTileX)
        val i_1_ = (Class90.regionTileY + (Class132.aPlayer_1907!!.y shr 9))
        if (i.toInt() != 80) Class289.method2192((-34).toByte())
        if (i_0_ >= 3053 && i_0_ <= 3156 && i_1_ >= 3056 && i_1_ <= 3136) Class250.anInt3227 = 1
        if (i_0_ >= 3072 && i_0_ <= 3118 && i_1_ >= 9492 && i_1_ <= 9535) Class250.anInt3227 = 1
        if (Class250.anInt3227 == 1 && i_0_ >= 3139 && i_0_ <= 3199 && i_1_ >= 3008 && i_1_ <= 3062) Class250.anInt3227 = 0
    }

    @JvmStatic
    fun method2193(bool: Boolean, i: Byte) {
        anInt3698++
        method3570(false)
        if (Class334.method2653(true, Class240.anInt4674)) {
            Class11.anInt193++
            if (i < -118 && (Class11.anInt193 >= 50 || bool)) {
                Class11.anInt193 = 0
                if (!Class110.aBoolean1712 && Class348_Sub40_Sub8.aClass238_9165 != null) {
                    IOException_Sub1.anInt88++
                    val class348_sub47 = method2148((Class239_Sub10.aClass351_5938), (Class348_Sub23_Sub2.aClass77_9029), -106)
                    Class348_Sub42_Sub14.method3243(122, class348_sub47)
                    try {
                        method1802(0)
                    } catch (ioexception: IOException) {
                        Class110.aBoolean1712 = true
                    }
                }
                method3570(false)
            }
        }
    }

    @JvmStatic
    fun method2194(i: Int, class348_sub42_sub13: Class348_Sub42_Sub13?): Int {
        anInt3696++
        if (i != -1) return -42
        val string = Class348_Sub15.method2812(i + -43, class348_sub42_sub13!!)
        return Class369.aClass143_4962!!.method1186(string, Class341.aClass105Array4234, false)
    }

    init {
        anInt3699 = 0
    }
}
