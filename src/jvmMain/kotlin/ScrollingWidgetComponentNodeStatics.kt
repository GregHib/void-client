import FontStatics.method2570

object ScrollingWidgetComponentNodeStatics {
    @JvmField
            var aParticleEffectCache_8378: ParticleEffectCache? = null
            @JvmField
            var anInt8379: Int = 0
            @JvmField
            var anInt8380: Int = 0
            @JvmField
            var anInt8381: Int = 0
            @JvmField
            var anInt8382: Int = 0
            var aIntRange_8384: IntRange? = IntRange(18, 0)
            var aIntRange_8385: IntRange?
            @JvmField
            var aBoolean8386: Boolean = false
            @JvmField
            var anInt8387: Int = 0
            @JvmField
            var anInt8388: Int
    
            /*synthetic*/
            var aClass8389: Class<*>? = null
    
            @JvmStatic
            fun method1118(bool: Boolean, bool_2_: Boolean, class348_sub41: RegionSceneShifter, i: Int) {
                anInt8382++
                val i_3_ = class348_sub41.anInt7050
                val i_4_ = class348_sub41.aLong4291.toInt()
                if (i == 2533) {
                    class348_sub41.method2715(35.toByte())
                    if (bool) GlTextureBaseStatics.method235(i_3_, (-116).toByte())
                    ItemDefinitionLoaderStatics.method1288(i xor 0x9e2.inv(), i_3_)
                    val class46 = method2570(1512932720, i_4_)
                    if (class46 != null) ConfigFlagUtilStatics.method1916(-9343, class46)
                    TextureMaterialGroupStatics.method3270(119.toByte())
                    if (!bool_2_ && RenderNodeStatics.anInt9721 != -1) BloomGraphicsOptionStateStatics.method1775((-8).toByte(), RenderNodeStatics.anInt9721, 1)
                    val mapElementLookup = MapElementLookup(MinimapSpriteRendererStatics.aHashtable_4915!!)
                    var class348_sub41_5_ = mapElementLookup.method2644(123.toByte()) as? RegionSceneShifter?
                    while (class348_sub41_5_ != null) {
                        if (!class348_sub41_5_.method2712(4.toByte())) {
                            class348_sub41_5_ = mapElementLookup.method2644(123.toByte()) as? RegionSceneShifter?
                            if (class348_sub41_5_ == null) break
                        }
                        if (class348_sub41_5_.anInt7053 == 3) {
                            val i_6_ = class348_sub41_5_.aLong4291.toInt()
                            if (i_3_ == i_6_ ushr 16) method1118(true, bool_2_, class348_sub41_5_, 2533)
                        }
                        class348_sub41_5_ = mapElementLookup.method2646(99.toByte()) as? RegionSceneShifter?
                    }
                }
            }
    
            fun method1119(bool: Boolean) {
                anInt8381++
                try {
                    try {
                        val runtime = Runtime.getRuntime()
                        val integer = runtime.availableProcessors()
                        TextureMapImageNodeStatics.anInt9372 = integer
                    } catch (throwable: Throwable) {
                        /* empty */
                    }
                } catch (exception: Exception) {
                    /* empty */
                }
            }
    
            @JvmStatic
            fun method1120(i: Int) {
                aIntRange_8384 = null
                aParticleEffectCache_8378 = null
                aIntRange_8385 = null
                if (i != 1) method1119(true)
            }
    
            init {
                aIntRange_8385 = IntRange(10, -2)
                anInt8388 = 0
            }
}
