/* Class271 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ParticleEffectCache internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aClass60_3466 = Class60(64)
    private val aJs5Archive_3468: Js5Archive?
    fun method2044(i: Int, i_0_: Int): ConfigShortValueNode {
        anInt3469++
        var class348_sub42_sub7: ConfigShortValueNode?
        synchronized(aClass60_3466) {
            class348_sub42_sub7 = aClass60_3466.method583(i_0_.toLong(), -85) as ConfigShortValueNode?
        }
        if (class348_sub42_sub7 != null) return class348_sub42_sub7
        val `is`: ByteArray?
        synchronized(aJs5Archive_3468!!) {
            `is` = aJs5Archive_3468.method410(-1860, 5, i_0_)
        }
        class348_sub42_sub7 = ConfigShortValueNode()
        if (i < 78) method2046()
        if (`is` != null) class348_sub42_sub7.method3192(16.toByte(), Buffer(`is`))
        synchronized(aClass60_3466) {
            aClass60_3466.method582(class348_sub42_sub7, i_0_.toLong(), (-93).toByte())
        }
        return class348_sub42_sub7
    }

    init {
        try {
            aJs5Archive_3468 = js5Archive
            aJs5Archive_3468!!.method407(0, 5)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("ut.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        var aIntRange_3467: IntRange? = IntRange(45, 8)
        var anInt3469: Int = 0

        @JvmStatic
        fun method2045(i: Byte) {
            aIntRange_3467 = null
            if (i.toInt() != 62) method2046()
        }

        fun method2046() {
            Class71.aClass76_1208 = Class71.aClass76_1210
        }
    }
}
