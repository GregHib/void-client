import java.awt.Canvas
import AbstractMenuEntryStatics.method1034
import AbstractMenuEntryStatics.anInt1699
import AbstractMenuEntryStatics.anInt1703
import AbstractMenuEntryStatics.anInt1707
import AbstractMenuEntryStatics.anInt1709
import AbstractMenuEntryStatics.aBoolean1712

abstract class AbstractMenuEntry {
    @JvmField
    var anInt1704: Int = 0
    @JvmField
    var anInt1708: Int = 0
    @JvmField
    var anInt1711: Int = 0
    fun method1029(bool: Boolean): Boolean {
        anInt1707++
        if (bool != true) aBoolean1712 = false
        return (this.anInt1708 and 0x1) != 0
    }

    fun method1031(i: Int): Boolean {
        val i_0_ = 101 / ((54 - i) / 47)
        anInt1699++
        return (0x4 and this.anInt1708) != 0
    }

    fun method1033(i: Int): Boolean {
        anInt1703++
        val i_4_ = -62 % ((i - -5) / 47)
        return (0x8 and this.anInt1708) != 0
    }

    fun method1036(i: Byte): Boolean {
        anInt1709++
        if (i.toInt() != -35) method1034(11, null, null, -12)
        return (this.anInt1708 and 0x2) != 0
    }
}
