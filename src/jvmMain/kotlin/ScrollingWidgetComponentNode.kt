import FontStatics.method2570
import ScrollingWidgetComponentNodeStatics.anInt8379

class ScrollingWidgetComponentNode internal constructor(js5Archive: Js5Archive?, class288_sub1: ParticleEmitterDefExt?) : WidgetComponentNode(js5Archive, class288_sub1) {
    private var anInt8383 = 0
    override fun method9(i: Byte, bool: Boolean) {
        anInt8379++
        val i_0_ = ((this.aParticleEmitterDef_4659!!.aScreenAnchorAlignment_4955!!.method1607(NpcSpawnDecoder.anInt1524, this.aAbstractModelRenderer_4655!!.method966(), (-117).toByte())) - -this.aParticleEmitterDef_4659!!.anInt4950)
        val i_1_ = ((this.aParticleEmitterDef_4659!!.aTileRenderState_4952!!.method2679(OpenGlRendererStatics.anInt7666, this.aAbstractModelRenderer_4655!!.method980(), 1595)) + this.aParticleEmitterDef_4659!!.anInt4951)
        this.aAbstractModelRenderer_4655!!.method981((this.aAbstractModelRenderer_4655!!.method966() / 2 + i_0_).toFloat(), (this.aAbstractModelRenderer_4655!!.method980() / 2 + i_1_).toFloat(), 4096, anInt8383)
        anInt8383 += (this.aParticleEmitterDef_4659 as ParticleEmitterDefExt).anInt8577
        if (i.toInt() != -49) method9((-26).toByte(), true)
    }
}
