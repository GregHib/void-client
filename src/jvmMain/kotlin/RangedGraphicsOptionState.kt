import RangedGraphicsOptionStateStatics.method1763
import RangedGraphicsOptionStateStatics.anInt5936
import RangedGraphicsOptionStateStatics.anInt5937
import RangedGraphicsOptionStateStatics.anInt5939
import RangedGraphicsOptionStateStatics.anInt5941
import RangedGraphicsOptionStateStatics.anInt5942

/* Class239_Sub10 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class RangedGraphicsOptionState : GraphicsOptionState {
    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    override fun method1716(bool: Boolean) {
        anInt5941++
        if (bool != false) method1712(-34, -61)
        if (this.anInt3138 < 0 || this.anInt3138 > 4) this.anInt3138 = method1710(20014)
    }

    override fun method1712(i: Int, i_8_: Int) {
        anInt5939++
        this.anInt3138 = i_8_
        val i_9_ = -17 / ((82 - i) / 35)
    }

    fun method1764(i: Int): Int {
        anInt5942++
        if (i != -32350) method1763(18)
        return this.anInt3138
    }

    override fun method1714(i: Int, i_14_: Int): Int {
        anInt5936++
        if (i != 3) method1710(-95)
        return 1
    }

    override fun method1710(i: Int): Int {
        if (i != 20014) return 118
        anInt5937++
        return 3
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)
}
