import BasicGlRenderPassStatics.method3540
import OpenGlRendererStatics.method3743
import java.awt.Color
import MinimapPolygonDrawerStatics.anInt5240
import MinimapPolygonDrawerStatics.anInt5244
import MinimapPolygonDrawerStatics.anInt5252
import MinimapPolygonDrawerStatics.anInt5254
import MinimapPolygonDrawerStatics.method470

class MinimapPolygonDrawer internal constructor(private val anInt5246: Int, private val anInt5250: Int, private val anInt5245: Int, private var anInt5247: Int, private val anInt5236: Int, private val anInt5237: Int, private val anInt5243: Int, private val anInt5249: Int, i_29_: Int, i_30_: Int) : MinimapShapeDrawer(-1, i_29_, i_30_) {
    public override fun method457(i: Int, i_12_: Int, i_13_: Int) {
        anInt5254++
        val i_14_ = anInt5246 * i_12_ shr 12
        val i_15_ = anInt5250 * i shr 12
        val i_16_ = anInt5245 * i_12_ shr 12
        val i_17_ = anInt5247 * i shr 12
        val i_18_ = i_12_ * anInt5236 shr 12
        val i_19_ = anInt5237 * i shr 12
        val i_20_ = i_12_ * anInt5243 shr 12
        if (i_13_ > -29) anInt5252 = -91
        val i_21_ = anInt5249 * i shr 12
        method3540(i_15_, i_17_, this.anInt865, i_21_, i_16_, i_14_, i_18_, i_19_, i_20_, true)
    }

    public override fun method456(i: Int, i_31_: Int, i_32_: Int) {
        anInt5244++
        if (i < 87) anInt5247 = 18
    }

    public override fun method455(i: Int, i_35_: Int, i_36_: Int) {
        anInt5240++
        if (i_36_ >= -98) method470(null, (-17).toByte())
    }
}
