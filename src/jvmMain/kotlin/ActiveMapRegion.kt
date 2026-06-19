/* Class75_Sub1 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object ActiveMapRegion : MapRegionLoader() {
    @JvmField
    var anInt5652: Int = 1
    @JvmField
    var anInt5653: Int = 0
    var aFloat5654: Float = 1.0f

    @JvmStatic
    fun method769(i: Int, i_0_: Byte) {
        anInt5653++
        if (i_0_ > 109 && TextureLoaderUtil.method2547(i, 84.toByte())) ShortMatrixNode.method3180(-1, (WarpTextureNode.aWidgetComponentArrayArray9427!![i]!!), 24235)
    }

    @JvmStatic
    fun method770(i: Int, i_1_: Int, i_2_: Int, class318_sub1_sub1: TileSceneEntity) {
        val class357 = StringValueNode.method3321(i, i_1_, i_2_)
        if (class357 != null) {
            class357.aClass318_Sub1_Sub1_4402 = class318_sub1_sub1
            val i_3_ = if (ActorEntity.aTerrainTileArray5191 == ActorEntity.aTerrainTileArray4142) 1 else 0
            if (class318_sub1_sub1.method2376(-93)) {
                if (class318_sub1_sub1.method2377(122.toByte())) {
                    class318_sub1_sub1.aClass318_Sub1_6379 = BackgroundWorkerThread.aClass318_Sub1Array3226!![i_3_]
                    BackgroundWorkerThread.aClass318_Sub1Array3226!![i_3_] = class318_sub1_sub1
                } else {
                    class318_sub1_sub1.aClass318_Sub1_6379 = LinkedListNodeStatics.aClass318_Sub1Array4293!![i_3_]
                    LinkedListNodeStatics.aClass318_Sub1Array4293!![i_3_] = class318_sub1_sub1
                    PcmStreamBuffer.aBoolean8870 = true
                }
            } else {
                class318_sub1_sub1.aClass318_Sub1_6379 = OverlayColorTable.aClass318_Sub1Array1754!![i_3_]
                OverlayColorTable.aClass318_Sub1Array1754!![i_3_] = class318_sub1_sub1
            }
        }
    }
}
