import FlickeringEffectsOptionStateStatics.anInt5911
import FlickeringEffectsOptionStateStatics.anInt5913
import FlickeringEffectsOptionStateStatics.anInt5914
import FlickeringEffectsOptionStateStatics.anInt5915
import FlickeringEffectsOptionStateStatics.anInt5917
import FlickeringEffectsOptionStateStatics.anIntArrayArray5921
import FlickeringEffectsOptionStateStatics.anInt5923
import FlickeringEffectsOptionStateStatics.method1749

/* Class239_Sub8 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class FlickeringEffectsOptionState : GraphicsOptionState {
    override fun method1710(i: Int): Int {
        if (i != 20014) method1749(null, null, false, 94, (-39).toByte())
        anInt5914++
        if (this.aClass348_Sub51_3136.method3428((-80).toByte())!!.method1456(111.toByte())) return 3
        return 2
    }

    fun method1751(i: Int): Int {
        anInt5917++
        if (i != -32350) anInt5911 = 114
        return this.anInt3138
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    override fun method1712(i: Int, i_7_: Int) {
        val i_8_ = -87 / ((i - 82) / 35)
        anInt5915++
        this.anInt3138 = i_7_
    }

    override fun method1714(i: Int, i_9_: Int): Int {
        if (i != 3) anInt5911 = 95
        anInt5923++
        return 1
    }

    override fun method1716(bool: Boolean) {
        anInt5913++
        if (this.anInt3138 < 1 || this.anInt3138 > 3) this.anInt3138 = method1710(20014)
        if (bool != false) anIntArrayArray5921 = null
    }
}
