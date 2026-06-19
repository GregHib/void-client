import java.io.File
import SceneryDetailOptionStateStatics.anInt6084
import SceneryDetailOptionStateStatics.anInt6085
import SceneryDetailOptionStateStatics.anInt6087
import SceneryDetailOptionStateStatics.anInt6090
import SceneryDetailOptionStateStatics.anInt6091
import SceneryDetailOptionStateStatics.anInt6092
import SceneryDetailOptionStateStatics.aLruByteCache_6096

class SceneryDetailOptionState : GraphicsOptionState {
    override fun method1712(i: Int, i_0_: Int) {
        val i_1_ = -73 % ((i - 82) / 35)
        this.anInt3138 = i_0_
        anInt6085++
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    fun method1820(i: Int): Int {
        if (i != -32350) return -43
        anInt6091++
        return this.anInt3138
    }

    override fun method1710(i: Int): Int {
        if (i != 20014) return -20
        anInt6084++
        return 1
    }

    override fun method1714(i: Int, i_3_: Int): Int {
        anInt6092++
        if (this.aClass348_Sub51_3136.method3422(674) == ParticleEmitterNodeStatics.aSceneProjector_186) {
            if (this.aClass348_Sub51_3136.method3425(i + -70)) return 3
            if (i_3_ == 0 || this.aClass348_Sub51_3136.aClass239_Sub9_7256!!.method1759(-32350) == 1) return 1
            return 2
        }
        if (i != 3) method1716(true)
        return 3
    }

    override fun method1716(bool: Boolean) {
        if (this.aClass348_Sub51_3136.method3422(674) != ParticleEmitterNodeStatics.aSceneProjector_186) this.anInt3138 = 1
        else if (this.aClass348_Sub51_3136.method3425(-95)) this.anInt3138 = 0
        anInt6090++
        if (this.anInt3138 != 0 && this.anInt3138 != 1) this.anInt3138 = method1710(20014)
        if (bool != false) aLruByteCache_6096 = null
    }

    fun method1824(i: Int): Boolean {
        anInt6087++
        if (this.aClass348_Sub51_3136.method3422(674) == ParticleEmitterNodeStatics.aSceneProjector_186) {
            return !this.aClass348_Sub51_3136.method3425(-96)
        }
        return false
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)
}
