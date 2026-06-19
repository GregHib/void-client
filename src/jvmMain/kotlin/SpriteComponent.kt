import WaterMaterialPassStatics.method2148
import NoiseTextureGeneratorStatics.method544
import SpriteComponentStatics.method202
import SpriteComponentStatics.anInt8367
import SpriteComponentStatics.anInt8371
import SpriteComponentStatics.anInt8373
import SpriteComponentStatics.anInt8376

/* Class5_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SpriteComponent internal constructor(js5Archive: Js5Archive?, js5Archive_4_: Js5Archive, class369_sub1: WorldMapAreaLabel?) : WorldMapElement(js5Archive, js5Archive_4_, class369_sub1) {
    private var aAbstractModelRenderer_8366: AbstractModelRenderer? = null
    public override fun method178(i: Int, bool: Boolean, i_0_: Byte, i_1_: Int) {
        if (i_0_ >= -6) method202(-4, null)
        anInt8376++
        FacingDirectionNodeStatics.aRenderer6654!!.method3628(-2 + i, i_1_, 4 + this.aWorldMapLabel_4635!!.anInt4971, this.aWorldMapLabel_4635!!.anInt4963 + 2, ((this.aWorldMapLabel_4635 as WorldMapAreaLabel).anInt8580), 0)
        FacingDirectionNodeStatics.aRenderer6654!!.method3628(i + -1, i_1_ + 1, this.aWorldMapLabel_4635!!.anInt4971 + 2, this.aWorldMapLabel_4635!!.anInt4963, 0, 0)
    }

    public override fun method8(i: Byte): Boolean {
        val i_2_ = 2 % ((25 - i) / 52)
        anInt8373++
        if (!super.method8(82.toByte())) return false
        return this.aJs5Archive_4632!!.method421(false, ((this.aWorldMapLabel_4635 as WorldMapAreaLabel).anInt8582))
    }

    public override fun method7(i: Int) {
        anInt8371++
        if (i == 10286) {
            super.method7(i)
            aAbstractModelRenderer_8366 = WorldMapPolygonIconLabelStatics.method3577((this.aWorldMapLabel_4635 as WorldMapAreaLabel).anInt8582, (-96).toByte(), this.aJs5Archive_4632!!)
        }
    }

    public override fun method182(i: Int, i_8_: Int, i_9_: Int, bool: Boolean) {
        anInt8367++
        val i_10_ = (this.method183(48) * this.aWorldMapLabel_4635!!.anInt4971 / 10000)
        val `is` = IntArray(4)
        val i_11_ = -50 % ((-20 - i) / 57)
        FacingDirectionNodeStatics.aRenderer6654!!.K(`is`)
        FacingDirectionNodeStatics.aRenderer6654!!.KA(i_9_, 2 + i_8_, i_9_ - -i_10_, i_8_ - -(this.aWorldMapLabel_4635!!.anInt4963))
        aAbstractModelRenderer_8366!!.method972(i_9_, 2 + i_8_, (this.aWorldMapLabel_4635!!.anInt4971), (this.aWorldMapLabel_4635!!.anInt4963))
        FacingDirectionNodeStatics.aRenderer6654!!.KA(`is`[0], `is`[1], `is`[2], `is`[3])
    }
}
