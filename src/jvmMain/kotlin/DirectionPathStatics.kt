import RangedGraphicsOptionStateStatics.method1762

object DirectionPathStatics {
    @JvmField
            var anInt1056: Int = 0
            @JvmField
            var anInt1059: Int = 0
            @JvmField
            var anInt1060: Int = 0
            @JvmField
            var anInt1061: Int = 0
            @JvmField
            var anInt1062: Int = 0
            @JvmField
            var anInt1063: Int = 0
            @JvmField
            var anInt1064: Int = -2
            @JvmField
            var anInt1065: Int = 0
            @JvmField
            var anInt1066: Int = 0
            @JvmField
            var anInt1067: Int = 0
    
            @JvmStatic
            fun method532(i: Int, i_0_: Int, bool: Boolean, i_1_: Int): Int {
                anInt1061++
                val class348_sub13 = GlTexture1DStatics.method1974((-120).toByte(), i_0_, bool)
                if (class348_sub13 == null) return 0
                if (i == -1) return 0
                var i_2_ = 0
                var i_3_ = 0
                while ((i_3_ < class348_sub13.anIntArray6758.size)) {
                    if (class348_sub13.anIntArray6757!![i_3_] == i) i_2_ += class348_sub13.anIntArray6758[i_3_]
                    i_3_++
                }
                val i_4_ = 73 % ((i_1_ - -52) / 63)
                return i_2_
            }
    
            @JvmStatic
            fun method535(i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Byte) {
                anInt1062++
                val i_13_ = WhirlpoolHashStatics.method831(WidgetTextConfigStatics.anInt513, i_11_, LocalPlayerState.anInt1910, 111)
                val i_14_ = WhirlpoolHashStatics.method831(WidgetTextConfigStatics.anInt513, i_7_, LocalPlayerState.anInt1910, -104)
                if (i_12_ >= -62) method535(80, -63, -10, 41, -65, 39, (-89).toByte())
                val i_15_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i, WorldMapLabelStatics.anInt4960, -79)
                val i_16_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i_9_, WorldMapLabelStatics.anInt4960, 92)
                val i_17_ = WhirlpoolHashStatics.method831(WidgetTextConfigStatics.anInt513, i_11_ + i_8_, LocalPlayerState.anInt1910, 32)
                val i_18_ = WhirlpoolHashStatics.method831(WidgetTextConfigStatics.anInt513, -i_8_ + i_7_, LocalPlayerState.anInt1910, 41)
                var i_19_ = i_13_
                while (i_17_ > i_19_) {
                    GlElementArrayBufferStatics.method1156(-27, i_16_, WidgetDefinitionStatics.anIntArrayArray255!![i_19_]!!, i_15_, i_10_)
                    i_19_++
                }
                var i_20_ = i_14_
                while (i_18_ < i_20_) {
                    GlElementArrayBufferStatics.method1156(-27, i_16_, WidgetDefinitionStatics.anIntArrayArray255!![i_20_]!!, i_15_, i_10_)
                    i_20_--
                }
                val i_21_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i_8_ + i, WorldMapLabelStatics.anInt4960, 121)
                val i_22_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, -i_8_ + i_9_, WorldMapLabelStatics.anInt4960, -101)
                for (i_23_ in i_17_..i_18_) {
                    val `is`: IntArray = WidgetDefinitionStatics.anIntArrayArray255!![i_23_]!!
                    GlElementArrayBufferStatics.method1156(-27, i_21_, `is`, i_15_, i_10_)
                    GlElementArrayBufferStatics.method1156(-27, i_16_, `is`, i_22_, i_10_)
                }
            }
    
            @JvmStatic
            fun method536(i: Int, bool: Boolean, i_24_: Int, i_25_: Int, i_26_: Int): Boolean {
                if (bool != false) method536(-65, true, 105, -126, 39)
                anInt1066++
                if ((AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![0]!![i_24_]!![i].toInt() and 0x2) != 0) return true
                if ((0x10 and AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![i_26_]!![i_24_]!![i].toInt()) != 0) return false
                return i_25_ == method1762(-55, i_26_, i, i_24_)
            }
}
