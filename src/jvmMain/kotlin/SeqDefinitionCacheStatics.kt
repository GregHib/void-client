import TwoStateOptionStateStatics.method1842
import MultiLevelOptionStateStatics.method1850

object SeqDefinitionCacheStatics {
    var anInt3344: Int = 0
            var anInt3346: Int = 0
            @JvmField
            var anIntArray3347: IntArray? = IntArray(1000)
            var anInt3348: Int = 0
            var anInt3349: Int = 0
            var anInt3351: Int = 0
            private var aCharArray3352: CharArray? = CharArray(64)
            var anInt3353: Int = 0
            var anInt3354: Int = 0
            var anInt3356: Int = 0
            var anInt3357: Int = 0
            var anInt3358: Int = 0
            fun method2007(i: Int, i_1_: Int, i_2_: Int, collisionMap: CollisionMap, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int): Boolean {
                anInt3354++
                var i_10_ = i_8_
                var i_11_ = i_4_
                var i_12_ = 64
                var i_13_ = 64
                val i_14_ = -i_12_ + i_8_
                val i_15_ = -i_13_ + i_4_
                RenderNodeStatics.anIntArrayArray9723!![i_12_]!![i_13_] = 99
                if (i_1_ >= -27) method2011(103.toByte())
                ProjectileFactoryStatics.anIntArrayArray2900!![i_12_]!![i_13_] = 0
                var i_16_ = 0
                GlGroundShaderPassStatics.anIntArray7397!![i_16_] = i_10_
                var i_17_ = 0
                CircleDrawer.anIntArray2694!![i_16_++] = i_11_
                val `is` = collisionMap.anIntArrayArray4438!!
                while (i_16_ != i_17_) {
                    i_11_ = CircleDrawer.anIntArray2694!![i_17_]
                    i_10_ = GlGroundShaderPassStatics.anIntArray7397!![i_17_]
                    i_17_ = 0xfff and 1 + i_17_
                    i_12_ = i_10_ - i_14_
                    i_13_ = -i_15_ + i_11_
                    val i_18_ = i_10_ + -collisionMap.anInt4453
                    val i_19_ = -collisionMap.anInt4441 + i_11_
                    var i_20_ = i
                    while_85_@ do {
                        while_84_@ do {
                            while_83_@ do {
                                while_82_@ do {
                                    do {
                                        if (i_20_ == -4) {
                                            if (i_10_ == i_3_ && i_2_ == i_11_) {
                                                HslAdjustTextureNodeStatics.anInt9388 = i_10_
                                                OverlayColorTable.anInt1753 = i_11_
                                                return true
                                            }
                                            break@while_85_
                                        } else if (i_20_ != -3) {
                                            if (i_20_ != -2) {
                                                if (i_20_ != -1) {
                                                    if (i_20_ == 0 || i_20_ == 1 || i_20_ == 2 || i_20_ == 3 || (i_20_ == 9)) break@while_83_
                                                    break@while_84_
                                                }
                                            } else break
                                            break@while_82_
                                        }
                                        if (method1842(i_5_, i_2_, -1, 2, i_10_, i_11_, i_3_, 2, i_6_)) {
                                            OverlayColorTable.anInt1753 = i_11_
                                            HslAdjustTextureNodeStatics.anInt9388 = i_10_
                                            return true
                                        }
                                        break@while_85_
                                    } while (false)
                                    if (collisionMap.method3497(-28388, i_3_, i_7_, 2, i_6_, i_10_, 2, i_11_, i_2_, i_5_)) {
                                        HslAdjustTextureNodeStatics.anInt9388 = i_10_
                                        OverlayColorTable.anInt1753 = i_11_
                                        return true
                                    }
                                    break@while_85_
                                } while (false)
                                if (collisionMap.method3503(i_10_, (-82).toByte(), i_2_, 2, i_6_, i_5_, i_7_, i_11_, i_3_)) {
                                    HslAdjustTextureNodeStatics.anInt9388 = i_10_
                                    OverlayColorTable.anInt1753 = i_11_
                                    return true
                                }
                                break@while_85_
                            } while (false)
                            if (collisionMap.method3495(i_3_, i_11_, 2, i_9_, i_10_, i_2_, i, -53)) {
                                HslAdjustTextureNodeStatics.anInt9388 = i_10_
                                OverlayColorTable.anInt1753 = i_11_
                                return true
                            }
                            break@while_85_
                        } while (false)
                        if (collisionMap.method3504(i_2_, i_11_, i_3_, i_10_, i, 1, i_9_, 2)) {
                            HslAdjustTextureNodeStatics.anInt9388 = i_10_
                            OverlayColorTable.anInt1753 = i_11_
                            return true
                        }
                    } while (false)
                    i_20_ = ProjectileFactoryStatics.anIntArrayArray2900!![i_12_]!![i_13_] + 1
                    if (i_12_ > 0 && RenderNodeStatics.anIntArrayArray9723!![i_12_ + -1]!![i_13_] == 0 && (0x43a40000 and `is`[i_18_ - 1]!![i_19_]) == 0 && (0x4e240000 and `is`[i_18_ - 1]!![1 + i_19_]) == 0) {
                        GlGroundShaderPassStatics.anIntArray7397!![i_16_] = -1 + i_10_
                        CircleDrawer.anIntArray2694!![i_16_] = i_11_
                        RenderNodeStatics.anIntArrayArray9723!![-1 + i_12_]!![i_13_] = 2
                        i_16_ = i_16_ + 1 and 0xfff
                        ProjectileFactoryStatics.anIntArrayArray2900!![i_12_ + -1]!![i_13_] = i_20_
                    }
                    if (i_12_ < 126 && (RenderNodeStatics.anIntArrayArray9723!![i_12_ - -1]!![i_13_] == 0) && (0x60e40000 and `is`[2 + i_18_]!![i_19_]) == 0 && (`is`[i_18_ + 2]!![i_19_ + 1] and 0x78240000) == 0) {
                        GlGroundShaderPassStatics.anIntArray7397!![i_16_] = 1 + i_10_
                        CircleDrawer.anIntArray2694!![i_16_] = i_11_
                        RenderNodeStatics.anIntArrayArray9723!![1 + i_12_]!![i_13_] = 8
                        i_16_ = i_16_ + 1 and 0xfff
                        ProjectileFactoryStatics.anIntArrayArray2900!![1 + i_12_]!![i_13_] = i_20_
                    }
                    if (i_13_ > 0 && RenderNodeStatics.anIntArrayArray9723!![i_12_]!![-1 + i_13_] == 0 && (0x43a40000 and `is`[i_18_]!![i_19_ - 1]) == 0 && ((`is`[i_18_ + 1]!![-1 + i_19_] and 0x60e40000) == 0)) {
                        GlGroundShaderPassStatics.anIntArray7397!![i_16_] = i_10_
                        CircleDrawer.anIntArray2694!![i_16_] = i_11_ - 1
                        RenderNodeStatics.anIntArrayArray9723!![i_12_]!![i_13_ + -1] = 1
                        i_16_ = 1 + i_16_ and 0xfff
                        ProjectileFactoryStatics.anIntArrayArray2900!![i_12_]!![i_13_ + -1] = i_20_
                    }
                    if (i_13_ < 126 && RenderNodeStatics.anIntArrayArray9723!![i_12_]!![i_13_ + 1] == 0 && (`is`[i_18_]!![2 + i_19_] and 0x4e240000) == 0 && ((0x78240000 and `is`[1 + i_18_]!![2 + i_19_]) == 0)) {
                        GlGroundShaderPassStatics.anIntArray7397!![i_16_] = i_10_
                        CircleDrawer.anIntArray2694!![i_16_] = 1 + i_11_
                        i_16_ = 1 + i_16_ and 0xfff
                        RenderNodeStatics.anIntArrayArray9723!![i_12_]!![1 + i_13_] = 4
                        ProjectileFactoryStatics.anIntArrayArray2900!![i_12_]!![i_13_ - -1] = i_20_
                    }
                    if (i_12_ > 0 && i_13_ > 0 && RenderNodeStatics.anIntArrayArray9723!![-1 + i_12_]!![i_13_ + -1] == 0 && (`is`[i_18_ + -1]!![i_19_] and 0x4fa40000) == 0 && (`is`[i_18_ - 1]!![i_19_ - 1] and 0x43a40000) == 0 && (`is`[i_18_]!![i_19_ - 1] and 0x63e40000) == 0) {
                        GlGroundShaderPassStatics.anIntArray7397!![i_16_] = -1 + i_10_
                        CircleDrawer.anIntArray2694!![i_16_] = i_11_ - 1
                        i_16_ = 0xfff and 1 + i_16_
                        RenderNodeStatics.anIntArrayArray9723!![i_12_ - 1]!![i_13_ - 1] = 3
                        ProjectileFactoryStatics.anIntArrayArray2900!![-1 + i_12_]!![-1 + i_13_] = i_20_
                    }
                    if (i_12_ < 126 && i_13_ > 0 && (RenderNodeStatics.anIntArrayArray9723!![i_12_ + 1]!![-1 + i_13_] == 0) && (`is`[i_18_ - -1]!![i_19_ + -1] and 0x63e40000) == 0 && (0x60e40000 and `is`[2 + i_18_]!![-1 + i_19_]) == 0 && (`is`[i_18_ - -2]!![i_19_] and 0x78e40000) == 0) {
                        GlGroundShaderPassStatics.anIntArray7397!![i_16_] = 1 + i_10_
                        CircleDrawer.anIntArray2694!![i_16_] = i_11_ + -1
                        RenderNodeStatics.anIntArrayArray9723!![1 + i_12_]!![-1 + i_13_] = 9
                        i_16_ = 0xfff and i_16_ - -1
                        ProjectileFactoryStatics.anIntArrayArray2900!![i_12_ - -1]!![i_13_ - 1] = i_20_
                    }
                    if (i_12_ > 0 && i_13_ < 126 && RenderNodeStatics.anIntArrayArray9723!![i_12_ - 1]!![1 + i_13_] == 0 && (`is`[i_18_ - 1]!![1 + i_19_] and 0x4fa40000) == 0 && (0x4e240000 and `is`[i_18_ - 1]!![2 + i_19_]) == 0 && (`is`[i_18_]!![i_19_ - -2] and 0x7e240000) == 0) {
                        GlGroundShaderPassStatics.anIntArray7397!![i_16_] = i_10_ - 1
                        CircleDrawer.anIntArray2694!![i_16_] = i_11_ + 1
                        RenderNodeStatics.anIntArrayArray9723!![i_12_ + -1]!![1 + i_13_] = 6
                        i_16_ = 1 + i_16_ and 0xfff
                        ProjectileFactoryStatics.anIntArrayArray2900!![-1 + i_12_]!![1 + i_13_] = i_20_
                    }
                    if (i_12_ < 126 && i_13_ < 126 && RenderNodeStatics.anIntArrayArray9723!![i_12_ + 1]!![1 + i_13_] == 0 && (`is`[i_18_ - -1]!![i_19_ + 2] and 0x7e240000) == 0 && (`is`[i_18_ + 2]!![i_19_ - -2] and 0x78240000) == 0 && ((0x78e40000 and `is`[i_18_ + 2]!![1 + i_19_]) == 0)) {
                        GlGroundShaderPassStatics.anIntArray7397!![i_16_] = i_10_ - -1
                        CircleDrawer.anIntArray2694!![i_16_] = 1 + i_11_
                        i_16_ = 1 + i_16_ and 0xfff
                        RenderNodeStatics.anIntArrayArray9723!![1 + i_12_]!![i_13_ - -1] = 12
                        ProjectileFactoryStatics.anIntArrayArray2900!![1 + i_12_]!![1 + i_13_] = i_20_
                    }
                }
                HslAdjustTextureNodeStatics.anInt9388 = i_10_
                OverlayColorTable.anInt1753 = i_11_
                return false
            }
    
