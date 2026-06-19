object SlotBindingStatics {
    var anInt3390: Int = 0
            var anInt3391: Int = 0
            var anInt3393: Int = 0
            var anInt3395: Int = 0
            var aSlotBinding_3396: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var anInt3397: Int = 0
            var anInt3399: Int = 0
            var anInt3400: Int = 0
            var aSlotBinding_3401: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1199)
            var aSlotBinding_3402: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1199)
            var aSlotBinding_3403: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1199)
            var aSlotBinding_3404: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1199)
            var aSlotBinding_3405: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1199)
            var aSlotBinding_3406: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1199)
            var aSlotBinding_3407: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1199)
            var aSlotBinding_3408: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3409: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3410: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3411: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3412: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3413: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3414: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3415: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3416: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3417: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3418: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3419: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3420: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3421: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3422: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1197)
            var aSlotBinding_3423: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3424: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3425: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1195)
            var aSlotBinding_3426: SlotBinding? = SlotBinding(CollisionFlagQueryStatics.aCollisionFlagQuery_1198)
            var aIntRange_3427: IntRange? = IntRange(93, -2)
            @JvmField
            var anInt3428: Int = -1
    
            @JvmStatic
            fun method2026(i: Int) {
                aSlotBinding_3421 = null
                aSlotBinding_3413 = null
                aSlotBinding_3404 = null
                aSlotBinding_3405 = null
                aSlotBinding_3403 = null
                aSlotBinding_3411 = null
                if (i == 23377) {
                    aSlotBinding_3410 = null
                    aSlotBinding_3420 = null
                    aSlotBinding_3414 = null
                    aSlotBinding_3409 = null
                    aSlotBinding_3418 = null
                    aSlotBinding_3426 = null
                    aSlotBinding_3412 = null
                    aSlotBinding_3423 = null
                    aSlotBinding_3424 = null
                    aSlotBinding_3408 = null
                    aSlotBinding_3416 = null
                    aSlotBinding_3407 = null
                    aSlotBinding_3406 = null
                    aSlotBinding_3419 = null
                    aSlotBinding_3401 = null
                    aSlotBinding_3425 = null
                    aSlotBinding_3402 = null
                    aSlotBinding_3415 = null
                    aSlotBinding_3396 = null
                    aIntRange_3427 = null
                    aSlotBinding_3422 = null
                    aSlotBinding_3417 = null
                }
            }
    
            @JvmStatic
            fun method2028(i: Int, npcConfig: NpcConfig?, i_0_: Int, var_renderer: Renderer?, i_1_: Int, i_2_: Int) {
                var i_1_ = i_1_
                try {
                    anInt3395++
                    val class218 = ModelOrSpriteHolderStatics.aTextureDefinitionLoader_117!!.method1173(31.toByte(), npcConfig!!.anInt875)
                    if (class218!!.anInt2853 != -1) {
                        if (npcConfig.aBoolean912) {
                            i_1_ += npcConfig.anInt923
                            i_1_ = i_1_ and 0x3
                        } else i_1_ = 0
                        val class105 = class218.method1596(i_1_, npcConfig.aBoolean925, 82, var_renderer!!)
                        if (class105 != null) {
                            var i_3_ = npcConfig.anInt961
                            var i_4_ = npcConfig.anInt926
                            val i_5_ = 60 % ((52 - i_2_) / 56)
                            if ((0x1 and i_1_) == 1) {
                                i_3_ = npcConfig.anInt926
                                i_4_ = npcConfig.anInt961
                            }
                            var i_6_ = class105.method966()
                            var i_7_ = class105.method980()
                            if (class218.aBoolean2854) {
                                i_7_ = i_4_ * 4
                                i_6_ = i_3_ * 4
                            }
                            if (class218.anInt2856 == 0) class105.method973(i, -((i_4_ + -1) * 4) + i_0_, i_6_, i_7_)
                            else class105.method970(i, i_0_ - 4 * (-1 + i_4_), i_6_, i_7_, 0, (class218.anInt2856 or 0xffffff.inv()), 1)
                        }
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("up.C(" + i + ',' + (if (npcConfig != null) "{...}" else "null") + ',' + i_0_ + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ')'))
                }
            }
    
            @JvmStatic
            fun method2029(i: Int): Array<SlotBinding?>? {
                if (i <= 99) return null
                anInt3393++
                return (arrayOf<SlotBinding?>(
                    aSlotBinding_3396,
                    aSlotBinding_3401,
                    aSlotBinding_3402,
                    aSlotBinding_3403,
                    aSlotBinding_3404,
                    aSlotBinding_3405,
                    aSlotBinding_3406,
                    aSlotBinding_3407,
                    aSlotBinding_3408,
                    aSlotBinding_3409,
                    aSlotBinding_3410,
                    aSlotBinding_3411,
                    aSlotBinding_3412,
                    aSlotBinding_3413,
                    aSlotBinding_3414,
                    aSlotBinding_3415,
                    aSlotBinding_3416,
                    aSlotBinding_3417,
                    aSlotBinding_3418,
                    aSlotBinding_3419,
                    aSlotBinding_3420,
                    aSlotBinding_3421,
                    aSlotBinding_3422,
                    aSlotBinding_3423,
                    aSlotBinding_3424,
                    aSlotBinding_3425,
                    aSlotBinding_3426
                ))
            }
}
