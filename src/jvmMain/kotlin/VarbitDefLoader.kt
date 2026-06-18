import GrowableStringList.Companion.method1359

/* Class194 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class VarbitDefLoader internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private var aLruByteCache_2594: LruByteCache? = LruByteCache(64)
    private val aJs5Archive_2597: Js5Archive?
    fun method1442(i: Int, i_0_: Byte) {
        anInt2598++
        withLock(aLruByteCache_2594!!) {
            if (i_0_.toInt() != 1) aLruByteCache_2594 = null
            aLruByteCache_2594!!.method578(2, i)
        }
    }

    fun method1443(i: Int) {
        anInt2595++
        val i_1_ = 14 % ((-39 - i) / 51)
        withLock(aLruByteCache_2594!!) {
            aLruByteCache_2594!!.method587(-80)
        }
    }

    fun method1444(i: Int, i_2_: Int) {
        val i_3_ = -6 % ((67 - i_2_) / 47)
        anInt2591++
        withLock(aLruByteCache_2594!!) {
            aLruByteCache_2594!!.method590(0)
            aLruByteCache_2594 = LruByteCache(i)
        }
    }

    fun method1445(i: Int) {
        anInt2592++
        if (i == 64) {
            withLock(aLruByteCache_2594!!) {
                aLruByteCache_2594!!.method590(0)
            }
        }
    }

    fun method1446(i: Int, i_4_: Int): HitsplatDefinition? {
        anInt2593++
        var hitsplatDefinition: HitsplatDefinition?
        withLock(aLruByteCache_2594!!) {
            hitsplatDefinition = aLruByteCache_2594!!.method583(i.toLong(), 76) as HitsplatDefinition?
        }
        if (hitsplatDefinition != null) return hitsplatDefinition
        val `is`: ByteArray?
        withLock(aJs5Archive_2597!!) {
            `is` = aJs5Archive_2597.method410(i_4_ xor 0x743, method1359(true, i), LongKeyNode.method2806(false, i))
        }
        hitsplatDefinition = HitsplatDefinition()
        if (i_4_ != -1) return null
        if (`is` != null) hitsplatDefinition.method1191(i_4_ xor 0x800.inv(), ByteBuffer(`is`))
        withLock(aLruByteCache_2594!!) {
            aLruByteCache_2594!!.method582(hitsplatDefinition, i.toLong(), (-105).toByte())
        }
        return hitsplatDefinition
    }

    init {
        do {
            try {
                aJs5Archive_2597 = js5Archive
                if (aJs5Archive_2597 == null) break
                val i_5_ = aJs5Archive_2597.method414(-1) + -1
                aJs5Archive_2597.method407(0, i_5_)
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatch.method2929(runtimeexception, ("qs.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {
        var anInt2591: Int = 0
        var anInt2592: Int = 0
        var anInt2593: Int = 0
        var anInt2595: Int = 0
        var aSoundChannelMixer_2596: SoundChannelMixer? = null
        var anInt2598: Int = 0

        @JvmStatic
        fun method1441(i: Byte) {
            aSoundChannelMixer_2596 = null
            if (i.toInt() != 18) aSoundChannelMixer_2596 = null
        }
    }
}
