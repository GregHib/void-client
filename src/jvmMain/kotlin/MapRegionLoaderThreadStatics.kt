import TextureQualityOptionStateStatics.method1783
import ConfigFlagUtilStatics.method1916
import MinimapTileEntryStatics.method381
import SolidFillComponentStatics.method196
import ChatCommandProcessor.method705
import java.io.BufferedReader
import java.io.DataInputStream
import java.io.IOException
import java.io.InputStreamReader
import java.net.MalformedURLException
import java.net.URL
import kotlin.concurrent.Volatile

object MapRegionLoaderThreadStatics {
    var anInt4198: Int = 0
            var anInt4199: Int = 0
            var anInt4200: Int = 0
            var anInt4202: Int = -1
            var anInt4203: Int = 0
            var aFontMetaRef_4207: FontMetaRef? = FontMetaRef(29, 3)
            var anInt4208: Int = 0
            var anInt4209: Int = 0
            var anInt4210: Int = 0
            var anInt4211: Int = 0
    
            @JvmStatic
            fun method2664(i: Int) {
                if (i == 3) aFontMetaRef_4207 = null
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
                if (i < WorldMapLabelStatics.anInt4960) {
                    i_9_ = (i_7_ * WorldMapLabelStatics.anInt4960 shr 12) + i_8_
                    i_10_ = WorldMapLabelStatics.anInt4960
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
                if (WorldMapLabelStatics.anInt4960 <= i_4_) {
                    if (CameraNodeListStatics.anInt1745 >= i_4_) {
                        i_11_ = i_4_
                        i_12_ = i_3_
                    } else {
                        i_11_ = CameraNodeListStatics.anInt1745
                        i_12_ = i_8_ + (CameraNodeListStatics.anInt1745 * i_7_ shr 12)
                    }
                } else {
                    i_11_ = WorldMapLabelStatics.anInt4960
                    i_12_ = (i_7_ * WorldMapLabelStatics.anInt4960 shr 12) + i_8_
                }
                if (i_12_ < LocalPlayerState.anInt1910) {
                    i_11_ = (LocalPlayerState.anInt1910 + -i_8_ shl 12) / i_7_
                    i_12_ = LocalPlayerState.anInt1910
                } else if (WidgetTextConfigStatics.anInt513 < i_12_) {
                    i_11_ = (WidgetTextConfigStatics.anInt513 - i_8_ shl 12) / i_7_
                    i_12_ = WidgetTextConfigStatics.anInt513
                }
                if (LocalPlayerState.anInt1910 <= i_9_) {
                    if (WidgetTextConfigStatics.anInt513 < i_9_) {
                        i_10_ = (WidgetTextConfigStatics.anInt513 - i_8_ shl 12) / i_7_
                        i_9_ = WidgetTextConfigStatics.anInt513
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
                    WidgetTextConfigStatics.anInt500 = i_13_
                    HeightMapNoise.anInt3829 = widgetComponent.anInt812
                    RenderNodeStatics.aBoolean9722 = true
                    NativeLibraryState.anInt169 = widgetComponent.anInt704
                    FloatBufferStatics.anInt9747 = widgetComponent.anInt824
                    if (i_14_.toInt() != 21) method2665(-99, (-106).toByte(), 10, -37, 26, -123)
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
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("eaa.E(" + (if (objects != null) "{...}" else "null") + ',' + (if (ls != null) "{...}" else "null") + ',' + i + ')'))
                }
            }
}
