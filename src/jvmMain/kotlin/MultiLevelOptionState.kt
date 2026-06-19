import MultiLevelOptionStateStatics.anInt6145
import MultiLevelOptionStateStatics.anInt6146
import MultiLevelOptionStateStatics.aBoolean6147
import MultiLevelOptionStateStatics.anInt6148
import MultiLevelOptionStateStatics.anInt6150
import MultiLevelOptionStateStatics.anInt6151
import MultiLevelOptionStateStatics.anInt6153

/* Class239_Sub29 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MultiLevelOptionState : GraphicsOptionState {
    fun method1848(i: Int): Int {
        if (i != -32350) method1714(100, 29)
        anInt6145++
        return this.anInt3138
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    override fun method1710(i: Int): Int {
        anInt6153++
        if (i != 20014) method1716(true)
        return 0
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    override fun method1712(i: Int, i_0_: Int) {
        val i_1_ = -10 / ((i - 82) / 35)
        this.anInt3138 = i_0_
        anInt6148++
    }

    override fun method1714(i: Int, i_10_: Int): Int {
        anInt6146++
        if (i != 3) aBoolean6147 = false
        return 1
    }

    override fun method1716(bool: Boolean) {
        if (this.anInt3138 < 0 || this.anInt3138 > 4) this.anInt3138 = method1710(20014)
        anInt6150++
        if (bool != false) anInt6151 = 62
    }
}
