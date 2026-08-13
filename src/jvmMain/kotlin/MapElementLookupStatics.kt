object MapElementLookupStatics {
    var anInt4144: Int = -1
    var aJs5Archive_4147: Js5Archive? = null
    fun method2643(i: Int, i_0_: Int, i_1_: Int, i_2_: Int, i_3_: Int) {
        if (LoadingBarRenderer.anIntArrayArray4253 != null) LoadingBarRenderer.anIntArrayArray4253!![i]!![i_0_] = 0xffffff.inv() or i_1_
        if (BooleanGraphicsOptionState.aShortArrayArray5847 != null) BooleanGraphicsOptionState.aShortArrayArray5847!![i]!![i_0_] = i_2_.toShort()
        if (HashTileShapeStatics.aByteArrayArray8816 != null) HashTileShapeStatics.aByteArrayArray8816!![i]!![i_0_] = i_3_.toByte()
    }

    @JvmStatic
    fun method2645(i: Int) {
        if (i != -16777216) method2643(-59, 61, -83, 34, -32)
        aJs5Archive_4147 = null
    }
}
