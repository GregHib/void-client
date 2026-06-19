import SourceRowTextureNodeStatics.aNodeDeque_9111
import SourceRowTextureNodeStatics.anInt9115

/* Class348_Sub40_Sub4 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SourceRowTextureNode : AbstractProceduralTextureNode(0, true) {
    override fun method3042(i: Int, i_0_: Int): IntArray? {
        anInt9115++
        if (i_0_ != 255) aNodeDeque_9111 = null
        val `is` = this.aSpriteSheetCache_7032!!.method1433(0, i)!!
        if (this.aSpriteSheetCache_7032!!.aBoolean2570) ArrayCopyUtil.method1579(`is`, 0, DisplaceTextureNodeStatics.anInt9139, LightDetailOptionStateStatics.anIntArray6035!![i])
        return `is`
    }
}
