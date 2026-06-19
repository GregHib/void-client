object WorldMapIconLabelStatics {
    @JvmField
            var anInt8594: Int = 0
            @JvmField
            var aBooleanArrayArray8596: Array<BooleanArray?>? = null
            @JvmField
            var anInt8598: Int = 0
            @JvmField
            var aJs5Archive_8601: Js5Archive? = null
            @JvmStatic
            fun method3573(i: Int) {
                synchronized(ModelDataCache.aLruByteCache_355!!) {
                    ModelDataCache.aLruByteCache_355!!.method590(0)
                }
                anInt8598++
                synchronized(ModelBatchBaseStatics.aLruByteCache_1894!!) {
                    ModelBatchBaseStatics.aLruByteCache_1894!!.method590(0)
                }
                if (i != -15326) method3573(-67)
            }
    
            @JvmStatic
            fun method3574(i: Int) {
                if (i == 19499) {
                    aBooleanArrayArray8596 = null
                    aJs5Archive_8601 = null
                }
            }
}
