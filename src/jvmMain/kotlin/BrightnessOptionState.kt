import BrightnessOptionStateStatics.anInt5896
import BrightnessOptionStateStatics.anInt5897
import BrightnessOptionStateStatics.anInt5898
import BrightnessOptionStateStatics.anInt5899
import BrightnessOptionStateStatics.aCompiledScriptCache_5900
import BrightnessOptionStateStatics.anInt5901
import BrightnessOptionStateStatics.anInt5903

/* Class239_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
class BrightnessOptionState : GraphicsOptionState {
    override fun method1710(i: Int): Int {
        if (i != 20014) method1712(-15, 91)
        anInt5898++
        return 0
    }

    fun method1743(i: Int): Int {
        anInt5896++
        if (i != -32350) return -65
        return this.anInt3138
    }

    fun method1744(i: Int): Boolean {
        if (i <= 85) method1743(-113)
        anInt5903++
        val i_0_ = this.aClass348_Sub51_3136.method3428((-93).toByte())!!.method1458(-23688)
        return i_0_ >= 96
    }

    override fun method1716(bool: Boolean) {
        anInt5897++
        val i = this.aClass348_Sub51_3136.method3428((-105).toByte())!!.method1458(-23688)
        if (i < 96) this.anInt3138 = 0
        if (bool != false) aCompiledScriptCache_5900 = null
        if (this.anInt3138 > 1 && i < 128) this.anInt3138 = 1
        if (this.anInt3138 > 2 && i < 192) this.anInt3138 = 2
        if (this.anInt3138 < 0 || this.anInt3138 > 3) this.anInt3138 = method1710(20014)
    }

    override fun method1714(i: Int, i_1_: Int): Int {
        anInt5899++
        val i_2_ = this.aClass348_Sub51_3136.method3428((-104).toByte())!!.method1458(i xor 0x5c84.inv())
        if (i_2_ < 96) return 3
        if (i_1_ > 1 && i_2_ < 128) return 3
        if (i_1_ > i && i_2_ < 192) return 3
        return 1
    }

    override fun method1712(i: Int, i_3_: Int) {
        val i_4_ = -32 / ((82 - i) / 35)
        anInt5901++
        this.anInt3138 = i_3_
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)
}
