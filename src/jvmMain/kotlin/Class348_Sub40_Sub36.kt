import kotlin.math.sqrt

/* Class348_Sub40_Sub36 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub36 : Class348_Sub40(0, true) {
    private var anInt9451 = 0
    private var anInt9453 = 1
    private var anInt9455 = 0
    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_0_: Int) {
        anInt9450++
        if (i_0_ != 31015) anInt9451 = -15
        val i_1_ = i
        while_211_@ do {
            do {
                if (i_1_ == 0) {
                    anInt9451 = class348_sub49.readUnsignedByte(255)
                    return
                } else if (i_1_ != 1) {
                    if (i_1_ == 3) break
                    break@while_211_
                }
                anInt9455 = class348_sub49.readUnsignedByte(255)
                return
            } while (false)
            anInt9453 = class348_sub49.readUnsignedByte(255)
        } while (false)
    }

    override fun method3044(i: Int) {
        Class220.method1605(26188)
        if (i <= 108) method3145(-17)
        anInt9452++
    }

    override fun method3042(i: Int, i_2_: Int): IntArray {
        anInt9454++
        val `is` = this.aClass191_7032!!.method1433(0, i)!!
        if (i_2_ != 255) anInt9451 = -74
        if (this.aClass191_7032!!.aBoolean2570) {
            val i_3_ = Class239_Sub18.anIntArray6035!![i]
            val i_4_ = -2048 + i_3_ shr 1
            var i_5_ = 0
            while ((i_5_ < Class348_Sub40_Sub6.Companion.anInt9139)) {
                val i_6_ = Class318_Sub6.anIntArray6432!![i_5_]
                val i_7_ = -2048 + i_6_ shr 1
                var i_8_: Int
                if (anInt9451 == 0) i_8_ = anInt9453 * (-i_3_ + i_6_)
                else {
                    val i_9_ = i_7_ * i_7_ + i_4_ * i_4_ shr 12
                    i_8_ = (4096.0 * sqrt((i_9_.toFloat() / 4096.0f).toDouble())).toInt()
                    i_8_ = (3.141592653589793 * (anInt9453 * i_8_).toDouble()).toInt()
                }
                i_8_ -= 0xfff.inv() and i_8_
                if (anInt9455 != 0) {
                    if (anInt9455 == 2) {
                        i_8_ -= 2048
                        if (i_8_ < 0) i_8_ = -i_8_
                        i_8_ = 2048 - i_8_ shl 1
                    }
                } else i_8_ = 4096 + (Class235.anIntArray3068!![i_8_ shr 4 and 0xff]) shr 1
                `is`[i_5_] = i_8_
                i_5_++
            }
        }
        return `is`
    }

    companion object {
        @JvmField
        var anInt9450: Int = 0
        @JvmField
        var anInt9452: Int = 0
        @JvmField
        var anInt9454: Int = 0
        @JvmField
        var aClass114_9456: Class114? = null

        @JvmStatic
        fun method3145(i: Int) {
            if (i != 0) aClass114_9456 = null
            aClass114_9456 = null
        }
    }
}
