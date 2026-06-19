object RangedGraphicsOptionStateStatics {
    @JvmField
            var anInt5935: Int = 0
            @JvmField
            var anInt5936: Int = 0
            @JvmField
            var anInt5937: Int = 0
            @JvmField
            var aFontMetaRef_5938: FontMetaRef? = FontMetaRef(0, 0)
            @JvmField
            var anInt5939: Int = 0
            @JvmField
            var anInt5940: Int = 0
            @JvmField
            var anInt5941: Int = 0
            @JvmField
            var anInt5942: Int = 0
            @JvmField
            var anInt5943: Int = 1337
            @JvmField
            var anInt5944: Int = 0
            @JvmField
            var aFloat5945: Float = 0f
            @JvmField
            var anInt5946: Int = 0
            @JvmField
            var anInt5947: Int = 0
            @JvmField
            var anInt5948: Int = 0
    
            fun method1760(i: Int, i_0_: Int, bool: Boolean, i_1_: Int, i_2_: Byte, i_3_: Int, i_4_: Int, i_5_: Int) {
                if (i_2_ > -85) method1762(-14, 70, 13, -100)
                anInt5940++
                if ((if (bool) IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7215!!.method1838(-32350) else IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub26_7272!!.method1838(-32350)) != 0 && i_3_ != 0 && HintArrowOrMessageStatics.anInt2021 < 50 && i != -1) GlTextureCubeMapStatics.aParticleEmitterNodeArray8531s!![HintArrowOrMessageStatics.anInt2021++] = ParticleEmitterNode(if (!bool) 2.toByte() else 3.toByte(), i, i_3_, i_5_, i_0_, i_1_, i_4_, null)
            }
    
            @JvmStatic
            fun method1761(i: Int) {
                anInt5935++
                OutgoingPacketNodeStatics.method3324(FacingDirectionNodeStatics.aRenderer6654, 105.toByte(), GlGroundShaderPassStatics.anInt7396.toLong())
                if (i != 85) anInt5943 = -99
                if (RenderNodeStatics.anInt9721 != -1) ActiveMapRegion.method769(RenderNodeStatics.anInt9721, 118.toByte())
                var i_6_ = 0
                while (TerrainShadowBuilderGl3Statics.anInt7008 > i_6_) {
                    if (GzipDecompressorStatics.aBooleanArray2076!![i_6_]) LocDefinitionCacheStatics.aBooleanArray3438!![i_6_] = true
                    SizeBoundedSoftCacheStatics.aBooleanArray2326!![i_6_] = GzipDecompressorStatics.aBooleanArray2076!![i_6_]
                    GzipDecompressorStatics.aBooleanArray2076!![i_6_] = false
                    i_6_++
                }
                DirectionPathStatics.anInt1064 = GlGroundShaderPassStatics.anInt7396
                if (RenderNodeStatics.anInt9721 != -1) {
                    TerrainShadowBuilderGl3Statics.anInt7008 = 0
                    SceneNodeDequeStatics.method842(false)
                }
                FacingDirectionNodeStatics.aRenderer6654!!.la()
                SpriteRenderEntryStatics.method3281(77.toByte(), FacingDirectionNodeStatics.aRenderer6654!!)
                var i_7_ = ScriptCompilerThreadStatics.method1053(3112)
                if (i_7_ == -1) i_7_ = Tooltip.anInt4458
                if (i_7_ == -1) i_7_ = StreamingResourceRequestStatics.anInt10447
                CacheArchiveIndexLoaderStatics.method338(0, i_7_)
                DisplaySettingsConfigStatics.anInt7267 = 0
            }
    
            @JvmStatic
            fun method1762(i: Int, i_10_: Int, i_11_: Int, i_12_: Int): Int {
                val i_13_ = 56 / ((i - 74) / 43)
                anInt5947++
                if ((0x8 and AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![i_10_]!![i_12_]!![i_11_].toInt()) != 0) return 0
                if (i_10_ > 0 && ((0x2 and AnimationFrameDefinitionStatics.aByteArrayArrayArray6962!![1]!![i_12_]!![i_11_].toInt()) != 0)) return i_10_ + -1
                return i_10_
            }
    
            @JvmStatic
            fun method1763(i: Int) {
                aFontMetaRef_5938 = null
                if (i != -15596) method1763(-92)
            }
    
            @JvmStatic
            fun method1765(c: Char, i: Int, i_15_: Int): Char {
                anInt5946++
                if (c.code >= 192 && c.code <= 255) {
                    if (c.code >= 192 && c.code <= 198) return 'A'
                    if (c.code == 199) return 'C'
                    if (c.code >= 200 && c.code <= 203) return 'E'
                    if (c.code >= 204 && c.code <= 207) return 'I'
                    if (c.code >= 210 && c.code <= 214) return 'O'
                    if (c.code >= 217 && c.code <= 220) return 'U'
                    if (c.code == 221) return 'Y'
                    if (c.code == 223) return 's'
                    if (c.code >= 224 && c.code <= 230) return 'a'
                    if (c.code == 231) return 'c'
                    if (c.code >= 232 && c.code <= 235) return 'e'
                    if (c.code >= 236 && c.code <= 239) return 'i'
                    if (c.code >= 242 && c.code <= 246) return 'o'
                    if (c.code >= 249 && c.code <= 252) return 'u'
                    if (c.code == 253 || c.code == 255) return 'y'
                }
                if (i_15_ != 105) aFontMetaRef_5938 = null
                if (c.code == 338) return 'O'
                if (c.code == 339) return 'o'
                if (c.code == 376) return 'Y'
                return c
            }
    
            @JvmStatic
            fun method1766(i: Byte, i_16_: Int, js5Archive: Js5Archive): FontDefinition? {
                anInt5944++
                if (i >= -24) return null
                val `is` = js5Archive.method415(73.toByte(), i_16_)
                if (`is` == null) return null
                return FontDefinition(`is`)
            }
}
