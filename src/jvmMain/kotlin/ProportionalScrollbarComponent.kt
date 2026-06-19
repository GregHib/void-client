import IndexedSpriteStatics.method163
import ProportionalScrollbarComponentStatics.anInt9928
import ProportionalScrollbarComponentStatics.aSpriteImageArray9929

/* Class5_Sub1_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ProportionalScrollbarComponent internal constructor(js5Archive: Js5Archive, js5Archive_0_: Js5Archive, class369_sub3_sub1: WorldMapPolygonIconLabel) : ScrollbarComponent(js5Archive, js5Archive_0_, class369_sub3_sub1) {
    override fun method186(i: Int, i_1_: Int, i_2_: Byte, i_3_: Int, i_4_: Int) {
        if (i_2_ <= 21) aSpriteImageArray9929 = null
        anInt9928++
        val i_5_ = this.aAbstractModelRenderer_8350!!.method966()
        val i_6_ = ((this.aWorldMapLabel_4635 as WorldMapPolygonIconLabel).anInt10177 * method163(512) / 10 % i_5_)
        this.aAbstractModelRenderer_8350!!.method972(i_3_ - (i_5_ - i_6_), i, -i_6_ + (i_4_ - -i_5_), i_1_)
    }
}
