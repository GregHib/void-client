object FixedFunctionWaterPassStatics {
    @JvmField
            var anInt7349: Int = 0
            @JvmField
            var anInt7351: Int = 0
            @JvmField
            var anInt7352: Int = 0
            @JvmField
            var anInt7354: Int = 0
            @JvmField
            var aShort7355: Short = 1
            @JvmField
            var anInt7356: Int = 0
            @JvmField
            var anInt7357: Int = 0
            @JvmField
            var anInt7358: Int = 0
            @JvmField
            var anInt7359: Int = 0
            @JvmField
            var anInt7360: Int = 0
            @JvmField
            var aNamedIdRecord_7361: NamedIdRecord? = NamedIdRecord("WTRC", 1)
            @JvmField
            var aJs5Archive_7362: Js5Archive? = null
            @JvmField
            var aIntRange_7363: IntRange?
            @JvmField
            var anInt7364: Int = 0
            var anInt7365: Int = 0
    
            @JvmStatic
            fun method3546(`is`: ByteArray, i: Int, i_0_: Int, i_1_: Int): String {
                anInt7349++
                val cs = CharArray(i_0_)
                var i_2_ = 0
                for (i_3_ in i..<i_0_) {
                    var i_4_ = 0xff and `is`[i_3_ + i_1_].toInt()
                    if (i_4_ != 0) {
                        if (i_4_ >= 128 && i_4_ < 160) {
                            var i_5_ = MapSceneRenderer.aCharArray625!![i_4_ - 128].code
                            if (i_5_ == 0) i_5_ = 63
                            i_4_ = i_5_
                        }
                        cs[i_2_++] = i_4_.toChar()
                    }
                }
                return String(cs, 0, i_2_)
            }
    
            @JvmStatic
            fun method3547(i: Int, i_6_: Int): Int {
                if (WidgetRedrawRegionStatics.anIntArrayArray4253 != null) return WidgetRedrawRegionStatics.anIntArrayArray4253!![i]!![i_6_] and 0xffffff
                return 0
            }
    
            @JvmStatic
            fun method3548(i: Int, npc: Npc?, `is`: IntArray?, is_7_: IntArray?, is_8_: IntArray?) {
                try {
                    if (i != -7387) method3550(10.toByte())
                    var i_9_ = 0
                    while (is_7_!!.size > i_9_) {
                        val i_10_ = is_7_[i_9_]
                        var i_11_ = `is`!![i_9_]
                        val i_12_ = is_8_!![i_9_]
                        var i_13_ = 0
                        while (i_11_ != 0 && ((npc!!.aLoadProgressCountersArray10308)!!.size > i_13_)) {
                            if ((0x1 and i_11_) != 0) {
                                if (i_10_ != -1) {
                                    val class17 = ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(i_10_, i + 7394)
                                    val i_14_ = class17.anInt248
                                    var class182 = (npc.aLoadProgressCountersArray10308!![i_13_])
                                    if (class182 != null) {
                                        if (i_10_ != class182.anInt2454) {
                                            if (ParticleEmitterNodeStatics.aWidgetCache_191!!.method835(class182.anInt2454, 7).anInt239 <= class17.anInt239) {
                                                npc.aLoadProgressCountersArray10308!![i_13_] = null
                                                class182 = npc.aLoadProgressCountersArray10308!![i_13_]
                                            }
                                        } else if (i_14_ == 0) {
                                            npc.aLoadProgressCountersArray10308!![i_13_] = null
                                            class182 = npc.aLoadProgressCountersArray10308!![i_13_]
                                        } else if (i_14_ == 1) {
                                            class182.anInt2448 = i_12_
                                            class182.anInt2456 = 0
                                            class182.anInt2455 = 1
                                            class182.anInt2451 = 0
                                            class182.anInt2445 = 0
                                            if (!npc.aBoolean10309) TypedRecordTableStatics.method2178(npc, 0, class17, -75)
                                        } else if (i_14_ == 2) class182.anInt2445 = 0
                                    }
                                    if (class182 == null) {
                                        npc.aLoadProgressCountersArray10308!![i_13_] = LoadProgressCounters()
                                        class182 = npc.aLoadProgressCountersArray10308!![i_13_]!!
                                        class182.anInt2455 = 1
                                        class182.anInt2454 = i_10_
                                        class182.anInt2456 = 0
                                        class182.anInt2445 = 0
                                        class182.anInt2451 = 0
                                        class182.anInt2448 = i_12_
                                        if (!npc.aBoolean10309) TypedRecordTableStatics.method2178(npc, 0, class17, -19)
                                    }
                                } else npc.aLoadProgressCountersArray10308!![i_13_] = null
                            }
                            i_11_ = i_11_ ushr 1
                            i_13_++
                        }
                        i_9_++
                    }
                    anInt7359++
                } catch (runtimeexception: RuntimeException) {
                    throw SoundBankPatchStatics.method2929(runtimeexception, ("kl.E(" + i + ',' + (if (npc != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ',' + (if (is_7_ != null) "{...}" else "null") + ',' + (if (is_8_ != null) "{...}" else "null") + ')'))
                }
            }
    
            @JvmStatic
            fun method3549(i: Int, i_15_: Byte): Boolean {
                anInt7351++
                val i_16_ = -72 / ((37 - i_15_) / 48)
                if (i == 25 || i == 20 || i == 44 || i == 46 || i == 60) return true
                return i == 30 || i == 1008
            }
    
            @JvmStatic
            fun method3550(i: Byte) {
                aIntRange_7363 = null
                aJs5Archive_7362 = null
                val i_20_ = -90 % ((-54 - i) / 60)
                aNamedIdRecord_7361 = null
            }
    
            init {
                aIntRange_7363 = IntRange(103, 8)
            }
}
