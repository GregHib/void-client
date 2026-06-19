import RangedGraphicsOptionStateStatics.method1765
import kotlin.math.min
import RemoveRoofsOptionStateStatics.method1813
import RemoveRoofsOptionStateStatics.anInt6057
import RemoveRoofsOptionStateStatics.anInt6059
import RemoveRoofsOptionStateStatics.anIntArray6062
import RemoveRoofsOptionStateStatics.anInt6063
import RemoveRoofsOptionStateStatics.anInt6064
import RemoveRoofsOptionStateStatics.anInt6065
import RemoveRoofsOptionStateStatics.aClass318_Sub1Array6066
import RemoveRoofsOptionStateStatics.anInt6068

/* Class239_Sub21 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class RemoveRoofsOptionState : GraphicsOptionState {
    override fun method1710(i: Int): Int {
        anInt6065++
        if (i != 20014) return -81
        return 1
    }

    fun method1809(i: Int): Boolean {
        anInt6063++
        if (i < 85) method1813(11, 68)
        return !this.aClass348_Sub51_3136.method3425(-104)
    }

    override fun method1712(i: Int, i_35_: Int) {
        this.anInt3138 = i_35_
        anInt6059++
        val i_36_ = -103 % ((i - 82) / 35)
    }

    override fun method1714(i: Int, i_37_: Int): Int {
        if (i != 3) return 91
        anInt6064++
        if (this.aClass348_Sub51_3136.method3425(i xor 0x4b.inv())) return 3
        return 1
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    override fun method1716(bool: Boolean) {
        if (this.aClass348_Sub51_3136.method3425(-112)) this.anInt3138 = 0
        anInt6057++
        if (bool != false) aClass318_Sub1Array6066 = null
        if (this.anInt3138 != 1 && this.anInt3138 != 0) this.anInt3138 = method1710(20014)
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    fun method1812(i: Int): Int {
        if (i != -32350) anIntArray6062 = null
        anInt6068++
        return this.anInt3138
    }
}
