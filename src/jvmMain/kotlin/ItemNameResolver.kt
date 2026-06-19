import ItemNameResolverStatics.anInt4996

/* Class28 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ItemNameResolver : TextFormatter {
    override fun method54(i: Int, l: Long, rectangleRegion: RectangleRegion?, `is`: IntArray?): String? {
        try {
            anInt4996++
            if (RandomAccessFileOnDiskStatics.aRectangleRegion_3044 == rectangleRegion) {
                val class117 = RegionTileNodeStatics.aCacheArchiveIndexLoader_6653!!.method337(true, `is`!![0])
                return class117.method1074(l.toInt(), 91)
            }
            if (Texture2DProviderStatics.aRectangleRegion_6321 == rectangleRegion || ShaderProgramStatics.aRectangleRegion_7274 == rectangleRegion) {
                val class213 = ClientExceptionStatics.aModelHeaderCache_112!!.method1940(i + -99, l.toInt())
                return class213.aString2795
            }
            if (i != 1) method54(85, -41L, null, null)
            if (rectangleRegion == ProceduralTextureGraphStatics.aRectangleRegion_9530 || rectangleRegion == FloatBufferStatics.aRectangleRegion_9748 || PlayerSequenceSelector.aRectangleRegion_1213 == rectangleRegion) return RegionTileNodeStatics.aCacheArchiveIndexLoader_6653!!.method337(true, `is`!![0]).method1074(l.toInt(), i xor 0x48)
            return null
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("hu.A(" + i + ',' + l + ',' + (if (rectangleRegion != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }
}
