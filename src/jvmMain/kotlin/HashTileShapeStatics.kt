object HashTileShapeStatics {
    var aNodeDeque_8810: NodeDeque? = NodeDeque()

    var anInt8813: Int = 0


    var aByteArrayArray8816: Array<ByteArray?>? = null

    @JvmStatic
    fun method2729(i: Int, i_3_: Int): Int {
        anInt8813++
        if (i_3_ != 16) return 23
        return 0xff and i
    }


    @JvmStatic
    fun method2731(i: Byte) {
        aByteArrayArray8816 = null
        aNodeDeque_8810 = null
        PerlinNoiseTextureNode.aCacheLruCache_8815 = null
        InboundPacketHeader.aInboundPacketHeader_8817 = null
    }
}
