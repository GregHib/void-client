import MinimapFlagRenderer.method1084
import MinimapSpriteRendererStatics.anInt4927

/* Class125 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MinimapSpriteRenderer internal constructor(i: Int, screenAnchorAlignment: ScreenAnchorAlignment?, tileRenderState: TileRenderState?, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Int, i_18_: Int, bool: Boolean) : ConfigTypeProvider {
    @JvmField
    var anInt4913: Int = 0
    @JvmField
    var aBoolean4914: Boolean = false
    @JvmField
    var anInt4917: Int = 0
    @JvmField
    var anInt4918: Int = 0
    @JvmField
    var anInt4920: Int = 0
    @JvmField
    var aScreenAnchorAlignment_4922: ScreenAnchorAlignment? = null
    @JvmField
    var anInt4923: Int = 0
    @JvmField
    var anInt4924: Int = 0
    @JvmField
    var aTileRenderState_4925: TileRenderState? = null
    @JvmField
    var anInt4928: Int = 0
    @JvmField
    var anInt4929: Int = 0
    override fun method51(i: Byte): ProjectileFactory? {
        if (i <= 116) return null
        anInt4927++
        return MatrixCameraTransformStatics.aProjectileFactory_5689
    }

    init {
        try {
            this.aBoolean4914 = bool
            this.anInt4923 = i_15_
            this.anInt4918 = i
            this.anInt4924 = i_12_
            this.anInt4913 = i_16_
            this.anInt4929 = i_14_
            this.anInt4920 = i_13_
            this.anInt4917 = i_18_
            this.aTileRenderState_4925 = tileRenderState
            this.anInt4928 = i_17_
            this.aScreenAnchorAlignment_4922 = screenAnchorAlignment
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("nha.<init>(" + i + ',' + (if (screenAnchorAlignment != null) "{...}" else "null") + ',' + (if (tileRenderState != null) "{...}" else "null") + ',' + i_12_ + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + bool + ')'))
        }
    }
}
