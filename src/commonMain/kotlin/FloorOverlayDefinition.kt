/* Class54 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class FloorOverlayDefinition {
    private var aByte966: Byte = 0

    var anInt967: Int = 0

    var anInt969: Int = 0

    var anInt973: Int = 0

    var anInt976: Int = 0

    var anInt977: Int = 0

    fun method499(i: Int): Int {
        anInt972++
        if (i != 21110) return -38
        if ((aByte966.toInt() and 0x8) != 8) return 0
        return 1
    }

    fun method502(i: Byte): Int {
        anInt971++
        val i_1_ = 4 / ((3 - i) / 43)
        return aByte966.toInt() and 0x7
    }

    constructor()

    internal constructor(class348_sub49: ByteBuffer) {
        aByte966 = class348_sub49.readByte(-113)
        this.anInt969 = class348_sub49.readUnsignedShort(842397944)
        this.anInt976 = class348_sub49.readInt((-126).toByte())
        this.anInt967 = class348_sub49.readInt((-126).toByte())
        this.anInt977 = class348_sub49.readInt((-126).toByte())
        this.anInt973 = class348_sub49.readInt((-126).toByte())
    }

    companion object {
        var anInt971: Int = 0
        var anInt972: Int = 0
    }
}