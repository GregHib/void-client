import DefaultGraphicsOptionStateStatics.anInt6127
import DefaultGraphicsOptionStateStatics.aTileRenderState_6128
import DefaultGraphicsOptionStateStatics.anInt6130
import DefaultGraphicsOptionStateStatics.anInt6131
import DefaultGraphicsOptionStateStatics.anInt6132
import DefaultGraphicsOptionStateStatics.anInt6133

/* Class239_Sub27 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class DefaultGraphicsOptionState : GraphicsOptionState {
    fun method1840(i: Int): Int {
        anInt6127++
        if (i != -32350) aTileRenderState_6128 = null
        return this.anInt3138
    }

    override fun method1712(i: Int, i_26_: Int) {
        this.anInt3138 = i_26_
        anInt6132++
        val i_27_ = 123 / ((82 - i) / 35)
    }

    override fun method1714(i: Int, i_28_: Int): Int {
        if (i != 3) aTileRenderState_6128 = null
        anInt6130++
        return 3
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    override fun method1710(i: Int): Int {
        anInt6133++
        if (i != 20014) method1716(true)
        if ((this.aClass348_Sub51_3136.method3422(674) == ParticleEmitterNodeStatics.aSceneProjector_186) && this.aClass348_Sub51_3136.method3425(-111)) return 0
        return 1
    }

    override fun method1716(bool: Boolean) {
        anInt6131++
        this.anInt3138 = method1710(20014)
        if (bool != false) method1710(98)
    }
}
