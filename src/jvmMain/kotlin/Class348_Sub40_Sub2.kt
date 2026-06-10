/* Class348_Sub40_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub2 : Class348_Sub40(0, true) {
    private var anInt9095 = 1
    private var anInt9098 = 204
    private var anInt9099 = 1
    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_0_: Int) {
        anInt9100++
        val i_1_ = i
        while_132_@ do {
            do {
                if (i_1_ == 0) {
                    anInt9099 = class348_sub49.readUnsignedByte(i_0_ xor 0x79d8)
                    break@while_132_
                } else if (i_1_ != 1) {
                    if (i_1_ == 2) break
                    break@while_132_
                }
                anInt9095 = class348_sub49.readUnsignedByte(255)
                break@while_132_
            } while (false)
            anInt9098 = class348_sub49.readUnsignedShort(842397944)
        } while (false)
        if (i_0_ != 31015) method3042(-14, -114)
    }

    override fun method3042(i: Int, i_2_: Int): IntArray {
        anInt9097++
        val `is` = this.aClass191_7032!!.method1433(0, i)!!
        if (this.aClass191_7032!!.aBoolean2570) {
            var i_3_ = 0
            while ( /**/i_3_ < Class348_Sub40_Sub6.Companion.anInt9139) {
                val i_4_ = Class318_Sub6.anIntArray6432!![i_3_]
                val i_5_ = Class239_Sub18.anIntArray6035!![i]
                var i_6_ = anInt9099 * i_4_ shr 12
                val i_7_ = anInt9095 * i_5_ shr 12
                val i_8_ = i_4_ % (4096 / anInt9099) * anInt9099
                val i_9_ = i_5_ % (4096 / anInt9095) * anInt9095
                if (i_9_ < anInt9098) {
                    i_6_ -= i_7_
                    while (i_6_ < 0) {
                        i_6_ += 4
                    }
                    while ( /**/i_6_ > 3) {
                        i_6_ -= 4
                    }
                    if (i_6_ != 1) {
                        `is`[i_3_] = 0
                        i_3_++
                        continue
                    }
                    if (anInt9098 > i_8_) {
                        `is`[i_3_] = 0
                        i_3_++
                        continue
                    }
                }
                if (i_8_ < anInt9098) {
                    i_6_ -= i_7_
                    while (i_6_ < 0) {
                        i_6_ += 4
                    }
                    while ( /**/i_6_ > 3) {
                        i_6_ -= 4
                    }
                    if (i_6_ > 0) {
                        `is`[i_3_] = 0
                        i_3_++
                        continue
                    }
                }
                `is`[i_3_] = 4096
                i_3_++
            }
        }
        if (i_2_ != 255) anIntArray9096 = null
        return `is`
    }

    companion object {
        @JvmField
        var anIntArray9096: IntArray? = IntArray(2)
        @JvmField
        var anInt9097: Int = 0
        @JvmField
        var anInt9100: Int = 0
        var anInt9101: Int = -1

        @JvmStatic
        fun method3053(i: Int) {
            if (i == 4) anIntArray9096 = null
        }
    }
}
