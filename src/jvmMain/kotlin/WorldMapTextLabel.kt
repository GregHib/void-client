import WorldMapTextLabelStatics.method3572
import WorldMapTextLabelStatics.anInt8586

/* Class369_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WorldMapTextLabel(screenAnchorAlignment: ScreenAnchorAlignment?, tileRenderState: TileRenderState?, i: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int) : WorldMapLabel(screenAnchorAlignment, tileRenderState, i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_) {
    @JvmField
    var anInt8585: Int = 0
    @JvmField
    var anInt8591: Int = 0
    override fun method51(i: Byte): ProjectileFactory? {
        if (i < 116) method3572(118)
        anInt8586++
        return ByteBufferStatics.aProjectileFactory_7175
    }

    init {
        try {
            this.anInt8585 = i_9_
            this.anInt8591 = i_8_
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("ou.<init>(" + (if (screenAnchorAlignment != null) "{...}" else "null") + ',' + (if (tileRenderState != null) "{...}" else "null") + ',' + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'))
        }
    }
}
