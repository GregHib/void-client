import TwoStateOptionStateStatics.method1842

object ScrollbarComponentStatics {
    @JvmField
            var anInt8334: Int = 0
            @JvmField
            var aBoolean8335: Boolean = false
            @JvmField
            var anInt8336: Int = 0
            @JvmField
            var anInt8337: Int = 0
            @JvmField
            var anInt8340: Int = 0
            @JvmField
            var anInt8341: Int = 0
            @JvmField
            var aScreenAnchorAlignment_8344: ScreenAnchorAlignment?
            @JvmField
            var anInt8345: Int = 0
            @JvmField
            var anInt8346: Int = 0
            @JvmField
            var anInt8348: Int = 0
            @JvmField
            var anInt8349: Int = 0
            @JvmField
            var anInt8351: Int = 0
            @JvmField
            var anInt8352: Int = 0
    
            @JvmStatic
            fun method184(i: Int): IntArray {
                anInt8346++
                if (i != 1084489728) method189(33.toByte())
                return (intArrayOf(ConnectionStateTypeStatics.anInt1044, WidgetDefinitionStatics.anInt235, CutsceneSequenceDataStatics.anInt3736))
            }
    
            @JvmStatic
            fun method185(i: Int, i_2_: Byte): Int {
                if (i_2_ > 0) anInt8352 = 48
                anInt8340++
                return 0xff and i
            }
    
