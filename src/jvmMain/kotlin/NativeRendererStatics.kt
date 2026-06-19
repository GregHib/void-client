import CubeMapMaterialPassStatics.method2173
import MidiSequencePlayerStatics.method2878
import InvertTextureNodeStatics.method3135
import jaclib.memory.Buffer
import jaclib.memory.Stream
import jaclib.memory.heap.NativeHeap
import jaclib.memory.heap.NativeHeapBuffer
import jagex3.graphics2.hw.NativeInterface
import OpenGlRenderNodeStatics.method3297
import java.awt.Canvas
import java.util.Hashtable
import kotlin.math.cos
import kotlin.math.max
import kotlin.math.sin
import kotlin.math.sqrt

object NativeRendererStatics {
    @JvmField
            var anInt7884: Int = 0
            @JvmField
            var anInt7885: Int = 0
            @JvmField
            var anInt7886: Int = 0
            @JvmField
            var anInt7887: Int = 0
            @JvmField
            var anInt7888: Int = 0
            @JvmField
            var anInt7889: Int = 0
            @JvmField
            var anInt7890: Int = 0
            @JvmField
            var anInt7892: Int = 0
            @JvmField
            var anInt7893: Int = 0
            @JvmField
            var anInt7894: Int = 0
            @JvmField
            var anInt7895: Int = 0
            @JvmField
            var anInt7896: Int = 0
            @JvmField
            var anInt7897: Int = 0
            @JvmField
            var anInt7898: Int = 0
            @JvmField
            var anInt7899: Int = 0
            @JvmField
            var anInt7900: Int = 0
            @JvmField
            var anInt7901: Int = 0
            @JvmField
            var anInt7902: Int = 0
            @JvmField
            var anInt7903: Int = 0
            @JvmField
            var anInt7904: Int = 0
            @JvmField
            var anInt7906: Int = 0
            @JvmField
            var anInt7907: Int = 0
            @JvmField
            var anInt7908: Int = 0
            @JvmField
            var anInt7909: Int = 0
            @JvmField
            var anInt7911: Int = 0
            @JvmField
            var anInt7912: Int = 0
            @JvmField
            var anInt7913: Int = 0
            @JvmField
            var anInt7914: Int = 0
            @JvmField
            var anInt7915: Int = 0
            @JvmField
            var anInt7916: Int = 0
            @JvmField
            var anInt7917: Int = 0
            @JvmField
            var anInt7918: Int = 0
            @JvmField
            var anInt7920: Int = 0
            @JvmField
            var anInt7921: Int = 0
            @JvmField
            var anInt7922: Int = 0
            @JvmField
            var anInt7923: Int = 0
            @JvmField
            var anInt7926: Int = 0
            @JvmField
            var anInt7928: Int = 0
            @JvmField
            var anInt7929: Int = 0
            @JvmField
            var anInt7930: Int = 0
            @JvmField
            var anInt7932: Int = 0
            @JvmField
            var anInt7933: Int = 0
            @JvmField
            var anInt7934: Int = 0
            @JvmField
            var anInt7935: Int = 0
            @JvmField
            var anInt7936: Int = 0
            @JvmField
            var anInt7938: Int = 0
            @JvmField
            var anInt7939: Int = 0
            @JvmField
            var anInt7940: Int = 0
            @JvmField
            var anInt7941: Int = 0
            @JvmField
            var anInt7942: Int = 0
            @JvmField
            var anInt7943: Int = 0
            @JvmField
            var anInt7944: Int = 0
            @JvmField
            var anInt7945: Int = 0
            @JvmField
            var anInt7946: Int = 0
            @JvmField
            var anInt7947: Int = 0
            @JvmField
            var anInt7948: Int = 0
            @JvmField
            var anInt7949: Int = 0
            @JvmField
            var anInt7950: Int = 0
            @JvmField
            var anInt7951: Int = 0
            @JvmField
            var anInt7952: Int = 0
            @JvmField
            var anInt7953: Int = 0
            @JvmField
            var anInt7954: Int = 0
            @JvmField
            var anInt7955: Int = 0
            @JvmField
            var anInt7956: Int = 0
            @JvmField
            var anInt7957: Int = 0
            @JvmField
            var anInt7959: Int = 0
            @JvmField
            var anInt7960: Int = 0
            @JvmField
            var anInt7961: Int = 0
            @JvmField
            var anInt7963: Int = 0
            @JvmField
            var anInt7964: Int = 0
            @JvmField
            var anInt7965: Int = 0
            @JvmField
            var anInt7966: Int = 0
            @JvmField
            var anInt7967: Int = 0
            @JvmField
            var anInt7968: Int = 0
            @JvmField
            var anInt7969: Int = 0
            @JvmField
            var anInt7970: Int = 0
            @JvmField
            var anInt7971: Int = 0
            @JvmField
            var anInt7972: Int = 0
            @JvmField
            var anInt7973: Int = 0
            @JvmField
            var anInt7975: Int = 0
            @JvmField
            var anInt7976: Int = 0
            @JvmField
            var anInt7977: Int = 0
            @JvmField
            var anInt7978: Int = 0
            @JvmField
            var anInt7979: Int = 0
            @JvmField
            var anInt7980: Int = 0
            @JvmField
            var anInt7981: Int = 0
            @JvmField
            var anInt7982: Int = 0
            @JvmField
            var anInt7983: Int = 0
            @JvmField
            var anInt7984: Int = 0
            @JvmField
            var anInt7985: Int = 0
            @JvmField
            var anInt7986: Int = 0
            @JvmField
            var anInt7988: Int = 0
            @JvmField
            var anInt7989: Int = 0
            @JvmField
            var anInt7990: Int = 0
            @JvmField
            var anInt7991: Int = 0
            @JvmField
            var anInt7992: Int = 0
            @JvmField
            var anInt7993: Int = 0
            @JvmField
            var anInt7994: Int = 0
            @JvmField
            var anInt7995: Int = 0
            @JvmField
            var anInt7996: Int = 0
            @JvmField
            var anInt7997: Int = 0
            @JvmField
            var anInt7998: Int = 0
            @JvmField
            var anInt7999: Int = 0
            @JvmField
            var anInt8000: Int = 0
            @JvmField
            var anInt8001: Int
            @JvmField
            var anInt8002: Int = 0
            @JvmField
            var anInt8003: Int = 0
            @JvmField
            var anInt8004: Int = 0
            @JvmField
            var anInt8005: Int = 0
            @JvmField
            var anInt8006: Int = 0
            @JvmField
            var anInt8007: Int = 0
            @JvmField
            var anInt8008: Int = 0
            @JvmField
            var anInt8009: Int = 0
            @JvmField
            var anInt8010: Int = 0
            @JvmField
            var anInt8011: Int = 0
            @JvmField
            var anInt8012: Int = 0
            @JvmField
            var anInt8013: Int = 0
            @JvmField
            var anInt8015: Int = 0
            @JvmField
            var anInt8016: Int = 0
            @JvmField
            var anInt8017: Int = 0
            @JvmField
            var anInt8018: Int = 0
            @JvmField
            var aStringArray8019: Array<String?>? = arrayOfNulls<String>(5)
            @JvmField
            var anInt8021: Int = 0
            @JvmField
            var anInt8022: Int = 0
            @JvmField
            var anInt8023: Int = 0
            @JvmField
            var anInt8024: Int = 0
            @JvmField
            var anInt8025: Int = 0
            @JvmField
            var anInt8026: Int = 0
            @JvmField
            var anInt8027: Int = 0
            @JvmField
            var anInt8028: Int = 0
            @JvmField
            var anInt8029: Int = 0
            @JvmField
            var anInt8030: Int = 0
            @JvmField
            var anInt8031: Int = 0
            @JvmField
            var anInt8032: Int = 0
            @JvmField
            var anInt8033: Int = 0
            @JvmField
            var anInt8034: Int = 0
            @JvmField
            var anInt8035: Int = 0
            @JvmField
            var anInt8036: Int = 0
            @JvmField
            var anInt8037: Int = 0
            @JvmField
            var anInt8038: Int = 0
            @JvmField
            var anInt8040: Int = 0
            @JvmField
            var anInt8041: Int = 0
            @JvmField
            var anInt8042: Int = 0
            @JvmField
            var anInt8043: Int = 0
            @JvmField
            var anInt8044: Int = 0
            @JvmField
            var anInt8045: Int = 0
            @JvmField
            var anInt8046: Int = 0
            @JvmField
            var anInt8047: Int = 0
            @JvmField
            var anInt8048: Int = 0
            @JvmField
            var anInt8049: Int = 0
            @JvmField
            var anInt8050: Int = 0
            @JvmField
            var anInt8051: Int = 0
            @JvmField
            var anInt8052: Int = 0
            @JvmField
            var anInt8053: Int = 0
            @JvmField
            var anInt8054: Int = 0
            @JvmField
            var anInt8055: Int = 0
            @JvmField
            var anInt8056: Int = 0
            @JvmField
            var anInt8057: Int = 0
            @JvmField
            var anInt8058: Int = 0
            @JvmField
            var anInt8059: Int = 0
            @JvmField
            var anInt8060: Int = 0
            @JvmField
            var anInt8061: Int = 0
            @JvmField
            var anInt8064: Int = 0
            @JvmField
            var anInt8065: Int = 0
            @JvmField
            var anInt8066: Int = 0
            @JvmField
            var anInt8067: Int = 0
            @JvmField
            var anInt8068: Int = 0
            @JvmField
            var anInt8070: Int = 0
            @JvmField
            var anInt8071: Int = 0
            @JvmField
            var anInt8072: Int = 0
            @JvmField
            var anInt8073: Int = 0
            @JvmField
            var anInt8075: Int = 0
            @JvmField
            var anInt8076: Int = 0
            @JvmField
            var anInt8077: Int = 0
            @JvmField
            var anInt8078: Int = 0
            @JvmField
            var anInt8081: Int = 0
    
