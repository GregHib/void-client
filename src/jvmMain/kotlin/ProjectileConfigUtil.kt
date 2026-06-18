import BrightnessOptionState.Companion.method1745
import GlVertexBufferArb.Companion.method2127
import WaterMaterialPass.Companion.method2148
import NoiseTextureGenerator.Companion.method544

/* Class27 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object ProjectileConfigUtil {
    var anInt387: Int = 0
    @JvmField
    var anInt388: Int = 0
    @JvmField
    var aHashtable_389: Hashtable? = Hashtable(4)
    @JvmField
    var anInt390: Int = 0
    @JvmField
    var anInt391: Int = 0
    @JvmField
    var anInt392: Int = 0
    @JvmField
    var anInt393: Int = 0
    @JvmField
    var anInt394: Int = 0
    @JvmField
    var aFontMetaRef_395: FontMetaRef? = FontMetaRef(49, 6)
    @JvmField
    var anInt396: Int = -1
    @JvmField
    var anInt397: Int = 0
    var aFontMetaRef_398: FontMetaRef? = FontMetaRef(23, 8)
    @JvmField
    var aTileRenderState_399: TileRenderState? = TileRenderState()

    @JvmStatic
    fun method312(i: Int, i_0_: Byte) {
        ColourAdjustment.anInt859 = -1
        if (i != 37) {
            if (i != 50) {
                if (i != 75) {
                    if (i != 100) {
                        if (i == 200) MapRegionLoader.aFloat1249 = 16.0f
                    } else MapRegionLoader.aFloat1249 = 8.0f
                } else MapRegionLoader.aFloat1249 = 6.0f
            } else MapRegionLoader.aFloat1249 = 4.0f
        } else MapRegionLoader.aFloat1249 = 3.0f
        anInt397++
        ColourAdjustment.anInt859 = -1
        if (i_0_.toInt() != 56) anInt394 = 32
    }

    @JvmStatic
    fun method313(l: Long, i: Int): String? {
        var l = l
        try {
            anInt392++
            if (l <= 0L || l >= 6582952005840035281L) return null
            if (l % 37L == 0L) return null
            var i_1_ = 0
            var l_2_ = l
            while (l_2_ != 0L) {
                i_1_++
                l_2_ /= 37L
            }
            if (i >= -82) anInt396 = -58
            val stringbuffer = StringBuffer(i_1_)
            while (l != 0L) {
                val l_3_ = l
                l /= 37L
                stringbuffer.append(ColourAdjustment.aCharArray852!![(-(37L * l) + l_3_).toInt()])
            }
            return stringbuffer.reverse().toString()
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, "ht.A(" + l + ',' + i + ')')
        }
    }

    @JvmStatic
    fun method314(i: Byte, i_4_: Int) {
        if (i >= -31) anInt394 = -128
        SkeletalAnimFrameLoader.anInt481 = i_4_
        GlEnvMappedWaterPass.anInt7379 = 3
        anInt390++
        ClientLoadStateMachine.anInt2173 = 100
        HslAdjustTextureNode.anInt9399 = -1
    }

    @JvmStatic
    fun method315(i: Byte, string: String?): Int {
        anInt393++
        var i_5_ = 0
        if (i <= 70) return -84
        while ( /**/i_5_ < RgbNoiseTexture.aStringArray5305!!.size) {
            if (RgbNoiseTexture.aStringArray5305!![i_5_].equals(string, ignoreCase = true)) return i_5_
            i_5_++
        }
        return -1
    }

    @JvmStatic
    fun method316(i: Byte) {
        aHashtable_389 = null
        aFontMetaRef_398 = null
        aTileRenderState_399 = null
        if (i.toInt() != -94) method313(98L, -24)
        aFontMetaRef_395 = null
    }

    @JvmStatic
    fun method317(string: String?, i: Int, bool: Boolean) {
        anInt391++
        if (string != null) {
            if (ContactEntry.anInt9604 >= 100) method544((LocalizedText.aLocalizedText_3522!!.method2063(AnimationFrameDefinition.anInt6967, 544)), false, 4)
            else {
                val string_6_ = method2127(2, string)
                if (string_6_ != null) {
                    var i_7_ = 0
                    while ((i_7_ < ContactEntry.anInt9604)) {
                        val string_8_ = method2127(2, (NpcConfig.aStringArray932!![i_7_]))
                        if (string_8_ != null && string_8_ == string_6_) {
                            method544((string + (LocalizedText.aLocalizedText_3523!!.method2063(AnimationFrameDefinition.anInt6967, 544))), false, 4)
                            return
                        }
                        if (WeaveTextureNode.aStringArray9275!![i_7_] != null) {
                            val string_9_ = (method2127(2, (WeaveTextureNode.aStringArray9275!![i_7_])))
                            if (string_9_ != null && string_9_ == string_6_) {
                                method544(string + (LocalizedText.aLocalizedText_3523!!.method2063((AnimationFrameDefinition.anInt6967), 544)), false, 4)
                                return
                            }
                        }
                        i_7_++
                    }
                    if (i >= 90) {
                        for (i_10_ in 0..<HslAdjustTextureNode.anInt9383) {
                            val string_11_ = method2127(2, (WaterTextureSet.aStringArray1441!![i_10_]))
                            if (string_11_ != null && string_11_ == string_6_) {
                                method544(((LocalizedText.aLocalizedText_3528!!.method2063(AnimationFrameDefinition.anInt6967, 544)) + string + (LocalizedText.aLocalizedText_3529!!.method2063(AnimationFrameDefinition.anInt6967, 544))), false, 4)
                                return
                            }
                            if (FixedFunctionMaterialPass.aStringArray6205!![i_10_] != null) {
                                val string_12_ = (method2127(2, (FixedFunctionMaterialPass.aStringArray6205!![i_10_])))
                                if (string_12_ != null && string_12_ == string_6_) {
                                    method544(((LocalizedText.aLocalizedText_3528!!.method2063(AnimationFrameDefinition.anInt6967, 544)) + string + (LocalizedText.aLocalizedText_3529!!.method2063(AnimationFrameDefinition.anInt6967, 544))), false, 4)
                                    return
                                }
                            }
                        }
                        if (method2127(2, (LocalPlayerState.aPlayer_1907!!.aString10544)) == string_6_) method544((LocalizedText.aLocalizedText_3525!!.method2063(AnimationFrameDefinition.anInt6967, 544)), false, 4)
                        else {
                            WorldMapElement.anInt4628++
                            val class348_sub47 = (method2148(MinimapAreaMarkerNode.aFontMetaRef_9687, TheoraVideoStream.aIsaacCipher_9029, -94))
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, method1745(string, -65) - -1)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                            class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, if (!bool) 0 else 1)
                            InterfaceComponentGroup.method3243(-116, class348_sub47)
                        }
                    }
                }
            }
        }
    }
}
