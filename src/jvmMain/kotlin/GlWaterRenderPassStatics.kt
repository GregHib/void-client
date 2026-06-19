import BrightnessOptionStateStatics.method1745
import GlVertexBufferArbStatics.method2127
import WaterMaterialPassStatics.method2148
import jaggl.OpenGLStatics.glBindProgramARB
import jaggl.OpenGLStatics.glDisable
import jaggl.OpenGLStatics.glEnable
import jaggl.OpenGLStatics.glProgramLocalParameter4fARB
import ArbVertexProgramStatics.method3442

object GlWaterRenderPassStatics {
    @JvmField
            var anInt7286: Int = 0
            @JvmField
            var anInt7287: Int = 0
            @JvmField
            var anInt7288: Int = 0
            @JvmField
            var anInt7289: Int = 0
            @JvmField
            var aShortArrayArrayArray7290: Array<Array<ShortArray?>?>? = null
            @JvmField
            var anInt7291: Int = 0
            @JvmField
            var anInt7292: Int = 0
            @JvmField
            var anInt7295: Int = 0
            @JvmField
            var anInt7297: Int = 0
    
            @JvmStatic
            fun method3536(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, class318_sub1_sub2: SceneObjectEntity) {
                val class357 = StringValueNodeStatics.method3321(i, i_0_, i_1_)
                if (class357 != null) {
                    class318_sub1_sub2.x = (i_0_ shl Tooltip.anInt4459) + TheoraVideoStreamStatics.anInt9037
                    class318_sub1_sub2.anInt6382 = i_2_
                    class318_sub1_sub2.y = (i_1_ shl Tooltip.anInt4459) + TheoraVideoStreamStatics.anInt9037
                    class357.aClass318_Sub1_Sub2_4408 = class318_sub1_sub2
                    val i_3_ = if (NativeSpriteStatics.aTerrainTileArray5191 == SoundCacheState.aTerrainTileArray4142) 1 else 0
                    if (class318_sub1_sub2.method2376(-52)) {
                        if (class318_sub1_sub2.method2377(122.toByte())) {
                            class318_sub1_sub2.aClass318_Sub1_6379 = BackgroundWorkerThreadStatics.aClass318_Sub1Array3226!![i_3_]
                            BackgroundWorkerThreadStatics.aClass318_Sub1Array3226!![i_3_] = class318_sub1_sub2
                        } else {
                            class318_sub1_sub2.aClass318_Sub1_6379 = LinkedListNodeStatics.aClass318_Sub1Array4293!![i_3_]
                            LinkedListNodeStatics.aClass318_Sub1Array4293!![i_3_] = class318_sub1_sub2
                            PcmStreamBufferStatics.aBoolean8870 = true
                        }
                    } else {
                        class318_sub1_sub2.aClass318_Sub1_6379 = OverlayColorTable.aClass318_Sub1Array1754!![i_3_]
                        OverlayColorTable.aClass318_Sub1Array1754!![i_3_] = class318_sub1_sub2
                    }
                }
            }
    
            @JvmStatic
            fun method3537(i: Int) {
                aShortArrayArrayArray7290 = null
                if (i != 34336) anInt7297 = 99
            }
    
            @JvmStatic
            fun method3538(bool: Boolean, string: String?) {
                var string = string
                anInt7291++
                if (string != null) {
                    if (string.startsWith("*")) string = string.substring(1)
                    val string_8_ = method2127(2, string)
                    if (string_8_ != null) {
                        var i = 0
                        while ((ContactEntryStatics.anInt9604 > i)) {
                            var string_9_ = NpcConfigStatics.aStringArray932!![i]
                            if (string_9_!!.startsWith("*")) string_9_ = string_9_.substring(1)
                            string_9_ = method2127(2, string_9_)
                            if (string_9_ != null && string_9_ == string_8_) {
                                ContactEntryStatics.anInt9604--
                                var i_10_ = i
                                while (ContactEntryStatics.anInt9604 > i_10_) {
                                    NpcConfigStatics.aStringArray932!![i_10_] = NpcConfigStatics.aStringArray932!![i_10_ + 1]
                                    ObjectSpawnDecoder.aStringArray1808!![i_10_] = ObjectSpawnDecoder.aStringArray1808!![1 + i_10_]
                                    WeaveTextureNodeStatics.aStringArray9275!![i_10_] = (WeaveTextureNodeStatics.aStringArray9275!![1 + i_10_])
                                    IndexedSpriteStatics.aStringArray5197!![i_10_] = IndexedSpriteStatics.aStringArray5197!![1 + i_10_]
                                    BasicGlRenderPassStatics.aBooleanArray7304!![i_10_] = BasicGlRenderPassStatics.aBooleanArray7304!![i_10_ - -1]
                                    i_10_++
                                }
                                GlVertexBufferArbStatics.anInt8493++
                                Crc64HashableStatics.anInt4985 = ResourceLoaderThreadStatics.anInt3918
                                val class348_sub47 = method2148(RendererStatics.aFontMetaRef_4571, (TheoraVideoStreamStatics.aIsaacCipher_9029), -123)
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, method1745(string, -65))
                                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeString((-5).toByte(), string)
                                InterfaceComponentGroupStatics.method3243(118, class348_sub47)
                                break
                            }
                            i++
                        }
                    }
                }
            }
}
