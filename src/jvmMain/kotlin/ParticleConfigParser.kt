import ParticleConfigParserStatics.anInt3818
import ParticleConfigParserStatics.aBoolean3819
import ParticleConfigParserStatics.anInt3822

/* Class300 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ParticleConfigParser {
    var anInt3817: Int
    var anIntArray3821: IntArray? = null
    var anInt3823: Int = -1
    fun method2275(class348_sub49: ByteBuffer, i: Byte) {
        anInt3818++
        while (true) {
            val i_1_ = class348_sub49.readUnsignedByte(255)
            if (i_1_ == 0) break
            method2276(0, class348_sub49, i_1_)
        }
        val i_2_ = -63 / ((72 - i) / 37)
    }

    private fun method2276(i: Int, class348_sub49: ByteBuffer, i_3_: Int) {
        if (i_3_ == 1) this.anInt3817 = class348_sub49.readUnsignedShort(842397944)
        else if (i_3_ == 2) {
            this.anIntArray3821 = IntArray(class348_sub49.readUnsignedByte(255))
            var i_4_ = 0
            while ((i_4_ < this.anIntArray3821!!.size)) {
                this.anIntArray3821!![i_4_] = class348_sub49.readUnsignedShort(842397944)
                i_4_++
            }
        } else if (i_3_ == 3) this.anInt3823 = class348_sub49.readUnsignedByte(255)
        if (i != 0) aBoolean3819 = true
        anInt3822++
    }

    init {
        this.anInt3817 = -1
    }
}
