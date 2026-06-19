import SimpleToggleOptionStateStatics.anInt5884
import SimpleToggleOptionStateStatics.anInt5886
import SimpleToggleOptionStateStatics.anInt5887
import SimpleToggleOptionStateStatics.anInt5888
import SimpleToggleOptionStateStatics.anInt5889
import SimpleToggleOptionStateStatics.anInt5891
import SimpleToggleOptionStateStatics.anInt5892

/* Class239_Sub5 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SimpleToggleOptionState : GraphicsOptionState {
    override fun method1710(i: Int): Int {
        anInt5892++
        if (i != 20014) return 98
        return 1
    }

    override fun method1712(i: Int, i_0_: Int) {
        this.anInt3138 = i_0_
        val i_1_ = 57 / ((i - 82) / 35)
        anInt5887++
    }

    fun method1739(i: Int): Int {
        anInt5889++
        if (i != -32350) anInt5886 = -17
        return this.anInt3138
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    override fun method1714(i: Int, i_13_: Int): Int {
        if (i != 3) anInt5891 = -34
        anInt5884++
        return 1
    }

    override fun method1716(bool: Boolean) {
        anInt5888++
        if (bool != false) method1710(-110)
        if (this.anInt3138 != 1 && this.anInt3138 != 0) this.anInt3138 = method1710(20014)
    }
}
