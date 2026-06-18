/* Class226 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class TextureDefinitionCache internal constructor(i: Int, js5Archive: Js5Archive?, js5Archive_3_: Js5Archive?) {
    private val aLruByteCache_2960 = LruByteCache(64)
    private val aJs5Archive_2961: Js5Archive?
    private var aJs5Archive_2965: Js5Archive? = null

    fun method1625(i: Int, i_0_: Int): CharCodeMap {
        anInt2963++
        var class348_sub42_sub11 = aLruByteCache_2960.method583(i_0_.toLong(), -51) as CharCodeMap?
        if (class348_sub42_sub11 != null) return class348_sub42_sub11
        val `is`: ByteArray?
        if (i_0_ < 32768) `is` = aJs5Archive_2961!!.method410(-1860, 0, i_0_)
        else `is` = aJs5Archive_2965!!.method410(-1860, 0, 0x7fff and i_0_)
        class348_sub42_sub11 = CharCodeMap()
        if (`is` != null) class348_sub42_sub11.method3221(117, ByteBuffer(`is`))
        if (i_0_ >= 32768) class348_sub42_sub11.method3224(104.toByte())
        if (i != 0) aJs5Archive_2965 = null
        aLruByteCache_2960.method582(class348_sub42_sub11, i_0_.toLong(), (-123).toByte())
        return class348_sub42_sub11
    }

    init {
        do {
            try {
                aJs5Archive_2961 = js5Archive
                aJs5Archive_2965 = js5Archive_3_
                if (aJs5Archive_2961 != null) aJs5Archive_2961.method407(0, 0)
                if (aJs5Archive_2965 == null) break
                aJs5Archive_2965!!.method407(0, 0)
            } catch (runtimeexception: RuntimeException) {
                throw TextureLoadException.method2929(runtimeexception, ("sga.<init>(" + i + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_3_ != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {
        @JvmField
        var aHashtable_2959: Hashtable? = Hashtable(512)
        var anInt2962: Int = 0
        var anInt2963: Int = 0
        @JvmField
        var anInt2964: Int = 64
        @JvmStatic
        fun method1624(i: Int) {
            aHashtable_2959 = null
            if (i != 28962) aHashtable_2959 = null
        }

        @JvmStatic
        fun method1626(i: Int, bool: Boolean) {
            anInt2962++
            var i_1_ = NoOpGraphicsOptionState.anInt6043
            var i_2_ = AnimationFrameDefinition.anInt6964
            if (i == 1) {
                if (bool && ParticleSystemRenderer.aBoolean3870) {
                    i_1_ = i_1_ shl 1
                    i_2_ = -i_1_
                }
                FacingDirectionNode.aRenderer6654!!.f(i_2_, i_1_)
            }
        }
    }
}
