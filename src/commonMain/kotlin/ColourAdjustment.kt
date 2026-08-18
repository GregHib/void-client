/* Class48 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ColourAdjustment {

    var anInt847: Int = 0

    var anInt853: Int = 0

    var anInt854: Int = 0

    var anInt856: Int

    var anInt857: Int = 128

    var anInt858: Int
    fun method451(colourAdjustment_7_: ColourAdjustment, i: Byte) {
        this.anInt857 = colourAdjustment_7_.anInt857
        this.anInt858 = colourAdjustment_7_.anInt858
        this.anInt856 = colourAdjustment_7_.anInt856
        this.anInt854 = colourAdjustment_7_.anInt854
        anInt855++
        this.anInt847 = colourAdjustment_7_.anInt847
        this.anInt853 = colourAdjustment_7_.anInt853
//        if (i.toInt() != -110) Companion.method448((-93).toByte())
    }

    fun method452(bool: Boolean): ColourAdjustment {
        anInt848++
//        if (bool != true) Companion.method448((-81).toByte())
        return ColourAdjustment(this.anInt858, this.anInt856, this.anInt857, this.anInt854, this.anInt847, this.anInt853)
    }

    internal constructor(i: Int) {
        this.anInt856 = 128
        this.anInt858 = i
    }

    private constructor(i: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int) {
        this.anInt856 = 128
        this.anInt847 = i_11_
        this.anInt854 = i_10_
        this.anInt853 = i_12_
        this.anInt858 = i
        this.anInt856 = i_8_
        this.anInt857 = i_9_
    }

    companion object {
        var anInt848: Int = 0
        var anInt855: Int = 0
    }
}