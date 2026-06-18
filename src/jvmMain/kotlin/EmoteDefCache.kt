/* Class326 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class EmoteDefCache internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aJs5Archive_4085: Js5Archive?
    private var aLruByteCache_4087: LruByteCache? = LruByteCache(64)
    fun method2600(i: Int, i_0_: Int): EmoteDefinition {
        anInt4084++
        var emoteDefinition: EmoteDefinition?
        withLock(aLruByteCache_4087!!) {
            emoteDefinition = aLruByteCache_4087!!.method583(i.toLong(), -67) as EmoteDefinition?
        }
        if (emoteDefinition != null) return emoteDefinition
        if (i_0_ != 28364) anInt4086 = 117
        val `is`: ByteArray?
        withLock(aJs5Archive_4085!!) {
            `is` = aJs5Archive_4085.method410(-1860, 11, i)
        }
        emoteDefinition = EmoteDefinition()
        if (`is` != null) emoteDefinition.method1924(ByteBuffer(`is`), (-127).toByte())
        withLock(aLruByteCache_4087!!) {
            aLruByteCache_4087!!.method582(emoteDefinition, i.toLong(), (-114).toByte())
        }
        return emoteDefinition
    }

    fun method2601(i: Byte) {
        withLock(aLruByteCache_4087!!) {
            aLruByteCache_4087!!.method590(0)
            val i_1_ = -46 / ((i - 3) / 47)
        }
        anInt4088++
    }

    fun method2602(i: Int) {
        anInt4089++
        withLock(aLruByteCache_4087!!) {
            aLruByteCache_4087!!.method587(-91)
            if (i != 0) aLruByteCache_4087 = null
        }
    }

    fun method2603(i: Int, i_2_: Int) {
        withLock(aLruByteCache_4087!!) {
            if (i_2_ != 11) return
            aLruByteCache_4087!!.method578(2, i)
        }
        anInt4083++
    }

    init {
        do {
            try {
                aJs5Archive_4085 = js5Archive
                if (aJs5Archive_4085 == null) break
                aJs5Archive_4085.method407(0, 11)
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("dc.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {
        var anInt4083: Int = 0
        var anInt4084: Int = 0
        @JvmField
        var anInt4086: Int = 0
        var anInt4088: Int = 0
        var anInt4089: Int = 0
    }
}
