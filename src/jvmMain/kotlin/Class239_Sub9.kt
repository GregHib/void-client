/* Class239_Sub9 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub9 : Class239 {
    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    override fun method1712(i: Int, i_0_: Int) {
        anInt5925++
        val i_1_ = -123 % ((82 - i) / 35)
        this.anInt3138 = i_0_
    }

    fun method1757(i: Int): Boolean {
        anInt5927++
        if (this.aClass348_Sub51_3136.method3425(-122)) return false
        if (i < 85) method1759(117)
        return this.aClass348_Sub51_3136.method3422(674) == Class10.aClass230_186
    }

    override fun method1714(i: Int, i_2_: Int): Int {
        anInt5926++
        if (this.aClass348_Sub51_3136.method3425(-114)) return 3
        if (this.aClass348_Sub51_3136.method3422(674) == Class10.aClass230_186) {
            if (i_2_ == 0) {
                if (this.aClass348_Sub51_3136.aClass239_Sub16_7247!!.method1789(-32350) == 1) return 2
                if (this.aClass348_Sub51_3136.aClass239_Sub24_7235!!.method1820(i + -32353) == 1) return 2
                if (this.aClass348_Sub51_3136.aClass239_Sub18_7259!!.method1800(-32350) > 0) return 2
            }
            return 1
        }
        if (i != 3) method1710(57)
        return 3
    }

    override fun method1716(bool: Boolean) {
        anInt5931++
        if (bool != false) aClass351_5929 = null
        if (this.aClass348_Sub51_3136.method3422(674) != Class10.aClass230_186) this.anInt3138 = 1
        else if (this.aClass348_Sub51_3136.method3425(-125)) this.anInt3138 = 0
        if (this.anInt3138 != 0 && this.anInt3138 != 1) this.anInt3138 = method1710(20014)
    }

    fun method1759(i: Int): Int {
        anInt5930++
        if (i != -32350) method1714(-83, -18)
        return this.anInt3138
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    override fun method1710(i: Int): Int {
        if (i != 20014) aClass351_5934 = null
        anInt5928++
        return 1
    }

    companion object {
        @JvmField
        var anInt5925: Int = 0
        @JvmField
        var anInt5926: Int = 0
        @JvmField
        var anInt5927: Int = 0
        @JvmField
        var anInt5928: Int = 0
        @JvmField
        var aClass351_5929: Class351? = Class351(25, 3)
        @JvmField
        var anInt5930: Int = 0
        @JvmField
        var anInt5931: Int = 0
        @JvmField
        var aClass230_5932: Class230? = Class230("game4", 3)
        @JvmField
        var aClass105Array5933: Array<Class105?>? = null
        @JvmField
        var aClass351_5934: Class351? = Class351(78, 16)

        @JvmStatic
        fun method1758(i: Int) {
            if (i != -16211) aClass351_5934 = null
            aClass230_5932 = null
            aClass351_5929 = null
            aClass105Array5933 = null
            aClass351_5934 = null
        }
    }
}