            /*synthetic*/
            var aClass8211: Class<*>? = null
    
            fun method3824(i: Int, i_35_: Int, i_36_: Int, i_37_: Int, i_38_: Int, i_39_: Int, i_40_: Int, i_41_: Int) {
                var i_36_ = i_36_
                anInt7933++
                if (i_37_ >= 0 && i >= 0 && -1 + GlCubemapLightPassStatics.anInt7319 > i_37_ && (i < -1 + RangeThresholdTextureNodeStatics.anInt9109)) {
                    if (HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029 == null) return
                    if (i_41_ == 0) {
                        val renderTarget = method3297(i_40_, i_37_, i) as RenderTarget?
                        val renderTarget_42_ = ConfigArchiveLoaderStatics.method813(i_40_, i_37_, i) as RenderTarget?
                        if (renderTarget != null && i_36_ != 2) {
                            if (renderTarget is SequencedActorEntity) renderTarget.aSceneObjectAnimator_10115!!.method1671(262144, i_35_)
                            else MapSceneIconDefStatics.method1591(i_37_, 89, i_41_, i_35_, renderTarget.method42(-76), i_36_, i, i_38_, i_40_)
                        }
                        if (renderTarget_42_ != null) {
                            if (renderTarget_42_ is SequencedActorEntity) renderTarget_42_.aSceneObjectAnimator_10115!!.method1671(262144, i_35_)
                            else MapSceneIconDefStatics.method1591(i_37_, 92, i_41_, i_35_, renderTarget_42_.method42(-71), i_36_, i, i_38_, i_40_)
                        }
                    } else if (i_41_ == 1) {
                        val renderTarget = (method3135(i_40_, i_37_, i) as RenderTarget?)
                        if (renderTarget != null) {
                            if (renderTarget is SequencedWallEntity) renderTarget.aSceneObjectAnimator_10155!!.method1671(262144, i_35_)
                            else {
                                val i_43_ = renderTarget.method42(-83)
                                if (i_36_ != 4 && i_36_ != 5) {
                                    if (i_36_ != 6) {
                                        if (i_36_ == 7) MapSceneIconDefStatics.method1591(i_37_, 50, i_41_, i_35_, i_43_, 4, i, 4 + (0x3 and 2 + i_38_), i_40_)
                                        else if (i_36_ == 8) {
                                            MapSceneIconDefStatics.method1591(i_37_, 116, i_41_, i_35_, i_43_, 4, i, 4 + i_38_, i_40_)
                                            MapSceneIconDefStatics.method1591(i_37_, 91, i_41_, i_35_, i_43_, 4, i, 4 + (0x3 and i_38_ - -2), i_40_)
                                        }
                                    } else MapSceneIconDefStatics.method1591(i_37_, 22, i_41_, i_35_, i_43_, 4, i, i_38_ + 4, i_40_)
                                } else MapSceneIconDefStatics.method1591(i_37_, 86, i_41_, i_35_, i_43_, 4, i, i_38_, i_40_)
                            }
                        }
                    } else if (i_41_ == 2) {
                        val renderTarget = ((ClickFeedbackTaskStatics.method1353(i_40_, i_37_, i, (if (aClass8211 != null) aClass8211 else (RenderTarget::class.java.also { aClass8211 = it })))) as RenderTarget?)
                        if (renderTarget != null) {
                            if (i_36_ == 11) i_36_ = 10
                            if (renderTarget !is SequencedGroundDecor) MapSceneIconDefStatics.method1591(i_37_, 43, i_41_, i_35_, renderTarget.method42(-107), i_36_, i, i_38_, i_40_)
                            else renderTarget.aSceneObjectAnimator_10045!!.method1671(262144, i_35_)
                        }
                    } else if (i_41_ == 3) {
                        val renderTarget = (method2878(i_40_, i_37_, i) as RenderTarget?)
                        if (renderTarget != null) {
                            if (renderTarget is WallSceneEntity) renderTarget.aSceneObjectAnimator_9955!!.method1671(262144, i_35_)
                            else MapSceneIconDefStatics.method1591(i_37_, 28, i_41_, i_35_, renderTarget.method42(-123), i_36_, i, i_38_, i_40_)
                        }
                    }
                }
                if (i_39_ < 98) method3936(-100)
            }
    
