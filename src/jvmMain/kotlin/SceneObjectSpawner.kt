import ScrollingNoiseTexture.Companion.method560

/* Class76 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class SceneObjectSpawner internal constructor(bool: Boolean) {
    @JvmField
    var aDoublyLinkedNodeList_1282: DoublyLinkedNodeList = DoublyLinkedNodeList()
    var aBoolean1283: Boolean = false
    fun method774(class318_sub4: SceneEntityModel, i: Int) {
        anInt1280++
        val class318_sub1 = class318_sub4.aClass318_Sub1_6410
        var bool = true
        val class318_sub3s = class318_sub4.aClass318_Sub3Array6414
        var i_6_ = 0
        while (class318_sub3s!!.size > i_6_) {
            if (class318_sub3s[i_6_]!!.aBoolean6401) {
                bool = false
                break
            }
            i_6_++
        }
        if (!bool) {
            if (this.aBoolean1283) {
                var class318_sub4_7_ = (this.aDoublyLinkedNodeList_1282.method1872(8) as? SceneEntityModel?)
                while (class318_sub4_7_ != null) {
                    if (class318_sub1 === (class318_sub4_7_.aClass318_Sub1_6410)) {
                        class318_sub4_7_.method2373(false)
                        method560(class318_sub4_7_, -41)
                    }
                    class318_sub4_7_ = this.aDoublyLinkedNodeList_1282.method1878((-103).toByte()) as? SceneEntityModel?
                }
            }
            var class318_sub4_8_ = (this.aDoublyLinkedNodeList_1282.method1872(8) as? SceneEntityModel?)
            while (class318_sub4_8_ != null) {
                if (class318_sub1!!.anInt6389 >= class318_sub4_8_.aClass318_Sub1_6410!!.anInt6389) {
                    DebugOverlayRenderer.method1883(class318_sub4_8_, class318_sub4, true)
                    return
                }
                class318_sub4_8_ = this.aDoublyLinkedNodeList_1282.method1878((-44).toByte()) as? SceneEntityModel?
            }
            if (i != 18802) aHostPingThread_1286 = null
            this.aDoublyLinkedNodeList_1282.method1869(-107, class318_sub4)
        }
    }

    fun method775(i: Byte) {
        while (true) {
            val class318_sub4 = (this.aDoublyLinkedNodeList_1282.method1875(60) as? SceneEntityModel?)
            if (class318_sub4 == null) break
            class318_sub4.method2373(false)
            method560(class318_sub4, 123)
        }
        anInt1278++
        if (i.toInt() != 69) anInt1288 = -20
    }

    init {
        this.aBoolean1283 = bool
    }

    companion object {
        @JvmField
        var anInt1278: Int = 0
        @JvmField
        var aNamedIdRecord_1279: NamedIdRecord? = NamedIdRecord("LOCAL", 4)
        @JvmField
        var anInt1280: Int = 0
        @JvmField
        var anInt1284: Int = 0
        @JvmField
        var anInt1285: Int = 0
        @JvmField
        var aHostPingThread_1286: HostPingThread?
        @JvmField
        var aFloat1287: Float = 1024.0f
        var anInt1288: Int = 0

        @JvmStatic
        fun method772(i: Byte) {
            aHostPingThread_1286 = null
            aNamedIdRecord_1279 = null
        }

        @JvmStatic
        fun method773(bool: Boolean) {
            BrightnessContrastEffect.aBoolean9181 = bool
            anInt1284++
        }

        init {
            aHostPingThread_1286 = HostPingThread()
        }
    }
}
