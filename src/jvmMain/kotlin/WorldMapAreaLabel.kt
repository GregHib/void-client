import WorldMapAreaLabelStatics.anInt8581

/* Class369_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WorldMapAreaLabel(screenAnchorAlignment: ScreenAnchorAlignment?, tileRenderState: TileRenderState?, i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int) : WorldMapLabel(screenAnchorAlignment, tileRenderState, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_) {
    @JvmField
    var anInt8580: Int = 0
    @JvmField
    var anInt8582: Int = 0
    override fun method51(i: Byte): ProjectileFactory? {
        if (i <= 116) method51((-95).toByte())
        anInt8581++
        return SkyboxGradient.aProjectileFactory_3934
    }

    init {
        try {
            this.anInt8580 = i_7_
            this.anInt8582 = i_8_
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("kh.<init>(" + (if (screenAnchorAlignment != null) "{...}" else "null") + ',' + (if (tileRenderState != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ')'))
        }
    }
}
