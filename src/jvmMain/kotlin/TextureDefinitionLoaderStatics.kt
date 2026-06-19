import NullRenderPassStatics.method3533

object TextureDefinitionLoaderStatics {
    var anInt1964: Int = 0
            @JvmField
            var aBoundsConstraintEntry_1966: BoundsConstraintEntry?
            var anInt1967: Int = 0
            var anInt1968: Int = 0
            var anInt1969: Int = 0
            var anInt1970: Int = 0
            var anInt1972: Int = 0
            var anIntArray1973: IntArray? = intArrayOf(0, 1, 2, 3, 4, 5, 6, 14)
            @JvmField
            var anInt1974: Int = 0
            var anIntArray1975: IntArray?
            @JvmField
            var aSpriteArchiveLoader_1977: SpriteArchiveLoader? = null
    
            @JvmStatic
            fun method1177(i: Byte) {
                CutsceneSequenceDataStatics.anIntArray3726 = method3533(127.toByte(), 2048, 4, 8, 0.4f, 35, true, 8)
                if (i.toInt() == 122) anInt1970++
            }
    
            @JvmStatic
            fun method1179(i: Byte) {
                anIntArray1975 = null
                aSpriteArchiveLoader_1977 = null
                anIntArray1973 = null
                aBoundsConstraintEntry_1966 = null
                if (i >= -111) method1177(47.toByte())
            }
    
            init {
                aBoundsConstraintEntry_1966 = BoundsConstraintEntry("", 18)
                anIntArray1975 = IntArray(1)
            }
}
