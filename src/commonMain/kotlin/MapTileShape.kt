/* Class338 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MapTileShape internal constructor(i: Int, i_15_: Int, i_16_: Int, i_17_: Int, i_18_: Int, i_19_: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Int, i_24_: Int, i_25_: Int, i_26_: Int, i_27_: Int) {
    var aByte4181: Byte
    var aShort4182: Short

    var aShortArray4183: ShortArray?

    var anIntArray4184: IntArray = IntArray(4)
    var aShort4185: Short

    var anIntArray4187: IntArray?

    var aShortArray4188: ShortArray?
    var aShort4190: Short

    var anIntArray4191: IntArray = IntArray(4)
    var aByte4192: Byte
    var aShort4193: Short

    var aShortArray4194: ShortArray?

    init {
        this.aByte4192 = i.toByte()
        this.aByte4181 = i_15_.toByte()
        this.anIntArray4187 = IntArray(4)
        this.anIntArray4187!![0] = i_16_
        this.anIntArray4187!![1] = i_17_
        this.anIntArray4187!![3] = i_19_
        this.anIntArray4187!![2] = i_18_
        this.anIntArray4191[0] = i_20_
        this.anIntArray4191[2] = i_22_
        this.anIntArray4191[3] = i_23_
        this.anIntArray4191[1] = i_21_
        this.anIntArray4184[1] = i_25_
        this.aShort4185 = (i_16_ shr anInt4459).toShort()
        this.anIntArray4184[3] = i_27_
        this.anIntArray4184[0] = i_24_
        this.anIntArray4184[2] = i_26_
        this.aShort4182 = (i_18_ shr anInt4459).toShort()
        this.aShort4193 = (i_24_ shr anInt4459).toShort()
        this.aShort4190 = (i_26_ shr anInt4459).toShort()
        this.aShortArray4188 = ShortArray(4)
        this.aShortArray4183 = ShortArray(4)
        this.aShortArray4194 = ShortArray(4)
    }

    companion object {
        var anInt4459: Int = 0
    }
}