import LinkedListIterator.Companion.method1242
import kotlin.concurrent.Volatile

/* Class250 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class BackgroundWorkerThread : Runnable {
    @JvmField
    @Volatile
    var aSoundChannelMixerArray3218s: Array<SoundChannelMixer?> = arrayOfNulls<SoundChannelMixer>(2)

    @JvmField
    @Volatile
    var aBoolean3221: Boolean = false

    @JvmField
    @Volatile
    var aBoolean3223: Boolean = false
    var aPrivilegedOperationWorker_3228: PrivilegedOperationWorker? = null

    override fun run() {
        this.aBoolean3223 = true
        anInt3224++
        try {
            while (!this.aBoolean3221) {
                for (i in 0..1) {
                    val class279 = this.aSoundChannelMixerArray3218s[i]
                    if (class279 != null) class279.method2084(-6858)
                }
                TexGenMaterialPass.method2161((-107).toByte(), 10L)
                WorldMapPolygonIconLabel.method3578((-42).toByte(), null, (this.aPrivilegedOperationWorker_3228))
            }
        } catch (exception: Exception) {
            method1242(null, exception, 15004)
        } finally {
            this.aBoolean3223 = false
        }
    }

    companion object {
        var anInt3219: Int = 0
        @JvmField
        var anIntArray3220: IntArray? = null
        var anInt3222: Int = 0
        var anInt3224: Int = 0
        @JvmField
        var anInt3225: Int = 0
        @JvmField
        var aClass318_Sub1Array3226: Array<SceneEntity?>? = null
        @JvmField
        var anInt3227: Int = 0
        fun method1909(i: Byte, string: String): String {
            var string = string
            if (i.toInt() != 31) method1911(87.toByte())
            anInt3222++
            var string_0_: String? = null
            val i_1_ = string.indexOf("--> ")
            if (i_1_ >= 0) {
                string_0_ = string.substring(0, 4 + i_1_)
                string = string.substring(i_1_ + 4)
            }
            if (string.startsWith("directlogin ")) {
                val i_2_ = string.indexOf(" ", "directlogin ".length)
                if (i_2_ >= 0) {
                    val i_3_ = string.length
                    string = string.substring(0, i_2_) + " "
                    for (i_4_ in 1 + i_2_..<i_3_) string += "*"
                }
            }
            if (string_0_ == null) return string
            return string_0_ + string
        }

        @JvmStatic
        fun method1910(i: Int) {
            anIntArray3220 = null
            if (i != 0) method1910(-18)
            aClass318_Sub1Array3226 = null
        }

        @JvmStatic
        fun method1911(i: Byte) {
            if (i.toInt() != 99) anIntArray3220 = null
            Class367_Sub11.aLongHashTable_7415 = LongHashTable(8)
            anInt3219++
            SpotAnimEntity.anInt6450 = 0
            var class318_sub10 = GzipDecompressor.aDoublyLinkedNodeList_2077!!.method1872(8) as SceneGraphContainer?
            while (class318_sub10 != null) {
                class318_sub10.method2530()
                class318_sub10 = GzipDecompressor.aDoublyLinkedNodeList_2077!!.method1878((-115).toByte()) as SceneGraphContainer?
            }
        }
    }
}