            @JvmStatic
            fun method187(i: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, collisionMap: CollisionMap, i_12_: Int, i_13_: Int, i_14_: Int, i_15_: Int): Boolean {
                anInt8348++
                var i_16_ = i_14_
                var i_17_ = i_8_
                var i_18_ = 64
                var i_19_ = 64
                val i_20_ = i_14_ + -i_18_
                RenderNodeStatics.anIntArrayArray9723!![i_18_]!![i_19_] = 99
                val i_21_ = -i_19_ + i_8_
                ProjectileFactoryStatics.anIntArrayArray2900!![i_18_]!![i_19_] = 0
                var i_22_ = 0
                var i_23_ = 0
                GlGroundShaderPassStatics.anIntArray7397!![i_22_] = i_16_
                CircleDrawer.anIntArray2694!![i_22_++] = i_17_
                val `is` = collisionMap.anIntArrayArray4438!!
                while (i_22_ != i_23_) {
                    i_17_ = CircleDrawer.anIntArray2694!![i_23_]
                    i_16_ = GlGroundShaderPassStatics.anIntArray7397!![i_23_]
                    val i_24_ = -collisionMap.anInt4441 + i_17_
                    i_18_ = -i_20_ + i_16_
                    i_19_ = i_17_ - i_21_
                    val i_25_ = i_16_ + -collisionMap.anInt4453
                    i_23_ = 0xfff and 1 + i_23_
                    var i_26_ = i_12_
                    while_3_@ do {
                        while_2_@ do {
                            while_1_@ do {
                                while_0_@ do {
                                    do {
                                        if (i_26_ == -4) {
                                            if (i_16_ == i && (i_17_ == i_7_)) {
                                                HslAdjustTextureNodeStatics.anInt9388 = i_16_
                                                OverlayColorTable.anInt1753 = i_17_
                                                return true
                                            }
                                            break@while_3_
                                        } else if (i_26_ != -3) {
                                            if (i_26_ != -2) {
                                                if (i_26_ != -1) {
                                                    if (i_26_ == 0 || (i_26_ == 1) || (i_26_ == 2) || (i_26_ == 3) || i_26_ == 9) break@while_1_
                                                    break@while_2_
                                                }
                                            } else break
                                            break@while_0_
                                        }
                                        if (method1842(i_11_, i_7_, -1, 1, i_16_, i_17_, i, 1, i_13_)) {
                                            OverlayColorTable.anInt1753 = i_17_
                                            HslAdjustTextureNodeStatics.anInt9388 = i_16_
                                            return true
                                        }
                                        break@while_3_
                                    } while (false)
                                    if (collisionMap.method3497(-28388, i, i_10_, 1, i_13_, i_16_, 1, i_17_, i_7_, i_11_)) {
                                        OverlayColorTable.anInt1753 = i_17_
                                        HslAdjustTextureNodeStatics.anInt9388 = i_16_
                                        return true
                                    }
                                    break@while_3_
                                } while (false)
                                if (collisionMap.method3503(i_16_, 110.toByte(), i_7_, 1, i_13_, i_11_, i_10_, i_17_, i)) {
                                    HslAdjustTextureNodeStatics.anInt9388 = i_16_
                                    OverlayColorTable.anInt1753 = i_17_
                                    return true
                                }
                                break@while_3_
                            } while (false)
                            if (collisionMap.method3495(i, i_17_, 1, i_9_, i_16_, i_7_, i_12_, 91)) {
                                OverlayColorTable.anInt1753 = i_17_
                                HslAdjustTextureNodeStatics.anInt9388 = i_16_
                                return true
                            }
                            break@while_3_
                        } while (false)
                        if (collisionMap.method3504(i_7_, i_17_, i, i_16_, i_12_, 1, i_9_, 1)) {
                            HslAdjustTextureNodeStatics.anInt9388 = i_16_
                            OverlayColorTable.anInt1753 = i_17_
                            return true
                        }
                    } while (false)
                    i_26_ = 1 + ProjectileFactoryStatics.anIntArrayArray2900!![i_18_]!![i_19_]
                    if (i_18_ > 0 && (RenderNodeStatics.anIntArrayArray9723!![i_18_ + -1]!![i_19_] == 0) && (`is`[-1 + i_25_]!![i_24_] and 0x42240000) == 0) {
                        GlGroundShaderPassStatics.anIntArray7397!![i_22_] = -1 + i_16_
                        CircleDrawer.anIntArray2694!![i_22_] = i_17_
                        i_22_ = 0xfff and i_22_ - -1
                        RenderNodeStatics.anIntArrayArray9723!![i_18_ + -1]!![i_19_] = 2
                        ProjectileFactoryStatics.anIntArrayArray2900!![-1 + i_18_]!![i_19_] = i_26_
                    }
                    if (i_18_ < 127 && RenderNodeStatics.anIntArrayArray9723!![1 + i_18_]!![i_19_] == 0 && (0x60240000 and `is`[1 + i_25_]!![i_24_]) == 0) {
                        GlGroundShaderPassStatics.anIntArray7397!![i_22_] = i_16_ + 1
                        CircleDrawer.anIntArray2694!![i_22_] = i_17_
                        RenderNodeStatics.anIntArrayArray9723!![1 + i_18_]!![i_19_] = 8
                        i_22_ = 0xfff and i_22_ - -1
                        ProjectileFactoryStatics.anIntArrayArray2900!![1 + i_18_]!![i_19_] = i_26_
                    }
                    if (i_19_ > 0 && (RenderNodeStatics.anIntArrayArray9723!![i_18_]!![i_19_ + -1] == 0) && (`is`[i_25_]!![i_24_ - 1] and 0x40a40000) == 0) {
                        GlGroundShaderPassStatics.anIntArray7397!![i_22_] = i_16_
                        CircleDrawer.anIntArray2694!![i_22_] = -1 + i_17_
                        RenderNodeStatics.anIntArrayArray9723!![i_18_]!![-1 + i_19_] = 1
                        i_22_ = 0xfff and 1 + i_22_
                        ProjectileFactoryStatics.anIntArrayArray2900!![i_18_]!![-1 + i_19_] = i_26_
                    }
                    if (i_19_ < 127 && RenderNodeStatics.anIntArrayArray9723!![i_18_]!![1 + i_19_] == 0 && (0x48240000 and `is`[i_25_]!![i_24_ - -1]) == 0) {
                        GlGroundShaderPassStatics.anIntArray7397!![i_22_] = i_16_
                        CircleDrawer.anIntArray2694!![i_22_] = i_17_ + 1
                        RenderNodeStatics.anIntArrayArray9723!![i_18_]!![i_19_ - -1] = 4
                        i_22_ = 0xfff and i_22_ + 1
                        ProjectileFactoryStatics.anIntArrayArray2900!![i_18_]!![i_19_ + 1] = i_26_
                    }
                    if (i_18_ > 0 && i_19_ > 0 && RenderNodeStatics.anIntArrayArray9723!![-1 + i_18_]!![i_19_ + -1] == 0 && (`is`[-1 + i_25_]!![i_24_ - 1] and 0x43a40000) == 0 && (`is`[-1 + i_25_]!![i_24_] and 0x42240000) == 0 && (0x40a40000 and `is`[i_25_]!![i_24_ - 1]) == 0) {
                        GlGroundShaderPassStatics.anIntArray7397!![i_22_] = -1 + i_16_
                        CircleDrawer.anIntArray2694!![i_22_] = i_17_ - 1
                        i_22_ = 1 + i_22_ and 0xfff
                        RenderNodeStatics.anIntArrayArray9723!![i_18_ + -1]!![-1 + i_19_] = 3
                        ProjectileFactoryStatics.anIntArrayArray2900!![i_18_ + -1]!![-1 + i_19_] = i_26_
                    }
                    if (i_18_ < 127 && i_19_ > 0 && (RenderNodeStatics.anIntArrayArray9723!![i_18_ + 1]!![i_19_ - 1] == 0) && (0x60e40000 and `is`[i_25_ - -1]!![i_24_ + -1]) == 0 && (`is`[1 + i_25_]!![i_24_] and 0x60240000) == 0 && (`is`[i_25_]!![-1 + i_24_] and 0x40a40000) == 0) {
                        GlGroundShaderPassStatics.anIntArray7397!![i_22_] = i_16_ + 1
                        CircleDrawer.anIntArray2694!![i_22_] = i_17_ - 1
                        i_22_ = 0xfff and 1 + i_22_
                        RenderNodeStatics.anIntArrayArray9723!![1 + i_18_]!![-1 + i_19_] = 9
                        ProjectileFactoryStatics.anIntArrayArray2900!![1 + i_18_]!![i_19_ + -1] = i_26_
                    }
                    if (i_18_ > 0 && i_19_ < 127 && RenderNodeStatics.anIntArrayArray9723!![-1 + i_18_]!![i_19_ - -1] == 0 && (`is`[i_25_ + -1]!![i_24_ - -1] and 0x4e240000) == 0 && (0x42240000 and `is`[i_25_ - 1]!![i_24_]) == 0 && (0x48240000 and `is`[i_25_]!![1 + i_24_]) == 0) {
                        GlGroundShaderPassStatics.anIntArray7397!![i_22_] = i_16_ - 1
                        CircleDrawer.anIntArray2694!![i_22_] = i_17_ + 1
                        RenderNodeStatics.anIntArrayArray9723!![i_18_ + -1]!![i_19_ - -1] = 6
                        i_22_ = 1 + i_22_ and 0xfff
                        ProjectileFactoryStatics.anIntArrayArray2900!![-1 + i_18_]!![1 + i_19_] = i_26_
                    }
                    if (i_18_ < 127 && i_19_ < 127 && (RenderNodeStatics.anIntArrayArray9723!![1 + i_18_]!![1 + i_19_] == 0) && (0x78240000 and `is`[i_25_ - -1]!![1 + i_24_]) == 0 && (0x60240000 and `is`[1 + i_25_]!![i_24_]) == 0 && (0x48240000 and `is`[i_25_]!![i_24_ - -1]) == 0) {
                        GlGroundShaderPassStatics.anIntArray7397!![i_22_] = i_16_ - -1
                        CircleDrawer.anIntArray2694!![i_22_] = 1 + i_17_
                        RenderNodeStatics.anIntArrayArray9723!![1 + i_18_]!![i_19_ + 1] = 12
                        i_22_ = 0xfff and 1 + i_22_
                        ProjectileFactoryStatics.anIntArrayArray2900!![1 + i_18_]!![1 + i_19_] = i_26_
                    }
                }
                if (i_15_ != 1109655552) aBoolean8335 = false
                HslAdjustTextureNodeStatics.anInt9388 = i_16_
                OverlayColorTable.anInt1753 = i_17_
                return false
            }
    
