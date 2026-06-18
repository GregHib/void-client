import OverlayColorTable.method1060
import CameraConfigDefinition.Companion.method1920

/* Class278 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class BufferedMessageQueue internal constructor(sceneProjector: SceneProjector?, i: Int, bool: Boolean, js5Archive: Js5Archive?, js5Archive_7_: Js5Archive?) {
    var aJs5Archive_3576: Js5Archive? = null
    private var aLruByteCache_3577: LruByteCache? = LruByteCache(64)
    var aSceneProjector_3578: SceneProjector? = null
    var aBoolean3583: Boolean = false
    private val aJs5Archive_3585: Js5Archive?
    var aLruByteCache_3590: LruByteCache? = LruByteCache(50)
    var aLruByteCache_3592: LruByteCache = LruByteCache(5)
    var anInt3593: Int = 0

    fun method2072(i: Byte, bool: Boolean) {
        if (i >= 22) {
            anInt3580++
            if (this.aBoolean3583 != bool) {
                this.aBoolean3583 = bool
                method2078(-6080)
            }
        }
    }

    fun method2073(i: Int, i_0_: Int) {
        this.anInt3593 = i_0_
        anInt3591++
        synchronized(this.aLruByteCache_3590!!) {
            this.aLruByteCache_3590!!.method590(0)
        }
        synchronized(this.aLruByteCache_3592) {
            this.aLruByteCache_3592.method590(0)
        }
        if (i != -25032) method2079(-66, 101)
    }

    fun method2074(i: Int) {
        synchronized(this.aLruByteCache_3590!!) {
            this.aLruByteCache_3590!!.method590(0)
        }
        if (i < -94) {
            anInt3582++
            synchronized(this.aLruByteCache_3592) {
                this.aLruByteCache_3592.method590(0)
            }
        }
    }

    fun method2076(i: Int, bool: Boolean) {
        anInt3589++
        synchronized(aLruByteCache_3577!!) {
            aLruByteCache_3577!!.method578(2, i)
        }
        synchronized(this.aLruByteCache_3590!!) {
            this.aLruByteCache_3590!!.method578(2, i)
        }
        if (bool != true) method2072(120.toByte(), true)
        synchronized(this.aLruByteCache_3592) {
            this.aLruByteCache_3592.method578(2, i)
        }
    }

    fun method2078(i: Int) {
        anInt3579++
        synchronized(aLruByteCache_3577!!) {
            if (i != -6080) this.aLruByteCache_3590 = null
            aLruByteCache_3577!!.method590(i + 6080)
        }
        synchronized(this.aLruByteCache_3590!!) {
            this.aLruByteCache_3590!!.method590(i + 6080)
        }
        synchronized(this.aLruByteCache_3592) {
            this.aLruByteCache_3592.method590(0)
        }
    }

    fun method2079(i: Int, i_6_: Int): NpcType {
        anInt3586++
        var npcType: NpcType?
        synchronized(aLruByteCache_3577!!) {
            npcType = aLruByteCache_3577!!.method583(i.toLong(), -104) as NpcType?
        }
        if (npcType != null) return npcType
        val `is`: ByteArray?
        synchronized(aJs5Archive_3585!!) {
            `is` = aJs5Archive_3585.method410(i_6_ + -1859, method1060(i, 69.toByte()), method1920(127, i))
        }
        npcType = NpcType()
        npcType.anInt1344 = i
        npcType.aBufferedMessageQueue_1348 = this
        if (`is` != null) npcType.method798(111, Buffer(`is`))
        npcType.method799(-117)
        synchronized(aLruByteCache_3577!!) {
            aLruByteCache_3577!!.method582(npcType, i.toLong(), (-102).toByte())
            if (i_6_ != -1) aLruByteCache_3577 = null
        }
        return npcType
    }

    fun method2080(i: Int) {
        anInt3587++
        synchronized(aLruByteCache_3577!!) {
            aLruByteCache_3577!!.method587(-118)
        }
        synchronized(this.aLruByteCache_3590!!) {
            this.aLruByteCache_3590!!.method587(-100)
        }
        synchronized(this.aLruByteCache_3592) {
            this.aLruByteCache_3592.method587(-107)
        }
        if (i <= 122) method2075(-125, -46, 9)
    }

    init {
        do {
            try {
                this.aBoolean3583 = bool
                aJs5Archive_3585 = js5Archive
                this.aJs5Archive_3576 = js5Archive_7_
                this.aSceneProjector_3578 = sceneProjector
                if (aJs5Archive_3585 == null) break
                val i_8_ = aJs5Archive_3585.method414(-1) + -1
                aJs5Archive_3585.method407(0, i_8_)
            } catch (runtimeexception: RuntimeException) {
                throw SoundBankPatch.method2929(runtimeexception, ("vda.<init>(" + (if (sceneProjector != null) "{...}" else "null") + ',' + i + ',' + bool + ',' + (if (js5Archive != null) "{...}" else "null") + ',' + (if (js5Archive_7_ != null) "{...}" else "null") + ')'))
            }
            break
        } while (false)
    }

    companion object {
        var anInt3579: Int = 0
        var anInt3580: Int = 0
        var anInt3581: Int = 0
        var anInt3582: Int = 0
        var anInt3584: Int = 0
        var anInt3586: Int = 0
        var anInt3587: Int = 0
        var anInt3588: Int = 0
        var anInt3589: Int = 0
        var anInt3591: Int = 0
        fun method2075(i: Int, i_1_: Int, i_2_: Int): Boolean {
            anInt3584++
            if (i_1_ > -125) anInt3581 = -110
            return (i and 0x100100) != 0
        }

        fun method2077(i: Int, i_3_: Int, i_4_: Int): Boolean {
            val i_5_ = -75 % ((-43 - i) / 40)
            anInt3588++
            return (i_4_ and 0x8000) != 0
        }
    }
}
