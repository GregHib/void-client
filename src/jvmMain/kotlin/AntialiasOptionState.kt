import AntialiasOptionStateStatics.anInt6077
import AntialiasOptionStateStatics.anInt6078
import AntialiasOptionStateStatics.anInt6079
import AntialiasOptionStateStatics.anInt6080
import AntialiasOptionStateStatics.anInt6082
import AntialiasOptionStateStatics.anInt6083

/* Class239_Sub23 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class AntialiasOptionState : GraphicsOptionState {
    override fun method1710(i: Int): Int {
        anInt6077++
        if (i != 20014) return -71
        if (!this.aClass348_Sub51_3136.method3425(-109)) {
            if (this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1830((-107).toByte()) && GlRectangleTextureStatics.method252(this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1829(-32350), 5126)) return 1
            return 0
        }
        return 2
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    override fun method1716(bool: Boolean) {
        if (bool == false) {
            if (this.aClass348_Sub51_3136.method3425(-68)) this.anInt3138 = 2
            anInt6079++
            if (this.anInt3138 < 0 || this.anInt3138 > 2) this.anInt3138 = method1710(20014)
        }
    }

    fun method1817(i: Int): Boolean {
        if (i < 85) return false
        anInt6078++
        return !this.aClass348_Sub51_3136.method3425(-108)
    }

    fun method1818(i: Int): Int {
        if (i != -32350) return 29
        anInt6082++
        return this.anInt3138
    }

    override fun method1714(i: Int, i_0_: Int): Int {
        if (i != 3) method1716(true)
        anInt6080++
        if (this.aClass348_Sub51_3136.method3425(-109)) return 3
        return 1
    }

    override fun method1712(i: Int, i_3_: Int) {
        anInt6083++
        this.anInt3138 = i_3_
        val i_4_ = 7 % ((82 - i) / 35)
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)
}
