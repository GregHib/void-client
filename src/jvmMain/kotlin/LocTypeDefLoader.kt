import GlTexture1D.Companion.method1974

/* Class187 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class LocTypeDefLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private var aJs5Archive_2498: Js5Archive? = null
    private var aLruByteCache_2501: LruByteCache? = LruByteCache(64)
    fun method1404(i: Byte) {
        withLock(aLruByteCache_2501!!) {
            aLruByteCache_2501!!.method590(0)
            if (i >= -20) Companion.method1407((-33).toByte())
        }
        anInt2508++
    }

    fun method1408(i: Int, i_3_: Int): LocTypeDefinition {
        anInt2504++
        var locTypeDefinition: LocTypeDefinition?
        withLock(aLruByteCache_2501!!) {
            locTypeDefinition = aLruByteCache_2501!!.method583(i_3_.toLong(), 76) as LocTypeDefinition?
        }
        if (locTypeDefinition != null) return locTypeDefinition
        val `is`: ByteArray?
        withLock(aJs5Archive_2498!!) {
            `is` = aJs5Archive_2498!!.method410(-1860, 35, i_3_)
        }
        locTypeDefinition = LocTypeDefinition()
        if (`is` != null) locTypeDefinition.method2551(-125, ByteBuffer(`is`))
        if (i != -12637) aLruByteCache_2501 = null
        locTypeDefinition.method2548(127.toByte())
        withLock(aLruByteCache_2501!!) {
            aLruByteCache_2501!!.method582(locTypeDefinition, i_3_.toLong(), (-99).toByte())
        }
        return locTypeDefinition
    }

    fun method1409(i: Int, i_4_: Int) {
        withLock(aLruByteCache_2501!!) {
            if (i_4_ != -20721) aJs5Archive_2498 = null
            aLruByteCache_2501!!.method578(i_4_ + 20723, i)
        }
        anInt2503++
    }

    fun method1410(i: Int) {
        withLock(aLruByteCache_2501!!) {
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
                throw SoundBankPatch.method2929(runtimeexception, ("qga.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {
        @JvmField
        var anInt2499: Int = 0
        var anInt2500: Int = 0
        var anInt2502: Int = 0
        var anInt2503: Int = 0
        var anInt2504: Int = 0
        var anInt2505: Int = 0
        var anInt2506: Int = 0
        @JvmField
        var aProjectileFactory_2507: ProjectileFactory? = ProjectileFactory(9, 2)
        var anInt2508: Int = 0
        @JvmField
        var anIntArray2509: IntArray? = IntArray(2)
        @JvmField
        var anInt2510: Int = 0

        fun method1405(i: Int, bool: Boolean, bool_0_: Boolean) {
            anInt2506++
            val class348_sub13 = method1974(42.toByte(), i, bool)
            if (class348_sub13 != null && bool_0_ == true) {
                var i_1_ = 0
                while ((class348_sub13.anIntArray6757!!.size > i_1_)) {
                    class348_sub13.anIntArray6757!![i_1_] = -1
                    class348_sub13.anIntArray6758[i_1_] = 0
                    i_1_++
                }
            }
        }

        @JvmStatic
        fun method1406(bool: Boolean) {
            if (bool == true) {
                CacheStateResetter.method175((-6).toByte())
                anInt2505++
                GrayscaleNoiseTexture.aBoolean5300 = false
            }
        }

        @JvmStatic
        fun method1407(i: Byte) {
            val i_2_ = 92 / ((-3 - i) / 60)
            anIntArray2509 = null
            aProjectileFactory_2507 = null
        }
    }
}
