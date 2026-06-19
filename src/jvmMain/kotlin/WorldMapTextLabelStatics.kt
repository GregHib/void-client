object WorldMapTextLabelStatics {
    @JvmField
            var aWidgetComponentArrayArray8584: Array<Array<WidgetComponent?>?>? = null
            @JvmField
            var anInt8586: Int = 0
            @JvmField
            var anInt8587: Int = 0
            @JvmField
            var anInt8588: Int = 0
            @JvmField
            var aJs5Archive_8589: Js5Archive? = null
            @JvmField
            var aIntRange_8590: IntRange? = IntRange(58, 2)
            @JvmField
            var anObject8592: Any? = null
            @JvmField
            var anInt8593: Int = 0
    
            @JvmStatic
            fun method3571(bool: Boolean, i: Int, i_0_: Byte, i_1_: Int): Js5Archive? {
                anInt8593++
                if (i_0_.toInt() != -23) return null
                var indexedFileCache: IndexedFileCache? = null
                if (TextureCubeProviderStatics.aBufferedRandomAccessFile_6328 != null) indexedFileCache = IndexedFileCache(i, TextureCubeProviderStatics.aBufferedRandomAccessFile_6328, MinimapRendererStatics.aBufferedRandomAccessFileArray1579!![i], 1000000)
                MinimapRectClipper.aClass314_Sub1Array223!![i] = SizeBoundedSoftCacheStatics.aRsaPacketDecoder_2327!!.method2673(indexedFileCache, i, LocTypeConfigStatics.aIndexedFileCache_3568, 255)
                MinimapRectClipper.aClass314_Sub1Array223!![i]!!.method2346(27872)
                return Js5Archive(MinimapRectClipper.aClass314_Sub1Array223!![i]!!, bool, i_1_)
            }
    
            @JvmStatic
            fun method3572(i: Int) {
                aIntRange_8590 = null
                aJs5Archive_8589 = null
                if (i != 1000000) method3571(false, -66, 13.toByte(), 13)
                aWidgetComponentArrayArray8584 = null
                anObject8592 = null
            }
}
