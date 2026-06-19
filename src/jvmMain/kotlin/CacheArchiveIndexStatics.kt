import CacheArchiveIndexLoaderStatics.method340
import MinimapSquareDrawerStatics.method462

object CacheArchiveIndexStatics {
    @JvmField
            var anInt1763: Int = 0
            @JvmField
            var anInt1765: Int = 0
            @JvmField
            var aFontMetaRef_1766: FontMetaRef? = FontMetaRef(74, -1)
            @JvmField
            var anInt1768: Int = 0
            @JvmField
            var anInt1769: Int = 0
            @JvmField
            var anInt1771: Int = 0
            @JvmField
            var anInt1772: Int = 0
            @JvmField
            var anInt1773: Int = 0
            @JvmField
            var anInt1775: Int = 0
            @JvmField
            var anInt1776: Int = 0
            @JvmField
            var anInt1777: Int = 0
            @JvmField
            var anInt1780: Int = 0
    
            @JvmStatic
            fun method1064(i: Int) {
                if (i != -3) aFontMetaRef_1766 = null
                aFontMetaRef_1766 = null
            }
    
            @JvmStatic
            fun method1070(i: Byte, i_6_: Int) {
                if (i < 109) anInt1780 = 10
                anInt1769++
                if (CipheredPacketBufferStatics.anIntArray9757 == null || CipheredPacketBufferStatics.anIntArray9757!!.size < i_6_) CipheredPacketBufferStatics.anIntArray9757 = IntArray(i_6_)
            }
    
            fun method1072(js5Archive: Js5Archive?, i: Byte) {
                if (i >= -91) method1070(((-93).toByte()).toByte(), 92)
                BloomGraphicsOptionStateStatics.aJs5Archive_5964 = js5Archive
                anInt1771++
            }
}
