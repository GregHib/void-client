/*
 * Class38
 */
class WidgetTextConfig {

    var anInt498: Int = 0

    var anInt499: Int = 0

    var anInt501: Int = 8

    var anInt502: Int = 0

    var anInt503: Int = 16777215

    var anInt504: Int = 0

    var aBoolean507: Boolean = false

    var anInt508: Int = 0
    private fun method361(i: Int, class348_sub49: ByteBuffer, i_2_: Int) {
//        if (i != -6617) method363(95)
        anInt497++
        if (i_2_ == 1) this.anInt501 = class348_sub49.readUnsignedShort(842397944)
        else if (i_2_ == 2) this.aBoolean507 = true
        else if (i_2_ == 3) {
            this.anInt499 = class348_sub49.readShort(13638)
            this.anInt502 = class348_sub49.readShort(13638)
            this.anInt508 = class348_sub49.readShort(13638)
        } else if (i_2_ == 4) this.anInt498 = class348_sub49.readUnsignedByte(255)
        else if (i_2_ == 5) this.anInt504 = class348_sub49.readUnsignedShort(842397944)
        else if (i_2_ == 6) this.anInt503 = class348_sub49.readMedium(-1)
    }

    fun method364(class348_sub49: ByteBuffer, i: Byte) {
        anInt511++
        if (i >= 22) {
            while (true) {
                val i_10_ = class348_sub49.readUnsignedByte(255)
                if (i_10_ == 0) break
                method361(-6617, class348_sub49, i_10_)
            }
        }
    }

    companion object {

        var anInt497: Int = 0

        var anInt511: Int = 0
    }
}