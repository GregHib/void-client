import ChatEffectsOptionStateStatics.method1731
import BrightnessOptionStateStatics.method1745
import FixedFunctionMaterialPassStatics.method2146
import WaterMaterialPassStatics.method2148
import WallEntityStatics.method2485
import SpriteBlitter.method881
import NpcDefinitionCacheStatics.method1980
import NpcDefinitionCacheStatics.anInt3315
import NpcDefinitionCacheStatics.anInt3316
import NpcDefinitionCacheStatics.anInt3317
import NpcDefinitionCacheStatics.anInt3320

/* Class261 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class NpcDefinitionCache internal constructor(sceneProjector: SceneProjector?, i: Int, js5Archive: Js5Archive?) {
    private val aJs5Archive_3319: Js5Archive?
    private val aLruByteCache_3321 = LruByteCache(64)
    fun method1983(i: Int, i_9_: Int): NpcDefinition {
        anInt3320++
        var npcDefinition: NpcDefinition?
        synchronized(aLruByteCache_3321) {
            npcDefinition = aLruByteCache_3321.method583(i.toLong(), 69) as NpcDefinition?
        }
        if (npcDefinition != null) return npcDefinition
        val `is`: ByteArray?
        synchronized(aJs5Archive_3319!!) {
            `is` = aJs5Archive_3319.method410(-1860, i_9_, i)
        }
        npcDefinition = NpcDefinition()
        if (`is` != null) npcDefinition.method1620(ByteBuffer(`is`), -108)
        synchronized(aLruByteCache_3321) {
            aLruByteCache_3321.method582(npcDefinition, i.toLong(), (-109).toByte())
        }
        return npcDefinition
    }

    fun method1984(i: Byte, i_10_: Int) {
        synchronized(aLruByteCache_3321) {
            aLruByteCache_3321.method578(2, i_10_)
        }
        anInt3315++
        if (i < 36) method1980(-32)
    }

    fun method1985(i: Int) {
        anInt3317++
        synchronized(aLruByteCache_3321) {
            aLruByteCache_3321.method590(i)
        }
    }

    fun method1986(i: Byte) {
        synchronized(aLruByteCache_3321) {
            aLruByteCache_3321.method587(-112)
        }
        val i_11_ = 119 / ((i - 47) / 55)
        anInt3316++
    }

    init {
        try {
            aJs5Archive_3319 = js5Archive
            aJs5Archive_3319!!.method407(0, 32)
        } catch (runtimeexception: RuntimeException) {
            throw SoundBankPatchStatics.method2929(runtimeexception, ("uga.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + (if (js5Archive != null) "{...}" else "null") + ')'))
        }
    }
}
