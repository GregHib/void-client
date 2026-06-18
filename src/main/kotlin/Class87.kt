import CharCountUtil.method256
import GraphicsOptionState.Companion.method1711
import Class52.Companion.method494

/* Class87 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class Class87 internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?, js5Archive_6_: Js5Archive?, js5Archive_7_: Js5Archive?) {
    private var aClass60_1487: Class60? = Class60(64)
    private val aJs5Archive_1488: Js5Archive?
    private var aClass60_1491: Class60? = Class60(100)

    fun method834(i: Byte) {
        synchronized(aClass60_1487!!) {
            aClass60_1487!!.method590(0)
            if (i >= -43) method838(-67)
        }
        anInt1490++
        synchronized(aClass60_1491!!) {
            aClass60_1491!!.method590(0)
        }
    }

    fun method835(i: Int, i_0_: Int): WidgetDefinition {
        anInt1483++
        var widgetDefinition: WidgetDefinition?
        synchronized(aClass60_1487!!) {
            widgetDefinition = aClass60_1487!!.method583(i.toLong(), i_0_ + -68) as WidgetDefinition?
        }
        if (i_0_ != 7) aClass60_1491 = null
        if (widgetDefinition != null) return widgetDefinition
        val `is`: ByteArray?
        synchronized(aJs5Archive_1488!!) {
            `is` = aJs5Archive_1488.method410(-1860, method256(i, 125.toByte()), method494(i_0_ xor 0x55, i))
        }
        widgetDefinition = WidgetDefinition()
        widgetDefinition.anInt269 = i
        widgetDefinition.aClass87_251 = this
        if (`is` != null) widgetDefinition.method267(Buffer(`is`), false)
        widgetDefinition.method270(124.toByte())
        synchronized(aClass60_1487!!) {
            aClass60_1487!!.method582(widgetDefinition, i.toLong(), (-126).toByte())
        }
        return widgetDefinition
    }

    fun method836(i: Int, i_1_: Int) {
        anInt1485++
        synchronized(aClass60_1487!!) {
            aClass60_1487!!.method578(2, i)
        }
        synchronized(aClass60_1491!!) {
            aClass60_1491!!.method578(2, i)
        }
        val i_2_ = -75 % ((i_1_ - 26) / 35)
    }

    fun method838(i: Int) {
        synchronized(aClass60_1487!!) {
            aClass60_1487!!.method587(-121)
        }
        if (i != 7) method838(-111)
        anInt1489++
        synchronized(aClass60_1491!!) {
            aClass60_1491!!.method587(-127)
        }
    }

    fun method839(i: Int, i_5_: Int): TextureMaterialGroup? {
        anInt1484++
        var class348_sub42_sub17: TextureMaterialGroup?
        synchronized(aClass60_1491!!) {
            if (i_5_ != 3) aClass60_1487 = null
            class348_sub42_sub17 = aClass60_1491!!.method583(i.toLong(), -60) as TextureMaterialGroup?
            if (class348_sub42_sub17 == null) {
                class348_sub42_sub17 = TextureMaterialGroup(i)
                aClass60_1491!!.method582(class348_sub42_sub17, i.toLong(), (-127).toByte())
            }
            if (!class348_sub42_sub17.method3268(-122)) return null
        }
        return class348_sub42_sub17
    }

    init {
        try {
            aJs5Archive_1488 = js5Archive
            if (aJs5Archive_1488 != null) {
                val i_8_ = aJs5Archive_1488.method414(-1) + -1
                aJs5Archive_1488.method407(0, i_8_)
            }
            method1711(7, js5Archive_6_, 2, js5Archive_7_)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatch.method2929(runtimeexception, ("lfa.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_6_ != null) "{...}" else "null") + ',' + (if (js5Archive_7_ != null) "{...}" else "null") + ')'))
        }
    }

    companion object {
        @JvmField
        var anInt1483: Int = 0
        @JvmField
        var anInt1484: Int = 0
        @JvmField
        var anInt1485: Int = 0
        @JvmField
        var anInt1486: Int = 0
        @JvmField
        var anInt1489: Int = 0
        @JvmField
        var anInt1490: Int = 0
        @JvmStatic
        fun method837(i: Int, bool: Boolean, i_3_: Int, i_4_: Int): Int {
            var i_4_ = i_4_
            i_4_ = i_4_ and 0x3
            anInt1486++
            if (i_4_ == 0) return i_3_
            if (bool != true) return -75
            if (i_4_ == 1) return 7 - i
            if (i_4_ == 2) return 7 - i_3_
            return i
        }
    }
}
