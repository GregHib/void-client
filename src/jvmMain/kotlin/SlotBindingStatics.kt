object SlotBindingStatics {
    var anInt3393: Int = 0
    var anInt3395: Int = 0

    var anInt3428: Int = -1

    @JvmStatic
    fun method2026(i: Int) {
        SlotBinding.aSlotBinding_3421 = null
        SlotBinding.aSlotBinding_3413 = null
        SlotBinding.aSlotBinding_3404 = null
        SlotBinding.aSlotBinding_3405 = null
        SlotBinding.aSlotBinding_3403 = null
        SlotBinding.aSlotBinding_3411 = null
        if (i == 23377) {
            SlotBinding.aSlotBinding_3410 = null
            SlotBinding.aSlotBinding_3420 = null
            SlotBinding.aSlotBinding_3414 = null
            SlotBinding.aSlotBinding_3409 = null
            SlotBinding.aSlotBinding_3418 = null
            SlotBinding.aSlotBinding_3426 = null
            SlotBinding.aSlotBinding_3412 = null
            SlotBinding.aSlotBinding_3423 = null
            SlotBinding.aSlotBinding_3424 = null
            SlotBinding.aSlotBinding_3408 = null
            SlotBinding.aSlotBinding_3416 = null
            SlotBinding.aSlotBinding_3407 = null
            SlotBinding.aSlotBinding_3406 = null
            SlotBinding.aSlotBinding_3419 = null
            SlotBinding.aSlotBinding_3401 = null
            SlotBinding.aSlotBinding_3425 = null
            SlotBinding.aSlotBinding_3402 = null
            SlotBinding.aSlotBinding_3415 = null
            SlotBinding.aSlotBinding_3396 = null
            InboundPacketHeader.aInboundPacketHeader_3427 = null
            SlotBinding.aSlotBinding_3422 = null
            SlotBinding.aSlotBinding_3417 = null
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
            throw TextureLoadException.method2929(runtimeexception, ("up.C(" + i + ',' + (if (npcConfig != null) "{...}" else "null") + ',' + i_0_ + ',' + (if (var_renderer != null) "{...}" else "null") + ',' + i_1_ + ',' + i_2_ + ')'))
        }
    }

    @JvmStatic
    fun method2029(i: Int): Array<SlotBinding?>? {
        if (i <= 99) return null
        anInt3393++
        return (arrayOf<SlotBinding?>(
            SlotBinding.aSlotBinding_3396,
            SlotBinding.aSlotBinding_3401,
            SlotBinding.aSlotBinding_3402,
            SlotBinding.aSlotBinding_3403,
            SlotBinding.aSlotBinding_3404,
            SlotBinding.aSlotBinding_3405,
            SlotBinding.aSlotBinding_3406,
            SlotBinding.aSlotBinding_3407,
            SlotBinding.aSlotBinding_3408,
            SlotBinding.aSlotBinding_3409,
            SlotBinding.aSlotBinding_3410,
            SlotBinding.aSlotBinding_3411,
            SlotBinding.aSlotBinding_3412,
            SlotBinding.aSlotBinding_3413,
            SlotBinding.aSlotBinding_3414,
            SlotBinding.aSlotBinding_3415,
            SlotBinding.aSlotBinding_3416,
            SlotBinding.aSlotBinding_3417,
            SlotBinding.aSlotBinding_3418,
            SlotBinding.aSlotBinding_3419,
            SlotBinding.aSlotBinding_3420,
            SlotBinding.aSlotBinding_3421,
            SlotBinding.aSlotBinding_3422,
            SlotBinding.aSlotBinding_3423,
            SlotBinding.aSlotBinding_3424,
            SlotBinding.aSlotBinding_3425,
            SlotBinding.aSlotBinding_3426
        ))
    }
}
