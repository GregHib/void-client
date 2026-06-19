import GlTexture1DStatics.method1974
import LocTypeDefLoaderStatics.anInt2502
import LocTypeDefLoaderStatics.anInt2503
import LocTypeDefLoaderStatics.anInt2504
import LocTypeDefLoaderStatics.anInt2508
import LocTypeDefLoaderStatics.method1407

/* Class187 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class LocTypeDefLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private var aJs5Archive_2498: Js5Archive? = null
    private var aLruByteCache_2501: LruByteCache? = LruByteCache(64)
    fun method1404(i: Byte) {
        synchronized(aLruByteCache_2501!!) {
            aLruByteCache_2501!!.method590(0)
            if (i >= -20) method1407((-33).toByte())
        }
        anInt2508++
    }

    fun method1408(i: Int, i_3_: Int): LocTypeDefinition {
        anInt2504++
        var locTypeDefinition: LocTypeDefinition?
        synchronized(aLruByteCache_2501!!) {
            locTypeDefinition = aLruByteCache_2501!!.method583(i_3_.toLong(), 76) as LocTypeDefinition?
        }
        if (locTypeDefinition != null) return locTypeDefinition
        val `is`: ByteArray?
        synchronized(aJs5Archive_2498!!) {
            `is` = aJs5Archive_2498!!.method410(-1860, 35, i_3_)
        }
        locTypeDefinition = LocTypeDefinition()
        if (`is` != null) locTypeDefinition.method2551(-125, ByteBuffer(`is`))
        if (i != -12637) aLruByteCache_2501 = null
        locTypeDefinition.method2548(127.toByte())
        synchronized(aLruByteCache_2501!!) {
            aLruByteCache_2501!!.method582(locTypeDefinition, i_3_.toLong(), (-99).toByte())
        }
        return locTypeDefinition
    }

    fun method1409(i: Int, i_4_: Int) {
        synchronized(aLruByteCache_2501!!) {
            if (i_4_ != -20721) aJs5Archive_2498 = null
            aLruByteCache_2501!!.method578(i_4_ + 20723, i)
        }
        anInt2503++
    }

    fun method1410(i: Int) {
        synchronized(aLruByteCache_2501!!) {
            if (i != -27995) method1409(-42, 23)
            aLruByteCache_2501!!.method587(-85)
        }
        anInt2502++
    }

    init {
        do {
            try {
                aJs5Archive_2498 = js5Archive
                if (aJs5Archive_2498 == null) break
                aJs5Archive_2498!!.method407(0, 35)
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatchStatics.method2929(runtimeexception, ("qga.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }
}
