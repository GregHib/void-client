import CharCountUtil.method256
import GraphicsOptionStateStatics.method1711
import RsaVarbitHandlerStatics.method494
import WidgetCacheStatics.anInt1483
import WidgetCacheStatics.anInt1484
import WidgetCacheStatics.anInt1485
import WidgetCacheStatics.anInt1489
import WidgetCacheStatics.anInt1490

/* Class87 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class WidgetCache internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?, js5Archive_6_: Js5Archive?, js5Archive_7_: Js5Archive?) {
    private var aLruByteCache_1487: LruByteCache? = LruByteCache(64)
    private val aJs5Archive_1488: Js5Archive?
    private var aLruByteCache_1491: LruByteCache? = LruByteCache(100)

    fun method834(i: Byte) {
        synchronized(aLruByteCache_1487!!) {
            aLruByteCache_1487!!.method590(0)
            if (i >= -43) method838(-67)
        }
        anInt1490++
        synchronized(aLruByteCache_1491!!) {
            aLruByteCache_1491!!.method590(0)
        }
    }

    fun method835(i: Int, i_0_: Int): WidgetDefinition {
        anInt1483++
        var widgetDefinition: WidgetDefinition?
        synchronized(aLruByteCache_1487!!) {
            widgetDefinition = aLruByteCache_1487!!.method583(i.toLong(), i_0_ + -68) as WidgetDefinition?
        }
        if (i_0_ != 7) aLruByteCache_1491 = null
        if (widgetDefinition != null) return widgetDefinition
        val `is`: ByteArray?
        synchronized(aJs5Archive_1488!!) {
            `is` = aJs5Archive_1488.method410(-1860, method256(i, 125.toByte()), method494(i_0_ xor 0x55, i))
        }
        widgetDefinition = WidgetDefinition()
        widgetDefinition.anInt269 = i
        widgetDefinition.aWidgetCache_251 = this
        if (`is` != null) widgetDefinition.method267(ByteBuffer(`is`), false)
        widgetDefinition.method270(124.toByte())
        synchronized(aLruByteCache_1487!!) {
            aLruByteCache_1487!!.method582(widgetDefinition, i.toLong(), (-126).toByte())
        }
        return widgetDefinition
    }

    fun method836(i: Int, i_1_: Int) {
        anInt1485++
        synchronized(aLruByteCache_1487!!) {
            aLruByteCache_1487!!.method578(2, i)
        }
        synchronized(aLruByteCache_1491!!) {
            aLruByteCache_1491!!.method578(2, i)
        }
        val i_2_ = -75 % ((i_1_ - 26) / 35)
    }

    fun method838(i: Int) {
        synchronized(aLruByteCache_1487!!) {
            aLruByteCache_1487!!.method587(-121)
        }
        if (i != 7) method838(-111)
        anInt1489++
        synchronized(aLruByteCache_1491!!) {
            aLruByteCache_1491!!.method587(-127)
        }
    }

    fun method839(i: Int, i_5_: Int): TextureMaterialGroup? {
        anInt1484++
        var class348_sub42_sub17: TextureMaterialGroup?
        synchronized(aLruByteCache_1491!!) {
            if (i_5_ != 3) aLruByteCache_1487 = null
            class348_sub42_sub17 = aLruByteCache_1491!!.method583(i.toLong(), -60) as TextureMaterialGroup?
            if (class348_sub42_sub17 == null) {
                class348_sub42_sub17 = TextureMaterialGroup(i)
                aLruByteCache_1491!!.method582(class348_sub42_sub17, i.toLong(), (-127).toByte())
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
            throw SoundBankPatchStatics.method2929(runtimeexception, ("lfa.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_6_ != null) "{...}" else "null") + ',' + (if (js5Archive_7_ != null) "{...}" else "null") + ')'))
        }
    }
}
