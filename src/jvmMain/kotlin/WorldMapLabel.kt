import WorldMapLabelStatics.anInt4967

/* Class369 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
public open class WorldMapLabel(screenAnchorAlignment: ScreenAnchorAlignment?, tileRenderState: TileRenderState?, i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) : ConfigTypeProvider {
    @JvmField
    var anInt4959: Int = 0
    @JvmField
    var anInt4961: Int = 0
    @JvmField
    var anInt4963: Int = 0
    @JvmField
    var anInt4965: Int = 0
    @JvmField
    var anInt4966: Int = 0
    @JvmField
    var aScreenAnchorAlignment_4968: ScreenAnchorAlignment? = null
    @JvmField
    var anInt4970: Int = 0
    @JvmField
    var anInt4971: Int = 0
    @JvmField
    var aTileRenderState_4973: TileRenderState? = null

    override fun method51(i: Byte): ProjectileFactory? {
        if (i < 116) return null
        anInt4967++
        return null
    }

    init {
        try {
            this.anInt4961 = i_8_
            this.anInt4971 = i_4_
            this.anInt4965 = i_7_
            this.anInt4966 = i_6_
            this.anInt4959 = i_3_
            this.aTileRenderState_4973 = tileRenderState
            this.anInt4970 = i
            this.aScreenAnchorAlignment_4968 = screenAnchorAlignment
            this.anInt4963 = i_5_
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("fn.<init>(" + (if (screenAnchorAlignment != null) "{...}" else "null") + ',' + (if (tileRenderState != null) "{...}" else "null") + ',' + i + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'))
        }
    }
}
