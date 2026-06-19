import WorldMapImageBuilderStatics.anInt1139
import WorldMapImageBuilderStatics.anInt1140
import WorldMapImageBuilderStatics.anInt1142
import WorldMapImageBuilderStatics.anInt1143
import WorldMapImageBuilderStatics.aFontMetaRef_1144

/* Class65 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WorldMapImageBuilder internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aJs5Archive_1141: Js5Archive?
    private val aLruByteCache_1145 = LruByteCache(256)
    fun method694(i: Int) {
        anInt1140++
        if (i != -1007) method700(14, 98)
        synchronized(aLruByteCache_1145) {
            aLruByteCache_1145.method587(i + 883)
        }
    }

    fun method695(bool: Boolean) {
        if (bool != true) aFontMetaRef_1144 = null
        synchronized(aLruByteCache_1145) {
            aLruByteCache_1145.method590(0)
        }
        anInt1139++
    }

    fun method697(i: Int, i_3_: Int) {
        if (i_3_ == 26) {
            anInt1142++
            synchronized(aLruByteCache_1145) {
                aLruByteCache_1145.method578(i_3_ xor 0x18, i)
            }
        }
    }

    fun method700(i: Int, i_8_: Int): ParamMap {
        anInt1143++
        val i_9_ = -128 / ((-3 - i_8_) / 49)
        var class348_sub42_sub1: ParamMap?
        synchronized(aLruByteCache_1145) {
            class348_sub42_sub1 = aLruByteCache_1145.method583(i.toLong(), -101) as ParamMap?
        }
        if (class348_sub42_sub1 != null) return class348_sub42_sub1
        val `is`: ByteArray?
        synchronized(aJs5Archive_1141!!) {
            `is` = aJs5Archive_1141.method410(-1860, 26, i)
        }
        class348_sub42_sub1 = ParamMap()
        if (`is` != null) class348_sub42_sub1.method3168(ByteBuffer(`is`), (-101).toByte())
        synchronized(aLruByteCache_1145) {
            aLruByteCache_1145.method582(class348_sub42_sub1, i.toLong(), (-114).toByte())
        }
        return class348_sub42_sub1
    }

    init {
        try {
            aJs5Archive_1141 = js5Archive
            aJs5Archive_1141!!.method407(0, 26)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("kb.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }
}
