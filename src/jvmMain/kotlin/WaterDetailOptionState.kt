import WaterDetailOptionStateStatics.anInt5982
import WaterDetailOptionStateStatics.anInt5984
import WaterDetailOptionStateStatics.anInt5986
import WaterDetailOptionStateStatics.anInt5987
import WaterDetailOptionStateStatics.anInt5988
import WaterDetailOptionStateStatics.aModelLightingConfig_5990
import WaterDetailOptionStateStatics.aSoundEnvelopeArray5993

class WaterDetailOptionState : GraphicsOptionState {
    fun method1778(i: Int): Int {
        if (i != -32350) aModelLightingConfig_5990 = null
        anInt5984++
        return this.anInt3138
    }

    override fun method1716(bool: Boolean) {
        if (this.aClass348_Sub51_3136.aClass239_Sub3_7222!!.method1735(bool) && this.anInt3138 == 2) this.anInt3138 = 1
        anInt5988++
        if (this.anInt3138 < 0 || this.anInt3138 > 2) this.anInt3138 = method1710(20014)
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    override fun method1712(i: Int, i_8_: Int) {
        this.anInt3138 = i_8_
        anInt5987++
        val i_9_ = -73 / ((82 - i) / 35)
    }

    override fun method1710(i: Int): Int {
        anInt5982++
        if (i != 20014) aSoundEnvelopeArray5993 = null
        return 2
    }

    override fun method1714(i: Int, i_10_: Int): Int {
        if (i != 3) return 23
        anInt5986++
        return 1
    }
}
