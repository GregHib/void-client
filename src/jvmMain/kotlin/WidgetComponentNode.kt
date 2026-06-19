import GlRectangleTextureStatics.method253
import IdentKitRecolorStatics.method203
import WidgetComponentNodeStatics.anInt4653
import WidgetComponentNodeStatics.anInt4656
import WidgetComponentNodeStatics.anInt4658
import WidgetComponentNodeStatics.anInt4660

/* Class127 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class WidgetComponentNode(js5Archive: Js5Archive?, particleEmitterDef: ParticleEmitterDef?) : Lifecycle {
    var aAbstractModelRenderer_4655: AbstractModelRenderer? = null
    var aParticleEmitterDef_4659: ParticleEmitterDef? = null
    private val aJs5Archive_4661: Js5Archive?
    override fun method8(i: Byte): Boolean {
        val i_0_ = -79 / ((i - 25) / 52)
        anInt4658++
        return aJs5Archive_4661!!.method421(false, (this.aParticleEmitterDef_4659!!.anInt4958))
    }

    override fun method9(i: Byte, bool: Boolean) {
        anInt4653++
        if (bool) {
            val i_1_ = ((this.aParticleEmitterDef_4659!!.aScreenAnchorAlignment_4955!!.method1607(NpcSpawnDecoder.anInt1524, this.aAbstractModelRenderer_4655!!.method966(), (-117).toByte())) + this.aParticleEmitterDef_4659!!.anInt4950)
            val i_2_ = ((this.aParticleEmitterDef_4659!!.aTileRenderState_4952!!.method2679(OpenGlRendererStatics.anInt7666, this.aAbstractModelRenderer_4655!!.method980(), 1595)) - -this.aParticleEmitterDef_4659!!.anInt4951)
            this.aAbstractModelRenderer_4655!!.method974(i_1_, i_2_)
        }
        if (i.toInt() != -49) anInt4656 = 26
    }

    override fun method7(i: Int) {
        if (i != 10286) anInt4656 = -123
        this.aAbstractModelRenderer_4655 = WorldMapPolygonIconLabelStatics.method3577((this.aParticleEmitterDef_4659!!.anInt4958), (-60).toByte(), aJs5Archive_4661!!)
        anInt4660++
    }

    init {
        try {
            aJs5Archive_4661 = js5Archive
            this.aParticleEmitterDef_4659 = particleEmitterDef
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("nl.<init>(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (particleEmitterDef != null) "{...}" else "null") + ')'))
        }
    }
}
