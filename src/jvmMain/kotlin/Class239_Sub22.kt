/* Class239_Sub22 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub22 : Class239 {
    override fun method1710(i: Int): Int {
        anInt6072++
        if (i != 20014) return 63
        return 1
    }

    override fun method1716(bool: Boolean) {
        if (this.anInt3138 != 1 && this.anInt3138 != 0) this.anInt3138 = method1710(20014)
        anInt6070++
        if (bool != false) anInt6076 = 59
    }

    override fun method1712(i: Int, i_0_: Int) {
        anInt6074++
        this.anInt3138 = i_0_
        val i_1_ = 126 / ((82 - i) / 35)
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    fun method1815(i: Int): Int {
        if (i != -32350) method1816(84)
        anInt6071++
        return this.anInt3138
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(class348_sub51)

    override fun method1714(i: Int, i_2_: Int): Int {
        anInt6073++
        if (i != 3) anInt6076 = -121
        return 1
    }

    companion object {
        @JvmField
        var anInt6070: Int = 0
        @JvmField
        var anInt6071: Int = 0
        @JvmField
        var anInt6072: Int = 0
        @JvmField
        var anInt6073: Int = 0
        @JvmField
        var anInt6074: Int = 0
        @JvmField
        var aClass114_6075: Class114? = Class114(89, 0)
        @JvmField
        var anInt6076: Int = 0

        @JvmStatic
        fun method1816(i: Int) {
            aClass114_6075 = null
            if (i != 1) aClass114_6075 = null
        }
    }
}
