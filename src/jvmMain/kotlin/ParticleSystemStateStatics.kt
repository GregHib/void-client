object ParticleSystemStateStatics {
    var anInt2193: Int = 0
            var anInt2194: Int = 0
            var aIntRange_2196: IntRange? = IntRange(111, -1)
            var anInt2199: Int = 0
            var anInt2200: Int = 0
            var aFloat2203: Float = 0f
            @JvmField
            var anInt2204: Int = 0
            var anInt2206: Int = 0
            @JvmField
            var aRenderConfigFactory_2207: RenderConfigFactory? = RenderConfigFactory()
            var aJs5Archive_2208: Js5Archive? = null
            @JvmStatic
            fun method1293(i: Int) {
                aIntRange_2196 = null
                aJs5Archive_2208 = null
                aRenderConfigFactory_2207 = null
            }
    
            @JvmStatic
            fun method1294(i: Byte, `is`: ByteArray?): Boolean {
                anInt2199++
                val class348_sub49 = ByteBuffer(`is`)
                if (i > -98) method1294(73.toByte(), null)
                val i_0_ = class348_sub49.readUnsignedByte(255)
                if (i_0_ != 2) return false
                val bool = class348_sub49.readUnsignedByte(255) == 1
                if (bool) CompositeRgbNoiseTextureStatics.method569((-123).toByte(), class348_sub49)
                ChatScriptListNodeStatics.method3188((-67).toByte(), class348_sub49)
                return true
            }
    
            @JvmStatic
            fun method1295(class318_sub1s: Array<SceneEntity?>, i: Int, i_1_: Int) {
                if (i < i_1_) {
                    val i_2_ = (i + i_1_) / 2
                    var i_3_ = i
                    val class318_sub1 = class318_sub1s[i_2_]!!
                    class318_sub1s[i_2_] = class318_sub1s[i_1_]
                    class318_sub1s[i_1_] = class318_sub1
                    val i_4_ = class318_sub1.anInt6389
                    for (i_5_ in i..<i_1_) {
                        if (class318_sub1s[i_5_]!!.anInt6389 < i_4_ + (i_5_ and 0x1)) {
                            val class318_sub1_6_: SceneEntity? = class318_sub1s[i_5_]
                            class318_sub1s[i_5_] = class318_sub1s[i_3_]
                            class318_sub1s[i_3_++] = class318_sub1_6_!!
                        }
                    }
                    class318_sub1s[i_1_] = class318_sub1s[i_3_]
                    class318_sub1s[i_3_] = class318_sub1
                    method1295(class318_sub1s, i, i_3_ - 1)
                    method1295(class318_sub1s, i_3_ + 1, i_1_)
                }
            }
    
            @JvmStatic
            fun method1296(bool: Boolean): Boolean {
                if (bool != true) method1297(88.toByte(), null, null, null, null)
                anInt2200++
                if (SpriteDefinitionStatics.anInt7068 != 0) return true
                return NodeDequeHolderStatics.aClass348_Sub16_Sub3_1564!!.method2860(120)
            }
    
            fun method1297(i: Byte, player: Player?, `is`: IntArray?, is_7_: IntArray?, is_8_: IntArray?) {
                try {
                    anInt2206++
                    if (i > -96) aFloat2203 = 0.6824298f
                    var i_9_ = 0
                    while (is_7_!!.size > i_9_) {
                        val i_10_ = is_7_[i_9_]
                        var i_11_ = `is`!![i_9_]
                        val i_12_ = is_8_!![i_9_]
                        var i_13_ = 0
                        while (i_11_ != 0 && i_13_ < (player!!.aLoadProgressCountersArray10308)!!.size) {
                            if ((i_11_ and 0x1) != 0) {
                                if (i_10_ != -1) {
                                    val class17 = ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(i_10_, 7)
                                    val i_14_ = class17.anInt248
                                    var class182 = (player.aLoadProgressCountersArray10308!![i_13_])
                                    if (class182 != null) {
                                        if (class182.anInt2454 == i_10_) {
                                            if (i_14_ == 0) {
                                                player.aLoadProgressCountersArray10308!![i_13_] = null
                                                class182 = player.aLoadProgressCountersArray10308!![i_13_]
                                            } else if (i_14_ == 1) {
                                                class182.anInt2448 = i_12_
                                                class182.anInt2455 = 1
                                                class182.anInt2456 = 0
                                                class182.anInt2451 = 0
                                                class182.anInt2445 = 0
                                                if (!player.aBoolean10309) TypedRecordTableStatics.method2178(player, 0, class17, -54)
                                            } else if (i_14_ == 2) class182.anInt2445 = 0
                                        } else if (class17.anInt239 >= ParticleEmitterNodeStatics.aWidgetCache_191!!.method835((class182.anInt2454), 7).anInt239) {
                                            player.aLoadProgressCountersArray10308!![i_13_] = null
                                            class182 = player.aLoadProgressCountersArray10308!![i_13_]
                                        }
                                    }
                                    if (class182 == null) {
                                        player.aLoadProgressCountersArray10308!![i_13_] = LoadProgressCounters()
                                        class182 = player.aLoadProgressCountersArray10308!![i_13_]
                                        class182!!.anInt2445 = 0
                                        class182.anInt2455 = 1
                                        class182.anInt2448 = i_12_
                                        class182.anInt2456 = 0
                                        class182.anInt2454 = i_10_
                                        class182.anInt2451 = 0
                                        if (!player.aBoolean10309) TypedRecordTableStatics.method2178(player, 0, class17, -123)
                                    }
                                } else player.aLoadProgressCountersArray10308!![i_13_] = null
                            }
                            i_13_++
                            i_11_ = i_11_ ushr 1
                        }
                        i_9_++
                    }
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("pga.G(" + i + ',' + (if (player != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_7_ != null) "{...}" else "null") + ',' + (if (is_8_ != null) "{...}" else "null") + ')'))
                }
            }
}
