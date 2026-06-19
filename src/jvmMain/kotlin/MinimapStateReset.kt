/* Class128 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object MinimapStateReset {
    @JvmField
    var anInt1870: Int = 0
    var aIntRange_1871: IntRange? = IntRange(52, -1)
    var anInt1872: Int = 0

    fun method1122(i: Int) {
        for (i_0_ in i..4) SpotAnimDefinitionStatics.aBooleanArray2374!![i_0_] = false
        anInt1870++
        SequencedWallEntityStatics.anInt10163 = -1
        NativeLibraryState.anInt167 = SequencedWallEntityStatics.anInt10163
        WeaveTextureNodeStatics.anInt9282 = 1
        NativeShaderProgramStatics.anInt9775 = -1
        BloomGraphicsOptionStateStatics.anInt5973 = 0
        MapArchiveSourceStatics.anInt4803 = -1
        GlGroundShaderPassStatics.anInt7403 = 0
    }

    @JvmStatic
    fun method1123(i: Int) {
        aIntRange_1871 = null
        if (i != -1) method1122(-78)
    }
}
