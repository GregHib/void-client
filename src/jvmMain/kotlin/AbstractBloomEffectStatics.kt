import LightDetailOptionStateStatics.method1802
import java.awt.Canvas
import java.io.IOException
import java.net.Socket

object AbstractBloomEffectStatics {
    @JvmField
            var anInt6619: Int = 0
            @JvmField
            var anInt6620: Int = 0
            @JvmField
            var anInt6622: Int = 0
            @JvmField
            var anInt6623: Int = 0
            @JvmField
            var aByteArray6624: ByteArray? = ByteArray(2048)
            @JvmField
            var anInt6625: Int = 0
            @JvmField
            var anInt6626: Int = 0
            @JvmField
            var aAbstractModelRenderer_6627: AbstractModelRenderer? = null
            @JvmField
            var anInt6628: Int = 0
            @JvmField
            var anInt6629: Int = 0
    
            @JvmStatic
            fun method2752(i: Int, i_2_: Int): RectangleRegion? {
                anInt6625++
                val class138s = MultiFieldRecordStatics.method3002((-97).toByte())
                var i_3_ = i_2_
                while (class138s.size > i_3_) {
                    if (i == class138s[i_3_]!!.anInt1941) return class138s[i_3_]
                    i_3_++
                }
                return null
            }
    
            @JvmStatic
            fun method2753(bool: Boolean, i: Int, i_4_: Int, canvas: Canvas?, var_renderConfig: RenderConfig?): Renderer {
                try {
                    anInt6628++
                    if (bool != true) aByteArray6624 = null
                    return SoftwareRenderer(canvas!!, var_renderConfig, i_4_, i)
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("fba.M(" + bool + ',' + i + ',' + i_4_ + ',' + (if (canvas != null) "{...}" else "null") + ',' + (if (var_renderConfig != null) "{...}" else "null") + ')'))
                }
            }
    
            @JvmStatic
            fun method2755(i: Int, i_7_: Int, i_8_: Int) {
                anInt6629++
                if ((SpriteDefinitionStatics.anInt7068.inv()) != i) {
                    if (i_8_ >= 0) BasicGlRenderPassStatics.anIntArray7299!![i_8_] = i_7_
                    else {
                        for (i_9_ in 0..15) BasicGlRenderPassStatics.anIntArray7299!![i_9_] = i_7_
                    }
                }
                NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2843(i_7_, i_8_, -7836)
            }
    
            @JvmStatic
            fun method2757(i: Int) {
                anInt6620++
                if (GlWaterRenderPassStatics.anInt7297 != 0) {
                    try {
                        if (i >= 82) {
                            if (++HostPingThreadStatics.anInt2264 > 2000) {
                                if (PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 != null) {
                                    PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1700(36.toByte())
                                    PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 = null
                                }
                                if (AnimatedModelRendererStatics.anInt8398 >= 2) {
                                    GlWaterRenderPassStatics.anInt7297 = 0
                                    RenderableEntryStatics.anInt4337 = -5
                                    return
                                }
                                ModelHeaderCacheStatics.aServerConnectionInfo_3285!!.method1259(0)
                                GlWaterRenderPassStatics.anInt7297 = 1
                                HostPingThreadStatics.anInt2264 = 0
                                AnimatedModelRendererStatics.anInt8398++
                            }
                            if (GlWaterRenderPassStatics.anInt7297 == 1) {
                                FrameStatsResetStatics.aLinkedQueueNode_5800 = (ModelHeaderCacheStatics.aServerConnectionInfo_3285!!.method1262(VorbisOggDecoderStatics.aPrivilegedOperationWorker_8992!!, 36.toByte()))
                                GlWaterRenderPassStatics.anInt7297 = 2
                            }
                            if (GlWaterRenderPassStatics.anInt7297 == 2) {
                                if (FrameStatsResetStatics.aLinkedQueueNode_5800!!.anInt1997 == 2) throw IOException()
                                if (FrameStatsResetStatics.aLinkedQueueNode_5800!!.anInt1997 != 1) return
                                PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 = NullOggStreamStatics.method2982(((FrameStatsResetStatics.aLinkedQueueNode_5800!!.anObject1998) as Socket), 24.toByte(), 7500)
                                FrameStatsResetStatics.aLinkedQueueNode_5800 = null
                                method1802(0)
                                GlWaterRenderPassStatics.anInt7297 = 4
                            }
                            if (GlWaterRenderPassStatics.anInt7297 == 4) {
                                if (PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1705(1, 104)) {
                                    PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1701(1, 0, (-116).toByte(), (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                                    val i_11_ = 0xff and (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt()
                                    RenderableEntryStatics.anInt4337 = i_11_
                                    GlWaterRenderPassStatics.anInt7297 = 0
                                    PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1700(36.toByte())
                                    PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 = null
                                }
                            }
                        }
                    } catch (ioexception: IOException) {
                        if (PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 != null) {
                            PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165!!.method1700(36.toByte())
                            PerlinNoiseTextureNodeStatics.aAbstractGameSocket_9165 = null
                        }
                        if (AnimatedModelRendererStatics.anInt8398 < 2) {
                            ModelHeaderCacheStatics.aServerConnectionInfo_3285!!.method1259(0)
                            HostPingThreadStatics.anInt2264 = 0
                            AnimatedModelRendererStatics.anInt8398++
                            GlWaterRenderPassStatics.anInt7297 = 1
                        } else {
                            RenderableEntryStatics.anInt4337 = -4
                            GlWaterRenderPassStatics.anInt7297 = 0
                        }
                    }
                }
            }
    
            @JvmStatic
            fun method2762(i: Int) {
                aByteArray6624 = null
                aAbstractModelRenderer_6627 = null
                val i_12_ = -23 % ((i - -24) / 47)
            }
}
