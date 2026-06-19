/* Class28 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ItemNameResolver : TextFormatter {
    override fun method54(i: Int, l: Long, rectangleRegion: RectangleRegion?, `is`: IntArray?): String? {
        try {
            anInt4996++
            if (RandomAccessFileOnDisk.aRectangleRegion_3044 == rectangleRegion) {
                val class117 = RegionTileNode.aCacheArchiveIndexLoader_6653!!.method337(true, `is`!![0])
                return class117.method1074(l.toInt(), 91)
            }
            if (Texture2DProvider.aRectangleRegion_6321 == rectangleRegion || ShaderProgram.aRectangleRegion_7274 == rectangleRegion) {
                val class213 = ClientException.aModelHeaderCache_112!!.method1940(i + -99, l.toInt())
                return class213.aString2795
            }
            if (i != 1) method54(85, -41L, null, null)
            if (rectangleRegion == ProceduralTextureGraph.aRectangleRegion_9530 || rectangleRegion == FloatBuffer.aRectangleRegion_9748 || PlayerSequenceSelector.aRectangleRegion_1213 == rectangleRegion) return RegionTileNode.aCacheArchiveIndexLoader_6653!!.method337(true, `is`!![0]).method1074(l.toInt(), i xor 0x48)
            return null
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("hu.A(" + i + ',' + l + ',' + (if (rectangleRegion != null) "{...}" else "null") + ',' + (if (`is` != null) "{...}" else "null") + ')'))
        }
    }

    companion object {

        var anInt4996: Int = 0

        var aProjectileFactory_4997: ProjectileFactory? = ProjectileFactory(6, 1)
        var aInboundPacketHeader_4998: InboundPacketHeader?

        var anInt4999: Int = 0

        var aString5000: String? = null

        var aString5001: String? = null

        var aBoolean5002: Boolean = false

        @JvmStatic
        fun method318(i: Int) {
            aString5001 = null
            aString5000 = null
            val i_0_ = 74 / ((i - 58) / 49)
            aProjectileFactory_4997 = null
            aInboundPacketHeader_4998 = null
        }

        init {
            aInboundPacketHeader_4998 = InboundPacketHeader(59, 3)
        }
    }
}
