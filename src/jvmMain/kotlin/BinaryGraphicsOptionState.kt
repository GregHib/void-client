import BinaryGraphicsOptionStateStatics.method1767
import BinaryGraphicsOptionStateStatics.anInt5952
import BinaryGraphicsOptionStateStatics.anInt5954
import BinaryGraphicsOptionStateStatics.anInt5955
import BinaryGraphicsOptionStateStatics.anInt5956
import BinaryGraphicsOptionStateStatics.anInt5958

/* Class239_Sub11 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class BinaryGraphicsOptionState : GraphicsOptionState {
    fun method1768(i: Int): Int {
        if (i != -32350) method1767(true, -55)
        anInt5958++
        return this.anInt3138
    }

    override fun method1710(i: Int): Int {
        anInt5956++
        if (i != 20014) return -48
        return 0
    }

    override fun method1716(bool: Boolean) {
        if (bool != false) method1716(false)
        anInt5954++
        if (this.anInt3138 != 1 && this.anInt3138 != 0) this.anInt3138 = method1710(20014)
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    override fun method1712(i: Int, i_2_: Int) {
        anInt5952++
        this.anInt3138 = i_2_
        val i_3_ = 98 / ((82 - i) / 35)
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    override fun method1714(i: Int, i_15_: Int): Int {
        if (i != 3) return 94
        anInt5955++
        return 1
    }
}