            @JvmStatic
            fun method2011(i: Byte) {
                anIntArray3347 = null
                if (i > -19) aCharArray3352 = null
                aCharArray3352 = null
            }
    
            fun method2013(`is`: ByteArray?, i: Byte) {
                anInt3357++
                val class348_sub49 = ByteBuffer(`is`)
                while (true) {
                    val i_23_ = class348_sub49.readUnsignedByte(255)
                    if (i_23_ == 0) break
                    if (i_23_ == 1) {
                        FogState.anIntArray1432 = IntArray(6)
                        val is_28_: IntArray = FogState.anIntArray1432!!
                        is_28_[0] = class348_sub49.readUnsignedShort(i + 842397832)
                        is_28_[1] = class348_sub49.readUnsignedShort(i + 842397832)
                        is_28_[2] = class348_sub49.readUnsignedShort(842397944)
                        is_28_[3] = class348_sub49.readUnsignedShort(842397944)
                        is_28_[4] = class348_sub49.readUnsignedShort(842397944)
                        is_28_[5] = class348_sub49.readUnsignedShort(842397944)
                    } else if (i_23_ == 4) {
                        val i_24_ = class348_sub49.readUnsignedByte(255)
                        TextureLoadExceptionStatics.anIntArray4603 = IntArray(i_24_)
                        var i_25_ = 0
                        while (i_24_ > i_25_) {
                            TextureLoadExceptionStatics.anIntArray4603!![i_25_] = class348_sub49.readUnsignedShort(842397944)
                            if (TextureLoadExceptionStatics.anIntArray4603!![i_25_] == 65535) TextureLoadExceptionStatics.anIntArray4603!![i_25_] = -1
                            i_25_++
                        }
                    } else if (i_23_ == 5) {
                        val i_26_ = class348_sub49.readUnsignedByte(255)
                        ParticleDetailOptionStateStatics.anIntArray6021 = IntArray(i_26_)
                        for (i_27_ in 0..<i_26_) {
                            ParticleDetailOptionStateStatics.anIntArray6021!![i_27_] = class348_sub49.readUnsignedShort(842397944)
                            if (ParticleDetailOptionStateStatics.anIntArray6021!![i_27_] == 65535) ParticleDetailOptionStateStatics.anIntArray6021!![i_27_] = -1
                        }
                    }
                }
            }
    
            init {
                for (i in 0..25) aCharArray3352!![i] = (65 + i).toChar()
                for (i in 26..51) aCharArray3352!![i] = (97 + i - 26).toChar()
                for (i in 52..61) aCharArray3352!![i] = (-52 + (i + 48)).toChar()
                aCharArray3352!![62] = '+'
                aCharArray3352!![63] = '/'
            }
}
