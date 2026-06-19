import TwoStateOptionStateStatics.method1842

object MapAreaDefinitionStatics {
    var anInt2521: Int = 0
            @JvmField
            var anInt2523: Int = 0
            @JvmField
            var anInt2524: Int = 0
            var aIntRange_2527: IntRange? = IntRange(98, -2)
            var anInt2528: Int = 0
            @JvmField
            var aBufferedMessageQueue_2529: BufferedMessageQueue? = null
            var anInt2532: Int = 0
            fun method1420(i: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, i_10_: Int, i_11_: Int, i_12_: Int, collisionMap: CollisionMap, i_13_: Int, i_14_: Int): Boolean {
                anInt2521++
                var i_15_ = i_10_
                var i_16_ = i_7_
                var i_17_ = 64
                var i_18_ = 64
                val i_19_ = i_10_ - i_17_
                RenderNodeStatics.anIntArrayArray9723!![i_17_]!![i_18_] = 99
                val i_20_ = i_7_ + -i_18_
                ProjectileFactoryStatics.anIntArrayArray2900!![i_17_]!![i_18_] = 0
                var i_21_ = 0
                GlGroundShaderPassStatics.anIntArray7397!![i_21_] = i_15_
                var i_22_ = 0
                CircleDrawer.anIntArray2694!![i_21_++] = i_16_
                val `is` = collisionMap.anIntArrayArray4438!!
                while_56_@ while (i_22_ != i_21_) {
                    i_16_ = CircleDrawer.anIntArray2694!![i_22_]
                    i_15_ = GlGroundShaderPassStatics.anIntArray7397!![i_22_]
                    i_17_ = i_15_ + -i_19_
                    i_18_ = -i_20_ + i_16_
                    i_22_ = 0xfff and i_22_ - -1
                    val i_23_ = i_15_ - collisionMap.anInt4453
                    val i_24_ = i_16_ - collisionMap.anInt4441
                    var i_25_ = i_13_
                    while_48_@ do {
                        while_47_@ do {
                            while_46_@ do {
                                while_45_@ do {
                                    do {
                                        if (i_25_ == -4) {
                                            if (i_15_ == i_9_ && (i_16_ == i_14_)) {
                                                HslAdjustTextureNodeStatics.anInt9388 = i_15_
                                                OverlayColorTable.anInt1753 = i_16_
                                                return true
                                            }
                                            break@while_48_
                                        } else if (i_25_ != -3) {
                                            if (i_25_ != -2) {
                                                if (i_25_ != -1) {
                                                    if (i_25_ == 0 || i_25_ == 1 || i_25_ == 2 || i_25_ == 3 || i_25_ == 9) break@while_46_
                                                    break@while_47_
                                                }
                                            } else break
                                            break@while_45_
                                        }
                                        if (method1842(i, i_14_, -1, i_12_, i_15_, i_16_, i_9_, i_12_, i_8_)) {
                                            OverlayColorTable.anInt1753 = i_16_
                                            HslAdjustTextureNodeStatics.anInt9388 = i_15_
                                            return true
                                        }
                                        break@while_48_
                                    } while (false)
                                    if (collisionMap.method3497(-28388, i_9_, i_11_, i_12_, i_8_, i_15_, i_12_, i_16_, i_14_, i)) {
                                        HslAdjustTextureNodeStatics.anInt9388 = i_15_
                                        OverlayColorTable.anInt1753 = i_16_
                                        return true
                                    }
                                    break@while_48_
                                } while (false)
                                if (collisionMap.method3503(i_15_, (-98).toByte(), i_14_, i_12_, i_8_, i, i_11_, i_16_, i_9_)) {
                                    HslAdjustTextureNodeStatics.anInt9388 = i_15_
                                    OverlayColorTable.anInt1753 = i_16_
                                    return true
                                }
                                break@while_48_
                            } while (false)
                            if (collisionMap.method3495(i_9_, i_16_, i_12_, i_5_, i_15_, i_14_, i_13_, -71)) {
                                HslAdjustTextureNodeStatics.anInt9388 = i_15_
                                OverlayColorTable.anInt1753 = i_16_
                                return true
                            }
                            break@while_48_
                        } while (false)
                        if (collisionMap.method3504(i_14_, i_16_, i_9_, i_15_, i_13_, 1, i_5_, i_12_)) {
                            OverlayColorTable.anInt1753 = i_16_
                            HslAdjustTextureNodeStatics.anInt9388 = i_15_
                            return true
                        }
                    } while (false)
                    i_25_ = ProjectileFactoryStatics.anIntArrayArray2900!![i_17_]!![i_18_] + 1
                    while_49_@ do {
                        if (i_17_ > 0 && RenderNodeStatics.anIntArrayArray9723!![-1 + i_17_]!![i_18_] == 0 && (`is`[-1 + i_23_]!![i_24_] and 0x43a40000) == 0 && ((`is`[-1 + i_23_]!![-1 + i_12_ + i_24_] and 0x4e240000) == 0)) {
                            var i_26_ = 1
                            while (-1 + i_12_ > i_26_) {
                                if ((`is`[i_23_ - 1]!![i_26_ + i_24_] and 0x4fa40000) != 0) break@while_49_
                                i_26_++
                            }
                            GlGroundShaderPassStatics.anIntArray7397!![i_21_] = i_15_ - 1
                            CircleDrawer.anIntArray2694!![i_21_] = i_16_
                            i_21_ = i_21_ - -1 and 0xfff
                            RenderNodeStatics.anIntArrayArray9723!![i_17_ - 1]!![i_18_] = 2
                            ProjectileFactoryStatics.anIntArrayArray2900!![-1 + i_17_]!![i_18_] = i_25_
                        }
                    } while (false)
                    while_50_@ do {
                        if (i_17_ < -i_12_ + 128 && RenderNodeStatics.anIntArrayArray9723!![i_17_ + 1]!![i_18_] == 0 && (`is`[i_23_ + i_12_]!![i_24_] and 0x60e40000) == 0 && ((`is`[i_12_ + i_23_]!![-1 + (i_24_ - -i_12_)] and 0x78240000) == 0)) {
                            var i_27_ = 1
                            while (i_12_ - 1 > i_27_) {
                                if ((`is`[i_12_ + i_23_]!![i_24_ - -i_27_] and 0x78e40000) != 0) break@while_50_
                                i_27_++
                            }
                            GlGroundShaderPassStatics.anIntArray7397!![i_21_] = 1 + i_15_
                            CircleDrawer.anIntArray2694!![i_21_] = i_16_
                            RenderNodeStatics.anIntArrayArray9723!![1 + i_17_]!![i_18_] = 8
                            i_21_ = 0xfff and i_21_ - -1
                            ProjectileFactoryStatics.anIntArrayArray2900!![i_17_ + 1]!![i_18_] = i_25_
                        }
                    } while (false)
                    while_51_@ do {
                        if (i_18_ > 0 && RenderNodeStatics.anIntArrayArray9723!![i_17_]!![-1 + i_18_] == 0 && (0x43a40000 and `is`[i_23_]!![i_24_ - 1]) == 0 && (0x60e40000 and `is`[-1 + (i_23_ + i_12_)]!![i_24_ - 1]) == 0) {
                            var i_28_ = 1
                            while (i_12_ - 1 > i_28_) {
                                if ((0x63e40000 and `is`[i_23_ - -i_28_]!![-1 + i_24_]) != 0) break@while_51_
                                i_28_++
                            }
                            GlGroundShaderPassStatics.anIntArray7397!![i_21_] = i_15_
                            CircleDrawer.anIntArray2694!![i_21_] = -1 + i_16_
                            RenderNodeStatics.anIntArrayArray9723!![i_17_]!![-1 + i_18_] = 1
                            i_21_ = 0xfff and 1 + i_21_
                            ProjectileFactoryStatics.anIntArrayArray2900!![i_17_]!![-1 + i_18_] = i_25_
                        }
                    } while (false)
                    while_52_@ do {
                        if (i_18_ < -i_12_ + 128 && (RenderNodeStatics.anIntArrayArray9723!![i_17_]!![1 + i_18_] == 0) && ((0x4e240000 and `is`[i_23_]!![i_24_ - -i_12_]) == 0) && ((0x78240000 and `is`[-1 + i_12_ + i_23_]!![i_24_ + i_12_]) == 0)) {
                            var i_29_ = 1
                            while (-1 + i_12_ > i_29_) {
                                if ((0x7e240000 and `is`[i_23_ + i_29_]!![i_12_ + i_24_]) != 0) break@while_52_
                                i_29_++
                            }
                            GlGroundShaderPassStatics.anIntArray7397!![i_21_] = i_15_
                            CircleDrawer.anIntArray2694!![i_21_] = i_16_ - -1
                            RenderNodeStatics.anIntArrayArray9723!![i_17_]!![1 + i_18_] = 4
                            i_21_ = i_21_ - -1 and 0xfff
                            ProjectileFactoryStatics.anIntArrayArray2900!![i_17_]!![i_18_ + 1] = i_25_
                        }
                    } while (false)
                    while_53_@ do {
                        if (i_17_ > 0 && i_18_ > 0 && RenderNodeStatics.anIntArrayArray9723!![i_17_ - 1]!![-1 + i_18_] == 0 && ((`is`[i_23_ + -1]!![-1 + i_24_] and 0x43a40000) == 0)) {
                            var i_30_ = 1
                            while (i_12_ > i_30_) {
                                if ((0x4fa40000 and `is`[-1 + i_23_]!![i_24_ + (-1 + i_30_)]) != 0 || (0x63e40000 and `is`[i_23_ - (1 + -i_30_)]!![i_24_ - 1]) != 0) break@while_53_
                                i_30_++
                            }
                            GlGroundShaderPassStatics.anIntArray7397!![i_21_] = i_15_ - 1
                            CircleDrawer.anIntArray2694!![i_21_] = -1 + i_16_
                            i_21_ = 1 + i_21_ and 0xfff
                            RenderNodeStatics.anIntArrayArray9723!![i_17_ - 1]!![-1 + i_18_] = 3
                            ProjectileFactoryStatics.anIntArrayArray2900!![i_17_ + -1]!![-1 + i_18_] = i_25_
                        }
                    } while (false)
                    while_54_@ do {
                        if (128 - i_12_ > i_17_ && i_18_ > 0 && RenderNodeStatics.anIntArrayArray9723!![1 + i_17_]!![i_18_ + -1] == 0 && (0x60e40000 and `is`[i_23_ + i_12_]!![-1 + i_24_]) == 0) {
                            var i_31_ = 1
                            while (i_12_ > i_31_) {
                                if ((0x78e40000 and `is`[i_23_ - -i_12_]!![i_31_ + (i_24_ - 1)]) != 0 || ((`is`[i_23_ + i_31_]!![-1 + i_24_] and 0x63e40000) != 0)) break@while_54_
                                i_31_++
                            }
                            GlGroundShaderPassStatics.anIntArray7397!![i_21_] = i_15_ - -1
                            CircleDrawer.anIntArray2694!![i_21_] = -1 + i_16_
                            RenderNodeStatics.anIntArrayArray9723!![1 + i_17_]!![-1 + i_18_] = 9
                            i_21_ = 0xfff and i_21_ - -1
                            ProjectileFactoryStatics.anIntArrayArray2900!![1 + i_17_]!![-1 + i_18_] = i_25_
                        }
                    } while (false)
                    while_55_@ do {
                        if (i_17_ > 0 && i_18_ < -i_12_ + 128 && RenderNodeStatics.anIntArrayArray9723!![-1 + i_17_]!![1 + i_18_] == 0 && (`is`[i_23_ - 1]!![i_12_ + i_24_] and 0x4e240000) == 0) {
                            for (i_32_ in 1..<i_12_) {
                                if ((`is`[-1 + i_23_]!![i_32_ + i_24_] and 0x4fa40000) != 0 || (`is`[i_32_ + (i_23_ + -1)]!![i_24_ - -i_12_] and 0x7e240000) != 0) break@while_55_
                            }
                            GlGroundShaderPassStatics.anIntArray7397!![i_21_] = i_15_ - 1
                            CircleDrawer.anIntArray2694!![i_21_] = i_16_ - -1
                            RenderNodeStatics.anIntArrayArray9723!![i_17_ - 1]!![i_18_ - -1] = 6
                            i_21_ = i_21_ - -1 and 0xfff
                            ProjectileFactoryStatics.anIntArrayArray2900!![-1 + i_17_]!![i_18_ - -1] = i_25_
                        }
                    } while (false)
                    if (i_17_ < 128 + -i_12_ && i_18_ < 128 + -i_12_ && (RenderNodeStatics.anIntArrayArray9723!![i_17_ + 1]!![1 + i_18_] == 0) && (0x78240000 and `is`[i_12_ + i_23_]!![i_24_ + i_12_]) == 0) {
                        var i_33_ = 1
                        while (i_12_ > i_33_) {
                            if ((0x7e240000 and `is`[i_23_ + i_33_]!![i_24_ - -i_12_]) != 0 || ((`is`[i_12_ + i_23_]!![i_24_ - -i_33_] and 0x78e40000) != 0)) continue@while_56_
                            i_33_++
                        }
                        GlGroundShaderPassStatics.anIntArray7397!![i_21_] = i_15_ - -1
                        CircleDrawer.anIntArray2694!![i_21_] = i_16_ - -1
                        i_21_ = 0xfff and 1 + i_21_
                        RenderNodeStatics.anIntArrayArray9723!![i_17_ - -1]!![1 + i_18_] = 12
                        ProjectileFactoryStatics.anIntArrayArray2900!![i_17_ + 1]!![i_18_ - -1] = i_25_
                    }
                }
                OverlayColorTable.anInt1753 = i_16_
                HslAdjustTextureNodeStatics.anInt9388 = i_15_
                return false
            }
    
            @JvmStatic
            fun method1421(i: Byte) {
                aBufferedMessageQueue_2529 = null
                if (i.toInt() != -85) method1421(39.toByte())
                aIntRange_2527 = null
            }
}
