import jaclib.memory.Stream
import jaclib.memory.StreamStatics.c
import kotlin.math.sqrt

object NativeTerrainTileStatics {
    @JvmField
            var anInt8287: Int = 0
            @JvmField
            var anInt8288: Int = 0
            @JvmField
            var anInt8289: Int = 0
            @JvmField
            var anInt8290: Int = 0
            @JvmField
            var anInt8292: Int = 0
            @JvmField
            var anInt8293: Int = 0
            @JvmField
            var anInt8295: Int = 0
            @JvmField
            var anInt8297: Int = 0
            @JvmField
            var anInt8298: Int = 0
            @JvmField
            var anInt8300: Int = 0
            @JvmField
            var anInt8304: Int = 0
            @JvmField
            var anInt8309: Int = 0
            @JvmField
            var anInt8310: Int = 0
            @JvmField
            var anInt8315: Int = 0
            @JvmField
            var anInt8316: Int = 0
            @JvmField
            var anInt8318: Int = 0
            @JvmField
            var anInt8319: Int = 0
            @JvmField
            var aCameraRotationStub_8320: CameraRotationStub? = CameraRotationStub()
            @JvmStatic
            fun method4004(i: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int) {
                anInt8292++
                val i_10_ = WhirlpoolHashStatics.method831(WidgetTextConfigStatics.anInt513, i_4_, LocalPlayerState.anInt1910, -118)
                val i_11_ = WhirlpoolHashStatics.method831(WidgetTextConfigStatics.anInt513, i, LocalPlayerState.anInt1910, 72)
                val i_12_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i_8_, WorldMapLabelStatics.anInt4960, -80)
                val i_13_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i_3_, WorldMapLabelStatics.anInt4960, -101)
                val i_14_ = WhirlpoolHashStatics.method831(WidgetTextConfigStatics.anInt513, i_4_ + i_6_, LocalPlayerState.anInt1910, -110)
                val i_15_ = WhirlpoolHashStatics.method831(WidgetTextConfigStatics.anInt513, i + -i_6_, LocalPlayerState.anInt1910, 28)
                if (i_7_ < -33) {
                    for (i_16_ in i_10_..<i_14_) GlElementArrayBufferStatics.method1156(-27, i_13_, WidgetDefinitionStatics.anIntArrayArray255!![i_16_]!!, i_12_, i_9_)
                    for (i_17_ in i_11_ downTo i_15_ + 1) GlElementArrayBufferStatics.method1156(-27, i_13_, WidgetDefinitionStatics.anIntArrayArray255!![i_17_]!!, i_12_, i_9_)
                    val i_18_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i_8_ + i_6_, WorldMapLabelStatics.anInt4960, 114)
                    val i_19_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, -i_6_ + i_3_, WorldMapLabelStatics.anInt4960, 34)
                    for (i_20_ in i_14_..i_15_) {
                        val `is` = WidgetDefinitionStatics.anIntArrayArray255!![i_20_]!!
                        GlElementArrayBufferStatics.method1156(-27, i_18_, `is`, i_12_, i_9_)
                        GlElementArrayBufferStatics.method1156(-27, i_19_, `is`, i_18_, i_5_)
                        GlElementArrayBufferStatics.method1156(-27, i_13_, `is`, i_19_, i_9_)
                    }
                }
            }
    
            @JvmStatic
            fun method4006(i: Int) {
                aCameraRotationStub_8320 = null
                if (i > -42) aCameraRotationStub_8320 = null
            }
    
            @JvmStatic
            fun method4008(i: Byte): Int {
                anInt8289++
                if (i >= -121) aCameraRotationStub_8320 = null
                if (ByteBufferStatics.anInt7207 == 1) return MapRegionLoaderThreadStatics.anInt4211
                return 0
            }
}
