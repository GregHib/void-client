/* Class189 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MapAreaDefinition {
    var aBoolean2522: Boolean = false
    var anInt2525: Int
    var anInt2526: Int = 64
    var anInt2530: Int = 64
    var aBoolean2531: Boolean = false
    var anInt2533: Int = 1
    var anInt2534: Int = 2

    private fun method1418(i: Int, i_0_: Int, class348_sub49: ByteBuffer, i_1_: Byte) {
        if (i_1_.toInt() != 94) this.anInt2526 = -81
        anInt2532++
        if (i == 1) {
            this.anInt2525 = class348_sub49.readUnsignedShort(842397944)
            if (this.anInt2525 == 65535) this.anInt2525 = -1
        } else if (i == 2) {
            this.anInt2526 = 1 + class348_sub49.readUnsignedShort(842397944)
            this.anInt2530 = class348_sub49.readUnsignedShort(842397944) - -1
        } else if (i != 3) {
            if (i == 4) this.anInt2534 = class348_sub49.readUnsignedByte(255)
            else if (i != 5) {
                if (i == 6) this.aBoolean2522 = true
                else if (i == 7) this.aBoolean2531 = true
            } else this.anInt2533 = class348_sub49.readUnsignedByte(255)
        } else class348_sub49.readByte(-106)
    }

    fun method1419(i: Int, class348_sub49: ByteBuffer, i_2_: Byte) {
        anInt2528++
        val i_3_ = 93 / ((i_2_ - -24) / 55)
        while (true) {
            val i_4_ = class348_sub49.readUnsignedByte(255)
            if (i_4_ == 0) break
            method1418(i_4_, i, class348_sub49, 94.toByte())
        }
    }

    init {
        this.anInt2525 = -1
    }

    companion object {
        var anInt2528: Int = 0
        var anInt2532: Int = 0
    }
}