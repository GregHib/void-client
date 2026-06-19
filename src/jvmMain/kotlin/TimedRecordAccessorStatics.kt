object TimedRecordAccessorStatics {
    @JvmField
            var anInt7102: Int = 1400
            @JvmField
            var aTextureFormatInfo_7103: TextureFormatInfo? = TextureFormatInfo(3)
            @JvmField
            var anInt7104: Int = 0
            @JvmField
            var aIntRange_7105: IntRange? = IntRange(101, 20)
            @JvmField
            var aIntRange_7106: IntRange? = IntRange(36, -2)
            @JvmField
            var aAbstractModelRendererArray7107: Array<AbstractModelRenderer?>? = null
            @JvmField
            var aCollisionMapArray7108s: Array<CollisionMap?>? = arrayOfNulls<CollisionMap>(4)
    
            @JvmStatic
            fun method3309(i: Int) {
                TextureCacheStatics.anIntArrayArrayArray4356 = (Array<Array<IntArray?>?>(MapAreaDefinitionStatics.anInt2524) { Array<IntArray?>(1 + SpotAnimEntityStatics.anInt6451) { IntArray(1 + RegionSceneShifterStatics.anInt7054) } })
                anInt7104++
                PackedFlagsAccessorStatics.anInt7101 = 0
                SceneRegionState.anInt194 = ArchiveFileConditionWrapperStatics.anInt3465
                MapElementDecorStatics.aMapTileShapeArray10330 = arrayOfNulls<MapTileShape>(2000)
                OpenGlRendererStatics.anInt7714 = ArchiveFileConditionWrapperStatics.anInt3465
                MinimapSquareDrawerStatics.aBoolean5226 = false
                HintArrowOrMessageStatics.aMapTileShapeArray2034 = arrayOfNulls<MapTileShape>(500)
                CollisionFlagQueryStatics.anInt1200 = 0
                DetailLevelOptionStateStatics.anInt6115 = 0
                LoadingBarRendererStatics.aMapTileShapeArray5060 = arrayOfNulls<MapTileShape>(1000)
                if (i > -113) aTextureFormatInfo_7103 = null
                ParameterizedTextStatics.anInt9577 = 0
                MinimapAreaMarkerNodeStatics.aMapTileShapeArray9700 = arrayOfNulls<MapTileShape>(500)
                TurbulenceTextureNodeStatics.aBoolean9307 = NativeLibraryState.aRenderer171 !is oa
            }
    
            @JvmStatic
            fun method3313(i: Int, var_terrainTile: TerrainTile?) {
                NativeSpriteStatics.aTerrainTileArray5191!![i] = var_terrainTile
            }
    
            @JvmStatic
            fun method3314(i: Int) {
                aIntRange_7106 = null
                if (i != 5) method3313(-103, null)
                aIntRange_7105 = null
                aCollisionMapArray7108s = null
                aAbstractModelRendererArray7107 = null
                aTextureFormatInfo_7103 = null
            }
}
