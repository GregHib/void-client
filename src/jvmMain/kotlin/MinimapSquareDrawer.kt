import TextureCubeProviderStatics.method2267
import NativeRendererStatics.method3873
import MinimapSquareDrawerStatics.method460
import MinimapSquareDrawerStatics.anInt5211
import MinimapSquareDrawerStatics.anInt5218
import MinimapSquareDrawerStatics.anInt5220
import MinimapSquareDrawerStatics.aBoolean5221

/* Class50_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MinimapSquareDrawer internal constructor(private var anInt5214: Int, private val anInt5212: Int, private val anInt5213: Int, private val anInt5222: Int, i_9_: Int, i_10_: Int, i_11_: Int) : MinimapShapeDrawer(i_9_, i_10_, i_11_) {
    public override fun method455(i: Int, i_0_: Int, i_1_: Int) {
        anInt5220++
        if (i_1_ >= -98) aBoolean5221 = false
        val i_2_ = anInt5214 * i shr 12
        val i_3_ = i * anInt5213 shr 12
        val i_4_ = anInt5212 * i_0_ shr 12
        val i_5_ = i_0_ * anInt5222 shr 12
        method2267(10499, i_5_, i_2_, this.anInt865, this.anInt864, this.anInt862, i_4_, i_3_)
    }

    public override fun method457(i: Int, i_12_: Int, i_13_: Int) {
        anInt5211++
        if (i_13_ >= -29) method460(-42)
    }

    public override fun method456(i: Int, i_14_: Int, i_15_: Int) {
        if (i <= 87) anInt5214 = -17
        anInt5218++
        val i_16_ = i_14_ * anInt5214 shr 12
        val i_17_ = anInt5213 * i_14_ shr 12
        val i_18_ = anInt5212 * i_15_ shr 12
        val i_19_ = i_15_ * anInt5222 shr 12
        RendererStatics.method3641(i_18_, i_19_, (-75).toByte(), this.anInt864, i_17_, i_16_)
    }
}
