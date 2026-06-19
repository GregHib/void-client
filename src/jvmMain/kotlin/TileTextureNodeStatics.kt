object TileTextureNodeStatics {
    @JvmField
            var anInt9404: Int = 0
            @JvmField
            var anInt9406: Int = 0
            @JvmField
            var anInt9407: Int = 0
            var anInt9408: Int = 0
            @JvmField
            var anInt9409: Int = 0
            var anInt9411: Int
            @JvmField
            var anInt9412: Int = 0
            @JvmField
            var anInt9413: Int = 0
    
            @JvmStatic
            fun method3131(i: Byte, string: String?): Boolean {
                if (i.toInt() != 50) method3131((-33).toByte(), null)
                anInt9404++
                return PlayerStatics.aHashtable10565!!.containsKey(string)
            }
    
            init {
                anInt9411 = 0
            }
}
