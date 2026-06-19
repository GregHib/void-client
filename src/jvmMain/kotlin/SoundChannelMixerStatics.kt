import ArrayCopyUtil.method1573
import TexGenMaterialPassStatics.method2161
import GameClock.method599
import java.awt.Component
import kotlin.math.min

object SoundChannelMixerStatics {
    var anInt3594: Int = 0
            var anInt3595: Int = 0
            var anInt3596: Int = 0
            var anInt3597: Int = 0
            var anInt3598: Int = 0
            var anInt3599: Int = 0
            var anInt3600: Int = 0
            var anInt3605: Int = 0
            var anInt3606: Int = 0
            var anInt3607: Int = 0
            var anInt3608: Int = 0
            var anInt3609: Int = 0
            var anInt3611: Int = 0
            var anInt3612: Int = 0
            @JvmStatic
            fun method2090(i: Int, i_20_: Int, bool: Boolean, i_21_: Byte, i_22_: Int, i_23_: Int, i_24_: Int) {
                if ((if (bool) IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7215!!.method1838(-32350) else IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7272!!.method1838(-32350)) != 0 && i != 0 && HintArrowOrMessageStatics.anInt2021 < 50 && i_24_ != -1) GlTextureCubeMapStatics.aParticleEmitterNodeArray8531s!![HintArrowOrMessageStatics.anInt2021++] = ParticleEmitterNode(if (!bool) 2.toByte() else 3.toByte(), i_24_, i, i_23_, i_22_, 0, i_20_, null)
                if (i_21_.toInt() == -35) anInt3608++
            }
    
            @JvmStatic
            fun method2092(i: Int, i_25_: Int, `is`: IntArray?, i_26_: Int, objects: Array<Any?>?) {
                try {
                    val i_27_ = -92 / ((i_26_ - -55) / 57)
                    if (i_25_ < i) {
                        val i_28_ = (i + i_25_) / 2
                        var i_29_ = i_25_
                        val i_30_ = `is`!![i_28_]
                        `is`[i_28_] = `is`[i]
                        `is`[i] = i_30_
                        val `object` = objects!![i_28_]
                        objects[i_28_] = objects[i]
                        objects[i] = `object`
                        val i_31_ = if (i_30_ != 2147483647) 1 else 0
                        for (i_32_ in i_25_..<i) {
                            if (`is`[i_32_] < (i_31_ and i_32_) + i_30_) {
                                val i_33_ = `is`[i_32_]
                                `is`[i_32_] = `is`[i_29_]
                                `is`[i_29_] = i_33_
                                val object_34_ = objects[i_32_]
                                objects[i_32_] = objects[i_29_]
                                objects[i_29_++] = object_34_
                            }
                        }
                        `is`[i] = `is`[i_29_]
                        `is`[i_29_] = i_30_
                        objects[i] = objects[i_29_]
                        objects[i_29_] = `object`
                        method2092(-1 + i_29_, i_25_, `is`, 9, objects)
                        method2092(i, i_29_ - -1, `is`, -127, objects)
                    }
                    anInt3594++
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("cba.K(" + i + ',' + i_25_ + ',' + (if (`is` != null) "{...}" else "null") + ',' + i_26_ + ',' + (if (objects != null) "{...}" else "null") + ')'))
                }
            }
}
