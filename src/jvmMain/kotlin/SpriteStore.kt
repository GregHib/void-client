/* Class25 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SpriteStore internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private var aLruByteCache_360: LruByteCache? = LruByteCache(16)
    private var aJs5Archive_366: Js5Archive? = null
    fun method299(i: Int, i_0_: Int) {
        if (i_0_ != 16) aJs5Archive_366 = null
        withLock(aLruByteCache_360!!) {
            aLruByteCache_360!!.method578(2, i)
        }
        anInt365++
    }

    fun method300(i: Byte) {
        anInt371++
        val i_1_ = 111 % ((i - -40) / 57)
        withLock(aLruByteCache_360!!) {
            aLruByteCache_360!!.method590(0)
        }
    }

    fun method301(i: Int, i_2_: Int): WidgetTextConfig {
        anInt361++
        var widgetTextConfig: WidgetTextConfig?
        withLock(aLruByteCache_360!!) {
            widgetTextConfig = aLruByteCache_360!!.method583(i.toLong(), -91) as WidgetTextConfig?
        }
        if (widgetTextConfig != null) return widgetTextConfig
        val `is`: ByteArray?
        withLock(aJs5Archive_366!!) {
            `is` = aJs5Archive_366!!.method410(-1860, 30, i)
        }
        if (i_2_ < 6) aLruByteCache_360 = null
        widgetTextConfig = WidgetTextConfig()
        if (`is` != null) widgetTextConfig.method364(ByteBuffer(`is`), 54.toByte())
        withLock(aLruByteCache_360!!) {
            aLruByteCache_360!!.method582(widgetTextConfig, i.toLong(), (-109).toByte())
        }
        return widgetTextConfig
    }

    fun method302(i: Int) {
        withLock(aLruByteCache_360!!) {
            if (i != -797644856) aAbstractModelRendererArray367 = null
            aLruByteCache_360!!.method587(i xor 0x2f8b186f)
        }
        anInt372++
    }

    init {
        try {
            aJs5Archive_366 = js5Archive
            aJs5Archive_366!!.method407(0, 30)
        } catch (runtimeexception: RuntimeException) {
            throw TextureLoadException.method2929(runtimeexception, ("hq.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }

    companion object {

        var anInt361: Int = 0

        var anInt363: Int = 0

        var anInt365: Int = 0

        var aAbstractModelRendererArray367: Array<AbstractModelRenderer?>? = null

        var aBoolean368: Boolean = false

        var anIntArray369: IntArray? = null

        var anInt370: Int = 0

        var anInt371: Int = 0

        var anInt372: Int = 0


        fun method304(i: Int, i_10_: Int, i_11_: Int) {
            anInt363++
            if (i_10_ != 437853543) aBoolean368 = true
            val class348_sub42_sub15 = ConfigValueProvider.method2516(i_11_, 105.toByte(), 16)
            class348_sub42_sub15.method3246(-25490)
            class348_sub42_sub15.anInt9652 = i
        }

    }
}
