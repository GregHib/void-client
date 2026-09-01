import kotlin.jvm.JvmStatic

/* Class348_Sub45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
abstract class TimedRecordAccessor : LinkedListNode() {
    abstract fun method3308(i: Byte): Int

    abstract fun method3310(i: Int): Int

    abstract fun method3311(i: Int): Int

    abstract fun method3312(i: Byte): Long

    abstract fun method3315(i: Int): Int

    companion object {

        var anInt7102: Int = 1400

        var aTextureFormatInfo_7103: TextureFormatInfo? = TextureFormatInfo(3)

        var anInt7104: Int = 0


        var aAbstractModelRendererArray7107: Array<AbstractModelRenderer?>? = null

        var aCollisionMapArray7108s: Array<CollisionMap?>? = arrayOfNulls<CollisionMap>(4)

        @JvmStatic
        fun method3309(i: Int) {
            ActorEntity.anIntArrayArrayArray4356 = (Array<Array<IntArray?>?>(MapAreaDefinition.anInt2524) { Array<IntArray?>(1 + ActorEntity.anInt6451) { IntArray(1 + ActorEntity.anInt7054) } })
            anInt7104++
            PackedFlagsAccessor.anInt7101 = 0
            SceneRegionState.anInt194 = ActorEntity.anInt3465
            MapElementDecor.aMapTileShapeArray10330 = arrayOfNulls<MapTileShape>(2000)
            OpenGlRenderer.anInt7714 = ActorEntity.anInt3465
            MinimapSquareDrawer.aBoolean5226 = false
            HintArrowOrMessage.aMapTileShapeArray2034 = arrayOfNulls<MapTileShape>(500)
            CollisionFlagQuery.anInt1200 = 0
            SoundLevelOptionState.anInt6115 = 0
            LoadingBarRenderer.aMapTileShapeArray5060 = arrayOfNulls<MapTileShape>(1000)
            if (i > -113) aTextureFormatInfo_7103 = null
            ParameterizedText.anInt9577 = 0
            MinimapAreaMarkerNode.aMapTileShapeArray9700 = arrayOfNulls<MapTileShape>((500 * Config.RENDER_DISTANCE_MULTIPLIER).toInt())
            ActorEntity.aBoolean9307 = NativeLibraryState.aRenderer171 !is oa
        }

        @JvmStatic
        fun method3313(i: Int, var_terrainTile: TerrainTile?) {
            ActorEntity.aTerrainTileArray5191!![i] = var_terrainTile
        }

        @JvmStatic
        fun method3314(i: Int) {
            InboundPacketHeader.aInboundPacketHeader_7106 = null
            if (i != 5) method3313(-103, null)
            InboundPacketHeader.aInboundPacketHeader_7105 = null
            aCollisionMapArray7108s = null
            aAbstractModelRendererArray7107 = null
            aTextureFormatInfo_7103 = null
        }
    }
}

