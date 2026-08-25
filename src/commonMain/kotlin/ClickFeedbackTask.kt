import kotlin.jvm.JvmStatic
import ProjectionCameraTransform.Companion.method943
import ParticleSystemState.Companion.method1296
import ParticleTileShape.Companion.method2732
import AbstractBloomEffect.Companion.method2755
import lang.Class
import lang.jClass

/* Class177 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ClickFeedbackTask internal constructor(private val aRsaVarbitHandler_4671: RsaVarbitHandler) : Lifecycle {
    override fun method9(i: Byte, bool: Boolean) {
        if (bool) FacingDirectionNode.aRenderer6654!!.aa(0, 0, LocTypeDefinition.anInt4017, GameDisplayManager.anInt10432, aRsaVarbitHandler_4671.anInt4899, 0)
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

    companion object {
        var anInt4663: Int = 0
        var anInt4664: Int = 0

        var anInt4665: Int = 0
        var anInt4666: Int = 0
        var anInt4667: Int = 0
        var anInt4668: Int = 0

        var anInt4669: Int = 0

        var anIntArray4670: IntArray? = IntArray(3)
        fun method1352(i: Int, i_0_: Int, i_1_: Int, i_2_: Byte) {
            var i_0_ = i_0_
            anInt4664++
            if (i_2_.toInt() != -98) method1354(69.toByte())
            i_0_ = (i_0_ * IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7260!!.method1838(-32350) shr 8)
            if (i_0_ != 0 && i != -1) {
                if (!RgbColorPalette.aBoolean1236 && SlotBinding.anInt3428 != -1 && method1296(true) && !FileIoUtil.method2605((-99).toByte())) {
                    HeadIconRenderer.aClass348_Sub16_Sub3_2718 = method943(false)
                    val class348_sub16_sub3 = NpcCountAccessor.method1326(HeadIconRenderer.aClass348_Sub16_Sub3_2718, i_2_.toInt() xor 0x68.inv())
                    ParticleEmitterListNode.method3273(true, -95, class348_sub16_sub3)
                }
                method2732(0, i, false, 102, TheoraVideoStream.aJs5Archive_9033, i_0_)
                method2755(-1, 255, -1)
                RgbColorPalette.aBoolean1236 = true
            }
        }

        @JvmStatic
        fun method1353(i: Int, i_4_: Int, i_5_: Int, var_class: Class<out Any?>?): GroundDecorEntity? {
            val class357 = HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_4_]!![i_5_]
            if (class357 == null) return null
            var class148 = class357.aWidgetNodeLink_4396
            while (class148 != null) {
                val class318_sub1_sub3 = class148.aClass318_Sub1_Sub3_2040
                if (var_class!!.isAssignableFrom(class318_sub1_sub3!!.jClass) && class318_sub1_sub3.aShort8743.toInt() == i_4_ && (class318_sub1_sub3.aShort8750.toInt() == i_5_)) return class318_sub1_sub3
                class148 = class148.aWidgetNodeLink_2038
            }
            return null
        }

        @JvmStatic
        fun method1354(i: Byte) {
            if (i.toInt() == -22) anIntArray4670 = null
        }
    }
}
