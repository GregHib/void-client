import SolidFillComponentStatics.anInt8355
import SolidFillComponentStatics.anInt8360
import SolidFillComponentStatics.aIntRange_8365

/* Class5_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SolidFillComponent internal constructor(js5Archive: Js5Archive, js5Archive_12_: Js5Archive, class369_sub2: WorldMapTextLabel) : WorldMapElement(js5Archive, js5Archive_12_, class369_sub2) {
    public override fun method178(i: Int, bool: Boolean, i_16_: Byte, i_17_: Int) {
        FacingDirectionNodeStatics.aRenderer6654!!.method3628(-2 + i, i_17_, 4 + this.aWorldMapLabel_4635!!.anInt4971, 2 + this.aWorldMapLabel_4635!!.anInt4963, ((this.aWorldMapLabel_4635 as WorldMapTextLabel).anInt8585), 0)
        anInt8360++
        FacingDirectionNodeStatics.aRenderer6654!!.method3628(i - 1, 1 + i_17_, this.aWorldMapLabel_4635!!.anInt4971 - -2, this.aWorldMapLabel_4635!!.anInt4963, 0, 0)
        if (i_16_ > -6) aIntRange_8365 = null
    }

    public override fun method182(i: Int, i_18_: Int, i_19_: Int, bool: Boolean) {
        anInt8355++
        val i_20_ = -110 / ((-20 - i) / 57)
        val i_21_ = (this.method183(116) * this.aWorldMapLabel_4635!!.anInt4971 / 10000)
        FacingDirectionNodeStatics.aRenderer6654!!.aa(i_19_, 2 + i_18_, i_21_, (this.aWorldMapLabel_4635!!.anInt4963) - 2, (this.aWorldMapLabel_4635 as WorldMapTextLabel).anInt8591, 0)
        FacingDirectionNodeStatics.aRenderer6654!!.aa(i_21_ + i_19_, 2 + i_18_, this.aWorldMapLabel_4635!!.anInt4971 - i_21_, this.aWorldMapLabel_4635!!.anInt4963 - 2, 0, 0)
    }
}
