import SimpleBinaryOptionStateStatics.method1816
import SimpleBinaryOptionStateStatics.anInt6070
import SimpleBinaryOptionStateStatics.anInt6071
import SimpleBinaryOptionStateStatics.anInt6072
import SimpleBinaryOptionStateStatics.anInt6073
import SimpleBinaryOptionStateStatics.anInt6074
import SimpleBinaryOptionStateStatics.anInt6076

/* Class239_Sub22 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SimpleBinaryOptionState : GraphicsOptionState {
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

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    fun method1815(i: Int): Int {
        if (i != -32350) method1816(84)
        anInt6071++
        return this.anInt3138
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    override fun method1714(i: Int, i_2_: Int): Int {
        anInt6073++
        if (i != 3) anInt6076 = -121
        return 1
    }
}
