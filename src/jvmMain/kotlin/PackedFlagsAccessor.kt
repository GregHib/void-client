import VoronoiNoiseTextureNodeStatics.method3060
import PackedFlagsAccessorStatics.anInt7091
import PackedFlagsAccessorStatics.anInt7092
import PackedFlagsAccessorStatics.anInt7094
import PackedFlagsAccessorStatics.anInt7095
import PackedFlagsAccessorStatics.anInt7096
import PackedFlagsAccessorStatics.anInt7099
import PackedFlagsAccessorStatics.anInt7100

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
}
