object DoublyLinkedNodeListStatics {

    var anInt3164: Int = 0
    var aOutgoingPacketHeader_3165: OutgoingPacketHeader? = OutgoingPacketHeader(60, 8)

    @JvmStatic
    fun method1873(i: Byte) {
        if (i > -111) aOutgoingPacketHeader_3165 = null
        aOutgoingPacketHeader_3165 = null
    }

    fun method1877(var_renderer: Renderer?, i: Int) {
        anInt3164++
        if (i >= -20) method1877(null, -112)
        var class318_sub10 = OpenGlModel.aDoublyLinkedNodeList_2077!!.method1872(8) as SceneGraphContainer?
        while (class318_sub10 != null) {
            if (class318_sub10.aBoolean6482) class318_sub10.method2528(var_renderer)
            class318_sub10 = OpenGlModel.aDoublyLinkedNodeList_2077!!.method1878(124.toByte()) as SceneGraphContainer?
        }
    }

    @JvmStatic
    fun method1879(bool: Boolean) {
        if (bool) {
            HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029 = ProducerImageSurface.aSceneCollisionEntryArrayArrayArray9082
            ActorEntity.aTerrainTileArray5191 = ActorEntity.aTerrainTileArray4142
        } else {
            HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029 = WorldMapImageBuilder.aSceneCollisionEntryArrayArrayArray1148
            ActorEntity.aTerrainTileArray5191 = TerrainTileShapeStatics.aTerrainTileArray8801
        }
        MapAreaDefinitionStatics.anInt2524 = HintArrowOrMessage.aSceneCollisionEntryArrayArrayArray2029!!.size
    }
}
