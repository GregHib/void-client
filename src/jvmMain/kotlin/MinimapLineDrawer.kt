import MinimapLineDrawerStatics.anInt5256
import MinimapLineDrawerStatics.anInt5260
import MinimapLineDrawerStatics.anInt5261

/* Class50_Sub4 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MinimapLineDrawer internal constructor(private val anInt5255: Int, private val anInt5259: Int, private var anInt5264: Int, private val anInt5258: Int, i_13_: Int, i_14_: Int) : MinimapShapeDrawer(-1, i_13_, i_14_) {
    public override fun method455(i: Int, i_0_: Int, i_1_: Int) {
        anInt5256++
    }

    public override fun method457(i: Int, i_2_: Int, i_3_: Int) {
        anInt5261++
        val i_4_ = i_2_ * anInt5255 shr 12
        if (i_3_ >= -29) anInt5264 = 119
        val i_5_ = i_2_ * anInt5264 shr 12
        val i_6_ = anInt5259 * i shr 12
        val i_7_ = anInt5258 * i shr 12
        MapRegionLoaderThreadStatics.method2665(i_4_, 118.toByte(), this.anInt865, i_6_, i_7_, i_5_)
    }

    public override fun method456(i: Int, i_8_: Int, i_9_: Int) {
        if (i < 87) anInt5264 = 33
        anInt5260++
    }
}
