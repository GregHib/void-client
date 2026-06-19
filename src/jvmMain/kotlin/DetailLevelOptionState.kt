import DetailLevelOptionStateStatics.anInt6115
import DetailLevelOptionStateStatics.anInt6116
import DetailLevelOptionStateStatics.anInt6117
import DetailLevelOptionStateStatics.anInt6119
import DetailLevelOptionStateStatics.anInt6123
import DetailLevelOptionStateStatics.anInt6124

/* Class239_Sub26 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class DetailLevelOptionState : GraphicsOptionState {
    override fun method1710(i: Int): Int {
        if (i != 20014) return 112
        anInt6116++
        return 127
    }

    override fun method1716(bool: Boolean) {
        if (bool != false) anInt6115 = 87
        if (this.anInt3138 < 0 && this.anInt3138 > 127) this.anInt3138 = method1710(20014)
        anInt6117++
    }

    override fun method1714(i: Int, i_5_: Int): Int {
        anInt6124++
        return 1
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    override fun method1712(i: Int, i_16_: Int) {
        val i_17_ = 63 % ((i - 82) / 35)
        anInt6119++
        this.anInt3138 = i_16_
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    fun method1838(i: Int): Int {
        anInt6123++
        return this.anInt3138
    }
}
