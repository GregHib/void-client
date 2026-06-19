object SpriteArchiveLoaderStatics {
    @JvmField
            var anInt373: Int = 0
            @JvmField
            var anInt375: Int = 0
            @JvmField
            var anInt376: Int = 0
            @JvmField
            var anInt378: Int = 0
            @JvmField
            var anInt380: Int = 0
            @JvmField
            var aNamedIdRecord_382: NamedIdRecord? = NamedIdRecord("WTQA", 2)
            @JvmField
            var anInt383: Int
            var aBoolean384: Boolean = false
            @JvmField
            var anInt385: Int = 0
            @JvmField
            var anInt386: Int = 0
    
            @JvmStatic
            fun method306(bool: Boolean) {
                aNamedIdRecord_382 = null
                if (bool != true) method311((-5).toByte(), '\u0002')
            }
    
            fun method311(i: Byte, c: Char): Boolean {
                anInt380++
                if (i <= 85) method311((-75).toByte(), '\u000c')
                return c.code == 160 || c.code == 32 || c.code == 95 || c.code == 45
            }
    
            init {
                anInt383 = 0
            }
}
