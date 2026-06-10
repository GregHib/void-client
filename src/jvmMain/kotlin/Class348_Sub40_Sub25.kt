/* Class348_Sub40_Sub25 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub25 : Class348_Sub40(0, true) {
    private var anInt9338 = 0
    private var anInt9339 = 0
    private var anInt9340 = 1365
    private var anInt9343 = 20

    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_0_: Int) {
        val i_1_ = i
        while_200_@ do {
            while_199_@ do {
                do {
                    if (i_1_ == 0) {
                        anInt9340 = class348_sub49.readUnsignedShort(842397944)
                        break@while_200_
                    } else if (i_1_ != 1) {
                        if (i_1_ != 2) {
                            if (i_1_ != 3) break@while_200_
                        } else break
                        break@while_199_
                    }
                    anInt9343 = class348_sub49.readUnsignedShort(i_0_ + 842366929)
                    break@while_200_
                } while (false)
                anInt9339 = class348_sub49.readUnsignedShort(i_0_ + 842366929)
                break@while_200_
            } while (false)
            anInt9338 = class348_sub49.readUnsignedShort(842397944)
        } while (false)
        anInt9337++
    }

    override fun method3042(i: Int, i_2_: Int): IntArray? {
        anInt9336++
        val `is` = this.aClass191_7032!!.method1433(0, i)!!
        if (i_2_ != 255) return null
        if (this.aClass191_7032!!.aBoolean2570) {
            for (i_3_ in 0..<Class348_Sub40_Sub6.Companion.anInt9139) {
                val i_4_ = anInt9339 + (Class318_Sub6.anIntArray6432!![i_3_] shl 12) / anInt9340
                val i_5_ = anInt9338 + (Class239_Sub18.anIntArray6035!![i] shl 12) / anInt9340
                val i_6_ = i_4_
                val i_7_ = i_5_
                var i_8_ = i_4_
                var i_9_ = i_5_
                var i_10_ = i_4_ * i_4_ shr 12
                var i_11_ = i_5_ * i_5_ shr 12
                var i_12_: Int
                i_12_ = 0
                while ((i_11_ + i_10_ < 16384 && anInt9343 > i_12_)) {
                    i_9_ = i_7_ + 2 * (i_9_ * i_8_ shr 12)
                    i_8_ = i_6_ + i_10_ - i_11_
                    i_12_++
                    i_11_ = i_9_ * i_9_ shr 12
                    i_10_ = i_8_ * i_8_ shr 12
                }
                `is`[i_3_] = (if (i_12_ >= anInt9343 - 1) 0 else (i_12_ shl 12) / anInt9343)
            }
        }
        return `is`
    }

    companion object {
        @JvmField
        var anInt9335: Int = -1
        @JvmField
        var anInt9336: Int = 0
        @JvmField
        var anInt9337: Int = 0
        @JvmField
        var anInt9341: Int = 0
        @JvmField
        var aClass150_9342: Class150? = null
        @JvmStatic
        fun method3117(i: Int) {
            aClass150_9342 = null
            if (i < 10) anInt9335 = 113
        }
    }
}
