import BasicGlRenderPassStatics.method3540
import BasicGlRenderPassStatics.anInt7298
import BasicGlRenderPassStatics.anInt7300
import BasicGlRenderPassStatics.aIntRange_7301
import BasicGlRenderPassStatics.anInt7303
import BasicGlRenderPassStatics.anInt7305
import BasicGlRenderPassStatics.anInt7306
import BasicGlRenderPassStatics.anInt7307

/* Class367_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class BasicGlRenderPass internal constructor(var_ha_Sub3: NativeRenderer) : AbstractRenderPass(var_ha_Sub3) {
    override fun method3525(i: Int, bool: Boolean) {
        this.aHa_Sub3_4479.method3943(true, i + -47145)
        anInt7306++
        if (i != 15192) method3540(26, 92, -76, -90, 76, -7, -18, -119, 33, false)
    }

    override fun method3527(i: Int, renderable: Renderable?, i_1_: Int) {
        if (i_1_ != -16776) aIntRange_7301 = null
        this.aHa_Sub3_4479.method3850((-105).toByte(), renderable)
        anInt7300++
        this.aHa_Sub3_4479.method3923(true, i)
    }

    override fun method3520(i: Byte) {
        anInt7305++
        if (i.toInt() != 87) method3530(71)
        this.aHa_Sub3_4479.method3943(false, i + -32040)
    }

    override fun method3521(bool: Boolean, i: Byte) {
        anInt7303++
        if (i.toInt() != -103) method3527(-78, null, -100)
    }

    override fun method3530(i: Int): Boolean {
        if (i >= -57) return true
        anInt7307++
        return true
    }

    override fun method3526(i: Int, i_10_: Int, i_11_: Int) {
        if (i != 10756) aIntRange_7301 = null
        anInt7298++
    }
}
