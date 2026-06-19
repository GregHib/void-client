import HeapInfoRecordStatics.method1248
import GameClock.method596
import ParticleEmitterDefExtStatics.method2190
import ParticleEmitterDefExtStatics.anInt8574

/* Class288_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ParticleEmitterDefExt internal constructor(i: Int, screenAnchorAlignment: ScreenAnchorAlignment?, tileRenderState: TileRenderState?, i_0_: Int, i_1_: Int, i_2_: Int) : ParticleEmitterDef(i, screenAnchorAlignment, tileRenderState, i_0_, i_1_) {
    var anInt8577: Int = 0

    init {
        try {
            this.anInt8577 = i_2_
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("wg.<init>(" + i + ',' + (if (screenAnchorAlignment != null) "{...}" else "null") + ',' + (if (tileRenderState != null) "{...}" else "null") + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ')'))
        }
    }

    override fun method51(i: Byte): ProjectileFactory? {
        anInt8574++
        if (i <= 116) method2190(false)
        return ItemNameResolverStatics.aProjectileFactory_4997
    }
}
