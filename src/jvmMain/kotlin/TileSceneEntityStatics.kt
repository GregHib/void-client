import CameraDistanceOptionStateStatics.method1725

object TileSceneEntityStatics {
    @JvmField
            var anInt8721: Int = 0
            @JvmField
            var anInt8722: Int = 0
            @JvmField
            var anInt8723: Int = 0
            @JvmField
            var aFontMetaRef_8724: FontMetaRef? = FontMetaRef(50, -1)
            @JvmField
            var aFloat8725: Float = 0f
            @JvmField
            var anInt8726: Int = 0
            @JvmField
            var aLong8728: Long = 0
    
            @JvmStatic
            fun method2395(i: Byte) {
                aFontMetaRef_8724 = null
                if (i.toInt() != 50) method2395(65.toByte())
            }
    
            @JvmStatic
            fun method2396(i: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
                var i = i
                var i_1_ = i_1_
                var i_2_ = i_2_
                i = i shl i_3_
                anInt8726++
                i_1_ = i_1_ shl 3
                i_2_ = i_2_ shl 3
                if (WeaveTextureNodeStatics.anInt9282 == 2) {
                    WorldMapElementStatics.anInt4638 = i_1_
                    MapTileShapeStatics.anInt4186 = i_2_
                    MinimapAreaMarkerNodeStatics.anInt9701 = i
                }
                ResourceProviderStatics.aFloat3938 = i_1_.toFloat()
                SceneObjectSpawnerStatics.aFloat1287 = i.toFloat()
                method1725(262144)
                WorldMapPolygonIconLabelStatics.aBoolean10174 = true
            }
}
