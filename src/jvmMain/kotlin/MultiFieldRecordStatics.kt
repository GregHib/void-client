object MultiFieldRecordStatics {
    var aMinimapPositionStateArray6897s: Array<MinimapPositionState?>? = arrayOfNulls<MinimapPositionState>(8)

    var aFloat6898: Float = 0.0f
    var anInt6906: Int = 0
    fun method3000(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
        WorldMapLabel.anInt4960 = i_2_
        val i_4_ = -89 / ((i_3_ - 78) / 44)
        WidgetTextConfigStatics.anInt513 = i_1_
        CameraNodeListStatics.anInt1745 = i
        LocalPlayerState.anInt1910 = i_0_
        anInt6906++
    }

    @JvmStatic
    fun method3001(i: Int) {
        aMinimapPositionStateArray6897s = null
        if (i != 0) aMinimapPositionStateArray6897s = null
    }
}
