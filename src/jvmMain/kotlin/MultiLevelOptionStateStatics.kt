object MultiLevelOptionStateStatics {
    @JvmField
            var anInt6144: Int = 0
            @JvmField
            var anInt6145: Int = 0
            @JvmField
            var anInt6146: Int = 0
            @JvmField
            var aBoolean6147: Boolean = false
            @JvmField
            var anInt6148: Int = 0
            @JvmField
            var anInt6149: Int = 0
            @JvmField
            var anInt6150: Int = 0
            @JvmField
            var anInt6151: Int = 0
            @JvmField
            var anInt6152: Int = 0
            @JvmField
            var anInt6153: Int = 0
    
            @JvmStatic
            fun method1849(c: Char, i: Int): Boolean {
                anInt6149++
                if (Character.isISOControl(c)) return false
                if (NpcStatics.method2446(c, 105.toByte())) return true
                val cs = MapSceneDefLoaderStatics.aCharArray2488!!
                var i_2_ = 0
                while (cs.size > i_2_) {
                    val i_3_ = cs[i_2_].code
                    if (c.code == i_3_) return true
                    i_2_++
                }
                val i_4_ = -127 / ((i - 44) / 45)
                val cs_5_ = ParserSpecialCharsHolder.aCharArray1903!!
                var i_6_ = 0
                while (cs_5_.size > i_6_) {
                    val i_7_ = cs_5_[i_6_].code
                    if (i_7_ == c.code) return true
                    i_6_++
                }
                return false
            }
    
            @JvmStatic
            fun method1850(i: Int, i_8_: Int): Int {
                anInt6144++
                val i_9_ = 101 % ((-20 - i_8_) / 37)
                return i ushr 8
            }
    
            @JvmStatic
            fun method1851(i: Byte) {
                anInt6152++
                for (i_11_ in 0..4) SpotAnimDefinitionStatics.aBooleanArray2374!![i_11_] = false
                TextureAtlasStateStatics.anInt4424 = CompositeRgbNoiseTextureStatics.anInt8685
                DataHolderStatics.anInt3662 = MinimapAreaMarkerNodeStatics.anInt9701
                SpriteComponentStatics.anInt8368 = ParticleSystemRendererStatics.anInt3855
                FloatBufferStatics.anInt9751 = GlGroundShaderPassStatics.anInt7396
                SequencedWallEntityStatics.anInt10163 = -1
                NativeLibraryState.anInt167 = SequencedWallEntityStatics.anInt10163
                SequencedGroundDecorStatics.anInt10047 = GlslMaterialPassStatics.anInt6246
                val i_12_ = -99 % ((i - 11) / 56)
                BloomGraphicsOptionStateStatics.anInt5973 = 0
                CameraConfigDefinitionStatics.anInt3253 = WorldMapElementStatics.anInt4638
                GlGroundShaderPassStatics.anInt7403 = 0
                WeaveTextureNodeStatics.anInt9282 = 5
                NativeShaderProgramStatics.anInt9775 = -1
                MapArchiveSourceStatics.anInt4803 = -1
            }
}
