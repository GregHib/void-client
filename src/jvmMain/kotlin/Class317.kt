/* Class317 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class317 {
    private var anInt3967 = 0
    private var anInt3968 = 0
    private val aClass80Array3969: Array<Class80?>

    fun method2369(): Class348_Sub19_Sub1 {
        val `is` = method2371()
        return Class348_Sub19_Sub1(22050, `is`, 22050 * anInt3967 / 1000, 22050 * anInt3968 / 1000)
    }

    fun method2370(): Int {
        var i = 9999999
        for (i_0_ in 0..9) {
            if (aClass80Array3969[i_0_] != null && aClass80Array3969[i_0_]!!.anInt1407 / 20 < i) i = aClass80Array3969[i_0_]!!.anInt1407 / 20
        }
        if (anInt3967 < anInt3968 && anInt3967 / 20 < i) i = anInt3967 / 20
        if (i == 9999999 || i == 0) return 0
        for (i_1_ in 0..9) {
            if (aClass80Array3969[i_1_] != null) aClass80Array3969[i_1_]!!.anInt1407 -= i * 20
        }
        if (anInt3967 < anInt3968) {
            anInt3967 -= i * 20
            anInt3968 -= i * 20
        }
        return i
    }

    private fun method2371(): ByteArray {
        var i = 0
        for (i_2_ in 0..9) {
            if (aClass80Array3969[i_2_] != null && (aClass80Array3969[i_2_]!!.anInt1421 + aClass80Array3969[i_2_]!!.anInt1407) > i) i = (aClass80Array3969[i_2_]!!.anInt1421 + aClass80Array3969[i_2_]!!.anInt1407)
        }
        if (i == 0) return ByteArray(0)
        val i_3_ = 22050 * i / 1000
        val `is` = ByteArray(i_3_)
        for (i_4_ in 0..9) {
            if (aClass80Array3969[i_4_] != null) {
                val i_5_ = (aClass80Array3969[i_4_]!!.anInt1421 * 22050 / 1000)
                val i_6_ = (aClass80Array3969[i_4_]!!.anInt1407 * 22050 / 1000)
                val is_7_ = (aClass80Array3969[i_4_]!!.method809(i_5_, aClass80Array3969[i_4_]!!.anInt1421))
                for (i_8_ in 0..<i_5_) {
                    var i_9_ = `is`[i_8_ + i_6_] + (is_7_!![i_8_] shr 8)
                    if ((i_9_ + 128 and 0xff.inv()) != 0) i_9_ = i_9_ shr 31 xor 0x7f
                    `is`[i_8_ + i_6_] = i_9_.toByte()
                }
            }
        }
        return `is`
    }

    private constructor(class348_sub49: Class348_Sub49) {
        aClass80Array3969 = arrayOfNulls<Class80>(10)
        for (i in 0..9) {
            val i_10_ = class348_sub49.readUnsignedByte(255)
            if (i_10_ != 0) {
                class348_sub49.anInt7197--
                aClass80Array3969[i] = Class80()
                aClass80Array3969[i]!!.method807(class348_sub49)
            }
        }
        anInt3967 = class348_sub49.readUnsignedShort(842397944)
        anInt3968 = class348_sub49.readUnsignedShort(842397944)
    }

    private constructor() {
        aClass80Array3969 = arrayOfNulls<Class80>(10)
    }

    companion object {
        fun method2372(class45: Class45, i: Int, i_11_: Int): Class317? {
            val `is` = class45.method410(-1860, i, i_11_)
            if (`is` == null) return null
            return Class317(Class348_Sub49(`is`))
        }
    }
}
