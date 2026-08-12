import TextureQualityOptionState.Companion.method1783
import ConfigFlagUtilStatics.method1916
import MinimapTileEntry.Companion.method381
import SolidFillComponent.Companion.method196
import ChatCommandProcessor.method705
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import java.io.BufferedReader
import java.io.DataInputStream
import java.io.IOException
import java.io.InputStreamReader
import java.net.MalformedURLException
import java.net.URL
import kotlin.concurrent.Volatile

/*
 * Class339
 */
class MapRegionLoaderThread : Runnable {
    private var aLinkedQueueNode_4201: LinkedQueueNode? = null
    private var aLocalizedTextTripleArray4204: Array<LocalizedTextTriple?>? = null

    @Volatile
    private var aBoolean4205 = false
    private var job: Job? = null

    override fun run() {
        anInt4203++
        try {
            val bufferedreader = BufferedReader(InputStreamReader((aLinkedQueueNode_4201!!.anObject1998) as DataInputStream?))
            var string = bufferedreader.readLine()
            val class179 = method381(68.toByte())
            while ( /**/string != null) {
                class179.method1364(-1, string)
                string = bufferedreader.readLine()
            }
            val strings = class179.method1361(63)
            if (strings.size % 3 != 0) return
            aLocalizedTextTripleArray4204 = arrayOfNulls<LocalizedTextTriple>(strings.size / 3)
            var i = 0
            while (i < strings.size) {
                aLocalizedTextTripleArray4204!![i / 3] = LocalizedTextTriple(strings[i], strings[i + 1], strings[2 + i])
                i += 3
            }
        } catch (ioexception: IOException) {
            /* empty */
        }
        aBoolean4205 = true
    }

    fun method2667(bool: Boolean, i: Int): LocalizedTextTriple? {
        anInt4210++
        if (bool != false) return null
        if (aLocalizedTextTripleArray4204 == null || i < 0 || i >= aLocalizedTextTripleArray4204!!.size) return null
        return aLocalizedTextTripleArray4204!![i]
    }

    fun method2668(i: Int): Boolean {
        anInt4208++
        if (aBoolean4205) return true
        if (aLinkedQueueNode_4201 == null) {
            try {
                val i_15_ = (if (NpcAnimationResolverStatics.aNamedIdRecord_165 == OggCacheStream.aNamedIdRecord_5271) 80 else 7000 - -(GlElementArrayBuffer.aServerConnectionInfo_4839!!.anInt2143))
                aLinkedQueueNode_4201 = (VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.method2237(URL("http://" + (GlElementArrayBuffer.aServerConnectionInfo_4839!!.aString2147) + ":" + i_15_ + "/news.ws?game=" + Client.aSceneProjector_10434!!.anInt2987), 8362))
            } catch (malformedurlexception: MalformedURLException) {
                return true
            }
        }
        if (aLinkedQueueNode_4201 == null || aLinkedQueueNode_4201!!.anInt1997 == 2) return true
        if (i != -21913) return false
        if (aLinkedQueueNode_4201!!.anInt1997 != 1) return false
        if (job == null) {
            job = GlobalScope.launch(Dispatchers.Default) { run() }
        }
        return aBoolean4205
    }

