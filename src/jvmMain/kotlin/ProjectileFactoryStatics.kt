import NpcAnimationResolverStatics.method214

object ProjectileFactoryStatics {
    var aScreenAnchorAlignment_2893: ScreenAnchorAlignment?
            var anInt2894: Int = 0
            var aBoolean2895: Boolean = false
            var anInt2897: Int = 0
            var anInt2898: Int = 0
            @JvmField
            var anIntArray2899: IntArray?
            @JvmField
            var anIntArrayArray2900: Array<IntArray?>?
    
            @JvmStatic
            fun method1612(i: Byte) {
                anIntArray2899 = null
                if (i.toInt() != -9) method1614(-47, null, -126, -99, 117, null, null, 90)
                anIntArrayArray2900 = null
                aScreenAnchorAlignment_2893 = null
            }
    
            @JvmStatic
            fun method1613(bool: Boolean, i: Int, i_0_: Int): Boolean {
                if (bool != false) method1612((-104).toByte())
                anInt2897++
                return (i_0_ and 0x22) != 0
            }
    
            @JvmStatic
            fun method1614(i: Int, npc: Npc?, i_2_: Int, i_3_: Int, i_4_: Int, player: Player?, npcConfig: NpcConfig?, i_5_: Int) {
                try {
                    anInt2898++
                    if (i != 979190089) aBoolean2895 = false
                    val class348_sub9 = CharacterRenderState()
                    class348_sub9.anInt6678 = i_4_ shl 9
                    class348_sub9.anInt6693 = i_2_
                    class348_sub9.anInt6689 = i_3_ shl 9
                    if (npcConfig == null) {
                        if (npc != null) {
                            class348_sub9.aNpc_6691 = npc
                            var class79 = (npc.aNpcType_10505)
                            if (class79!!.anIntArray1377 != null) {
                                class348_sub9.aBoolean6684 = true
                                class79 = class79.method794((ProjectedGroundDecorStatics.aVarpStore_10209!!), i xor 0x3a5d4149.inv())
                            }
                            if (class79 != null) {
                                class348_sub9.anInt6698 = (i_4_ + class79.anInt1399 shl 9)
                                class348_sub9.anInt6687 = (i_3_ - -class79.anInt1399 shl 9)
                                class348_sub9.anInt6685 = method214(npc, -1)
                                class348_sub9.anInt6696 = class79.anInt1340
                                class348_sub9.anInt6694 = class79.anInt1392 shl 9
                                class348_sub9.anInt6677 = class79.anInt1356
                                class348_sub9.anInt6681 = class79.anInt1363
                                class348_sub9.aBoolean6674 = class79.aBoolean1370
                            }
                            ClientStatics.aNodeDeque_5185!!.method1999(class348_sub9, i + -979210269)
                        } else if (player != null) {
                            class348_sub9.aPlayer_6679 = player
                            class348_sub9.anInt6698 = (player.method2436(74.toByte()) + i_4_) shl 9
                            class348_sub9.anInt6687 = (player.method2436(86.toByte()) + i_3_) shl 9
                            class348_sub9.anInt6685 = CacheIndexManagerStatics.method2357(-1, player)
                            class348_sub9.anInt6681 = 256
                            class348_sub9.anInt6694 = (player.anInt10553 shl 9)
                            class348_sub9.anInt6677 = player.anInt10558
                            class348_sub9.anInt6696 = 256
                            class348_sub9.aBoolean6674 = player.aBoolean10517
                            CompletedResourceRequestStatics.aHashtable_10465!!.method3483(65.toByte(), player.anInt10290.toLong(), class348_sub9)
                        }
                    } else {
                        class348_sub9.aNpcConfig_6695 = npcConfig
                        var i_6_ = npcConfig.anInt961
                        var i_7_ = npcConfig.anInt926
                        if (i_5_ == 1 || i_5_ == 3) {
                            i_6_ = npcConfig.anInt926
                            i_7_ = npcConfig.anInt961
                        }
                        class348_sub9.anInt6687 = i_7_ + i_3_ shl 9
                        class348_sub9.anInt6680 = npcConfig.anInt962
                        class348_sub9.anInt6685 = npcConfig.anInt887
                        class348_sub9.anInt6681 = npcConfig.anInt916
                        class348_sub9.anIntArray6697 = npcConfig.anIntArray904
                        class348_sub9.anInt6696 = npcConfig.anInt878
                        class348_sub9.aBoolean6699 = npcConfig.aBoolean903
                        class348_sub9.anInt6694 = npcConfig.anInt889 shl 9
                        class348_sub9.anInt6668 = npcConfig.anInt937
                        class348_sub9.anInt6698 = i_6_ + i_4_ shl 9
                        class348_sub9.anInt6677 = npcConfig.anInt936
                        class348_sub9.aBoolean6674 = npcConfig.aBoolean888
                        if (npcConfig.anIntArray945 != null) {
                            class348_sub9.aBoolean6684 = true
                            class348_sub9.method2781(21.toByte())
                        }
                        if (class348_sub9.anIntArray6697 != null) class348_sub9.anInt6670 = (class348_sub9.anInt6680 - -((-class348_sub9.anInt6680 + class348_sub9.anInt6668).toDouble() * Math.random()).toInt())
                        MapSceneIconDefStatics.aNodeDeque_2859!!.method1999(class348_sub9, -20180)
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("ad.B(" + i + ',' + (if (npc != null) "{...}" else "null") + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + (if (player != null) "{...}" else "null") + ',' + (if (npcConfig != null) "{...}" else "null") + ',' + i_5_ + ')'))
                }
            }
    
            init {
                aScreenAnchorAlignment_2893 = ScreenAnchorAlignment()
                anIntArray2899 = IntArray(13)
                anIntArrayArray2900 = Array<IntArray?>(128) { IntArray(128) }
            }
}
