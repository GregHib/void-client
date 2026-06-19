import kotlin.math.cos
import kotlin.math.sin
import LightingOptionStateStatics.anInt5872
import LightingOptionStateStatics.anInt5873
import LightingOptionStateStatics.anInt5875
import LightingOptionStateStatics.anInt5877
import LightingOptionStateStatics.anInt5879
import LightingOptionStateStatics.anInt5880
import LightingOptionStateStatics.aString5882
import LightingOptionStateStatics.aIntRange_5883

/* Class239_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
class LightingOptionState : GraphicsOptionState {
    override fun method1716(bool: Boolean) {
        if (bool != false) method1736(-57)
        anInt5880++
        if (this.aClass348_Sub51_3136.method3422(674) != ParticleEmitterNodeStatics.aSceneProjector_186) this.anInt3138 = 1
        else if (this.aClass348_Sub51_3136.method3425(-95)) this.anInt3138 = 0
        if (this.anInt3138 != 0 && this.anInt3138 != 1) this.anInt3138 = method1710(20014)
    }

    override fun method1712(i: Int, i_0_: Int) {
        val i_1_ = 107 / ((i - 82) / 35)
        anInt5879++
        this.anInt3138 = i_0_
    }

    fun method1736(i: Int): Boolean {
        anInt5873++
        if (this.aClass348_Sub51_3136.method3425(-80)) return false
        if (i < 85) method1716(true)
        return this.aClass348_Sub51_3136.method3422(674) == ParticleEmitterNodeStatics.aSceneProjector_186
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    override fun method1710(i: Int): Int {
        if (i != 20014) aIntRange_5883 = null
        anInt5877++
        return 1
    }

    fun method1737(i: Int): Int {
        if (i != -32350) method1716(true)
        anInt5875++
        return this.anInt3138
    }

    override fun method1714(i: Int, i_2_: Int): Int {
        if (i != 3) aString5882 = null
        anInt5872++
        if (this.aClass348_Sub51_3136.method3425(-63)) return 3
        if (this.aClass348_Sub51_3136.method3422(674) == ParticleEmitterNodeStatics.aSceneProjector_186) return 1
        return 3
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)
}
