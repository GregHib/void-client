import MapSceneDefLoaderStatics.anInt2484
import MapSceneDefLoaderStatics.anInt2485
import MapSceneDefLoaderStatics.anInt2486
import MapSceneDefLoaderStatics.anInt2487

/* Class185 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MapSceneDefLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aLruByteCache_2479 = LruByteCache(64)
    private val aJs5Archive_2480: Js5Archive?
    fun method1390(i: Int) {
        synchronized(aLruByteCache_2479) {
            val i_0_ = 25 / ((i - 69) / 33)
            aLruByteCache_2479.method587(-98)
        }
        anInt2486++
    }

    fun method1391(i: Byte, i_1_: Int): CameraConfigDefinition {
        anInt2485++
        var cameraConfigDefinition: CameraConfigDefinition?
        synchronized(aLruByteCache_2479) {
            cameraConfigDefinition = aLruByteCache_2479.method583(i_1_.toLong(), 96) as CameraConfigDefinition?
        }
        if (cameraConfigDefinition != null) return cameraConfigDefinition
        val `is`: ByteArray?
        synchronized(aJs5Archive_2480!!) {
            `is` = aJs5Archive_2480.method410(-1860, 31, i_1_)
        }
        cameraConfigDefinition = CameraConfigDefinition()
        val i_2_ = 50 / ((i - -63) / 56)
        if (`is` != null) cameraConfigDefinition.method1921((-69).toByte(), ByteBuffer(`is`))
        synchronized(aLruByteCache_2479) {
            aLruByteCache_2479.method582(cameraConfigDefinition, i_1_.toLong(), (-108).toByte())
        }
        return cameraConfigDefinition
    }

    fun method1392(i: Int, i_3_: Int) {
        synchronized(aLruByteCache_2479) {
            aLruByteCache_2479.method578(2, i_3_)
        }
        if (i >= 12) anInt2484++
    }

    fun method1393(i: Byte) {
        synchronized(aLruByteCache_2479) {
            aLruByteCache_2479.method590(0)
            val i_4_ = -89 % ((42 - i) / 50)
        }
        anInt2487++
    }

    init {
        try {
            aJs5Archive_2480 = js5Archive
            aJs5Archive_2480!!.method407(0, 31)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("qf.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }
}
