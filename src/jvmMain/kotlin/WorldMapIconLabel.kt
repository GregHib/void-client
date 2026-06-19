import WorldMapIconLabelStatics.anInt8594

/* Class369_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
public open class WorldMapIconLabel(screenAnchorAlignment: ScreenAnchorAlignment?, tileRenderState: TileRenderState?, i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int) : WorldMapLabel(screenAnchorAlignment, tileRenderState, i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_) {
    @JvmField
    var anInt8595: Int = 0
    @JvmField
    var anInt8597: Int = 0
    @JvmField
    var anInt8599: Int = 0
    @JvmField
    var anInt8600: Int = 0
    @JvmField
    var anInt8602: Int = 0
    @JvmField
    var anInt8603: Int = 0

    override fun method51(i: Byte): ProjectileFactory? {
        anInt8594++
        if (i <= 116) return null
        return MapSceneDefLoaderStatics.aProjectileFactory_2489
    }

    init {
        try {
            this.anInt8600 = i_10_
            this.anInt8602 = i_9_
            this.anInt8603 = i_8_
            this.anInt8599 = i_6_
            this.anInt8597 = i_11_
            this.anInt8595 = i_7_
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("um.<init>(" + (if (screenAnchorAlignment != null) "{...}" else "null") + ',' + (if (tileRenderState != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ',' + i_10_ + ',' + i_11_ + ')'))
        }
    }
}
