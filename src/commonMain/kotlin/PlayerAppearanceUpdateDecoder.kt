import kotlin.jvm.JvmStatic
/* Class375 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
internal object PlayerAppearanceUpdateDecoder {

    var anInt4539: Int = 0

    var aBoolean4540: Boolean = false

    var anInt4541: Int = 0

    var aBoolean4542: Boolean = false

    var aLruByteCache_4543: LruByteCache? = LruByteCache(8)

    var anInt4544: Int = -1
    var anInt4545: Int = -1

    @JvmStatic
    fun method3612(i: Int, class348_sub49_sub2: CipheredPacketBuffer?) {
        if (i < 59) PlayerAppearanceUpdateDecoder.method3614(-51, 64, -115, null, -96)
        for (i_0_ in 0..<ProjectionCameraTransform.anInt5768) {
            val i_1_ = GlFramebufferBlitter.anIntArray279!![i_0_]
            val player = LoadingBarRenderer.aPlayerArray5058!![i_1_]
            var i_2_ = class348_sub49_sub2!!.readUnsignedByte(255)
            if ((i_2_ and 0x40) != 0) i_2_ += class348_sub49_sub2.readUnsignedByte(255) shl 8
            if ((i_2_ and 0x4000) != 0) i_2_ += class348_sub49_sub2.readUnsignedByte(255) shl 16
            PlayerUpdateDecoder.method1141(class348_sub49_sub2, i_1_, i_2_, 123, player)
        }
        anInt4541++
    }

    @JvmStatic
    fun method3613(i: Int) {
        if (i != 64) PlayerAppearanceUpdateDecoder.method3612(-7, null)
        aLruByteCache_4543 = null
    }

    @JvmStatic
    fun method3614(i: Int, i_3_: Int, i_4_: Int, class348_sub47: OutgoingPacketNode?, i_5_: Int) {
        anInt4539++
        if (i_5_ != -19692) method3613(10)
        class348_sub47!!.aClass348_Sub49_Sub2_7116!!.writeInt(124.toByte(), i)
        class348_sub47!!.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_4_)
        class348_sub47!!.aClass348_Sub49_Sub2_7116!!.writeShort(107.toByte(), i_3_)
    }
}