            @JvmStatic
            fun method188(i: Byte): Array<ConfigIdPair?> {
                anInt8345++
                val i_34_ = -7 / ((-67 - i) / 44)
                return (arrayOf<ConfigIdPair?>(ScriptOpcodeHolder.aConfigIdPair_2339, ScriptOpcodeHolder.aConfigIdPair_2341, ScriptOpcodeHolder.aConfigIdPair_2342, ScriptOpcodeHolder.aConfigIdPair_2343, ScriptOpcodeHolder.aConfigIdPair_2344, ScriptOpcodeHolder.aConfigIdPair_2345, ScriptOpcodeHolder.aConfigIdPair_2346, ScriptOpcodeHolder.aConfigIdPair_2347, ScriptOpcodeHolder.aConfigIdPair_2348, ScriptOpcodeHolder.aConfigIdPair_2349, ScriptOpcodeHolder.aConfigIdPair_2350, ScriptOpcodeHolder.aConfigIdPair_2351, ScriptOpcodeHolder.aConfigIdPair_2352, ScriptOpcodeHolder.aConfigIdPair_2353))
            }
    
            @JvmStatic
            fun method189(i: Byte) {
                if (i < 112) anInt8352 = -87
                aScreenAnchorAlignment_8344 = null
            }
    
            init {
                aScreenAnchorAlignment_8344 = ScreenAnchorAlignment()
            }
}
