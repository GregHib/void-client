/* Class367_Sub3 - Decompiled by JODE
* Visit http://jode.sourceforge.net/
*/
class BasicGlRenderPass internal constructor(var_ha_Sub3: NativeRenderer) : AbstractRenderPass(var_ha_Sub3) {
    override fun method3525(i: Int, bool: Boolean) {
        this.aHa_Sub3_4479.method3943(true, i + -47145)
        anInt7306++
        if (i != 15192) method3540(26, 92, -76, -90, 76, -7, -18, -119, 33, false)
    }

    override fun method3527(i: Int, renderable: Renderable?, i_1_: Int) {
        if (i_1_ != -16776) aInboundPacketHeader_7301 = null
        this.aHa_Sub3_4479.method3850((-105).toByte(), renderable)
        anInt7300++
        this.aHa_Sub3_4479.method3923(true, i)
    }

    override fun method3520(i: Byte) {
        anInt7305++
        if (i.toInt() != 87) method3530(71)
        this.aHa_Sub3_4479.method3943(false, i + -32040)
    }

    override fun method3521(bool: Boolean, i: Byte) {
        anInt7303++
        if (i.toInt() != -103) method3527(-78, null, -100)
    }

    override fun method3530(i: Int): Boolean {
        if (i >= -57) return true
        anInt7307++
        return true
    }

    override fun method3526(i: Int, i_10_: Int, i_11_: Int) {
        if (i != 10756) aInboundPacketHeader_7301 = null
        anInt7298++
    }

    companion object {
        @JvmField
        var anInt7298: Int = 0
        @JvmField
        var anIntArray7299: IntArray? = null
        @JvmField
        var anInt7300: Int = 0
        @JvmField
        var aInboundPacketHeader_7301: InboundPacketHeader? = InboundPacketHeader(21, -1)
        @JvmField
        var anInt7302: Int = 0
        @JvmField
        var anInt7303: Int = 0
        @JvmField
        var aBooleanArray7304: BooleanArray? = BooleanArray(100)
        @JvmField
        var anInt7305: Int = 0
        @JvmField
        var anInt7306: Int = 0
        @JvmField
        var anInt7307: Int = 0

        @JvmStatic
        fun method3539(i: Byte) {
            val i_0_ = 74 % ((72 - i) / 37)
            aBooleanArray7304 = null
            aInboundPacketHeader_7301 = null
            anIntArray7299 = null
        }

        @JvmStatic
        fun method3540(i: Int, i_2_: Int, i_3_: Int, i_4_: Int, i_5_: Int, i_6_: Int, i_7_: Int, i_8_: Int, i_9_: Int, bool: Boolean) {
            if (i_6_ >= WorldMapLabel.anInt4960 && CameraNodeList.anInt1745 >= i_6_ && WorldMapLabel.anInt4960 <= i_5_ && CameraNodeList.anInt1745 >= i_5_ && i_7_ >= WorldMapLabel.anInt4960 && i_7_ <= CameraNodeList.anInt1745 && WorldMapLabel.anInt4960 <= i_9_ && CameraNodeList.anInt1745 >= i_9_ && i >= LocalPlayerState.anInt1910 && WidgetTextConfig.anInt513 >= i && i_2_ >= LocalPlayerState.anInt1910 && WidgetTextConfig.anInt513 >= i_2_ && LocalPlayerState.anInt1910 <= i_8_ && i_8_ <= WidgetTextConfig.anInt513 && LocalPlayerState.anInt1910 <= i_4_ && i_4_ <= WidgetTextConfig.anInt513) AbstractFrameBufferSurface.method3009(
                i_2_,
                i_8_,
                i_5_,
                i_9_,
                i_4_,
                (-1).toByte(),
                i_7_,
                i,
                i_3_,
                i_6_
            )
            else IntHashSetStatics.method2364(i_3_, i_7_, i_6_, i_2_, i_5_, i_8_, i_9_, i, 3, i_4_)
            if (bool != true) method3540(37, -122, 69, -89, -8, -19, 89, 112, 12, false)
            anInt7302++
        }
    }
}
