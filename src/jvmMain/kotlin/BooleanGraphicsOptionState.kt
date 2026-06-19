import NoiseTextureGeneratorStatics.method544
import BooleanGraphicsOptionStateStatics.anInt5841
import BooleanGraphicsOptionStateStatics.anInt5842
import BooleanGraphicsOptionStateStatics.anInt5843
import BooleanGraphicsOptionStateStatics.anInt5844
import BooleanGraphicsOptionStateStatics.anInt5846
import BooleanGraphicsOptionStateStatics.anInt5850

/* Class239_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class BooleanGraphicsOptionState : GraphicsOptionState {
    fun method1720(i: Int): Int {
        anInt5843++
        if (i != -32350) method1714(82, -89)
        return this.anInt3138
    }

    override fun method1716(bool: Boolean) {
        if (this.anInt3138 != 1 && this.anInt3138 != 0) this.anInt3138 = method1710(20014)
        if (bool == false) anInt5846++
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    override fun method1714(i: Int, i_8_: Int): Int {
        if (i != 3) anInt5850 = 94
        anInt5841++
        return 1
    }

    override fun method1712(i: Int, i_9_: Int) {
        val i_10_ = -57 / ((82 - i) / 35)
        anInt5844++
        this.anInt3138 = i_9_
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    override fun method1710(i: Int): Int {
        if (i != 20014) anInt5850 = -72
        anInt5842++
        return 1
    }
}
