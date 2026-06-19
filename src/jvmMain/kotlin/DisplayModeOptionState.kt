import GameAppletFrameStatics.method86
import kotlin.math.pow
import DisplayModeOptionStateStatics.method1828
import DisplayModeOptionStateStatics.anInt6099
import DisplayModeOptionStateStatics.anInt6100
import DisplayModeOptionStateStatics.anInt6101
import DisplayModeOptionStateStatics.anInt6105
import DisplayModeOptionStateStatics.anInt6106
import DisplayModeOptionStateStatics.anInt6107
import DisplayModeOptionStateStatics.anInt6108
import DisplayModeOptionStateStatics.anInt6109

/* Class239_Sub25 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class DisplayModeOptionState : GraphicsOptionState {
    private var aBoolean6110 = true
    @JvmField
    var aBoolean6113: Boolean = false

    override fun method1714(i: Int, i_0_: Int): Int {
        anInt6100++
        if (i != 3) aBoolean6110 = false
        if (!this.aClass348_Sub51_3136.method3428((-89).toByte())!!.method1460(-38)) return 3
        if (i_0_ == 3 && !method86("jagdx", i xor 0x3)) return 3
        return 2
    }

    override fun method1712(i: Int, i_1_: Int) {
        val i_2_ = -50 / ((i - 82) / 35)
        this.anInt3138 = i_1_
        anInt6106++
        this.aBoolean6113 = false
    }

    fun method1826(bool: Boolean, i: Int) {
        aBoolean6110 = bool
        anInt6109++
        if (i != -142238264) method1828(20)
    }

    override fun method1710(i: Int): Int {
        this.aBoolean6113 = true
        anInt6101++
        if (i != 20014) aBoolean6110 = false
        if (!this.aClass348_Sub51_3136.method3428((-113).toByte())!!.method1460(i + -20083)) return 0
        return 2
    }

    internal constructor(i: Int, class348_sub51: DisplaySettingsConfig) : super(i, class348_sub51)

    internal constructor(class348_sub51: DisplaySettingsConfig) : super(class348_sub51)

    override fun method1716(bool: Boolean) {
        anInt6108++
        if (!this.aClass348_Sub51_3136.method3428((-106).toByte())!!.method1460(-33)) this.anInt3138 = 0
        if (bool != false) method1829(31)
        if (this.anInt3138 < 0 || this.anInt3138 > 5) this.anInt3138 = method1710(20014)
    }

    fun method1829(i: Int): Int {
        anInt6107++
        if (i != -32350) aBoolean6110 = false
        return this.anInt3138
    }

    fun method1830(i: Byte): Boolean {
        anInt6099++
        if (i >= -93) aBoolean6110 = false
        return aBoolean6110
    }

    fun method1831(i: Int): Boolean {
        anInt6105++
        if (i < 85) return true
        return this.aClass348_Sub51_3136.method3428((-124).toByte())!!.method1460(-59)
    }
}
