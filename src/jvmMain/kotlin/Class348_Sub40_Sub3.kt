/* Class348_Sub40_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub40_Sub3 : Class348_Sub40(1, true) {
    private var anInt9104 = 0
    private var anInt9107 = 4096
    override fun method3049(class348_sub49: Class348_Sub49, i: Int, i_0_: Int) {
        val i_1_ = i
        do {
            if (i_1_ == 0) {
                anInt9104 = class348_sub49.readUnsignedShort(842397944)
                break
            } else if (i_1_ != 1) break
            anInt9107 = class348_sub49.readUnsignedShort(842397944)
        } while (false)
        anInt9102++
        if (i_0_ != 31015) method3056(-75, 18, 53)
    }

    override fun method3042(i: Int, i_3_: Int): IntArray {
        anInt9110++
        if (i_3_ != 255) anInt9107 = -121
        val `is` = this.aClass191_7032!!.method1433(i_3_ + -255, i)!!
        if (this.aClass191_7032!!.aBoolean2570) {
            val is_4_ = this.method3048(i, 633706337, 0)!!
            var i_5_ = 0
            while ((Class348_Sub40_Sub6.Companion.anInt9139 > i_5_)) {
                val i_6_ = is_4_[i_5_]
                `is`[i_5_] = if (i_6_ >= anInt9104 && (i_6_ <= anInt9107)) 4096 else 0
                i_5_++
            }
        }
        return `is`
    }

    companion object {
        @JvmField
        var anInt9102: Int = 0
        @JvmField
        var aBoolean9103: Boolean = false
        @JvmField
        var anInt9105: Int = 0
        @JvmField
        var anInt9106: Int = 0
        @JvmField
        var anInt9108: Int = 0
        @JvmField
        var anInt9109: Int = 104
        @JvmField
        var anInt9110: Int = 0

        fun method3054(bool: Boolean, i: Int, i_2_: Int) {
            anInt9105++
            if (i_2_ < -127) {
                val class348_sub13 = Class258_Sub4.method1974((-122).toByte(), i, bool)
                if (class348_sub13 != null) class348_sub13.method2715(97.toByte())
            }
        }

        @JvmStatic
        fun method3055(i: Int, class304: Class304?): Int {
            anInt9106++
            if (i < 94) method3054(false, -98, -116)
            if (class304 != Class348_Sub45.aClass304_7103) {
                if (Class108.aClass304_1662 == class304) return 6408
                if (class304 == Class348_Sub40_Sub38.Companion.aClass304_9471) return 6406
                if (Class348_Sub40_Sub22.Companion.aClass304_9303 != class304) {
                    if (class304 == Class191.aClass304_2571) return 6410
                    if (class304 == Class318.aClass304_3977) return 6145
                } else return 6409
            } else return 6407
            throw IllegalStateException()
        }

        @JvmStatic
        fun method3056(i: Int, i_7_: Int, i_8_: Int): Boolean {
            if (i < 0) anInt9109 = 114
            anInt9108++
            return (0x22 and i_7_) != 0
        }
    }
}
