object IntPairStatics {
    @JvmField
            var aRenderer6968: Renderer? = null
            @JvmField
            var anInt6969: Int
            var aFontMetaRef_6970: FontMetaRef?
            @JvmField
            var anIntArray6972: IntArray? = intArrayOf(0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1)
            @JvmField
            var anInt6974: Int = 0
    
            @JvmStatic
            fun method3026(bool: Boolean) {
                anIntArray6972 = null
                if (bool != true) method3026(false)
                aFontMetaRef_6970 = null
                aRenderer6968 = null
            }
    
            init {
                anInt6969 = 0
                aFontMetaRef_6970 = FontMetaRef(70, 0)
            }
}
