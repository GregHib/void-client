import BrightnessOptionStateStatics.method1745
import GlVertexBufferArbStatics.method2127
import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glLoadIdentity
import jaggl.OpenGLStatics.glMatrixMode
import jaggl.OpenGLStatics.glPopMatrix
import jaggl.OpenGLStatics.glPushMatrix
import jaggl.OpenGLStatics.glScalef
import jaggl.OpenGLStatics.glTexEnvf
import jaggl.OpenGLStatics.glTexGenfv
import jaggl.OpenGLStatics.glTexGeni

object ScrollTexMaterialPassStatics {
    @JvmField
            var aJs5Archive_6277: Js5Archive? = null
            @JvmField
            var anInt6279: Int = 0
            @JvmField
            var anInt6280: Int = 0
            @JvmField
            var anInt6281: Int = 0
            @JvmField
            var anInt6282: Int = 0
            @JvmField
            var anInt6283: Int = 0
            @JvmField
            var anInt6286: Int = 0
            @JvmField
            var anInt6287: Int = 0
            @JvmField
            var anInt6288: Int = 0
            @JvmField
            var aBoolean6289: Boolean = false
            @JvmField
            var anIntArray6290: IntArray? = IntArray(2048)
            @JvmField
            var anInt6291: Int = 0
    
            @JvmStatic
            fun method2165(bool: Boolean, string: String?) {
                var string = string
                anInt6287++
                if (string != null) {
                    if (string.startsWith("*")) string = string.substring(1)
                    val string_0_ = method2127(2, string)
                    if (string_0_ != null) {
                        var i = 0
                        while ((HslAdjustTextureNodeStatics.anInt9383 > i)) {
                            var string_1_ = WaterTextureSetStatics.aStringArray1441!![i]
                            if (string_1_!!.startsWith("*")) string_1_ = string_1_.substring(1)
                            string_1_ = method2127(2, string_1_)
                            if (string_1_ != null && string_1_ == string_0_) {
                                HslAdjustTextureNodeStatics.anInt9383--
                                for (i_2_ in i..<HslAdjustTextureNodeStatics.anInt9383) {
                                    WaterTextureSetStatics.aStringArray1441!![i_2_] = WaterTextureSetStatics.aStringArray1441!![i_2_ - -1]
                                    FixedFunctionMaterialPassStatics.aStringArray6205!![i_2_] = FixedFunctionMaterialPassStatics.aStringArray6205!![1 + i_2_]
                                    RendererStatics.anIntArray4578!![i_2_] = RendererStatics.anIntArray4578!![i_2_ - -1]
                                    GlBufferObjectStatics.aStringArray4744!![i_2_] = GlBufferObjectStatics.aStringArray4744!![1 + i_2_]
                                    NpcCountAccessor.anIntArray2280!![i_2_] = NpcCountAccessor.anIntArray2280!![i_2_ - -1]
                                    ObjectSpawnDecoder.aBooleanArray1806!![i_2_] = ObjectSpawnDecoder.aBooleanArray1806!![1 + i_2_]
                                }
                                Crc64HashableStatics.anInt4985 = ResourceLoaderThreadStatics.anInt3918
                                ConfigShortValueNodeStatics.anInt9540++
                                val class348_sub47: OutgoingPacketNode = WaterMaterialPassStatics.method2148(SceneCollisionEntryStatics.aFontMetaRef_4394, (TheoraVideoStreamStatics.aIsaacCipher_9029), -99)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, method1745(string, -65))
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                                InterfaceComponentGroupStatics.method3243(117, class348_sub47)
                                break
                            }
                            i++
                        }
                        if (bool != true) aBoolean6289 = true
                    }
                }
            }
    
            @JvmStatic
            fun method2166(i: Int) {
                if (i == 6336) {
                    aJs5Archive_6277 = null
                    anIntArray6290 = null
                }
            }
    
            @JvmStatic
            fun method2168(i: Int, i_7_: Int, i_8_: Int) {
                val class357 = HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!![i]!![i_7_]!![i_8_]
                if (class357 != null) {
                    ParticleDefLoaderStatics.method1376(class357.aClass318_Sub1_Sub5_4395)
                    ParticleDefLoaderStatics.method1376(class357.aClass318_Sub1_Sub5_4407)
                    if (class357.aClass318_Sub1_Sub5_4395 != null) class357.aClass318_Sub1_Sub5_4395 = null
                    if (class357.aClass318_Sub1_Sub5_4407 != null) class357.aClass318_Sub1_Sub5_4407 = null
                }
            }
    
            @JvmStatic
            fun method2169(i: Int, i_10_: Int, i_11_: Int, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int, i_16_: Int, i_17_: Int, bool: Boolean): Boolean {
                var i = i
                var i_10_ = i_10_
                var i_11_ = i_11_
                var i_12_ = i_12_
                var i_13_ = i_13_
                var i_14_ = i_14_
                var i_15_ = i_15_
                var i_16_ = i_16_
                var i_17_ = i_17_
                anInt6281++
                if (!ModelLightingConfigStatics.method1422(i_16_, i_11_, i, -7596)) return false
                i_16_ = SequencedWallEntityStatics.anIntArray10172!![1]
                i = SequencedWallEntityStatics.anIntArray10172!![0]
                i_11_ = SequencedWallEntityStatics.anIntArray10172!![2]
                if (!ModelLightingConfigStatics.method1422(i_15_, i_17_, i_10_, -7596)) return false
                i_10_ = SequencedWallEntityStatics.anIntArray10172!![0]
                i_17_ = SequencedWallEntityStatics.anIntArray10172!![2]
                i_15_ = SequencedWallEntityStatics.anIntArray10172!![1]
                if (!ModelLightingConfigStatics.method1422(i_14_, i_13_, i_12_, -7596)) return false
                i_13_ = SequencedWallEntityStatics.anIntArray10172!![2]
                if (bool != false) return false
                i_14_ = SequencedWallEntityStatics.anIntArray10172!![1]
                i_12_ = SequencedWallEntityStatics.anIntArray10172!![0]
                return TextureMapImageNodeStatics.method3125(i_12_, i_16_, i_10_, i_13_, i_17_, (-76).toByte(), i_15_, i_11_, i, i_14_)
            }
}
