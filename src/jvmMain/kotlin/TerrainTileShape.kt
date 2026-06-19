import WorldMapAreaLabelStatics.method3570
import TerrainTileShapeStatics.anInt8803
import TerrainTileShapeStatics.aLruByteCache_8807
import TerrainTileShapeStatics.anInt8809

/* Class348_Sub1_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class TerrainTileShape internal constructor(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, f: Float) : AbstractTileShape(i, i_0_, i_1_, i_2_, i_3_, f) {
    override fun method2725(i: Int, i_4_: Byte, i_5_: Int, i_6_: Int) {
        this.anInt6553 = i_5_
        this.anInt6548 = i_6_
        if (i_4_.toInt() == 70) {
            anInt8809++
            this.anInt6562 = i
        }
    }

    override fun method2716(i: Int, f: Float) {
        this.aFloat6550 = f
        if (i != -1) aLruByteCache_8807 = null
        anInt8803++
    }
}
