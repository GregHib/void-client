import ProjectileFactoryStatics.method1613
import Texture2DProviderStatics.method2259
import LinkedListNodeStatics.method2709
import AbstractModelStatics.method616
import ParticleEmitterDefStatics.anInt4957

/* Class288 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class ParticleEmitterDef internal constructor(i: Int, screenAnchorAlignment: ScreenAnchorAlignment?, tileRenderState: TileRenderState?, i_2_: Int, i_3_: Int) : ConfigTypeProvider {
    @JvmField
    var anInt4950: Int = 0
    @JvmField
    var anInt4951: Int = 0
    @JvmField
    var aTileRenderState_4952: TileRenderState? = null
    @JvmField
    var aScreenAnchorAlignment_4955: ScreenAnchorAlignment? = null
    @JvmField
    var anInt4958: Int = 0

    override fun method51(i: Byte): ProjectileFactory? {
        anInt4957++
        return WeaveTextureNodeStatics.aProjectileFactory_9274
    }

    init {
        try {
            this.anInt4950 = i_2_
            this.anInt4958 = i
            this.anInt4951 = i_3_
            this.aScreenAnchorAlignment_4955 = screenAnchorAlignment
            this.aTileRenderState_4952 = tileRenderState
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("vr.<init>(" + i + ',' + (if (screenAnchorAlignment != null) "{...}" else "null") + ',' + (if (tileRenderState != null) "{...}" else "null") + ',' + i_2_ + ',' + i_3_ + ')'))
        }
    }
}
