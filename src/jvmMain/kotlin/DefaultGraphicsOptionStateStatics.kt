object DefaultGraphicsOptionStateStatics {
    @JvmField
            var anInt6127: Int = 0
            @JvmField
            var aTileRenderState_6128: TileRenderState? = null
            @JvmField
            var anInt6129: Int = 0
            @JvmField
            var anInt6130: Int = 0
            @JvmField
            var anInt6131: Int = 0
            @JvmField
            var anInt6132: Int = 0
            @JvmField
            var anInt6133: Int = 0
    
            @JvmStatic
            fun method1839(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int, i_4_: Int) {
                anInt6129++
                var i_5_ = 0
                var i_6_ = i_0_
                val i_7_ = i_4_ * i_4_
                val i_8_ = i_0_ * i_0_
                val i_9_ = i_8_ shl 1
                val i_10_ = i_7_ shl 1
                val i_11_ = i_0_ shl 1
                var i_12_ = i_9_ + i_7_ * (-i_11_ + 1)
                var i_13_ = -((i_11_ + i_2_) * i_10_) + i_8_
                val i_14_ = i_7_ shl 2
                val i_15_ = i_8_ shl 2
                var i_16_ = i_9_ * (3 + (i_5_ shl 1))
                var i_17_ = i_10_ * (-3 + (i_6_ shl 1))
                var i_18_ = i_15_ * (i_5_ - -1)
                if (LocalPlayerState.anInt1910 <= i_1_ && WidgetTextConfigStatics.anInt513 >= i_1_) {
                    val i_19_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i + i_4_, WorldMapLabelStatics.anInt4960, -89)
                    val i_20_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, -i_4_ + i, WorldMapLabelStatics.anInt4960, -116)
                    GlElementArrayBufferStatics.method1156(-27, i_19_, WidgetDefinitionStatics.anIntArrayArray255!![i_1_]!!, i_20_, i_3_)
                }
                var i_21_ = i_14_ * (i_6_ - 1)
                while (i_6_ > 0) {
                    if (i_12_ < 0) {
                        while (i_12_ < 0) {
                            i_13_ += i_18_
                            i_12_ += i_16_
                            i_5_++
                            i_16_ += i_15_
                            i_18_ += i_15_
                        }
                    }
                    if (i_13_ < 0) {
                        i_12_ += i_16_
                        i_13_ += i_18_
                        i_16_ += i_15_
                        i_18_ += i_15_
                        i_5_++
                    }
                    i_13_ += -i_17_
                    i_12_ += -i_21_
                    i_21_ -= i_14_
                    i_17_ -= i_14_
                    i_6_--
                    val i_22_ = i_1_ + -i_6_
                    val i_23_ = i_6_ + i_1_
                    if (i_23_ >= LocalPlayerState.anInt1910 && i_22_ <= WidgetTextConfigStatics.anInt513) {
                        val i_24_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, i + i_5_, WorldMapLabelStatics.anInt4960, 86)
                        val i_25_ = WhirlpoolHashStatics.method831(CameraNodeListStatics.anInt1745, -i_5_ + i, WorldMapLabelStatics.anInt4960, 32)
                        if (LocalPlayerState.anInt1910 <= i_22_) GlElementArrayBufferStatics.method1156(i_2_ + -26, i_24_, WidgetDefinitionStatics.anIntArrayArray255!![i_22_]!!, i_25_, i_3_)
                        if (WidgetTextConfigStatics.anInt513 >= i_23_) GlElementArrayBufferStatics.method1156(-27, i_24_, WidgetDefinitionStatics.anIntArrayArray255!![i_23_]!!, i_25_, i_3_)
                    }
                }
            }
    
            @JvmStatic
            fun method1841(i: Int) {
                if (i != 16878) method1839(-83, -10, 27, 111, 41, 109)
                aTileRenderState_6128 = null
            }
}
