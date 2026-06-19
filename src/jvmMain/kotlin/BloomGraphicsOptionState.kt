import BloomGraphicsOptionStateStatics.method1773
import BloomGraphicsOptionStateStatics.anInt5960
import BloomGraphicsOptionStateStatics.anInt5961
import BloomGraphicsOptionStateStatics.anInt5962
import BloomGraphicsOptionStateStatics.anInt5963
import BloomGraphicsOptionStateStatics.anInt5965
import BloomGraphicsOptionStateStatics.anInt5970
import BloomGraphicsOptionStateStatics.anInt5972

/* Class239_Sub12 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class BloomGraphicsOptionState : GraphicsOptionState {
    override fun method1714(i: Int, i_0_: Int): Int {
        anInt5972++
        if (i != 3) return 121
        if (!LinkedListNodeStatics.method2714(7351, this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1829(-32350))) return 3
        return 1
    }

    fun method1771(i: Int): Int {
        anInt5960++
        if (i != -32350) method1714(80, -99)
        return this.anInt3138
    }

    override fun method1712(i: Int, i_1_: Int) {
        val i_2_ = -19 % ((82 - i) / 35)
        this.anInt3138 = i_1_
        anInt5963++
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    override fun method1716(bool: Boolean) {
        if (bool != false) method1716(false)
        anInt5962++
        if (this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1830((-119).toByte()) && !LinkedListNodeStatics.method2714(7351, this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1829(-32350))) this.anInt3138 = 0
        if (this.anInt3138 < 0 || this.anInt3138 > 1) this.anInt3138 = method1710(20014)
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    fun method1774(i: Int): Boolean {
        if (i < 85) method1773(116.toByte())
        anInt5961++
        return LinkedListNodeStatics.method2714(7351, this.aClass348_Sub51_3136.aClass239_Sub25_7271!!.method1829(-32350))
    }

    override fun method1710(i: Int): Int {
        anInt5970++
        if (i != 20014) anInt5965 = -58
        return 0
    }
}
