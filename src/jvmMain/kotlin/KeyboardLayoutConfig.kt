import MinimapSquareDrawerStatics.method462
import KeyboardLayoutConfigStatics.anInt2129
import KeyboardLayoutConfigStatics.aBoolean2130
import KeyboardLayoutConfigStatics.anInt2136

/* Class160 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class KeyboardLayoutConfig {
    var aChar2132: Char = 0.toChar()
    var anInt2135: Int = 1
    fun method1255(class348_sub49: ByteBuffer, i: Int) {
        while (true) {
            val i_0_ = class348_sub49.readUnsignedByte(255)
            if (i_0_ == 0) break
            method1256(-90, i_0_, class348_sub49)
        }
        if (i != -1) aBoolean2130 = false
        anInt2129++
    }

    private fun method1256(i: Int, i_1_: Int, class348_sub49: ByteBuffer) {
        anInt2136++
        if (i_1_ != 1) {
            if (i_1_ == 2) this.anInt2135 = 0
        } else this.aChar2132 = method462(class348_sub49.readByte(-119), -128)
    }
}
