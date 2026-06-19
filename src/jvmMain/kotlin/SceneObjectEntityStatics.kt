object SceneObjectEntityStatics {
    @JvmField
            var anInt8729: Int = 0
            @JvmField
            var anInt8730: Int = 0
            @JvmField
            var anInt8731: Int = 0
            @JvmField
            var aLruByteCache_8732: LruByteCache? = LruByteCache(64)
            @JvmField
            var anInt8733: Int = 0
            @JvmField
            var anInt8734: Int = 0
            @JvmField
            var anInt8735: Int = 0
            @JvmField
            var anInt8736: Int = 0
            @JvmField
            var aTrigLookupTables_8737: TrigLookupTables? = TrigLookupTables()
            @JvmField
            var anInt8738: Int = 0
    
            @JvmStatic
            fun method2405(i: Int) {
                anInt8729++
                var randomAccessFileOnDisk: RandomAccessFileOnDisk? = null
                try {
                    randomAccessFileOnDisk = PrivilegedOperationWorkerStatics.method2231("2", -1141472112)!!
                    val class348_sub49 = ByteBuffer(3 + 6 * TimingCounters.anInt4168)
                    class348_sub49.writeByte(false, 1)
                    class348_sub49.writeShort(107.toByte(), TimingCounters.anInt4168)
                    val i_0_ = -4 % ((-12 - i) / 38)
                    var i_1_ = 0
                    while ((i_1_ < IsaacCipherStatics.anIntArray1303!!.size)) {
                        if (GlslEnvMaterialPassStatics.aBooleanArray6270!![i_1_]) {
                            class348_sub49.writeShort(107.toByte(), i_1_)
                            class348_sub49.writeInt(124.toByte(), IsaacCipherStatics.anIntArray1303!![i_1_])
                        }
                        i_1_++
                    }
                    randomAccessFileOnDisk.method1658(117.toByte(), 0, class348_sub49.anInt7197, (class348_sub49.aByteArray7154))
                } catch (exception: Exception) {
                    /* empty */
                }
                try {
                    if (randomAccessFileOnDisk != null) randomAccessFileOnDisk.method1657(false)
                } catch (exception: Exception) {
                    /* empty */
                }
                SkeletalAnimFrameLoaderStatics.aLong482 = GameClock.method599(-117)
                ScanlineRasterFillerStatics.aBoolean2469 = false
            }
    
            @JvmStatic
            fun method2406(i: Int) {
                if (i > -126) anInt8731 = 118
                aLruByteCache_8732 = null
                aTrigLookupTables_8737 = null
            }
}
