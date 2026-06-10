/* Class348_Sub42_Sub7 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class348_Sub42_Sub7 : Class348_Sub42() {
    var anInt9542: Int = 0
    private fun method3191(i: Int, class348_sub49: Class348_Sub49, i_0_: Byte) {
        if (i == 2) this.anInt9542 = class348_sub49.readUnsignedShort(842397944)
        anInt9544++
        val i_1_ = -60 / ((i_0_ - -26) / 51)
    }

    fun method3192(i: Byte, class348_sub49: Class348_Sub49) {
        while (true) {
            val i_2_ = class348_sub49.readUnsignedByte(i + 239)
            if (i_2_ == 0) break
            method3191(i_2_, class348_sub49, 70.toByte())
        }
        if (i.toInt() != 16) anInt9541 = -83
        anInt9543++
    }

    companion object {
        var anInt9540: Int = 0
        var anInt9541: Int = -1
        var anInt9543: Int = 0
        var anInt9544: Int = 0
    }
}
