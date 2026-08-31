import kotlin.jvm.JvmStatic
import WaterDetailOptionState.Companion.method1802
import awt.Canvas
import io.IOException
import net.Socket

abstract class AbstractBloomEffect internal constructor(var aHa_Sub2_6618: OpenGlRenderer) : LinkedListNode() {

    var aBoolean6621: Boolean = false
    abstract fun method2750(class258_sub3: GlTexture2D?, class258_sub3_0_: GlTexture2D?, i: Int, i_1_: Byte)

    abstract fun method2751(bool: Boolean): Boolean

    abstract fun method2754(i: Int, i_5_: Byte, i_6_: Int)

    abstract fun method2756(i: Byte, i_10_: Int)

    abstract fun method2758(i: Int): Boolean

    fun method2759(i: Int): Boolean {
        if (i != 1) return true
        anInt6626++
        return false
    }

    fun method2760(i: Byte): Boolean {
        if (i.toInt() != 1) method2763(37.toByte())
        anInt6619++
        return this.aBoolean6621
    }

    open fun method2761(bool: Boolean): Int {
        anInt6622++
        if (bool != true) method2757(-63)
        return 0
    }

    abstract fun method2763(i: Byte)

    fun method2764(i: Int): Int {
        if (i != 1) aByteArray6624 = null
        anInt6623++
        return 1
    }

    companion object {

        var anInt6619: Int = 0

        var anInt6620: Int = 0

        var anInt6622: Int = 0

        var anInt6623: Int = 0

        var aByteArray6624: ByteArray? = ByteArray(2048)

        var anInt6625: Int = 0

        var anInt6626: Int = 0

        var aAbstractModelRenderer_6627: AbstractModelRenderer? = null

        var anInt6628: Int = 0

        var anInt6629: Int = 0

        @JvmStatic
        fun method2752(i: Int, i_2_: Int): RectangleRegion? {
            anInt6625++
            val class138s = MultiFieldRecord.method3002((-97).toByte())
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
                throw TextureLoadException.method2929(runtimeexception, ("fba.M(" + bool + ',' + i + ',' + i_4_ + ',' + (if (canvas != null) "{...}" else "null") + ',' + (if (var_renderConfig != null) "{...}" else "null") + ')'))
            }
        }

        @JvmStatic
        fun method2755(i: Int, i_7_: Int, i_8_: Int) {
            anInt6629++
            if ((SpriteDefinition.anInt7068.inv()) != i) {
                if (i_8_ >= 0) BasicGlRenderPass.anIntArray7299!![i_8_] = i_7_
                else {
                    for (i_9_ in 0..15) BasicGlRenderPass.anIntArray7299!![i_9_] = i_7_
                }
            }
            NodeDequeHolder.aClass348_Sub16_Sub3_1564!!.method2843(i_7_, i_8_, -7836)
        }

        @JvmStatic
        fun method2757(i: Int) {
            anInt6620++
            if (GlWaterRenderPass.anInt7297 != 0) {
                try {
                    if (i >= 82) {
                        if (++HostPingThread.anInt2264 > 2000) {
                            if (Client.aAbstractGameSocket_9165 != null) {
                                Client.aAbstractGameSocket_9165!!.method1700(36.toByte())
                                Client.aAbstractGameSocket_9165 = null
                            }
                            if (AnimatedModelRenderer.anInt8398 >= 2) {
                                GlWaterRenderPass.anInt7297 = 0
                                RenderableEntry.anInt4337 = -5
                                return
                            }
                            ModelHeaderCache.aServerConnectionInfo_3285!!.method1259(0)
                            GlWaterRenderPass.anInt7297 = 1
                            HostPingThread.anInt2264 = 0
                            AnimatedModelRenderer.anInt8398++
                        }
                        if (GlWaterRenderPass.anInt7297 == 1) {
                            FrameStatsReset.aLinkedQueueNode_5800 = (ModelHeaderCache.aServerConnectionInfo_3285!!.method1262(VorbisOggDecoder.aPrivilegedOperationWorker_8992!!, 36.toByte()))
                            GlWaterRenderPass.anInt7297 = 2
                        }
                        if (GlWaterRenderPass.anInt7297 == 2) {
                            if (FrameStatsReset.aLinkedQueueNode_5800!!.anInt1997 == 2) throw IOException()
                            if (FrameStatsReset.aLinkedQueueNode_5800!!.anInt1997 != 1) return
                            Client.aAbstractGameSocket_9165 = SocketGameConnection.method2982(((FrameStatsReset.aLinkedQueueNode_5800!!.anObject1998) as Socket), 24.toByte(), 7500)
                            FrameStatsReset.aLinkedQueueNode_5800 = null
                            method1802(0)
                            GlWaterRenderPass.anInt7297 = 4
                        }
                        if (GlWaterRenderPass.anInt7297 == 4) {
                            if (Client.aAbstractGameSocket_9165!!.method1705(1, 104)) {
                                Client.aAbstractGameSocket_9165!!.method1701(1, 0, (-116).toByte(), (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!!))
                                val i_11_ = 0xff and (CircleRasterizer.aClass348_Sub49_Sub2_3813!!.aByteArray7154!![0]).toInt()
                                RenderableEntry.anInt4337 = i_11_
                                GlWaterRenderPass.anInt7297 = 0
                                Client.aAbstractGameSocket_9165!!.method1700(36.toByte())
                                Client.aAbstractGameSocket_9165 = null
                            }
                        }
                    }
                } catch (ioexception: IOException) {
                    if (Client.aAbstractGameSocket_9165 != null) {
                        Client.aAbstractGameSocket_9165!!.method1700(36.toByte())
                        Client.aAbstractGameSocket_9165 = null
                    }
                    if (AnimatedModelRenderer.anInt8398 < 2) {
                        ModelHeaderCache.aServerConnectionInfo_3285!!.method1259(0)
                        HostPingThread.anInt2264 = 0
                        AnimatedModelRenderer.anInt8398++
                        GlWaterRenderPass.anInt7297 = 1
                    } else {
                        RenderableEntry.anInt4337 = -4
                        GlWaterRenderPass.anInt7297 = 0
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
}
