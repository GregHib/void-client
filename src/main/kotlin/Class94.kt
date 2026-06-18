/* Class94 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
object Class94 {
    @JvmField
    var anInt1535: Int = 0
    @JvmField
    var anInt1536: Int = 0
    @JvmField
    var anInt1537: Int = 0
    @JvmField
    var aJs5Archive_1538: Js5Archive? = null

    @JvmStatic
    fun method865(i: Int, i_0_: Int) {
        anInt1536++
        if (i != -8186) method866(-99)
        CharCountUtil.aLruByteCache_225!!.method578(2, i_0_)
    }

    @JvmStatic
    fun method866(i: Int) {
        if (i == -14603) aJs5Archive_1538 = null
    }

    @JvmStatic
    fun method867(bool: Boolean) {
        FacingDirectionNode.aBufferPositionTracker_6660!!.method1856(106.toByte())
        if (bool != true) aJs5Archive_1538 = null
        anInt1535++
        for (i in 0..31) Buffer.aLongArray7206!![i] = 0L
        for (i in 0..31) MaterialTypeVariant.aLongArray8800!![i] = 0L
        FloatCameraTransform.anInt5744 = 0
    }
}
