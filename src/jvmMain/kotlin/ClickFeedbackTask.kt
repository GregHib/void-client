import ProjectionCameraTransformStatics.method943
import ParticleSystemStateStatics.method1296
import ParticleTileShapeStatics.method2732
import AbstractBloomEffectStatics.method2755
import ClickFeedbackTaskStatics.method1354
import ClickFeedbackTaskStatics.anInt4663
import ClickFeedbackTaskStatics.anInt4666
import ClickFeedbackTaskStatics.anInt4667
import ClickFeedbackTaskStatics.anInt4668

/* Class177 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ClickFeedbackTask internal constructor(private val aRsaVarbitHandler_4671: RsaVarbitHandler) : Lifecycle {
    override fun method9(i: Byte, bool: Boolean) {
        if (bool) FacingDirectionNodeStatics.aRenderer6654!!.aa(0, 0, LocTypeDefinitionStatics.anInt4017, HardCacheEntryReferenceStatics.anInt10432, aRsaVarbitHandler_4671.anInt4899, 0)
        anInt4668++
        if (i.toInt() != -49) anInt4666 = -20
    }

    override fun method7(i: Int) {
        anInt4667++
        if (i != 10286) method1354(42.toByte())
    }

    override fun method8(i: Byte): Boolean {
        anInt4663++
        val i_3_ = 35 / ((i - 25) / 52)
        return true
    }
}
