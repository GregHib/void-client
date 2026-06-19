import AbstractProceduralTextureNodeStatics.method3038
import InvertTextureNodeStatics.method3134
import GameClock.method599
import SceneObjectSpawnerStatics.method773
import ServerConnectionInfoStatics.method1258
import ServerConnectionInfoStatics.anInt2141
import ServerConnectionInfoStatics.anInt2144
import ServerConnectionInfoStatics.anInt2149

/* Class161 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class ServerConnectionInfo {
    @JvmField
    var anInt2138: Int
    private var aBoolean2139 = false
    @JvmField
    var anInt2143: Int = 0
    private var aBoolean2146 = true
    @JvmField
    var aString2147: String? = null
    @JvmField
    var anInt2148: Int = 43594
    fun method1259(i: Int) {
        if (i != 0) method1258(39, 119, 4)
        anInt2149++
        if (!aBoolean2146) {
            aBoolean2139 = true
            aBoolean2146 = true
        } else if (!aBoolean2139) aBoolean2146 = false
        else aBoolean2139 = false
    }

    fun method1262(privilegedOperationWorker: PrivilegedOperationWorker, i: Byte): LinkedQueueNode? {
        if (i.toInt() != 36) method1258(-105, -70, -80)
        anInt2144++
        return privilegedOperationWorker.method2235(aBoolean2139, (if (aBoolean2146) this.anInt2138 else this.anInt2148), this.aString2147, i.toInt() xor 0x6e65)
    }

    fun method1264(i: Byte, serverConnectionInfo_2_: ServerConnectionInfo?): Boolean {
        if (i <= 69) return false
        anInt2141++
        if (serverConnectionInfo_2_ != null) {
            return (this.anInt2143 == serverConnectionInfo_2_.anInt2143) && this.aString2147 == serverConnectionInfo_2_.aString2147
        }
        return false
    }

    init {
        this.anInt2138 = LoaderStatics.port
    }
}
