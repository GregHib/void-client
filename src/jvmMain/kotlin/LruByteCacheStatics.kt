import CompositeRgbNoiseTextureStatics.method573

object LruByteCacheStatics {
    @JvmField
            var anInt1085: Int = 0
            @JvmField
            var anInt1087: Int = 0
            @JvmField
            var anInt1088: Int = 0
            @JvmField
            var anInt1090: Int = 0
            @JvmField
            var anInt1091: Int = 0
            @JvmField
            var anInt1092: Int = 0
            @JvmField
            var anInt1093: Int = 0
            @JvmField
            var anInt1094: Int = 0
            @JvmField
            var anInt1095: Int = 0
            @JvmField
            var anInt1096: Int = 0
            @JvmField
            var anInt1097: Int = 0
            @JvmField
            var aRenderer1098: Renderer? = null
            @JvmField
            var anInt1099: Int = 0
            @JvmField
            var anInt1101: Int = 0
            @JvmField
            var anInt1102: Int = 0
            @JvmField
            var anInt1103: Int = 0
    
            fun method576(i: Int, i_1_: Int): Boolean {
                if (i_1_ <= 21) method589(null, -21)
                anInt1088++
                return i == 2 || i == 3
            }
    
            @JvmStatic
            fun method584(i: Byte) {
                aRenderer1098 = null
                val i_7_ = -19 % ((i - 59) / 55)
            }
    
            @JvmStatic
            fun method589(structConfig: StructConfig?, i: Int): Boolean {
                anInt1103++
                if (structConfig == null) return false
                if (i != -4) return false
                if (!structConfig.aBoolean574) return false
                if (!structConfig.method373(MapRegionLoaderStatics.anVarResolver_1244!!, i xor 0x2d.inv())) return false
                if (HeapInfoRecordStatics.aHashtable_4934!!.method3480(structConfig.anInt581.toLong(), i xor 0x1774) != null) return false
                return HardKeyedCacheEntryReferenceStatics.aHashtable_10442!!.method3480(structConfig.anInt596.toLong(), i + -6004) == null
            }
}
