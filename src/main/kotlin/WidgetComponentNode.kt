import GlRectangleTexture.Companion.method253
import IdentKitRecolor.Companion.method203

/* Class127 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
open class WidgetComponentNode(js5Archive: Js5Archive?, particleEmitterDef: ParticleEmitterDef?) : Interface1 {
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
            val i_2_ = ((this.aParticleEmitterDef_4659!!.aTileRenderState_4952!!.method2679(OpenGlRenderer.anInt7666, this.aAbstractModelRenderer_4655!!.method980(), 1595)) - -this.aParticleEmitterDef_4659!!.anInt4951)
            this.aAbstractModelRenderer_4655!!.method974(i_1_, i_2_)
        }
        if (i.toInt() != -49) anInt4656 = 26
    }

    override fun method7(i: Int) {
        if (i != 10286) anInt4656 = -123
        this.aAbstractModelRenderer_4655 = WorldMapPolygonIconLabel.method3577((this.aParticleEmitterDef_4659!!.anInt4958), (-60).toByte(), aJs5Archive_4661!!)
        anInt4660++
    }

    init {
        try {
            aJs5Archive_4661 = js5Archive
            this.aParticleEmitterDef_4659 = particleEmitterDef
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("nl.<init>(" + (if (js5Archive != null) "{...}" else "null") + ',' + (if (particleEmitterDef != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt4652: Int = 0
        @JvmField
        var anInt4653: Int = 0
        @JvmField
        var anIntArray4654: IntArray? = null
        @JvmField
        var anInt4656: Int = 0
        @JvmField
        var anInt4657: Int = 0
        @JvmField
        var anInt4658: Int = 0
        @JvmField
        var anInt4660: Int = 0
        @JvmField
        var anInt4662: Int = 0

        fun method1115(i: Int, i_3_: Int, i_4_: Byte): Int {
            anInt4652++
            var i_5_ = i - -(57 * i_3_)
            i_5_ = i_5_ xor (i_5_ shl 13)
            val i_6_ = -76 / ((i_4_ - 22) / 60)
            val i_7_ = 1376312589 + i_5_ * (15731 * i_5_ * i_5_ + 789221) and 0x7fffffff
            return (i_7_ and 0x7fa112f) shr 19
        }

        fun method1116(i: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Byte) {
            if (WorldMapLabel.anInt4960 > i_9_ + -i_10_ || CameraNodeList.anInt1745 < i_10_ + i_9_ || LocalPlayerState.anInt1910 > i - i_10_ || i - -i_10_ > WidgetTextConfig.anInt513) method203(-107, i_9_, i_8_, i, i_10_)
            else method253(i, i_9_, -648, i_8_, i_10_)
            anInt4662++
            val i_12_ = -68 / ((40 - i_11_) / 36)
        }

        @JvmStatic
        fun method1117(i: Int) {
            anIntArray4654 = null
            val i_13_ = -13 / ((i - 57) / 47)
        }
    }
}
