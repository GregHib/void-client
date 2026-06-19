import TwoStateOptionStateStatics.method1842
import MultiLevelOptionStateStatics.method1850
import SeqDefinitionCacheStatics.method2013
import SeqDefinitionCacheStatics.anInt3344
import SeqDefinitionCacheStatics.anInt3346
import SeqDefinitionCacheStatics.anIntArray3347
import SeqDefinitionCacheStatics.anInt3348
import SeqDefinitionCacheStatics.anInt3349
import SeqDefinitionCacheStatics.anInt3351
import SeqDefinitionCacheStatics.anInt3353
import SeqDefinitionCacheStatics.anInt3356
import SeqDefinitionCacheStatics.anInt3358

/* Class263 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SeqDefinitionCache internal constructor(sceneProjector: SceneProjector?, i: Int, bool: Boolean, js5Archive: Js5Archive?, js5Archive_29_: Js5Archive?) {
    private val aJs5Archive_3343: Js5Archive?
    var aJs5Archive_3345: Js5Archive? = null
    private var aLruByteCache_3350: LruByteCache?
    var aBoolean3355: Boolean = false
    var aBoolean3359: Boolean = false
    var aLruByteCache_3360: LruByteCache
    var aLruByteCache_3361: LruByteCache?
    var aLruByteCache_3362: LruByteCache?
    var anInt3363: Int = 0

    fun method2004(bool: Boolean, i: Byte) {
        anInt3346++
        if (bool == !this.aBoolean3359) {
            this.aBoolean3359 = bool
            if (i.toInt() != 25) aLruByteCache_3350 = null
            method2012(i + -23853)
        }
    }

    fun method2005(i: Int, i_0_: Int): NpcConfig {
        anInt3351++
        var npcConfig: NpcConfig?
        synchronized(aLruByteCache_3350!!) {
            npcConfig = aLruByteCache_3350!!.method583(i_0_.toLong(), i xor 0x32) as NpcConfig?
        }
        if (npcConfig != null) return npcConfig
        val `is`: ByteArray?
        synchronized(aJs5Archive_3343!!) {
            `is` = aJs5Archive_3343.method410(i + -1860, method1850(i_0_, 111), ScrollbarComponentStatics.method185(i_0_, (-90).toByte()))
        }
        npcConfig = NpcConfig()
        npcConfig.anInt941 = i_0_
        npcConfig.aSeqDefinitionCache_933 = this
        if (`is` != null) npcConfig.method479(0.toByte(), ByteBuffer(`is`))
        npcConfig.method488(-105)
        if (i != 0) this.aLruByteCache_3361 = null
        if (!this.aBoolean3359 && npcConfig.aBoolean942) {
            npcConfig.anIntArray917 = null
            npcConfig.aStringArray913 = null
        }
        if (npcConfig.aBoolean876) {
            npcConfig.anInt920 = 0
            npcConfig.aBoolean896 = false
        }
        synchronized(aLruByteCache_3350!!) {
            aLruByteCache_3350!!.method582(npcConfig, i_0_.toLong(), (-109).toByte())
        }
        return npcConfig
    }

    fun method2006(i: Int) {
        if (i >= 68) {
            anInt3353++
            synchronized(aLruByteCache_3350!!) {
                aLruByteCache_3350!!.method587(-106)
            }
            synchronized(this.aLruByteCache_3360) {
                this.aLruByteCache_3360.method587(-125)
            }
            synchronized(this.aLruByteCache_3361!!) {
                this.aLruByteCache_3361!!.method587(-122)
            }
            synchronized(this.aLruByteCache_3362!!) {
                this.aLruByteCache_3362!!.method587(-101)
            }
        }
    }

    fun method2008(i: Int, bool: Boolean) {
        anInt3344++
        if (!this.aBoolean3355 == bool) {
            this.aBoolean3355 = bool
            if (i >= -27) this.aLruByteCache_3361 = null
            method2012(-23828)
        }
    }

    fun method2009(i: Int, i_21_: Byte) {
        this.anInt3363 = i
        anInt3348++
        synchronized(this.aLruByteCache_3360) {
            this.aLruByteCache_3360.method590(0)
        }
        synchronized(this.aLruByteCache_3361!!) {
            this.aLruByteCache_3361!!.method590(0)
        }
        if (i_21_ < 94) anIntArray3347 = null
        synchronized(this.aLruByteCache_3362!!) {
            this.aLruByteCache_3362!!.method590(0)
        }
    }

    fun method2010(i: Int, i_22_: Int) {
        anInt3349++
        synchronized(aLruByteCache_3350!!) {
            aLruByteCache_3350!!.method578(2, i)
        }
        synchronized(this.aLruByteCache_3360) {
            this.aLruByteCache_3360.method578(i_22_ xor 0x2.inv(), i)
        }
        synchronized(this.aLruByteCache_3361!!) {
            this.aLruByteCache_3361!!.method578(i_22_ xor 0x2.inv(), i)
        }
        synchronized(this.aLruByteCache_3362!!) {
            this.aLruByteCache_3362!!.method578(2, i)
            if (i_22_ != -1) method2013(null, 96.toByte())
        }
    }

    fun method2012(i: Int) {
        synchronized(aLruByteCache_3350!!) {
            aLruByteCache_3350!!.method590(0)
        }
        anInt3356++
        synchronized(this.aLruByteCache_3360) {
            this.aLruByteCache_3360.method590(0)
        }
        synchronized(this.aLruByteCache_3361!!) {
            this.aLruByteCache_3361!!.method590(0)
        }
        synchronized(this.aLruByteCache_3362!!) {
            this.aLruByteCache_3362!!.method590(0)
        }
    }

    fun method2014(i: Int, bool: Boolean) {
        aLruByteCache_3350 = LruByteCache(i)
        anInt3358++
        if (bool != true) this.aLruByteCache_3362 = null
    }

    init {
        aLruByteCache_3350 = LruByteCache(64)
        this.aLruByteCache_3360 = LruByteCache(500)
        this.aLruByteCache_3361 = LruByteCache(30)
        this.aLruByteCache_3362 = LruByteCache(50)
        do {
            try {
                this.aBoolean3359 = bool
                this.aJs5Archive_3345 = js5Archive_29_
                aJs5Archive_3343 = js5Archive
                if (aJs5Archive_3343 == null) break
                val i_30_ = aJs5Archive_3343.method414(-1) + -1
                aJs5Archive_3343.method407(0, i_30_)
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatchStatics.method2929(runtimeexception, ("uha.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_29_ != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }
}
