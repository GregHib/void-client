object DoublyLinkedNodeListStatics {
    var anInt3157: Int = 0
            var anInt3158: Int = 0
            var anInt3159: Int = 0
            var anInt3160: Int = 0
            var anInt3161: Int = 0
            var anInt3162: Int = 0
            var anInt3163: Int = 0
            var anInt3164: Int = 0
            var aFontMetaRef_3165: FontMetaRef? = FontMetaRef(60, 8)
            var anInt3168: Int = 0
    
            @JvmStatic
            fun method1873(i: Byte) {
                if (i > -111) aFontMetaRef_3165 = null
                aFontMetaRef_3165 = null
            }
    
            fun method1877(var_renderer: Renderer?, i: Int) {
                anInt3164++
                if (i >= -20) method1877(null, -112)
                var class318_sub10 = GzipDecompressorStatics.aDoublyLinkedNodeList_2077!!.method1872(8) as SceneGraphContainer?
                while (class318_sub10 != null) {
                    if (class318_sub10.aBoolean6482) class318_sub10.method2528(var_renderer)
                    class318_sub10 = GzipDecompressorStatics.aDoublyLinkedNodeList_2077!!.method1878(124.toByte()) as SceneGraphContainer?
                }
            }
    
            @JvmStatic
            fun method1879(bool: Boolean) {
                if (bool) {
                    HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029 = ProducerImageSurfaceStatics.aSceneCollisionEntryArrayArrayArray9082
                    NativeSpriteStatics.aTerrainTileArray5191 = SoundCacheState.aTerrainTileArray4142
                } else {
                    HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029 = WorldMapImageBuilderStatics.aSceneCollisionEntryArrayArrayArray1148
                    NativeSpriteStatics.aTerrainTileArray5191 = TerrainTileShapeStatics.aTerrainTileArray8801
                }
                MapAreaDefinitionStatics.anInt2524 = HintArrowOrMessageStatics.aSceneCollisionEntryArrayArrayArray2029!!.size
            }
}
