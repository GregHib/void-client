object ItemModelDefinitionStatics {
    @JvmField
            var anInt425: Int = 0
            @JvmField
            var anInt427: Int = 0
            @JvmField
            var anInt428: Int = 0
            var aCameraNodeList_430: CameraNodeList?
            @JvmField
            var anInt432: Int = 0
            @JvmField
            var anInt436: Int = 0
            @JvmField
            var anInt437: Int = 0
            @JvmField
            var anInt440: Int = 0
            @JvmField
            var anInt441: Int = 0
            @JvmField
            var anInt442: Int = 0
            @JvmField
            var anInt443: Int = 1
            @JvmField
            var anInt445: Int = 0
            @JvmField
            var anInt446: Int = 0
    
            @JvmStatic
            fun method326(i: Byte) {
                anInt442++
                if (!MinimapSquareDrawerStatics.aBoolean5224) {
                    WorldMapPolygonIconLabelStatics.aBoolean10174 = true
                    MultiFieldRecordStatics.aFloat6898 += (12.0f - MultiFieldRecordStatics.aFloat6898) / 2.0f
                    MinimapSquareDrawerStatics.aBoolean5224 = true
                    if (i.toInt() != 68) aCameraNodeList_430 = null
                }
            }
    
            @JvmStatic
            fun method328(i: Int) {
                if (i != 0) anInt425 = -128
                aCameraNodeList_430 = null
            }
    
            init {
                aCameraNodeList_430 = CameraNodeList()
            }
}
