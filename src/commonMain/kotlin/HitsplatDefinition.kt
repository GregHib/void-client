/* Class146 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class HitsplatDefinition {

    var anInt2016: Int = 0

    var anInt2019: Int = 0

    var anInt2020: Int = 0

    fun method1191(i: Int, class348_sub49: ByteBuffer) {
        if (i == 2048) {
            anInt2018++
            while (true) {
                val i_0_ = class348_sub49.readUnsignedByte(255)
                if (i_0_ == 0) break
                method1192(i_0_, class348_sub49, 17.toByte())
            }
        }
    }

    private fun method1192(i: Int, class348_sub49: ByteBuffer, i_1_: Byte) {
        anInt2014++
        if (i == 1) {
            this.anInt2019 = class348_sub49.readUnsignedShort(842397944)
            this.anInt2016 = class348_sub49.readUnsignedByte(255)
            this.anInt2020 = class348_sub49.readUnsignedByte(i_1_.toInt() xor 0xee)
        }
    }

    companion object {
        var anInt2018: Int = 0
        var anInt2014: Int = 0
    }
}