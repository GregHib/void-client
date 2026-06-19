import HardCacheEntryReferenceStatics.method3200

object IsaacCipherStatics {
    @JvmField
            var anInt1290: Int = 0
            @JvmField
            var anInt1295: Int = 0
            @JvmField
            var anInt1297: Int = 0
            @JvmField
            var aBoundsConstraintEntry_1298: BoundsConstraintEntry? = BoundsConstraintEntry("", 16)
            @JvmField
            var anInt1299: Int = 0
            @JvmField
            var anInt1300: Int = 0
            @JvmField
            var anInt1301: Int = 0
            @JvmField
            var anInt1302: Int = 0
            @JvmField
            var anIntArray1303: IntArray? = null
    
            fun method776(i: Int, i_0_: Int, i_1_: Int): Boolean {
                anInt1297++
                if (i_1_ != 65536) method780(-106, -24, 57)
                val bool = (if ((i and 0x37) != 0) Crc64HashableStatics.method1113(i_0_, i, -7) else method3200(i_0_, i, 111.toByte()))
                return bool or (LocalizedTextStatics.method2058(i_0_, i, i_1_ xor 0x1003d) or ((0x10000 and i_0_) != 0))
            }
    
            fun method780(i: Int, i_15_: Int, i_16_: Int): Boolean {
                if (i_15_ != 0) return true
                anInt1299++
                return (0x400 and i_16_) != 0
            }
    
            @JvmStatic
            fun method782(i: Int) {
                anIntArray1303 = null
                if (i != 1) anInt1290 = 114
                aBoundsConstraintEntry_1298 = null
            }
}
