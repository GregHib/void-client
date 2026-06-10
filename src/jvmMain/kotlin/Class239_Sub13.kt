/* Class239_Sub13 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class239_Sub13 : Class239 {
    fun method1776(i: Int): Int {
        if (i != -32350) anInt5980 = 42
        anInt5978++
        return this.anInt3138
    }

    override fun method1716(bool: Boolean) {
        if (this.aClass348_Sub51_3136.method3422(674) == Class14_Sub4.aClass230_8638) this.anInt3138 = 2
        if (bool == false) {
            anInt5974++
            if (this.anInt3138 < 0 || this.anInt3138 > 2) this.anInt3138 = method1710(20014)
        }
    }

    override fun method1714(i: Int, i_0_: Int): Int {
        if (i != 3) return 3
        anInt5979++
        return 1
    }

    internal constructor(i: Int, class348_sub51: Class348_Sub51) : super(i, class348_sub51)

    override fun method1712(i: Int, i_1_: Int) {
        anInt5977++
        this.anInt3138 = i_1_
        val i_2_ = -54 / ((82 - i) / 35)
    }

    override fun method1710(i: Int): Int {
        anInt5975++
        if (i != 20014) return 70
        return 1
    }

    internal constructor(class348_sub51: Class348_Sub51) : super(class348_sub51)

    companion object {
        @JvmField
        var anInt5974: Int = 0
        @JvmField
        var anInt5975: Int = 0
        @JvmField
        var anInt5976: Int = 0
        @JvmField
        var anInt5977: Int = 0
        @JvmField
        var anInt5978: Int = 0
        @JvmField
        var anInt5979: Int = 0
        @JvmField
        var anInt5980: Int = 0
        @JvmField
        var anInt5981: Int = 0

        @JvmStatic
        fun method1777(i: Int, class318_sub1_sub3_sub3: Class318_Sub1_Sub3_Sub3?) {
            if (i == -3) {
                if (class318_sub1_sub3_sub3 is Npc) {
                    val npc = class318_sub1_sub3_sub3
                    if (npc.aClass79_10505 != null) Class286_Sub3.method2150(((Class132.aPlayer_1907!!.plane) != (npc.plane)), false, npc)
                } else if (class318_sub1_sub3_sub3 is Player) {
                    val player = class318_sub1_sub3_sub3
                    Class348_Sub43.method3298(105.toByte(), ((player.plane) != (Class132.aPlayer_1907!!.plane)), player)
                }
                anInt5981++
            }
        }
    }
}
