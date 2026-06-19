import ChatEffectsOptionStateStatics.anInt5858
import ChatEffectsOptionStateStatics.anInt5861
import ChatEffectsOptionStateStatics.anInt5862
import ChatEffectsOptionStateStatics.anInt5864
import ChatEffectsOptionStateStatics.anInt5866
import ChatEffectsOptionStateStatics.anInt5867
import ChatEffectsOptionStateStatics.anInt5869
import ChatEffectsOptionStateStatics.anInt5871

/* Class239_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
class ChatEffectsOptionState : GraphicsOptionState {
    override fun method1712(i: Int, i_0_: Int) {
        this.anInt3138 = i_0_
        anInt5862++
        val i_1_ = -40 / ((i - 82) / 35)
    }

    fun method1727(i: Int): Int {
        if (i != -32350) anInt5871 = 39
        anInt5869++
        return this.anInt3138
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    override fun method1710(i: Int): Int {
        if (i != 20014) anInt5871 = -72
        anInt5867++
        return 0
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    fun method1729(i: Int): Boolean {
        if (i <= 85) return true
        anInt5861++
        return true
    }

    override fun method1716(bool: Boolean) {
        anInt5864++
        if (method1735(bool)) {
            if (this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1830((-97).toByte()) && !HeadIconRendererStatics.method1210((-94).toByte(), this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1829(-32350))) this.anInt3138 = 1
            if (this.aClass348_Sub51_3136.aClass239_Sub8_7254!!.method1751(-32350) == 1) this.anInt3138 = 1
        }
        if (this.anInt3138 == 3) this.anInt3138 = 2
        if (bool != false) method1716(true)
        if (this.anInt3138 < 0 || this.anInt3138 > 3) this.anInt3138 = method1710(20014)
    }

    override fun method1714(i: Int, i_24_: Int): Int {
        anInt5866++
        if (LruByteCacheStatics.method576(i_24_, 29)) {
            if (this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1830((-97).toByte()) && !HeadIconRendererStatics.method1210((-113).toByte(), this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1829(-32350))) return 3
            if (this.aClass348_Sub51_3136.aClass239_Sub8_7254!!.method1751(-32350) == 1) return 3
        }
        if (i_24_ == i) return 3
        if (LruByteCacheStatics.method576(i_24_, i xor 0x56)) return 2
        return 1
    }

    fun method1735(bool: Boolean): Boolean {
        if (bool != false) anInt5871 = -86
        anInt5858++
        return LruByteCacheStatics.method576(this.anInt3138, 29)
    }
}
