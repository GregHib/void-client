import AbstractFrameBufferSurface.Companion.method3013
import SpriteComponent.Companion.method200
import java.awt.Point

/*
 * Class33
 */
class CacheArchiveIndexLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aJs5Archive_458: Js5Archive?
    private val aLruByteCache_460 = LruByteCache(128)
    fun method337(bool: Boolean, i: Int): CacheArchiveIndex {
        anInt457++
        var cacheArchiveIndex: CacheArchiveIndex?
        withLock(aLruByteCache_460) {
            cacheArchiveIndex = aLruByteCache_460.method583(i.toLong(), 111) as CacheArchiveIndex?
        }
        if (cacheArchiveIndex != null) return cacheArchiveIndex
        val `is` = aJs5Archive_458!!.method410(-1860, method200(-107, i), method3013(i, bool))
        cacheArchiveIndex = CacheArchiveIndex()
        if (`is` != null) cacheArchiveIndex.method1069(0, ByteBuffer(`is`))
        withLock(aLruByteCache_460) {
            aLruByteCache_460.method582(cacheArchiveIndex, i.toLong(), (-102).toByte())
        }
        return cacheArchiveIndex
    }

    init {
        do {
            try {
                aJs5Archive_458 = js5Archive
                if (aJs5Archive_458 == null) break
                val i_6_ = -1 + aJs5Archive_458.method414(-1)
                aJs5Archive_458.method407(0, i_6_)
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("iba.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {

        var anInt456: Int = 0

        var anInt457: Int = 0

        var anInt459: Int = 0

        var anInt461: Int = 0

        var aItemDefinitionLoader_3147: ItemDefinitionLoader? = null
        @JvmStatic
        fun method338(i: Int, i_0_: Int) {
            var i_0_ = i_0_
            if (i == IntHashSetStatics.aClass348_Sub51_3959!!.aClass239_Sub22_7253!!.method1815(-32350)) i_0_ = -1
            anInt456++
            if (i_0_ != GlShaderProgramHandle.anInt4179) {
                if (i_0_ != -1) {
                    val class222 = aItemDefinitionLoader_3147!!.method1287((-104).toByte(), i_0_)
                    val class207 = class222.method1610(71.toByte())
                    if (class207 == null) i_0_ = -1
                    else {
                        VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.method2238(class207.method1522(), class207.method1516(), 17, Point(class222.anInt2883, class222.anInt2890), ParticleSystemRenderer.aCanvas3869, class207.method1510())
                        GlShaderProgramHandle.anInt4179 = i_0_
                    }
                }
                if (i_0_ == -1 && GlShaderProgramHandle.anInt4179 != -1) {
                    VorbisOggDecoder.aPrivilegedOperationWorker_8992!!.method2238(-1, null, i + 17, Point(), (ParticleSystemRenderer.aCanvas3869), -1)
                    GlShaderProgramHandle.anInt4179 = -1
                }
            }
        }

        fun method339(i: Int, i_1_: Int, `is`: ByteArray, i_2_: Int, i_3_: Int, i_4_: Int) {
            var i = i
            var i_2_ = i_2_
            anInt461++
            if (i_4_ > i_1_) {
                i += i_1_
                i_2_ = -i_1_ + i_4_ shr 2
                while (--i_2_ >= 0) {
                    `is`[i++] = 1.toByte()
                    `is`[i++] = 1.toByte()
                    `is`[i++] = 1.toByte()
                    `is`[i++] = 1.toByte()
                }
                if (i_3_ == 1354705384) {
                    i_2_ = 0x3 and i_4_ - i_1_
                    while (--i_2_ >= 0) `is`[i++] = 1.toByte()
                }
            }
        }

        @JvmStatic
        fun method340(i: Int, i_5_: Byte): Int {
            var i = i
            anInt459++
            i = --i or (i ushr 1)
            i = i or (i ushr 2)
            i = i or (i ushr 4)
            if (i_5_.toInt() != 108) return 34
            i = i or (i ushr 8)
            i = i or (i ushr 16)
            return 1 + i
        }
    }
}
