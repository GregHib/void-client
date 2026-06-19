import TwoStateOptionStateStatics.method1842
import ScrollbarComponentStatics.anInt8334
import ScrollbarComponentStatics.anInt8336
import ScrollbarComponentStatics.anInt8337
import ScrollbarComponentStatics.anInt8341
import ScrollbarComponentStatics.anInt8351

/* Class5_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class ScrollbarComponent(js5Archive: Js5Archive, js5Archive_0_: Js5Archive, class369_sub3: WorldMapIconLabel) : WorldMapElement(js5Archive, js5Archive_0_, class369_sub3) {
    private var aAbstractModelRenderer_8338: AbstractModelRenderer? = null
    private var aAbstractModelRenderer_8339: AbstractModelRenderer? = null
    private var aAbstractModelRenderer_8342: AbstractModelRenderer? = null
    private var aAbstractModelRenderer_8343: AbstractModelRenderer? = null
    private var aAbstractModelRenderer_8347: AbstractModelRenderer? = null
    var aAbstractModelRenderer_8350: AbstractModelRenderer? = null
    public override fun method8(i: Byte): Boolean {
        anInt8351++
        if (!super.method8((-125).toByte())) return false
        val class369_sub3 = this.aWorldMapLabel_4635 as WorldMapIconLabel?
        if (!this.aJs5Archive_4632!!.method421(false, class369_sub3!!.anInt8599)) return false
        if (!this.aJs5Archive_4632!!.method421(false, class369_sub3.anInt8595)) return false
        if (!this.aJs5Archive_4632!!.method421(false, class369_sub3.anInt8603)) return false
        if (!this.aJs5Archive_4632!!.method421(false, class369_sub3.anInt8602)) return false
        val i_1_ = 47 / ((25 - i) / 52)
        if (!this.aJs5Archive_4632!!.method421(false, class369_sub3.anInt8600)) return false
        return this.aJs5Archive_4632!!.method421(false, class369_sub3.anInt8597)
    }

    open fun method186(i: Int, i_3_: Int, i_4_: Byte, i_5_: Int, i_6_: Int) {
        this.aAbstractModelRenderer_8350!!.method972(i_5_, i, i_6_, i_3_)
        anInt8341++
        if (i_4_ <= 21) method8(68.toByte())
    }

    public override fun method178(i: Int, bool: Boolean, i_27_: Byte, i_28_: Int) {
        if (bool) {
            val `is` = IntArray(4)
            FacingDirectionNodeStatics.aRenderer6654!!.K(`is`)
            FacingDirectionNodeStatics.aRenderer6654!!.KA(i, i_28_, i - -this.aWorldMapLabel_4635!!.anInt4971, (i_28_ + this.aWorldMapLabel_4635!!.anInt4963))
            val i_29_ = aAbstractModelRenderer_8342!!.method966()
            val i_30_ = aAbstractModelRenderer_8342!!.method980()
            val i_31_ = aAbstractModelRenderer_8339!!.method966()
            val i_32_ = aAbstractModelRenderer_8339!!.method980()
            aAbstractModelRenderer_8342!!.method974(i, i_28_ - -(((this.aWorldMapLabel_4635!!.anInt4963) + -i_30_) / 2))
            aAbstractModelRenderer_8339!!.method974((this.aWorldMapLabel_4635!!.anInt4971 + (i + -i_31_)), i_28_ + (this.aWorldMapLabel_4635!!.anInt4963 + -i_32_) / 2)
            FacingDirectionNodeStatics.aRenderer6654!!.KA(i, i_28_, (this.aWorldMapLabel_4635!!.anInt4971 + i), i_28_ - -aAbstractModelRenderer_8343!!.method980())
            aAbstractModelRenderer_8343!!.method972(i + i_29_, i_28_, -i_29_ + (this.aWorldMapLabel_4635!!.anInt4971) - i_31_, this.aWorldMapLabel_4635!!.anInt4963)
            val i_33_ = aAbstractModelRenderer_8338!!.method980()
            FacingDirectionNodeStatics.aRenderer6654!!.KA(i, (-i_33_ + i_28_ - -this.aWorldMapLabel_4635!!.anInt4963), this.aWorldMapLabel_4635!!.anInt4971 + i, (i_28_ + this.aWorldMapLabel_4635!!.anInt4963))
            aAbstractModelRenderer_8338!!.method972(i_29_ + i, (-i_33_ + i_28_ + this.aWorldMapLabel_4635!!.anInt4963), (-i_29_ + this.aWorldMapLabel_4635!!.anInt4971 + -i_31_), this.aWorldMapLabel_4635!!.anInt4963)
            FacingDirectionNodeStatics.aRenderer6654!!.KA(`is`[0], `is`[1], `is`[2], `is`[3])
        }
        anInt8334++
        if (i_27_ > -6) aAbstractModelRenderer_8347 = null
    }

    public override fun method182(i: Int, i_35_: Int, i_36_: Int, bool: Boolean) {
        val i_37_ = -45 / ((-20 - i) / 57)
        anInt8336++
        val i_38_ = aAbstractModelRenderer_8342!!.method966() + i_36_
        val i_39_ = (this.aWorldMapLabel_4635!!.anInt4971 + (i_36_ + -aAbstractModelRenderer_8339!!.method966()))
        val i_40_ = i_35_ - -aAbstractModelRenderer_8343!!.method980()
        val i_41_ = (i_35_ + this.aWorldMapLabel_4635!!.anInt4963 - aAbstractModelRenderer_8338!!.method980())
        val i_42_ = -i_38_ + i_39_
        val i_43_ = -i_40_ + i_41_
        val i_44_ = this.method183(124) * i_42_ / 10000
        val `is` = IntArray(4)
        FacingDirectionNodeStatics.aRenderer6654!!.K(`is`)
        FacingDirectionNodeStatics.aRenderer6654!!.KA(i_38_, i_40_, i_44_ + i_38_, i_41_)
        method186(i_40_, i_43_, 33.toByte(), i_38_, i_42_)
        FacingDirectionNodeStatics.aRenderer6654!!.KA(i_44_ + i_38_, i_40_, i_39_, i_41_)
        aAbstractModelRenderer_8347!!.method972(i_38_, i_40_, i_42_, i_43_)
        FacingDirectionNodeStatics.aRenderer6654!!.KA(`is`[0], `is`[1], `is`[2], `is`[3])
    }

    public override fun method7(i: Int) {
        super.method7(i)
        anInt8337++
        val class369_sub3 = this.aWorldMapLabel_4635 as WorldMapIconLabel?
        this.aAbstractModelRenderer_8350 = WorldMapPolygonIconLabelStatics.method3577((class369_sub3!!.anInt8599), (-19).toByte(), this.aJs5Archive_4632!!)
        aAbstractModelRenderer_8347 = WorldMapPolygonIconLabelStatics.method3577((class369_sub3.anInt8595), 106.toByte(), this.aJs5Archive_4632!!)
        aAbstractModelRenderer_8342 = WorldMapPolygonIconLabelStatics.method3577((class369_sub3.anInt8603), (-19).toByte(), this.aJs5Archive_4632!!)
        aAbstractModelRenderer_8339 = WorldMapPolygonIconLabelStatics.method3577((class369_sub3.anInt8602), (-121).toByte(), this.aJs5Archive_4632!!)
        aAbstractModelRenderer_8343 = WorldMapPolygonIconLabelStatics.method3577((class369_sub3.anInt8600), 124.toByte(), this.aJs5Archive_4632!!)
        aAbstractModelRenderer_8338 = WorldMapPolygonIconLabelStatics.method3577((class369_sub3.anInt8597), 115.toByte(), this.aJs5Archive_4632!!)
    }
}
