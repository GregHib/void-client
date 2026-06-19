import InputTrackerStatics.method3591

object ModelFacePriorityNodeStatics {
    @JvmField
            var anInt1873: Int = 0
            @JvmField
            var aJs5Archive_1878: Js5Archive? = null
            @JvmField
            var anInt1879: Int = 0
            @JvmField
            var anIntArray1885: IntArray? = IntArray(32)
            var aByteArrayArray1887: Array<ByteArray?>? = null
            @JvmField
            var anInt1893: Int = 0
    
            @JvmStatic
            fun method1126(i: Int) {
                if (i == 32) {
                    aJs5Archive_1878 = null
                    aByteArrayArray1887 = null
                    anIntArray1885 = null
                }
            }
    
            init {
                var i = 2
                for (i_7_ in 0..31) {
                    anIntArray1885!![i_7_] = -1 + i
                    i += i
                }
            }
}
