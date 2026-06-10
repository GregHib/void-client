/* Class239_Sub7 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub7 : Class239 {
    override fun method1714(i: Int, i_0_: Int): Int {
        anInt5905++
        if (this.aClass348_Sub51_3136.method3425(-93)) return 3
        if (this.aClass348_Sub51_3136.aClass239_Sub24_7235!!.method1820(i xor 0x7e5e.inv()) == 0) return 3
        if (i != 3) anInt5909 = -111
        return 1
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    override fun method1716(bool: Boolean) {
        if (this.aClass348_Sub51_3136.method3425(-82)) this.anInt3138 = 0
        anInt5904++
        if (this.aClass348_Sub51_3136.aClass239_Sub24_7235!!.method1820(-32350) == 0) this.anInt3138 = 0
        if (bool != false) method1712(-60, 72)
        if (this.anInt3138 < 0 || this.anInt3138 > 2) this.anInt3138 = method1710(20014)
    }

    override fun method1712(i: Int, i_1_: Int) {
        anInt5906++
        val i_2_ = -93 % ((82 - i) / 35)
        this.anInt3138 = i_1_
    }

    fun method1747(i: Int): Boolean {
        anInt5908++
        if (this.aClass348_Sub51_3136.method3425(-127)) return false
        if (this.aClass348_Sub51_3136.aClass239_Sub24_7235!!.method1820(-32350) == 0) return false
        if (i < 85) method1747(105)
        return true
    }

    fun method1748(i: Int): Int {
        if (i != -32350) return 111
        anInt5910++
        return this.anInt3138
    }

    override fun method1710(i: Int): Int {
        anInt5907++
        if (i != 20014) anInt5909 = 100
        return 2
    }

    companion object {
        @JvmField
        var anInt5904: Int = 0
        @JvmField
        var anInt5905: Int = 0
        @JvmField
        var anInt5906: Int = 0
        @JvmField
        var anInt5907: Int = 0
        @JvmField
        var anInt5908: Int = 0
        @JvmField
        var anInt5909: Int = -1
        @JvmField
        var anInt5910: Int = 0
    }
}
