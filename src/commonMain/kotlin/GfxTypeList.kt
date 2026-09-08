import kotlin.jvm.JvmStatic
import ModelGroundDecor.Companion.method2419
import HashTileShape.Companion.method2729

/* Class319 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class GfxTypeList internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?, js5Archive_3_: Js5Archive?) {
    private val aJs5Archive_3979: Js5Archive?
    var aJs5Archive_3981: Js5Archive? = null
    private val aLruByteCache_3989 = LruByteCache(64)
    var aLruByteCache_3990: LruByteCache = LruByteCache(60)
    var anInt3991: Int = 0

    fun method2541(i: Int, i_0_: Int) {
        anInt3978++
        this.anInt3991 = i_0_
        withLock(this.aLruByteCache_3990) {
            this.aLruByteCache_3990.method590(0)
        }
        if (i < 72) aCacheIndexManagerArray3982 = null
    }

    fun method2542(i: Int) {
        withLock(aLruByteCache_3989) {
            aLruByteCache_3989.method587(-126)
        }
        if (i >= -99) aDouble3980 = 0.5896741197263589
        anInt3986++
        withLock(this.aLruByteCache_3990) {
            this.aLruByteCache_3990.method587(-106)
        }
    }

    fun method2543(i: Byte, i_1_: Int): LocConfigModelBuilder {
        if (i <= 38) method2542(-73)
        anInt3983++
        var locConfigModelBuilder: LocConfigModelBuilder? = withLock(aLruByteCache_3989) {
            aLruByteCache_3989.method583(i_1_.toLong(), 101) as LocConfigModelBuilder?
        }
        if (locConfigModelBuilder != null) return locConfigModelBuilder
        val `is`: ByteArray? = withLock(aJs5Archive_3979!!) {
            aJs5Archive_3979.method410(-1860, method2419(127.toByte(), i_1_), method2729(i_1_, 16))
        }
        locConfigModelBuilder = LocConfigModelBuilder()
        locConfigModelBuilder.aGfxTypeList_4513 = this
        locConfigModelBuilder.anInt4501 = i_1_
        if (`is` != null) locConfigModelBuilder.method3559(28105, ByteBuffer(`is`))
        withLock(aLruByteCache_3989) {
            aLruByteCache_3989.method582(locConfigModelBuilder, i_1_.toLong(), (-127).toByte())
        }
        return locConfigModelBuilder
    }

    fun method2544(i: Int, i_2_: Byte) {
        withLock(aLruByteCache_3989) {
            aLruByteCache_3989.method578(2, i)
            if (i_2_ >= -11) this.aJs5Archive_3981 = null
        }
        anInt3987++
        withLock(this.aLruByteCache_3990) {
            this.aLruByteCache_3990.method578(2, i)
        }
    }

    fun method2546(i: Int) {
        anInt3984++
        withLock(aLruByteCache_3989) {
            aLruByteCache_3989.method590(0)
        }
        withLock(this.aLruByteCache_3990) {
            this.aLruByteCache_3990.method590(0)
        }
    }

    init {
        try {
            this.aJs5Archive_3981 = js5Archive_3_
            aJs5Archive_3979 = js5Archive
            val i_4_ = -1 + aJs5Archive_3979!!.method414(-1)
            aJs5Archive_3979.method407(0, i_4_)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("cn.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_3_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var anInt3978: Int = 0
        var aDouble3980: Double = 0.0

        var aCacheIndexManagerArray3982: Array<CacheIndexManager?>? = null
        var anInt3983: Int = 0
        var anInt3984: Int = 0

        var anObject3985: Any? = null
        var anInt3986: Int = 0
        var anInt3987: Int = 0

        var aBoolean3988: Boolean = false
        @JvmStatic
        fun method2545(bool: Boolean) {
            if (bool == true) {
                aCacheIndexManagerArray3982 = null
                anObject3985 = null
            }
        }
    }
}
