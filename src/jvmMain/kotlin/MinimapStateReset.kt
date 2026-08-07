/* Class128 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object MinimapStateReset {

    var anInt1870: Int = 0
    var anInt1872: Int = 0

    var aBooleanArray2374: BooleanArray? = BooleanArray(5)
    fun method1122(i: Int) {
        for (i_0_ in i..4) aBooleanArray2374!![i_0_] = false
        anInt1870++
        SequencedWallEntity.anInt10163 = -1
        NativeLibraryState.anInt167 = SequencedWallEntity.anInt10163
        WeaveTextureNode.anInt9282 = 1
        NativeShaderProgram.anInt9775 = -1
        BloomGraphicsOptionState.anInt5973 = 0
        MapArchiveSourceStatics.anInt4803 = -1
        GlGroundShaderPass.anInt7403 = 0
    }

    @JvmStatic
    fun method1123(i: Int) {
        InboundPacketHeader.aInboundPacketHeader_1871 = null
        if (i != -1) method1122(-78)
    }
    @JvmStatic
    fun method1369(i: Byte) {
        MinimapStateReset.aBooleanArray2374 = null
    }
}
