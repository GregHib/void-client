/* Class54 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class FloorOverlayDefinition {
    private var aByte966: Byte = 0
    @JvmField
    var anInt967: Int = 0
    @JvmField
    var anInt969: Int = 0
    @JvmField
    var anInt973: Int = 0
    @JvmField
    var anInt976: Int = 0
    @JvmField
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
        @JvmField
        var anInt968: Int = 0
        @JvmField
        var anInt970: Int = 0
        @JvmField
        var anInt971: Int = 0
        @JvmField
        var anInt972: Int = 0
        @JvmField
        var aStringArray974: Array<String?>? = null
        @JvmField
        var anInt975: Int = 0
        @JvmStatic
        fun method500(i: Int, i_0_: Int): Int {
            anInt975++
            if (i != 7) return -107
            return i_0_ ushr 8
        }

        @JvmStatic
        fun method501(i: Int) {
            aStringArray974 = null
            if (i != 1) method501(-15)
        }

        var anInt3941: Int = 0
        var anInt3939: Int = 0
        fun method503(i: Int, i_2_: Int, i_3_: Byte, i_4_: Int, i_5_: Int) {
            anInt968++
            val i_6_ = CompletedResourceRequest.anInt10463
            while_4_@ do {
                do {
                    if (i_6_ != 0) {
                        if (i_6_ != 1) {
                            if (i_6_ == 2) break
                            break@while_4_
                        }
                    } else return
                    ModelVertexColorBuffer.anInt6585 = i
                    anInt3941 = i_2_
                    GraphicsOptionState.anInt3142 = i_5_
                    CompletedResourceRequest.anInt10463 = 2
                    anInt3939 = i_4_
                    return
                } while (false)
                if (anInt3939 < i_4_) anInt3939 = i_4_
                if (anInt3941 > i_2_) anInt3941 = i_2_
                if (GraphicsOptionState.anInt3142 > i_5_) GraphicsOptionState.anInt3142 = i_5_
                if (i > ModelVertexColorBuffer.anInt6585) ModelVertexColorBuffer.anInt6585 = i
                return
            } while (false)
            if (i_3_.toInt() != -74) method501(46)
        }
    }
}
