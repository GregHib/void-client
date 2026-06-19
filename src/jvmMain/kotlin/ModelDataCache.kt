import GlTexture2DRegion.Companion.method3553

/* Class24 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object ModelDataCache {
    @JvmField
    var anInt354: Int = 0
    @JvmField
    var aLruByteCache_355: LruByteCache? = LruByteCache(260)
    @JvmField
    var anInt356: Int = 0
    @JvmField
    var aClass318_Sub1_Sub3Array357: Array<GroundDecorEntity?>? = null
    @JvmField
    var anInt359: Int = 0

    @JvmStatic
    fun method296(i: Byte) {
        if (i.toInt() != -99) method298(false, 24, -128, 22, -7)
        aLruByteCache_355 = null
        ByteArrayPool.aByteArrayArray358 = null
        aClass318_Sub1_Sub3Array357 = null
    }

    @JvmStatic
    fun method297(bool: Boolean) {
        if (bool != false) aLruByteCache_355 = null
        ModelFacePriorityNode.aLruByteCache_4636!!.method590(0)
        anInt356++
    }

    @JvmStatic
    fun method298(bool: Boolean, i: Int, i_0_: Int, i_1_: Int, i_2_: Int) {
        anInt354++
        if (IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350) == 0) LoadingScreenImageNode.method3177(-98, false)
        else {
            CollisionMapRegion.anInt1720 = IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub25_7271!!.method1829(-32350)
            method3553(true, 103.toByte(), 0)
        }
        SceneNodeDeque.aBoolean1500 = bool
        MapRegionLoaderThread.anInt4202 = i
        IdleAnimationsOptionState.anInt5909 = i_0_
        MapRegionLoader.method754(i_1_)
        if (i_2_ > -41) method297(true)
    }
}
