import BrightnessOptionStateStatics.method1745
import GlVertexBufferArbStatics.method2127
import WaterMaterialPassStatics.method2148
import NoiseTextureGeneratorStatics.method544
import kotlin.math.max
import kotlin.math.min

object HslAdjustTextureNodeStatics {
    @JvmField
            var anInt9383: Int = 0
            @JvmField
            var anInt9384: Int = 0
            @JvmField
            var anInt9385: Int = 0
            @JvmField
            var anInt9387: Int = 0
            @JvmField
            var anInt9388: Int = 0
            @JvmField
            var anInt9391: Int = 0
            @JvmField
            var anInt9393: Int = 0
            @JvmField
            var anInt9394: Int = 0
            @JvmField
            var anInt9395: Int = 0
            @JvmField
            var anInt9397: Int = 0
            @JvmField
            var anInt9399: Int = -1
            @JvmField
            var aBoolean9403: Boolean = false
    
            @JvmStatic
            fun method3126(i: Byte) {
                if (i.toInt() != 98) anInt9388 = 46
                LruByteCacheStatics.aRenderer1098!!.method3700(RangedGraphicsOptionStateStatics.aFloat5945, ModelVertexColorBufferStatics.aFloat6586, NormalMapGeneratorStatics.aFloat3462)
                anInt9387++
            }
    
            @JvmStatic
            fun method3127(i: Int): TimedTileQueueEntry? {
                anInt9395++
                if (i != 2681) aBoolean9403 = true
                var class348_sub42_sub15 = (GlCubemapLightPassStatics.aLinkedNodeListIterator_7325!!.method1011(-47) as TimedTileQueueEntry?)
                if (class348_sub42_sub15 != null) {
                    class348_sub42_sub15.method2715(81.toByte())
                    class348_sub42_sub15.method3162(true)
                    return class348_sub42_sub15
                }
                do {
                    class348_sub42_sub15 = OpenGlTerrainTileStatics.aLinkedNodeListIterator_8241!!.method1011(-87) as TimedTileQueueEntry?
                    if (class348_sub42_sub15 == null) return null
                    if (GameClock.method599(-59) < class348_sub42_sub15.method3250((-51).toByte())) return null
                    class348_sub42_sub15.method2715(113.toByte())
                    class348_sub42_sub15.method3162(true)
                } while ((0x7fffffffffffffffL.inv() and class348_sub42_sub15.aLong7057) == 0L)
                return class348_sub42_sub15
            }
    
            @JvmStatic
            fun method3128(i: Int, string: String?) {
                do {
                    try {
                        anInt9391++
                        if (string != null) {
                            if (anInt9383 >= 200 && !FrameBufferObjectStatics.aBoolean4888 || anInt9383 >= 200) {
                                method544((LocalizedTextStatics.aLocalizedText_3493!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544)), false, 4)
                                val string_0_ = LocalizedTextStatics.aLocalizedText_3494!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544)
                                if (string_0_ != null) method544(string_0_, false, 4)
                            } else {
                                val string_1_ = method2127(2, string)
                                if (string_1_ != null) {
                                    var i_2_ = 0
                                    while ((anInt9383 > i_2_)) {
                                        val string_3_ = (method2127(2, WaterTextureSetStatics.aStringArray1441!![i_2_]))
                                        if (string_3_ != null && string_3_ == string_1_) {
                                            method544((string + (LocalizedTextStatics.aLocalizedText_3521!!.method2063((AnimationFrameDefinitionStatics.anInt6967), 544))), false, 4)
                                            return
                                        }
                                        if (FixedFunctionMaterialPassStatics.aStringArray6205!![i_2_] != null) {
                                            val string_4_ = (method2127(2, (FixedFunctionMaterialPassStatics.aStringArray6205!![i_2_])))
                                            if (string_4_ != null && string_4_ == string_1_) {
                                                method544((string + (LocalizedTextStatics.aLocalizedText_3521!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544))), false, 4)
                                                return
                                            }
                                        }
                                        i_2_++
                                    }
                                    for (i_5_ in 0..<ContactEntryStatics.anInt9604) {
                                        val string_6_ = (method2127(2, NpcConfigStatics.aStringArray932!![i_5_]))
                                        if (string_6_ != null && string_6_ == string_1_) {
                                            method544(((LocalizedTextStatics.aLocalizedText_3526!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544)) + string + (LocalizedTextStatics.aLocalizedText_3527!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544))), false, 4)
                                            return
                                        }
                                        if (WeaveTextureNodeStatics.aStringArray9275!![i_5_] != null) {
                                            val string_7_ = (method2127(2, (WeaveTextureNodeStatics.aStringArray9275!![i_5_])))
                                            if (string_7_ != null && string_7_ == string_1_) {
                                                method544(((LocalizedTextStatics.aLocalizedText_3526!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544)) + string + (LocalizedTextStatics.aLocalizedText_3527!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544))), false, 4)
                                                return
                                            }
                                        }
                                    }
                                    if (method2127(2, (LocalPlayerState.aPlayer_1907!!.aString10544)) == string_1_) method544((LocalizedTextStatics.aLocalizedText_3524!!.method2063(AnimationFrameDefinitionStatics.anInt6967, 544)), false, 4)
                                    else {
                                        HitsplatDefinitionStatics.anInt2012++
                                        val class348_sub47 = (method2148(LoadingBarRendererStatics.aFontMetaRef_5057, TheoraVideoStreamStatics.aIsaacCipher_9029, -85))
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, method1745(string, -65))
                                        class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                                        InterfaceComponentGroupStatics.method3243(123, class348_sub47)
                                        if (i <= -31) break
                                        method3127(-4)
                                    }
                                }
                            }
                        }
                    } catch (runtimeexception: RuntimeException) {
                        throw SoundBankPatchStatics.method2929(runtimeexception, ("vj.B(" + i + ',' + (if (string != null) "{...}" else "null") + ')'))
                    }
                    break
                } while (false)
            }
}
