import TextureQualityOptionStateStatics.method1782
import TextureQualityOptionStateStatics.method1783
import TextureQualityOptionStateStatics.anInt5996
import TextureQualityOptionStateStatics.anInt5999
import TextureQualityOptionStateStatics.anInt6000
import TextureQualityOptionStateStatics.anInt6001
import TextureQualityOptionStateStatics.anInt6003
import TextureQualityOptionStateStatics.anInt6005

/* Class239_Sub15 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class TextureQualityOptionState : GraphicsOptionState {
    override fun method1716(bool: Boolean) {
        if (bool != false) method1783(115, -122, -59, 41, -49, 92)
        anInt5999++
        if (this.aClass348_Sub51_3136.method3428((-84).toByte())!!.method1458(-23688) < 96) this.anInt3138 = 0
        if (this.anInt3138 < 0 || this.anInt3138 > 2) this.anInt3138 = method1710(20014)
    }

    override fun method1714(i: Int, i_1_: Int): Int {
        anInt6005++
        if (i != 3) method1784(99)
        if (this.aClass348_Sub51_3136.method3428((-85).toByte())!!.method1458(-23688) < 96) return 3
        return 1
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51) {
        Crc64HashableStatics.method1114(this.anInt3138, -122)
    }

    override fun method1712(i: Int, i_20_: Int) {
        anInt6003++
        this.anInt3138 = i_20_
        val i_21_ = 33 % ((i - 82) / 35)
        Crc64HashableStatics.method1114(this.anInt3138, -122)
    }

    override fun method1710(i: Int): Int {
        anInt5996++
        if (i != 20014) method1782(-76, -103)
        if (this.aClass348_Sub51_3136.method3428((-105).toByte())!!.method1458(-23688) < 96) return 0
        return 2
    }

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51) {
        Crc64HashableStatics.method1114(this.anInt3138, -120)
    }

    fun method1784(i: Int): Int {
        anInt6000++
        if (i != -32350) return -82
        return this.anInt3138
    }

    fun method1786(i: Int): Boolean {
        if (i < 85) method1784(-69)
        anInt6001++
        return this.aClass348_Sub51_3136.method3428((-104).toByte())!!.method1458(-23688) >= 96
    }
}
