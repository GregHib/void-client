object ParticleGeometryStatics {
    var anInt4411: Int = 0
    var anInt4413: Int = 0
    var aLruByteCache_4417: LruByteCache? = LruByteCache(50)
    var aOutgoingPacketHeader_4418: OutgoingPacketHeader? = OutgoingPacketHeader(33, 8)

    @JvmStatic
    fun method3488(i: Int) {
        if (i < 25) method3489(30)
        aOutgoingPacketHeader_4418 = null
        aLruByteCache_4417 = null
    }

    fun method3489(i: Int) {
        TerrainChunkBuilder.aRenderer1098!!.xa((IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub10_7232!!.method1764(-32350).toFloat() * 0.1f + 0.7f) * 1.1523438f)
        anInt4413++
        TerrainChunkBuilder.aRenderer1098!!.ZA(LocDefinitionCache.anInt3439, 0.69921875f, 1.2f, -200.0f, -240.0f, -200.0f)
        TerrainChunkBuilder.aRenderer1098!!.L(LocDefinitionCache.anInt3444, -1, 0)
        val i_0_ = -35 / ((45 - i) / 44)
        TerrainChunkBuilder.aRenderer1098!!.method3653(ParameterizedText.aCircleRasterizer_9571)
    }
}
