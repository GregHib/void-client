import NoOpGraphicsOptionStateStatics.anInt6039
import NoOpGraphicsOptionStateStatics.anInt6041
import NoOpGraphicsOptionStateStatics.anInt6043
import NoOpGraphicsOptionStateStatics.anInt6044
import NoOpGraphicsOptionStateStatics.anInt6045
import NoOpGraphicsOptionStateStatics.anInt6046

/* Class239_Sub19 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class NoOpGraphicsOptionState : GraphicsOptionState {
    override fun method1710(i: Int): Int {
        anInt6041++
        if (i != 20014) return -14
        return 0
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    override fun method1716(bool: Boolean) {
        anInt6045++
        if (bool != false) anInt6043 = 2
    }

    override fun method1714(i: Int, i_0_: Int): Int {
        if (i != 3) anInt6043 = 15
        anInt6039++
        return 1
    }

    override fun method1712(i: Int, i_2_: Int) {
        anInt6046++
        this.anInt3138 = i_2_
        val i_3_ = -25 / ((82 - i) / 35)
    }

    fun method1805(i: Int): Int {
        if (i != -32350) return -40
        anInt6044++
        return this.anInt3138
    }
}
