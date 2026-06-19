import GlGroundShaderPassStatics.method3555
import ParticleTileShapeStatics.method2732
import ParticleTileShapeStatics.anInt8819
import ParticleTileShapeStatics.anInt8821

/* Class348_Sub1_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ParticleTileShape internal constructor(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, f: Float) : AbstractTileShape(i, i_3_, i_4_, i_5_, i_6_, f) {
    override fun method2725(i: Int, i_0_: Byte, i_1_: Int, i_2_: Int) {
        if (i_0_.toInt() == 70) {
            this.anInt6553 = i_1_
            this.anInt6562 = i
            anInt8819++
            this.anInt6548 = i_2_
        }
    }

    override fun method2716(i: Int, f: Float) {
        anInt8821++
        this.aFloat6550 = f
        if (i != -1) method2732(-79, -120, true, 36, null, 19)
    }
}
