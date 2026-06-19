import GroundDecorOptionStateStatics.anInt5974
import GroundDecorOptionStateStatics.anInt5975
import GroundDecorOptionStateStatics.anInt5977
import GroundDecorOptionStateStatics.anInt5978
import GroundDecorOptionStateStatics.anInt5979
import GroundDecorOptionStateStatics.anInt5980

/* Class239_Sub13 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class GroundDecorOptionState : GraphicsOptionState {
    fun method1776(i: Int): Int {
        if (i != -32350) anInt5980 = 42
        anInt5978++
        return this.anInt3138
    }

    override fun method1716(bool: Boolean) {
        if (this.aClass348_Sub51_3136.method3422(674) == GlRectangleTextureStatics.aSceneProjector_8638) this.anInt3138 = 2
        if (bool == false) {
            anInt5974++
            if (this.anInt3138 < 0 || this.anInt3138 > 2) this.anInt3138 = method1710(20014)
        }
    }

    override fun method1714(i: Int, i_0_: Int): Int {
        if (i != 3) return 3
        anInt5979++
        return 1
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    override fun method1712(i: Int, i_1_: Int) {
        anInt5977++
        this.anInt3138 = i_1_
        val i_2_ = -54 / ((82 - i) / 35)
    }

    override fun method1710(i: Int): Int {
        anInt5975++
        if (i != 20014) return 70
        return 1
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)
}
