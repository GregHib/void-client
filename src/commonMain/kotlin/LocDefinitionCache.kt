/* Class268 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class LocDefinitionCache internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    var anInt3429: Int = 0
    private val aLruByteCache_3433 = LruByteCache(64)
    private var aJs5Archive_3442: Js5Archive?

    var anInt3447: Int = 0
    fun method2032(i: Int, i_3_: Int) {
        withLock(aLruByteCache_3433) {
            aLruByteCache_3433.method578(2, i)
//            if (i_3_ > -10) method2035(116, 38)
        }
        anInt3436++
    }

    fun method2033(i: Byte) {
        anInt3434++
        withLock(aLruByteCache_3433) {
            if (i.toInt() != 46) method2037(-66)
            aLruByteCache_3433.method587(-94)
        }
    }

    fun method2034(i: Int, bool: Boolean): LocTypeConfig {
        if (bool != false) aShortArray3437 = null
        anInt3431++
        var locTypeConfig: LocTypeConfig? = null
        withLock(aLruByteCache_3433) {
            locTypeConfig = aLruByteCache_3433.method583(i.toLong(), 64) as LocTypeConfig?
        }
        if (locTypeConfig != null) return locTypeConfig
        var `is`: ByteArray? = null
        withLock(aJs5Archive_3442!!) {
            `is` = aJs5Archive_3442!!.method410(-1860, 4, i)
        }
        locTypeConfig = LocTypeConfig()
        locTypeConfig.anInt3573 = i
        locTypeConfig.aLocDefinitionCache_3562 = this
        if (`is` != null) locTypeConfig.method2070(true, ByteBuffer(`is`))
        locTypeConfig.method2067(-4860)
        withLock(aLruByteCache_3433) {
            aLruByteCache_3433.method582(locTypeConfig, i.toLong(), (-111).toByte())
        }
        return locTypeConfig
    }

    fun method2037(i: Int) {
        withLock(aLruByteCache_3433) {
            aLruByteCache_3433.method590(0)
        }
        anInt3440++
    }

    init {
        try {
            aJs5Archive_3442 = js5Archive
            this.anInt3429 = aJs5Archive_3442!!.method407(0, 4)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("cb.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        private var aShortArray3430: ShortArray? = shortArrayOf(-1, -1, -1, -1, -1)
        var anInt3431: Int = 0

        var anIntArray3432: IntArray? = IntArray(500)
        var anInt3434: Int = 0
        var anInt3435: Int = -1
        var anInt3436: Int = 0
        private var aShortArray3437: ShortArray? = shortArrayOf(-1, -1, -1, -1, -1)

        var aBooleanArray3438: BooleanArray? = BooleanArray(100)

        var anInt3439: Int = 16777215
        var anInt3440: Int = 0

        var anInt3441: Int = 0
        private var aShortArray3449: ShortArray? = shortArrayOf(6798, 8741, 25238, 4626, 4550)

        var aShortArrayArray3443: Array<ShortArray?>? = arrayOf<ShortArray?>(aShortArray3449, aShortArray3437, aShortArray3430)

        var anInt3444: Int = 13156520
        var anInt3448: Int = 0

        fun method2031(i: Int, string: String): Long {
            anInt3448++
            var l = 0L
            val i_0_ = string.length
            for (i_1_ in 0..<i_0_) {
                l *= 37L
                val i_2_ = string.get(i_1_).code
                if (i_2_ < 65 || i_2_ > 90) {
                    if (i_2_ >= 97 && i_2_ <= 122) l += (1 - (-i_2_ + 97)).toLong()
                    else if (i_2_ >= 48 && i_2_ <= 57) l += (i_2_ + 27 - 48).toLong()
                } else l += (1 + (i_2_ + -65)).toLong()
                if (l >= 177917621779460413L) break
            }
            if (i != -1994) aShortArrayArray3443 = null
            while ( /**/(l % 37L == 0L && l != 0L)) {
                l /= 37L
            }
            return l
        }


        @JvmStatic
        fun method2036(i: Byte) {
            aShortArrayArray3443 = null
            aShortArray3437 = null
//            if (i.toInt() != 121) method2035(57, 35)
            aShortArray3449 = null
            aShortArray3430 = null
            anIntArray3432 = null
            aBooleanArray3438 = null
        }
    }
}
