import ShadowQualityOptionStateStatics.anInt6007
import ShadowQualityOptionStateStatics.anInt6008
import ShadowQualityOptionStateStatics.anInt6010
import ShadowQualityOptionStateStatics.anInt6011
import ShadowQualityOptionStateStatics.anInt6012
import ShadowQualityOptionStateStatics.anInt6014
import ShadowQualityOptionStateStatics.anInt6015
import ShadowQualityOptionStateStatics.anInt6017

/* Class239_Sub16 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ShadowQualityOptionState : GraphicsOptionState {
    override fun method1714(i: Int, i_5_: Int): Int {
        if (i != 3) anInt6012 = -22
        anInt6014++
        if (i_5_ == 0 || this.aClass348_Sub51_3136.aClass239_Sub9_7256!!.method1759(i xor 0x7e5e.inv()) == 1) return 1
        return 2
    }

    override fun method1716(bool: Boolean) {
        if (bool != false) anInt6012 = 46
        if (this.anInt3138 != 0 && this.aClass348_Sub51_3136.aClass239_Sub9_7256!!.method1759(-32350) != 1) this.anInt3138 = 0
        anInt6007++
        if (this.anInt3138 < 0 || this.anInt3138 > 1) this.anInt3138 = method1710(20014)
    }

    fun method1789(i: Int): Int {
        if (i != -32350) anInt6008 = 32
        anInt6017++
        return this.anInt3138
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    override fun method1712(i: Int, i_6_: Int) {
        anInt6011++
        val i_7_ = -19 / ((i - 82) / 35)
        this.anInt3138 = i_6_
    }

    fun method1790(i: Int): Boolean {
        if (i < 85) anInt6012 = -109
        anInt6015++
        return true
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    override fun method1710(i: Int): Int {
        if (i != 20014) method1789(40)
        anInt6010++
        return 1
    }
}
