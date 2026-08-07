object RasterSpriteStatics {
    var aOutgoingPacketHeader_5200: OutgoingPacketHeader? = OutgoingPacketHeader(13, 2)

    var anInt5203: Int = 0

    var aOutgoingPacketHeader_5204: OutgoingPacketHeader? = OutgoingPacketHeader(15, 8)

    var anInt5205: Int = 0

    var aJs5Archive_5207: Js5Archive? = null

    /*synthetic*/
    var aClass5208: Class<*>? = null

    @JvmStatic
    fun method166(i: Byte, i_0_: Int, i_1_: Int): Boolean {
        if (i < 5) method166((-119).toByte(), -93, 73)
        anInt5203++
        return (i_1_ and 0x800) != 0 && (i_0_ and 0x37) != 0
    }

    @JvmStatic
    fun method167(i: Int) {
        if (i != 19612) method167(-70)
        aOutgoingPacketHeader_5200 = null
        aOutgoingPacketHeader_5204 = null
        SpriteSheetCache.aClass348_Sub6_5206 = null
        aJs5Archive_5207 = null
    }

    fun method168(i: Byte) {
        do {
            if (!VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.aBoolean3794) {
                try {
                    try {
                        val runtime = Runtime.getRuntime()
                        val var_long = runtime.maxMemory()
                        TextureDefinitionCache.anInt2964 = 1 + (var_long / 1048576L).toInt()
                    } catch (throwable: Throwable) {
                        /* empty */
                    }
                    break
                } catch (exception: Exception) {
                    break
                }
            }
            TextureDefinitionCache.anInt2964 = 96
        } while (false)
        val i_2_ = 15 % (i / 51)
        anInt5205++
    }
}
