object HitsplatDefinitionStatics {
    var anInt2012: Int = 0
            @JvmField
            var aLongArray2013: LongArray? = LongArray(10)
            var anInt2014: Int = 0
            @JvmField
            var aJs5Archive_2015: Js5Archive? = null
            var anInt2017: Int = 0
            var anInt2018: Int = 0
            @JvmStatic
            fun method1193(i: Int, i_2_: Int, bool: Boolean): Boolean {
                if (!bool) return true
                anInt2017++
                return (i_2_ and 0x800) != 0
            }
    
            @JvmStatic
            fun method1194(i: Int) {
                if (i != 10) method1193(91, -68, true)
                aLongArray2013 = null
                aJs5Archive_2015 = null
            }
}
