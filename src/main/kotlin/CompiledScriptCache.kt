import SoundBankPatch.Companion.method2929

/* Class355 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class CompiledScriptCache internal constructor(i: Int, js5Archive: Js5Archive?, js5Archive_1_: Js5Archive?, interface15: Interface15?) {
    private val aClass60_4362: Class60
    var anInt4364: Int = 0
    var anInt4365: Int = 0
    private var aJs5Archive_4368: Js5Archive? = null
    private val aJs5Archive_4369: Js5Archive?
    private var anInterface15_4373: Interface15?

    fun method3471(i: Int, i_0_: Byte): ParameterizedText {
        anInt4363++
        var class348_sub42_sub10 = aClass60_4362.method583(i.toLong(), 70) as ParameterizedText?
        if (class348_sub42_sub10 != null) return class348_sub42_sub10
        val `is`: ByteArray?
        if (i >= 32768) `is` = aJs5Archive_4369!!.method410(-1860, 1, 0x7fff and i)
        else `is` = aJs5Archive_4368!!.method410(-1860, 1, i)
        class348_sub42_sub10 = ParameterizedText()
        class348_sub42_sub10.aCompiledScriptCache_9567 = this
        if (`is` != null) class348_sub42_sub10.method3218(Buffer(`is`), 0)
        if (i_0_ >= -86) method3473(-12)
        if (i >= 32768) class348_sub42_sub10.method3209(false)
        aClass60_4362.method582(class348_sub42_sub10, i.toLong(), (-125).toByte())
        return class348_sub42_sub10
    }

    fun method3472(l: Long, `is`: IntArray?, i: Int, rectangleRegion: RectangleRegion?): String {
        try {
            if (i != -1) aJs5Archive_4368 = null
            anInt4370++
            if (anInterface15_4373 != null) {
                val string = anInterface15_4373!!.method54(1, l, rectangleRegion, `is`)
                if (string != null) return string
            }
            return l.toString()
        } catch (runtimeexception: RuntimeException) {
            throw method2929(runtimeexception, ("aha.D(" + l + ',' + (if (`is` != null) "{...}" else "null") + ',' + i + ',' + (if (rectangleRegion != null) "{...}" else "null") + ')'))
        }
    }

    init {
        aClass60_4362 = Class60(64)
        anInterface15_4373 = null
        do {
            try {
                anInterface15_4373 = interface15
                aJs5Archive_4368 = js5Archive
                aJs5Archive_4369 = js5Archive_1_
                if (aJs5Archive_4368 != null) this.anInt4365 = aJs5Archive_4368!!.method407(0, 1)
                if (aJs5Archive_4369 == null) break
                this.anInt4364 = aJs5Archive_4369.method407(0, 1)
            } catch (runtimeexception: RuntimeException) {
                throw method2929(runtimeexception, ("aha.<init>(" + i + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_1_ != null) "{...}" else "null") + ',' + (if (interface15 != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {
        var anInt4363: Int = 0
        var anObject4366: Any? = null
        var aLong4367: Long = -1L
        var anInt4370: Int = 0
        var anInt4371: Int = 0
        @JvmField
        var anInt4372: Int = 0
        fun method3470(i: Int) {
            if (i == 1) {
                anInt4371++
                if (!MinimapSquareDrawer.aBoolean5224) {
                    MinimapSquareDrawer.aBoolean5224 = true
                    WorldMapPolygonIconLabel.aBoolean10174 = true
                    MultiFieldRecord.aFloat6898 += (-12.0f - MultiFieldRecord.aFloat6898) / 2.0f
                }
            }
        }

        @JvmStatic
        fun method3473(i: Int) {
            if (i != 12949) anInt4372 = -30
            anObject4366 = null
        }
    }
}
