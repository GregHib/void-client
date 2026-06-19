import java.awt.event.ActionEvent
import WorldMapPolygonIconLabelStatics.anInt10175

class WorldMapPolygonIconLabel(screenAnchorAlignment: ScreenAnchorAlignment?, tileRenderState: TileRenderState?, i: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Int, i_18_: Int, i_19_: Int, i_20_: Int, i_21_: Int, i_22_: Int, i_23_: Int, i_24_: Int, i_25_: Int) : WorldMapIconLabel(screenAnchorAlignment, tileRenderState, i, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_) {
    @JvmField
    var anInt10177: Int = 0
    override fun method51(i: Byte): ProjectileFactory? {
        anInt10175++
        if (i < 116) this.anInt10177 = -10
        return LocTypeDefLoaderStatics.aProjectileFactory_2507
    }

    init {
        try {
            this.anInt10177 = i_25_
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("fu.<init>(" + (if (screenAnchorAlignment != null) "{...}" else "null") + ',' + (if (tileRenderState != null) "{...}" else "null") + ',' + i + ',' + i_13_ + ',' + i_14_ + ',' + i_15_ + ',' + i_16_ + ',' + i_17_ + ',' + i_18_ + ',' + i_19_ + ',' + i_20_ + ',' + i_21_ + ',' + i_22_ + ',' + i_23_ + ',' + i_24_ + ',' + i_25_ + ')'))
        }
    }
}