            @JvmStatic
            fun method3870(i: Int) {
                aStringArray8019 = null
                if (i <= 99) anInt8045 = -72
            }
    
            @JvmStatic
            fun method3873(`is`: ByteArray?, i: Int): ByteArray {
                try {
                    anInt8015++
                    val i_127_ = `is`!!.size
                    val is_128_ = ByteArray(i_127_)
                    ArrayCopyUtil.method1577(`is`, i, is_128_, 0, i_127_)
                    return is_128_
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("wga.GI(" + (if (`is` != null) "{...}" else "null") + ',' + i + ')'))
                }
            }
    
            @JvmStatic
            fun method3886(i: Int) {
                ParticleProcessorStatics.aLruByteCache_4273!!.method590(0)
                if (i >= -58) method3824(43, 63, -121, -1, 72, 77, -11, 22)
                anInt8018++
            }
    
            @JvmStatic
            fun method3896(huffmanCodec: HuffmanCodec?, i: Byte) {
                do {
                    try {
                        anInt8028++
                        AbstractModelStatics.aHuffmanCodec_1131 = huffmanCodec
                        if (i.toInt() == 13) break
                        method3873(null, -3)
                    } catch (runtimeexception: RuntimeException) {
                        throw SoundBankPatchStatics.method2929(runtimeexception, ("wga.DI(" + (if (huffmanCodec != null) "{...}" else "null") + ',' + i + ')'))
                    }
                    break
                } while (false)
            }
    
            @JvmStatic
            fun method3936(i: Int) {
                anInt7990++
                if (NodeDequeStatics.aModelLightingConfigArrayArray3335 != null) {
                    var i_274_ = 0
                    while ((i_274_ < NodeDequeStatics.aModelLightingConfigArrayArray3335!!.size)) {
                        var i_275_ = 0
                        while ((NodeDequeStatics.aModelLightingConfigArrayArray3335!![i_274_]!!.size > i_275_)) {
                            NodeDequeStatics.aModelLightingConfigArrayArray3335!![i_274_]!![i_275_] = LocalizedTextStatics.aModelLightingConfig_3547
                            i_275_++
                        }
                        i_274_++
                    }
                }
                if (i != 0) method3870(-90)
            }
    
            init {
                anInt8001 = -1
            }
}
