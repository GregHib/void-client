import ConfigShortValueNodeStatics.anInt9541
import ConfigShortValueNodeStatics.anInt9543
import ConfigShortValueNodeStatics.anInt9544

/* Class348_Sub42_Sub7 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ConfigShortValueNode : HashLinkedListNode() {
    var anInt9542: Int = 0
    private fun method3191(i: Int, class348_sub49: ByteBuffer, i_0_: Byte) {
        if (i == 2) this.anInt9542 = class348_sub49.readUnsignedShort(842397944)
        anInt9544++
        val i_1_ = -60 / ((i_0_ - -26) / 51)
    }

    fun method3192(i: Byte, class348_sub49: ByteBuffer) {
        while (true) {
            val i_2_ = class348_sub49.readUnsignedByte(i + 239)
            if (i_2_ == 0) break
            method3191(i_2_, class348_sub49, 70.toByte())
        }
        if (i.toInt() != 16) anInt9541 = -83
        anInt9543++
    }
}
