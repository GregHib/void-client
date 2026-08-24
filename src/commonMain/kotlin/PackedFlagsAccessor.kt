import kotlin.jvm.JvmField
import VoronoiNoiseTextureNode.Companion.method3060

/* Class348_Sub44 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class PackedFlagsAccessor internal constructor(@JvmField var anInt7098: Int, @JvmField var anInt7093: Int) : LinkedListNode() {
    fun method3301(i: Int, bool: Boolean): Boolean {
        anInt7091++
        if (bool != false) anInt7092 = 29
        return (0x1 and (this.anInt7098 shr i + 1)) != 0
    }

    fun method3302(i: Int): Boolean {
        if (i != 17356) method3305(8)
        anInt7095++
        return (0x3df376 and this.anInt7098) shr 21 != 0
    }

    fun method3303(i: Int): Boolean {
        anInt7094++
        if (i != 1) anInt7092 = -24
        return (this.anInt7098 and 0x433bfd) shr 22 != 0
    }

    fun method3304(i: Byte): Int {
        anInt7099++
        if (i < 43) method3301(-16, false)
        return (this.anInt7098 and 0x1f77eb) shr 18
    }

    fun method3305(i: Int): Boolean {
        anInt7096++
        if (i != 0) return true
        return (0x1 and this.anInt7098) != 0
    }

    fun method3307(i: Int): Int {
        anInt7100++
        if (i < 10) this.anInt7093 = -51
        return method3060(this.anInt7098, true)
    }

    companion object {
        var anInt7091: Int = 0
        var anInt7092: Int = 0
        var anInt7094: Int = 0
        var anInt7095: Int = 0
        var anInt7096: Int = 0
        var anInt7097: Int = 0
        var anInt7099: Int = 0
        var anInt7100: Int = 0
        var anInt7101: Int = 0

        fun method3306(i: Byte): Int {
            if (i >= -90) anInt7101 = -7
            anInt7097++
            if (WhirlpoolHash.anInt7207 == 1) return WhirlpoolHash.anInt6008
            return WhirlpoolHash.anInt1651
        }
    }
}
