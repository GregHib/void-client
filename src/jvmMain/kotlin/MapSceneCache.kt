import MapSceneCacheStatics.method825
import MapSceneCacheStatics.anInt1452
import MapSceneCacheStatics.anInt1453
import MapSceneCacheStatics.anInt1455
import MapSceneCacheStatics.anInt1457
import MapSceneCacheStatics.anInt1458

/* Class84 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class MapSceneCache internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aLruByteCache_1449 = LruByteCache(16)
    private val aJs5Archive_1460: Js5Archive?

    fun method816(bool: Boolean) {
        anInt1455++
        synchronized(aLruByteCache_1449) {
            if (bool != false) method819(107.toByte(), 46)
            aLruByteCache_1449.method587(-119)
        }
    }

    fun method819(i: Byte, i_14_: Int) {
        synchronized(aLruByteCache_1449) {
            aLruByteCache_1449.method578(2, i_14_)
        }
        anInt1457++
    }

    private fun method820(i: Int, i_15_: Int): ParticleConfigParser {
        anInt1458++
        var particleConfigParser: ParticleConfigParser?
        synchronized(aLruByteCache_1449) {
            particleConfigParser = aLruByteCache_1449.method583(i.toLong(), 116) as ParticleConfigParser?
        }
        if (particleConfigParser != null) return particleConfigParser!!
        val `is`: ByteArray?
        synchronized(aJs5Archive_1460!!) {
            `is` = aJs5Archive_1460.method410(-1860, i_15_, i)
        }
        particleConfigParser = ParticleConfigParser()
        if (`is` != null) particleConfigParser!!.method2275(ByteBuffer(`is`), (-123).toByte())
        synchronized(aLruByteCache_1449) {
            aLruByteCache_1449.method582(particleConfigParser, i.toLong(), (-106).toByte())
        }
        return particleConfigParser!!
    }

    fun method822(i: Byte) {
        synchronized(aLruByteCache_1449) {
            aLruByteCache_1449.method590(0)
        }
        if (i >= -13) method825(14)
        anInt1452++
    }

    fun method823(i: Int, i_17_: Int, i_18_: Int, i_19_: Int, spriteStore: SpriteStore, i_20_: Int): ParticleSystemRenderer? {
        anInt1453++
        var hintArrowRenderers: Array<HintArrowRenderer?>? = null
        val class300 = method820(i_20_, 29)
        if (i_19_ > -36) return null
        if (class300.anIntArray3821 != null) {
            hintArrowRenderers = arrayOfNulls<HintArrowRenderer>(class300.anIntArray3821!!.size)
            var i_21_ = 0
            while (hintArrowRenderers.size > i_21_) {
                val class38 = spriteStore.method301((class300.anIntArray3821!![i_21_]), 29)
                hintArrowRenderers[i_21_] = HintArrowRenderer(class38.anInt498, class38.anInt504, class38.anInt499, class38.anInt502, class38.anInt508, class38.anInt501, class38.anInt503, class38.aBoolean507)
                i_21_++
            }
        }
        return ParticleSystemRenderer(class300.anInt3817, hintArrowRenderers, class300.anInt3823, i_18_, i, i_17_)
    }

    init {
        try {
            aJs5Archive_1460 = js5Archive
            aJs5Archive_1460!!.method407(0, 29)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("lca.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }
}