    companion object {
        var anInt4198: Int = 0
        var anInt4199: Int = 0
        var anInt4200: Int = 0
        var anInt4202: Int = -1
        var anInt4203: Int = 0
        var aOutgoingPacketHeader_4207: OutgoingPacketHeader? = OutgoingPacketHeader(29, 3)
        var anInt4208: Int = 0
        var anInt4209: Int = 0
        var anInt4210: Int = 0
        var anInt4211: Int = 0

        @JvmStatic
        fun method2664(i: Int) {
            if (i == 3) aOutgoingPacketHeader_4207 = null
        }

        fun method2665(i: Int, i_0_: Byte, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int) {
            anInt4200++
            val i_5_ = i_4_ - i
            val i_6_ = -i_2_ + i_3_
            if (i_5_ == 0) {
                if (i_6_ != 0) HslPaletteState.method2656(i_2_, i, 124.toByte(), i_1_, i_3_)
                return
            } else if (i_6_ == 0) {
                method196(true, i_4_, i_1_, i, i_2_)
                return
            }
            val i_7_ = (i_6_ shl 12) / i_5_
            val i_8_ = -(i_7_ * i shr 12) + i_2_
            var i_9_: Int
            var i_10_: Int
            if (i < WorldMapLabel.anInt4960) {
                i_9_ = (i_7_ * WorldMapLabel.anInt4960 shr 12) + i_8_
                i_10_ = WorldMapLabel.anInt4960
            } else if (i > CameraNodeListStatics.anInt1745) {
                i_9_ = i_8_ - -(CameraNodeListStatics.anInt1745 * i_7_ shr 12)
                i_10_ = CameraNodeListStatics.anInt1745
            } else {
                i_10_ = i
                i_9_ = i_2_
            }
            if (i_0_ < 56) anInt4202 = -57
            var i_11_: Int
            var i_12_: Int
            if (WorldMapLabel.anInt4960 <= i_4_) {
                if (CameraNodeListStatics.anInt1745 >= i_4_) {
                    i_11_ = i_4_
                    i_12_ = i_3_
                } else {
                    i_11_ = CameraNodeListStatics.anInt1745
                    i_12_ = i_8_ + (CameraNodeListStatics.anInt1745 * i_7_ shr 12)
                }
            } else {
                i_11_ = WorldMapLabel.anInt4960
                i_12_ = (i_7_ * WorldMapLabel.anInt4960 shr 12) + i_8_
            }
            if (i_12_ < LocalPlayerState.anInt1910) {
                i_11_ = (LocalPlayerState.anInt1910 + -i_8_ shl 12) / i_7_
                i_12_ = LocalPlayerState.anInt1910
            } else if (WidgetTextConfig.anInt513 < i_12_) {
                i_11_ = (WidgetTextConfig.anInt513 - i_8_ shl 12) / i_7_
                i_12_ = WidgetTextConfig.anInt513
            }
            if (LocalPlayerState.anInt1910 <= i_9_) {
                if (WidgetTextConfig.anInt513 < i_9_) {
                    i_10_ = (WidgetTextConfig.anInt513 - i_8_ shl 12) / i_7_
                    i_9_ = WidgetTextConfig.anInt513
                }
            } else {
                i_10_ = (-i_8_ + LocalPlayerState.anInt1910 shl 12) / i_7_
                i_9_ = LocalPlayerState.anInt1910
            }
            method1783(i_10_, -1, i_9_, i_12_, i_11_, i_1_)
        }

        @JvmStatic
        fun method2666(i: Int, i_13_: Int, widgetComponent: WidgetComponent?, i_14_: Byte) {
            anInt4199++
            if (widgetComponent != null) {
                if (widgetComponent.anObjectArray714 != null) {
                    val class348_sub36 = WidgetActionEntry()
                    class348_sub36.anObjectArray6987 = widgetComponent.anObjectArray714
                    class348_sub36.aWidgetComponent_6989 = widgetComponent
                    method705(class348_sub36)
                }
                Tooltip.anInt4458 = widgetComponent.anInt695
                ParticleEmitterFactoryStatics.anInt3176 = i
                WidgetTextConfig.anInt500 = i_13_
                HeightMapNoise.anInt3829 = widgetComponent.anInt812
                RenderNodeStatics.aBoolean9722 = true
                NativeLibraryState.anInt169 = widgetComponent.anInt704
                FloatBuffer.anInt9747 = widgetComponent.anInt824
                if (i_14_.toInt() != 21) Companion.method2665(-99, (-106).toByte(), 10, -37, 26, -123)
                OrientationRotator.anInt2046 = widgetComponent.anInt830
                method1916(-9343, widgetComponent)
            }
        }

        fun method2669(objects: Array<Any?>?, ls: LongArray?, i: Int) {
            try {
                if (i < -5) {
                    anInt4209++
                    TextureMipDescriptorStatics.method3461(0, objects, -1 + ls!!.size, ls, 9455)
                }
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("eaa.E(" + (if (objects != null) "{...}" else "null") + ',' + (if (ls != null) "{...}" else "null") + ',' + i + ')'))
            }
        }
    }
}
