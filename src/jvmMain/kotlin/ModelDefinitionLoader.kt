import ModelDefinitionLoaderStatics.anInt2049
import ModelDefinitionLoaderStatics.anInt2051
import ModelDefinitionLoaderStatics.anInt2055
import ModelDefinitionLoaderStatics.anInt2056

/* Class150 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ModelDefinitionLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?, js5Archive_9_: Js5Archive?) {
    private var aJs5Archive_2048: Js5Archive? = null
    private val aLruByteCache_2050 = LruByteCache(64)
    var aJs5Archive_2054: Js5Archive? = null
    fun method1203(i: Byte, i_3_: Int): SkeletalAnimFrameLoader {
        anInt2056++
        if (i.toInt() != 33) aJs5Archive_2048 = null
        var skeletalAnimFrameLoader: SkeletalAnimFrameLoader?
        synchronized(aLruByteCache_2050) {
            skeletalAnimFrameLoader = aLruByteCache_2050.method583(i_3_.toLong(), -58) as SkeletalAnimFrameLoader?
        }
        if (skeletalAnimFrameLoader != null) return skeletalAnimFrameLoader
        val `is`: ByteArray?
        synchronized(aJs5Archive_2048!!) {
            `is` = aJs5Archive_2048!!.method410(i + -1893, 3, i_3_)
        }
        skeletalAnimFrameLoader = SkeletalAnimFrameLoader()
        skeletalAnimFrameLoader.aModelDefinitionLoader_475 = this
        if (`is` != null) skeletalAnimFrameLoader.method346(i.toInt().inv(), ByteBuffer(`is`))
        synchronized(aLruByteCache_2050) {
            aLruByteCache_2050.method582(skeletalAnimFrameLoader, i_3_.toLong(), (-109).toByte())
        }
        return skeletalAnimFrameLoader
    }

    fun method1204(i: Int) {
        synchronized(aLruByteCache_2050) {
            aLruByteCache_2050.method587(-93)
        }
        anInt2049++
        if (i != 0) aJs5Archive_2048 = null
    }

    fun method1206(i: Byte) {
        if (i.toInt() != -37) aJs5Archive_2048 = null
        anInt2051++
        synchronized(aLruByteCache_2050) {
            aLruByteCache_2050.method590(0)
        }
    }

    fun method1207(i: Int, i_7_: Int) {
        anInt2055++
        if (i == -17452) {
            synchronized(aLruByteCache_2050) {
                aLruByteCache_2050.method578(i + 17454, i_7_)
            }
        }
    }

    init {
        try {
            this.aJs5Archive_2054 = js5Archive_9_
            aJs5Archive_2048 = js5Archive
            aJs5Archive_2048!!.method407(0, 3)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("oha.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_9_ != null) "{...}" else "null") + ')'))
        }
    }
}
