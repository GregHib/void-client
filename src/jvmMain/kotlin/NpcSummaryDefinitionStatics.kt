object NpcSummaryDefinitionStatics {
    var anInt1949: Int = 0
            var anInt1950: Int = 0
            @JvmField
            var aBoolean1952: Boolean = false
            var anInt1955: Int = 0
    
            fun method1165(i: Int) {
                CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.startBitAccess(i xor 0x79.inv())
                anInt1950++
                val i_0_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 8)
                if (i == 1) {
                    if (i_0_ < ModelDefinitionLoaderStatics.anInt2057) {
                        var i_1_ = i_0_
                        while (ModelDefinitionLoaderStatics.anInt2057 > i_1_) {
                            ProportionalScrollbarComponentStatics.anIntArray9932!![ParticleGeometryStatics.anInt4411++] = RgbColorPaletteStatics.anIntArray1233!![i_1_]
                            i_1_++
                        }
                    }
                    if (i_0_ > ModelDefinitionLoaderStatics.anInt2057) throw RuntimeException("gnpov1")
                    ModelDefinitionLoaderStatics.anInt2057 = 0
                    for (i_2_ in 0..<i_0_) {
                        val i_3_ = RgbColorPaletteStatics.anIntArray1233!![i_2_]
                        val npc = ((NpcEntityUpdater.aHashtable_3654!!.method3480(i_3_.toLong(), -6008) as NpcReference).aNpc_6859)!!
                        val i_4_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1)
                        if (i_4_ == 0) {
                            RgbColorPaletteStatics.anIntArray1233!![ModelDefinitionLoaderStatics.anInt2057++] = i_3_
                            npc.anInt10306 = NullOggStreamStatics.anInt9041
                        } else {
                            val i_5_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 2)
                            if (i_5_ == 0) {
                                RgbColorPaletteStatics.anIntArray1233!![ModelDefinitionLoaderStatics.anInt2057++] = i_3_
                                npc.anInt10306 = NullOggStreamStatics.anInt9041
                                MinimapRectClipper.anIntArray224!![AbstractCameraTransformStatics.anInt1597++] = i_3_
                            } else if (i_5_ == 1) {
                                RgbColorPaletteStatics.anIntArray1233!![ModelDefinitionLoaderStatics.anInt2057++] = i_3_
                                npc.anInt10306 = NullOggStreamStatics.anInt9041
                                val i_6_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 3)
                                npc.method2443(i_6_, 1, -10)
                                val i_7_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1)
                                if (i_7_ == 1) MinimapRectClipper.anIntArray224!![AbstractCameraTransformStatics.anInt1597++] = i_3_
                            } else if (i_5_ == 2) {
                                RgbColorPaletteStatics.anIntArray1233!![ModelDefinitionLoaderStatics.anInt2057++] = i_3_
                                npc.anInt10306 = NullOggStreamStatics.anInt9041
                                if (CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1) == 1) {
                                    val i_9_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 3)
                                    npc.method2443(i_9_, 2, -10)
                                    val i_10_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 3)
                                    npc.method2443(i_10_, 2, -10)
                                } else {
                                    val i_8_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 3)
                                    npc.method2443(i_8_, 0, i + -11)
                                }
                                val i_11_ = CircleRasterizerStatics.aClass348_Sub49_Sub2_3813!!.readBits((-24).toByte(), 1)
                                if (i_11_ == 1) MinimapRectClipper.anIntArray224!![AbstractCameraTransformStatics.anInt1597++] = i_3_
                            } else if (i_5_ == 3) ProportionalScrollbarComponentStatics.anIntArray9932!![ParticleGeometryStatics.anInt4411++] = i_3_
                        }
                    }
                }
            }
    
            @JvmStatic
            fun method1166(i: Int, i_12_: Int): Int {
                return i and i_12_
            }
    
            @JvmStatic
            fun method1167(i: Int, i_13_: Byte): Boolean {
                anInt1955++
                if (i_13_ >= -45) anInt1949 = 88
                return i == 0 || i == 1 || i == 2
            }
}
