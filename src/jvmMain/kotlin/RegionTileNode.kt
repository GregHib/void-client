/* Class348_Sub7 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class RegionTileNode internal constructor(@JvmField var anInt6649: Int, @JvmField var anInt6648: Int, @JvmField var anInt6645: Int, @JvmField var anInt6647: Int, @JvmField var anInt6642: Int, @JvmField var aBoolean6650: Boolean) : LinkedListNode() {
    companion object {

        var anInt6641: Int = 0

        var aSpriteImage_6643: SpriteImage? = null

        var aRenderConfigFactory_6644: RenderConfigFactory? = RenderConfigFactory()

        var anInt6646: Int = 0

        var aLong6651: Long = -1L

        var anInt6652: Int = 0

        var aCacheArchiveIndexLoader_6653: CacheArchiveIndexLoader? = null

        @JvmStatic
        fun method2772(i: Int, i_0_: Byte) {
            anInt6641++
            if (TextureLoaderUtil.method2547(i, 84.toByte()) && i_0_ > 105) {
                val class46s = WarpTextureNode.aWidgetComponentArrayArray9427!![i]!!
                for (i_1_ in class46s.indices) {
                    val class46 = class46s[i_1_]
                    if (class46 != null) {
                        class46.anInt795 = 0
                        class46.anInt730 = 1
                        class46.anInt841 = 0
                    }
                }
            }
        }

        @JvmStatic
        fun method2773(i: Int) {
            aSpriteImage_6643 = null
            aRenderConfigFactory_6644 = null
            if (i == 0) aCacheArchiveIndexLoader_6653 = null
        }
    }
}
