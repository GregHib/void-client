import PlayerStatics.method2460
import CameraConfigDefinitionStatics.anInt3254
import CameraConfigDefinitionStatics.anInt3255

/* Class253 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CameraConfigDefinition {
    var anInt3244: Int = 2048
    var anInt3245: Int = 0
    var anInt3249: Int = 2048
    var anInt3251: Int = 0
    fun method1921(i: Byte, class348_sub49: ByteBuffer) {
        anInt3255++
        while (true) {
            val i_11_ = class348_sub49.readUnsignedByte(255)
            if (i_11_ == 0) break
            method1923(i_11_, 4, class348_sub49)
        }
    }

    private fun method1923(i: Int, i_13_: Int, class348_sub49: ByteBuffer) {
        anInt3254++
        if (i_13_ == 4) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) this.anInt3244 = class348_sub49.readUnsignedShort(i_13_ xor 0x3235f8fc)
                    else if (i == 4) this.anInt3251 = class348_sub49.readShort(13638)
                } else this.anInt3249 = class348_sub49.readUnsignedShort(i_13_ + 842397940)
            } else this.anInt3245 = class348_sub49.readUnsignedByte(255)
        }
    }
}
