/* Class369_Sub2 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WorldMapTextLabel(screenAnchorAlignment: ScreenAnchorAlignment?, tileRenderState: TileRenderState?, i: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int) : WorldMapLabel(screenAnchorAlignment, tileRenderState, i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_) {
    @JvmField
    var anInt8585: Int = 0
    @JvmField
    var anInt8591: Int = 0
    override fun method51(i: Byte): ProjectileFactory? {
        if (i < 116) method3572(118)
        anInt8586++
        return Buffer.aProjectileFactory_7175
    }

    init {
        try {
            this.anInt8585 = i_9_
            this.anInt8591 = i_8_
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("ou.<init>(" + (if (screenAnchorAlignment != null) "{...}" else "null") + ',' + (if (tileRenderState != null) "{...}" else "null") + ',' + i + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ',' + i_7_ + ',' + i_8_ + ',' + i_9_ + ')'))
        }
    }

    companion object {
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
            if (TextureCubeProvider.aBufferedRandomAccessFile_6328 != null) indexedFileCache = IndexedFileCache(i, TextureCubeProvider.aBufferedRandomAccessFile_6328, MinimapRenderer.aBufferedRandomAccessFileArray1579!![i], 1000000)
            MinimapRectClipper.aClass314_Sub1Array223!![i] = SizeBoundedSoftCache.aRsaPacketDecoder_2327!!.method2673(indexedFileCache, i, LocTypeConfig.aIndexedFileCache_3568, 255)
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
}
