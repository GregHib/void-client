import DetailLevelOptionStateStatics.method1836
import CubeMapMaterialPassStatics.method2172
import OpenGlTerrainTileStatics.method4002
import ColourAdjustmentStatics.anInt848
import ColourAdjustmentStatics.anInt855
import ColourAdjustmentStatics.method448

/* Class48 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ColourAdjustment {
    @JvmField
    var anInt847: Int = 0
    @JvmField
    var anInt853: Int = 0
    @JvmField
    var anInt854: Int = 0
    @JvmField
    var anInt856: Int
    @JvmField
    var anInt857: Int = 128
    @JvmField
    var anInt858: Int
    fun method451(colourAdjustment_7_: ColourAdjustment, i: Byte) {
        this.anInt857 = colourAdjustment_7_.anInt857
        this.anInt858 = colourAdjustment_7_.anInt858
        this.anInt856 = colourAdjustment_7_.anInt856
        this.anInt854 = colourAdjustment_7_.anInt854
        anInt855++
        this.anInt847 = colourAdjustment_7_.anInt847
        this.anInt853 = colourAdjustment_7_.anInt853
        if (i.toInt() != -110) method448((-93).toByte())
    }

    fun method452(bool: Boolean): ColourAdjustment {
        anInt848++
        if (bool != true) method448((-81).toByte())
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
}
