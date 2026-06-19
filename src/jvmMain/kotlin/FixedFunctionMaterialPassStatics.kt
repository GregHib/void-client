object FixedFunctionMaterialPassStatics {
    @JvmField
            var anInt6203: Int = 0
            @JvmField
            var anInt6204: Int = 0
            @JvmField
            var aStringArray6205: Array<String?>? = arrayOfNulls<String>(200)
            @JvmField
            var anInt6206: Int = 0
            @JvmField
            var anInt6207: Int = 0
            @JvmField
            var anInt6208: Int = 0
            @JvmField
            var anInt6209: Int = 0
            @JvmField
            var anInt6210: Int = 0
            @JvmField
            var anInt6211: Int = 0
            @JvmField
            var anInt6212: Int = 0
            @JvmField
            var anInt6213: Int = 0
    
            @JvmStatic
            fun method2144(string: String?, i: Int, i_0_: Byte, i_1_: Int, string_2_: String?, string_3_: String?, string_4_: String?) {
                do {
                    try {
                        TrackedGroundDecorStatics.method2477(string, string_2_, (-110).toByte(), -1, string_3_, null, i, i_1_, string_4_)
                        anInt6203++
                        if (i_0_ < -86) break
                        aStringArray6205 = null
                    } catch (runtimeexception: RuntimeException) {
                        throw SoundBankPatchStatics.method2929(runtimeexception, ("di.G(" + (if (string != null) "{...}" else "null") + ',' + i + ',' + i_0_ + ',' + i_1_ + ',' + (if (string_2_ != null) "{...}" else "null") + ',' + (if (string_3_ != null) "{...}" else "null") + ',' + (if (string_4_ != null) "{...}" else "null") + ')'))
                    }
                    break
                } while (false)
            }
    
            @JvmStatic
            fun method2145(i: Int) {
                anInt6210++
                LocConfigModelBuilderStatics.anInt4494++
                val class348_sub47: OutgoingPacketNode = WaterMaterialPassStatics.method2148(GrayscaleNoiseTextureStatics.aFontMetaRef_5288, TheoraVideoStreamStatics.aIsaacCipher_9029, -124)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, ContactEntryStatics.method3229(-96))
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), LocTypeDefinitionStatics.anInt4017)
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), HardCacheEntryReferenceStatics.anInt10432)
                if (i != -24498) aStringArray6205 = null
                class348_sub47.aClass348_Sub49_Sub2_7116!!.writeByte(false, IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub20_7248!!.method1808(-32350))
                InterfaceComponentGroupStatics.method3243(-101, class348_sub47)
            }
    
            @JvmStatic
            fun method2146(i: Byte) {
                val i_6_ = 34 % ((i - 32) / 38)
                anInt6213++
                MinimapAreaMarkerNodeStatics.method3277((-48).toByte())
                ScrollbarComponentStatics.aBoolean8335 = false
                MinimapRectClipper.method226(GlArrayBufferObjectStatics.anInt4717, SceneTileBoundsStatics.anInt1117, ProceduralTextureGraphStatics.anInt9532, 0, WorldMapSceneSoftwareStatics.anInt5819)
            }
    
            @JvmStatic
            fun method2147(i: Int) {
                if (i != -1) anInt6212 = -79
                aStringArray6205 = null
            }
}
