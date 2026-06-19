import FlickeringEffectsOptionStateStatics.method1753
import LocConfigModelBuilderStatics.method3561
import ParticleDetailOptionStateStatics.aBoundsConstraintEntry_6018
import ParticleDetailOptionStateStatics.anInt6023
import ParticleDetailOptionStateStatics.anInt6024
import ParticleDetailOptionStateStatics.anInt6025
import ParticleDetailOptionStateStatics.anInt6027
import ParticleDetailOptionStateStatics.anInt6028

/* Class239_Sub17 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ParticleDetailOptionState : GraphicsOptionState {
    override fun method1714(i: Int, i_7_: Int): Int {
        anInt6023++
        if (i != 3) return 49
        return 1
    }

    override fun method1712(i: Int, i_8_: Int) {
        val i_9_ = -117 % ((82 - i) / 35)
        this.anInt3138 = i_8_
        anInt6025++
    }

    override fun method1716(bool: Boolean) {
        if (this.anInt3138 < 0 && this.anInt3138 > 4) this.anInt3138 = method1710(20014)
        anInt6024++
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    fun method1798(i: Int): Int {
        anInt6028++
        if (i != -32350) return 61
        return this.anInt3138
    }

    override fun method1710(i: Int): Int {
        if (i != 20014) aBoundsConstraintEntry_6018 = null
        anInt6027++
        if (this.aClass348_Sub51_3136.method3428((-96).toByte())!!.method1462(-113) > 1) return 4
        return 2
    }
}
