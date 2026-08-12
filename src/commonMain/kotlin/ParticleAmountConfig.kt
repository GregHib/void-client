/* Class159 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ParticleAmountConfig {

    var anInt2125: Int = 0
    private fun method1251(class348_sub49: ByteBuffer, i: Int, i_0_: Int) {
        if (i == 5) this.anInt2125 = class348_sub49.readUnsignedShort(842397944)
        anInt2126++
        val i_1_ = 60 % ((i_0_ - 33) / 57)
    }

    fun method1253(class348_sub49: ByteBuffer, bool: Boolean) {
        while (true) {
            val i = class348_sub49.readUnsignedByte(255)
            if (i == 0) break
            method1251(class348_sub49, i, -105)
        }
        anInt2128++
        if (bool != true) this.anInt2125 = 58
    }

    companion object {
        var anInt2128: Int = 0
        var anInt2126: Int = 0
    }
}